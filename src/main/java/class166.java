import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class166 extends class57 {

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    private int field2615 = -32768;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    private int field2630 = -1;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "I")
    private int field2638 = 0;

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "Z")
    private boolean field2639 = false;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    private int field2608 = 0;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    private int field2633;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "Lgn;")
    private class417 field2637;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field2612 = 50;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "D")
    private double field2609;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "D")
    private double field2618;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "D")
    private double field2621;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "D")
    private double field2626;

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "D")
    private double field2640;

    @OriginalMember(owner = "client!le", name = "ob", descriptor = "D")
    private double field2646;

    @OriginalMember(owner = "client!le", name = "rb", descriptor = "D")
    private double field2649;

    @OriginalMember(owner = "client!le", name = "tb", descriptor = "D")
    private double field2651;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!le", name = "kb", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!le", name = "lb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!le", name = "mb", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!le", name = "nb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!le", name = "pb", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!le", name = "qb", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!le", name = "sb", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Lpj;")
    private class78 field2627;

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "Ljava/awt/Image;")
    public static Image field2641;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 3)
    public class166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field2639 = false;
        this.field2614 = arg0;
        this.field2628 = arg6;
        this.field2613 = arg8;
        this.field2625 = arg5;
        this.field2633 = arg7;
        this.field2624 = arg10;
        this.field2611 = arg9;
        int var12 = class115.method839((byte) -57, this.field2614).field5734;
        if (var12 == -1) {
            this.field2637 = null;
        } else {
            this.field2637 = class156.method1099(var12, 63);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Le;Z)Lum;", line = 27)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field2622;
        class348 var3 = this.method1164((byte) -127, 1024, arg0);
        if (var3 == null) {
            return null;
        } else {
            class435 var4 = arg0.method713();
            var4.method1986(this.field2644);
            var4.method1994(this.field2634);
            var4.method1995((int) this.field2646, (int) this.field2649, (int) this.field2609);
            if (!arg1) {
                return null;
            } else {
                if (this.field2627 != null) {
                    class198 var5 = this.field2627.method489();
                    arg0.method561(var3, var5, var4, (class170) null, 0);
                } else {
                    var3.method26(var4, (class170) null, 0);
                }
                this.field2615 = var3.method57();
                this.method1171(arg0, 1, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Z", line = 62)
    public final boolean method186(int arg0) {
        if (arg0 != 0) {
            this.method1169(69, -128, -70, 76, -63);
        }
        ++field2636;
        return false;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)I", line = 76)
    public final int method314(int arg0) {
        ++field2642;
        return arg0 != 27647 ? -83 : this.field2615;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILe;)Lid;", line = 88)
    private final class348 method1164(byte arg0, int arg1, class312 arg2) {
        ++field2617;
        class379 var4 = class115.method839((byte) -57, this.field2614);
        int var5 = -65 % ((arg0 - -53) / 37);
        return var4.method2415(this.field2630, this.field2608, arg1, -108, arg2, this.field2638);
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V", line = 101)
    public final void method375(int arg0) {
        super.field720 = super.field711 = (short) ((int) (this.field2609 / 128.0D));
        super.field726 = super.field710 = (short) ((int) (this.field2646 / 128.0D));
        ++field2632;
        int var2 = 126 % ((-35 - arg0) / 55);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lmo;I)V", line = 117)
    public static final void method1165(class447 arg0, int arg1) {
        if (arg1 != 1) {
            field2610 = 114;
        }
        ++field2643;
        class180.field2946 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILe;)Z", line = 128)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        if (arg1 != 65536) {
            return false;
        } else {
            ++field2631;
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 145)
    public static final void method1166(int arg0) {
        ++field2647;
        int var1 = class246.field4031.length;
        int var2 = 56 % ((58 - arg0) / 59);
        for (int var3 = 0; ~var3 > ~var1; ++var3) {
            if (class246.field4031[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; ~var5 > ~class358.field5478; ++var5) {
                    if (~class52.field640[var3] == ~class369.field5608[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class369.field5608[class358.field5478] = class52.field640[var3];
                    var4 = class358.field5478++;
                }
                class186 var6 = new class186(class246.field4031[var3]);
                int var7 = 0;
                while (var6.field3044 < class246.field4031[var3].length && var7 < 511 && ~class397.field5940 > -1024) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method1272((byte) -78);
                    int var10 = var9 >> 14;
                    int var11 = (8161 & var9) >> 7;
                    int var12 = var9 & 63;
                    int var13 = (class52.field640[var3] >> 8) * 64 + var11 + -class409.field6048;
                    int var14 = (class52.field640[var3] & 255) * 64 + -class444.field6481 + var12;
                    class226 var15 = class395.method2493(false, var6.method1272((byte) -66));
                    if (class39.field499[var8] == null && ~(var15.field3782 & 1) < -1 && class81.field1007 == var10 && var13 >= 0 && ~class80.field1003 < ~(var15.field3779 + var13) && var14 >= 0 && ~class380.field5751 < ~(var15.field3779 + var14)) {
                        class39.field499[var8] = new class50();
                        class39.field499[var8].field1868 = var8;
                        class50 var16 = class39.field499[var8];
                        class423.field6253[class397.field5940++] = var8;
                        var16.field1839 = class183.field2987;
                        var16.method316(var15, 0);
                        var16.method910(var16.field615.field3779, -13034);
                        var16.field1833 = var16.field615.field3753 << 3;
                        if (~var16.field1833 == -1) {
                            var16.method914(0, 16383);
                        } else {
                            var16.method914(class218.field3575[var16.field615.field3754 + -1], 16383);
                        }
                        var16.method902(var10, var13, true, false, var16.method903(-80), var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Le;B)V", line = 237)
    public final void method196(class312 arg0, byte arg1) {
        ++field2623;
        class348 var3 = this.method1164((byte) -96, 0, arg0);
        if (var3 != null) {
            class435 var4 = arg0.method713();
            var4.method1986(this.field2644);
            var4.method1994(this.field2634);
            var4.method1995((int) this.field2646, (int) this.field2649, (int) this.field2609);
            this.field2615 = var3.method57();
            if (arg1 >= -66) {
                this.field2630 = -71;
            }
            this.method1171(arg0, 1, var3);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 272)
    public final void method1167(boolean arg0) {
        if (arg0) {
            method1166(98);
        }
        if (this.field2627 != null) {
            this.field2627.method497();
        }
        ++field2616;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V", line = 293)
    public final void method1168(int arg0, int arg1) {
        if (this.field2633 == arg0) {
            this.field2649 += (double) arg1 * this.field2626;
        } else {
            this.field2649 += this.field2621 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2626;
            this.field2626 += (double) arg1 * this.field2621;
        }
        ++field2645;
        this.field2639 = true;
        this.field2646 += (double) arg1 * this.field2618;
        this.field2609 += (double) arg1 * this.field2651;
        this.field2634 = 16383 & 8192 + (int) (2607.5945876176133D * Math.atan2(this.field2618, this.field2651));
        this.field2644 = 16383 & (int) (Math.atan2(this.field2626, this.field2640) * 2607.5945876176133D);
        if (this.field2637 != null) {
            this.field2638 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field2638 <= this.field2637.field6171[this.field2608]) {
                            return;
                        }
                        this.field2638 -= this.field2637.field6171[this.field2608];
                        ++this.field2608;
                        if (~this.field2608 <= ~this.field2637.field6177.length) {
                            this.field2608 -= this.field2637.field6162;
                            if (~this.field2608 > -1 || ~this.field2608 <= ~this.field2637.field6177.length) {
                                this.field2608 = 0;
                            }
                        }
                        this.field2630 = this.field2608 - -1;
                    } while (~this.field2637.field6177.length < ~this.field2630);
                    this.field2630 -= this.field2637.field6162;
                } while (this.field2630 >= 0 && ~this.field2637.field6177.length < ~this.field2630);
                this.field2630 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILe;IIZLhm;I)V", line = 345)
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        if (arg3 == 0) {
            ++field2635;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 356)
    public final void method193(int arg0) {
        ++field2648;
        if (arg0 != 0) {
            method1166(28);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 377)
    public final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2650;
        if (!this.field2639) {
            double var6 = (double) (-super.field724 + arg0);
            double var8 = (double) (arg2 - super.field722);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2646 = (double) this.field2613 * var6 / var10 + (double) super.field724;
            this.field2649 = (double) super.field721;
            this.field2609 = (double) this.field2613 * var8 / var10 + (double) super.field722;
        }
        double var12 = (double) (this.field2628 + 1 + -arg1);
        this.field2618 = ((double) arg0 - this.field2646) / var12;
        this.field2651 = ((double) arg2 - this.field2609) / var12;
        this.field2640 = Math.sqrt(this.field2651 * this.field2651 + this.field2618 * this.field2618);
        if (~this.field2633 == arg4) {
            this.field2626 = ((double) arg3 + -this.field2649) / var12;
        } else {
            if (!this.field2639) {
                this.field2626 = -this.field2640 * Math.tan((double) this.field2633 * 0.02454369D);
            }
            this.field2621 = ((double) arg3 - this.field2649 + -(this.field2626 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 415)
    public static void method1170(byte arg0) {
        field2641 = null;
        if (arg0 >= -94) {
            field2612 = 121;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Le;ILid;)V", line = 427)
    private final void method1171(class312 arg0, int arg1, class348 arg2) {
        ++field2620;
        class11[] var4 = arg2.method7();
        class252[] var5 = arg2.method43();
        if ((this.field2627 == null || this.field2627.field973) && (var4 != null || var5 != null)) {
            this.field2627 = new class78(class183.field2987);
        }
        if (this.field2627 != null) {
            this.field2627.method488(arg0, (long) class183.field2987, var4, var5, false);
            this.field2627.method492(super.field714, super.field726, super.field710, super.field720, super.field711);
        }
        if (arg1 != 1) {
            this.method375(-53);
        }
    }

    @OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V", line = 456)
    protected final void finalize() {
        ++field2619;
        if (this.field2627 != null) {
            this.field2627.method497();
        }
    }
}
