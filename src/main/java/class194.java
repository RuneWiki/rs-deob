import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class194 {
   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2465 = new String[]{method1611(method1610("N\u001e\u0018a/")), method1611(method1610("N\u001e\u0018b/"))};
   @OriginalMember(
      owner = "client!al",
      name = "e",
      descriptor = "Lrea;"
   )
   public static class39 field2462 = new class39(true);
   @OriginalMember(
      owner = "client!al",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field2463 = new class418(127, -2);
   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "Lrca;"
   )
   public static class37 field2464 = new class37();
   @OriginalMember(
      owner = "client!al",
      name = "c",
      descriptor = "I"
   )
   public int field2458;
   @OriginalMember(
      owner = "client!al",
      name = "f",
      descriptor = "I"
   )
   public int field2459;
   @OriginalMember(
      owner = "client!al",
      name = "g",
      descriptor = "I"
   )
   public static int field2460;
   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "I"
   )
   public int field2461;

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1608(byte arg0) {
      try {
         field2464 = null;
         field2463 = null;
         field2462 = null;
         if (arg0 != -125) {
            method1608((byte)1);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2465[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method1609(byte arg0, int arg1, int arg2) {
      try {
         int var3 = 112 / ((arg0 - -61) / 33);
         ++field2460;
         return ~(arg2 & 384) != -1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2465[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1610(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1611(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
