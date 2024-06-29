import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class536 extends class60 {

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Llja;")
    public static class744 field7546 = new class744(3, 8);

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Lhj;")
    public static class596 field7549 = new class596(39, 3);

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[Lkw;")
    public static class264[] field7550 = new class264[6];

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILhd;)V", line = 3)
    public class536(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I", line = 6)
    public final int method405(boolean arg0) {
        if (arg0) {
            return -107;
        } else {
            ++field7541;
            return 1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V", line = 17)
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        ++field7548;
        int var3 = 33 / ((arg0 - 28) / 50);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lhd;)V", line = 27)
    public class536(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)Z", line = 30)
    public final boolean method3186(byte arg0) {
        ++field7545;
        if (super.field798.method4287((byte) 98)) {
            return false;
        } else {
            return arg0 < -61;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILiaa;)V", line = 45)
    public static final void method3187(int arg0, int arg1, int arg2, class521 arg3) {
        ++field7543;
        int[] var4 = new int[4];
        class211.method1333(var4, 0, var4.length, arg2);
        class756.method4218(arg1, var4, arg3, 0);
        if (arg0 > -43) {
            field7546 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 60)
    public final void method409(byte arg0) {
        if (arg0 < -27) {
            ++field7547;
            if (super.field798.method4287((byte) 127)) {
                super.field799 = 0;
            }
            if (~super.field799 != -2 && ~super.field799 != -1) {
                super.field799 = this.method405(false);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V", line = 76)
    public static void method3188(byte arg0) {
        if (arg0 >= -123) {
            method3187(-36, -1, 40, (class521) null);
        }
        field7546 = null;
        field7550 = null;
        field7549 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I", line = 94)
    public final int method3189(int arg0) {
        if (arg0 != 0) {
            field7549 = null;
        }
        ++field7544;
        return super.field799;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I", line = 105)
    public final int method406(int arg0, int arg1) {
        ++field7542;
        if (super.field798.method4287((byte) 91)) {
            return 3;
        } else {
            if (arg0 != 0) {
                this.method409((byte) -62);
            }
            return 1;
        }
    }
}
