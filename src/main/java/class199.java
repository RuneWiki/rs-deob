import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class199 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[[I")
    public static int[][] field3628 = new int[104][104];

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lke;")
    public static class256 field3630 = class316.method2202("<br>(X100(U(Y", 27626);

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lke;")
    public static class256 field3640 = class316.method2202("gleiten:", 27626);

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lke;")
    public static class256 field3638 = class316.method2202(" ", 27626);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lke;")
    public static class256 field3634;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1426(int arg0) {
        if (arg0 != -1812647122) {
            field3638 = (class256) null;
        }
        field3636++;
        return (this.field3631 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z", line = 15)
    public final boolean method1427(byte arg0) {
        field3629++;
        if (arg0 >= -47) {
            field3638 = (class256) null;
        }
        return (this.field3631 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLla;II)V", line = 34)
    public static final void method1428(int arg0, boolean arg1, class188 arg2, int arg3, int arg4) {
        field3635++;
        if (arg4 != -2) {
            return;
        }
        int var5 = arg2.field3343;
        int var6 = arg2.field3391;
        if (arg2.field3447 == 0) {
            arg2.field3391 = arg2.field3364;
        } else if (arg2.field3447 == 1) {
            arg2.field3391 = arg0 - arg2.field3364;
        } else if (arg2.field3447 == 2) {
            arg2.field3391 = arg2.field3364 * arg0 >> 14;
        } else if (arg2.field3447 == 3) {
            if (arg2.field3467 == 2) {
                arg2.field3391 = (arg2.field3364 - 1) * arg2.field3367 + arg2.field3364 * 32;
            } else if (arg2.field3467 == 7) {
                arg2.field3391 = arg2.field3364 * 115 + ((arg2.field3364 - 1) * arg2.field3367);
            }
        }
        if (arg2.field3339 == 0) {
            arg2.field3343 = arg2.field3390;
        } else if (arg2.field3339 == 1) {
            arg2.field3343 = arg3 - arg2.field3390;
        } else if (arg2.field3339 == 2) {
            arg2.field3343 = arg2.field3390 * arg3 >> 14;
        } else if (arg2.field3339 == 3) {
            if (arg2.field3467 == 2) {
                arg2.field3343 = (arg2.field3390 - 1) * arg2.field3373 + arg2.field3390 * 32;
            } else if (arg2.field3467 == 7) {
                arg2.field3343 = (arg2.field3390 - 1) * arg2.field3373 + arg2.field3390 * 12;
            }
        }
        if (arg2.field3447 == 4) {
            arg2.field3391 = arg2.field3380 * arg2.field3343 / arg2.field3369;
        }
        if (arg2.field3339 == 4) {
            arg2.field3343 = arg2.field3391 * arg2.field3369 / arg2.field3380;
        }
        if (class37.field654 && (client.method828(arg2) != 0 || arg2.field3467 == 0)) {
            if (arg2.field3343 < 5 && arg2.field3391 < 5) {
                arg2.field3343 = 5;
                arg2.field3391 = 5;
            } else {
                if (arg2.field3391 <= 0) {
                    arg2.field3391 = 5;
                }
                if (arg2.field3343 <= 0) {
                    arg2.field3343 = 5;
                }
            }
        }
        if (arg2.field3357 == 1337) {
            class204.field3695 = arg2;
        }
        if (arg1 && arg2.field3454 != null && (arg2.field3391 != var6 || arg2.field3343 != var5)) {
            class119 var7 = new class119();
            var7.field2116 = arg2;
            var7.field2114 = arg2.field3454;
            class116.field2031.method1269(false, var7);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Z", line = 137)
    public final boolean method1429(int arg0) {
        if (arg0 == 2) {
            field3639++;
            return (this.field3631 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)Z", line = 157)
    public final boolean method1430(byte arg0) {
        if (arg0 <= 79) {
            return false;
        } else {
            field3632++;
            return (this.field3631 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 184)
    public static void method1431(int arg0) {
        field3640 = null;
        field3638 = null;
        if (arg0 < 113) {
            field3628 = (int[][]) ((int[][]) null);
        }
        field3634 = null;
        field3628 = (int[][]) null;
        field3630 = null;
    }
}
