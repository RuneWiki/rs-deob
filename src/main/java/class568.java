import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class568 {
   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8411 = method4276(method4275("\u0017eRfH"));
   @OriginalMember(
      owner = "client!vh",
      name = "c",
      descriptor = "I"
   )
   public static int field8408 = 0;
   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field8409 = false;
   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "I"
   )
   public static int field8410;

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4274(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 262144) {
            field8408 = 67;
         }

         ++field8410;
         return ~(arg2 & 262144) != -1 | class262.method2275(-43, arg2, arg0) || class233.method2003(arg2, (byte)122, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8411 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4275(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4276(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
