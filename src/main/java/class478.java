import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class478 extends class15 {
   @OriginalMember(
      owner = "client!ug",
      name = "s",
      descriptor = "Lada;"
   )
   public class268 field6650;
   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6652 = new String[]{method3634(method3633("og{>\u001d")), method3634(method3633("z<9|")), method3634(method3633("a.{,\tz !.H")), method3634(method3633("a.{QH"))};
   @OriginalMember(
      owner = "client!ug",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field6651 = new int[6];

   @OriginalMember(
      owner = "client!ug",
      name = "<init>",
      descriptor = "(Lada;)V"
   )
   public class478(class268 arg0) {
      try {
         this.field6650 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6652[2] + (arg0 != null ? field6652[0] : field6652[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3632(int arg0) {
      try {
         int var1 = -33 % ((-55 - arg0) / 40);
         field6651 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6652[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3633(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3634(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
