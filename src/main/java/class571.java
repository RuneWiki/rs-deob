import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class571 {
   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8396 = method4294(method4293("tU)>\u0016"));
   @OriginalMember(
      owner = "client!sv",
      name = "c",
      descriptor = "I"
   )
   public static int field8393 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "I"
   )
   public static int field8394;
   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "I"
   )
   public static int field8395;

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4292(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 256) {
            return false;
         } else {
            ++field8394;
            return (arg1 & 256) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8396 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4293(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4294(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
