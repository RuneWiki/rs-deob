import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class478 extends class345 {

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field6509 = 503;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
    public static final int method2752(int arg0) {
        if (arg0 != 503) {
            return -50;
        } else {
            ++field6513;
            return class7.method39(false, 27);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6512;
        if (arg0 < 66) {
            field6509 = 33;
        }
        if (class667.field9373 <= arg1 && arg1 <= class225.field2994 && arg8 >= class667.field9373 && ~arg8 >= ~class225.field2994 && ~arg2 <= ~class667.field9373 && ~arg2 >= ~class225.field2994 && arg5 >= class667.field9373 && ~arg5 >= ~class225.field2994 && arg3 >= class546.field7619 && ~class760.field10606 <= ~arg3 && ~class546.field7619 >= ~arg9 && arg9 <= class760.field10606 && ~arg4 <= ~class546.field7619 && arg4 <= class760.field10606 && class546.field7619 <= arg7 && ~class760.field10606 <= ~arg7) {
            class614.method3440((byte) -106, arg4, arg6, arg1, arg3, arg5, arg7, arg2, arg8, arg9);
        } else {
            class5.method28(arg6, arg7, (byte) -63, arg9, arg1, arg3, arg5, arg8, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lbi;)V")
    public class478(class483 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
    public static final void method2754(int arg0) {
        ++field6510;
        if (~class540.field7482 != 0) {
            int var1 = class680.field9495.method1118((byte) 122);
            int var2 = class680.field9495.method1115(4);
            class614 var3 = (class614) class235.field3065.method3672(-1);
            if (var3 != null) {
                var1 = var3.method1428(1212);
                var2 = var3.method1425((byte) -93);
            }
            int var4 = 0;
            int var5 = 0;
            if (class676.field9448) {
                var4 = class209.method1347(0);
                var5 = class453.method2540(-100);
            }
            if (arg0 <= 118) {
                field6509 = -40;
            }
            class346.method1979(var5, var2, var2 + var5, class540.field7482, var5 - -class466.field6263, var4 - -class356.field4586, (byte) 46, var4, var1 + var4, var4, var5, var1);
            if (class190.field2623 != null) {
                class662.method3731(var2 + var5, (byte) 102, var1 - -var4);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)V")
    public final void method34(boolean arg0, byte arg1) {
        if (arg1 != -82) {
            field6509 = 41;
        }
        super.field4357.method2781(true, -925);
        ++field6517;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field6508;
        super.field4357.method2781(false, -925);
        int var2 = 64 % ((arg0 - 60) / 60);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)Z")
    public final boolean method38(int arg0) {
        if (arg0 != 50560) {
            field6509 = 0;
        }
        ++field6516;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
    public final void method40(boolean arg0, int arg1) {
        ++field6515;
        if (arg1 != 50560) {
            this.method37(true, 92, -64);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILcj;)V")
    public final void method36(int arg0, int arg1, class695 arg2) {
        ++field6511;
        super.field4357.method2850(110, arg2);
        super.field4357.method2800(arg1, 124);
        if (arg0 != 50560) {
            field6509 = -21;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII)V")
    public final void method37(boolean arg0, int arg1, int arg2) {
        ++field6514;
        if (!arg0) {
            this.method36(37, 115, (class695) null);
        }
    }
}
