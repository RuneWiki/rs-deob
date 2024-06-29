import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class112 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Z")
    public static boolean field1626 = false;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[J")
    public static long[] field1625 = new long[32];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1624;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIIII)V", line = 6)
    public static final void method849(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class296.field4448 = arg5;
        field1627++;
        class130.field1878 = arg2;
        class288.field4364 = arg3;
        class197.field2860 = arg4;
        class76.field1116 = arg0;
        if (arg1 != 109) {
            field1624 = (String) null;
        }
        if (class288.field4364 >= 100) {
            int var6 = class296.field4448 * 128 + 64;
            int var7 = class197.field2860 * 128 + 64;
            int var8 = class71.method584(class321.field4835, var7, arg1 ^ 0x38, var6) - class130.field1878;
            int var9 = var6 - class166.field2385;
            int var10 = var8 - class129.field1871;
            int var11 = var7 - class137.field1991;
            int var12 = (int) Math.sqrt((double) (var11 * var11 + (var9 * var9)));
            class362.field5746 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class335.field5216 = (int) (Math.atan2((double) var11, (double) var9) * -325.949D) & 0x7FF;
            if (class362.field5746 < 128) {
                class362.field5746 = 128;
            }
            if (class362.field5746 > 383) {
                class362.field5746 = 383;
            }
        }
        class86.field1208 = 2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 52)
    public static final void method850(int arg0) {
        class275.field4162 = class35.method261(4, 0.4F, 35, 8, true, 8, -124, 2048);
        field1631++;
        if (arg0 <= 31) {
            method852(7, -119, 29, true, -45);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 64)
    public static void method851(byte arg0) {
        field1624 = null;
        if (arg0 > -118) {
            method851((byte) -16);
        }
        field1625 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZI)V", line = 78)
    public static final void method852(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1628++;
        if (!arg3) {
            return;
        }
        class107.field1533.field2776 = 0;
        class107.field1533.method1355((byte) -112, 20);
        class107.field1533.method1355((byte) -112, arg0);
        class107.field1533.method1355((byte) -108, arg1);
        class107.field1533.method1361(arg4, (byte) 127);
        class107.field1533.method1361(arg2, (byte) 124);
        class121.field1710 = -3;
        class108.field1566 = 0;
        class54.field795 = 0;
        class9.field156 = 1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILno;II)V", line = 98)
    public static final void method853(int arg0, class181 arg1, int arg2, int arg3) {
        if (arg0 != 2047) {
            return;
        }
        if (arg1.field5190 == arg2 && arg2 != -1) {
            class248 var4 = class119.method893(arg2, (byte) -41);
            int var5 = var4.field3691;
            if (var5 == 1) {
                arg1.field5132 = 0;
                arg1.field5194 = 0;
                arg1.field5097 = 0;
                arg1.field5146 = 1;
                arg1.field5177 = arg3;
                class361.method2512(-29521, arg1.field5137, false, arg1.field5132, var4, arg1.field5165);
            }
            if (var5 == 2) {
                arg1.field5097 = 0;
            }
        } else if (arg2 == -1 || arg1.field5190 == -1 || class119.method893(arg2, (byte) -41).field3666 >= class119.method893(arg1.field5190, (byte) -41).field3666) {
            arg1.field5132 = 0;
            arg1.field5146 = 1;
            arg1.field5177 = arg3;
            arg1.field5122 = arg1.field5113;
            arg1.field5190 = arg2;
            arg1.field5194 = 0;
            arg1.field5097 = 0;
            if (arg1.field5190 != -1) {
                class361.method2512(arg0 - 31568, arg1.field5137, false, arg1.field5132, class119.method893(arg1.field5190, (byte) -41), arg1.field5165);
            }
        }
        field1632++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)I", line = 163)
    public static final int method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if (arg3 != -1) {
            return -16;
        }
        field1633++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 - arg6 - (arg5 + -1);
        } else {
            return (7 - arg1) + 1 - arg2;
        }
    }
}
