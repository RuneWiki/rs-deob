import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class136 extends class521 {

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Lft;")
    public static class4 field1659 = new class4();

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "Z")
    public static boolean field1664 = false;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "Lkj;")
    public static class484 field1663 = new class484(5000);

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Ljc;")
    public static class372 field1665 = new class372();

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field1666 = -1;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field1662;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kt", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field1667;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method761(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method449(int arg0, boolean arg1) {
        ++field1655;
        super.field7319.method2429(class2.field7, class564.field8287, arg0 + -184);
        if (arg0 != 256) {
            this.method454((byte) -65, false);
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lbda;)V", line = 14)
    public class136(class428 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z", line = 17)
    public final boolean method452(int arg0) {
        if (arg0 < 49) {
            return true;
        } else {
            ++field1662;
            return true;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BZ)V", line = 31)
    public final void method454(byte arg0, boolean arg1) {
        ++field1661;
        class423 var3 = super.field7319.method2481(arg0 + 31086);
        if (var3 != null && arg1) {
            super.field7319.method2472(true, 1);
            super.field7319.method2459(89, var3);
            super.field7319.method1826((byte) 64, class50.field411);
            super.field7319.method2472(true, 1);
            super.field7319.method2429(class2.field7, class529.field7403, 84);
            super.field7319.method1798(true, false, 2, 6, class99.field1226);
            super.field7319.method2465(class167.field2044, arg0 + -14808, 0);
            class335 var4 = super.field7319.method2479((byte) -70);
            var4.method1872(6, super.field7319.method2470((byte) -89));
            super.field7319.method2431((byte) -102, class288.field3743);
            super.field7319.method2472(true, 0);
            this.field1657 = true;
        } else {
            super.field7319.method2465(class167.field2044, arg0 ^ -14808, 0);
        }
        if (arg0 != 21) {
            field1665 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 62)
    public static final boolean method757(int arg0, String arg1) {
        ++field1660;
        if (arg0 != 0) {
            field1666 = -108;
        }
        return class333.method1865(field1667 != null ? field1667 : (field1667 = method761("cv")), 3, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)I", line = 73)
    public static final int method758(byte arg0, int arg1) {
        ++field1658;
        if (arg0 != 111) {
            method758((byte) -110, -47);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILhv;I)V", line = 87)
    public final void method446(int arg0, class440 arg1, int arg2) {
        ++field1656;
        super.field7319.method2459(110, arg1);
        if (arg2 != 26440) {
            field1663 = null;
        }
        super.field7319.method2437(arg0, -3);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V", line = 107)
    public final void method448(boolean arg0) {
        ++field1654;
        if (!this.field1657) {
            super.field7319.method2465(class289.field3751, -14787, 0);
        } else {
            super.field7319.method2472(true, 1);
            super.field7319.method1826((byte) 64, class476.field6697);
            super.field7319.method2429(class564.field8287, class564.field8287, 64);
            super.field7319.method2435(2, 81, class264.field3445);
            super.field7319.method2465(class289.field3751, -14787, 0);
            super.field7319.method2447(true);
            super.field7319.method2459(73, (class440) null);
            super.field7319.method2472(true, 0);
            this.field1657 = false;
        }
        super.field7319.method2429(class564.field8287, class564.field8287, 27);
        if (arg0) {
            this.method448(true);
        }
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)V", line = 138)
    public static void method759(int arg0) {
        if (arg0 != -1) {
            field1663 = null;
        }
        field1663 = null;
        field1659 = null;
        field1665 = null;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(III)Lbq;", line = 153)
    public static final class241 method760(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4497;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V", line = 165)
    public final void method455(int arg0, int arg1, int arg2) {
        ++field1653;
        if (arg0 != 0) {
            field1659 = null;
        }
    }
}
