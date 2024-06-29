import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class196 implements class257 {

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lfv;")
    public class120 field2605;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "Ldp;")
    public class3 field2610;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
    public static boolean field2608 = false;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "F")
    public static float field2614;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IILjb;I)V", line = 12)
    public static final void method1208(int arg0, int arg1, class493 arg2, int arg3) {
        field2612++;
        if (arg2.field7102 == 0) {
            arg2.field6975 = arg2.field7035;
        } else if (arg2.field7102 == 1) {
            arg2.field6975 = (arg1 - arg2.field7031) / 2 + arg2.field7035;
        } else if (arg2.field7102 == 2) {
            arg2.field6975 = arg1 - arg2.field7035 - arg2.field7031;
        } else if (arg2.field7102 == 3) {
            arg2.field6975 = arg2.field7035 * arg1 >> 14;
        } else if (arg2.field7102 == 4) {
            arg2.field6975 = (arg1 - arg2.field7031) / 2 + (arg2.field7035 * arg1 >> 14);
        } else {
            arg2.field6975 = arg1 - arg2.field7031 - (arg2.field7035 * arg1 >> 14);
        }
        int var4 = 43 % ((arg0 - 79) / 47);
        if (arg2.field6958 == 0) {
            arg2.field6954 = arg2.field7100;
        } else if (arg2.field6958 == 1) {
            arg2.field6954 = (arg3 - arg2.field7095) / 2 + arg2.field7100;
        } else if (arg2.field6958 == 2) {
            arg2.field6954 = arg3 - arg2.field7100 - arg2.field7095;
        } else if (arg2.field6958 == 3) {
            arg2.field6954 = arg2.field7100 * arg3 >> 14;
        } else if (arg2.field6958 == 4) {
            arg2.field6954 = (arg2.field7100 * arg3 >> 14) + (arg3 - arg2.field7095) / 2;
        } else {
            arg2.field6954 = arg3 - (arg2.field7100 * arg3 >> 14) - arg2.field7095;
        }
        if (!class600.field8422 || client.method1950(arg2).field6767 == 0 && arg2.field7016 != 0) {
            return;
        }
        if (arg2.field6954 < 0) {
            arg2.field6954 = 0;
        } else if ((arg2.field6954 + arg2.field7095) > arg3) {
            arg2.field6954 = arg3 - arg2.field7095;
        }
        if (arg2.field6975 < 0) {
            arg2.field6975 = 0;
        } else if (arg2.field7031 + arg2.field6975 > arg1) {
            arg2.field6975 = arg1 - arg2.field7031;
            return;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(ILdp;Lfv;II)V", line = 82)
    public class196(int arg0, class3 arg1, class120 arg2, int arg3, int arg4) {
        this.field2605 = arg2;
        this.field2611 = arg3;
        this.field2607 = arg4;
        this.field2610 = arg1;
        this.field2609 = arg0;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)Lg;", line = 98)
    public class153 method769(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field2606++;
            return class626.field8698;
        }
    }
}
