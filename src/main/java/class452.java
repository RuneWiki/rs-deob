import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class452 extends class35 {

    @OriginalMember(owner = "client!rca", name = "Lb", descriptor = "I")
    public static int field6245 = 0;

    @OriginalMember(owner = "client!rca", name = "Ab", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!rca", name = "Db", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!rca", name = "Eb", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!rca", name = "Fb", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!rca", name = "Gb", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!rca", name = "Hb", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!rca", name = "Ib", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!rca", name = "Jb", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!rca", name = "Kb", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!rca", name = "Mb", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!rca", name = "Nb", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!rca", name = "Ob", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!rca", name = "Pb", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!rca", name = "Qb", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!rca", name = "Bb", descriptor = "Lsp;")
    private class633 field6235;

    @OriginalMember(owner = "client!rca", name = "Cb", descriptor = "Ljava/lang/Object;")
    public static Object field6236;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(IB)V", line = 3)
    public final void method2682(int arg0, byte arg1) {
        ++field6249;
        if (arg1 >= -107) {
            this.field6237 = -125;
        }
        super.field483[super.field469++] = (byte) (this.field6235.method3643((byte) -20) + arg0);
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(BI)I", line = 16)
    public final int method2683(byte arg0, int arg1) {
        ++field6247;
        int var3 = -104 / ((40 - arg0) / 62);
        return arg1 * 8 + -this.field6237;
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(Z)V", line = 26)
    public final void method2684(boolean arg0) {
        if (!arg0) {
            this.method2682(17, (byte) -114);
        }
        super.field469 = (this.field6237 + 7) / 8;
        ++field6244;
    }

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "(B)Z", line = 37)
    public final boolean method2685(byte arg0) {
        if (arg0 != -28) {
            this.field6237 = -41;
        }
        ++field6248;
        int var2 = super.field483[super.field469] - this.field6235.method3639(8) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "(II)I", line = 60)
    public final int method2686(int arg0, int arg1) {
        ++field6238;
        int var3 = this.field6237 >> 3;
        int var4 = 8 - (this.field6237 & 7);
        this.field6237 += arg1;
        int var5 = 0;
        while (~arg1 < ~var4) {
            var5 += (super.field483[var3++] & class132.field2065[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0 != -9380) {
            this.method2689((class633) null, 6);
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (class132.field2065[var4] & super.field483[var3]) + var5;
        } else {
            var6 = (super.field483[var3] >> -arg1 + var4 & class132.field2065[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[I)V", line = 97)
    public final void method2687(int arg0, int[] arg1) {
        ++field6242;
        this.field6235 = new class633(arg1);
        if (arg0 != 1535) {
            this.method2686(2, 43);
        }
    }

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "(B)V", line = 109)
    public final void method2688(byte arg0) {
        this.field6237 = super.field469 * 8;
        int var2 = 103 / ((arg0 - -46) / 38);
        ++field6246;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lsp;I)V", line = 121)
    public final void method2689(class633 arg0, int arg1) {
        ++field6241;
        if (arg1 != -29592) {
            this.field6235 = null;
        }
        this.field6235 = arg0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)V", line = 133)
    public static final void method2690(int arg0, boolean arg1, int arg2) {
        ++field6239;
        if (arg2 < 106) {
            field6236 = null;
        }
        class380 var3 = class105.method908(0, arg1, arg0);
        if (var3 != null) {
            var3.method3617(1);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "([BIII)V", line = 151)
    public final void method2691(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 0;
        if (arg1 >= -13) {
            this.method2688((byte) -70);
        }
        while (~var5 > ~arg2) {
            arg0[var5 - -arg3] = (byte) (super.field483[super.field469++] + -this.field6235.method3643((byte) -20));
            ++var5;
        }
        ++field6243;
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(Z)V", line = 168)
    public static void method2692(boolean arg0) {
        if (!arg0) {
            method2690(91, false, 57);
        }
        field6236 = null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z", line = 180)
    public static final boolean method2693(int arg0, int arg1, int arg2) {
        ++field6240;
        if (arg0 != -545) {
            method2692(false);
        }
        return ~(arg1 & 544) == -545 | (arg1 & 24) != 0;
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(IIZ)Z", line = 201)
    public static final boolean method2694(int arg0, int arg1, boolean arg2) {
        ++field6250;
        if (!arg2) {
            field6236 = null;
        }
        return (~(arg0 & 8192) != -1 | class618.method3580(544, arg1, arg0) | class583.method3372(arg0, (byte) 85, arg1)) & class436.method2628(124, arg1, arg0);
    }

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "(I)I", line = 217)
    public final int method2695(int arg0) {
        ++field6234;
        int var2 = super.field483[super.field469++] + -this.field6235.method3643((byte) -20) & arg0;
        return var2 < 128 ? var2 : (255 & super.field483[super.field469++] - this.field6235.method3643((byte) -20)) + (var2 - 128 << 8);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(I)V", line = 235)
    public class452(int arg0) {
        super(arg0);
    }
}
