import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class392 {
   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5786 = method3044(method3043("FY6e\u0000"));
   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field5781 = new class74();
   @OriginalMember(
      owner = "client!bk",
      name = "e",
      descriptor = "Lpg;"
   )
   public static class762 field5784 = new class762(method3044(method3043("sfOmx")), method3044(method3043("KT~MKA")), method3044(method3043("{EqT")), 3);
   @OriginalMember(
      owner = "client!bk",
      name = "c",
      descriptor = "I"
   )
   public static int field5785 = 0;
   @OriginalMember(
      owner = "client!bk",
      name = "d",
      descriptor = "Lhw;"
   )
   public static class141 field5782;
   @OriginalMember(
      owner = "client!bk",
      name = "b",
      descriptor = "Lhw;"
   )
   public static class141 field5783;

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3042(int arg0) {
      try {
         field5784 = null;
         field5783 = null;
         field5781 = null;
         if (arg0 != 16384) {
            field5783 = null;
         }

         field5782 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5786 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
