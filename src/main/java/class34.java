import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 {
   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field377 = method240(method239("*\u0002\u0001/5`"));
   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field376 = new class101(58, 2);

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method238(byte arg0) {
      try {
         field376 = null;
         if (arg0 < 43) {
            field376 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field377 + arg0 + ')');
      }
   }

   static {
      new class102("", 76);
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method239(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method240(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
