import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class221 extends Exception {
   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2773 = new String[]{method1780(method1779("riY\u0004")), method1780(method1779("jq\u001b)n")), method1780(method1779("g2\u001bF;"))};
   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field2771 = false;
   @OriginalMember(
      owner = "client!vm",
      name = "c",
      descriptor = "I"
   )
   public static int field2770;
   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "I"
   )
   public static int field2772;

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(I[B)Z"
   )
   public static final boolean method1778(int arg0, byte[] arg1) {
      try {
         ++field2770;
         class66 var2 = new class66(arg1);
         int var3 = var2.method640(255);
         if (~var3 != arg0) {
            return false;
         } else {
            boolean var4 = var2.method640(255) == 1;
            if (var4) {
               class400.method3139(124, var2);
            }

            class124.method1079((byte)-47, var2);
            return true;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2773[1] + arg0 + ',' + (arg1 != null ? field2773[2] : field2773[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1779(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1780(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
