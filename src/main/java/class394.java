import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class394 extends class377 {

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    private int field5019 = 1;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    private int field5020 = 1;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field5023 = 0;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Lws;")
    public static class333 field5025 = new class333();

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5026 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V", line = 3)
    public static void method2235(int arg0) {
        if (arg0 != 0) {
            method2236(11, 8, true);
        }
        field5025 = null;
        field5026 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 15)
    public class394() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILji;)V", line = 20)
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -68 % ((arg1 - 13) / 55);
        ++field5016;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4853 = arg2.method3097((byte) 12) == 1;
                }
            } else {
                this.field5020 = arg2.method3097((byte) 12);
            }
        } else {
            this.field5019 = arg2.method3097((byte) 12);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[[I", line = 64)
    public final int[][] method23(int arg0, byte arg1) {
        ++field5022;
        int var3 = 99 % ((arg1 - 31) / 42);
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int var5 = this.field5020 + this.field5020 - -1;
            int var6 = 65536 / var5;
            int var7 = this.field5019 + this.field5019 - -1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field5020 + arg0; var10 <= this.field5020 + arg0; ++var10) {
                int[][] var20 = this.method2173(1, class251.field3236 & var10, 0);
                int[][] var21 = new int[3][class528.field6661];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field5019; this.field5019 >= var28; ++var28) {
                    int var38 = var28 & class376.field4836;
                    var24 += var27[var38];
                    var23 += var26[var38];
                    var22 += var25[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (~class528.field6661 < ~var32) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = class376.field4836 & -this.field5019 + var32;
                    ++var32;
                    int var34 = var23 - var26[var33];
                    int var35 = var24 - var27[var33];
                    int var36 = var22 - var25[var33];
                    int var37 = class376.field4836 & var32 - -this.field5019;
                    var23 = var26[var37] + var34;
                    var24 = var27[var37] + var35;
                    var22 = var25[var37] + var36;
                }
                var9[-arg0 + this.field5020 + var10] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; class528.field6661 > var14; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                    var15 += var19[0][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)Z", line = 197)
    public static final boolean method2236(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field5027 = -64;
        }
        ++field5024;
        return ((arg0 & 8192) != 0 | class73.method587(arg0, arg1, (byte) 113) | class1.method3(arg1, arg0, (byte) -128)) & class525.method2833(arg1, 120, arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILoa;I)Lub;", line = 214)
    public static final class20 method2237(int arg0, class650 arg1, int arg2) {
        ++field5017;
        int var3 = -98 % ((arg2 - 7) / 57);
        class462 var4 = class164.method999(arg0, 12173, arg1, true);
        return var4 == null ? null : var4.field5751;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I", line = 232)
    public final int[] method88(int arg0, int arg1) {
        ++field5018;
        int[] var3 = super.field4842.method2772(arg0, (byte) -113);
        int var4 = -107 / ((arg1 - 5) / 53);
        if (super.field4842.field6354) {
            int var5 = this.field5020 + this.field5020 - -1;
            int var6 = 65536 / var5;
            int var7 = this.field5019 + 1 + this.field5019;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field5020 + arg0; var10 <= this.field5020 + arg0; ++var10) {
                int[] var14 = this.method2174(0, class251.field3236 & var10, (byte) -120);
                int[] var15 = new int[class528.field6661];
                int var16 = 0;
                for (int var17 = -this.field5019; this.field5019 >= var17; ++var17) {
                    var16 += var14[var17 & class376.field4836];
                }
                int var18 = 0;
                while (~class528.field6661 < ~var18) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[class376.field4836 & -this.field5019 + var18];
                    ++var18;
                    var16 = var14[var18 - -this.field5019 & class376.field4836] + var19;
                }
                var9[this.field5020 + var10 + -arg0] = var15;
            }
            for (int var11 = 0; ~var11 > ~class528.field6661; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var13 > ~var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }
}
