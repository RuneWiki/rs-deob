import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class490 extends class22 {
   @OriginalMember(
      owner = "client!cq",
      name = "l",
      descriptor = "Liw;"
   )
   public class332 field7146 = new class332();
   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7151 = new String[]{method3705(method3704("LRYGd")), method3705(method3704("T\rY+1")), method3705(method3704("AV\u001bi")), method3705(method3704("LRYDd")), method3705(method3704("LRYFd")), method3705(method3704("LRYAd"))};
   @OriginalMember(
      owner = "client!cq",
      name = "k",
      descriptor = "Leb;"
   )
   public static class650 field7147 = new class650(1, 7);
   @OriginalMember(
      owner = "client!cq",
      name = "p",
      descriptor = "I"
   )
   public static int field7144;
   @OriginalMember(
      owner = "client!cq",
      name = "o",
      descriptor = "I"
   )
   public static int field7145;
   @OriginalMember(
      owner = "client!cq",
      name = "j",
      descriptor = "I"
   )
   public static int field7148;
   @OriginalMember(
      owner = "client!cq",
      name = "n",
      descriptor = "I"
   )
   public static int field7149;
   @OriginalMember(
      owner = "client!cq",
      name = "m",
      descriptor = "Lclient;"
   )
   public static client field7150;

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3700(int arg0) {
      try {
         field7150 = null;
         if (arg0 != 1) {
            method3702(32, 97, 67, 5, -54, -23, (class65)null, (byte[][][])null, -39, -98, -110, -124, -71);
         }

         field7147 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7151[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method3701(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7151[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(IIIIIILha;[[[BIIIII)V"
   )
   public static final void method3702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class65 arg6, byte[][][] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field7145;
         if (~arg4 != -1 && ~arg2 != -1) {
            if (~arg4 == -10) {
               arg4 = 1;
               arg10 = arg10 + 1 & 3;
            }

            if (arg4 == 10) {
               arg10 = arg10 - -3 & 3;
               arg4 = 1;
            }

            if (arg4 == 11) {
               arg4 = 8;
               arg10 = 3 & arg10 + 3;
            }

            arg6.method425(arg11, arg9, arg5, arg12, arg3, arg1, arg7[arg4 + arg8][arg10], arg2, arg0);
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7151[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7151[1] : field7151[2]) + ',' + (arg7 != null ? field7151[1] : field7151[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3703(int arg0, int arg1, byte arg2) {
      try {
         ++field7148;
         if (arg2 != -55) {
            return false;
         } else {
            return (384 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7151[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3704(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3705(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
