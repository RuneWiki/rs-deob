import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class140 extends class302 {
   @OriginalMember(
      owner = "client!hw",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1806 = new String[]{method1190(method1189("X'v\u0015\f")), method1190(method1189("X'v\u0014\f")), method1190(method1189("^%4*")), method1190(method1189("K~vhY")), method1190(method1189("X'v\u0001\f")), method1190(method1189("X'v\u0007\f")), method1190(method1189("X'v\u0012\f")), method1190(method1189("X'v\u0003\f")), method1190(method1189("X'v\u0005\f")), method1190(method1189("X'v\u0017\f"))};
   @OriginalMember(
      owner = "client!hw",
      name = "P",
      descriptor = "Lsda;"
   )
   public static class269 field1800 = new class269(16, 2);
   @OriginalMember(
      owner = "client!hw",
      name = "J",
      descriptor = "Lsd;"
   )
   public static class101 field1803 = new class101(46, 1);
   @OriginalMember(
      owner = "client!hw",
      name = "I",
      descriptor = "Lsd;"
   )
   public static class101 field1804 = new class101(41, 6);
   @OriginalMember(
      owner = "client!hw",
      name = "Q",
      descriptor = "I"
   )
   public static int field1795;
   @OriginalMember(
      owner = "client!hw",
      name = "O",
      descriptor = "I"
   )
   public static int field1796;
   @OriginalMember(
      owner = "client!hw",
      name = "M",
      descriptor = "I"
   )
   public static int field1797;
   @OriginalMember(
      owner = "client!hw",
      name = "L",
      descriptor = "I"
   )
   public static int field1798;
   @OriginalMember(
      owner = "client!hw",
      name = "H",
      descriptor = "I"
   )
   public static int field1799;
   @OriginalMember(
      owner = "client!hw",
      name = "N",
      descriptor = "I"
   )
   public static int field1801;
   @OriginalMember(
      owner = "client!hw",
      name = "R",
      descriptor = "I"
   )
   public static int field1805;
   @OriginalMember(
      owner = "client!hw",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field1802;

   @OriginalMember(
      owner = "client!hw",
      name = "c",
      descriptor = "(B)[Lnn;"
   )
   public static final class436[] method1182(byte arg0) {
      try {
         if (arg0 > -36) {
            return null;
         } else {
            ++field1798;
            return new class436[]{class281.field3917, class272.field3785, class547.field8115, class366.field5503, class266.field3653, class532.field7775, class628.field9128};
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1806[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method1183(int arg0, int arg1) {
      try {
         if (arg1 <= 7) {
            method1186(-13, (byte)-7, 1, -125, 92);
         }

         ++field1801;
         return arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1806[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "(Z)V"
   )
   private static final void method1184(boolean arg0) {
      try {
         ++field1805;
         class48.field578 = 0;
         int var1 = (class693.field10418.field9003 >> 9) + class718.field10676;
         if (!arg0) {
            method1186(-42, (byte)107, -92, 113, 106);
         }

         int var2 = (class693.field10418.field9007 >> 9) - -class669.field10064;
         if (~var1 <= -3054 && ~var1 >= -3157 && ~var2 <= -3057 && ~var2 >= -3137) {
            class48.field578 = 1;
         }

         if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
            class48.field578 = 1;
         }

         if (~class48.field578 == -2 && ~var1 <= -3140 && ~var1 >= -3200 && var2 >= 3008 && ~var2 >= -3063) {
            class48.field578 = 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1806[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method1185(int arg0) {
      try {
         field1800 = null;
         field1804 = null;
         field1802 = null;
         field1803 = null;
         if (arg0 != -15028) {
            field1802 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1806[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public static final void method1186(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1795;
         int var5 = class447.field6800;
         if (arg1 == 75) {
            int var6 = class721.field10729;
            if (class446.field6785) {
               var5 += class325.method2458(29461);
               var6 += class319.method2421(true);
            }

            if (~class247.field3251 == -2) {
               class396 var7 = class280.field3896[class209.field2663 / 100];
               var7.method3035(var5 + -8, var6 + -8);
               class458.method3442(var6 + -8 + var7.method1975(), 26306, var6 + -8, var5 - 8, -8 + var5 + var7.method1971());
            }

            if (~class247.field3251 == -3) {
               class396 var8 = class280.field3896[4 - -(class209.field2663 / 100)];
               var8.method3035(var5 + -8, var6 + -8);
               class458.method3442(var8.method1975() + var6 + -8, 26306, var6 + -8, var5 + -8, var5 - (8 - var8.method1971()));
            }

            method1184(true);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field1806[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method1187(int arg0, int arg1) {
      try {
         if (arg1 != 127) {
            field1803 = null;
         }

         ++field1797;
         return arg0 & 127;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1806[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(Lhv;B)V"
   )
   public static final void method1188(class544 arg0, byte arg1) {
      try {
         int var2 = 124 / ((arg1 - -67) / 38);
         ++field1799;
         if (~class255.field3401 == ~arg0.field8063) {
            class275.field3835[arg0.field8086] = true;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1806[4] + (arg0 != null ? field1806[3] : field1806[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "<init>",
      descriptor = "()V"
   )
   public class140() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field1796;
         if (arg1 >= -37) {
            field1800 = null;
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[][] var5 = this.method2297(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int var9 = 0;
            if (var3 != 0 || var9 < class344.field5238) {
               do {
                  var4[var9] = (var6[var9] + var7[var9] + var8[var9]) / 3;
                  ++var9;
               } while(var9 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1806[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1189(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1190(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
