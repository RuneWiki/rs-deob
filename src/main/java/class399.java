import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class399 extends class40 {

    @OriginalMember(owner = "client!ia", name = "zb", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ia", name = "Ab", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!ia", name = "Bb", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ia", name = "Cb", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!ia", name = "Eb", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
    private int field5818;

    @OriginalMember(owner = "client!ia", name = "Gb", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ia", name = "Hb", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ia", name = "Ib", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ia", name = "Jb", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ia", name = "Kb", descriptor = "Ls;")
    private class176 field5823;

    @OriginalMember(owner = "client!ia", name = "Db", descriptor = "Lku;")
    public static class244 field5816;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "(I)I")
    public final int method2363(int arg0) {
        ++field5821;
        int var2 = 255 & super.field536[super.field585++] + -this.field5823.method1108((byte) -118);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 > -58) {
                this.method2364(-84, true);
            }
            return (var2 + -128 << 8) - -(255 & super.field536[super.field585++] - this.field5823.method1108((byte) -119));
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IZ)I")
    public final int method2364(int arg0, boolean arg1) {
        ++field5814;
        int var3 = this.field5818 >> 3;
        int var4 = -(this.field5818 & 7) + 8;
        this.field5818 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (super.field536[var3++] & class362.field5341[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        if (!arg1) {
            this.field5818 = -69;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class362.field5341[var4] & super.field536[var3]) + var5;
        } else {
            var6 = (super.field536[var3] >> -arg0 + var4 & class362.field5341[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(IB)V")
    public final void method2365(int arg0, byte arg1) {
        int var3 = -65 % ((arg1 - -84) / 36);
        super.field536[super.field585++] = (byte) (arg0 + this.field5823.method1108((byte) -118));
        ++field5817;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I[BII)V")
    public final void method2366(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field5812;
        if (arg2 >= -121) {
            this.field5818 = -59;
        }
        for (int var5 = 0; ~arg3 < ~var5; ++var5) {
            arg1[var5 - -arg0] = (byte) (super.field536[super.field585++] + -this.field5823.method1108((byte) -113));
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V")
    public class399(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "(I)V")
    public final void method2367(int arg0) {
        ++field5815;
        this.field5818 = super.field585 * arg0;
    }

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "(II)I")
    public static final int method2368(int arg0, int arg1) {
        return class280.field4251 != null ? class280.field4251[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "(B)Z")
    public final boolean method2369(byte arg0) {
        ++field5820;
        int var2 = super.field536[super.field585] + -this.field5823.method1105(256) & 255;
        int var3 = -127 % ((arg0 - -3) / 52);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "(II)I")
    public final int method2370(int arg0, int arg1) {
        ++field5822;
        if (arg1 >= -60) {
            this.method2369((byte) -10);
        }
        return arg0 * 8 + -this.field5818;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class168 var7 = new class168();
        var7.field2612 = arg1 >> class239.field3602;
        var7.field2602 = arg2 >> class239.field3602;
        var7.field2611 = arg3 >> class239.field3602;
        var7.field2607 = arg4 >> class239.field3602;
        var7.field2608 = arg0;
        var7.field2617 = arg1;
        var7.field2606 = arg2;
        var7.field2609 = arg3;
        var7.field2604 = arg4;
        var7.field2614 = arg5;
        var7.field2610 = arg6;
        class150.field2419[class370.field5434++] = var7;
    }

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "(I)V")
    public static void method2372(int arg0) {
        if (arg0 <= 58) {
            method2371(37, 107, 78, 13, -55, 104, 78);
        }
        field5816 = null;
    }

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "(Z)V")
    public final void method2373(boolean arg0) {
        super.field585 = (this.field5818 + 7) / 8;
        ++field5813;
        if (arg0) {
            this.method2365(89, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IB)V")
    public final void method2374(int[] arg0, byte arg1) {
        this.field5823 = new class176(arg0);
        ++field5819;
        if (arg1 > -60) {
            field5816 = null;
        }
    }
}
