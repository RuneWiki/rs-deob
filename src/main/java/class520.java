import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class520 extends class354 {

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "[S")
    public static short[] field7297 = new short[256];

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "Lha;")
    public static class60 field7296;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)I", line = 4)
    public final int method3020(byte arg0) {
        ++field7292;
        int var2 = 12 % ((7 - arg0) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I", line = 15)
    public final int method391(int arg0, int arg1) {
        ++field7298;
        if (arg0 != 3) {
            return 78;
        } else {
            return !class320.method1881(super.field4544.field10399.method1924((byte) 113), (byte) 98) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 30)
    public static void method3021(int arg0) {
        if (arg0 == 1) {
            field7297 = null;
            field7296 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lwo;)V", line = 41)
    public class520(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Z", line = 46)
    public final boolean method3022(int arg0) {
        ++field7291;
        int var2 = 125 / ((-34 - arg0) / 41);
        return class320.method1881(super.field4544.field10399.method1924((byte) -66), (byte) 95);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z", line = 60)
    public static final boolean method3023(int arg0, int arg1, int arg2) {
        ++field7294;
        if (arg2 < 13) {
            method3023(5, -2, 82);
        }
        return class309.method1855(arg0, 52, arg1) | ~(arg1 & 458752) != -1 || class589.method3348(arg0, 119, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 74)
    public final void method388(int arg0) {
        ++field7290;
        if (super.field4544.field10399.method1922(false) && !class320.method1881(super.field4544.field10399.method1924((byte) -128), (byte) 117)) {
            super.field4545 = 0;
        }
        if (arg0 != 6384) {
            method3023(-113, 28, 43);
        }
        if (super.field4545 < 0 || super.field4545 > 2) {
            super.field4545 = this.method393((byte) 100);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILwo;)V", line = 91)
    public class520(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)I", line = 94)
    public final int method393(byte arg0) {
        int var2 = 13 % ((37 - arg0) / 63);
        ++field7289;
        return 0;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)V", line = 105)
    public final void method389(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method389(93, 71);
        }
        ++field7293;
        super.field4545 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)Z", line = 120)
    public static final boolean method3024(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7295;
        if ((class305.field4001[0][arg1][arg2] & 2) != 0) {
            return true;
        } else if ((class305.field4001[arg0][arg1][arg2] & 16) != 0) {
            return false;
        } else if (arg4 != -29920) {
            return true;
        } else {
            return class66.method614(arg2, true, arg0, arg1) == arg3;
        }
    }
}
