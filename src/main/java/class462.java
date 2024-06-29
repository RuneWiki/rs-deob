import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class462 {
   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6967 = new String[]{method3461(method3460("*e|.V")), method3461(method3460("*~3")), method3461(method3460("/c>\u0003")), method3461(method3460("*e|-V")), method3461(method3460(":8|A\u0003"))};
   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field6965 = new class101(108, 0);
   @OriginalMember(
      owner = "client!ks",
      name = "b",
      descriptor = "I"
   )
   public static int field6966;

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(Ljava/lang/String;IB)Lpc;"
   )
   public static final class698 method3458(String arg0, int arg1, byte arg2) {
      try {
         ++field6966;

         class698 var3;
         try {
            var3 = (class698)Class.forName(field6967[1]).newInstance();
         } catch (Throwable var5) {
            var3 = new class523();
         }

         if (arg2 >= -70) {
            field6965 = null;
         }

         var3.field10475 = arg0;
         var3.field10477 = arg1;
         return var3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6967[3] + (arg0 != null ? field6967[4] : field6967[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3459(int arg0) {
      try {
         field6965 = null;
         int var1 = -74 % ((18 - arg0) / 58);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6967[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3460(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3461(char[] arg0) {
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
            var10005 = 22;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
