import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class718 {
   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10374 = new String[]{method5194(method5193("!\u0019fhY")), method5194(method5193("!\u0019fkY"))};
   @OriginalMember(
      owner = "client!hg",
      name = "c",
      descriptor = "[Z"
   )
   public static boolean[] field10370 = new boolean[5];
   @OriginalMember(
      owner = "client!hg",
      name = "d",
      descriptor = "I"
   )
   public static int field10372 = 0;
   @OriginalMember(
      owner = "client!hg",
      name = "e",
      descriptor = "I"
   )
   public static int field10373 = 0;
   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "I"
   )
   public static int field10371;
   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "Ldfa;"
   )
   public static class173 field10369;

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(IIZII)Lev;",
      line = 3
   )
   public static final class719 method5191(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field10371;
         class719 var5 = new class719();
         var5.field10379 = arg0;
         var5.field10375 = arg4;
         class520.field7582.method1566(var5, 24742, (long)arg1);
         class197.method1703(arg4, true);
         class303 var6 = class532.method3986(true, arg1);
         if (var6 != null) {
            class322.method2512(16, var6);
         }

         if (class581.field8351 != null) {
            class322.method2512(16, class581.field8351);
            class581.field8351 = null;
         }

         if (arg3 >= -54) {
            return null;
         } else {
            class584.method4333(true);
            if (var6 != null) {
               class248.method2018(var6, !arg2, true);
            }

            if (!arg2) {
               class161.method1468(arg4);
            }

            if (!arg2 && ~class277.field3907 != 0) {
               class725.method5247((byte)3, 1, class277.field3907);
            }

            return var5;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10374[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Z)V",
      line = 51
   )
   public static void method5192(boolean arg0) {
      try {
         field10369 = null;
         field10370 = null;
         if (!arg0) {
            method5192(true);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10374[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5193(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5194(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
