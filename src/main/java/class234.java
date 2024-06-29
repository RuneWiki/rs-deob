import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class234 {
   @OriginalMember(
      owner = "client!rha",
      name = "g",
      descriptor = "Log;"
   )
   public class677 field3266 = new class677();
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3272 = method1810(method1809("1c\u0013\u0004ok"));
   @OriginalMember(
      owner = "client!rha",
      name = "f",
      descriptor = "I"
   )
   public static int field3265 = 0;
   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field3267 = new class118(18, 0);
   @OriginalMember(
      owner = "client!rha",
      name = "d",
      descriptor = "Lht;"
   )
   public static class608 field3268 = new class608(0, 0);
   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "I"
   )
   public static int field3269 = 0;
   @OriginalMember(
      owner = "client!rha",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field3270 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "[[I"
   )
   public static int[][] field3271;

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1808(int arg0) {
      try {
         field3270 = null;
         field3268 = null;
         field3267 = null;
         if (arg0 != 1) {
            method1808(-26);
         }

         field3271 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3272 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1809(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1810(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
