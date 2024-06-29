import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {
   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field140 = new String[]{method85(method84("PB\b)R")), method85(method84("PB\b+R")), method85(method84("PB\b*R"))};
   @OriginalMember(
      owner = "client!ff",
      name = "d",
      descriptor = "I"
   )
   public static int field138 = -60;
   @OriginalMember(
      owner = "client!ff",
      name = "f",
      descriptor = "Lsda;"
   )
   public static class269 field137 = new class269(5, -1);
   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "[[Z"
   )
   public static boolean[][] field139 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "I"
   )
   public static int field133;
   @OriginalMember(
      owner = "client!ff",
      name = "c",
      descriptor = "I"
   )
   public static int field134;
   @OriginalMember(
      owner = "client!ff",
      name = "e",
      descriptor = "I"
   )
   public static int field135;
   @OriginalMember(
      owner = "client!ff",
      name = "g",
      descriptor = "I"
   )
   public static int field136;

   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "(III)Z",
      line = 4
   )
   public static final boolean method81(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 1) {
            field137 = null;
         }

         ++field134;
         return ((arg0 & 8192) != 0 | class415.method3173(arg0, 10695, arg1) | class255.method1919(arg0, 0, arg1)) & class156.method1293(arg2 + 54, arg1, arg0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field140[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method82(int arg0) {
      try {
         field137 = null;
         field139 = null;
         if (arg0 < 108) {
            field139 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field140[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(III)B",
      line = 34
   )
   public static final byte method83(int arg0, int arg1, int arg2) {
      try {
         if (arg2 >= -101) {
            return 91;
         } else {
            ++field133;
            if (~arg0 != -10) {
               return 0;
            } else {
               return (byte)((1 & arg1) == 0 ? 1 : 2);
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field140[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method84(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method85(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
