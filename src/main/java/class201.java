import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class201 {

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    private int field3455 = 0;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[Lsf;")
    private class60[] field3450;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[Lub;")
    public static class227[] field3442 = new class227[200];

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[S")
    public static short[] field3457 = new short[256];

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field3458 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "J")
    private long field3447;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lwa;")
    public static class135 field3445;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Ln;")
    public static class138 field3453;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lsf;")
    private class60 field3444;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lsf;")
    private class60 field3452;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "[S")
    public static short[] field3451;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method1292(int arg0) {
        field3456++;
        for (int var2 = 0; var2 < this.field3448; var2++) {
            class60 var3 = this.field3450[var2];
            while (true) {
                class60 var4 = var3.field1110;
                if (var3 == var4) {
                    break;
                }
                var4.method369(127);
            }
        }
        this.field3444 = null;
        if (arg0 == 25028) {
            this.field3452 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lsf;")
    public final class60 method1293(byte arg0) {
        field3454++;
        if (this.field3444 == null) {
            return null;
        }
        class60 var2 = this.field3450[(int) (this.field3447 & (long) (this.field3448 - 1))];
        while (this.field3444 != var2) {
            if (this.field3444.field1113 == this.field3447) {
                class60 var4 = this.field3444;
                this.field3444 = this.field3444.field1110;
                return var4;
            }
            this.field3444 = this.field3444.field1110;
        }
        int var3 = 37 / ((32 - arg0) / 35);
        this.field3444 = null;
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method1294(int arg0) {
        field3442 = null;
        field3457 = null;
        if (arg0 != 40) {
            method1294(-115);
        }
        field3445 = null;
        field3451 = null;
        field3453 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)Lsf;")
    public final class60 method1295(byte arg0) {
        field3460++;
        if (arg0 != 31) {
            return null;
        } else if (this.field3455 <= 0 || this.field3450[this.field3455 - 1] == this.field3452) {
            while (this.field3448 > this.field3455) {
                class60 var3 = this.field3450[this.field3455++].field1110;
                if (this.field3450[this.field3455 - 1] != var3) {
                    this.field3452 = var3.field1110;
                    return var3;
                }
            }
            return null;
        } else {
            class60 var2 = this.field3452;
            this.field3452 = var2.field1110;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lta;BII)V")
    public static final void method1296(class105 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -72) {
            return;
        }
        if (arg0.field1922 == 1) {
            class221.field3744++;
            class92.method538(0, class91.field1558, arg0.field1861, (short) 16, arg0.field1974, 0L, (byte) -31);
        }
        field3443++;
        if (arg0.field1922 == 2 && !class57.field1050) {
            class227 var4 = class169.method1043(arg1 ^ 0xB30CE2A2, arg0);
            if (var4 != null) {
                class92.method538(-1, class76.method445((byte) 95, new class227[] { class215.field3634, arg0.field1846 }), arg0.field1861, (short) 46, var4, 0L, (byte) -31);
                class216.field3644++;
            }
        }
        if (arg0.field1922 == 3) {
            class226.field3898++;
            class92.method538(0, class91.field1558, arg0.field1861, (short) 40, class182.field3103, 0L, (byte) -31);
        }
        if (arg0.field1922 == 4) {
            class205.field3488++;
            class92.method538(0, class91.field1558, arg0.field1861, (short) 58, arg0.field1974, 0L, (byte) -31);
        }
        if (arg0.field1922 == 5) {
            class36.field606++;
            class92.method538(0, class91.field1558, arg0.field1861, (short) 35, arg0.field1974, 0L, (byte) -31);
        }
        if (arg0.field1922 == 6 && class125.field2249 == null) {
            class92.method538(-1, class91.field1558, arg0.field1861, (short) 38, arg0.field1974, 0L, (byte) -31);
            class205.field3490++;
        }
        if (arg0.field1829 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field1945; var6++) {
                for (int var7 = 0; var7 < arg0.field1943; var7++) {
                    int var8 = (arg0.field1899 + 32) * var7;
                    int var9 = (arg0.field1906 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field1888[var5];
                        var9 += arg0.field1896[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg3 && (var8 + 32) > arg2 && arg3 < (var9 + 32)) {
                        class243.field4212 = arg0;
                        class208.field3525 = var5;
                        if (arg0.field1865[var5] > 0) {
                            class178 var10 = class133.method815(arg0.field1865[var5] - 1, (byte) -70);
                            if (class122.field2199 == 1 && class169.method1045(client.method494(arg0), arg1 - 50)) {
                                if (class167.field2789 != arg0.field1861 || class119.field2162 != var5) {
                                    class184.field3124++;
                                    class92.method538(var5, class76.method445((byte) 109, new class227[] { class184.field3130, class188.field3197, var10.field3048 }), arg0.field1861, (short) 22, class40.field651, (long) var10.field3039, (byte) -31);
                                }
                            } else if (!class57.field1050 || !class169.method1045(client.method494(arg0), arg1 + 155)) {
                                class227[] var11 = var10.field3040;
                                if (class173.field2883) {
                                    var11 = class95.method587((byte) -95, var11);
                                }
                                class16.field296++;
                                if (class169.method1045(client.method494(arg0), arg1 - 25)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class210.field3564++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 21;
                                            } else {
                                                var13 = 37;
                                            }
                                            class92.method538(var5, class76.method445((byte) 94, new class227[] { class99.field1735, var10.field3048 }), arg0.field1861, var13, var11[var12], (long) var10.field3039, (byte) -31);
                                        } else if (var12 == 4) {
                                            class92.method538(var5, class76.method445((byte) -116, new class227[] { class99.field1735, var10.field3048 }), arg0.field1861, (short) 37, class128.field2261, (long) var10.field3039, (byte) -31);
                                            class174.field2905++;
                                        }
                                    }
                                }
                                if (class71.method430(client.method494(arg0), 22891)) {
                                    class220.field3718++;
                                    class92.method538(var5, class76.method445((byte) 112, new class227[] { class99.field1735, var10.field3048 }), arg0.field1861, (short) 3, class40.field651, (long) var10.field3039, (byte) -31);
                                }
                                if (class169.method1045(client.method494(arg0), arg1 ^ 0x37) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class103.field1808++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 8;
                                            }
                                            if (var14 == 1) {
                                                var15 = 51;
                                            }
                                            if (var14 == 2) {
                                                var15 = 20;
                                            }
                                            class92.method538(var5, class76.method445((byte) -119, new class227[] { class99.field1735, var10.field3048 }), arg0.field1861, var15, var11[var14], (long) var10.field3039, (byte) -31);
                                        }
                                    }
                                }
                                class227[] var16 = arg0.field1863;
                                if (class173.field2883) {
                                    var16 = class95.method587((byte) -42, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class220.field3692++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 5;
                                            }
                                            if (var17 == 1) {
                                                var18 = 32;
                                            }
                                            if (var17 == 2) {
                                                var18 = 47;
                                            }
                                            if (var17 == 3) {
                                                var18 = 50;
                                            }
                                            if (var17 == 4) {
                                                var18 = 41;
                                            }
                                            class92.method538(var5, class76.method445((byte) -71, new class227[] { class99.field1735, var10.field3048 }), arg0.field1861, var18, var16[var17], (long) var10.field3039, (byte) -31);
                                        }
                                    }
                                }
                                class92.method538(var5, class76.method445((byte) -105, new class227[] { class99.field1735, var10.field3048 }), arg0.field1861, (short) 1003, class73.field1286, (long) var10.field3039, (byte) -31);
                            } else if ((class177.field2983 & 0x10) == 16) {
                                class28.field458++;
                                class92.method538(var5, class76.method445((byte) 78, new class227[] { class149.field2608, class188.field3197, var10.field3048 }), arg0.field1861, (short) 7, class88.field1528, (long) var10.field3039, (byte) -31);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field1853) {
            return;
        }
        if (!class57.field1050) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class227 var23 = class190.method1208(arg0, (byte) -127, var19);
                if (var23 != null) {
                    class92.method538(arg0.field1884, arg0.field1870, arg0.field1861, (short) 1004, var23, (long) (var19 + 1), (byte) -31);
                    class176.field2928++;
                }
            }
            class227 var20 = class169.method1043(1291001114, arg0);
            if (var20 != null) {
                class92.method538(arg0.field1884, arg0.field1870, arg0.field1861, (short) 46, var20, 0L, (byte) -31);
                class216.field3644++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class227 var22 = class190.method1208(arg0, (byte) -127, var21);
                if (var22 != null) {
                    class92.method538(arg0.field1884, arg0.field1870, arg0.field1861, (short) 28, var22, (long) (var21 + 1), (byte) -31);
                    class176.field2928++;
                }
            }
            if (!class94.method583(true, client.method494(arg0))) {
                return;
            }
            class205.field3490++;
            class92.method538(arg0.field1884, class91.field1558, arg0.field1861, (short) 38, class10.field215, 0L, (byte) -31);
        } else if (class125.method771(client.method494(arg0), -28023) && (class177.field2983 & 0x20) == 32) {
            class76.field1328++;
            class92.method538(arg0.field1884, class76.method445((byte) 107, new class227[] { class149.field2608, class251.field4342, arg0.field1870 }), arg0.field1861, (short) 2, class88.field1528, 0L, (byte) -31);
            return;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
    public class201(int arg0) {
        this.field3448 = arg0;
        this.field3450 = new class60[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class60 var3 = this.field3450[var2] = new class60();
            var3.field1110 = var3;
            var3.field1112 = var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIIIIIIIIIIZ)Z")
    public static final boolean method1297(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field3459++;
        if (arg0 != 58) {
            return false;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class41.field674[var12][var31] = 0;
                class45.field777[var12][var31] = 99999999;
            }
        }
        class41.field674[arg1][arg4] = 99;
        int var13 = arg1;
        int var14 = arg4;
        class45.field777[arg1][arg4] = 0;
        int var15 = 0;
        byte var16 = 0;
        class40.field659[var16] = arg1;
        boolean var17 = false;
        int var32 = var16 + 1;
        class120.field2188[var16] = arg4;
        int[][] var18 = class78.field1370[class64.field1171].field2338;
        while (var15 != var32) {
            var14 = class120.field2188[var15];
            var13 = class40.field659[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg9 == var13 && arg5 == var14) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class78.field1370[class64.field1171].method831(arg2, 83, arg9, arg5, 2, var13, var14, arg8 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class78.field1370[class64.field1171].method818(var13, arg9, arg2, 2, var14, arg8 - 1, arg5, (byte) -60)) {
                    var17 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg3 != 0 && class78.field1370[class64.field1171].method825(arg10, var13, var14, arg9, 0, arg5, arg6, 2, arg3)) {
                var17 = true;
                break;
            }
            int var30 = class45.field777[var13][var14] + 1;
            if (var13 > 0 && class41.field674[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class40.field659[var32] = var13 - 1;
                class120.field2188[var32] = var14;
                class41.field674[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class45.field777[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class41.field674[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class40.field659[var32] = var13 + 1;
                class120.field2188[var32] = var14;
                class41.field674[var13 + 1][var14] = 8;
                class45.field777[var13 + 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class41.field674[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class40.field659[var32] = var13;
                class120.field2188[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field674[var13][var14 - 1] = 1;
                class45.field777[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class41.field674[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class40.field659[var32] = var13;
                class120.field2188[var32] = var14 + 1;
                class41.field674[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class45.field777[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class41.field674[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class40.field659[var32] = var13 - 1;
                class120.field2188[var32] = var14 - 1;
                class41.field674[var13 - 1][var14 - 1] = 3;
                class45.field777[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class41.field674[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class40.field659[var32] = var13 + 1;
                class120.field2188[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field674[var13 + 1][var14 - 1] = 9;
                class45.field777[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class41.field674[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class40.field659[var32] = var13 - 1;
                class120.field2188[var32] = var14 + 1;
                class41.field674[var13 - 1][var14 + 1] = 6;
                class45.field777[var13 - 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 < 102 && class41.field674[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class40.field659[var32] = var13 + 1;
                class120.field2188[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field674[var13 + 1][var14 + 1] = 12;
                class45.field777[var13 + 1][var14 + 1] = var30;
            }
        }
        class193.field3295 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg9 - var21; var22 <= arg9 + var21; var22++) {
                for (int var23 = arg5 - var21; var23 <= arg5 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class45.field777[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 < arg9) {
                            var24 = arg9 - var22;
                        } else if (var22 > (arg9 - (1 - arg6))) {
                            var24 = var22 + 1 - arg6 - arg9;
                        }
                        if (var23 < arg5) {
                            var25 = arg5 - var23;
                        } else if (var23 > arg5 + arg3 - 1) {
                            var25 = var23 - (arg5 + arg3 - 1);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && class45.field777[var22][var23] < var19) {
                            var20 = var26;
                            var19 = class45.field777[var22][var23];
                            var13 = var22;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg4 == var14) {
                return false;
            }
            class193.field3295 = 1;
        }
        byte var27 = 0;
        class40.field659[var27] = var13;
        int var33 = var27 + 1;
        class120.field2188[var27] = var14;
        int var28;
        int var29 = var28 = class41.field674[var13][var14];
        while (arg1 != var13 || arg4 != var14) {
            if (var28 != var29) {
                class40.field659[var33] = var13;
                var28 = var29;
                class120.field2188[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class41.field674[var13][var14];
        }
        if (var33 > 0) {
            class252.method1681(1, arg7, var33);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)Lsf;")
    public final class60 method1298(int arg0, long arg1) {
        field3461++;
        this.field3447 = arg1;
        if (arg0 >= -101) {
            return null;
        }
        class60 var4 = this.field3450[(int) ((long) (this.field3448 - 1) & arg1)];
        for (this.field3444 = var4.field1110; this.field3444 != var4; this.field3444 = this.field3444.field1110) {
            if (this.field3444.field1113 == arg1) {
                class60 var5 = this.field3444;
                this.field3444 = this.field3444.field1110;
                return var5;
            }
        }
        this.field3444 = null;
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lsf;")
    public final class60 method1299(byte arg0) {
        int var2 = -47 % ((-arg0 - 18) / 41);
        field3446++;
        this.field3455 = 0;
        return this.method1295((byte) 31);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lsf;JI)V")
    public final void method1300(class60 arg0, long arg1, int arg2) {
        if (arg0.field1112 != null) {
            arg0.method369(125);
        }
        class60 var5 = this.field3450[(int) (arg1 & (long) (this.field3448 - 1))];
        field3449++;
        arg0.field1113 = arg1;
        if (arg2 != -2875) {
            this.method1299((byte) 89);
        }
        arg0.field1112 = var5.field1112;
        arg0.field1110 = var5;
        arg0.field1112.field1110 = arg0;
        arg0.field1110.field1112 = arg0;
    }
}
