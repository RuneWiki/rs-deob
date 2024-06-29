import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class491 {
   @OriginalMember(
      owner = "client!ch",
      name = "f",
      descriptor = "I"
   )
   public int field7029 = -1;
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7035 = method3568(method3567("-\u001a*c-"));
   @OriginalMember(
      owner = "client!ch",
      name = "h",
      descriptor = "Lek;"
   )
   public static class536 field7024 = new class536(38, 3);
   @OriginalMember(
      owner = "client!ch",
      name = "l",
      descriptor = "Lim;"
   )
   public static class598 field7031 = null;
   @OriginalMember(
      owner = "client!ch",
      name = "k",
      descriptor = "Leg;"
   )
   public static class118 field7030 = new class118(34, -2);
   @OriginalMember(
      owner = "client!ch",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field7032 = new class536(1, 3);
   @OriginalMember(
      owner = "client!ch",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7033 = new int[6];
   @OriginalMember(
      owner = "client!ch",
      name = "j",
      descriptor = "[Z"
   )
   public static boolean[] field7034 = new boolean[5];
   @OriginalMember(
      owner = "client!ch",
      name = "i",
      descriptor = "I"
   )
   public static int field7027;
   @OriginalMember(
      owner = "client!ch",
      name = "d",
      descriptor = "Lgs;"
   )
   public class49 field7023;
   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "[I"
   )
   public int[] field7028;
   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "[J"
   )
   public long[] field7026;
   @OriginalMember(
      owner = "client!ch",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field7025;

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3566(int arg0) {
      try {
         field7034 = null;
         field7032 = null;
         field7024 = null;
         if (arg0 != -23925) {
            method3566(10);
         }

         field7030 = null;
         field7031 = null;
         field7033 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7035 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3568(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
