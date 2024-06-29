import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class178 {
   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2781 = new String[]{method1625(method1624("\u001d\u001fa\u001dy")), method1625(method1624("\u0001Dar,")), method1625(method1624("\bD#_")), method1625(method1624("\u0001Dap,")), method1625(method1624("\u0001Daq,"))};
   @OriginalMember(
      owner = "client!gu",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2777 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field2779 = new class113(81, 3);
   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "I"
   )
   public static int field2778;
   @OriginalMember(
      owner = "client!gu",
      name = "d",
      descriptor = "I"
   )
   public static int field2780;

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1621(int arg0) {
      try {
         field2779 = null;
         if (arg0 < 97) {
            field2777 = null;
         }

         field2777 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2781[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(Lica;ZI)V"
   )
   public static final void method1622(class354 arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            ++field2780;
            if (class505.field7744 != null) {
               try {
                  class505.field7744.method1359(0L, 127);
                  class505.field7744.method1360(arg2, 24, 2755, arg0.field5428);
               } catch (Exception var4) {
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2781[1] + (arg0 != null ? field2781[0] : field2781[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(Lha;ZILvea;ILkb;IILiba;)V"
   )
   public static final void method1623(class610 arg0, boolean arg1, int arg2, class77 arg3, int arg4, class28 arg5, int arg6, int arg7, class343 arg8) {
      boolean var9 = client.field1786;

      try {
         ++field2778;
         int var10 = -(arg2 / 2) + -5 + arg7;
         int var11 = arg6 + 2;
         if (arg3.field1022 != 0) {
            arg0.method4502(var10, 0, arg3.field1022, arg2 + 10, var11, 1 + arg4 * arg8.method2768() + (arg6 - var11));
         }

         if (arg3.field999 != 0) {
            arg0.method4500(1, arg2 + 10, var10, var11, 1 + -var11 + arg4 * arg8.method2768() + arg6, arg3.field999);
         }

         int var12 = arg3.field1029;
         if (!arg1) {
            method1621(-35);
         }

         if (arg5.field333 && arg3.field1007 != -1) {
            var12 = arg3.field1007;
         }

         int var13 = 0;
         if (var9 || arg4 > var13) {
            do {
               String var14 = class259.field4269[var13];
               if (var13 < arg4 - 1) {
                  var14 = var14.substring(0, -4 + var14.length());
               }

               arg8.method2770(arg0, var14, arg7, arg6, var12, true);
               arg6 += arg8.method2768();
               ++var13;
            } while(arg4 > var13);

         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field2781[4] + (arg0 != null ? field2781[0] : field2781[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2781[0] : field2781[2]) + ',' + arg4 + ',' + (arg5 != null ? field2781[0] : field2781[2]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field2781[0] : field2781[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1624(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1625(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
