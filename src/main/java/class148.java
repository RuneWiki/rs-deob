import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class148 {
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2391 = method1387(method1386("\u00143\u001a\u001f\u001d"));
   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2389 = new int[14];
   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field2390 = false;

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method1385(int arg0) {
      try {
         field2389 = null;
         if (arg0 != 14) {
            field2389 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2391 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1386(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1387(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
