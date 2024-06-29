import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class449 extends class347 {
   @OriginalMember(
      owner = "client!ifa",
      name = "A",
      descriptor = "I"
   )
   public int field6822;
   @OriginalMember(
      owner = "client!ifa",
      name = "w",
      descriptor = "I"
   )
   private int field6811;
   @OriginalMember(
      owner = "client!ifa",
      name = "p",
      descriptor = "I"
   )
   private int field6813;
   @OriginalMember(
      owner = "client!ifa",
      name = "y",
      descriptor = "I"
   )
   public int field6825;
   @OriginalMember(
      owner = "client!ifa",
      name = "u",
      descriptor = "I"
   )
   public int field6816;
   @OriginalMember(
      owner = "client!ifa",
      name = "m",
      descriptor = "I"
   )
   private int field6826;
   @OriginalMember(
      owner = "client!ifa",
      name = "v",
      descriptor = "I"
   )
   private int field6819;
   @OriginalMember(
      owner = "client!ifa",
      name = "q",
      descriptor = "I"
   )
   public int field6815;
   @OriginalMember(
      owner = "client!ifa",
      name = "l",
      descriptor = "I"
   )
   private int field6817;
   @OriginalMember(
      owner = "client!ifa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6830 = new String[]{method3390(method3389("\u007f\u0001i\u000e\u001e>")), method3390(method3389("mI&\u000e!")), method3390(method3389("\u007f\u0001i\u000e\u001f>")), method3390(method3389("x\u0012dL")), method3390(method3389("\u007f\u0001i\u000e\u0019>")), method3390(method3389("\u007f\u0001i\u000e`\u007f\taTb>")), method3390(method3389("\u007f\u0001i\u000e\u001a>")), method3390(method3389("\u007f\u0001i\u000e\u0018>")), method3390(method3389("\u007f\u0001i\u000e\u001b>")), method3390(method3389("\u007f\u0001i\u000e\u001d>"))};
   @OriginalMember(
      owner = "client!ifa",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field6820 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!ifa",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field6821 = false;
   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "S"
   )
   public static short field6827 = 32767;
   @OriginalMember(
      owner = "client!ifa",
      name = "s",
      descriptor = "D"
   )
   public static double field6818;
   @OriginalMember(
      owner = "client!ifa",
      name = "r",
      descriptor = "I"
   )
   public static int field6812;
   @OriginalMember(
      owner = "client!ifa",
      name = "n",
      descriptor = "I"
   )
   public static int field6814;
   @OriginalMember(
      owner = "client!ifa",
      name = "i",
      descriptor = "I"
   )
   public static int field6823;
   @OriginalMember(
      owner = "client!ifa",
      name = "x",
      descriptor = "I"
   )
   public static int field6824;
   @OriginalMember(
      owner = "client!ifa",
      name = "o",
      descriptor = "I"
   )
   public static int field6828;
   @OriginalMember(
      owner = "client!ifa",
      name = "j",
      descriptor = "I"
   )
   public static int field6829;

   @OriginalMember(
      owner = "client!ifa",
      name = "b",
      descriptor = "(III)Z"
   )
   public final boolean method3382(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 4) {
            this.field6817 = -57;
         }

         ++field6812;
         return this.field6813 <= arg0 && ~this.field6819 <= ~arg0 && arg2 >= this.field6811 && this.field6817 >= arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6830[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3383(int arg0) {
      try {
         if (arg0 == 16957) {
            field6820 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6830[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(B)Lpa;"
   )
   public static final class388 method3384(byte arg0) {
      try {
         if (arg0 != -40) {
            field6820 = null;
         }

         ++field6828;
         return class512.method3805(1, true);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6830[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method3385(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6824;
         if (arg0 != 16813) {
            this.method3382(-32, -64, 103);
         }

         return ~this.field6826 == ~arg1 && ~arg3 <= ~this.field6813 && ~arg3 >= ~this.field6819 && ~this.field6811 >= ~arg2 && arg2 <= this.field6817;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6830[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "([IIIB)V"
   )
   public final void method3386(int[] arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 != -117) {
            this.method3386((int[])null, 96, -30, (byte)-108);
         }

         ++field6823;
         arg0[1] = -this.field6813 + this.field6822 + arg2;
         arg0[2] = -this.field6811 + this.field6825 + arg1;
         arg0[0] = 0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6830[2] + (arg0 != null ? field6830[1] : field6830[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "([IIBI)V"
   )
   public final void method3387(int[] arg0, int arg1, byte arg2, int arg3) {
      try {
         arg0[2] = this.field6811 + arg1 - this.field6825;
         int var5 = 85 % ((48 - arg2) / 38);
         arg0[1] = this.field6813 - (this.field6822 - arg3);
         arg0[0] = this.field6826;
         ++field6814;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6830[7] + (arg0 != null ? field6830[1] : field6830[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "c",
      descriptor = "(III)Z"
   )
   public final boolean method3388(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 32767) {
            return true;
         } else {
            ++field6829;
            return arg2 >= this.field6822 && ~this.field6816 <= ~arg2 && ~arg1 <= ~this.field6825 && ~this.field6815 <= ~arg1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6830[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "<init>",
      descriptor = "(IIIIIIIII)V"
   )
   public class449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field6822 = arg5;
         this.field6811 = arg2;
         this.field6813 = arg1;
         this.field6825 = arg6;
         this.field6816 = arg7;
         this.field6826 = arg0;
         this.field6819 = arg3;
         this.field6815 = arg8;
         this.field6817 = arg4;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field6830[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3389(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3390(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
