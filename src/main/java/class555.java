import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class555 extends class686 {
   @OriginalMember(
      owner = "client!uq",
      name = "n",
      descriptor = "I"
   )
   public int field7888;
   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7894 = new String[]{method4140(method4139("15H\u0001%*-\u0012\u0003d")), method4140(method4139("15H|d"))};
   @OriginalMember(
      owner = "client!uq",
      name = "p",
      descriptor = "Ldi;"
   )
   public static class577 field7889 = new class577(0, 1);
   @OriginalMember(
      owner = "client!uq",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field7891 = false;
   @OriginalMember(
      owner = "client!uq",
      name = "l",
      descriptor = "Lhha;"
   )
   public static class724 field7890 = new class724(103, -2);
   @OriginalMember(
      owner = "client!uq",
      name = "m",
      descriptor = "I"
   )
   public static int field7892;
   @OriginalMember(
      owner = "client!uq",
      name = "q",
      descriptor = "I"
   )
   public static int field7893;

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4138(boolean arg0) {
      try {
         if (!arg0) {
            method4138(true);
         }

         field7889 = null;
         field7890 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7894[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class555(int arg0) {
      try {
         this.field7888 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7894[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4139(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4140(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
