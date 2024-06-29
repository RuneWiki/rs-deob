import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class282 extends class231 {

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    private int field4729 = 0;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "Z")
    private boolean field4759 = false;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    private int field4748 = 0;

    @OriginalMember(owner = "client!em", name = "fb", descriptor = "I")
    private int field4770 = -32768;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    private int field4746;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    private int field4756;

    @OriginalMember(owner = "client!em", name = "ib", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!em", name = "db", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    private int field4751;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!em", name = "hb", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "Lug;")
    private class190 field4732;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "Luf;")
    public static class168 field4758 = class148.method1019(-1720, "");

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "Luf;")
    private static class168 field4767 = class148.method1019(-1720, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!em", name = "D", descriptor = "Luf;")
    private static class168 field4742 = class148.method1019(-1720, "Take");

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Luf;")
    public static class168 field4733 = field4767;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "Luf;")
    public static class168 field4750 = field4742;

    @OriginalMember(owner = "client!em", name = "gb", descriptor = "Luf;")
    public static class168 field4771 = class148.method1019(-1720, "gleiten:");

    @OriginalMember(owner = "client!em", name = "w", descriptor = "Luf;")
    private static class168 field4735 = class148.method1019(-1720, "wishes to trade with you)3");

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Luf;")
    public static class168 field4731 = field4735;

    @OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
    public static int field4769 = 0;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "D")
    public double field4734;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "D")
    private double field4741;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "D")
    public double field4743;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "D")
    public double field4745;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "D")
    private double field4749;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "D")
    private double field4752;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "D")
    private double field4757;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "D")
    private double field4762;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    private int field4754;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "Ldk;")
    public static class241 field4761;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lhb;", line = 5)
    public static final class149 method1943(int arg0, int arg1) {
        class149 var2 = (class149) class71.field951.method1424((long) arg1, (byte) 90);
        field4760++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class256.field4358.method1647(1, (byte) 120, arg1);
        class149 var4 = new class149();
        int var5 = 38 / ((-arg0 - 73) / 46);
        if (var3 != null) {
            var4.method1023(arg1, new class153(var3), -2);
        }
        class71.field951.method1430(var4, (long) arg1, 13487);
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 26)
    public static void method1944(int arg0) {
        field4761 = null;
        field4758 = null;
        field4733 = null;
        if (arg0 != -32768) {
            return;
        }
        field4742 = null;
        field4771 = null;
        field4735 = null;
        field4767 = null;
        field4731 = null;
        field4750 = null;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)V", line = 49)
    public final void method1945(int arg0, int arg1) {
        this.field4743 += (double) arg0 * this.field4757;
        int var3 = -90 % ((24 - arg1) / 50);
        this.field4745 += (double) arg0 * this.field4752;
        this.field4759 = true;
        this.field4734 += this.field4762 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field4749;
        this.field4749 += (double) arg0 * this.field4762;
        this.field4763 = (int) (Math.atan2(this.field4757, this.field4752) * 325.949D) + 1024 & 0x7FF;
        this.field4754 = (int) (Math.atan2(this.field4749, this.field4741) * 325.949D) & 0x7FF;
        if (this.field4732 != null) {
            this.field4729 += arg0;
            label27: while (true) {
                do {
                    do {
                        if (this.field4729 <= this.field4732.field3075[this.field4748]) {
                            break label27;
                        }
                        this.field4729 -= this.field4732.field3075[this.field4748];
                        this.field4748++;
                    } while (this.field4732.field3063.length > this.field4748);
                    this.field4748 -= this.field4732.field3074;
                } while (this.field4748 >= 0 && this.field4732.field3063.length > this.field4748);
                this.field4748 = 0;
            }
        }
        field4753++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIJ)V", line = 99)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4744++;
        class152 var11 = this.method1947(true);
        if (var11 != null) {
            var11.method112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4770 = var11.method116();
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 114)
    public static final void method1946(boolean arg0) {
        class50.field611 = null;
        client.field4945 = null;
        class135.field2113 = null;
        class148.field2285 = null;
        class40.field512 = null;
        if (!arg0) {
            field4767 = (class168) null;
        }
        class150.field2318 = null;
        class57.field745 = null;
        class284.field4819 = null;
        class293.field4963 = null;
        field4737++;
        class25.field300 = null;
        class175.field2839 = null;
        class26.field314 = null;
        class157.field2494 = null;
        class225.field3635 = null;
        class296.field5007 = null;
        class298.field5045 = null;
        class102.field1588 = null;
        class22.field279 = null;
        class276.field4645 = null;
        class178.field2880 = null;
        class283.field4781 = null;
        class245.field4170 = null;
        class275.field4637 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 275)
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4746 = arg7;
        this.field4730 = arg5;
        this.field4756 = arg4;
        this.field4773 = arg2;
        this.field4768 = arg3;
        this.field4751 = arg0;
        this.field4766 = arg1;
        this.field4755 = arg10;
        this.field4772 = arg8;
        this.field4736 = arg9;
        this.field4740 = arg6;
        this.field4759 = false;
        int var12 = class270.method1873(this.field4751, false).field48;
        if (var12 == -1) {
            this.field4732 = null;
        } else {
            this.field4732 = class119.method858(true, var12);
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Lfc;", line = 163)
    private final class152 method1947(boolean arg0) {
        field4764++;
        class5 var2 = class270.method1873(this.field4751, false);
        class152 var3 = var2.method11(-4, this.field4748);
        if (var3 == null) {
            return null;
        } else {
            var3.method666(this.field4754);
            return arg0 ? var3 : (class152) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZIII)V", line = 201)
    public final void method1948(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!this.field4759) {
            double var6 = (double) (arg4 - this.field4768);
            double var8 = (double) (arg3 - this.field4773);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4743 = (double) this.field4772 * var8 / var10 + (double) this.field4773;
            this.field4734 = (double) this.field4756;
            this.field4745 = (double) this.field4772 * var6 / var10 + (double) this.field4768;
        }
        double var12 = (double) (this.field4740 + 1 - arg2);
        if (arg1) {
            this.field4755 = -106;
        }
        this.field4752 = ((double) arg4 - this.field4745) / var12;
        this.field4757 = ((double) arg3 - this.field4743) / var12;
        this.field4741 = Math.sqrt(this.field4757 * this.field4757 + this.field4752 * this.field4752);
        if (!this.field4759) {
            this.field4749 = -this.field4741 * Math.tan((double) this.field4746 * 0.02454369D);
        }
        this.field4762 = ((double) arg0 - this.field4734 - this.field4749 * var12) * 2.0D / (var12 * var12);
        field4738++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "()I", line = 256)
    public final int method116() {
        field4747++;
        return this.field4770;
    }
}
