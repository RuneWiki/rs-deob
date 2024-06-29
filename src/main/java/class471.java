import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class471 extends class401 {
   @OriginalMember(
      owner = "client!ci",
      name = "t",
      descriptor = "[Ljq;"
   )
   public class535[] field6837;
   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6846 = new String[]{method3518(method3517("*\u001as`\u001c")), method3518(method3517("'\u00061K")), method3518(method3517("2]s\tI")), method3518(method3517("*\u001as\u001b]'\u001a)\u0019\u001c")), method3518(method3517("*\u001aso\u001c"))};
   @OriginalMember(
      owner = "client!ci",
      name = "o",
      descriptor = "Lgh;"
   )
   public static class572 field6838 = new class572(59, -2);
   @OriginalMember(
      owner = "client!ci",
      name = "m",
      descriptor = "Lqg;"
   )
   public static class485 field6841 = new class485(3, 2);
   @OriginalMember(
      owner = "client!ci",
      name = "r",
      descriptor = "I"
   )
   public static int field6843 = 0;
   @OriginalMember(
      owner = "client!ci",
      name = "l",
      descriptor = "Lgh;"
   )
   public static class572 field6842 = new class572(22, 8);
   @OriginalMember(
      owner = "client!ci",
      name = "s",
      descriptor = "Lgh;"
   )
   public static class572 field6844 = new class572(68, 3);
   @OriginalMember(
      owner = "client!ci",
      name = "p",
      descriptor = "Lld;"
   )
   public static class178 field6845 = new class178(16);
   @OriginalMember(
      owner = "client!ci",
      name = "n",
      descriptor = "I"
   )
   public static int field6839;
   @OriginalMember(
      owner = "client!ci",
      name = "q",
      descriptor = "I"
   )
   public static int field6840;

   @OriginalMember(
      owner = "client!ci",
      name = "<init>",
      descriptor = "([Ljq;)V"
   )
   public class471(class535[] arg0) {
      try {
         this.field6837 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6846[3] + (arg0 != null ? field6846[2] : field6846[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method3515(int arg0, String arg1) {
      try {
         if (arg0 < 95) {
            field6841 = null;
         }

         ++field6839;
         return arg1.length() - -2;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6846[4] + arg0 + ',' + (arg1 != null ? field6846[2] : field6846[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3516(int arg0) {
      try {
         if (arg0 > 110) {
            field6841 = null;
            field6844 = null;
            field6842 = null;
            field6845 = null;
            field6838 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6846[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
