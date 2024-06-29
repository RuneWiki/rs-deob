import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class168 {
   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2521 = new String[]{method1575(method1574("Qf8\u0013\u0001r~d\u000e\u0000F\"")), method1575(method1574("Qf8&F"))};
   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "I"
   )
   public static int field2519;
   @OriginalMember(
      owner = "client!pl",
      name = "c",
      descriptor = "Lua;"
   )
   public static class569 field2518;
   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "[[B"
   )
   public static byte[][] field2520;

   @OriginalMember(
      owner = "client!pl",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2519;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2521[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1573(byte arg0) {
      try {
         field2520 = null;
         field2518 = null;
         int var1 = -84 % ((arg0 - -28) / 58);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2521[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1574(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1575(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
