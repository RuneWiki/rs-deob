import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class238 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "S")
    public static short field3624 = 205;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
    public static int[] field3626 = new int[200];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[[B")
    public static byte[][] field3623;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)[B", line = 5)
    public static final byte[] method1657(byte[] arg0, int arg1) {
        field3621++;
        int var2 = arg0.length;
        if (arg1 < 4) {
            field3624 = 23;
        }
        byte[] var3 = new byte[var2];
        class126.method947(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1658(byte arg0) {
        field3625++;
        class63.field847 = 0;
        if (arg0 <= 102) {
            field3626 = (int[]) null;
        }
        int var1 = (class39.field575.field4713 >> 7) + class327.field5054;
        int var2 = (class39.field575.field4731 >> 7) + class293.field4522;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class63.field847 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class63.field847 = 1;
        }
        if (class63.field847 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class63.field847 = 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1659(int arg0) {
        field3628++;
        class264.method1855(25, false);
        boolean var1 = true;
        class111.field1673 = 0;
        for (int var2 = 0; var2 < class137.field2069.length; var2++) {
            if (class63.field854[var2] != -1 && class137.field2069[var2] == null) {
                class137.field2069[var2] = class153.field2329.method696(0, (byte) 105, class63.field854[var2]);
                if (class137.field2069[var2] == null) {
                    class111.field1673++;
                    var1 = false;
                }
            }
            if (class51.field683[var2] != -1 && class299.field4605[var2] == null) {
                class299.field4605[var2] = class153.field2329.method695(73, class51.field683[var2], 0, class187.field2946[var2]);
                if (class299.field4605[var2] == null) {
                    var1 = false;
                    class111.field1673++;
                }
            }
            if (class73.field1058) {
                if (class331.field5116[var2] != -1 && class5.field67[var2] == null) {
                    class5.field67[var2] = class153.field2329.method696(0, (byte) 118, class331.field5116[var2]);
                    if (class5.field67[var2] == null) {
                        class111.field1673++;
                        var1 = false;
                    }
                }
                if (class226.field3459[var2] != -1 && class322.field4963[var2] == null) {
                    class322.field4963[var2] = class153.field2329.method696(0, (byte) 126, class226.field3459[var2]);
                    if (class322.field4963[var2] == null) {
                        class111.field1673++;
                        var1 = false;
                    }
                }
            }
            if (class110.field1653 != null && field3623[var2] == null && class110.field1653[var2] != -1) {
                field3623[var2] = class153.field2329.method695(114, class110.field1653[var2], 0, class187.field2946[var2]);
                if (field3623[var2] == null) {
                    var1 = false;
                    class111.field1673++;
                }
            }
        }
        if (class2.field23 == null) {
            if (class309.field4820 == null || !class172.field2773.method712(class309.field4820.field4049 + "_labels", -112)) {
                class2.field23 = new class25(0);
            } else if (class172.field2773.method686(class309.field4820.field4049 + "_labels", (byte) 25)) {
                class2.field23 = class94.method683(class172.field2773, class309.field4820.field4049 + "_labels", (byte) -44);
            } else {
                class111.field1673++;
                var1 = false;
            }
        }
        if (!var1) {
            class178.field2837 = 1;
            return;
        }
        boolean var3 = true;
        class233.field3541 = 0;
        for (int var4 = 0; var4 < class137.field2069.length; var4++) {
            byte[] var5 = class299.field4605[var4];
            if (var5 != null) {
                int var6 = (class139.field2087[var4] >> 8) * 64 - class327.field5054;
                int var7 = (class139.field2087[var4] & 0xFF) * 64 - class293.field4522;
                if (class76.field1113) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class4.method33(var7, var6, var5, 1);
            }
            if (class73.field1058) {
                byte[] var8 = class322.field4963[var4];
                if (var8 != null) {
                    int var9 = (class139.field2087[var4] >> 8) * 64 - class327.field5054;
                    int var10 = (class139.field2087[var4] & 0xFF) * 64 - class293.field4522;
                    if (class76.field1113) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class4.method33(var10, var9, var8, 1);
                }
            }
        }
        if (!var3) {
            class178.field2837 = 2;
            return;
        }
        if (class178.field2837 != 0) {
            class97.method729(29912, true, class286.field4447 + "<br>(100%)");
        }
        class293.method2025((byte) 74);
        class267.method1874((byte) 45);
        boolean var11 = false;
        if (class73.field1058 && class122.field1874) {
            for (int var12 = 0; var12 < class137.field2069.length; var12++) {
                if (class322.field4963[var12] != null || class5.field67[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class21.method170(4, 104, 104, class73.field1058 ? 28 : 25, var11);
        int var13 = 0;
        if (arg0 >= -83) {
            field3626 = (int[]) null;
        }
        while (var13 < 4) {
            class91.field1323[var13].method2386(12908);
            var13++;
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class324.field5005[var14][var15][var16] = 0;
                }
            }
        }
        class159.method1190(true, false);
        if (class73.field1058) {
            class125.field1892.method327();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class125.field1893[var17][var18].field1825 = true;
                }
            }
        }
        if (class73.field1058) {
            class315.method2156();
        }
        if (class73.field1058) {
            class34.method268(29620);
        }
        class293.method2025((byte) 91);
        System.gc();
        class264.method1855(25, true);
        class294.method2032(false, 124);
        if (!class76.field1113) {
            class78.method608(0, false);
            class264.method1855(25, true);
            if (class73.field1058) {
                int var19 = class39.field575.field4744[0] >> 3;
                int var20 = class39.field575.field4676[0] >> 3;
                class118.method904((byte) -42, var20, var19);
            }
            class89.method652(false, (byte) -95);
            if (field3623 != null) {
                class265.method1861(-9246);
            }
        }
        if (class76.field1113) {
            class138.method1043(57408375, false);
            class264.method1855(25, true);
            if (class73.field1058) {
                int var21 = class39.field575.field4676[0] >> 3;
                int var22 = class39.field575.field4744[0] >> 3;
                class118.method904((byte) -42, var21, var22);
            }
            class40.method309(-16702, false);
        }
        class267.method1874((byte) 56);
        class264.method1855(25, true);
        class314.method2145(class91.field1323, false, 108, class76.field1113 ? class262.field4040 : (int[][][]) null);
        if (class73.field1058) {
            class315.method2164();
        }
        class264.method1855(25, true);
        int var23 = class174.field2811;
        if (class265.field4112 < var23) {
            var23 = class265.field4112;
        }
        if ((class265.field4112 - 1) > var23) {
            int var24 = class265.field4112 - 1;
        }
        if (class110.method841((byte) 88)) {
            class79.method614(0);
        } else {
            class79.method614(class174.field2811);
        }
        class7.method68(-1777);
        if (class73.field1058 && var11) {
            class8.method81(true);
            class294.method2032(true, 124);
            if (!class76.field1113) {
                class78.method608(0, true);
                class264.method1855(25, true);
                class89.method652(true, (byte) -95);
            }
            if (class76.field1113) {
                class138.method1043(57408375, true);
                class264.method1855(25, true);
                class40.method309(-16702, true);
            }
            class267.method1874((byte) 24);
            class264.method1855(25, true);
            class314.method2145(class91.field1323, true, 127, class76.field1113 ? class262.field4040 : (int[][][]) null);
            class264.method1855(25, true);
            class7.method68(-1777);
            class8.method81(false);
        }
        if (class73.field1058) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class125.field1893[var25][var26].method892(class203.field3111[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class27.method205(var28, true, var27);
            }
        }
        class60.method420((byte) -114);
        class293.method2025((byte) 113);
        class307.method2107((byte) -72);
        class267.method1874((byte) 105);
        class47.field654 = false;
        if (class73.field1058) {
            class294.method2029(false, true);
        }
        if (class254.field3878 != null && class1.field20 != null && class152.field2308 == 25) {
            class85.field1236.method1141((byte) 105, 12);
            class85.field1236.method1773(1057001181, false);
            class135.field2053++;
        }
        if (!class76.field1113) {
            int var29 = (class305.field4773 + 6) / 8;
            int var30 = (class305.field4773 - 6) / 8;
            int var31 = (class234.field3559 - 6) / 8;
            int var32 = (class234.field3559 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= var29 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var30 > var33 || var33 > var29 || var31 > var34 || var32 < var34) {
                        class153.field2329.method699(82, "m" + var33 + "_" + var34);
                        class153.field2329.method699(97, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class152.field2308 == 28) {
            class101.method758(125, 10);
        } else {
            class101.method758(127, 30);
            if (class1.field20 != null) {
                class85.field1236.method1141((byte) 71, 172);
            }
        }
        class31.method240(16699);
        class293.method2025((byte) 60);
        class168.method1272(118);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I", line = 556)
    public static final int method1660(int arg0, int arg1, int arg2) {
        field3627++;
        if (arg2 != 0) {
            method1661(95, (char) 65416);
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IC)Z", line = 582)
    public static final boolean method1661(int arg0, char arg1) {
        if (arg0 != -13287) {
            field3624 = -125;
        }
        field3622++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 598)
    public static void method1662(int arg0) {
        field3623 = (byte[][]) null;
        if (arg0 != 4794) {
            method1659(36);
        }
        field3626 = null;
    }
}
