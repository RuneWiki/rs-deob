import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class275 extends class270 {

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    private int field4133 = 32768;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static volatile int field4134 = 0;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Lce;")
    public static class345 field4135 = new class345(64);

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4145 = "wave2:";

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "Ldp;")
    public static class174 field4139;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "[[B")
    public static byte[][] field4144;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "[[[B")
    public static byte[][][] field4140;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "[[[I")
    public static int[][][] field4146;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 8)
    public final void method83(boolean arg0) {
        class164.method1269(0);
        if (!arg0) {
            field4140 = null;
        }
        ++field4131;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V", line = 19)
    public static final void method1965(byte arg0) {
        class245.field3582 = null;
        class451.field6549 = null;
        class365.field5209 = null;
        class85.field1389 = null;
        ++field4137;
        class420.field6134 = null;
        class308.field4509 = null;
        if (arg0 != -96) {
            method1966(false);
        }
        class320.field4629 = null;
        class86.field1401 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I", line = 37)
    public final int[] method81(byte arg0, int arg1) {
        ++field4143;
        int[] var3 = super.field4053.method396(arg1, 76);
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 1, arg1);
            int[] var5 = this.method1927(0, 2, arg1);
            for (int var6 = 0; ~var6 > ~class161.field2445; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field4133 >> 12;
                int var9 = class133.field2145[var7] * var8 >> 12;
                int var10 = class42.field640[var7] * var8 >> 12;
                int var11 = class267.field3997 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg1 & class30.field442;
                int[] var13 = this.method1927(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return arg0 <= 26 ? null : var3;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 220)
    public class275() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 98)
    public static void method1966(boolean arg0) {
        field4135 = null;
        field4146 = null;
        if (!arg0) {
            field4146 = null;
        }
        field4139 = null;
        field4144 = null;
        field4145 = null;
        field4140 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lmb;Lof;IIIILrn;I)V", line = 113)
    public static final void method1967(class258 arg0, class421 arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, int arg7) {
        ++field4132;
        if (arg1 != null) {
            if (arg7 != 16383) {
                field4134 = 99;
            }
            int var8;
            if (class322.field4643 == 4) {
                var8 = (int) class106.field1756 & 16383;
            } else {
                var8 = 16383 & (int) class106.field1756 - -class1.field3;
            }
            int var9 = Math.max(arg0.field3764 / 2, arg0.field3758 / 2) - -10;
            int var10 = arg2 * arg2 + arg5 * arg5;
            if (var9 * var9 >= var10) {
                int var11 = class56.field897[var8];
                int var12 = class56.field898[var8];
                if (class322.field4643 != 4) {
                    var12 = var12 * 256 / (class248.field3593 + 256);
                    var11 = var11 * 256 / (class248.field3593 + 256);
                }
                int var13 = arg2 * var12 + arg5 * var11 >> 15;
                int var14 = arg5 * var12 + -(arg2 * var11) >> 15;
                arg1.method499(arg0.field3764 / 2 + var13 + arg4 - arg1.method1461() / 2, arg0.field3758 / 2 + arg3 + -var14 - arg1.method1463() / 2, arg6, arg4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[[I", line = 163)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field4142;
        if (!arg0) {
            method1965((byte) 48);
        }
        int[][] var3 = super.field4046.method244(arg1, 122);
        if (super.field4046.field488) {
            int[] var4 = this.method1927(0, 1, arg1);
            int[] var5 = this.method1927(0, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class161.field2445 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field4133 >> 12;
                int var12 = class133.field2145[var10] * var11 >> 12;
                int var13 = class42.field640[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class267.field3997;
                int var15 = (var13 >> 12) + arg1 & class30.field442;
                int[][] var16 = this.method1930(var15, 0, (byte) -75);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLec;I)V", line = 223)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field4136;
        if (arg0 != 108) {
            this.method123(true, -74);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field4055 = arg1.method271((byte) 100) == 1;
            }
        } else {
            this.field4133 = arg1.method320((byte) -87) << 4;
        }
    }
}
