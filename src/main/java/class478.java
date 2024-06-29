import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class478 {
   @OriginalMember(
      owner = "client!jea",
      name = "e",
      descriptor = "Lue;"
   )
   public class244 field6608 = new class244();
   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6609 = method3489(method3488("\u0002|M7\u0010@"));
   @OriginalMember(
      owner = "client!jea",
      name = "d",
      descriptor = "I"
   )
   public static int field6604 = 0;
   @OriginalMember(
      owner = "client!jea",
      name = "c",
      descriptor = "[[I"
   )
   public static int[][] field6605 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "I"
   )
   public static int field6607 = -1;
   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "I"
   )
   public static int field6606;

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3487(int arg0) {
      try {
         if (arg0 == 8208) {
            field6605 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6609 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3488(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3489(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
