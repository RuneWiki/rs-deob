import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class497 {
   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6958 = new String[]{method3784(method3783("\u0005\u0006k\u0002|")), method3784(method3783("\u0005\u0006k\u0001|"))};
   @OriginalMember(
      owner = "client!aq",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field6955 = false;
   @OriginalMember(
      owner = "client!aq",
      name = "c",
      descriptor = "[C"
   )
   public static char[] field6956 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "I"
   )
   public static int field6957;
   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "Lha;"
   )
   public static class479 field6954;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(IIIIIIZ)V"
   )
   public static final void method3781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      try {
         ++field6957;
         if (arg6) {
            field6956 = null;
         }

         if (~class757.field11093.field10993.method3351(-18033) != -1 && arg3 != 0 && class128.field1640 < 50 && ~arg2 != 0) {
            client.field1479[class128.field1640++] = new class142((byte)1, arg2, arg3, arg0, arg5, arg1, arg4, (class713)null);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6958[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3782(int arg0) {
      try {
         field6954 = null;
         if (arg0 > -90) {
            field6956 = null;
         }

         field6956 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6958[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3783(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3784(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
