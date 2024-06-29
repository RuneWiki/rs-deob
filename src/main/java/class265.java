import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class265 {
   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3660 = new String[]{method2026(method2025("0D<\u0014n")), method2026(method2025("0D<\u0017n"))};
   @OriginalMember(
      owner = "client!sr",
      name = "e",
      descriptor = "Luda;"
   )
   public static class478 field3654 = new class478();
   @OriginalMember(
      owner = "client!sr",
      name = "f",
      descriptor = "I"
   )
   public static int field3657;
   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "Ld;"
   )
   public static class162 field3655;
   @OriginalMember(
      owner = "client!sr",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field3656;
   @OriginalMember(
      owner = "client!sr",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field3659;
   @OriginalMember(
      owner = "client!sr",
      name = "d",
      descriptor = "[Ls;"
   )
   public static class295[] field3658;

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2023(int arg0) {
      try {
         field3655 = null;
         field3658 = null;
         field3654 = null;
         field3659 = null;
         if (arg0 != 1000000) {
            method2024(-72, false, 47, 90);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3660[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(IZII)Lkf;"
   )
   public static final class266 method2024(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field3657;
         class342 var4 = null;
         if (class36.field516 != null) {
            var4 = new class342(arg3, class36.field516, class374.field5412[arg3], 1000000);
         }

         class101.field1295[arg3] = class488.field6969.method5608(arg3, class556.field7984, var4, 6);
         if (arg2 != 1000000) {
            method2023(-63);
         }

         class101.field1295[arg3].method3543(9);
         return new class266(class101.field1295[arg3], arg1, arg0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3660[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2025(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2026(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
