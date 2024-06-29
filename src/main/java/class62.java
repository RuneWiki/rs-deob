import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class62 {
   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field881 = new String[]{method628(method627("I;[Kh")), method628(method627("I;[Hh"))};
   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "[[Z"
   )
   public static boolean[][] field880 = new boolean[][]{new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "I"
   )
   public static int field879;
   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "Lqu;"
   )
   public static class84 field878;

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method625(byte arg0) {
      try {
         field880 = null;
         if (arg0 >= 64) {
            field878 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field881[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public static final boolean method626(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            field878 = null;
         }

         ++field879;
         return arg1 == 0 || arg1 == 1 || arg1 == 2;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field881[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method627(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method628(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
