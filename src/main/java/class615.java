import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class615 {
   @OriginalMember(
      owner = "client!oea",
      name = "p",
      descriptor = "Lkh;"
   )
   private class370 field9061;
   @OriginalMember(
      owner = "client!oea",
      name = "n",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field9054;
   @OriginalMember(
      owner = "client!oea",
      name = "c",
      descriptor = "Ltca;"
   )
   private class613 field9063;
   @OriginalMember(
      owner = "client!oea",
      name = "i",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field9057;
   @OriginalMember(
      owner = "client!oea",
      name = "o",
      descriptor = "Lbf;"
   )
   private class764 field9058;
   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9068 = new String[]{method4538(method4537("N\ncr0")), method4538(method4537("ZA,r\u000f\u001d")), method4538(method4537("[Q!0")), method4538(method4537("ZA,r\u000b\u001d")), method4538(method4537("ZA,r\u0005\u001d")), method4538(method4537("ZA,r\b\u001d")), method4538(method4537("ZA,r\f\u001d")), method4538(method4537("ZA,r\u000e\u001d")), method4538(method4537("ZA,r\n\u001d")), method4538(method4537("ZA,r\t\u001d")), method4538(method4537("ZA,rq\\J$(s\u001d"))};
   @OriginalMember(
      owner = "client!oea",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field9066 = new class6(36, -1);
   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "I"
   )
   public static int field9052;
   @OriginalMember(
      owner = "client!oea",
      name = "d",
      descriptor = "I"
   )
   public static int field9053;
   @OriginalMember(
      owner = "client!oea",
      name = "l",
      descriptor = "I"
   )
   public static int field9056;
   @OriginalMember(
      owner = "client!oea",
      name = "m",
      descriptor = "I"
   )
   public static int field9059;
   @OriginalMember(
      owner = "client!oea",
      name = "j",
      descriptor = "I"
   )
   public static int field9060;
   @OriginalMember(
      owner = "client!oea",
      name = "b",
      descriptor = "I"
   )
   public static int field9062;
   @OriginalMember(
      owner = "client!oea",
      name = "h",
      descriptor = "I"
   )
   public static int field9064;
   @OriginalMember(
      owner = "client!oea",
      name = "g",
      descriptor = "I"
   )
   public static int field9067;
   @OriginalMember(
      owner = "client!oea",
      name = "k",
      descriptor = "Lgea;"
   )
   private class66 field9055;
   @OriginalMember(
      owner = "client!oea",
      name = "f",
      descriptor = "[Ltja;"
   )
   private class496[] field9065;

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(Loca;ILpd;IIIILaa;)V"
   )
   public static final void method4529(class642 arg0, int arg1, class648 arg2, int arg3, int arg4, int arg5, int arg6, class87 arg7) {
      try {
         ++field9059;
         if (arg2 != null) {
            if (arg3 != 3903) {
               method4532(-34);
            }

            int var8;
            label45: {
               if (~class784.field11454 != -5) {
                  var8 = 16383 & (int)class623.field9202 - -class495.field6914;
                  if (!client.field1481) {
                     break label45;
                  }
               }

               var8 = 16383 & (int)class623.field9202;
            }

            int var9 = Math.max(arg0.field9629 / 2, arg0.field9572 / 2) - -10;
            int var10 = arg1 * arg1 + arg5 * arg5;
            if (var10 <= var9 * var9) {
               int var11 = class746.field10907[var8];
               int var12 = class746.field10897[var8];
               if (class784.field11454 != 4) {
                  var11 = var11 * 256 / (class391.field5419 + 256);
                  var12 = var12 * 256 / (class391.field5419 + 256);
               }

               int var13 = arg1 * var12 + arg5 * var11 >> 14;
               int var14 = arg5 * var12 - arg1 * var11 >> 14;
               arg2.method2398(arg4 - -(arg0.field9629 / 2) + var13 + -(arg2.method2406() / 2), arg0.field9572 / 2 + arg6 - var14 + -(arg2.method2396() / 2), arg7, arg4, arg6);
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field9068[5] + (arg0 != null ? field9068[0] : field9068[2]) + ',' + arg1 + ',' + (arg2 != null ? field9068[0] : field9068[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9068[0] : field9068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(ZLhd;ILhd;B)Ltja;"
   )
   private final class496 method4530(boolean arg0, class347 arg1, int arg2, class347 arg3, byte arg4) {
      try {
         ++field9053;
         if (this.field9055 == null) {
            throw new RuntimeException();
         } else if (arg2 >= 0 && this.field9065.length > arg2) {
            if (this.field9065[arg2] != null) {
               return this.field9065[arg2];
            } else {
               this.field9055.field864 = arg2 * 72 + 6;
               int var6 = this.field9055.method610(126);
               int var7 = this.field9055.method610(127);
               byte[] var8 = new byte[64];
               int var9 = 120 / ((arg4 - 18) / 61);
               this.field9055.method632(0, 64, (byte)35, var8);
               class496 var10 = new class496(arg2, arg1, arg3, this.field9061, this.field9063, var6, var8, var7, arg0);
               this.field9065[arg2] = var10;
               return var10;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field9068[4] + arg0 + ',' + (arg1 != null ? field9068[0] : field9068[2]) + ',' + arg2 + ',' + (arg3 != null ? field9068[0] : field9068[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(ILdja;)I"
   )
   public static final int method4531(int arg0, class45 arg1) {
      try {
         ++field9052;
         int var2 = -83 / ((26 - arg0) / 45);
         if (class519.field7274 != arg1) {
            if (class606.field8967 == arg1) {
               return 6408;
            } else if (class673.field9968 == arg1) {
               return 6406;
            } else if (class529.field7424 == arg1) {
               return 6409;
            } else if (class7.field88 != arg1) {
               if (class439.field5979 == arg1) {
                  return 6145;
               } else {
                  throw new IllegalStateException();
               }
            } else {
               return 6410;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9068[9] + arg0 + ',' + (arg1 != null ? field9068[0] : field9068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4532(int arg0) {
      try {
         int var1 = -117 % ((arg0 - 66) / 52);
         field9066 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9068[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4533(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(ILhd;ILhd;)Ltja;"
   )
   public final class496 method4534(int arg0, class347 arg1, int arg2, class347 arg3) {
      try {
         ++field9067;
         return arg2 > -54 ? null : this.method4530(true, arg1, arg0, arg3, (byte)83);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9068[1] + arg0 + ',' + (arg1 != null ? field9068[0] : field9068[2]) + ',' + arg2 + ',' + (arg3 != null ? field9068[0] : field9068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4535(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field9062;
         if (this.field9055 != null) {
            return true;
         } else if (!arg0) {
            return false;
         } else {
            if (this.field9058 == null) {
               if (this.field9061.method2917(-5508)) {
                  return false;
               }

               this.field9058 = this.field9061.method2927(255, (byte)0, true, 255, 0);
            }

            if (this.field9058.field11623) {
               return false;
            } else {
               class66 var3;
               int var4;
               byte[] var5;
               byte[] var8;
               label66: {
                  var3 = new class66(this.field9058.method4356(-2));
                  var3.field864 = 5;
                  var4 = var3.method640(255);
                  var3.field864 += var4 * 72;
                  var5 = new byte[var3.field859.length + -var3.field864];
                  var3.method632(0, var5.length, (byte)35, var5);
                  if (this.field9054 != null && this.field9057 != null) {
                     BigInteger var6 = new BigInteger(var5);
                     BigInteger var7 = var6.modPow(this.field9054, this.field9057);
                     var8 = var7.toByteArray();
                     if (!var2) {
                        break label66;
                     }
                  }

                  var8 = var5;
               }

               if (var8.length != 65) {
                  throw new RuntimeException();
               } else {
                  byte[] var9 = class673.method4925(8, var3.field859, -var5.length + var3.field864 + -5, 5);
                  int var10 = 0;
                  if (var2) {
                     if (var9[var10] != var8[var10 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }

                  while(true) {
                     byte var10000;
                     if (~var10 <= -65) {
                        this.field9055 = var3;
                        this.field9065 = new class496[var4];
                        var10000 = 1;
                        if (!var2) {
                           return true;
                        }
                     } else {
                        var10000 = var9[var10];
                     }

                     if (var10000 != var8[var10 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field9068[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method4536(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 117) {
            method4532(9);
         }

         ++field9056;
         return (arg0 & 544) == 544 | (arg0 & 24) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9068[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "<init>",
      descriptor = "(Lkh;Ltca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
   )
   public class615(class370 arg0, class613 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field9061 = arg0;
         this.field9054 = arg2;
         this.field9063 = arg1;
         this.field9057 = arg3;
         if (!this.field9061.method2917(-5508)) {
            this.field9058 = this.field9061.method2927(255, (byte)0, true, 255, 0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9068[10] + (arg0 != null ? field9068[0] : field9068[2]) + ',' + (arg1 != null ? field9068[0] : field9068[2]) + ',' + (arg2 != null ? field9068[0] : field9068[2]) + ',' + (arg3 != null ? field9068[0] : field9068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4537(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4538(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
