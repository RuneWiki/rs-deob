import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class103 {
   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1442 = new String[]{method1004(method1003("&\u00156+\u0015")), method1004(method1003("&\u00156(\u0015"))};
   @OriginalMember(
      owner = "client!rn",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1441 = new int[32];
   @OriginalMember(
      owner = "client!rn",
      name = "e",
      descriptor = "Ltv;"
   )
   public static class311 field1438 = new class311(method1004(method1003("'\u000f}\u0006Q5\t|\u000bJ:")), method1004(method1003("\u0007\u000f}\u0006Q5\t8.\\#\u0015")), 1);
   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "I"
   )
   public static int field1437;
   @OriginalMember(
      owner = "client!rn",
      name = "d",
      descriptor = "I"
   )
   public static int field1439;
   @OriginalMember(
      owner = "client!rn",
      name = "c",
      descriptor = "I"
   )
   public static int field1440;

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1001(int arg0) {
      try {
         field1438 = null;
         field1441 = null;
         if (arg0 != -3047) {
            field1437 = 23;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1442[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(CBI)I"
   )
   public static final int method1002(char arg0, byte arg1, int arg2) {
      try {
         ++field1440;
         int var3 = arg0 << 4;
         int var4 = 100 / ((23 - arg1) / 51);
         if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var7 = Character.toLowerCase(arg0);
            var3 = (var7 << 4) + 1;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1442[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1003(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1004(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
