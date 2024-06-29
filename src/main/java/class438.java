import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class438 extends class428 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6261 = method3229(method3228("2\u0014CTj"));
   @OriginalMember(
      owner = "client!za",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field6257 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!za",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field6260 = new int[500];
   @OriginalMember(
      owner = "client!za",
      name = "o",
      descriptor = "I"
   )
   public static int field6259 = 1;
   @OriginalMember(
      owner = "client!za",
      name = "n",
      descriptor = "Lbg;"
   )
   public static class492 field6258;

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3227(byte arg0) {
      try {
         if (arg0 == 103) {
            field6258 = null;
            field6260 = null;
            field6257 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6261 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3228(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3229(char[] arg0) {
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
            var10005 = 117;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
