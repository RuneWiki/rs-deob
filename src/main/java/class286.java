import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class286 {
   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3962 = method2166(method2165("\u001eFN=Y"));
   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "I"
   )
   public static int field3958 = -1;
   @OriginalMember(
      owner = "client!kg",
      name = "d",
      descriptor = "Leg;"
   )
   public static class118 field3959 = new class118(133, -2);
   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "Lwu;"
   )
   public static class395 field3960 = new class395(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!kg",
      name = "c",
      descriptor = "I"
   )
   public static int field3957;
   @OriginalMember(
      owner = "client!kg",
      name = "e",
      descriptor = "Lci;"
   )
   public static class476 field3961;

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(I)V",
      line = 15
   )
   public static void method2164(int arg0) {
      try {
         if (arg0 == 13189) {
            field3961 = null;
            field3959 = null;
            field3960 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3962 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2165(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2166(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
