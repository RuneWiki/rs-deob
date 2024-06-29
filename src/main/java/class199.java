import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class class199 extends class172 {
   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2408 = method1495(method1494("'-2+m"));
   @OriginalMember(
      owner = "client!ov",
      name = "h",
      descriptor = "[[S"
   )
   private static short[][] field2402 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!ov",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field2403 = false;
   @OriginalMember(
      owner = "client!ov",
      name = "f",
      descriptor = "[[S"
   )
   private static short[][] field2406 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!ov",
      name = "k",
      descriptor = "[[S"
   )
   private static short[][] field2407 = new short[][]{{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}};
   @OriginalMember(
      owner = "client!ov",
      name = "j",
      descriptor = "[[[S"
   )
   public static short[][][] field2405 = new short[][][]{field2407, field2406, field2402};
   @OriginalMember(
      owner = "client!ov",
      name = "i",
      descriptor = "Ltv;"
   )
   public static class590 field2404 = new class590(64);

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(I)Leea;"
   )
   public abstract class142 method1492(int arg0);

   @OriginalMember(
      owner = "client!ov",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1493(int arg0) {
      try {
         field2407 = null;
         field2404 = null;
         if (arg0 > -125) {
            field2405 = null;
         }

         field2402 = null;
         field2406 = null;
         field2405 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2408 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1494(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1495(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
