import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class638 {
   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9309 = method4676(method4675("\u0013\u0018-nK"));
   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field9306 = new class435(8, 1);
   @OriginalMember(
      owner = "client!te",
      name = "c",
      descriptor = "Lld;"
   )
   public static class178 field9308 = new class178(16);
   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "I"
   )
   public static int field9307;

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4674(int arg0) {
      try {
         field9306 = null;
         field9308 = null;
         if (arg0 != 1) {
            method4674(-46);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9309 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4675(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4676(char[] arg0) {
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
            var10005 = 125;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
