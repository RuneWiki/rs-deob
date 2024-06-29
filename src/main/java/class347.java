import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class347 {
   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5111 = method2755(method2754("P)F&.\u001b"));
   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "[Lma;"
   )
   public static class148[] field5110;

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2753(int arg0) {
      try {
         field5110 = null;
         if (arg0 != 18083) {
            field5110 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5111 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2754(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2755(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
