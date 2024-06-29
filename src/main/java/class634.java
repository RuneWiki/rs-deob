import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class634 extends class502 {

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field8770 = 0;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "Lvl;")
    public static class15 field8773 = new class15(39, 8);

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method3545(boolean arg0, int arg1) {
        if (arg0) {
            field8770 = 82;
        }
        ++field8779;
        class651.field9025 = arg1;
        class43 var2 = class23.field479;
        synchronized (class23.field479) {
            class23.field479.method273(127);
        }
        class43 var3 = class220.field3227;
        synchronized (class220.field3227) {
            class220.field3227.method273(127);
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Leka;)V", line = 23)
    public class634(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V", line = 29)
    public static void method3546(int arg0) {
        if (arg0 != 0) {
            field8770 = 89;
        }
        field8773 = null;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)I", line = 40)
    public final int method3547(byte arg0) {
        ++field8778;
        if (arg0 < 49) {
            field8770 = 43;
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I", line = 52)
    public final int method55(int arg0) {
        ++field8780;
        if (arg0 != -2) {
            field8771 = -92;
        }
        return 1;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)Z", line = 63)
    public final boolean method3548(int arg0) {
        ++field8776;
        if (super.field6863.method2830((byte) 120)) {
            return false;
        } else {
            if (arg0 != 0) {
                field8771 = 49;
            }
            return super.field6863.method2826(true) == class505.field6887;
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(ZI)Ljava/lang/String;", line = 80)
    public static final String method3549(boolean arg0, int arg1) {
        ++field8777;
        class430 var2 = (class430) class524.field7128.method337((long) arg1, 1);
        if (var2 != null) {
            class177 var3 = var2.field5868.method710(-11);
            if (var3 != null) {
                double var4 = var2.field5868.method699((byte) -107);
                if (var4 >= (double) var3.method1337(104) && var4 <= (double) var3.method1341(114)) {
                    return var3.method1343((byte) -87);
                }
            }
        }
        if (!arg0) {
            field8773 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(II)V", line = 115)
    public final void method52(int arg0, int arg1) {
        ++field8772;
        if (arg1 != 0) {
            field8773 = null;
        }
        super.field6865 = arg0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)I", line = 127)
    public final int method57(int arg0, int arg1) {
        ++field8774;
        if (super.field6863.method2830((byte) 104)) {
            return 3;
        } else {
            if (arg1 != 0) {
                method3545(true, 80);
            }
            return super.field6863.method2826(true) == class505.field6887 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z[B)Ljava/lang/String;", line = 156)
    public static final String method3550(boolean arg0, byte[] arg1) {
        ++field8775;
        if (arg0) {
            method3549(false, -114);
        }
        return class784.method4279(arg1, arg1.length, 0, 255);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(ILeka;)V", line = 167)
    public class634(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V", line = 170)
    public final void method58(boolean arg0) {
        ++field8769;
        if (super.field6863.method2826(arg0) == class505.field6887) {
            if (super.field6863.method2830((byte) 110)) {
                super.field6865 = 0;
            }
        } else {
            super.field6865 = 1;
        }
        if (~super.field6865 != -1 && super.field6865 != 1) {
            super.field6865 = this.method55(-2);
        }
    }
}
