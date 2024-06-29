import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public abstract class class119 extends class386 {
   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1938 = method1131(method1130("Q\u000e+)v\u0013"));
   @OriginalMember(
      owner = "client!jja",
      name = "i",
      descriptor = "Lgh;"
   )
   public static class572 field1936 = new class572(103, 4);
   @OriginalMember(
      owner = "client!jja",
      name = "h",
      descriptor = "F"
   )
   public static float field1937;
   @OriginalMember(
      owner = "client!jja",
      name = "j",
      descriptor = "I"
   )
   public static int field1935;

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(I)Lma;"
   )
   public abstract class14 method1128(int arg0);

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1129(byte arg0) {
      try {
         field1936 = null;
         if (arg0 != -28) {
            method1129((byte)33);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1938 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1130(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1131(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
