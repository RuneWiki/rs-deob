import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class747 extends class66 {
   @OriginalMember(
      owner = "client!lja",
      name = "A",
      descriptor = "Lor;"
   )
   private class670 field10853;
   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "Lbe;"
   )
   private class40 field10854;
   @OriginalMember(
      owner = "client!lja",
      name = "y",
      descriptor = "Z"
   )
   private boolean field10855;
   @OriginalMember(
      owner = "client!lja",
      name = "x",
      descriptor = "Laga;"
   )
   private class697 field10852;

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "(Lor;Ljk;[Lok;Z)V"
   )
   public class747(class670 arg0, class663 arg1, class267[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field10853 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class267 var54 = arg2[var6];
         if (var54.field3469 > var5) {
            var5 = var54.field3469;
         }

         if (var54.field3467 > var5) {
            var5 = var54.field3467;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class267 var10 = arg2[var9];
            int var11 = var10.field3469;
            int var12 = var10.field3467;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field3464 == null) {
               byte[] var17 = var10.field3472;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field3464;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field10854 = class273.method2089(var7, 6406, var8, 3553, var7, 6406, arg0, false);
         this.field10855 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class267 var39 = arg2[var24];
            int[] var40 = var39.field3468;
            byte[] var41 = var39.field3464;
            byte[] var42 = var39.field3472;
            int var43 = var39.field3469;
            int var44 = var39.field3467;
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

         this.field10854 = class17.method152(var23, arg0, var7, var7, 0, false, false, 0);
         this.field10855 = false;
      }

      this.field10854.method4129(-1323776991, false);
      this.field10852 = new class697(arg0, 256);
      float var25 = this.field10854.field467 / (float)this.field10854.field470;
      float var26 = this.field10854.field461 / (float)this.field10854.field458;

      for(int var27 = 0; var27 < 256; ++var27) {
         class267 var28 = arg2[var27];
         int var29 = var28.field3469;
         int var30 = var28.field3467;
         int var31 = var28.field3466;
         int var32 = var28.field3465;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field10852.method5069(113, var27);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field10854.field461 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field10854.field461 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field10854.field461 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field10854.field461 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field10852.method5068((byte)119);
      }

   }

   @OriginalMember(
      owner = "client!lja",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method170(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field10853.method4902((byte)-3);
      this.field10853.method4848(false, this.field10854);
      if (!this.field10855 && !arg4) {
         this.field10853.method4862(7681, 7681, 49);
      } else {
         this.field10853.method4862(8448, 7681, 91);
         this.field10853.method4901(768, 0, 34168, 5);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field10852.method5070(arg0, 4);
      OpenGL.glLoadIdentity();
      if (this.field10855 || arg4) {
         this.field10853.method4901(768, 0, 5890, 5);
      }

   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method168(char arg0, int arg1, int arg2, int arg3, boolean arg4, class516 arg5, int arg6, int arg7) {
      class111 var9 = (class111)arg5;
      class40 var10 = var9.field1402;
      this.field10853.method4902((byte)-3);
      this.field10853.method4848(false, this.field10854);
      if (!this.field10855 && !arg4) {
         this.field10853.method4862(7681, 7681, 49);
      } else {
         this.field10853.method4862(8448, 7681, 89);
         this.field10853.method4901(768, 0, 34168, 5);
      }

      this.field10853.method4841(1, 33984);
      this.field10853.method4848(false, var10);
      this.field10853.method4862(8448, 7681, 60);
      this.field10853.method4901(768, 0, 34168, 5);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field467 / (float)var10.field470;
      float var12 = var10.field461 / (float)var10.field458;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field10852.method5070(arg0, 4);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field10853.method4901(768, 0, 5890, 5);
      this.field10853.method4862(8448, 8448, 99);
      this.field10853.method4848(false, (class573)null);
      this.field10853.method4841(0, 33984);
      if (this.field10855 || arg4) {
         this.field10853.method4901(768, 0, 5890, 5);
      }

   }
}
