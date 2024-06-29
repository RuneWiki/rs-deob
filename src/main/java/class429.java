import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class429 {
   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6142 = new String[]{method3175(method3174("|DDM~%")), method3175(method3174("|DDM}%"))};
   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field6139 = new class118(11, -1);
   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "D"
   )
   public static double field6140;
   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "I"
   )
   public static int field6141;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3172(byte arg0) {
      try {
         int var1 = 95 % ((-52 - arg0) / 62);
         field6139 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6142[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method3173(byte arg0, int arg1) {
      try {
         if (arg0 < 66) {
            method3173((byte)55, 71);
         }

         ++field6141;
         return arg1 & 255;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6142[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3174(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3175(char[] arg0) {
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
            var10005 = 38;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
