import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class476 {
   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6873 = method3653(method3652("]8oj\u000f\u0010"));
   @OriginalMember(
      owner = "client!eea",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6872 = null;
   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "I"
   )
   public static int field6871;
   @OriginalMember(
      owner = "client!eea",
      name = "c",
      descriptor = "Loea;"
   )
   public static class647 field6870;

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3651(int arg0) {
      try {
         if (arg0 == -26) {
            field6872 = null;
            field6870 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6873 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3652(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3653(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
