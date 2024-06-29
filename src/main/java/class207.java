import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class207 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3564 = -1;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3568 = -2;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Loh;")
    public static class258 field3569 = class153.method1046("Fallen lassen", 105);

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Loh;")
    private static class258 field3573 = class153.method1046("Please wait)3)3)3", 112);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Loh;")
    public static class258 field3565 = field3573;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "J")
    public static long field3572;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILok;Lqj;Lhm;I)V", line = 15)
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, class107 arg4, class231 arg5, class101 arg6, int arg7) {
        field3570++;
        class124 var8 = new class124();
        var8.field2215 = arg2 * 128;
        var8.field2214 = arg0 * arg7;
        var8.field2211 = arg1;
        if (arg6 != null) {
            var8.field2209 = arg6.field1850;
            var8.field2199 = arg6.field1834;
            var8.field2203 = arg6.field1795;
            var8.field2189 = arg6.field1813 * 128;
            var8.field2205 = arg6;
            int var9 = arg6.field1839;
            var8.field2196 = arg6.field1796;
            int var10 = arg6.field1790;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg6.field1790;
                var10 = arg6.field1839;
            }
            var8.field2201 = (arg0 + var9) * 128;
            var8.field2204 = (arg2 + var10) * 128;
            if (arg6.field1797 != null) {
                var8.field2187 = true;
                var8.method902((byte) -116);
            }
            if (var8.field2199 != null) {
                var8.field2194 = (int) ((double) (var8.field2209 - var8.field2203) * Math.random()) + var8.field2203;
            }
            class140.field2387.method82(var8, (byte) -39);
        } else if (arg4 != null) {
            var8.field2212 = arg4;
            class151 var11 = arg4.field1906;
            if (var11.field2545 != null) {
                var8.field2187 = true;
                var11 = var11.method1035(arg7 - 7069);
            }
            if (var11 != null) {
                var8.field2201 = (var11.field2548 + arg0) * 128;
                var8.field2204 = (var11.field2548 + arg2) * 128;
                var8.field2196 = class245.method1675(arg4, 122);
                var8.field2189 = var11.field2544 * 128;
            }
            class281.field4821.method82(var8, (byte) -39);
        } else if (arg5 != null) {
            var8.field2208 = arg5;
            var8.field2204 = (arg5.method447(18123) + arg2) * 128;
            var8.field2201 = (arg5.method447(18123) + arg0) * 128;
            var8.field2196 = class169.method1116(arg5, 0);
            var8.field2189 = arg5.field3979 * 128;
            class205.field3542.method984((byte) 41, var8, arg5.field4007.method1769(arg7 - 112));
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 103)
    public static void method1367(boolean arg0) {
        if (!arg0) {
            field3573 = null;
            field3569 = null;
            field3565 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lgb;B)V", line = 120)
    public static final void method1368(class213 arg0, byte arg1) {
        if (arg1 != 98) {
            method1370(false, (byte) -43);
        }
        field3567++;
        class110.field1935 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIBII)V", line = 132)
    public static final void method1369(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3571++;
        int var6 = class203.method1347(class241.field4189, arg4, 1, class94.field1654);
        int var7 = class203.method1347(class241.field4189, arg1, 1, class94.field1654);
        int var8 = class203.method1347(class75.field1314, arg5, 1, class206.field3562);
        int var9 = class203.method1347(class75.field1314, arg0, 1, class206.field3562);
        for (int var10 = var6; var10 <= var7; var10++) {
            class19.method126(7, arg2, class154.field2638[var10], var8, var9);
        }
        if (arg3 <= 11) {
            field3572 = 16L;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V", line = 172)
    public static final void method1370(boolean arg0, byte arg1) {
        field3566++;
        byte var2;
        byte[][] var3;
        if (class257.field4390 && arg0) {
            var2 = 1;
            var3 = class132.field2302;
        } else {
            var3 = class191.field3383;
            var2 = 4;
        }
        if (arg1 != -64) {
            method1366(77, 120, 102, 100, (class107) null, (class231) null, (class101) null, 127);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class172.method1164(27);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class148.field2511[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = (var7 & 0x3518CC6) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = (var7 & 0xFFC2BA) >> 14;
                            int var12 = var7 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class231.field3990.length; var14++) {
                                if (class231.field3990[var14] == var13 && var3[var14] != null) {
                                    class250.method1695(-3610, (var11 & 0x7) * 8, class243.field4216, var4, var9, var6 * 8, var5 * 8, var3[var14], (var12 & 0x7) * 8, var10, arg0);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class242.method1649(var5 * 8, true, var4, var6 * 8, 8, 8);
                    }
                }
            }
        }
    }
}
