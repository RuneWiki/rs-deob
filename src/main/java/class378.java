import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class378 {
   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5457 = method2865(method2864("%3ouGo"));
   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "I"
   )
   public static int field5456 = 0;
   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "Lrt;"
   )
   public static class240 field5455;

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2863(int arg0) {
      try {
         field5455 = null;
         if (arg0 != 10) {
            field5455 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5457 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2864(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2865(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
