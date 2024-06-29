import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class173 {
   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2164 = new String[]{method1387(method1386("R\u001csNA\\+f\u0012\\]\u001f:")), method1387(method1386("R\u001csNt\u001b"))};
   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field2161 = false;
   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field2159 = new class101(122, 2);
   @OriginalMember(
      owner = "client!ada",
      name = "d",
      descriptor = "I"
   )
   public static int field2162;
   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "Lpg;"
   )
   public static class763 field2160;
   @OriginalMember(
      owner = "client!ada",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field2163;

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1385(int arg0) {
      try {
         field2163 = null;
         if (arg0 == 2) {
            field2160 = null;
            field2159 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2164[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2162;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2164[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1386(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1387(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
