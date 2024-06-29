import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class176 extends class310 {

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "Z")
    private boolean field2603 = false;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    private int field2600 = 0;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    private int field2617 = -1;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    private int field2602 = -32768;

    @OriginalMember(owner = "client!rk", name = "eb", descriptor = "I")
    private int field2635 = 0;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    private int field2624;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private int field2601;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lng;")
    private class162 field2594;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field2630 = -1;

    @OriginalMember(owner = "client!rk", name = "fb", descriptor = "[[[I")
    public static int[][][] field2636 = new int[4][13][13];

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "[I")
    public static int[] field2632 = new int[100];

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "D")
    public double field2598;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "D")
    private double field2607;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "D")
    private double field2614;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "D")
    public double field2615;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "D")
    private double field2619;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "D")
    private double field2622;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "D")
    public double field2628;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "D")
    private double field2631;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rk", name = "gb", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "Lt;")
    private class254 field2623;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "Lui;")
    public static class266 field2626;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "[[[B")
    public static byte[][][] field2612;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 13)
    public static final String method1272(byte arg0, long arg1) {
        if (arg0 >= -64) {
            return (String) null;
        } else {
            field2605++;
            return class92.method730(arg1, -20313);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 25)
    public final void method1273(int arg0, int arg1) {
        field2610++;
        this.field2615 += (double) arg1 * this.field2619;
        if (this.field2595 == -1) {
            this.field2628 += (double) arg1 * this.field2614;
        } else {
            this.field2628 += this.field2607 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2614;
            this.field2614 += (double) arg1 * this.field2607;
        }
        this.field2603 = true;
        this.field2598 += (double) arg1 * this.field2631;
        this.field2597 = (int) (Math.atan2(this.field2631, this.field2619) * 325.949D) + 1024 & 0x7FF;
        if (arg0 != 10369) {
            this.field2614 = 1.0349438024647948D;
        }
        this.field2606 = (int) (Math.atan2(this.field2614, this.field2622) * 325.949D) & 0x7FF;
        if (this.field2594 == null) {
            return;
        }
        this.field2600 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2600 <= this.field2594.field2423[this.field2635]) {
                        return;
                    }
                    this.field2600 -= this.field2594.field2423[this.field2635];
                    this.field2635++;
                    if (this.field2594.field2401.length <= this.field2635) {
                        this.field2635 -= this.field2594.field2407;
                        if (this.field2635 < 0 || this.field2594.field2401.length <= this.field2635) {
                            this.field2635 = 0;
                        }
                    }
                    this.field2617 = this.field2635 + 1;
                } while (this.field2617 < this.field2594.field2401.length);
                this.field2617 -= this.field2594.field2407;
            } while (this.field2617 >= 0 && this.field2594.field2401.length > this.field2617);
            this.field2617 = -1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIII)V", line = 80)
    public final void method1274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2603) {
            double var6 = (double) (arg4 - this.field2624);
            double var8 = (double) (arg1 - this.field2629);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2598 = (double) this.field2599 * var6 / var10 + (double) this.field2624;
            this.field2628 = (double) this.field2601;
            this.field2615 = (double) this.field2599 * var8 / var10 + (double) this.field2629;
        }
        field2633++;
        double var12 = (double) (this.field2621 + 1 - arg3);
        if (arg0 != -23830) {
            this.method1273(42, -80);
        }
        this.field2619 = ((double) arg1 - this.field2615) / var12;
        this.field2631 = ((double) arg4 - this.field2598) / var12;
        this.field2622 = Math.sqrt(this.field2631 * this.field2631 + this.field2619 * this.field2619);
        if (this.field2595 == -1) {
            this.field2614 = ((double) arg2 - this.field2628) / var12;
        } else {
            if (!this.field2603) {
                this.field2614 = -this.field2622 * Math.tan((double) this.field2595 * 0.02454369D);
            }
            this.field2607 = ((double) arg2 - this.field2628 - this.field2614 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 135)
    public static void method1275(int arg0) {
        if (arg0 != 1) {
            method1277(-123, 106, -12, 46, -110, true, -125);
        }
        field2636 = (int[][][]) null;
        field2612 = (byte[][][]) null;
        field2626 = null;
        field2632 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILlb;IB)[Lsd;", line = 153)
    public static final class27[] method1276(int arg0, class211 arg1, int arg2, byte arg3) {
        if (arg3 != 57) {
            method1275(-105);
        }
        field2609++;
        return class297.method2093(arg2, arg0, (byte) 107, arg1) ? class297.method2091((byte) -100) : null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIZI)V", line = 175)
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (class298.field4667 <= arg1 - arg4 && (arg1 + arg4) <= class327.field5072 && arg2 - arg4 >= class34.field432 && class75.field1064 >= (arg2 + arg4)) {
            class34.method233(arg6, arg1, arg2, 111, arg3, arg0, arg4);
        } else {
            class41.method364(arg0, arg1, arg4, arg3, 10453, arg6, arg2);
        }
        if (!arg5) {
            field2637++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Laj;", line = 194)
    private final class1 method1278(int arg0) {
        class269 var2 = class99.method778(20951, this.field2620);
        if (arg0 >= -83) {
            return (class1) null;
        }
        class1 var3 = var2.method1871((byte) -83, this.field2617, this.field2635, this.field2600);
        field2608++;
        if (var3 == null) {
            return null;
        } else {
            var3.method4(this.field2606);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()I", line = 212)
    public final int method19() {
        field2593++;
        return this.field2602;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 279)
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2629 = arg3;
        this.field2627 = arg9;
        this.field2595 = arg7;
        this.field2611 = arg5;
        this.field2613 = arg1;
        this.field2603 = false;
        this.field2596 = arg10;
        this.field2624 = arg2;
        this.field2599 = arg8;
        this.field2621 = arg6;
        this.field2601 = arg4;
        this.field2620 = arg0;
        int var12 = class99.method778(20951, this.field2620).field4050;
        if (var12 == -1) {
            this.field2594 = null;
        } else {
            this.field2594 = class173.method1259((byte) 119, var12);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V", line = 229)
    public static final void method1279(byte arg0, int arg1) {
        field2618++;
        int var2 = -61 % ((arg0 + 37) / 38);
        class147 var3 = class92.method731(-29125, arg1, 7);
        var3.method1099(-105);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 242)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2604++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 307)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        field2616++;
        class1 var13 = this.method1278(-86);
        if (var13 != null) {
            var13.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2623);
            this.field2602 = var13.method19();
        }
    }
}
