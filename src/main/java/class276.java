import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class276 {

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "J")
    public long field4542;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Ljp;")
    public class276 field4530;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "Ljp;")
    public class276 field4535;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
    public static int[] field4540;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)Z")
    public final boolean method1818(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field4538++;
            return this.field4530 != null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)I")
    public static final int method1819(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4531++;
        if (~var4 == arg3) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Z")
    public static final boolean method1820(int arg0, int arg1) {
        field4533++;
        if (arg1 > -108) {
            method1819(74, 25, 110, -94);
        }
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public final void method1821(byte arg0) {
        field4532++;
        if (this.field4530 == null) {
            return;
        }
        int var2 = -101 / ((-arg0 - 31) / 43);
        this.field4530.field4535 = this.field4535;
        this.field4535.field4530 = this.field4530;
        this.field4530 = null;
        this.field4535 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB[BI)I")
    public static final int method1822(int arg0, byte arg1, byte[] arg2, int arg3) {
        field4539++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class281.field4599[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = -7 / ((-arg1 - 63) / 33);
        return ~var4;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZZ)V")
    public static final void method1823(int arg0, boolean arg1, boolean arg2) {
        field4536++;
        if (arg1) {
            class388.field5968--;
            if (class388.field5968 == 0) {
                class164.field2603 = null;
            }
        }
        if (arg2) {
            class165.field2616--;
            if (class165.field2616 == 0) {
                class226.field3894 = null;
            }
        }
        if (arg0 != -1) {
            method1823(-31, false, false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method1824(int arg0) {
        if (arg0 != -8) {
            method1820(-39, -127);
        }
        field4540 = null;
    }

    static {
        new class403("", 76);
        field4541 = -1;
    }
}
