import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class100 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lsd;")
    private static class166 field1901 = class135.method935("Please use a different world)3", 0);

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lsd;")
    public static class166 field1905 = field1901;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lsd;")
    public static class166 field1902 = class135.method935("Keine Antwort vom Server)3", 0);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lsd;")
    public static class166 field1907 = class135.method935("Fps:", 0);

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lsd;")
    private static class166 field1900 = class135.method935("K", 0);

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lsd;")
    public static class166 field1906 = field1901;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lsd;")
    public static class166 field1904 = field1900;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lsd;")
    public static class166 field1909 = class135.method935("und haben es deaktiviert)3 Klicken Sie auf der", 0);

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lsd;")
    public static class166 field1910 = field1900;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "B")
    public static byte field1899;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    public static int[] field1908;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[[I")
    public static int[][] field1911;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method745(int arg0) {
        field1903++;
        if (class80.field1642.toLowerCase().indexOf("microsoft") == -1) {
            class147.field2905[47] = 73;
            class147.field2905[61] = 27;
            if (class80.field1628 == null) {
                class147.field2905[222] = 59;
                class147.field2905[192] = 58;
            } else {
                class147.field2905[520] = 59;
                class147.field2905[192] = 28;
                class147.field2905[222] = 58;
            }
            class147.field2905[93] = 43;
            class147.field2905[91] = 42;
            class147.field2905[46] = 72;
            class147.field2905[45] = 26;
            class147.field2905[59] = 57;
            class147.field2905[44] = 71;
            class147.field2905[92] = 74;
        } else {
            class147.field2905[189] = 26;
            class147.field2905[190] = 72;
            class147.field2905[221] = 43;
            class147.field2905[188] = 71;
            class147.field2905[219] = 42;
            class147.field2905[220] = 74;
            class147.field2905[192] = 58;
            class147.field2905[191] = 73;
            class147.field2905[222] = 59;
            class147.field2905[223] = 28;
            class147.field2905[186] = 57;
            class147.field2905[187] = 27;
        }
        if (arg0 != 190) {
            method746(46, -37, -76, -47);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
    public static final void method746(int arg0, int arg1, int arg2, int arg3) {
        field1897++;
        if (class151.field2934 != 0 && arg2 != 0 && class38.field691 < 50) {
            class200.field3974[class38.field691] = arg1;
            class154.field2970[class38.field691] = arg2;
            class46.field833[class38.field691] = arg0;
            class129.field2536[class38.field691] = null;
            class189.field3584[class38.field691] = 0;
            class38.field691++;
        }
        if (arg3 != -51) {
            method748((byte) 15);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method747(byte arg0) {
        if (arg0 > -85) {
            method745(24);
        }
        field1910 = null;
        field1904 = null;
        field1905 = null;
        field1900 = null;
        field1911 = null;
        field1901 = null;
        field1906 = null;
        field1909 = null;
        field1907 = null;
        field1908 = null;
        field1902 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)J")
    public static final synchronized long method748(byte arg0) {
        field1898++;
        if (arg0 != 35) {
            field1904 = null;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class99.field1896) {
            class143.field2771 += class99.field1896 - var1;
        }
        class99.field1896 = var1;
        return class143.field2771 + var1;
    }
}
