import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class253 {
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3613 = new String[]{method2044(method2043("Jr]S/")), method2044(method2043("Fm\u001f~")), method2044(method2043("Jr]P/")), method2044(method2043("S6]<z"))};
   @OriginalMember(
      owner = "client!bj",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field3611 = new int[4096];
   @OriginalMember(
      owner = "client!bj",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class572 field3610 = new class572(72, -1);
   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "J"
   )
   public static volatile long field3612 = 0L;
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "I"
   )
   public static int field3609;
   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "[[Ljfa;"
   )
   public static class303[][] field3608;

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(FIFII[BIFFFILiha;I)V",
      line = 3
   )
   public static final void method2041(float arg0, int arg1, float arg2, int arg3, int arg4, byte[] arg5, int arg6, float arg7, float arg8, float arg9, int arg10, class32 arg11, int arg12) {
      boolean var13 = client.field4564;

      try {
         int var14 = 0;
         if (var13) {
            class315.method2442(arg8, arg3, arg1, arg7, arg5, arg0, var14, arg2, arg11, arg4, arg6, (byte)-89, arg9, arg12);
            arg12 += arg4 * arg6;
            ++var14;
         }

         while(true) {
            while(~arg3 < ~var14) {
               class315.method2442(arg8, arg3, arg1, arg7, arg5, arg0, var14, arg2, arg11, arg4, arg6, (byte)-89, arg9, arg12);
               arg12 += arg4 * arg6;
               ++var14;
            }

            if (!var13) {
               if (arg10 != -1814) {
                  field3610 = null;
               }

               ++field3609;
               return;
            }

            arg12 = arg10 + -1814;
            ++var14;
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field3613[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3613[3] : field3613[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field3613[3] : field3613[1]) + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I)V",
      line = 27
   )
   public static void method2042(int arg0) {
      try {
         field3608 = null;
         if (arg0 != 0) {
            method2042(60);
         }

         field3610 = null;
         field3611 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3613[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
