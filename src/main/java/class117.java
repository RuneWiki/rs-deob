import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class117 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Loh;")
    public static class258 field2072 = class153.method1046("mapfunction", 92);

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Loh;")
    public static class258 field2073 = class153.method1046("Ausw-=hlen", 109);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Loh;")
    private static class258 field2079 = class153.method1046("Connected to update server", 86);

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Loh;")
    public static class258 field2083 = class153.method1046("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 114);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Loh;")
    public static class258 field2069 = field2079;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Loh;")
    public static class258 field2077 = class153.method1046("Verbindung abgebrochen)3", 118);

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Loh;")
    public static class258 field2082 = class153.method1046("Update)2Liste geladen)3", 100);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lrm;")
    public static class113[] field2070;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZ)V", line = 13)
    public static final void method864(boolean arg0, boolean arg1) {
        if (!arg1) {
            field2075 = 124;
        }
        class11.field142 = arg0;
        field2080++;
        if (!class11.field142) {
            int var2 = class293.field5036.method1585(65280);
            int var3 = class293.field5036.method1568((byte) 58);
            int var4 = class293.field5036.method1615(-15);
            int var5 = (class241.field4184 - class293.field5036.field4051) / 16;
            class1.field8 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    class1.field8[var6][var7] = class293.field5036.method1576(-100);
                }
            }
            boolean var8 = false;
            int var9 = class293.field5036.method1615(-121);
            int var10 = class293.field5036.method1614(255);
            class268.field4668 = new int[var5];
            class144.field2427 = new int[var5];
            class132.field2302 = new byte[var5][];
            class276.field4764 = new int[var5];
            class84.field1427 = (byte[][]) null;
            class32.field383 = null;
            class146.field2482 = new byte[var5][];
            class58.field925 = new byte[var5][];
            if ((var4 / 8 == 48 || var4 / 8 == 49) && (var10 / 8) == 48) {
                var8 = true;
            }
            class243.field4217 = new int[var5];
            class231.field3990 = new int[var5];
            if ((var4 / 8) == 48 && var10 / 8 == 148) {
                var8 = true;
            }
            class191.field3383 = new byte[var5][];
            int var11 = 0;
            for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
                for (int var13 = (var10 - 6) / 8; var13 <= ((var10 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var8 && (var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || var12 == 49 && var13 == 47)) {
                        class231.field3990[var11] = var14;
                        class268.field4668[var11] = -1;
                        class276.field4764[var11] = -1;
                        class144.field2427[var11] = -1;
                        class243.field4217[var11] = -1;
                    } else {
                        class231.field3990[var11] = var14;
                        class268.field4668[var11] = class114.field2011.method1451(-126, class100.method755(-6, new class258[] { class93.field1642, class218.method1481(-72, var12), class255.field4374, class218.method1481(58, var13) }));
                        class276.field4764[var11] = class114.field2011.method1451(-127, class100.method755(-6, new class258[] { class220.field3806, class218.method1481(102, var12), class255.field4374, class218.method1481(71, var13) }));
                        class144.field2427[var11] = class114.field2011.method1451(-126, class100.method755(-6, new class258[] { class232.field4020, class218.method1481(-60, var12), class255.field4374, class218.method1481(-98, var13) }));
                        class243.field4217[var11] = class114.field2011.method1451(-126, class100.method755(-6, new class258[] { class83.field1412, class218.method1481(-103, var12), class255.field4374, class218.method1481(74, var13) }));
                    }
                    var11++;
                }
            }
            class201.method1334(var9, var4, var3, var2, false, -116, var10);
            return;
        }
        int var15 = class293.field5036.method1614(255);
        int var16 = class293.field5036.method1599(255);
        class293.field5036.method888(8);
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = class293.field5036.method881(1, (byte) -89);
                    if (var20 == 1) {
                        class148.field2511[var17][var18][var19] = class293.field5036.method881(26, (byte) -117);
                    } else {
                        class148.field2511[var17][var18][var19] = -1;
                    }
                }
            }
        }
        class293.field5036.method879((byte) 27);
        int var21 = (class241.field4184 - class293.field5036.field4051) / 16;
        class1.field8 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                class1.field8[var22][var23] = class293.field5036.method1584(true);
            }
        }
        int var24 = class293.field5036.method1615(-118);
        int var25 = class293.field5036.method1599(255);
        int var26 = class293.field5036.method1568((byte) 75);
        class243.field4217 = new int[var21];
        class191.field3383 = new byte[var21][];
        class58.field925 = new byte[var21][];
        class231.field3990 = new int[var21];
        class268.field4668 = new int[var21];
        class144.field2427 = new int[var21];
        class32.field383 = null;
        class146.field2482 = new byte[var21][];
        class132.field2302 = new byte[var21][];
        class276.field4764 = new int[var21];
        class84.field1427 = (byte[][]) null;
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class148.field2511[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = (var31 & 0xFFCB7F) >> 14;
                        int var33 = var31 >> 3 & 0x7FF;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class231.field3990[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            int var36 = var34 & 0xFF;
                            int var37 = (var34 & 0xFFC1) >> 8;
                            class231.field3990[var27] = var34;
                            class268.field4668[var27] = class114.field2011.method1451(-127, class100.method755(-6, new class258[] { class93.field1642, class218.method1481(106, var37), class255.field4374, class218.method1481(-52, var36) }));
                            class276.field4764[var27] = class114.field2011.method1451(-123, class100.method755(-6, new class258[] { class220.field3806, class218.method1481(-79, var37), class255.field4374, class218.method1481(92, var36) }));
                            class144.field2427[var27] = class114.field2011.method1451(-125, class100.method755(-6, new class258[] { class232.field4020, class218.method1481(-93, var37), class255.field4374, class218.method1481(-73, var36) }));
                            class243.field4217[var27] = class114.field2011.method1451(-125, class100.method755(-6, new class258[] { class83.field1412, class218.method1481(-51, var37), class255.field4374, class218.method1481(126, var36) }));
                            var27++;
                        }
                    }
                }
            }
        }
        class201.method1334(var24, var15, var26, var16, false, -103, var25);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lva;B)Llc;", line = 268)
    public static final class291 method865(class235 arg0, byte arg1) {
        if (arg1 != -24) {
            field2083 = (class258) null;
        }
        field2076++;
        return new class291(arg0.method1574(arg1 ^ 0x29), arg0.method1574(-76), arg0.method1574(-94), arg0.method1574(-50), arg0.method1574(-111), arg0.method1574(arg1 ^ 0x73), arg0.method1574(arg1 ^ 0x47), arg0.method1574(arg1 - 33), arg0.method1602(arg1 + 18184), arg0.method1589(arg1 ^ 0xFFFFFFDF));
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIBLgb;)Lvi;", line = 295)
    public static final class129 method866(int arg0, int arg1, byte arg2, class213 arg3) {
        if (arg2 != -56) {
            method869(-86);
        }
        field2074++;
        return class162.method1086(0, arg3, arg1, arg0) ? class210.method1389(arg2 ^ 0xFFFFFFC8) : null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 314)
    public static final void method867(int arg0) {
        class159.field2710.method885(202, -67);
        class159.field2710.method1603(0L, -1649350304);
        class190.field3356++;
        field2071++;
        int var1 = -31 % ((-arg0 - 4) / 46);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I", line = 328)
    public static final int method868(int arg0, int arg1) {
        field2078++;
        if (arg0 > -78) {
            field2084 = -117;
        }
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 356)
    public static void method869(int arg0) {
        field2083 = null;
        field2073 = null;
        if (arg0 != 1221034136) {
            method868(29, 30);
        }
        field2082 = null;
        field2077 = null;
        field2069 = null;
        field2072 = null;
        field2070 = null;
        field2079 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[[Llf;IIZII)Z", line = 386)
    public static final boolean method870(class228[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2081++;
        if (arg1 != -1) {
            method866(17, -121, (byte) 50, (class213) null);
        }
        byte var6 = arg3 ? 1 : (byte) (class61.field1035 & 0xFF);
        if (class8.field101[class272.field4704][arg4][arg5] == var6) {
            return false;
        } else if ((class94.field1653[class272.field4704][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class8.field109[var7] = arg4;
            int var31 = var7 + 1;
            class185.field3296[var7] = arg5;
            int var8 = 0;
            class8.field101[class272.field4704][arg4][arg5] = var6;
            while (var31 != var8) {
                int var9 = class8.field109[var8] & 0xFFFF;
                int var10 = (class8.field109[var8] & 0xFF01C6) >> 16;
                int var11 = class8.field109[var8] >> 24 & 0xFF;
                int var12 = class185.field3296[var8] & 0xFFFF;
                int var13 = (class185.field3296[var8] & 0xFF133E) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class94.field1653[class272.field4704][var9][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label243: for (int var16 = class272.field4704 + 1; var16 <= 3; var16++) {
                    if ((class94.field1653[var16][var9][var12] & 0x8) == 0) {
                        if (var15 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field3923 != null) {
                                int var17 = class42.method343(-24987, var10);
                                if (arg0[var16][var9][var12].field3923.field285 == var17 || arg0[var16][var9][var12].field3923.field288 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class42.method343(-24987, var11);
                                    if (arg0[var16][var9][var12].field3923.field285 == var18 || arg0[var16][var9][var12].field3923.field288 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class42.method343(-24987, var13);
                                    if (arg0[var16][var9][var12].field3923.field285 == var19 || arg0[var16][var9][var12].field3923.field288 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var12].field3932 != null) {
                                for (int var20 = 0; var20 < arg0[var16][var9][var12].field3950; var20++) {
                                    int var21 = (int) (arg0[var16][var9][var12].field3932[var20].field3795 >> 14 & 0x3FL);
                                    int var22 = (int) (arg0[var16][var9][var12].field3932[var20].field3795 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var13 != 0 && var13 == var23) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class228 var24 = arg0[var16][var9][var12];
                        if (var24 != null && var24.field3950 > 0) {
                            for (int var25 = 0; var25 < var24.field3950; var25++) {
                                class219 var26 = var24.field3932[var25];
                                if (var26.field3793 != var26.field3785 || var26.field3797 != var26.field3789) {
                                    for (int var27 = var26.field3793; var27 <= var26.field3785; var27++) {
                                        for (int var28 = var26.field3797; var28 <= var26.field3789; var28++) {
                                            class8.field101[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class8.field101[var16][var9][var12] = var6;
                    }
                }
                if (var14) {
                    if (class70.field1224[arg2] < class201.field3482[class272.field4704 + 1][var9][var12]) {
                        class70.field1224[arg2] = class201.field3482[class272.field4704 + 1][var9][var12];
                    }
                    int var29 = var9 << 7;
                    int var30 = var12 << 7;
                    if (class227.field3904[arg2] > var29) {
                        class227.field3904[arg2] = var29;
                    } else if (class16.field210[arg2] < var29) {
                        class16.field210[arg2] = var29;
                    }
                    if (class176.field3162[arg2] > var30) {
                        class176.field3162[arg2] = var30;
                    } else if (var30 > class188.field3338[arg2]) {
                        class188.field3338[arg2] = var30;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class8.field101[class272.field4704][var9 - 1][var12] != var6) {
                        class8.field109[var31] = class307.method2139(class307.method2139(var9 - 1, 1179648), -754974720);
                        class185.field3296[var31] = class307.method2139(1245184, var12);
                        class8.field101[class272.field4704][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class8.field101[class272.field4704][var9 - 1][var12] != var6 && (class94.field1653[class272.field4704][var9][var12] & 0x4) == 0 && (class94.field1653[class272.field4704][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class8.field109[var31] = class307.method2139(class307.method2139(var9 - 1, 1179648), 1375731712);
                            class185.field3296[var31] = class307.method2139(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class8.field101[class272.field4704][var9 - 1][var12] = var6;
                        }
                        if (class8.field101[class272.field4704][var9][var12] != var6) {
                            class8.field109[var31] = class307.method2139(class307.method2139(var9, 5373952), 318767104);
                            class185.field3296[var31] = class307.method2139(5439488, var12);
                            class8.field101[class272.field4704][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class8.field101[class272.field4704][var9 + 1][var12] != var6 && (class94.field1653[class272.field4704][var9][var12] & 0x4) == 0 && (class94.field1653[class272.field4704][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class8.field109[var31] = class307.method2139(-1845493760, class307.method2139(var9 + 1, 5373952));
                            class185.field3296[var31] = class307.method2139(var12, 5439488);
                            class8.field101[class272.field4704][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class8.field101[class272.field4704][var9 + 1][var12] != var6) {
                        class8.field109[var31] = class307.method2139(1392508928, class307.method2139(var9 + 1, 9568256));
                        class185.field3296[var31] = class307.method2139(9633792, var12);
                        class8.field101[class272.field4704][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class8.field101[class272.field4704][var9 - 1][var12] != var6 && (class94.field1653[class272.field4704][var9][var12] & 0x4) == 0 && (class94.field1653[class272.field4704][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class8.field109[var31] = class307.method2139(class307.method2139(var9 - 1, 13762560), 301989888);
                            class185.field3296[var31] = class307.method2139(var12, 13828096);
                            class8.field101[class272.field4704][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class8.field101[class272.field4704][var9][var12] != var6) {
                            class8.field109[var31] = class307.method2139(class307.method2139(var9, 13762560), -1828716544);
                            class185.field3296[var31] = class307.method2139(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class8.field101[class272.field4704][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class8.field101[class272.field4704][var9 + 1][var12] != var6 && (class94.field1653[class272.field4704][var9][var12] & 0x4) == 0 && (class94.field1653[class272.field4704][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class8.field109[var31] = class307.method2139(-771751936, class307.method2139(9568256, var9 + 1));
                            class185.field3296[var31] = class307.method2139(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class8.field101[class272.field4704][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class70.field1224[arg2] != -1000000) {
                class70.field1224[arg2] += 10;
                class227.field3904[arg2] -= 50;
                class16.field210[arg2] += 50;
                class188.field3338[arg2] += 50;
                class176.field3162[arg2] -= 50;
            }
            return true;
        }
    }
}
