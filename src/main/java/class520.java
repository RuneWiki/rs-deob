import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class520 {
   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7584 = new String[]{method3927(method3926("71Eb\t")), method3927(method3926("71Ea\t"))};
   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "Lld;"
   )
   public static class178 field7582 = new class178(8);
   @OriginalMember(
      owner = "client!va",
      name = "b",
      descriptor = "I"
   )
   public static int field7583;

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(B)V",
      line = 14
   )
   public static void method3924(byte arg0) {
      try {
         field7582 = null;
         int var1 = 65 / ((arg0 - -78) / 33);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7584[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(III)Z",
      line = 24
   )
   public static final boolean method3925(int arg0, int arg1, int arg2) {
      try {
         int var3 = -26 / ((arg0 - -37) / 53);
         ++field7583;
         return (65536 & arg2) != 0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7584[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3926(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3927(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
