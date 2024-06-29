import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class254 extends class499 {

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Lk;")
    public static class66 field3449 = new class66("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Luw;")
    public static class208 field3452 = new class208(81, -1);

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method201(int arg0, boolean arg1) {
        if (arg0 != 91) {
            field3452 = null;
        }
        ++field3446;
        super.field6405.method3774((byte) 46, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII)V", line = 16)
    public final void method204(byte arg0, int arg1, int arg2) {
        if (arg0 <= 11) {
            this.method205(20);
        }
        ++field3445;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V", line = 27)
    public static void method1644(int arg0) {
        field3452 = null;
        if (arg0 != 14554) {
            method1644(80);
        }
        field3449 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILsfa;I)V", line = 40)
    public final void method206(int arg0, class132 arg1, int arg2) {
        ++field3451;
        super.field6405.method3756(arg2 ^ 26927, arg1);
        if (arg2 == 26917) {
            super.field6405.method3740(arg0, 24);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZ)V", line = 54)
    public final void method202(boolean arg0, boolean arg1) {
        if (arg1) {
            method1645((byte) -55, (class133) null, 83, -84);
        }
        ++field3443;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lgd;)V", line = 65)
    public class254(class696 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 68)
    public final void method205(int arg0) {
        ++field3450;
        super.field6405.method3774((byte) 46, false);
        if (arg0 != 0) {
            field3448 = 26;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)Z", line = 81)
    public final boolean method200(boolean arg0) {
        if (!arg0) {
            this.method201(62, true);
        }
        ++field3444;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLuc;II)V", line = 92)
    public static final void method1645(byte arg0, class133 arg1, int arg2, int arg3) {
        ++field3447;
        class343.field4206[arg3][arg2] = arg1;
        if (arg0 < 30) {
            field3448 = -37;
        }
    }
}
