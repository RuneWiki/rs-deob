import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class155 extends class423 {
   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2215 = method1307(method1306("\u0003\u001ds\u001cm"));
   @OriginalMember(
      owner = "client!mr",
      name = "i",
      descriptor = "Loi;"
   )
   public static class80 field2212 = new class80(4);
   @OriginalMember(
      owner = "client!mr",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field2214 = new int[1];
   @OriginalMember(
      owner = "client!mr",
      name = "k",
      descriptor = "F"
   )
   public static float field2213;

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1305(byte arg0) {
      try {
         field2214 = null;
         field2212 = null;
         if (arg0 != -21) {
            field2212 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2215 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
