import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class316 {
   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4727 = method2568(method2567("\u0019jDDh"));
   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "[Lrf;"
   )
   public static class34[] field4724 = new class34[16];
   @OriginalMember(
      owner = "client!so",
      name = "e",
      descriptor = "Ldb;"
   )
   public static class685 field4723 = new class685(10, 8);
   @OriginalMember(
      owner = "client!so",
      name = "b",
      descriptor = "I"
   )
   public static int field4726 = -1;
   @OriginalMember(
      owner = "client!so",
      name = "d",
      descriptor = "I"
   )
   public static int field4725 = 0;
   @OriginalMember(
      owner = "client!so",
      name = "c",
      descriptor = "Lnp;"
   )
   public static class524 field4722;

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2566(byte arg0) {
      try {
         field4724 = null;
         field4723 = null;
         if (arg0 >= -110) {
            field4722 = null;
         }

         field4722 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4727 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(ILqea;)Lqea;"
   )
   public abstract class580 method2324(int arg0, class580 arg1);

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2568(char[] arg0) {
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
            var10005 = 5;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
