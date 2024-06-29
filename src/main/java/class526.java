import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class526 {
   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7677 = method3948(method3947("!\u000b)5z"));
   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "[Lhca;"
   )
   public static class513[] field7676 = new class513[14];
   @OriginalMember(
      owner = "client!is",
      name = "c",
      descriptor = "I"
   )
   public static int field7674;
   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "Ltk;"
   )
   public static class360 field7675;

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method3946(int arg0) {
      try {
         if (arg0 == -22) {
            field7675 = null;
            field7676 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7677 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3947(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3948(char[] arg0) {
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
            var10005 = 120;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
