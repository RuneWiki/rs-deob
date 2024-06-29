import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class354 {
   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4999 = method2720(method2719("\u000e=\n\t6"));
   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "Lfba;"
   )
   public static class27 field4998;

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2718(byte arg0) {
      try {
         field4998 = null;
         if (arg0 > -11) {
            field4998 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4999 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2719(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2720(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
