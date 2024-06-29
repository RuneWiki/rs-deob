import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class463 extends class447 {
   @OriginalMember(
      owner = "client!nu",
      name = "t",
      descriptor = "Lfm;"
   )
   private class281 field6375;
   @OriginalMember(
      owner = "client!nu",
      name = "v",
      descriptor = "Lcb;"
   )
   private class177 field6374;
   @OriginalMember(
      owner = "client!nu",
      name = "u",
      descriptor = "Z"
   )
   private boolean field6373;
   @OriginalMember(
      owner = "client!nu",
      name = "w",
      descriptor = "Lbc;"
   )
   private class11 field6376;

   @OriginalMember(
      owner = "client!nu",
      name = "<init>",
      descriptor = "(Lfm;Lkv;[Lu;Z)V"
   )
   public class463(class281 arg0, class19 arg1, class65[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field6375 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class65 var59 = arg2[var6];
         if (var59.field820 > var5) {
            var5 = var59.field820;
         }

         if (var59.field819 > var5) {
            var5 = var59.field819;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class65 var12 = arg2[var9];
            int var13 = var12.field820;
            int var14 = var12.field819;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field815 == null) {
               byte[] var19 = var12.field818;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field815;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method1407(class576.field8541, -2, class673.field9968)) {
            this.field6374 = arg0.method2253(var8, -34, false, var7, var7, class673.field9968);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field6374 = arg0.method2283((byte)-53, var7, false, var7, var10);
         }

         this.field6373 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class65 var44 = arg2[var26];
            int[] var45 = var44.field813;
            byte[] var46 = var44.field815;
            byte[] var47 = var44.field818;
            int var48 = var44.field820;
            int var49 = var44.field819;
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

         this.field6374 = arg0.method2283((byte)-53, var7, false, var7, var25);
         this.field6373 = false;
      }

      this.field6374.method2868(class632.field9325, (byte)-57);
      this.field6376 = arg0.method1398(false, (byte)98);
      this.field6376.method101(30842, 20480, 20);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field6376.method102((byte)-122, true);
         if (var28 != null) {
            Stream var29 = this.field6375.method2235(true, var28);
            float var30 = this.field6374.method1514((byte)42, (float)var7) / (float)var7;
            float var31 = this.field6374.method1510(-71, (float)var7) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class65 var33 = arg2[var32];
               int var34 = var33.field820;
               int var35 = var33.field819;
               int var36 = var33.field814;
               int var37 = var33.field816;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method2990()) {
                  var29.method2994((float)var37);
                  var29.method2994((float)var36);
                  var29.method2994(0.0F);
                  var29.method2994(var40);
                  var29.method2994(var41);
                  var29.method2994((float)var37);
                  var29.method2994((float)(var34 + var36));
                  var29.method2994(0.0F);
                  var29.method2994(var40);
                  var29.method2994(var43);
                  var29.method2994((float)(var35 + var37));
                  var29.method2994((float)(var34 + var36));
                  var29.method2994(0.0F);
                  var29.method2994(var42);
                  var29.method2994(var43);
                  var29.method2994((float)(var35 + var37));
                  var29.method2994((float)var36);
                  var29.method2994(0.0F);
                  var29.method2994(var42);
                  var29.method2994(var41);
               } else {
                  var29.method2997((float)var37);
                  var29.method2997((float)var36);
                  var29.method2997(0.0F);
                  var29.method2997(var40);
                  var29.method2997(var41);
                  var29.method2997((float)var37);
                  var29.method2997((float)(var34 + var36));
                  var29.method2997(0.0F);
                  var29.method2997(var40);
                  var29.method2997(var43);
                  var29.method2997((float)(var35 + var37));
                  var29.method2997((float)(var34 + var36));
                  var29.method2997(0.0F);
                  var29.method2997(var42);
                  var29.method2997(var43);
                  var29.method2997((float)(var35 + var37));
                  var29.method2997((float)var36);
                  var29.method2997(0.0F);
                  var29.method2997(var42);
                  var29.method2997(var41);
               }
            }

            var29.method2995();
            if (this.field6376.method104(-19749)) {
               return;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method294(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
   }

   @OriginalMember(
      owner = "client!nu",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field6375.method2222(1);
      this.field6375.method2265(this.field6374, (byte)122);
      if (!this.field6373 && !arg4) {
         this.field6375.method2231(class318.field4380, class318.field4380, (byte)46);
      } else {
         this.field6375.method2231(class318.field4380, class231.field2873, (byte)94);
         this.field6375.method2288((byte)-10, class354.field4947, 0);
         this.field6375.method2276(arg3, 99);
      }

      class620 var6 = this.field6375.method2230(9);
      var6.method860(arg1, arg2, 0);
      this.field6375.method2218(0);
      this.field6375.method1375(this.field6376, true, 0);
      this.field6375.method1402(1, this.field6375.field3901);
      this.field6375.method1413(true, 2, arg0 * 4, class437.field5958);
      if (this.field6373 || arg4) {
         this.field6375.method2288((byte)-10, class363.field5039, 0);
      }

   }
}
