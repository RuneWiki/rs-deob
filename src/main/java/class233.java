import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class233 {
   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3406 = method1923(method1922("uK\u001649?"));
   @OriginalMember(
      owner = "client!bea",
      name = "c",
      descriptor = "I"
   )
   public static int field3403;
   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "I"
   )
   public static int field3404;
   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field3405;

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IIIII)V",
      line = 8
   )
   public static final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3403;
         int var5 = class432.field6255;
         int var6 = class741.field10679;
         if (class262.field3734) {
            var5 += class124.method1174((byte)-85);
            var6 += class745.method5410(104);
         }

         if (class395.field5807 == 1) {
            class476 var7 = class157.field2515[class534.field7783 / 100];
            var7.method3609(var5 + -8, var6 + -8);
            class670.method4896(var7.method3009() + (var5 - 8), 0, var5 + -8, var7.method3000() + var6 - 8, var6 + -8);
         }

         if (class395.field5807 == 2) {
            class476 var8 = class157.field2515[class534.field7783 / 100 + 4];
            var8.method3609(var5 + -8, var6 + -8);
            class670.method4896(var8.method3009() + var5 + -8, arg3 ^ 100, var5 + -8, var8.method3000() + var6 + -8, var6 - 8);
         }

         class331.method2568((byte)70);
         if (arg3 != 100) {
            method1921(5, 63, -125, 112, -63);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3406 + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1922(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1923(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
