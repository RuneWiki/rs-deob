import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class114 extends class288 {
   @OriginalMember(
      owner = "client!rh",
      name = "v",
      descriptor = "Lc;"
   )
   private class652 field1554;
   @OriginalMember(
      owner = "client!rh",
      name = "x",
      descriptor = "Lqk;"
   )
   private class419 field1551;
   @OriginalMember(
      owner = "client!rh",
      name = "u",
      descriptor = "Z"
   )
   private boolean field1552;
   @OriginalMember(
      owner = "client!rh",
      name = "w",
      descriptor = "Luf;"
   )
   private class701 field1553;

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method1065(char arg0, int arg1, int arg2, int arg3, boolean arg4, class96 arg5, int arg6, int arg7) {
      class639 var9 = (class639)arg5;
      class419 var10 = var9.field9251;
      this.field1554.method4739(2);
      this.field1554.method4792(-26367, this.field1551);
      if (!this.field1552 && !arg4) {
         this.field1554.method4803(7681, 7681, true);
      } else {
         this.field1554.method4803(7681, 8448, true);
         this.field1554.method4809(768, (byte)-128, 34168, 0);
      }

      this.field1554.method4787(-44, 1);
      this.field1554.method4792(-26367, var10);
      this.field1554.method4803(7681, 8448, true);
      this.field1554.method4809(768, (byte)-128, 34168, 0);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field6488 / (float)var10.field6485;
      float var12 = var10.field6487 / (float)var10.field6482;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field1553.method5160((byte)-76, arg0);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field1554.method4809(768, (byte)-128, 5890, 0);
      this.field1554.method4803(8448, 8448, true);
      this.field1554.method4792(-26367, (class799)null);
      this.field1554.method4787(-38, 0);
      if (this.field1552 || arg4) {
         this.field1554.method4809(768, (byte)-128, 5890, 0);
      }

   }

   @OriginalMember(
      owner = "client!rh",
      name = "<init>",
      descriptor = "(Lc;Lqda;[Lkp;Z)V"
   )
   public class114(class652 arg0, class697 arg1, class776[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field1554 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class776 var54 = arg2[var6];
         if (var54.field11394 > var5) {
            var5 = var54.field11394;
         }

         if (var54.field11395 > var5) {
            var5 = var54.field11395;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class776 var10 = arg2[var9];
            int var11 = var10.field11394;
            int var12 = var10.field11395;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field11398 == null) {
               byte[] var17 = var10.field11396;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field11398;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field1551 = class425.method3369(var7, arg0, var8, (byte)74, 6406, var7, 6406, false);
         this.field1552 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class776 var39 = arg2[var24];
            int[] var40 = var39.field11400;
            byte[] var41 = var39.field11398;
            byte[] var42 = var39.field11396;
            int var43 = var39.field11394;
            int var44 = var39.field11395;
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

         this.field1551 = class331.method2697(0, false, var23, var7, -26853, 0, arg0, var7);
         this.field1552 = false;
      }

      this.field1551.method5760(false, (byte)-107);
      this.field1553 = new class701(arg0, 256);
      float var25 = this.field1551.field6488 / (float)this.field1551.field6485;
      float var26 = this.field1551.field6487 / (float)this.field1551.field6482;

      for(int var27 = 0; var27 < 256; ++var27) {
         class776 var28 = arg2[var27];
         int var29 = var28.field11394;
         int var30 = var28.field11395;
         int var31 = var28.field11397;
         int var32 = var28.field11401;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field1553.method5162(var27, -6177);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field1551.field6487 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field1551.field6487 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field1551.field6487 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field1551.field6487 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field1553.method5163(-3623);
      }

   }

   @OriginalMember(
      owner = "client!rh",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method1066(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field1554.method4739(2);
      this.field1554.method4792(-26367, this.field1551);
      if (!this.field1552 && !arg4) {
         this.field1554.method4803(7681, 7681, true);
      } else {
         this.field1554.method4803(7681, 8448, true);
         this.field1554.method4809(768, (byte)-128, 34168, 0);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field1553.method5160((byte)-76, arg0);
      OpenGL.glLoadIdentity();
      if (this.field1552 || arg4) {
         this.field1554.method4809(768, (byte)-128, 5890, 0);
      }

   }
}
