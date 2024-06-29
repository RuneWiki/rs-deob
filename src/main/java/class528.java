import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class528 {
   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7554 = new String[]{method3821(method3820("1-\u0004iH")), method3821(method3820("*2"))};
   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7552 = new String[]{method3821(method3820("8.")), method3821(method3820("9%")), method3821(method3820(";2")), method3821(method3820("-4")), method3821(method3820("3,"))};
   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "I"
   )
   public static int field7553;

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V",
      line = 9
   )
   public static final void method3818(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class80.field1038 = arg0;
      class140.field1792 = arg1;
      class767.field11310 = class140.field1792 > 1 && class80.field1038.method583();
      class773.field11359 = arg2;
      class729.field10681 = 1 << class773.field11359;
      class436.field6247 = class729.field10681 >> 1;
      Math.sqrt((double)(class436.field6247 * class436.field6247 + class436.field6247 * class436.field6247));
      class154.field2185 = arg3;
      class457.field6539 = arg4;
      class16.field190 = arg5;
      class106.field1335 = arg6;
      class456.field6489 = class224.method1755(32258);
      class72.method664(119);
      class121.field1554 = new class517[arg3][class457.field6539][class16.field190];
      class265.field3658 = new class295[arg3];
      if (arg7) {
         class234.field3271 = new int[class457.field6539][class16.field190];
         class559.field8009 = new byte[class457.field6539][class16.field190];
         class17.field202 = new short[class457.field6539][class16.field190];
         class75.field933 = new class517[1][class457.field6539][class16.field190];
         class757.field11220 = new class295[1];
      } else {
         class234.field3271 = null;
         class559.field8009 = null;
         class17.field202 = null;
         class75.field933 = null;
         class757.field11220 = null;
      }

      if (arg8) {
         class409.field5919 = new long[arg3][arg4][arg5];
         class220.field3145 = new class637[65535];
         class195.field2759 = new boolean[65535];
         class299.field4095 = 0;
      } else {
         class409.field5919 = null;
         class220.field3145 = null;
         class195.field2759 = null;
         class299.field4095 = 0;
      }

      class769.method5569(false);
      class591.field8705 = new class731[2];
      class392.field5677 = new class731[2];
      class756.field11204 = new class731[2];
      class198.field2822 = new class731[10000];
      class614.field9023 = 0;
      class752.field11128 = new class731[5000];
      class616.field9062 = 0;
      class541.field7770 = new class627[5000];
      class274.field3764 = 0;
      class506.field7334 = new boolean[class106.field1335 + class106.field1335 + 1][class106.field1335 + class106.field1335 + 1];
      class433.field6210 = new boolean[class106.field1335 + class106.field1335 + 2][class106.field1335 + class106.field1335 + 2];
      class25.field404 = new int[class106.field1335 + class106.field1335 + 2];
      class146.field1851 = class146.field1847;
      if (class767.field11310) {
         class637.field9318 = new boolean[arg3][class106.field1335 + class106.field1335 + 1][class106.field1335 + class106.field1335 + 1];
         class747.field11059 = new boolean[arg3][][];
         if (class314.field4294 != null) {
            class501.method3637();
         }

         class314.field4294 = new class519[class140.field1792];
         class80.field1038.method525(class314.field4294.length + 1);
         class80.field1038.method570(0);

         for(int var9 = 0; var9 < class314.field4294.length; ++var9) {
            class314.field4294[var9] = new class519(var9 + 1, class80.field1038);
            (new Thread(class314.field4294[var9], field7554[1] + var9)).start();
         }

         byte var10;
         if (class140.field1792 == 2) {
            var10 = 4;
            class199.field2833 = 2;
         } else if (class140.field1792 == 3) {
            var10 = 6;
            class199.field2833 = 3;
         } else {
            var10 = 8;
            class199.field2833 = 4;
         }

         class390.field5654 = new class198[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class390.field5654[var11] = new class198(class689.field10147[class140.field1792 - 2][var11]);
         }
      } else {
         class199.field2833 = 1;
      }

      class652.field9556 = new int[class199.field2833 - 1];
      class493.field7039 = new int[class199.field2833 - 1];
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(I)V",
      line = 127
   )
   public static void method3819(int arg0) {
      try {
         field7552 = null;
         int var1 = 22 / ((arg0 - -52) / 36);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7554[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3820(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3821(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
