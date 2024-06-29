import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class417 {
   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5999 = method3118(method3117("s&\u0003Ne"));
   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "I"
   )
   public static int field5998;

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3116(byte arg0) {
      try {
         ++field5998;
         class300.field4107.method3301(25349, class300.field4107.field6424, 1);
         class300.field4107.method3301(25349, class300.field4107.field6412, 1);
         class300.field4107.method3301(25349, class300.field4107.field6408, 2);
         class300.field4107.method3301(25349, class300.field4107.field6413, 2);
         class300.field4107.method3301(25349, class300.field4107.field6448, 1);
         class300.field4107.method3301(25349, class300.field4107.field6449, 1);
         class300.field4107.method3301(25349, class300.field4107.field6437, 1);
         class300.field4107.method3301(25349, class300.field4107.field6411, 1);
         class300.field4107.method3301(25349, class300.field4107.field6427, 1);
         class300.field4107.method3301(25349, class300.field4107.field6434, 1);
         class300.field4107.method3301(25349, class300.field4107.field6423, 1);
         class300.field4107.method3301(25349, class300.field4107.field6431, 1);
         class300.field4107.method3301(25349, class300.field4107.field6407, 0);
         class300.field4107.method3301(25349, class300.field4107.field6455, 1);
         class300.field4107.method3301(25349, class300.field4107.field6453, 0);
         if (arg0 > -76) {
            method3116((byte)50);
         }

         class300.field4107.method3301(25349, class300.field4107.field6421, 0);
         class300.field4107.method3301(25349, class300.field4107.field6436, 1);
         class300.field4107.method3301(25349, class300.field4107.field6429, 0);
         class300.field4107.method3301(25349, class300.field4107.field6450, 0);
         class11.method59(true);
         class300.field4107.method3301(25349, class300.field4107.field6444, 1);
         class300.field4107.method3301(25349, class300.field4107.field6432, 3);
         class793.method5717(5539);
         class85.method760(0);
         class101.field1292 = true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5999 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3117(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3118(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
