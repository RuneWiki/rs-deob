import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {
   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field31 = method34(method33("|\tZZE"));
   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "Ldg;"
   )
   public static class436 field30 = new class436(method34(method33("T%7Z!")), "", method34(method33("t\u0005\u0017z\u0001")), 4);

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method32(byte arg0) {
      try {
         if (arg0 < 122) {
            field30 = null;
         }

         field30 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field31 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method33(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method34(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
