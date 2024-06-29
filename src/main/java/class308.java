import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class308 extends class282 {
   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4095 = method2316(method2315("mT\u0010yR\""));
   @OriginalMember(
      owner = "client!gga",
      name = "k",
      descriptor = "Lq;"
   )
   public static class454 field4093;
   @OriginalMember(
      owner = "client!gga",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field4094;

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2314(byte arg0) {
      try {
         field4093 = null;
         if (arg0 != -68) {
            method2314((byte)121);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4095 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2315(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2316(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
