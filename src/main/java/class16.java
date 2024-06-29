import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class68 {

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Ljava/lang/String;")
    public static String field160 = " has logged in.";

    @OriginalMember(owner = "client!n", name = "W", descriptor = "Z")
    public static boolean field167 = false;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        super(3, false);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        int[] var3 = super.field917.method1920(arg0, true);
        if (arg1 > -118) {
            field172 = 16;
        }
        ++field164;
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            int[] var5 = this.method423(1, (byte) -54, arg0);
            int[] var6 = this.method423(2, (byte) -54, arg0);
            for (int var7 = 0; class89.field1248 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBIILse;)V")
    public static final void method90(int arg0, byte arg1, int arg2, int arg3, class211 arg4) {
        ++field169;
        class156.method1038(false);
        if (arg1 > -43) {
            field167 = false;
        }
        class64.method398(arg3, arg0, arg3 - -arg4.field3112, arg4.field3166 + arg0);
        if (class286.field4481 != 2 && class286.field4481 != 5 && class46.field681 != null) {
            int var5 = class217.field3280.field4019 / 32 + 48;
            int var6 = -(class217.field3280.field4085 / 32) + 464;
            int var7 = (int) class68.field912 + class217.field3266 & 2047;
            ((class128) class46.field681).method875(arg3, arg0, arg4.field3112, arg4.field3166, var5, var6, var7, class111.field1600 + 256, arg4.field3182, arg4.field3106);
            if (class292.field4588 != null) {
                for (int var8 = 0; ~class292.field4588.field2393 < ~var8; ++var8) {
                    if (class292.field4588.method1126(var8, 3)) {
                        int var9 = ((16383 & class292.field4588.field2386[var8] >> 14) + -class37.field565) * 4 - -2 + -(class217.field3280.field4019 / 32);
                        int var10 = ((16383 & class292.field4588.field2386[var8]) + -class216.field3255) * 4 + -(class217.field3280.field4085 / 32) + 2;
                        int var11 = class90.field1259[var7];
                        int var12 = var11 * 256 / (class111.field1600 + 256);
                        int var13 = class90.field1255[var7];
                        int var14 = var13 * 256 / (class111.field1600 + 256);
                        class126 var15 = class61.field852;
                        int var16 = var10 * var14 + -(var9 * var12) >> 16;
                        int var17 = var9 * var14 + var10 * var12 >> 16;
                        if (class292.field4588.method1124(var8, -24698) == 1) {
                            var15 = class208.field2968;
                        }
                        if (class292.field4588.method1124(var8, -24698) == 2) {
                            var15 = class54.field787;
                        }
                        int var18 = var15.method820(class292.field4588.field2395[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg4.field3112 && ~var19 >= ~arg4.field3112 && -arg4.field3166 <= var16 && var16 <= arg4.field3166) {
                            int var20 = 16777215;
                            if (class292.field4588.field2394[var8] != -1) {
                                var20 = class292.field4588.field2394[var8];
                            }
                            class64.method405(arg4.field3182, arg4.field3106);
                            var15.method831(class292.field4588.field2395[var8], arg4.field3112 / 2 + arg3 + var19, arg0 - -(arg4.field3166 / 2) + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class64.method402();
                        }
                    }
                }
            }
            for (int var21 = 0; class252.field3857 > var21; ++var21) {
                int var58 = class20.field290[var21] * 4 - (-2 - -(class217.field3280.field4019 / 32));
                int var59 = class164.field2277[var21] * 4 - class217.field3280.field4085 / 32 + 2;
                class111 var60 = class76.method489(class150.field2078[var21], 29);
                if (var60.field1597 != null) {
                    var60 = var60.method726((byte) -109);
                    if (var60 == null || var60.field1607 == -1) {
                        continue;
                    }
                }
                class187.method1199(var58, arg3, -8286, var59, class273.field4205[var60.field1607], arg0, arg4);
            }
            for (int var22 = 0; var22 < 104; ++var22) {
                for (int var54 = 0; ~var54 > -105; ++var54) {
                    class148 var55 = class297.field4690[class295.field4642][var22][var54];
                    if (var55 != null) {
                        int var56 = var54 * 4 + 2 - class217.field3280.field4085 / 32;
                        int var57 = var22 * 4 - -2 + -(class217.field3280.field4019 / 32);
                        class187.method1199(var57, arg3, -8286, var56, class34.field525[0], arg0, arg4);
                    }
                }
            }
            for (int var23 = 0; var23 < class92.field1283; ++var23) {
                class140 var50 = class119.field1679[class194.field2688[var23]];
                if (var50 != null && var50.method555(true)) {
                    class284 var51 = var50.field1946;
                    if (var51 != null && var51.field4450 != null) {
                        var51 = var51.method1905((byte) -26);
                    }
                    if (var51 != null && var51.field4451 && var51.field4416) {
                        int var52 = var50.field4085 / 32 + -(class217.field3280.field4085 / 32);
                        int var53 = var50.field4019 / 32 + -(class217.field3280.field4019 / 32);
                        if (var51.field4399 != -1) {
                            class187.method1199(var53, arg3, -8286, var52, class273.field4205[var51.field4399], arg0, arg4);
                        } else {
                            class187.method1199(var53, arg3, -8286, var52, class34.field525[1], arg0, arg4);
                        }
                    }
                }
            }
            for (int var24 = 0; ~var24 > ~class103.field1442; ++var24) {
                class88 var40 = class154.field2133[class205.field2848[var24]];
                if (var40 != null && var40.method555(true)) {
                    int var41 = var40.field4019 / 32 + -(class217.field3280.field4019 / 32);
                    int var42 = var40.field4085 / 32 + -(class217.field3280.field4085 / 32);
                    boolean var43 = false;
                    long var44 = class73.method465((byte) -111, var40.field1217);
                    for (int var46 = 0; class279.field4323 > var46; ++var46) {
                        if (class84.field1144[var46] == var44 && class67.field909[var46] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; ~class132.field1873 < ~var48; ++var48) {
                        if (class297.field4694[var48].field2369 == var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (~class217.field3280.field1196 != -1 && var40.field1196 != 0 && class217.field3280.field1196 == var40.field1196) {
                        var49 = true;
                    }
                    if (!var43) {
                        if (!var47) {
                            if (var49) {
                                class187.method1199(var41, arg3, -8286, var42, class34.field525[4], arg0, arg4);
                            } else {
                                class187.method1199(var41, arg3, -8286, var42, class34.field525[2], arg0, arg4);
                            }
                        } else {
                            class187.method1199(var41, arg3, -8286, var42, class34.field525[5], arg0, arg4);
                        }
                    } else {
                        class187.method1199(var41, arg3, -8286, var42, class34.field525[3], arg0, arg4);
                    }
                }
            }
            class275[] var25 = class175.field2463;
            for (int var26 = 0; var25.length > var26; ++var26) {
                class275 var29 = var25[var26];
                if (var29 != null && var29.field4262 != 0 && class52.field740 % 20 < 10) {
                    if (~var29.field4262 == -2 && ~var29.field4257 <= -1 && ~class119.field1679.length < ~var29.field4257) {
                        class140 var30 = class119.field1679[var29.field4257];
                        if (var30 != null) {
                            int var31 = var30.field4019 / 32 + -(class217.field3280.field4019 / 32);
                            int var32 = var30.field4085 / 32 + -(class217.field3280.field4085 / 32);
                            class22.method164(arg3, 360000, var32, arg4, arg0, var29.field4253, var31, (byte) -113);
                        }
                    }
                    if (var29.field4262 == 2) {
                        int var33 = (var29.field4251 - class37.field565) * 4 + -(class217.field3280.field4019 / 32) + 2;
                        int var34 = (-class216.field3255 + var29.field4255) * 4 + -(class217.field3280.field4085 / 32) + 2;
                        int var35 = var29.field4250 * 4;
                        int var36 = var35 * var35;
                        class22.method164(arg3, var36, var34, arg4, arg0, var29.field4253, var33, (byte) -54);
                    }
                    if (var29.field4262 == 10 && ~var29.field4257 <= -1 && var29.field4257 < class154.field2133.length) {
                        class88 var37 = class154.field2133[var29.field4257];
                        if (var37 != null) {
                            int var38 = var37.field4085 / 32 + -(class217.field3280.field4085 / 32);
                            int var39 = var37.field4019 / 32 + -(class217.field3280.field4019 / 32);
                            class22.method164(arg3, 360000, var38, arg4, arg0, var29.field4253, var39, (byte) -75);
                        }
                    }
                }
            }
            if (class234.field3535 != 0) {
                int var27 = class234.field3535 * 4 + 2 + -(class217.field3280.field4019 / 32) - -(2 * (class217.field3280.method561(-1) + -1));
                int var28 = class199.field2768 * 4 + -(class217.field3280.field4085 / 32) - (-2 + -(2 * class217.field3280.method561(-1)) + 2);
                class187.method1199(var27, arg3, -8286, var28, class275.field4264, arg0, arg4);
            }
            class64.method401(arg3 - -(arg4.field3112 / 2) + -1, arg4.field3166 / 2 + (arg0 - 1), 3, 3, 16777215);
        } else {
            class64.method408(arg3, arg0, 0, arg4.field3182, arg4.field3106);
        }
        class293.field4607[arg2] = true;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field162;
        int var3 = 27 % ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[] var5 = this.method423(2, (byte) -54, arg0);
            int[][] var6 = this.method429(0, arg0, 2);
            int[][] var7 = this.method429(1, arg0, 2);
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var6[1];
            int[] var12 = var6[0];
            int[] var13 = var6[2];
            int[] var14 = var7[1];
            int[] var15 = var7[0];
            int[] var16 = var7[2];
            for (int var17 = 0; ~class89.field1248 < ~var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 == -4097) {
                    var8[var17] = var12[var17];
                    var10[var17] = var11[var17];
                    var9[var17] = var13[var17];
                } else if (var18 == 0) {
                    var8[var17] = var15[var17];
                    var10[var17] = var14[var17];
                    var9[var17] = var16[var17];
                } else {
                    int var19 = -var18 + 4096;
                    var8[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                    var10[var17] = var11[var17] * var18 - -(var14[var17] * var19) >> 12;
                    var9[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class48.field703 = 0;
        for (int var7 = -1; ~var7 > ~(class92.field1283 + class103.field1442); ++var7) {
            class266 var23;
            if (~var7 == 0) {
                var23 = class217.field3280;
            } else if (class103.field1442 <= var7) {
                var23 = class119.field1679[class194.field2688[var7 - class103.field1442]];
            } else {
                var23 = class154.field2133[class205.field2848[var7]];
            }
            if (var23 != null && var23.method555(true)) {
                if (var23 instanceof class140) {
                    class284 var24 = ((class140) var23).field1946;
                    if (var24.field4450 != null) {
                        var24 = var24.method1905((byte) -26);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class103.field1442) {
                    class284 var25 = ((class140) var23).field1946;
                    if (var25.field4450 != null) {
                        var25 = var25.method1905((byte) -26);
                    }
                    if (var25.field4415 >= 0 && ~class266.field4008.length < ~var25.field4415) {
                        int var26;
                        if (var25.field4404 != -1) {
                            var26 = var25.field4404 - -15;
                        } else {
                            var26 = var23.method1747((byte) -110) - -15;
                        }
                        class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) 107, var23, var26, arg5);
                        if (class236.field3595 > -1) {
                            class266.field4008[var25.field4415].method710(class236.field3595 + -12 + arg4, arg3 + -30 + class151.field2081);
                        }
                    }
                    int var27 = 0;
                    class275[] var28 = class175.field2463;
                    while (var27 < var28.length) {
                        class275 var29 = var28[var27];
                        if (var29 != null && ~var29.field4262 == -2 && class194.field2688[-class103.field1442 + var7] == var29.field4257 && class52.field740 % 20 < 10) {
                            int var30;
                            if (~var25.field4404 == 0) {
                                var30 = 15 + var23.method1747((byte) -117);
                            } else {
                                var30 = var25.field4404 + 15;
                            }
                            class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) -38, var23, var30, arg5);
                            if (class236.field3595 > -1) {
                                class65.field882[var29.field4253].method710(arg4 - -class236.field3595 + -12, arg3 - (-class151.field2081 - -28));
                            }
                        }
                        ++var27;
                    }
                } else {
                    int var31 = 30;
                    class88 var32 = (class88) var23;
                    if (var32.field1208 != -1 || ~var32.field1192 != 0) {
                        class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) 1, var23, 15 + var23.method1747((byte) -121), arg5);
                        if (class236.field3595 > -1) {
                            if (~var32.field1208 != 0) {
                                class111.field1570[var32.field1208].method710(class236.field3595 + -12 + arg4, -var31 + arg3 - -class151.field2081);
                                var31 += 25;
                            }
                            if (~var32.field1192 != 0) {
                                class266.field4008[var32.field1192].method710(class236.field3595 + -12 + arg4, -var31 + class151.field2081 + arg3);
                                var31 += 25;
                            }
                        }
                    }
                    if (~var7 <= -1) {
                        class275[] var33 = class175.field2463;
                        for (int var34 = 0; var34 < var33.length; ++var34) {
                            class275 var35 = var33[var34];
                            if (var35 != null && ~var35.field4262 == -11 && class205.field2848[var7] == var35.field4257) {
                                class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) -122, var23, 15 + var23.method1747((byte) -111), arg5);
                                if (class236.field3595 > -1) {
                                    class65.field882[var35.field4253].method710(arg4 - -class236.field3595 + -12, class151.field2081 + arg3 + -var31);
                                }
                            }
                        }
                    }
                }
                if (var23.field4049 != null && (~class103.field1442 >= ~var7 || class181.field2540 == 0 || class181.field2540 == 3 || ~class181.field2540 == -2 && class11.method70((byte) 87, ((class88) var23).field1217))) {
                    class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) 106, var23, var23.method1747((byte) -107), arg5);
                    if (~class236.field3595 < 0 && class296.field4676 > class48.field703) {
                        class296.field4679[class48.field703] = class54.field787.method824(var23.field4049) / 2;
                        class296.field4671[class48.field703] = class54.field787.field1757;
                        class296.field4669[class48.field703] = class236.field3595;
                        class296.field4672[class48.field703] = class151.field2081;
                        class296.field4678[class48.field703] = var23.field4057;
                        class296.field4673[class48.field703] = var23.field4070;
                        class296.field4675[class48.field703] = var23.field3988;
                        class296.field4670[class48.field703] = var23.field4049;
                        ++class48.field703;
                    }
                }
                if (class52.field740 < var23.field4086) {
                    class110 var36 = class178.field2493[0];
                    class110 var37 = class178.field2493[1];
                    int var41;
                    if (var23 instanceof class140) {
                        class140 var38 = (class140) var23;
                        class110[] var39 = (class110[]) class239.field3636.method540((byte) -114, (long) var38.field1946.field4445);
                        if (var39 == null) {
                            var39 = class141.method948(var38.field1946.field4445, 0, -123, class21.field299);
                            if (var39 != null) {
                                class239.field3636.method543(var39, (long) var38.field1946.field4445, 858993459);
                            }
                        }
                        if (var39 != null && var39.length == 2) {
                            var36 = var39[0];
                            var37 = var39[1];
                        }
                        class284 var40 = var38.field1946;
                        if (~var40.field4404 == 0) {
                            var41 = var23.method1747((byte) -121);
                        } else {
                            var41 = var40.field4404;
                        }
                    } else {
                        var41 = var23.method1747((byte) -85);
                    }
                    class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) -108, var23, var36.field1538 + 10 + var41, arg5);
                    if (~class236.field3595 < 0) {
                        int var42 = class236.field3595 + arg4 + -(var36.field1539 >> 1);
                        int var43 = class151.field2081 + -3 + arg3;
                        var36.method710(var42, var43);
                        int var44 = var36.field1538;
                        int var45 = var23.field4035 * var36.field1539 / 255;
                        class64.method390(var42, var43, var42 + var45, var43 - -var44);
                        var37.method710(var42, var43);
                        class64.method398(arg4, arg3, arg4 + arg6, arg2 + arg3);
                    }
                }
                for (int var46 = 0; var46 < 4; ++var46) {
                    if (class52.field740 < var23.field4030[var46]) {
                        int var47;
                        if (!(var23 instanceof class140)) {
                            var47 = var23.method1747((byte) -94) / 2;
                        } else {
                            class140 var48 = (class140) var23;
                            class284 var49 = var48.field1946;
                            if (var49.field4404 != -1) {
                                var47 = var49.field4404 / 2;
                            } else {
                                var47 = var23.method1747((byte) -93) / 2;
                            }
                        }
                        class59.method367(arg6 >> 1, arg1, arg2 >> 1, (byte) -32, var23, var47, arg5);
                        if (class236.field3595 > -1) {
                            if (var46 == 1) {
                                class151.field2081 -= 20;
                            }
                            if (var46 == 2) {
                                class151.field2081 -= 10;
                                class236.field3595 -= 15;
                            }
                            if (var46 == 3) {
                                class236.field3595 += 15;
                                class151.field2081 -= 10;
                            }
                            class248.field3799[var23.field4068[var46]].method710(class236.field3595 + arg4 + -12, arg3 - 12 + class151.field2081);
                            class61.field852.method825(Integer.toString(var23.field4006[var46]), arg4 - -class236.field3595 + -1, class151.field2081 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg0 != -50) {
            method93((byte) 8, -55);
        }
        ++field171;
        for (int var8 = 0; ~class48.field703 < ~var8; ++var8) {
            int var9 = class296.field4672[var8];
            int var10 = class296.field4669[var8];
            int var11 = class296.field4679[var8];
            int var12 = class296.field4671[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; ~var8 < ~var22; ++var22) {
                    if (class296.field4672[var22] + -class296.field4671[var22] < var9 + 2 && ~(class296.field4672[var22] + 2) < ~(-var12 + var9) && ~(class296.field4679[var22] + class296.field4669[var22]) < ~(-var11 + var10) && ~(class296.field4669[var22] + -class296.field4679[var22]) > ~(var10 - -var11) && var9 > class296.field4672[var22] - class296.field4671[var22]) {
                        var13 = true;
                        var9 = class296.field4672[var22] + -class296.field4671[var22];
                    }
                }
            }
            class236.field3595 = class296.field4669[var8];
            class151.field2081 = class296.field4672[var8] = var9;
            String var14 = class296.field4670[var8];
            if (class13.field137 == 0) {
                int var15 = 16776960;
                if (~class296.field4678[var8] > -7) {
                    var15 = class78.field1093[class296.field4678[var8]];
                }
                if (~class296.field4678[var8] == -7) {
                    var15 = class159.field2222 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class296.field4678[var8] == 7) {
                    var15 = class159.field2222 % 20 < 10 ? 255 : 65535;
                }
                if (~class296.field4678[var8] == -9) {
                    var15 = class159.field2222 % 20 >= 10 ? 8454016 : 45056;
                }
                if (~class296.field4678[var8] == -10) {
                    int var16 = -class296.field4675[var8] + 150;
                    if (var16 >= 50) {
                        if (~var16 > -101) {
                            var15 = 16776960 - (var16 + -50) * 327680;
                        } else if (~var16 > -151) {
                            var15 = var16 * 5 + 64780;
                        }
                    } else {
                        var15 = var16 * 1280 + 16711680;
                    }
                }
                if (~class296.field4678[var8] == -11) {
                    int var17 = 150 - class296.field4675[var8];
                    if (~var17 > -51) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 >= 100) {
                        if (~var17 > -151) {
                            var15 = var17 * 327680 - 32768000 + -((var17 + -100) * 5) + 255;
                        }
                    } else {
                        var15 = -(var17 * 327680) + 16384000 + 16711935;
                    }
                }
                if (class296.field4678[var8] == 11) {
                    int var18 = -class296.field4675[var8] + 150;
                    if (var18 >= 50) {
                        if (~var18 > -101) {
                            var15 = (var18 + -50) * 327685 + 65280;
                        } else if (~var18 > -151) {
                            var15 = -((var18 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var15 = -(var18 * 327685) + 16777215;
                    }
                }
                if (class296.field4673[var8] == 0) {
                    class54.field787.method825(var14, class236.field3595 + arg4, class151.field2081 + arg3, var15, 0);
                }
                if (~class296.field4673[var8] == -2) {
                    class54.field787.method834(var14, class236.field3595 + arg4, class151.field2081 + arg3, var15, 0, class159.field2222);
                }
                if (class296.field4673[var8] == 2) {
                    class54.field787.method833(var14, arg4 - -class236.field3595, class151.field2081 + arg3, var15, 0, class159.field2222);
                }
                if (~class296.field4673[var8] == -4) {
                    class54.field787.method836(var14, class236.field3595 + arg4, arg3 - -class151.field2081, var15, 0, class159.field2222, -class296.field4675[var8] + 150);
                }
                if (~class296.field4673[var8] == -5) {
                    int var19 = (-class296.field4675[var8] + 150) * (100 + class54.field787.method824(var14)) / 150;
                    class64.method390(arg4 + -50 + class236.field3595, arg3, arg4 - -50 + class236.field3595, arg3 - -arg2);
                    class54.field787.method842(var14, class236.field3595 + arg4 + -var19 - -50, class151.field2081 + arg3, var15, 0);
                    class64.method398(arg4, arg3, arg4 + arg6, arg2 + arg3);
                }
                if (~class296.field4673[var8] == -6) {
                    int var20 = 150 - class296.field4675[var8];
                    class64.method390(arg4, -class54.field787.field1757 + class151.field2081 + arg3 + -1, arg4 + arg6, class151.field2081 + arg3 + 5);
                    int var21 = 0;
                    if (var20 >= 25) {
                        if (var20 > 125) {
                            var21 = var20 + -125;
                        }
                    } else {
                        var21 = var20 + -25;
                    }
                    class54.field787.method825(var14, class236.field3595 + arg4, class151.field2081 + arg3 + var21, var15, 0);
                    class64.method398(arg4, arg3, arg4 + arg6, arg2 + arg3);
                }
            } else {
                class54.field787.method825(var14, class236.field3595 + arg4, arg3 - -class151.field2081, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V")
    public static final void method93(byte arg0, int arg1) {
        ++field158;
        int var2 = 107 / ((arg0 - -41) / 33);
        class193.field2671 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method94(String arg0, boolean arg1, boolean arg2) {
        ++field166;
        if (arg1) {
            field167 = true;
        }
        if (!arg2) {
            try {
                class259.method1722("loggedout", 3787, class200.field2784.field3715);
            } catch (Throwable var4) {
            }
            try {
                class187.field2574.getAppletContext().showDocument(new URL(class187.field2574.getCodeBase(), arg0), "_top");
            } catch (Exception var3) {
            }
        } else {
            try {
                class187.field2574.getAppletContext().showDocument(new URL(class187.field2574.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            super.field926 = ~arg0.method1453((byte) -127) == -2;
        }
        if (!arg2) {
            method95((String) null, (byte) 114);
        }
        ++field159;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method95(String arg0, byte arg1) {
        ++field168;
        if (arg0 == null) {
            return -1;
        } else {
            int var2 = 0;
            if (arg1 != 71) {
                method96('x', false, (String) null);
            }
            while (~var2 > ~class279.field4323) {
                if (arg0.equalsIgnoreCase(class180.field2531[var2])) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CZLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method96(char arg0, boolean arg1, String arg2) {
        ++field163;
        int var3 = class158.method1052(arg2, false, arg0);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        if (!arg1) {
            return null;
        } else {
            for (int var7 = 0; ~var7 > ~var3; ++var7) {
                int var8;
                for (var8 = var6; arg2.charAt(var8) != arg0; ++var8) {
                }
                var4[var5++] = arg2.substring(var6, var8);
                var6 = var8 + 1;
            }
            var4[var3] = arg2.substring(var6);
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public static void method97(int arg0) {
        field160 = null;
        if (arg0 != 2614) {
            method95((String) null, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field170;
        if (~arg0 <= -129 && arg2 >= 128 && ~arg0 >= -13057 && arg2 <= 13056) {
            int var8 = -arg6 + class275.method1836(class295.field4642, arg2, arg0, -109);
            int var9 = class90.field1255[class275.field4265];
            int var10 = var8 - class246.field3773;
            int var11 = class90.field1255[class239.field3645];
            int var12 = arg2 - class89.field1252;
            int var13 = class90.field1259[class275.field4265];
            int var14 = arg0 - class41.field618;
            int var15 = class90.field1259[class239.field3645];
            int var16 = var12 * var15 - -(var11 * var14) >> 16;
            int var17 = var11 * var12 + -(var14 * var15) >> 16;
            int var19 = var9 * var10 + -(var13 * var17) >> 16;
            if (arg4 > -11) {
                field167 = false;
            }
            int var20 = var10 * var13 - -(var9 * var17) >> 16;
            if (~var20 <= -51) {
                class151.field2081 = (var19 << 9) / var20 + arg5;
                class236.field3595 = (var16 << 9) / var20 + arg1;
            } else {
                class151.field2081 = -1;
                class236.field3595 = -1;
            }
        } else {
            class151.field2081 = -1;
            class236.field3595 = -1;
        }
    }
}
