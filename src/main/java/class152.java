import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class152 extends class66 {
   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "Lce;"
   )
   private class327 field1970;
   @OriginalMember(
      owner = "client!wk",
      name = "y",
      descriptor = "Lgu;"
   )
   private class610 field1968;
   @OriginalMember(
      owner = "client!wk",
      name = "x",
      descriptor = "Z"
   )
   private boolean field1971;
   @OriginalMember(
      owner = "client!wk",
      name = "A",
      descriptor = "Lso;"
   )
   private class499 field1969;

   @OriginalMember(
      owner = "client!wk",
      name = "<init>",
      descriptor = "(Lce;Ljk;[Lok;Z)V"
   )
   public class152(class327 arg0, class663 arg1, class267[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field1970 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class267 var59 = arg2[var6];
         if (var59.field3469 > var5) {
            var5 = var59.field3469;
         }

         if (var59.field3467 > var5) {
            var5 = var59.field3467;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class267 var12 = arg2[var9];
            int var13 = var12.field3469;
            int var14 = var12.field3467;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field3464 == null) {
               byte[] var19 = var12.field3472;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field3464;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method2594(class128.field1618, 15903, class335.field4803)) {
            this.field1968 = arg0.method2475(true, var7, var8, class128.field1618, false, var7);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field1968 = arg0.method2484(var10, false, var7, var7, (byte)2);
         }

         this.field1971 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class267 var44 = arg2[var26];
            int[] var45 = var44.field3468;
            byte[] var46 = var44.field3464;
            byte[] var47 = var44.field3472;
            int var48 = var44.field3469;
            int var49 = var44.field3467;
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

         this.field1968 = arg0.method2484(var25, false, var7, var7, (byte)2);
         this.field1971 = false;
      }

      this.field1968.method40(class715.field10464, (byte)-126);
      this.field1969 = arg0.method2584((byte)-94, false);
      this.field1969.method789(-6222, 20480, 20);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field1969.method786(-9609, true);
         if (var28 != null) {
            Stream var29 = this.field1970.method2560(var28, 127);
            float var30 = this.field1968.method42((byte)15, (float)var7) / (float)var7;
            float var31 = this.field1968.method37((float)var7, -113) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class267 var33 = arg2[var32];
               int var34 = var33.field3469;
               int var35 = var33.field3467;
               int var36 = var33.field3466;
               int var37 = var33.field3465;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method5101()) {
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
               } else {
                  var29.method5114((float)var37);
                  var29.method5114((float)var36);
                  var29.method5114(0.0F);
                  var29.method5114(var40);
                  var29.method5114(var41);
                  var29.method5114((float)var37);
                  var29.method5114((float)(var34 + var36));
                  var29.method5114(0.0F);
                  var29.method5114(var40);
                  var29.method5114(var43);
                  var29.method5114((float)(var35 + var37));
                  var29.method5114((float)(var34 + var36));
                  var29.method5114(0.0F);
                  var29.method5114(var42);
                  var29.method5114(var43);
                  var29.method5114((float)(var35 + var37));
                  var29.method5114((float)var36);
                  var29.method5114(0.0F);
                  var29.method5114(var42);
                  var29.method5114(var41);
               }
            }

            var29.method5109();
            if (this.field1969.method787((byte)108)) {
               return;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!wk",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method170(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field1970.method2566((byte)111);
      this.field1970.method2581(this.field1968, 127);
      if (!this.field1971 && !arg4) {
         this.field1970.method2587(class535.field7314, 92, class535.field7314);
      } else {
         this.field1970.method2587(class449.field6203, -76, class535.field7314);
         this.field1970.method2547(0, class206.field2525, 0);
         this.field1970.method2552(arg3, true);
      }

      class251 var6 = this.field1970.method2549(-1);
      var6.method143(arg1, arg2, 0);
      this.field1970.method2515(16);
      this.field1970.method2580(-8833, 0, this.field1969);
      this.field1970.method2529(-124, this.field1970.field4678);
      this.field1970.method2481(2, arg0 * 4, class504.field6912, 0);
      if (this.field1971 || arg4) {
         this.field1970.method2547(0, class550.field7513, 0);
      }

   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method168(char arg0, int arg1, int arg2, int arg3, boolean arg4, class516 arg5, int arg6, int arg7) {
   }
}
