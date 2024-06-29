import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class450 extends class575 {
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6388 = method3290(method3289("\u0002DsC\u0011"));
   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "I"
   )
   public static int field6386 = -1;
   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "Lek;"
   )
   public static class536 field6387 = new class536(24, 4);
   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "I"
   )
   public static int field6385;

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method3288(int arg0) {
      try {
         if (arg0 >= 53) {
            field6387 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6388 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3289(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3290(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
