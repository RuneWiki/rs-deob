import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class379 extends class66 {
   @OriginalMember(
      owner = "client!uia",
      name = "C",
      descriptor = "Lcs;"
   )
   private class357 field5635;
   @OriginalMember(
      owner = "client!uia",
      name = "A",
      descriptor = "Lnfa;"
   )
   private class706 field5634;
   @OriginalMember(
      owner = "client!uia",
      name = "D",
      descriptor = "Z"
   )
   private boolean field5633;
   @OriginalMember(
      owner = "client!uia",
      name = "B",
      descriptor = "Lsd;"
   )
   private class102 field5632;

   @OriginalMember(
      owner = "client!uia",
      name = "<init>",
      descriptor = "(Lcs;Lika;[Ltn;Z)V",
      line = 6
   )
   public class379(class357 arg0, class445 arg1, class94[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field5635 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class94 var59 = arg2[var6];
         if (var59.field1520 > var5) {
            var5 = var59.field1520;
         }

         if (var59.field1523 > var5) {
            var5 = var59.field1523;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class94 var12 = arg2[var9];
            int var13 = var12.field1520;
            int var14 = var12.field1523;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field1527 == null) {
               byte[] var19 = var12.field1519;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field1527;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method1190(class776.field11354, -85, class209.field3106)) {
            this.field5634 = arg0.method2790(var8, 122, false, var7, class776.field11354, var7);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field5634 = arg0.method2766(false, var7, var7, (byte)104, var10);
         }

         this.field5633 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class94 var44 = arg2[var26];
            int[] var45 = var44.field1521;
            byte[] var46 = var44.field1527;
            byte[] var47 = var44.field1519;
            int var48 = var44.field1520;
            int var49 = var44.field1523;
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

         this.field5634 = arg0.method2766(false, var7, var7, (byte)104, var25);
         this.field5633 = false;
      }

      this.field5634.method460((byte)-73, class308.field4438);
      this.field5632 = arg0.method1194((byte)72, false);
      this.field5632.method568(22407, 20, 20480);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field5632.method567(true, (byte)49);
         if (var28 != null) {
            Stream var29 = this.field5635.method2759((byte)37, var28);
            float var30 = this.field5634.method880(-10745, (float)var7) / (float)var7;
            float var31 = this.field5634.method881((float)var7, false) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class94 var33 = arg2[var32];
               int var34 = var33.field1520;
               int var35 = var33.field1523;
               int var36 = var33.field1525;
               int var37 = var33.field1522;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method5090()) {
                  var29.method5082((float)var37);
                  var29.method5082((float)var36);
                  var29.method5082(0.0F);
                  var29.method5082(var40);
                  var29.method5082(var41);
                  var29.method5082((float)var37);
                  var29.method5082((float)(var34 + var36));
                  var29.method5082(0.0F);
                  var29.method5082(var40);
                  var29.method5082(var43);
                  var29.method5082((float)(var35 + var37));
                  var29.method5082((float)(var34 + var36));
                  var29.method5082(0.0F);
                  var29.method5082(var42);
                  var29.method5082(var43);
                  var29.method5082((float)(var35 + var37));
                  var29.method5082((float)var36);
                  var29.method5082(0.0F);
                  var29.method5082(var42);
                  var29.method5082(var41);
               } else {
                  var29.method5091((float)var37);
                  var29.method5091((float)var36);
                  var29.method5091(0.0F);
                  var29.method5091(var40);
                  var29.method5091(var41);
                  var29.method5091((float)var37);
                  var29.method5091((float)(var34 + var36));
                  var29.method5091(0.0F);
                  var29.method5091(var40);
                  var29.method5091(var43);
                  var29.method5091((float)(var35 + var37));
                  var29.method5091((float)(var34 + var36));
                  var29.method5091(0.0F);
                  var29.method5091(var42);
                  var29.method5091(var43);
                  var29.method5091((float)(var35 + var37));
                  var29.method5091((float)var36);
                  var29.method5091(0.0F);
                  var29.method5091(var42);
                  var29.method5091(var41);
               }
            }

            var29.method5086();
            if (this.field5632.method569(1571)) {
               return;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!uia",
      name = "fa",
      descriptor = "(CIIIZ)V",
      line = 310
   )
   public final void method140(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field5635.method2784(-118);
      this.field5635.method2806(false, this.field5634);
      if (!this.field5633 && !arg4) {
         this.field5635.method2761(class641.field9348, (byte)-69, class641.field9348);
      } else {
         this.field5635.method2761(class641.field9348, (byte)-69, class621.field9036);
         this.field5635.method2779(8, 0, class295.field4119);
         this.field5635.method2754(arg3, (byte)-66);
      }

      class104 var6 = this.field5635.method2755(0);
      var6.method1008(arg1, arg2, 0);
      this.field5635.method2746((byte)52);
      this.field5635.method1202(0, this.field5632, 10);
      this.field5635.method1166((byte)121, this.field5635.field5334);
      this.field5635.method1156(class368.field5464, 2, arg0 * 4, 0);
      if (this.field5633 || arg4) {
         this.field5635.method2779(8, 0, class540.field7850);
      }

   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(CIIIZLaa;II)V",
      line = 332
   )
   public final void method143(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7) {
   }
}
