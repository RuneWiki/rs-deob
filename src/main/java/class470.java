import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class470 {
   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7013 = method3504(method3503("$b 2y"));
   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7012;

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3502(int arg0) {
      try {
         field7012 = null;
         if (arg0 >= -114) {
            field7012 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7013 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3503(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3504(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
