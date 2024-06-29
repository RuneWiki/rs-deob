import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class730 extends class67 {
   @OriginalMember(
      owner = "client!no",
      name = "F",
      descriptor = "Ldh;"
   )
   private class338 field10839;
   @OriginalMember(
      owner = "client!no",
      name = "D",
      descriptor = "Loia;"
   )
   private class95 field10840;
   @OriginalMember(
      owner = "client!no",
      name = "E",
      descriptor = "Z"
   )
   private boolean field10841;
   @OriginalMember(
      owner = "client!no",
      name = "B",
      descriptor = "Lgp;"
   )
   private class53 field10842;

   @OriginalMember(
      owner = "client!no",
      name = "<init>",
      descriptor = "(Ldh;Lpg;[Lnia;Z)V"
   )
   public class730(class338 arg0, class763 arg1, class671[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field10839 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class671 var59 = arg2[var6];
         if (var59.field10097 > var5) {
            var5 = var59.field10097;
         }

         if (var59.field10100 > var5) {
            var5 = var59.field10100;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class671 var12 = arg2[var9];
            int var13 = var12.field10097;
            int var14 = var12.field10100;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field10095 == null) {
               byte[] var19 = var12.field10099;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field10095;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method2597(class513.field7519, class740.field10984, (byte)-109)) {
            this.field10840 = arg0.method2671(var7, class740.field10984, 13197, var7, false, var8);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field10840 = arg0.method2577(false, var7, var10, var7, 2);
         }

         this.field10841 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class671 var44 = arg2[var26];
            int[] var45 = var44.field10096;
            byte[] var46 = var44.field10095;
            byte[] var47 = var44.field10099;
            int var48 = var44.field10097;
            int var49 = var44.field10100;
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

         this.field10840 = arg0.method2577(false, var7, var25, var7, 2);
         this.field10841 = false;
      }

      this.field10840.method1914(-15226, class711.field10617);
      this.field10842 = arg0.method2610(-2, false);
      this.field10842.method424(20480, (byte)-69, 20);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field10842.method421((byte)-98, true);
         if (var28 != null) {
            Stream var29 = this.field10839.method2593(var28, 0);
            float var30 = this.field10840.method504((float)var7, 2029) / (float)var7;
            float var31 = this.field10840.method503((float)var7, 25525) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class671 var33 = arg2[var32];
               int var34 = var33.field10097;
               int var35 = var33.field10100;
               int var36 = var33.field10102;
               int var37 = var33.field10103;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method5098()) {
                  var29.method5084((float)var37);
                  var29.method5084((float)var36);
                  var29.method5084(0.0F);
                  var29.method5084(var40);
                  var29.method5084(var41);
                  var29.method5084((float)var37);
                  var29.method5084((float)(var34 + var36));
                  var29.method5084(0.0F);
                  var29.method5084(var40);
                  var29.method5084(var43);
                  var29.method5084((float)(var35 + var37));
                  var29.method5084((float)(var34 + var36));
                  var29.method5084(0.0F);
                  var29.method5084(var42);
                  var29.method5084(var43);
                  var29.method5084((float)(var35 + var37));
                  var29.method5084((float)var36);
                  var29.method5084(0.0F);
                  var29.method5084(var42);
                  var29.method5084(var41);
               } else {
                  var29.method5089((float)var37);
                  var29.method5089((float)var36);
                  var29.method5089(0.0F);
                  var29.method5089(var40);
                  var29.method5089(var41);
                  var29.method5089((float)var37);
                  var29.method5089((float)(var34 + var36));
                  var29.method5089(0.0F);
                  var29.method5089(var40);
                  var29.method5089(var43);
                  var29.method5089((float)(var35 + var37));
                  var29.method5089((float)(var34 + var36));
                  var29.method5089(0.0F);
                  var29.method5089(var42);
                  var29.method5089(var43);
                  var29.method5089((float)(var35 + var37));
                  var29.method5089((float)var36);
                  var29.method5089(0.0F);
                  var29.method5089(var42);
                  var29.method5089(var41);
               }
            }

            var29.method5085();
            if (this.field10842.method422((byte)98)) {
               return;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
   }

   @OriginalMember(
      owner = "client!no",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field10839.method2607(1);
      this.field10839.method2578(this.field10840, true);
      if (!this.field10841 && !arg4) {
         this.field10839.method2568(class680.field10213, class680.field10213, false);
      } else {
         this.field10839.method2568(class680.field10213, class556.field8257, false);
         this.field10839.method2636(-125, 0, class522.field7591);
         this.field10839.method2646(arg3, 110);
      }

      class495 var6 = this.field10839.method2672(-101);
      var6.method1530(arg1, arg2, 0);
      this.field10839.method2567(-94);
      this.field10839.method2659(123, this.field10842, 0);
      this.field10839.method2642(this.field10839.field5122, (byte)118);
      this.field10839.method2639((byte)28, class264.field3616, 2, arg0 * 4);
      if (this.field10841 || arg4) {
         this.field10839.method2636(-93, 0, class496.field7336);
      }

   }
}
