import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class577 {
   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7924 = new String[]{method4151(method4150("B2v\u0006}")), method4151(method4150("B2v\u0005}"))};
   @OriginalMember(
      owner = "client!el",
      name = "c",
      descriptor = "I"
   )
   public static int field7921;
   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "I"
   )
   public static int field7922;
   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "Lbu;"
   )
   public static class21 field7923;

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4148(int arg0) {
      try {
         if (arg0 == 2) {
            field7923 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7924[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public static final boolean method4149(boolean arg0, int arg1) {
      try {
         ++field7921;
         if (!arg0) {
            method4149(true, 89);
         }

         return arg1 == 2 || ~arg1 == -14 || ~arg1 == -1012 || ~arg1 == -7 || arg1 == 50;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7924[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4150(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4151(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
