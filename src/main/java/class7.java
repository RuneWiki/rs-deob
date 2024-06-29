import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class207 {

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field49 = 4;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lmw;")
    public static class517 field53 = new class517(5, 4);

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[I")
    public static int[] field59 = new int[1];

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Z")
    public static boolean field60 = true;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Z")
    public static boolean field61 = true;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Lhp;")
    public static class346 field52;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I", line = 3)
    public final int method35(int arg0) {
        ++field58;
        return arg0 != 43 ? 29 : super.field2669;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I", line = 16)
    public final int method36(int arg0) {
        ++field51;
        if (arg0 > -14) {
            method40(-90);
        }
        return 0;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lrd;)V", line = 28)
    public class7(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 37)
    public final void method37(int arg0) {
        ++field57;
        if (super.field2669 != 1 && super.field2669 != 0) {
            super.field2669 = this.method36(-31);
        }
        int var2 = -64 % ((arg0 - -58) / 48);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(ILrd;)V", line = 49)
    public class7(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method38(int arg0, int arg1, int arg2) {
        int var3 = 52 / ((arg1 - -55) / 53);
        ++field48;
        return (arg0 & 540800) != 0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)I", line = 63)
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            field52 = null;
        }
        ++field50;
        return 1;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 74)
    public static void method40(int arg0) {
        field59 = null;
        field53 = null;
        if (arg0 >= -96) {
            method38(-116, 8, -47);
        }
        field52 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V", line = 89)
    public final void method41(int arg0, byte arg1) {
        ++field55;
        if (arg1 < -7) {
            super.field2669 = arg0;
        }
    }
}
