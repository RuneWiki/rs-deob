import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class241 extends class216 {
   @OriginalMember(
      owner = "client!qq",
      name = "A",
      descriptor = "Laea;"
   )
   private class678 field3702;
   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "Lefa;"
   )
   private class436 field3701;
   @OriginalMember(
      owner = "client!qq",
      name = "x",
      descriptor = "Z"
   )
   private boolean field3704;
   @OriginalMember(
      owner = "client!qq",
      name = "y",
      descriptor = "Lgca;"
   )
   private class50 field3703;

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method1878(char arg0, int arg1, int arg2, int arg3, boolean arg4, class684 arg5, int arg6, int arg7) {
      class61 var9 = (class61)arg5;
      class436 var10 = var9.field869;
      this.field3702.method4893((byte)-45);
      this.field3702.method4906(-2, this.field3701);
      if (!this.field3704 && !arg4) {
         this.field3702.method4931(7681, 7681, 0);
      } else {
         this.field3702.method4931(7681, 8448, 0);
         this.field3702.method4909(34168, 768, 0, (byte)31);
      }

      this.field3702.method4958(1, false);
      this.field3702.method4906(-2, var10);
      this.field3702.method4931(7681, 8448, 0);
      this.field3702.method4909(34168, 768, 0, (byte)55);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field6385 / (float)var10.field6383;
      float var12 = var10.field6386 / (float)var10.field6378;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field3703.method547(arg0, true);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field3702.method4909(5890, 768, 0, (byte)-128);
      this.field3702.method4931(8448, 8448, 0);
      this.field3702.method4906(-2, (class719)null);
      this.field3702.method4958(0, false);
      if (this.field3704 || arg4) {
         this.field3702.method4909(5890, 768, 0, (byte)-112);
      }

   }

   @OriginalMember(
      owner = "client!qq",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method1875(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field3702.method4893((byte)-28);
      this.field3702.method4906(-2, this.field3701);
      if (!this.field3704 && !arg4) {
         this.field3702.method4931(7681, 7681, 0);
      } else {
         this.field3702.method4931(7681, 8448, 0);
         this.field3702.method4909(34168, 768, 0, (byte)-99);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field3703.method547(arg0, true);
      OpenGL.glLoadIdentity();
      if (this.field3704 || arg4) {
         this.field3702.method4909(5890, 768, 0, (byte)-100);
      }

   }

   @OriginalMember(
      owner = "client!qq",
      name = "<init>",
      descriptor = "(Laea;Lwm;[Liaa;Z)V"
   )
   public class241(class678 arg0, class440 arg1, class433[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field3702 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class433 var54 = arg2[var6];
         if (var54.field6353 > var5) {
            var5 = var54.field6353;
         }

         if (var54.field6361 > var5) {
            var5 = var54.field6361;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class433 var10 = arg2[var9];
            int var11 = var10.field6353;
            int var12 = var10.field6361;
            int var13 = var9 % 16 * var5;
            int var14 = var9 / 16 * var5;
            int var15 = var7 * var14 + var13;
            int var16 = 0;
            if (var10.field6356 == null) {
               byte[] var17 = var10.field6354;

               for(int var18 = 0; var18 < var11; ++var18) {
                  for(int var19 = 0; var19 < var12; ++var19) {
                     var8[var15++] = (byte)(var17[var16++] == 0 ? 0 : -1);
                  }

                  var15 += var7 - var12;
               }
            } else {
               byte[] var20 = var10.field6356;

               for(int var21 = 0; var21 < var11; ++var21) {
                  for(int var22 = 0; var22 < var12; ++var22) {
                     var8[var15++] = var20[var16++];
                  }

                  var15 += var7 - var12;
               }
            }
         }

         this.field3701 = class432.method3367(arg0, 6406, 6406, var7, var7, false, 3553, var8);
         this.field3704 = true;
      } else {
         int[] var23 = new int[var7 * var7];

         for(int var24 = 0; var24 < 256; ++var24) {
            class433 var39 = arg2[var24];
            int[] var40 = var39.field6357;
            byte[] var41 = var39.field6356;
            byte[] var42 = var39.field6354;
            int var43 = var39.field6353;
            int var44 = var39.field6361;
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

         this.field3701 = class536.method3998(var23, var7, false, var7, 0, arg0, 0, (byte)-123);
         this.field3704 = false;
      }

      this.field3701.method5204(false, -1);
      this.field3703 = new class50(arg0, 256);
      float var25 = this.field3701.field6385 / (float)this.field3701.field6383;
      float var26 = this.field3701.field6386 / (float)this.field3701.field6378;

      for(int var27 = 0; var27 < 256; ++var27) {
         class433 var28 = arg2[var27];
         int var29 = var28.field6353;
         int var30 = var28.field6361;
         int var31 = var28.field6358;
         int var32 = var28.field6355;
         float var33 = (float)(var27 % 16 * var5);
         float var34 = (float)(var27 / 16 * var5);
         float var35 = var25 * var33;
         float var36 = var26 * var34;
         float var37 = ((float)var30 + var33) * var25;
         float var38 = ((float)var29 + var34) * var26;
         this.field3703.method544(var27, -76);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var35, this.field3701.field6386 - var36);
         OpenGL.glVertex2i(var32, var31);
         OpenGL.glTexCoord2f(var35, this.field3701.field6386 - var38);
         OpenGL.glVertex2i(var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field3701.field6386 - var38);
         OpenGL.glVertex2i(var30 + var32, var29 + var31);
         OpenGL.glTexCoord2f(var37, this.field3701.field6386 - var36);
         OpenGL.glVertex2i(var30 + var32, var31);
         OpenGL.glEnd();
         this.field3703.method545((byte)93);
      }

   }
}
