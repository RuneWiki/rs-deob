import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class211 {
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3201 = new String[]{method1840(method1839(".S2{U")), method1840(method1839(".S2xU")), method1840(method1839("\u0007NuU\u0019\u007f\u001b*\fD")), method1840(method1839("+NpU")), method1840(method1839("h\u0016\"\u0019")), method1840(method1839(".S2zU")), method1840(method1839(">\u00152\u0017\u0000"))};
   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "I"
   )
   public static int field3196 = -1;
   @OriginalMember(
      owner = "client!kh",
      name = "f",
      descriptor = "I"
   )
   public static int field3199 = 0;
   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "Let;"
   )
   public static class389 field3195 = new class389(16);
   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "I"
   )
   public static int field3200 = 0;
   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "I"
   )
   public static int field3197;
   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "I"
   )
   public static int field3198;

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1836(int arg0) {
      try {
         if (arg0 <= 56) {
            field3196 = 111;
         }

         field3195 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3201[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method1837(int arg0) {
      try {
         ++field3198;
         if (arg0 > -55) {
            field3196 = -33;
         }

         return class760.field11233;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3201[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method1838(class610 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field3197;
         int var3 = 0;
         int var4 = 0;
         if (class281.field4472) {
            var3 = class600.method4443(0);
            var4 = class218.method1890(0);
         }

         arg0.method629(var3, var4, class316.field4878 - -var3, var4 + 350);
         arg0.method631(var3, var4, class316.field4878, 350, 3351159 | class445.field6832 << 24, 1);
         if (arg1 == -8133) {
            int var6;
            int var10000;
            int var10001;
            label87: {
               class171.method1580(class316.field4878 + var3, var4 + 350, -23, var4, var3);
               int var5 = 350 / class93.field1330;
               if (~class276.field4408 < -1) {
                  label88: {
                     var6 = -class93.field1330 + -4 + 346;
                     int var7 = var5 * var6 / (class276.field4408 + var5 + -1);
                     int var8 = 4;
                     if (~class276.field4408 < -2) {
                        var8 += (class276.field4408 - 1 - class701.field10451) * (-var7 + var6) / (class276.field4408 - 1);
                     }

                     arg0.method631(var3 + -16 + class316.field4878, var4 + var8, 12, var7, class445.field6832 << 24 | 3351159, 2);
                     int var9 = class701.field10451;
                     if (!var2) {
                        if (~(class701.field10451 - -var5) >= ~var9) {
                           break label88;
                        }

                        var10000 = ~class276.field4408;
                        var10001 = ~var9;
                        if (var2) {
                           break label87;
                        }

                        if (var10000 >= var10001) {
                           break label88;
                        }
                     }

                     do {
                        String[] var10 = class9.method53(class168.field2568[var9], '\b', (byte)-103);
                        int var11 = (class316.field4878 - 24) / var10.length;
                        int var12 = 0;
                        if (var2 || var10.length > var12) {
                           do {
                              int var13 = 8 - -(var11 * var12);
                              arg0.method629(var3 + var13, var4, var3 - -var13 - -var11 + -8, var4 + 350);
                              class577.field8538.method2414(-class796.field11596 + -2 + var4 + 350 + -((-class701.field10451 + var9) * class93.field1330) + -class564.field8381.field10358, var3 + var13, class756.method5547(0, var10[var12]), true, -1, -16777216);
                              ++var12;
                           } while(var10.length > var12);
                        }

                        ++var9;
                        if (~(class701.field10451 - -var5) >= ~var9) {
                           break;
                        }

                        var10000 = ~class276.field4408;
                        var10001 = ~var9;
                        if (var2) {
                           break label87;
                        }
                     } while(var10000 < var10001);
                  }
               }

               class722.field10805.method2403(arg1 ^ 8089, class316.field4878 + -25 + var3, var4 + -20 - -350, -16777216, -1, field3201[2]);
               arg0.method629(var3, var4, class316.field4878 + var3, var4 + 350);
               arg0.method4498(-class796.field11596 + var4 + 350, var3, -1, arg1 + 8257, class316.field4878);
               class156.field2324.method2414(var4 + 350 + -1 + -class355.field5457.field10358, var3 + 10, field3201[4] + class756.method5547(0, class552.field8265), true, -1, -16777216);
               if (!class263.field4328) {
                  return;
               }

               var6 = -1;
               var10000 = class308.field4801 % 30;
               var10001 = 15;
            }

            if (var10000 > var10001) {
               var6 = 16777215;
            }

            arg0.method4492(var3 + 10 - -class355.field5457.method5130(true, field3201[4] + class756.method5547(0, class552.field8265).substring(0, class452.field6918)), var4 + 350 - 11 + -class355.field5457.field10358, 12, var6, (byte)-36);
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field3201[5] + (arg0 != null ? field3201[6] : field3201[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1839(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1840(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
