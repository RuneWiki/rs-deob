import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class151 {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lsg;")
    public static class169 field2910 = class165.method1060("Verbindung abgebrochen)3", 1536);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lsg;")
    private static class169 field2912 = class165.method1060("slide:", 1536);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lsg;")
    public static class169 field2908 = field2912;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lsg;")
    public static class169 field2916 = field2912;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lua;")
    public static class181 field2915 = new class181(5);

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lsg;")
    public static class169 field2917 = class165.method1060("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 1536);

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lsg;")
    private static class169 field2918 = class165.method1060("Examine", 1536);

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lsg;")
    public static class169 field2920 = field2918;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2907;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
    public static int[] field2919;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[Lbg;")
    public static class18[] field2909;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Loa;I[B)V")
    public final void method996(class127 arg0, int arg1, byte[] arg2) {
        if (arg1 != -32110) {
            method998((byte) 73);
        }
        field2914++;
        if (arg0.field2325[arg0.field2346] != 31 || arg0.field2325[arg0.field2346 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2907 == null) {
            this.field2907 = new Inflater(true);
        }
        try {
            this.field2907.setInput(arg0.field2325, arg0.field2346 + 10, -arg0.field2346 - (8 - arg0.field2325.length + 10));
            this.field2907.inflate(arg2);
        } catch (Exception var4) {
            this.field2907.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2907.reset();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method997(byte arg0) {
        field2920 = null;
        field2909 = null;
        field2908 = null;
        field2917 = null;
        field2919 = null;
        field2915 = null;
        if (arg0 >= -47) {
            field2919 = null;
        }
        field2912 = null;
        field2918 = null;
        field2916 = null;
        field2910 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class151() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public static final void method998(byte arg0) {
        if (arg0 != -22) {
            field2917 = null;
        }
        field2911++;
        if (class109.field1993.toLowerCase().indexOf("microsoft") != -1) {
            class37.field736[192] = 58;
            class37.field736[191] = 73;
            class37.field736[219] = 42;
            class37.field736[187] = 27;
            class37.field736[221] = 43;
            class37.field736[222] = 59;
            class37.field736[188] = 71;
            class37.field736[190] = 72;
            class37.field736[220] = 74;
            class37.field736[186] = 57;
            class37.field736[223] = 28;
            class37.field736[189] = 26;
            return;
        }
        class37.field736[93] = 43;
        class37.field736[59] = 57;
        class37.field736[91] = 42;
        if (class109.field1994 == null) {
            class37.field736[192] = 58;
            class37.field736[222] = 59;
        } else {
            class37.field736[192] = 28;
            class37.field736[520] = 59;
            class37.field736[222] = 58;
        }
        class37.field736[44] = 71;
        class37.field736[46] = 72;
        class37.field736[92] = 74;
        class37.field736[47] = 73;
        class37.field736[45] = 26;
        class37.field736[61] = 27;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(III)V")
    private class151(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method999(int arg0) {
        field2913++;
        if (class2.field37 != null) {
            class2.field37.method359((byte) 92);
            class2.field37 = null;
        }
        class140.method935((byte) -107);
        int var1 = -62 / ((arg0 - 45) / 63);
        class196.field3840.method907();
        for (int var2 = 0; var2 < 4; var2++) {
            client.field575[var2].method1265(73);
        }
        System.gc();
        class98.method584(-1, 2);
        class114.field2086 = -1;
        class8.field216 = false;
        class27.method187(-125);
        class140.method933((byte) -90, 10);
    }
}
