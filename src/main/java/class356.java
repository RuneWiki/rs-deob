import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class356 {
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4791 = new String[]{method2660(method2659("]\\\u001e{e")), method2660(method2659("]\\\u001exe"))};
   @OriginalMember(
      owner = "client!on",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4785 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "Lqd;"
   )
   public static class475 field4786 = new class475("", 21);
   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "[[Z"
   )
   public static boolean[][] field4790 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!on",
      name = "c",
      descriptor = "I"
   )
   public static int field4788;
   @OriginalMember(
      owner = "client!on",
      name = "f",
      descriptor = "Lnu;"
   )
   public static class619 field4789;
   @OriginalMember(
      owner = "client!on",
      name = "d",
      descriptor = "[[B"
   )
   public static byte[][] field4787;

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(BI)V",
      line = 10
   )
   public static final void method2657(byte arg0, int arg1) {
      try {
         if (arg0 < -115) {
            ++field4788;
            if (!class23.field259 || ~arg1 < ~class343.field4661.length) {
               class343.field4661 = new class106[arg1];
               class414.field5964 = new int[arg1];
               class661.field9626 = new class85[arg1];
               class782.field11463 = new int[arg1];
               class147.field1921 = new class106[arg1];
               class719.field10506 = new int[arg1];
               class442.field6306 = new int[arg1];
            }

         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4791[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(B)V",
      line = 32
   )
   public static void method2658(byte arg0) {
      try {
         field4786 = null;
         field4787 = null;
         field4789 = null;
         if (arg0 > -7) {
            method2658((byte)45);
         }

         field4785 = null;
         field4790 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4791[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2659(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2660(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
