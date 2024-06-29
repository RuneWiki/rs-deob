import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class563 {
   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8030 = method4021(method4020("\"ja\u001c\b"));
   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "I"
   )
   public static int field8029;

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(B)J",
      line = 7
   )
   public static final long method4019(byte arg0) {
      try {
         ++field8029;
         return arg0 != 30 ? -125L : class22.field252.method1742((byte)94);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8030 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4021(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
