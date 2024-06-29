import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class265 extends class376 {

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lpj;")
    public static class79 field3616 = new class79(64);

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Lkr;")
    public static class445 field3620 = class72.method484((byte) 72);

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3624 = null;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lqj;")
    public static class296 field3618;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I", line = 6)
    public final int method1635(int arg0) {
        field3614++;
        if (arg0 != 573849150) {
            field3617 = -118;
        }
        return this.field3612 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)Z", line = 17)
    public final boolean method1636(byte arg0) {
        if (arg0 != -2) {
            this.method1644(-113);
        }
        field3608++;
        return (this.field3612 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)Z", line = 28)
    public final boolean method1637(byte arg0) {
        if (arg0 <= 91) {
            field3618 = null;
        }
        field3611++;
        return (this.field3612 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)Z", line = 42)
    public final boolean method1638(byte arg0) {
        field3610++;
        int var2 = -48 % ((arg0 - 37) / 36);
        return (this.field3612 & 0x1A377482) >> 28 != 0;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Z", line = 54)
    public final boolean method1639(int arg0) {
        field3621++;
        int var2 = -3 / ((arg0 + 19) / 52);
        return (this.field3612 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 64)
    public static void method1640(boolean arg0) {
        field3616 = null;
        field3620 = null;
        if (!arg0) {
            field3618 = null;
            field3624 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)Z", line = 77)
    public final boolean method1641(int arg0) {
        field3622++;
        int var2 = 89 % ((arg0 + 48) / 32);
        return (this.field3612 & 0x7E475026) >> 30 != 0;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)I", line = 87)
    public final int method1642(byte arg0) {
        field3619++;
        return arg0 == 28 ? class254.method1565((byte) -117, this.field3612) : -59;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(II)V", line = 106)
    public class265(int arg0, int arg1) {
        this.field3612 = arg0;
        this.field3615 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Z", line = 124)
    public final boolean method1643(int arg0, int arg1) {
        field3625++;
        if (arg1 >= -121) {
            field3618 = null;
        }
        return (this.field3612 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)Z", line = 138)
    public final boolean method1644(int arg0) {
        if (arg0 == 1) {
            field3613++;
            return (this.field3612 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)Z", line = 149)
    public static final boolean method1645(boolean arg0) {
        field3609++;
        if (arg0) {
            return class390.field5740 > 0;
        } else {
            return true;
        }
    }
}
