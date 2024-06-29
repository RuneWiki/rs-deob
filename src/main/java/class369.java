import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class369 extends class673 {
   @OriginalMember(
      owner = "client!dha",
      name = "l",
      descriptor = "S"
   )
   public short field5148;
   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5150 = new String[]{method2914(method2913("\u00032\tCw\u000e4\u0001\u0019uO")), method2914(method2913("\u00032\tC\nO"))};
   @OriginalMember(
      owner = "client!dha",
      name = "m",
      descriptor = "I"
   )
   public static int field5149;

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "()V"
   )
   public class369() {
   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(S)V"
   )
   public class369(short arg0) {
      try {
         this.field5148 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5150[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(BI)Laca;"
   )
   public static final class608 method2912(byte arg0, int arg1) {
      try {
         ++field5149;
         if (arg1 >= 0 && arg1 < 100) {
            return arg0 != -66 ? null : class458.field6304[arg1];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5150[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
