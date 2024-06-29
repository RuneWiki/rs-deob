import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class551 {
   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7901 = new String[]{method3958(method3957("qE\u0002\u001d\u007f;")), method3958(method3957("qE\u0002\u001d|;"))};
   @OriginalMember(
      owner = "client!baa",
      name = "c",
      descriptor = "Loi;"
   )
   public static class80 field7898 = new class80(5);
   @OriginalMember(
      owner = "client!baa",
      name = "e",
      descriptor = "F"
   )
   public static float field7900;
   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "I"
   )
   public int field7896;
   @OriginalMember(
      owner = "client!baa",
      name = "f",
      descriptor = "I"
   )
   public static int field7899;
   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "Lfja;"
   )
   public class785 field7897;
   @OriginalMember(
      owner = "client!baa",
      name = "d",
      descriptor = "[I"
   )
   public int[] field7895;

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(ZFIFF)F"
   )
   public static final float method3955(boolean arg0, float arg1, int arg2, float arg3, float arg4) {
      try {
         ++field7899;
         if (!arg0) {
            method3955(false, 2.0908277F, 6, -1.217894F, -0.1399425F);
         }

         float[] var5 = class287.field3973[arg2];
         return var5[2] * arg3 + var5[1] * arg4 + var5[0] * arg1;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7901[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3956(int arg0) {
      try {
         if (arg0 == 5) {
            field7898 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7901[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3957(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3958(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
