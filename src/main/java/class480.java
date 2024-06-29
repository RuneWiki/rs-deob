import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class480 {
   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6680 = method3654(method3653("]\u0012L\u0004D"));
   @OriginalMember(
      owner = "client!jw",
      name = "b",
      descriptor = "[S"
   )
   private static short[] field6674 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!jw",
      name = "d",
      descriptor = "[S"
   )
   private static short[] field6676 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field6679 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!jw",
      name = "e",
      descriptor = "[S"
   )
   public static short[] field6675 = new short[]{44, 25, 49, 18, 5, 59, 4, 52};
   @OriginalMember(
      owner = "client!jw",
      name = "c",
      descriptor = "[[S"
   )
   public static short[][] field6678 = new short[][]{field6676, field6674, field6679};
   @OriginalMember(
      owner = "client!jw",
      name = "f",
      descriptor = "Lvia;"
   )
   public static class627 field6677 = new class627();

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3652(boolean arg0) {
      try {
         field6679 = null;
         field6675 = null;
         if (arg0) {
            method3652(true);
         }

         field6677 = null;
         field6678 = null;
         field6674 = null;
         field6676 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6680 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3653(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3654(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
