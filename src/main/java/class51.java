import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class51 extends class209 {

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "Z")
    private boolean field698;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "()V", line = 3)
    private final void method293() {
        this.field687 = this.field691;
        this.field688 = method305(this.field691, this.field692);
        this.field690 = method328(this.field691, this.field692);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V", line = 10)
    public final synchronized void method294(int arg0, int arg1) {
        this.method297(arg0, arg1, this.method319());
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 13)
    public final synchronized void method295(int arg0) {
        this.method307(arg0 << 6, this.method319());
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[B[IIIIIIIIIILbj;II)I", line = 16)
    private static final int method296(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class51 arg13, int arg14, int arg15) {
        arg13.field687 -= arg13.field700 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field687 += arg13.field700 * var26;
        arg13.field688 = arg6;
        arg13.field690 = arg7;
        arg13.field693 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V", line = 60)
    public final synchronized void method297(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method307(arg1, arg2);
            return;
        }
        int var4 = method305(arg1, arg2);
        int var5 = method328(arg1, arg2);
        if (this.field688 == var4 && this.field690 == var5) {
            this.field699 = 0;
            return;
        }
        int var6 = arg1 - this.field687;
        if (this.field687 - arg1 > var6) {
            var6 = this.field687 - arg1;
        }
        if (var4 - this.field688 > var6) {
            var6 = var4 - this.field688;
        }
        if (this.field688 - var4 > var6) {
            var6 = this.field688 - var4;
        }
        if (var5 - this.field690 > var6) {
            var6 = var5 - this.field690;
        }
        if (this.field690 - var5 > var6) {
            var6 = this.field690 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field699 = arg0;
        this.field691 = arg1;
        this.field692 = arg2;
        this.field700 = (arg1 - this.field687) / arg0;
        this.field697 = (var4 - this.field688) / arg0;
        this.field701 = (var5 - this.field690) / arg0;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V", line = 106)
    public final synchronized void method298(int arg0) {
        if (this.field694 < 0) {
            this.field694 = -arg0;
        } else {
            this.field694 = arg0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[B[IIIIIIIILbj;II)I", line = 113)
    private static final int method299(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class51 arg11, int arg12, int arg13) {
        arg11.field688 -= arg11.field697 * arg5;
        arg11.field690 -= arg11.field701 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field688 += arg11.field697 * arg5;
        arg11.field690 += arg11.field701 * arg5;
        arg11.field687 = arg6;
        arg11.field693 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()I", line = 146)
    public final int method140() {
        return this.field691 == 0 && this.field699 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[B[IIIIIIIIIILbj;)I", line = 152)
    private static final int method300(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class51 arg12) {
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
        arg12.field687 += (var19 - arg4) * arg12.field700;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field688 = var15 >> 2;
        arg12.field690 = var16 >> 2;
        arg12.field693 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([B[IIIIIIIILbj;)I", line = 206)
    private static final int method301(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class51 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field688 += (var14 - arg3) * arg9.field697;
        arg9.field690 += (var14 - arg3) * arg9.field701;
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
        arg9.field687 = var12 >> 2;
        arg9.field693 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "()I", line = 241)
    public final synchronized int method302() {
        return this.field694 < 0 ? -this.field694 : this.field694;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[B[IIIIIIIILbj;)I", line = 244)
    private static final int method303(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class51 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field693 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([IIIII)I", line = 282)
    private final int method304(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field699 > 0) {
                int var6 = this.field699 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field699 += arg1;
                if (this.field694 == 256 && (this.field693 & 0xFF) == 0) {
                    if (class141.field2355) {
                        arg1 = method300(0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, this.field697, this.field701, 0, var6, arg2, this);
                    } else {
                        arg1 = method327(((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, this.field700, 0, var6, arg2, this);
                    }
                } else if (class141.field2355) {
                    arg1 = method312(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, this.field697, this.field701, 0, var6, arg2, this, this.field694, arg4);
                } else {
                    arg1 = method333(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, this.field700, 0, var6, arg2, this, this.field694, arg4);
                }
                this.field699 -= arg1;
                if (this.field699 != 0) {
                    return arg1;
                }
                if (!this.method325()) {
                    continue;
                }
                return arg3;
            }
            if (this.field694 == 256 && (this.field693 & 0xFF) == 0) {
                if (class141.field2355) {
                    return method303(0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, 0, arg3, arg2, this);
                }
                return method332(((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, 0, arg3, arg2, this);
            }
            if (class141.field2355) {
                return method329(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, 0, arg3, arg2, this, this.field694, arg4);
            }
            return method321(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, 0, arg3, arg2, this, this.field694, arg4);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)I", line = 337)
    private static final int method305(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lhb;II)Lbj;", line = 340)
    public static final class51 method306(class32 arg0, int arg1, int arg2) {
        return arg0.field482 == null || arg0.field482.length == 0 ? null : new class51(arg0, (int) ((long) arg0.field484 * 256L * (long) arg1 / (long) (class205.field3493 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V", line = 347)
    private final synchronized void method307(int arg0, int arg1) {
        this.field691 = arg0;
        this.field692 = arg1;
        this.field699 = 0;
        this.method293();
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()Lrb;", line = 353)
    public final class209 method147() {
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "([IIIII)I", line = 357)
    private final int method308(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field699 > 0) {
                int var6 = this.field699 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field699 += arg1;
                if (this.field694 == -256 && (this.field693 & 0xFF) == 0) {
                    if (class141.field2355) {
                        arg1 = method318(0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, this.field697, this.field701, 0, var6, arg2, this);
                    } else {
                        arg1 = method301(((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, this.field700, 0, var6, arg2, this);
                    }
                } else if (class141.field2355) {
                    arg1 = method296(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, this.field697, this.field701, 0, var6, arg2, this, this.field694, arg4);
                } else {
                    arg1 = method299(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, this.field700, 0, var6, arg2, this, this.field694, arg4);
                }
                this.field699 -= arg1;
                if (this.field699 != 0) {
                    return arg1;
                }
                if (!this.method325()) {
                    continue;
                }
                return arg3;
            }
            if (this.field694 == -256 && (this.field693 & 0xFF) == 0) {
                if (class141.field2355) {
                    return method323(0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, 0, arg3, arg2, this);
                }
                return method322(((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, 0, arg3, arg2, this);
            }
            if (class141.field2355) {
                return method310(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field688, this.field690, 0, arg3, arg2, this, this.field694, arg4);
            }
            return method313(0, 0, ((class32) this.field3572).field482, arg0, this.field693, arg1, this.field687, 0, arg3, arg2, this, this.field694, arg4);
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V", line = 412)
    public final synchronized void method309(int arg0) {
        this.field695 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II[B[IIIIIIIILbj;II)I", line = 418)
    private static final int method310(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class51 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field693 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V", line = 451)
    public final synchronized void method311(int arg0) {
        int var2 = ((class32) this.field3572).field482.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field693 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II[B[IIIIIIIIIILbj;II)I", line = 461)
    private static final int method312(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class51 arg13, int arg14, int arg15) {
        arg13.field687 -= arg13.field700 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field687 += arg13.field700 * var27;
        arg13.field688 = arg6;
        arg13.field690 = arg7;
        arg13.field693 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()Lrb;", line = 504)
    public final class209 method158() {
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[B[IIIIIIILbj;II)I", line = 507)
    private static final int method313(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class51 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field693 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)V", line = 535)
    private final synchronized void method314(int arg0) {
        this.method307(arg0, this.method319());
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I", line = 539)
    public final int method315() {
        int var1 = this.field687 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field695 == 0) {
            var2 -= this.field693 * var2 / (((class32) this.field3572).field482.length << 8);
        } else if (this.field695 >= 0) {
            var2 -= this.field696 * var2 / ((class32) this.field3572).field482.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 551)
    public final synchronized void method316(boolean arg0) {
        this.field694 = (this.field694 >>> 31) + (this.field694 ^ this.field694 >> 31);
        if (arg0) {
            this.field694 = -this.field694;
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "()V", line = 557)
    private final void method317() {
        if (this.field699 == 0) {
            return;
        }
        if (this.field691 == Integer.MIN_VALUE) {
            this.field691 = 0;
        }
        this.field699 = 0;
        this.method293();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "([III)V", line = 568)
    public final synchronized void method161(int[] arg0, int arg1, int arg2) {
        if (this.field691 == 0 && this.field699 == 0) {
            this.method148(arg2);
            return;
        }
        class32 var4 = (class32) this.field3572;
        int var5 = this.field696 << 8;
        int var6 = this.field689 << 8;
        int var7 = var4.field482.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field695 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field693 < 0) {
            if (this.field694 <= 0) {
                this.method317();
                this.method557((byte) -89);
                return;
            }
            this.field693 = 0;
        }
        if (this.field693 >= var7) {
            if (this.field694 >= 0) {
                this.method317();
                this.method557((byte) -89);
                return;
            }
            this.field693 = var7 - 1;
        }
        if (this.field695 >= 0) {
            if (this.field695 > 0) {
                if (this.field698) {
                    label131: {
                        if (this.field694 < 0) {
                            var9 = this.method308(arg0, arg1, var5, var10, var4.field482[this.field696]);
                            if (this.field693 >= var5) {
                                return;
                            }
                            this.field693 = var5 + var5 - this.field693 - 1;
                            this.field694 = -this.field694;
                            if (--this.field695 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method304(arg0, var9, var6, var10, var4.field482[this.field689 - 1]);
                            if (this.field693 < var6) {
                                return;
                            }
                            this.field693 = var6 + var6 - this.field693 - 1;
                            this.field694 = -this.field694;
                            if (--this.field695 == 0) {
                                break;
                            }
                            var9 = this.method308(arg0, var9, var5, var10, var4.field482[this.field696]);
                            if (this.field693 >= var5) {
                                return;
                            }
                            this.field693 = var5 + var5 - this.field693 - 1;
                            this.field694 = -this.field694;
                        } while (--this.field695 != 0);
                    }
                } else if (this.field694 < 0) {
                    while (true) {
                        var9 = this.method308(arg0, var9, var5, var10, var4.field482[this.field689 - 1]);
                        if (this.field693 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field693 - 1) / var8;
                        if (var12 >= this.field695) {
                            this.field693 += this.field695 * var8;
                            this.field695 = 0;
                            break;
                        }
                        this.field693 += var8 * var12;
                        this.field695 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method304(arg0, var9, var6, var10, var4.field482[this.field696]);
                        if (this.field693 < var6) {
                            return;
                        }
                        int var13 = (this.field693 - var5) / var8;
                        if (var13 >= this.field695) {
                            this.field693 -= this.field695 * var8;
                            this.field695 = 0;
                            break;
                        }
                        this.field693 -= var8 * var13;
                        this.field695 -= var13;
                    }
                }
            }
            if (this.field694 < 0) {
                this.method308(arg0, var9, 0, var10, 0);
                if (this.field693 < 0) {
                    this.field693 = -1;
                    this.method317();
                    this.method557((byte) -89);
                }
            } else {
                this.method304(arg0, var9, var7, var10, 0);
                if (this.field693 >= var7) {
                    this.field693 = var7;
                    this.method317();
                    this.method557((byte) -89);
                }
            }
        } else if (this.field698) {
            if (this.field694 < 0) {
                var9 = this.method308(arg0, arg1, var5, var10, var4.field482[this.field696]);
                if (this.field693 >= var5) {
                    return;
                }
                this.field693 = var5 + var5 - this.field693 - 1;
                this.field694 = -this.field694;
            }
            while (true) {
                int var11 = this.method304(arg0, var9, var6, var10, var4.field482[this.field689 - 1]);
                if (this.field693 < var6) {
                    return;
                }
                this.field693 = var6 + var6 - this.field693 - 1;
                this.field694 = -this.field694;
                var9 = this.method308(arg0, var11, var5, var10, var4.field482[this.field696]);
                if (this.field693 >= var5) {
                    return;
                }
                this.field693 = var5 + var5 - this.field693 - 1;
                this.field694 = -this.field694;
            }
        } else if (this.field694 < 0) {
            while (true) {
                var9 = this.method308(arg0, var9, var5, var10, var4.field482[this.field689 - 1]);
                if (this.field693 >= var5) {
                    return;
                }
                this.field693 = var6 - (var6 - 1 - this.field693) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method304(arg0, var9, var6, var10, var4.field482[this.field696]);
                if (this.field693 < var6) {
                    return;
                }
                this.field693 = (this.field693 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I[B[IIIIIIIIIILbj;)I", line = 803)
    private static final int method318(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class51 arg12) {
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
        arg12.field687 += (var19 - arg4) * arg12.field700;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field688 = var15 >> 2;
        arg12.field690 = var16 >> 2;
        arg12.field693 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 857)
    public final synchronized void method148(int arg0) {
        if (this.field699 > 0) {
            if (arg0 >= this.field699) {
                if (this.field691 == Integer.MIN_VALUE) {
                    this.field691 = 0;
                    this.field687 = this.field688 = this.field690 = 0;
                    this.method557((byte) -89);
                    arg0 = this.field699;
                }
                this.field699 = 0;
                this.method293();
            } else {
                this.field687 += this.field700 * arg0;
                this.field688 += this.field697 * arg0;
                this.field690 += this.field701 * arg0;
                this.field699 -= arg0;
            }
        }
        class32 var2 = (class32) this.field3572;
        int var3 = this.field696 << 8;
        int var4 = this.field689 << 8;
        int var5 = var2.field482.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field695 = 0;
        }
        if (this.field693 < 0) {
            if (this.field694 <= 0) {
                this.method317();
                this.method557((byte) -89);
                return;
            }
            this.field693 = 0;
        }
        if (this.field693 >= var5) {
            if (this.field694 >= 0) {
                this.method317();
                this.method557((byte) -89);
                return;
            }
            this.field693 = var5 - 1;
        }
        this.field693 += this.field694 * arg0;
        if (this.field695 >= 0) {
            if (this.field695 > 0) {
                if (this.field698) {
                    label121: {
                        if (this.field694 < 0) {
                            if (this.field693 >= var3) {
                                return;
                            }
                            this.field693 = var3 + var3 - this.field693 - 1;
                            this.field694 = -this.field694;
                            if (--this.field695 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field693 < var4) {
                                return;
                            }
                            this.field693 = var4 + var4 - this.field693 - 1;
                            this.field694 = -this.field694;
                            if (--this.field695 == 0) {
                                break;
                            }
                            if (this.field693 >= var3) {
                                return;
                            }
                            this.field693 = var3 + var3 - this.field693 - 1;
                            this.field694 = -this.field694;
                        } while (--this.field695 != 0);
                    }
                } else {
                    label153: {
                        if (this.field694 < 0) {
                            if (this.field693 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field693 - 1) / var6;
                            if (var7 >= this.field695) {
                                this.field693 += this.field695 * var6;
                                this.field695 = 0;
                                break label153;
                            }
                            this.field693 += var6 * var7;
                            this.field695 -= var7;
                        } else if (this.field693 >= var4) {
                            int var8 = (this.field693 - var3) / var6;
                            if (var8 >= this.field695) {
                                this.field693 -= this.field695 * var6;
                                this.field695 = 0;
                                break label153;
                            }
                            this.field693 -= var6 * var8;
                            this.field695 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field694 < 0) {
                if (this.field693 < 0) {
                    this.field693 = -1;
                    this.method317();
                    this.method557((byte) -89);
                }
            } else if (this.field693 >= var5) {
                this.field693 = var5;
                this.method317();
                this.method557((byte) -89);
            }
        } else if (this.field698) {
            if (this.field694 < 0) {
                if (this.field693 >= var3) {
                    return;
                }
                this.field693 = var3 + var3 - this.field693 - 1;
                this.field694 = -this.field694;
            }
            while (this.field693 >= var4) {
                this.field693 = var4 + var4 - this.field693 - 1;
                this.field694 = -this.field694;
                if (this.field693 >= var3) {
                    return;
                }
                this.field693 = var3 + var3 - this.field693 - 1;
                this.field694 = -this.field694;
            }
        } else if (this.field694 < 0) {
            if (this.field693 >= var3) {
                return;
            }
            this.field693 = var4 - (var4 - 1 - this.field693) % var6 - 1;
        } else if (this.field693 >= var4) {
            this.field693 = (this.field693 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "()I", line = 1076)
    public final synchronized int method319() {
        return this.field692 < 0 ? -1 : this.field692;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lhb;III)Lbj;", line = 1079)
    public static final class51 method320(class32 arg0, int arg1, int arg2, int arg3) {
        return arg0.field482 == null || arg0.field482.length == 0 ? null : new class51(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II[B[IIIIIIILbj;II)I", line = 1085)
    private static final int method321(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class51 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field693 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([B[IIIIIIILbj;)I", line = 1113)
    private static final int method322(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class51 arg8) {
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
        arg8.field693 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I[B[IIIIIIIILbj;)I", line = 1138)
    private static final int method323(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class51 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field693 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "()Z", line = 1178)
    public final boolean method324() {
        return this.field693 < 0 || this.field693 >= ((class32) this.field3572).field482.length << 8;
    }

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "()Z", line = 1182)
    private final boolean method325() {
        int var1 = this.field691;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method305(var1, this.field692);
            var2 = method328(var1, this.field692);
        }
        if (this.field687 != var1 || this.field688 != var3 || this.field690 != var2) {
            if (this.field687 < var1) {
                this.field700 = 1;
                this.field699 = var1 - this.field687;
            } else if (this.field687 > var1) {
                this.field700 = -1;
                this.field699 = this.field687 - var1;
            } else {
                this.field700 = 0;
            }
            if (this.field688 < var3) {
                this.field697 = 1;
                if (this.field699 == 0 || this.field699 > var3 - this.field688) {
                    this.field699 = var3 - this.field688;
                }
            } else if (this.field688 > var3) {
                this.field697 = -1;
                if (this.field699 == 0 || this.field699 > this.field688 - var3) {
                    this.field699 = this.field688 - var3;
                }
            } else {
                this.field697 = 0;
            }
            if (this.field690 < var2) {
                this.field701 = 1;
                if (this.field699 == 0 || this.field699 > var2 - this.field690) {
                    this.field699 = var2 - this.field690;
                }
            } else if (this.field690 > var2) {
                this.field701 = -1;
                if (this.field699 == 0 || this.field699 > this.field690 - var2) {
                    this.field699 = this.field690 - var2;
                }
            } else {
                this.field701 = 0;
            }
            return false;
        } else if (this.field691 == Integer.MIN_VALUE) {
            this.field691 = 0;
            this.field687 = this.field688 = this.field690 = 0;
            this.method557((byte) -89);
            return true;
        } else {
            this.method293();
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "(I)V", line = 1268)
    public final synchronized void method326(int arg0) {
        if (arg0 == 0) {
            this.method314(0);
            this.method557((byte) -89);
        } else if (this.field688 == 0 && this.field690 == 0) {
            this.field699 = 0;
            this.field691 = 0;
            this.field687 = 0;
            this.method557((byte) -89);
        } else {
            int var2 = -this.field687;
            if (this.field687 > var2) {
                var2 = this.field687;
            }
            if (-this.field688 > var2) {
                var2 = -this.field688;
            }
            if (this.field688 > var2) {
                var2 = this.field688;
            }
            if (-this.field690 > var2) {
                var2 = -this.field690;
            }
            if (this.field690 > var2) {
                var2 = this.field690;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field699 = arg0;
            this.field691 = Integer.MIN_VALUE;
            this.field700 = -this.field687 / arg0;
            this.field697 = -this.field688 / arg0;
            this.field701 = -this.field690 / arg0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "([B[IIIIIIIILbj;)I", line = 1314)
    private static final int method327(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class51 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field688 += (var14 - arg3) * arg9.field697;
        arg9.field690 += (var14 - arg3) * arg9.field701;
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
        arg9.field687 = var12 >> 2;
        arg9.field693 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(II)I", line = 1349)
    private static final int method328(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II[B[IIIIIIIILbj;II)I", line = 1353)
    private static final int method329(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class51 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field693 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "()I", line = 1386)
    public final synchronized int method330() {
        return this.field691 == Integer.MIN_VALUE ? 0 : this.field691;
    }

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "()Z", line = 1392)
    public final boolean method331() {
        return this.field699 != 0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "([B[IIIIIIILbj;)I", line = 1399)
    private static final int method332(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class51 arg8) {
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
        arg8.field693 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(II[B[IIIIIIIILbj;II)I", line = 1425)
    private static final int method333(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class51 arg11, int arg12, int arg13) {
        arg11.field688 -= arg11.field697 * arg5;
        arg11.field690 -= arg11.field701 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field688 += arg11.field697 * arg5;
        arg11.field690 += arg11.field701 * arg5;
        arg11.field687 = arg6;
        arg11.field693 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lhb;II)V", line = 1457)
    private class51(class32 arg0, int arg1, int arg2) {
        this.field3572 = arg0;
        this.field696 = arg0.field485;
        this.field689 = arg0.field483;
        this.field698 = arg0.field486;
        this.field694 = arg1;
        this.field691 = arg2;
        this.field692 = 8192;
        this.field693 = 0;
        this.method293();
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lhb;III)V", line = 1469)
    private class51(class32 arg0, int arg1, int arg2, int arg3) {
        this.field3572 = arg0;
        this.field696 = arg0.field485;
        this.field689 = arg0.field483;
        this.field698 = arg0.field486;
        this.field694 = arg1;
        this.field691 = arg2;
        this.field692 = arg3;
        this.field693 = 0;
        this.method293();
    }
}
