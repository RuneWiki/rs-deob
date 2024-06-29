import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class57 {
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field758 = method534(method533(">)iMw"));
   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "Laka;"
   )
   public static class418 field756 = new class418(102, 2);
   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "Lhe;"
   )
   public static class621 field757;

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method532(byte arg0) {
      try {
         field756 = null;
         field757 = null;
         if (arg0 != 104) {
            method532((byte)20);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field758 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method533(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method534(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
