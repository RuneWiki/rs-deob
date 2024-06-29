import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class779 {
   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11419 = new String[]{method5636(method5635("35\b:")), method5636(method5635("&nJx=")), method5636(method5635("0/J\u0017h"))};
   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "I"
   )
   public static int field11418;

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V"
   )
   public static final void method5634(String arg0, String arg1, int arg2, byte arg3) {
      try {
         class743.field10700 = 2;
         int var4 = 70 % ((35 - arg3) / 51);
         class475.field6939 = arg2;
         ++field11418;
         class672.method4915(arg1, (byte)-123, false, false, arg0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11419[2] + (arg0 != null ? field11419[1] : field11419[0]) + ',' + (arg1 != null ? field11419[1] : field11419[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5635(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5636(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
