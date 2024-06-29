import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class542 extends class213 {
   @OriginalMember(
      owner = "client!uca",
      name = "G",
      descriptor = "I"
   )
   private int field7385 = 32768;
   @OriginalMember(
      owner = "client!uca",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7395 = new String[]{method3915(method3914("!Ec<8|")), method3915(method3914("!Ec<2|")), method3915(method3914("!Ec<;|")), method3915(method3914(":Sn~")), method3915(method3914("!Ec<?|")), method3915(method3914("/\b,<\u0004")), method3915(method3914("!Ec<3|")), method3915(method3914("!Ec<>|")), method3915(method3914("!Ec<:|")), method3915(method3914("!Ec<<|"))};
   @OriginalMember(
      owner = "client!uca",
      name = "L",
      descriptor = "Lbga;"
   )
   public static class378 field7388 = new class378(11, 1);
   @OriginalMember(
      owner = "client!uca",
      name = "E",
      descriptor = "Lkda;"
   )
   public static class411 field7394 = new class411();
   @OriginalMember(
      owner = "client!uca",
      name = "D",
      descriptor = "I"
   )
   public static int field7386;
   @OriginalMember(
      owner = "client!uca",
      name = "N",
      descriptor = "I"
   )
   public static int field7387;
   @OriginalMember(
      owner = "client!uca",
      name = "J",
      descriptor = "I"
   )
   public static int field7389;
   @OriginalMember(
      owner = "client!uca",
      name = "M",
      descriptor = "I"
   )
   public static int field7390;
   @OriginalMember(
      owner = "client!uca",
      name = "F",
      descriptor = "I"
   )
   public static int field7391;
   @OriginalMember(
      owner = "client!uca",
      name = "I",
      descriptor = "I"
   )
   public static int field7392;
   @OriginalMember(
      owner = "client!uca",
      name = "K",
      descriptor = "I"
   )
   public static int field7393;

   @OriginalMember(
      owner = "client!uca",
      name = "<init>",
      descriptor = "()V"
   )
   public class542() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label43: {
            label38: {
               int var5 = -6 / ((arg1 - 68) / 48);
               if (arg2 != 0) {
                  if (arg2 != 1) {
                     break label43;
                  }

                  if (!var4) {
                     break label38;
                  }
               }

               this.field7385 = arg0.method4280(-19104) << 4;
               if (!var4) {
                  break label43;
               }
            }

            super.field2645 = ~arg0.method4288((byte)117) == -2;
         }

         ++field7386;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7395[7] + (arg0 != null ? field7395[5] : field7395[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3909(int arg0) {
      try {
         if (arg0 == -1090258740) {
            field7394 = null;
            field7388 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7395[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field7392;
         if (arg1 < 26) {
            method3912(53, 108, (class501)null, 44, -72, (class79)null);
         }

         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719) {
            int[] var5 = this.method1619((byte)42, arg0, 1);
            int[] var6 = this.method1619((byte)36, arg0, 2);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int var10 = 0;
            if (var3 || class576.field7916 > var10) {
               do {
                  int var11 = (1047660 & var5[var10] * 255) >> 12;
                  int var12 = var6[var10] * this.field7385 >> 12;
                  int var13 = class210.field2607[var11] * var12 >> 12;
                  int var14 = class667.field9487[var11] * var12 >> 12;
                  int var15 = class676.field9924 & var10 - -(var13 >> 12);
                  int var16 = arg0 - -(var14 >> 12) & class40.field468;
                  int[][] var17 = this.method1615(true, var16, 0);
                  var7[var10] = var17[0][var15];
                  var8[var10] = var17[1][var15];
                  var9[var10] = var17[2][var15];
                  ++var10;
               } while(class576.field7916 > var10);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field7395[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field7390;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (arg1 != 2064866508) {
            return null;
         } else {
            if (super.field2650.field7140) {
               int[] var5 = this.method1619((byte)65, arg0, 1);
               int[] var6 = this.method1619((byte)42, arg0, 2);
               int var7 = 0;
               if (var3 || ~var7 > ~class576.field7916) {
                  do {
                     int var8 = 255 & var5[var7] >> 4;
                     int var9 = var6[var7] * this.field7385 >> 12;
                     int var10 = class210.field2607[var8] * var9 >> 12;
                     int var11 = class667.field9487[var8] * var9 >> 12;
                     int var12 = (var10 >> 12) + var7 & class676.field9924;
                     int var13 = class40.field468 & (var11 >> 12) + arg0;
                     int[] var14 = this.method1619((byte)70, var13, 0);
                     var4[var7] = var14[var12];
                     ++var7;
                  } while(~var7 > ~class576.field7916);
               }
            }

            return var4;
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field7395[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(BLwm;)Lfq;"
   )
   public static final class213 method3910(byte arg0, class594 arg1) {
      boolean var2 = client.field4273;

      try {
         ++field7393;
         if (arg0 >= -93) {
            method3910((byte)-72, (class594)null);
         }

         arg1.method4288((byte)117);
         int var3 = arg1.method4288((byte)75);
         class213 var4 = class213.method1618(var3, true);
         var4.field2643 = arg1.method4288((byte)111);
         int var5 = arg1.method4288((byte)100);
         int var6 = 0;
         int var7;
         if (var2) {
            var7 = arg1.method4288((byte)67);
            var4.method217(arg1, -65, var7);
            ++var6;
         }

         while(~var5 < ~var6) {
            var7 = arg1.method4288((byte)67);
            var4.method217(arg1, -65, var7);
            ++var6;
         }

         var4.method1457(28274);
         return var4;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7395[4] + arg0 + ',' + (arg1 != null ? field7395[5] : field7395[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3911() {
      class46.field528 = class46.field521;
   }

   @OriginalMember(
      owner = "client!uca",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         if (arg0 != 28274) {
            method3910((byte)-54, (class594)null);
         }

         class39.method296((byte)56);
         ++field7387;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7395[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(IILka;IILoi;)V"
   )
   public static final void method3912(int arg0, int arg1, class501 arg2, int arg3, int arg4, class79 arg5) {
      try {
         if (arg1 != 2) {
            field7394 = null;
         }

         ++field7391;
         if (arg2 != null) {
            arg5.method764(arg2.method357(), arg2.method368(), arg2.method329(), arg0, arg4, arg3, arg2.method334(), arg2.method366(), arg2.method345(), arg2.method344(), -29001);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7395[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7395[5] : field7395[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7395[5] : field7395[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(IIII)Lbn;"
   )
   public static final class471 method3913(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7389;
         class471 var4 = null;
         if (~arg3 == arg2) {
            var4 = class133.method1118(class605.field8474.field2787, 2, class604.field8415);
            ++class100.field1290;
         }

         if (arg3 == 1) {
            ++class495.field6797;
            var4 = class133.method1118(class605.field8474.field2787, arg2 ^ -3, class700.field10199);
         }

         var4.field6527.method4314(arg2 + -104, arg0 - -class752.field10921);
         var4.field6527.method4318(class42.field495.method3876(arg2 ^ -36, 82) ? 1 : 0, 0);
         var4.field6527.method4314(-32, class17.field237 + arg1);
         class196.field2380 = arg1;
         class135.field1751 = false;
         class529.field7262 = arg0;
         class624.method4533(15);
         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7395[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3914(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3915(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
