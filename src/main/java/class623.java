import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class623 extends Exception {
   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9054 = method4575(method4574("`59\u0018(#"));
   @OriginalMember(
      owner = "client!kfa",
      name = "e",
      descriptor = "Luk;"
   )
   public static class498 field9048 = new class498(116, 0);
   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field9049 = new class113(88, 16);
   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field9051 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!kfa",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field9052 = new class498(16, 2);
   @OriginalMember(
      owner = "client!kfa",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field9053 = null;
   @OriginalMember(
      owner = "client!kfa",
      name = "f",
      descriptor = "Lvw;"
   )
   public static class777 field9050;

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method4573(int arg0) {
      try {
         field9053 = null;
         field9052 = null;
         field9048 = null;
         field9050 = null;
         field9051 = null;
         field9049 = null;
         if (arg0 != 65535) {
            field9053 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9054 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4574(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4575(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
