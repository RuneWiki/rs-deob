import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class123 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lvf;")
    private static class265 field2208 = class87.method582(-46, "Loaded interfaces");

    @OriginalMember(owner = "client!va", name = "k", descriptor = "[[S")
    public static short[][] field2217 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lvf;")
    public static class265 field2220 = field2208;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lfd;")
    public static class207 field2213 = new class207(64);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[B")
    public static byte[] field2224 = new byte[520];

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[I")
    public static int[] field2223 = new int[100];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lfl;")
    public static class192 field2212;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method825(byte arg0) {
        field2224 = null;
        if (arg0 < 81) {
            return;
        }
        field2223 = null;
        field2212 = null;
        field2208 = null;
        field2213 = null;
        field2217 = null;
        field2220 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    public static final void method826(int arg0, int arg1) {
        class249.field4324 = new int[arg1];
        class39.field897 = new int[arg1];
        if (arg0 != -14010) {
            method831(125);
        }
        class25.field698 = new int[arg1];
        field2215++;
        client.field3859 = new int[arg1];
        class16.field465 = new int[arg1];
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILnc;II)V")
    public static final void method827(int arg0, class122 arg1, int arg2, int arg3) {
        if ((arg0 & 0x1) != 0) {
            int var4 = class207.field3730.method927(arg3 ^ 0x3D);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class207.field3730.method893(false);
            class153.method1045(var4, arg1, var5, (byte) 126);
        }
        if ((arg0 & 0x4) != 0) {
            int var6 = class207.field3730.method947(27126);
            int var7 = class207.field3730.method920((byte) 63);
            arg1.method967(var7, 28, class93.field1655, var6);
            arg1.field2594 = class93.field1655 + 300;
            arg1.field2541 = class207.field3730.method893(false);
        }
        field2210++;
        if ((arg0 & 0x100) != 0) {
            int var8 = class207.field3730.method910(false);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class207.field3730.method933(arg3 ^ 0x27);
            boolean var10 = true;
            if (var8 != -1 && arg1.field2585 != -1 && class174.method1142(class210.method1441(var8, -1999596368).field3720, false).field3888 < class174.method1142(class210.method1441(arg1.field2585, -1999596368).field3720, false).field3888) {
                var10 = false;
            }
            if (var10) {
                arg1.field2602 = 0;
                arg1.field2538 = 0;
                arg1.field2583 = var9 >> 16;
                arg1.field2561 = (var9 & 0xFFFF) + class93.field1655;
                arg1.field2585 = var8;
                if (arg1.field2561 > class93.field1655) {
                    arg1.field2602 = -1;
                }
                if (arg1.field2585 != -1 && class93.field1655 == arg1.field2561) {
                    int var11 = class210.method1441(arg1.field2585, arg3 - 1999596432).field3720;
                    if (var11 != -1) {
                        class216 var12 = class174.method1142(var11, false);
                        if (var12 != null && var12.field3890 != null) {
                            class268.method1832(var12, class214.field3827 == arg1, 0, arg1.field2600, -2, arg1.field2564);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x2) != 0) {
            arg1.field2603 = class207.field3730.method942(false);
            if (arg1.field2603.method1799(0, -1) == 126) {
                arg1.field2603 = arg1.field2603.method1810(arg3 - 65, 1);
                class259.method1725(-79, arg1.field2603, 2, arg1.method824((byte) 112));
            } else if (class214.field3827 == arg1) {
                class259.method1725(-97, arg1.field2603, 2, arg1.method824((byte) 67));
            }
            arg1.field2555 = 0;
            arg1.field2611 = 0;
            arg1.field2579 = 150;
        }
        if ((arg0 & 0x10) != 0) {
            int var13 = class207.field3730.method910(false);
            int var14 = class207.field3730.method920((byte) 92);
            int var15 = class207.field3730.method893(false);
            int var16 = class207.field3730.field2449;
            boolean var17 = (var13 & 0x8000) != 0;
            if (arg1.field2163 != null && arg1.field2194 != null) {
                long var18 = arg1.field2163.method1793(43);
                boolean var20 = false;
                if (var14 <= 1) {
                    if (var17 || (!class262.field4583 || class203.field3632) && !class101.field1792) {
                        for (int var21 = 0; var21 < class262.field4582; var21++) {
                            if (class4.field55[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    } else {
                        var20 = true;
                    }
                }
                if (!var20 && class219.field3945 == 0) {
                    class262.field4574.field2449 = 0;
                    int var22 = -1;
                    class207.field3730.method917(class262.field4574.field2483, var15, -20730, 0);
                    class262.field4574.field2449 = 0;
                    class265 var24;
                    if (var17) {
                        class116 var23 = class262.method1756(-59, class262.field4574);
                        var13 &= 0x7FFF;
                        var22 = var23.field2059;
                        var24 = var23.field2058.method323((byte) -117, class262.field4574);
                    } else {
                        var24 = class115.method751(class218.method1499(class262.field4574, (byte) -39).method1805(125));
                    }
                    arg1.field2603 = var24.method1781(30598);
                    arg1.field2579 = 150;
                    arg1.field2611 = var13 >> 8;
                    arg1.field2555 = var13 & 0xFF;
                    if (var14 == 2) {
                        client.method1468(class148.method1022(10, new class265[] { class214.field3832, arg1.method824((byte) 120) }), var22, (class265) null, arg3 - 179, var24, var17 ? 17 : 1);
                    } else if (var14 == 1) {
                        client.method1468(class148.method1022(10, new class265[] { class179.field3192, arg1.method824((byte) 90) }), var22, (class265) null, 57, var24, var17 ? 17 : 1);
                    } else {
                        client.method1468(arg1.method824((byte) 111), var22, (class265) null, arg3 - 47, var24, var17 ? 17 : 2);
                    }
                }
            }
            class207.field3730.field2449 = var15 + var16;
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field2584 = class207.field3730.method900(54);
            if (arg1.field2584 == 65535) {
                arg1.field2584 = -1;
            }
        }
        if ((arg0 & 0x20) != 0) {
            int var25 = class207.field3730.method925(-3);
            byte[] var26 = new byte[var25];
            class135 var27 = new class135(var26);
            class207.field3730.method917(var26, var25, -20730, 0);
            class36.field834[arg2] = var27;
            arg1.method814(0, var27);
        }
        if ((arg3 & arg0) != 0) {
            arg1.field2604 = class207.field3730.method901((byte) -128);
            arg1.field2586 = class207.field3730.method927(arg3 + 62);
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field2539 = class207.field3730.method925(-3);
            arg1.field2593 = class207.field3730.method925(arg3 ^ 0xFFFFFFBD);
            arg1.field2607 = class207.field3730.method925(-3);
            arg1.field2557 = class207.field3730.method920((byte) 93);
            arg1.field2549 = class207.field3730.method900(119) + class93.field1655;
            arg1.field2554 = class207.field3730.method900(121) + class93.field1655;
            arg1.field2567 = class207.field3730.method914(0);
            arg1.field2551 = 1;
            arg1.field2590 = 0;
        }
        if ((arg0 & 0x400) != 0) {
            int var28 = class207.field3730.method947(27126);
            int var29 = class207.field3730.method914(0);
            arg1.method967(var29, 78, class93.field1655, var28);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lfl;BLfl;Lfl;Lfl;)V")
    public static final void method828(class192 arg0, byte arg1, class192 arg2, class192 arg3, class192 arg4) {
        class21.field594 = arg0;
        class29.field741 = arg2;
        field2211++;
        class245.field4276 = arg3;
        class257.field4416 = arg4;
        class178.field3174 = new class6[class245.field4276.method1315(arg1 + 120)][];
        class263.field4594 = new boolean[class245.field4276.method1315(0)];
        if (arg1 != -120) {
            field2212 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Lng;")
    public static final class135 method829(boolean arg0) {
        class135 var1 = new class135(34);
        field2214++;
        if (arg0) {
            method827(-80, (class122) null, 30, -101);
        }
        var1.method903((byte) 36, 11);
        var1.method903((byte) 36, class124.field2227);
        var1.method903((byte) 36, class68.field1304 ? 1 : 0);
        var1.method903((byte) 36, class117.field2077 ? 1 : 0);
        var1.method903((byte) 36, client.field3855 ? 1 : 0);
        var1.method903((byte) 36, class19.field498 ? 1 : 0);
        var1.method903((byte) 36, class61.field1219 ? 1 : 0);
        var1.method903((byte) 36, class70.field1360 ? 1 : 0);
        var1.method903((byte) 36, class196.field3505 ? 1 : 0);
        var1.method903((byte) 36, class214.field3830 ? 1 : 0);
        var1.method903((byte) 36, class107.field1895);
        var1.method903((byte) 36, class258.field4428 ? 1 : 0);
        var1.method903((byte) 36, class23.field688 ? 1 : 0);
        var1.method903((byte) 36, class245.field4270 ? 1 : 0);
        var1.method903((byte) 36, class54.field1119);
        var1.method903((byte) 36, class127.field2273 ? 1 : 0);
        var1.method903((byte) 36, class43.field959);
        var1.method903((byte) 36, class105.field1868);
        var1.method903((byte) 36, class172.field3095);
        var1.method921(127, class283.field4990);
        var1.method921(119, class10.field341);
        var1.method903((byte) 36, class255.method1677());
        var1.method898((byte) 115, class77.field1469);
        var1.method903((byte) 36, class50.field1058);
        var1.method903((byte) 36, class100.field1774 ? 1 : 0);
        var1.method903((byte) 36, class253.field4359 ? 1 : 0);
        var1.method903((byte) 36, class221.field3970);
        var1.method903((byte) 36, class186.field3373 ? 1 : 0);
        var1.method903((byte) 36, class110.field1924 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public static final void method830(int arg0, int arg1) {
        field2209++;
        class256 var2 = (class256) class4.field52.method1842(-1, (long) arg0);
        if (var2 != null && arg1 == 8404) {
            var2.method97(arg1 - 8246);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method831(int arg0) {
        if (arg0 <= 58) {
            return;
        }
        if (class264.field4604 == null || class227.field4029 == null) {
            class227.field4029 = new int[256];
            class264.field4604 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class264.field4604[var1] = (int) (Math.sin(var2) * 4096.0D);
                class227.field4029[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2216++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public abstract void method402(boolean arg0);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)I")
    public abstract int method400(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)V")
    public static final void method832(int arg0, int arg1) {
        class125.field2245 = null;
        class29.field745 = -1;
        class120.field2114 = -1;
        class186.field3372 = 0;
        class55.field1127 = arg0;
        class219.field3957 = false;
        class216.field3899 = 1;
        field2218++;
        if (arg1 >= -7) {
            method832(110, -118);
        }
    }
}
