import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class660 {
   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9619 = method4824(method4823("v(~D{"));
   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "Llg;"
   )
   public static class437 field9617 = new class437();
   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "I"
   )
   public static int field9616;
   @OriginalMember(
      owner = "client!mh",
      name = "c",
      descriptor = "Lnk;"
   )
   public static class749 field9618;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(I)V",
      line = 9
   )
   public static void method4822(int arg0) {
      try {
         field9618 = null;
         if (arg0 == 23199) {
            field9617 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9619 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4823(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4824(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
