import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class105 {
   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1645 = method1028(method1027("pW\u0002\u001fH6"));
   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field1644 = new class164(91, 3);

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1026(int arg0) {
      try {
         field1644 = null;
         if (arg0 != 3) {
            method1026(-68);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1645 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1027(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1028(char[] arg0) {
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
            var10005 = 62;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
