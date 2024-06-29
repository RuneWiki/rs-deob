import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class416 extends class207 {

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lgm;")
    public static class134 field6001 = new class134("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field6007 = 0;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Z")
    public static boolean field6008;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)I")
    public final int method2504(int arg0) {
        if (arg0 != 43) {
            return -85;
        } else {
            ++field5998;
            return super.field2669;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILrd;)V")
    public class416(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 <= -7) {
            ++field6004;
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public static final void method2505(int arg0) {
        ++field6006;
        if (~class597.field8132 != -1) {
            try {
                if (~(++class23.field232) < -2001) {
                    if (class710.field9707 != null) {
                        class710.field9707.method138(-126);
                        class710.field9707 = null;
                    }
                    if (~class353.field5128 <= -3) {
                        class537.field7446 = -5;
                        class597.field8132 = 0;
                        return;
                    }
                    class394.field5678.method3734(374);
                    ++class353.field5128;
                    class597.field8132 = 1;
                    class23.field232 = 0;
                }
                if (class597.field8132 == 1) {
                    class501.field7032 = class394.field5678.method3736(class786.field10800, (byte) -10);
                    class597.field8132 = 2;
                }
                if (~class597.field8132 == -3) {
                    if (class501.field7032.field8405 == 2) {
                        throw new IOException();
                    }
                    if (~class501.field7032.field8405 != -2) {
                        return;
                    }
                    class710.field9707 = class608.method3384(-25141, 15000, (Socket) class501.field7032.field8403);
                    class501.field7032 = null;
                    class345.method2186((byte) 127);
                    class597.field8132 = 4;
                }
                if (arg0 == 19250) {
                    if (~class597.field8132 == -5) {
                        if (class710.field9707.method133((byte) 77, 1)) {
                            class710.field9707.method135((byte) -74, 1, class560.field7678.field3789, 0);
                            int var1 = class560.field7678.field3789[0] & 255;
                            class537.field7446 = var1;
                            class597.field8132 = 0;
                            class710.field9707.method138(-100);
                            class710.field9707 = null;
                        }
                    }
                }
            } catch (IOException var2) {
                if (class710.field9707 != null) {
                    class710.field9707.method138(-66);
                    class710.field9707 = null;
                }
                if (class353.field5128 >= 2) {
                    class597.field8132 = 0;
                    class537.field7446 = -4;
                } else {
                    class394.field5678.method3734(374);
                    ++class353.field5128;
                    class597.field8132 = 1;
                    class23.field232 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(IB)Lab;")
    public static final class696 method2506(int arg0, byte arg1) {
        ++field6005;
        if (arg0 >= 0 && ~arg0 > -101) {
            int var2 = -78 / ((arg1 - -41) / 50);
            return class559.field7665[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            field6001 = null;
        }
        ++field5996;
        return 1;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lrd;)V")
    public class416(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method2507(boolean arg0) {
        if (arg0) {
            class443.field6387 = class187.field2445;
            class645.field8694 = class737.field10008;
        } else {
            class443.field6387 = class611.field8264;
            class645.field8694 = class648.field8748;
        }
        class504.field7090 = class443.field6387.length;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I")
    public static final int method2508(int arg0, int arg1) {
        ++field5997;
        int var2 = 35 / ((arg1 - 85) / 37);
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        ++field5999;
        if (super.field2669 != 1 && ~super.field2669 != -1) {
            super.field2669 = this.method36(-105);
        }
        int var2 = 100 / ((-58 - arg0) / 48);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method2509(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        ++field6002;
        if (~(arg4 ? class125.field1721.field5138.method1871(43) : class125.field1721.field5176.method1871(43)) != -1 && ~arg1 != -1 && class10.field118 < 50 && ~arg2 != 0) {
            class642.field8649[class10.field118++] = new class183((byte) (arg4 ? 3 : 2), arg2, arg1, arg5, arg3, 0, arg0, (class214) null);
        }
        if (!arg6) {
            method2507(false);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field6003;
        if (arg1 != 69) {
            field6000 = -88;
        }
        return 1;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public static void method2510(int arg0) {
        if (arg0 != -20690) {
            method2510(-66);
        }
        field6001 = null;
    }
}
