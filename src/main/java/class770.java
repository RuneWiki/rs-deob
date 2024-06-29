import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class770 extends class207 {

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Lmw;")
    public static class517 field10598 = new class517(79, 3);

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field10602 = 0;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Lmw;")
    public static class517 field10601 = new class517(78, 3);

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field10603;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field10597;
        return arg0 >= -14 ? -35 : 0;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
    public static void method4237(int arg0) {
        field10598 = null;
        field10601 = null;
        if (arg0 <= 20) {
            method4238((byte) 2, 90, 59, 39, (class425) null, 4, 89);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lrd;)V")
    public class770(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (super.field2669 < 0 || super.field2669 > 4) {
            super.field2669 = this.method36(-114);
        }
        int var2 = 29 % ((arg0 - -58) / 48);
        ++field10594;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field10595;
        if (arg1 != 69) {
            field10601 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BIIILqba;II)V")
    public static final void method4238(byte arg0, int arg1, int arg2, int arg3, class425 arg4, int arg5, int arg6) {
        class497.method2918(arg5, arg6, arg1, arg4.field2813, arg2, arg4.field2810, arg4.field2802, arg3, 0, (byte) 105);
        ++field10599;
        if (arg0 != -73) {
            method4238((byte) -65, 68, 3, -26, (class425) null, 88, -53);
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I")
    public final int method4239(int arg0) {
        ++field10596;
        if (arg0 != 43) {
            this.method39(95, (byte) 23);
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 <= -7) {
            ++field10600;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILrd;)V")
    public class770(int arg0, class355 arg1) {
        super(arg0, arg1);
    }
}
