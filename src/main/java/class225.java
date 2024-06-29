import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class225 {
   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3204 = method1761(method1760("EC\r\u0011\u007f"));
   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "Lmda;"
   )
   public static class277 field3202 = new class277(0, 0);
   @OriginalMember(
      owner = "client!eq",
      name = "c",
      descriptor = "I"
   )
   public static int field3199;
   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "I"
   )
   public static int field3200;
   @OriginalMember(
      owner = "client!eq",
      name = "e",
      descriptor = "I"
   )
   public static int field3201;
   @OriginalMember(
      owner = "client!eq",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field3203;

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(I)V",
      line = 16
   )
   public static void method1759(int arg0) {
      try {
         field3202 = null;
         if (arg0 != -95632416) {
            method1759(56);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3204 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1760(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1761(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
