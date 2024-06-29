import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class489 {
   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7143 = new String[]{method3699(method3698("D\u0005v\u0010\u0004")), method3699(method3698("D\u0005v\u0013\u0004"))};
   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "Lkea;"
   )
   public static class248 field7138 = new class248("", 10);
   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "[[Z"
   )
   public static boolean[][] field7141 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "Liw;"
   )
   public static class332 field7140 = new class332();
   @OriginalMember(
      owner = "client!wi",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class572 field7142 = new class572(25, 6);
   @OriginalMember(
      owner = "client!wi",
      name = "d",
      descriptor = "I"
   )
   public static int field7139;

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(II)V",
      line = 4
   )
   public static final void method3696(int arg0, int arg1) {
      try {
         ++field7139;
         if (arg1 != 6) {
            method3696(-30, -116);
         }

         class196 var2 = (class196)class64.field1178.method1572((long)arg0, arg1 + -16295);
         if (var2 != null) {
            var2.field2958 = !var2.field2958;
            var2.field2966.method5212(var2.field2958, 0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7143[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(B)V",
      line = 22
   )
   public static void method3697(byte arg0) {
      try {
         if (arg0 == -125) {
            field7142 = null;
            field7140 = null;
            field7138 = null;
            field7141 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7143[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3698(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3699(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
