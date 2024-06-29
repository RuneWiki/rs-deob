import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class38 extends class447 {
   @OriginalMember(
      owner = "client!bea",
      name = "v",
      descriptor = "Liu;"
   )
   private class530 field537;
   @OriginalMember(
      owner = "client!bea",
      name = "w",
      descriptor = "Lik;"
   )
   private class124 field536;
   @OriginalMember(
      owner = "client!bea",
      name = "u",
      descriptor = "Z"
   )
   private boolean field534;
   @OriginalMember(
      owner = "client!bea",
      name = "t",
      descriptor = "Ljea;"
   )
   private class249 field535;

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method294(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
      class229 var9 = (class229)arg5;
      class124 var10 = var9.field2864;
      this.field537.method3996(11376);
      this.field537.method4006(this.field536, (byte)-122);
      if (!this.field534 && !arg4) {
         this.field537.method4022(7681, 34161, 7681);
      } else {
         this.field537.method4022(8448, 34161, 7681);
         this.field537.method3959(-102, 768, 34168, 0);
      }

      this.field537.method3988(-128, 1);
      this.field537.method4006(var10, (byte)-128);
      this.field537.method4022(8448, 34161, 7681);
      this.field537.method3959(-72, 768, 34168, 0);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field1623 / (float)var10.field1624;
      float var12 = var10.field1621 / (float)var10.field1620;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field535.method1979(arg0, -1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field537.method3959(-60, 768, 5890, 0);
      this.field537.method4022(8448, 34161, 8448);
      this.field537.method4006((class549)null, (byte)8);
      this.field537.method3988(-128, 0);
      if (this.field534 || arg4) {
         this.field537.method3959(-87, 768, 5890, 0);
      }

   }

   @OriginalMember(
      owner = "client!bea",
      name = "<init>",
      descriptor = "(Liu;Lkv;[Lu;Z)V"
   )
   public class38(class530 arg0, class19 arg1, class65[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field537 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class65 var54 = arg2[var6];
         if (var54.field820 > var5) {
            var5 = var54.field820;
         }

         if (var54.field819 > var5) {
            var5 = var54.field819;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class65 var10 = arg2[var9];
            int var11 = var10.field820;
            int var12 = var10.field819;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field815 == null) {
               byte[] var17 = var10.field818;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field815;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field536 = class598.method4449(var7, 6406, false, arg0, 3553, 6406, var7, var8);
         this.field534 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class65 var39 = arg2[var24];
            int[] var40 = var39.field813;
            byte[] var41 = var39.field815;
            byte[] var42 = var39.field818;
            int var43 = var39.field820;
            int var44 = var39.field819;
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

         this.field536 = class306.method2446(0, var7, arg0, false, var7, true, 0, var23);
         this.field534 = false;
      }

      this.field536.method4157((byte)111, false);
      this.field535 = new class249(arg0, 256);
      float var25 = this.field536.field1623 / (float)this.field536.field1624;
      float var26 = this.field536.field1621 / (float)this.field536.field1620;

      for(int var27 = 0; var27 < 256; ++var27) {
         class65 var28 = arg2[var27];
         int var29 = var28.field820;
         int var30 = var28.field819;
         int var31 = var28.field814;
         int var32 = var28.field816;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field535.method1977(4864, var27);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field536.field1621 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field536.field1621 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field536.field1621 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field536.field1621 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field535.method1976(-128);
      }

   }

   @OriginalMember(
      owner = "client!bea",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field537.method3996(11376);
      this.field537.method4006(this.field536, (byte)20);
      if (!this.field534 && !arg4) {
         this.field537.method4022(7681, 34161, 7681);
      } else {
         this.field537.method4022(8448, 34161, 7681);
         this.field537.method3959(-81, 768, 34168, 0);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field535.method1979(arg0, -1);
      OpenGL.glLoadIdentity();
      if (this.field534 || arg4) {
         this.field537.method3959(-112, 768, 5890, 0);
      }

   }
}
