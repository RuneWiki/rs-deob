import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class181 {
   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "[[Lqja;"
   )
   private class137[][] field2662;
   @OriginalMember(
      owner = "client!bda",
      name = "q",
      descriptor = "[I"
   )
   private int[] field2666;
   @OriginalMember(
      owner = "client!bda",
      name = "k",
      descriptor = "[I"
   )
   private int[] field2669;
   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "I"
   )
   private int field2661;
   @OriginalMember(
      owner = "client!bda",
      name = "r",
      descriptor = "[I"
   )
   private int[] field2668;
   @OriginalMember(
      owner = "client!bda",
      name = "v",
      descriptor = "[[Lqja;"
   )
   private class137[][] field2665;
   @OriginalMember(
      owner = "client!bda",
      name = "c",
      descriptor = "Lrs;"
   )
   private class297 field2657;
   @OriginalMember(
      owner = "client!bda",
      name = "u",
      descriptor = "Ldca;"
   )
   private class581 field2671;
   @OriginalMember(
      owner = "client!bda",
      name = "t",
      descriptor = "Ldca;"
   )
   private class581 field2667;
   @OriginalMember(
      owner = "client!bda",
      name = "h",
      descriptor = "Lida;"
   )
   private class99 field2664;
   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2673 = new String[]{method1645(method1644("+\u0019h[")), method1645(method1644("'\be\u0019(m")), method1645(method1644(">B*\u0019\u0016")), method1645(method1644("'\be\u0019,m")), method1645(method1644("'\be\u0019/m")), method1645(method1644("'\be\u0019*m")), method1645(method1644("'\be\u0019)m")), method1645(method1644("'\be\u0019!m")), method1645(method1644("'\be\u0019.m")), method1645(method1644("'\be\u0019#m")), method1645(method1644("'\be\u0019 m")), method1645(method1644("'\be\u0019'm")), method1645(method1644("'\be\u0019\"m")), method1645(method1644("'\be\u0019W,\u0002mCUm")), method1645(method1644("'\be\u0019-m"))};
   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "Lfm;"
   )
   public static class164 field2672 = new class164(76, 3);
   @OriginalMember(
      owner = "client!bda",
      name = "m",
      descriptor = "I"
   )
   public static int field2651;
   @OriginalMember(
      owner = "client!bda",
      name = "o",
      descriptor = "I"
   )
   public static int field2652;
   @OriginalMember(
      owner = "client!bda",
      name = "s",
      descriptor = "I"
   )
   public static int field2653;
   @OriginalMember(
      owner = "client!bda",
      name = "l",
      descriptor = "I"
   )
   public static int field2654;
   @OriginalMember(
      owner = "client!bda",
      name = "p",
      descriptor = "I"
   )
   public static int field2655;
   @OriginalMember(
      owner = "client!bda",
      name = "n",
      descriptor = "I"
   )
   public static int field2656;
   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "I"
   )
   public static int field2658;
   @OriginalMember(
      owner = "client!bda",
      name = "g",
      descriptor = "I"
   )
   public static int field2659;
   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "I"
   )
   public static int field2660;
   @OriginalMember(
      owner = "client!bda",
      name = "j",
      descriptor = "I"
   )
   public static int field2663;
   @OriginalMember(
      owner = "client!bda",
      name = "i",
      descriptor = "I"
   )
   public static int field2670;

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ldaa;B)V"
   )
   private final void method1632(class226 arg0, byte arg1) {
      try {
         if (arg1 != -112) {
            this.field2661 = -83;
         }

         arg0.method1960(true, (byte)103);
         ++field2656;
         arg0.method1941((byte)-125, true);
         if (class254.field3850 != arg0.field3492) {
            arg0.method197(class254.field3850);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2673[1] + (arg0 != null ? field2673[2] : field2673[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ldaa;I)V"
   )
   public final void method1633(class226 arg0, int arg1) {
      try {
         if (arg1 == -1) {
            this.field2671.method351((byte)38, 786336, 24);
            ++field2653;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2673[6] + (arg0 != null ? field2673[2] : field2673[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1634(int arg0) {
      try {
         this.field2671.method358(true);
         if (arg0 == -1) {
            ++field2670;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2673[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1635(int arg0, int arg1) {
      try {
         ++field2651;
         class111 var2 = class796.method5734(arg1, (long)arg0, (byte)-115);
         var2.method1083(-84);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2673[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1636(int arg0, int arg1) {
      try {
         ++field2658;
         int var2 = -class177.field2616 + class51.field770;
         if (var2 >= 100) {
            class306.field4639 = 1;
            class27.field402 = -1;
            class555.field7892 = -1;
         } else {
            int var3 = (int)class604.field8615;
            if (~var3 > ~(class290.field4343 >> 8)) {
               var3 = class290.field4343 >> 8;
            }

            if (class258.field3930[4] && ~(class183.field2691[4] + 128) < ~var3) {
               var3 = class183.field2691[4] + 128;
            }

            float var5;
            int var7;
            label30: {
               int var4 = 16383 & (int)class86.field1312 + class788.field11483;
               class580.method4276(class779.field11378, class576.field8140, arg0, var3, (byte)106, var4, (var3 >> 3) * 3 + 600 << 2, -200 + class478.method3658(class128.field2049, class117.field1849.field6832, class117.field1849.field6833, (byte)-20));
               var5 = 1.0F - (float)((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
               class313.field4701 = (int)((float)(-class248.field3791 + class313.field4701) * var5 + (float)class248.field3791);
               int var6 = 8 % ((arg1 - 12) / 37);
               class222.field3158 = (int)((float)(class222.field3158 - class37.field547) * var5 + (float)class37.field547);
               class576.field8141 = (int)((float)(-class133.field2179 + class576.field8141) * var5 + (float)class133.field2179);
               class670.field9407 = (int)((float)(-class489.field7003 + class670.field9407) * var5 + (float)class489.field7003);
               var7 = -class21.field320 + class75.field1201;
               if (~var7 < -8193) {
                  var7 -= 16384;
                  if (!client.field10022) {
                     break label30;
                  }
               }

               if (var7 < -8192) {
                  var7 += 16384;
               }
            }

            class75.field1201 = (int)((float)var7 * var5 + (float)class21.field320);
            class75.field1201 &= 16383;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2673[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ldaa;IB)V"
   )
   private final void method1637(class226 param1, int param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Ldaa;II)V"
   )
   private final void method1638(class226 arg0, int arg1, int arg2) {
      try {
         ++field2660;
         class254.field3850 = arg0.field3492;
         arg0.method2003((byte)10, (float)arg2);
         arg0.method1979((byte)113);
         arg0.method1941((byte)-32, false);
         arg0.method1960(false, (byte)103);
         arg0.method1957((byte)79);
         int var4 = 39 / ((-37 - arg1) / 55);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2673[14] + (arg0 != null ? field2673[2] : field2673[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(ZLdaa;ILuv;)V"
   )
   public final void method1639(boolean param1, class226 param2, int param3, class521 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Lia;B)Z"
   )
   public static final boolean method1640(class338 arg0, byte arg1) {
      try {
         ++field2663;
         if (arg1 != 90) {
            return true;
         } else {
            class544 var2 = class549.field7834.method3850(arg1 ^ 3863, arg0.method724(23976));
            if (~var2.field7691 == 0) {
               return true;
            } else {
               class104 var3 = class376.field5490.method2363(var2.field7691, 60);
               return ~var3.field1640 == 0 ? true : var3.method1023(arg1 + -117);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2673[9] + (arg0 != null ? field2673[2] : field2673[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method1641(int arg0, boolean arg1) {
      try {
         ++field2655;
         if (!arg1) {
            field2672 = null;
         }

         return arg0 == 16711935 ? -1 : class357.method2808((byte)-53, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2673[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1642(byte arg0) {
      try {
         if (arg0 == 87) {
            field2672 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2673[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class181(class226 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(BLdaa;)V"
   )
   private final void method1643(byte arg0, class226 arg1) {
      try {
         ++field2659;
         if (arg0 == 32) {
            class254.field3850 = arg1.field3492;
            arg1.method1955(1);
            arg1.method1941((byte)-60, false);
            arg1.method1960(false, (byte)103);
            arg1.method1957((byte)102);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2673[11] + arg0 + ',' + (arg1 != null ? field2673[2] : field2673[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1644(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1645(char[] arg0) {
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
            var10005 = 108;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
