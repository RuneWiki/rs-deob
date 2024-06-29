import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class160 extends class505 {
   @OriginalMember(
      owner = "client!mg",
      name = "u",
      descriptor = "I"
   )
   private int field2276 = -1;
   @OriginalMember(
      owner = "client!mg",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2287 = new String[]{method1341(method1340("7\u0018\u000f,*")), method1341(method1340("!Q\u000fJ\u007f")), method1341(method1340("7\u0018\u000f#*")), method1341(method1340("4\nM\b")), method1341(method1340("7\u0018\u000f%*"))};
   @OriginalMember(
      owner = "client!mg",
      name = "v",
      descriptor = "Llea;"
   )
   public static class639 field2278 = new class639(3, 19);
   @OriginalMember(
      owner = "client!mg",
      name = "A",
      descriptor = "[[S"
   )
   private static short[][] field2283 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!mg",
      name = "w",
      descriptor = "[[S"
   )
   private static short[][] field2280 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!mg",
      name = "x",
      descriptor = "[[S"
   )
   private static short[][] field2284 = new short[][]{{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}};
   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "[[[S"
   )
   public static short[][][] field2281 = new short[][][]{field2284, field2283, field2280};
   @OriginalMember(
      owner = "client!mg",
      name = "B",
      descriptor = "Leg;"
   )
   public static class118 field2279 = new class118(111, 6);
   @OriginalMember(
      owner = "client!mg",
      name = "C",
      descriptor = "D"
   )
   public static double field2286;
   @OriginalMember(
      owner = "client!mg",
      name = "t",
      descriptor = "I"
   )
   public static int field2277;
   @OriginalMember(
      owner = "client!mg",
      name = "s",
      descriptor = "I"
   )
   public static int field2282;
   @OriginalMember(
      owner = "client!mg",
      name = "y",
      descriptor = "[Lbg;"
   )
   public static class492[] field2285;

   @OriginalMember(
      owner = "client!mg",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1337(int arg0) {
      try {
         field2281 = null;
         field2278 = null;
         field2280 = null;
         field2285 = null;
         field2284 = null;
         field2279 = null;
         field2283 = null;
         if (arg0 != 12) {
            field2281 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2287[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public final void method1338(int arg0, class147 arg1) {
      try {
         if (arg0 >= 105) {
            this.field2276 = arg1.method1211(-26166);
            ++field2282;
            arg1.method1143(-15465);
            if (~arg1.method1143(-15465) != -256) {
               --arg1.field1856;
               arg1.method1207(false);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2287[2] + arg0 + ',' + (arg1 != null ? field2287[1] : field2287[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(Ldda;Z)V"
   )
   public final void method1339(class405 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field2283 = null;
         }

         ++field2277;
         arg0.method3053((byte)-1, this.field2276);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2287[4] + (arg0 != null ? field2287[1] : field2287[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1340(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1341(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
