import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class600 {
   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8860 = method4466(method4465("8\u001fNFd"));
   @OriginalMember(
      owner = "client!as",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field8859 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "I"
   )
   public static int field8858 = 0;

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4464(boolean arg0) {
      try {
         if (!arg0) {
            field8859 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8860 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4465(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4466(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
