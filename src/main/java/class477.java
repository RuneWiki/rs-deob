import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class477 {
   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field7257;
   @OriginalMember(
      owner = "client!uja",
      name = "d",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field7258;
   @OriginalMember(
      owner = "client!uja",
      name = "g",
      descriptor = "Lgca;"
   )
   private class325 field7259;
   @OriginalMember(
      owner = "client!uja",
      name = "e",
      descriptor = "Lcaa;"
   )
   private class212 field7269;
   @OriginalMember(
      owner = "client!uja",
      name = "c",
      descriptor = "Leea;"
   )
   private class580 field7262;
   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7270 = new String[]{method3717(method3716("7\u00074\u001a\u001cj")), method3717(method3716("7\u00074\u001a\u0019j")), method3717(method3716(",\u00189X")), method3717(method3716("9C{\u001a ")), method3717(method3716("7\u00074\u001a\u001fj")), method3717(method3716("7\u00074\u001a\u001ej")), method3717(method3716("7\u00074\u001aa+\u0003<@cj")), method3717(method3716("7\u00074\u001a\u0018j"))};
   @OriginalMember(
      owner = "client!uja",
      name = "k",
      descriptor = "I"
   )
   public static int field7260;
   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "I"
   )
   public static int field7261;
   @OriginalMember(
      owner = "client!uja",
      name = "i",
      descriptor = "I"
   )
   public static int field7263;
   @OriginalMember(
      owner = "client!uja",
      name = "m",
      descriptor = "I"
   )
   public static int field7264;
   @OriginalMember(
      owner = "client!uja",
      name = "l",
      descriptor = "I"
   )
   public static int field7267;
   @OriginalMember(
      owner = "client!uja",
      name = "h",
      descriptor = "Lica;"
   )
   private class354 field7266;
   @OriginalMember(
      owner = "client!uja",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field7265;
   @OriginalMember(
      owner = "client!uja",
      name = "f",
      descriptor = "[Lnka;"
   )
   private class740[] field7268;

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(IIBI)I",
      line = 4
   )
   public static final int method3711(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field7261;
         if (arg2 != 0) {
            field7265 = true;
         }

         if (class385.field6076 == null) {
            return 0;
         } else {
            int var4 = arg1 >> 9;
            int var5 = arg3 >> 9;
            if (~var4 <= -1 && ~var5 <= -1 && var4 <= class513.field7828 + -1 && var5 <= class475.field7230 + -1) {
               int var6 = arg0;
               if (arg0 < 3 && (2 & class757.field11211[1][var4][var5]) != 0) {
                  var6 = arg0 + 1;
               }

               return class385.field6076[var6].method2312(arg1, arg3, arg2 + 104);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7270[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "(I)Z",
      line = 32
   )
   public final boolean method3712(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field7263;
         if (this.field7266 != null) {
            return true;
         } else {
            if (this.field7262 == null) {
               if (this.field7269.method1853((byte)126)) {
                  return false;
               }

               this.field7262 = this.field7269.method1842(255, -128, true, 255, (byte)0);
            }

            if (this.field7262.field8287) {
               return false;
            } else {
               class354 var4;
               int var5;
               byte[] var6;
               byte[] var9;
               label64: {
                  int var3 = 3 % ((arg0 - 13) / 40);
                  var4 = new class354(this.field7262.method2755(true));
                  var4.field5436 = 5;
                  var5 = var4.method2855(-31007);
                  var4.field5436 += var5 * 72;
                  var6 = new byte[var4.field5428.length - var4.field5436];
                  var4.method2859(var6, 0, false, var6.length);
                  if (this.field7257 != null && this.field7258 != null) {
                     BigInteger var7 = new BigInteger(var6);
                     BigInteger var8 = var7.modPow(this.field7257, this.field7258);
                     var9 = var8.toByteArray();
                     if (!var2) {
                        break label64;
                     }
                  }

                  var9 = var6;
               }

               if (~var9.length != -66) {
                  throw new RuntimeException();
               } else {
                  byte[] var10 = class738.method5423(var4.field5428, var4.field5436 + -5 - var6.length, -3436, 5);
                  int var11 = 0;
                  if (var2) {
                     if (~var10[var11] != ~var9[var11 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var11;
                  }

                  while(true) {
                     int var10000;
                     if (var11 >= 64) {
                        this.field7266 = var4;
                        this.field7268 = new class740[var5];
                        var10000 = 1;
                        if (!var2) {
                           return true;
                        }
                     } else {
                        var10000 = ~var10[var11];
                     }

                     if (var10000 != ~var9[var11 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var11;
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field7270[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(I)V",
      line = 119
   )
   public final void method3713(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(ZILlt;Llt;I)Lnka;",
      line = 155
   )
   private final class740 method3714(boolean arg0, int arg1, class11 arg2, class11 arg3, int arg4) {
      try {
         ++field7260;
         if (this.field7266 == null) {
            throw new RuntimeException();
         } else if (arg1 >= 0 && arg1 < this.field7268.length) {
            if (this.field7268[arg1] != null) {
               return this.field7268[arg1];
            } else {
               this.field7266.field5436 = arg1 * 72 + 6;
               int var6 = this.field7266.method2894(103);
               int var7 = this.field7266.method2894(111);
               byte[] var8 = new byte[64];
               if (arg4 >= -28) {
                  return null;
               } else {
                  this.field7266.method2859(var8, 0, false, 64);
                  class740 var9 = new class740(arg1, arg2, arg3, this.field7269, this.field7259, var6, var8, var7, arg0);
                  this.field7268[arg1] = var9;
                  return var9;
               }
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field7270[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7270[3] : field7270[2]) + ',' + (arg3 != null ? field7270[3] : field7270[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(IBLlt;Llt;)Lnka;",
      line = 198
   )
   public final class740 method3715(int arg0, byte arg1, class11 arg2, class11 arg3) {
      try {
         ++field7267;
         if (arg1 > -36) {
            this.method3712(42);
         }

         return this.method3714(true, arg0, arg2, arg3, -46);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7270[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7270[3] : field7270[2]) + ',' + (arg3 != null ? field7270[3] : field7270[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "<init>",
      descriptor = "(Lcaa;Lgca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 210
   )
   public class477(class212 arg0, class325 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field7257 = arg2;
         this.field7258 = arg3;
         this.field7259 = arg1;
         this.field7269 = arg0;
         if (!this.field7269.method1853((byte)124)) {
            this.field7262 = this.field7269.method1842(255, -97, true, 255, (byte)0);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7270[6] + (arg0 != null ? field7270[3] : field7270[2]) + ',' + (arg1 != null ? field7270[3] : field7270[2]) + ',' + (arg2 != null ? field7270[3] : field7270[2]) + ',' + (arg3 != null ? field7270[3] : field7270[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3716(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3717(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
