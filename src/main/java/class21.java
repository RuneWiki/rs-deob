import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class21 extends class224 {

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    private int field257 = 585;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Ljk;")
    public static class76 field259 = new class76();

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILdk;)V", line = 6)
    public static final void method103(int arg0, class241 arg1) {
        if (arg0 == 2) {
            field260++;
            class256.field4358 = arg1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 17)
    public static void method104(int arg0) {
        field259 = null;
        if (arg0 != 128) {
            method110(-58, -91, 74, -114, -119, 5, -27);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILuf;I)V", line = 28)
    public static final void method105(int arg0, class168 arg1, int arg2) {
        field254++;
        if (arg2 <= 70) {
            method107(87, (byte) 59, -69, -85, 102);
        }
        class26 var3 = class77.method455(2, -71, arg0);
        var3.method137(255);
        var3.field332 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 43)
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V", line = 47)
    public static final void method106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 128) {
            field259 = (class76) null;
        }
        field256++;
        class44.field538 = arg3;
        class9.field112 = arg1;
        class150.field2331 = arg0;
        class65.field874 = arg4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[I", line = 63)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = 34 / ((arg0 - 20) / 51);
        field255++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int var5 = class303.field5103[arg1];
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                int var7 = class73.field979[var6];
                if (var7 > this.field257 && 4096 - this.field257 > var7 && 2048 - this.field257 < var5 && this.field257 + 2048 > var5) {
                    int var8 = 2048 - var7;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field257);
                    var4[var6] = 4096 - var11;
                } else if (var7 > 2048 - this.field257 && var7 < (this.field257 + 2048)) {
                    int var12 = var5 - 2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field257;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (2048 - this.field257);
                } else if (this.field257 > var5 || var5 > (4096 - this.field257)) {
                    int var20 = var7 - 2048;
                    int var21 = var20 >= 0 ? var20 : -var20;
                    int var22 = var21 - this.field257;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (2048 - this.field257);
                } else if (var7 >= this.field257 && 4096 - this.field257 >= var7) {
                    var4[var6] = 0;
                } else {
                    int var16 = 2048 - var5;
                    int var17 = var16 >= 0 ? var16 : -var16;
                    int var18 = var17 << 12;
                    int var19 = var18 / (2048 - this.field257);
                    var4[var6] = 4096 - var19;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBIII)V", line = 139)
    public static final void method107(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field253++;
        class249.field4262.field2367 = 0;
        class249.field4262.method1095(99, -49);
        class249.field4262.method1095(arg3, -58);
        class249.field4262.method1095(arg4, -99);
        class249.field4262.method1047(-120, arg0);
        if (arg1 >= -85) {
            return;
        }
        class249.field4262.method1047(-102, arg2);
        class38.field476 = 1;
        class95.field1515 = 0;
        class273.field4588 = -3;
        class99.field1559 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)Z", line = 172)
    public static final boolean method108(int arg0, int arg1, int arg2, int arg3) {
        if (!class18.method84(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class227.field3686[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class187.field2968) {
                    if (!class174.method1258(var4, var6, var5)) {
                        return false;
                    }
                    if (!class174.method1258(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1258(var4, var7, var5)) {
                        return false;
                    }
                    if (!class174.method1258(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class174.method1258(var4, var8, var5)) {
                    return false;
                }
                if (!class174.method1258(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class205.field3375) {
                    if (!class174.method1258(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class174.method1258(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1258(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class174.method1258(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class174.method1258(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class174.method1258(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class187.field2968) {
                    if (!class174.method1258(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class174.method1258(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1258(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class174.method1258(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class174.method1258(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class174.method1258(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class205.field3375) {
                    if (!class174.method1258(var4, var6, var5)) {
                        return false;
                    }
                    if (!class174.method1258(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1258(var4, var7, var5)) {
                        return false;
                    }
                    if (!class174.method1258(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class174.method1258(var4, var8, var5)) {
                    return false;
                }
                if (!class174.method1258(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class174.method1258(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class174.method1258(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class174.method1258(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class174.method1258(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class174.method1258(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIII)V", line = 361)
    public static final void method109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 - arg4 >= class150.field2331 && (arg2 + arg4) <= class65.field874 && class9.field112 <= (arg3 - arg4) && class44.field538 >= arg3 + arg4) {
            class244.method1682(arg3, arg1, arg4, arg2, (byte) 63);
        } else {
            class203.method1417(arg3, arg2, arg4, arg1, 4949);
        }
        field251++;
        if (arg0 < 29) {
            method107(-97, (byte) 18, 121, 10, -66);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIII)V", line = 387)
    public static final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 94) {
            field261 = 107;
        }
        class138.field2124 = 0;
        for (int var7 = -1; var7 < class2.field15 + class167.field2676; var7++) {
            class189 var8;
            if (var7 == -1) {
                var8 = class266.field4489;
            } else if (class167.field2676 > var7) {
                var8 = class9.field117[class281.field4719[var7]];
            } else {
                var8 = class190.field3065[class116.field1814[var7 - class167.field2676]];
            }
            if (var8 != null && var8.method111(0)) {
                if (var8 instanceof class22) {
                    class196 var9 = ((class22) var8).field267;
                    if (var9.field3188 != null) {
                        var9 = var9.method1387((byte) -1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class167.field2676) {
                    class196 var15 = ((class22) var8).field267;
                    if (var15.field3188 != null) {
                        var15 = var15.method1387((byte) -1);
                    }
                    if (var15.field3206 >= 0 && var15.field3206 < class40.field512.length) {
                        class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46) + 15, arg5 >> 1, arg2, arg0);
                        if (class95.field1521 > -1) {
                            class40.field512[var15.field3206].method151(class95.field1521 + arg3 - 12, arg6 - -class234.field3758 + -30);
                        }
                    }
                    int var16 = 0;
                    class15[] var17 = class43.field534;
                    while (var17.length > var16) {
                        class15 var18 = var17[var16];
                        if (var18 != null && var18.field151 == 1 && class116.field1814[var7 - class167.field2676] == var18.field157 && class203.field3335 % 20 < 10) {
                            class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46) + 15, arg5 >> 1, arg2, arg0);
                            if (class95.field1521 > -1) {
                                class148.field2285[var18.field150].method151(class95.field1521 + arg3 - 12, arg6 + -28 - -class234.field3758);
                            }
                        }
                        var16++;
                    }
                } else {
                    class54 var10 = (class54) var8;
                    int var11 = 30;
                    if (var10.field676 != -1 || var10.field677 != -1) {
                        class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46) + 15, arg5 >> 1, arg2, arg0);
                        if (class95.field1521 > -1) {
                            if (var10.field676 != -1) {
                                class298.field5045[var10.field676].method151(arg3 + class95.field1521 - 12, -var11 + class234.field3758 + arg6);
                                var11 += 25;
                            }
                            if (var10.field677 != -1) {
                                class40.field512[var10.field677].method151(class95.field1521 + arg3 - 12, -var11 + arg6 + class234.field3758);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class15[] var13 = class43.field534;
                        while (var13.length > var12) {
                            class15 var14 = var13[var12];
                            if (var14 != null && var14.field151 == 10 && class281.field4719[var7] == var14.field157) {
                                class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46) + 15, arg5 >> 1, arg2, arg0);
                                if (class95.field1521 > -1) {
                                    class148.field2285[var14.field150].method151(arg3 + class95.field1521 - 12, class234.field3758 + arg6 - var11);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field3039 != null && (class167.field2676 <= var7 || class40.field513 == 0 || class40.field513 == 3 || class40.field513 == 1 && class69.method392(0, ((class54) var8).field658))) {
                    class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46), arg5 >> 1, arg2, arg0);
                    if (class95.field1521 > -1 && class138.field2124 < class105.field1626) {
                        class105.field1615[class138.field2124] = class102.field1588.method207(var8.field3039) / 2;
                        class105.field1608[class138.field2124] = class102.field1588.field443;
                        class105.field1623[class138.field2124] = class95.field1521;
                        class105.field1625[class138.field2124] = class234.field3758;
                        class105.field1612[class138.field2124] = var8.field2998;
                        class105.field1613[class138.field2124] = var8.field3001;
                        class105.field1617[class138.field2124] = var8.field3051;
                        class105.field1610[class138.field2124] = var8.field3039;
                        class138.field2124++;
                    }
                }
                if (var8.field3035 > class203.field3335) {
                    class284 var19 = class296.field5007[1];
                    class284 var20 = class296.field5007[0];
                    if (var8 instanceof class22) {
                        class22 var21 = (class22) var8;
                        class284[] var22 = (class284[]) ((class284[]) class276.field4640.method1424((long) var21.field267.field3213, (byte) 76));
                        if (var22 == null) {
                            var22 = class274.method1896(119, class61.field792, var21.field267.field3213, 0);
                            if (var22 != null) {
                                class276.field4640.method1430(var22, (long) var21.field267.field3213, 13487);
                            }
                        }
                        if (var22 != null && var22.length == 2) {
                            var20 = var22[0];
                            var19 = var22[1];
                        }
                    }
                    class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46) - (-var20.field4808 - 10), arg5 >> 1, arg2, arg0);
                    if (class95.field1521 > -1) {
                        int var23 = class95.field1521 + arg3 - (var20.field4801 >> 1);
                        int var24 = class234.field3758 + arg6 - 3;
                        var20.method151(var23, var24);
                        int var25 = var20.field4808;
                        int var26 = var8.field3030 * var20.field4801 / 255;
                        class228.method1562(var23, var24, var23 + var26, var24 + var25);
                        var19.method151(var23, var24);
                        class228.method1563(arg3, arg6, arg3 + arg5, arg4 + arg6);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class203.field3335 < var8.field3031[var27]) {
                        class46.method249(arg4 >> 1, (byte) 45, var8, var8.method1329((byte) 46) / 2, arg5 >> 1, arg2, arg0);
                        if (class95.field1521 > -1) {
                            if (var27 == 1) {
                                class234.field3758 -= 20;
                            }
                            if (var27 == 2) {
                                class234.field3758 -= 10;
                                class95.field1521 -= 15;
                            }
                            if (var27 == 3) {
                                class95.field1521 += 15;
                                class234.field3758 -= 10;
                            }
                            class50.field611[var8.field2992[var27]].method151(arg3 + class95.field1521 - 12, class234.field3758 + -12 + arg6);
                            class245.field4170.method192(class169.method1228(var8.field2994[var27], 0), arg3 + class95.field1521 - 1, class234.field3758 + arg6 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var28 = 0; var28 < class138.field2124; var28++) {
            int var29 = class105.field1623[var28];
            int var30 = class105.field1625[var28];
            int var31 = class105.field1615[var28];
            boolean var32 = true;
            int var33 = class105.field1608[var28];
            while (var32) {
                var32 = false;
                for (int var34 = 0; var34 < var28; var34++) {
                    if (var30 + 2 > class105.field1625[var34] + -class105.field1608[var34] && (var30 - var33) < (class105.field1625[var34] + 2) && (class105.field1623[var34] + class105.field1615[var34]) > (var29 - var31) && var29 + var31 > class105.field1623[var34] + -class105.field1615[var34] && (class105.field1625[var34] - class105.field1608[var34]) < var30) {
                        var32 = true;
                        var30 = class105.field1625[var34] - class105.field1608[var34];
                    }
                }
            }
            class95.field1521 = class105.field1623[var28];
            class234.field3758 = class105.field1625[var28] = var30;
            class168 var35 = class105.field1610[var28];
            if (class169.field2779 == 0) {
                int var36 = 16776960;
                if (class105.field1612[var28] < 6) {
                    var36 = class231.field3717[class105.field1612[var28]];
                }
                if (class105.field1612[var28] == 6) {
                    var36 = (class134.field2091 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class105.field1612[var28] == 7) {
                    var36 = (class134.field2091 % 20) < 10 ? 255 : 65535;
                }
                if (class105.field1612[var28] == 8) {
                    var36 = class134.field2091 % 20 < 10 ? 45056 : 8454016;
                }
                if (class105.field1612[var28] == 9) {
                    int var37 = 150 - class105.field1617[var28];
                    if (var37 < 50) {
                        var36 = var37 * 1280 + 16711680;
                    } else if (var37 < 100) {
                        var36 = 16776960 - ((var37 - 50) * 327680);
                    } else if (var37 < 150) {
                        var36 = var37 * 5 + 65280 - 500;
                    }
                }
                if (class105.field1612[var28] == 10) {
                    int var38 = 150 - class105.field1617[var28];
                    if (var38 < 50) {
                        var36 = var38 * 5 + 16711680;
                    } else if (var38 < 100) {
                        var36 = 16384000 + 16711935 - (var38 * 327680);
                    } else if (var38 < 150) {
                        var36 = (var38 * 327680) + 255 - (32767500 - -(var38 * 5));
                    }
                }
                if (class105.field1612[var28] == 11) {
                    int var39 = 150 - class105.field1617[var28];
                    if (var39 < 50) {
                        var36 = 16777215 - var39 * 327685;
                    } else if (var39 < 100) {
                        var36 = var39 * 327685 + 65280 - 16384250;
                    } else if (var39 < 150) {
                        var36 = 16777215 - (var39 - 100) * 327680;
                    }
                }
                if (class105.field1613[var28] == 0) {
                    class102.field1588.method192(var35, class95.field1521 + arg3, class234.field3758 + arg6, var36, 0);
                }
                if (class105.field1613[var28] == 1) {
                    class102.field1588.method203(var35, arg3 + class95.field1521, class234.field3758 + arg6, var36, 0, class134.field2091);
                }
                if (class105.field1613[var28] == 2) {
                    class102.field1588.method210(var35, class95.field1521 + arg3, class234.field3758 + arg6, var36, 0, class134.field2091);
                }
                if (class105.field1613[var28] == 3) {
                    class102.field1588.method199(var35, arg3 + class95.field1521, class234.field3758 + arg6, var36, 0, class134.field2091, 150 - class105.field1617[var28]);
                }
                if (class105.field1613[var28] == 4) {
                    int var40 = (150 - class105.field1617[var28]) * (class102.field1588.method207(var35) + 100) / 150;
                    class228.method1562(arg3 + class95.field1521 - 50, arg6, arg3 + class95.field1521 + 50, arg4 + arg6);
                    class102.field1588.method193(var35, arg3 + class95.field1521 + 50 - var40, class234.field3758 + arg6, var36, 0);
                    class228.method1563(arg3, arg6, arg3 + arg5, arg4 + arg6);
                }
                if (class105.field1613[var28] == 5) {
                    int var41 = 150 - class105.field1617[var28];
                    int var42 = 0;
                    if (var41 < 25) {
                        var42 = var41 - 25;
                    } else if (var41 > 125) {
                        var42 = var41 - 125;
                    }
                    class228.method1562(arg3, class234.field3758 + arg6 - class102.field1588.field443 - 1, arg3 + arg5, arg6 + class234.field3758 + 5);
                    class102.field1588.method192(var35, arg3 + class95.field1521, class234.field3758 + var42 + arg6, var36, 0);
                    class228.method1563(arg3, arg6, arg3 + arg5, arg6 - -arg4);
                }
            } else {
                class102.field1588.method192(var35, class95.field1521 + arg3, arg6 - -class234.field3758, 16776960, 0);
            }
        }
        field252++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZLj;)V", line = 828)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field257 = arg2.method1069(29);
        }
        field258++;
        if (arg1) {
            method109(33, -85, -63, 117, 65);
        }
    }
}
