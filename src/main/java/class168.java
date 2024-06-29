import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class168 extends class479 {

    @OriginalMember(owner = "client!jc", name = "Bb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!jc", name = "Cb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!jc", name = "Db", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!jc", name = "Eb", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!jc", name = "Fb", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!jc", name = "Gb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!jc", name = "Hb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!jc", name = "Ib", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!jc", name = "Jb", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!jc", name = "Kb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!jc", name = "Lb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!jc", name = "Mb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!jc", name = "zb", descriptor = "Lnha;")
    private class684 field2375;

    @OriginalMember(owner = "client!jc", name = "Ab", descriptor = "[Ltd;")
    public static class515[] field2376;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "(I)Z", line = 5)
    public final boolean method1197(int arg0) {
        ++field2383;
        if (arg0 != -437324479) {
            this.method1207(true);
        }
        int var2 = super.field6800[super.field6864] - this.field2375.method3882((byte) -128) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)V", line = 32)
    public final void method1198(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 0;
        if (arg3 == -21233) {
            while (var5 < arg2) {
                arg0[arg1 + var5] = (byte) (super.field6800[super.field6864++] + -this.field2375.method3879(true));
                ++var5;
            }
            ++field2378;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(IZ)Z", line = 54)
    public static final boolean method1199(int arg0, boolean arg1) {
        if (!arg1) {
            field2376 = null;
        }
        ++field2387;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "(II)V", line = 65)
    public final void method1200(int arg0, int arg1) {
        if (arg1 == -22676) {
            super.field6800[super.field6864++] = (byte) (arg0 + this.field2375.method3879(true));
            ++field2381;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IZ)V", line = 77)
    public final void method1201(int[] arg0, boolean arg1) {
        if (!arg1) {
            this.field2375 = new class684(arg0);
            ++field2386;
        }
    }

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "(II)I", line = 88)
    public final int method1202(int arg0, int arg1) {
        if (arg0 != 8) {
            method1199(-96, true);
        }
        ++field2388;
        return arg1 * 8 + -this.field2385;
    }

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "(I)V", line = 102)
    public final void method1203(int arg0) {
        this.field2385 = super.field6864 * 8;
        if (arg0 != -26008) {
            this.field2375 = null;
        }
        ++field2379;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lnha;I)V", line = 113)
    public final void method1204(class684 arg0, int arg1) {
        this.field2375 = arg0;
        if (arg1 != 61419942) {
            field2376 = null;
        }
        ++field2382;
    }

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "(I)V", line = 127)
    public static void method1205(int arg0) {
        if (arg0 != 11908) {
            field2376 = null;
        }
        field2376 = null;
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(IB)I", line = 137)
    public final int method1206(int arg0, byte arg1) {
        ++field2384;
        int var3 = this.field2385 >> 3;
        int var4 = 8 - (7 & this.field2385);
        if (arg1 != -90) {
            this.field2385 = -14;
        }
        this.field2385 += arg0;
        int var5 = 0;
        while (arg0 > var4) {
            var5 += (super.field6800[var3++] & class100.field1449[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field6800[var3] >> -arg0 + var4 & class100.field1449[arg0]) + var5;
        } else {
            var6 = (class100.field1449[var4] & super.field6800[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)I", line = 172)
    public final int method1207(boolean arg0) {
        ++field2377;
        int var2 = super.field6800[super.field6864++] - this.field2375.method3879(true) & 255;
        if (arg0) {
            this.field2375 = null;
        }
        return ~var2 > -129 ? var2 : (255 & super.field6800[super.field6864++] + -this.field2375.method3879(true)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V", line = 189)
    public class168(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "(B)V", line = 192)
    public final void method1208(byte arg0) {
        ++field2380;
        super.field6864 = (this.field2385 + 7) / 8;
        int var2 = -11 % ((19 - arg0) / 38);
    }
}
