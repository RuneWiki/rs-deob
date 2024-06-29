import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class192 {

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Lia;")
    public class539 field2826 = new class539();

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field2831 = -1;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "Z")
    public static volatile boolean field2835 = true;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "Z")
    public static boolean field2834 = false;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!su", name = "v", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Lia;")
    private class539 field2828;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IBI)I")
    public static final int method1268(int arg0, byte arg1, int arg2) {
        if (arg1 < 69) {
            return -103;
        }
        field2833++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public final void method1269(byte arg0) {
        while (true) {
            class539 var2 = this.field2826.field7315;
            if (this.field2826 == var2) {
                field2840++;
                if (arg0 <= 80) {
                    return;
                }
                this.field2828 = null;
                return;
            }
            var2.method2971(1);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Lia;")
    public final class539 method1270(byte arg0) {
        field2843++;
        class539 var2 = this.field2826.field7315;
        if (arg0 != -25) {
            return null;
        } else if (this.field2826 == var2) {
            this.field2828 = null;
            return null;
        } else {
            this.field2828 = var2.field7315;
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lia;Lsu;B)V")
    private final void method1271(class539 arg0, class192 arg1, byte arg2) {
        if (arg2 > -112) {
            this.field2826 = null;
        }
        field2836++;
        class539 var4 = this.field2826.field7306;
        this.field2826.field7306 = arg0.field7306;
        arg0.field7306.field7315 = this.field2826;
        if (this.field2826 != arg0) {
            arg0.field7306 = arg1.field2826.field7306;
            arg0.field7306.field7315 = arg0;
            var4.field7315 = arg1.field2826;
            arg1.field2826.field7306 = var4;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Lia;")
    public final class539 method1272(int arg0) {
        field2830++;
        if (arg0 != 0) {
            field2834 = true;
        }
        class539 var2 = this.field2826.field7315;
        if (this.field2826 == var2) {
            return null;
        } else {
            var2.method2971(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lia;B)V")
    public final void method1273(class539 arg0, byte arg1) {
        if (arg1 != 122) {
            return;
        }
        field2832++;
        if (arg0.field7306 != null) {
            arg0.method2971(1);
        }
        arg0.field7306 = this.field2826.field7306;
        arg0.field7315 = this.field2826;
        arg0.field7306.field7315 = arg0;
        arg0.field7315.field7306 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(B)Z")
    public final boolean method1274(byte arg0) {
        if (arg0 <= 92) {
            field2831 = 6;
        }
        field2841++;
        return this.field2826.field7315 == this.field2826;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lfa;ILoa;IILfaa;III)V")
    public static final void method1275(class212 arg0, int arg1, class638 arg2, int arg3, int arg4, class140 arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 16406) {
            field2835 = false;
        }
        field2827++;
        class307 var9 = class536.field7294.method2872((byte) 122, arg1);
        if (var9 == null || !var9.field4521 || !var9.method1883(-1, class195.field2888)) {
            return;
        }
        if (var9.field4519 != null) {
            int[] var10 = new int[var9.field4519.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class670.field9445 == 4) {
                    var13 = (int) class646.field9167 & 0x3FFF;
                } else {
                    var13 = (int) class646.field9167 + class156.field2356 & 0x3FFF;
                }
                int var14 = class675.field9542[var13];
                int var15 = class675.field9541[var13];
                if (class670.field9445 != 4) {
                    var14 = var14 * 256 / (class455.field6362 + 256);
                    var15 = var15 * 256 / (class455.field6362 + 256);
                }
                var10[var11 * 2] = arg5.field2121 / 2 + ((var9.field4519[var11 * 2] * 4 + arg8) * var15 + (var9.field4519[var11 * 2 + 1] * 4 + arg4) * var14 >> 14) + arg6;
                var10[var11 * 2 + 1] = arg5.field2082 / 2 + arg3 - ((arg4 - -(var9.field4519[var11 * 2 - -1] * 4)) * var15 + -((arg8 - -(var9.field4519[var11 * 2] * 4)) * var14) >> 14);
            }
            class163.method1128(arg2, var10, var9.field4546, arg5.field2020, arg5.field2084);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg2.method441(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field4551, 1, arg0, arg6, arg3);
            }
            arg2.method441(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4551, 1, arg0, arg6, arg3);
        }
        class461 var16 = null;
        if (var9.field4539 != -1) {
            var16 = var9.method1888(false, 0, arg2);
            if (var16 != null) {
                class317.method1941(arg6, var16, arg8, arg0, arg4, arg5, 3265, arg3);
            }
        }
        if (var9.field4517 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method26();
        }
        class194 var18 = class229.field3276;
        class599 var19 = class424.field5975;
        if (var9.field4533 == 1) {
            var18 = class668.field9418;
            var19 = class226.field3256;
        }
        if (var9.field4533 == 2) {
            var18 = class548.field7419;
            var19 = class432.field6119;
        }
        class488.method2746(var9.field4517, arg8, var19, var17, var18, -126, arg0, arg4, arg6, var9.field4509, arg5, arg3);
        return;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
    public final int method1276(int arg0) {
        field2842++;
        int var2 = 0;
        if (arg0 <= 8) {
            method1279(-19, 48);
        }
        for (class539 var3 = this.field2826.field7315; var3 != this.field2826; var3 = var3.field7315) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)V")
    public static final void method1277(int arg0) {
        field2825++;
        if (arg0 >= -100) {
            return;
        }
        if (class552.field7489 != null) {
            class552.field7489.method2225(-3);
        }
        if (class173.field2597 != null) {
            class173.field2597.method2225(-3);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLsu;)V")
    public final void method1278(byte arg0, class192 arg1) {
        field2844++;
        if (arg0 != 90) {
            this.method1282(2);
        }
        this.method1271(this.field2826.field7315, arg1, (byte) -117);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
    public static final int method1279(int arg0, int arg1) {
        if (arg0 == 1696991210) {
            field2837++;
            return arg1 >>> 10;
        } else {
            return 18;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Lia;B)V")
    public final void method1280(class539 arg0, byte arg1) {
        if (arg0.field7306 != null) {
            arg0.method2971(1);
        }
        field2824++;
        arg0.field7306 = this.field2826;
        arg0.field7315 = this.field2826.field7315;
        arg0.field7306.field7315 = arg0;
        int var3 = 35 % ((-arg1 - 8) / 54);
        arg0.field7315.field7306 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)Lia;")
    public final class539 method1281(int arg0) {
        field2829++;
        class539 var2 = this.field2828;
        if (arg0 != 2) {
            this.method1278((byte) 111, null);
        }
        if (this.field2826 == var2) {
            this.field2828 = null;
            return null;
        } else {
            this.field2828 = var2.field7306;
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Lia;")
    public final class539 method1282(int arg0) {
        field2839++;
        class539 var2 = this.field2828;
        if (arg0 != 0) {
            this.method1270((byte) -23);
        }
        if (this.field2826 == var2) {
            this.field2828 = null;
            return null;
        } else {
            this.field2828 = var2.field7315;
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lw;III[Z)Z")
    public static final boolean method1283(class271 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class581.field8114 != class144.field2149) {
            int var6 = class31.field369[arg1].method267(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class136 var8 = class31.field369[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method267(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method276(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method277(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
    public class192() {
        this.field2826.field7315 = this.field2826;
        this.field2826.field7306 = this.field2826;
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(I)Lia;")
    public final class539 method1284(int arg0) {
        field2823++;
        if (arg0 != 0) {
            this.field2828 = null;
        }
        class539 var2 = this.field2826.field7306;
        if (this.field2826 == var2) {
            this.field2828 = null;
            return null;
        } else {
            this.field2828 = var2.field7306;
            return var2;
        }
    }
}
