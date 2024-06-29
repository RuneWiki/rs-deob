import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class415 {
   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6084 = new String[]{method3249(method3248(",s!lQ")), method3249(method3248(",s!mQ")), method3249(method3248(",s!nQ"))};
   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "Lfm;"
   )
   public static class164 field6082 = new class164(18, 8);
   @OriginalMember(
      owner = "client!nb",
      name = "c",
      descriptor = "F"
   )
   public static float field6083;
   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "I"
   )
   public static int field6081;

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3245(byte arg0) {
      try {
         class501.field7151 = 0;
         int var1 = -124 % ((-66 - arg0) / 41);
         class24.field345 = new class180[50];
         ++field6081;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6084[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3246(int arg0) {
      try {
         field6082 = null;
         int var1 = 119 % ((arg0 - 58) / 52);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6084[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method3247(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6084[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3248(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3249(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
