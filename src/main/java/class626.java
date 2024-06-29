import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class626 {
   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9102 = method4517(method4516("D0\u0003x\u0016"));
   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field9100 = new class101(105, 4);
   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "J"
   )
   public static long field9101 = 0L;

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4515(byte arg0) {
      try {
         if (arg0 >= 15) {
            field9100 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9102 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4516(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4517(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
