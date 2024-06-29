import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class129 extends class79 {

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field1973 = -1;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public int field1969 = 0;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Lck;")
    public static class119 field1977 = class298.method1987((byte) 47, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lck;")
    private static class119 field1980 = class298.method1987((byte) 59, "white:");

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "Lck;")
    public static class119 field1972 = field1980;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "[Lwi;")
    public static class23[] field1976 = new class23[256];

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[I")
    public static int[] field1985 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Z")
    public static boolean field1979 = true;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lck;")
    public static class119 field1970 = class298.method1987((byte) 27, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lck;")
    public static class119 field1986 = field1980;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIB)I", line = 14)
    public static final int method857(byte[] arg0, int arg1, byte arg2) {
        int var3 = 106 / ((-arg2 - 82) / 32);
        field1978++;
        return class88.method595(40, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILba;)V", line = 28)
    public static final void method858(int arg0, class292 arg1) {
        class32 var2 = (class32) class272.field4469.method1329((byte) 90, arg1.field4861.method786((byte) 112));
        field1974++;
        if (var2 != null) {
            if (var2.field448 != null) {
                class230.field3721.method1421(var2.field448);
                var2.field448 = null;
            }
            var2.method552((byte) 0);
        }
        int var3 = -9 / ((arg0 + 16) / 38);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)V", line = 58)
    public static final void method859(int arg0, long arg1) {
        field1990++;
        if (arg1 == 0L) {
            return;
        }
        if (class151.field2399 >= 100) {
            class54.method401((byte) -105, class182.field2891, 0, class203.field3220);
            return;
        }
        class119 var3 = class147.method963((byte) 0, arg1).method785(96);
        for (int var4 = 0; var4 < class151.field2399; var4++) {
            if (class96.field1476[var4] == arg1) {
                class54.method401((byte) -125, class170.method1074(new class119[] { var3, class296.field4917 }, -100), 0, class203.field3220);
                return;
            }
        }
        for (int var5 = 0; var5 < class97.field1482; var5++) {
            if (class203.field3217[var5] == arg1) {
                class54.method401((byte) -128, class170.method1074(new class119[] { class244.field3964, var3, class78.field1207 }, -112), 0, class203.field3220);
                return;
            }
        }
        if (var3.method784(class124.field1917.field4861, 90)) {
            class54.method401((byte) -101, class109.field1671, 0, class203.field3220);
            return;
        }
        if (arg0 != 1) {
            field1980 = (class119) null;
        }
        class96.field1476[class151.field2399] = arg1;
        class203.field3214[class151.field2399++] = class147.method963((byte) 0, arg1);
        class217.field3507++;
        class261.field4196 = class94.field1456;
        class6.field149.method966(0, 74);
        class6.field149.method29(2069, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 145)
    public static void method860(int arg0) {
        field1980 = null;
        field1972 = null;
        field1970 = null;
        field1976 = null;
        field1985 = null;
        field1977 = null;
        int var1 = 96 % ((-arg0 - 30) / 39);
        field1986 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V", line = 175)
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class208.field3328 * 128) {
            arg0 = class208.field3328 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class103.field1569 * 128) {
            arg2 = class103.field1569 * 128 - 1;
        }
        class191.field3006 = class284.field4698[arg3];
        class36.field519 = class284.field4699[arg3];
        class297.field4988 = class284.field4698[arg4];
        class54.field862 = class284.field4699[arg4];
        class89.field1373 = arg0;
        class220.field3527 = arg1;
        class208.field3314 = arg2;
        class257.field4121 = arg0 / 128;
        class208.field3327 = arg2 / 128;
        class269.field4433 = arg5;
        class10.field186 = class257.field4121 - class153.field2442;
        if (class10.field186 < 0) {
            class10.field186 = 0;
        }
        class99.field1511 = class208.field3327 - class153.field2442;
        if (class99.field1511 < 0) {
            class99.field1511 = 0;
        }
        class75.field1167 = class257.field4121 + class153.field2442;
        if (class75.field1167 > class208.field3328) {
            class75.field1167 = class208.field3328;
        }
        class114.field1724 = class208.field3327 + class153.field2442;
        if (class114.field1724 > class103.field1569) {
            class114.field1724 = class103.field1569;
        }
        short var16 = 3584;
        for (int var17 = 0; var17 < class153.field2442 + class153.field2442 + 2; var17++) {
            for (int var18 = 0; var18 < class153.field2442 + class153.field2442 + 2; var18++) {
                int var19 = (var17 - class153.field2442 << 7) - (class89.field1373 & 0x7F);
                int var20 = (var18 - class153.field2442 << 7) - (class208.field3314 & 0x7F);
                int var21 = class257.field4121 + var17 - class153.field2442;
                int var22 = class208.field3327 + var18 - class153.field2442;
                if (var21 >= 0 && var22 >= 0 && var21 < class208.field3328 && var22 < class103.field1569) {
                    int var23;
                    if (class259.field4144 == null) {
                        var23 = class128.field1966[0][var21][var22] + 128 - class220.field3527;
                    } else {
                        var23 = class259.field4144[0][var21][var22] + 128 - class220.field3527;
                    }
                    int var24 = class128.field1966[3][var21][var22] - class220.field3527 - 1000;
                    class58.field936[var17][var18] = class293.method1949(var19, var24, var23, var20, var16);
                } else {
                    class58.field936[var17][var18] = false;
                }
            }
        }
        for (int var25 = 0; var25 < class153.field2442 + class153.field2442 + 1; var25++) {
            for (int var26 = 0; var26 < class153.field2442 + class153.field2442 + 1; var26++) {
                class168.field2648[var25][var26] = class58.field936[var25][var26] || class58.field936[var25 + 1][var26] || class58.field936[var25][var26 + 1] || class58.field936[var25 + 1][var26 + 1];
            }
        }
        class260.field4170 = arg7;
        class150.field2386 = arg8;
        class212.field3400 = arg9;
        class262.field4247 = arg10;
        class220.field3531 = arg11;
        class23.method176();
        if (class262.field4258 != null) {
            class155.method988(true);
            class119.method770(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg14, arg15);
            class203.field3213 = false;
            class103.method677(0, 30359, 0);
            class178.method1142((float[]) null);
            class125.method830();
            class155.method988(false);
        }
        class119.method770(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }
}
