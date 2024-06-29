import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class397 {
   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5476 = method3127(method3126("?MT0|r"));
   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5475 = false;
   @OriginalMember(
      owner = "client!eaa",
      name = "c",
      descriptor = "Lhv;"
   )
   public static class227 field5473 = new class227(8);
   @OriginalMember(
      owner = "client!eaa",
      name = "b",
      descriptor = "I"
   )
   public static int field5474;

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3125(int arg0) {
      try {
         field5473 = null;
         if (arg0 != 2) {
            method3125(-127);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5476 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3126(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3127(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
