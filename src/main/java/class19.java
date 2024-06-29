import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field225 = new String[500];

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field227 = new String[100];

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    public static int[] field228 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZ)V")
    public static final void method128(boolean arg0, boolean arg1) {
        if (!arg0) {
            field225 = null;
        }
        class224.field3615 = arg1;
        if (class224.field3615) {
            int var2 = class235.field3766.method175(103);
            int var3 = class235.field3766.method171(-1);
            int var4 = class235.field3766.method171(-1);
            int var5 = class235.field3766.method190(-3);
            int var6 = class235.field3766.method190(-3);
            class235.field3766.method893(22452);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class235.field3766.method887(true, 1);
                        if (var24 == 1) {
                            class75.field1061[var7][var22][var23] = class235.field3766.method887(true, 26);
                        } else {
                            class75.field1061[var7][var22][var23] = -1;
                        }
                    }
                }
            }
            class235.field3766.method888((byte) 30);
            int var8 = (class179.field2793 - class235.field3766.field349) / 16;
            class128.field1883 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class128.field1883[var9][var21] = class235.field3766.method214((byte) 44);
                }
            }
            class50.field658 = null;
            class102.field1595 = new int[var8];
            class235.field3770 = new byte[var8][];
            class154.field2295 = new int[var8];
            class17.field198 = new int[var8];
            class95.field1467 = new int[var8];
            class202.field3169 = null;
            class207.field3240 = new byte[var8][];
            class182.field2880 = new int[var8];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class75.field1061[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 3 & 0x7FF;
                            int var16 = (var14 & 0xFFD85A) >> 14;
                            int var17 = (var16 / 8 << 8) + (var15 / 8);
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class154.field2295[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class154.field2295[var10] = var17;
                                int var19 = var17 & 0xFF;
                                int var20 = (var17 & 0xFF86) >> 8;
                                class182.field2880[var10] = class102.field1582.method813("m" + var20 + "_" + var19, -1);
                                class17.field198[var10] = class102.field1582.method813("l" + var20 + "_" + var19, -1);
                                class102.field1595[var10] = class102.field1582.method813("um" + var20 + "_" + var19, -1);
                                class95.field1467[var10] = class102.field1582.method813("ul" + var20 + "_" + var19, -1);
                                var10++;
                            }
                        }
                    }
                }
            }
            class23.method162(var4, false, var2, var3, var5, var6, (byte) -94);
        } else {
            int var25 = class235.field3766.method200((byte) -83);
            int var26 = class235.field3766.method190(-3);
            int var27 = class235.field3766.method197(128);
            int var28 = class235.field3766.method200((byte) -83);
            int var29 = (class179.field2793 - class235.field3766.field349) / 16;
            class128.field1883 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class128.field1883[var30][var37] = class235.field3766.method194(123);
                }
            }
            int var31 = class235.field3766.method198(3);
            class154.field2295 = new int[var29];
            class50.field658 = null;
            class235.field3770 = new byte[var29][];
            class207.field3240 = new byte[var29][];
            class182.field2880 = new int[var29];
            class17.field198 = new int[var29];
            class102.field1595 = new int[var29];
            class95.field1467 = new int[var29];
            class202.field3169 = null;
            int var32 = 0;
            boolean var33 = false;
            if (((var31 / 8) == 48 || (var31 / 8) == 49) && var25 / 8 == 48) {
                var33 = true;
            }
            if ((var31 / 8) == 48 && var25 / 8 == 148) {
                var33 = true;
            }
            for (int var34 = (var31 - 6) / 8; var34 <= (var31 + 6) / 8; var34++) {
                for (int var35 = (var25 - 6) / 8; var35 <= ((var25 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var33 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class154.field2295[var32] = var36;
                        class182.field2880[var32] = -1;
                        class17.field198[var32] = -1;
                        class102.field1595[var32] = -1;
                        class95.field1467[var32] = -1;
                    } else {
                        class154.field2295[var32] = var36;
                        class182.field2880[var32] = class102.field1582.method813("m" + var34 + "_" + var35, -1);
                        class17.field198[var32] = class102.field1582.method813("l" + var34 + "_" + var35, -1);
                        class102.field1595[var32] = class102.field1582.method813("um" + var34 + "_" + var35, -1);
                        class95.field1467[var32] = class102.field1582.method813("ul" + var34 + "_" + var35, -1);
                    }
                    var32++;
                }
            }
            class23.method162(var25, false, var27, var31, var26, var28, (byte) -71);
        }
        field226++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZI[BII[Lld;)V")
    public static final void method129(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, class79[] arg7) {
        field229++;
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg6 + var10) > 0 && arg6 + var10 < 103 && (arg3 + var11) > 0 && arg3 + var11 < 103) {
                            arg7[var9].field1125[arg6 + var10][arg3 + var11] = class224.method1526(arg7[var9].field1125[arg6 + var10][arg3 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class25 var12 = new class25(arg4);
        if (arg1 != -1) {
            field225 = null;
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var36 = 0; var36 < 64; var36++) {
                for (int var37 = 0; var37 < 64; var37++) {
                    class134.method908(arg2, arg0, var13, var37 + arg3, var12, arg5, (byte) 118, arg6 + var36, 0);
                }
            }
        }
        boolean var14 = false;
        while (var12.field339.length > var12.field349) {
            int var15 = var12.method201(arg1 + 256);
            if (var15 != 129) {
                var12.field349--;
                break;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = var12.method188(-121);
                if (var17 == 0) {
                    int var18 = arg6;
                    if (arg6 < 0) {
                        var18 = 0;
                    } else if (arg6 >= 104) {
                        var18 = 104;
                    }
                    int var19 = arg3;
                    int var20 = arg6 + 64;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg3 + 64;
                    if (arg3 < 0) {
                        var19 = 0;
                    } else if (arg3 >= 104) {
                        var19 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    while (var18 < var20) {
                        while (var19 < var21) {
                            class253.field4065[var16][var18][var19] = 0;
                            var19++;
                        }
                        var18++;
                    }
                } else if (var17 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var12.method188(-110);
                            for (int var25 = var22 + arg6; var25 < (arg6 + var22 + 4); var25++) {
                                for (int var26 = arg3 + var23; var26 < var23 + arg3 + 4; var26++) {
                                    if (var25 >= 0 && var25 < 104 && var26 >= 0 && var26 < 104) {
                                        class253.field4065[var16][var25][var26] = var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && var16 > 0) {
                    int var27 = arg6;
                    if (arg6 < 0) {
                        var27 = 0;
                    } else if (arg6 >= 104) {
                        var27 = 104;
                    }
                    int var28 = arg6 + 64;
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 >= 104) {
                        var28 = 104;
                    }
                    int var29 = arg3;
                    int var30 = arg3 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    if (arg3 < 0) {
                        var29 = 0;
                    } else if (arg3 >= 104) {
                        var29 = 104;
                    }
                    while (var28 > var27) {
                        while (var29 < var30) {
                            class253.field4065[var16][var27][var29] = class253.field4065[var16 - 1][var27][var29];
                            var29++;
                        }
                        var27++;
                    }
                }
            }
            var14 = true;
        }
        if (var14) {
            return;
        }
        for (int var31 = 0; var31 < 4; var31++) {
            for (int var32 = 0; var32 < 16; var32++) {
                for (int var33 = 0; var33 < 16; var33++) {
                    int var34 = (arg3 >> 2) + var33;
                    int var35 = (arg6 >> 2) + var32;
                    if (var35 >= 0 && var35 < 26 && var34 >= 0 && var34 < 26) {
                        class253.field4065[var31][var35][var34] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Llj;")
    public static final class25 method130(int arg0) {
        field230++;
        class25 var1 = new class25(34);
        var1.method184(11, 123);
        var1.method184(class59.field835, arg0 ^ 0xFFFFFF8F);
        var1.method184(class168.field2580 ? 1 : 0, 85);
        var1.method184(class199.field3114 ? 1 : 0, arg0 + 121);
        var1.method184(class143.field2098 ? 1 : 0, 125);
        if (arg0 != -14) {
            method132((byte) 124, -45);
        }
        var1.method184(class239.field3814 ? 1 : 0, arg0 + 141);
        var1.method184(class195.field3073 ? 1 : 0, 103);
        var1.method184(class264.field4255 ? 1 : 0, 107);
        var1.method184(class184.field2893 ? 1 : 0, 123);
        var1.method184(class50.field693 ? 1 : 0, arg0 + 113);
        var1.method184(class65.field912, 84);
        var1.method184(class3.field37 ? 1 : 0, 119);
        var1.method184(class182.field2882 ? 1 : 0, 106);
        var1.method184(class123.field1815 ? 1 : 0, arg0 ^ 0xFFFFFFAD);
        var1.method184(class185.field2900, arg0 + 98);
        var1.method184(class16.field192 ? 1 : 0, 97);
        var1.method184(class76.field1074, arg0 + 108);
        var1.method184(class219.field3553, 125);
        var1.method184(class60.field841, 117);
        var1.method223(-1720191288, class261.field4220);
        var1.method223(-1720191288, class192.field3041);
        var1.method184(class217.method1470(), arg0 ^ 0xFFFFFF84);
        var1.method166(class238.field3807, -3);
        var1.method184(class8.field124, 114);
        var1.method184(class244.field3910 ? 1 : 0, 94);
        var1.method184(class264.field4251 ? 1 : 0, 116);
        var1.method184(class18.field215, 97);
        var1.method184(class141.field2068 ? 1 : 0, 84);
        var1.method184(class80.field1167 ? 1 : 0, 117);
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static void method131(int arg0) {
        if (arg0 == 1) {
            field227 = null;
            field225 = null;
            field228 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V")
    public static final void method132(byte arg0, int arg1) {
        field220++;
        class287 var2 = class261.method1786(arg1, false, 4);
        if (arg0 < -82) {
            var2.method1912((byte) 104);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static final void method133(boolean arg0) {
        field221++;
        for (class83 var1 = (class83) class272.field4323.method350(8240); var1 != null; var1 = (class83) class272.field4323.method353((byte) -119)) {
            if (var1.field1296 > 0) {
                var1.field1296--;
            }
            if (var1.field1296 != 0) {
                if (var1.field1308 > 0) {
                    var1.field1308--;
                }
                if (var1.field1308 == 0 && var1.field1298 >= 1 && var1.field1310 >= 1 && var1.field1298 <= 102 && var1.field1310 <= 102 && (var1.field1305 < 0 || class187.method1300(8, var1.field1305, var1.field1302))) {
                    class222.method1516(var1.field1298, var1.field1309, var1.field1303, 8, var1.field1302, var1.field1305, var1.field1299, var1.field1310);
                    var1.field1308 = -1;
                    if (var1.field1305 == var1.field1304 && var1.field1304 == -1) {
                        var1.method784(false);
                    } else if (var1.field1305 == var1.field1304 && var1.field1306 == var1.field1303 && var1.field1302 == var1.field1300) {
                        var1.method784(false);
                    }
                }
            } else if (var1.field1304 < 0 || class187.method1300(8, var1.field1304, var1.field1300)) {
                class222.method1516(var1.field1298, var1.field1309, var1.field1306, 8, var1.field1300, var1.field1304, var1.field1299, var1.field1310);
                var1.method784(!arg0);
            }
        }
        if (!arg0) {
            method131(22);
        }
    }
}
