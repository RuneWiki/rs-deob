import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class216 extends class157 {

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    private int field3901 = 204;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    private int field3902 = 1;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    private int field3903 = 1;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    private static int field3893 = 0;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lcc;")
    public static class209 field3892 = class95.method669(92, "::serverjs5drop");

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lcc;")
    public static class209 field3900 = class95.method669(102, "mapfunction");

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILsj;)Lij;")
    public static final class194 method1512(int arg0, int arg1, int arg2, class49 arg3) {
        if (arg2 != -9) {
            field3893 = -50;
        }
        ++field3896;
        return !class117.method833(arg0, arg3, 896, arg1) ? null : class165.method1140((byte) 56);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class216() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1513(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -5 / ((-11 - arg2) / 32);
        field3893 = 0;
        ++field3897;
        for (int var8 = -1; var8 < class250.field4502 - -class219.field3996; ++var8) {
            class81 var24;
            if (var8 == -1) {
                var24 = class223.field4069;
            } else if (var8 < class250.field4502) {
                var24 = class103.field1993[class82.field1653[var8]];
            } else {
                var24 = class60.field1207[class249.field4492[var8 - class250.field4502]];
            }
            if (var24 != null && var24.method576(false)) {
                if (var24 instanceof class163) {
                    class237 var25 = ((class163) var24).field2969;
                    if (var25.field4295 != null) {
                        var25 = var25.method1636(50);
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (~var8 <= ~class250.field4502) {
                    class237 var31 = ((class163) var24).field2969;
                    if (var31.field4295 != null) {
                        var31 = var31.method1636(86);
                    }
                    if (var31.field4250 >= 0 && ~var31.field4250 > ~class198.field3557.length) {
                        int var32;
                        if (var31.field4286 != -1) {
                            var32 = var31.field4286 + 15;
                        } else {
                            var32 = 15 + var24.method569(-1);
                        }
                        class199.method1364(var32, arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                        if (class97.field1891 > -1) {
                            class198.field3557[var31.field4250].method232(arg4 - (-class97.field1891 + 12), arg6 - -class241.field4372 - 30);
                        }
                    }
                    class273[] var33 = class1.field21;
                    for (int var34 = 0; ~var33.length < ~var34; ++var34) {
                        class273 var49 = var33[var34];
                        if (var49 != null && var49.field4830 == 1 && class249.field4492[-class250.field4502 + var8] == var49.field4839 && ~(class163.field2968 % 20) > -11) {
                            int var50;
                            if (var31.field4286 != -1) {
                                var50 = var31.field4286 + 15;
                            } else {
                                var50 = var24.method569(-1) + 15;
                            }
                            class199.method1364(var50, arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                            if (class97.field1891 > -1) {
                                class249.field4482[var49.field4833].method232(arg4 + -12 + class97.field1891, arg6 - 28 + class241.field4372);
                            }
                        }
                    }
                } else {
                    int var26 = 30;
                    class108 var27 = (class108) var24;
                    if (~var27.field2139 != 0 || var27.field2169 != -1) {
                        class199.method1364(var24.method569(-1) - -15, arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                        if (class97.field1891 > -1) {
                            if (var27.field2139 != -1) {
                                class130.field2496[var27.field2139].method232(class97.field1891 + -12 + arg4, -var26 + arg6 - -class241.field4372);
                                var26 += 25;
                            }
                            if (var27.field2169 != -1) {
                                class198.field3557[var27.field2169].method232(arg4 + -12 - -class97.field1891, arg6 - (-class241.field4372 + var26));
                                var26 += 25;
                            }
                        }
                    }
                    if (~var8 <= -1) {
                        class273[] var28 = class1.field21;
                        for (int var29 = 0; var28.length > var29; ++var29) {
                            class273 var30 = var28[var29];
                            if (var30 != null && ~var30.field4830 == -11 && class82.field1653[var8] == var30.field4839) {
                                class199.method1364(15 + var24.method569(-1), arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                                if (~class97.field1891 < 0) {
                                    class249.field4482[var30.field4833].method232(class97.field1891 + -12 + arg4, -var26 + arg6 - -class241.field4372);
                                }
                            }
                        }
                    }
                }
                if (var24.field1552 != null && (var8 >= class250.field4502 || ~class111.field2241 == -1 || class111.field2241 == 3 || ~class111.field2241 == -2 && class170.method1181((byte) 22, ((class108) var24).field2140))) {
                    class199.method1364(var24.method569(-1), arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                    if (class97.field1891 > -1 && class11.field215 > field3893) {
                        class11.field209[field3893] = class66.field1269.method1298(var24.field1552) / 2;
                        class11.field210[field3893] = class66.field1269.field3418;
                        class11.field213[field3893] = class97.field1891;
                        class11.field218[field3893] = class241.field4372;
                        class11.field214[field3893] = var24.field1540;
                        class11.field225[field3893] = var24.field1545;
                        class11.field226[field3893] = var24.field1509;
                        class11.field216[field3893] = var24.field1552;
                        ++field3893;
                    }
                }
                if (~var24.field1522 < ~class163.field2968) {
                    class231 var35 = class44.field876[0];
                    class231 var36 = class44.field876[1];
                    int var37;
                    if (!(var24 instanceof class163)) {
                        var37 = var24.method569(-1);
                    } else {
                        class163 var38 = (class163) var24;
                        class231[] var39 = (class231[]) class28.field516.method670((byte) -114, (long) var38.field2969.field4243);
                        if (var39 == null) {
                            var39 = class257.method1786(var38.field2969.field4243, 10, 0, class53.field1056);
                            if (var39 != null) {
                                class28.field516.method673((long) var38.field2969.field4243, -5087, var39);
                            }
                        }
                        if (var39 != null && ~var39.length == -3) {
                            var36 = var39[1];
                            var35 = var39[0];
                        }
                        class237 var40 = var38.field2969;
                        if (var40.field4286 == -1) {
                            var37 = var24.method569(-1);
                        } else {
                            var37 = var40.field4286;
                        }
                    }
                    class199.method1364(var37 - -10 + var35.field4192, arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                    if (class97.field1891 > -1) {
                        int var41 = class97.field1891 + arg4 + -(var35.field4197 >> 1);
                        int var42 = arg6 - -class241.field4372 - 3;
                        var35.method232(var41, var42);
                        int var43 = var35.field4192;
                        int var44 = var24.field1565 * var35.field4197 / 255;
                        class4.method40(var41, var42, var41 + var44, var42 + var43);
                        var36.method232(var41, var42);
                        class4.method32(arg4, arg6, arg4 - -arg3, arg5 + arg6);
                    }
                }
                for (int var45 = 0; var45 < 4; ++var45) {
                    if (var24.field1531[var45] > class163.field2968) {
                        int var48;
                        if (var24 instanceof class163) {
                            class163 var46 = (class163) var24;
                            class237 var47 = var46.field2969;
                            if (var47.field4286 == -1) {
                                var48 = var24.method569(-1) / 2;
                            } else {
                                var48 = var47.field4286 / 2;
                            }
                        } else {
                            var48 = var24.method569(-1) / 2;
                        }
                        class199.method1364(var48, arg3 >> 1, arg0, -129, arg1, var24, arg5 >> 1);
                        if (class97.field1891 > -1) {
                            if (var45 == 1) {
                                class241.field4372 -= 20;
                            }
                            if (~var45 == -3) {
                                class97.field1891 -= 15;
                                class241.field4372 -= 10;
                            }
                            if (~var45 == -4) {
                                class97.field1891 += 15;
                                class241.field4372 -= 10;
                            }
                            class254.field4577[var24.field1537[var45]].method232(class97.field1891 + arg4 - 12, arg6 + -12 - -class241.field4372);
                            class66.field1270.method1291(class66.method485(var24.field1526[var45], (byte) 35), arg4 + -1 + class97.field1891, arg6 + 3 - -class241.field4372, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < field3893; ++var9) {
            int var10 = class11.field213[var9];
            int var11 = class11.field218[var9];
            int var12 = class11.field209[var9];
            int var13 = class11.field210[var9];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var23 = 0; var23 < var9; ++var23) {
                    if (class11.field218[var23] + -class11.field210[var23] < var11 - -2 && -var13 + var11 < class11.field218[var23] - -2 && class11.field213[var23] - -class11.field209[var23] > -var12 + var10 && var10 + var12 > class11.field213[var23] - class11.field209[var23] && ~var11 < ~(class11.field218[var23] - class11.field210[var23])) {
                        var11 = class11.field218[var23] + -class11.field210[var23];
                        var14 = true;
                    }
                }
            }
            class97.field1891 = class11.field213[var9];
            class241.field4372 = class11.field218[var9] = var11;
            class209 var15 = class11.field216[var9];
            if (class112.field2257 == 0) {
                int var16 = 16776960;
                if (~class11.field214[var9] > -7) {
                    var16 = class163.field2952[class11.field214[var9]];
                }
                if (class11.field214[var9] == 6) {
                    var16 = ~(class5.field73 % 20) > -11 ? 16711680 : 16776960;
                }
                if (~class11.field214[var9] == -8) {
                    var16 = class5.field73 % 20 < 10 ? 255 : 65535;
                }
                if (~class11.field214[var9] == -9) {
                    var16 = ~(class5.field73 % 20) > -11 ? 45056 : 8454016;
                }
                if (~class11.field214[var9] == -10) {
                    int var17 = 150 - class11.field226[var9];
                    if (~var17 <= -51) {
                        if (var17 >= 100) {
                            if (~var17 > -151) {
                                var16 = (var17 + -100) * 5 + 65280;
                            }
                        } else {
                            var16 = -((var17 + -50) * 327680) + 16776960;
                        }
                    } else {
                        var16 = var17 * 1280 + 16711680;
                    }
                }
                if (class11.field214[var9] == 10) {
                    int var18 = -class11.field226[var9] + 150;
                    if (~var18 > -51) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = -(var18 * 327680) + 33095935;
                    } else if (~var18 > -151) {
                        var16 = (var18 - 100) * 327680 + 255 + -((var18 - 100) * 5);
                    }
                }
                if (~class11.field214[var9] == -12) {
                    int var19 = -class11.field226[var9] + 150;
                    if (var19 >= 50) {
                        if (var19 >= 100) {
                            if (~var19 > -151) {
                                var16 = 16777215 - (var19 * 327680 + -32768000);
                            }
                        } else {
                            var16 = (var19 - 50) * 327685 + 65280;
                        }
                    } else {
                        var16 = -(var19 * 327685) + 16777215;
                    }
                }
                if (class11.field225[var9] == 0) {
                    class66.field1269.method1291(var15, arg4 - -class97.field1891, arg6 - -class241.field4372, var16, 0);
                }
                if (~class11.field225[var9] == -2) {
                    class66.field1269.method1289(var15, arg4 - -class97.field1891, class241.field4372 + arg6, var16, 0, class5.field73);
                }
                if (class11.field225[var9] == 2) {
                    class66.field1269.method1303(var15, arg4 - -class97.field1891, class241.field4372 + arg6, var16, 0, class5.field73);
                }
                if (~class11.field225[var9] == -4) {
                    class66.field1269.method1281(var15, class97.field1891 + arg4, arg6 - -class241.field4372, var16, 0, class5.field73, 150 - class11.field226[var9]);
                }
                if (class11.field225[var9] == 4) {
                    int var20 = (-class11.field226[var9] + 150) * (100 + class66.field1269.method1298(var15)) / 150;
                    class4.method40(class97.field1891 + arg4 + -50, arg6, class97.field1891 + arg4 + 50, arg5 + arg6);
                    class66.field1269.method1295(var15, -var20 + class97.field1891 + arg4 + 50, arg6 - -class241.field4372, var16, 0);
                    class4.method32(arg4, arg6, arg3 + arg4, arg6 - -arg5);
                }
                if (~class11.field225[var9] == -6) {
                    int var21 = -class11.field226[var9] + 150;
                    int var22 = 0;
                    if (~var21 <= -26) {
                        if (~var21 < -126) {
                            var22 = var21 + -125;
                        }
                    } else {
                        var22 = var21 + -25;
                    }
                    class4.method40(arg4, arg6 - -class241.field4372 + -1 - class66.field1269.field3418, arg3 + arg4, arg6 - (-class241.field4372 + -5));
                    class66.field1269.method1291(var15, class97.field1891 + arg4, class241.field4372 + var22 + arg6, var16, 0);
                    class4.method32(arg4, arg6, arg3 + arg4, arg5 + arg6);
                }
            } else {
                class66.field1269.method1291(var15, arg4 - -class97.field1891, arg6 - -class241.field4372, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbg;")
    public static final class235 method1514(Throwable arg0, String arg1) {
        ++field3898;
        class235 var2;
        if (arg0 instanceof class235) {
            var2 = (class235) arg0;
            var2.field4231 = var2.field4231 + ' ' + arg1;
        } else {
            var2 = new class235(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field3895;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            for (int var4 = 0; ~class226.field4124 < ~var4; ++var4) {
                int var5 = class50.field987[var4];
                int var6 = class129.field2479[arg1];
                int var7 = this.field3902 * var5 >> 12;
                int var8 = this.field3903 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3902) * this.field3902;
                int var10 = var6 % (4096 / this.field3903) * this.field3903;
                if (~this.field3901 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field3901 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field3901) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg0 != -98 ? null : var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIILpb;IJ)Z")
    public static final boolean method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class126 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class23.method193(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        int var1 = -126 / (-arg0 / 62);
        field3900 = null;
        field3892 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    public static final void method1517(int arg0, byte arg1) {
        if (arg1 <= 16) {
            field3893 = 17;
        }
        ++field3904;
        class195 var2 = class178.method1229(arg0, 7, 57);
        var2.method1340(true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 > -29) {
            field3893 = -9;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3901 = arg2.method736(123);
                }
            } else {
                this.field3903 = arg2.method774((byte) 87);
            }
        } else {
            this.field3902 = arg2.method774((byte) 97);
        }
        ++field3894;
    }
}
