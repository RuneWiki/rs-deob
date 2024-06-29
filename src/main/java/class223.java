import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class223 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "J")
    public long field3759 = 0L;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
    public static int[] field3754 = new int[100];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Ltb;")
    public class184 field3753;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Ltb;")
    public class184 field3764;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lda;")
    public static class197 field3761;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIBII)Z")
    public static final boolean method1500(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3765++;
        long var8 = class112.method784(arg2, arg3 + arg4, arg0 + arg1);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x34A261) >> 20;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class206 var13 = class10.method64(64, var12);
            if (var13.field3402 == -1) {
                int var14 = arg7;
                if (var8 > 0L) {
                    var14 = arg6;
                }
                int[] var15 = class283.field4490;
                int var16 = (52736 - (arg1 * 512)) * 4 + arg3 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class2.method11(arg1, var13, true, var10, arg3, arg0, arg4)) {
                return false;
            }
        }
        long var17 = class275.method1801(arg2, arg3 + arg4, arg0 + arg1);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7C02B) >> 14;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 20 & 0x3;
            class206 var22 = class10.method64(64, var20);
            if (var22.field3402 == -1) {
                if (var19 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var24 = (52736 - (arg1 * 512)) * 4 + arg3 * 4 + 24624;
                    int[] var25 = class283.field4490;
                    if (var21 == 0 || var21 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1024 + 1] = var23;
                        var25[var24 + 514] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 1024 + 2] = var23;
                        var25[var24 + 1536 + 3] = var23;
                    }
                }
            } else if (!class2.method11(arg1, var22, true, var21, arg3, arg0, arg4)) {
                return false;
            }
        }
        if (arg5 > -125) {
            method1502(false, 54, 39, 108, false, 96, -24, 24);
        }
        long var26 = class108.method747(arg2, arg3 + arg4, arg0 + arg1);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class206 var30 = class10.method64(64, var29);
            if (var30.field3402 != -1 && !class2.method11(arg1, var30, true, var28, arg3, arg0, arg4)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1501(byte arg0) {
        field3754 = null;
        if (arg0 <= 94) {
            field3761 = null;
        }
        field3761 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIIZIII)V")
    public static final void method1502(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3757++;
        if (!arg4 && class96.field1654 == arg7 && class59.field1031 == arg3 && class145.field2476 == arg5 || class96.method610(0)) {
            return;
        }
        class96.field1654 = arg7;
        class59.field1031 = arg3;
        class145.field2476 = arg5;
        if (class96.method610(0)) {
            class145.field2476 = 0;
        }
        if (arg0) {
            class217.method1441(28, -31239);
        } else {
            class217.method1441(25, -31239);
        }
        class229.method1539(0, true, class261.field4257);
        int var8 = class255.field4162;
        int var9 = class126.field2206;
        class255.field4162 = (arg3 - 6) * 8;
        class126.field2206 = (arg7 - 6) * 8;
        class110.field1988 = class248.method1658(128, class96.field1654 * 8, class59.field1031 * 8);
        class255.field4167 = null;
        int var10 = class126.field2206 - var9;
        int var11 = class126.field2206;
        int var12 = class255.field4162 - var8;
        int var13 = class255.field4162;
        if (arg0) {
            class187.field3037 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class141 var15 = class42.field625[var14];
                if (var15 != null) {
                    var15.field1458 -= var12 * 128;
                    var15.field1397 -= var10 * 128;
                    if (var15.field1397 >= 0 && var15.field1397 <= 13184 && var15.field1458 >= 0 && var15.field1458 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field1464[var16] -= var10;
                            var15.field1486[var16] -= var12;
                        }
                        class292.field4668[class187.field3037++] = var14;
                    } else {
                        class42.field625[var14].method989((class208) null, (byte) -114);
                        class42.field625[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class141 var33 = class42.field625[var17];
                if (var33 != null) {
                    for (int var34 = 0; var34 < 10; var34++) {
                        var33.field1464[var34] -= var10;
                        var33.field1486[var34] -= var12;
                    }
                    var33.field1397 -= var10 * 128;
                    var33.field1458 -= var12 * 128;
                }
            }
        }
        for (int var18 = arg2; var18 < 2048; var18++) {
            class288 var31 = class105.field1874[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field1464[var32] -= var10;
                    var31.field1486[var32] -= var12;
                }
                var31.field1397 -= var10 * 128;
                var31.field1458 -= var12 * 128;
            }
        }
        byte var19 = 0;
        class176.field2886 = arg5;
        class273.field4378.method1949(arg6, false, arg1, 32);
        byte var20 = 104;
        byte var21 = 0;
        byte var22 = 1;
        if (var10 < 0) {
            var22 = -1;
            var19 = 103;
            var20 = -1;
        }
        byte var23 = 104;
        byte var24 = 1;
        if (var12 < 0) {
            var21 = 103;
            var23 = -1;
            var24 = -1;
        }
        for (int var25 = var19; var25 != var20; var25 += var22) {
            for (int var27 = var21; var27 != var23; var27 += var24) {
                int var28 = var12 + var27;
                int var29 = var10 + var25;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                        class255.field4163[var30][var25][var27] = class255.field4163[var30][var29][var28];
                    } else {
                        class255.field4163[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class103 var26 = (class103) class49.field849.method379(6347); var26 != null; var26 = (class103) class49.field849.method378(42)) {
            var26.field1803 -= var10;
            var26.field1815 -= var12;
            if (var26.field1803 < 0 || var26.field1815 < 0 || var26.field1803 >= 104 || var26.field1815 >= 104) {
                var26.method547(10026);
            }
        }
        class292.field4663 = -1;
        if (class79.field1364 != 0) {
            class53.field927 -= var12;
            class79.field1364 -= var10;
        }
        if (arg0) {
            class136.field2385 -= var10;
            class277.field4432 -= var12;
            class56.field976 -= var10 * 128;
            class182.field2973 -= var10;
            class237.field3904 -= var12 * 128;
            class74.field1226 -= var12;
        } else {
            class241.field3970 = 1;
        }
        class31.field461 = 0;
        class63.field1092.method377(arg2 + 125);
        class159.field2662.method377(102);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public static final int method1503(int arg0, int arg1) {
        if (arg1 != -1536) {
            method1503(-5, 42);
        }
        field3752++;
        return arg0 >>> 8;
    }
}
