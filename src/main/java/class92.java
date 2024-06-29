import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class92 extends class98 {

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lma;")
    public class4 field1521;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field1527 = 1;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field1525 = 255;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field1530 = 0;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "F")
    public static float field1524;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Lw;")
    public static class107 field1528;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lic;")
    public static class263 field1519;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lff;")
    public static class3 field1523;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    public static final void method646(int arg0, byte arg1) {
        class43 var2 = class270.method1847(arg0, -10277, 2);
        var2.method339(true);
        field1522++;
        int var3 = -95 / ((7 - arg1) / 35);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lff;I)V")
    public static final void method647(class3 arg0, int arg1) {
        if (arg1 != 1) {
            field1525 = -61;
        }
        field1529++;
        class203.field3521 = arg0.method41(class134.field2409, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLi;I)V")
    public static final void method648(boolean arg0, class18 arg1, int arg2) {
        if (arg0) {
            int var3 = class168.field2954;
            int var4 = var3 * 956 / 503;
            class96.field1610.method1246((class232.field3979 - var4) / 2, 0, var4, var3);
            class192.field3321.method197(class232.field3979 / 2 - (class192.field3321.field1464 / 2), 18);
        }
        arg1.method117(class245.field4261, class232.field3979 / 2, class168.field2954 / 2 - 26, 16777215, -1);
        field1526++;
        int var5 = class168.field2954 / 2 - 18;
        class84.method607(class232.field3979 / 2 - 152, var5, arg2, 34, 9179409);
        class84.method607(class232.field3979 / 2 - 151, var5 - -1, 302, 32, 0);
        class84.method598(class232.field3979 / 2 - 150, var5 - -2, class119.field2212 * 3, 30, 9179409);
        class84.method598(class119.field2212 * 3 + class232.field3979 / 2 - 150, var5 + 2, 300 - (class119.field2212 * 3), 30, 0);
        arg1.method117(class9.field162, class232.field3979 / 2, class168.field2954 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public static final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1517++;
        if (arg2 != 18666) {
            method652(-120, false, -104);
        }
        if (arg4 > class9.field149 || client.field1994 > arg0) {
            return;
        }
        boolean var6;
        if (class9.field145 > arg3) {
            arg3 = class9.field145;
            var6 = false;
        } else if (class162.field2884 >= arg3) {
            var6 = true;
        } else {
            arg3 = class162.field2884;
            var6 = false;
        }
        boolean var7;
        if (class9.field145 > arg5) {
            var7 = false;
            arg5 = class9.field145;
        } else if (arg5 <= class162.field2884) {
            var7 = true;
        } else {
            arg5 = class162.field2884;
            var7 = false;
        }
        if (arg4 < client.field1994) {
            arg4 = client.field1994;
        } else {
            class36.method283(arg3, class229.field3939[arg4++], arg5, (byte) -98, arg1);
        }
        if (arg0 <= class9.field149) {
            class36.method283(arg3, class229.field3939[arg0--], arg5, (byte) -93, arg1);
        } else {
            arg0 = class9.field149;
        }
        if (var6 && var7) {
            for (int var8 = arg4; var8 <= arg0; var8++) {
                int[] var9 = class229.field3939[var8];
                var9[arg3] = var9[arg5] = arg1;
            }
        } else if (var6) {
            for (int var11 = arg4; var11 <= arg0; var11++) {
                class229.field3939[var11][arg3] = arg1;
            }
        } else if (var7) {
            for (int var10 = arg4; var10 <= arg0; var10++) {
                class229.field3939[var10][arg5] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1528 = null;
        field1519 = null;
        if (arg0 != 1) {
            field1519 = null;
        }
        field1523 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBIZ[[[Ldk;I)Z")
    public static final boolean method651(int arg0, byte arg1, int arg2, boolean arg3, class187[][][] arg4, int arg5) {
        byte var6 = arg3 ? 1 : (byte) (class51.field899 & 0xFF);
        if (arg1 != -55) {
            field1519 = null;
        }
        field1516++;
        if (class153.field2690[class216.field3712][arg2][arg0] == var6) {
            return false;
        } else if ((class132.field2376[class216.field3712][arg2][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class19.field318[var7] = arg2;
            int var31 = var7 + 1;
            class222.field3799[var7] = arg0;
            class153.field2690[class216.field3712][arg2][arg0] = var6;
            while (var31 != var8) {
                int var9 = (class19.field318[var8] & 0xFF285F) >> 16;
                int var10 = class19.field318[var8] & 0xFFFF;
                int var11 = class19.field318[var8] >> 24 & 0xFF;
                int var12 = class222.field3799[var8] & 0xFFFF;
                int var13 = (class222.field3799[var8] & 0xFFF330) >> 16;
                boolean var14 = false;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class132.field2376[class216.field3712][var10][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class216.field3712 + 1; var16 <= 3; var16++) {
                    if ((class132.field2376[var16][var10][var12] & 0x8) == 0) {
                        if (var15 && arg4[var16][var10][var12] != null) {
                            if (arg4[var16][var10][var12].field3281 != null) {
                                int var19 = class127.method969((byte) 121, var9);
                                if (arg4[var16][var10][var12].field3281.field306 == var19 || arg4[var16][var10][var12].field3281.field314 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class127.method969((byte) 118, var11);
                                    if (arg4[var16][var10][var12].field3281.field306 == var20 || arg4[var16][var10][var12].field3281.field314 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class127.method969((byte) 119, var13);
                                    if (arg4[var16][var10][var12].field3281.field306 == var21 || arg4[var16][var10][var12].field3281.field314 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var10][var12].field3274 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var10][var12].field3282; var22++) {
                                    int var23 = (int) (arg4[var16][var10][var12].field3274[var22].field1197 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg4[var16][var10][var12].field3274[var22].field1197 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var9 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class187 var26 = arg4[var16][var10][var12];
                        if (var26 != null && var26.field3282 > 0) {
                            for (int var27 = 0; var27 < var26.field3282; var27++) {
                                class70 var28 = var26.field3274[var27];
                                if (var28.field1208 != var28.field1205 || var28.field1211 != var28.field1204) {
                                    for (int var29 = var28.field1208; var29 <= var28.field1205; var29++) {
                                        for (int var30 = var28.field1204; var30 <= var28.field1211; var30++) {
                                            class153.field2690[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class153.field2690[var16][var10][var12] = var6;
                    }
                }
                if (var14) {
                    if (class173.field3022[class216.field3712 + 1][var10][var12] > class138.field2471[arg5]) {
                        class138.field2471[arg5] = class173.field3022[class216.field3712 + 1][var10][var12];
                    }
                    int var17 = var10 << 7;
                    int var18 = var12 << 7;
                    if (class9.field144[arg5] > var17) {
                        class9.field144[arg5] = var17;
                    } else if (var17 > class2.field19[arg5]) {
                        class2.field19[arg5] = var17;
                    }
                    if (class56.field966[arg5] > var18) {
                        class56.field966[arg5] = var18;
                    } else if (var18 > class50.field875[arg5]) {
                        class50.field875[arg5] = var18;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class153.field2690[class216.field3712][var10 - 1][var12] != var6) {
                        class19.field318[var31] = class45.method348(-754974720, class45.method348(var10 - 1, 1179648));
                        class222.field3799[var31] = class45.method348(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class153.field2690[class216.field3712][var10 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var10 - 1) >= 0 && class153.field2690[class216.field3712][var10 - 1][var12] != var6 && (class132.field2376[class216.field3712][var10][var12] & 0x4) == 0 && (class132.field2376[class216.field3712][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class19.field318[var31] = class45.method348(class45.method348(1179648, var10 - 1), 1375731712);
                            class222.field3799[var31] = class45.method348(var12, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class153.field2690[class216.field3712][var10 - 1][var12] = var6;
                        }
                        if (class153.field2690[class216.field3712][var10][var12] != var6) {
                            class19.field318[var31] = class45.method348(class45.method348(5373952, var10), 318767104);
                            class222.field3799[var31] = class45.method348(5439488, var12);
                            class153.field2690[class216.field3712][var10][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class153.field2690[class216.field3712][var10 + 1][var12] != var6 && (class132.field2376[class216.field3712][var10][var12] & 0x4) == 0 && (class132.field2376[class216.field3712][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class19.field318[var31] = class45.method348(-1845493760, class45.method348(5373952, var10 + 1));
                            class222.field3799[var31] = class45.method348(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class153.field2690[class216.field3712][var10 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class153.field2690[class216.field3712][var10 + 1][var12] != var6) {
                        class19.field318[var31] = class45.method348(class45.method348(var10 + 1, 9568256), 1392508928);
                        class222.field3799[var31] = class45.method348(var12, 9633792);
                        class153.field2690[class216.field3712][var10 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class153.field2690[class216.field3712][var10 - 1][var12] != var6 && (class132.field2376[class216.field3712][var10][var12] & 0x4) == 0 && (class132.field2376[class216.field3712][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class19.field318[var31] = class45.method348(class45.method348(13762560, var10 - 1), 301989888);
                            class222.field3799[var31] = class45.method348(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class153.field2690[class216.field3712][var10 - 1][var12] = var6;
                        }
                        if (class153.field2690[class216.field3712][var10][var12] != var6) {
                            class19.field318[var31] = class45.method348(-1828716544, class45.method348(var10, 13762560));
                            class222.field3799[var31] = class45.method348(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class153.field2690[class216.field3712][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class153.field2690[class216.field3712][var10 + 1][var12] != var6 && (class132.field2376[class216.field3712][var10][var12] & 0x4) == 0 && (class132.field2376[class216.field3712][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class19.field318[var31] = class45.method348(class45.method348(9568256, var10 + 1), -771751936);
                            class222.field3799[var31] = class45.method348(var12, 9633792);
                            class153.field2690[class216.field3712][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class138.field2471[arg5] != -1000000) {
                class138.field2471[arg5] += 10;
                class9.field144[arg5] -= 50;
                class2.field19[arg5] += 50;
                class50.field875[arg5] += 50;
                class56.field966[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lma;)V")
    public class92(class4 arg0) {
        this.field1521 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZI)V")
    public static final void method652(int arg0, boolean arg1, int arg2) {
        field1531++;
        if (arg1) {
            method649(9, 76, 110, -92, 105, -50);
        }
        class43 var3 = class270.method1847(arg2, -10277, 12);
        var3.method333(111);
        var3.field740 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)V")
    public static final void method653(byte arg0, int arg1) {
        field1532++;
        class10.field166.method82((byte) -109, arg1);
        if (arg0 != 4) {
            field1523 = null;
        }
    }
}
