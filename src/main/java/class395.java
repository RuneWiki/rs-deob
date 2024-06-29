import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class395 {
   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5571 = method3007(method3006("[.b^["));
   @OriginalMember(
      owner = "client!wu",
      name = "b",
      descriptor = "Lnw;"
   )
   public static class616 field5568 = new class616(3, -1);
   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5570 = false;
   @OriginalMember(
      owner = "client!wu",
      name = "c",
      descriptor = "I"
   )
   public static int field5569;

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3005(boolean arg0) {
      try {
         field5568 = null;
         if (!arg0) {
            method3005(true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5571 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3006(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3007(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
