import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class155 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lic;")
    public static class59 field3356 = class59.method433(0, "mapscene");

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lic;")
    public static class59 field3360 = class59.method433(0, "(U(Y");

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lic;")
    public static class59 field3361 = class59.method433(0, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[S")
    public static short[] field3363 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Llf;")
    public static class82 field3358 = new class82(260);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lic;")
    private static class59 field3365 = class59.method433(0, "Login server offline)3");

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lic;")
    public static class59 field3368 = class59.method433(0, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
    public static int[] field3366 = new int[256];

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
    public static int[] field3364 = new int[128];

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lic;")
    private static class59 field3369 = class59.method433(0, "Service unavailable)3");

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lic;")
    public static class59 field3373 = field3365;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Lic;")
    private static class59 field3375 = class59.method433(0, "Enter your username (V password)3");

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lic;")
    public static class59 field3371 = field3375;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lic;")
    public static class59 field3372 = field3369;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lic;")
    public static class59 field3374 = class59.method433(0, "cross");

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    public static int[] field3355;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
    public static int[] field3370;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[[I")
    public static int[][] field3367;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        field3355 = null;
        field3372 = null;
        field3373 = null;
        field3375 = null;
        field3361 = null;
        field3363 = null;
        field3370 = null;
        field3365 = null;
        field3364 = null;
        field3360 = null;
        field3369 = null;
        field3356 = null;
        field3374 = null;
        if (arg0 != 78) {
            method1131(113L, false);
        }
        field3368 = null;
        field3367 = null;
        field3371 = null;
        field3366 = null;
        field3358 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public static final void method1130(byte arg0) {
        int var1 = 101 / ((34 - arg0) / 57);
        field3362++;
        for (class118 var2 = (class118) class22.field525.method682(0); var2 != null; var2 = (class118) class22.field525.method684((byte) -65)) {
            if (var2.field2741 > 0) {
                var2.field2741--;
            }
            if (var2.field2741 != 0) {
                if (var2.field2746 > 0) {
                    var2.field2746--;
                }
                if (var2.field2746 == 0 && var2.field2739 >= 1 && var2.field2751 >= 1 && var2.field2739 <= 102 && var2.field2751 <= 102 && (var2.field2753 < 0 || class2.method11(var2.field2753, var2.field2740, (byte) 124))) {
                    class91.method750(var2.field2751, var2.field2738, var2.field2739, var2.field2747, var2.field2752, var2.field2753, var2.field2740, -3);
                    var2.field2746 = -1;
                    if (var2.field2755 == var2.field2753 && var2.field2755 == -1) {
                        var2.method929(104);
                    } else if (var2.field2755 == var2.field2753 && var2.field2743 == var2.field2738 && var2.field2756 == var2.field2740) {
                        var2.method929(104);
                    }
                }
            } else if (var2.field2755 < 0 || class2.method11(var2.field2755, var2.field2756, (byte) 126)) {
                class91.method750(var2.field2751, var2.field2743, var2.field2739, var2.field2747, var2.field2752, var2.field2755, var2.field2756, -4);
                var2.method929(120);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(JZ)V")
    public static final void method1131(long arg0, boolean arg1) {
        field3359++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1) {
            method1129((byte) 107);
        }
        for (int var3 = 0; var3 < class76.field1863; var3++) {
            if (class5.field110[var3] == arg0) {
                class76.field1863--;
                class148.field3212++;
                for (int var4 = var3; var4 < class76.field1863; var4++) {
                    class5.field110[var4] = class5.field110[var4 + 1];
                    class87.field2201[var4] = class87.field2201[var4 + 1];
                }
                class127.field2884 = class94.field2400;
                class125.field2842.method1072(253, -1);
                class125.field2842.method1201(arg0, (byte) 38);
                return;
            }
        }
    }
}
