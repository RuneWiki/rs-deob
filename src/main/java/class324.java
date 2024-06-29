import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class324 {
   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4666 = method2522(method2521(">\u000b;f&"));
   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field4665 = false;
   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "Lft;"
   )
   public static class4 field4664;
   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field4663;

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2520(boolean arg0) {
      try {
         if (arg0) {
            field4665 = false;
         }

         field4664 = null;
         field4663 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4666 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
