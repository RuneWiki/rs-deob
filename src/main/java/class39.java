import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class39 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public int field907 = -1;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lja;")
    public static class62 field900 = class30.method243(43, "blinken1:");

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lja;")
    private static class62 field901 = class30.method243(43, "Examine");

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lja;")
    public static class62 field906 = field901;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lc;")
    public static class18 field898 = new class18(100);

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lja;")
    private static class62 field911 = class30.method243(43, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lja;")
    public static class62 field915 = class30.method243(43, "Die Verbindung konnte");

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lja;")
    private static class62 field913 = class30.method243(43, "Please remove ");

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field917 = 1;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lja;")
    public static class62 field916 = field913;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lja;")
    public static class62 field910 = field911;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lja;")
    public static class62 field909 = field913;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    public static int[] field918 = new int[200];

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lja;")
    private static class62 field920 = class30.method243(43, "You have only just left another world)3");

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lja;")
    public static class62 field914 = field920;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lq;")
    public static class114 field919;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lge;")
    public class47 field902;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    public int[] field905;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[Lta;")
    public static class132[] field912;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[Lja;")
    public class62[] field904;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
    public static final void method293(int arg0, byte arg1) {
        if (arg1 != 82) {
            field914 = null;
        }
        field899++;
        class93 var2 = (class93) class59.field1438.method537(-1, (long) arg0);
        if (var2 != null) {
            var2.method1176((byte) 56);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method294(byte arg0) {
        class134.field3088 = 0;
        field903++;
        class34.field814 = 0;
        if (arg0 != -126) {
            method294((byte) 54);
        }
        class111.method900(true);
        class57.method395(256);
        class32.method252(-23400);
        class51.method355(0);
        for (int var1 = 0; var1 < class134.field3088; var1++) {
            int var3 = class42.field989[var1];
            if (class86.field2060 != class52.field1200[var3].field180) {
                class52.field1200[var3] = null;
            }
        }
        if (class115.field2651 != class38.field879.field2873) {
            throw new RuntimeException("gpp1 pos:" + class38.field879.field2873 + " psize:" + class115.field2651);
        }
        for (int var2 = 0; var2 < class147.field3460; var2++) {
            if (class52.field1200[class141.field3311[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class147.field3460);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static void method295(byte arg0) {
        field913 = null;
        field901 = null;
        field912 = null;
        field909 = null;
        field911 = null;
        field920 = null;
        int var1 = 51 / ((arg0 + 3) / 58);
        field900 = null;
        field918 = null;
        field906 = null;
        field914 = null;
        field916 = null;
        field915 = null;
        field910 = null;
        field919 = null;
        field898 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZLpd;Lmf;Lpd;)V")
    public static final void method296(boolean arg0, boolean arg1, class108 arg2, class89 arg3, class108 arg4) {
        class96.field2242 = arg4;
        class51.field1171 = arg2;
        class27.field665 = arg1;
        class51.field1171.method864(0, 10);
        if (!arg0) {
            method296(true, false, null, null, null);
        }
        class12.field296 = arg3;
        field908++;
    }
}
