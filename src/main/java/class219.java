import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class219 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "B")
    public byte field3315;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Ltr;")
    public class219 field3329;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "Lwl;")
    public static class452 field3327 = new class452(59, -2);

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Lpf;")
    public static class425 field3336 = new class425(18, 15);

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "Lns;")
    public static class55 field3337 = new class55(3, 15);

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "Lnn;")
    public static class151 field3338 = new class151(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1330(int arg0) {
        field3337 = null;
        if (arg0 == 0) {
            field3336 = null;
            field3338 = null;
            field3327 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public static final void method1331(boolean arg0) {
        field3334++;
        for (int var1 = 0; var1 < class38.field458; var1++) {
            int var2 = class87.field1235[var1];
            class155 var3 = class170.field2626[var2];
            if (var3 != null) {
                class376.method2266(var3, var3.field2137.field4110, 98);
            }
        }
        if (!arg0) {
            field3339 = 118;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Liq;B)V")
    public static final void method1332(class134 arg0, byte arg1) {
        if (arg1 == -53) {
            class422.field6213 = arg0;
            field3326++;
            class173.field2650 = class422.field6213.method812(16, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)V")
    public static final void method1333(boolean arg0, boolean arg1) {
        if (!arg1) {
            method1333(true, true);
        }
        field3318++;
        while (class424.field6232.method712((byte) 29, class44.field547) >= 15) {
            int var2 = class424.field6232.method717(15, false);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class170.field2626[var2] == null) {
                class170.field2626[var2] = new class155();
                class170.field2626[var2].field1929 = var2;
                var3 = true;
            }
            class155 var4 = class170.field2626[var2];
            class87.field1235[class38.field458++] = var2;
            var4.field1977 = class26.field332;
            if (var4.field2137 != null && var4.field2137.method1690(-65)) {
                class422.method2606((byte) -84, var4);
            }
            int var5 = class424.field6232.method717(1, !arg1);
            int var6 = class424.field6232.method717(2, !arg1);
            int var7;
            if (arg0) {
                var7 = class424.field6232.method717(8, false);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class424.field6232.method717(5, false);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = class424.field6232.method717(1, false);
            if (var8 == 1) {
                class28.field358[class324.field4875++] = var2;
            }
            int var9 = (class424.field6232.method717(3, !arg1) + 4 & 0xF3C00007) << 11;
            int var10;
            if (arg0) {
                var10 = class424.field6232.method717(8, !arg1);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = class424.field6232.method717(5, !arg1);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            var4.method956(class228.method1385(class424.field6232.method717(14, false), (byte) 61), 0);
            var4.method906(-27630, var4.field2137.field4110);
            var4.field1959 = var4.field2137.field4158 << 3;
            if (var4.field1959 == 0) {
                var4.method909(0, 16383);
            } else if (var3) {
                var4.method909(var9, 16383);
            }
            var4.method957((byte) -121, var5 == 1, class113.field1500.field2019[0] + var7, class113.field1500.field2018[0] + var10, var4.method911(0), var6);
            if (var4.field2137.method1690(-64)) {
                class113.method685(0, (class169) null, var4.field1902, (class85) null, var4.field2018[0], var4.field2019[0], (byte) 119, var4);
            }
        }
        class424.field6232.method709(-17701);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1334(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3328++;
        int var10 = arg1 + 1;
        class379.method2285(124, class292.field4448[arg1], arg2, arg3, arg5);
        int var9 = arg0 - 1;
        class379.method2285(127, class292.field4448[arg0], arg2, arg3, arg5);
        int var6 = 94 / ((arg4 + 62) / 60);
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class292.field4448[var7];
            var8[arg5] = var8[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)V")
    public static final void method1335(byte arg0, int arg1) {
        field3325++;
        class396.field5926 = arg1;
        if (arg0 != -117) {
            field3327 = null;
        }
        class241 var2 = class186.field2797;
        synchronized (class186.field2797) {
            class186.field2797.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(CBI)I")
    public static final int method1336(char arg0, byte arg1, int arg2) {
        field3330++;
        if (arg1 >= -31) {
            field3338 = null;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIB)V")
    public class219(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3314 = arg2;
        this.field3322 = arg1;
        this.field3335 = arg0;
        this.field3315 = arg4;
        this.field3320 = arg3;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Ltr;I)V")
    public class219(class219 arg0, int arg1) {
        this.field3329 = arg0;
        this.field3335 = this.field3329.field3335;
        this.field3315 = this.field3329.field3315;
        this.field3322 = this.field3329.field3322 + arg1;
        this.field3320 = this.field3329.field3320 + arg1;
        this.field3314 = this.field3329.field3314 + arg1;
    }
}
