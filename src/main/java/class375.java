import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class375 {
   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5428 = new String[]{method2853(method2852("w\u000fHP1")), method2853(method2852("w\u000fHQ1")), method2853(method2852("w\u000fHT1")), method2853(method2852("w\u000fHR1")), method2853(method2852("r\u0017\ny")), method2853(method2852("w\u000fHW1")), method2853(method2852("gLH;d")), method2853(method2852("w\u000fHV1")), method2853(method2852("w\u000fHS1"))};
   @OriginalMember(
      owner = "client!km",
      name = "j",
      descriptor = "[J"
   )
   public static long[] field5418 = new long[32];
   @OriginalMember(
      owner = "client!km",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field5421 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!km",
      name = "b",
      descriptor = "F"
   )
   public static float field5420;
   @OriginalMember(
      owner = "client!km",
      name = "c",
      descriptor = "I"
   )
   public static int field5416;
   @OriginalMember(
      owner = "client!km",
      name = "i",
      descriptor = "I"
   )
   public static int field5417;
   @OriginalMember(
      owner = "client!km",
      name = "d",
      descriptor = "I"
   )
   public static int field5419;
   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "I"
   )
   private int field5422;
   @OriginalMember(
      owner = "client!km",
      name = "k",
      descriptor = "I"
   )
   public static int field5423;
   @OriginalMember(
      owner = "client!km",
      name = "h",
      descriptor = "I"
   )
   public int field5424;
   @OriginalMember(
      owner = "client!km",
      name = "g",
      descriptor = "I"
   )
   public static int field5425;
   @OriginalMember(
      owner = "client!km",
      name = "l",
      descriptor = "I"
   )
   public static int field5426;
   @OriginalMember(
      owner = "client!km",
      name = "f",
      descriptor = "I"
   )
   public static int field5427;
   @OriginalMember(
      owner = "client!km",
      name = "m",
      descriptor = "Lfe;"
   )
   public static class597 field5415;

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(ILnka;I)Z",
      line = 10
   )
   public static final boolean method2845(int arg0, class311 arg1, int arg2) {
      try {
         ++field5427;
         class628.field9223.method1227(arg1.field4274[arg0], arg1.field4265[arg0], arg1.field4271[arg0], class165.field2336);
         int var3 = class165.field2336[2];
         if (~var3 > -51) {
            return false;
         } else {
            arg1.field4267[arg0] = (short)(class165.field2336[0] * class253.field3450 / var3 + class778.field11407);
            if (arg2 != -13685) {
               field5418 = null;
            }

            arg1.field4264[arg0] = (short)(class165.field2336[1] * class433.field6212 / var3 + class610.field8958);
            arg1.field4263[arg0] = (short)var3;
            return true;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5428[5] + arg0 + ',' + (arg1 != null ? field5428[6] : field5428[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(IB)V",
      line = 33
   )
   public final void method2846(int arg0, byte arg1) {
      try {
         this.field5422 = 0;
         ++field5417;
         if (arg1 != -22) {
            method2845(108, (class311)null, -82);
         }

         this.field5424 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5428[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(I)I",
      line = 47
   )
   public final int method2847(int arg0) {
      try {
         ++field5416;
         return arg0 != 16383 ? -124 : 16383 & this.field5424;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5428[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "b",
      descriptor = "(I)V",
      line = 60
   )
   public final void method2848(int arg0) {
      try {
         ++field5423;
         this.field5424 &= arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5428[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(IIII)Z",
      line = 68
   )
   public final boolean method2849(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field5426;
         int var6 = this.field5422;
         if (this.field5424 == arg2 && ~this.field5422 == -1) {
            return false;
         } else {
            if (arg1 != -1) {
               this.field5422 = -90;
            }

            boolean var7;
            label155: {
               if (this.field5422 == 0) {
                  if (this.field5424 < arg2 && ~arg2 >= ~(this.field5424 + arg0) || this.field5424 > arg2 && -arg0 + this.field5424 <= arg2) {
                     this.field5424 = arg2;
                     return false;
                  }

                  var7 = true;
                  if (!var5) {
                     break label155;
                  }
               }

               if (~this.field5422 < -1 && ~arg2 < ~this.field5424) {
                  int var8 = this.field5422 * this.field5422 / (arg0 * 2);
                  int var9 = this.field5424 + var8;
                  if (var9 < arg2 && this.field5424 <= var9) {
                     var7 = true;
                     if (!var5) {
                        break label155;
                     }
                  }

                  var7 = false;
                  if (!var5) {
                     break label155;
                  }
               }

               if (this.field5422 < 0 && ~arg2 > ~this.field5424) {
                  int var10 = this.field5422 * this.field5422 / (arg0 * 2);
                  int var11 = this.field5424 - var10;
                  if (var11 > arg2 && ~this.field5424 <= ~var11) {
                     var7 = true;
                     if (!var5) {
                        break label155;
                     }
                  }

                  var7 = false;
                  if (!var5) {
                     break label155;
                  }
               }

               var7 = false;
            }

            label157: {
               if (var7) {
                  label111: {
                     if (~this.field5424 <= ~arg2) {
                        this.field5422 -= arg0;
                        if (~arg3 == -1 || ~this.field5422 <= ~(-arg3)) {
                           break label111;
                        }

                        this.field5422 = -arg3;
                        if (!var5) {
                           break label111;
                        }
                     }

                     this.field5422 += arg0;
                     if (arg3 != 0 && arg3 < this.field5422) {
                        this.field5422 = arg3;
                     }
                  }

                  if (this.field5422 == var6) {
                     break label157;
                  }

                  int var12 = this.field5422 * this.field5422 / (arg0 * 2);
                  if (this.field5424 >= arg2) {
                     if (this.field5424 <= arg2 || ~arg2 >= ~(-var12 + this.field5424)) {
                        break label157;
                     }

                     this.field5422 = var6;
                     if (!var5) {
                        break label157;
                     }
                  }

                  if (arg2 >= this.field5424 - -var12) {
                     break label157;
                  }

                  this.field5422 = var6;
                  if (!var5) {
                     break label157;
                  }
               }

               if (this.field5422 <= 0) {
                  this.field5422 += arg0;
                  if (this.field5422 <= 0) {
                     break label157;
                  }

                  this.field5422 = 0;
                  if (!var5) {
                     break label157;
                  }
               }

               this.field5422 -= arg0;
               if (~this.field5422 > -1) {
                  this.field5422 = 0;
               }
            }

            this.field5424 += this.field5422 + var6 >> 1;
            return var7;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field5428[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(B)V",
      line = 212
   )
   public static void method2850(byte arg0) {
      try {
         field5418 = null;
         field5421 = null;
         if (arg0 <= 96) {
            method2851(104, 67, -20);
         }

         field5415 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5428[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(III)Z",
      line = 225
   )
   public static final boolean method2851(int arg0, int arg1, int arg2) {
      try {
         ++field5419;
         if (arg2 > -119) {
            field5420 = 0.70761603F;
         }

         return ~(32 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5428[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2852(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2853(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
