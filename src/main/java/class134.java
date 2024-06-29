import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class134 extends class247 {
   @OriginalMember(
      owner = "client!qca",
      name = "k",
      descriptor = "I"
   )
   public int field2186;
   @OriginalMember(
      owner = "client!qca",
      name = "j",
      descriptor = "I"
   )
   public int field2182;
   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2187 = new String[]{method1374(method1373("|\u000fO2\u007fd\u0002Gh}%")), method1374(method1373("|\u000fO2\u0002%"))};
   @OriginalMember(
      owner = "client!qca",
      name = "l",
      descriptor = "I"
   )
   public static int field2184 = -1;
   @OriginalMember(
      owner = "client!qca",
      name = "n",
      descriptor = "I"
   )
   public static int field2185;
   @OriginalMember(
      owner = "client!qca",
      name = "m",
      descriptor = "[Lma;"
   )
   public static class148[] field2183;

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1372(int arg0) {
      try {
         int var1 = 100 / ((60 - arg0) / 53);
         field2183 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2187[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class134(int arg0, int arg1) {
      try {
         this.field2186 = arg0;
         this.field2182 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2187[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1373(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1374(char[] arg0) {
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
            var10005 = 108;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
