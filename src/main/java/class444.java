import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class444 extends class396 {
   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6158 = new String[]{method3301(method3300("8\u0015\u0011UY}")), method3301(method3300("8\u0015\u0011UZ}"))};
   @OriginalMember(
      owner = "client!mja",
      name = "j",
      descriptor = "I"
   )
   public static int field6157;
   @OriginalMember(
      owner = "client!mja",
      name = "i",
      descriptor = "Lwo;"
   )
   public static class778 field6156;

   @OriginalMember(
      owner = "client!mja",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3298(int arg0) {
      try {
         if (arg0 == 10543) {
            field6156 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6158[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(FI)F"
   )
   public static final float method3299(float arg0, int arg1) {
      try {
         ++field6157;
         if (arg1 != 6) {
            method3298(25);
         }

         return arg0 * arg0 * arg0 * ((arg0 * 6.0F + -15.0F) * arg0 + 10.0F);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6158[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3300(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3301(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
