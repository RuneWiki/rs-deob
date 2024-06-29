import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class438 extends class500 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6071 = new String[]{method3259(method3258("0\r Xl")), method3259(method3258("0\r Zl")), method3259(method3258("1B 79")), method3259(method3258("$\u0019bu"))};
   @OriginalMember(
      owner = "client!za",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field6070 = new int[2];
   @OriginalMember(
      owner = "client!za",
      name = "j",
      descriptor = "Lnw;"
   )
   public static class616 field6068 = new class616(4, 11);
   @OriginalMember(
      owner = "client!za",
      name = "l",
      descriptor = "I"
   )
   public static int field6069;

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(IILha;IZIII)V"
   )
   public static final void method3255(int arg0, int arg1, class65 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
      try {
         ++field6069;
         class633.field8958 = arg2;
         class195.field2370 = class633.field8958.method603();
         class126.field1572 = class633.field8958.method603();
         class773.field11148 = class633.field8958.method603();
         class458.field6280 = 0;
         class616.field8588 = 1;
         class477.field6599 = arg6;
         class369.field5198 = arg7;
         class269.field3479 = arg0;
         class671.field9871 = 0;
         class182.field2249 = arg3;
         class771.field11096 = null;
         class316.method2374(arg1, arg5, (byte)98);
         if (!arg4) {
            method3257((class80)null, -13, -93, 25);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6071[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6071[2] : field6071[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3256(byte arg0) {
      try {
         if (arg0 > 92) {
            field6068 = null;
            field6070 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6071[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(Lu;III)V"
   )
   public static final void method3257(class80 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class635.field8973) {
         class225 var4 = class111.field1404[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field2820 != null && var4.field2820.method771(90)) {
            arg0.method783(0, var4.field2820, 0, -1, true, class212.field2635, class292.field3851);
         }
      }

      if (arg3 < class635.field8973) {
         class225 var5 = class111.field1404[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field2820 != null && var5.field2820.method771(121)) {
            arg0.method783(class212.field2635, var5.field2820, 0, -1, true, 0, class292.field3851);
         }
      }

      if (arg2 < class635.field8973 && arg3 < class304.field4042) {
         class225 var6 = class111.field1404[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field2820 != null && var6.field2820.method771(92)) {
            arg0.method783(class212.field2635, var6.field2820, 0, -1, true, class212.field2635, class292.field3851);
         }
      }

      if (arg2 < class635.field8973 && arg3 > 0) {
         class225 var7 = class111.field1404[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field2820 != null && var7.field2820.method771(99)) {
            arg0.method783(-class212.field2635, var7.field2820, 0, -1, true, class212.field2635, class292.field3851);
         }
      }

   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3258(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3259(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
