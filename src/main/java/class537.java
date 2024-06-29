import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class537 {
   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8123 = method4121(method4120("y\u0012W\t6"));
   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field8120 = new int[3];
   @OriginalMember(
      owner = "client!ta",
      name = "b",
      descriptor = "Luk;"
   )
   public static class498 field8121 = new class498(74, 4);
   @OriginalMember(
      owner = "client!ta",
      name = "e",
      descriptor = "Lwq;"
   )
   public static class228 field8122 = new class228();
   @OriginalMember(
      owner = "client!ta",
      name = "c",
      descriptor = "I"
   )
   public static int field8118;
   @OriginalMember(
      owner = "client!ta",
      name = "d",
      descriptor = "I"
   )
   public static int field8119;

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4119(boolean arg0) {
      try {
         field8121 = null;
         field8122 = null;
         if (!arg0) {
            field8120 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8123 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4120(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4121(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
