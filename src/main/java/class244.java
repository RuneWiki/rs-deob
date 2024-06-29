import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class244 {
   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3513 = new String[]{method1987(method1986("|vn>z")), method1987(method1986("|vn=z")), method1987(method1986("|vn?z")), method1987(method1986("|vn8z"))};
   @OriginalMember(
      owner = "client!fa",
      name = "c",
      descriptor = "Lej;"
   )
   public static class133 field3508 = new class133();
   @OriginalMember(
      owner = "client!fa",
      name = "d",
      descriptor = "I"
   )
   public static int field3509;
   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "I"
   )
   public static int field3510;
   @OriginalMember(
      owner = "client!fa",
      name = "e",
      descriptor = "I"
   )
   public static int field3511;
   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "Lhw;"
   )
   public static class141 field3512;

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1982(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 714646727) {
            return true;
         } else {
            ++field3509;
            return class641.method4695(arg0, -2, arg2) || class679.method4956(arg0, -104, arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3513[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method1983(boolean arg0, int arg1) {
      try {
         ++field3511;
         return arg0 ? 125 : arg1 >>> 7;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3513[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1984(byte arg0) {
      try {
         field3512 = null;
         field3508 = null;
         if (arg0 != -127) {
            field3512 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3513[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(II)Lof;"
   )
   public static final class646 method1985(int arg0, int arg1) {
      try {
         if (arg0 != 3222) {
            field3512 = null;
         }

         ++field3510;
         return new class646(arg1, false);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3513[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1986(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1987(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
