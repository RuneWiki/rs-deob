import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class505 extends class673 {
   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7045 = new String[]{method3820(method3819("[33We")), method3820(method3819("B/qr")), method3820(method3819("Wt300")), method3820(method3819("[33Ue")), method3820(method3819("C*xp'_")), method3820(method3819("[33Te"))};
   @OriginalMember(
      owner = "client!wi",
      name = "p",
      descriptor = "I"
   )
   public static int field7042 = class291.method2349((byte)121, 1600);
   @OriginalMember(
      owner = "client!wi",
      name = "n",
      descriptor = "Laka;"
   )
   public static class418 field7044 = new class418(16, 7);
   @OriginalMember(
      owner = "client!wi",
      name = "m",
      descriptor = "I"
   )
   public static int field7040;
   @OriginalMember(
      owner = "client!wi",
      name = "l",
      descriptor = "I"
   )
   public static int field7041;
   @OriginalMember(
      owner = "client!wi",
      name = "o",
      descriptor = "I"
   )
   public static int field7043;

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3816(int arg0, int arg1) {
      try {
         int var2 = 51 % ((arg0 - 20) / 47);
         ++field7043;
         if (~arg1 != -54 && arg1 != 23 && arg1 != 8 && ~arg1 != -52 && ~arg1 != -48) {
            return ~arg1 == -11 || ~arg1 == -1012;
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7045[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3817(byte arg0) {
      try {
         field7044 = null;
         int var1 = 108 % ((arg0 - 55) / 32);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7045[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(B)J"
   )
   public abstract long method1555(byte arg0);

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method1553(int arg0);

   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "(B)I"
   )
   public abstract int method1554(byte arg0);

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method1557(int arg0);

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method1556(boolean arg0);

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(ILgj;BLjava/lang/String;)Lit;"
   )
   public static final class769 method3818(int arg0, class736 arg1, byte arg2, String arg3) {
      try {
         if (arg2 != 97) {
            return null;
         } else {
            ++field7041;
            return class650.method4780(arg1, field7045[4], (byte)11, arg3, arg0);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7045[3] + arg0 + ',' + (arg1 != null ? field7045[2] : field7045[1]) + ',' + arg2 + ',' + (arg3 != null ? field7045[2] : field7045[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3819(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3820(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
