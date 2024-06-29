import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class714 extends class152 {

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    public int field10018;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
    public int field10021;

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
    public int field10023;

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!jca", name = "F", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!jca", name = "G", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "Ljava/lang/String;")
    public String field10019;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)J")
    public final long method4040(int arg0) {
        if (arg0 != 22279) {
            field10022 = -101;
        }
        ++field10026;
        return 72057594037927935L & super.field4809;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)J")
    public final long method4041(byte arg0) {
        ++field10025;
        return arg0 > -26 ? -94L : super.field1894 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Lbga;")
    public static final class377 method4042(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10171;
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
    public final void method4043(int arg0) {
        super.field1894 |= Long.MIN_VALUE;
        ++field10015;
        if (arg0 != 6380) {
            this.field10018 = -39;
        }
        if (this.method4041((byte) -106) == 0L) {
            class90.field1205.method1005(-119, this);
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
    public final void method4044(byte arg0) {
        if (arg0 != -128) {
            this.field10021 = 57;
        }
        super.field1894 = super.field1894 & Long.MIN_VALUE | 500L + class349.method2069(true);
        ++field10016;
        class656.field9034.method1005(-71, this);
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IJ)V")
    public class714(int arg0, long arg1) {
        super.field4809 = arg1 | (long) arg0 << 56;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(Z)I")
    public final int method4045(boolean arg0) {
        ++field10020;
        if (!arg0) {
            this.field10019 = null;
        }
        return (int) (super.field4809 >>> 56 & 255L);
    }
}
