import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class242 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[I")
    public static int[] field3886 = new int[25];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[I")
    public static int[] field3887 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    public static int[] field3885 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3883 = new String[100];

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Ljj;")
    public static class134 field3881;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1591(byte arg0, byte[] arg1) {
        field3882++;
        if (arg0 != -52) {
            field3883 = null;
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class56.method432(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)I")
    public static final int method1592(int arg0, byte arg1, int arg2) {
        field3890++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 != 70) {
            return 71;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILeb;)V")
    public static final void method1593(int arg0, int arg1, int arg2, class103 arg3) {
        if (arg3.field1660 == 0) {
            arg3.field1679 = arg3.field1640;
        } else if (arg3.field1660 == 1) {
            arg3.field1679 = (arg0 - arg3.field1691) / 2 + arg3.field1640;
        } else if (arg3.field1660 == 2) {
            arg3.field1679 = arg0 - arg3.field1691 - arg3.field1640;
        } else if (arg3.field1660 == 3) {
            arg3.field1679 = arg3.field1640 * arg0 >> 14;
        } else if (arg3.field1660 == 4) {
            arg3.field1679 = (arg3.field1640 * arg0 >> 14) + (arg0 - arg3.field1691) / 2;
        } else {
            arg3.field1679 = arg0 - arg3.field1691 - (arg3.field1640 * arg0 >> 14);
        }
        if (arg3.field1720 == 0) {
            arg3.field1707 = arg3.field1681;
        } else if (arg3.field1720 == 1) {
            arg3.field1707 = (arg1 - arg3.field1693) / 2 + arg3.field1681;
        } else if (arg3.field1720 == 2) {
            arg3.field1707 = arg1 - (arg3.field1693 + arg3.field1681);
        } else if (arg3.field1720 == 3) {
            arg3.field1707 = arg3.field1681 * arg1 >> 14;
        } else if (arg3.field1720 == 4) {
            arg3.field1707 = (arg3.field1681 * arg1 >> 14) + (arg1 - arg3.field1693) / 2;
        } else {
            arg3.field1707 = arg1 - (arg3.field1681 * arg1 >> 14) - arg3.field1693;
        }
        field3889++;
        if (class178.field2891 && (client.method1511(arg3).field350 != 0 || arg3.field1655 == 0)) {
            if (arg3.field1707 < 0) {
                arg3.field1707 = 0;
            } else if ((arg3.field1707 + arg3.field1693) > arg1) {
                arg3.field1707 = arg1 - arg3.field1693;
            }
            if (arg3.field1679 < 0) {
                arg3.field1679 = 0;
            } else if (arg0 < arg3.field1691 + arg3.field1679) {
                arg3.field1679 = arg0 - arg3.field1691;
            }
        }
        if (arg2 != 14988) {
            method1595(103, true, -108, -74, -113);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;C)I")
    public static final int method1594(int arg0, String arg1, char arg2) {
        field3888++;
        if (arg0 <= 23) {
            method1592(-44, (byte) -74, 15);
        }
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZIII)V")
    public static final void method1595(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3884++;
        if (class280.method1870(100, arg3)) {
            int var5 = -94 % ((-arg2 - 6) / 36);
            class151.method1023((byte) 120, arg1, -1, class133.field2204[arg3], arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1596(byte arg0) {
        field3887 = null;
        if (arg0 != -49) {
            field3885 = null;
        }
        field3886 = null;
        field3885 = null;
        field3883 = null;
        field3881 = null;
    }
}
