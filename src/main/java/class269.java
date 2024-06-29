import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class269 {

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public int field4558 = 0;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Z")
    private boolean field4556 = false;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field4564 = 0;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lhi;")
    public static class82 field4555 = class95.method664((byte) -117, "sch-Utteln:");

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lhi;")
    public static class82 field4553 = class95.method664((byte) -122, "<col=ffff00>");

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[Z")
    public static boolean[] field4560 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "J")
    public static long field4563 = 0L;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public int field4570;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "J")
    public long field4561;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lum;")
    public static class222 field4549;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Ljava/lang/Thread;")
    public static Thread field4550;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 5)
    public static final void method1891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class88 var20 = new class88(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class15.field120[var21][arg1][arg2] == null) {
                    class15.field120[var21][arg1][arg2] = new class16(var21, arg1, arg2);
                }
            }
            class15.field120[arg0][arg1][arg2].field166 = var20;
        } else if (arg3 == 1) {
            class88 var22 = new class88(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class15.field120[var23][arg1][arg2] == null) {
                    class15.field120[var23][arg1][arg2] = new class16(var23, arg1, arg2);
                }
            }
            class15.field120[arg0][arg1][arg2].field166 = var22;
        } else {
            class41 var24 = new class41(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class15.field120[var25][arg1][arg2] == null) {
                    class15.field120[var25][arg1][arg2] = new class16(var25, arg1, arg2);
                }
            }
            class15.field120[arg0][arg1][arg2].field157 = var24;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 56)
    public static void method1892(int arg0) {
        field4555 = null;
        if (arg0 != -13239) {
            method1891(83, -3, 111, -62, 1, 125, -45, 109, 46, 42, 0, -97, -40, -109, -36, 15, -17, 91, -109, 114);
        }
        field4560 = null;
        field4553 = null;
        field4550 = null;
        field4549 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILum;)Ljm;", line = 90)
    public static final class303 method1893(int arg0, int arg1, class222 arg2) {
        field4565++;
        if (class281.method1959(-124, arg2, arg1)) {
            return arg0 == 9 ? class3.method25((byte) -35) : (class303) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 110)
    public final void method1894(byte arg0) {
        field4557++;
        this.field4568 = class102.field1819[this.field4546];
        int var2 = -39 / ((14 - arg0) / 62);
        this.field4562 = (int) Math.sqrt((double) (this.field4552 * this.field4552 - (-(this.field4569 * this.field4569) - (this.field4567 * this.field4567))));
        if (this.field4566 == 0) {
            this.field4566 = 1;
        }
        if (this.field4551 == 0) {
            this.field4561 = 2147483647L;
        } else if (this.field4551 == 1) {
            this.field4561 = (long) (this.field4562 * 8 / this.field4566);
            this.field4561 *= this.field4561;
        } else if (this.field4551 == 2) {
            this.field4561 = (long) (this.field4562 * 8 / this.field4566);
        }
        if (this.field4556) {
            this.field4562 *= -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILbc;)V", line = 157)
    public final void method1895(int arg0, class153 arg1) {
        field4547++;
        int var3 = -117 / ((arg0 - 56) / 40);
        while (true) {
            int var4 = arg1.method1082(-57);
            if (var4 == 0) {
                return;
            }
            this.method1896(-25159, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILbc;)V", line = 197)
    private final void method1896(int arg0, int arg1, class153 arg2) {
        if (arg0 != -25159) {
            this.field4569 = -69;
        }
        field4559++;
        if (arg1 == 1) {
            this.field4546 = arg2.method1090(false);
        } else if (arg1 == 2) {
            arg2.method1082(-66);
        } else if (arg1 == 3) {
            this.field4552 = arg2.method1097((byte) -94);
            this.field4569 = arg2.method1097((byte) -77);
            this.field4567 = arg2.method1097((byte) -91);
        } else if (arg1 == 4) {
            this.field4551 = arg2.method1082(-116);
            this.field4566 = arg2.method1097((byte) -87);
        } else if (arg1 == 6) {
            this.field4570 = arg2.method1082(-106);
        } else if (arg1 == 8) {
            this.field4558 = 1;
        } else if (arg1 == 9) {
            this.field4564 = 1;
        } else if (arg1 == 10) {
            this.field4556 = true;
        }
    }
}
