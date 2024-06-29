import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class304 extends class130 {

    @OriginalMember(owner = "client!cb", name = "Eb", descriptor = "I")
    private int field4433;

    @OriginalMember(owner = "client!cb", name = "Gb", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!cb", name = "Hb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!cb", name = "Jb", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!cb", name = "Kb", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!cb", name = "Lb", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!cb", name = "Mb", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!cb", name = "Nb", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!cb", name = "Ob", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!cb", name = "Fb", descriptor = "Lqa;")
    private class134 field4434;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(B)I")
    public final int method2046(byte arg0) {
        ++field4438;
        if (arg0 != 126) {
            this.method2046((byte) 67);
        }
        return 255 & super.field1851[super.field1880++] + -this.field4434.method1030(-13275);
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(B)V")
    public final void method2047(byte arg0) {
        if (arg0 >= -73) {
            this.method2051((byte[]) null, (byte) -42, -111, -66);
        }
        this.field4433 = super.field1880 * 8;
        ++field4436;
    }

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "(II)V")
    public final void method2048(int arg0, int arg1) {
        super.field1851[super.field1880++] = (byte) (this.field4434.method1030(-13275) + arg1);
        if (arg0 != 2040) {
            this.method2049(-79, (int[]) null);
        }
        ++field4440;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
    public class304(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[I)V")
    public final void method2049(int arg0, int[] arg1) {
        if (arg0 != -12691) {
            field4439 = -87;
        }
        ++field4435;
        this.field4434 = new class134(arg1);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)I")
    public final int method2050(byte arg0, int arg1) {
        ++field4437;
        int var3 = 34 % ((58 - arg0) / 43);
        return arg1 * 8 + -this.field4433;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BBII)V")
    public final void method2051(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field4442;
        for (int var5 = 0; ~arg3 < ~var5; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field1851[super.field1880++] + -this.field4434.method1030(-13275));
        }
        if (arg1 < 12) {
            this.method2046((byte) 14);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
    public static final void method2052(int arg0, int arg1, int arg2, int arg3) {
        if (class25.field314 != null) {
            class25.field314[arg0][arg1] = (arg3 & 2040) << 21 | arg2 & 16777215;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(BI)I")
    public final int method2053(byte arg0, int arg1) {
        ++field4441;
        int var3 = this.field4433 >> 3;
        if (arg0 != 0) {
            return 105;
        } else {
            int var4 = -(this.field4433 & 7) + 8;
            this.field4433 += arg1;
            int var5 = 0;
            while (arg1 > var4) {
                var5 += (class397.field5590[var4] & super.field1851[var3++]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 == var4) {
                var6 = (super.field1851[var3] & class397.field5590[var4]) + var5;
            } else {
                var6 = (super.field1851[var3] >> -arg1 + var4 & class397.field5590[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "(I)V")
    public final void method2054(int arg0) {
        super.field1880 = (this.field4433 + 7) / arg0;
        ++field4443;
    }
}
