import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public abstract class class509 {

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "Lkw;")
    public class174 field7558;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field7568 = 2;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field7565 = 0;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "Z")
    public static boolean field7571 = false;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "Z")
    public static boolean field7559;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)V")
    public abstract void method35(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public void method41(int arg0) {
        if (arg0 > -88) {
            this.field7558 = null;
        }
        field7564++;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZILmn;)V")
    public abstract void method42(boolean arg0, int arg1, class60 arg2);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method3039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field7556++;
        if (arg2 < 128 || arg6 < 128 || arg2 > class35.field399 * 128 - 256 || (class382.field5586 - 2) * 128 < arg6) {
            class543.field8117[0] = class543.field8117[1] = -1;
            return;
        }
        int var10 = class226.method1477(arg5, arg9, arg2, arg6) - arg0;
        class385.field5628.method619(arg8, 0, 0);
        class379.field5558.method999(class385.field5628);
        if (!arg9) {
            field7565 = -52;
        }
        class379.field5558.method1037(arg2, var10, arg6, class543.field8117);
        class385.field5628.method619(-arg8, 0, 0);
        class379.field5558.method999(class385.field5628);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)Z")
    public abstract boolean method40(int arg0);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
    public void method381(byte arg0) {
        field7561++;
        if (arg0 != -48) {
            this.field7558 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
    public abstract void method38(byte arg0);

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)V")
    public void method385(byte arg0) {
        field7570++;
        if (arg0 < 76) {
            field7568 = 44;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
    public void method36(boolean arg0) {
        field7563++;
        if (arg0) {
            this.method38((byte) 15);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3040(int arg0, String arg1) {
        if (arg0 < 121) {
            return null;
        }
        field7562++;
        if (class353.field5142.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class353.field5142.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class353.field5142.startsWith("mac")) {
            return "lib" + arg1 + ".jnilib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBI)V")
    public abstract void method43(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
    public abstract void method39(int arg0, boolean arg1);

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lkw;)V")
    public class509(class174 arg0) {
        this.field7558 = arg0;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(IBI)V")
    public static final void method3041(int arg0, byte arg1, int arg2) {
        field7557++;
        class278 var3 = class468.field6812[arg0][arg2];
        if (var3 != null) {
            class185.field2807 = var3.field4126;
            class511.field7592 = var3.field4142;
            client.field9098 = var3.field4130;
        }
        class581.method3394((byte) -103);
        if (arg1 > -73) {
            field7565 = -31;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)Z")
    public static final boolean method3042(int arg0, byte arg1) {
        int var2 = -75 % ((arg1 + 40) / 57);
        field7560++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
    public void method382(int arg0) {
        field7567++;
        if (arg0 <= 69) {
            this.field7558 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)I")
    public static final int method3043(int arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            field7566++;
            return arg0 == 1 || arg0 == 3 ? class47.field557[arg2 & 0x3] : class491.field7424[arg2 & 0x3];
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
    public void method384(int arg0) {
        field7569++;
        if (arg0 != -1) {
            this.method41(51);
        }
    }
}
