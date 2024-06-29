import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class394 {
   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5802 = method3051(method3050("{DLQk"));
   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "I"
   )
   public static int field5800 = 0;
   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field5801 = new int[32];

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3049(byte arg0) {
      try {
         field5801 = null;
         if (arg0 != 59) {
            method3049((byte)-58);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5802 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3050(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3051(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
