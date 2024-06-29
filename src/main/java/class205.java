import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class205 extends class195 {

    @OriginalMember(owner = "client!m", name = "V", descriptor = "[I")
    public static int[] field3244 = new int[32];

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "Lck;")
    private static class119 field3255 = class298.method1987((byte) 37, "Jan");

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "Lck;")
    private static class119 field3251 = class298.method1987((byte) 68, "Feb");

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "Lck;")
    private static class119 field3259 = class298.method1987((byte) 90, "Oct");

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Lck;")
    private static class119 field3260 = class298.method1987((byte) 75, "Dec");

    @OriginalMember(owner = "client!m", name = "X", descriptor = "Lck;")
    private static class119 field3246 = class298.method1987((byte) 110, "May");

    @OriginalMember(owner = "client!m", name = "db", descriptor = "Lck;")
    private static class119 field3252 = class298.method1987((byte) 81, "Aug");

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "Lck;")
    private static class119 field3262 = class298.method1987((byte) 6, "Jun");

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "Lck;")
    private static class119 field3261 = class298.method1987((byte) 7, "Sep");

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "Lck;")
    private static class119 field3250 = class298.method1987((byte) 7, "Mar");

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Lck;")
    private static class119 field3247 = class298.method1987((byte) 49, "Apr");

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "Lck;")
    private static class119 field3266 = class298.method1987((byte) 96, "Nov");

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "Lck;")
    private static class119 field3253 = class298.method1987((byte) 46, "Prepared sound engine");

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "Lck;")
    private static class119 field3257 = class298.method1987((byte) 109, "Jul");

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "Lck;")
    public static class119 field3265 = field3253;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "[Lck;")
    public static class119[] field3243 = new class119[] { field3255, field3251, field3250, field3247, field3246, field3262, field3257, field3252, field3261, field3259, field3266, field3260 };

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)[I", line = 18)
    public final int[] method11(int arg0, boolean arg1) {
        field3248++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (arg1) {
            return (int[]) null;
        }
        if (this.field3106.field2260) {
            int var4 = class215.field3424[arg0];
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                var3[var5] = this.method1294(1376312589, class157.field2505[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 68)
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILfj;)Lwb;", line = 77)
    public static final class195 method1293(int arg0, class3 arg1) {
        field3258++;
        arg1.method64((byte) -90);
        if (arg0 > -55) {
            field3251 = (class119) null;
        }
        int var2 = arg1.method64((byte) 76);
        class195 var3 = class200.method1274(var2, (byte) 9);
        var3.field3117 = arg1.method64((byte) 112);
        int var4 = arg1.method64((byte) 123);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method64((byte) -118);
            var3.method13(arg1, -126, var6);
        }
        var3.method14(2048879374);
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(III)I", line = 124)
    private final int method1294(int arg0, int arg1, int arg2) {
        if (arg0 != 1376312589) {
            method1295(-73, -60, (byte) -68, 93, -58, -109, -7, -16, -113);
        }
        field3263++;
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBIIIIII)V", line = 147)
    public static final void method1295(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3264++;
        int var9 = arg3 - arg6;
        int var10 = arg1 - arg4;
        int var11 = (arg8 - arg5 << 16) / var9;
        int var12 = (arg7 - arg0 << 16) / var10;
        boolean var13;
        if (class25.field380 > 0 && (class25.field380 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg5 + var15;
                int var10000 = arg5 + var16;
                int[][] var20 = class85.field1275[arg6 + var14 >> 6];
                for (int var21 = 0; var21 < var10; var21++) {
                    int var22 = var12 * var21 >> 16;
                    int var23 = (var21 + 1) * var12 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        int var25 = arg4 + var21 >> 6;
                        int var26 = arg0 + var22;
                        var10000 = arg0 + var23;
                        if (var20[var25] != null) {
                            int var28 = ((arg4 + var21 & 0x3F) << 6) + (arg6 + var14 & 0x3F);
                            int var29 = var20[var25][var28];
                            if (var29 != 0) {
                                class291 var30 = class291.method1939(0, var29 - 1);
                                if (var13 && class182.field2892 == var30.field4794) {
                                    class224 var31 = new class224();
                                    var31.field3599 = var18;
                                    var31.field3594 = var30.field4794;
                                    var31.field3604 = var26;
                                    class221.field3541.method999(var31, (byte) -108);
                                }
                                class208.field3325[var30.field4794].method139(var18 - 7, var26 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class285.field4707 == class108.field1651) {
            for (class154 var32 = (class154) class111.field1686.method995(1836596936); var32 != null; var32 = (class154) class111.field1686.method996(0)) {
                int var33 = var32.field2455;
                int var34 = var32.field2453;
                int var35 = class258.field4137 + class221.field3552 - var34;
                int var36 = var33 - class142.field2263;
                int var37 = (arg7 - arg0) * (var35 - arg4) / (arg1 - arg4) + arg0;
                int var38 = var32.field2450;
                int var39 = 16777215;
                int var40 = (var36 - arg6) * (arg8 - arg5) / (arg3 - arg6) + arg5;
                class294 var41 = null;
                if (var38 == 0) {
                    if (class285.field4707 == 3.0D) {
                        var41 = class257.field4123;
                    }
                    if (class285.field4707 == 4.0D) {
                        var41 = class189.field2986;
                    }
                    if (class285.field4707 == 6.0D) {
                        var41 = class245.field3974;
                    }
                    if (class285.field4707 == 8.0D) {
                        var41 = class84.field1270;
                    }
                }
                if (var38 == 1) {
                    if (class285.field4707 == 3.0D) {
                        var41 = class245.field3974;
                    }
                    if (class285.field4707 == 4.0D) {
                        var41 = class84.field1270;
                    }
                    if (class285.field4707 == 6.0D) {
                        var41 = class106.field1639;
                    }
                    if (class285.field4707 == 8.0D) {
                        var41 = class95.field1463;
                    }
                }
                if (var38 == 2) {
                    if (class285.field4707 == 3.0D) {
                        var41 = class106.field1639;
                    }
                    if (class285.field4707 == 4.0D) {
                        var41 = class95.field1463;
                    }
                    var39 = 16755200;
                    if (class285.field4707 == 6.0D) {
                        var41 = class153.field2432;
                    }
                    if (class285.field4707 == 8.0D) {
                        var41 = class210.field3350;
                    }
                }
                if (var41 != null) {
                    class119[] var42 = var32.field2451;
                    int var43 = var42.length;
                    int var44 = var37 - (var43 - 1) * var41.method1960() / 2;
                    int var45 = var44 + var41.method1955() / 2;
                    for (int var46 = 0; var46 < var43; var46++) {
                        var41.method1958(var42[var46], var40, var45, var39, true);
                        var45 += var41.method1960();
                    }
                }
            }
        }
        for (class224 var47 = (class224) class221.field3541.method995(1836596936); var47 != null; var47 = (class224) class221.field3541.method996(0)) {
            class208.field3325[var47.field3594].method139(var47.field3599 - 7, var47.field3604 + -7);
            class286.method1910(var47.field3599, var47.field3604, 15, 16776960, 128);
            class286.method1910(var47.field3599, var47.field3604, 7, 16777215, 256);
        }
        if (arg2 > -28) {
            method1295(-13, 59, (byte) 1, 8, 62, -117, -49, -62, -125);
        }
        class221.field3541.method1001(-56);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(BI)Lei;", line = 359)
    public static final class262 method1296(byte arg0, int arg1) {
        field3245++;
        class262 var2 = (class262) class266.field4359.method487(false, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -78) {
            return (class262) null;
        } else {
            byte[] var3 = class108.field1648.method261(-1, class31.method235(arg1, 1911194728), class32.method238((byte) 126, arg1));
            class262 var4 = new class262();
            var4.field4249 = arg1;
            if (var3 != null) {
                var4.method1700(new class3(var3), -123);
            }
            var4.method1694(-2422);
            if (var4.field4199 != -1) {
                var4.method1696(60, method1296((byte) -108, var4.field4199), method1296((byte) -89, var4.field4238));
            }
            if (var4.field4265 != -1) {
                var4.method1690(method1296((byte) -126, var4.field4265), method1296((byte) -80, var4.field4245), 65536);
            }
            if (!class229.field3716 && var4.field4248) {
                var4.field4219 = 0;
                var4.field4212 = class152.field2425;
                var4.field4260 = null;
                var4.field4206 = false;
                var4.field4198 = null;
            }
            class266.field4359.method488(var4, (byte) 38, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V", line = 402)
    public static void method1297(int arg0) {
        field3247 = null;
        field3243 = null;
        field3244 = null;
        field3262 = null;
        field3250 = null;
        field3253 = null;
        field3260 = null;
        if (arg0 >= -125) {
            return;
        }
        field3266 = null;
        field3261 = null;
        field3246 = null;
        field3252 = null;
        field3265 = null;
        field3257 = null;
        field3255 = null;
        field3259 = null;
        field3251 = null;
    }
}
