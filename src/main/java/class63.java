import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class63 extends class70 {
   @OriginalMember(
      owner = "client!pp",
      name = "K",
      descriptor = "I"
   )
   private int field800 = 0;
   @OriginalMember(
      owner = "client!pp",
      name = "O",
      descriptor = "I"
   )
   private int field799 = 1;
   @OriginalMember(
      owner = "client!pp",
      name = "P",
      descriptor = "I"
   )
   private int field805 = 0;
   @OriginalMember(
      owner = "client!pp",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field807 = new String[]{method566(method565("dv]&")), method566(method565("zs\u001f\t<")), method566(method565("q-\u001fdi")), method566(method565("zs\u001f\u000e<")), method566(method565("zs\u001f\u0006<")), method566(method565("zs\u001f\u0002<")), method566(method565("'.\u000fj")), method566(method565("zs\u001f\u0005<")), method566(method565("zs\u001f\u000f<")), method566(method565("zs\u001f\r<"))};
   @OriginalMember(
      owner = "client!pp",
      name = "L",
      descriptor = "Laka;"
   )
   public static class418 field795 = new class418(24, 12);
   @OriginalMember(
      owner = "client!pp",
      name = "R",
      descriptor = "I"
   )
   public static int field796;
   @OriginalMember(
      owner = "client!pp",
      name = "T",
      descriptor = "I"
   )
   public static int field797;
   @OriginalMember(
      owner = "client!pp",
      name = "I",
      descriptor = "I"
   )
   public static int field798;
   @OriginalMember(
      owner = "client!pp",
      name = "N",
      descriptor = "I"
   )
   public static int field801;
   @OriginalMember(
      owner = "client!pp",
      name = "J",
      descriptor = "I"
   )
   public static int field802;
   @OriginalMember(
      owner = "client!pp",
      name = "S",
      descriptor = "I"
   )
   public static int field803;
   @OriginalMember(
      owner = "client!pp",
      name = "M",
      descriptor = "I"
   )
   public static int field804;
   @OriginalMember(
      owner = "client!pp",
      name = "Q",
      descriptor = "[I"
   )
   public static int[] field806;

   @OriginalMember(
      owner = "client!pp",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method561(int arg0, int arg1) {
      try {
         ++field803;
         return arg1 <= 124 ? 76 : arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field807[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         if (arg0 >= -36) {
            this.method331((byte)-61, -110);
         }

         class704.method5119(true);
         ++field802;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field807[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method562(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field798;
         if (arg0 > 59) {
            if (class235.field2955 <= 0) {
               class198.field2525 = "";
            } else {
               int var2 = 0;
               int var3 = 0;
               if (var1) {
                  if (~class644.field9659[var3].indexOf(field807[6]) != 0) {
                     ++var2;
                     if (class235.field2955 == var2) {
                        class198.field2525 = class644.field9659[var3].substring(2 + class644.field9659[var3].indexOf(">"));
                        return;
                     }
                  }

                  ++var3;
               }

               while(true) {
                  while(class644.field9659.length > var3) {
                     if (~class644.field9659[var3].indexOf(field807[6]) != 0) {
                        ++var2;
                        if (class235.field2955 == var2) {
                           class198.field2525 = class644.field9659[var3].substring(2 + class644.field9659[var3].indexOf(">"));
                           return;
                        }
                     }

                     ++var3;
                  }

                  if (!var1) {
                     return;
                  }

                  ++var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field807[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field796;
         if (arg0 <= -34) {
            if (~arg2 != -1) {
               if (~arg2 == -2) {
                  this.field800 = arg1.method640(255);
                  return;
               }

               if (~arg2 != -4) {
                  return;
               }

               if (!client.field1481) {
                  this.field799 = arg1.method640(255);
                  return;
               }
            }

            this.field805 = arg1.method640(255);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field807[1] + arg0 + ',' + (arg1 != null ? field807[2] : field807[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method563(byte arg0) {
      try {
         if (arg0 != 54) {
            field806 = null;
         }

         field806 = null;
         field795 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field807[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field804;
         if (arg0 != -63) {
            field797 = 10;
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = class502.field6979[arg1];
            int var6 = var5 - 2048 >> 1;
            int var7 = 0;
            if (var3 || ~var7 > ~class262.field3328) {
               do {
                  int var12;
                  label38: {
                     int var8 = class17.field290[var7];
                     int var9 = var8 + -2048 >> 1;
                     if (this.field805 != 0) {
                        int var10 = var6 * var6 + var9 * var9 >> 12;
                        int var11 = (int)(Math.sqrt((double)((float)var10 / 4096.0F)) * 4096.0D);
                        var12 = (int)((double)(this.field799 * var11) * 3.141592653589793D);
                        if (!var3) {
                           break label38;
                        }
                     }

                     var12 = (-var5 + var8) * this.field799;
                  }

                  int var13;
                  label45: {
                     var13 = var12 - (-4096 & var12);
                     if (this.field800 != 0) {
                        if (~this.field800 != -3) {
                           break label45;
                        }

                        var13 -= 2048;
                        if (var13 < 0) {
                           var13 = -var13;
                        }

                        var13 = -var13 + 2048 << 1;
                        if (!var3) {
                           break label45;
                        }
                     }

                     var13 = class794.field11620[var13 >> 4 & 255] + 4096 >> 1;
                  }

                  var4[var7] = var13;
                  ++var7;
               } while(~var7 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field807[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "<init>",
      descriptor = "()V"
   )
   public class63() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!pp",
      name = "j",
      descriptor = "(I)[Laka;"
   )
   public static final class418[] method564(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field801;
            return new class418[]{class437.field5956, class105.field1365, class529.field7417, class150.field1877, class584.field8617, class125.field1627, class427.field5812, class280.field3577, class465.field6406, class602.field8868, class553.field8133, class354.field4948, class268.field3420, class562.field8266, class647.field9679, class507.field7063, class505.field7044, class175.field2260, class115.field1521, class159.field2041, class231.field2879, class743.field10862, class274.field3497, class423.field5771, field795, class631.field9313, class296.field4144, class167.field2190, class659.field9811, class32.field471, class509.field7103, class632.field9323, class277.field3537, class224.field2804, class628.field9265, class372.field5218, class455.field6278, class550.field8109, class363.field5044, class573.field8398, class176.field2271, class591.field8698, class353.field4938, class431.field5861, class716.field10513, class367.field5119, class491.field6863, class279.field3569, class530.field7543, class433.field5904, class511.field7130, class237.field2998, class317.field4372, class25.field388, class781.field11374, class522.field7323, class607.field8977, class419.field5721, class243.field3056, class644.field9665, class721.field10560, class535.field7845, class668.field9888, class90.field1216, class561.field8231, class793.field11599, class2.field21, class48.field674, class226.field2824, class284.field3937, class197.field2520, class76.field996, class446.field6035, class751.field10957, class3.field29, class720.field10553, class694.field10180, class366.field5096, class400.field5503, class302.field4231, class413.field5677, class365.field5076, class714.field10488, class150.field1864, class380.field5295, class495.field6911, class282.field3913, class646.field9677, class403.field5536, class618.field9101, class598.field8838, class417.field5701, class741.field10840, class777.field11326, class372.field5204, class574.field8440, class49.field683, class644.field9664, class729.field10636, class307.field4295, class249.field3147, class9.field151, class57.field756, class87.field1190, class79.field1094, class95.field1289, class184.field2362, class613.field9019, class553.field8130, class156.field2010, class2.field25, class314.field4350, class225.field2817, class282.field3920, class457.field6294, class202.field2569, class740.field10833, class192.field2440, class4.field47, class380.field5289, class317.field4376, class209.field2650, class332.field4582, class548.field8071, class461.field6357, class289.field3998, class162.field2062, class194.field2463, class620.field9167, class98.field1302, class138.field1747, class227.field2837, class686.field10112, class225.field2815, class331.field4565, class147.field1835, class754.field11038, class484.field6736, class320.field4405, class462.field6371, class24.field375, class438.field5964, class735.field10724};
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field807[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method566(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
