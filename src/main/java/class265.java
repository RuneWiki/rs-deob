import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class265 extends class648 {
   @OriginalMember(
      owner = "client!w",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4340 = new String[]{method2292(method2291("J\u0005\u001e_")), method2292(method2291("_^\\\u001d!")), method2292(method2291("S^1\u001b")), method2292(method2291("S^0\u001b")), method2292(method2291("S^6\u001b")), method2292(method2291("S^3\u001b"))};
   @OriginalMember(
      owner = "client!w",
      name = "y",
      descriptor = "Ljw;"
   )
   public static class779 field4333 = new class779(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "I"
   )
   public static int field4336 = 0;
   @OriginalMember(
      owner = "client!w",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field4339 = new int[2];
   @OriginalMember(
      owner = "client!w",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field4338 = new int[8];
   @OriginalMember(
      owner = "client!w",
      name = "E",
      descriptor = "Luk;"
   )
   public static class498 field4335 = new class498(53, 3);
   @OriginalMember(
      owner = "client!w",
      name = "x",
      descriptor = "I"
   )
   public static int field4331;
   @OriginalMember(
      owner = "client!w",
      name = "C",
      descriptor = "I"
   )
   public static int field4332;
   @OriginalMember(
      owner = "client!w",
      name = "B",
      descriptor = "I"
   )
   public static int field4334;
   @OriginalMember(
      owner = "client!w",
      name = "F",
      descriptor = "I"
   )
   public static int field4337;
   @OriginalMember(
      owner = "client!w",
      name = "D",
      descriptor = "[B"
   )
   private byte[] field4330;

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(IIZI)[B"
   )
   public final byte[] method2287(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field4337;
         if (!arg2) {
            field4338 = null;
         }

         this.field4330 = new byte[arg0 * arg1 * arg3 * 2];
         this.method4171(arg3, arg0, !arg2, arg1);
         return this.field4330;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4340[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(IIIIIIILha;IILds;I)V"
   )
   public static final void method2288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class610 arg7, int arg8, int arg9, class525 arg10, int arg11) {
      try {
         if (arg9 < arg8 && ~arg8 > ~(arg9 - -arg5) && ~(arg4 + -13) > ~arg1 && arg1 < arg4 + 3) {
            arg0 = arg6;
         }

         ++field4334;
         String var12 = class639.method4664(arg10, 13241);
         class156.field2324.method2413(var12, arg4, class610.field8880, arg9 + 3, 0, (byte)-76, arg0, class82.field1183);
         int var13 = -82 % ((-64 - arg3) / 48);
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field4340[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4340[1] : field4340[0]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field4340[1] : field4340[0]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "<init>",
      descriptor = "()V"
   )
   public class265() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method2289(int arg0, byte arg1, int arg2) {
      try {
         if (arg2 <= -22) {
            ++field4331;
            int var4 = arg0 * 2;
            byte var7 = (byte)((127 & arg1 >> 1) + 127);
            int var10001 = var4;
            int var8 = var4 + 1;
            this.field4330[var10001] = var7;
            this.field4330[var8] = var7;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4340[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2290(int arg0) {
      try {
         if (arg0 == 1) {
            field4333 = null;
            field4338 = null;
            field4335 = null;
            field4339 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4340[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2291(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2292(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
