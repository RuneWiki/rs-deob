import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class212 {
   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2637 = method1614(method1613("\u000f]|j\u0019"));
   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "Lafa;"
   )
   public static class365 field2633 = new class365(9, 2);
   @OriginalMember(
      owner = "client!oe",
      name = "e",
      descriptor = "Lo;"
   )
   public static class31 field2636 = new class31(2, 2);
   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "I"
   )
   public static int field2635;
   @OriginalMember(
      owner = "client!oe",
      name = "d",
      descriptor = "Lij;"
   )
   public static class447 field2634;
   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2632;

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1612(int arg0) {
      try {
         field2636 = null;
         if (arg0 != 2) {
            method1612(98);
         }

         field2633 = null;
         field2632 = null;
         field2634 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2637 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1613(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1614(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
