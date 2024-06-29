import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class108 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lob;")
    public static class141 field2073 = class175.method1195(40, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Lvc;")
    public static class212 field2087 = new class212(64);

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Lob;")
    public static class141 field2088 = class175.method1195(40, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
    public static int[] field2089 = new int[100];

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lob;")
    private static class141 field2094 = class175.method1195(40, " from your friend list first)3");

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Lob;")
    public static class141 field2091 = field2094;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lkc;")
    public static class102 field2079;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Lpe;")
    public static class154 field2093;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lca;")
    public static class22 field2083;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method714(int arg0) {
        field2083 = null;
        field2089 = null;
        field2088 = null;
        field2087 = null;
        field2091 = null;
        field2093 = null;
        if (arg0 != 3073) {
            field2073 = null;
        }
        field2073 = null;
        field2079 = null;
        field2094 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIILaa;IJZ)Z")
    public static final boolean method715(int arg0, int arg1, int arg2, int arg3, int arg4, class2 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class95.method642(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V")
    public static final void method716(int arg0, long arg1) {
        field2084++;
        try {
            if (arg0 == -18314) {
                Thread.sleep(arg1);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lob;[SZ)V")
    public static final void method717(class141[] arg0, short[] arg1, boolean arg2) {
        if (!arg2) {
            field2092 = -9;
        }
        field2086++;
        class16.method102(0, arg0, arg0.length - 1, arg1, -129);
    }
}
