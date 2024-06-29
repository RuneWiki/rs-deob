import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class307 {

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "[[Lkga;")
    private class547[][] field4333 = new class547[64][768];

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    private int field4344 = 0;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "[I")
    private int[] field4347 = new int[64];

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "[I")
    private int[] field4351 = new int[8191];

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "[[Lkga;")
    private class547[][] field4346 = new class547[1600][64];

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "[I")
    private int[] field4352 = new int[1600];

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "Lsr;")
    private class254 field4350;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Lll;")
    private class366 field4332;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Lll;")
    private class366 field4335;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Ljf;")
    private class216 field4339;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "[I")
    public static int[] field4348 = new int[4];

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "Lio;")
    public static class439 field4353 = new class439(4, 1);

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "Lqe;")
    public static class469 field4354 = new class469(10, 0);

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILwu;)V", line = 4)
    public final void method1934(int arg0, class373 arg1) {
        int var3 = -91 / ((arg0 + 61) / 44);
        field4345++;
        this.field4332.method1290(-113, 24, 786336);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)I", line = 18)
    public static final int method1935(int arg0, int arg1) {
        field4334++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else {
            int var2 = -27 / ((25 - arg0) / 32);
            if (arg1 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lwu;)V", line = 742)
    public class307(class373 arg0) {
        this.field4350 = arg0.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5309, class369.field5311 }), new class290(class369.field5308) }, 13992);
        this.field4332 = arg0.method2384(true, -105);
        this.field4335 = arg0.method2384(false, -62);
        this.field4335.method1290(-128, 12, 393168);
        this.field4339 = arg0.method2362(107, false);
        this.field4339.method1458((byte) 91, 49146);
        Buffer var2 = this.field4339.method1457(true, -110);
        if (var2 != null) {
            Stream var3 = arg0.method2392(var2, -15232);
            if (Stream.method3869()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3861(var7);
                    var3.method3861(var7 + 1);
                    var3.method3861(var7 + 2);
                    var3.method3861(var7 + 2);
                    var3.method3861(var7 + 3);
                    var3.method3861(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3858(var5);
                    var3.method3858(var5 + 1);
                    var3.method3858(var5 + 2);
                    var3.method3858(var5 + 2);
                    var3.method3858(var5 + 3);
                    var3.method3858(var5);
                }
            }
            var3.method3872();
            this.field4339.method1459(-26499);
        }
        Buffer var8 = this.field4335.method1283((byte) 86, true);
        if (var8 != null) {
            Stream var9 = arg0.method2392(var8, -15232);
            if (Stream.method3869()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3863(0.0F);
                    var9.method3863(-1.0F);
                    var9.method3863(0.0F);
                    var9.method3863(0.0F);
                    var9.method3863(-1.0F);
                    var9.method3863(0.0F);
                    var9.method3863(0.0F);
                    var9.method3863(-1.0F);
                    var9.method3863(0.0F);
                    var9.method3863(0.0F);
                    var9.method3863(-1.0F);
                    var9.method3863(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3864(0.0F);
                    var9.method3864(-1.0F);
                    var9.method3864(0.0F);
                    var9.method3864(0.0F);
                    var9.method3864(-1.0F);
                    var9.method3864(0.0F);
                    var9.method3864(0.0F);
                    var9.method3864(-1.0F);
                    var9.method3864(0.0F);
                    var9.method3864(0.0F);
                    var9.method3864(-1.0F);
                    var9.method3864(0.0F);
                }
            }
            var9.method3872();
            this.field4335.method1289((byte) 15);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(ILwu;)V", line = 53)
    private final void method1936(int arg0, class373 arg1) {
        class263.field3725 = arg1.field5575;
        field4336++;
        arg1.method2411(53);
        arg1.method2317(false, false);
        arg1.method2394(false, (byte) -119);
        arg1.method2357(arg0 ^ 0xFFFFB040);
        if (arg0 != 13634) {
            this.method1936(-74, null);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V", line = 69)
    public static final void method1937(int arg0, int arg1) {
        class332.field4765 = arg1;
        if (arg0 != -6830) {
            field4353 = null;
        }
        field4343++;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V", line = 82)
    public static final void method1938(byte arg0) {
        class654.field9174 = 1;
        class92.field1284 = -1;
        if (arg0 >= -56) {
            method1935(-39, 107);
        }
        field4349++;
        long var1 = 0L;
        if (class72.field1015 == null) {
            class610.method3539(35, true);
        } else {
            class645 var3 = new class645(class442.method2745(class190.method1325(class72.field1015, (byte) -74), 110));
            long var4 = var3.method3744((byte) 56);
            class286.field4061 = var3.method3744((byte) 86);
            class112.method836("", true, 0, class195.method1357(95, var4));
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 119)
    public final void method1939(int arg0) {
        if (arg0 == 1528288940) {
            field4340++;
            this.field4332.method1284(true);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLwu;)V", line = 130)
    private final void method1940(boolean arg0, class373 arg1) {
        arg1.method2394(true, (byte) -114);
        field4342++;
        if (!arg0) {
            arg1.method2317(arg0, true);
            if (class263.field3725 != arg1.field5575) {
                arg1.method484(class263.field3725);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILwu;B)V", line = 145)
    private final void method1941(int arg0, class373 arg1, byte arg2) {
        if (arg2 != 35) {
            return;
        }
        field4337++;
        int var4 = 0;
        class441 var5 = arg1.method2338(arg2 - 34);
        float var6 = var5.field6534;
        float var7 = var5.field6530;
        float var8 = var5.field6535;
        float var9 = var5.field6540;
        float var10 = var5.field6538;
        float var11 = var5.field6565;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4332.method1283((byte) 110, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2392(var21, arg2 - 15267);
        if (Stream.method3869()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field4352[var48] <= 64 ? this.field4352[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class547 var63 = this.field4346[var48][var50];
                        int var64 = var63.field7804;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field7801 >> 12);
                        float var70 = (float) (var63.field7808 >> 12);
                        float var71 = (float) (var63.field7806 >> 12);
                        int var72 = var63.field7800 >> 12;
                        var22.method3863((float) (-var72) * var12 + var69);
                        var22.method3863((float) (-var72) * var13 + var70);
                        var22.method3863((float) (-var72) * var14 + var71);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var65, var66, var67, var68);
                        } else {
                            var22.method3866(var65, var66, var67, var68);
                        }
                        var22.method3863(0.0F);
                        var22.method3863(0.0F);
                        var22.method3863((float) var72 * var15 + var69);
                        var22.method3863((float) var72 * var16 + var70);
                        var22.method3863((float) var72 * var17 + var71);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var65, var66, var67, var68);
                        } else {
                            var22.method3866(var65, var66, var67, var68);
                        }
                        var22.method3863(1.0F);
                        var22.method3863(0.0F);
                        var22.method3863((float) var72 * var12 + var69);
                        var22.method3863((float) var72 * var13 + var70);
                        var22.method3863((float) var72 * var14 + var71);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var65, var66, var67, var68);
                        } else {
                            var22.method3866(var65, var66, var67, var68);
                        }
                        var22.method3863(1.0F);
                        var22.method3863(1.0F);
                        var22.method3863((float) var72 * var18 + var69);
                        var22.method3863((float) var72 * var19 + var70);
                        var22.method3863((float) var72 * var20 + var71);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var65, var66, var67, var68);
                        } else {
                            var22.method3866(var65, var66, var67, var68);
                        }
                        var22.method3863(0.0F);
                        var22.method3863(1.0F);
                        var4++;
                    }
                    if (this.field4352[var48] > 64) {
                        int var51 = this.field4352[var48] - 65;
                        for (int var52 = this.field4347[var51] - 1; var52 >= 0; var52--) {
                            class547 var53 = this.field4333[var51][var52];
                            int var54 = var53.field7804;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field7801 >> 12);
                            float var60 = (float) (var53.field7808 >> 12);
                            float var61 = (float) (var53.field7806 >> 12);
                            int var62 = var53.field7800 >> 12;
                            var22.method3863((float) (-var62) * var12 + var59);
                            var22.method3863((float) (-var62) * var13 + var60);
                            var22.method3863((float) (-var62) * var14 + var61);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var55, var56, var57, var58);
                            } else {
                                var22.method3866(var55, var56, var57, var58);
                            }
                            var22.method3863(0.0F);
                            var22.method3863(0.0F);
                            var22.method3863((float) var62 * var15 + var59);
                            var22.method3863((float) var62 * var16 + var60);
                            var22.method3863((float) var62 * var17 + var61);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var55, var56, var57, var58);
                            } else {
                                var22.method3866(var55, var56, var57, var58);
                            }
                            var22.method3863(1.0F);
                            var22.method3863(0.0F);
                            var22.method3863((float) var62 * var12 + var59);
                            var22.method3863((float) var62 * var13 + var60);
                            var22.method3863((float) var62 * var14 + var61);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var55, var56, var57, var58);
                            } else {
                                var22.method3866(var55, var56, var57, var58);
                            }
                            var22.method3863(1.0F);
                            var22.method3863(1.0F);
                            var22.method3863((float) var62 * var18 + var59);
                            var22.method3863((float) var62 * var19 + var60);
                            var22.method3863((float) var62 * var20 + var61);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var55, var56, var57, var58);
                            } else {
                                var22.method3866(var55, var56, var57, var58);
                            }
                            var22.method3863(0.0F);
                            var4++;
                            var22.method3863(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field4352[var23] <= 64 ? this.field4352[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class547 var38 = this.field4346[var23][var25];
                        int var39 = var38.field7804;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field7801 >> 12);
                        float var45 = (float) (var38.field7808 >> 12);
                        float var46 = (float) (var38.field7806 >> 12);
                        int var47 = var38.field7800 >> 12;
                        var22.method3864((float) (-var47) * var12 + var44);
                        var22.method3864((float) (-var47) * var13 + var45);
                        var22.method3864((float) (-var47) * var14 + var46);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var40, var41, var42, var43);
                        } else {
                            var22.method3866(var40, var41, var42, var43);
                        }
                        var22.method3864(0.0F);
                        var22.method3864(0.0F);
                        var22.method3864((float) var47 * var15 + var44);
                        var22.method3864((float) var47 * var16 + var45);
                        var22.method3864((float) var47 * var17 + var46);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var40, var41, var42, var43);
                        } else {
                            var22.method3866(var40, var41, var42, var43);
                        }
                        var22.method3864(1.0F);
                        var22.method3864(0.0F);
                        var22.method3864((float) var47 * var12 + var44);
                        var22.method3864((float) var47 * var13 + var45);
                        var22.method3864((float) var47 * var14 + var46);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var40, var41, var42, var43);
                        } else {
                            var22.method3866(var40, var41, var42, var43);
                        }
                        var22.method3864(1.0F);
                        var22.method3864(1.0F);
                        var22.method3864((float) var47 * var18 + var44);
                        var22.method3864((float) var47 * var19 + var45);
                        var22.method3864((float) var47 * var20 + var46);
                        if (arg1.field5629 == 0) {
                            var22.method3862(var40, var41, var42, var43);
                        } else {
                            var22.method3866(var40, var41, var42, var43);
                        }
                        var22.method3864(0.0F);
                        var4++;
                        var22.method3864(1.0F);
                    }
                    if (this.field4352[var23] > 64) {
                        int var26 = this.field4352[var23] - 64 - 1;
                        for (int var27 = this.field4347[var26] - 1; var27 >= 0; var27--) {
                            class547 var28 = this.field4333[var26][var27];
                            int var29 = var28.field7804;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field7801 >> 12);
                            float var35 = (float) (var28.field7808 >> 12);
                            float var36 = (float) (var28.field7806 >> 12);
                            int var37 = var28.field7800 >> 12;
                            var22.method3864((float) (-var37) * var12 + var34);
                            var22.method3864((float) (-var37) * var13 + var35);
                            var22.method3864((float) (-var37) * var14 + var36);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var30, var31, var32, var33);
                            } else {
                                var22.method3866(var30, var31, var32, var33);
                            }
                            var22.method3864(0.0F);
                            var22.method3864(0.0F);
                            var22.method3864((float) var37 * var15 + var34);
                            var22.method3864((float) var37 * var16 + var35);
                            var22.method3864((float) var37 * var17 + var36);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var30, var31, var32, var33);
                            } else {
                                var22.method3866(var30, var31, var32, var33);
                            }
                            var22.method3864(1.0F);
                            var22.method3864(0.0F);
                            var22.method3864((float) var37 * var12 + var34);
                            var22.method3864((float) var37 * var13 + var35);
                            var22.method3864((float) var37 * var14 + var36);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var30, var31, var32, var33);
                            } else {
                                var22.method3866(var30, var31, var32, var33);
                            }
                            var22.method3864(1.0F);
                            var22.method3864(1.0F);
                            var22.method3864((float) var37 * var18 + var34);
                            var22.method3864((float) var37 * var19 + var35);
                            var22.method3864((float) var37 * var20 + var36);
                            if (arg1.field5629 == 0) {
                                var22.method3862(var30, var31, var32, var33);
                            } else {
                                var22.method3866(var30, var31, var32, var33);
                            }
                            var22.method3864(0.0F);
                            var4++;
                            var22.method3864(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3872();
        if (this.field4332.method1289((byte) 56)) {
            arg1.method2389(0, (byte) -64, this.field4332);
            arg1.method2389(1, (byte) -64, this.field4335);
            arg1.method2368(this.field4350, (byte) 98);
            arg1.method2325(var4 * 2, 0, var4 * 4, 0, this.field4339, -8, class506.field7196);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V", line = 541)
    public static void method1942(int arg0) {
        field4354 = null;
        field4348 = null;
        if (arg0 != 0) {
            method1935(104, -120);
        }
        field4353 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lwu;IBLof;)V", line = 553)
    public final void method1943(class373 arg0, int arg1, byte arg2, class624 arg3) {
        field4338++;
        if (arg0.field5542 == null) {
            return;
        }
        if (arg1 < 0) {
            this.method1936(13634, arg0);
        } else {
            this.method1944(arg0, arg1, 5081);
        }
        float var5 = arg0.field5542.field6573;
        float var6 = arg0.field5542.field6532;
        float var7 = arg0.field5542.field6541;
        float var8 = arg0.field5542.field6526;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class361 var12 = arg3.field8738.field5965;
            for (class361 var13 = var12.field5222; var13 != var12; var13 = var13.field5222) {
                class547 var14 = (class547) var13;
                int var15 = (int) ((float) (var14.field7806 >> 12) * var7 + (float) (var14.field7808 >> 12) * var6 + (float) (var14.field7801 >> 12) * var5 + var8);
                this.field4351[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class181.method1280(var16, 82) + 1 - class373.field5442;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class361 var19 = var12.field5222;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field4344 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4352[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4347[var24] = 0;
                }
                while (var12 != var19) {
                    class547 var25 = (class547) var19;
                    if (var22) {
                        var21 = var25.field7809;
                        var20 = var25.field7810;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field7810 != var20 || var25.field7809 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4351[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4352[var26] >= 64) {
                            label104: {
                                if (this.field4352[var26] == 64) {
                                    if (this.field4344 == 64) {
                                        break label104;
                                    }
                                    this.field4352[var26] += this.field4344++ + 1;
                                }
                                this.field4333[this.field4352[var26] - 64 - 1][this.field4347[this.field4352[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field4346[var26][this.field4352[var26]++] = var25;
                        }
                    }
                    var19 = var19.field5222;
                }
                arg0.method2398(false, false, false, var20 < 0 ? -1 : var20);
                if (var21 && class263.field3725 != arg0.field5575) {
                    arg0.method484(class263.field3725);
                } else if (arg0.field5575 != 1.0F) {
                    arg0.method484(1.0F);
                }
                this.method1941(var16, arg0, (byte) 35);
            }
            if (arg2 != 96) {
                this.method1936(40, null);
            }
        } catch (Exception var27) {
        }
        this.method1940(false, arg0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lwu;II)V", line = 716)
    private final void method1944(class373 arg0, int arg1, int arg2) {
        field4341++;
        class263.field3725 = arg0.field5575;
        arg0.method2293((float) arg1, arg2 - 4969);
        arg0.method2382(2);
        if (arg2 != 5081) {
            this.field4347 = null;
        }
        arg0.method2317(false, false);
        arg0.method2394(false, (byte) -116);
        arg0.method2357(arg2 - 36567);
    }
}
