import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class213 {
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3242 = new String[]{method1862(method1861("Yu6\u0012A")), method1862(method1861("Yu6\u0011A"))};
   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field3236 = new int[2048];
   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "I"
   )
   public static int field3239 = 0;
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field3238 = new class498(15, 5);
   @OriginalMember(
      owner = "client!ql",
      name = "f",
      descriptor = "I"
   )
   public static int field3237;
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "I"
   )
   public static int field3240;
   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "I"
   )
   public static int field3241;

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(II)I",
      line = 10
   )
   public static final int method1859(int arg0, int arg1) {
      try {
         if (arg1 != -11744) {
            field3236 = null;
         }

         ++field3237;
         return arg0 & 255;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3242[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(Z)V",
      line = 23
   )
   public static void method1860(boolean arg0) {
      try {
         field3236 = null;
         field3238 = null;
         if (arg0) {
            field3241 = -86;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3242[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1861(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1862(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
