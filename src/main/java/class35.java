import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class35 extends class271 {

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Z")
    private boolean field630;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "()I")
    public final synchronized int method235() {
        return this.field624 < 0 ? -1 : this.field624;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
    public final synchronized void method236(int arg0) {
        this.method248(arg0 << 6, this.method235());
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "()I")
    public final synchronized int method237() {
        return this.field621 == Integer.MIN_VALUE ? 0 : this.field621;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()I")
    public final int method238() {
        int var1 = this.field627 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field623 == 0) {
            var2 -= this.field631 * var2 / (((class98) super.field4221).field1446.length << 8);
        } else if (this.field623 >= 0) {
            var2 -= this.field628 * var2 / ((class98) super.field4221).field1446.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V")
    public final synchronized void method239(int arg0) {
        this.field623 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[B[IIIIIIILsl;II)I")
    private static final int method240(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10, int arg11, int arg12) {
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
        arg10.field631 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)I")
    private static final int method241(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([IIIII)I")
    private final int method242(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field625 <= 0) {
                if (this.field622 == -256 && (this.field631 & 255) == 0) {
                    if (class133.field1955) {
                        return method253(0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, 0, arg3, arg2, this);
                    }
                    return method265(((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, 0, arg3, arg2, this);
                }
                if (class133.field1955) {
                    return method247(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, 0, arg3, arg2, this, this.field622, arg4);
                }
                return method240(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, 0, arg3, arg2, this, this.field622, arg4);
            }
            int var6 = this.field625 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field625 += arg1;
            if (this.field622 == -256 && (this.field631 & 255) == 0) {
                if (class133.field1955) {
                    arg1 = method277(0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, this.field626, this.field634, 0, var6, arg2, this);
                } else {
                    arg1 = method266(((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, this.field629, 0, var6, arg2, this);
                }
            } else if (class133.field1955) {
                arg1 = method263(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, this.field626, this.field634, 0, var6, arg2, this, this.field622, arg4);
            } else {
                arg1 = method261(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, this.field629, 0, var6, arg2, this, this.field622, arg4);
            }
            this.field625 -= arg1;
            if (this.field625 != 0) {
                return arg1;
            }
        } while (!this.method274());
        return arg3;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)I")
    private static final int method243(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "()I")
    public final synchronized int method244() {
        return this.field622 < 0 ? -this.field622 : this.field622;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ltf;III)Lsl;")
    public static final class35 method245(class98 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1446 != null && arg0.field1446.length != 0 ? new class35(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
    public final synchronized void method246(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method248(arg1, arg2);
        } else {
            int var4 = method241(arg1, arg2);
            int var5 = method243(arg1, arg2);
            if (this.field633 == var4 && this.field632 == var5) {
                this.field625 = 0;
            } else {
                int var6 = arg1 - this.field627;
                if (this.field627 - arg1 > var6) {
                    var6 = this.field627 - arg1;
                }
                if (var4 - this.field633 > var6) {
                    var6 = var4 - this.field633;
                }
                if (this.field633 - var4 > var6) {
                    var6 = this.field633 - var4;
                }
                if (var5 - this.field632 > var6) {
                    var6 = var5 - this.field632;
                }
                if (this.field632 - var5 > var6) {
                    var6 = this.field632 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field625 = arg0;
                this.field621 = arg1;
                this.field624 = arg2;
                this.field629 = (arg1 - this.field627) / arg0;
                this.field626 = (var4 - this.field633) / arg0;
                this.field634 = (var5 - this.field632) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[B[IIIIIIIILsl;II)I")
    private static final int method247(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
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
        arg11.field631 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(II)V")
    private final synchronized void method248(int arg0, int arg1) {
        this.field621 = arg0;
        this.field624 = arg1;
        this.field625 = 0;
        this.method251();
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II[B[IIIIIIILsl;II)I")
    private static final int method249(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10, int arg11, int arg12) {
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
        arg10.field631 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "()Lgj;")
    public final class271 method250() {
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "()V")
    private final void method251() {
        this.field627 = this.field621;
        this.field633 = method241(this.field621, this.field624);
        this.field632 = method243(this.field621, this.field624);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public final synchronized void method252(boolean arg0) {
        this.field622 = (this.field622 >>> 31) + (this.field622 ^ this.field622 >> 31);
        if (arg0) {
            this.field622 = -this.field622;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[B[IIIIIIIILsl;)I")
    private static final int method253(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10) {
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
        arg10.field631 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II[B[IIIIIIIILsl;II)I")
    private static final int method254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
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
        arg11.field631 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[B[IIIIIIIIIILsl;II)I")
    private static final int method255(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class35 arg13, int arg14, int arg15) {
        arg13.field627 -= arg13.field629 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var17++;
            arg3[var10001] += arg6 * var27 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var27 >> 6;
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
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var21 - var23);
            var10001 = var17++;
            arg3[var10001] += arg6 * var24 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field627 += arg13.field629 * var22;
        arg13.field633 = arg6;
        arg13.field632 = arg7;
        arg13.field631 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([B[IIIIIIILsl;)I")
    private static final int method256(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class35 arg8) {
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
        arg8.field631 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
    public final synchronized void method257(int arg0) {
        int var2 = ((class98) super.field4221).field1446.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field631 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I[B[IIIIIIIILsl;)I")
    private static final int method258(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class35 arg10) {
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
        arg10.field631 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()Lgj;")
    public final class271 method259() {
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "()Z")
    public final boolean method260() {
        return this.field625 != 0;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II[B[IIIIIIIILsl;II)I")
    private static final int method261(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
        arg11.field633 -= arg11.field626 * arg5;
        arg11.field632 -= arg11.field634 * arg5;
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
        arg11.field633 += arg11.field626 * arg5;
        arg11.field632 += arg11.field634 * arg5;
        arg11.field627 = arg6;
        arg11.field631 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([III)V")
    public final synchronized void method262(int[] arg0, int arg1, int arg2) {
        if (this.field621 == 0 && this.field625 == 0) {
            this.method280(arg2);
        } else {
            class98 var4 = (class98) super.field4221;
            int var5 = this.field628 << 8;
            int var6 = this.field635 << 8;
            int var7 = var4.field1446.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field623 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field631 < 0) {
                if (this.field622 <= 0) {
                    this.method271();
                    this.method1193(126);
                    return;
                }
                this.field631 = 0;
            }
            if (this.field631 >= var7) {
                if (this.field622 >= 0) {
                    this.method271();
                    this.method1193(108);
                    return;
                }
                this.field631 = var7 - 1;
            }
            if (this.field623 < 0) {
                if (this.field630) {
                    if (this.field622 < 0) {
                        var9 = this.method242(arg0, arg1, var5, var10, var4.field1446[this.field628]);
                        if (this.field631 >= var5) {
                            return;
                        }
                        this.field631 = var5 + var5 - 1 - this.field631;
                        this.field622 = -this.field622;
                    }
                    while (true) {
                        int var11 = this.method272(arg0, var9, var6, var10, var4.field1446[this.field635 - 1]);
                        if (this.field631 < var6) {
                            return;
                        }
                        this.field631 = var6 + var6 - 1 - this.field631;
                        this.field622 = -this.field622;
                        var9 = this.method242(arg0, var11, var5, var10, var4.field1446[this.field628]);
                        if (this.field631 >= var5) {
                            return;
                        }
                        this.field631 = var5 + var5 - 1 - this.field631;
                        this.field622 = -this.field622;
                    }
                } else if (this.field622 < 0) {
                    while (true) {
                        var9 = this.method242(arg0, var9, var5, var10, var4.field1446[this.field635 - 1]);
                        if (this.field631 >= var5) {
                            return;
                        }
                        this.field631 = var6 - 1 - (var6 - 1 - this.field631) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method272(arg0, var9, var6, var10, var4.field1446[this.field628]);
                        if (this.field631 < var6) {
                            return;
                        }
                        this.field631 = (this.field631 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field623 > 0) {
                    if (this.field630) {
                        label130: {
                            if (this.field622 < 0) {
                                var9 = this.method242(arg0, arg1, var5, var10, var4.field1446[this.field628]);
                                if (this.field631 >= var5) {
                                    return;
                                }
                                this.field631 = var5 + var5 - 1 - this.field631;
                                this.field622 = -this.field622;
                                if (--this.field623 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method272(arg0, var9, var6, var10, var4.field1446[this.field635 - 1]);
                                if (this.field631 < var6) {
                                    return;
                                }
                                this.field631 = var6 + var6 - 1 - this.field631;
                                this.field622 = -this.field622;
                                if (--this.field623 == 0) {
                                    break;
                                }
                                var9 = this.method242(arg0, var9, var5, var10, var4.field1446[this.field628]);
                                if (this.field631 >= var5) {
                                    return;
                                }
                                this.field631 = var5 + var5 - 1 - this.field631;
                                this.field622 = -this.field622;
                            } while (--this.field623 != 0);
                        }
                    } else if (this.field622 < 0) {
                        while (true) {
                            var9 = this.method242(arg0, var9, var5, var10, var4.field1446[this.field635 - 1]);
                            if (this.field631 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field631) / var8;
                            if (var12 >= this.field623) {
                                this.field631 += this.field623 * var8;
                                this.field623 = 0;
                                break;
                            }
                            this.field631 += var8 * var12;
                            this.field623 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method272(arg0, var9, var6, var10, var4.field1446[this.field628]);
                            if (this.field631 < var6) {
                                return;
                            }
                            int var13 = (this.field631 - var5) / var8;
                            if (var13 >= this.field623) {
                                this.field631 -= this.field623 * var8;
                                this.field623 = 0;
                                break;
                            }
                            this.field631 -= var8 * var13;
                            this.field623 -= var13;
                        }
                    }
                }
                if (this.field622 < 0) {
                    this.method242(arg0, var9, 0, var10, 0);
                    if (this.field631 < 0) {
                        this.field631 = -1;
                        this.method271();
                        this.method1193(122);
                        return;
                    }
                } else {
                    this.method272(arg0, var9, var7, var10, 0);
                    if (this.field631 >= var7) {
                        this.field631 = var7;
                        this.method271();
                        this.method1193(111);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II[B[IIIIIIIIIILsl;II)I")
    private static final int method263(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class35 arg13, int arg14, int arg15) {
        arg13.field627 -= arg13.field629 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
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
            int var23 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field627 += arg13.field629 * var22;
        arg13.field633 = arg6;
        arg13.field632 = arg7;
        arg13.field631 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(II[B[IIIIIIIILsl;II)I")
    private static final int method264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class35 arg11, int arg12, int arg13) {
        arg11.field633 -= arg11.field626 * arg5;
        arg11.field632 -= arg11.field634 * arg5;
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
        arg11.field633 += arg11.field626 * arg5;
        arg11.field632 += arg11.field634 * arg5;
        arg11.field627 = arg6;
        arg11.field631 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "([B[IIIIIIILsl;)I")
    private static final int method265(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class35 arg8) {
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
        arg8.field631 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([B[IIIIIIIILsl;)I")
    private static final int method266(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class35 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field633 += (var14 - arg3) * arg9.field626;
        arg9.field632 += (var14 - arg3) * arg9.field634;
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
        arg9.field627 = var12 >> 2;
        arg9.field631 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ltf;II)Lsl;")
    public static final class35 method267(class98 arg0, int arg1, int arg2) {
        return arg0.field1446 != null && arg0.field1446.length != 0 ? new class35(arg0, (int) ((long) arg0.field1448 * 256L * (long) arg1 / (long) (class174.field2547 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public final synchronized void method268(int arg0) {
        if (arg0 == 0) {
            this.method276(0);
            this.method1193(125);
        } else if (this.field633 == 0 && this.field632 == 0) {
            this.field625 = 0;
            this.field621 = 0;
            this.field627 = 0;
            this.method1193(111);
        } else {
            int var2 = -this.field627;
            if (this.field627 > var2) {
                var2 = this.field627;
            }
            if (-this.field633 > var2) {
                var2 = -this.field633;
            }
            if (this.field633 > var2) {
                var2 = this.field633;
            }
            if (-this.field632 > var2) {
                var2 = -this.field632;
            }
            if (this.field632 > var2) {
                var2 = this.field632;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field625 = arg0;
            this.field621 = Integer.MIN_VALUE;
            this.field629 = -this.field627 / arg0;
            this.field626 = -this.field633 / arg0;
            this.field634 = -this.field632 / arg0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[B[IIIIIIIIIILsl;)I")
    private static final int method269(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class35 arg12) {
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
        arg12.field627 += (var19 - arg4) * arg12.field629;
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
        arg12.field633 = var15 >> 2;
        arg12.field632 = var16 >> 2;
        arg12.field631 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(II)V")
    public final synchronized void method270(int arg0, int arg1) {
        this.method246(arg0, arg1, this.method235());
    }

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "()V")
    private final void method271() {
        if (this.field625 != 0) {
            if (this.field621 == Integer.MIN_VALUE) {
                this.field621 = 0;
            }
            this.field625 = 0;
            this.method251();
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "([IIIII)I")
    private final int method272(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field625 <= 0) {
                if (this.field622 == 256 && (this.field631 & 255) == 0) {
                    if (class133.field1955) {
                        return method258(0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, 0, arg3, arg2, this);
                    }
                    return method256(((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, 0, arg3, arg2, this);
                }
                if (class133.field1955) {
                    return method254(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, 0, arg3, arg2, this, this.field622, arg4);
                }
                return method249(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, 0, arg3, arg2, this, this.field622, arg4);
            }
            int var6 = this.field625 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field625 += arg1;
            if (this.field622 == 256 && (this.field631 & 255) == 0) {
                if (class133.field1955) {
                    arg1 = method269(0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, this.field626, this.field634, 0, var6, arg2, this);
                } else {
                    arg1 = method273(((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, this.field629, 0, var6, arg2, this);
                }
            } else if (class133.field1955) {
                arg1 = method255(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field633, this.field632, this.field626, this.field634, 0, var6, arg2, this, this.field622, arg4);
            } else {
                arg1 = method264(0, 0, ((class98) super.field4221).field1446, arg0, this.field631, arg1, this.field627, this.field629, 0, var6, arg2, this, this.field622, arg4);
            }
            this.field625 -= arg1;
            if (this.field625 != 0) {
                return arg1;
            }
        } while (!this.method274());
        return arg3;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "([B[IIIIIIIILsl;)I")
    private static final int method273(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class35 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field633 += (var14 - arg3) * arg9.field626;
        arg9.field632 += (var14 - arg3) * arg9.field634;
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
        arg9.field627 = var12 >> 2;
        arg9.field631 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "()Z")
    private final boolean method274() {
        int var1 = this.field621;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method241(var1, this.field624);
            var2 = method243(var1, this.field624);
        }
        if (this.field627 == var1 && this.field633 == var3 && this.field632 == var2) {
            if (this.field621 == Integer.MIN_VALUE) {
                this.field621 = 0;
                this.field627 = this.field633 = this.field632 = 0;
                this.method1193(118);
                return true;
            } else {
                this.method251();
                return false;
            }
        } else {
            if (this.field627 < var1) {
                this.field629 = 1;
                this.field625 = var1 - this.field627;
            } else if (this.field627 > var1) {
                this.field629 = -1;
                this.field625 = this.field627 - var1;
            } else {
                this.field629 = 0;
            }
            if (this.field633 < var3) {
                this.field626 = 1;
                if (this.field625 == 0 || this.field625 > var3 - this.field633) {
                    this.field625 = var3 - this.field633;
                }
            } else if (this.field633 > var3) {
                this.field626 = -1;
                if (this.field625 == 0 || this.field625 > this.field633 - var3) {
                    this.field625 = this.field633 - var3;
                }
            } else {
                this.field626 = 0;
            }
            if (this.field632 < var2) {
                this.field634 = 1;
                if (this.field625 == 0 || this.field625 > var2 - this.field632) {
                    this.field625 = var2 - this.field632;
                }
            } else if (this.field632 > var2) {
                this.field634 = -1;
                if (this.field625 == 0 || this.field625 > this.field632 - var2) {
                    this.field625 = this.field632 - var2;
                }
            } else {
                this.field634 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()I")
    public final int method275() {
        return this.field621 == 0 && this.field625 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)V")
    private final synchronized void method276(int arg0) {
        this.method248(arg0, this.method235());
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I[B[IIIIIIIIIILsl;)I")
    private static final int method277(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class35 arg12) {
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
        arg12.field627 += (var19 - arg4) * arg12.field629;
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
        arg12.field633 = var15 >> 2;
        arg12.field632 = var16 >> 2;
        arg12.field631 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)V")
    public final synchronized void method278(int arg0) {
        if (this.field622 < 0) {
            this.field622 = -arg0;
        } else {
            this.field622 = arg0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "()Z")
    public final boolean method279() {
        return this.field631 < 0 || this.field631 >= ((class98) super.field4221).field1446.length << 8;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public final synchronized void method280(int arg0) {
        if (this.field625 > 0) {
            if (arg0 >= this.field625) {
                if (this.field621 == Integer.MIN_VALUE) {
                    this.field621 = 0;
                    this.field627 = this.field633 = this.field632 = 0;
                    this.method1193(127);
                    arg0 = this.field625;
                }
                this.field625 = 0;
                this.method251();
            } else {
                this.field627 += this.field629 * arg0;
                this.field633 += this.field626 * arg0;
                this.field632 += this.field634 * arg0;
                this.field625 -= arg0;
            }
        }
        class98 var2 = (class98) super.field4221;
        int var3 = this.field628 << 8;
        int var4 = this.field635 << 8;
        int var5 = var2.field1446.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field623 = 0;
        }
        if (this.field631 < 0) {
            if (this.field622 <= 0) {
                this.method271();
                this.method1193(126);
                return;
            }
            this.field631 = 0;
        }
        if (this.field631 >= var5) {
            if (this.field622 >= 0) {
                this.method271();
                this.method1193(111);
                return;
            }
            this.field631 = var5 - 1;
        }
        this.field631 += this.field622 * arg0;
        if (this.field623 < 0) {
            if (!this.field630) {
                if (this.field622 < 0) {
                    if (this.field631 < var3) {
                        this.field631 = var4 - 1 - (var4 - 1 - this.field631) % var6;
                    }
                } else if (this.field631 >= var4) {
                    this.field631 = (this.field631 - var3) % var6 + var3;
                }
            } else {
                if (this.field622 < 0) {
                    if (this.field631 >= var3) {
                        return;
                    }
                    this.field631 = var3 + var3 - 1 - this.field631;
                    this.field622 = -this.field622;
                }
                while (this.field631 >= var4) {
                    this.field631 = var4 + var4 - 1 - this.field631;
                    this.field622 = -this.field622;
                    if (this.field631 >= var3) {
                        return;
                    }
                    this.field631 = var3 + var3 - 1 - this.field631;
                    this.field622 = -this.field622;
                }
            }
        } else {
            if (this.field623 > 0) {
                if (this.field630) {
                    label125: {
                        if (this.field622 < 0) {
                            if (this.field631 >= var3) {
                                return;
                            }
                            this.field631 = var3 + var3 - 1 - this.field631;
                            this.field622 = -this.field622;
                            if (--this.field623 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field631 < var4) {
                                return;
                            }
                            this.field631 = var4 + var4 - 1 - this.field631;
                            this.field622 = -this.field622;
                            if (--this.field623 == 0) {
                                break;
                            }
                            if (this.field631 >= var3) {
                                return;
                            }
                            this.field631 = var3 + var3 - 1 - this.field631;
                            this.field622 = -this.field622;
                        } while (--this.field623 != 0);
                    }
                } else if (this.field622 < 0) {
                    if (this.field631 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field631) / var6;
                    if (var7 < this.field623) {
                        this.field631 += var6 * var7;
                        this.field623 -= var7;
                        return;
                    }
                    this.field631 += this.field623 * var6;
                    this.field623 = 0;
                } else {
                    if (this.field631 < var4) {
                        return;
                    }
                    int var8 = (this.field631 - var3) / var6;
                    if (var8 < this.field623) {
                        this.field631 -= var6 * var8;
                        this.field623 -= var8;
                        return;
                    }
                    this.field631 -= this.field623 * var6;
                    this.field623 = 0;
                }
            }
            if (this.field622 < 0) {
                if (this.field631 < 0) {
                    this.field631 = -1;
                    this.method271();
                    this.method1193(124);
                    return;
                }
            } else if (this.field631 >= var5) {
                this.field631 = var5;
                this.method271();
                this.method1193(123);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ltf;II)V")
    private class35(class98 arg0, int arg1, int arg2) {
        super.field4221 = arg0;
        this.field628 = arg0.field1450;
        this.field635 = arg0.field1449;
        this.field630 = arg0.field1447;
        this.field622 = arg1;
        this.field621 = arg2;
        this.field624 = 8192;
        this.field631 = 0;
        this.method251();
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ltf;III)V")
    private class35(class98 arg0, int arg1, int arg2, int arg3) {
        super.field4221 = arg0;
        this.field628 = arg0.field1450;
        this.field635 = arg0.field1449;
        this.field630 = arg0.field1447;
        this.field622 = arg1;
        this.field621 = arg2;
        this.field624 = arg3;
        this.field631 = 0;
        this.method251();
    }
}
