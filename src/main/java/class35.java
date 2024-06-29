import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class35 {
   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field424 = new String[]{method257(method256("RJ^tc\u000b")), method257(method256("RJ^t`\u000b"))};
   @OriginalMember(
      owner = "client!qea",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field420 = new int[6];
   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "I"
   )
   public static int field421;
   @OriginalMember(
      owner = "client!qea",
      name = "d",
      descriptor = "I"
   )
   public static int field422;
   @OriginalMember(
      owner = "client!qea",
      name = "b",
      descriptor = "[Lcl;"
   )
   public static class141[] field423;

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(FB)F"
   )
   public static final float method254(float arg0, byte arg1) {
      try {
         int var2 = -120 / ((arg1 - 7) / 59);
         ++field422;
         return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field424[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method255(int arg0) {
      try {
         field423 = null;
         field420 = null;
         if (arg0 != 24481) {
            method255(120);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field424[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
