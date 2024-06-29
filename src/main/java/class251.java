import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lnb;")
    private class330 field3989 = new class330();

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public int field3995 = 0;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
    private boolean field3999 = false;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3997;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[[[Li;")
    public static class230[][][] field3996;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLim;)V", line = 7)
    public static final void method1769(byte arg0, class192 arg1) {
        field4003++;
        int var2 = arg1.method1362(124);
        class37.field495 = new class245[var2];
        int var3 = 0;
        if (arg0 != 97) {
            return;
        }
        while (var2 > var3) {
            class37.field495[var3] = new class245();
            class37.field495[var3].field3886 = arg1.method1362(126);
            class37.field495[var3].field3895 = arg1.method1352((byte) -128);
            var3++;
        }
        class30.field428 = arg1.method1362(-52);
        class26.field380 = arg1.method1362(126);
        class325.field5080 = arg1.method1362(arg0 ^ 0x1D);
        class147.field2197 = new class255[class26.field380 + 1 - class30.field428];
        for (int var4 = 0; var4 < class325.field5080; var4++) {
            int var5 = arg1.method1362(-56);
            class255 var6 = class147.field2197[var5] = new class255();
            var6.field3029 = arg1.method1399(arg0 ^ 0xBA1EC009);
            var6.field3034 = arg1.method1354((byte) 94);
            var6.field4049 = class30.field428 + var5;
            var6.field4053 = arg1.method1352((byte) -121);
            var6.field4052 = arg1.method1352((byte) -124);
        }
        class283.field4464 = arg1.method1354((byte) 114);
        class142.field2129 = true;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILlc;I)Lb;", line = 54)
    public final class66 method1770(int arg0, class176 arg1, int arg2) {
        field3991++;
        class66 var4 = new class66();
        var4.field862 = 1;
        if (arg0 != 31932) {
            return (class66) null;
        }
        class330 var5 = this.field3989;
        synchronized (this.field3989) {
            class66 var6 = (class66) this.field3989.method2286(-31893);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field416 && var6.field863 == arg1 && var6.field862 == 2) {
                    var4.field624 = false;
                    var4.field867 = var6.field867;
                    return var4;
                }
                var6 = (class66) this.field3989.method2285(false);
            }
        }
        var4.field867 = arg1.method1234(arg2, 1133474224);
        var4.field624 = false;
        var4.field626 = true;
        return var4;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 89)
    public static final void method1771(byte arg0) {
        class98.field1495.method1623(1);
        field3992++;
        if (arg0 != 24) {
            method1769((byte) -23, (class192) null);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Llc;[BZI)Lb;", line = 104)
    public final class66 method1772(class176 arg0, byte[] arg1, boolean arg2, int arg3) {
        field4002++;
        class66 var5 = new class66();
        var5.field863 = arg0;
        var5.field867 = arg1;
        var5.field626 = false;
        var5.field862 = 2;
        var5.field416 = (long) arg3;
        this.method1780(var5, -127);
        if (!arg2) {
            this.field3999 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 123)
    public static final void method1773(boolean arg0) {
        field4004++;
        if (arg0) {
            method1775(122, (byte) -30);
        }
        class324.field5065.method1615(105);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V", line = 136)
    public static final void method1774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4000++;
        int var6 = arg2 - arg0;
        int var7 = arg1 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class290.method2036(arg3, arg1, arg4, arg0, 16);
            }
        } else if (var7 == 0) {
            class56.method400(arg0, arg2, arg3, arg4, (byte) -70);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (arg5 != 24687) {
                field4001 = -49;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg0;
                arg0 = arg3;
                arg3 = var9;
                int var10 = arg2;
                arg2 = arg1;
                arg1 = var10;
            }
            if (arg0 > arg2) {
                int var11 = arg0;
                arg0 = arg2;
                arg2 = var11;
                int var12 = arg3;
                arg3 = arg1;
                arg1 = var12;
            }
            int var13 = arg3;
            int var14 = arg2 - arg0;
            int var15 = arg1 - arg3;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = arg3 < arg1 ? 1 : -1;
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var18 = arg0; var18 <= arg2; var18++) {
                    class310.field4841[var18][var13] = arg4;
                    var17 += var15;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    var17 += var15;
                    class310.field4841[var13][var19] = arg4;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V", line = 248)
    public static final void method1775(int arg0, byte arg1) {
        field3988++;
        class127.field1899.method1625(arg0, (byte) 117);
        class283.field4471.method1625(arg0, (byte) 121);
        class246.field3900.method1625(arg0, (byte) 66);
        int var2 = -80 % ((arg1 - 9) / 59);
        class331.field5155.method1625(arg0, (byte) 78);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[B", line = 263)
    public static final byte[] method1776(int arg0, int arg1) {
        if (arg0 != -14422) {
            return (byte[]) null;
        }
        field3987++;
        class95 var2 = (class95) class280.field4409.method768((long) arg1, false);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class66.method434(var7, var4, -27852);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class95(var3);
            class280.field4409.method770(var2, 0, (long) arg1);
        }
        return var2.field1453;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z[[[IB[Lde;)V", line = 312)
    public static final void method1777(boolean arg0, int[][][] arg1, byte arg2, class68[] arg3) {
        field3994++;
        byte var4;
        if (arg0) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg0) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class81.field1229[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class81.field1229[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method449(var7, var6, -128);
                            }
                        }
                    }
                }
            }
            class188.field3049 += (int) (Math.random() * 5.0D) - 2;
            if (class188.field3049 < -16) {
                class188.field3049 = -16;
            }
            if (class188.field3049 > 16) {
                class188.field3049 = 16;
            }
            class89.field1358 += (int) (Math.random() * 5.0D) - 2;
            if (class89.field1358 < -8) {
                class89.field1358 = -8;
            }
            if (class89.field1358 > 8) {
                class89.field1358 = 8;
            }
        }
        int var9 = class89.field1358 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int var11 = class188.field3049 >> 1;
        int[][] var12 = new int[104][104];
        int var13 = 0;
        int var14 = 122 / ((-arg2 - 65) / 51);
        while (var4 > var13) {
            byte[][] var15 = class100.field1520[var13];
            if (!class186.field2991) {
                int var16 = (int) Math.sqrt(5100.0D);
                int var17 = var16 * 768 >> 8;
                for (int var18 = 1; var18 < 103; var18++) {
                    for (int var19 = 1; var19 < 103; var19++) {
                        int var20 = class84.field1282[var13][var19 + 1][var18] - class84.field1282[var13][var19 - 1][var18];
                        byte var21 = 74;
                        int var22 = class84.field1282[var13][var19][var18 + 1] - class84.field1282[var13][var19][var18 - 1];
                        int var23 = (int) Math.sqrt((double) (var22 * var22 + (var20 * var20 + 65536)));
                        int var24 = (var20 << 8) / var23;
                        int var25 = (var15[var19 - 1][var18] >> 2) + (var15[var19 + 1][var18] >> 3) + (var15[var19][var18] >> 1) + (var15[var19][var18 + 1] >> 3) + (var15[var19][var18 + -1] >> 2);
                        int var26 = (var22 << 8) / var23;
                        int var27 = -65536 / var23;
                        int var28 = (var26 * -50 + (var24 * -50 + (var27 * -10))) / var17 + var21;
                        var10[var19][var18] = var28 - var25;
                    }
                }
            } else if (class269.field4250) {
                for (int var29 = 1; var29 < 103; var29++) {
                    for (int var30 = 1; var30 < 103; var30++) {
                        int var31 = (var15[var30][var29 + 1] >> 3) + (var15[var30][var29] >> 1) + ((var15[var30 + -1][var29] >> 2) + (var15[var30 + 1][var29] >> 3) - -(var15[var30][var29 + -1] >> 2));
                        byte var32 = 74;
                        var10[var30][var29] = var32 - var31;
                    }
                }
            } else {
                int var33 = (int) class109.field1637[1];
                int var34 = (int) class109.field1637[0];
                int var35 = (int) class109.field1637[2];
                int var36 = (int) Math.sqrt((double) (var35 * var35 + (var34 * var34 + (var33 * var33))));
                int var37 = var36 * 1024 >> 8;
                for (int var38 = 1; var38 < 103; var38++) {
                    for (int var39 = 1; var39 < 103; var39++) {
                        byte var40 = 96;
                        int var41 = class84.field1282[var13][var39][var38 + 1] - class84.field1282[var13][var39][var38 - 1];
                        int var42 = class84.field1282[var13][var39 + 1][var38] - class84.field1282[var13][var39 - 1][var38];
                        int var43 = (int) Math.sqrt((double) (var42 * var42 + (var41 * var41) + 65536));
                        int var44 = (var42 << 8) / var43;
                        int var45 = -65536 / var43;
                        int var46 = (var41 << 8) / var43;
                        int var47 = (var33 * var45 + (var34 * var44 + (var35 * var46))) / var37 + var40;
                        int var48 = (var15[var39 + 1][var38] >> 3) + (var15[var39][var38 + 1] >> 3) + (var15[var39 + -1][var38] >> 2) - (-(var15[var39][var38 + -1] >> 2) - (var15[var39][var38] >> 1));
                        var10[var39][var38] = var47 - ((int) ((float) var48 * 1.7F));
                    }
                }
            }
            for (int var49 = 0; var49 < 104; var49++) {
                class327.field5092[var49] = 0;
                class334.field5195[var49] = 0;
                class221.field3518[var49] = 0;
                class227.field3603[var49] = 0;
                class154.field2350[var49] = 0;
            }
            for (int var50 = -5; var50 < 104; var50++) {
                for (int var51 = 0; var51 < 104; var51++) {
                    int var52 = var50 + 5;
                    int var10002;
                    if (var52 < 104) {
                        int var53 = class297.field4658[var13][var52][var51] & 0xFF;
                        if (var53 > 0) {
                            class342 var54 = class266.method1891((byte) 77, var53 - 1);
                            class327.field5092[var51] += var54.field5319;
                            class334.field5195[var51] += var54.field5329;
                            class221.field3518[var51] += var54.field5338;
                            class227.field3603[var51] += var54.field5328;
                            var10002 = class154.field2350[var51]++;
                        }
                    }
                    int var55 = var50 - 5;
                    if (var55 >= 0) {
                        int var56 = class297.field4658[var13][var55][var51] & 0xFF;
                        if (var56 > 0) {
                            class342 var57 = class266.method1891((byte) 60, var56 - 1);
                            class327.field5092[var51] -= var57.field5319;
                            class334.field5195[var51] -= var57.field5329;
                            class221.field3518[var51] -= var57.field5338;
                            class227.field3603[var51] -= var57.field5328;
                            var10002 = class154.field2350[var51]--;
                        }
                    }
                }
                if (var50 >= 0) {
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    int var62 = 0;
                    for (int var63 = -5; var63 < 104; var63++) {
                        int var64 = var63 + 5;
                        int var65 = var63 - 5;
                        if (var64 < 104) {
                            var61 += class221.field3518[var64];
                            var62 += class334.field5195[var64];
                            var60 += class154.field2350[var64];
                            var58 += class327.field5092[var64];
                            var59 += class227.field3603[var64];
                        }
                        if (var65 >= 0) {
                            var58 -= class327.field5092[var65];
                            var61 -= class221.field3518[var65];
                            var62 -= class334.field5195[var65];
                            var59 -= class227.field3603[var65];
                            var60 -= class154.field2350[var65];
                        }
                        if (var63 >= 0 && var60 > 0) {
                            var12[var50][var63] = class78.method576(var62 / var60, var58 * 256 / var59, true, var61 / var60);
                        }
                    }
                }
            }
            for (int var66 = 1; var66 < 103; var66++) {
                label759: for (int var67 = 1; var67 < 103; var67++) {
                    if (arg0 || class152.method1062(121) || (class81.field1229[0][var66][var67] & 0x2) != 0 || (class81.field1229[var13][var66][var67] & 0x10) == 0 && class175.method1200(var66, var13, -16437, var67) == class146.field2190) {
                        if (class8.field94 > var13) {
                            class8.field94 = var13;
                        }
                        int var68 = class297.field4658[var13][var66][var67] & 0xFF;
                        int var69 = class42.field587[var13][var66][var67] & 0xFF;
                        if (var68 > 0 || var69 > 0) {
                            int var70 = class84.field1282[var13][var66][var67];
                            int var71 = class84.field1282[var13][var66 + 1][var67];
                            int var72 = class84.field1282[var13][var66 + 1][var67 + 1];
                            int var73 = class84.field1282[var13][var66][var67 + 1];
                            if (var13 > 0) {
                                boolean var74 = true;
                                if (var68 == 0 && class90.field1370[var13][var66][var67] != 0) {
                                    var74 = false;
                                }
                                if (var69 > 0 && !class226.method1651(var69 - 1, (byte) 56).field4584) {
                                    var74 = false;
                                }
                                if (var74 && var70 == var71 && var70 == var72 && var70 == var73) {
                                    class196.field3220[var13][var66][var67] = class24.method149(class196.field3220[var13][var66][var67], 4);
                                }
                            }
                            int var75;
                            int var78;
                            if (var68 > 0) {
                                var75 = var12[var66][var67];
                                int var76 = (var75 & 0x7F) + var11;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var9 + var75 & 0xFC00) + (var75 & 0x380) + var76;
                                var78 = class25.field368[class299.method2091((byte) -77, 96, var77)];
                            } else {
                                var75 = -1;
                                var78 = 0;
                            }
                            int var79 = var10[var66][var67];
                            int var80 = var10[var66][var67 + 1];
                            int var81 = var10[var66 + 1][var67];
                            int var82 = var10[var66 + 1][var67 + 1];
                            if (var69 == 0) {
                                class48.method332(var13, var66, var67, 0, 0, -1, var70, var71, var72, var73, class299.method2091((byte) -77, var79, var75), class299.method2091((byte) -77, var81, var75), class299.method2091((byte) -77, var82, var75), class299.method2091((byte) -77, var80, var75), 0, 0, 0, 0, var78, 0);
                                if (class186.field2991 && var13 > 0 && var75 != -1 && class266.method1891((byte) 33, var68 - 1).field5337) {
                                    class32.method218(0, 0, true, false, var66, var67, var70 - class84.field1282[0][var66][var67], -class84.field1282[0][var66 + 1][var67] + var71, var72 - class84.field1282[0][var66 + 1][var67 + 1], -class84.field1282[0][var66][var67 + 1] + var73);
                                }
                                if (class186.field2991 && !arg0 && class310.field4846 != null && var13 == 0) {
                                    for (int var98 = var66 - 1; var98 <= (var66 + 1); var98++) {
                                        for (int var99 = var67 - 1; var99 <= var67 + 1; var99++) {
                                            if ((var66 != var98 || var67 != var99) && var98 >= 0 && var98 < 104 && var99 >= 0 && var99 < 104) {
                                                int var100 = class42.field587[var13][var98][var99] & 0xFF;
                                                if (var100 != 0) {
                                                    class291 var101 = class226.method1651(var100 - 1, (byte) 65);
                                                    if (var101.field4586 != -1 && class16.method107(false, class25.field365.method382(var101.field4586, (byte) -109))) {
                                                        class310.field4846[var66][var67] = (var101.field4581 << 24) + var101.field4591;
                                                        continue label759;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var83 = class231.field3702[var13][var66][var67];
                                int var84 = class90.field1370[var13][var66][var67] + 1;
                                class291 var85 = class226.method1651(var69 - 1, (byte) 94);
                                if (class186.field2991 && !arg0 && class310.field4846 != null && var13 == 0) {
                                    if (var85.field4586 != -1 && class16.method107(false, class25.field365.method382(var85.field4586, (byte) -86))) {
                                        class310.field4846[var66][var67] = (var85.field4581 << 24) + var85.field4591;
                                    } else {
                                        label725: for (int var86 = var66 - 1; var86 <= (var66 + 1); var86++) {
                                            for (int var87 = var67 - 1; var87 <= (var67 + 1); var87++) {
                                                if ((var66 != var86 || var67 != var87) && var86 >= 0 && var86 < 104 && var87 >= 0 && var87 < 104) {
                                                    int var88 = class42.field587[var13][var86][var87] & 0xFF;
                                                    if (var88 != 0) {
                                                        class291 var89 = class226.method1651(var88 - 1, (byte) 99);
                                                        if (var89.field4586 != -1 && class16.method107(false, class25.field365.method382(var89.field4586, (byte) 105))) {
                                                            class310.field4846[var66][var67] = (var89.field4581 << 24) + var89.field4591;
                                                            break label725;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var90 = var85.field4586;
                                if (var90 >= 0 && !class25.field365.method374(1, var90)) {
                                    var90 = -1;
                                }
                                int var91;
                                int var92;
                                if (var90 >= 0) {
                                    var92 = class25.field368[class221.method1612(96, -50, class25.field365.method376((byte) -125, var90))];
                                    var91 = -1;
                                } else if (var85.field4588 == -1) {
                                    var91 = -2;
                                    var92 = 0;
                                } else {
                                    var91 = var85.field4588;
                                    int var93 = (var91 & 0x7F) + var11;
                                    if (var93 < 0) {
                                        var93 = 0;
                                    } else if (var93 > 127) {
                                        var93 = 127;
                                    }
                                    int var94 = (var9 + var91 & 0xFC00) + (var91 & 0x380) + var93;
                                    var92 = class25.field368[class221.method1612(96, -128, var94)];
                                }
                                if (var85.field4595 >= 0) {
                                    int var95 = var85.field4595;
                                    int var96 = (var95 & 0x7F) + var11;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var9 + var95 & 0xFC00) + var96 + (var95 & 0x380);
                                    var92 = class25.field368[class221.method1612(96, -40, var97)];
                                }
                                class48.method332(var13, var66, var67, var84, var83, var90, var70, var71, var72, var73, class299.method2091((byte) -77, var79, var75), class299.method2091((byte) -77, var81, var75), class299.method2091((byte) -77, var82, var75), class299.method2091((byte) -77, var80, var75), class221.method1612(var79, -67, var91), class221.method1612(var81, -39, var91), class221.method1612(var82, -23, var91), class221.method1612(var80, -49, var91), var78, var92);
                                if (class186.field2991 && var13 > 0) {
                                    class32.method218(var84, var83, var91 == -2 || !var85.field4590, var75 == -1 || !class266.method1891((byte) 88, var68 - 1).field5337, var66, var67, var70 - class84.field1282[0][var66][var67], -class84.field1282[0][var66 + 1][var67] + var71, var72 - class84.field1282[0][var66 + 1][var67 + 1], -class84.field1282[0][var66][var67 + 1] + var73);
                                }
                            }
                        }
                    }
                }
            }
            if (class186.field2991) {
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class84.field1282[var13];
                float[][] var105 = new float[105][105];
                int var106 = 1;
                while (true) {
                    if (var106 > 103) {
                        if (arg0) {
                            class83[] var111 = class182.method1256(var12, class297.field4658[var13], var103, class42.field587[var13], var105, var102, (byte) -98, class94.field1450[0], class90.field1370[var13], class231.field3702[var13], class310.field4846, var10, class84.field1282[var13], class81.field1229, arg1, var13);
                            class274.method1956(var13, var111);
                            break;
                        }
                        class83[] var112 = class182.method1256(var12, class297.field4658[var13], var103, class42.field587[var13], var105, var102, (byte) -66, (int[][]) null, class90.field1370[var13], class231.field3702[var13], (int[][]) null, var10, class84.field1282[var13], class81.field1229, arg1, var13);
                        class83[] var113 = client.method1899(class231.field3702[var13], class90.field1370[var13], var13, class297.field4658[var13], var102, var103, var105, class42.field587[var13], class81.field1229, class84.field1282[var13], var10, 32580);
                        class83[] var114 = new class83[var112.length + var113.length];
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var114[var115] = var112[var115];
                        }
                        for (int var116 = 0; var116 < var113.length; var116++) {
                            var114[var112.length + var116] = var113[var116];
                        }
                        class274.method1956(var13, var114);
                        class269.method1923(class84.field1282[var13], class47.field646, class42.field587[var13], var13, class231.field3702[var13], class47.field633, (byte) 123, class90.field1370[var13], class297.field4658[var13], var102, var105, var103);
                        break;
                    }
                    for (int var107 = 1; var107 <= 103; var107++) {
                        int var108 = var104[var107 + 1][var106] - var104[var107 - 1][var106];
                        int var109 = var104[var107][var106 + 1] - var104[var107][var106 - 1];
                        float var110 = (float) Math.sqrt((double) (var108 * var108 + var109 * var109 + 65536));
                        var102[var107][var106] = (float) var108 / var110;
                        var105[var107][var106] = -256.0F / var110;
                        var103[var107][var106] = (float) var109 / var110;
                    }
                    var106++;
                }
            }
            class297.field4658[var13] = (byte[][]) null;
            class42.field587[var13] = (byte[][]) null;
            class90.field1370[var13] = (byte[][]) null;
            class231.field3702[var13] = (byte[][]) null;
            class100.field1520[var13] = (byte[][]) null;
            var13++;
        }
        class149.method1053(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var117 = 0; var117 < 104; var117++) {
            for (int var118 = 0; var118 < 104; var118++) {
                if ((class81.field1229[1][var117][var118] & 0x2) == 2) {
                    class338.method2325(var117, var118);
                }
            }
        }
        for (int var119 = 0; var119 < 4; var119++) {
            for (int var120 = 0; var120 <= 104; var120++) {
                for (int var121 = 0; var121 <= 104; var121++) {
                    if ((class196.field3220[var119][var121][var120] & 0x1) != 0) {
                        int var122;
                        for (var122 = var120; var122 > 0 && (class196.field3220[var119][var121][var122 - 1] & 0x1) != 0; var122--) {
                        }
                        int var123 = var120;
                        int var124 = var119;
                        while (var123 < 104 && (class196.field3220[var119][var121][var123 + 1] & 0x1) != 0) {
                            var123++;
                        }
                        label444: while (var124 > 0) {
                            for (int var125 = var122; var125 <= var123; var125++) {
                                if ((class196.field3220[var124 - 1][var121][var125] & 0x1) == 0) {
                                    break label444;
                                }
                            }
                            var124--;
                        }
                        int var126;
                        label432: for (var126 = var119; var126 < 3; var126++) {
                            for (int var127 = var122; var127 <= var123; var127++) {
                                if ((class196.field3220[var126 + 1][var121][var127] & 0x1) == 0) {
                                    break label432;
                                }
                            }
                        }
                        int var128 = (var126 + 1 - var124) * (var123 + 1 - var122);
                        if (var128 >= 8) {
                            short var129 = 240;
                            int var130 = class84.field1282[var126][var121][var122] - var129;
                            int var131 = class84.field1282[var124][var121][var122];
                            class280.method1987(1, var121 * 128, var121 * 128, var122 * 128, var123 * 128 + 128, var130, var131);
                            for (int var132 = var124; var132 <= var126; var132++) {
                                for (int var133 = var122; var133 <= var123; var133++) {
                                    class196.field3220[var132][var121][var133] = class200.method1465(class196.field3220[var132][var121][var133], -2);
                                }
                            }
                        }
                    }
                    if ((class196.field3220[var119][var121][var120] & 0x2) != 0) {
                        int var134 = var121;
                        int var135 = var119;
                        int var136 = var121;
                        int var137 = var119;
                        while (var134 > 0 && (class196.field3220[var119][var134 - 1][var120] & 0x2) != 0) {
                            var134--;
                        }
                        while (var136 < 104 && (class196.field3220[var119][var136 + 1][var120] & 0x2) != 0) {
                            var136++;
                        }
                        label498: while (var137 > 0) {
                            for (int var138 = var134; var138 <= var136; var138++) {
                                if ((class196.field3220[var137 - 1][var138][var120] & 0x2) == 0) {
                                    break label498;
                                }
                            }
                            var137--;
                        }
                        label487: while (var135 < 3) {
                            for (int var139 = var134; var139 <= var136; var139++) {
                                if ((class196.field3220[var135 + 1][var139][var120] & 0x2) == 0) {
                                    break label487;
                                }
                            }
                            var135++;
                        }
                        int var140 = (var135 + 1 - var137) * (var136 + 1 - var134);
                        if (var140 >= 8) {
                            int var141 = class84.field1282[var137][var134][var120];
                            short var142 = 240;
                            int var143 = class84.field1282[var135][var134][var120] - var142;
                            class280.method1987(2, var134 * 128, var136 * 128 + 128, var120 * 128, var120 * 128, var143, var141);
                            for (int var144 = var137; var144 <= var135; var144++) {
                                for (int var145 = var134; var145 <= var136; var145++) {
                                    class196.field3220[var144][var145][var120] = class200.method1465(class196.field3220[var144][var145][var120], -3);
                                }
                            }
                        }
                    }
                    if ((class196.field3220[var119][var121][var120] & 0x4) != 0) {
                        int var146 = var121;
                        int var147 = var121;
                        int var148 = var120;
                        int var149 = var120;
                        while (var148 > 0 && (class196.field3220[var119][var121][var148 - 1] & 0x4) != 0) {
                            var148--;
                        }
                        while (var149 < 104 && (class196.field3220[var119][var121][var149 + 1] & 0x4) != 0) {
                            var149++;
                        }
                        label551: while (var146 > 0) {
                            for (int var150 = var148; var150 <= var149; var150++) {
                                if ((class196.field3220[var119][var146 - 1][var150] & 0x4) == 0) {
                                    break label551;
                                }
                            }
                            var146--;
                        }
                        label540: while (var147 < 104) {
                            for (int var151 = var148; var151 <= var149; var151++) {
                                if ((class196.field3220[var119][var147 + 1][var151] & 0x4) == 0) {
                                    break label540;
                                }
                            }
                            var147++;
                        }
                        if ((var147 + 1 - var146) * (var149 + 1 - var148) >= 4) {
                            int var152 = class84.field1282[var119][var146][var148];
                            class280.method1987(4, var146 * 128, var147 * 128 + 128, var148 * 128, var149 * 128 + 128, var152, var152);
                            for (int var153 = var146; var153 <= var147; var153++) {
                                for (int var154 = var148; var154 <= var149; var154++) {
                                    class196.field3220[var119][var153][var154] = class200.method1465(class196.field3220[var119][var153][var154], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZJ)V", line = 1286)
    public static final void method1778(boolean arg0, long arg1) {
        field3985++;
        if (arg1 == 0L) {
            return;
        }
        class21.field313.method1541(54, 45);
        class21.field313.method1375(arg1, 115);
        class35.field472++;
        if (!arg0) {
            method1771((byte) -5);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 1425)
    public class251() {
        class217 var1 = class264.field4183.method40(5, this, -69);
        while (var1.field3488 == 0) {
            class20.method128(0, 10L);
        }
        if (var1.field3488 == 2) {
            throw new RuntimeException();
        }
        this.field3997 = (Thread) var1.field3490;
    }

    @OriginalMember(owner = "client!jm", name = "run", descriptor = "()V", line = 1310)
    public final void run() {
        while (!this.field3999) {
            class330 var1 = this.field3989;
            class66 var2;
            synchronized (this.field3989) {
                var2 = (class66) this.field3989.method2283(33);
                if (var2 == null) {
                    try {
                        this.field3989.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3995--;
            }
            try {
                if (var2.field862 == 2) {
                    var2.field863.method1232((int) var2.field416, 123, var2.field867, var2.field867.length);
                } else if (var2.field862 == 3) {
                    var2.field867 = var2.field863.method1234((int) var2.field416, 1133474224);
                }
            } catch (Exception var6) {
                class314.method2186((String) null, 121, var6);
            }
            var2.field624 = false;
        }
        field3993++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 1355)
    public static void method1779(int arg0) {
        field3996 = (class230[][][]) null;
        if (arg0 != 0) {
            field3996 = (class230[][][]) ((class230[][][]) null);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lb;I)V", line = 1369)
    private final void method1780(class66 arg0, int arg1) {
        class330 var3 = this.field3989;
        synchronized (this.field3989) {
            this.field3989.method2279(arg0, (byte) -97);
            this.field3995++;
            this.field3989.notifyAll();
        }
        field3986++;
        int var5 = -54 % ((-arg1 - 82) / 44);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 1390)
    public final void method1781(int arg0) {
        field3990++;
        int var2 = -19 / ((-arg0 - 55) / 61);
        this.field3999 = true;
        class330 var3 = this.field3989;
        synchronized (this.field3989) {
            this.field3989.notifyAll();
        }
        try {
            this.field3997.join();
        } catch (InterruptedException var6) {
        }
        this.field3997 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZILlc;)Lb;", line = 1409)
    public final class66 method1782(boolean arg0, int arg1, class176 arg2) {
        field3998++;
        class66 var4 = new class66();
        var4.field626 = false;
        var4.field863 = arg2;
        var4.field416 = (long) arg1;
        var4.field862 = 3;
        if (arg0) {
            this.method1780(var4, -127);
            return var4;
        } else {
            return (class66) null;
        }
    }
}
