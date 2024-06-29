import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class422 extends class759 {
   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6150 = method3206(method3205("iU\u000f@r"));
   @OriginalMember(
      owner = "client!oh",
      name = "j",
      descriptor = "Lgh;"
   )
   public static class572 field6144 = new class572(124, 0);
   @OriginalMember(
      owner = "client!oh",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field6149 = new int[13];
   @OriginalMember(
      owner = "client!oh",
      name = "k",
      descriptor = "I"
   )
   public static int field6145;
   @OriginalMember(
      owner = "client!oh",
      name = "l",
      descriptor = "I"
   )
   public static int field6146;
   @OriginalMember(
      owner = "client!oh",
      name = "h",
      descriptor = "Lhw;"
   )
   public static class141 field6148;
   @OriginalMember(
      owner = "client!oh",
      name = "i",
      descriptor = "[[I"
   )
   public static int[][] field6147;

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(Z)V",
      line = 7
   )
   public static void method3204(boolean arg0) {
      try {
         field6148 = null;
         if (!arg0) {
            field6144 = null;
            field6149 = null;
            field6147 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6150 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3205(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3206(char[] arg0) {
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
            var10005 = 61;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
