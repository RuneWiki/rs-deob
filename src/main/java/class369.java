import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class369 {
   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5442 = method2906(method2905("\bNJ[e"));
   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "Lma;"
   )
   public static class148 field5441;

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2904(int arg0) {
      try {
         field5441 = null;
         if (arg0 != 0) {
            field5441 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5442 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2905(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2906(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
