import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class71 extends class120 {

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Z")
    private boolean field1802;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private int field1803;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    private int field1808;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfc;II)Lkc;")
    public static final class71 method615(class38 arg0, int arg1, int arg2) {
        return arg0.field957 != null && arg0.field957.length != 0 ? new class71(arg0, (int) ((long) arg0.field955 * 256L * (long) arg1 / (long) (class33.field792 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    private final void method616() {
        this.field1810 = this.field1815;
        this.field1812 = method654(this.field1815, this.field1809);
        this.field1804 = method629(this.field1815, this.field1809);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final synchronized void method617(int arg0) {
        this.method638(arg0 << 6, this.method643());
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
    public final synchronized void method618(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method638(arg1, arg2);
        } else {
            int var4 = method654(arg1, arg2);
            int var5 = method629(arg1, arg2);
            if (this.field1812 == var4 && this.field1804 == var5) {
                this.field1808 = 0;
            } else {
                this.field1808 = arg0;
                this.field1815 = arg1;
                this.field1809 = arg2;
                this.field1814 = (arg1 - this.field1810) / arg0;
                this.field1805 = (var4 - this.field1812) / arg0;
                this.field1806 = (var5 - this.field1804) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "()Z")
    public final boolean method619() {
        return this.field1813 < 0 || this.field1813 >= ((class38) super.field2943).field957.length << 8;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfc;III)Lkc;")
    public static final class71 method620(class38 arg0, int arg1, int arg2, int arg3) {
        return arg0.field957 != null && arg0.field957.length != 0 ? new class71(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
    public final synchronized void method621(boolean arg0) {
        this.field1816 = (this.field1816 >>> 31) + (this.field1816 ^ this.field1816 >> 31);
        if (arg0) {
            this.field1816 = -this.field1816;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B[IIIIIIILkc;)I")
    private static final int method622(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field1813 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B[IIIIIIILkc;II)I")
    private static final int method623(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        while (arg5 < var14) {
            byte var16 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field1813 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B[IIIIIIIILkc;)I")
    private static final int method624(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        arg9.field1812 += (arg7 - arg3) * arg9.field1805;
        arg9.field1804 += (arg7 - arg3) * arg9.field1806;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field1810 = var12 >> 2;
        arg9.field1813 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method625(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var21 = arg4 >> 8;
            byte var22 = arg2[var21 - 1];
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[var21] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            int var20 = (var19 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var19);
            var10001 = var15++;
            arg3[var10001] += arg6 * var20 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20 >> 6;
            arg4 += arg12;
        }
        arg11.field1813 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method626(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1812 += (arg9 - arg5) * arg11.field1805;
        arg11.field1804 += (arg9 - arg5) * arg11.field1806;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18 + 1] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        while (arg5 < var15) {
            byte var17 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (var16 - var17)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field1810 = arg6;
        arg11.field1813 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()Lre;")
    public final class120 method100() {
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
    public final int method102() {
        return this.field1815 == 0 && this.field1808 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B[IIIIIIIILkc;)I")
    private static final int method627(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field1813 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II[B[IIIIIIILkc;II)I")
    private static final int method628(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        int var16 = arg11;
        while (arg5 < var14) {
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6 >> 6;
            arg4 += var16;
        }
        arg10.field1813 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
    private static final int method629(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method630(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1812 += (arg9 - arg5) * arg11.field1805;
        arg11.field1804 += (arg9 - arg5) * arg11.field1806;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        int var17 = arg12;
        while (arg5 < var15) {
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var17;
        }
        arg11.field1810 = arg6;
        arg11.field1813 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B[IIIIIIIIIILkc;)I")
    private static final int method631(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
        arg12.field1810 += (arg10 - arg4) * arg12.field1814;
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field1812 = var15 >> 2;
        arg12.field1804 = var16 >> 2;
        arg12.field1813 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method632(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var22 = arg4 >> 8;
            byte var23 = arg2[var22];
            int var24 = (var23 << 8) + (arg4 & 255) * (arg2[var22 + 1] - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            byte var20 = arg2[arg4 >> 8];
            int var21 = (var20 << 8) + (arg4 & 255) * (var19 - var20);
            var10001 = var15++;
            arg3[var10001] += arg6 * var21 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21 >> 6;
            arg4 += arg12;
        }
        arg11.field1813 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([B[IIIIIIILkc;)I")
    private static final int method633(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field1813 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public final synchronized void method634(int arg0) {
        int var2 = ((class38) super.field2943).field957.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1813 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public final synchronized void method635(int arg0) {
        if (this.field1816 < 0) {
            this.field1816 = -arg0;
        } else {
            this.field1816 = arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIIII)I")
    private final int method636(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1808 > 0) {
            int var6 = this.field1808 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1808 += arg1;
            if (this.field1816 == -256 && (this.field1813 & 255) == 0) {
                if (class130.field3203) {
                    arg1 = method645(0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, this.field1805, this.field1806, 0, var6, arg2, this);
                } else {
                    arg1 = method652(((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, this.field1814, 0, var6, arg2, this);
                }
            } else if (class130.field3203) {
                arg1 = method642(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, this.field1805, this.field1806, 0, var6, arg2, this, this.field1816, arg4);
            } else {
                arg1 = method630(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, this.field1814, 0, var6, arg2, this, this.field1816, arg4);
            }
            this.field1808 -= arg1;
            if (this.field1808 != 0) {
                return arg1;
            }
            if (this.field1815 == Integer.MIN_VALUE) {
                this.field1815 = 0;
                this.field1810 = this.field1812 = this.field1804 = 0;
                this.method394((byte) 103);
                return arg3;
            }
            this.method616();
        }
        if (this.field1816 == -256 && (this.field1813 & 255) == 0) {
            return class130.field3203 ? method637(0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, 0, arg3, arg2, this) : method622(((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, 0, arg3, arg2, this);
        } else {
            return class130.field3203 ? method625(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, 0, arg3, arg2, this, this.field1816, arg4) : method628(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, 0, arg3, arg2, this, this.field1816, arg4);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I[B[IIIIIIIILkc;)I")
    private static final int method637(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field1813 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    private final synchronized void method638(int arg0, int arg1) {
        this.field1815 = arg0;
        this.field1809 = arg1;
        this.field1808 = 0;
        this.method616();
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()I")
    public final synchronized int method639() {
        return this.field1816 < 0 ? -this.field1816 : this.field1816;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    public final synchronized void method640(int arg0) {
        this.field1803 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B[IIIIIIIIIILkc;II)I")
    private static final int method641(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1810 += (arg11 - arg5) * arg13.field1814;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24 + 1] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            byte var22 = arg2[arg4 >> 8];
            int var23 = (var22 << 8) + (arg4 & 255) * (var21 - var22);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field1812 = arg6;
        arg13.field1804 = arg7;
        arg13.field1813 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II[B[IIIIIIIIIILkc;II)I")
    private static final int method642(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1810 += (arg11 - arg5) * arg13.field1814;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var23 = arg4 >> 8;
            byte var24 = arg2[var23 - 1];
            int var25 = (var24 << 8) + (arg4 & 255) * (arg2[var23] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            int var26 = var17++;
            arg3[var26] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            int var22 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var22 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var22 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field1812 = arg6;
        arg13.field1804 = arg7;
        arg13.field1813 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
    public final synchronized void method95(int[] arg0, int arg1, int arg2) {
        if (this.field1815 == 0 && this.field1808 == 0) {
            this.method105(arg2);
        } else {
            class38 var4 = (class38) super.field2943;
            int var5 = this.field1811 << 8;
            int var6 = this.field1807 << 8;
            int var7 = var4.field957.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1803 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1813 < 0) {
                if (this.field1816 <= 0) {
                    this.method653();
                    this.method394((byte) 75);
                    return;
                }
                this.field1813 = 0;
            }
            if (this.field1813 >= var7) {
                if (this.field1816 >= 0) {
                    this.method653();
                    this.method394((byte) 120);
                    return;
                }
                this.field1813 = var7 - 1;
            }
            if (this.field1803 < 0) {
                if (this.field1802) {
                    if (this.field1816 < 0) {
                        var9 = this.method636(arg0, arg1, var5, var10, var4.field957[this.field1811]);
                        if (this.field1813 >= var5) {
                            return;
                        }
                        this.field1813 = var5 + var5 - 1 - this.field1813;
                        this.field1816 = -this.field1816;
                    }
                    while (true) {
                        int var11 = this.method650(arg0, var9, var6, var10, var4.field957[this.field1807 - 1]);
                        if (this.field1813 < var6) {
                            return;
                        }
                        this.field1813 = var6 + var6 - 1 - this.field1813;
                        this.field1816 = -this.field1816;
                        var9 = this.method636(arg0, var11, var5, var10, var4.field957[this.field1811]);
                        if (this.field1813 >= var5) {
                            return;
                        }
                        this.field1813 = var5 + var5 - 1 - this.field1813;
                        this.field1816 = -this.field1816;
                    }
                } else if (this.field1816 < 0) {
                    while (true) {
                        var9 = this.method636(arg0, var9, var5, var10, var4.field957[this.field1807 - 1]);
                        if (this.field1813 >= var5) {
                            return;
                        }
                        this.field1813 = var6 - 1 - (var6 - 1 - this.field1813) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method650(arg0, var9, var6, var10, var4.field957[this.field1811]);
                        if (this.field1813 < var6) {
                            return;
                        }
                        this.field1813 = (this.field1813 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1803 > 0) {
                    if (this.field1802) {
                        label130: {
                            if (this.field1816 < 0) {
                                var9 = this.method636(arg0, arg1, var5, var10, var4.field957[this.field1811]);
                                if (this.field1813 >= var5) {
                                    return;
                                }
                                this.field1813 = var5 + var5 - 1 - this.field1813;
                                this.field1816 = -this.field1816;
                                if (--this.field1803 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method650(arg0, var9, var6, var10, var4.field957[this.field1807 - 1]);
                                if (this.field1813 < var6) {
                                    return;
                                }
                                this.field1813 = var6 + var6 - 1 - this.field1813;
                                this.field1816 = -this.field1816;
                                if (--this.field1803 == 0) {
                                    break;
                                }
                                var9 = this.method636(arg0, var9, var5, var10, var4.field957[this.field1811]);
                                if (this.field1813 >= var5) {
                                    return;
                                }
                                this.field1813 = var5 + var5 - 1 - this.field1813;
                                this.field1816 = -this.field1816;
                            } while (--this.field1803 != 0);
                        }
                    } else if (this.field1816 < 0) {
                        while (true) {
                            var9 = this.method636(arg0, var9, var5, var10, var4.field957[this.field1807 - 1]);
                            if (this.field1813 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1813) / var8;
                            if (var12 >= this.field1803) {
                                this.field1813 += this.field1803 * var8;
                                this.field1803 = 0;
                                break;
                            }
                            this.field1813 += var8 * var12;
                            this.field1803 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method650(arg0, var9, var6, var10, var4.field957[this.field1811]);
                            if (this.field1813 < var6) {
                                return;
                            }
                            int var13 = (this.field1813 - var5) / var8;
                            if (var13 >= this.field1803) {
                                this.field1813 -= this.field1803 * var8;
                                this.field1803 = 0;
                                break;
                            }
                            this.field1813 -= var8 * var13;
                            this.field1803 -= var13;
                        }
                    }
                }
                if (this.field1816 < 0) {
                    this.method636(arg0, var9, 0, var10, 0);
                    if (this.field1813 < 0) {
                        this.field1813 = -1;
                        this.method653();
                        this.method394((byte) 78);
                        return;
                    }
                } else {
                    this.method650(arg0, var9, var7, var10, 0);
                    if (this.field1813 >= var7) {
                        this.field1813 = var7;
                        this.method653();
                        this.method394((byte) 121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "()I")
    public final synchronized int method643() {
        return this.field1809 < 0 ? -1 : this.field1809;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    private final synchronized void method644(int arg0) {
        this.method638(arg0, this.method643());
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I[B[IIIIIIIIIILkc;)I")
    private static final int method645(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
        arg12.field1810 += (arg10 - arg4) * arg12.field1814;
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field1812 = var15 >> 2;
        arg12.field1804 = var16 >> 2;
        arg12.field1813 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "()I")
    public final synchronized int method646() {
        return this.field1815 == Integer.MIN_VALUE ? 0 : this.field1815;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
    public final synchronized void method647(int arg0, int arg1) {
        this.method618(arg0, arg1, this.method643());
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public final synchronized void method105(int arg0) {
        if (this.field1808 > 0) {
            if (arg0 >= this.field1808) {
                if (this.field1815 == Integer.MIN_VALUE) {
                    this.field1815 = 0;
                    this.field1810 = this.field1812 = this.field1804 = 0;
                    this.method394((byte) 85);
                    arg0 = this.field1808;
                }
                this.field1808 = 0;
                this.method616();
            } else {
                this.field1810 += this.field1814 * arg0;
                this.field1812 += this.field1805 * arg0;
                this.field1804 += this.field1806 * arg0;
                this.field1808 -= arg0;
            }
        }
        class38 var2 = (class38) super.field2943;
        int var3 = this.field1811 << 8;
        int var4 = this.field1807 << 8;
        int var5 = var2.field957.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1803 = 0;
        }
        if (this.field1813 < 0) {
            if (this.field1816 <= 0) {
                this.method653();
                this.method394((byte) 96);
                return;
            }
            this.field1813 = 0;
        }
        if (this.field1813 >= var5) {
            if (this.field1816 >= 0) {
                this.method653();
                this.method394((byte) 109);
                return;
            }
            this.field1813 = var5 - 1;
        }
        this.field1813 += this.field1816 * arg0;
        if (this.field1803 < 0) {
            if (!this.field1802) {
                if (this.field1816 < 0) {
                    if (this.field1813 < var3) {
                        this.field1813 = var4 - 1 - (var4 - 1 - this.field1813) % var6;
                    }
                } else if (this.field1813 >= var4) {
                    this.field1813 = (this.field1813 - var3) % var6 + var3;
                }
            } else {
                if (this.field1816 < 0) {
                    if (this.field1813 >= var3) {
                        return;
                    }
                    this.field1813 = var3 + var3 - 1 - this.field1813;
                    this.field1816 = -this.field1816;
                }
                while (this.field1813 >= var4) {
                    this.field1813 = var4 + var4 - 1 - this.field1813;
                    this.field1816 = -this.field1816;
                    if (this.field1813 >= var3) {
                        return;
                    }
                    this.field1813 = var3 + var3 - 1 - this.field1813;
                    this.field1816 = -this.field1816;
                }
            }
        } else {
            if (this.field1803 > 0) {
                if (this.field1802) {
                    label125: {
                        if (this.field1816 < 0) {
                            if (this.field1813 >= var3) {
                                return;
                            }
                            this.field1813 = var3 + var3 - 1 - this.field1813;
                            this.field1816 = -this.field1816;
                            if (--this.field1803 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1813 < var4) {
                                return;
                            }
                            this.field1813 = var4 + var4 - 1 - this.field1813;
                            this.field1816 = -this.field1816;
                            if (--this.field1803 == 0) {
                                break;
                            }
                            if (this.field1813 >= var3) {
                                return;
                            }
                            this.field1813 = var3 + var3 - 1 - this.field1813;
                            this.field1816 = -this.field1816;
                        } while (--this.field1803 != 0);
                    }
                } else if (this.field1816 < 0) {
                    if (this.field1813 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1813) / var6;
                    if (var7 < this.field1803) {
                        this.field1813 += var6 * var7;
                        this.field1803 -= var7;
                        return;
                    }
                    this.field1813 += this.field1803 * var6;
                    this.field1803 = 0;
                } else {
                    if (this.field1813 < var4) {
                        return;
                    }
                    int var8 = (this.field1813 - var3) / var6;
                    if (var8 < this.field1803) {
                        this.field1813 -= var6 * var8;
                        this.field1803 -= var8;
                        return;
                    }
                    this.field1813 -= this.field1803 * var6;
                    this.field1803 = 0;
                }
            }
            if (this.field1816 < 0) {
                if (this.field1813 < 0) {
                    this.field1813 = -1;
                    this.method653();
                    this.method394((byte) 123);
                    return;
                }
            } else if (this.field1813 >= var5) {
                this.field1813 = var5;
                this.method653();
                this.method394((byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()I")
    public final int method648() {
        int var1 = this.field1810 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1803 == 0) {
            var2 -= this.field1813 * var2 / (((class38) super.field2943).field957.length << 8);
        } else if (this.field1803 >= 0) {
            var2 -= this.field1811 * var2 / ((class38) super.field2943).field957.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
    public final synchronized void method649(int arg0) {
        if (arg0 == 0) {
            this.method644(0);
            this.method394((byte) 121);
        } else if (this.field1812 == 0 && this.field1804 == 0) {
            this.field1808 = 0;
            this.field1815 = 0;
            this.field1810 = 0;
            this.method394((byte) -84);
        } else {
            this.field1808 = arg0;
            this.field1815 = Integer.MIN_VALUE;
            this.field1814 = -this.field1810 / arg0;
            this.field1805 = -this.field1812 / arg0;
            this.field1806 = -this.field1804 / arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([IIIII)I")
    private final int method650(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1808 > 0) {
            int var6 = this.field1808 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1808 += arg1;
            if (this.field1816 == 256 && (this.field1813 & 255) == 0) {
                if (class130.field3203) {
                    arg1 = method631(0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, this.field1805, this.field1806, 0, var6, arg2, this);
                } else {
                    arg1 = method624(((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, this.field1814, 0, var6, arg2, this);
                }
            } else if (class130.field3203) {
                arg1 = method641(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, this.field1805, this.field1806, 0, var6, arg2, this, this.field1816, arg4);
            } else {
                arg1 = method626(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, this.field1814, 0, var6, arg2, this, this.field1816, arg4);
            }
            this.field1808 -= arg1;
            if (this.field1808 != 0) {
                return arg1;
            }
            if (this.field1815 == Integer.MIN_VALUE) {
                this.field1815 = 0;
                this.field1810 = this.field1812 = this.field1804 = 0;
                this.method394((byte) 87);
                return arg3;
            }
            this.method616();
        }
        if (this.field1816 == 256 && (this.field1813 & 255) == 0) {
            return class130.field3203 ? method627(0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, 0, arg3, arg2, this) : method633(((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, 0, arg3, arg2, this);
        } else {
            return class130.field3203 ? method632(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1812, this.field1804, 0, arg3, arg2, this, this.field1816, arg4) : method623(0, 0, ((class38) super.field2943).field957, arg0, this.field1813, arg1, this.field1810, 0, arg3, arg2, this, this.field1816, arg4);
        }
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "()Z")
    public final boolean method651() {
        return this.field1808 != 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([B[IIIIIIIILkc;)I")
    private static final int method652(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        arg9.field1812 += (arg7 - arg3) * arg9.field1805;
        arg9.field1804 += (arg7 - arg3) * arg9.field1806;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field1810 = var12 >> 2;
        arg9.field1813 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "()V")
    private final void method653() {
        if (this.field1808 != 0) {
            if (this.field1815 == Integer.MIN_VALUE) {
                this.field1815 = 0;
            }
            this.field1808 = 0;
            this.method616();
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lre;")
    public final class120 method106() {
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)I")
    private static final int method654(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lfc;II)V")
    private class71(class38 arg0, int arg1, int arg2) {
        super.field2943 = arg0;
        this.field1811 = arg0.field956;
        this.field1807 = arg0.field953;
        this.field1802 = arg0.field954;
        this.field1816 = arg1;
        this.field1815 = arg2;
        this.field1809 = 8192;
        this.field1813 = 0;
        this.method616();
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lfc;III)V")
    private class71(class38 arg0, int arg1, int arg2, int arg3) {
        super.field2943 = arg0;
        this.field1811 = arg0.field956;
        this.field1807 = arg0.field953;
        this.field1802 = arg0.field954;
        this.field1816 = arg1;
        this.field1815 = arg2;
        this.field1809 = arg3;
        this.field1813 = 0;
        this.method616();
    }
}
