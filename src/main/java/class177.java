import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class177 extends class744 {
   @OriginalMember(
      owner = "client!bka",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2189 = new String[]{method1402(method1401("(1TQib")), method1402(method1401("(1TQhb")), method1402(method1401("(1TQab")), method1402(method1401("(1TQgb"))};
   @OriginalMember(
      owner = "client!bka",
      name = "C",
      descriptor = "I"
   )
   public static int field2184;
   @OriginalMember(
      owner = "client!bka",
      name = "E",
      descriptor = "I"
   )
   public static int field2185;
   @OriginalMember(
      owner = "client!bka",
      name = "F",
      descriptor = "I"
   )
   public static int field2186;
   @OriginalMember(
      owner = "client!bka",
      name = "G",
      descriptor = "I"
   )
   public static int field2188;
   @OriginalMember(
      owner = "client!bka",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field2183;
   @OriginalMember(
      owner = "client!bka",
      name = "A",
      descriptor = "[[[B"
   )
   public static byte[][][] field2187;

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method1397(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2185;
         super.field11031 = arg3;
         if (arg0 == 2969) {
            super.field11027 = arg2;
            super.field11038 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2189[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method1398(float arg0, byte arg1) {
      try {
         ++field2186;
         int var3 = -44 % ((43 - arg1) / 51);
         super.field11028 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2189[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method1399(int arg0, int arg1, int arg2) {
      try {
         ++field2188;
         if (arg0 != 13370) {
            return true;
         } else {
            return ~(33 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2189[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class177(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!bka",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1400(int arg0) {
      try {
         if (arg0 == 21808) {
            field2187 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2189[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1401(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1402(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
