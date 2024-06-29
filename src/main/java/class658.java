import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class658 {
   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9807 = new String[]{method4829(method4828("6GZw3s")), method4829(method4828("6GZw0s"))};
   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "Liba;"
   )
   public static class237 field9805 = new class237();
   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "I"
   )
   public static int field9806;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(Z)[I"
   )
   public static final int[] method4826(boolean arg0) {
      try {
         if (!arg0) {
            method4826(false);
         }

         ++field9806;
         return new int[]{class641.field9435, class90.field1221, class408.field5631};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9807[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4827(byte arg0) {
      try {
         field9805 = null;
         if (arg0 < 67) {
            method4826(false);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9807[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4828(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4829(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
