import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class588 {
   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8678 = method4392(method4391("n(\u0018&@"));
   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "Lnaa;"
   )
   public static class113 field8676 = new class113(79, 8);
   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "J"
   )
   public static long field8677;

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4390(int arg0) {
      try {
         if (arg0 >= -109) {
            field8676 = null;
         }

         field8676 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8678 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
