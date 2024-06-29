import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class448 {
   @OriginalMember(
      owner = "client!q",
      name = "n",
      descriptor = "Lfg;"
   )
   private class139 field6532;
   @OriginalMember(
      owner = "client!q",
      name = "f",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field6544;
   @OriginalMember(
      owner = "client!q",
      name = "l",
      descriptor = "Lkh;"
   )
   private class17 field6541;
   @OriginalMember(
      owner = "client!q",
      name = "i",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field6533;
   @OriginalMember(
      owner = "client!q",
      name = "d",
      descriptor = "Lgf;"
   )
   private class290 field6531;
   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6549 = new String[]{method3381(method3380("~=k\t")), method3381(method3380("~=m\t")), method3381(method3380("~=o\t")), method3381(method3380("~=j\t")), method3381(method3380("t=\u0006\u000f\r")), method3381(method3380("afDM")), method3381(method3380("~=i\t")), method3381(method3380("~=\u0014H\u001efg\u0016\t")), method3381(method3380("~=`\t")), method3381(method3380("~=n\t")), method3381(method3380("~=l\t"))};
   @OriginalMember(
      owner = "client!q",
      name = "m",
      descriptor = "[Lnba;"
   )
   public static class313[] field6538 = new class313[100];
   @OriginalMember(
      owner = "client!q",
      name = "h",
      descriptor = "Lrf;"
   )
   public static class91 field6540 = null;
   @OriginalMember(
      owner = "client!q",
      name = "r",
      descriptor = "I"
   )
   public static int field6530;
   @OriginalMember(
      owner = "client!q",
      name = "e",
      descriptor = "I"
   )
   public static int field6534;
   @OriginalMember(
      owner = "client!q",
      name = "o",
      descriptor = "I"
   )
   public static int field6535;
   @OriginalMember(
      owner = "client!q",
      name = "p",
      descriptor = "I"
   )
   public static int field6536;
   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "I"
   )
   public static int field6537;
   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "I"
   )
   public static int field6543;
   @OriginalMember(
      owner = "client!q",
      name = "j",
      descriptor = "I"
   )
   public static int field6546;
   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "Luda;"
   )
   private class473 field6545;
   @OriginalMember(
      owner = "client!q",
      name = "k",
      descriptor = "[Ltd;"
   )
   public static class476[] field6547;
   @OriginalMember(
      owner = "client!q",
      name = "s",
      descriptor = "[Lhia;"
   )
   private class72[] field6539;
   @OriginalMember(
      owner = "client!q",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field6542;
   @OriginalMember(
      owner = "client!q",
      name = "q",
      descriptor = "[[Lek;"
   )
   public static class531[][] field6548;

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(B)Z",
      line = 7
   )
   public final boolean method3371(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field6536;
         if (arg0 != -104) {
            this.method3374((class653)null, true, -40, (class653)null, -80);
         }

         if (this.field6545 != null) {
            return true;
         } else {
            if (this.field6531 == null) {
               if (this.field6532.method1296(0)) {
                  return false;
               }

               this.field6531 = this.field6532.method1304(255, true, 255, (byte)-23, (byte)0);
            }

            if (this.field6531.field6322) {
               return false;
            } else {
               class473 var3;
               int var4;
               byte[] var5;
               byte[] var8;
               label66: {
                  var3 = new class473(this.field6531.method1091(0));
                  var3.field6907 = 5;
                  var4 = var3.method3564((byte)-91);
                  var3.field6907 += var4 * 72;
                  var5 = new byte[var3.field6889.length + -var3.field6907];
                  var3.method3562(0, var5, -114, var5.length);
                  if (this.field6533 != null && this.field6544 != null) {
                     BigInteger var6 = new BigInteger(var5);
                     BigInteger var7 = var6.modPow(this.field6533, this.field6544);
                     var8 = var7.toByteArray();
                     if (!var2) {
                        break label66;
                     }
                  }

                  var8 = var5;
               }

               if (~var8.length != -66) {
                  throw new RuntimeException();
               } else {
                  byte[] var9 = class196.method1696(var3.field6907 - 5 + -var5.length, var3.field6889, 5, 0);
                  int var10 = 0;
                  if (var2) {
                     if (var9[var10] != var8[var10 - -1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }

                  while(true) {
                     byte var10000;
                     if (var10 >= 64) {
                        this.field6545 = var3;
                        this.field6539 = new class72[var4];
                        var10000 = 1;
                        if (!var2) {
                           return true;
                        }
                     } else {
                        var10000 = var9[var10];
                     }

                     if (var10000 != var8[var10 - -1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field6549[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "(II)V",
      line = 82
   )
   public static final void method3372(int arg0, int arg1) {
      try {
         ++field6530;
         class536 var2 = class108.method1038((long)arg1, 84, 11);
         var2.method4013((byte)126);
         if (arg0 != -11977) {
            method3376(126, 46, 90);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6549[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(I)V",
      line = 96
   )
   public final void method3373(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(Ltq;ZILtq;I)Lhia;",
      line = 133
   )
   private final class72 method3374(class653 arg0, boolean arg1, int arg2, class653 arg3, int arg4) {
      try {
         ++field6546;
         if (this.field6545 == null) {
            throw new RuntimeException();
         } else if (arg4 >= 0 && arg4 < this.field6539.length) {
            if (this.field6539[arg4] != null) {
               return this.field6539[arg4];
            } else {
               this.field6545.field6907 = arg4 * 72 + 6;
               int var6 = this.field6545.method3567(31871);
               int var7 = this.field6545.method3567(31871);
               byte[] var8 = new byte[arg2];
               this.field6545.method3562(0, var8, -109, 64);
               class72 var9 = new class72(arg4, arg0, arg3, this.field6532, this.field6541, var6, var8, var7, arg1);
               this.field6539[arg4] = var9;
               return var9;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6549[6] + (arg0 != null ? field6549[4] : field6549[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6549[4] : field6549[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(IBI)V",
      line = 179
   )
   public static final void method3375(int arg0, byte arg1, int arg2) {
      try {
         ++field6537;
         if (arg1 < 46) {
            method3377(36);
         }

         class536 var3 = class108.method1038((long)arg2 | (long)arg0 << 32, 27, 19);
         var3.method4013((byte)126);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6549[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(III)V",
      line = 194
   )
   public static final void method3376(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      if (var3 != null) {
         class428.method3232(var3.field8658);
         class428.method3232(var3.field8660);
         if (var3.field8658 != null) {
            var3.field8658 = null;
         }

         if (var3.field8660 != null) {
            var3.field8660 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "(I)V",
      line = 212
   )
   public static void method3377(int arg0) {
      try {
         field6538 = null;
         field6542 = null;
         if (arg0 != 1412) {
            method3372(0, 62);
         }

         field6548 = null;
         field6547 = null;
         field6540 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6549[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(II)Lpq;",
      line = 229
   )
   public static final class203 method3378(int arg0, int arg1) {
      try {
         ++field6534;
         if (class660.field9613 && ~arg1 <= ~class36.field888 && class262.field3733 >= arg1) {
            if (arg0 != -1) {
               field6542 = null;
            }

            return class604.field8700[-class36.field888 + arg1];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6549[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(ILtq;ILtq;)Lhia;",
      line = 244
   )
   public final class72 method3379(int arg0, class653 arg1, int arg2, class653 arg3) {
      try {
         ++field6535;
         return arg2 >= -5 ? null : this.method3374(arg1, true, 64, arg3, arg0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6549[9] + arg0 + ',' + (arg1 != null ? field6549[4] : field6549[5]) + ',' + arg2 + ',' + (arg3 != null ? field6549[4] : field6549[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "<init>",
      descriptor = "(Lfg;Lkh;Ljava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 263
   )
   public class448(class139 arg0, class17 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field6532 = arg0;
         this.field6544 = arg3;
         this.field6541 = arg1;
         this.field6533 = arg2;
         if (!this.field6532.method1296(0)) {
            this.field6531 = this.field6532.method1304(255, true, 255, (byte)-23, (byte)0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6549[7] + (arg0 != null ? field6549[4] : field6549[5]) + ',' + (arg1 != null ? field6549[4] : field6549[5]) + ',' + (arg2 != null ? field6549[4] : field6549[5]) + ',' + (arg3 != null ? field6549[4] : field6549[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3380(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3381(char[] arg0) {
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
            var10005 = 19;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
