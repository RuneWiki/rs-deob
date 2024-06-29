import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class131 extends class288 {
   @OriginalMember(
      owner = "client!eg",
      name = "u",
      descriptor = "Lmu;"
   )
   private class258 field1887;
   @OriginalMember(
      owner = "client!eg",
      name = "v",
      descriptor = "Lbc;"
   )
   private class282 field1885;
   @OriginalMember(
      owner = "client!eg",
      name = "w",
      descriptor = "Z"
   )
   private boolean field1886;
   @OriginalMember(
      owner = "client!eg",
      name = "x",
      descriptor = "Lgfa;"
   )
   private class631 field1884;

   @OriginalMember(
      owner = "client!eg",
      name = "<init>",
      descriptor = "(Lmu;Lqda;[Lkp;Z)V",
      line = 3
   )
   public class131(class258 arg0, class697 arg1, class776[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field1887 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class776 var59 = arg2[var6];
         if (var59.field11394 > var5) {
            var5 = var59.field11394;
         }

         if (var59.field11395 > var5) {
            var5 = var59.field11395;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class776 var12 = arg2[var9];
            int var13 = var12.field11394;
            int var14 = var12.field11395;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field11398 == null) {
               byte[] var19 = var12.field11396;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field11398;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method1453(class342.field5203, class650.field9371, (byte)-65)) {
            this.field1885 = arg0.method2214(var7, false, var7, class342.field5203, (byte)75, var8);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field1885 = arg0.method2177(false, -1, var7, var10, var7);
         }

         this.field1886 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class776 var44 = arg2[var26];
            int[] var45 = var44.field11400;
            byte[] var46 = var44.field11398;
            byte[] var47 = var44.field11396;
            int var48 = var44.field11394;
            int var49 = var44.field11395;
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

         this.field1885 = arg0.method2177(false, -1, var7, var25, var7);
         this.field1886 = false;
      }

      this.field1885.method216(127, class175.field2747);
      this.field1884 = arg0.method1472(false, -98);
      this.field1884.method1537(20, 20480, 22251);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field1884.method1535(true, -124);
         if (var28 != null) {
            Stream var29 = this.field1887.method2245((byte)73, var28);
            float var30 = this.field1885.method2359((float)var7, (byte)32) / (float)var7;
            float var31 = this.field1885.method2363(-42, (float)var7) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class776 var33 = arg2[var32];
               int var34 = var33.field11394;
               int var35 = var33.field11395;
               int var36 = var33.field11397;
               int var37 = var33.field11401;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method5249()) {
                  var29.method5248((float)var37);
                  var29.method5248((float)var36);
                  var29.method5248(0.0F);
                  var29.method5248(var40);
                  var29.method5248(var41);
                  var29.method5248((float)var37);
                  var29.method5248((float)(var34 + var36));
                  var29.method5248(0.0F);
                  var29.method5248(var40);
                  var29.method5248(var43);
                  var29.method5248((float)(var35 + var37));
                  var29.method5248((float)(var34 + var36));
                  var29.method5248(0.0F);
                  var29.method5248(var42);
                  var29.method5248(var43);
                  var29.method5248((float)(var35 + var37));
                  var29.method5248((float)var36);
                  var29.method5248(0.0F);
                  var29.method5248(var42);
                  var29.method5248(var41);
               } else {
                  var29.method5241((float)var37);
                  var29.method5241((float)var36);
                  var29.method5241(0.0F);
                  var29.method5241(var40);
                  var29.method5241(var41);
                  var29.method5241((float)var37);
                  var29.method5241((float)(var34 + var36));
                  var29.method5241(0.0F);
                  var29.method5241(var40);
                  var29.method5241(var43);
                  var29.method5241((float)(var35 + var37));
                  var29.method5241((float)(var34 + var36));
                  var29.method5241(0.0F);
                  var29.method5241(var42);
                  var29.method5241(var43);
                  var29.method5241((float)(var35 + var37));
                  var29.method5241((float)var36);
                  var29.method5241(0.0F);
                  var29.method5241(var42);
                  var29.method5241(var41);
               }
            }

            var29.method5253();
            if (this.field1884.method1534(-125)) {
               return;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(CIIIZLaa;II)V",
      line = 306
   )
   public final void method1065(char arg0, int arg1, int arg2, int arg3, boolean arg4, class96 arg5, int arg6, int arg7) {
   }

   @OriginalMember(
      owner = "client!eg",
      name = "fa",
      descriptor = "(CIIIZ)V",
      line = 313
   )
   public final void method1066(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field1887.method2199(1);
      this.field1887.method2193(this.field1885, (byte)-19);
      if (!this.field1886 && !arg4) {
         this.field1887.method2212((byte)119, class453.field6943, class453.field6943);
      } else {
         this.field1887.method2212((byte)119, class453.field6943, class716.field10733);
         this.field1887.method2185((byte)-123, 0, class700.field10441);
         this.field1887.method2218(arg3, 22121);
      }

      class504 var6 = this.field1887.method2225(1);
      var6.method1542(arg1, arg2, 0);
      this.field1887.method2222(50);
      this.field1887.method1507(this.field1884, 0, (byte)15);
      this.field1887.method1502(this.field1887.field4259, 117);
      this.field1887.method1465(2, class145.field2065, arg0 * 4, 0);
      if (this.field1886 || arg4) {
         this.field1887.method2185((byte)-121, 0, class751.field11122);
      }

   }
}
