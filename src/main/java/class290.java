import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class290 extends class325 {

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "[B")
    public byte[] field4473;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field4468 = 0;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "[S")
    public static short[] field4467 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "[S")
    public static short[] field4469 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "[I")
    public static int[] field4464;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method2003(byte arg0, int arg1) {
        field4466++;
        if (arg0 >= -105) {
            field4464 = (int[]) null;
        }
        if (arg1 > 0) {
            return 1;
        } else if (arg1 >= 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V", line = 24)
    public static final void method2004(int arg0, int arg1) {
        class230.field3500.method741(arg1, (byte) 126);
        field4465++;
        if (arg0 != 6798) {
            method2003((byte) 54, 20);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILjd;B)Lrj;", line = 44)
    public static final class269 method2005(int arg0, int arg1, class95 arg2, byte arg3) {
        field4471++;
        if (arg3 == 11) {
            return class31.method233(arg1, 0, arg0, arg2) ? class158.method1188(0) : null;
        } else {
            return (class269) null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V", line = 68)
    public static void method2006(byte arg0) {
        field4469 = null;
        field4464 = null;
        field4467 = null;
        if (arg0 != 67) {
            method2003((byte) 26, -4);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([B)V", line = 81)
    public class290(byte[] arg0) {
        this.field4473 = arg0;
    }
}
