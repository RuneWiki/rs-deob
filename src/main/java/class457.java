import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class457 {
   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6297 = method3496(method3495("kj\t[\u00016"));
   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field6294 = new class418(114, -2);
   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field6295 = false;
   @OriginalMember(
      owner = "client!uaa",
      name = "d",
      descriptor = "F"
   )
   public static float field6296;
   @OriginalMember(
      owner = "client!uaa",
      name = "c",
      descriptor = "I"
   )
   public static int field6293;

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3494(byte arg0) {
      try {
         if (arg0 > -70) {
            field6294 = null;
         }

         field6294 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6297 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3495(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3496(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
