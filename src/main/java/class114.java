import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class114 extends class15 {
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1513 = method1022(method1021("\u007f}\u0015B"));
   @OriginalMember(
      owner = "client!r",
      name = "s",
      descriptor = "I"
   )
   public static int field1511;
   @OriginalMember(
      owner = "client!r",
      name = "t",
      descriptor = "I"
   )
   public static int field1512;

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1020(int arg0, int arg1, int arg2) {
      try {
         ++field1511;
         int var3 = -30 % ((arg1 - -17) / 42);
         return class561.method4224(arg2, 33, arg0) | ~(arg2 & 458752) != -1 || class693.method5052(false, arg0, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1513 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1021(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1022(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
