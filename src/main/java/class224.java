import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class224 {
   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2872 = method1700(method1699("|\u0007!<_"));
   @OriginalMember(
      owner = "client!gb",
      name = "c",
      descriptor = "Lum;"
   )
   public static class550 field2867 = new class550();
   @OriginalMember(
      owner = "client!gb",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2870 = new int[]{1, 0, -1, 0};
   @OriginalMember(
      owner = "client!gb",
      name = "d",
      descriptor = "I"
   )
   public int field2868;
   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field2869;
   @OriginalMember(
      owner = "client!gb",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2871;

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method1698(int arg0) {
      try {
         if (arg0 != 1) {
            method1698(-78);
         }

         field2867 = null;
         field2870 = null;
         field2871 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2872 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1699(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1700(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
