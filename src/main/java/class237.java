import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class237 {
   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3609 = method2027(method2026("v3[ZQ"));
   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "I"
   )
   public static int field3608 = -1;
   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "Ljq;"
   )
   public static class672 field3607;

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method2025(int arg0) {
      try {
         if (arg0 == -1) {
            field3607 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3609 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
