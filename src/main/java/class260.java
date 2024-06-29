import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class260 extends class1 {

    @OriginalMember(owner = "client!le", name = "Nb", descriptor = "Z")
    public static boolean field3855 = true;

    @OriginalMember(owner = "client!le", name = "Qb", descriptor = "Z")
    public static boolean field3858 = false;

    @OriginalMember(owner = "client!le", name = "Rb", descriptor = "[Lwf;")
    public static class64[] field3859 = new class64[14];

    @OriginalMember(owner = "client!le", name = "Wb", descriptor = "[Lhn;")
    public static class38[] field3864 = new class38[14];

    @OriginalMember(owner = "client!le", name = "Pb", descriptor = "Lgd;")
    public static class325 field3857 = new class325(64);

    @OriginalMember(owner = "client!le", name = "ec", descriptor = "S")
    public static short field3872 = 256;

    @OriginalMember(owner = "client!le", name = "cc", descriptor = "I")
    public static int field3870 = 0;

    @OriginalMember(owner = "client!le", name = "gc", descriptor = "I")
    public static int field3874 = 0;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!le", name = "Jb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!le", name = "Kb", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!le", name = "Lb", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!le", name = "Mb", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!le", name = "Ob", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!le", name = "Sb", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!le", name = "Tb", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!le", name = "Ub", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!le", name = "Vb", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!le", name = "Yb", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!le", name = "Zb", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!le", name = "ac", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!le", name = "bc", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!le", name = "dc", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!le", name = "Xb", descriptor = "Lug;")
    private class322 field3865;

    @OriginalMember(owner = "client!le", name = "fc", descriptor = "[I")
    public static int[] field3873;

    @OriginalMember(owner = "client!le", name = "hc", descriptor = "[[[B")
    public static byte[][][] field3875;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "(I)V", line = 5)
    public final void method1795(int arg0) {
        field3853++;
        this.field3867 = this.field48 * 8;
        int var2 = 116 % ((arg0 + 49) / 58);
    }

    @OriginalMember(owner = "client!le", name = "o", descriptor = "(I)V", line = 15)
    public static final void method1796(int arg0) {
        class61.field892 = null;
        field3854++;
        class83.field1288 = null;
        class309.field4887 = null;
        class183.field2902 = null;
        if (arg0 != 1952227009) {
            field3872 = -22;
        }
        class207.field3277 = (byte[][]) null;
        field3873 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([II)V", line = 35)
    public final void method1797(int[] arg0, int arg1) {
        field3861++;
        this.field3865 = new class322(arg0);
        int var3 = 0 / ((-arg1 - 28) / 54);
    }

    @OriginalMember(owner = "client!le", name = "n", descriptor = "(B)I", line = 46)
    public final int method1798(byte arg0) {
        if (arg0 < 78) {
            field3855 = false;
        }
        field3850++;
        return this.field34[this.field48++] - this.field3865.method2268(-65) & 0xFF;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(IB)I", line = 62)
    public final int method1799(int arg0, byte arg1) {
        int var3 = -58 % ((arg1 + 31) / 35);
        field3862++;
        return arg0 * 8 - this.field3867;
    }

    @OriginalMember(owner = "client!le", name = "l", descriptor = "(II)I", line = 86)
    public final int method1800(int arg0, int arg1) {
        field3869++;
        int var3 = this.field3867 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field3867 & 0x7);
        int var6 = -99 / ((arg0 - 41) / 32);
        this.field3867 += arg1;
        while (var5 < arg1) {
            var4 += (class87.field1402[var5] & this.field34[var3++]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (class87.field1402[var5] & this.field34[var3]) + var4;
        } else {
            var7 = (this.field34[var3] >> var5 - arg1 & class87.field1402[arg1]) + var4;
        }
        return var7;
    }

    @OriginalMember(owner = "client!le", name = "o", descriptor = "(B)V", line = 117)
    public final void method1801(byte arg0) {
        if (arg0 != -100) {
            this.method1797((int[]) null, -62);
        }
        field3851++;
        this.field48 = (this.field3867 + 7) / 8;
    }

    @OriginalMember(owner = "client!le", name = "p", descriptor = "(B)V", line = 131)
    public static void method1802(byte arg0) {
        field3857 = null;
        field3875 = (byte[][][]) null;
        field3873 = null;
        if (arg0 <= -58) {
            field3859 = null;
            field3864 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(ZI)V", line = 149)
    public static final void method1803(boolean arg0, int arg1) {
        field3863++;
        if (!arg0) {
            class170 var2 = class221.method1613(8, arg1, -8410);
            var2.method1267(-92);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILhe;III)V", line = 167)
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, int arg4, class101 arg5, int arg6, int arg7, int arg8) {
        field3856++;
        int var9 = arg8 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg5.field1626;
            var10 = arg5.field1623;
        } else {
            var10 = arg5.field1626;
            var11 = arg5.field1623;
        }
        int var12;
        int var13;
        if (arg4 + var10 > 104) {
            var12 = arg4;
            var13 = arg4 + 1;
        } else {
            var13 = (var10 + 1 >> 1) + arg4;
            var12 = (var10 >> 1) + arg4;
        }
        int var14 = (arg4 << 7) + (var10 << 6);
        int var15 = (arg6 << 7) + (var11 << 6);
        int var16;
        int var17;
        if ((arg6 + var11) <= 104) {
            var16 = (var11 + 1 >> 1) + arg6;
            var17 = (var11 >> 1) + arg6;
        } else {
            var16 = arg6 + 1;
            var17 = arg6;
        }
        int[][] var18 = class85.field1374[arg1];
        int var19 = var18[var12][var17] + var18[var12][var16] + var18[var13][var16] + var18[var13][var17] >> 2;
        int var20 = 0;
        if (arg1 != 0) {
            int[][] var21 = class85.field1374[0];
            var20 = var19 - (var21[var12][var17] + var21[var13][var17] + var21[var12][var16] + var21[var13][var16] >> 2);
        }
        if (arg3 != 20375) {
            return;
        }
        int[][] var22 = (int[][]) null;
        if (arg1 < 3) {
            var22 = class85.field1374[arg1 + 1];
        }
        class102 var23 = arg5.method822(false, (class186) null, var19, arg7, arg8, var22, var15, false, true, var14, var18);
        class295.method2075(var23.field1685, var14 - arg0, var20, var15 - arg2);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V", line = 242)
    public class260(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([BIIB)V", line = 249)
    public final void method1805(byte[] arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[arg2 + var5] = (byte) (this.field34[this.field48++] - this.field3865.method2268(-60));
        }
        if (arg3 != -2) {
            this.method1808((byte) 49, 83);
        }
        field3852++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lrj;B)V", line = 266)
    public static final void method1806(class20 arg0, byte arg1) {
        field3868++;
        if (arg1 != 78) {
            method1804(-60, -61, 12, 9, -93, (class101) null, 120, 124, -68);
        }
        class170.field2744 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIIIIIIIZ)V", line = 280)
    public static final void method1807(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field3866++;
        int var10 = arg4 - arg2;
        if (!arg9) {
            int var11 = arg6 - arg5;
            int var12 = (arg8 - arg1 << 16) / var10;
            int var13 = (arg7 - arg3 << 16) / var11;
            class140.method1078(arg1, var12, arg6, arg5, 0, arg0, arg2, 0, var13, 1701673542, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(BI)V", line = 299)
    public final void method1808(byte arg0, int arg1) {
        field3860++;
        this.field34[this.field48++] = (byte) (arg1 + this.field3865.method2268(-77));
        if (arg0 != -74) {
            field3857 = (class325) null;
        }
    }
}
