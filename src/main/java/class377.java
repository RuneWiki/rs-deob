import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class377 {
   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5989 = method3086(method3085("\u0010^k[X\u0017f~\u0007E\u0016R\""));
   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "I"
   )
   public static int field5987 = 0;
   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "I"
   )
   public static int field5988;

   @OriginalMember(
      owner = "client!hka",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5988;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5989 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class377(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3085(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3086(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
