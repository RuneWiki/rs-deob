import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class266 {
   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3463 = new String[]{method2041(method2040("8\u0014\u000b|")), method2041(method2040("=\u0007ITw")), method2041(method2040("-OI>\"")), method2041(method2040("=\u0007ISw")), method2041(method2040("=\u0007IRw")), method2041(method2040("=\u0007IQw"))};
   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "Lkda;"
   )
   public static class411 field3457 = new class411();
   @OriginalMember(
      owner = "client!kf",
      name = "d",
      descriptor = "F"
   )
   public static float field3460;
   @OriginalMember(
      owner = "client!kf",
      name = "j",
      descriptor = "I"
   )
   public static int field3453;
   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "I"
   )
   public int field3454;
   @OriginalMember(
      owner = "client!kf",
      name = "h",
      descriptor = "I"
   )
   public static int field3455;
   @OriginalMember(
      owner = "client!kf",
      name = "f",
      descriptor = "I"
   )
   public int field3456;
   @OriginalMember(
      owner = "client!kf",
      name = "g",
      descriptor = "I"
   )
   public int field3458;
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "I"
   )
   public static int field3459;
   @OriginalMember(
      owner = "client!kf",
      name = "i",
      descriptor = "I"
   )
   public static int field3461;
   @OriginalMember(
      owner = "client!kf",
      name = "e",
      descriptor = "I"
   )
   public int field3462;

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2036(int arg0) {
      try {
         if (arg0 == -1) {
            field3457 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3463[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method2037(byte arg0) {
      try {
         ++field3459;
         if (arg0 > -7) {
            method2037((byte)112);
         }

         return ~class545.field7442 != -1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3463[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(Lkd;ILhq;IILha;ILdha;I)V"
   )
   public static final void method2038(class297 arg0, int arg1, class168 arg2, int arg3, int arg4, class65 arg5, int arg6, class84 arg7, int arg8) {
      boolean var9 = client.field4273;

      try {
         ++field3453;
         if (arg3 <= -11) {
            int var10 = arg1 - 5 + -(arg4 / 2);
            int var11 = arg6 - -2;
            if (arg0.field3919 != 0) {
               arg5.method510(3966, var11, var10, arg0.field3919, arg4 - -10, 1 + arg7.method825() * arg8 + arg6 - var11);
            }

            if (arg0.field3905 != 0) {
               arg5.method575(arg0.field3905, var11, arg4 - -10, -var11 + (arg6 - (-(arg8 * arg7.method825()) + -1)), 1, var10);
            }

            int var12 = arg0.field3927;
            if (arg2.field2119 && arg0.field3910 != -1) {
               var12 = arg0.field3910;
            }

            int var13 = 0;
            if (var9 || var13 < arg8) {
               do {
                  String var14 = class121.field1528[var13];
                  if (var13 < arg8 + -1) {
                     var14 = var14.substring(0, var14.length() + -4);
                  }

                  arg7.method822(arg5, var14, arg1, arg6, var12, true);
                  arg6 += arg7.method825();
                  ++var13;
               } while(var13 < arg8);

            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field3463[1] + (arg0 != null ? field3463[2] : field3463[0]) + ',' + arg1 + ',' + (arg2 != null ? field3463[2] : field3463[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3463[2] : field3463[0]) + ',' + arg6 + ',' + (arg7 != null ? field3463[2] : field3463[0]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(I)[Lro;"
   )
   public static final class2[] method2039(int arg0) {
      try {
         ++field3455;
         return arg0 < 111 ? null : new class2[]{class247.field3097, class139.field1828, class543.field7399};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3463[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2040(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2041(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
