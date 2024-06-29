import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class689 {
   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10132 = method5020(method5019("\u0007o8u(]"));
   @OriginalMember(
      owner = "client!rda",
      name = "c",
      descriptor = "Lgh;"
   )
   public static class572 field10129 = new class572(3, 4);
   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "Ltd;"
   )
   public static class476 field10130;
   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "Lsh;"
   )
   public static class76 field10131;

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5018(byte arg0) {
      try {
         field10130 = null;
         int var1 = -82 % ((arg0 - -45) / 48);
         field10131 = null;
         field10129 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10132 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5019(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5020(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
