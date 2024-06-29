import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class236 extends class102 {

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    private int field4354 = 0;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    private int field4351 = 4096;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field4342 = 0;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lqe;")
    private static class179 field4345 = class206.method1380("flash2:", (byte) -127);

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Lqe;")
    public static class179 field4344 = class206.method1380("Bitte warten Sie eine Minute", (byte) 47);

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field4348 = 0;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lqe;")
    public static class179 field4347 = field4345;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lqe;")
    public static class179 field4355 = field4345;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4352;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "[Z")
    public static boolean[] field4346;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4341;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4351 = arg0.method1252(2);
            }
        } else {
            this.field4354 = arg0.method1252(2);
        }
        if (arg2) {
            field4344 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
    public static void method1531(byte arg0) {
        field4347 = null;
        field4345 = null;
        field4344 = null;
        if (arg0 > -65) {
            method1536(-113, 35, (class6[]) null, -2, (byte) -51);
        }
        field4346 = null;
        field4355 = null;
        field4352 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field4338;
        if (!arg0) {
            this.method13((class185) null, 50, true);
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            for (int var5 = 0; var5 < class155.field2796; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field4354 <= var6 && ~var6 >= ~this.field4351 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lqe;I)V")
    public static final void method1532(class179 arg0, int arg1) {
        ++field4349;
        class81.field1554 = arg0;
        class132.method849((byte) 120);
        if (arg1 != 21380) {
            field4343 = 13;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILeh;)[Lfc;")
    public static final class58[] method1533(byte arg0, int arg1, class52 arg2) {
        int var3 = 119 / ((arg0 - 2) / 44);
        ++field4353;
        return !class185.method1205(19263, arg2, arg1) ? null : class95.method614(0);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public static final void method1534(boolean arg0) {
        class124.method784(10687, false);
        ++field4340;
        class47.field1021 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class235.field4328.length; ++var2) {
            if (~class85.field1643[var2] != 0 && class235.field4328[var2] == null) {
                class235.field4328[var2] = class34.field753.method342(0, class85.field1643[var2], (byte) 78);
                if (class235.field4328[var2] == null) {
                    var1 = false;
                    ++class47.field1021;
                }
            }
            if (class59.field1273[var2] != -1 && class174.field3112[var2] == null) {
                class174.field3112[var2] = class34.field753.method356((byte) -53, class174.field3127[var2], class59.field1273[var2], 0);
                if (class174.field3112[var2] == null) {
                    var1 = false;
                    ++class47.field1021;
                }
            }
        }
        if (!var1) {
            class60.field1290 = 1;
        } else {
            class95.field1799 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class235.field4328.length < ~var4; ++var4) {
                byte[] var54 = class174.field3112[var4];
                if (var54 != null) {
                    int var55 = (class125.field2305[var4] >> 8) * 64 + -class2.field26;
                    int var56 = (class125.field2305[var4] & 255) * 64 + -class141.field2582;
                    if (class29.field631) {
                        var55 = 10;
                        var56 = 10;
                    }
                    var3 &= class180.method1175(var56, var55, !arg0, var54);
                }
            }
            if (!var3) {
                class60.field1290 = 2;
            } else {
                if (~class60.field1290 != -1) {
                    class163.method1045(4, true, class78.method502((byte) -117, new class179[] { class32.field683, class86.field1644 }));
                }
                class218.method1422(3516);
                class148.method948(arg0);
                class218.method1422(3516);
                class176.method1116();
                class218.method1422(3516);
                System.gc();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class135.field2492[var5].method269(16777215);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var52 = 0; ~var52 > -105; ++var52) {
                        for (int var53 = 0; var53 < 104; ++var53) {
                            class9.field265[var6][var52][var53] = 0;
                        }
                    }
                }
                class218.method1422(3516);
                class206.method1378(104);
                int var7 = class235.field4328.length;
                class183.method1189((byte) -61);
                class124.method784(10687, true);
                if (!class29.field631) {
                    for (int var8 = 0; var8 < var7; ++var8) {
                        int var18 = (class125.field2305[var8] >> 8) * 64 - class2.field26;
                        int var19 = (class125.field2305[var8] & 255) * 64 - class141.field2582;
                        byte[] var20 = class235.field4328[var8];
                        if (var20 != null) {
                            class218.method1422(3516);
                            class68.method438(var20, var19, class135.field2492, var18, class116.field2191 * 8 - 48, (byte) -70, (class2.field35 + -6) * 8);
                        }
                    }
                    for (int var9 = 0; var7 > var9; ++var9) {
                        int var14 = (class125.field2305[var9] >> 8) * 64 + -class2.field26;
                        byte[] var15 = class235.field4328[var9];
                        int var16 = (255 & class125.field2305[var9]) * 64 + -class141.field2582;
                        if (var15 == null && class116.field2191 < 800) {
                            class218.method1422(3516);
                            for (int var17 = 0; ~var17 > -5; ++var17) {
                                class194.method1302(var17, var14, 64, 64, var16, (byte) -116);
                            }
                        }
                    }
                    class124.method784(10687, true);
                    for (int var10 = 0; var10 < var7; ++var10) {
                        byte[] var11 = class174.field3112[var10];
                        if (var11 != null) {
                            int var12 = (class125.field2305[var10] >> 8) * 64 + -class2.field26;
                            int var13 = (255 & class125.field2305[var10]) * 64 + -class141.field2582;
                            class218.method1422(3516);
                            class232.method1515(var12, class135.field2492, var13, var11, (byte) 1);
                        }
                    }
                }
                if (class29.field631) {
                    for (int var21 = 0; var21 < 4; ++var21) {
                        class218.method1422(3516);
                        for (int var32 = 0; ~var32 > -14; ++var32) {
                            for (int var33 = 0; var33 < 13; ++var33) {
                                boolean var34 = false;
                                int var35 = class177.field3226[var21][var32][var33];
                                if (~var35 != 0) {
                                    int var36 = var35 >> 24 & 3;
                                    int var37 = (var35 & 6) >> 1;
                                    int var38 = (var35 & 16379) >> 3;
                                    int var39 = (16767248 & var35) >> 14;
                                    int var40 = (var39 / 8 << 8) - -(var38 / 8);
                                    for (int var41 = 0; class125.field2305.length > var41; ++var41) {
                                        if (~class125.field2305[var41] == ~var40 && class235.field4328[var41] != null) {
                                            var34 = true;
                                            class66.method428(class235.field4328[var41], class135.field2492, var21, (var38 & 7) * 8, var36, var37, var33 * 8, (var39 & 7) * 8, 23711, var32 * 8);
                                            break;
                                        }
                                    }
                                }
                                if (!var34) {
                                    class194.method1302(var21, var32 * 8, 8, 8, var33 * 8, (byte) 119);
                                }
                            }
                        }
                    }
                    class124.method784(10687, true);
                    for (int var22 = 0; var22 < 4; ++var22) {
                        class218.method1422(3516);
                        for (int var23 = 0; ~var23 > -14; ++var23) {
                            for (int var24 = 0; var24 < 13; ++var24) {
                                int var25 = class177.field3226[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = (50418073 & var25) >> 24;
                                    int var27 = var25 >> 1 & 3;
                                    int var28 = (var25 & 16381) >> 3;
                                    int var29 = var25 >> 14 & 1023;
                                    int var30 = (var29 / 8 << 8) + var28 / 8;
                                    for (int var31 = 0; var31 < class125.field2305.length; ++var31) {
                                        if (~class125.field2305[var31] == ~var30 && class174.field3112[var31] != null) {
                                            class60.method405(var26, (byte) -95, class135.field2492, (7 & var29) * 8, var22, var23 * 8, class174.field3112[var31], var27, (var28 & 7) * 8, var24 * 8);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class124.method784(10687, true);
                class148.method948(false);
                class218.method1422(3516);
                class90.method594(class135.field2492, -100);
                class124.method784(10687, true);
                int var42 = class46.field1010;
                if (var42 > class49.field1038) {
                    var42 = class49.field1038;
                }
                if (var42 < class49.field1038 + -1) {
                    int var43 = class49.field1038 + -1;
                }
                if (class180.field3307) {
                    class216.method1416(class46.field1010);
                } else {
                    class216.method1416(0);
                }
                for (int var44 = 0; var44 < 104; ++var44) {
                    for (int var51 = 0; ~var51 > -105; ++var51) {
                        class58.method398(var51, var44, (byte) -60);
                    }
                }
                class218.method1422(3516);
                class77.method497((byte) 116);
                class148.method948(false);
                if (class78.field1523 != null) {
                    class81.field1564.method70((byte) -62, 235);
                    ++class144.field2615;
                    class81.field1564.method1229((byte) -95, 1057001181);
                }
                if (!class29.field631) {
                    int var45 = (class2.field35 + -6) / 8;
                    int var46 = (class2.field35 + 6) / 8;
                    int var47 = (class116.field2191 - 6) / 8;
                    int var48 = (class116.field2191 + 6) / 8;
                    for (int var49 = var45 + -1; ~(var46 - -1) <= ~var49; ++var49) {
                        for (int var50 = var47 + -1; ~(var48 + 1) <= ~var50; ++var50) {
                            if (~var49 > ~var45 || ~var46 > ~var49 || var47 > var50 || ~var48 > ~var50) {
                                class34.field753.method354((byte) 71, class78.method502((byte) -110, new class179[] { class225.field4179, class148.method949((byte) -14, var49), class87.field1668, class148.method949((byte) -14, var50) }));
                                class34.field753.method354((byte) 118, class78.method502((byte) -91, new class179[] { class69.field1391, class148.method949((byte) -14, var49), class87.field1668, class148.method949((byte) -14, var50) }));
                            }
                        }
                    }
                }
                class223.method1449((byte) 106, 30);
                class218.method1422(3516);
                class233.method1519((byte) -124);
                class81.field1564.method70((byte) -62, 158);
                class132.method845(11693);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Z")
    public static final boolean method1535(int arg0, int arg1) {
        if (arg0 != 32) {
            method1531((byte) -50);
        }
        ++field4350;
        return (arg1 >> 31 & 1) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class236() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[Lae;IB)V")
    public static final void method1536(int arg0, int arg1, class6[] arg2, int arg3, byte arg4) {
        if (arg4 == 41) {
            for (int var5 = 0; arg2.length > var5; ++var5) {
                class6 var6 = arg2[var5];
                if (var6 != null && var6.field131 == arg1) {
                    if (var6.field162 != 0) {
                        if (~var6.field162 != -2) {
                            if (~var6.field162 == -3) {
                                var6.field169 = var6.field89 * arg3 >> 14;
                            } else if (var6.field162 == 3) {
                                if (~var6.field128 != -3) {
                                    if (var6.field128 == 7) {
                                        var6.field169 = (var6.field89 - 1) * var6.field82 + var6.field89 * 115;
                                    }
                                } else {
                                    var6.field169 = (var6.field89 + -1) * var6.field82 + var6.field89 * 32;
                                }
                            }
                        } else {
                            var6.field169 = arg3 - var6.field89;
                        }
                    } else {
                        var6.field169 = var6.field89;
                    }
                    if (var6.field70 > -var6.field169 + var6.field152) {
                        var6.field70 = var6.field152 - var6.field169;
                    }
                    if (~var6.field90 == -1) {
                        var6.field166 = var6.field75;
                    } else if (var6.field90 != 1) {
                        if (var6.field90 != 2) {
                            if (var6.field90 != 3) {
                                if (~var6.field90 != -5) {
                                    var6.field166 = -var6.field169 + arg3 + -(var6.field75 * arg3 >> 14);
                                } else {
                                    var6.field166 = (var6.field75 * arg3 >> 14) + (-var6.field169 + arg3) / 2;
                                }
                            } else {
                                var6.field166 = var6.field75 * arg3 >> 14;
                            }
                        } else {
                            var6.field166 = -var6.field169 + arg3 - var6.field75;
                        }
                    } else {
                        var6.field166 = (-var6.field169 + arg3) / 2 + var6.field75;
                    }
                    if (~var6.field151 != -1) {
                        if (var6.field151 == 1) {
                            var6.field73 = -var6.field86 + arg0;
                        } else if (var6.field151 != 2) {
                            if (var6.field151 == 3) {
                                if (var6.field128 != 2) {
                                    if (var6.field128 == 7) {
                                        var6.field73 = (var6.field86 + -1) * var6.field103 + var6.field86 * 12;
                                    }
                                } else {
                                    var6.field73 = (var6.field86 + -1) * var6.field103 + var6.field86 * 32;
                                }
                            }
                        } else {
                            var6.field73 = var6.field86 * arg0 >> 14;
                        }
                    } else {
                        var6.field73 = var6.field86;
                    }
                    if (~var6.field70 > -1) {
                        var6.field70 = 0;
                    }
                    if (var6.field213 != 0) {
                        if (var6.field213 == 1) {
                            var6.field83 = (-var6.field73 + arg0) / 2 + var6.field110;
                        } else if (~var6.field213 != -3) {
                            if (~var6.field213 == -4) {
                                var6.field83 = var6.field110 * arg0 >> 14;
                            } else if (~var6.field213 != -5) {
                                var6.field83 = arg0 - (var6.field110 * arg0 >> 14) + -var6.field73;
                            } else {
                                var6.field83 = (-var6.field73 + arg0) / 2 - -(var6.field110 * arg0 >> 14);
                            }
                        } else {
                            var6.field83 = arg0 - var6.field110 + -var6.field73;
                        }
                    } else {
                        var6.field83 = var6.field110;
                    }
                    if (~var6.field119 < ~(-var6.field73 + var6.field97)) {
                        var6.field119 = -var6.field73 + var6.field97;
                    }
                    if (var6.field119 < 0) {
                        var6.field119 = 0;
                    }
                    if (~var6.field128 == -1) {
                        class54.method380(var6, (byte) 25);
                    }
                }
            }
            ++field4339;
        }
    }
}
