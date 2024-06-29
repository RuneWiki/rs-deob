import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class202 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lgn;")
    public static class475 field2804 = new class475(14, 4);

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lwt;")
    public static class194 field2806 = new class194("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Liu;")
    public static class390 field2807 = new class390(105, -1);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lgn;")
    public static class475 field2809 = new class475(78, 11);

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Liu;")
    public static class390 field2810 = new class390(12, 6);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILso;IBB)V", line = 5)
    public static final void method1244(int arg0, class313 arg1, int arg2, byte arg3, byte arg4) {
        field2795++;
        int var5 = arg1.field4279[0];
        int var6 = arg1.field4282[0];
        if (arg4 <= 51 || var5 < 0 || class362.field5442 <= var5 || var6 < 0 || class203.field2813 <= var6 || arg0 < 0 || class362.field5442 <= arg0 || arg2 < 0 || class203.field2813 <= arg2) {
            return;
        }
        int var7 = class491.method2951(arg1.method1773(-66), class169.field2234[arg1.field2956], 0, -4, 0, var6, var5, 0, 0, arg2, class506.field7721, -1, class238.field3329, arg0, true);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method1879(class506.field7721[var8], class238.field3329[var8], 43, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Ldb;", line = 46)
    public final class202 method1245(int arg0, int arg1) {
        int var3 = -112 % ((arg1 - 8) / 62);
        field2803++;
        return new class202(this.field2796, arg0, this.field2801, this.field2799);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 57)
    public static final void method1246(byte arg0) {
        if (class22.field294 != null) {
            class22.field294.method2123(arg0 ^ 0xFFFFFFEF);
            class22.field294 = null;
        }
        field2800++;
        class110.method656(false);
        class445.method2601();
        for (int var1 = 0; var1 < 4; var1++) {
            class169.field2234[var1].method139(true);
        }
        class265.method1630(false, -90);
        System.gc();
        class371.method2257(2, arg0 ^ 0xFFFFFFC4);
        class153.field1966 = -1;
        class286.field4089 = false;
        class424.method2534(true, -1);
        class455.field6637 = 0;
        class454.field6612 = 0;
        class134.field1714 = 0;
        class223.field3158 = 0;
        class247.field3542 = 0;
        for (int var2 = 0; var2 < class254.field3662.length; var2++) {
            class254.field3662[var2] = null;
        }
        class239.method1472((byte) -33);
        for (int var3 = 0; var3 < 2048; var3++) {
            class262.field3742[var3] = null;
        }
        class339.field4942 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class504.field7697[var4] = null;
        }
        class473.field6838.method2315((byte) -109);
        if (arg0 != -102) {
            return;
        }
        class193.method1216((byte) 126);
        class176.field2435 = 0;
        class453.field6591.method106(50);
        class270.method1648(-1);
        class484.method2823(10);
        class168.method1061(true, -31085);
        try {
            class123.method697((byte) 115, "loggedout", class86.field1182.field668);
        } catch (Throwable var5) {
        }
        class98.field1327 = null;
        class308.field4491 = 0L;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 132)
    public static final void method1247(int arg0) {
        class247.field3542 = 0;
        field2797++;
        int var1 = class234.field3288.method980(-19443);
        int var2 = class234.field3288.method985(-36);
        int var3 = class234.field3288.method963(-128);
        boolean var4 = class234.field3288.method996(8) == 1;
        class245.method1531(var1, arg0 ^ 0xFFFFE90A);
        int var5 = (class359.field5330 - class234.field3288.field2018) / 16;
        class55.field855 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class55.field855[var6][var10] = class234.field3288.method950(186);
            }
        }
        class76.field1081 = new int[var5];
        class51.field761 = new byte[var5][];
        if (arg0 != 5818) {
            field2806 = null;
        }
        class105.field1410 = new int[var5];
        class288.field4105 = null;
        class369.field5535 = new byte[var5][];
        class191.field2708 = new byte[var5][];
        class238.field3337 = null;
        class285.field4068 = new byte[var5][];
        class454.field6602 = new int[var5];
        class270.field3775 = new int[var5];
        class195.field2748 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class362.field5442 >> 4)) / 8; var8 <= ((class362.field5442 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var3 - (class203.field2813 >> 4)) / 8; var9 <= (((class203.field2813 >> 4) + var3) / 8); var9++) {
                class76.field1081[var7] = (var8 << 8) + var9;
                class270.field3775[var7] = class67.field1004.method1444("m" + var8 + "_" + var9, (byte) 107);
                class195.field2748[var7] = class67.field1004.method1444("l" + var8 + "_" + var9, (byte) 110);
                class105.field1410[var7] = class67.field1004.method1444("um" + var8 + "_" + var9, (byte) 49);
                class454.field6602[var7] = class67.field1004.method1444("ul" + var8 + "_" + var9, (byte) 96);
                var7++;
            }
        }
        class478.method2791(var4, false, var3, 128, var2);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIII)V", line = 206)
    public class202(int arg0, int arg1, int arg2, int arg3) {
        this.field2801 = arg2;
        this.field2799 = arg3;
        this.field2798 = arg1;
        this.field2796 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 222)
    public static void method1248(byte arg0) {
        int var1 = -27 % ((-arg0 - 49) / 56);
        field2809 = null;
        field2807 = null;
        field2810 = null;
        field2806 = null;
        field2804 = null;
    }
}
