import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class786 {
   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11441 = method5646(method5645("$1Lo2"));
   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "Lat;"
   )
   public static class396 field11440;
   @OriginalMember(
      owner = "client!lo",
      name = "b",
      descriptor = "Lha;"
   )
   public static class66 field11439;
   @OriginalMember(
      owner = "client!lo",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field11438;

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(B)V",
      line = 8
   )
   public static void method5644(byte arg0) {
      try {
         field11439 = null;
         if (arg0 > -61) {
            method5644((byte)116);
         }

         field11440 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11441 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5646(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
