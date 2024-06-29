import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class8 extends class253 {

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Z")
    public static boolean field76;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V")
    public final void method40(int arg0, byte arg1, int arg2) {
        int var4 = this.field80 * arg2 >> 12;
        ++field70;
        int var5 = this.field74 * arg2 >> 12;
        int var6 = this.field71 * arg0 >> 12;
        int var7 = this.field79 * arg0 >> 12;
        class285.method2011(super.field4010, (byte) -23, var5, var7, super.field4005, var4, var6, super.field4014);
        if (arg1 != -14) {
            field75 = -104;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class53.field711 <= arg3 && arg1 <= class87.field1356 && class63.field941 <= arg5 && class75.field1180 >= arg2) {
            if (arg6 == 1) {
                class257.method1794(arg2, arg3, arg0, arg1, -1, arg5);
            } else {
                class284.method2003(arg6, arg5, arg4 + -1112826396, arg1, arg3, arg2, arg0);
            }
        } else if (~arg6 == -2) {
            class209.method1487(arg2, arg1, arg3, 70, arg0, arg5);
        } else {
            class224.method1563(arg3, arg0, arg5, arg6, arg1, 16383, arg2);
        }
        if (arg4 == -16021) {
            ++field73;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIII)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field71 = arg3;
        this.field74 = arg2;
        this.field80 = arg0;
        this.field79 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBLfa;)[Lh;")
    public static final class294[] method42(int arg0, int arg1, byte arg2, class273 arg3) {
        ++field78;
        if (!class163.method1081(0, arg3, arg0, arg1)) {
            return null;
        } else {
            if (arg2 < 8) {
                method45(-44, 70);
            }
            return class231.method1624(true);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLde;I)V")
    public static final void method43(boolean arg0, class116 arg1, int arg2) {
        if (arg0) {
            int var3 = class79.field1254;
            int var4 = var3 * 956 / 503;
            class151.field2347.method241((class169.field2644 - var4) / 2, 0, var4, var3);
            class147.field2312.method20(class169.field2644 / 2 + -(class147.field2312.field1681 / 2), 18);
        }
        arg1.method730(~class121.field1857 == -2 ? class52.field699 : class218.field3488, class169.field2644 / 2, class79.field1254 / 2 - 26, 16777215, -1);
        ++field72;
        int var5 = class79.field1254 / 2 - 18;
        class62.method389(class169.field2644 / 2 + -152, var5, 304, 34, 9179409);
        class62.method389(class169.field2644 / 2 + -151, var5 + 1, 302, 32, 0);
        class62.method380(class169.field2644 / 2 - 150, var5 + 2, class204.field3288 * 3, 30, 9179409);
        class62.method380(class204.field3288 * 3 + class169.field2644 / 2 + -150, var5 + 2, -(class204.field3288 * 3) + 300, 30, 0);
        if (arg2 <= 79) {
            method46((byte) -59);
        }
        arg1.method730(class248.field3941, class169.field2644 / 2, class79.field1254 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZI)V")
    public final void method44(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            int var4 = this.field80 * arg2 >> 12;
            ++field84;
            int var5 = this.field79 * arg0 >> 12;
            int var6 = this.field71 * arg0 >> 12;
            int var7 = this.field74 * arg2 >> 12;
            class123.method810((byte) -48, var6, var5, var7, super.field4010, var4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
    public static final int method45(int arg0, int arg1) {
        int var2 = arg0 >> 6 & 3;
        ++field82;
        if (arg1 != -15361) {
            field76 = false;
        }
        int var3 = arg0 & 63;
        if (var3 == 18) {
            if (~var2 == -1) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (~var2 == -3) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (~var2 == -2) {
                return 32;
            }
            if (~var2 == -3) {
                return 64;
            }
            if (~var2 == -4) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static final void method46(byte arg0) {
        ++field77;
        class235.field3728.method145(-105);
        if (arg0 != 116) {
            field76 = true;
        }
        class120.field1843.method145(arg0 + -218);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        if (arg1 > -47) {
            field76 = true;
        }
        ++field81;
    }
}
