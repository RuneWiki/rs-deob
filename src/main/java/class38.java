import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class38 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Le;")
    private static class191 field686 = class54.method368("cyan:", 2047);

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Le;")
    public static class191 field691 = field686;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Le;")
    public static class191 field688 = class54.method368("Suche nach Updates )2 ", 2047);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Le;")
    public static class191 field692 = field686;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Le;")
    public static class191 field693 = class54.method368("blinken3:", 2047);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Le;")
    public static class191 field684 = class54.method368("Untersuchen", 2047);

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Lli;")
    public static class155 field687;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
    public static int[] field685;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
    public static final void method258(int arg0, boolean arg1) {
        field689++;
        byte[][] var2 = class248.field4409;
        byte var3 = 4;
        if (arg0 != 8) {
            method259(-64, -19, (byte[]) null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class228.method1632((byte) 87);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class273.field4832[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class154.field2642.length; var14++) {
                                if (class154.field2642[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class197.method1390(arg1, var2[var14], var6 * 8, var4, var9, (var12 & 0x7) * 8, var5 * 8, (var11 & 0x7) * 8, var10, class82.field1383, (byte) 18);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class64.method426(var6 * 8, 8, 8, -1, var4, var5 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II[B)I")
    public static final int method259(int arg0, int arg1, byte[] arg2) {
        field690++;
        int var3 = -78 % ((19 - arg1) / 50);
        return class168.method1133(-369079672, arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method260(byte arg0) {
        field688 = null;
        field693 = null;
        field692 = null;
        field685 = null;
        field686 = null;
        int var1 = 46 / ((76 - arg0) / 34);
        field691 = null;
        field684 = null;
        field687 = null;
    }
}
