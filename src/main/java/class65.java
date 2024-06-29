import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class65 {

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Lbe;")
    public static class283 field894 = class153.method941(127, " loggt sich ein)3");

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    public static boolean field906 = false;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[[Z")
    public static boolean[][] field900 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Lbe;")
    public static class283 field908 = class153.method941(-122, "(U0a )2 via: ");

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Lbe;")
    public static class283 field909 = class153.method941(125, "Schlie-8en");

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lek;")
    public static class172 field897;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Lbe;")
    public class283 field899;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Z")
    public boolean field910;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[Lhe;")
    public static class87[] field895;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "[[[I")
    public static int[][][] field890;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method413(int arg0, int arg1) {
        int var2 = 84 / ((65 - arg1) / 56);
        field891++;
        return ((arg0 & 0x1795B1C7) >> 28) != 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 18)
    public static void method414(int arg0) {
        field900 = (boolean[][]) null;
        field894 = null;
        field895 = null;
        field908 = null;
        if (arg0 == -3584) {
            field909 = null;
            field890 = (int[][][]) null;
            field897 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILbe;)I", line = 35)
    public static final int method415(int arg0, class283 arg1) {
        field896++;
        return arg0 >= -3 ? 36 : arg1.method1925((byte) -44) + 1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBILek;)[Lhe;", line = 67)
    public static final class87[] method416(int arg0, byte arg1, int arg2, class172 arg3) {
        field907++;
        if (arg1 < 4) {
            method418(110, 56);
        }
        return class26.method183(true, arg3, arg2, arg0) ? class255.method1727(0) : null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)I", line = 91)
    public static final int method417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field904++;
        if (class216.field3662) {
            class216.field3662 = false;
            arg4 = 1000000;
        }
        class149 var5 = class197.field3370[arg2][arg3];
        int var6 = var5.field2435;
        float var7 = var5.field2438;
        float var8 = var5.field2442;
        int var9 = var5.field2426;
        int var10 = var5.field2437;
        float var11 = ((float) arg1 * 0.1F + 0.7F) * var5.field2440;
        if (!class47.field650) {
            var10 = 0;
        }
        if (class273.field4585 != var6 || class109.field1852 != var11 || class286.field4877 != var7 || class305.field5214 != var8 || class257.field4339 != var9 || class71.field1236 != var10) {
            class166.field2767 = class214.field3638;
            class71.field1236 = var10;
            class34.field512 = class180.field3115;
            class257.field4339 = var9;
            class273.field4585 = var6;
            class27.field428 = class287.field4886;
            class129.field2151 = 0;
            class169.field2850 = class226.field3806;
            class246.field4185 = class277.field4621;
            class228.field3833 = class200.field3427;
            class286.field4877 = var7;
            class305.field5214 = var8;
            class109.field1852 = var11;
        }
        if (class129.field2151 < 65536) {
            class129.field2151 += arg4 * 250;
            if (class129.field2151 >= 65536) {
                class129.field2151 = 65536;
            }
            int var12 = 65536 - class129.field2151 >> 8;
            float var13 = (float) class129.field2151 / 65536.0F;
            float var14 = (float) (65536 - class129.field2151) / 65536.0F;
            int var15 = class129.field2151 >> 8;
            class200.field3427 = class305.field5214 * var13 + class228.field3833 * var14;
            class277.field4621 = class71.field1236 * var15 + class246.field4185 * var12 >> 8;
            class287.field4886 = ((class27.field428 & 0xFF00) * var12 + (class257.field4339 & 0xFF00) * var15 & 0xFF0000) + ((class27.field428 & 0xFF00FF) * var12 + (class257.field4339 & 0xFF00FF) * var15 & 0xFF00FF00) >> 8;
            class226.field3806 = ((class273.field4585 & 0xFF00FF) * var15 + (class169.field2850 & 0xFF00FF) * var12 & 0xFF00FF00) + ((class169.field2850 & 0xFF00) * var12 + ((class273.field4585 & 0xFF00) * var15) & 0xFF0000) >> 8;
            class214.field3638 = class166.field2767 * var14 + class109.field1852 * var13;
            class180.field3115 = class34.field512 * var14 + class286.field4877 * var13;
        }
        class59.method389(class226.field3806, class214.field3638, class180.field3115, class200.field3427);
        class59.method382(class287.field4886, class277.field4621);
        class59.method386((float) class72.field1264, (float) class86.field1444, (float) class284.field4855);
        class59.method387();
        if (arg0 != 16711680) {
            method417(-111, 115, -103, -78, -50);
        }
        return class287.field4886;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lkg;", line = 179)
    public static final class69 method418(int arg0, int arg1) {
        field902++;
        if (arg0 != -8429) {
            return (class69) null;
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class122.field2036[var3] == null || class122.field2036[var3][var2] == null) {
            boolean var4 = class92.method588(var3, arg0 + 8342);
            if (!var4) {
                return null;
            }
        }
        return class122.field2036[var3][var2];
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lui;Ljava/lang/Object;I)V", line = 209)
    public static final void method419(class251 arg0, Object arg1, int arg2) {
        field892++;
        if (arg0.field4254 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field4254.peekEvent() != null; var3++) {
            class2.method11((byte) -20, 1L);
        }
        if (arg2 != 1) {
            method415(77, (class283) null);
        }
        if (arg1 != null) {
            arg0.field4254.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
