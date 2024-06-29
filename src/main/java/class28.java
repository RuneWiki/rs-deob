import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 extends class291 {

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field397;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field398;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lft;B)V")
    public static final void method206(class4 arg0, byte arg1) {
        field397++;
        arg0.method1512(false);
        boolean var2 = false;
        for (class4 var3 = (class4) class174.field2456.method2480(381); var3 != null; var3 = (class4) class174.field2456.method2476((byte) 18)) {
            if (class307.method2018(88, var3.method27((byte) 35), arg0.method27((byte) 35))) {
                class586.method3398(arg0, (byte) -126, var3);
                var2 = true;
                break;
            }
        }
        if (arg1 == -72 && !var2) {
            class174.field2456.method2475(arg0, -19680);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILha;B)Z")
    public static final boolean method207(int arg0, class66 arg1, byte arg2) {
        field396++;
        int var3 = (class109.field1314 - 104) / 2;
        int var4 = -30 / ((arg2 + 15) / 57);
        int var5 = (class760.field10479 - 104) / 2;
        boolean var6 = true;
        for (int var7 = var3; var7 < (var3 + 104); var7++) {
            for (int var58 = var5; var58 < var5 + 104; var58++) {
                for (int var59 = arg0; var59 <= 3; var59++) {
                    if (class177.method1343(var59, var7, var58, (byte) 72, arg0)) {
                        int var60 = var59;
                        if (class627.method3593(var7, (byte) -108, var58)) {
                            var60 = var59 - 1;
                        }
                        if (var60 >= 0) {
                            var6 &= class477.method2811(var60, (byte) -66, var58, var7);
                        }
                    }
                }
            }
        }
        if (!var6) {
            return false;
        }
        int[] var8 = new int[262144];
        for (int var9 = 0; var9 < var8.length; var9++) {
            var8[var9] = -16777216;
        }
        class609.field8591 = arg1.method476(0, 512, 512, true, 512, var8);
        class739.method4139(-200);
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D))) - 10 | 0xFF000000;
        int var11 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var12 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var13 = new boolean[class1.field11 + 1 + 2][class1.field11 + 1 + 2];
        for (int var14 = var3; var14 < var3 + 104; var14 += class1.field11) {
            for (int var37 = var5; var37 < var5 + 104; var37 += class1.field11) {
                int var38 = 0;
                int var39 = 0;
                int var40 = var14;
                if (var14 > 0) {
                    var38 += 4;
                    var40 = var14 - 1;
                }
                int var41 = var37;
                if (var37 > 0) {
                    var41 = var37 - 1;
                }
                int var42 = class1.field11 + var14;
                if (var42 < 104) {
                    var42++;
                }
                int var43 = class1.field11 + var37;
                if (var43 < 104) {
                    var39 += 4;
                    var43++;
                }
                arg1.method455(0, 0, var38 + (class1.field11 * 4), class1.field11 * 4 + var39);
                arg1.method417(-16777216);
                for (int var44 = arg0; var44 <= 3; var44++) {
                    for (int var51 = 0; var51 <= class1.field11; var51++) {
                        for (int var57 = 0; var57 <= class1.field11; var57++) {
                            var13[var51][var57] = class177.method1343(var44, var40 + var51, var41 + var57, (byte) 72, arg0);
                        }
                    }
                    class750.field10395[var44].method1244(0, 0, 1024, var40, var41, var42, var43, var13);
                    if (!class119.field1507) {
                        for (int var52 = -4; var52 < class1.field11; var52++) {
                            for (int var53 = -4; var53 < class1.field11; var53++) {
                                int var54 = var14 + var52;
                                int var55 = var37 + var53;
                                if (var3 <= var54 && var5 <= var55 && class177.method1343(var44, var54, var55, (byte) 72, arg0)) {
                                    int var56 = var44;
                                    if (class627.method3593(var54, (byte) -95, var55)) {
                                        var56 = var44 - 1;
                                    }
                                    if (var56 >= 0) {
                                        class276.method1785(var55, (class1.field11 - var53) * 4 + var39 - 4, var11, var10, var54, var56, (byte) -31, var52 * 4 + var38, arg1);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class119.field1507) {
                    class438 var45 = class234.field3394[arg0];
                    for (int var46 = 0; var46 < class1.field11; var46++) {
                        for (int var47 = 0; var47 < class1.field11; var47++) {
                            int var48 = var14 + var46;
                            int var49 = var37 + var47;
                            int var50 = var45.field6279[var48 - var45.field6269][var49 - var45.field6262];
                            if ((var50 & 0x40240000) != 0) {
                                arg1.method488((class1.field11 - var47) * 4 + var39 - 4, var46 * 4 + var38, -1713569622, 4, 1, 4);
                            } else if ((var50 & 0x800000) != 0) {
                                arg1.method478(var46 * 4 + var38, true, -1713569622, 4, (class1.field11 - var47) * 4 + var39 - 4);
                            } else if ((var50 & 0x2000000) != 0) {
                                arg1.method480(1, 4, -1713569622, (class1.field11 - var47) * 4 + var39 - 4, var46 * 4 + var38 + 3);
                            } else if ((var50 & 0x8000000) != 0) {
                                arg1.method478(var38 + (var46 * 4), true, -1713569622, 4, var39 - (-((class1.field11 - var47) * 4) - 3) - 4);
                            } else if ((var50 & 0x20000000) != 0) {
                                arg1.method480(1, 4, -1713569622, (class1.field11 - var47) * 4 + var39 - 4, var46 * 4 + var38);
                            }
                        }
                    }
                }
                arg1.method474(var38, var39, class1.field11 * 4, class1.field11 * 4, var12, 2);
                class609.field8591.method782((var14 - var3) * 4 + 48, -((var37 - var5) * 4) + 464 + -(class1.field11 * 4), class1.field11 * 4, class1.field11 * 4, var38, var39);
            }
        }
        arg1.method463();
        arg1.method417(-16777215);
        class149.method1028(-19376);
        class677.field9636 = 0;
        class385.field5485.method2503(10);
        if (!class119.field1507) {
            for (int var15 = var3; var15 < var3 + 104; var15++) {
                for (int var21 = var5; var21 < (var5 + 104); var21++) {
                    for (int var22 = arg0; var22 <= arg0 + 1 && var22 <= 3; var22++) {
                        if (class177.method1343(var22, var15, var21, (byte) 72, arg0)) {
                            class362 var23 = (class362) class728.method4087(var22, var15, var21);
                            if (var23 == null) {
                                var23 = (class362) class195.method1415(var22, var15, var21, field398 == null ? (field398 = class291.method1972("ija")) : field398);
                            }
                            if (var23 == null) {
                                var23 = (class362) class259.method1702(var22, var15, var21);
                            }
                            if (var23 == null) {
                                var23 = (class362) class143.method987(var22, var15, var21);
                            }
                            if (var23 != null) {
                                class322 var24 = class496.field7061.method319(-125, var23.method650(-92));
                                if (!var24.field4751 || class100.field1266) {
                                    int var25 = var24.field4807;
                                    if (var24.field4830 != null) {
                                        for (int var26 = 0; var26 < var24.field4830.length; var26++) {
                                            if (var24.field4830[var26] != -1) {
                                                class322 var27 = class496.field7061.method319(-126, var24.field4830[var26]);
                                                if (var27.field4807 >= 0) {
                                                    var25 = var27.field4807;
                                                }
                                            }
                                        }
                                    }
                                    if (var25 >= 0) {
                                        boolean var28 = false;
                                        if (var25 >= 0) {
                                            class665 var29 = class247.field3521.method3711((byte) -97, var25);
                                            if (var29 != null && var29.field9370) {
                                                var28 = true;
                                            }
                                        }
                                        int var30 = var15;
                                        int var31 = var21;
                                        if (var28) {
                                            int[][] var32 = class234.field3394[var22].field6279;
                                            int var33 = class234.field3394[var22].field6269;
                                            int var34 = class234.field3394[var22].field6262;
                                            for (int var35 = 0; var35 < 10; var35++) {
                                                int var36 = (int) (Math.random() * 4.0D);
                                                if (var36 == 0 && var30 > var3 && var30 > var15 - 3 && (var32[var30 - (var33 + 1)][var31 - var34] & 0x2C0108) == 0) {
                                                    var30--;
                                                }
                                                if (var36 == 1 && (var3 + 104 - 1) > var30 && var30 < (var15 + 3) && (var32[var30 + 1 - var33][var31 - var34] & 0x2C0180) == 0) {
                                                    var30++;
                                                }
                                                if (var36 == 2 && var31 > var5 && (var21 - 3) < var31 && (var32[var30 - var33][var31 - var34 - 1] & 0x2C0102) == 0) {
                                                    var31--;
                                                }
                                                if (var36 == 3 && var31 < (var5 + 103) && (var21 + 3) > var31 && (var32[var30 - var33][var31 + 1 - var34] & 0x2C0120) == 0) {
                                                    var31++;
                                                }
                                            }
                                        }
                                        class567.field8028[class677.field9636] = var24.field4759;
                                        class219.field3130[class677.field9636] = var30;
                                        class551.field7856[class677.field9636] = var31;
                                        class677.field9636++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class663.field9307 != null) {
                class518.field7400.field7650 = 1;
                class247.field3521.method3705((byte) -25, 1024, 64);
                for (int var16 = 0; var16 < class663.field9307.field3466; var16++) {
                    int var17 = class663.field9307.field3467[var16];
                    if ((var17 >> 28) == class251.field3549.field7710) {
                        int var18 = (var17 >> 14 & 0x3FFF) - class103.field1295;
                        int var19 = (var17 & 0x3FFF) - class175.field2496;
                        if (var18 >= 0 && class109.field1314 > var18 && var19 >= 0 && class760.field10479 > var19) {
                            class385.field5485.method2510(new class633(var16), false);
                        } else {
                            class665 var20 = class247.field3521.method3711((byte) 97, class663.field9307.field3469[var16]);
                            if (var20.field9351 != null && (var20.field9349 + var18) >= 0 && var18 + var20.field9344 < class109.field1314 && var20.field9336 + var19 >= 0 && class760.field10479 > (var20.field9374 + var19)) {
                                class385.field5485.method2510(new class633(var16), false);
                            }
                        }
                    }
                }
                class247.field3521.method3705((byte) -25, 128, 64);
                class518.field7400.field7650 = 2;
                class518.field7400.method3137(70);
            }
        }
        return true;
    }
}
