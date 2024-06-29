import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class705 {
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10557 = new String[]{method5129(method5128(">\u0014;\n\u001ca")), method5129(method5128(">\u0014;\n\u001fa"))};
   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "I"
   )
   public static int field10556 = 1;
   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "I"
   )
   public static int field10553;
   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "I"
   )
   public static int field10554;
   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "Leaa;"
   )
   public static class526 field10555;

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5126(int arg0) {
      try {
         if (arg0 == 16105) {
            field10555 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10557[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5127(int arg0, int arg1, int arg2) {
      try {
         ++field10554;
         int var3 = 20 % ((arg1 - -9) / 54);
         int var4 = class399.method3063(789221, arg2 + -1, arg0 - 1) + class399.method3063(789221, arg2 + -1, arg0 + 1) + class399.method3063(789221, arg2 + 1, arg0 + -1) - -class399.method3063(789221, arg2 + 1, arg0 + 1);
         int var5 = class399.method3063(789221, arg2, arg0 + -1) + class399.method3063(789221, arg2, arg0 - -1) + class399.method3063(789221, arg2 - 1, arg0) - -class399.method3063(789221, arg2 + 1, arg0);
         int var6 = class399.method3063(789221, arg2, arg0);
         return var6 / 4 + var4 / 16 + var5 / 8;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10557[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
