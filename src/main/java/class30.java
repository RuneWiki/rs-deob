import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class30 {
   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field437 = method368(method367(".\u007fR2Q"));
   @OriginalMember(
      owner = "client!ks",
      name = "b",
      descriptor = "I"
   )
   public static int field435 = 0;
   @OriginalMember(
      owner = "client!ks",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class398 field434 = new class398(16);
   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class39 field436;

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method366(byte arg0) {
      try {
         field436 = null;
         field434 = null;
         if (arg0 >= -91) {
            field435 = -45;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field437 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method367(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method368(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
