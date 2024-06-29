import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class120 {

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[Lkb;")
    private class53[] field2135;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2128 = -2;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2126 = 3;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lp;")
    public static class280 field2132 = class18.method140((byte) -123, "::mm");

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2134 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lp;")
    public static class280 field2127 = class18.method140((byte) -124, "Connexion perdue)3");

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[Z")
    public static boolean[] field2130 = new boolean[100];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "S")
    public static short field2136 = 205;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lka;")
    public static class253 field2129 = new class253(64);

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lsb;")
    public static class221 field2137 = new class221(100);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lp;")
    private static class280 field2140 = class18.method140((byte) -119, "Loaded sprites");

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[S")
    public static short[] field2139 = new short[256];

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lp;")
    public static class280 field2138 = field2140;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method853(int arg0, int arg1, int arg2, int arg3) {
        if (class89.method637(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class269.method1804(var4 + 1, class145.field2529[arg0][arg1][arg2] + arg3, var5 + 1) && class269.method1804(var4 + 128 - 1, class145.field2529[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class269.method1804(var4 + 128 - 1, class145.field2529[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class269.method1804(var4 + 1, class145.field2529[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method854(int arg0) {
        if (arg0 == -25399) {
            field2131++;
            class81.field1322.method1481(false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field2130 = null;
        field2132 = null;
        field2139 = null;
        field2140 = null;
        if (arg0 != -125) {
            method855((byte) 95);
        }
        field2138 = null;
        field2137 = null;
        field2127 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
    public static final void method856(byte arg0, int arg1) {
        if (arg0 < 33) {
            method856((byte) 15, -74);
        }
        field2133++;
        class157 var2 = class257.method1740(arg1, (byte) 120, 5);
        var2.method1121(24223);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field2135 = new class53[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class53 var3 = this.field2135[var2] = new class53();
            var3.field864 = var3;
            var3.field873 = var3;
        }
    }
}
