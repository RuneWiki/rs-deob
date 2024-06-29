import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class443 {
   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6807 = method3488(method3487("8l\u0018\u0001D~"));
   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "Lhr;"
   )
   public static class666 field6802 = new class666();
   @OriginalMember(
      owner = "client!nia",
      name = "e",
      descriptor = "I"
   )
   public static int field6805 = 1;
   @OriginalMember(
      owner = "client!nia",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6803 = null;
   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "I"
   )
   public static int field6806 = 0;
   @OriginalMember(
      owner = "client!nia",
      name = "d",
      descriptor = "Lwv;"
   )
   public static class147 field6804;

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(B)V",
      line = 12
   )
   public static void method3486(byte arg0) {
      try {
         field6802 = null;
         field6803 = null;
         field6804 = null;
         if (arg0 <= 55) {
            method3486((byte)-70);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6807 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
