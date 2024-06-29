import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class432 {
   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6657 = new String[]{method3416(method3415("Ia\r_^")), method3416(method3415("Ia\r\\^"))};
   @OriginalMember(
      owner = "client!lg",
      name = "c",
      descriptor = "Lfq;"
   )
   public static class374 field6655 = null;
   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "I"
   )
   public static int field6656;
   @OriginalMember(
      owner = "client!lg",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field6654;

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3413(int arg0) {
      try {
         field6655 = null;
         if (arg0 == 15731) {
            field6654 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6657[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(III)I",
      line = 16
   )
   public static final int method3414(int arg0, int arg1, int arg2) {
      try {
         ++field6656;
         if (arg1 != -1584834189) {
            return 50;
         } else {
            int var3 = arg2 * 57 + arg0;
            int var4 = var3 << 13 ^ var3;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return (var5 & 134047304) >> 19;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6657[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3415(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3416(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
