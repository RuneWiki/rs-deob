import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class526 {
   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7537 = method3808(method3807("?\t/Wx"));
   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "I"
   )
   public int field7534;
   @OriginalMember(
      owner = "client!pi",
      name = "c",
      descriptor = "I"
   )
   public int field7535;
   @OriginalMember(
      owner = "client!pi",
      name = "d",
      descriptor = "I"
   )
   public int field7536;
   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "Lwe;"
   )
   public static class431 field7533;

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method3806(byte arg0) {
      try {
         field7533 = null;
         if (arg0 >= -6) {
            method3806((byte)-86);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7537 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3807(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3808(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
