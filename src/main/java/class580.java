import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class580 {
   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8545 = method4205(method4204("\u0019[f\u000e\u0012"));
   @OriginalMember(
      owner = "client!ii",
      name = "c",
      descriptor = "Lek;"
   )
   public static class536 field8543 = new class536(77, -1);
   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "Lr;"
   )
   public class196 field8544;
   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "Lka;"
   )
   public class500 field8542;

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4203(int arg0) {
      try {
         field8543 = null;
         if (arg0 <= 114) {
            field8543 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8545 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4204(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4205(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
