import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class345 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4718 = 0;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lbd;")
    public static class464 field4720 = new class464(10, 6);

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4714;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method2060(byte arg0, int arg1, int arg2) {
        field4722++;
        if ((class379.field5372 < class379.field5365)) {
            class379.field5372 = (float) ((double) class379.field5372 / 30.0D + (double) class379.field5372);
            if (class379.field5365 < class379.field5372) {
                class379.field5372 = class379.field5365;
            }
            class330.method1970(8142);
            class379.field5370 = (int) class379.field5372 >> 1;
            class379.field5368 = class370.method2222(-41, class379.field5370);
        } else if (class379.field5372 > class379.field5365) {
            class379.field5372 = (float) ((double) class379.field5372 - (double) class379.field5372 / 30.0D);
            if (class379.field5365 > class379.field5372) {
                class379.field5372 = class379.field5365;
            }
            class330.method1970(8142);
            class379.field5370 = (int) class379.field5372 >> 1;
            class379.field5368 = class370.method2222(-111, class379.field5370);
        }
        if (class266.field3706 != -1 && class84.field1265 != -1) {
            int var3 = class266.field3706 - class192.field2753;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class84.field1265 - class417.field5743;
            class192.field2753 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class417.field5743 += var4;
            if (var3 == 0 && var4 == 0) {
                class266.field3706 = -1;
                class84.field1265 = -1;
            }
            class330.method1970(8142);
        }
        if (arg0 > -108) {
            return;
        }
        if (class175.field2588 <= 0) {
            class446.field6163 = -1;
            class283.field3887 = -1;
        } else {
            class3.field29--;
            if (class3.field29 == 0) {
                class3.field29 = 100;
                class175.field2588--;
            }
        }
        if (!class77.field1167 || class52.field863 == null) {
            return;
        }
        for (class21 var5 = (class21) class52.field863.method1544(-124); var5 != null; var5 = (class21) class52.field863.method1546((byte) -42)) {
            class442 var6 = class379.field5358.method85(var5.field366.field2342, true);
            if (class77.field1169 == 0 && var5.method181(arg1, Integer.MIN_VALUE, arg2)) {
                if (var6.field6091 != null) {
                    if (var6.field6091[4] != null) {
                        class225.method1415(false, var6.field6073, var6.field6097, 0, 1012, (long) var5.field366.field2342, -1, -1, var6.field6091[4], 0, true);
                    }
                    if (var6.field6091[3] != null) {
                        class225.method1415(false, var6.field6073, var6.field6097, 0, 1008, (long) var5.field366.field2342, -1, -1, var6.field6091[3], 0, true);
                    }
                    if (var6.field6091[2] != null) {
                        class225.method1415(false, var6.field6073, var6.field6097, 0, 1006, (long) var5.field366.field2342, -1, -1, var6.field6091[2], 0, true);
                    }
                    if (var6.field6091[1] != null) {
                        class225.method1415(false, var6.field6073, var6.field6097, 0, 1003, (long) var5.field366.field2342, -1, -1, var6.field6091[1], 0, true);
                    }
                    if (var6.field6091[0] != null) {
                        class225.method1415(false, var6.field6073, var6.field6097, 0, 1009, (long) var5.field366.field2342, -1, -1, var6.field6091[0], 0, true);
                    }
                }
                if (!var5.field366.field2340) {
                    var5.field366.field2340 = true;
                    class212.method1332(class416.field5731, var5.field366.field2342, var6.field6073);
                }
                if (var5.field366.field2340) {
                    class212.method1332(class409.field5675, var5.field366.field2342, var6.field6073);
                }
            } else if (var5.field366.field2340) {
                var5.field366.field2340 = false;
                class212.method1332(class294.field4058, var5.field366.field2342, var6.field6073);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "toString", descriptor = "()Ljava/lang/String;", line = 141)
    public final String toString() {
        field4717++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lvk;IIIIIIIIIII)Z", line = 152)
    public static final boolean method2061(class272 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4716++;
        int var12 = arg2;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        int var17 = arg4 - var15;
        class159.field2286[var14][var15] = 99;
        if (arg6 != -1) {
            method2063((class487) null, 113);
        }
        class84.field1267[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class180.field2615[var18] = arg2;
        int var35 = var18 + 1;
        class7.field130[var18] = arg4;
        int[][] var20 = arg0.field3756;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class239.field3376 = var12;
                                    class163.field2335 = var13;
                                    return false;
                                }
                                var13 = class7.field130[var19];
                                var12 = class180.field2615[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg0.field3751;
                                var24 = var13 - arg0.field3761;
                                if (arg10 == -4) {
                                    if (arg9 == var12 && arg5 == var13) {
                                        class163.field2335 = var13;
                                        class239.field3376 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class236.method1483(arg1, arg1, arg3, arg5, var12, true, arg9, var13, arg11)) {
                                        class163.field2335 = var13;
                                        class239.field3376 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg0.method1699(-3, arg1, arg1, arg11, arg5, arg3, arg7, arg9, var13, var12)) {
                                        class239.field3376 = var12;
                                        class163.field2335 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg0.method1693(arg9, arg11, var12, arg3, var13, arg7, arg5, arg1, -117)) {
                                        class239.field3376 = var12;
                                        class163.field2335 = var13;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg0.method1707(var13, (byte) 120, arg8, arg1, arg5, arg10, arg9, var12)) {
                                        class239.field3376 = var12;
                                        class163.field2335 = var13;
                                        return true;
                                    }
                                } else if (arg0.method1691(arg5, arg9, var12, arg10, var13, false, arg8, arg1)) {
                                    class239.field3376 = var12;
                                    class163.field2335 = var13;
                                    return true;
                                }
                                var26 = class84.field1267[var21][var22] + 1;
                                if (var21 > 0 && class159.field2286[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg1 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg1 - 1) {
                                            class180.field2615[var35] = var12 - 1;
                                            class7.field130[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class159.field2286[var21 - 1][var22] = 2;
                                            class84.field1267[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg1 && class159.field2286[var21 + 1][var22] == 0 && (var20[arg1 + var23][var24] & 0x60E40000) == 0 && (var20[arg1 + var23][arg1 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg1 - 1)) {
                                            class180.field2615[var35] = var12 + 1;
                                            class7.field130[var35] = var13;
                                            class159.field2286[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class84.field1267[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class159.field2286[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg1 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg1 - 1) {
                                            class180.field2615[var35] = var12;
                                            class7.field130[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class159.field2286[var21][var22 - 1] = 1;
                                            class84.field1267[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg1 && class159.field2286[var21][var22 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[var23 + arg1 - 1][var24 + arg1] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var30) {
                                            class180.field2615[var35] = var12;
                                            class7.field130[var35] = var13 + 1;
                                            class159.field2286[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class84.field1267[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg1 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class159.field2286[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg1) {
                                            class180.field2615[var35] = var12 - 1;
                                            class7.field130[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class159.field2286[var21 - 1][var22 - 1] = 3;
                                            class84.field1267[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 - (1 - var31)] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg1) && var22 > 0 && class159.field2286[var21 + 1][var22 - 1] == 0 && (var20[arg1 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg1 <= var32) {
                                            class180.field2615[var35] = var12 + 1;
                                            class7.field130[var35] = var13 - 1;
                                            class159.field2286[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class84.field1267[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg1) > var22 && class159.field2286[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg1] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg1 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class180.field2615[var35] = var12 - 1;
                                    class7.field130[var35] = var13 + 1;
                                    class159.field2286[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class84.field1267[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg1));
                        } while (128 - arg1 <= var22);
                    } while (class159.field2286[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg1 + var23][var24 + arg1] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][arg1 + var24] & 0x7E240000) != 0 || (var20[var23 + arg1][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class180.field2615[var35] = var12 + 1;
                class7.field130[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class159.field2286[var21 + 1][var22 + 1] = 12;
                class84.field1267[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 589)
    public static void method2062(int arg0) {
        if (arg0 == 2) {
            field4720 = null;
            field4714 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lkm;I)V", line = 601)
    public static final void method2063(class487 arg0, int arg1) {
        field4719++;
        int var2 = class393.field5531;
        int var3 = class214.field3036;
        int var4 = class23.field405;
        int var5 = class183.field2661 - 3;
        byte var6 = 20;
        if (class115.field1626 == null || class192.field2750 == null) {
            if (class120.field1685.method2034(class137.field1946, -28758) && class120.field1685.method2034(class295.field4085, -28758)) {
                class115.field1626 = arg0.method1139(class140.method854(class120.field1685, class137.field1946, 0), true);
                class140 var7 = class140.method854(class120.field1685, class295.field4085, 0);
                class192.field2750 = arg0.method1139(var7, true);
                var7.method861();
                class419.field5786 = arg0.method1139(var7, true);
            } else {
                arg0.method1107(var2, var3, var4, var6, 255 - class422.field5810 << 24 | class2.field20, 1);
            }
        }
        if (class115.field1626 != null && class192.field2750 != null) {
            int var8 = (var4 - (class192.field2750.method388() * 2)) / class115.field1626.method388();
            for (int var9 = 0; var9 < var8; var9++) {
                class115.field1626.method2301(class192.field2750.method388() + (var2 + (var9 * class115.field1626.method388())), var3);
            }
            class192.field2750.method2301(var2, var3);
            class419.field5786.method2301(var2 + var4 - class419.field5786.method388(), var3);
        }
        class211.field2981.method2835(var3 + 14, class180.field2614.method695(-113, class487.field6867), class102.field1452 | 0xFF000000, -1, (byte) 115, var2 + 3);
        arg0.method1107(var2, var3 + var6, var4, var5 - var6, class2.field20 | -class422.field5810 + 255 << 24, 1);
        int var10 = class56.field902.method1301(13820);
        int var11 = class56.field902.method1305(255);
        int var12 = 0;
        if (arg1 < 113) {
            return;
        }
        for (class106 var13 = (class106) class250.field3514.method1544(-99); var13 != null; var13 = (class106) class250.field3514.method1546((byte) -42)) {
            int var30 = var3 + var6 - (-((-var12 + class161.field2310 + -1) * 16) + -13);
            if (var2 < var10 && var10 < (var2 + var4) && var30 - 13 < var11 && var30 + 4 > var11 && var13.field1528) {
                arg0.method1107(var2, var30 - 12, var4, 16, 255 - class429.field5916 << 24 | class196.field2799, 1);
            }
            var12++;
        }
        if ((class287.field3915 == null || class192.field2749 == null || class96.field1369 == null) && class120.field1685.method2034(class370.field5242, -28758) && class120.field1685.method2034(class466.field6542, -28758) && class120.field1685.method2034(class446.field6169, -28758)) {
            class140 var14 = class140.method854(class120.field1685, class466.field6542, 0);
            class192.field2749 = arg0.method1139(var14, true);
            var14.method861();
            class275.field3807 = arg0.method1139(var14, true);
            class287.field3915 = arg0.method1139(class140.method854(class120.field1685, class370.field5242, 0), true);
            class140 var15 = class140.method854(class120.field1685, class446.field6169, 0);
            class96.field1369 = arg0.method1139(var15, true);
            var15.method861();
            class227.field3213 = arg0.method1139(var15, true);
        }
        if (class287.field3915 != null && class192.field2749 != null && class96.field1369 != null) {
            int var16 = (var4 - (class96.field1369.method388() * 2)) / class287.field3915.method388();
            for (int var17 = 0; var17 < var16; var17++) {
                class287.field3915.method2301(var2 - (-class96.field1369.method388() - var17 * class287.field3915.method388()), -class287.field3915.method394() + var3 + var5);
            }
            int var18 = (var5 - var6 - class96.field1369.method394()) / class192.field2749.method394();
            for (int var19 = 0; var19 < var18; var19++) {
                class192.field2749.method2301(var2, var6 + var3 + class192.field2749.method394() * var19);
                class275.field3807.method2301(var2 + var4 - class275.field3807.method388(), var19 * class192.field2749.method394() + var6 + var3);
            }
            class96.field1369.method2301(var2, var3 + (var5 - class96.field1369.method394()));
            class227.field3213.method2301(var4 + var2 - class96.field1369.method388(), -class96.field1369.method394() + var5 + var3);
        }
        int var20 = 0;
        for (class106 var21 = (class106) class250.field3514.method1544(-109); var21 != null; var21 = (class106) class250.field3514.method1546((byte) -42)) {
            int var22 = (class161.field2310 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class102.field1452 | 0xFF000000;
            if (var2 < var10 && (var2 + var4) > var10 && var22 - 13 < var11 && var11 < (var22 + 4) && var21.field1528) {
                var23 = class15.field259 | 0xFF000000;
            }
            int[] var24 = null;
            if (class290.method1786((byte) 83, var21.field1517)) {
                var24 = class58.field918.method344((int) var21.field1515, 31757).field2409;
            } else if (var21.field1524 != -1) {
                var24 = class58.field918.method344(var21.field1524, 31757).field2409;
            } else if (class43.method355(5, var21.field1517)) {
                class196 var27 = class256.field3581[(int) var21.field1515];
                if (var27 != null) {
                    class127 var28 = var27.field2789;
                    if (var28.field1780 != null) {
                        var28 = var28.method767(class320.field4376, (byte) 93);
                    }
                    if (var28 != null) {
                        var24 = var28.field1802;
                    }
                }
            } else if (class103.method649(var21.field1517, (byte) -128)) {
                Object var25 = null;
                class475 var26;
                if (var21.field1517 == 1007) {
                    var26 = class304.field4160.method2075((int) var21.field1515, false);
                } else {
                    var26 = class304.field4160.method2075((int) (var21.field1515 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var26.field6690 != null) {
                    var26 = var26.method2797(class320.field4376, -126);
                }
                if (var26 != null) {
                    var24 = var26.field6676;
                }
            }
            String var29 = class239.method1500(98, var21);
            if (var24 != null) {
                var29 = var29 + class318.method1922(0, var24);
            }
            class211.field2981.method2851(class294.field4065, var29, var2 + 3, var23, -3732, 0, class167.field2458, var22);
            var20++;
            if (var21.field1518) {
                class490.field6912.method2301(var2 + class328.field4531.method522(77, var29) + 5, var22 + -12);
            }
        }
        class128.method780(class23.field405, class393.field5531, class214.field3036, class183.field2661, (byte) 107);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I", line = 802)
    public final int method2064(boolean arg0) {
        field4715++;
        if (arg0) {
            field4714 = null;
        }
        return this.field4713;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 812)
    public class345(String arg0, int arg1) {
        this.field4713 = arg1;
    }
}
