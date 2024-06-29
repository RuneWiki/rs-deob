import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class208 {

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lha;")
    public static class46 field3732 = class271.method1828("blinken2:", -46);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "J")
    public static long field3729 = 0L;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lha;")
    public static class46 field3736 = class271.method1828("mapflag", -46);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "J")
    public static long field3738;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z")
    public final boolean method1466(int arg0) {
        field3722++;
        if (arg0 != 0) {
            field3738 = 69L;
        }
        return (this.field3733 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
    public final boolean method1467(boolean arg0) {
        if (!arg0) {
            this.method1471(-109);
        }
        field3728++;
        return (this.field3733 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ)V")
    public static final void method1468(byte arg0, boolean arg1) {
        class92.field1719 = new int[104];
        class70.field1210 = new int[104];
        field3725++;
        class236.field4100 = new int[104];
        class98.field1814 = new int[104];
        if (arg0 != -85) {
            method1468((byte) 76, false);
        }
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class234.field4061 = new int[104];
        class162.field2874 = new byte[var2][104][104];
        class170.field3023 = new byte[var2][104][104];
        class46.field807 = new byte[var2][104][104];
        class120.field2249 = new int[var2][105][105];
        class203.field3637 = 99;
        class10.field171 = new byte[var2][105][105];
        class120.field2251 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
    public final boolean method1469(int arg0) {
        field3726++;
        if (arg0 != 4) {
            this.method1467(false);
        }
        return (this.field3733 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method1470(byte arg0) {
        field3736 = null;
        field3732 = null;
        if (arg0 > -33) {
            field3732 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Z")
    public final boolean method1471(int arg0) {
        if (arg0 != 11127) {
            method1470((byte) 76);
        }
        field3724++;
        return (this.field3733 & 0x4) != 0;
    }
}
