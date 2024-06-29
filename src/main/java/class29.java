import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class29 {

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lof;")
    private class242 field439;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
    public static boolean field433 = false;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[F")
    public static float[] field431 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lsf;")
    public static class108 field443 = class140.method973(255, "Jeter");

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lsf;")
    public static class108 field436 = class140.method973(255, ")4l=");

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lsf;")
    public static class108 field446 = class140.method973(255, "settings=");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lmc;")
    private class184 field444;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 4)
    public static final int method203(int arg0, int arg1) {
        field438++;
        int var2 = -24 / ((-arg1 - 41) / 32);
        return arg0 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Lmc;", line = 15)
    public final class184 method204(byte arg0) {
        field435++;
        if (this.field445 > 0 && this.field439.field4202[this.field445 - 1] != this.field444) {
            class184 var2 = this.field444;
            this.field444 = var2.field3373;
            return var2;
        }
        class184 var3;
        do {
            if (this.field439.field4204 <= this.field445) {
                if (arg0 != -121) {
                    method205(true);
                }
                return null;
            }
            var3 = this.field439.field4202[this.field445++].field3373;
        } while (this.field439.field4202[this.field445 - 1] == var3);
        this.field444 = var3.field3373;
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)[Lli;", line = 50)
    public static final class222[] method205(boolean arg0) {
        field429++;
        if (class256.field4513 == null) {
            class222[] var1 = class62.method434(class289.field5052, (byte) -112);
            int var2 = 0;
            class222[] var3 = new class222[var1.length];
            label59: for (int var4 = 0; var4 < var1.length; var4++) {
                class222 var5 = var1[var4];
                if ((var5.field3941 <= 0 || var5.field3941 >= 24) && var5.field3940 >= 800 && var5.field3944 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class222 var7 = var3[var6];
                        if (var5.field3940 == var7.field3940 && var5.field3944 == var7.field3944) {
                            if (var5.field3941 > var7.field3941) {
                                var3[var6] = var5;
                            }
                            continue label59;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class256.field4513 = new class222[var2];
            class23.method162(var3, 0, class256.field4513, 0, var2);
            int[] var8 = new int[class256.field4513.length];
            for (int var9 = 0; var9 < class256.field4513.length; var9++) {
                class222 var10 = class256.field4513[var9];
                var8[var9] = var10.field3944 * var10.field3940;
            }
            class269.method1948(class256.field4513, var8, -219);
        }
        if (!arg0) {
            method205(true);
        }
        return class256.field4513;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V", line = 128)
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field442++;
        if (class231.field4051) {
            class50.method345(arg4, arg0, arg4 + arg2, arg0 + arg3);
            class50.method348(arg4, arg0, arg2, arg3, 0);
        } else {
            class28.method185(arg4, arg0, arg2 + arg4, arg0 + arg3);
            class28.method193(arg4, arg0, arg2, arg3, 0);
        }
        if (class317.field5455 < 100) {
            return;
        }
        if (class156.field2807 == null || class156.field2807.field2347 != arg2 || class156.field2807.field2329 != arg3) {
            class12 var5 = new class12(arg2, arg3);
            class28.method189(var5.field141, arg2, arg3);
            class286.method2049(0, class74.field1113, arg3, 192, 0, 0, arg2, 0, class152.field2757);
            if (class231.field4051) {
                class156.field2807 = new class49(var5);
            } else {
                class156.field2807 = var5;
            }
            if (class231.field4051) {
                class28.field427 = null;
            } else {
                class216.field3833.method1978((byte) -105);
            }
        }
        class156.field2807.method68(arg4, arg0);
        int var6 = class120.field2049 * arg2 / class74.field1113 + arg4;
        int var7 = arg0 + (class194.field3493 * arg3 / class152.field2757);
        int var8 = class140.field2466 * arg2 / class74.field1113;
        if (arg1 != 11797) {
            return;
        }
        int var9 = class84.field1345 * arg3 / class152.field2757;
        if (class231.field4051) {
            class50.method357(var6, var7, var8, var9, 16711680, 128);
            class50.method353(var6, var7, var8, var9, 16711680);
        } else {
            class28.method186(var6, var7, var8, var9, 16711680, 128);
            class28.method183(var6, var7, var8, var9, 16711680);
        }
        if (class286.field5011 <= 0 || class286.field5011 % 10 >= 5) {
            return;
        }
        for (class176 var10 = (class176) class249.field4372.method13(0); var10 != null; var10 = (class176) class249.field4372.method15((byte) 47)) {
            if (class145.field2620 == var10.field3201) {
                int var11 = var10.field3208 * arg3 / class152.field2757 + arg0;
                int var12 = var10.field3199 * arg2 / class74.field1113 + arg4;
                if (class231.field4051) {
                    class50.method348(var12 - 2, var11 + -2, 4, 4, 16776960);
                } else {
                    class28.method193(var12 - 2, var11 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[Lcl;)V", line = 216)
    public static final void method207(int arg0, class133[] arg1) {
        class36.field499[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I", line = 221)
    public static final int method208(int arg0) {
        field437++;
        if (arg0 != 0) {
            field431 = (float[]) null;
        }
        return class10.field127.method636(-8590);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 239)
    public static void method209(int arg0) {
        if (arg0 <= -51) {
            field436 = null;
            field446 = null;
            field431 = null;
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 253)
    public static final void method210(int arg0) {
        class163.method1130(false, arg0 + 18262);
        class105.field1817 = 0;
        field440++;
        boolean var1 = true;
        for (int var2 = 0; var2 < class322.field5513.length; var2++) {
            if (class322.field5505[var2] != -1 && class322.field5513[var2] == null) {
                class322.field5513[var2] = class247.field4277.method1868(12236, class322.field5505[var2], 0);
                if (class322.field5513[var2] == null) {
                    class105.field1817++;
                    var1 = false;
                }
            }
            if (class237.field4152[var2] != -1 && class144.field2539[var2] == null) {
                class144.field2539[var2] = class247.field4277.method1860(true, class237.field4152[var2], 0, class242.field4214[var2]);
                if (class144.field2539[var2] == null) {
                    var1 = false;
                    class105.field1817++;
                }
            }
            if (class231.field4051) {
                if (class242.field4208[var2] != -1 && class251.field4376[var2] == null) {
                    class251.field4376[var2] = class247.field4277.method1868(12236, class242.field4208[var2], 0);
                    if (class251.field4376[var2] == null) {
                        class105.field1817++;
                        var1 = false;
                    }
                }
                if (class183.field3359[var2] != -1 && class129.field2216[var2] == null) {
                    class129.field2216[var2] = class247.field4277.method1868(arg0 + 19803, class183.field3359[var2], 0);
                    if (class129.field2216[var2] == null) {
                        var1 = false;
                        class105.field1817++;
                    }
                }
            }
            if (class186.field3425 != null && client.field4529[var2] == null && class186.field3425[var2] != -1) {
                client.field4529[var2] = class247.field4277.method1860(true, class186.field3425[var2], 0, class242.field4214[var2]);
                if (client.field4529[var2] == null) {
                    var1 = false;
                    class105.field1817++;
                }
            }
        }
        if (class297.field5180 == null) {
            if (class289.field5060 == null || !class210.field3763.method1891(-1, class117.method833(new class108[] { class289.field5060.field3170, class73.field1108 }, false))) {
                class297.field5180 = new class289(0);
            } else if (class210.field3763.method1865(class117.method833(new class108[] { class289.field5060.field3170, class73.field1108 }, false), -1)) {
                class297.field5180 = class255.method1800(class210.field3763, -116, class117.method833(new class108[] { class289.field5060.field3170, class73.field1108 }, false));
            } else {
                class105.field1817++;
                var1 = false;
            }
        }
        if (!var1) {
            class190.field3454 = 1;
            return;
        }
        boolean var3 = true;
        class155.field2793 = 0;
        for (int var4 = 0; var4 < class322.field5513.length; var4++) {
            byte[] var5 = class144.field2539[var4];
            if (var5 != null) {
                int var6 = (class57.field838[var4] & 0xFF) * 64 - class137.field2421;
                int var7 = (class57.field838[var4] >> 8) * 64 - class305.field5295;
                if (class304.field5277) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class206.method1444(true, var6, var7, var5);
            }
            if (class231.field4051) {
                byte[] var8 = class129.field2216[var4];
                if (var8 != null) {
                    int var9 = (class57.field838[var4] >> 8) * 64 - class305.field5295;
                    int var10 = (class57.field838[var4] & 0xFF) * 64 - class137.field2421;
                    if (class304.field5277) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class206.method1444(true, var10, var9, var8);
                }
            }
        }
        if (!var3) {
            class190.field3454 = 2;
            return;
        }
        if (class190.field3454 != 0) {
            class271.method1958((byte) 123, class117.method833(new class108[] { class286.field5012, class55.field809 }, false), true);
        }
        class212.method1460((byte) -16);
        class303.method2130(0);
        boolean var11 = false;
        if (class231.field4051 && class60.field962) {
            for (int var12 = 0; var12 < class322.field5513.length; var12++) {
                if (class129.field2216[var12] != null || class251.field4376[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class152.method1073(4, 104, 104, class231.field4051 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class330.field5644[var13].method2248(4256);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class166.field2980[var14][var15][var16] = 0;
                }
            }
        }
        if (arg0 != -7567) {
            field431 = (float[]) null;
        }
        class172.method1225(false, (byte) -112);
        if (class231.field4051) {
            class238.field4164.method1829();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class238.field4162[var17][var18].field3678 = true;
                }
            }
        }
        if (class231.field4051) {
            class267.method1937();
        }
        if (class231.field4051) {
            class93.method628(0);
        }
        class212.method1460((byte) -16);
        System.gc();
        class163.method1130(true, 10695);
        class84.method563(false, 104);
        if (!class304.field5277) {
            class201.method1422(8, false);
            class163.method1130(true, 10695);
            if (class231.field4051) {
                int var19 = class95.field1513.field4482[0] >> 3;
                int var20 = class95.field1513.field4498[0] >> 3;
                class114.method815(var19, var20, -22072);
            }
            class90.method610((byte) -54, false);
            if (client.field4529 != null) {
                class141.method978(-1);
            }
        }
        if (class304.field5277) {
            class317.method2204(false, -863066984);
            class163.method1130(true, 10695);
            if (class231.field4051) {
                int var21 = class95.field1513.field4498[0] >> 3;
                int var22 = class95.field1513.field4482[0] >> 3;
                class114.method815(var22, var21, -22072);
            }
            class160.method1110(-127, false);
        }
        class303.method2130(0);
        class163.method1130(true, 10695);
        class254.method1794(true, class330.field5644, false);
        if (class231.field4051) {
            class267.method1923();
        }
        class163.method1130(true, 10695);
        int var23 = class315.field5430;
        if (class295.field5159 < var23) {
            var23 = class295.field5159;
        }
        if (var23 < (class295.field5159 - 1)) {
            int var24 = class295.field5159 - 1;
        }
        if (class251.method1774(arg0 ^ 0xFFFFE1F6)) {
            class130.method898(0);
        } else {
            class130.method898(class315.field5430);
        }
        class269.method1947((byte) -68);
        if (class231.field4051 && var11) {
            class1.method2(true);
            class84.method563(true, 104);
            if (!class304.field5277) {
                class201.method1422(arg0 ^ 0xFFFFE279, true);
                class163.method1130(true, 10695);
                class90.method610((byte) -104, true);
            }
            if (class304.field5277) {
                class317.method2204(true, -863066984);
                class163.method1130(true, arg0 + 18262);
                class160.method1110(-118, true);
            }
            class303.method2130(0);
            class163.method1130(true, 10695);
            class254.method1794(true, class330.field5644, true);
            class163.method1130(true, 10695);
            class269.method1947((byte) -68);
            class1.method2(false);
        }
        if (class231.field4051) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class238.field4162[var25][var26].method1439(class278.field4883[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class132.method908(1, var28, var27);
            }
        }
        class79.method516(0);
        class212.method1460((byte) -16);
        class154.method1078((byte) -3);
        class303.method2130(0);
        class278.field4884 = false;
        if (class273.field4805 != null && class14.field161 != null && class203.field3658 == 25) {
            class8.field98++;
            class256.field4471.method1427(189, 0);
            class256.field4471.method1741(1057001181, arg0 - 1580269505);
        }
        if (!class304.field5277) {
            int var29 = (class45.field653 + 6) / 8;
            int var30 = (class45.field653 - 6) / 8;
            int var31 = (class324.field5526 - 6) / 8;
            int var32 = (class324.field5526 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= (var29 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var30 || var29 < var33 || var34 < var31 || var34 > var32) {
                        class247.field4277.method1877(class117.method833(new class108[] { class45.field652, class79.method518(false, var33), class131.field2247, class79.method518(false, var34) }, false), (byte) 122);
                        class247.field4277.method1877(class117.method833(new class108[] { class141.field2479, class79.method518(false, var33), class131.field2247, class79.method518(false, var34) }, false), (byte) 100);
                    }
                }
            }
        }
        if (class203.field3658 == 28) {
            class312.method2177(10, (byte) -121);
        } else {
            class312.method2177(30, (byte) -125);
            if (class14.field161 != null) {
                class256.field4471.method1427(20, arg0 + 7567);
            }
        }
        class20.method134(-1);
        class212.method1460((byte) -16);
        class17.method123(0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIB)I", line = 754)
    public static final int method211(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class143.field2525) {
            arg0 = 1000000;
            class143.field2525 = false;
        }
        field430++;
        class186 var5 = class123.field2094[arg3][arg2];
        float var6 = var5.field3420;
        int var7 = var5.field3414;
        float var8 = var5.field3418;
        float var9 = ((float) arg1 * 0.1F + 0.7F) * var5.field3415;
        int var10 = var5.field3413;
        int var11 = var5.field3422;
        if (!class221.field3937) {
            var11 = 0;
        }
        if (arg4 <= 71) {
            field443 = (class108) null;
        }
        if (class161.field2885 != var7 || class22.field355 != var9 || class295.field5155 != var6 || class246.field4261 != var8 || class320.field5488 != var10 || class83.field1278 != var11) {
            class197.field3558 = class123.field2093;
            class156.field2821 = 0;
            class320.field5488 = var10;
            class277.field4862 = class195.field3521;
            class13.field156 = class26.field407;
            class141.field2481 = class83.field1293;
            class83.field1278 = var11;
            class295.field5155 = var6;
            class22.field355 = var9;
            class161.field2885 = var7;
            class304.field5283 = class281.field4924;
            class246.field4261 = var8;
            class287.field5014 = class293.field5128;
        }
        if (class156.field2821 < 65536) {
            class156.field2821 += arg0 * 250;
            if (class156.field2821 >= 65536) {
                class156.field2821 = 65536;
            }
            float var12 = (float) class156.field2821 / 65536.0F;
            float var13 = (float) (65536 - class156.field2821) / 65536.0F;
            class195.field3521 = class277.field4862 * var13 + class22.field355 * var12;
            int var14 = class156.field2821 >> 8;
            class123.field2093 = class295.field5155 * var12 + class197.field3558 * var13;
            class281.field4924 = class304.field5283 * var13 + class246.field4261 * var12;
            int var15 = 65536 - class156.field2821 >> 8;
            class26.field407 = ((class13.field156 & 0xFF00) * var15 + ((class320.field5488 & 0xFF00) * var14) & 0xFF0000) + ((class320.field5488 & 0xFF00FF) * var14 + (class13.field156 & 0xFF00FF) * var15 & 0xFF00FF00) >> 8;
            class83.field1293 = class83.field1278 * var14 + class141.field2481 * var15 >> 8;
            class293.field5128 = ((class287.field5014 & 0xFF00FF) * var15 + (class161.field2885 & 0xFF00FF) * var14 & 0xFF00FF00) + ((class287.field5014 & 0xFF00) * var15 + (class161.field2885 & 0xFF00) * var14 & 0xFF0000) >> 8;
        }
        class217.method1491(class293.field5128, class195.field3521, class123.field2093, class281.field4924);
        class217.method1488(class26.field407, class83.field1293);
        class217.method1496((float) class200.field3607, (float) class146.field2636, (float) class187.field3432);
        class217.method1489();
        return class26.field407;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILla;)V", line = 832)
    public static final void method212(int arg0, class139 arg1) {
        if (arg0 != 27551) {
            return;
        }
        class77 var2 = null;
        field434++;
        try {
            class205 var3 = arg1.method955(arg0 - 27551, "runescape");
            while (var3.field3686 == 0) {
                class83.method556(1L, 127);
            }
            if (var3.field3686 == 1) {
                var2 = (class77) var3.field3685;
                class249 var4 = class291.method2084(0);
                var2.method508(var4.field4314, var4.field4338, 19665, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method503((byte) -116);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Lmc;", line = 873)
    public final class184 method213(int arg0) {
        this.field445 = 0;
        field432++;
        if (arg0 != 895) {
            field446 = (class108) null;
        }
        return this.method204((byte) -121);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJII)Z", line = 908)
    public static final boolean method214(int arg0, long arg1, int arg2, int arg3) {
        field447++;
        int var5 = ((int) arg1 & 0x7F88E) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        if (arg0 != 65280) {
            method205(true);
        }
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class60 var8 = class201.method1424(var7, (byte) 93);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field939;
                var10 = var8.field899;
            } else {
                var9 = var8.field899;
                var10 = var8.field939;
            }
            int var11 = var8.field914;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class328.method2245(arg2, class95.field1513.field4482[0], 0, 2, true, var10, class95.field1513.field4498[0], var11, (byte) -101, 0, arg3, var9);
        } else {
            class328.method2245(arg2, class95.field1513.field4482[0], var5 + 1, 2, true, 0, class95.field1513.field4498[0], 0, (byte) -101, var6, arg3, 0);
        }
        class259.field4578 = 0;
        class307.field5344 = class170.field3041;
        class54.field792 = class87.field1382;
        class318.field5466 = 2;
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lof;)V", line = 958)
    public class29(class242 arg0) {
        this.field439 = arg0;
    }
}
