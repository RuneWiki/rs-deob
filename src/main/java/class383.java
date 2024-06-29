import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class383 {
   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6044 = method3111(method3110("\\;\u0004[<"));
   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field6041 = new class113(69, 8);
   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field6043 = new int[1];
   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "D"
   )
   public static double field6042;

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method3109(byte arg0) {
      try {
         if (arg0 != 3) {
            method3109((byte)111);
         }

         field6041 = null;
         field6043 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6044 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3110(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3111(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
