import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class452 extends class145 {

    @OriginalMember(owner = "client!ck", name = "Lb", descriptor = "I")
    public static int field6759 = 0;

    @OriginalMember(owner = "client!ck", name = "Ab", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!ck", name = "Bb", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!ck", name = "Db", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!ck", name = "Eb", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!ck", name = "Fb", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!ck", name = "Gb", descriptor = "I")
    private int field6754;

    @OriginalMember(owner = "client!ck", name = "Hb", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!ck", name = "Ib", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!ck", name = "Jb", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!ck", name = "Kb", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!ck", name = "Mb", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ck", name = "Nb", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!ck", name = "Ob", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!ck", name = "Cb", descriptor = "Lkg;")
    private class177 field6750;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[I)V")
    public final void method2691(byte arg0, int[] arg1) {
        this.field6750 = new class177(arg1);
        ++field6755;
        if (arg0 > -3) {
            this.method2698(0, (byte[]) null, -82, -24);
        }
    }

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "(B)[Lpf;")
    public static final class410[] method2692(byte arg0) {
        ++field6758;
        return arg0 > -121 ? null : new class410[] { class339.field5124, class339.field5129, class339.field5130, class339.field5131, class339.field5132, class339.field5133, class339.field5134, class339.field5135, class339.field5136, class339.field5137 };
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILmq;I)V")
    public static final void method2693(int arg0, int arg1, class350 arg2, int arg3) {
        ++field6749;
        class482.field7169 = arg0;
        class26.field577 = arg3;
        if (arg1 == 255) {
            class402.field6042 = arg2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(IZ)V")
    public final void method2694(int arg0, boolean arg1) {
        super.field2270[super.field2289++] = (byte) (this.field6750.method1259(-124) + arg0);
        if (!arg1) {
            ++field6756;
        }
    }

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "(I)Let;")
    public static final class419 method2695(int arg0) {
        ++field6753;
        if (arg0 != -4) {
            method2692((byte) 79);
        }
        return class509.field7483;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(IB)I")
    public final int method2696(int arg0, byte arg1) {
        int var3 = -52 % ((arg1 - -3) / 54);
        ++field6761;
        return arg0 * 8 + -this.field6754;
    }

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "(I)Z")
    public final boolean method2697(int arg0) {
        ++field6757;
        if (arg0 != -16552) {
            this.field6750 = null;
        }
        int var2 = super.field2270[super.field2289] + -this.field6750.method1264(6) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
    public class452(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I[BII)V")
    public final void method2698(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 8) {
            this.field6750 = null;
        }
        ++field6760;
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field2270[super.field2289++] + -this.field6750.method1259(-128));
        }
    }

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "(B)I")
    public final int method2699(byte arg0) {
        ++field6751;
        int var2 = super.field2270[super.field2289++] + -this.field6750.method1259(97) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 <= 23) {
                field6759 = 14;
            }
            return (var2 + -128 << 8) + (255 & super.field2270[super.field2289++] - this.field6750.method1259(117));
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)I")
    public final int method2700(byte arg0, int arg1) {
        ++field6762;
        int var3 = this.field6754 >> 3;
        int var4 = -(this.field6754 & 7) + 8;
        if (arg0 != 87) {
            this.field6754 = 56;
        }
        this.field6754 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (class77.field1302[var4] & super.field2270[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field2270[var3] & class77.field1302[var4]) + var5;
        } else {
            var6 = (super.field2270[var3] >> -arg1 + var4 & class77.field1302[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "(I)V")
    public final void method2701(int arg0) {
        if (arg0 != 19466) {
            this.method2694(-96, true);
        }
        this.field6754 = super.field2289 * 8;
        ++field6752;
    }

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "(I)V")
    public final void method2702(int arg0) {
        ++field6748;
        if (arg0 == 10492) {
            super.field2289 = (this.field6754 + 7) / 8;
        }
    }
}
