import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class400 extends class80 {

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "Luf;")
    public static class310 field5570 = new class310(0, -2);

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "Lwo;")
    public static class522 field5572 = new class522();

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Luf;")
    public static class310 field5573 = new class310(94, 12);

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Ljava/lang/String;")
    public String field5561;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "[C")
    public char[] field5557;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "[C")
    public char[] field5565;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "[I")
    public int[] field5559;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "[I")
    public int[] field5564;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Llh;Z)V")
    public final void method2313(class365 arg0, boolean arg1) {
        field5560++;
        if (arg1) {
            this.field5564 = null;
        }
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                return;
            }
            this.method2315(arg1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method2314(int arg0) {
        field5573 = null;
        if (arg0 < 53) {
            field5572 = null;
        }
        field5572 = null;
        field5570 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILlh;)V")
    private final void method2315(boolean arg0, int arg1, class365 arg2) {
        if (arg0) {
            method2319(67, true);
        }
        if (arg1 == 1) {
            this.field5561 = arg2.method2106(-1);
        } else if (arg1 == 2) {
            int var4 = arg2.method2099(255);
            this.field5557 = new char[var4];
            this.field5559 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5559[var5] = arg2.method2062((byte) 14);
                byte var6 = arg2.method2081((byte) 15);
                this.field5557[var5] = var6 == 0 ? 0 : class376.method2168(var6, (byte) -127);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method2099(255);
            this.field5565 = new char[var7];
            this.field5564 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5564[var8] = arg2.method2062((byte) 14);
                byte var9 = arg2.method2081((byte) 100);
                this.field5565[var8] = var9 == 0 ? 0 : class376.method2168(var9, (byte) -128);
            }
        }
        field5563++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(CI)I")
    public final int method2316(char arg0, int arg1) {
        field5566++;
        if (this.field5559 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field5559.length; var3++) {
            if (this.field5557[var3] == arg0) {
                return this.field5559[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZC)I")
    public final int method2317(boolean arg0, char arg1) {
        field5568++;
        if (this.field5564 == null) {
            return -1;
        }
        int var3 = 0;
        if (!arg0) {
            method2318(-45, null);
        }
        while (var3 < this.field5564.length) {
            if (this.field5565[var3] == arg1) {
                return this.field5564[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILqa;)V")
    public static final void method2318(int arg0, class162 arg1) {
        field5562++;
        if (!(class370.field5198 >= 2 || class297.field4101) || class292.field3914 != null) {
            return;
        }
        String var2;
        if (class297.field4101 && class370.field5198 < 2) {
            var2 = class344.field4734 + class173.field2488.method590(class105.field1434, -22602) + class526.field7728 + " ->";
        } else if (class483.field7095 && class488.field7125.method1212(arg0 + 10839, 81) && class370.field5198 > 2) {
            var2 = class224.method1327((class149) class260.field3585.field7697.field7339.field7339, arg0 ^ 0xFFFFCC5D);
        } else {
            class149 var3 = (class149) class260.field3585.field7697.field7339;
            var2 = class224.method1327(var3, arg0 + 17485);
            int[] var4 = null;
            if (class230.method1346(var3.field2102, -72)) {
                var4 = class75.field1097.method823(false, (int) var3.field2105).field4381;
            } else if (var3.field2101 != -1) {
                var4 = class75.field1097.method823(false, var3.field2101).field4381;
            } else if (class411.method2447((byte) 118, var3.field2102)) {
                class405 var5 = class179.field2534[(int) var3.field2105];
                if (var5 != null) {
                    class336 var6 = var5.field5623;
                    if (var6.field4612 != null) {
                        var6 = var6.method1860(class453.field6623, (byte) -52);
                    }
                    if (var6 != null) {
                        var4 = var6.field4603;
                    }
                }
            } else if (class67.method418(var3.field2102, -127)) {
                Object var7 = null;
                class132 var8;
                if (var3.field2102 == 1003) {
                    var8 = class82.field1154.method2121((int) var3.field2105, true);
                } else {
                    var8 = class82.field1154.method2121((int) (var3.field2105 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var8.field1814 != null) {
                    var8 = var8.method870(0, class453.field6623);
                }
                if (var8 != null) {
                    var4 = var8.field1888;
                }
            }
            if (var4 != null) {
                var2 = var2 + class334.method1851(var4, 0);
            }
        }
        if (class370.field5198 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class370.field5198 - 2) + class2.field22.method590(class105.field1434, -22602);
        }
        if (arg0 != -10840) {
            field5573 = null;
        }
        if (class164.field2335 != null) {
            class490 var9 = class164.field2335.method1683((byte) -109, arg1);
            if (var9 == null) {
                var9 = class34.field487;
            }
            var9.method2877(class164.field2335.field4035, class164.field2335.field4022, class167.field2360, class164.field2335.field3960, class164.field2335.field3963, class272.field3713, class164.field2335.field4024, var2, class432.field6288, class164.field2335.field3925, (byte) 119, class119.field1615, class127.field1739, class65.field896, class65.field887);
            class469.method2758(class65.field896[2], class65.field896[1], class65.field896[3], class65.field896[0], 0);
        } else if (class492.field7281 != null && class341.field4700 == class166.field2348) {
            int var10 = class34.field487.method2888(class65.field887, var2, class272.field3713, 16777215, class119.field1615, arg0 ^ 0x1BC6, class432.field6288, class239.field3278 + 4, 0, class290.field3895 + 16);
            class469.method2758(var10 + class105.field1430.method362(var2, (byte) 123), class290.field3895, 16, class239.field3278 + 4, 0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2319(int arg0, boolean arg1) {
        if (arg1) {
            field5570 = null;
        }
        field5558++;
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public final void method2320(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (this.field5564 != null) {
            for (int var2 = 0; var2 < this.field5564.length; var2++) {
                this.field5564[var2] = class25.method183(this.field5564[var2], 32768);
            }
        }
        field5569++;
        if (this.field5559 != null) {
            for (int var3 = 0; var3 < this.field5559.length; var3++) {
                this.field5559[var3] = class25.method183(this.field5559[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method2321(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field5567++;
        if (!arg5) {
            method2314(69);
        }
        int var7 = class378.field5322;
        int[] var8 = class95.field1321;
        class150.field2114 = 0;
        for (int var9 = 0; var9 < (class166.field2352 + var7); var9++) {
            class336 var32 = null;
            class22 var33;
            if (var9 >= var7) {
                var33 = class179.field2534[class54.field750[var9 - var7]];
                var32 = ((class405) var33).field5623;
                if (var32.field4612 != null) {
                    var32 = var32.method1860(class453.field6623, (byte) -106);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class309.field4234[var8[var9]];
            }
            if (var33.field306 >= 0 && (class87.field1195 == var33.field356 || class75.field1089.field464 == var33.field464)) {
                class424.method2530(81, arg6, arg1 >> 1, var33, var33.method172(0), arg2 >> 1, arg0);
                if (class172.field2457[0] >= 0) {
                    if (var33.field327 != null && (var9 >= var7 || class134.field1943 == 0 || class134.field1943 == 3 || class134.field1943 == 1 && class314.method1775((byte) 107, ((class192) var33).field2693)) && class77.field1108 > class150.field2114) {
                        class77.field1102[class150.field2114] = class105.field1430.method362(var33.field327, (byte) 67) / 2;
                        class77.field1117[class150.field2114] = class172.field2457[0];
                        class77.field1115[class150.field2114] = class172.field2457[1];
                        class77.field1120[class150.field2114] = var33.field320;
                        class77.field1121[class150.field2114] = var33.field276;
                        class77.field1106[class150.field2114] = var33.field319;
                        class77.field1104[class150.field2114] = var33.field327;
                        class150.field2114++;
                    }
                    int var34 = class172.field2457[1] + arg4;
                    int var45;
                    if (var33.field353 || var33.field348 <= class393.field5484) {
                        var45 = var34 - Math.max(class105.field1430.field776, class433.field6309[0].method129());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class192 var37 = class309.field4234[var8[var9]];
                            var38 = var33.method165((byte) -123).field230;
                            if (var37.field2702) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field4625;
                            if (var38 == -1) {
                                var38 = var33.method165((byte) -92).field230;
                            }
                        }
                        class529[] var39 = class433.field6309;
                        if (var38 != -1) {
                            class529[] var40 = (class529[]) class131.field1810.method56((long) var38, 36);
                            if (var40 == null) {
                                class531[] var41 = class531.method3129(class192.field2735, var38, 0);
                                if (var41 != null) {
                                    var40 = new class529[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class418.field6109.method482(var41[var42], true);
                                    }
                                    class131.field1810.method73((long) var38, var40, 26425);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class529 var43 = var39[0];
                        class529 var44 = var39[var36];
                        var45 = var34 - Math.max(class105.field1430.field776, var43.method129());
                        int var46 = arg3 - ((var43.method125() >> 1) - class172.field2457[0]);
                        int var47 = var43.method125() * var33.field323 / 255;
                        if (var33.field323 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method3111(var46, var45);
                        class418.field6109.method516(var46, var45, var46 + var47, var43.method129() + var45);
                        var44.method3111(var46, var45);
                        class418.field6109.method462(arg3, arg4, arg2 + arg3, arg1 + arg4);
                    }
                    var45 -= 2;
                    if (!var33.field353) {
                        if (class393.field5484 < var33.field296) {
                            class529 var48 = class327.field4476[var33.field269 ? 2 : 0];
                            class529 var49 = class327.field4476[var33.field269 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class405) {
                                var51 = var32.field4624;
                                if (var51 == -1) {
                                    var51 = var33.method165((byte) -108).field253;
                                }
                            } else {
                                var51 = var33.method165((byte) -85).field253;
                            }
                            if (var51 != -1) {
                                class529[] var52 = (class529[]) class119.field1622.method56((long) var51, 61);
                                if (var52 == null) {
                                    class531[] var53 = class531.method3129(class192.field2735, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class529[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class418.field6109.method482(var53[var54], true);
                                        }
                                        class119.field1622.method73((long) var51, var52, 26425);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field269 ? 3 : 1];
                                    var48 = var52[var33.field269 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field296 - class393.field5484;
                            int var56;
                            if (var55 <= var33.field339) {
                                var56 = var48.method125();
                            } else {
                                int var57 = var55 - var33.field339;
                                int var58 = var33.field282 == 0 ? 0 : (var33.field331 - var57) / var33.field282 * var33.field282;
                                var56 = var48.method125() * var58 / var33.field331;
                            }
                            int var59 = var48.method129();
                            var45 -= var59;
                            int var60 = class172.field2457[0] + arg3 - (var48.method125() >> 1);
                            var48.method3111(var60, var45);
                            class418.field6109.method516(var60, var45, var56 + var60, var45 - -var59);
                            var49.method3111(var60, var45);
                            class418.field6109.method462(arg3, arg4, arg2 + arg3, arg4 - -arg1);
                            var45 -= 2;
                        }
                        if (var7 > var9) {
                            class192 var62 = (class192) var33;
                            if (var62.field2697 != -1) {
                                var45 -= 25;
                                class504.field7418[var62.field2697].method3111(class172.field2457[0] + arg3 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field2694 != -1) {
                                var45 -= 25;
                                class234.field3238[var62.field2694].method3111(arg3 + class172.field2457[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field4614 >= 0 && var32.field4614 < class234.field3238.length) {
                            class529 var61 = class234.field3238[var32.field4614];
                            var45 -= 25;
                            var61.method3111(class172.field2457[0] + arg3 - (var61.method125() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class192) {
                        int var69 = 0;
                        class473[] var70 = class324.field4457;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class473 var75 = var70[var71];
                            if (var75 != null && var75.field6911 == 1 && class54.field750[var9 - var7] == var75.field6904) {
                                class529 var76 = class344.field4742[var75.field6905];
                                if (var69 < var76.method129()) {
                                    var69 = var76.method129();
                                }
                                if ((class393.field5484 % 20) < 10) {
                                    var76.method3111(class172.field2457[0] + arg3 - 12, var45 + -var76.method129());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class473[] var64 = class324.field4457;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class473 var67 = var64[var65];
                            if (var67 != null && var67.field6911 == 10 && var8[var9] == var67.field6904) {
                                class529 var68 = class344.field4742[var67.field6905];
                                if (var68.method129() > var63) {
                                    var63 = var68.method129();
                                }
                                var68.method3111(arg3 + class172.field2457[0] - 12, -var68.method129() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field338[var73] > class393.field5484) {
                            int var74 = var33.method172(0) / 2;
                            class424.method2530(87, arg6, arg1 >> 1, var33, var74, arg2 >> 1, arg0);
                            if (class172.field2457[0] > -1) {
                                if (var73 == 1) {
                                    class172.field2457[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class172.field2457[1] -= 10;
                                    class172.field2457[0] -= 15;
                                }
                                if (var73 == 3) {
                                    class172.field2457[1] -= 10;
                                    class172.field2457[0] += 15;
                                }
                                class233.field3228[var33.field291[var73]].method3111(arg3 - (12 - class172.field2457[0]), class172.field2457[1] + arg4 - 12);
                                class176.field2505.method2884(arg4 + class172.field2457[1] + 3, arg3 + -1 + class172.field2457[0], -1, -114, 0, Integer.toString(var33.field284[var73]));
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class510.field7483; var10++) {
            int var28 = class415.field6086[var10];
            class22 var29;
            if (var28 < 2048) {
                var29 = class309.field4234[var28];
            } else {
                var29 = class179.field2534[var28 - 2048];
            }
            int var30 = class1.field4[var10];
            class22 var31;
            if (var30 < 2048) {
                var31 = class309.field4234[var30];
            } else {
                var31 = class179.field2534[var30 - 2048];
            }
            class86.method603(arg4, arg2, arg6, arg0, var31, arg1, var29, --var29.field314, arg3, 6487);
        }
        int var11 = class105.field1430.field776 + class105.field1430.field774 + 2;
        for (int var12 = 0; var12 < class150.field2114; var12++) {
            int var13 = class77.field1117[var12];
            int var14 = class77.field1115[var12];
            int var15 = class77.field1102[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class77.field1115[var27] - var11 < var14 + 2 && class77.field1115[var27] + 2 > var14 - var11 && class77.field1117[var27] + class77.field1102[var27] > -var15 + var13 && (class77.field1117[var27] - class77.field1102[var27]) < (var13 + var15) && (class77.field1115[var27] - var11) < var14) {
                        var14 = class77.field1115[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class77.field1115[var12] = var14;
            String var17 = class77.field1104[var12];
            if (class349.field4789 == 0) {
                int var18 = 16776960;
                if (class77.field1120[var12] < 6) {
                    var18 = class374.field5219[class77.field1120[var12]];
                }
                if (class77.field1120[var12] == 6) {
                    var18 = (class87.field1195 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class77.field1120[var12] == 7) {
                    var18 = (class87.field1195 % 20) >= 10 ? 65535 : 255;
                }
                if (class77.field1120[var12] == 8) {
                    var18 = class87.field1195 % 20 < 10 ? 45056 : 8454016;
                }
                if (class77.field1120[var12] == 9) {
                    int var19 = 150 - class77.field1106[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class77.field1120[var12] == 10) {
                    int var20 = 150 - class77.field1106[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 + 16384000 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 755 - var20 * 5;
                    }
                }
                if (class77.field1120[var12] == 11) {
                    int var21 = 150 - class77.field1106[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class77.field1121[var12] == 0) {
                    class34.field487.method2884(arg4 + var14, arg3 + var13, var22, -114, -16777216, var17);
                }
                if (class77.field1121[var12] == 1) {
                    class34.field487.method2883(var22, 117, class87.field1195, var17, arg4 + var14, -16777216, arg3 + var13);
                }
                if (class77.field1121[var12] == 2) {
                    class34.field487.method2880(class87.field1195, -16777216, arg4 + var14, var22, arg3 + var13, false, var17);
                }
                if (class77.field1121[var12] == 3) {
                    class34.field487.method2873(-1, -16777216, arg4 + var14, arg3 + var13, var17, 150 - class77.field1106[var12], var22, class87.field1195);
                }
                if (class77.field1121[var12] == 4) {
                    int var23 = (150 - class77.field1106[var12]) * (class105.field1430.method362(var17, (byte) 84) + 100) / 150;
                    class418.field6109.method516(var13 + arg3 - 50, arg4, var13 + arg3 + 50, arg1 + arg4);
                    class34.field487.method2881(var17, (byte) -122, var22, var13 + arg3 + 50 - var23, -16777216, arg4 + var14);
                    class418.field6109.method462(arg3, arg4, arg2 + arg3, arg1 + arg4);
                }
                if (class77.field1121[var12] == 5) {
                    int var24 = 150 - class77.field1106[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class105.field1430.field776 + class105.field1430.field774;
                    class418.field6109.method516(arg3, arg4 + var14 - (var26 + 1), arg2 + arg3, var14 + arg4 + 5);
                    class34.field487.method2884(arg4 + var14 + var25, arg3 - -var13, var22, -105, -16777216, var17);
                    class418.field6109.method462(arg3, arg4, arg3 + arg2, arg1 + arg4);
                }
            } else {
                class34.field487.method2884(arg4 + var14, arg3 + var13, -256, -128, -16777216, var17);
            }
        }
    }
}
