import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class756 {
   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10970 = method5447(method5446("|\nsj\u007f"));
   @OriginalMember(
      owner = "client!wn",
      name = "d",
      descriptor = "I"
   )
   public static int field10967 = -1;
   @OriginalMember(
      owner = "client!wn",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field10965 = new int[50];
   @OriginalMember(
      owner = "client!wn",
      name = "c",
      descriptor = "I"
   )
   public static int field10968 = 1;
   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "I"
   )
   public static int field10966;
   @OriginalMember(
      owner = "client!wn",
      name = "e",
      descriptor = "[Z"
   )
   public static boolean[] field10969;

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5445(int arg0) {
      try {
         field10965 = null;
         if (arg0 > 62) {
            field10969 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10970 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5446(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5447(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
