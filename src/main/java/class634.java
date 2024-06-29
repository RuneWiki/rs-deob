import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class634 {
   @OriginalMember(
      owner = "client!pe",
      name = "m",
      descriptor = "[I"
   )
   private int[] field9222;
   @OriginalMember(
      owner = "client!pe",
      name = "s",
      descriptor = "[I"
   )
   private int[] field9224;
   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9242 = new String[]{method4572(method4571("\f\u0004=\u001f")), method4572(method4571("\u0012\u0014\u007f:w")), method4572(method4571("\u0019_\u007f]\"")), method4572(method4571("\u0012\u0014\u007f7w")), method4572(method4571("\u0012\u0014\u007f6w")), method4572(method4571("\u0012\u0014\u007f0w")), method4572(method4571("\u0012\u0014\u007f2w")), method4572(method4571("\u0012\u0014\u007f;w")), method4572(method4571("\u0012\u0014\u007fO6\f\u0018%Mw")), method4572(method4571("\u0012\u0014\u007f1w")), method4572(method4571("\u0012\u0014\u007f5w")), method4572(method4571("\u0012\u0014\u007f4w")), method4572(method4571("\u0012\u0014\u007f9w"))};
   @OriginalMember(
      owner = "client!pe",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field9232 = new class101(131, -1);
   @OriginalMember(
      owner = "client!pe",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field9236 = false;
   @OriginalMember(
      owner = "client!pe",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field9239 = new int[4096];
   @OriginalMember(
      owner = "client!pe",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field9241 = new int[25];
   @OriginalMember(
      owner = "client!pe",
      name = "c",
      descriptor = "I"
   )
   private int field9223;
   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "I"
   )
   public static int field9225;
   @OriginalMember(
      owner = "client!pe",
      name = "p",
      descriptor = "I"
   )
   public static int field9226;
   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "I"
   )
   private int field9227;
   @OriginalMember(
      owner = "client!pe",
      name = "n",
      descriptor = "I"
   )
   public static int field9228;
   @OriginalMember(
      owner = "client!pe",
      name = "e",
      descriptor = "I"
   )
   public static int field9229;
   @OriginalMember(
      owner = "client!pe",
      name = "i",
      descriptor = "I"
   )
   private int field9230;
   @OriginalMember(
      owner = "client!pe",
      name = "j",
      descriptor = "I"
   )
   private int field9231;
   @OriginalMember(
      owner = "client!pe",
      name = "r",
      descriptor = "I"
   )
   public static int field9233;
   @OriginalMember(
      owner = "client!pe",
      name = "o",
      descriptor = "I"
   )
   public static int field9234;
   @OriginalMember(
      owner = "client!pe",
      name = "d",
      descriptor = "I"
   )
   public static int field9235;
   @OriginalMember(
      owner = "client!pe",
      name = "q",
      descriptor = "I"
   )
   public static int field9237;
   @OriginalMember(
      owner = "client!pe",
      name = "t",
      descriptor = "I"
   )
   public static int field9240;
   @OriginalMember(
      owner = "client!pe",
      name = "g",
      descriptor = "Lda;"
   )
   public static class67 field9238;

   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4561(byte arg0) {
      try {
         ++field9229;
         class403 var1 = class453.method3410(0L, true, 15);
         if (arg0 == -73) {
            var1.method3096((byte)102);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9242[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method4562(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field9228;
         int var3 = -1640531527;
         int var4 = -1640531527;
         int var5 = -1640531527;
         int var6 = -1640531527;
         int var7 = -1640531527;
         int var8 = -1640531527;
         int var9 = -1640531527;
         int var10 = -1640531527;
         int var11 = 0;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         if (var2 != 0) {
            var12 = var10 ^ var9 << 11;
            var13 = var7 + var12;
            var14 = var8 + var9;
            var15 = var14 ^ var8 >>> 2;
            var16 = var8 + var13;
            var17 = var6 + var15;
            var18 = var16 ^ var13 << 8;
            var19 = var13 + var17;
            var20 = var5 + var18;
            var7 = var19 ^ var17 >>> 16;
            var21 = var17 + var20;
            var22 = var4 + var7;
            var6 = var21 ^ var20 << 10;
            var23 = var20 + var22;
            var24 = var3 + var6;
            var5 = var23 ^ var22 >>> 4;
            var25 = var22 + var24;
            var26 = var5 + var12;
            var4 = var25 ^ var24 << 8;
            var27 = var24 + var26;
            var9 = var4 + var15;
            var3 = var27 ^ var26 >>> 9;
            var10 = var9 + var26;
            var8 = var3 + var18;
            ++var11;
         }

         while(true) {
            while(~var11 > -5) {
               var12 = var10 ^ var9 << 11;
               var13 = var7 + var12;
               var14 = var8 + var9;
               var15 = var14 ^ var8 >>> 2;
               var16 = var8 + var13;
               var17 = var6 + var15;
               var18 = var16 ^ var13 << 8;
               var19 = var13 + var17;
               var20 = var5 + var18;
               var7 = var19 ^ var17 >>> 16;
               var21 = var17 + var20;
               var22 = var4 + var7;
               var6 = var21 ^ var20 << 10;
               var23 = var20 + var22;
               var24 = var3 + var6;
               var5 = var23 ^ var22 >>> 4;
               var25 = var22 + var24;
               var26 = var5 + var12;
               var4 = var25 ^ var24 << 8;
               var27 = var24 + var26;
               var9 = var4 + var15;
               var3 = var27 ^ var26 >>> 9;
               var10 = var9 + var26;
               var8 = var3 + var18;
               ++var11;
            }

            var11 = 0;
            if (var2 == 0) {
               int var28;
               int var29;
               int var30;
               int var31;
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               int var39;
               int var40;
               int var41;
               int var42;
               int var43;
               int var44;
               int var45;
               int var46;
               int var47;
               int var48;
               int var49;
               int var50;
               int var51;
               if (var2 != 0) {
                  var28 = this.field9222[var11 - -6] + var4;
                  var29 = this.field9222[var11 - -3] + var7;
                  var30 = this.field9222[var11 + 1] + var9;
                  var31 = this.field9222[var11 + 2] + var8;
                  var32 = this.field9222[var11] + var10;
                  var33 = this.field9222[var11 + 5] + var5;
                  var34 = this.field9222[var11 + 7] + var3;
                  var35 = this.field9222[var11 - -4] + var6;
                  var36 = var32 ^ var30 << 11;
                  var37 = var29 + var36;
                  var38 = var30 + var31;
                  var39 = var38 ^ var31 >>> 2;
                  var40 = var35 + var39;
                  var41 = var31 + var37;
                  var42 = var41 ^ var37 << 8;
                  var43 = var33 + var42;
                  var44 = var37 + var40;
                  var7 = var44 ^ var40 >>> 16;
                  var45 = var7 + var28;
                  var46 = var40 + var43;
                  var6 = var46 ^ var43 << 10;
                  var47 = var43 + var45;
                  var48 = var6 + var34;
                  var5 = var47 ^ var45 >>> 4;
                  var49 = var5 + var36;
                  var50 = var45 + var48;
                  var4 = var50 ^ var48 << 8;
                  var9 = var4 + var39;
                  var51 = var48 + var49;
                  var3 = var51 ^ var49 >>> 9;
                  var10 = var9 + var49;
                  var8 = var3 + var42;
                  this.field9224[var11] = var10;
                  this.field9224[var11 + 1] = var9;
                  this.field9224[var11 + 2] = var8;
                  this.field9224[var11 + 3] = var7;
                  this.field9224[var11 + 4] = var6;
                  this.field9224[var11 + 5] = var5;
                  this.field9224[var11 - -6] = var4;
                  this.field9224[var11 + 7] = var3;
                  var11 += 8;
               }

               while(true) {
                  while(~var11 > -257) {
                     var28 = this.field9222[var11 - -6] + var4;
                     var29 = this.field9222[var11 - -3] + var7;
                     var30 = this.field9222[var11 + 1] + var9;
                     var31 = this.field9222[var11 + 2] + var8;
                     var32 = this.field9222[var11] + var10;
                     var33 = this.field9222[var11 + 5] + var5;
                     var34 = this.field9222[var11 + 7] + var3;
                     var35 = this.field9222[var11 - -4] + var6;
                     var36 = var32 ^ var30 << 11;
                     var37 = var29 + var36;
                     var38 = var30 + var31;
                     var39 = var38 ^ var31 >>> 2;
                     var40 = var35 + var39;
                     var41 = var31 + var37;
                     var42 = var41 ^ var37 << 8;
                     var43 = var33 + var42;
                     var44 = var37 + var40;
                     var7 = var44 ^ var40 >>> 16;
                     var45 = var7 + var28;
                     var46 = var40 + var43;
                     var6 = var46 ^ var43 << 10;
                     var47 = var43 + var45;
                     var48 = var6 + var34;
                     var5 = var47 ^ var45 >>> 4;
                     var49 = var5 + var36;
                     var50 = var45 + var48;
                     var4 = var50 ^ var48 << 8;
                     var9 = var4 + var39;
                     var51 = var48 + var49;
                     var3 = var51 ^ var49 >>> 9;
                     var10 = var9 + var49;
                     var8 = var3 + var42;
                     this.field9224[var11] = var10;
                     this.field9224[var11 + 1] = var9;
                     this.field9224[var11 + 2] = var8;
                     this.field9224[var11 + 3] = var7;
                     this.field9224[var11 + 4] = var6;
                     this.field9224[var11 + 5] = var5;
                     this.field9224[var11 - -6] = var4;
                     this.field9224[var11 + 7] = var3;
                     var11 += 8;
                  }

                  var11 = 0;
                  if (var2 == 0) {
                     int var52;
                     int var53;
                     int var54;
                     int var55;
                     int var56;
                     int var57;
                     int var58;
                     int var59;
                     int var60;
                     int var61;
                     int var62;
                     int var63;
                     int var64;
                     int var65;
                     int var66;
                     int var67;
                     int var68;
                     int var69;
                     int var70;
                     int var71;
                     int var72;
                     int var73;
                     int var74;
                     int var75;
                     if (var2 != 0) {
                        var52 = this.field9224[var11] + var10;
                        var53 = this.field9224[var11 - -7] + var3;
                        var54 = this.field9224[var11 + 1] + var9;
                        var55 = this.field9224[var11 + 2] + var8;
                        var56 = this.field9224[var11 - -3] + var7;
                        var57 = this.field9224[var11 + 6] + var4;
                        var58 = this.field9224[var11 - -5] + var5;
                        var59 = this.field9224[var11 + 4] + var6;
                        var60 = var52 ^ var54 << 11;
                        var61 = var54 + var55;
                        var62 = var56 + var60;
                        var63 = var61 ^ var55 >>> 2;
                        var64 = var59 + var63;
                        var65 = var55 + var62;
                        var66 = var65 ^ var62 << 8;
                        var67 = var58 + var66;
                        var68 = var62 + var64;
                        var7 = var68 ^ var64 >>> 16;
                        var69 = var7 + var57;
                        var70 = var64 + var67;
                        var6 = var70 ^ var67 << 10;
                        var71 = var67 + var69;
                        var72 = var6 + var53;
                        var5 = var71 ^ var69 >>> 4;
                        var73 = var5 + var60;
                        var74 = var69 + var72;
                        var4 = var74 ^ var72 << 8;
                        var9 = var4 + var63;
                        var75 = var72 + var73;
                        var3 = var75 ^ var73 >>> 9;
                        var8 = var3 + var66;
                        var10 = var73 + var9;
                        this.field9224[var11] = var10;
                        this.field9224[var11 + 1] = var9;
                        this.field9224[var11 + 2] = var8;
                        this.field9224[var11 + 3] = var7;
                        this.field9224[var11 + 4] = var6;
                        this.field9224[var11 + 5] = var5;
                        this.field9224[var11 + 6] = var4;
                        this.field9224[var11 + 7] = var3;
                        var11 += 8;
                     }

                     while(true) {
                        while(~var11 > -257) {
                           var52 = this.field9224[var11] + var10;
                           var53 = this.field9224[var11 - -7] + var3;
                           var54 = this.field9224[var11 + 1] + var9;
                           var55 = this.field9224[var11 + 2] + var8;
                           var56 = this.field9224[var11 - -3] + var7;
                           var57 = this.field9224[var11 + 6] + var4;
                           var58 = this.field9224[var11 - -5] + var5;
                           var59 = this.field9224[var11 + 4] + var6;
                           var60 = var52 ^ var54 << 11;
                           var61 = var54 + var55;
                           var62 = var56 + var60;
                           var63 = var61 ^ var55 >>> 2;
                           var64 = var59 + var63;
                           var65 = var55 + var62;
                           var66 = var65 ^ var62 << 8;
                           var67 = var58 + var66;
                           var68 = var62 + var64;
                           var7 = var68 ^ var64 >>> 16;
                           var69 = var7 + var57;
                           var70 = var64 + var67;
                           var6 = var70 ^ var67 << 10;
                           var71 = var67 + var69;
                           var72 = var6 + var53;
                           var5 = var71 ^ var69 >>> 4;
                           var73 = var5 + var60;
                           var74 = var69 + var72;
                           var4 = var74 ^ var72 << 8;
                           var9 = var4 + var63;
                           var75 = var72 + var73;
                           var3 = var75 ^ var73 >>> 9;
                           var8 = var3 + var66;
                           var10 = var73 + var9;
                           this.field9224[var11] = var10;
                           this.field9224[var11 + 1] = var9;
                           this.field9224[var11 + 2] = var8;
                           this.field9224[var11 + 3] = var7;
                           this.field9224[var11 + 4] = var6;
                           this.field9224[var11 + 5] = var5;
                           this.field9224[var11 + 6] = var4;
                           this.field9224[var11 + 7] = var3;
                           var11 += 8;
                        }

                        this.method4563(1020);
                        if (var2 == 0) {
                           if (arg0 <= 63) {
                              this.method4563(85);
                           }

                           this.field9223 = 256;
                           return;
                        }

                        var10 = arg0 + 63;
                        this.field9224[var11] = var10;
                        this.field9224[var11 + 1] = var9;
                        this.field9224[var11 + 2] = var8;
                        this.field9224[var11 + 3] = var7;
                        this.field9224[var11 + 4] = var6;
                        this.field9224[var11 + 5] = var5;
                        this.field9224[var11 + 6] = var4;
                        this.field9224[var11 + 7] = var3;
                        var11 += 8;
                     }
                  }

                  var11 += 8;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var77) {
         throw class670.method4877(var77, field9242[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method4563(int arg0) {
      int var2 = client.field4530;

      try {
         ++field9240;
         this.field9231 += ++this.field9230;
         if (arg0 != 1020) {
            method4567(55, -48, (class544)null, 50);
         }

         int var3 = 0;
         if (var2 != 0 || ~var3 > -257) {
            do {
               int var4;
               label55: {
                  var4 = this.field9224[var3];
                  if ((var3 & 2) != 0) {
                     if ((var3 & 1) != 0) {
                        this.field9227 >>>= 16;
                        if (var2 == 0) {
                           break label55;
                        }
                     }

                     this.field9227 <<= 2;
                     if (var2 == 0) {
                        break label55;
                     }
                  }

                  if (~(1 & var3) == -1) {
                     this.field9227 <<= 13;
                     if (var2 == 0) {
                        break label55;
                     }
                  }

                  this.field9227 >>>= 6;
               }

               this.field9227 += this.field9224[var3 + 128 & 255];
               int var5;
               this.field9224[var3] = var5 = this.field9227 + this.field9224[class153.method1262(var4, 1020) >> 2] + this.field9231;
               this.field9222[var3] = this.field9231 = var4 + this.field9224[class153.method1262(1020, var5 >> 8) >> 2];
               ++var3;
            } while(~var3 > -257);

         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9242[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(IIIIB)I"
   )
   public static final int method4564(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         if (arg4 != 53) {
            method4566(-44);
         }

         ++field9234;
         int var5 = -class689.field10391[arg0 * 8192 / arg3] + 65536 >> 1;
         return ((-var5 + 65536) * arg2 >> 16) + (arg1 * var5 >> 16);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9242[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4565(int arg0) {
      try {
         field9239 = null;
         if (arg0 != -15923) {
            method4566(18);
         }

         field9238 = null;
         field9241 = null;
         field9232 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9242[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4566(int arg0) {
      try {
         if (arg0 != 256) {
            field9238 = null;
         }

         class397.field6109 = "";
         class685.field10283 = "";
         ++field9225;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9242[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(IILhv;I)V"
   )
   public static final void method4567(int arg0, int arg1, class544 arg2, int arg3) {
      try {
         if (arg0 > -122) {
            field9236 = true;
         }

         ++field9226;
         class305.field4343 = arg3;
         class639.field9322 = arg1;
         class247.field3301 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9242[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9242[2] : field9242[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method4568(byte arg0) {
      try {
         if (arg0 != -14) {
            return -63;
         } else {
            if (this.field9223 == 0) {
               this.method4563(1020);
               this.field9223 = 256;
            }

            ++field9237;
            return this.field9222[--this.field9223];
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9242[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "()V"
   )
   private class634() {
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(IILkg;)V"
   )
   public static final void method4569(int arg0, int arg1, class284 arg2) {
      try {
         if (class445.field6769) {
            class445.field6769 = false;
            arg0 = 0;
         }

         ++field9233;
         if (arg1 != -16624) {
            method4567(102, -5, (class544)null, -42);
         }

         if (class334.field4779 == null || !class334.field4779.method2167(128, arg2)) {
            class334.field4779 = arg2;
            class55.field661 = class188.method1462(true);
            class774.field11327 = arg0;
            class502.field7462 = arg0;
            if (~class502.field7462 == -1) {
               class684.method4974(1);
               return;
            }

            class332.field4760 = class4.field76;
            class728.field10824 = class382.field5864;
            class748.field11094 = class748.field11090;
            class159.field2017 = class55.field648;
            class243.field3106 = class560.field8376;
            class181.field2250 = class175.field2171;
            class635.field9250 = class472.field7060;
            class102.field1252 = class442.field6743;
            class219.field2791 = class500.field7431;
            class566.field8433 = class155.field1969;
         }

      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9242[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9242[2] : field9242[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class634(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method4570(boolean arg0) {
      try {
         if (arg0) {
            this.method4570(false);
         }

         ++field9235;
         if (~this.field9223 == -1) {
            this.method4563(1020);
            this.field9223 = 256;
         }

         return this.field9222[this.field9223 + -1];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9242[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4571(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4572(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
