import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lhb;")
    public static class44 field1986 = class102.method810("oder ung-Ultiges Passwort)3", -28606);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1984 = 1;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lhb;")
    private static class44 field1994 = class102.method810("wave2:", -28606);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lhb;")
    public static class44 field1985 = field1994;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
    public static int[] field1996 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lqd;")
    public static class100 field1983;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 8)
    public static void method651(int arg0) {
        field1983 = null;
        field1994 = null;
        field1985 = null;
        field1986 = null;
        field1996 = null;
        if (arg0 <= 76) {
            field1993 = 114;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lhc;", line = 28)
    public static final class45 method652(int arg0) {
        field1989++;
        class45 var1 = new class45();
        var1.field1132 = class31.field768;
        var1.field1133 = class77.field1935;
        var1.field1130 = class63.field1602[0];
        var1.field1129 = class84.field2133[0];
        var1.field1128 = class41.field941[0];
        var1.field1127 = class63.field1607[0];
        byte[] var2 = class84.field2147[0];
        int var3 = var1.field1128 * var1.field1127;
        var1.field1131 = new int[var3];
        int var4 = 0;
        if (arg0 != 2) {
            field1990 = 108;
        }
        while (var3 > var4) {
            var1.field1131[var4] = class117.field2861[class118.method914(255, var2[var4])];
            var4++;
        }
        class113.method865(false);
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)I", line = 89)
    public static final int method653(int arg0, int arg1, int arg2, int arg3) {
        field1991++;
        if ((class104.field2668[arg2][arg1][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 == 27466) {
            return arg2 <= 0 || (class104.field2668[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IJ)V", line = 129)
    public static final void method654(int arg0, long arg1) {
        field1987++;
        if (arg1 == 0L) {
            return;
        }
        if (class43.field983 >= 100) {
            class49.method460(class75.field1895, class51.field1274, (byte) 125, 0);
            return;
        }
        class44 var3 = class43.method361(arg1, true).method395(21611);
        for (int var4 = 0; var4 < class43.field983; var4++) {
            if (class51.field1235[var4] == arg1) {
                class49.method460(class117.method903(new class44[] { var3, class42.field976 }, false), class51.field1274, (byte) 117, 0);
                return;
            }
        }
        if (arg0 > -89) {
            return;
        }
        for (int var5 = 0; var5 < class49.field1208; var5++) {
            if (class62.field1587[var5] == arg1) {
                class49.method460(class117.method903(new class44[] { class94.field2401, var3, class33.field785 }, false), class51.field1274, (byte) 123, 0);
                return;
            }
        }
        if (var3.method382((byte) -85, class72.field1820.field2651)) {
            return;
        }
        class98.field2506++;
        class51.field1235[class43.field983++] = arg1;
        class88.field2251 = true;
        class92.field2333.method702(true, 145);
        class92.field2333.method1018(arg1, -5952);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lja;BI)V", line = 210)
    public static final void method655(class55 arg0, byte arg1, int arg2) {
        field1992++;
        if (arg0.field1384 < 128 || arg0.field1371 < 128 || arg0.field1384 >= 13184 || arg0.field1371 >= 13184) {
            arg0.field1374 = 0;
            arg0.field1409 = 0;
            arg0.field1415 = -1;
            arg0.field1353 = -1;
            arg0.field1384 = arg0.field1355[0] * 128 + arg0.field1422 * 64;
            arg0.field1371 = arg0.field1350[0] * 128 + arg0.field1422 * 64;
            arg0.method505(arg1 - 71);
        }
        if (arg1 != 41) {
            field1985 = null;
        }
        if (class72.field1820 == arg0 && (arg0.field1384 < 1536 || arg0.field1371 < 1536 || arg0.field1384 >= 11776 || arg0.field1371 >= 11776)) {
            arg0.field1409 = 0;
            arg0.field1353 = -1;
            arg0.field1374 = 0;
            arg0.field1415 = -1;
            arg0.field1384 = arg0.field1355[0] * 128 + arg0.field1422 * 64;
            arg0.field1371 = arg0.field1350[0] * 128 + arg0.field1422 * 64;
            arg0.method505(100);
        }
        if (arg0.field1409 > class2.field73) {
            class2.method18(arg0, 32);
        } else if (arg0.field1374 < class2.field73) {
            class81.method673(arg0, (byte) 84);
        } else {
            class53.method502(arg0, true);
        }
        class18.method121(true, arg0);
        class121.method934(arg0, 64030);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 264)
    public static final void method656(int arg0) {
        field1997++;
        if (arg0 != 0) {
            field1983 = null;
        }
        if (class28.field662 != null) {
            class28.field662.method328(256);
        }
    }
}
