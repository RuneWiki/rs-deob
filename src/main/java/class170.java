import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class170 {
   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2600 = new String[]{method1577(method1576("UQ\u001a\u001a\u001b")), method1577(method1576("UQ\u001a\u0019\u001b"))};
   @OriginalMember(
      owner = "client!vf",
      name = "c",
      descriptor = "[Llja;"
   )
   public static class404[] field2599 = new class404[8];
   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "I"
   )
   public static int field2597;
   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "I"
   )
   public static int field2598;

   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "(IIFIIIZII)[[I",
      line = 10
   )
   public static final int[][] method1574(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
      boolean var9 = client.field1786;

      try {
         ++field2598;
         int[][] var10 = new int[arg4][arg5];
         class798 var11 = new class798();
         var11.field11607 = arg8;
         var11.field11617 = arg7;
         var11.field11609 = arg6;
         var11.field11613 = (int)((float)arg1 * arg2);
         var11.field11604 = arg0;
         var11.method275(false);
         class689.method5073(arg1 + -4097, arg5, arg4);
         int var12 = 0;
         if (var9) {
            var11.method5754(var12, var10[var12], 7194);
            ++var12;
         }

         while(true) {
            while(~arg4 < ~var12) {
               var11.method5754(var12, var10[var12], 7194);
               ++var12;
            }

            if (!var9) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field2600[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "(Z)V",
      line = 42
   )
   public static void method1575(boolean arg0) {
      try {
         if (arg0) {
            field2599 = null;
         }

         field2599 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2600[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1576(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1577(char[] arg0) {
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
            var10005 = 55;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
