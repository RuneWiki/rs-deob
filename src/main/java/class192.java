import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class192 {
   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2988 = method1710(method1709("\r\u0005M@^"));
   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "Lria;"
   )
   public static class185 field2987;

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method1708(int arg0) {
      try {
         if (arg0 >= -13) {
            field2987 = null;
         }

         field2987 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2988 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1709(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1710(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
