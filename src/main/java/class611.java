import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class611 extends class86 {

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field7717 = 100;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lrda;")
    public static class467 field7716 = new class467(8);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lk;")
    public static class66 field7718;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method76(int arg0, boolean arg1) {
        ++field7720;
        if (arg1) {
            this.method71((byte) -65);
        }
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILsf;)V", line = 15)
    public class611(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I", line = 18)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            field7717 = -55;
        }
        ++field7715;
        return !class124.method732(super.field1203.field6949.method2402(false), 36) ? 3 : 1;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lsf;)V", line = 35)
    public class611(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I", line = 38)
    public final int method3272(boolean arg0) {
        if (arg0) {
            return 127;
        } else {
            ++field7721;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V", line = 51)
    public static void method3273(byte arg0) {
        field7718 = null;
        field7716 = null;
        if (arg0 >= -87) {
            field7716 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I", line = 62)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return 120;
        } else {
            ++field7719;
            return 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 73)
    public final void method71(byte arg0) {
        ++field7713;
        if (super.field1203.field6949.method2400(-25176) && !class124.method732(super.field1203.field6949.method2402(false), 89)) {
            super.field1200 = 0;
        }
        if (arg0 != -65) {
            this.method73(-16);
        }
        if (super.field1200 < 0 || super.field1200 > 1) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)Z", line = 99)
    public final boolean method3274(int arg0) {
        ++field7714;
        int var2 = -120 / ((arg0 - -57) / 57);
        return class124.method732(super.field1203.field6949.method2402(false), 61);
    }
}
