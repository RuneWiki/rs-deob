import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class157 {
   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2516 = new String[]{method1442(method1441("T2>-kp.b0jDr")), method1442(method1441("T2>\u0018,"))};
   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "I"
   )
   public static int field2511 = 0;
   @OriginalMember(
      owner = "client!wh",
      name = "f",
      descriptor = "Lgh;"
   )
   public static class572 field2514 = new class572(48, 9);
   @OriginalMember(
      owner = "client!wh",
      name = "d",
      descriptor = "I"
   )
   public static int field2512;
   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2513;
   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "[Ltd;"
   )
   public static class476[] field2515;
   @OriginalMember(
      owner = "client!wh",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2510;

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method1440(int arg0) {
      try {
         if (arg0 < 81) {
            field2515 = null;
         }

         field2514 = null;
         field2515 = null;
         field2513 = null;
         field2510 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2516[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 28
   )
   public final String toString() {
      try {
         ++field2512;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2516[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1442(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
