import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public abstract class class328 extends class676 {
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4481 = method2433(method2432("t]T/g-"));
   @OriginalMember(
      owner = "client!qja",
      name = "g",
      descriptor = "Lgo;"
   )
   public static class656 field4475 = new class656();
   @OriginalMember(
      owner = "client!qja",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field4476 = false;
   @OriginalMember(
      owner = "client!qja",
      name = "f",
      descriptor = "Lek;"
   )
   public static class536 field4477 = new class536(45, 4);
   @OriginalMember(
      owner = "client!qja",
      name = "i",
      descriptor = "Laga;"
   )
   public static class696 field4478 = new class696(128);
   @OriginalMember(
      owner = "client!qja",
      name = "e",
      descriptor = "Lwv;"
   )
   public static class37 field4479 = new class37(64);
   @OriginalMember(
      owner = "client!qja",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field4480 = false;

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(B)Lofa;"
   )
   public abstract class349 method2195(byte arg0);

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2431(boolean arg0) {
      try {
         if (!arg0) {
            field4475 = null;
            field4477 = null;
            field4479 = null;
            field4478 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4481 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2432(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2433(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
