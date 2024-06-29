import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class511 {
   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7079 = method3712(method3711("\u00040$\r+O"));
   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "I"
   )
   public static int field7073 = 0;
   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "Lnw;"
   )
   public static class616 field7071 = new class616(12, 16);
   @OriginalMember(
      owner = "client!cga",
      name = "f",
      descriptor = "Lgka;"
   )
   public static class394 field7074 = new class394("", 16);
   @OriginalMember(
      owner = "client!cga",
      name = "c",
      descriptor = "[J"
   )
   public static long[] field7075 = new long[256];
   @OriginalMember(
      owner = "client!cga",
      name = "e",
      descriptor = "I"
   )
   public static int field7072;
   @OriginalMember(
      owner = "client!cga",
      name = "g",
      descriptor = "I"
   )
   public static int field7077;
   @OriginalMember(
      owner = "client!cga",
      name = "d",
      descriptor = "Lbo;"
   )
   public static class763 field7076;
   @OriginalMember(
      owner = "client!cga",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7078;

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3710(int arg0) {
      try {
         field7076 = null;
         field7071 = null;
         field7075 = null;
         field7074 = null;
         if (arg0 != 1) {
            field7077 = -39;
         }

         field7078 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7079 + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; ~var3 > -9; ++var3) {
            if (~(1L & var1) != -2L) {
               var1 >>>= 1;
            } else {
               var1 = -3932672073523589310L ^ var1 >>> 1;
            }
         }

         field7075[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3711(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3712(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
