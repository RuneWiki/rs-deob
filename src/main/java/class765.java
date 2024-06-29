import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class765 {
   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11194 = method5541(method5540("r%(\u0015O"));
   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field11192 = new int[4096];
   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "I"
   )
   public static int field11193;
   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "Ld;"
   )
   public static class102 field11191;

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5539(byte arg0) {
      try {
         field11191 = null;
         field11192 = null;
         if (arg0 > -18) {
            field11191 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11194 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5540(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5541(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
