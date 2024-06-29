import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class684 {
   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10071 = method4992(method4991("=\u001a\t\u0011K"));
   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "I"
   )
   public static int field10070;
   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "Lhw;"
   )
   public static class141 field10069;

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4990(boolean arg0) {
      try {
         field10069 = null;
         if (arg0) {
            method4990(false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10071 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4991(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4992(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
