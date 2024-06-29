import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class92 extends class641 implements class532 {

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "Lag;")
    public class641 field1389;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "[I")
    public static int[] field1388 = new int[16];

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!qda", name = "y", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!qda", name = "L", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!qda", name = "M", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 4)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (!arg5) {
            field1396 = -104;
        }
        field1392++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IBIII)V", line = 14)
    public static final void method727(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class172.field2661; var5++) {
            Rectangle var6 = class443.field6070[var5];
            if (arg3 < (var6.x + var6.width) && (arg0 + arg3) > var6.x && (var6.y + var6.height) > arg2 && var6.y < (arg2 + arg4)) {
                class209.field2994[var5] = true;
            }
        }
        if (arg1 >= -47) {
            field1388 = null;
        }
        field1393++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Loa;B)V", line = 38)
    public final void method148(class651 arg0, byte arg1) {
        field1387++;
        if (arg1 != 70) {
            field1388 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V", line = 48)
    public final void method144(boolean arg0) {
        field1405++;
        if (arg0) {
            this.method138(null, 13);
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(Z)I", line = 59)
    public final int method152(boolean arg0) {
        if (!arg0) {
            field1388 = null;
        }
        field1394++;
        return 0;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)I", line = 70)
    public final int method151(byte arg0) {
        if (arg0 != 78) {
            field1396 = 73;
        }
        field1399++;
        return 0;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Z", line = 82)
    public final boolean method150(byte arg0) {
        field1390++;
        if (arg0 > -34) {
            field1401 = 79;
        }
        return false;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BLoa;)Lpe;", line = 93)
    public final class571 method145(byte arg0, class651 arg1) {
        field1403++;
        if (arg0 != 124) {
            field1401 = 111;
        }
        return null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)Z", line = 114)
    public final boolean method139(int arg0) {
        if (arg0 == 2) {
            field1397++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Loa;BI)Lba;", line = 129)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        field1395++;
        if (arg1 != -47) {
            this.method138(null, 34);
        }
        return null;
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V", line = 144)
    public final void method142(byte arg0) {
        field1398++;
        if (arg0 != -77) {
            this.method150((byte) -25);
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(Z)I", line = 155)
    public final int method146(boolean arg0) {
        field1402++;
        if (arg0) {
            method728(false);
        }
        return 0;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIIILag;)V", line = 167)
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class641 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class256.method1571(1, arg1, arg0));
        this.field1389 = arg10;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Loa;Z)V", line = 175)
    public final void method147(class651 arg0, boolean arg1) {
        if (!arg1) {
            this.method148(null, (byte) -5);
        }
        field1400++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILoa;)Ldd;", line = 185)
    public final class660 method143(int arg0, class651 arg1) {
        field1391++;
        return arg0 == 31358 ? this.field1389.method143(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BILoa;I)Z", line = 196)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = -128 % ((arg0 + 26) / 38);
        field1407++;
        return false;
    }

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "(Z)V", line = 206)
    public static void method728(boolean arg0) {
        field1388 = null;
        if (!arg0) {
            field1401 = -114;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Loa;I)V", line = 216)
    public final void method138(class651 arg0, int arg1) {
        field1404++;
        if (arg1 != 2215) {
            field1396 = 102;
        }
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(Z)I", line = 230)
    public final int method729(boolean arg0) {
        if (arg0) {
            this.field1389 = null;
        }
        field1406++;
        return 0;
    }
}
