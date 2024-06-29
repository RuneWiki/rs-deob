import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class482 extends class264 {

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Lke;")
    public static class622 field6850 = new class622(38, -1);

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lep;")
    public static class440 field6854;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBII)I")
    public static final int method2825(int arg0, byte arg1, int arg2, int arg3) {
        ++field6851;
        int var4 = arg2 & 3;
        if (var4 == 0) {
            return arg0;
        } else if (~var4 == -2) {
            return -arg3 + 7;
        } else {
            int var5 = 82 % ((arg1 - 55) / 45);
            return var4 == 2 ? 7 - arg0 : arg3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)I")
    public final int method2826(byte arg0) {
        if (arg0 > -31) {
            return 88;
        } else {
            ++field6849;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static void method2827(int arg0) {
        if (arg0 == 27649) {
            field6854 = null;
            field6850 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            this.method659((byte) -128, 120);
        }
        ++field6852;
        super.field3733 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field6853;
        if (arg0 != 112) {
            field6854 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lmfa;)V")
    public class482(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field6847;
        int var2 = 90 / ((1 - arg0) / 41);
        if (super.field3731.field9032.method1724(-29355) && super.field3733 == 2) {
            super.field3733 = 1;
        }
        if (super.field3733 < 0 || ~super.field3733 < -3) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field6848;
        if (arg0 != -38) {
            field6854 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(ILmfa;)V")
    public class482(int arg0, class640 arg1) {
        super(arg0, arg1);
    }
}
