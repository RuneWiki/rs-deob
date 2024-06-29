import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class726 extends class125 {

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
    public static int[] field10208 = new int[2];

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field10199 = 0;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "[I")
    public static int[] field10201 = new int[8];

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field10205;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Lla;")
    public static class423 field10209;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[Lta;")
    public static class27[] field10206;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(ILgp;)V")
    public class726(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            return -10;
        } else {
            ++field10200;
            return arg1 != 0 && super.field1733.field7972.method1587(false) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static final void method4054(int arg0) {
        ++field10205;
        if (arg0 != 1) {
            field10208 = null;
        }
        int var1 = class243.field3580.field7986.method185(false);
        if (~var1 == -1) {
            class651.field9345 = null;
            class364.method2288(0, arg0 ^ -73);
        } else if (var1 != 1) {
            class429.method2654((byte) 52, (byte) (class444.field6347 + -4 & 255));
            class364.method2288(2, arg0 + -66);
        } else {
            class429.method2654((byte) 52, (byte) 0);
            class364.method2288(512, -113);
            if (class160.field2297 != null) {
                class448.method2742(0);
            }
        }
        class35.field319 = class687.field9758;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)V")
    public static void method4055(boolean arg0) {
        field10206 = null;
        field10201 = null;
        field10209 = null;
        if (arg0) {
            field10208 = null;
        }
        field10208 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = -127 / ((arg0 - -63) / 49);
        ++field10204;
        return 1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLeg;I)V")
    public static final void method4056(boolean arg0, class317 arg1, int arg2) {
        class375.field5435.method2231((byte) 88, arg1);
        if (arg2 != 512) {
            field10209 = null;
        }
        ++field10210;
        if (arg0) {
            class569.method3391(class375.field5435, class551.field8040, class372.field5406, -119, arg1, class633.field8934);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z")
    public final boolean method4057(int arg0) {
        ++field10198;
        if (arg0 != -7558) {
            this.method155(true, -13);
        }
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (!arg0) {
            this.method4057(-126);
        }
        ++field10202;
        if (~super.field1732 != -1 && super.field1733.field7972.method1587(false) != 1) {
            super.field1732 = 0;
        }
        if (~super.field1732 > -1 || super.field1732 > 1) {
            super.field1732 = this.method158((byte) -115);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lgp;)V")
    public class726(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(Z)I")
    public final int method4058(boolean arg0) {
        if (arg0) {
            field10201 = null;
        }
        ++field10207;
        return super.field1732;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        super.field1732 = arg1;
        ++field10203;
        if (arg0 > -32) {
            field10208 = null;
        }
    }
}
