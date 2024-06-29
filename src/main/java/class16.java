import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {
   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field295 = method119(method118("\u001f\tsm\u000e"));
   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "Lqh;"
   )
   public static class74 field292 = new class74();
   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "I"
   )
   public static int field293 = 0;
   @OriginalMember(
      owner = "client!ds",
      name = "c",
      descriptor = "I"
   )
   public static int field294 = 0;

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method117(byte arg0) {
      try {
         field292 = null;
         if (arg0 >= -104) {
            field293 = -20;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field295 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
