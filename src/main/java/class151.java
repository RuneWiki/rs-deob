import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class151 extends class152 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    private int field2555 = -1;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    private int field2580 = -32768;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    private int field2581 = 0;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Z")
    private boolean field2579 = false;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Z")
    private boolean field2561 = false;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field2552 = 0;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    private int field2553;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    private int field2556;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "Lmi;")
    private class300 field2590;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "Z")
    public static boolean field2571 = false;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "[I")
    public static int[] field2577 = new int[5];

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field2568 = -1;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field2584 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "D")
    public double field2554;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "D")
    private double field2558;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "D")
    private double field2562;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "D")
    private double field2566;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "D")
    public double field2567;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "D")
    public double field2576;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "D")
    private double field2586;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "D")
    private double field2592;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "Lgl;")
    private class214 field2575;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
    public static boolean field2559;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 5)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        field2551++;
        class42 var13 = this.method1084(-107);
        if (var13 != null) {
            this.method1083(true, var13);
            var13.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2575);
            this.field2580 = var13.method340();
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 23)
    public static void method1078(int arg0) {
        field2577 = null;
        if (arg0 <= 14) {
            method1078(71);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V", line = 46)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2582++;
        if (!this.field2561) {
            class42 var6 = this.method1084(-121);
            if (var6 == null) {
                return;
            }
            this.method1083(true, var6);
        }
        if (this.field2575 != null) {
            this.field2575.method1483(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V", line = 73)
    public final void method1079(byte arg0, int arg1) {
        field2585++;
        this.field2567 += (double) arg1 * this.field2566;
        this.field2579 = true;
        if (arg0 >= -22) {
            return;
        }
        if (this.field2574 == -1) {
            this.field2576 += (double) arg1 * this.field2558;
        } else {
            this.field2576 += this.field2586 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2558;
            this.field2558 += (double) arg1 * this.field2586;
        }
        this.field2554 += (double) arg1 * this.field2592;
        this.field2570 = (int) (Math.atan2(this.field2592, this.field2566) * 325.949D) + 1024 & 0x7FF;
        this.field2578 = (int) (Math.atan2(this.field2558, this.field2562) * 325.949D) & 0x7FF;
        if (this.field2590 == null) {
            return;
        }
        this.field2552 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2552 <= this.field2590.field4877[this.field2581]) {
                        return;
                    }
                    this.field2552 -= this.field2590.field4877[this.field2581];
                    this.field2581++;
                    if (this.field2590.field4885.length <= this.field2581) {
                        this.field2581 -= this.field2590.field4871;
                        if (this.field2581 < 0 || this.field2590.field4885.length <= this.field2581) {
                            this.field2581 = 0;
                        }
                    }
                    this.field2555 = this.field2581 + 1;
                } while (this.field2590.field4885.length > this.field2555);
                this.field2555 -= this.field2590.field4871;
            } while (this.field2555 >= 0 && this.field2555 < this.field2590.field4885.length);
            this.field2555 = -1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 317)
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2583 = arg5;
        this.field2553 = arg2;
        this.field2548 = arg1;
        this.field2556 = arg0;
        this.field2587 = arg8;
        this.field2591 = arg6;
        this.field2560 = arg3;
        this.field2574 = arg7;
        this.field2588 = arg9;
        this.field2579 = false;
        this.field2572 = arg10;
        this.field2565 = arg4;
        int var12 = class134.method944(1, this.field2556).field3322;
        if (var12 == -1) {
            this.field2590 = null;
        } else {
            this.field2590 = class258.method1807(var12, 83);
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 131)
    public static final void method1080(int arg0) {
        field2564++;
        class341.field5402.method889((byte) 85);
        if (arg0 == -1) {
            class44.field906.method889((byte) -122);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILoe;)Lia;", line = 161)
    public static final class234 method1081(int arg0, class146 arg1) {
        field2549++;
        return arg0 == -21192 ? new class234(arg1.method1050(3), arg1.method1050(3), arg1.method1050(arg0 + 21195), arg1.method1050(3), arg1.method1025((byte) -101), arg1.method1025((byte) -19), arg1.method1005((byte) 122)) : (class234) null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIII)V", line = 175)
    public final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2579) {
            double var6 = (double) (arg4 - this.field2553);
            double var8 = (double) (arg2 - this.field2560);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2567 = (double) this.field2587 * var8 / var10 + (double) this.field2560;
            this.field2576 = (double) this.field2565;
            this.field2554 = (double) this.field2587 * var6 / var10 + (double) this.field2553;
        }
        field2589++;
        double var12 = (double) (this.field2591 + 1 - arg1);
        this.field2592 = ((double) arg4 - this.field2554) / var12;
        int var14 = 121 / ((arg0 + 27) / 41);
        this.field2566 = ((double) arg2 - this.field2567) / var12;
        this.field2562 = Math.sqrt(this.field2592 * this.field2592 + this.field2566 * this.field2566);
        if (this.field2574 == -1) {
            this.field2558 = ((double) arg3 - this.field2576) / var12;
        } else {
            if (!this.field2579) {
                this.field2558 = -this.field2562 * Math.tan((double) this.field2574 * 0.02454369D);
            }
            this.field2586 = ((double) arg3 - this.field2576 - this.field2558 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLhb;)V", line = 218)
    private final void method1083(boolean arg0, class42 arg1) {
        field2557++;
        if (class241.field4016) {
            class294 var3 = (class294) arg1;
            if ((this.field2575 == null || this.field2575.field3531) && (var3.field4780 != null || var3.field4772 != null)) {
                this.field2575 = new class214(class267.field4371, 1, 1);
            }
            if (this.field2575 != null) {
                this.field2575.method1491(var3.field4780, var3.field4772, false, var3.field4753, var3.field4759, var3.field4762);
            }
        } else {
            class95 var4 = (class95) arg1;
            if ((this.field2575 == null || this.field2575.field3531) && (var4.field1681 != null || var4.field1667 != null)) {
                this.field2575 = new class214(class267.field4371, 1, 1);
            }
            if (this.field2575 != null) {
                this.field2575.method1491(var4.field1681, var4.field1667, false, var4.field1698, var4.field1677, var4.field1688);
            }
        }
        this.field2561 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I", line = 252)
    public final int method340() {
        field2573++;
        return this.field2580;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)Lhb;", line = 277)
    private final class42 method1084(int arg0) {
        field2569++;
        class198 var2 = class134.method944(1, this.field2556);
        if (arg0 >= -84) {
            return (class42) null;
        }
        class42 var3 = var2.method1357(this.field2581, this.field2552, this.field2555, -11);
        if (var3 == null) {
            return null;
        } else {
            var3.method344(this.field2578);
            return var3;
        }
    }
}
