import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class353 {
   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5046 = method2778(method2777("r$W#{"));
   @OriginalMember(
      owner = "client!bb",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5044 = new String[8];
   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class378 field5038 = new class378(96, -2);
   @OriginalMember(
      owner = "client!bb",
      name = "d",
      descriptor = "I"
   )
   public static int field5042;
   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field5045;
   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "[B"
   )
   public byte[] field5040;
   @OriginalMember(
      owner = "client!bb",
      name = "e",
      descriptor = "[S"
   )
   public short[] field5039;
   @OriginalMember(
      owner = "client!bb",
      name = "g",
      descriptor = "[S"
   )
   public short[] field5041;
   @OriginalMember(
      owner = "client!bb",
      name = "h",
      descriptor = "[S"
   )
   public short[] field5043;

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2776(boolean arg0) {
      try {
         field5044 = null;
         if (arg0) {
            field5038 = null;
            field5045 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5046 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2777(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2778(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
