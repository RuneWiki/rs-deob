import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class668 {
   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9495 = method4831(method4830("6~A>Bi"));
   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field9493 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @OriginalMember(
      owner = "client!wda",
      name = "c",
      descriptor = "[Z"
   )
   public static boolean[] field9494 = new boolean[8];
   @OriginalMember(
      owner = "client!wda",
      name = "b",
      descriptor = "Ldg;"
   )
   public static class436 field9492 = new class436(method4831(method4830("\u0016NrS")), method4831(method4830(".|Fy`$")), method4831(method4830("\u001ehC")), 1);

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4829(byte arg0) {
      try {
         field9494 = null;
         field9492 = null;
         field9493 = null;
         int var1 = 42 % ((arg0 - 63) / 45);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9495 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4830(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4831(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
