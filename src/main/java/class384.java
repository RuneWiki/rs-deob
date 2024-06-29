import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class384 {
   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5878 = new String[]{method2955(method2954("3\u0017d?\u007f")), method2955(method2954("3\u0017d<\u007f"))};
   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field5876 = false;
   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "I"
   )
   public static int field5875;
   @OriginalMember(
      owner = "client!bc",
      name = "c",
      descriptor = "Leaa;"
   )
   public static class526 field5877;

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method2952(int arg0) {
      try {
         field5877 = null;
         int var1 = -108 / ((arg0 - 65) / 37);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5878[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(III)Z",
      line = 18
   )
   public static final boolean method2953(int arg0, int arg1, int arg2) {
      try {
         if (arg1 > -28) {
            return false;
         } else {
            ++field5875;
            if (~arg2 == -12) {
               arg2 = 10;
            }

            class557 var3 = class151.field1896.method5072(30, arg0);
            if (arg2 >= 5 && arg2 <= 8) {
               arg2 = 4;
            }

            return var3.method4135(arg2, 14704);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5878[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
