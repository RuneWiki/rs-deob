import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class91 extends class22 {
   @OriginalMember(
      owner = "client!rf",
      name = "j",
      descriptor = "I"
   )
   public volatile int field1487 = -1;
   @OriginalMember(
      owner = "client!rf",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field1488;
   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1489 = new String[]{method893(method892("5An\u007f")), method893(method892(" \u001a,=1")), method893(method892(")R,/%5]v-d"))};
   @OriginalMember(
      owner = "client!rf",
      name = "k",
      descriptor = "I"
   )
   public static int field1486 = 0;

   @OriginalMember(
      owner = "client!rf",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 14
   )
   public class91(String arg0) {
      try {
         this.field1488 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1489[2] + (arg0 != null ? field1489[1] : field1489[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method892(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method893(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
