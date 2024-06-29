import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class255 extends class49 {

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Lvr;")
    public static class306 field3530 = new class306();

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Lcm;")
    public static class449 field3536 = new class449(23, -1);

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "Lns;")
    public static class438 field3538;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method1659(int arg0, int arg1) {
        if (arg0 > -35) {
            method1660(-61);
        }
        field3535++;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V", line = 16)
    public static final void method1660(int arg0) {
        field3524++;
        if (class215.field2993 == 0) {
            return;
        }
        try {
            int var1 = -128 / ((arg0 + 10) / 56);
            if (++class332.field5129 > 1500) {
                if (class81.field1092 != null) {
                    class81.field1092.method2994(-1);
                    class81.field1092 = null;
                }
                if (class383.field5833 >= 1) {
                    class215.field2993 = 0;
                    class376.field5748 = -5;
                    return;
                }
                class383.field5833++;
                if (class422.field6294 == class354.field5497) {
                    class354.field5497 = class356.field5518;
                } else {
                    class354.field5497 = class422.field6294;
                }
                class332.field5129 = 0;
                class215.field2993 = 1;
            }
            if (class215.field2993 == 1) {
                class170.field2472 = class419.field6254.method2814(class354.field5497, class14.field239, 0);
                class215.field2993 = 2;
            }
            if (class215.field2993 == 2) {
                if (class170.field2472.field1791 == 2) {
                    throw new IOException();
                }
                if (class170.field2472.field1791 != 1) {
                    return;
                }
                class81.field1092 = new class501((Socket) class170.field2472.field1793, class419.field6254);
                class170.field2472 = null;
                class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                class273.method1740(true);
                int var2 = class81.field1092.method3000((byte) 92);
                class273.method1740(true);
                if (var2 != 101) {
                    class215.field2993 = 0;
                    class376.field5748 = var2;
                    class81.field1092.method2994(-1);
                    class81.field1092 = null;
                    return;
                }
                class215.field2993 = 3;
            }
            if (class215.field2993 == 3 && class81.field1092.method2995((byte) 28) >= 2) {
                int var3 = class81.field1092.method3000((byte) 79) << 8 | class81.field1092.method3000((byte) 110);
                class331.method2138(7000, var3);
                if (class12.field195 == -1) {
                    class376.field5748 = 6;
                    class215.field2993 = 0;
                    class81.field1092.method2994(-1);
                    class81.field1092 = null;
                } else {
                    class215.field2993 = 0;
                    class81.field1092.method2994(-1);
                    class81.field1092 = null;
                    class487.method2901(42);
                }
            }
        } catch (IOException var4) {
            if (class81.field1092 != null) {
                class81.field1092.method2994(-1);
                class81.field1092 = null;
            }
            if (class383.field5833 < 1) {
                class332.field5129 = 0;
                if (class422.field6294 == class354.field5497) {
                    class354.field5497 = class356.field5518;
                } else {
                    class354.field5497 = class422.field6294;
                }
                class383.field5833++;
                class215.field2993 = 1;
            } else {
                class215.field2993 = 0;
                class376.field5748 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Z", line = 153)
    public final boolean method49(int arg0) {
        if (arg0 == 7) {
            field3522++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)V", line = 165)
    public static void method1661(byte arg0) {
        field3536 = null;
        field3530 = null;
        if (arg0 == -26) {
            field3538 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 178)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3527++;
        if (arg1 != 118) {
            method1660(-127);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V", line = 199)
    public final void method57(int arg0) {
        field3523++;
        if (arg0 != -5077) {
            this.field3525 = 28;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIII)V", line = 212)
    public class255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3532 = arg1;
        this.field3534 = arg0;
        this.field3537 = arg3;
        this.field3533 = arg2;
        this.field3525 = arg5;
        this.field3531 = arg4;
        this.field3526 = arg6;
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)I")
    public abstract int method509(int arg0);
}
