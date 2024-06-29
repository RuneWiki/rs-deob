import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class714 {
   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10400 = method5187(method5186("\u0000__?@B"));
   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "Leg;"
   )
   public static class118 field10399 = new class118(57, 2);

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5185(int arg0) {
      try {
         if (arg0 == 3156) {
            field10399 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10400 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5186(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5187(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
