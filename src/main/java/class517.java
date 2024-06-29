import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class517 {
   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7318 = method3876(method3875("|X\u001b9\u000b%"));
   @OriginalMember(
      owner = "client!qfa",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field7312 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   @OriginalMember(
      owner = "client!qfa",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7314 = new String[100];
   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "I"
   )
   public static int field7313;
   @OriginalMember(
      owner = "client!qfa",
      name = "e",
      descriptor = "I"
   )
   public static int field7315;
   @OriginalMember(
      owner = "client!qfa",
      name = "f",
      descriptor = "I"
   )
   public static int field7317;
   @OriginalMember(
      owner = "client!qfa",
      name = "c",
      descriptor = "Lsa;"
   )
   public static class39 field7316;

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3874(boolean arg0) {
      try {
         field7316 = null;
         field7312 = null;
         field7314 = null;
         if (!arg0) {
            field7312 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7318 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3875(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3876(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
