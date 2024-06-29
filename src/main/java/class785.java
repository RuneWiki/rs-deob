import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class785 extends class66 {
   @OriginalMember(
      owner = "client!lo",
      name = "B",
      descriptor = "Lrk;"
   )
   private class35 field11508;
   @OriginalMember(
      owner = "client!lo",
      name = "A",
      descriptor = "Lpe;"
   )
   private class633 field11506;
   @OriginalMember(
      owner = "client!lo",
      name = "D",
      descriptor = "Z"
   )
   private boolean field11505;
   @OriginalMember(
      owner = "client!lo",
      name = "C",
      descriptor = "Llt;"
   )
   private class702 field11507;

   @OriginalMember(
      owner = "client!lo",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method140(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field11508.method289((byte)-63);
      this.field11508.method252(this.field11506, (byte)-49);
      if (!this.field11505 && !arg4) {
         this.field11508.method314(7681, -44, 7681);
      } else {
         this.field11508.method314(7681, 90, 8448);
         this.field11508.method262(0, 768, 8960, 34168);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field11507.method5117(arg0, 5);
      OpenGL.glLoadIdentity();
      if (this.field11505 || arg4) {
         this.field11508.method262(0, 768, 8960, 5890);
      }

   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method143(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7) {
      class560 var9 = (class560)arg5;
      class633 var10 = var9.field8145;
      this.field11508.method289((byte)-63);
      this.field11508.method252(this.field11506, (byte)-7);
      if (!this.field11505 && !arg4) {
         this.field11508.method314(7681, -126, 7681);
      } else {
         this.field11508.method314(7681, 89, 8448);
         this.field11508.method262(0, 768, 8960, 34168);
      }

      this.field11508.method259(32, 1);
      this.field11508.method252(var10, (byte)-71);
      this.field11508.method314(7681, -34, 8448);
      this.field11508.method262(0, 768, 8960, 34168);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field9233 / (float)var10.field9232;
      float var12 = var10.field9234 / (float)var10.field9235;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field11507.method5117(arg0, 5);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field11508.method262(0, 768, 8960, 5890);
      this.field11508.method314(8448, 115, 8448);
      this.field11508.method252((class707)null, (byte)-17);
      this.field11508.method259(32, 0);
      if (this.field11505 || arg4) {
         this.field11508.method262(0, 768, 8960, 5890);
      }

   }

   @OriginalMember(
      owner = "client!lo",
      name = "<init>",
      descriptor = "(Lrk;Lika;[Ltn;Z)V"
   )
   public class785(class35 arg0, class445 arg1, class94[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field11508 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class94 var54 = arg2[var6];
         if (var54.field1520 > var5) {
            var5 = var54.field1520;
         }

         if (var54.field1523 > var5) {
            var5 = var54.field1523;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class94 var10 = arg2[var9];
            int var11 = var10.field1520;
            int var12 = var10.field1523;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field1527 == null) {
               byte[] var17 = var10.field1519;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field1527;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field11506 = class690.method5026(88, arg0, var7, 6406, var8, 6406, var7, false);
         this.field11505 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class94 var39 = arg2[var24];
            int[] var40 = var39.field1521;
            byte[] var41 = var39.field1527;
            byte[] var42 = var39.field1519;
            int var43 = var39.field1520;
            int var44 = var39.field1523;
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

         this.field11506 = class581.method4279(0, false, arg0, var7, var7, var23, false, 0);
         this.field11505 = false;
      }

      this.field11506.method5132(false, 0);
      this.field11507 = new class702(arg0, 256);
      float var25 = this.field11506.field9233 / (float)this.field11506.field9232;
      float var26 = this.field11506.field9234 / (float)this.field11506.field9235;

      for(int var27 = 0; var27 < 256; ++var27) {
         class94 var28 = arg2[var27];
         int var29 = var28.field1520;
         int var30 = var28.field1523;
         int var31 = var28.field1525;
         int var32 = var28.field1522;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field11507.method5116((byte)111, var27);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field11506.field9234 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field11506.field9234 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field11506.field9234 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field11506.field9234 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field11507.method5115((byte)-31);
      }

   }
}
