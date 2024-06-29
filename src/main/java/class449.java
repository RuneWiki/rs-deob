import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class449 {
   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6885 = new String[]{method3529(method3528("opIL\u000b!")), method3529(method3528("opIL\b!"))};
   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "I"
   )
   public static int field6882 = -1;
   @OriginalMember(
      owner = "client!fka",
      name = "b",
      descriptor = "I"
   )
   public static int field6883;
   @OriginalMember(
      owner = "client!fka",
      name = "c",
      descriptor = "Lrr;"
   )
   public static class678 field6884;

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3526(byte arg0) {
      try {
         if (arg0 != 64) {
            field6882 = 37;
         }

         field6884 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6885[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3527(int arg0, int arg1, int arg2) {
      try {
         ++field6883;
         if (arg0 != 55) {
            field6884 = null;
         }

         return (55 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6885[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3528(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3529(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
