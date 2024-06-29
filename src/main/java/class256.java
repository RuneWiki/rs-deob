import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class256 {
   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3637 = method2055(method2054("d8&2O"));
   @OriginalMember(
      owner = "client!nj",
      name = "b",
      descriptor = "I"
   )
   public static int field3634;
   @OriginalMember(
      owner = "client!nj",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field3635;
   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "[Llja;"
   )
   public static class743[] field3636;

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2053(int arg0) {
      try {
         field3636 = null;
         field3635 = null;
         if (arg0 != -1403) {
            method2053(116);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3637 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2054(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2055(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
