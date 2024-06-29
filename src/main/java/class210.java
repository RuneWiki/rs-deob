import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class210 extends class67 {
   @OriginalMember(
      owner = "client!rfa",
      name = "D",
      descriptor = "Lck;"
   )
   private class667 field2669;
   @OriginalMember(
      owner = "client!rfa",
      name = "B",
      descriptor = "Lfe;"
   )
   private class596 field2670;
   @OriginalMember(
      owner = "client!rfa",
      name = "A",
      descriptor = "Z"
   )
   private boolean field2671;
   @OriginalMember(
      owner = "client!rfa",
      name = "C",
      descriptor = "Lll;"
   )
   private class383 field2668;

   @OriginalMember(
      owner = "client!rfa",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field2669.method4775(2);
      this.field2669.method4818((byte)-105, this.field2670);
      if (!this.field2671 && !arg4) {
         this.field2669.method4849(7681, 34161, 7681);
      } else {
         this.field2669.method4849(8448, 34161, 7681);
         this.field2669.method4814(7681, 0, 34168, 768);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field2668.method2948(arg0, (byte)-69);
      OpenGL.glLoadIdentity();
      if (this.field2671 || arg4) {
         this.field2669.method4814(7681, 0, 5890, 768);
      }

   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
      class364 var9 = (class364)arg5;
      class596 var10 = var9.field5462;
      this.field2669.method4775(2);
      this.field2669.method4818((byte)-118, this.field2670);
      if (!this.field2671 && !arg4) {
         this.field2669.method4849(7681, 34161, 7681);
      } else {
         this.field2669.method4849(8448, 34161, 7681);
         this.field2669.method4814(7681, 0, 34168, 768);
      }

      this.field2669.method4828(1, (byte)66);
      this.field2669.method4818((byte)60, var10);
      this.field2669.method4849(8448, 34161, 7681);
      this.field2669.method4814(7681, 0, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field8778 / (float)var10.field8779;
      float var12 = var10.field8777 / (float)var10.field8783;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field2668.method2948(arg0, (byte)-69);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field2669.method4814(7681, 0, 5890, 768);
      this.field2669.method4849(8448, 34161, 8448);
      this.field2669.method4818((byte)-108, (class689)null);
      this.field2669.method4828(0, (byte)66);
      if (this.field2671 || arg4) {
         this.field2669.method4814(7681, 0, 5890, 768);
      }

   }

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "(Lck;Lpg;[Lnia;Z)V"
   )
   public class210(class667 arg0, class763 arg1, class671[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field2669 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class671 var54 = arg2[var6];
         if (var54.field10097 > var5) {
            var5 = var54.field10097;
         }

         if (var54.field10100 > var5) {
            var5 = var54.field10100;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class671 var10 = arg2[var9];
            int var11 = var10.field10097;
            int var12 = var10.field10100;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field10095 == null) {
               byte[] var17 = var10.field10099;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field10095;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field2670 = class553.method4090(false, var7, 6406, 6406, arg0, var7, var8, (byte)96);
         this.field2671 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class671 var39 = arg2[var24];
            int[] var40 = var39.field10096;
            byte[] var41 = var39.field10095;
            byte[] var42 = var39.field10099;
            int var43 = var39.field10097;
            int var44 = var39.field10100;
            int var45 = var24 % 16 * var5;
            int var46 = var24 / 16 * var5;
            int var47 = var7 * var46 + var45;
            int var48 = 0;
            if (var41 != null) {
               for(int var49 = 0; var49 < var43; ++var49) {
                  for(int var50 = 0; var50 < var44; ++var50) {
                     var23[var47++] = var41[var48] << 24 | var40[var42[var48] & 255];
                     ++var48;
                  }

                  var47 += var7 - var44;
               }
            } else {
               for(int var51 = 0; var51 < var43; ++var51) {
                  for(int var52 = 0; var52 < var44; ++var52) {
                     byte var53;
                     if ((var53 = var42[var48++]) != 0) {
                        var23[var47++] = -16777216 | var40[var53 & 255];
                     } else {
                        ++var47;
                     }
                  }

                  var47 += var7 - var44;
               }
            }
         }

         this.field2670 = class159.method1319(arg0, false, var7, (byte)-126, 0, var7, 0, var23);
         this.field2671 = false;
      }

      this.field2670.method5012(false, -10161);
      this.field2668 = new class383(arg0, 256);
      float var25 = this.field2670.field8778 / (float)this.field2670.field8779;
      float var26 = this.field2670.field8777 / (float)this.field2670.field8783;

      for(int var27 = 0; var27 < 256; ++var27) {
         class671 var28 = arg2[var27];
         int var29 = var28.field10097;
         int var30 = var28.field10100;
         int var31 = var28.field10102;
         int var32 = var28.field10103;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field2668.method2949(false, var27);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field2670.field8777 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field2670.field8777 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field2670.field8777 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field2670.field8777 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field2668.method2946(407554050);
      }

   }
}
