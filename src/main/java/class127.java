import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class127 {
   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "Lgs;"
   )
   public class49 field1524 = new class49();
   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1528 = method1036(method1035("R\u0003#\u0001%\u0015"));
   @OriginalMember(
      owner = "client!oda",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field1525 = new class101(14, 6);
   @OriginalMember(
      owner = "client!oda",
      name = "c",
      descriptor = "I"
   )
   public static int field1527 = 0;
   @OriginalMember(
      owner = "client!oda",
      name = "d",
      descriptor = "Lqa;"
   )
   public static class259 field1526;

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method1034(int arg0) {
      try {
         if (arg0 < 68) {
            field1525 = null;
         }

         field1526 = null;
         field1525 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1528 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1035(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1036(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
