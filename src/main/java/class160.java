import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class160 extends class172 {

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public int field2558 = 0;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "[I")
    public static int[] field2538 = new int[2500];

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lnc;")
    public class171 field2541;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "Lrn;")
    public static class18 field2548;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "Lf;")
    public class212 field2561;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "Luc;")
    public static class228 field2553;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lsd;")
    public class244 field2549;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Lie;")
    public static class330 field2551;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Lj;")
    public class7 field2546;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "Lj;")
    public class7 field2563;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "Ljava/lang/Thread;")
    public static Thread field2565;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Z")
    public boolean field2542;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[I")
    public int[] field2544;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "[Lho;")
    public static class215[] field2557;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 4)
    public static final void method1287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class348 var20 = new class348(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class170.field2689[var21][arg1][arg2] == null) {
                    class170.field2689[var21][arg1][arg2] = new class329(var21, arg1, arg2);
                }
            }
            class170.field2689[arg0][arg1][arg2].field5049 = var20;
        } else if (arg3 == 1) {
            class348 var22 = new class348(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class170.field2689[var23][arg1][arg2] == null) {
                    class170.field2689[var23][arg1][arg2] = new class329(var23, arg1, arg2);
                }
            }
            class170.field2689[arg0][arg1][arg2].field5049 = var22;
        } else {
            class117 var24 = new class117(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class170.field2689[var25][arg1][arg2] == null) {
                    class170.field2689[var25][arg1][arg2] = new class329(var25, arg1, arg2);
                }
            }
            class170.field2689[arg0][arg1][arg2].field5072 = var24;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLpm;)V", line = 60)
    public static final void method1288(byte arg0, class112 arg1) {
        class258.method1902(28018, arg1, 200000);
        if (arg0 != -45) {
            method1289(-16);
        }
        field2550++;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 75)
    public static void method1289(int arg0) {
        field2548 = null;
        field2557 = null;
        field2538 = null;
        field2553 = null;
        field2551 = null;
        if (arg0 == 0) {
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZII)V", line = 100)
    public static final void method1290(int arg0, boolean arg1, int arg2, int arg3) {
        field2554++;
        if (arg2 == 1008) {
            class197.method1497(arg3, arg0, false, 10);
        } else if (arg2 == 1004) {
            class197.method1497(arg3, arg0, false, 11);
        } else if (arg2 == 1002) {
            class197.method1497(arg3, arg0, !arg1, 12);
        } else if (arg2 == 1003) {
            class197.method1497(arg3, arg0, !arg1, 13);
        } else if (arg2 == 1005) {
            class197.method1497(arg3, arg0, false, 14);
        }
        if (!arg1) {
            method1289(47);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V", line = 130)
    public static final void method1291(int arg0, boolean arg1) {
        field2539++;
        if (!arg1) {
            class138 var2 = class149.method1242(arg0, 0, 10);
            var2.method1152(126);
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V", line = 150)
    public final void method1292(int arg0) {
        if (arg0 >= -67) {
            field2557 = (class215[]) null;
        }
        int var2 = this.field2547;
        if (this.field2561 != null) {
            class212 var3 = this.field2561.method1568((byte) 55);
            if (var3 == null) {
                this.field2567 = 0;
                this.field2544 = null;
                this.field2562 = 0;
                this.field2552 = 0;
                this.field2559 = 0;
                this.field2547 = -1;
            } else {
                this.field2544 = var3.field3318;
                this.field2552 = var3.field3257;
                this.field2547 = var3.field3304;
                this.field2559 = var3.field3316 * 128;
                this.field2567 = var3.field3266;
                this.field2562 = var3.field3270;
            }
        } else if (this.field2549 != null) {
            int var4 = class106.method918(this.field2549, true);
            if (var2 != var4) {
                class130 var5 = this.field2549.field3802;
                this.field2547 = var4;
                if (var5.field2149 != null) {
                    var5 = var5.method1120((byte) -125);
                }
                if (var5 == null) {
                    this.field2552 = this.field2559 = 0;
                } else {
                    this.field2552 = var5.field2212;
                    this.field2559 = var5.field2178 * 128;
                }
            }
        } else if (this.field2541 != null) {
            this.field2547 = class50.method482(this.field2541, true);
            this.field2559 = this.field2541.field2718 * 128;
            this.field2552 = this.field2541.field2716;
        }
        if (this.field2547 != var2 && this.field2563 != null) {
            class19.field316.method109(this.field2563);
            this.field2563 = null;
        }
        field2566++;
    }
}
