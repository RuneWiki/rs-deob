import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class84 extends class55 {
   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1096 = new String[]{method754(method753("Dn[{\\")), method754(method753("Dn[q\\")), method754(method753("Dn[p\\")), method754(method753("Dn[r\\")), method754(method753("Dn[v\\")), method754(method753("Dn[w\\")), method754(method753("Dn[z\\")), method754(method753("Dn[t\\")), method754(method753("Dn[u\\"))};
   @OriginalMember(
      owner = "client!qw",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field1086 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!qw",
      name = "h",
      descriptor = "Loi;"
   )
   public static class80 field1088 = new class80(10);
   @OriginalMember(
      owner = "client!qw",
      name = "l",
      descriptor = "I"
   )
   public static int field1085;
   @OriginalMember(
      owner = "client!qw",
      name = "j",
      descriptor = "I"
   )
   public static int field1087;
   @OriginalMember(
      owner = "client!qw",
      name = "m",
      descriptor = "I"
   )
   public static int field1089;
   @OriginalMember(
      owner = "client!qw",
      name = "k",
      descriptor = "I"
   )
   public static int field1090;
   @OriginalMember(
      owner = "client!qw",
      name = "f",
      descriptor = "I"
   )
   public static int field1091;
   @OriginalMember(
      owner = "client!qw",
      name = "e",
      descriptor = "I"
   )
   public static int field1092;
   @OriginalMember(
      owner = "client!qw",
      name = "o",
      descriptor = "I"
   )
   public static int field1093;
   @OriginalMember(
      owner = "client!qw",
      name = "g",
      descriptor = "I"
   )
   public static int field1094;
   @OriginalMember(
      owner = "client!qw",
      name = "i",
      descriptor = "I"
   )
   public static int field1095;

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(I)I",
      line = 4
   )
   public final int method101(int arg0) {
      try {
         if (arg0 > -116) {
            this.method752(-47);
         }

         ++field1085;
         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1096[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(IB)V",
      line = 17
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = -53 % ((47 - arg1) / 46);
         super.field680 = arg0;
         ++field1087;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1096[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public final void method98(int arg0) {
      try {
         ++field1092;
         if (super.field683.method3300((byte)-56)) {
            super.field680 = 0;
         }

         if (super.field680 < arg0 && super.field680 > 2) {
            super.field680 = this.method101(-117);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1096[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "d",
      descriptor = "(I)V",
      line = 44
   )
   public static void method748(int arg0) {
      try {
         if (arg0 == 3) {
            field1088 = null;
            field1086 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1096[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IB)I",
      line = 56
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field1094;
         if (arg1 != 105) {
            return 117;
         } else if (super.field683.method3300((byte)-56)) {
            return 3;
         } else {
            return arg0 != 0 && super.field683.field6449.method1711(arg1 ^ -127) != 1 ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1096[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IIZIIBIFI)[[I",
      line = 73
   )
   public static final int[][] method749(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, float arg7, int arg8) {
      boolean var9 = client.field4360;

      try {
         ++field1089;
         int[][] var10 = new int[arg0][arg6];
         class641 var11 = new class641();
         var11.field9362 = arg2;
         var11.field9371 = arg3;
         var11.field9364 = arg8;
         var11.field9373 = (int)(arg7 * 4096.0F);
         var11.field9378 = arg4;
         var11.method413(60);
         if (arg5 > -119) {
            field1086 = null;
         }

         class109.method884((byte)-22, arg0, arg6);
         int var12 = 0;
         if (var9) {
            var11.method4631(true, var10[var12], var12);
            ++var12;
         }

         while(true) {
            while(~arg0 < ~var12) {
               var11.method4631(true, var10[var12], var12);
               ++var12;
            }

            if (!var9) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field1096[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "e",
      descriptor = "(I)V",
      line = 106
   )
   public static final void method750(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1090;
         class266.field3701.method2380(-6121);
         class375.field5415.method4337((byte)125);
         class427.field6121.method1091(-126);
         class387.field5618.method3980(115);
         class195.field2761.method1730(83);
         class468.field6728.method2260(-20916);
         class190.field2702.method4417((byte)40);
         class478.field6875.method1951((byte)-1);
         class631.field9253.method4272(94);
         class468.field6732.method3509(true);
         class657.field9605.method1068(-1);
         class184.field2587.method5275(-124);
         class780.field11425.method1112(51);
         class294.field4046.method4595(false);
         class61.field747.method5667((byte)-36);
         class741.field10810.method2478(-16541);
         class327.field4469.method1330(true);
         class685.field10097.method670(-2);
         class426.field6104.method2423((byte)116);
         class645.field9420.method5147(true);
         class247.field3409.method915(126);
         class612.field8982.method3454(3);
         class778.field11405.method3259(-16561);
         class637.method4610(-14);
         class256.method1956((byte)-128);
         if (arg0 < -56) {
            class399.method3020(true);
            class471.method3413(0);
            if (class435.field6230 != class290.field4016) {
               int var2 = 0;
               if (var1) {
                  class52.field669[var2] = null;
                  ++var2;
               }

               while(true) {
                  while(~class52.field669.length < ~var2) {
                     class52.field669[var2] = null;
                     ++var2;
                  }

                  if (!var1) {
                     class164.field2320 = 0;
                     break;
                  }

                  ++var2;
               }
            }

            class624.method4536(-123);
            class87.method770((byte)72);
            class766.method5547(64);
            class314.method2313(0);
            class287.method2170(-1);
            class200.field2861.method731(0);
            class383.field5543.method514();
            class329.method2436(false);
            class258.method1969(false);
            class536.field7672.method2046(-125);
            class267.field3710.method2046(125);
            class418.field6003.method2046(127);
            class49.field653.method2046(121);
            class146.field1852.method2046(122);
            class515.field7437.method2046(123);
            class707.field10327.method2046(-81);
            class699.field10238.method2046(-87);
            class281.field3904.method2046(127);
            class552.field7921.method2046(-122);
            class342.field4638.method2046(-72);
            class598.field8789.method2046(10);
            class595.field8745.method2046(122);
            class487.field6954.method2046(-61);
            class525.field7531.method2046(-21);
            class213.field3038.method2046(-59);
            class617.field9088.method2046(124);
            class249.field3427.method2046(-54);
            class666.field9672.method2046(-109);
            class612.field8985.method2046(125);
            class80.field1051.method2046(127);
            class170.field2370.method2046(-70);
            class778.field11397.method2046(-78);
            class77.field960.method2046(-20);
            class86.field1135.method2046(121);
            class446.field6347.method2046(127);
            class252.field3436.method2046(-88);
            class259.field3556.method2046(-125);
            class223.field3171.method2046(7);
            class635.field9288.method2046(122);
            class399.field5754.method2046(-84);
            class387.field5601.method2046(127);
            class742.field10816.method2046(-45);
            class360.field4902.method731(0);
            class252.field3435.method731(0);
            class319.field4374.method731(0);
            class685.field10094.method731(0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1096[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(B)Z",
      line = 202
   )
   public final boolean method751(byte arg0) {
      try {
         ++field1091;
         if (super.field683.method3300((byte)-56)) {
            return false;
         } else {
            if (arg0 != 120) {
               field1088 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1096[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "c",
      descriptor = "(I)I",
      line = 220
   )
   public final int method752(int arg0) {
      try {
         ++field1095;
         int var2 = -46 / ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1096[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 230
   )
   public class84(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 238
   )
   public class84(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method753(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method754(char[] arg0) {
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
            var10005 = 25;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
