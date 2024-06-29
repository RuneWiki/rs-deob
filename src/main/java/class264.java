import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class264 {
   @OriginalMember(
      owner = "client!iia",
      name = "q",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field4032;
   @OriginalMember(
      owner = "client!iia",
      name = "c",
      descriptor = "Lsv;"
   )
   private class648 field4036;
   @OriginalMember(
      owner = "client!iia",
      name = "e",
      descriptor = "Llda;"
   )
   private class355 field4030;
   @OriginalMember(
      owner = "client!iia",
      name = "g",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field4031;
   @OriginalMember(
      owner = "client!iia",
      name = "j",
      descriptor = "Lce;"
   )
   private class166 field4040;
   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4045 = new String[]{method2265(method2264("se\u001bs\u0011")), method2265(method2264("a\"Ts* ")), method2265(method2264("f>Y1")), method2265(method2264("a\"Ts. ")), method2265(method2264("a\"Ts) ")), method2265(method2264("a\"Ts( ")), method2265(method2264("a\"Ts- ")), method2265(method2264("a\"TsPa%\\)R ")), method2265(method2264("a\"Ts/ "))};
   @OriginalMember(
      owner = "client!iia",
      name = "o",
      descriptor = "S"
   )
   public static short field4038 = 1;
   @OriginalMember(
      owner = "client!iia",
      name = "l",
      descriptor = "Lhha;"
   )
   public static class724 field4039 = new class724(106, 6);
   @OriginalMember(
      owner = "client!iia",
      name = "n",
      descriptor = "Ljga;"
   )
   public static class91 field4042 = null;
   @OriginalMember(
      owner = "client!iia",
      name = "d",
      descriptor = "I"
   )
   public static int field4028;
   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "I"
   )
   public static int field4029;
   @OriginalMember(
      owner = "client!iia",
      name = "k",
      descriptor = "I"
   )
   public static int field4033;
   @OriginalMember(
      owner = "client!iia",
      name = "h",
      descriptor = "I"
   )
   public static int field4034;
   @OriginalMember(
      owner = "client!iia",
      name = "f",
      descriptor = "I"
   )
   public static int field4041;
   @OriginalMember(
      owner = "client!iia",
      name = "i",
      descriptor = "I"
   )
   public static int field4044;
   @OriginalMember(
      owner = "client!iia",
      name = "p",
      descriptor = "J"
   )
   public static long field4043;
   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "Lcu;"
   )
   private class65 field4035;
   @OriginalMember(
      owner = "client!iia",
      name = "m",
      descriptor = "[Ltq;"
   )
   private class560[] field4037;

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "([[BII[[B[B[II[I)I"
   )
   public static final int method2258(byte[][] arg0, int arg1, int arg2, byte[][] arg3, byte[] arg4, int[] arg5, int arg6, int[] arg7) {
      boolean var8 = client.field10022;

      try {
         ++field4034;
         int var9 = arg7[arg6];
         int var10 = arg5[arg6] + var9;
         int var11 = arg7[arg2];
         int var12 = arg5[arg2] + var11;
         int var13 = var9;
         if (var9 < var11) {
            var13 = var11;
         }

         int var14 = var10;
         if (~var12 > ~var10) {
            var14 = var12;
         }

         int var15 = 255 & arg4[arg6];
         if (~var15 < ~(arg1 & arg4[arg2])) {
            var15 = arg4[arg2] & 255;
         }

         byte[] var16 = arg3[arg6];
         byte[] var17 = arg0[arg2];
         int var18 = -var9 + var13;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8) {
            var21 = var16[var18++] - -var17[var19++];
            if (var21 < var15) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(~var20 > ~var14) {
               var21 = var16[var18++] - -var17[var19++];
               if (var21 < var15) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (!var8) {
               return var24;
            }

            var21 = var24;
            if (var21 < var15) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field4045[3] + (arg0 != null ? field4045[0] : field4045[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4045[0] : field4045[2]) + ',' + (arg4 != null ? field4045[0] : field4045[2]) + ',' + (arg5 != null ? field4045[0] : field4045[2]) + ',' + arg6 + ',' + (arg7 != null ? field4045[0] : field4045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(Lql;ZIILql;)Ltq;"
   )
   private final class560 method2259(class717 arg0, boolean arg1, int arg2, int arg3, class717 arg4) {
      try {
         ++field4028;
         if (this.field4035 == null) {
            throw new RuntimeException();
         } else if (~arg2 <= -1 && ~arg2 > ~this.field4037.length) {
            if (this.field4037[arg2] != null) {
               return this.field4037[arg2];
            } else {
               this.field4035.field945 = arg2 * 72 - -6;
               int var6 = this.field4035.method701(255);
               int var7 = this.field4035.method701(255);
               byte[] var8 = new byte[arg3];
               this.field4035.method678(64, -32768, 0, var8);
               class560 var9 = new class560(arg2, arg4, arg0, this.field4036, this.field4030, var6, var8, var7, arg1);
               this.field4037[arg2] = var9;
               return var9;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field4045[1] + (arg0 != null ? field4045[0] : field4045[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4045[0] : field4045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2260(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field4029;
         if (this.field4035 != null) {
            return true;
         } else {
            if (this.field4040 == null) {
               if (this.field4036.method4723(true)) {
                  return false;
               }

               this.field4040 = this.field4036.method4727(255, (byte)-105, 255, true, (byte)0);
            }

            if (this.field4040.field6490) {
               return false;
            } else {
               class65 var3;
               int var4;
               byte[] var5;
               byte[] var6;
               label84: {
                  var3 = new class65(this.field4040.method552(arg0 ^ -83));
                  var3.field945 = 5;
                  var4 = var3.method665(false);
                  var3.field945 += var4 * 72;
                  var5 = new byte[var3.field942.length - var3.field945];
                  var3.method678(var5.length, -32768, 0, var5);
                  if (this.field4032 == null || this.field4031 == null) {
                     var6 = var5;
                     if (!var2) {
                        break label84;
                     }
                  }

                  BigInteger var7 = new BigInteger(var5);
                  BigInteger var8 = var7.modPow(this.field4032, this.field4031);
                  var6 = var8.toByteArray();
               }

               if (var6.length != 65) {
                  throw new RuntimeException();
               } else {
                  if (arg0 != -83) {
                     this.method2263(69, (byte)15, (class717)null, (class717)null);
                  }

                  byte[] var9 = class36.method414(0, 5, var3.field942, -var5.length + var3.field945 - 5);
                  int var10 = 0;
                  if (var2) {
                     if (var9[var10] != var6[var10 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }

                  while(true) {
                     byte var10000;
                     if (var10 >= 64) {
                        this.field4035 = var3;
                        this.field4037 = new class560[var4];
                        var10000 = 1;
                        if (!var2) {
                           return true;
                        }
                     } else {
                        var10000 = var9[var10];
                     }

                     if (var10000 != var6[var10 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field4045[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2261(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2262(int arg0) {
      try {
         field4039 = null;
         field4042 = null;
         if (arg0 < 74) {
            method2262(83);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4045[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(IBLql;Lql;)Ltq;"
   )
   public final class560 method2263(int arg0, byte arg1, class717 arg2, class717 arg3) {
      try {
         ++field4044;
         if (arg1 >= -18) {
            this.field4031 = null;
         }

         return this.method2259(arg2, true, arg0, 64, arg3);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4045[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4045[0] : field4045[2]) + ',' + (arg3 != null ? field4045[0] : field4045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "<init>",
      descriptor = "(Lsv;Llda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
   )
   public class264(class648 arg0, class355 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field4032 = arg2;
         this.field4036 = arg0;
         this.field4030 = arg1;
         this.field4031 = arg3;
         if (!this.field4036.method4723(true)) {
            this.field4040 = this.field4036.method4727(255, (byte)-127, 255, true, (byte)0);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4045[7] + (arg0 != null ? field4045[0] : field4045[2]) + ',' + (arg1 != null ? field4045[0] : field4045[2]) + ',' + (arg2 != null ? field4045[0] : field4045[2]) + ',' + (arg3 != null ? field4045[0] : field4045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2264(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2265(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
