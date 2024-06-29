import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class557 {
   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8303 = method4219(method4218("L\u000bL\u001b\u0000"));
   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "Luga;"
   )
   public static class540 field8302;

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method4217(int arg0) {
      try {
         if (arg0 == 18004) {
            field8302 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8303 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4218(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4219(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
