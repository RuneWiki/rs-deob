import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {
   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field404 = method258(method257("}rF\u001fy"));
   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field401 = null;
   @OriginalMember(
      owner = "client!wv",
      name = "d",
      descriptor = "I"
   )
   public static int field403 = 0;
   @OriginalMember(
      owner = "client!wv",
      name = "c",
      descriptor = "[J"
   )
   public static long[] field400;
   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field402;

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method256(int arg0) {
      try {
         field400 = null;
         field402 = null;
         field401 = null;
         if (arg0 != -14894) {
            field403 = -109;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field404 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method257(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method258(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
