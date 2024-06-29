import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 {

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    public static int[] field121 = new int[32768];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field123 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
    public long field118;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lvk;")
    public static class140 field129;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lpb;")
    public class264 field127;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method51(int arg0) {
        field129 = null;
        if (arg0 != 0) {
            method54((class137) null, -16);
        }
        field121 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Leh;I)V")
    public static final void method52(class137 arg0, int arg1) {
        if (arg1 == -1594684786) {
            class278.field4425 = arg0;
            field126++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZII)V")
    public static final void method53(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        boolean var5 = false;
        field122++;
        class286.field4561 = 0L;
        int var6 = class192.method1326((byte) -89);
        if (arg3 == arg4 || var6 == 3) {
            arg2 = true;
        }
        if (arg4 <= 0 == var6 > 0) {
            var5 = true;
        }
        if (class48.field608.startsWith("mac") && arg4 > 0) {
            arg2 = true;
        }
        if (arg2 && arg4 > 0) {
            var5 = true;
        }
        class244.method1696(arg4, var5, arg0, arg1, var6, -125, arg2);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Leh;I)V")
    public static final void method54(class137 arg0, int arg1) {
        class14.field188 = arg0;
        if (arg1 != -22502) {
            field123 = 55;
        }
        field117++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILwb;BI)V")
    public static final void method55(int arg0, class123 arg1, byte arg2, int arg3) {
        field119++;
        if (arg1.field1852 == 0) {
            arg1.field1896 = arg1.field1808;
        } else if (arg1.field1852 == 1) {
            arg1.field1896 = (arg3 - arg1.field1809) / 2 + arg1.field1808;
        } else if (arg1.field1852 == 2) {
            arg1.field1896 = arg3 - arg1.field1809 - arg1.field1808;
        } else if (arg1.field1852 == 3) {
            arg1.field1896 = arg1.field1808 * arg3 >> 14;
        } else if (arg1.field1852 == 4) {
            arg1.field1896 = (arg3 - arg1.field1809) / 2 + (arg1.field1808 * arg3 >> 14);
        } else {
            arg1.field1896 = arg3 - ((arg1.field1808 * arg3 >> 14) + arg1.field1809);
        }
        if (arg1.field1825 == 0) {
            arg1.field1899 = arg1.field1820;
        } else if (arg1.field1825 == 1) {
            arg1.field1899 = (arg0 - arg1.field1879) / 2 + arg1.field1820;
        } else if (arg1.field1825 == 2) {
            arg1.field1899 = arg0 - arg1.field1879 - arg1.field1820;
        } else if (arg1.field1825 == 3) {
            arg1.field1899 = arg1.field1820 * arg0 >> 14;
        } else if (arg1.field1825 == 4) {
            arg1.field1899 = (arg1.field1820 * arg0 >> 14) + (arg0 - arg1.field1879) / 2;
        } else {
            arg1.field1899 = arg0 - arg1.field1879 - (arg1.field1820 * arg0 >> 14);
        }
        if (arg2 > -79 || !class60.field764 || client.method735(arg1).field2703 == 0 && arg1.field1778 != 0) {
            return;
        }
        if (arg1.field1896 < 0) {
            arg1.field1896 = 0;
        } else if (arg3 < (arg1.field1896 + arg1.field1809)) {
            arg1.field1896 = arg3 - arg1.field1809;
        }
        if (arg1.field1899 < 0) {
            arg1.field1899 = 0;
        } else if ((arg1.field1899 + arg1.field1879) > arg0) {
            arg1.field1899 = arg0 - arg1.field1879;
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
    public static final int method56(byte arg0) {
        field120++;
        if (arg0 != 16) {
            field121 = null;
        }
        return class201.field3191;
    }
}
