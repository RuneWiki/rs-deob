import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class123 {

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Loa;")
    public static class98 field981 = class38.method349(255, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Loa;")
    public static class98 field984 = class38.method349(255, "overlay_multiway");

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Loa;")
    public static class98 field989 = class38.method349(255, "redstone2");

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Loa;")
    private static class98 field991 = class38.method349(255, "Username: ");

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field990 = 0;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Loa;")
    public static class98 field994 = field991;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Loa;")
    private static class98 field987 = class38.method349(255, "The server is being updated)3");

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "Loa;")
    public static class98 field993 = field987;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "[I")
    public int[] field974;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "[I")
    public int[] field986;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "[I")
    public int[] field995;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[Lnc;")
    public class93[] field975;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[Lnc;")
    public class93[] field983;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "[[[B")
    public byte[][][] field979;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)I")
    public static final int method360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 8) {
            field981 = null;
        }
        field988++;
        int var5 = 65536 - class66.field1417[arg0 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method361(int arg0) {
        if (arg0 != 0) {
            field984 = null;
        }
        class32.field779.method734(-224779128);
        field982++;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
    public static void method362(byte arg0) {
        field991 = null;
        field987 = null;
        field981 = null;
        int var1 = 73 / ((arg0 + 85) / 36);
        field984 = null;
        field994 = null;
        field989 = null;
        field993 = null;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static final void method363(int arg0) {
        field977++;
        if (arg0 != -29616) {
            method361(-76);
        }
        class98 var1 = null;
        for (int var2 = 0; var2 < class80.field1780; var2++) {
            if (class32.field781[var2].method788((byte) -65, class1.field11) != -1) {
                var1 = class32.field781[var2].method781(0, class32.field781[var2].method788((byte) -65, class1.field11));
                break;
            }
        }
        if (var1 == null) {
            class67.method550(-122);
            return;
        }
        int var3 = class26.field623;
        int var4 = class137.field3357;
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class17.field339;
        if (var5 > 190) {
            var5 = 190;
        }
        int var6 = class71.field1463;
        int var7 = 6116423;
        class7.method41(var4, var3, var5, var6, var7);
        class7.method41(var4 + 1, var3 + 1, var5 - 2, 16, 0);
        class7.method49(var4 + 1, var3 + 18, var5 - 2, var6 - 19, 0);
        class71.field1480.method386(var1, var4 + 3, var3 + 14, var7, false);
        int var8 = field990;
        int var9 = class123.field2749;
        if (class49.field1099 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class49.field1099 == 1) {
            var9 -= 205;
            var8 -= 553;
        }
        if (class49.field1099 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < class80.field1780; var10++) {
            int var11 = (class80.field1780 - var10 - 1) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var8 > var4 && var8 < var4 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                var12 = 16776960;
            }
            class98 var13 = class32.field781[var10];
            if (var13.method787(var1, (byte) 80)) {
                var13 = var13.method815(var13.method790(arg0 ^ 0xFFFF8C30) - var1.method790(118), arg0 + 29511, 0);
                if (var13.method787(class64.field1376, (byte) -110)) {
                    var13 = var13.method815(var13.method790(83) - class64.field1376.method790(arg0 + 29704), -97, 0);
                }
            }
            class71.field1480.method386(var13, var4 + 3, var11, var12, true);
        }
    }
}
