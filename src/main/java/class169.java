import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class169 extends class601 {

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "I")
    private int field2595 = 4096;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "I")
    private int field2594 = 2048;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
    private int field2601 = 0;

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    private int field2597 = 2048;

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    private int field2600 = 8192;

    @OriginalMember(owner = "client!wq", name = "O", descriptor = "I")
    private int field2603 = 0;

    @OriginalMember(owner = "client!wq", name = "S", descriptor = "I")
    private int field2607 = 12288;

    @OriginalMember(owner = "client!wq", name = "P", descriptor = "Lcda;")
    public static class173 field2604 = new class173();

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!wq", name = "D", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!wq", name = "Q", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!wq", name = "R", descriptor = "[I")
    public static int[] field2606;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field2604 = null;
        field2606 = null;
        int var1 = 55 % ((arg0 - -54) / 62);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1202(int arg0, int arg1, boolean arg2) {
        ++field2599;
        int var4 = (-arg1 + arg0) * this.field2607 >> 12;
        if (!arg2) {
            return false;
        } else {
            int var5 = class379.field5284[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field2607;
            int var7 = (var6 << 12) / this.field2600;
            int var8 = this.field2595 * var7 >> 12;
            return arg1 - -arg0 < var8 && ~(-var8) > ~(arg0 + arg1);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        if (arg0 != -40) {
            this.field2600 = 110;
        }
        ++field2596;
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class250.field3446[arg1] + -2048;
            for (int var5 = 0; var5 < class171.field2624; ++var5) {
                int var6 = class453.field6186[var5] + -2048;
                int var7 = this.field2597 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field2601 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field2603 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field2594 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1202(var12, var9, true) && !this.method1203(var18, var15, false) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field2600 = arg0.method3807(-1);
                                }
                            } else {
                                this.field2595 = arg0.method3807(-1);
                            }
                        } else {
                            this.field2607 = arg0.method3807(-1);
                        }
                    } else {
                        this.field2594 = arg0.method3807(-1);
                    }
                } else {
                    this.field2603 = arg0.method3807(arg1 ^ 60);
                }
            } else {
                this.field2601 = arg0.method3807(-1);
            }
        } else {
            this.field2597 = arg0.method3807(-1);
        }
        if (arg1 != -61) {
            this.field2607 = -20;
        }
        ++field2602;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(IIZ)Z")
    private final boolean method1203(int arg0, int arg1, boolean arg2) {
        ++field2605;
        int var4 = (arg0 + arg1) * this.field2607 >> 12;
        int var5 = class379.field5284[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2607;
        int var7 = (var6 << 12) / this.field2600;
        int var8 = this.field2595 * var7 >> 12;
        if (arg2) {
            method1205((byte) 0);
        }
        return var8 > -arg1 + arg0 && ~(-arg1 + arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field2592;
        class564.method3118(true);
        if (arg0 != 8351) {
            this.field2607 = -55;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([IIB[II)V")
    public static final void method1204(int[] arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        ++field2598;
        if (arg2 <= -29) {
            if (~arg1 > ~arg4) {
                int var5 = (arg1 + arg4) / 2;
                int var6 = arg1;
                int var7 = arg0[var5];
                arg0[var5] = arg0[arg4];
                arg0[arg4] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg4];
                arg3[arg4] = var8;
                int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
                for (int var10 = arg1; var10 < arg4; ++var10) {
                    if (~((var10 & var9) + var7) < ~arg0[var10]) {
                        int var11 = arg0[var10];
                        arg0[var10] = arg0[var6];
                        arg0[var6] = var11;
                        int var12 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6++] = var12;
                    }
                }
                arg0[arg4] = arg0[var6];
                arg0[var6] = var7;
                arg3[arg4] = arg3[var6];
                arg3[var6] = var8;
                method1204(arg0, arg1, (byte) -55, arg3, var6 - 1);
                method1204(arg0, var6 + 1, (byte) -90, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static final void method1205(byte arg0) {
        ++field2593;
        class586.field7665 = 0;
        if (arg0 == 73) {
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class388.field5407[var1] = null;
                class261.field3636[var1] = 1;
                class32.field496[var1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILkn;I)V")
    public static final void method1206(int arg0, class742 arg1, int arg2) {
        ++field2591;
        int var3 = -1;
        int var4 = 0;
        if (~arg1.field10231 < ~class29.field474) {
            class320.method1945(512, arg1);
        } else if (~class29.field474 >= ~arg1.field10273) {
            class347.method2074((byte) 33, arg1);
        } else {
            class388.method2301(-1024, arg1, false);
            var3 = class204.field3050;
            var4 = class353.field4963;
        }
        if (~arg1.field3505 > -513 || arg1.field3502 < 512 || ~((class719.field10004 - 1) * 512) >= ~arg1.field3505 || ~arg1.field3502 <= ~(class107.field1453 * 512 + -512)) {
            arg1.field10227 = null;
            var3 = -1;
            arg1.field10273 = 0;
            var4 = 0;
            arg1.field10231 = 0;
            arg1.field10257 = -1;
            arg1.field3505 = arg1.field10322[0] * 512 - -(256 * arg1.method2256(-1));
            arg1.field3502 = arg1.field10321[0] * 512 - -(256 * arg1.method2256(-1));
            arg1.method4138(0);
            for (int var5 = 0; ~arg1.field10254.length < ~var5; ++var5) {
                arg1.field10254[var5].field6361 = -1;
            }
        }
        if (class472.field6475 == arg1 && (arg1.field3505 < 6144 || arg1.field3502 < 6144 || ~((class719.field10004 + -12) * 512) >= ~arg1.field3505 || ~arg1.field3502 <= ~((class107.field1453 - 12) * 512))) {
            arg1.field10273 = 0;
            var3 = -1;
            arg1.field10227 = null;
            var4 = 0;
            arg1.field10257 = -1;
            arg1.field10231 = 0;
            arg1.field3505 = arg1.field10322[0] * 512 + arg1.method2256(-1) * 256;
            arg1.field3502 = arg1.field10321[0] * 512 + 256 * arg1.method2256(arg0 + -257);
            arg1.method4138(0);
            for (int var6 = 0; ~var6 > ~arg1.field10254.length; ++var6) {
                arg1.field10254[var6].field6361 = -1;
            }
        }
        int var7 = class614.method3340(-1, arg1);
        class360.method2145(arg0 ^ -14449, arg1);
        class116.method955(var4, arg1, (byte) -57, var7, var3);
        class725.method4083(arg1, var3, arg0 ^ arg0);
        class572.method3150((byte) -125, arg1);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, true);
    }
}
