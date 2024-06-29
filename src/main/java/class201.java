import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class201 {
   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2884 = new String[]{method1751(method1750("\b\u0005\u001b\u0018r")), method1751(method1750("\b\u0005\u001b\u001br"))};
   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2879 = new String[200];
   @OriginalMember(
      owner = "client!oe",
      name = "d",
      descriptor = "I"
   )
   public static int field2880;
   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "I"
   )
   public static int field2883;
   @OriginalMember(
      owner = "client!oe",
      name = "e",
      descriptor = "Lns;"
   )
   public static class382 field2881;
   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "Lpca;"
   )
   public static class774 field2882;

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1748(boolean arg0) {
      try {
         if (arg0) {
            field2882 = null;
            field2879 = null;
            field2881 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2884[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1749(int arg0, int arg1, int arg2) {
      try {
         ++field2883;
         return arg2 != 200 ? false : (class426.method3325(arg0, arg1, 33) | class388.method3024(arg0, arg1, (byte)2) | class341.method2719(arg0, true, arg1)) & class294.method2459(arg1, (byte)-124, arg0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2884[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1750(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1751(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
