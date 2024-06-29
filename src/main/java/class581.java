import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class581 {
   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8592 = new String[]{method4348(method4347("E\f D,")), method4348(method4347("E\f G,"))};
   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "Lcba;"
   )
   public static class95 field8588 = new class95();
   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "I"
   )
   public static int field8591 = 0;
   @OriginalMember(
      owner = "client!wg",
      name = "d",
      descriptor = "I"
   )
   public static int field8589;
   @OriginalMember(
      owner = "client!wg",
      name = "c",
      descriptor = "I"
   )
   public static int field8590;

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4345(int arg0, int arg1, int arg2) {
      try {
         ++field8589;
         if (arg0 != 393216) {
            method4346(-109);
         }

         return class208.method1716((byte)-91, arg1, arg2) | (arg1 & 393216) != 0 || class485.method3685(-19995, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8592[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4346(int arg0) {
      try {
         if (arg0 != -4854) {
            field8591 = 79;
         }

         field8588 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8592[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
