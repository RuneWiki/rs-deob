import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class201 extends class44 {

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Lda;")
    public static class275 field3434 = class255.method1672(120, ")2");

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static volatile int field3442 = 0;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "Lda;")
    public static class275 field3439 = class255.method1672(120, "document)3cookie=(R");

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "[Lda;")
    public static class275[] field3446 = new class275[500];

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "Loa;")
    public static class276 field3447 = new class276(16);

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "B")
    public byte field3441;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Lij;")
    public class85 field3435;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILda;I)V")
    public static final void method1314(int arg0, class275 arg1, int arg2) {
        ++field3444;
        class149.field2597.method526((byte) -62, 163);
        class149.field2597.method575((byte) 125, arg2);
        ++class55.field931;
        class149.field2597.method560(arg1.method1833(0), -103);
        if (arg0 != 4) {
            field3442 = 45;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class151 var7 = new class151();
        var7.field2641 = arg1 / 128;
        var7.field2639 = arg2 / 128;
        var7.field2635 = arg3 / 128;
        var7.field2630 = arg4 / 128;
        var7.field2650 = arg0;
        var7.field2647 = arg1;
        var7.field2651 = arg2;
        var7.field2624 = arg3;
        var7.field2642 = arg4;
        var7.field2644 = arg5;
        var7.field2645 = arg6;
        class158.field2776[class107.field1859++] = var7;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
    public static final void method1316(int arg0) {
        if (arg0 != 2) {
            method1322(82, false);
        }
        if (class108.field1869 != null) {
            class69 var1 = class108.field1869;
            synchronized (class108.field1869) {
                class108.field1869 = null;
            }
        }
        ++field3432;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)I")
    public final int method260(boolean arg0) {
        if (!arg0) {
            method1322(-6, true);
        }
        ++field3443;
        return this.field3435 == null ? 0 : this.field3435.field1392 * 100 / (this.field3435.field1381.length + -this.field3441);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZIIBI)V")
    public static final void method1317(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field3440;
        ++class168.field2925;
        if (!arg1) {
            class235.method1531(1653179047, true);
            class211.method1360(127, true);
            class235.method1531(1653179047, false);
        }
        class211.method1360(arg4 + 125, false);
        if (!arg1) {
            class233.method1516(false);
        }
        class16.method82(true);
        if (class159.field2789 == 1) {
            int var6 = 2047 & class66.field1093 + class169.field2938;
            int var7 = class275.field4794;
            if (~var7 > ~(class172.field2993 / 256)) {
                var7 = class172.field2993 / 256;
            }
            if (class73.field1195[4] && var7 < class137.field2413[4] + 128) {
                var7 = class137.field2413[4] + 128;
            }
            class42.method248(12847, class89.method647(class66.field1094.field1758, class159.field2790, class66.field1094.field1770, arg4 + 125) - 50, arg5, var6, var7, class192.field3308, class182.field3124, 600 - -(var7 * 3));
        }
        int var8 = class123.field2204;
        int var9 = class224.field3800;
        int var10 = class251.field4454;
        int var11 = class195.field3335;
        int var12 = class83.field1349;
        for (int var13 = 0; ~var13 > -6; ++var13) {
            if (class73.field1195[var13]) {
                int var19 = (int) (Math.random() * (double) (class231.field4039[var13] * 2 + 1) - (double) class231.field4039[var13] + Math.sin((double) class93.field1596[var13] / 100.0D * (double) class185.field3171[var13]) * (double) class137.field2413[var13]);
                if (~var13 == -3) {
                    class195.field3335 += var19;
                }
                if (var13 == 0) {
                    class123.field2204 += var19;
                }
                if (var13 == 3) {
                    class224.field3800 = 2047 & class224.field3800 + var19;
                }
                if (~var13 == -2) {
                    class83.field1349 += var19;
                }
                if (~var13 == -5) {
                    class251.field4454 += var19;
                    if (~class251.field4454 > -129) {
                        class251.field4454 = 128;
                    }
                    if (~class251.field4454 < -384) {
                        class251.field4454 = 383;
                    }
                }
            }
        }
        class110.method817((byte) -87);
        class47.method297(arg2, arg0, arg2 - -arg3, arg0 + arg5);
        class223.method1433();
        if (!class63.field1051 && ~class181.field3101 <= ~arg2 && arg2 + arg3 > class181.field3101 && class161.field2826 >= arg0 && arg0 - -arg5 > class161.field2826) {
            class60.field1012 = true;
            int var14 = class34.field540;
            int var15 = class226.field3833;
            class152.field2654 = 0;
            int var16 = class153.field2686;
            class151.field2626 = (var15 - var14) * (-arg2 + class181.field3101) / arg3 + var14;
            int var17 = class207.field3501;
            class117.field2087 = (class161.field2826 - arg0) * (-var16 + var17) / arg5 + var16;
        } else {
            class60.field1012 = false;
            class152.field2654 = 0;
        }
        class160.method1116(true);
        byte var18 = class276.method1859((byte) -79) != 2 ? 1 : (byte) class168.field2925;
        class47.method299(arg2, arg0, arg3, arg5, 0);
        class71.method466(class123.field2204, class83.field1349, class195.field3335, class251.field4454, class224.field3800, class241.field4225, class205.field3478, class256.field4508, class209.field3527, class23.field350, class32.field482, class159.field2790 + 1, var18, class66.field1094.field1770 >> 7, class66.field1094.field1758 >> 7);
        class160.method1116(true);
        class80.method516();
        class200.method1311(256, arg3, 3675, arg0, 256, arg5, arg2);
        class225.method1455(256, 256, arg2, true, arg0, arg5, arg3);
        ((class187) class223.field3771).method1236(class105.field1829, false);
        class252.method1663(arg4 + -10413, arg0, arg3, arg2, arg5);
        class251.field4454 = var10;
        if (arg4 == 2) {
            class83.field1349 = var12;
            class123.field2204 = var8;
            class195.field3335 = var11;
            class224.field3800 = var9;
            if (class146.field2551 && ~class187.field3191.method1766(arg4 ^ -3) == -1) {
                class146.field2551 = false;
            }
            if (class146.field2551) {
                class47.method299(arg2, arg0, arg3, arg5, 0);
                class102.method731(false, 108, class237.field4123);
            }
            if (!arg1 && !class146.field2551 && !class63.field1051 && arg2 <= class181.field3101 && ~class181.field3101 > ~(arg2 + arg3) && ~arg0 >= ~class161.field2826 && ~class161.field2826 > ~(arg0 + arg5)) {
                class116.method848(arg5, arg0, (byte) 55, arg3, class161.field2826, class181.field3101, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)[B")
    public final byte[] method264(int arg0) {
        ++field3438;
        if (!super.field748 && this.field3435.field1392 >= this.field3435.field1381.length + -this.field3441) {
            return arg0 != 4055 ? null : this.field3435.field1381;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
    public static final void method1318(byte arg0, int arg1) {
        int var2 = -124 % ((arg1 - 14) / 55);
        ++field3445;
        if (class241.field4225 == null) {
            class241.field4225 = new byte[4][104][104];
        }
        for (int var3 = 0; var3 < 4; ++var3) {
            for (int var4 = 0; var4 < 104; ++var4) {
                for (int var5 = 0; ~var5 > -105; ++var5) {
                    class241.field4225[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILij;)V")
    public static final void method1319(int arg0, class85 arg1) {
        if (arg0 > -73) {
            field3434 = null;
        }
        ++field3431;
        while (true) {
            while (arg1.field1381.length > arg1.field1392) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method564((byte) 97) == 1) {
                    var3 = arg1.method564((byte) 87);
                    var2 = true;
                    var4 = arg1.method564((byte) 103);
                }
                int var5 = arg1.method564((byte) 90);
                int var6 = arg1.method564((byte) 102);
                int var7 = var5 * 64 - class18.field255;
                int var8 = class5.field67 - var6 * 64 + class106.field1841 + -1;
                if (var7 >= 0 && var8 + -63 >= 0 && ~class255.field4497 < ~(var7 - -63) && ~class5.field67 < ~var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || ~(var3 * 8) >= ~var11 && var3 * 8 - -8 > var11 && ~var12 <= ~(var4 * 8) && ~(var4 * 8 + 8) < ~var12) {
                                int var13 = arg1.method564((byte) 106);
                                if (var13 != 0) {
                                    if (~(var13 & 1) == -2) {
                                        int var14 = arg1.method564((byte) 123);
                                        if (class57.field964[var9][var10] == null) {
                                            class57.field964[var9][var10] = new byte[4096];
                                        }
                                        class57.field964[var9][var10][(-var12 + 63 << 6) + var11] = (byte) var14;
                                    }
                                    if ((2 & var13) == 2) {
                                        int var15 = arg1.method608(102);
                                        if (class107.field1855[var9][var10] == null) {
                                            class107.field1855[var9][var10] = new short[4096];
                                        }
                                        class107.field1855[var9][var10][(63 - var12 << 6) - -var11] = (short) var15;
                                    }
                                    if ((4 & var13) == 4) {
                                        int var16 = (arg1.method564((byte) 94) << 16 & 16711680) + ((255 & arg1.method564((byte) 97)) << 8) - -(arg1.method564((byte) 65) & 255);
                                        if (class51.field839[var9][var10] == null) {
                                            class51.field839[var9][var10] = new int[4096];
                                        }
                                        --var16;
                                        class34 var17 = class146.method1040(-100, var16);
                                        if (var17.field528 != null) {
                                            var17 = var17.method203(-115);
                                            if (var17 == null || var17.field509 == -1) {
                                                continue;
                                            }
                                        }
                                        class51.field839[var9][var10][(63 - var12 << 6) + var11] = var17.field508 + 1;
                                        class143 var18 = new class143();
                                        var18.field2505 = var8;
                                        var18.field2508 = var7;
                                        var18.field2513 = var17.field509;
                                        class134.field2386.method547(104, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; ~(!var2 ? 4096 : 64) < ~var19; ++var19) {
                        int var20 = arg1.method564((byte) 122);
                        if (var20 != 0) {
                            if (~(var20 & 1) == -2) {
                                ++arg1.field1392;
                            }
                            if (~(var20 & 2) == -3) {
                                arg1.field1392 += 2;
                            }
                            if (~(4 & var20) == -5) {
                                arg1.field1392 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
    public static void method1320(int arg0) {
        field3447 = null;
        field3439 = null;
        field3434 = null;
        if (arg0 == -13566) {
            field3446 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Lk;")
    public static final class215 method1321(int arg0, int arg1) {
        ++field3433;
        class215 var2 = (class215) class41.field701.method990((long) arg1, (byte) -126);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 != 128) {
                field3446 = null;
            }
            byte[] var3 = class5.field68.method775(class152.method1074(73, arg1), class46.method269(arg0 ^ 255, arg1), -24799);
            class215 var4 = new class215();
            if (var3 != null) {
                var4.method1379(new class85(var3), -1);
            }
            var4.method1386(6579);
            class41.field701.method986(0, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)Ltj;")
    public static final class270 method1322(int arg0, boolean arg1) {
        ++field3436;
        if (!arg1) {
            return null;
        } else {
            return class160.field2812 && ~class31.field466 >= ~arg0 && ~arg0 >= ~class224.field3789 ? class139.field2425[-class31.field466 + arg0] : null;
        }
    }
}
