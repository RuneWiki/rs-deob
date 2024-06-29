import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class765 extends class67 {
   @OriginalMember(
      owner = "client!pg",
      name = "A",
      descriptor = "Lsc;"
   )
   private class369 field11290;
   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "Lfc;"
   )
   private class272 field11291;
   @OriginalMember(
      owner = "client!pg",
      name = "x",
      descriptor = "Z"
   )
   private boolean field11289;
   @OriginalMember(
      owner = "client!pg",
      name = "y",
      descriptor = "Lbk;"
   )
   private class398 field11288;

   @OriginalMember(
      owner = "client!pg",
      name = "<init>",
      descriptor = "(Lsc;Lru;[Lmha;Z)V"
   )
   public class765(class369 arg0, class206 arg1, class439[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field11290 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class439 var59 = arg2[var6];
         if (var59.field6267 > var5) {
            var5 = var59.field6267;
         }

         if (var59.field6269 > var5) {
            var5 = var59.field6269;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class439 var12 = arg2[var9];
            int var13 = var12.field6267;
            int var14 = var12.field6269;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field6270 == null) {
               byte[] var19 = var12.field6268;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field6270;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method2636(true, class301.field4117, class46.field621)) {
            this.field11291 = arg0.method2743(var7, false, class46.field621, var8, -5, var7);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field11291 = arg0.method2759(false, var7, 0, var10, var7);
         }

         this.field11289 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class439 var44 = arg2[var26];
            int[] var45 = var44.field6264;
            byte[] var46 = var44.field6270;
            byte[] var47 = var44.field6268;
            int var48 = var44.field6267;
            int var49 = var44.field6269;
            int var50 = var26 % 16 * var5;
            int var51 = var26 / 16 * var5;
            int var52 = var7 * var51 + var50;
            int var53 = 0;
            if (var46 != null) {
               for(int var54 = 0; var54 < var48; ++var54) {
                  for(int var55 = 0; var55 < var49; ++var55) {
                     var25[var52++] = var46[var53] << 24 | var45[var47[var53] & 255];
                     ++var53;
                  }

                  var52 += var7 - var49;
               }
            } else {
               for(int var56 = 0; var56 < var48; ++var56) {
                  for(int var57 = 0; var57 < var49; ++var57) {
                     byte var58;
                     if ((var58 = var47[var53++]) != 0) {
                        var25[var52++] = -16777216 | var45[var58 & 255];
                     } else {
                        ++var52;
                     }
                  }

                  var52 += var7 - var49;
               }
            }
         }

         this.field11291 = arg0.method2759(false, var7, 0, var25, var7);
         this.field11289 = false;
      }

      this.field11291.method1425(-121, class212.field3023);
      this.field11288 = arg0.method2615(76, false);
      this.field11288.method1410(20480, 20, 108);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field11288.method1407(true, true);
         if (var28 != null) {
            Stream var29 = this.field11290.method2805(-119, var28);
            float var30 = this.field11291.method282((float)var7, (byte)26) / (float)var7;
            float var31 = this.field11291.method274(11535, (float)var7) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class439 var33 = arg2[var32];
               int var34 = var33.field6267;
               int var35 = var33.field6269;
               int var36 = var33.field6262;
               int var37 = var33.field6265;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method5106()) {
                  var29.method5098((float)var37);
                  var29.method5098((float)var36);
                  var29.method5098(0.0F);
                  var29.method5098(var40);
                  var29.method5098(var41);
                  var29.method5098((float)var37);
                  var29.method5098((float)(var34 + var36));
                  var29.method5098(0.0F);
                  var29.method5098(var40);
                  var29.method5098(var43);
                  var29.method5098((float)(var35 + var37));
                  var29.method5098((float)(var34 + var36));
                  var29.method5098(0.0F);
                  var29.method5098(var42);
                  var29.method5098(var43);
                  var29.method5098((float)(var35 + var37));
                  var29.method5098((float)var36);
                  var29.method5098(0.0F);
                  var29.method5098(var42);
                  var29.method5098(var41);
               } else {
                  var29.method5104((float)var37);
                  var29.method5104((float)var36);
                  var29.method5104(0.0F);
                  var29.method5104(var40);
                  var29.method5104(var41);
                  var29.method5104((float)var37);
                  var29.method5104((float)(var34 + var36));
                  var29.method5104(0.0F);
                  var29.method5104(var40);
                  var29.method5104(var43);
                  var29.method5104((float)(var35 + var37));
                  var29.method5104((float)(var34 + var36));
                  var29.method5104(0.0F);
                  var29.method5104(var42);
                  var29.method5104(var43);
                  var29.method5104((float)(var35 + var37));
                  var29.method5104((float)var36);
                  var29.method5104(0.0F);
                  var29.method5104(var42);
                  var29.method5104(var41);
               }
            }

            var29.method5102();
            if (this.field11288.method1409((byte)59)) {
               return;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method109(char arg0, int arg1, int arg2, int arg3, boolean arg4, class515 arg5, int arg6, int arg7) {
   }

   @OriginalMember(
      owner = "client!pg",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method110(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field11290.method2818(24240);
      this.field11290.method2804(this.field11291, -2);
      if (!this.field11289 && !arg4) {
         this.field11290.method2745(-30, class603.field8872, class603.field8872);
      } else {
         this.field11290.method2745(-30, class603.field8872, class458.field6587);
         this.field11290.method2814(0, class304.field4150, true);
         this.field11290.method2752(arg3, (byte)50);
      }

      class716 var6 = this.field11290.method2748(0);
      var6.method1217(arg1, arg2, 0);
      this.field11290.method2744(false);
      this.field11290.method2585(12, 0, this.field11288);
      this.field11290.method2621(this.field11290.field5352, -18344);
      this.field11290.method2603(class62.field761, 2, arg0 * 4, 95);
      if (this.field11289 || arg4) {
         this.field11290.method2814(0, class10.field93, true);
      }

   }
}
