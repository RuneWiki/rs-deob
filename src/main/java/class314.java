import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class314 {
   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4862 = method2607(method2606("\tR\u001e0NV"));
   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4856 = new int[32];
   @OriginalMember(
      owner = "client!wda",
      name = "d",
      descriptor = "I"
   )
   public static int field4859 = 0;
   @OriginalMember(
      owner = "client!wda",
      name = "b",
      descriptor = "I"
   )
   public static int field4860 = 100;
   @OriginalMember(
      owner = "client!wda",
      name = "c",
      descriptor = "I"
   )
   public static int field4857;
   @OriginalMember(
      owner = "client!wda",
      name = "e",
      descriptor = "Lvca;"
   )
   public static class365 field4858;
   @OriginalMember(
      owner = "client!wda",
      name = "f",
      descriptor = "Lffa;"
   )
   public static class657 field4861;

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2605(int arg0) {
      try {
         field4861 = null;
         field4858 = null;
         if (arg0 == 32) {
            field4856 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4862 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2606(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2607(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
