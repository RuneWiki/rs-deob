import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class134 extends class80 {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Z")
    private boolean field2548 = false;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    private int field2539 = -32768;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    private int field2554 = 0;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    private int field2556 = 0;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    private int field2553;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "Lq;")
    private class122 field2564;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field2542 = 0;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "Ljd;")
    public static class86 field2568 = class122.method868("Suche nach Updates )2 ", true);

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "Ljd;")
    public static class86 field2540 = class122.method868("null", true);

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "D")
    private double field2543;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "D")
    public double field2549;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "D")
    public double field2557;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "D")
    private double field2566;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "D")
    private double field2571;

    @OriginalMember(owner = "client!ak", name = "hb", descriptor = "D")
    private double field2575;

    @OriginalMember(owner = "client!ak", name = "ib", descriptor = "D")
    private double field2576;

    @OriginalMember(owner = "client!ak", name = "jb", descriptor = "D")
    public double field2577;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lbj;")
    public static class151 field2537;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
    public static final void method957(int arg0, boolean arg1) {
        field2550++;
        if (arg0 == 37) {
            class88.field1769 = 3.0F;
        } else if (arg0 == 50) {
            class88.field1769 = 4.0F;
        } else if (arg0 == 75) {
            class88.field1769 = 6.0F;
        } else {
            class88.field1769 = 8.0F;
        }
        class152.field2875 = -1;
        if (!arg1) {
            field2538 = -64;
        }
        class152.field2875 = -1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
    public final void method958(int arg0, int arg1) {
        this.field2557 += this.field2575 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2566;
        this.field2566 += (double) arg1 * this.field2575;
        this.field2549 += (double) arg1 * this.field2543;
        this.field2577 += (double) arg1 * this.field2571;
        if (arg0 != -1) {
            method962(-5, 73, (byte) 73);
        }
        this.field2548 = true;
        field2561++;
        this.field2570 = (int) (Math.atan2(this.field2543, this.field2571) * 325.949D) + 1024 & 0x7FF;
        this.field2573 = (int) (Math.atan2(this.field2566, this.field2576) * 325.949D) & 0x7FF;
        if (this.field2564 == null) {
            return;
        }
        this.field2556 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2564.field2357[this.field2554] >= this.field2556) {
                        return;
                    }
                    this.field2556 -= this.field2564.field2357[this.field2554];
                    this.field2554++;
                } while (this.field2564.field2361.length > this.field2554);
                this.field2554 -= this.field2564.field2368;
            } while (this.field2554 >= 0 && this.field2554 < this.field2564.field2361.length);
            this.field2554 = 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()I")
    public final int method233() {
        field2541++;
        return this.field2539;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2558++;
        class32 var11 = this.method959(-84);
        if (var11 != null) {
            var11.method230(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2539 = var11.method233();
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lie;")
    private final class32 method959(int arg0) {
        field2560++;
        if (arg0 >= -60) {
            this.field2554 = 51;
        }
        class127 var2 = class219.method1547(this.field2565, -122);
        class32 var3 = var2.method899(100, this.field2554);
        if (var3 == null) {
            return null;
        } else {
            var3.method231(this.field2573);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static void method960(int arg0) {
        field2568 = null;
        field2540 = null;
        field2537 = null;
        if (arg0 <= 28) {
            field2568 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIIII)V")
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class51.field1062; var5++) {
            if (class216.field3902[var5] + class127.field2439[var5] > arg3 && class127.field2439[var5] < arg3 + arg0 && arg4 < class37.field842[var5] + class31.field665[var5] && class37.field842[var5] < arg2 + arg4) {
                class204.field3686[var5] = true;
            }
        }
        field2562++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)I")
    public static final int method962(int arg0, int arg1, byte arg2) {
        field2574++;
        if (arg2 > -55) {
            return -16;
        }
        class13 var3 = (class13) class152.field2876.method1698((long) arg0, (byte) 102);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field402.length) {
            return var3.field402[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZ)V")
    public final void method963(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!this.field2548) {
            double var6 = (double) (arg2 - this.field2572);
            double var8 = (double) (arg3 - this.field2563);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2557 = (double) this.field2559;
            this.field2577 = (double) this.field2553 * var6 / var10 + (double) this.field2572;
            this.field2549 = (double) this.field2553 * var8 / var10 + (double) this.field2563;
        }
        field2552++;
        double var12 = (double) (this.field2567 + 1 - arg1);
        this.field2543 = ((double) arg3 - this.field2549) / var12;
        this.field2571 = ((double) arg2 - this.field2577) / var12;
        this.field2576 = Math.sqrt(this.field2571 * this.field2571 + this.field2543 * this.field2543);
        if (arg4) {
            if (!this.field2548) {
                this.field2566 = -this.field2576 * Math.tan((double) this.field2545 * 0.02454369D);
            }
            this.field2575 = ((double) arg0 - this.field2557 - (this.field2566 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2569++;
        if (arg6 >= class49.field1044 && arg2 <= class129.field2473 && arg1 >= class50.field1050 && arg5 <= class56.field1143) {
            class75.method540(arg7, false, arg5, arg6, arg1, arg3, arg2, arg4);
        } else {
            class87.method643(arg6, (byte) -128, arg2, arg5, arg7, arg3, arg1, arg4);
        }
        if (arg0 != 0) {
            method964(7, 21, 24, 125, -125, 87, 60, 33);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ)V")
    public static final void method965(boolean arg0, boolean arg1) {
        class239.field4304 = arg1;
        field2544++;
        if (!arg0) {
            field2537 = null;
        }
        class76.field1516 = !class171.method1225(18);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2548 = false;
        this.field2563 = arg2;
        this.field2555 = arg10;
        this.field2572 = arg3;
        this.field2551 = arg5;
        this.field2565 = arg0;
        this.field2546 = arg1;
        this.field2536 = arg9;
        this.field2559 = arg4;
        this.field2553 = arg8;
        this.field2567 = arg6;
        this.field2545 = arg7;
        int var12 = class219.method1547(this.field2565, -123).field2466;
        if (var12 == -1) {
            this.field2564 = null;
        } else {
            this.field2564 = class133.method952(var12, 127);
        }
    }
}
