import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class550 extends class555 {
   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7517 = new String[]{method3978(method3977("aY\u001c\u000f]")), method3978(method3977("aY\u001c\f]")), method3978(method3977("aY\u001c\r]")), method3978(method3977("aY\u001c\u000b]")), method3978(method3977("aY\u001c\n]")), method3978(method3977("aY\u001cr\u001clRFp]")), method3978(method3977("lN^\"")), method3978(method3977("y\u0015\u001c`\b")), method3978(method3977("aY\u001c\b]")), method3978(method3977("aY\u001c\t]")), method3978(method3977("aY\u001c\u0006]"))};
   @OriginalMember(
      owner = "client!cb",
      name = "i",
      descriptor = "Lol;"
   )
   public static class300 field7513 = new class300();
   @OriginalMember(
      owner = "client!cb",
      name = "g",
      descriptor = "[J"
   )
   public static long[] field7515 = new long[11];
   @OriginalMember(
      owner = "client!cb",
      name = "m",
      descriptor = "[[J"
   )
   public static long[][] field7514 = new long[8][256];
   @OriginalMember(
      owner = "client!cb",
      name = "l",
      descriptor = "I"
   )
   public static int field7506;
   @OriginalMember(
      owner = "client!cb",
      name = "k",
      descriptor = "I"
   )
   public static int field7507;
   @OriginalMember(
      owner = "client!cb",
      name = "n",
      descriptor = "I"
   )
   public static int field7508;
   @OriginalMember(
      owner = "client!cb",
      name = "h",
      descriptor = "I"
   )
   public static int field7509;
   @OriginalMember(
      owner = "client!cb",
      name = "o",
      descriptor = "I"
   )
   public static int field7510;
   @OriginalMember(
      owner = "client!cb",
      name = "f",
      descriptor = "I"
   )
   public static int field7511;
   @OriginalMember(
      owner = "client!cb",
      name = "p",
      descriptor = "I"
   )
   public static int field7512;
   @OriginalMember(
      owner = "client!cb",
      name = "j",
      descriptor = "[Lvja;"
   )
   public static class290[] field7516;

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field7507;
         super.field7632 = arg0;
         class480.method3498(super.field7632, -101);
         int var3 = -69 / ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7517[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method3973(byte arg0) {
      try {
         if (arg0 >= -61) {
            field7514 = null;
         }

         ++field7511;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7517[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3974(byte arg0, int arg1) {
      try {
         ++field7512;
         if (~arg1 != -5 && ~arg1 != -46 && arg1 != 19 && ~arg1 != -26 && arg1 != 16) {
            if (~arg1 != -52 && arg1 != 1002) {
               if (arg0 >= -82) {
                  method3976(false);
               }

               return false;
            } else {
               return true;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7517[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field7508;
         if (super.field7633.method4408(-121).method1282((byte)-79) < 96) {
            return 0;
         } else {
            if (arg0 <= 124) {
               this.method3973((byte)94);
            }

            return 2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7517[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class550(int arg0, class605 arg1) {
      super(arg0, arg1);

      try {
         class480.method3498(super.field7632, -86);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7517[5] + arg0 + ',' + (arg1 != null ? field7517[7] : field7517[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3975(byte arg0) {
      try {
         ++field7506;
         if (super.field7633.method4408(-121).method1282((byte)-79) < 96) {
            return false;
         } else {
            if (arg0 != -107) {
               method3976(false);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7517[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            this.method3973((byte)26);
         }

         ++field7509;
         return ~super.field7633.method4408(-125).method1282((byte)-79) > -97 ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7517[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3976(boolean arg0) {
      try {
         field7516 = null;
         field7514 = null;
         if (arg0) {
            field7513 = null;
         }

         field7515 = null;
         field7513 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7517[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field7510;
         if (~super.field7633.method4408(-113).method1282((byte)-79) > -97) {
            super.field7632 = 0;
         }

         if (super.field7632 < 0 || super.field7632 > 2) {
            super.field7632 = this.method635(arg0 + 13837);
         }

         if (arg0 != -13712) {
            field7514 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7517[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class550(class605 arg0) {
      super(arg0);

      try {
         class480.method3498(super.field7632, -50);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7517[5] + (arg0 != null ? field7517[7] : field7517[6]) + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         char var3 = method3978(method3977("ᠡ웓螊ā㛓틷祔酠惲鯻ꌎ笎᷒힌⸾﹕ᕌ㟗龾䪯壋⤱높毋봨ჶ쬅Օ\ue469䇾ꝿ闣ﯜ簨\udd62䞜쨖뼵괔荆挀ꩊ젫䦗\uf296宊騝㊂\ue941헵뻏㑳ｈ逑”᪬둯錐撿獧䀊쏗\udb93赳靵켩皹혩뗡樥䗱ピ㽧ꊤ族⿂\ude27ﵿ鈻ۿ다ฤ拦꣘聆╛葉㥾帶㣹톧\ue25a댓鱐䎲ﰆ冢洿晴繑㮩츪轼랥㳴铵뤨ⳡ\ue720쑶噆羒⪉석\udc7e鵮ㅏ\uf674곇ᒔᘸ椲炄킣찷颦⡧\uf8b4")).charAt(var0 / 2);
         long var4 = (long)(~(var0 & 1) == -1 ? var3 >>> 8 : 255 & var3);
         long var6 = var4 << 1;
         if (~var6 <= -257L) {
            var6 ^= 285L;
         }

         long var8 = var6 << 1;
         if (~var8 <= -257L) {
            var8 ^= 285L;
         }

         long var10 = var8 ^ var4;
         long var12 = var8 << 1;
         if (var12 >= 256L) {
            var12 ^= 285L;
         }

         long var14 = var4 ^ var12;
         field7514[0][var0] = class330.method2625(class330.method2625(class330.method2625(class330.method2625(class330.method2625(class330.method2625(class330.method2625(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16), var6 << 8), var14);

         for(int var16 = 1; var16 < 8; ++var16) {
            field7514[var16][var0] = class330.method2625(field7514[var16 + -1][var0] << 56, field7514[var16 + -1][var0] >>> 8);
         }
      }

      field7515[0] = 0L;

      for(int var1 = 1; ~var1 >= -11; ++var1) {
         int var2 = var1 * 8 + -8;
         field7515[var1] = class297.method2244(class297.method2244(class201.method1513(65280L, field7514[6][var2 + 6]), class297.method2244(class201.method1513(field7514[5][var2 + 5], 16711680L), class297.method2244(class297.method2244(class297.method2244(class297.method2244(class201.method1513(71776119061217280L, field7514[1][var2 + 1]), class201.method1513(-72057594037927936L, field7514[0][var2])), class201.method1513(280375465082880L, field7514[2][var2 - -2])), class201.method1513(1095216660480L, field7514[3][var2 - -3])), class201.method1513(field7514[4][var2 + 4], 4278190080L)))), class201.method1513(255L, field7514[7][var2 + 7]));
      }

   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3977(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3978(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
