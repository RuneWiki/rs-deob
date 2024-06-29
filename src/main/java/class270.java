import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class270 {
   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "Law;"
   )
   private class82 field3775;
   @OriginalMember(
      owner = "client!fc",
      name = "j",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field3773;
   @OriginalMember(
      owner = "client!fc",
      name = "f",
      descriptor = "Lnj;"
   )
   private class256 field3766;
   @OriginalMember(
      owner = "client!fc",
      name = "h",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field3772;
   @OriginalMember(
      owner = "client!fc",
      name = "n",
      descriptor = "Lhd;"
   )
   private class773 field3770;
   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3778 = new String[]{method2092(method2091("i6tnf")), method2092(method2091("i6tif")), method2092(method2091("i6thf")), method2092(method2091("t{t\u00033")), method2092(method2091("a 6A")), method2092(method2091("i6tjf")), method2092(method2091("i6tof")), method2092(method2091("i6tkf")), method2092(method2091("i6tlf")), method2092(method2091("i6t\u0011'a<.\u0013f"))};
   @OriginalMember(
      owner = "client!fc",
      name = "m",
      descriptor = "[[I"
   )
   public static int[][] field3774 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!fc",
      name = "e",
      descriptor = "I"
   )
   public static int field3764;
   @OriginalMember(
      owner = "client!fc",
      name = "k",
      descriptor = "I"
   )
   public static int field3767;
   @OriginalMember(
      owner = "client!fc",
      name = "l",
      descriptor = "I"
   )
   public static int field3769;
   @OriginalMember(
      owner = "client!fc",
      name = "i",
      descriptor = "I"
   )
   public static int field3771;
   @OriginalMember(
      owner = "client!fc",
      name = "b",
      descriptor = "I"
   )
   public static int field3776;
   @OriginalMember(
      owner = "client!fc",
      name = "c",
      descriptor = "I"
   )
   public static int field3777;
   @OriginalMember(
      owner = "client!fc",
      name = "g",
      descriptor = "Ljj;"
   )
   private class128 field3765;
   @OriginalMember(
      owner = "client!fc",
      name = "d",
      descriptor = "[Lkia;"
   )
   private class646[] field3768;

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(I)Z",
      line = 6
   )
   public final boolean method2084(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3771;
         if (this.field3765 != null) {
            return true;
         } else {
            if (this.field3770 == null) {
               if (this.field3766.method1934((byte)-49)) {
                  return false;
               }

               this.field3770 = this.field3766.method1930(true, 0, 255, (byte)0, 255);
            }

            if (this.field3770.field341) {
               return false;
            } else {
               class128 var3 = new class128(this.field3770.method222(true));
               var3.field1590 = 5;
               int var4 = var3.method1104(255);
               var3.field1590 += var4 * 72;
               byte[] var5 = new byte[var3.field1552.length + -var3.field1590];
               if (arg0 != 20089) {
                  this.field3768 = null;
               }

               byte[] var6;
               label84: {
                  var3.method1102(var5.length, var5, 0, (byte)-126);
                  if (this.field3773 == null || this.field3772 == null) {
                     var6 = var5;
                     if (var2 == 0) {
                        break label84;
                     }
                  }

                  BigInteger var7 = new BigInteger(var5);
                  BigInteger var8 = var7.modPow(this.field3773, this.field3772);
                  var6 = var8.toByteArray();
               }

               if (var6.length != 65) {
                  throw new RuntimeException();
               } else {
                  byte[] var9 = class246.method1840(true, -var5.length + var3.field1590 + -5, var3.field1552, 5);
                  int var10 = 0;
                  if (var2 != 0) {
                     if (~var9[var10] != ~var6[var10 - -1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }

                  while(true) {
                     int var10000;
                     if (~var10 <= -65) {
                        this.field3765 = var3;
                        this.field3768 = new class646[var4];
                        var10000 = 1;
                        if (var2 == 0) {
                           return true;
                        }
                     } else {
                        var10000 = ~var9[var10];
                     }

                     if (var10000 != ~var6[var10 - -1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field3778[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "b",
      descriptor = "(I)V",
      line = 82
   )
   public static void method2085(int arg0) {
      try {
         field3774 = null;
         if (arg0 != 2) {
            method2085(67);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3778[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(Liw;BILiw;)Lkia;",
      line = 96
   )
   public final class646 method2086(class332 arg0, byte arg1, int arg2, class332 arg3) {
      try {
         if (arg1 != 90) {
            method2088(100, -73);
         }

         ++field3769;
         return this.method2087(arg0, arg2, true, arg3, true);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3778[8] + (arg0 != null ? field3778[3] : field3778[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3778[3] : field3778[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(Liw;IZLiw;Z)Lkia;",
      line = 108
   )
   private final class646 method2087(class332 arg0, int arg1, boolean arg2, class332 arg3, boolean arg4) {
      try {
         ++field3767;
         if (this.field3765 == null) {
            throw new RuntimeException();
         } else if (arg1 >= 0 && this.field3768.length > arg1) {
            if (this.field3768[arg1] != null) {
               return this.field3768[arg1];
            } else {
               this.field3765.field1590 = arg1 * 72 + 6;
               if (!arg4) {
                  this.field3773 = null;
               }

               int var6 = this.field3765.method1041(4758);
               int var7 = this.field3765.method1041(4758);
               byte[] var8 = new byte[64];
               this.field3765.method1102(64, var8, 0, (byte)-126);
               class646 var9 = new class646(arg1, arg0, arg3, this.field3766, this.field3775, var6, var8, var7, arg2);
               this.field3768[arg1] = var9;
               return var9;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3778[5] + (arg0 != null ? field3778[3] : field3778[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3778[3] : field3778[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(II)Loaa;",
      line = 153
   )
   public static final class302 method2088(int arg0, int arg1) {
      try {
         ++field3776;
         if (~arg1 != -1) {
            if (arg1 == 1) {
               return new class368();
            }

            if (~arg1 == -3) {
               return new class421();
            }

            if (~arg1 == -4) {
               return new class762();
            }

            if (arg1 == 4) {
               return new class528();
            }

            if (~arg1 == -6) {
               return new class489();
            }

            if (arg1 == 6) {
               return new class433();
            }

            if (~arg1 == -8) {
               return new class182();
            }

            if (~arg1 == -9) {
               return new class71();
            }

            if (~arg1 == -10) {
               return new class50();
            }

            if (~arg1 == -11) {
               return new class459();
            }

            if (~arg1 == -12) {
               return new class92();
            }

            if (~arg1 == -13) {
               return new class770();
            }

            if (~arg1 == -14) {
               return new class704();
            }

            if (~arg1 == -15) {
               return new class563();
            }

            if (~arg1 == -16) {
               return new class601();
            }

            if (arg1 == 16) {
               return new class573();
            }

            if (arg1 == 17) {
               return new class541();
            }

            if (arg1 == 18) {
               return new class747();
            }

            if (~arg1 == -20) {
               return new class569();
            }

            if (arg1 == 20) {
               return new class507();
            }

            if (arg1 == 21) {
               return new class672();
            }

            if (~arg1 == -23) {
               return new class587();
            }

            if (~arg1 == -24) {
               return new class405();
            }

            if (~arg1 == -25) {
               return new class140();
            }

            if (arg1 == 25) {
               return new class278();
            }

            if (arg1 == 26) {
               return new class790();
            }

            if (~arg1 == -28) {
               return new class416();
            }

            if (arg1 == 28) {
               return new class684();
            }

            if (~arg1 == -30) {
               return new class782();
            }

            if (arg1 == 30) {
               return new class685();
            }

            if (~arg1 == -32) {
               return new class56();
            }

            if (~arg1 == -33) {
               return new class589();
            }

            if (~arg1 == -34) {
               return new class42();
            }

            if (~arg1 == -35) {
               return new class309();
            }

            if (~arg1 == -36) {
               return new class240();
            }

            if (~arg1 == -37) {
               return new class35();
            }

            if (arg1 == 37) {
               return new class273();
            }

            if (~arg1 == -39) {
               return new class272();
            }

            if (arg1 != 39) {
               if (arg0 > -10) {
                  method2085(14);
               }

               return null;
            }

            if (client.field4530 == 0) {
               return new class149();
            }
         }

         return new class60();
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3778[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "b",
      descriptor = "(B)V",
      line = 471
   )
   public final void method2089(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(B)V",
      line = 509
   )
   public static final void method2090(byte arg0) {
      try {
         ++field3764;
         class201.field2535.method5680(true);
         if (arg0 != 16) {
            field3774 = null;
         }

         class437.field6676.method5162((byte)102);
         class593.field8746.method5162((byte)41);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3778[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "<init>",
      descriptor = "(Lnj;Law;Ljava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 524
   )
   public class270(class256 arg0, class82 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field3775 = arg1;
         this.field3773 = arg2;
         this.field3766 = arg0;
         this.field3772 = arg3;
         if (!this.field3766.method1934((byte)-49)) {
            this.field3770 = this.field3766.method1930(true, 0, 255, (byte)0, 255);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3778[9] + (arg0 != null ? field3778[3] : field3778[4]) + ',' + (arg1 != null ? field3778[3] : field3778[4]) + ',' + (arg2 != null ? field3778[3] : field3778[4]) + ',' + (arg3 != null ? field3778[3] : field3778[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2091(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2092(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
