import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class265 extends Exception {
   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3452 = new String[]{method2035(method2034("8pT=\u0012")), method2035(method2034("8pT>\u0012"))};
   @OriginalMember(
      owner = "client!sr",
      name = "b",
      descriptor = "I"
   )
   public static int field3449 = 0;
   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "I"
   )
   public static int field3451 = 0;
   @OriginalMember(
      owner = "client!sr",
      name = "c",
      descriptor = "Lnw;"
   )
   public static class616 field3448 = new class616(18, 4);
   @OriginalMember(
      owner = "client!sr",
      name = "d",
      descriptor = "I"
   )
   public static int field3450;

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2032(int arg0, int arg1) {
      try {
         if (arg0 < 9) {
            field3448 = null;
         }

         ++field3450;
         return ~arg1 == -8 || ~arg1 == -9 || arg1 == 9 || ~arg1 == -11;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3452[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2033(int arg0) {
      try {
         field3448 = null;
         if (arg0 >= -7) {
            field3449 = 66;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3452[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2034(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2035(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
