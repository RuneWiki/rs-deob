import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class487 extends class40 {
   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7410 = new String[]{method3788(method3787("rL_xI")), method3788(method3787("rL_yI")), method3788(method3787("rL_|I")), method3788(method3787("hK\u001dR")), method3788(method3787("}\u0010_\u0010\u001c")), method3788(method3787("rL_\u007fI")), method3788(method3787("rL_zI")), method3788(method3787("rL_{I"))};
   @OriginalMember(
      owner = "client!tr",
      name = "s",
      descriptor = "I"
   )
   public static int field7404 = 0;
   @OriginalMember(
      owner = "client!tr",
      name = "t",
      descriptor = "I"
   )
   public static int field7399;
   @OriginalMember(
      owner = "client!tr",
      name = "p",
      descriptor = "I"
   )
   public static int field7401;
   @OriginalMember(
      owner = "client!tr",
      name = "o",
      descriptor = "I"
   )
   public static int field7402;
   @OriginalMember(
      owner = "client!tr",
      name = "v",
      descriptor = "I"
   )
   public static int field7403;
   @OriginalMember(
      owner = "client!tr",
      name = "y",
      descriptor = "I"
   )
   public static int field7405;
   @OriginalMember(
      owner = "client!tr",
      name = "x",
      descriptor = "I"
   )
   public static int field7406;
   @OriginalMember(
      owner = "client!tr",
      name = "q",
      descriptor = "I"
   )
   public static int field7408;
   @OriginalMember(
      owner = "client!tr",
      name = "w",
      descriptor = "I"
   )
   public static int field7409;
   @OriginalMember(
      owner = "client!tr",
      name = "r",
      descriptor = "Ljq;"
   )
   private class672 field7400;
   @OriginalMember(
      owner = "client!tr",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field7407;

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method278(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         class351.field5356.method602(arg1 - 2, arg2, super.field485.field8820 + 4, super.field485.field8811 + 2, ((class714)super.field485).field10711, 0);
         if (arg0 != -24843) {
            this.method282((byte)-119);
         }

         ++field7402;
         class351.field5356.method602(arg1 - 1, arg2 - -1, super.field485.field8820 + 2, super.field485.field8811, 0, 0);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7410[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(ZIIB)V"
   )
   public final void method279(boolean arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field7401;
         int var5 = this.method286((byte)-124) * super.field485.field8820 / 10000;
         if (arg3 > -125) {
            this.method279(false, -18, 126, (byte)-101);
         }

         int[] var6 = new int[4];
         class351.field5356.method626(var6);
         class351.field5356.method629(arg2, arg1 - -2, arg2 + var5, super.field485.field8811 + arg1);
         this.field7400.method4949(arg2, arg1 + 2, super.field485.field8820, super.field485.field8811);
         class351.field5356.method629(var6[0], var6[1], var6[2], var6[3]);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7410[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Ldi;)V"
   )
   public class487(class678 arg0, class678 arg1, class714 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3785(byte arg0, int arg1) {
      try {
         ++field7403;
         int var2 = arg0 & 255;
         int var3 = -43 / ((arg1 - -36) / 53);
         if (~var2 == -1) {
            return false;
         } else {
            return ~var2 > -129 || ~var2 <= -161 || class653.field9779[var2 + -128] != 0;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7410[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method282(byte arg0) {
      try {
         super.method282((byte)116);
         ++field7408;
         this.field7400 = class85.method828(107, super.field487, ((class714)super.field485).field10715);
         if (arg0 < 98) {
            method3785((byte)89, 84);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7410[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method285(byte arg0) {
      try {
         ++field7405;
         return !super.method285(arg0) ? false : super.field487.method5002(((class714)super.field485).field10715, (byte)96);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7410[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(IFFLoga;IIII[BFFIIF)V"
   )
   public static final void method3786(int arg0, float arg1, float arg2, class62 arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, float arg9, float arg10, int arg11, int arg12, float arg13) {
      try {
         ++field7406;
         int var14 = arg6 * arg12;
         float[] var15 = new float[var14];

         for(int var16 = 0; ~var16 > ~arg11; ++var16) {
            int var17 = arg5;
            arg3.method478(arg12, arg10 / (float)arg6, -91, arg4, arg7, arg9 / (float)arg7, arg2 * 127.0F, arg13 / (float)arg12, 0, arg6, var15);
            arg10 *= 2.0F;
            arg9 *= 2.0F;

            for(int var18 = 0; ~var18 > ~var14; ++var18) {
               arg8[var17] = (byte)((int)((float)arg8[var17] + var15[var18]));
               ++var17;
            }

            arg2 = arg1 * arg2;
            arg13 *= 2.0F;
         }

         int var19 = arg5;

         for(int var20 = 0; ~var14 < ~var20; ++var20) {
            arg8[var19] = (byte)(arg8[var19] + 127);
            ++var19;
         }

         if (arg0 < 10) {
            method3786(-27, -0.17773008F, -0.109018795F, (class62)null, -91, 17, -74, 79, (byte[])null, -1.3047527F, -0.5913882F, 122, 44, -2.0347245F);
         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field7410[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7410[4] : field7410[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7410[4] : field7410[3]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3787(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3788(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
