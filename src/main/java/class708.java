import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class708 {
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10166 = new String[]{method5151(method5150("(B~\r\u0002l")), method5151(method5150("(B~\r\u0001l"))};
   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field10162 = new class164(30, 7);
   @OriginalMember(
      owner = "client!lha",
      name = "d",
      descriptor = "S"
   )
   public static short field10163 = 256;
   @OriginalMember(
      owner = "client!lha",
      name = "e",
      descriptor = "I"
   )
   public static int field10165 = 0;
   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "I"
   )
   public static int field10161;
   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10164;

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5148(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            return true;
         } else {
            ++field10161;
            return class405.method3152(arg0, arg1, true) | ~(arg0 & 393216) != -1 || class266.method2276(arg0, arg1, arg2 ^ 10) || class119.method1159(arg0, 1, arg1);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10166[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5149(byte arg0) {
      try {
         field10162 = null;
         field10164 = null;
         int var1 = 113 % ((arg0 - 36) / 62);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10166[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5150(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5151(char[] arg0) {
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
            var10005 = 42;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
