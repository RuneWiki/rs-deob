import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class360 {
   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5124 = new String[]{method2813(method2812("<\n LO")), method2813(method2812("<\n OO"))};
   @OriginalMember(
      owner = "client!gd",
      name = "c",
      descriptor = "Lnw;"
   )
   public static class616 field5122 = new class616(62, 2);
   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "Lnw;"
   )
   public static class616 field5123 = new class616(26, 7);
   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "I"
   )
   public static int field5121;

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2810(byte arg0) {
      try {
         field5123 = null;
         if (arg0 >= 36) {
            field5122 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5124[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2811(boolean arg0) {
      try {
         ++field5121;
         class271.field3594 = null;
         if (!arg0) {
            field5123 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5124[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2812(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2813(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
