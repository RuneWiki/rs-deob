import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class131 extends class35 {

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "[I")
    public static int[] field1826 = new int[5];

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Lat;")
    public static class412 field1825 = new class412();

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[I")
    public static int[] field1829 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Lo;")
    public static class332 field1830 = new class332("K", "T", "K", "K");

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "[I")
    public static int[] field1833 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Lis;")
    public static class1 field1828;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZZB)V")
    public static final void method906(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        field1823++;
        class465.method2732(class201.field3056.length - 1, 0, -1400, arg3, arg0, arg1, arg2);
        class84.field1193 = 0;
        int var5 = 1 % ((arg4 - 17) / 57);
        class78.field1097 = null;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)I")
    public abstract int method907(int arg0);

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public static final void method908(int arg0) {
        class286.field4369.method2401((byte) -73);
        if (arg0 != -2) {
            field1828 = null;
        }
        field1824++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method909(byte arg0) {
        field1833 = null;
        field1829 = null;
        if (arg0 < 122) {
            field1828 = null;
        }
        field1828 = null;
        field1830 = null;
        field1826 = null;
        field1825 = null;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)J")
    public abstract long method910(int arg0);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I")
    public abstract int method911(byte arg0);

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)I")
    public abstract int method912(int arg0);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZIIIII)V")
    public static final void method913(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1820++;
        class94.method723(-1, arg2);
        int var7 = 0;
        int var8 = arg2 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        if (!arg1) {
            method913(-9, true, -107, -114, -84, 93, 78);
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class176.field2503 <= arg5 && class296.field4443 >= arg5) {
            int[] var15 = class49.field723[arg5];
            int var16 = class352.method2172(arg3 - arg2, class119.field1643, class293.field4420, 0);
            int var17 = class352.method2172(arg2 + arg3, class119.field1643, class293.field4420, 0);
            int var18 = class352.method2172(arg3 - var8, class119.field1643, class293.field4420, 0);
            int var19 = class352.method2172(arg3 + var8, class119.field1643, class293.field4420, 0);
            class345.method2125(false, var15, var16, var18, arg0);
            class345.method2125(false, var15, var18, var19, arg4);
            class345.method2125(!arg1, var15, var19, var17, arg0);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class485.field6821[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class176.field2503 && class296.field4443 >= var20) {
                    if (var8 > var9) {
                        int var22 = class485.field6821[var9];
                        int var23 = class352.method2172(arg3 + var7, class119.field1643, class293.field4420, 0);
                        int var24 = class352.method2172(arg3 - var7, class119.field1643, class293.field4420, 0);
                        int var25 = class352.method2172(arg3 + var22, class119.field1643, class293.field4420, 0);
                        int var26 = class352.method2172(arg3 - var22, class119.field1643, class293.field4420, 0);
                        if (var21 <= class296.field4443) {
                            int[] var27 = class49.field723[var21];
                            class345.method2125(!arg1, var27, var24, var26, arg0);
                            class345.method2125(!arg1, var27, var26, var25, arg4);
                            class345.method2125(!arg1, var27, var25, var23, arg0);
                        }
                        if (class176.field2503 <= var20) {
                            int[] var28 = class49.field723[var20];
                            class345.method2125(false, var28, var24, var26, arg0);
                            class345.method2125(false, var28, var26, var25, arg4);
                            class345.method2125(false, var28, var25, var23, arg0);
                        }
                    } else {
                        int var29 = class352.method2172(arg3 + var7, class119.field1643, class293.field4420, 0);
                        int var30 = class352.method2172(arg3 - var7, class119.field1643, class293.field4420, 0);
                        if (class296.field4443 >= var21) {
                            class345.method2125(!arg1, class49.field723[var21], var30, var29, arg0);
                        }
                        if (var20 >= class176.field2503) {
                            class345.method2125(false, class49.field723[var20], var30, var29, arg0);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class176.field2503 && var31 <= class296.field4443) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class293.field4420 <= var33 && class119.field1643 >= var34) {
                    int var35 = class352.method2172(var33, class119.field1643, class293.field4420, 0);
                    int var36 = class352.method2172(var34, class119.field1643, class293.field4420, 0);
                    if (var7 < var8) {
                        int var37 = var7 <= var11 ? var11 : class485.field6821[var7];
                        int var38 = class352.method2172(arg3 + var37, class119.field1643, class293.field4420, 0);
                        int var39 = class352.method2172(arg3 - var37, class119.field1643, class293.field4420, 0);
                        if (class296.field4443 >= var32) {
                            int[] var40 = class49.field723[var32];
                            class345.method2125(false, var40, var36, var39, arg0);
                            class345.method2125(false, var40, var39, var38, arg4);
                            class345.method2125(false, var40, var38, var35, arg0);
                        }
                        if (var31 >= class176.field2503) {
                            int[] var41 = class49.field723[var31];
                            class345.method2125(!arg1, var41, var36, var39, arg0);
                            class345.method2125(!arg1, var41, var39, var38, arg4);
                            class345.method2125(false, var41, var38, var35, arg0);
                        }
                    } else {
                        if (class296.field4443 >= var32) {
                            class345.method2125(false, class49.field723[var32], var36, var35, arg0);
                        }
                        if (var31 >= class176.field2503) {
                            class345.method2125(false, class49.field723[var31], var36, var35, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "(I)V")
    public static final void method914(int arg0) {
        field1822++;
        if (class88.field1240 == 0 || class88.field1240 == 5) {
            return;
        }
        try {
            if ((++class52.field753) > 2000) {
                if (class27.field335 != null) {
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                }
                if (class299.field4470 >= 1) {
                    class88.field1240 = 0;
                    class6.field107 = -5;
                    return;
                }
                class88.field1240 = 1;
                class299.field4470++;
                class52.field753 = 0;
                if (class487.field6839 == class14.field198) {
                    class14.field198 = class94.field1289;
                } else {
                    class14.field198 = class487.field6839;
                }
            }
            if (class88.field1240 == 1) {
                class320.field4787 = class21.field261.method1051(class14.field198, -4655, class150.field2110);
                class88.field1240 = 2;
            }
            if (class88.field1240 == 2) {
                if (class320.field4787.field5822 == 2) {
                    throw new IOException();
                }
                if (class320.field4787.field5822 != 1) {
                    return;
                }
                class27.field335 = new class147((Socket) class320.field4787.field5823, class21.field261);
                class320.field4787 = null;
                long var1 = class141.field2021 = class479.method2812(class324.field4860, 0);
                class230.field3390.field6315 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class230.field3390.method2619((byte) -124, class109.field1532.field2407);
                class230.field3390.method2619((byte) -123, var3);
                class27.field335.method1000(30000, 0, 2, class230.field3390.field6316);
                if (class395.field5816 != null) {
                    class395.field5816.method2228(0);
                }
                if (class398.field5829 != null) {
                    class398.field5829.method2228(0);
                }
                int var4 = class27.field335.method1002((byte) -87);
                if (class395.field5816 != null) {
                    class395.field5816.method2228(0);
                }
                if (class398.field5829 != null) {
                    class398.field5829.method2228(0);
                }
                if (var4 != 0) {
                    class6.field107 = var4;
                    class88.field1240 = 0;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                    return;
                }
                class88.field1240 = 3;
            }
            if (class88.field1240 == 3) {
                if (class27.field335.method1005(5000) < 8) {
                    return;
                }
                class27.field335.method996(8, class220.field3246.field6316, true, 0);
                class220.field3246.field6315 = 0;
                class337.field5043 = class220.field3246.method2632((byte) 1);
                class446 var5 = new class446(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class337.field5043 >> 32), (int) class337.field5043 };
                var5.method2619((byte) -127, 10);
                var5.method2596((byte) 102, var6[0]);
                var5.method2596((byte) -72, var6[1]);
                var5.method2596((byte) -3, var6[2]);
                var5.method2596((byte) -48, var6[3]);
                var5.method2581(-1973283408, class479.method2812(class324.field4860, 0));
                var5.method2597(class301.field4485, (byte) -90);
                var5.method2584(class266.field3940, class486.field6829, (byte) 109);
                class230.field3390.field6315 = 0;
                if (class316.field4752 == 40) {
                    class230.field3390.method2619((byte) 80, class109.field1541.field2407);
                } else {
                    class230.field3390.method2619((byte) -119, class109.field1536.field2407);
                }
                class230.field3390.method2592(0, (byte) -95);
                int var7 = class230.field3390.field6315;
                class230.field3390.method2596((byte) 104, 575);
                class230.field3390.method2619((byte) -128, class356.field5410);
                class230.field3390.method2619((byte) 81, class419.method2487((byte) -57));
                class230.field3390.method2592(class342.field5115, (byte) -101);
                class230.field3390.method2592(class233.field3411, (byte) -126);
                class230.field3390.method2619((byte) -2, class337.field5038.field3930);
                class378.method2318(class230.field3390, true);
                class230.field3390.method2597(class229.field3374, (byte) -99);
                class230.field3390.method2596((byte) 109, class64.field891);
                class446 var8 = class337.field5038.method2210(1);
                class230.field3390.method2619((byte) 28, var8.field6315);
                class230.field3390.method2606(0, var8.field6315, var8.field6316, (byte) 0);
                class332.field4975 = true;
                class230.field3390.method2592(class81.field1138, (byte) -121);
                class230.field3390.method2596((byte) 1, class493.field6938.method2666(true));
                class230.field3390.method2596((byte) -14, class443.field6258.method2666(true));
                class230.field3390.method2596((byte) -78, class73.field983.method2666(true));
                class230.field3390.method2596((byte) -103, class317.field4762.method2666(true));
                class230.field3390.method2596((byte) -47, class163.field2261.method2666(true));
                class230.field3390.method2596((byte) -37, class170.field2421.method2666(true));
                class230.field3390.method2596((byte) 124, class43.field598.method2666(true));
                class230.field3390.method2596((byte) -98, class231.field3398.method2666(true));
                class230.field3390.method2596((byte) 116, class425.field6075.method2666(true));
                class230.field3390.method2596((byte) 102, class116.field1617.method2666(true));
                class230.field3390.method2596((byte) 126, class122.field1678.method2666(true));
                class230.field3390.method2596((byte) -126, class476.field6654.method2666(true));
                class230.field3390.method2596((byte) -11, class119.field1664.method2666(true));
                class230.field3390.method2596((byte) 116, class388.field5716.method2666(true));
                class230.field3390.method2596((byte) -44, class120.field1669.method2666(true));
                class230.field3390.method2596((byte) 124, class378.field5624.method2666(true));
                class230.field3390.method2596((byte) -24, class251.field3621.method2666(true));
                class230.field3390.method2596((byte) -116, class33.field428.method2666(true));
                class230.field3390.method2596((byte) -102, class466.field6566.method2666(true));
                class230.field3390.method2596((byte) -50, class451.field6409.method2666(true));
                class230.field3390.method2596((byte) -77, class130.field1819.method2666(true));
                class230.field3390.method2596((byte) -82, class285.field4350.method2666(true));
                class230.field3390.method2596((byte) -32, class288.field4394.method2666(true));
                class230.field3390.method2596((byte) 115, class150.field2106.method2666(true));
                class230.field3390.method2596((byte) -127, class97.field1396.method2666(true));
                class230.field3390.method2596((byte) -22, class473.field6628.method2666(true));
                class230.field3390.method2596((byte) -117, class58.field811.method2666(true));
                class230.field3390.method2596((byte) -31, class1.field19.method2666(true));
                class230.field3390.method2596((byte) 102, class208.field3145.method2666(true));
                class230.field3390.method2606(0, var5.field6315, var5.field6316, (byte) 0);
                class230.field3390.method2602(-120, class230.field3390.field6315 - var7);
                class27.field335.method1000(arg0 + 29969, 0, class230.field3390.field6315, class230.field3390.field6316);
                class230.field3390.method372(var6, (byte) -98);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class220.field3246.method372(var6, (byte) -115);
                class88.field1240 = 4;
            }
            if (class88.field1240 == 4) {
                if (class27.field335.method1005(5000) < 1) {
                    return;
                }
                int var10 = class27.field335.method1002((byte) -60);
                if (var10 == 21) {
                    class88.field1240 = 7;
                } else if (var10 == 29) {
                    class88.field1240 = 11;
                } else if (var10 == 1) {
                    class88.field1240 = 5;
                    class6.field107 = var10;
                    return;
                } else if (var10 == 2) {
                    class88.field1240 = 8;
                } else if (var10 == 15) {
                    class95.field1342 = -2;
                    class88.field1240 = 12;
                } else if (var10 == 23 && class299.field4470 < 1) {
                    class299.field4470++;
                    class52.field753 = 0;
                    class88.field1240 = 1;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                    return;
                } else {
                    class6.field107 = var10;
                    class88.field1240 = 0;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                    return;
                }
            }
            if (class88.field1240 == 6) {
                class230.field3390.field6315 = 0;
                class230.field3390.method376((byte) 87, class109.field1539.field2407);
                class27.field335.method1000(arg0 + 29969, 0, class230.field3390.field6315, class230.field3390.field6316);
                class88.field1240 = 4;
            } else if (class88.field1240 == 7) {
                if (class27.field335.method1005(arg0 ^ 0x1397) >= 1) {
                    class200.field3037 = (class27.field335.method1002((byte) -91) + 3) * 60;
                    class6.field107 = 21;
                    class88.field1240 = 0;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                }
            } else if (class88.field1240 != 11) {
                if (class88.field1240 == 8) {
                    if (class27.field335.method1005(5000) < 13) {
                        return;
                    }
                    class27.field335.method996(13, class220.field3246.field6316, true, 0);
                    class220.field3246.field6315 = 0;
                    class465.field6556 = class220.field3246.method2628(arg0 ^ 0xC01F);
                    class8.field126 = class220.field3246.method2628(arg0 + 49121);
                    class305.field4555 = class220.field3246.method2628(49152) == 1;
                    class174.field2468 = class220.field3246.method2628(49152) == 1;
                    class32.field421 = class220.field3246.method2628(arg0 ^ 0xC01F) == 1;
                    class206.field3122 = class220.field3246.method2628(49152) == 1;
                    class263.field3910 = class220.field3246.method2631(arg0 ^ 0x9FD);
                    class419.field6026 = class220.field3246.method2628(49152) == 1;
                    class198.field2979 = class220.field3246.method2628(49152) == 1;
                    class206.field3124.method343(class198.field2979, (byte) 123);
                    class23.field309.method2369(class198.field2979, (byte) 125);
                    class448.field6339.method335((byte) 31, class198.field2979);
                    if ((!class305.field4555 || class32.field421) && !class419.field6026) {
                        try {
                            class399.method2383(class21.field261.field2125, -10423, "unzap");
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class399.method2383(class21.field261.field2125, -10423, "zap");
                        } catch (Throwable var16) {
                            if (class489.field6854) {
                                try {
                                    class21.field261.field2125.getAppletContext().showDocument(new URL(class21.field261.field2125.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var14) {
                                }
                            }
                        }
                    }
                    if (class150.field2114 == class103.field1445) {
                        try {
                            class399.method2383(class21.field261.field2125, -10423, "loggedin");
                        } catch (Throwable var13) {
                        }
                    }
                    class88.field1240 = 10;
                }
                if (class88.field1240 == 10) {
                    if (class220.field3246.method374((byte) -48)) {
                        if (class27.field335.method1005(5000) < 1) {
                            return;
                        }
                        class27.field335.method996(1, class220.field3246.field6316, true, class220.field3246.field6315 + 2);
                    }
                    class147.field2099 = class349.method2149((byte) -100)[class220.field3246.method368((byte) -4)];
                    class95.field1342 = class220.field3246.method2631(arg0 ^ 0x9FD);
                    class88.field1240 = 9;
                }
                if (class88.field1240 == 9) {
                    if (class27.field335.method1005(5000) >= class95.field1342) {
                        class27.field335.method996(class95.field1342, class220.field3246.field6316, true, 0);
                        class220.field3246.field6315 = 0;
                        int var11 = class95.field1342;
                        class6.field107 = 2;
                        class88.field1240 = 0;
                        class165.method1120(12839);
                        class356.method2196(class220.field3246, true);
                        class356.field5413 = -1;
                        class229.method1496(1862775652, false);
                        if (class220.field3246.field6315 != var11) {
                            throw new RuntimeException("lswp pos:" + class220.field3246.field6315 + " psize:" + var11);
                        }
                        class147.field2099 = null;
                    }
                } else if (arg0 == 31 && class88.field1240 == 12) {
                    if (class95.field1342 == -2) {
                        if (class27.field335.method1005(5000) < 2) {
                            return;
                        }
                        class27.field335.method996(2, class220.field3246.field6316, true, 0);
                        class220.field3246.field6315 = 0;
                        class95.field1342 = class220.field3246.method2631(2530);
                    }
                    if (class27.field335.method1005(5000) >= class95.field1342) {
                        class27.field335.method996(class95.field1342, class220.field3246.field6316, true, 0);
                        class220.field3246.field6315 = 0;
                        int var12 = class95.field1342;
                        class88.field1240 = 0;
                        class6.field107 = 15;
                        class416.method2480((byte) -38);
                        class356.method2196(class220.field3246, true);
                        if (class220.field3246.field6315 != var12) {
                            throw new RuntimeException("lswpr pos:" + class220.field3246.field6315 + " psize:" + var12);
                        }
                        class147.field2099 = null;
                    }
                }
            } else if (class27.field335.method1005(5000) >= 1) {
                class307.field4567 = class27.field335.method1002((byte) -64);
                class88.field1240 = 0;
                class6.field107 = 29;
                class27.field335.method998((byte) -13);
                class27.field335 = null;
            }
        } catch (IOException var17) {
            if (class27.field335 != null) {
                class27.field335.method998((byte) -13);
                class27.field335 = null;
            }
            if (class299.field4470 >= 1) {
                class6.field107 = -4;
                class88.field1240 = 0;
            } else {
                class52.field753 = 0;
                class88.field1240 = 1;
                class299.field4470++;
                if (class487.field6839 == class14.field198) {
                    class14.field198 = class94.field1289;
                } else {
                    class14.field198 = class487.field6839;
                }
            }
        }
    }
}
