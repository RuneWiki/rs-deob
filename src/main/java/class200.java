import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class200 extends class304 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lbh;")
    public static class28 field2604 = class160.method1033((byte) -59);

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "C")
    public char field2597;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "J")
    public long field2607;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lca;")
    public class200 field2598;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Z")
    public boolean field2605;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[Ll;")
    public static class16[] field2612;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V", line = 5)
    public static void method1257(int arg0) {
        field2612 = null;
        if (arg0 == 26300) {
            field2604 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z", line = 17)
    public final boolean method1258(int arg0) {
        if (arg0 > -119) {
            method1266(-9, 79);
        }
        field2601++;
        return this.field2605;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -5783) {
            field2604 = null;
        }
        field2599++;
        class153 var5 = class75.method656(8, arg2 + 6038, arg3);
        var5.method1003((byte) 98);
        var5.field1933 = arg4;
        var5.field1930 = arg0;
        var5.field1928 = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZB)V", line = 44)
    public static final void method1260(int arg0, boolean arg1, byte arg2) {
        field2613++;
        class325.field4122 = 3;
        class233.field2976 = arg0;
        int var3 = 62 / ((arg2 + 48) / 60);
        class152.method994((byte) -108, class267.field3387.field355, class267.field3387.field363);
        if (arg1) {
            class147.method978("", 108, "");
        } else {
            class498.method3006((byte) 127);
            class147.method978(class24.field345, 111, class139.field1796);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V", line = 74)
    public static final void method1261(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7138 != null) {
            var3.field7138 = null;
        }
        if (var3.field7137 != null) {
            var3.field7137 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)C", line = 87)
    public final char method1262(boolean arg0) {
        if (!arg0) {
            this.field2597 = (char) 65496;
        }
        field2602++;
        return this.field2597;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)I", line = 100)
    public final int method1263(byte arg0) {
        if (arg0 != -97) {
            this.method1262(true);
        }
        field2603++;
        return this.field2611;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)J", line = 118)
    public final long method1264(boolean arg0) {
        field2600++;
        return arg0 ? this.field2607 : -105L;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)I", line = 129)
    public final int method1265(byte arg0) {
        if (arg0 >= -104) {
            return -123;
        } else {
            field2610++;
            return this.field2609;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V", line = 140)
    public static final void method1266(int arg0, int arg1) {
        field2608++;
        if (class450.method2649(arg1, arg0 ^ 0x5F4E) && arg0 == 3568) {
            class524.method3128(24563, -1, class293.field3725[arg1]);
        }
    }
}
