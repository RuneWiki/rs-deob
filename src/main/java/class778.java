import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class778 extends class659 {

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "I")
    public static int field10684;

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "I")
    public static int field10685;

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "I")
    public static int field10687;

    @OriginalMember(owner = "client!wga", name = "v", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!wga", name = "w", descriptor = "I")
    public static int field10689;

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "I")
    public int field10690;

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "I")
    public static int field10691;

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "I")
    public int field10692;

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
    public int field10693;

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "I")
    public static int field10695;

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "J")
    public static long field10686;

    @OriginalMember(owner = "client!wga", name = "B", descriptor = "Ljava/lang/String;")
    public String field10694;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)J")
    public final long method4271(boolean arg0) {
        if (!arg0) {
            field10686 = -39L;
        }
        ++field10687;
        return super.field2146 & 72057594037927935L;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)I")
    public static final int method4272(int arg0, int arg1) {
        ++field10691;
        if (arg0 != 9601) {
            field10686 = -34L;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBII)I")
    public static final int method4273(int arg0, byte arg1, int arg2, int arg3) {
        ++field10689;
        if (class645.field8694 == null) {
            return 0;
        } else {
            int var4 = arg2 >> 9;
            if (arg1 > -13) {
                field10686 = -34L;
            }
            int var5 = arg0 >> 9;
            if (~var4 <= -1 && ~var5 <= -1 && ~var4 >= ~(class102.field1467 + -1) && class393.field5663 + -1 >= var5) {
                int var6 = arg3;
                if (arg3 < 3 && ~(2 & class328.field4667[1][var4][var5]) != -1) {
                    var6 = arg3 + 1;
                }
                return class645.field8694[var6].method1895(arg2, arg0, 103);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public final void method4274(int arg0) {
        if (arg0 >= 87) {
            ++field10695;
            super.field8883 |= Long.MIN_VALUE;
            if (this.method4277((byte) 91) == 0L) {
                class626.field8485.method150(0, this);
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)I")
    public final int method4275(byte arg0) {
        if (arg0 != -82) {
            method4273(16, (byte) -77, 117, -38);
        }
        ++field10684;
        return (int) (255L & super.field2146 >>> 56);
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
    public final void method4276(int arg0) {
        ++field10688;
        super.field8883 = 500L + class401.method2440(false) | super.field8883 & Long.MIN_VALUE;
        class119.field1611.method150(arg0 + arg0, this);
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(B)J")
    public final long method4277(byte arg0) {
        if (arg0 <= 0) {
            this.method4277((byte) 111);
        }
        ++field10685;
        return super.field8883 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IJ)V")
    public class778(int arg0, long arg1) {
        super.field2146 = arg1 | (long) arg0 << 56;
    }
}
