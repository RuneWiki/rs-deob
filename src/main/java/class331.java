import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class331 {
   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5021 = new String[]{method2702(method2701("\u001f\u000fcii")), method2702(method2701("\u0001\b!L")), method2702(method2701("\u0014Sc\u000e<")), method2702(method2701("\u001f\u000fcfi")), method2702(method2701("\u001f\u000fcgi")), method2702(method2701("\u001f\u000fchi"))};
   @OriginalMember(
      owner = "client!pr",
      name = "d",
      descriptor = "Ljl;"
   )
   public static class133 field5019 = new class133();
   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "I"
   )
   public static int field5016;
   @OriginalMember(
      owner = "client!pr",
      name = "c",
      descriptor = "I"
   )
   public static int field5017;
   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "I"
   )
   public static int field5018;
   @OriginalMember(
      owner = "client!pr",
      name = "e",
      descriptor = "Lrr;"
   )
   public static class678 field5020;

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(IZ[IIIILc;I)Lqk;",
      line = 4
   )
   public static final class419 method2697(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, class652 arg6, int arg7) {
      try {
         if (arg4 != -26853) {
            method2698(33);
         }

         ++field5016;
         if (!arg6.field9652 && (!class140.method1285(arg3, -11925) || !class140.method1285(arg7, -11925))) {
            return !arg6.field9700 ? new class419(arg6, arg3, arg7, class510.method3964(arg3, (byte)116), class510.method3964(arg7, (byte)125), arg2) : new class419(arg6, 34037, arg3, arg7, arg1, arg2, arg5, arg0);
         } else {
            return new class419(arg6, 3553, arg3, arg7, arg1, arg2, arg5, arg0);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5021[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5021[2] : field5021[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5021[2] : field5021[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(I)V",
      line = 30
   )
   public static final void method2698(int arg0) {
      try {
         class471.field7172 = null;
         ++field5018;
         if (arg0 != 0) {
            method2697(-108, false, (int[])null, -100, 9, 117, (class652)null, -49);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5021[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "(I)V",
      line = 41
   )
   public static void method2699(int arg0) {
      try {
         if (arg0 == 18597) {
            field5019 = null;
            field5020 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5021[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "([II[Ljava/lang/String;)V",
      line = 57
   )
   public static final void method2700(int[] arg0, int arg1, String[] arg2) {
      try {
         class761.method5572(arg2, -6147, arg0, arg1, arg2.length + -1);
         ++field5017;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5021[5] + (arg0 != null ? field5021[2] : field5021[1]) + ',' + arg1 + ',' + (arg2 != null ? field5021[2] : field5021[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2701(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2702(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
