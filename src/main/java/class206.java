import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class206 extends class673 {
   @OriginalMember(
      owner = "client!gp",
      name = "o",
      descriptor = "Lrca;"
   )
   public class37 field2626 = new class37();
   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2628 = new String[]{method1704(method1703("8:dE5")), method1704(method1703("8:dF5"))};
   @OriginalMember(
      owner = "client!gp",
      name = "m",
      descriptor = "Lrj;"
   )
   public static class782 field2625 = new class782();
   @OriginalMember(
      owner = "client!gp",
      name = "l",
      descriptor = "I"
   )
   public static int field2627 = 0;
   @OriginalMember(
      owner = "client!gp",
      name = "n",
      descriptor = "I"
   )
   public static int field2624;

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1701(int arg0) {
      try {
         field2625 = null;
         if (arg0 != 0) {
            field2627 = 85;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2628[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1702(int arg0, int arg1, int arg2) {
      try {
         int var3 = 115 % ((-38 - arg1) / 37);
         ++field2624;
         return class277.method2189(arg2, (byte)-123, arg0) || class481.method3656(true, arg2, arg0);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2628[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1703(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1704(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
