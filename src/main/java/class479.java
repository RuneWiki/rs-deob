import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class479 extends class67 {
   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "Lea;"
   )
   private class573 field6882;
   @OriginalMember(
      owner = "client!la",
      name = "B",
      descriptor = "Lu;"
   )
   private class81 field6884;
   @OriginalMember(
      owner = "client!la",
      name = "y",
      descriptor = "Z"
   )
   private boolean field6883;
   @OriginalMember(
      owner = "client!la",
      name = "x",
      descriptor = "Lcf;"
   )
   private class631 field6885;

   @OriginalMember(
      owner = "client!la",
      name = "fa",
      descriptor = "(CIIIZ)V",
      line = 8
   )
   public final void method110(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field6882.method4173(4);
      this.field6882.method4107(-124, this.field6884);
      if (!this.field6883 && !arg4) {
         this.field6882.method4117(7681, 7681, -1);
      } else {
         this.field6882.method4117(7681, 8448, -1);
         this.field6882.method4096(0, (byte)15, 34168, 768);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field6885.method4571(false, arg0);
      OpenGL.glLoadIdentity();
      if (this.field6883 || arg4) {
         this.field6882.method4096(0, (byte)15, 5890, 768);
      }

   }

   @OriginalMember(
      owner = "client!la",
      name = "<init>",
      descriptor = "(Lea;Lru;[Lmha;Z)V",
      line = 27
   )
   public class479(class573 arg0, class206 arg1, class439[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field6882 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class439 var54 = arg2[var6];
         if (var54.field6267 > var5) {
            var5 = var54.field6267;
         }

         if (var54.field6269 > var5) {
            var5 = var54.field6269;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class439 var10 = arg2[var9];
            int var11 = var10.field6267;
            int var12 = var10.field6269;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field6270 == null) {
               byte[] var17 = var10.field6268;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field6270;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field6884 = class259.method1972(var8, (byte)-76, var7, var7, arg0, 6406, false, 6406);
         this.field6883 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class439 var39 = arg2[var24];
            int[] var40 = var39.field6264;
            byte[] var41 = var39.field6270;
            byte[] var42 = var39.field6268;
            int var43 = var39.field6267;
            int var44 = var39.field6269;
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

         this.field6884 = class498.method3613(var7, arg0, var7, (byte)-106, 0, 0, false, var23);
         this.field6883 = false;
      }

      this.field6884.method3526(false, 32);
      this.field6885 = new class631(arg0, 256);
      float var25 = this.field6884.field1064 / (float)this.field6884.field1060;
      float var26 = this.field6884.field1058 / (float)this.field6884.field1065;

      for(int var27 = 0; var27 < 256; ++var27) {
         class439 var28 = arg2[var27];
         int var29 = var28.field6267;
         int var30 = var28.field6269;
         int var31 = var28.field6262;
         int var32 = var28.field6265;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field6885.method4569(var27, (byte)-122);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field6884.field1058 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field6884.field1058 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field6884.field1058 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field6884.field1058 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field6885.method4570(256);
      }

   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(CIIIZLaa;II)V",
      line = 264
   )
   public final void method109(char arg0, int arg1, int arg2, int arg3, boolean arg4, class515 arg5, int arg6, int arg7) {
      class612 var9 = (class612)arg5;
      class81 var10 = var9.field8976;
      this.field6882.method4173(4);
      this.field6882.method4107(60, this.field6884);
      if (!this.field6883 && !arg4) {
         this.field6882.method4117(7681, 7681, -1);
      } else {
         this.field6882.method4117(7681, 8448, -1);
         this.field6882.method4096(0, (byte)15, 34168, 768);
      }

      this.field6882.method4112((byte)-23, 1);
      this.field6882.method4107(30, var10);
      this.field6882.method4117(7681, 8448, -1);
      this.field6882.method4096(0, (byte)15, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field1064 / (float)var10.field1060;
      float var12 = var10.field1058 / (float)var10.field1065;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field6885.method4571(false, arg0);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field6882.method4096(0, (byte)15, 5890, 768);
      this.field6882.method4117(8448, 8448, -1);
      this.field6882.method4107(-122, (class486)null);
      this.field6882.method4112((byte)-104, 0);
      if (this.field6883 || arg4) {
         this.field6882.method4096(0, (byte)15, 5890, 768);
      }

   }
}
