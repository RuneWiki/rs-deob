import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class42 extends class295 implements Runnable {

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
    private boolean field446 = true;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lwr;")
    private class368 field445;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Z")
    public static boolean field437 = false;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field444++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = 82 % ((arg4 - 26) / 63);
        int var20 = (var6 + 1) * var16;
        class296.method1740(arg0 - arg2, class153.field1932[arg3], (byte) 81, arg1, arg0 + arg2);
        int var21 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var20;
                    var13 += var17;
                    var17 += var16;
                    var20 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var20;
                var17 += var16;
                var6++;
                var20 += var16;
            }
            var13 += -var21;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var21 -= var15;
            int var22 = arg3 - var7;
            int var23 = arg3 + var7;
            int var24 = arg0 + var6;
            int var25 = arg0 - var6;
            class296.method1740(var25, class153.field1932[var22], (byte) 81, arg1, var24);
            class296.method1740(var25, class153.field1932[var23], (byte) 81, arg1, var24);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V", line = 87)
    public static final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class211.field2863 = 0;
        field441++;
        for (int var7 = -1; var7 < class293.field3991 + class244.field3320; var7++) {
            class345 var30 = null;
            class419 var31;
            if (var7 < 0) {
                var31 = class427.field6264;
            } else if (var7 >= class293.field3991) {
                var31 = class38.field397[class308.field4175[var7 - class293.field3991]];
                var30 = ((class91) var31).field1035;
                if (var30.field4672 != null) {
                    var30 = var30.method2026(-1);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class85.field957[class345.field4629[var7]];
            }
            if (var31.field6021 >= 0) {
                class209.method1138(var31, 122, arg5, var31.method501(255), arg4 >> 1, arg6 >> 1, arg3);
                if (class155.field1969[0] >= 0) {
                    if (var31.field6060 != null && (var7 >= class293.field3991 || class371.field5196 == 0 || class371.field5196 == 3 || class371.field5196 == 1 && class51.method246(arg2 - 2280, ((class158) var31).field2034)) && class254.field3485 > class211.field2863) {
                        class254.field3489[class211.field2863] = class111.field1385.method2526(var31.field6060, 160) / 2;
                        class254.field3492[class211.field2863] = class155.field1969[0];
                        class254.field3490[class211.field2863] = class155.field1969[1];
                        class254.field3493[class211.field2863] = var31.field6061;
                        class254.field3491[class211.field2863] = var31.field6098;
                        class254.field3486[class211.field2863] = var31.field6044;
                        class254.field3494[class211.field2863] = var31.field6060;
                        class211.field2863++;
                    }
                    class20 var32 = class272.field3677[0];
                    int var33 = arg0 + class155.field1969[1] - Math.max(class111.field1385.field5866, var32.method105());
                    if (!var31.field6054 && class234.field3224 < var31.field6034) {
                        class20 var34 = class272.field3677[1];
                        if (var31 instanceof class91) {
                            class91 var35 = (class91) var31;
                            class20[] var36 = (class20[]) class422.field6190.method616(117, (long) var35.field1035.field4670);
                            if (var36 == null) {
                                class241[] var37 = class241.method1291(class72.field797, var35.field1035.field4670, 0);
                                if (var37 != null) {
                                    var36 = new class20[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class88.field1003.method1633(var37[var38], true);
                                    }
                                    class422.field6190.method615((byte) -110, (long) var35.field1035.field4670, var36);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var34 = var36[1];
                                var32 = var36[0];
                            }
                        }
                        int var39 = arg1 + class155.field1969[0] - (var32.method97() >> 1);
                        var32.method93(var39, var33);
                        int var40 = var32.method97() * var31.field6043 / 255;
                        class88.field1003.method1580(var39, var33, var39 + var40, var33 + var32.method105());
                        var34.method93(var39, var33);
                        class88.field1003.method1648(arg1, arg0, arg1 + arg4, arg0 + arg6);
                    }
                    var33 -= 2;
                    if (!var31.field6054) {
                        if (var31.field6062 > class234.field3224) {
                            class20 var41 = class105.field1294[var31.field6048 ? 2 : 0];
                            class20 var42 = class105.field1294[var31.field6048 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if ((var31 instanceof class91)) {
                                var44 = var30.field4684;
                                if (var44 == -1) {
                                    var44 = var31.method2606(0).field754;
                                }
                            } else {
                                var44 = var31.method2606(0).field754;
                            }
                            if (var44 != -1) {
                                class20[] var45 = (class20[]) class115.field1433.method616(-99, (long) var44);
                                if (var45 == null) {
                                    class241[] var46 = class241.method1291(class72.field797, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class20[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class88.field1003.method1633(var46[var47], true);
                                        }
                                        class115.field1433.method615((byte) -119, (long) var44, var45);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var42 = var45[var31.field6048 ? 3 : 1];
                                    var41 = var45[var31.field6048 ? 2 : 0];
                                }
                            }
                            int var48 = var31.field6062 - class234.field3224;
                            int var51;
                            if (var31.field6067 < var48) {
                                int var49 = var48 - var31.field6067;
                                int var50 = var31.field6042 == 0 ? 0 : (var31.field6055 - var49) / var31.field6042 * var31.field6042;
                                var51 = var50 * var41.method97() / var31.field6055;
                            } else {
                                var51 = var41.method97();
                            }
                            int var52 = var41.method105();
                            var33 -= var52;
                            int var53 = class155.field1969[0] + arg1 - (var41.method97() >> 1);
                            var41.method93(var53, var33);
                            class88.field1003.method1580(var53, var33, var51 + var53, var33 + var52);
                            var42.method93(var53, var33);
                            class88.field1003.method1648(arg1, arg0, arg1 + arg4, arg0 + arg6);
                            var33 -= 2;
                        }
                        if (class293.field3991 > var7) {
                            class158 var55 = (class158) var31;
                            if (var55.field2008 != -1) {
                                var33 -= 25;
                                class437.field6391[var55.field2008].method93(class155.field1969[0] + arg1 - 12, var33);
                                var33 -= 2;
                            }
                            if (var55.field2030 != -1) {
                                var33 -= 25;
                                class270.field3662[var55.field2030].method93(arg1 + class155.field1969[0] - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field4686 >= 0 && var30.field4686 < class270.field3662.length) {
                            class20 var54 = class270.field3662[var30.field4686];
                            var33 -= 25;
                            var54.method93(class155.field1969[0] + arg1 - (var54.method97() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var31 instanceof class158)) {
                        int var56 = 0;
                        class41[] var57 = class416.field5982;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class41 var60 = var57[var58];
                            if (var60 != null && var60.field427 == 1 && class308.field4175[var7 - class293.field3991] == var60.field429) {
                                class20 var61 = class209.field2845[var60.field435];
                                if (var56 < var61.method105()) {
                                    var56 = var61.method105();
                                }
                                if (class234.field3224 % 20 < 10) {
                                    var61.method93(class155.field1969[0] + arg1 - 12, -var61.method105() + var33);
                                }
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var62 = 0;
                        class41[] var63 = class416.field5982;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class41 var66 = var63[var64];
                            if (var66 != null && var66.field427 == 10 && class345.field4629[var7] == var66.field429) {
                                class20 var67 = class209.field2845[var66.field435];
                                if (var62 < var67.method105()) {
                                    var62 = var67.method105();
                                }
                                var67.method93(class155.field1969[0] + arg1 - 12, -var67.method105() + var33);
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    }
                    for (int var68 = 0; var68 < 4; var68++) {
                        if (class234.field3224 < var31.field6045[var68]) {
                            int var69 = var31.method501(arg2 ^ 0x9A9) / 2;
                            class209.method1138(var31, arg2 ^ 0x928, arg5, var69, arg4 >> 1, arg6 >> 1, arg3);
                            if (class155.field1969[0] > -1) {
                                if (var68 == 1) {
                                    class155.field1969[1] -= 20;
                                }
                                if (var68 == 2) {
                                    class155.field1969[0] -= 15;
                                    class155.field1969[1] -= 10;
                                }
                                if (var68 == 3) {
                                    class155.field1969[0] += 15;
                                    class155.field1969[1] -= 10;
                                }
                                class111.field1371[var31.field6038[var68]].method93(class155.field1969[0] + arg1 - 12, class155.field1969[1] + arg0 - 12);
                                class115.field1436.method1766(552, Integer.toString(var31.field6082[var68]), arg1 + class155.field1969[0] - 1, -1, 0, class155.field1969[1] + arg0 + 3);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 2390) {
            method204(68, (class419) null);
        }
        for (int var8 = 0; var8 < class167.field2122; var8++) {
            int var26 = class376.field5280[var8];
            class419 var27;
            if (var26 < 2048) {
                var27 = class85.field957[var26];
            } else {
                var27 = class38.field397[var26 - 2048];
            }
            int var28 = class129.field1662[var8];
            class419 var29;
            if (var28 >= 2048) {
                var29 = class38.field397[var28 - 2048];
            } else {
                var29 = class85.field957[var28];
            }
            class267.method1484(--var27.field6063, arg3, arg1, -1, var27, arg4, arg5, arg6, arg0, var29);
        }
        int var9 = class111.field1385.field5866 + class111.field1385.field5879 + 2;
        for (int var10 = 0; var10 < class211.field2863; var10++) {
            int var11 = class254.field3492[var10];
            int var12 = class254.field3490[var10];
            int var13 = class254.field3489[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if ((class254.field3490[var25] - var9) < (var12 + 2) && (var12 - var9) < (class254.field3490[var25] + 2) && (var11 - var13) < (class254.field3492[var25] + class254.field3489[var25]) && (class254.field3492[var25] - class254.field3489[var25]) < (var11 + var13) && var12 > (class254.field3490[var25] - var9)) {
                        var14 = true;
                        var12 = class254.field3490[var25] - var9;
                    }
                }
            }
            class254.field3490[var10] = var12;
            String var15 = class254.field3494[var10];
            if (class27.field260 == 0) {
                int var16 = 16776960;
                if (class254.field3493[var10] < 6) {
                    var16 = class139.field1785[class254.field3493[var10]];
                }
                if (class254.field3493[var10] == 6) {
                    var16 = class127.field1642 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class254.field3493[var10] == 7) {
                    var16 = class127.field1642 % 20 < 10 ? 255 : 65535;
                }
                if (class254.field3493[var10] == 8) {
                    var16 = class127.field1642 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class254.field3493[var10] == 9) {
                    int var17 = 150 - class254.field3486[var10];
                    if (var17 < 50) {
                        var16 = (var17 * 1280) + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var16 = (var17 * 5) + 65280 - 500;
                    }
                }
                if (class254.field3493[var10] == 10) {
                    int var18 = 150 - class254.field3486[var10];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - ((var18 - 50) * 327680);
                    } else if (var18 < 150) {
                        var16 = var18 * 327680 + 255 - ((var18 - 100) * 5) - 32768000;
                    }
                }
                if (class254.field3493[var10] == 11) {
                    int var19 = 150 - class254.field3486[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - ((var19 - 100) * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class254.field3491[var10] == 0) {
                    class291.field3957.method1766(552, var15, arg1 + var11, var20, -16777216, arg0 + var12);
                }
                if (class254.field3491[var10] == 1) {
                    class291.field3957.method1760(class127.field1642, var15, -16777216, arg0 + var12, var20, (byte) -125, arg1 + var11);
                }
                if (class254.field3491[var10] == 2) {
                    class291.field3957.method1764(arg0 + var12, var15, -16777216, var20, class127.field1642, 0, arg1 + var11);
                }
                if (class254.field3491[var10] == 3) {
                    class291.field3957.method1765(-16777216, arg0 + var12, var20, arg1 + var11, arg2 ^ 0x2B27, var15, 150 - class254.field3486[var10], class127.field1642);
                }
                if (class254.field3491[var10] == 4) {
                    int var21 = (150 - class254.field3486[var10]) * (class111.field1385.method2526(var15, 160) + 100) / 150;
                    class88.field1003.method1580(arg1 + var11 - 50, arg0, var11 + arg1 + 50, arg0 + arg6);
                    class291.field3957.method1746(var20, var15, arg1 + var11 + 50 - var21, (byte) -122, -16777216, arg0 + var12);
                    class88.field1003.method1648(arg1, arg0, arg1 + arg4, arg0 + arg6);
                }
                if (class254.field3491[var10] == 5) {
                    int var22 = 150 - class254.field3486[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class111.field1385.field5879 + class111.field1385.field5866;
                    class88.field1003.method1580(arg1, arg0 + var12 - (var24 + 1), arg1 + arg4, arg0 + var12 + 5);
                    class291.field3957.method1766(552, var15, arg1 + var11, var20, -16777216, var12 + var23 + arg0);
                    class88.field1003.method1648(arg1, arg0, arg1 + arg4, arg0 - -arg6);
                }
            } else {
                class291.field3957.method1766(552, var15, arg1 + var11, -256, -16777216, arg0 + var12);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I", line = 632)
    public static final int method200(byte arg0) {
        field443++;
        int var1 = -83 / ((arg0 + 46) / 41);
        return class225.field3055;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 651)
    public final void method201(int arg0) {
        this.field446 = false;
        int var2 = -24 % ((-arg0 - 35) / 55);
        field440++;
    }

    @OriginalMember(owner = "client!wb", name = "run", descriptor = "()V", line = 662)
    public final void run() {
        while (this.field446) {
            this.field445.method2228(this, -108);
        }
        field436++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lwr;)V", line = 1304)
    public class42(class368 arg0) {
        this.field445 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Llo;IZ)V", line = 677)
    public static final void method202(class419 arg0, int arg1, boolean arg2) {
        field447++;
        class70 var3 = arg0.method2606(0);
        if (arg0.field6111 == 0) {
            class397.field5715 = 0;
            arg0.field6112 = 0;
            class221.field2966 = -1;
            return;
        }
        if (arg0.field6073 != -1 && arg0.field6036 == 0) {
            class208 var4 = class193.method1037(57, arg0.field6073);
            if (arg0.field6118 > 0 && var4.field2829 == 0) {
                class397.field5715 = 0;
                arg0.field6112++;
                class221.field2966 = -1;
                return;
            }
            if (arg0.field6118 <= 0 && var4.field2804 == 0) {
                class221.field2966 = -1;
                class397.field5715 = 0;
                arg0.field6112++;
                return;
            }
        }
        if (arg0.field6027 != -1 && class234.field3224 >= arg0.field6078) {
            class393 var5 = class220.method1186((byte) -110, arg0.field6027);
            if (var5.field5666 && var5.field5648 != -1) {
                class208 var6 = class193.method1037(86, var5.field5648);
                if (arg0.field6118 > 0 && var6.field2829 == 0) {
                    class397.field5715 = 0;
                    class221.field2966 = -1;
                    arg0.field6112++;
                    return;
                }
                if (arg0.field6118 <= 0 && var6.field2804 == 0) {
                    class397.field5715 = 0;
                    arg0.field6112++;
                    class221.field2966 = -1;
                    return;
                }
            }
        }
        int var7 = arg0.field152;
        int var8 = arg0.field154;
        int var9 = arg0.field6119[arg0.field6111 - 1] * 128 + (arg0.method857((byte) -106) * 64);
        int var10 = arg0.field6109[arg0.field6111 - 1] * 128 + arg0.method857((byte) -106) * 64;
        if (!arg2 && var9 - var7 > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || (var10 - var8) < -256) {
            class221.field2966 = -1;
            arg0.field152 = var9;
            arg0.field154 = var10;
            class397.field5715 = 0;
            return;
        }
        if (var9 > var7) {
            if (var10 > var8) {
                arg0.method2612(4, 10240);
            } else if (var8 <= var10) {
                arg0.method2612(arg1 ^ 0x4, 12288);
            } else {
                arg0.method2612(4, 14336);
            }
        } else if (var9 >= var7) {
            if (var10 > var8) {
                arg0.method2612(4, 8192);
            } else if (var8 > var10) {
                arg0.method2612(4, 0);
            }
        } else if (var8 < var10) {
            arg0.method2612(4, 6144);
        } else if (var8 <= var10) {
            arg0.method2612(arg1 ^ 0x4, 4096);
        } else {
            arg0.method2612(4, 2048);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg0 instanceof class91) {
            var12 = ((class91) arg0).field1035.field4633;
        }
        if (var12) {
            int var13 = arg0.field6052 - arg0.field6075.field6358;
            if (var13 != 0 && arg0.field6024 == -1 && arg0.field6070 != 0) {
                var11 = 2;
            }
            if (!arg2 && arg0.field6111 > 2) {
                var11 = 6;
            }
            if (!arg2 && arg0.field6111 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg2 && arg0.field6111 > 1) {
                var11 = 6;
            }
            if (!arg2 && arg0.field6111 > 2) {
                var11 = 8;
            }
        }
        if (arg0.field6112 > 0 && arg0.field6111 > 1) {
            arg0.field6112--;
            var11 = 8;
        }
        byte var14 = arg0.field6122[arg0.field6111 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        class397.field5715 = arg1;
        if (var3.field753 != -1) {
            int var15 = var11 << 7;
            if (arg0.field6111 == 1) {
                int var16 = arg0.field6121 * arg0.field6121;
                int var17 = (var9 >= arg0.field152 ? var9 - arg0.field152 : -var9 + arg0.field152) << 7;
                int var18 = (var10 >= arg0.field154 ? var10 - arg0.field154 : -var10 + arg0.field154) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var19 * 2 * var3.field753;
                if (var20 < var16) {
                    arg0.field6121 /= 2;
                } else if (var19 < var16 / 2) {
                    arg0.field6121 -= var3.field753;
                    if (arg0.field6121 < 0) {
                        arg0.field6121 = 0;
                    }
                } else if (var15 > arg0.field6121) {
                    arg0.field6121 += var3.field753;
                    if (var15 < arg0.field6121) {
                        arg0.field6121 = var15;
                    }
                }
            } else if (var15 > arg0.field6121) {
                arg0.field6121 += var3.field753;
                if (arg0.field6121 > var15) {
                    arg0.field6121 = var15;
                }
            } else if (arg0.field6121 > 0) {
                arg0.field6121 -= var3.field753;
                if (arg0.field6121 < 0) {
                    arg0.field6121 = 0;
                }
            }
            var11 = arg0.field6121 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var7 < var9) {
            arg0.field152 += var11;
            class397.field5715 |= 0x4;
            if (arg0.field152 > var9) {
                arg0.field152 = var9;
            }
        } else if (var9 < var7) {
            arg0.field152 -= var11;
            class397.field5715 |= 0x8;
            if (var9 > arg0.field152) {
                arg0.field152 = var9;
            }
        }
        if (var10 > var8) {
            arg0.field154 += var11;
            class397.field5715 |= 0x1;
            if (arg0.field154 > var10) {
                arg0.field154 = var10;
            }
        } else if (var10 < var8) {
            arg0.field154 -= var11;
            class397.field5715 |= 0x2;
            if (arg0.field154 < var10) {
                arg0.field154 = var10;
            }
        }
        if (var11 < 8) {
            class221.field2966 = var14;
        } else {
            class221.field2966 = 2;
        }
        if (arg0.field152 != var9 || arg0.field154 != var10) {
            return;
        }
        arg0.field6111--;
        if (arg0.field6118 > 0) {
            arg0.field6118--;
            return;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 973)
    public final void method203(int arg0) {
        field442++;
        (new Thread(this, "a")).start();
        if (arg0 <= 86) {
            method200((byte) 24);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILlo;)V", line = 992)
    public static final void method204(int arg0, class419 arg1) {
        field438++;
        arg1.field6049 = false;
        if (arg1.field6100 != -1) {
            class208 var2 = class193.method1037(98, arg1.field6100);
            if (var2 == null || var2.field2823 == null) {
                arg1.field6056 = false;
                arg1.field6100 = -1;
            } else {
                label301: {
                    arg1.field6058++;
                    if (var2.field2823.length > arg1.field6030 && arg1.field6058 > var2.field2818[arg1.field6030]) {
                        arg1.field6074++;
                        arg1.field6030++;
                        arg1.field6058 = 1;
                        class320.method1848(class427.field6264 == arg1, -109, var2, arg1.field6030, arg1.field152, arg1.field154);
                    }
                    if (arg1.field6030 >= var2.field2823.length) {
                        arg1.field6030 = 0;
                        arg1.field6058 = 0;
                        if (arg1.field6056) {
                            arg1.field6100 = arg1.method2606(0).method402(-111);
                            if (arg1.field6100 == -1) {
                                arg1.field6056 = false;
                                break label301;
                            }
                            var2 = class193.method1037(124, arg1.field6100);
                        }
                        class320.method1848(class427.field6264 == arg1, arg0 ^ 0xFFFFFFAD, var2, arg1.field6030, arg1.field152, arg1.field154);
                    }
                    arg1.field6074 = arg1.field6030 + 1;
                    if (var2.field2823.length <= arg1.field6074) {
                        arg1.field6074 = 0;
                    }
                }
            }
        }
        if (arg1.field6027 != arg0 && class234.field3224 >= arg1.field6078) {
            class393 var3 = class220.method1186((byte) -110, arg1.field6027);
            int var4 = var3.field5648;
            if (var4 == -1) {
                arg1.field6027 = -1;
            } else {
                label303: {
                    class208 var5 = class193.method1037(54, var4);
                    if (var3.field5666) {
                        if (var5.field2829 == 3) {
                            if (arg1.field6118 > 0 && arg1.field6029 <= class234.field3224 && arg1.field6037 < class234.field3224) {
                                arg1.field6027 = -1;
                                break label303;
                            }
                        } else if (var5.field2829 == 1 && arg1.field6118 > 0 && class234.field3224 >= arg1.field6029 && arg1.field6037 < class234.field3224) {
                            arg1.field6078 = class234.field3224 + 1;
                            break label303;
                        }
                    }
                    if (var5 == null || var5.field2823 == null) {
                        arg1.field6027 = -1;
                    } else {
                        if (arg1.field6039 < 0) {
                            arg1.field6039 = 0;
                            class320.method1848(class427.field6264 == arg1, -84, var5, 0, arg1.field152, arg1.field154);
                        }
                        arg1.field6083++;
                        if (arg1.field6039 < var5.field2823.length && var5.field2818[arg1.field6039] < arg1.field6083) {
                            arg1.field6083 = 1;
                            arg1.field6039++;
                            class320.method1848(class427.field6264 == arg1, arg0 - 97, var5, arg1.field6039, arg1.field152, arg1.field154);
                        }
                        if (var5.field2823.length <= arg1.field6039) {
                            if (var3.field5666) {
                                arg1.field6047++;
                                arg1.field6039 -= var5.field2828;
                                if (var5.field2814 <= arg1.field6047) {
                                    arg1.field6027 = -1;
                                } else if (arg1.field6039 >= 0 && var5.field2823.length > arg1.field6039) {
                                    class320.method1848(class427.field6264 == arg1, 87, var5, arg1.field6039, arg1.field152, arg1.field154);
                                } else {
                                    arg1.field6027 = -1;
                                }
                            } else {
                                arg1.field6027 = -1;
                            }
                        }
                        arg1.field6068 = arg1.field6039 + 1;
                        if (arg1.field6068 >= var5.field2823.length) {
                            if (var3.field5666) {
                                arg1.field6068 -= var5.field2828;
                                if (arg1.field6047 + 1 >= var5.field2814) {
                                    arg1.field6068 = -1;
                                } else if (arg1.field6068 < 0 || arg1.field6068 >= var5.field2823.length) {
                                    arg1.field6068 = -1;
                                }
                            } else {
                                arg1.field6068 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6073 != -1 && arg1.field6036 <= 1) {
            class208 var6 = class193.method1037(121, arg1.field6073);
            if (var6.field2829 == 3) {
                if (arg1.field6118 > 0 && class234.field3224 >= arg1.field6029 && class234.field3224 > arg1.field6037) {
                    arg1.field6073 = -1;
                }
            } else if (var6.field2829 == 1 && arg1.field6118 > 0 && arg1.field6029 <= class234.field3224 && class234.field3224 > arg1.field6037) {
                arg1.field6036 = 2;
            }
        }
        if (arg1.field6073 != -1 && arg1.field6036 == 0) {
            class208 var7 = class193.method1037(arg0 ^ 0xFFFFFFC4, arg1.field6073);
            if (var7 == null || var7.field2823 == null) {
                arg1.field6073 = -1;
            } else {
                arg1.field6040++;
                if (arg1.field6033 < var7.field2823.length && var7.field2818[arg1.field6033] < arg1.field6040) {
                    arg1.field6033++;
                    arg1.field6040 = 1;
                    class320.method1848(class427.field6264 == arg1, -100, var7, arg1.field6033, arg1.field152, arg1.field154);
                }
                if (arg1.field6033 >= var7.field2823.length) {
                    arg1.field6033 -= var7.field2828;
                    arg1.field6059++;
                    if (arg1.field6059 >= var7.field2814) {
                        arg1.field6073 = -1;
                    } else if (arg1.field6033 >= 0 && arg1.field6033 < var7.field2823.length) {
                        class320.method1848(class427.field6264 == arg1, -78, var7, arg1.field6033, arg1.field152, arg1.field154);
                    } else {
                        arg1.field6073 = -1;
                    }
                }
                arg1.field6094 = arg1.field6033 + 1;
                if (var7.field2823.length <= arg1.field6094) {
                    arg1.field6094 -= var7.field2828;
                    if ((arg1.field6059 + 1) >= var7.field2814) {
                        arg1.field6094 = -1;
                    } else if (arg1.field6094 < 0 || var7.field2823.length <= arg1.field6094) {
                        arg1.field6094 = -1;
                    }
                }
                arg1.field6049 = var7.field2822;
            }
        }
        if (arg1.field6036 > 0) {
            arg1.field6036--;
        }
        for (int var8 = 0; var8 < arg1.field6051.length; var8++) {
            class395 var9 = arg1.field6051[var8];
            if (var9 != null) {
                if (var9.field5681 > 0) {
                    var9.field5681--;
                } else {
                    class208 var10 = class193.method1037(46, var9.field5685);
                    if (var10 == null || var10.field2823 == null) {
                        arg1.field6051[var8] = null;
                    } else {
                        var9.field5691++;
                        if (var10.field2823.length > var9.field5684 && var9.field5691 > var10.field2818[var9.field5684]) {
                            var9.field5691 = 1;
                            var9.field5684++;
                            class320.method1848(class427.field6264 == arg1, 114, var10, var9.field5684, arg1.field152, arg1.field154);
                        }
                        if (var10.field2823.length <= var9.field5684) {
                            var9.field5680++;
                            var9.field5684 -= var10.field2828;
                            if (var9.field5680 >= var10.field2814) {
                                arg1.field6051[var8] = null;
                            } else if (var9.field5684 >= 0 && var9.field5684 < var10.field2823.length) {
                                class320.method1848(class427.field6264 == arg1, 82, var10, var9.field5684, arg1.field152, arg1.field154);
                            } else {
                                arg1.field6051[var8] = null;
                            }
                        }
                        var9.field5683 = var9.field5684 + 1;
                        if (var10.field2823.length <= var9.field5683) {
                            var9.field5683 -= var10.field2828;
                            if ((var9.field5680 + 1) >= var10.field2814) {
                                var9.field5683 = -1;
                            } else if (var9.field5683 < 0 || var10.field2823.length <= var9.field5683) {
                                var9.field5683 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
