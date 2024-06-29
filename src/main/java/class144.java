import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class144 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljd;")
    public static class85 field2472 = null;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Ljd;")
    public static class85 field2471 = class221.method1499("_", (byte) -93);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljd;")
    public static class85 field2479 = class221.method1499("Standort", (byte) 85);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[Lfg;")
    public static class12[] field2473;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILik;IZIIIZ)V")
    public static final void method941(int arg0, int arg1, class247 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field2470++;
        if (arg8) {
            method945(-69, -114, (byte) -63, 34);
        }
        if (arg5 < 0 || arg5 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var11 = arg2.method1711((byte) -67);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method1711((byte) -67);
                    return;
                }
                if (var11 <= 49) {
                    arg2.method1711((byte) -67);
                }
            }
        }
        if (!arg4) {
            class228.field3952[arg7][arg5][arg6] = 0;
        }
        while (true) {
            int var9 = arg2.method1711((byte) -67);
            if (var9 == 0) {
                if (arg4) {
                    class245.field4193[0][arg5][arg6] = class225.field3920[0][arg5][arg6];
                    return;
                } else if (arg7 == 0) {
                    class245.field4193[0][arg5][arg6] = -class134.method894(arg6 + arg0 + 556238, arg5 + 932731 + arg1, -127) * 8;
                    return;
                } else {
                    class245.field4193[arg7][arg5][arg6] = class245.field4193[arg7 - 1][arg5][arg6] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg2.method1711((byte) -67);
                if (arg4) {
                    class245.field4193[0][arg5][arg6] = var10 * 8 + class225.field3920[0][arg5][arg6];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    class245.field4193[0][arg5][arg6] = -var10 * 8;
                    return;
                }
                class245.field4193[arg7][arg5][arg6] = class245.field4193[arg7 - 1][arg5][arg6] - (var10 * 8);
                return;
            }
            if (var9 <= 49) {
                class151.field2557[arg7][arg5][arg6] = arg2.method1690(true);
                class49.field871[arg7][arg5][arg6] = (byte) ((var9 - 2) / 4);
                class242.field4154[arg7][arg5][arg6] = (byte) class135.method899(arg3 + var9 - 2, 3);
            } else if (var9 > 81) {
                class229.field3964[arg7][arg5][arg6] = (byte) (var9 - 81);
            } else if (!arg4) {
                class228.field3952[arg7][arg5][arg6] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvb;I)V")
    public static final void method942(class58 arg0, int arg1) {
        field2476++;
        int var2 = arg0.field1035 - class151.field2555;
        int var3 = arg0.field1017 * 128 + arg0.method311((byte) -104) * 64;
        int var4 = arg0.field1021 * 128 + arg0.method311((byte) -111) * 64;
        arg0.field1027 += (var4 - arg0.field1027) / var2;
        arg0.field1029 = 0;
        arg0.field1042 += (var3 - arg0.field1042) / var2;
        if (arg0.field1059 == 0) {
            arg0.field1047 = 1024;
        }
        if (arg0.field1059 == 1) {
            arg0.field1047 = 1536;
        }
        if (arg0.field1059 == 2) {
            arg0.field1047 = 0;
        }
        if (arg0.field1059 == 3) {
            arg0.field1047 = 512;
        }
        if (arg1 <= 126) {
            field2471 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2472 = null;
        field2471 = null;
        field2473 = null;
        field2479 = null;
        if (arg0 != 2) {
            method947(-65, (class247) null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static final void method944(int arg0) {
        if (arg0 != 5884) {
            field2471 = null;
        }
        class15.field208.method1262(arg0 ^ 0x55A0);
        field2478++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBI)I")
    public static final int method945(int arg0, int arg1, byte arg2, int arg3) {
        field2477++;
        if (arg2 != -116) {
            return 110;
        } else if (arg0 < arg1) {
            return arg1;
        } else if (arg3 >= arg0) {
            return arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lee;[Lc;[Lc;[Lc;[Lc;Lge;I)V")
    public static final void method946(class266[] arg0, class103[] arg1, class103[] arg2, class103[] arg3, class103[] arg4, class68 arg5, int arg6) {
        class28.field434 = arg2;
        class118.field2105 = arg3;
        class255.field4427 = arg1;
        field2481++;
        class94.field1727 = arg0;
        int var7 = -99 % ((-arg6 - 7) / 61);
        class236.field4074 = arg4;
        class272.field4807 = arg5;
        class125.field2209.method112(89);
        int var8 = class272.field4807.method482(-74, class54.field949);
        int[] var9 = class272.field4807.method452(var8, 0);
        for (int var10 = 0; var10 < var9.length; var10++) {
            class125.field2209.method116((byte) -121, class152.method1001((byte) -49, new class247(class272.field4807.method464(-1, var8, var9[var10]))));
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILik;)Lwa;")
    public static final class245 method947(int arg0, class247 arg1) {
        if (arg0 < 117) {
            method943(-90);
        }
        field2474++;
        return new class245(arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1691(19388), arg1.method1711((byte) -67));
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljb;IIIZ)V")
    public static final void method948(class255 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2480++;
        if (arg4) {
            method941(82, 64, (class247) null, -72, true, 19, -43, -109, true);
        }
        if (class219.field3861 < 3) {
            ((class266) class22.field313).method48(arg3, arg1, arg0.field4513, arg0.field4482, class22.field313.field184 / 2, class22.field313.field183 / 2, class30.field450, 256, arg0.field4490, arg0.field4491);
        } else {
            class179.method1211(arg3, arg1, 0, arg0.field4490, arg0.field4491);
        }
        class217.field3803[arg2] = true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIII)V")
    public static final void method949(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2475++;
        class50.field873++;
        if (!arg0) {
            class169.method1135(true, (byte) 6);
            class25.method162(127, true);
            class169.method1135(false, (byte) -8);
        }
        class25.method162(127, false);
        if (!arg0) {
            class16.method123(-391352048);
        }
        class235.method1572((byte) 54);
        if (class273.field4825 == 1) {
            int var6 = class30.field450 + class242.field4155 & 0x7FF;
            int var7 = class199.field3413;
            if (var7 < (class113.field1979 / 256)) {
                var7 = class113.field1979 / 256;
            }
            if (class97.field1756[4] && var7 < class161.field2760[4] + 128) {
                var7 = class161.field2760[4] + 128;
            }
            class27.method192(class61.field1104, 99, class246.method1660(arg3 ^ -604112572, class22.field308.field1042, class116.field2066, class22.field308.field1027) - 50, var7, class86.field1613, arg1, var7 * 3 + 600, var6);
        }
        int var8 = class231.field3987;
        int var9 = class267.field4762;
        int var10 = class272.field4809;
        int var11 = class252.field4347;
        int var12 = class35.field547;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class97.field1756[var13]) {
                int var19 = (int) ((double) (class232.field4010[var13] * 2 + 1) * Math.random() + Math.sin((double) class119.field2125[var13] / 100.0D * (double) class35.field541[var13]) * (double) class161.field2760[var13] - (double) class232.field4010[var13]);
                if (var13 == 3) {
                    class35.field547 = class35.field547 + var19 & 0x7FF;
                }
                if (var13 == 1) {
                    class231.field3987 += var19;
                }
                if (var13 == 0) {
                    class267.field4762 += var19;
                }
                if (var13 == 2) {
                    class272.field4809 += var19;
                }
                if (var13 == 4) {
                    class252.field4347 += var19;
                    if (class252.field4347 < 128) {
                        class252.field4347 = 128;
                    }
                    if (class252.field4347 > 383) {
                        class252.field4347 = 383;
                    }
                }
            }
        }
        class213.method1462(-4137);
        class179.method1216(arg2, arg4, arg2 + arg5, arg4 - -arg1);
        class173.method1169();
        if (class52.field902 || class151.field2551 < arg2 || (arg2 + arg5) <= class151.field2551 || class194.field3315 < arg4 || arg4 + arg1 <= class194.field3315) {
            class108.field1904 = 0;
            class256.field4564 = false;
        } else {
            class256.field4564 = true;
            int var14 = class148.field2511;
            class108.field1904 = 0;
            int var15 = class51.field896;
            class272.field4810 = (class151.field2551 - arg2) * (var15 - var14) / arg5 + var14;
            int var16 = class194.field3317;
            int var17 = class240.field4137;
            class251.field4312 = (class194.field3315 - arg4) * (var17 - var16) / arg1 + var16;
        }
        class21.method145(30868);
        byte var18 = class226.method1526(arg3 + 13229) == 2 ? (byte) class50.field873 : 1;
        class179.method1222(arg2, arg4, arg5, arg1, 0);
        class261.method1787(class267.field4762, class231.field3987, class272.field4809, class252.field4347, class35.field547, class99.field1782, class215.field3775, class142.field2454, class182.field3107, class114.field2051, class5.field60, class116.field2066 + 1, var18, class22.field308.field1042 >> 7, class22.field308.field1027 >> 7);
        class21.method145(30868);
        class105.method725();
        class108.method749(arg4, 256, arg1, arg2, arg3 ^ 0xC1D2FAA2, arg5, 256);
        class78.method542(arg2, arg1, arg5, 256, arg4, 256, -10781);
        if (arg3 != -13117) {
            field2473 = null;
        }
        ((class122) class173.field2987).method838(-47, class218.field3820);
        class37.method247(arg2, arg1, arg5, 128, arg4);
        class272.field4809 = var10;
        class267.field4762 = var9;
        class252.field4347 = var11;
        class231.field3987 = var8;
        class35.field547 = var12;
        if (class210.field3678 && class55.field969.method1041((byte) -123) == 0) {
            class210.field3678 = false;
        }
        if (class210.field3678) {
            class179.method1222(arg2, arg4, arg5, arg1, 0);
            class163.method1083(false, true, class67.field1242);
        }
        if (!arg0 && !class210.field3678 && !class52.field902 && class151.field2551 >= arg2 && class151.field2551 < arg2 + arg5 && class194.field3315 >= arg4 && arg4 + arg1 > class194.field3315) {
            class132.method886(arg4, true, arg1, class151.field2551, arg5, arg2, class194.field3315);
        }
    }
}
