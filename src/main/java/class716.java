import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class716 {
   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10660 = method5184(method5183("TnSLU"));
   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "Lsda;"
   )
   public static class269 field10659 = new class269(32, 8);

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method5182(byte arg0) {
      try {
         if (arg0 != -10) {
            field10659 = null;
         }

         field10659 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10660 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5184(char[] arg0) {
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
            var10005 = 25;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
