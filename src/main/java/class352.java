import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class352 {
   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5352 = new String[]{method2753(method2752("\f>Y\u0012s")), method2753(method2752("\f>Y\u0013s")), method2753(method2752("\f>Y\u0010s"))};
   @OriginalMember(
      owner = "client!jo",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field5349 = false;
   @OriginalMember(
      owner = "client!jo",
      name = "c",
      descriptor = "Lch;"
   )
   public static class488 field5348 = null;
   @OriginalMember(
      owner = "client!jo",
      name = "e",
      descriptor = "I"
   )
   public static int field5347;
   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "I"
   )
   public static int field5351;
   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "[Luf;"
   )
   public static class471[] field5350;

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(B)Z",
      line = 14
   )
   public static final boolean method2749(byte arg0) {
      try {
         ++field5351;
         if (arg0 != 11) {
            field5350 = null;
         }

         return class354.field5375 > 0;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5352[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(JJ)J",
      line = 32
   )
   public static long method2750(long arg0, long arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5352[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(I)V",
      line = 39
   )
   public static void method2751(int arg0) {
      try {
         field5348 = null;
         if (arg0 != -27501) {
            field5348 = null;
         }

         field5350 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5352[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2752(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2753(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
