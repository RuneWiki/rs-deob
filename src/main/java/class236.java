import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class236 extends class170 {

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "Lmr;")
    private class611 field3531 = new class611();

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    private int field3539 = 256;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    private int field3544 = 0;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    private int field3540 = 256;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    private int field3528;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "[I")
    public static int[] field3532 = new int[6];

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lgr;")
    public static class530 field3526 = new class530(45, -1);

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    private int field3542;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Ltd;")
    public static class515 field3530;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "Z")
    private boolean field3541;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "Z")
    private boolean field3545;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "[I")
    public static int[] field3543;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "()I", line = 3)
    public final int method1054() {
        field3527++;
        return 1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZLcs;III)V", line = 12)
    public static final void method1642(int arg0, int arg1, boolean arg2, class335 arg3, int arg4, int arg5, int arg6) {
        class603.method3514(arg3.field3920, arg5, arg6, arg1, 0, arg4, arg3.field3916, !arg2, arg3.field3923, arg0);
        field3535++;
        if (!arg2) {
            field3530 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()Los;", line = 23)
    public final class170 method1065() {
        field3534++;
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BDI)Lfl;", line = 31)
    public final class519 method1643(byte arg0, double arg1, int arg2) {
        field3529++;
        long var5 = (long) (arg2 | this.field3528 << 0);
        class519 var7 = (class519) class699.field9862.method2311(var5, (byte) -123);
        if (var7 == null) {
            var7 = new class519(new short[this.field3528][arg2], arg1);
        } else {
            var7.field7475 = arg1;
            class699.field9862.method2315(var5, 16880);
        }
        int var8 = -96 / ((arg0 + 18) / 58);
        return var7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lfl;I)V", line = 55)
    public final synchronized void method1644(class519 arg0, int arg1) {
        while (this.field3544 >= 100) {
            this.field3531.method3563(0);
            this.field3544--;
        }
        field3519++;
        if (arg1 != 22917) {
            this.field3542 = -96;
        }
        this.field3531.method3559(arg0, (byte) 12);
        this.field3544++;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()Los;", line = 75)
    public final class170 method1086() {
        field3538++;
        return null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I", line = 84)
    public final synchronized int method1645(byte arg0) {
        if (arg0 < 35) {
            field3530 = null;
        }
        field3533++;
        return this.field3544;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 101)
    public static void method1646(int arg0) {
        if (arg0 != 6) {
            method1649(66);
        }
        field3532 = null;
        field3530 = null;
        field3526 = null;
        field3543 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)V", line = 114)
    public final synchronized void method1647(boolean arg0) {
        this.field3541 = arg0;
        field3536++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V", line = 123)
    public final void method1648(int arg0, byte arg1) {
        field3522++;
        this.field3540 = arg0;
        this.field3539 = arg0;
        if (arg1 != 119) {
            this.method1652(false, -73);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Z", line = 135)
    public static final boolean method1649(int arg0) {
        field3546++;
        if (arg0 != 3029) {
            method1649(7);
        }
        return class249.field3628 == 0 ? class36.field325.method1950(false) : true;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Lfl;", line = 151)
    private final synchronized class519 method1650(int arg0) {
        field3523++;
        return arg0 == 0 ? (class519) this.field3531.method3565(arg0 ^ 0xFFFFFFD2) : null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([III)V", line = 163)
    public final synchronized void method1088(int[] arg0, int arg1, int arg2) {
        field3537++;
        if (this.field3545) {
            return;
        }
        if (this.method1650(0) != null) {
            int var4 = arg1 + arg2;
            if (class147.field2155) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field3528 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class519 var7 = this.method1650(0);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field7478;
                while (var4 > arg1 && this.field3542 < var8[0].length) {
                    if (class147.field2155) {
                        arg0[arg1++] = var8[var5][this.field3542] * this.field3539;
                        arg0[arg1++] = var8[var6][this.field3542] * this.field3540;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field3542] * this.field3539 + var8[var6][this.field3542] * this.field3540;
                    }
                    this.field3542++;
                }
                if (var8[0].length <= this.field3542) {
                    this.method1653(108);
                }
            }
        } else if (this.field3541) {
            this.method2656((byte) 118);
            class699.field9862.method2310(-19316);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 234)
    public final synchronized void method1083(int arg0) {
        field3521++;
        if (this.field3545) {
            return;
        }
        while (true) {
            class519 var2 = this.method1650(0);
            if (var2 == null) {
                if (this.field3541) {
                    this.method2656((byte) 121);
                    class699.field9862.method2310(-19316);
                }
                return;
            }
            if (arg0 < var2.field7478[0].length - this.field3542) {
                this.field3542 += arg0;
                return;
            }
            arg0 -= var2.field7478[0].length - this.field3542;
            this.method1653(117);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)D", line = 273)
    public final synchronized double method1651(byte arg0) {
        if (arg0 != -89) {
            this.method1651((byte) 117);
        }
        field3525++;
        if (this.field3544 < 1) {
            return -1.0D;
        } else {
            class519 var2 = (class519) this.field3531.method3565(-46);
            return var2 == null ? -1.0D : var2.field7475 - (double) ((float) var2.field7478[0].length / (float) class132.field1821);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V", line = 297)
    public final synchronized void method1652(boolean arg0, int arg1) {
        if (arg1 != -10650) {
            this.method1652(false, 85);
        }
        this.field3545 = arg0;
        field3524++;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V", line = 347)
    public class236(int arg0) {
        this.field3528 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 311)
    private final synchronized void method1653(int arg0) {
        field3520++;
        class519 var2 = this.method1650(0);
        if (var2 == null) {
            return;
        }
        if (arg0 < 106) {
            this.method1645((byte) -1);
        }
        var2.method2656((byte) 124);
        this.field3544--;
        this.field3542 = 0;
        class699.field9862.method2313(var2.method3156((byte) -24), var2, (byte) -38);
    }
}
