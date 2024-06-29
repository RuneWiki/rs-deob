import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class108 extends class60 {

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "[I")
    public int[] field2017 = new int[5];

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "[Lhe;")
    public class230[] field2021 = new class230[5];

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public int field2014 = 0;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Z")
    public static boolean field2028 = false;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "Lub;")
    public static class227 field2032 = class257.method1749("Schlie-8en", 17263);

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field2011 = 0;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field2038 = -1;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "[Z")
    public static boolean[] field2034 = new boolean[100];

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Lck;")
    public class108 field2015;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "Lac;")
    public class133 field2039;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Lbb;")
    public class1 field2035;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Lff;")
    public class237 field2013;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Leb;")
    public class260 field2019;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "Lij;")
    public class50 field2024;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lli;")
    public class78 field2037;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Z")
    public boolean field2029;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "Z")
    public boolean field2030;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "Z")
    public boolean field2036;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V")
    public class108(int arg0, int arg1, int arg2) {
        this.field2016 = arg1;
        this.field2023 = this.field2018 = arg0;
        this.field2033 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIB)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2020++;
        if (class5.field120 < 100) {
            class177.method1127(82);
        }
        class111.method704(arg2, arg0, arg1 + arg2, arg0 - -arg3);
        if (class5.field120 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg2;
            int var7 = arg3 / 2 + arg0 - (var5 + 18);
            class111.method694(arg2, arg0, arg1, arg3, 0);
            class111.method705(var6 - 152, var7, 304, 34, 9179409);
            class111.method705(var6 - 151, var7 - -1, 302, 32, 0);
            class111.method694(var6 - 150, var7 + 2, class5.field120 * 3, 30, 9179409);
            class111.method694(var6 + (class5.field120 * 3) - 150, var7 + 2, 300 - class5.field120 * 3, 30, 0);
            class260.field4532.method1243(class120.field2194, var6, var5 + var7, 16777215, -1);
            return;
        }
        class197.field3381 = (int) ((double) (arg3 * 2) / class4.field58);
        class182.field3105 = class184.field3136 - ((int) ((double) arg3 / class4.field58));
        class173.field2895 = class242.field4205 - ((int) ((double) arg1 / class4.field58));
        int var8 = class242.field4205 - (int) ((double) arg1 / class4.field58);
        class178.field3000 = (int) ((double) (arg1 * 2) / class4.field58);
        int var9 = (int) ((double) arg3 / class4.field58) + class184.field3136;
        int var10 = -66 % ((arg4 + 31) / 59);
        int var11 = class184.field3136 - ((int) ((double) arg3 / class4.field58));
        int var12 = class242.field4205 + ((int) ((double) arg1 / class4.field58));
        class188.method1200(arg0, (byte) -125, arg2, var9, var8, arg0 + arg3, arg1 + arg2, var12, var11);
        class254.method1732(9, var9, var12, var8, arg2 + arg1, var11, arg0 + arg3, arg0, arg2);
        if (class182.field3107 > 0) {
            class182.field3107--;
        }
        if (!class99.field1731) {
            return;
        }
        int var13 = arg0 + arg3 - 8;
        int var14 = arg1 + arg2 - 5;
        class177.field2977.method1252(class76.method445((byte) -104, new class227[] { class28.field461, class204.method1303(class188.field3203, 1) }), var14, var13, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var18 = var13 - 15;
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var17 = 16776960;
        if (var16 > 65536) {
            var17 = 16711680;
        }
        class177.field2977.method1252(class76.method445((byte) -79, new class227[] { class144.field2484, class204.method1303(var16, 1), class31.field502 }), var14, var18, var17, -1);
        var13 = var18 - 15;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method670(int arg0) {
        field2034 = null;
        field2032 = null;
        if (arg0 != 20) {
            method670(115);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(JB)V")
    public static final void method671(long arg0, byte arg1) {
        field2026++;
        if (arg1 <= 100 || arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class166.field2781; var3++) {
            if (class28.field460[var3] == arg0) {
                class166.field2781--;
                class49.field857++;
                for (int var4 = var3; var4 < class166.field2781; var4++) {
                    class201.field3442[var4] = class201.field3442[var4 + 1];
                    class151.field2637[var4] = class151.field2637[var4 + 1];
                    class21.field363[var4] = class21.field363[var4 + 1];
                    class28.field460[var4] = class28.field460[var4 + 1];
                    class175.field2915[var4] = class175.field2915[var4 + 1];
                    class71.field1248[var4] = class71.field1248[var4 + 1];
                }
                class152.field2645 = class77.field1356;
                class176.field2935.method664((byte) 120, 0);
                class176.field2935.method1457(arg0, 102);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V")
    public static final void method672(int arg0, byte arg1) {
        field2025++;
        if (arg0 == -1 || !class30.field489[arg0]) {
            return;
        }
        class87.field1505.method882(arg0, (byte) -40);
        if (class102.field1792[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class102.field1792[arg0].length; var3++) {
            if (class102.field1792[arg0][var3] != null) {
                if (class102.field1792[arg0][var3].field1829 == 2) {
                    var2 = false;
                } else {
                    class102.field1792[arg0][var3] = null;
                }
            }
        }
        if (arg1 != 116) {
            method670(-56);
        }
        if (var2) {
            class102.field1792[arg0] = null;
        }
        class30.field489[arg0] = false;
    }
}
