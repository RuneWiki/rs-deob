import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class182 extends class131 {

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    private int field2598 = 0;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Z")
    private boolean field2593 = false;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    private int field2611 = -1;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    private int field2615 = -32768;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    private int field2622 = 0;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    private int field2585;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    private int field2586;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "Lrj;")
    private class274 field2608;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field2617 = 0;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "[I")
    public static int[] field2618 = new int[100];

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "D")
    public double field2590;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "D")
    public double field2591;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "D")
    private double field2603;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "D")
    private double field2609;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "D")
    private double field2613;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "D")
    private double field2616;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "D")
    private double field2619;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "D")
    public double field2624;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lqd;")
    private class162 field2589;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
        field2606++;
        class106 var13 = this.method1184((byte) -99);
        if (var13 != null) {
            var13.method235(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2589);
            this.field2615 = var13.method227();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIIII)V")
    public final void method1181(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2599++;
        if (!this.field2593) {
            double var6 = (double) (arg4 - this.field2586);
            double var8 = (double) (arg2 - this.field2585);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2591 = (double) this.field2597 * var6 / var10 + (double) this.field2586;
            this.field2624 = (double) this.field2620;
            this.field2590 = (double) this.field2597 * var8 / var10 + (double) this.field2585;
        }
        int var12 = 86 % ((arg0 - 29) / 36);
        double var13 = (double) (this.field2612 + 1 - arg3);
        this.field2609 = ((double) arg4 - this.field2591) / var13;
        this.field2613 = ((double) arg2 - this.field2590) / var13;
        this.field2603 = Math.sqrt(this.field2613 * this.field2613 + this.field2609 * this.field2609);
        if (this.field2602 == -1) {
            this.field2619 = ((double) arg1 - this.field2624) / var13;
        } else {
            if (!this.field2593) {
                this.field2619 = -this.field2603 * Math.tan((double) this.field2602 * 0.02454369D);
            }
            this.field2616 = ((double) arg1 - this.field2624 - (this.field2619 * var13)) * 2.0D / (var13 * var13);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()I")
    public final int method227() {
        field2610++;
        return this.field2615;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1182(int arg0) {
        if (arg0 != 0) {
            field2618 = null;
        }
        field2618 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2621++;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V")
    public final void method1183(int arg0, int arg1) {
        field2604++;
        if (this.field2602 == -1) {
            this.field2624 += (double) arg1 * this.field2619;
        } else {
            this.field2624 += this.field2616 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2619;
            this.field2619 += (double) arg1 * this.field2616;
        }
        this.field2591 += (double) arg1 * this.field2609;
        this.field2593 = true;
        this.field2590 += (double) arg1 * this.field2613;
        this.field2623 = (int) (Math.atan2(this.field2609, this.field2613) * 325.949D) + 1024 & 0x7FF;
        this.field2600 = (int) (Math.atan2(this.field2619, this.field2603) * 325.949D) & 0x7FF;
        if (this.field2608 != null) {
            this.field2622 += arg1;
            label41: while (true) {
                do {
                    do {
                        if (this.field2608.field4081[this.field2598] >= this.field2622) {
                            break label41;
                        }
                        this.field2622 -= this.field2608.field4081[this.field2598];
                        this.field2598++;
                        if (this.field2608.field4072.length <= this.field2598) {
                            this.field2598 -= this.field2608.field4068;
                            if (this.field2598 < 0 || this.field2598 >= this.field2608.field4072.length) {
                                this.field2598 = 0;
                            }
                        }
                        this.field2611 = this.field2598 + 1;
                    } while (this.field2611 < this.field2608.field4072.length);
                    this.field2611 -= this.field2608.field4068;
                } while (this.field2611 >= 0 && this.field2608.field4072.length > this.field2611);
                this.field2611 = -1;
            }
        }
        int var3 = 35 % ((arg0 - 28) / 44);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Lah;")
    private final class106 method1184(byte arg0) {
        field2592++;
        class101 var2 = class189.method1246(this.field2587, (byte) -100);
        if (arg0 >= -98) {
            field2618 = null;
        }
        class106 var3 = var2.method615(this.field2622, this.field2598, this.field2611, 8);
        if (var3 == null) {
            return null;
        } else {
            var3.method666(this.field2600);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1185(int arg0, Component arg1) {
        field2605++;
        Method var2 = class56.field669;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class280.field4251);
        int var3 = -60 % ((-arg0 - 51) / 60);
        arg1.addFocusListener(class280.field4251);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I")
    public static final int method1186(byte arg0, int arg1) {
        if (arg0 < 7) {
            method1185(-119, (Component) null);
        }
        field2607++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(BI)Lwe;")
    public static final class82 method1187(byte arg0, int arg1) {
        if (arg0 != -41) {
            method1187((byte) -106, 57);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field2588++;
        if (class123.field1767[var2] == null || class123.field1767[var2][var3] == null) {
            boolean var4 = class238.method1549((byte) -81, var2);
            if (!var4) {
                return null;
            }
        }
        return class123.field1767[var2][var3];
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2585 = arg3;
        this.field2587 = arg0;
        this.field2594 = arg1;
        this.field2620 = arg4;
        this.field2612 = arg6;
        this.field2614 = arg5;
        this.field2595 = arg10;
        this.field2597 = arg8;
        this.field2602 = arg7;
        this.field2593 = false;
        this.field2586 = arg2;
        this.field2596 = arg9;
        int var12 = class189.method1246(this.field2587, (byte) -53).field1382;
        if (var12 == -1) {
            this.field2608 = null;
        } else {
            this.field2608 = class27.method165(var12, (byte) -113);
        }
    }
}
