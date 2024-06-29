import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class class382 {
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5577 = method2981(method2980("~<R8:"));
   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "F"
   )
   public static float field5575;
   @OriginalMember(
      owner = "client!ns",
      name = "b",
      descriptor = "I"
   )
   public static int field5574;
   @OriginalMember(
      owner = "client!ns",
      name = "c",
      descriptor = "I"
   )
   public static int field5576;

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2979(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 32768) {
            field5575 = 0.40984732F;
         }

         ++field5576;
         return ~(arg1 & 32768) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5577 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2980(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2981(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
