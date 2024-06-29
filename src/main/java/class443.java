import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class443 {
   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6310 = method3257(method3256("p\u0004\u0003\f'"));
   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "[Lnka;"
   )
   public static class311[] field6309;

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(B)V",
      line = 8
   )
   public static void method3255(byte arg0) {
      try {
         field6309 = null;
         if (arg0 > -24) {
            field6309 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6310 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
