import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class535 extends class601 {

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[S")
    public static short[] field7424 = new short[256];

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lkr;")
    public static class602 field7423 = new class602(71, -2);

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lej;")
    public static class179 field7417;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lfd;")
    public static class298 field7425;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[Lub;")
    public static class83[] field7420;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method3170(int arg0) {
        field7424 = null;
        if (arg0 != 27341) {
            method3170(-89);
        }
        field7423 = null;
        field7425 = null;
        field7420 = null;
        field7417 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            this.method41((byte) 70);
        }
        ++field7426;
        return 3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        super.field8131 = this.method45(8976);
        int var2 = -52 % ((arg0 - 59) / 33);
        ++field7419;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = 107 / ((22 - arg0) / 34);
        ++field7421;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILqea;)V")
    public class535(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field7422;
        return super.field8137.method2161(arg0 ^ arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
    public final int method3171(int arg0) {
        if (arg0 != 0) {
            field7425 = null;
        }
        ++field7418;
        return super.field8131;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lqea;)V")
    public class535(class339 arg0) {
        super(arg0);
    }
}
