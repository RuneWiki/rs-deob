import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class560 extends class82 {
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8206 = method4220(method4219("2~?`A"));
   @OriginalMember(
      owner = "client!jh",
      name = "j",
      descriptor = "I"
   )
   public static int field8200 = 1;
   @OriginalMember(
      owner = "client!jh",
      name = "i",
      descriptor = "I"
   )
   public int field8197;
   @OriginalMember(
      owner = "client!jh",
      name = "k",
      descriptor = "I"
   )
   public int field8198;
   @OriginalMember(
      owner = "client!jh",
      name = "h",
      descriptor = "I"
   )
   public int field8201;
   @OriginalMember(
      owner = "client!jh",
      name = "l",
      descriptor = "I"
   )
   public int field8202;
   @OriginalMember(
      owner = "client!jh",
      name = "o",
      descriptor = "I"
   )
   public int field8203;
   @OriginalMember(
      owner = "client!jh",
      name = "m",
      descriptor = "I"
   )
   public int field8204;
   @OriginalMember(
      owner = "client!jh",
      name = "g",
      descriptor = "Lww;"
   )
   public static class339 field8199;
   @OriginalMember(
      owner = "client!jh",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public String field8205;

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4218(int arg0) {
      try {
         int var1 = -101 / ((-54 - arg0) / 33);
         field8199 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8206 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4219(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4220(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
