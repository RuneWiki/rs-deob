import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class145 extends class222 {

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "Lsb;")
    public static class98 field2543 = class47.method368(")3)3)3", 0);

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "[Lsb;")
    public static class98[] field2546 = new class98[100];

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "[S")
    public static short[] field2548 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "Lsb;")
    public static class98 field2550 = class47.method368("www)2wtrc", 0);

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "Lsb;")
    public static class98 field2549 = class47.method368("<br>", 0);

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "Z")
    public static boolean field2541;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lp;Z)V")
    public static final void method1071(class71 arg0, boolean arg1) {
        class109.field1948.method376((byte) 13, arg0);
        while (true) {
            class71 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class71[][] var7;
            class71 var66;
            do {
                class71 var65;
                do {
                    class71 var64;
                    do {
                        class71 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class71) class109.field1948.method372(63);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1154);
                                            var3 = var2.field1152;
                                            var4 = var2.field1144;
                                            var5 = var2.field1151;
                                            var6 = var2.field1156;
                                            var7 = class31.field553[var5];
                                            if (!var2.field1150) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class71 var8 = class31.field553[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1154) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class101.field1786 && var3 > class223.field3851) {
                                                    class71 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1154 && (var9.field1150 || (var2.field1153 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class101.field1786 && var3 < class200.field3436 - 1) {
                                                    class71 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1154 && (var10.field1150 || (var2.field1153 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class82.field1455 && var4 > class162.field2935) {
                                                    class71 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1154 && (var11.field1150 || (var2.field1153 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class82.field1455 && var4 < class238.field4097 - 1) {
                                                    class71 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1154 && (var12.field1150 || (var2.field1153 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1150 = false;
                                            if (var2.field1161 != null) {
                                                class71 var13 = var2.field1161;
                                                if (var13.field1131 != null) {
                                                    if (!class229.method1578(0, var3, var4)) {
                                                        class120.method896(var13.field1131, 0, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, false);
                                                    } else {
                                                        class120.method896(var13.field1131, 0, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, true);
                                                    }
                                                } else if (var13.field1155 != null) {
                                                    if (!class229.method1578(0, var3, var4)) {
                                                        class15.method124(var13.field1155, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, false);
                                                    } else {
                                                        class15.method124(var13.field1155, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, true);
                                                    }
                                                }
                                                class225 var14 = var13.field1141;
                                                if (var14 != null) {
                                                    var14.field3880.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var14.field3873 - class120.field2196, var14.field3876 - class239.field4112, var14.field3877 - class154.field2810, var14.field3874);
                                                }
                                                for (int var15 = 0; var15 < var13.field1149; ++var15) {
                                                    class14 var16 = var13.field1140[var15];
                                                    if (var16 != null) {
                                                        var16.field273.method91(var16.field257, class46.field778, class189.field3264, class136.field2411, class14.field278, var16.field275 - class120.field2196, var16.field259 - class239.field4112, var16.field267 - class154.field2810, var16.field260);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1131 != null) {
                                                if (!class229.method1578(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field1131.field960 != 12345678 || class235.field4053 && var5 <= class204.field3488) {
                                                        class120.method896(var2.field1131, var6, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, false);
                                                    }
                                                } else {
                                                    class120.method896(var2.field1131, var6, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, true);
                                                }
                                            } else if (var2.field1155 != null) {
                                                if (!class229.method1578(var6, var3, var4)) {
                                                    var17 = true;
                                                    class15.method124(var2.field1155, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, false);
                                                } else {
                                                    class15.method124(var2.field1155, class46.field778, class189.field3264, class136.field2411, class14.field278, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class53 var18 = var2.field1132;
                                                if (var18 != null && (var18.field852 & 2147483648L) != 0L) {
                                                    var18.field851.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var18.field848 - class120.field2196, var18.field853 - class239.field4112, var18.field850 - class154.field2810, var18.field852);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class225 var21 = var2.field1141;
                                            class207 var22 = var2.field1157;
                                            if (var21 != null || var22 != null) {
                                                if (class101.field1786 == var3) {
                                                    ++var19;
                                                } else if (class101.field1786 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class82.field1455 == var4) {
                                                    var19 += 3;
                                                } else if (class82.field1455 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class53.field855[var19];
                                                var2.field1138 = class67.field1078[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3882 & class254.field4442[var19]) != 0) {
                                                    if (var21.field3882 == 16) {
                                                        var2.field1137 = 3;
                                                        var2.field1134 = class199.field3419[var19];
                                                        var2.field1136 = 3 - var2.field1134;
                                                    } else if (var21.field3882 == 32) {
                                                        var2.field1137 = 6;
                                                        var2.field1134 = class69.field1108[var19];
                                                        var2.field1136 = 6 - var2.field1134;
                                                    } else if (var21.field3882 == 64) {
                                                        var2.field1137 = 12;
                                                        var2.field1134 = class161.field2916[var19];
                                                        var2.field1136 = 12 - var2.field1134;
                                                    } else {
                                                        var2.field1137 = 9;
                                                        var2.field1134 = class100.field1757[var19];
                                                        var2.field1136 = 9 - var2.field1134;
                                                    }
                                                } else {
                                                    var2.field1137 = 0;
                                                }
                                                if ((var21.field3882 & var20) != 0 && !class117.method872(var6, var3, var4, var21.field3882)) {
                                                    var21.field3880.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var21.field3873 - class120.field2196, var21.field3876 - class239.field4112, var21.field3877 - class154.field2810, var21.field3874);
                                                }
                                                if ((var21.field3884 & var20) != 0 && !class117.method872(var6, var3, var4, var21.field3884)) {
                                                    var21.field3878.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var21.field3873 - class120.field2196, var21.field3876 - class239.field4112, var21.field3877 - class154.field2810, var21.field3874);
                                                }
                                            }
                                            if (var22 != null && !class107.method819(var6, var3, var4, var22.field3533.method90())) {
                                                if ((var22.field3544 & var20) != 0) {
                                                    var22.field3533.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var22.field3540 - class120.field2196 + var22.field3541, var22.field3534 - class239.field4112, var22.field3542 - class154.field2810 + var22.field3532, var22.field3535);
                                                } else if (var22.field3544 == 256) {
                                                    int var23 = var22.field3540 - class120.field2196;
                                                    int var24 = var22.field3534 - class239.field4112;
                                                    int var25 = var22.field3542 - class154.field2810;
                                                    int var26 = var22.field3543;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3533.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var22.field3541 + var23, var24, var22.field3532 + var25, var22.field3535);
                                                    } else if (var22.field3539 != null) {
                                                        var22.field3539.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var23, var24, var25, var22.field3535);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class53 var29 = var2.field1132;
                                                if (var29 != null && (var29.field852 & 2147483648L) == 0L) {
                                                    var29.field851.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var29.field848 - class120.field2196, var29.field853 - class239.field4112, var29.field850 - class154.field2810, var29.field852);
                                                }
                                                class205 var30 = var2.field1133;
                                                if (var30 != null && var30.field3505 == 0) {
                                                    if (var30.field3495 != null) {
                                                        var30.field3495.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var30.field3496 - class120.field2196, var30.field3504 - class239.field4112, var30.field3502 - class154.field2810, var30.field3510);
                                                    }
                                                    if (var30.field3497 != null) {
                                                        var30.field3497.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var30.field3496 - class120.field2196, var30.field3504 - class239.field4112, var30.field3502 - class154.field2810, var30.field3510);
                                                    }
                                                    if (var30.field3499 != null) {
                                                        var30.field3499.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var30.field3496 - class120.field2196, var30.field3504 - class239.field4112, var30.field3502 - class154.field2810, var30.field3510);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1153;
                                            if (var31 != 0) {
                                                if (var3 < class101.field1786 && (var31 & 4) != 0) {
                                                    class71 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1154) {
                                                        class109.field1948.method376((byte) 13, var32);
                                                    }
                                                }
                                                if (var4 < class82.field1455 && (var31 & 2) != 0) {
                                                    class71 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1154) {
                                                        class109.field1948.method376((byte) 13, var33);
                                                    }
                                                }
                                                if (var3 > class101.field1786 && (var31 & 1) != 0) {
                                                    class71 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1154) {
                                                        class109.field1948.method376((byte) 13, var34);
                                                    }
                                                }
                                                if (var4 > class82.field1455 && (var31 & 8) != 0) {
                                                    class71 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1154) {
                                                        class109.field1948.method376((byte) 13, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1137 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1149; ++var37) {
                                                if (class1.field11 != var2.field1140[var37].field272 && (var2.field1159[var37] & var2.field1137) == var2.field1134) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class225 var38 = var2.field1141;
                                                if (!class117.method872(var6, var3, var4, var38.field3882)) {
                                                    var38.field3880.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var38.field3873 - class120.field2196, var38.field3876 - class239.field4112, var38.field3877 - class154.field2810, var38.field3874);
                                                }
                                                var2.field1137 = 0;
                                            }
                                        }
                                        if (!var2.field1146) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1149;
                                            var2.field1146 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class14 var42 = var2.field1140[var41];
                                                if (class1.field11 != var42.field272) {
                                                    for (int var43 = var42.field268; var43 <= var42.field255; ++var43) {
                                                        for (int var44 = var42.field256; var44 <= var42.field277; ++var44) {
                                                            class71 var45 = var7[var43][var44];
                                                            if (var45.field1150) {
                                                                var2.field1146 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1137 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field268) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field255) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field256) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field277) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1137) == var2.field1136) {
                                                                    var2.field1146 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class171.field3019[var40++] = var42;
                                                    int var47 = class101.field1786 - var42.field268;
                                                    int var48 = var42.field255 - class101.field1786;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class82.field1455 - var42.field256;
                                                    int var50 = var42.field277 - class82.field1455;
                                                    if (var50 > var49) {
                                                        var42.field270 = var47 + var50;
                                                    } else {
                                                        var42.field270 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class14 var54 = class171.field3019[var53];
                                                    if (class1.field11 != var54.field272) {
                                                        if (var54.field270 > var51) {
                                                            var51 = var54.field270;
                                                            var52 = var53;
                                                        } else if (var54.field270 == var51) {
                                                            int var55 = var54.field275 - class120.field2196;
                                                            int var56 = var54.field267 - class154.field2810;
                                                            int var57 = class171.field3019[var52].field275 - class120.field2196;
                                                            int var58 = class171.field3019[var52].field267 - class154.field2810;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class14 var59 = class171.field3019[var52];
                                                var59.field272 = class1.field11;
                                                if (!class138.method1042(var6, var59.field268, var59.field255, var59.field256, var59.field277, var59.field273.method90())) {
                                                    var59.field273.method91(var59.field257, class46.field778, class189.field3264, class136.field2411, class14.field278, var59.field275 - class120.field2196, var59.field259 - class239.field4112, var59.field267 - class154.field2810, var59.field260);
                                                }
                                                for (int var60 = var59.field268; var60 <= var59.field255; ++var60) {
                                                    for (int var61 = var59.field256; var61 <= var59.field277; ++var61) {
                                                        class71 var62 = var7[var60][var61];
                                                        if (var62.field1137 != 0) {
                                                            class109.field1948.method376((byte) 13, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1154) {
                                                            class109.field1948.method376((byte) 13, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1146) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1146 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1154);
                            } while (var2.field1137 != 0);
                            if (var3 > class101.field1786 || var3 <= class223.field3851) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1154);
                        if (var3 < class101.field1786 || var3 >= class200.field3436 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1154);
                    if (var4 > class82.field1455 || var4 <= class162.field2935) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1154);
                if (var4 < class82.field1455 || var4 >= class238.field4097 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1154);
            var2.field1154 = false;
            --class81.field1435;
            class205 var67 = var2.field1133;
            if (var67 != null && var67.field3505 != 0) {
                if (var67.field3495 != null) {
                    var67.field3495.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var67.field3496 - class120.field2196, var67.field3504 - class239.field4112 - var67.field3505, var67.field3502 - class154.field2810, var67.field3510);
                }
                if (var67.field3497 != null) {
                    var67.field3497.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var67.field3496 - class120.field2196, var67.field3504 - class239.field4112 - var67.field3505, var67.field3502 - class154.field2810, var67.field3510);
                }
                if (var67.field3499 != null) {
                    var67.field3499.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var67.field3496 - class120.field2196, var67.field3504 - class239.field4112 - var67.field3505, var67.field3502 - class154.field2810, var67.field3510);
                }
            }
            if (var2.field1138 != 0) {
                class207 var68 = var2.field1157;
                if (var68 != null && !class107.method819(var6, var3, var4, var68.field3533.method90())) {
                    if ((var68.field3544 & var2.field1138) != 0) {
                        var68.field3533.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var68.field3540 - class120.field2196 + var68.field3541, var68.field3534 - class239.field4112, var68.field3542 - class154.field2810 + var68.field3532, var68.field3535);
                    } else if (var68.field3544 == 256) {
                        int var69 = var68.field3540 - class120.field2196;
                        int var70 = var68.field3534 - class239.field4112;
                        int var71 = var68.field3542 - class154.field2810;
                        int var72 = var68.field3543;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field3533.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var68.field3541 + var69, var70, var68.field3532 + var71, var68.field3535);
                        } else if (var68.field3539 != null) {
                            var68.field3539.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var69, var70, var71, var68.field3535);
                        }
                    }
                }
                class225 var75 = var2.field1141;
                if (var75 != null) {
                    if ((var75.field3884 & var2.field1138) != 0 && !class117.method872(var6, var3, var4, var75.field3884)) {
                        var75.field3878.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var75.field3873 - class120.field2196, var75.field3876 - class239.field4112, var75.field3877 - class154.field2810, var75.field3874);
                    }
                    if ((var75.field3882 & var2.field1138) != 0 && !class117.method872(var6, var3, var4, var75.field3882)) {
                        var75.field3880.method91(0, class46.field778, class189.field3264, class136.field2411, class14.field278, var75.field3873 - class120.field2196, var75.field3876 - class239.field4112, var75.field3877 - class154.field2810, var75.field3874);
                    }
                }
            }
            if (var5 < class228.field3920 - 1) {
                class71 var76 = class31.field553[var5 + 1][var3][var4];
                if (var76 != null && var76.field1154) {
                    class109.field1948.method376((byte) 13, var76);
                }
            }
            if (var3 < class101.field1786) {
                class71 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1154) {
                    class109.field1948.method376((byte) 13, var77);
                }
            }
            if (var4 < class82.field1455) {
                class71 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1154) {
                    class109.field1948.method376((byte) 13, var78);
                }
            }
            if (var3 > class101.field1786) {
                class71 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1154) {
                    class109.field1948.method376((byte) 13, var79);
                }
            }
            if (var4 > class82.field1455) {
                class71 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1154) {
                    class109.field1948.method376((byte) 13, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field2549 = null;
        if (arg0 == 20541) {
            field2543 = null;
            field2546 = null;
            field2548 = null;
            field2550 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI)I")
    private final int method1073(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 * 57 + arg2;
        ++field2542;
        int var5 = var4 << 1 ^ var4;
        if (!arg1) {
            method1076(98);
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(III)V")
    public static final void method1074(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class228.field3920; ++var3) {
            for (int var4 = 0; var4 < class211.field3610; ++var4) {
                for (int var5 = 0; var5 < class72.field1194; ++var5) {
                    class71 var6 = class31.field553[var3][var4][var5];
                    if (var6 != null) {
                        class225 var7 = var6.field1141;
                        if (var7 != null && var7.field3880.method881()) {
                            class68.method475(var7.field3880, var3, var4, var5, 1, 1);
                            if (var7.field3878 != null && var7.field3878.method881()) {
                                class68.method475(var7.field3878, var3, var4, var5, 1, 1);
                                var7.field3880.method880(var7.field3878, 0, 0, 0, false);
                                var7.field3878 = var7.field3878.method885(arg0, arg1, arg2);
                            }
                            var7.field3880 = var7.field3880.method885(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1149; ++var8) {
                            class14 var10 = var6.field1140[var8];
                            if (var10 != null && var10.field273.method881()) {
                                class68.method475(var10.field273, var3, var4, var5, var10.field255 - var10.field268 + 1, var10.field277 - var10.field256 + 1);
                                var10.field273 = var10.field273.method885(arg0, arg1, arg2);
                            }
                        }
                        class53 var9 = var6.field1132;
                        if (var9 != null && var9.field851.method881()) {
                            class137.method1030(var9.field851, var3, var4, var5);
                            var9.field851 = var9.field851.method885(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2540;
        if (arg6 != 1) {
            method1074(-81, -97, 58);
        }
        if (arg5 >= 0 && arg0 >= 0 && ~arg5 > -104 && arg0 < 103) {
            if (~arg3 == -1) {
                class225 var8 = class237.method1618(arg4, arg5, arg0);
                if (var8 != null) {
                    int var9 = (int) (var8.field3874 >>> 32) & Integer.MAX_VALUE;
                    if (~arg7 != -3) {
                        var8.field3880 = new class248(var9, arg7, arg1, arg4, arg5, arg0, arg2, false, var8.field3880);
                    } else {
                        var8.field3880 = new class248(var9, 2, 4 - -arg1, arg4, arg5, arg0, arg2, false, var8.field3880);
                        var8.field3878 = new class248(var9, 2, arg1 - -1 & 3, arg4, arg5, arg0, arg2, false, var8.field3878);
                    }
                }
            }
            if (~arg3 == -2) {
                class207 var10 = class163.method1176(arg4, arg5, arg0);
                if (var10 != null) {
                    int var11 = (int) (var10.field3535 >>> 32) & Integer.MAX_VALUE;
                    if (arg7 != 4 && arg7 != 5) {
                        if (~arg7 == -7) {
                            var10.field3533 = new class248(var11, 4, arg1 + 4, arg4, arg5, arg0, arg2, false, var10.field3533);
                        } else if (~arg7 != -8) {
                            if (~arg7 == -9) {
                                var10.field3533 = new class248(var11, 4, arg1 - -4, arg4, arg5, arg0, arg2, false, var10.field3533);
                                var10.field3539 = new class248(var11, 4, (arg1 + 2 & 3) + 4, arg4, arg5, arg0, arg2, false, var10.field3539);
                            }
                        } else {
                            var10.field3533 = new class248(var11, 4, (3 & arg1 + 2) + 4, arg4, arg5, arg0, arg2, false, var10.field3533);
                        }
                    } else {
                        var10.field3533 = new class248(var11, 4, arg1, arg4, arg5, arg0, arg2, false, var10.field3533);
                    }
                }
            }
            if (~arg3 == -3) {
                class14 var12 = class167.method1194(arg4, arg5, arg0);
                if (arg7 == 11) {
                    arg7 = 10;
                }
                if (var12 != null) {
                    var12.field273 = new class248(Integer.MAX_VALUE & (int) (var12.field260 >>> 32), arg7, arg1, arg4, arg5, arg0, arg2, false, var12.field273);
                }
            }
            if (~arg3 == -4) {
                class53 var13 = class14.method114(arg4, arg5, arg0);
                if (var13 != null) {
                    var13.field851 = new class248((int) (var13.field852 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg4, arg5, arg0, arg2, false, var13.field851);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Lpf;")
    public static final class206 method1076(int arg0) {
        ++field2545;
        try {
            if (arg0 != 0) {
                field2548 = null;
            }
            return (class206) Class.forName("ff").newInstance();
        } catch (Throwable var1) {
            return new class153();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            method1074(-29, 34, -39);
        }
        int[] var3 = super.field3844.method22(0, arg1);
        ++field2544;
        if (super.field3844.field61) {
            int var4 = class214.field3639[arg1];
            for (int var5 = 0; class13.field253 > var5; ++var5) {
                var3[var5] = this.method1073(var4, true, class261.field4577[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIILsc;JLsc;Lsc;)V")
    public static final void method1077(int arg0, int arg1, int arg2, int arg3, class119 arg4, long arg5, class119 arg6, class119 arg7) {
        class205 var9 = new class205();
        var9.field3499 = arg4;
        var9.field3496 = arg1 * 128 + 64;
        var9.field3502 = arg2 * 128 + 64;
        var9.field3504 = arg3;
        var9.field3510 = arg5;
        var9.field3495 = arg6;
        var9.field3497 = arg7;
        int var10 = 0;
        class71 var11 = class31.field553[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1149; ++var12) {
                class14 var13 = var11.field1140[var12];
                if ((var13.field260 & 4194304L) == 4194304L) {
                    int var14 = var13.field273.method90();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3505 = -var10;
        if (class31.field553[arg0][arg1][arg2] == null) {
            class31.field553[arg0][arg1][arg2] = new class71(arg0, arg1, arg2);
        }
        class31.field553[arg0][arg1][arg2].field1133 = var9;
    }
}
