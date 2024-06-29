import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class211 {

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3824 = 3;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[J")
    public static long[] field3825 = new long[100];

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[[I")
    public static int[][] field3821 = new int[104][104];

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "J")
    public static long field3818 = 0L;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "J")
    public long field3817;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lta;")
    public class165 field3828;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
    public static boolean field3816;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)I")
    public static final int method1507(int arg0, byte arg1, int arg2) {
        field3823++;
        if (arg1 < 24) {
            method1509(true, -33, (class123) null, -96);
        }
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        field3821 = null;
        field3825 = null;
        int var1 = 16 % ((-arg0 - 8) / 54);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILpa;I)[Lvf;")
    public static final class71[] method1509(boolean arg0, int arg1, class123 arg2, int arg3) {
        field3819++;
        if (arg0) {
            return null;
        } else if (class85.method677(arg1, arg2, 20888, arg3)) {
            return class164.method1235((byte) -113);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lhh;I)Z")
    public static final boolean method1510(class163 arg0, int arg1) {
        field3815++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != 23269) {
            field3824 = 28;
        }
        for (int var2 = 0; var2 < class155.field2889; var2++) {
            if (arg0.method1228(class46.field769[var2], -24)) {
                return true;
            }
        }
        return arg0.method1228(class235.field4203.field2424, -45);
    }
}
