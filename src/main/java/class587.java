import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class587 extends class60 {

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "Lhj;")
    public static class596 field7996 = new class596(69, 0);

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field7997 = -1;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "F")
    public static float field7998;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
    public static final void method3368(byte arg0) {
        class275.field3223 = 200;
        ++field7992;
        class450.field6365 = (int) ((double) class596.field8090 * 34.46D);
        class450.field6365 <<= 2;
        if (class363.field4526.method604()) {
            class450.field6365 += 512;
        }
        class435.method2574(false, true);
        int var1 = -39 / ((18 - arg0) / 49);
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)Z")
    public final boolean method3369(byte arg0) {
        if (arg0 > -61) {
            return false;
        } else {
            ++field7994;
            return true;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
    public final int method3370(int arg0) {
        ++field7990;
        if (arg0 != 0) {
            method3372(88);
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        ++field7991;
        return arg0 ? -85 : 1;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(ILhd;)V")
    public class587(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        int var3 = -21 / ((28 - arg0) / 50);
        super.field799 = arg1;
        ++field7989;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field7993;
        return arg0 != arg1 && super.field798.field10677.method3451(0) != 1 ? 2 : 1;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lhd;)V")
    public class587(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public static void method3371(int arg0) {
        if (arg0 <= 37) {
            method3371(67);
        }
        field7996 = null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
    public static final void method3372(int arg0) {
        ++field7988;
        class625.method3551();
        int var1 = 0;
        if (arg0 <= 83) {
            field7996 = null;
        }
        while (var1 < 4) {
            class633.field8649[var1].method2487(19666);
            ++var1;
        }
        class149.method1075((byte) -81);
        class276.method1611(113);
        class503.method3017(-119);
        System.gc();
        class363.field4526.method6();
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        ++field7995;
        if (arg0 < -27) {
            if (~super.field799 != -1 && super.field798.field10677.method3451(0) != 1) {
                super.field799 = 0;
            }
            if (super.field799 < 0 || ~super.field799 < -2) {
                super.field799 = this.method405(false);
            }
        }
    }
}
