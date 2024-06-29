import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class630 {
   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8965 = new String[]{method4622(method4621("B\u0014N\u0005\u001e")), method4622(method4621("B\u0014N\u0006\u001e"))};
   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class398 field8964 = new class398(16);
   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "I"
   )
   public static int field8963;

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4619(int arg0) {
      try {
         if (arg0 == -24115) {
            field8964 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8965[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4620(byte arg0) {
      try {
         ++field8963;
         if (arg0 != 85) {
            return 22;
         } else {
            return ~class217.field3113 == -2 ? class519.field7320 : 0;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8965[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4621(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4622(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
