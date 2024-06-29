import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class523 extends class247 {
   @OriginalMember(
      owner = "client!tf",
      name = "l",
      descriptor = "Z"
   )
   public boolean field7405 = false;
   @OriginalMember(
      owner = "client!tf",
      name = "s",
      descriptor = "Z"
   )
   public boolean field7402 = true;
   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7408 = new String[]{method3920(method3919("i8M;")), method3920(method3919("s+\u000f\u0016U")), method3920(method3919("|c\u000fy\u0000"))};
   @OriginalMember(
      owner = "client!tf",
      name = "n",
      descriptor = "I"
   )
   public int field7394;
   @OriginalMember(
      owner = "client!tf",
      name = "q",
      descriptor = "I"
   )
   public int field7395;
   @OriginalMember(
      owner = "client!tf",
      name = "m",
      descriptor = "I"
   )
   public int field7396;
   @OriginalMember(
      owner = "client!tf",
      name = "r",
      descriptor = "I"
   )
   public int field7397;
   @OriginalMember(
      owner = "client!tf",
      name = "k",
      descriptor = "I"
   )
   public int field7398;
   @OriginalMember(
      owner = "client!tf",
      name = "w",
      descriptor = "I"
   )
   public int field7399;
   @OriginalMember(
      owner = "client!tf",
      name = "j",
      descriptor = "I"
   )
   public int field7400;
   @OriginalMember(
      owner = "client!tf",
      name = "t",
      descriptor = "I"
   )
   public int field7401;
   @OriginalMember(
      owner = "client!tf",
      name = "p",
      descriptor = "I"
   )
   public int field7403;
   @OriginalMember(
      owner = "client!tf",
      name = "v",
      descriptor = "I"
   )
   public static int field7404;
   @OriginalMember(
      owner = "client!tf",
      name = "u",
      descriptor = "I"
   )
   public int field7407;
   @OriginalMember(
      owner = "client!tf",
      name = "o",
      descriptor = "Lcn;"
   )
   public class468 field7406;

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IIIIIIII[[[BLha;III)V"
   )
   public static final void method3918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[][][] arg8, class17 arg9, int arg10, int arg11, int arg12) {
      try {
         ++field7404;
         if (arg0 != arg12 && arg1 != 0) {
            if (~arg12 == -10) {
               arg12 = 1;
               arg10 = 3 & arg10 + 1;
            }

            if (~arg12 == -11) {
               arg10 = 3 & arg10 + 3;
               arg12 = 1;
            }

            if (~arg12 == -12) {
               arg12 = 8;
               arg10 = arg10 + 3 & 3;
            }

            arg9.method258(arg5, arg7, arg2, arg6, arg3, arg4, arg8[arg12 + -1][arg10], arg1, arg11);
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field7408[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7408[2] : field7408[0]) + ',' + (arg9 != null ? field7408[2] : field7408[0]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3919(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3920(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
