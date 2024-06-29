import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class575 {
   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8512 = method4185(method4184("_p?['"));
   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "I"
   )
   public static int field8511;

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(BI)V",
      line = 10
   )
   public static final void method4183(byte arg0, int arg1) {
      try {
         if (arg0 == -61) {
            ++field8511;
            class649.field9476 = arg1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8512 + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4184(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4185(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 17;
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
