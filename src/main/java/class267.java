import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class267 {
   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3379 = method2132(method2131("\u001c\u0005\u0013\u000f=B"));
   @OriginalMember(
      owner = "client!vga",
      name = "c",
      descriptor = "Llia;"
   )
   public static class633 field3376 = new class633(method2132(method2131("=6%h,")), method2132(method2131("\u0005\u0004\u0014H\u001f\u000f")), method2132(method2131("5\u0015\u001bQ")), 3);
   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "I"
   )
   public static int field3374;
   @OriginalMember(
      owner = "client!vga",
      name = "e",
      descriptor = "I"
   )
   public static int field3375;
   @OriginalMember(
      owner = "client!vga",
      name = "d",
      descriptor = "I"
   )
   public static int field3377;
   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "Let;"
   )
   public static class753 field3378;

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2130(int arg0) {
      try {
         field3376 = null;
         field3378 = null;
         if (arg0 != 3) {
            method2130(-50);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3379 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
