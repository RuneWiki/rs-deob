import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class136 implements class160 {
   @OriginalMember(
      owner = "client!di",
      name = "r",
      descriptor = "Lwga;"
   )
   private class779 field1741;
   @OriginalMember(
      owner = "client!di",
      name = "c",
      descriptor = "Leaa;"
   )
   private class526 field1740;
   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "Leaa;"
   )
   private class526 field1739;
   @OriginalMember(
      owner = "client!di",
      name = "p",
      descriptor = "I"
   )
   private int field1738;
   @OriginalMember(
      owner = "client!di",
      name = "g",
      descriptor = "[Lwt;"
   )
   private class327[] field1732;
   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1746 = new String[]{method1170(method1169("\u0004ai\u0007\\")), method1170(method1169("\u0004ai\u0005\\")), method1170(method1169("\u0004ai\u0003\\")), method1170(method1169("\u0004ai\u0006\\")), method1170(method1169("\u000e}+-")), method1170(method1169("\u001b&io\t")), method1170(method1169("\u0004ai\u0002\\")), method1170(method1169("\u0004ai\b\\")), method1170(method1169("\u0004ai\u0004\\")), method1170(method1169("\u0004ai\u0000\\")), method1170(method1169("\u0004ai\u000b\\")), method1170(method1169("\u0004ai}\u001d\u000ea3\u007f\\")), method1170(method1169("\u0004ai\t\\")), method1170(method1169("\u0004ai\n\\"))};
   @OriginalMember(
      owner = "client!di",
      name = "f",
      descriptor = "[J"
   )
   public static long[] field1729 = new long[11];
   @OriginalMember(
      owner = "client!di",
      name = "k",
      descriptor = "[[J"
   )
   public static long[][] field1735 = new long[8][256];
   @OriginalMember(
      owner = "client!di",
      name = "n",
      descriptor = "I"
   )
   public static int field1728;
   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "I"
   )
   public static int field1730;
   @OriginalMember(
      owner = "client!di",
      name = "i",
      descriptor = "I"
   )
   public static int field1731;
   @OriginalMember(
      owner = "client!di",
      name = "j",
      descriptor = "I"
   )
   public static int field1733;
   @OriginalMember(
      owner = "client!di",
      name = "o",
      descriptor = "I"
   )
   public static int field1734;
   @OriginalMember(
      owner = "client!di",
      name = "e",
      descriptor = "I"
   )
   public static int field1736;
   @OriginalMember(
      owner = "client!di",
      name = "l",
      descriptor = "I"
   )
   public static int field1737;
   @OriginalMember(
      owner = "client!di",
      name = "q",
      descriptor = "I"
   )
   public static int field1742;
   @OriginalMember(
      owner = "client!di",
      name = "d",
      descriptor = "I"
   )
   public static int field1743;
   @OriginalMember(
      owner = "client!di",
      name = "m",
      descriptor = "I"
   )
   public static int field1745;
   @OriginalMember(
      owner = "client!di",
      name = "h",
      descriptor = "[[Lhv;"
   )
   public static class544[][] field1744;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         char var3 = method1170(method1169("ᡃ웠蟿Ď㛒튕祧鄕惽鯺ꍬ笽ᶧ힃⸿︷ᕿ㞢龱䪮墩⤂뇧毄봩႔쬶Ԡ\ue466䇿ꜝ闐ﮩ簧\udd63䟾쨥뽀괛荇换꩹졞䦘\uf297寨騮㋷\ue94e헴뺭㑀］逞“ᫎ둜鍥撰獦䁨쏤\udbe6赼靴콋皊활뗮樤䖓ョ㼒ꊫ旎⾠\ude14ﴊ鈴۾늆ท抓꣗鈴┹葺㤋帹㣸퇅\ue269덦鱟䎳ﱤ冑浊爵繐㯋츙載랪㳵钗뤛Ⲕ\ue72f쑷嘤羡⫼섒\udc7f鴌ㅼ\uf601곈ᒕᙚ椁烱킬찶飄⡔\uf8c1")).charAt(var0 / 2);
         long var4 = (long)(~(var0 & 1) != -1 ? 255 & var3 : var3 >>> 8);
         long var6 = var4 << 1;
         if (~var6 <= -257L) {
            var6 ^= 285L;
         }

         long var8 = var6 << 1;
         if (var8 >= 256L) {
            var8 ^= 285L;
         }

         long var10 = var8 ^ var4;
         long var12 = var8 << 1;
         if (var12 >= 256L) {
            var12 ^= 285L;
         }

         long var14 = var12 ^ var4;
         field1735[0][var0] = class413.method3153(var14, class413.method3153(class413.method3153(class413.method3153(var12 << 24, class413.method3153(var4 << 32, class413.method3153(class413.method3153(var4 << 48, var4 << 56), var8 << 40))), var10 << 16), var6 << 8));

         for(int var16 = 1; var16 < 8; ++var16) {
            field1735[var16][var0] = class413.method3153(field1735[var16 + -1][var0] << 56, field1735[var16 + -1][var0] >>> 8);
         }
      }

      field1729[0] = 0L;

      for(int var1 = 1; ~var1 >= -11; ++var1) {
         int var2 = (var1 - 1) * 8;
         field1729[var1] = class352.method2750(class118.method983(255L, field1735[7][var2 + 7]), class352.method2750(class118.method983(field1735[6][var2 + 6], 65280L), class352.method2750(class352.method2750(class118.method983(4278190080L, field1735[4][var2 - -4]), class352.method2750(class352.method2750(class118.method983(field1735[2][var2 - -2], 280375465082880L), class352.method2750(class118.method983(field1735[0][var2], -72057594037927936L), class118.method983(71776119061217280L, field1735[1][var2 + 1]))), class118.method983(field1735[3][var2 + 3], 1095216660480L))), class118.method983(16711680L, field1735[5][var2 - -5]))));
      }

   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(BI)Laja;",
      line = 3
   )
   private final class98 method1158(byte arg0, int arg1) {
      try {
         ++field1728;
         class70 var3 = this.field1741.method5607((byte)71, (long)arg1);
         if (var3 != null) {
            return (class98)var3;
         } else {
            byte[] var4 = this.field1739.method3888((byte)40, arg1);
            if (var4 == null) {
               return null;
            } else {
               class98 var5 = new class98(new class128(var4));
               if (arg0 > -37) {
                  return null;
               } else {
                  this.field1741.method5610(0, (long)arg1, var5);
                  return var5;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1746[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "(II)Lwt;",
      line = 29
   )
   public final class327 method1159(int arg0, int arg1) {
      try {
         if (arg1 <= 121) {
            this.field1740 = null;
         }

         ++field1745;
         return this.field1732[arg0];
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1746[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "(I)V",
      line = 40
   )
   public static void method1160(int arg0) {
      try {
         field1735 = null;
         field1729 = null;
         field1744 = null;
         if (arg0 != 19722) {
            method1161(false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1746[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(Z)V",
      line = 52
   )
   public static final void method1161(boolean arg0) {
      try {
         label20: {
            if (~class102.field1243 >= -2) {
               class261.field3566.method4677(class261.field3566.field9433, 77, 2);
               if (client.field4530 == 0) {
                  break label20;
               }
            }

            class261.field3566.method4677(class261.field3566.field9433, 76, 4);
         }

         if (!arg0) {
            field1744 = null;
         }

         ++field1733;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1746[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(I)I",
      line = 78
   )
   public final int method1162(int arg0) {
      try {
         if (arg0 != 27176) {
            this.method1164(70, 34, true, -24, 45, -1.7681866F);
         }

         ++field1743;
         return this.field1738;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1746[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;",
      line = 91
   )
   public static final String[] method1163(char arg0, String arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field1736;
         int var4 = class477.method3536((byte)117, arg0, arg1);
         String[] var5 = new String[var4 + 1];
         int var6 = 0;
         if (arg2 <= 83) {
            return null;
         } else {
            int var7 = 0;
            int var8 = 0;
            int var9;
            if (var3 != 0) {
               var9 = var7;
               if (var3 != 0) {
                  var9 = var7 + 1;
               }
            } else {
               if (var8 >= var4) {
                  var5[var4] = arg1.substring(var7);
                  return var5;
               }

               var9 = var7;
               if (var3 != 0) {
                  var9 = var7 + 1;
               }
            }

            while(true) {
               while(arg1.charAt(var9) != arg0) {
                  ++var9;
               }

               var5[var6++] = arg1.substring(var7, var9);
               var7 = var9 + 1;
               ++var8;
               if (var8 >= var4) {
                  var5[var4] = arg1.substring(var7);
                  return var5;
               }

               var9 = var7;
               if (var3 != 0) {
                  var9 = var7 + 1;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1746[3] + arg0 + ',' + (arg1 != null ? field1746[5] : field1746[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(IIZIIF)[F",
      line = 127
   )
   public final float[] method1164(int arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5) {
      try {
         ++field1731;
         if (arg1 != 7795) {
            this.field1739 = null;
         }

         return this.method1158((byte)-106, arg0).method860(this.field1732[arg0].field4648, (byte)117, arg4, this, this.field1740, arg3);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1746[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(II)Z",
      line = 145
   )
   public final boolean method1165(int arg0, int arg1) {
      try {
         ++field1742;
         if (arg1 != -23239) {
            return false;
         } else {
            class98 var3 = this.method1158((byte)-87, arg0);
            return var3 != null && var3.method861(true, this, this.field1740);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1746[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(BFIIZI)[I",
      line = 167
   )
   public final int[] method1166(byte arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
      try {
         if (arg0 != 89) {
            return null;
         } else {
            ++field1734;
            return this.method1158((byte)-128, arg5).method863(this.field1740, arg0 ^ -6635, this.field1732[arg5].field4648, arg4, arg2, (double)arg1, this, arg3);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1746[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "c",
      descriptor = "(I)V",
      line = 244
   )
   public static final void method1167(int arg0) {
      try {
         ++field1737;
         ++class394.field5979;
         class180 var1 = class486.method3603(class32.field352, (byte)-93, class48.field583);
         if (arg0 != 1586) {
            field1744 = null;
         }

         var1.field2211.method1085(0, (byte)-11);
         class763.method5527(false, var1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1746[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(FZIIII)[I",
      line = 259
   )
   public final int[] method1168(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field1730;
         if (arg3 != 24521) {
            this.field1732 = null;
         }

         return this.method1158((byte)-95, arg4).method859(this, (double)arg0, arg5, -124, this.field1732[arg4].field4648, arg2, this.field1740);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1746[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Leaa;)V",
      line = 272
   )
   public class136(class526 param1, class526 param2, class526 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1169(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1170(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
