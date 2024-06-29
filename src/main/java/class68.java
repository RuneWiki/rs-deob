import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class68 extends class27 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field1245 = 0;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    private int field1252 = 1;

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
    private int field1268 = 0;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Z")
    public static boolean field1246 = true;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lkb;")
    private static class93 field1253 = class76.method390("Please use a different world)3", 0);

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lkb;")
    public static class93 field1248 = class76.method390("<col=c0ff00>", 0);

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Lkb;")
    public static class93 field1258 = field1253;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lkb;")
    public static class93 field1265 = field1253;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "Lkb;")
    private static class93 field1263 = class76.method390("World", 0);

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lkb;")
    public static class93 field1254 = field1263;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lkb;")
    public static class93 field1257 = field1263;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "B")
    public static byte field1264 = 0;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "Lrd;")
    public static class158 field1243;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Lef;")
    public static class45 field1250;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "Ljg;")
    public static class89 field1256;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Ljava/awt/Frame;")
    public static Frame field1262;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "[[[B")
    public static byte[][][] field1266;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        class6.method35(true);
        if (arg0 < 77) {
            this.method154((byte) 2);
        }
        ++field1249;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1261;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class142.field2781[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class159.field3209; ++var6) {
                int var7 = class97.field1808[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1245 != -1) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) (var9 / 4096)) * 4096.0D);
                    var11 = (int) ((double) (this.field1252 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1252;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field1268 == 0) {
                    var12 = class130.field2464[var12 >> 4 & 255] + 4096 >> 1;
                } else if (this.field1268 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
    public static void method361(byte arg0) {
        if (arg0 <= 20) {
            method363(-60);
        }
        field1256 = null;
        field1258 = null;
        field1257 = null;
        field1253 = null;
        field1254 = null;
        field1266 = null;
        field1262 = null;
        field1265 = null;
        field1248 = null;
        field1243 = null;
        field1250 = null;
        field1263 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IB)Z")
    public static final boolean method362(int arg0, byte arg1) {
        ++field1247;
        if (arg1 != -117) {
            field1258 = null;
        }
        return ~(1 & arg0 >> 30) != -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            this.method15((byte) 45, 51, (class158) null);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field1252 = arg2.method1054(128);
                }
            } else {
                this.field1268 = arg2.method1054(128);
            }
        } else {
            this.field1245 = arg2.method1054(128);
        }
        ++field1255;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static final void method363(int arg0) {
        if (~class184.field3627 < -2) {
            --class184.field3627;
        }
        ++field1259;
        if (class153.field2971 > 0) {
            --class153.field2971;
        }
        if (class18.field300) {
            class18.field300 = false;
            class136.method857(104);
        } else {
            for (int var1 = 0; var1 < 100 && class154.method991(arg0 ^ -10022); ++var1) {
            }
            if (~class28.field455 == -31) {
                class186.method1214(arg0 + 10022, class151.field2908, 34);
                Object var2 = class102.field1885.field3745;
                synchronized (class102.field1885.field3745) {
                    if (arg0 != -10022) {
                        field1243 = null;
                    }
                    if (class10.field164) {
                        if (~class144.field2798 != -1 || ~class102.field1885.field3760 <= -41) {
                            class151.field2908.method47(49, 8);
                            class151.field2908.method1069(0, (byte) -26);
                            ++class65.field1078;
                            int var3 = class151.field2908.field3153;
                            int var4 = 0;
                            for (int var5 = 0; ~var5 > ~class102.field1885.field3760 && ~(class151.field2908.field3153 - var3) > -241; ++var5) {
                                ++var4;
                                int var6 = class102.field1885.field3761[var5];
                                if (~var6 <= -1) {
                                    if (~var6 < -503) {
                                        var6 = 502;
                                    }
                                } else {
                                    var6 = 0;
                                }
                                int var7 = class102.field1885.field3759[var5];
                                if (var7 >= 0) {
                                    if (~var7 < -765) {
                                        var7 = 764;
                                    }
                                } else {
                                    var7 = 0;
                                }
                                int var8 = var6 * 765 + var7;
                                if (~class102.field1885.field3761[var5] == 0 && class102.field1885.field3759[var5] == -1) {
                                    var7 = -1;
                                    var8 = 524287;
                                    var6 = -1;
                                }
                                if (~class70.field1299 == ~var7 && class28.field451 == var6) {
                                    if (~class49.field782 > -2048) {
                                        ++class49.field782;
                                    }
                                } else {
                                    int var9 = -class28.field451 + var6;
                                    int var10 = var7 - class70.field1299;
                                    class70.field1299 = var7;
                                    class28.field451 = var6;
                                    if (~class49.field782 > -9 && ~var10 <= 31 && var10 <= 31 && var9 >= -32 && ~var9 >= -32) {
                                        var10 += 32;
                                        var9 += 32;
                                        class151.field2908.method1061((class49.field782 << 12) + (var10 << 6) + var9, 12184);
                                        class49.field782 = 0;
                                    } else if (class49.field782 < 8) {
                                        class151.field2908.method1050(false, 8388608 - (-(class49.field782 << 19) + -var8));
                                        class49.field782 = 0;
                                    } else {
                                        class151.field2908.method1051(true, (class49.field782 << 19) + (-1073741824 - -var8));
                                        class49.field782 = 0;
                                    }
                                }
                            }
                            class151.field2908.method1085(arg0 ^ 10048, -var3 + class151.field2908.field3153);
                            if (~class102.field1885.field3760 < ~var4) {
                                class102.field1885.field3760 -= var4;
                                for (int var11 = 0; class102.field1885.field3760 > var11; ++var11) {
                                    class102.field1885.field3759[var11] = class102.field1885.field3759[var11 - -var4];
                                    class102.field1885.field3761[var11] = class102.field1885.field3761[var11 - -var4];
                                }
                            } else {
                                class102.field1885.field3760 = 0;
                            }
                        }
                    } else {
                        class102.field1885.field3760 = 0;
                    }
                }
                if (~class144.field2798 != -1) {
                    ++class63.field1008;
                    long var12 = (-class35.field566 + class63.field998) / 50L;
                    class35.field566 = class63.field998;
                    if (var12 > 4095L) {
                        var12 = 4095L;
                    }
                    int var14 = class57.field928;
                    if (~var14 <= -1) {
                        if (~var14 < -503) {
                            var14 = 502;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = class88.field1592;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 764) {
                        var15 = 764;
                    }
                    int var16 = var14 * 765 + var15;
                    byte var17 = 0;
                    if (class144.field2798 == 2) {
                        var17 = 1;
                    }
                    class151.field2908.method47(6, 8);
                    int var18 = (int) var12;
                    class151.field2908.method1087(423438748, (var17 << 19) + (var18 << 20) + var16);
                }
                if (class176.field3506 > 0) {
                    --class176.field3506;
                }
                if (class112.field2083[96] || class112.field2083[97] || class112.field2083[98] || class112.field2083[99]) {
                    class95.field1763 = true;
                }
                if (class95.field1763 && class176.field3506 <= 0) {
                    ++class106.field1938;
                    class95.field1763 = false;
                    class176.field3506 = 20;
                    class151.field2908.method47(128, 8);
                    class151.field2908.method1061(class113.field2108, 12184);
                    class151.field2908.method1061(class30.field510, 12184);
                }
                if (class102.field1888 && !field1246) {
                    field1246 = true;
                    class151.field2908.method47(74, arg0 ^ -10030);
                    ++class64.field1013;
                    class151.field2908.method1069(1, (byte) -26);
                }
                if (!class102.field1888 && field1246) {
                    field1246 = false;
                    ++class64.field1013;
                    class151.field2908.method47(74, 8);
                    class151.field2908.method1069(0, (byte) -26);
                }
                class174.method1157((byte) 111);
                if (class28.field455 == 30) {
                    class40.method217((byte) -101);
                    client.method167(false);
                    ++class49.field790;
                    if (class49.field790 > 750) {
                        class136.method857(arg0 ^ -10062);
                    } else {
                        class115.method641(1);
                        class131.method765(64);
                        class98.method550(500);
                        if (~class207.field4063 != -1) {
                            class25.field387 += 20;
                            if (~class25.field387 <= -401) {
                                class207.field4063 = 0;
                            }
                        }
                        ++class24.field363;
                        if (class107.field1947 != null) {
                            ++class114.field2129;
                            if (~class114.field2129 <= -16) {
                                class160.method1095(arg0 + 10022, class107.field1947);
                                class107.field1947 = null;
                            }
                        }
                        if (class153.field3010 != null) {
                            class160.method1095(0, class153.field3010);
                            ++class23.field356;
                            if (~class97.field1826 < ~(field1244 + 5) || field1244 + -5 > class97.field1826 || ~(class111.field1996 - -5) > ~class170.field3380 || ~(class111.field1996 + -5) < ~class170.field3380) {
                                class13.field236 = true;
                            }
                            if (class66.field1186 == 0) {
                                if (class13.field236 && ~class23.field356 <= -6) {
                                    if (class29.field472 == class153.field3010 && ~class63.field995 != ~class62.field993) {
                                        ++class179.field3565;
                                        class65 var19 = class153.field3010;
                                        byte var20 = 0;
                                        if (class144.field2809 == 1 && ~var19.field1056 == -207) {
                                            var20 = 1;
                                        }
                                        if (var19.field1146[class62.field993] <= 0) {
                                            var20 = 0;
                                        }
                                        if (class115.method638(true, class178.method1173(var19, 127))) {
                                            int var21 = class62.field993;
                                            int var22 = class63.field995;
                                            var19.field1146[var21] = var19.field1146[var22];
                                            var19.field1102[var21] = var19.field1102[var22];
                                            var19.field1146[var22] = -1;
                                            var19.field1102[var22] = 0;
                                        } else if (~var20 != -2) {
                                            var19.method332(arg0 ^ 55514, class62.field993, class63.field995);
                                        } else {
                                            int var23 = class63.field995;
                                            int var24 = class62.field993;
                                            while (~var23 != ~var24) {
                                                if (~var24 > ~var23) {
                                                    var19.method332(arg0 ^ 55514, var23 + -1, var23);
                                                    --var23;
                                                } else if (~var23 > ~var24) {
                                                    var19.method332(arg0 + -55514, var23 + 1, var23);
                                                    ++var23;
                                                }
                                            }
                                        }
                                        class151.field2908.method47(81, 8);
                                        class151.field2908.method1069(var20, (byte) -26);
                                        class151.field2908.method1082(class153.field3010.field1058, 1838682736);
                                        class151.field2908.method1061(class63.field995, arg0 + 22206);
                                        class151.field2908.method1033(false, class62.field993);
                                    }
                                } else if ((class188.field3680 == 1 || class27.method151(class100.field1841 + -1, (byte) -83)) && ~class100.field1841 < -3) {
                                    class67.method360(false);
                                } else if (~class100.field1841 < -1) {
                                    class117.method649(class100.field1841 + -1, 0);
                                }
                                class153.field3010 = null;
                                class114.field2129 = 10;
                                class144.field2798 = 0;
                            }
                        }
                        class49.field784 = null;
                        class75.field1356 = false;
                        class207.field4056 = 0;
                        class96.field1783 = false;
                        class65 var25 = class145.field2823;
                        class65 var26 = class80.field1418;
                        class80.field1418 = null;
                        class145.field2823 = null;
                        while (class110.method597((byte) 69) && class207.field4056 < 128) {
                            class84.field1539[class207.field4056] = class2.field43;
                            class144.field2813[class207.field4056] = class89.field1653;
                            ++class207.field4056;
                        }
                        if (~class97.field1824 != 0) {
                            class172.method1151(765, 503, 0, 0, 0, class97.field1824, (byte) -33, 0);
                        }
                        ++class203.field3928;
                        while (true) {
                            class104 var27;
                            class65 var28;
                            class65 var29;
                            do {
                                var27 = (class104) class201.field3897.method694((byte) -122);
                                if (var27 == null) {
                                    while (true) {
                                        class104 var30;
                                        class65 var31;
                                        class65 var32;
                                        do {
                                            var30 = (class104) class61.field972.method694((byte) -24);
                                            if (var30 == null) {
                                                while (true) {
                                                    class104 var33;
                                                    class65 var34;
                                                    class65 var35;
                                                    do {
                                                        var33 = (class104) class171.field3395.method694((byte) -33);
                                                        if (var33 == null) {
                                                            if (class73.field1348 != null) {
                                                                class142.method895(83);
                                                            }
                                                            if (~class134.field2577 != 0) {
                                                                int var36 = class134.field2594;
                                                                int var37 = class134.field2577;
                                                                boolean var38 = class6.method36(0, true, class106.field1940.field2038[0], 0, (byte) -2, 0, class106.field1940.field2064[0], var36, 0, 0, 0, var37);
                                                                if (var38) {
                                                                    class207.field4063 = 1;
                                                                    class13.field216 = class88.field1592;
                                                                    class25.field387 = 0;
                                                                    class4.field71 = class57.field928;
                                                                }
                                                                class134.field2577 = -1;
                                                            }
                                                            class151.method950((byte) 120);
                                                            if (class80.field1418 != var26) {
                                                                if (var26 != null) {
                                                                    class160.method1095(0, var26);
                                                                }
                                                                if (class80.field1418 != null) {
                                                                    class160.method1095(arg0 ^ -10022, class80.field1418);
                                                                }
                                                            }
                                                            if (class145.field2823 != var25 && ~class19.field312 == ~class113.field2113) {
                                                                if (var25 != null) {
                                                                    class160.method1095(0, var25);
                                                                }
                                                                if (class145.field2823 != null) {
                                                                    class160.method1095(0, class145.field2823);
                                                                }
                                                            }
                                                            if (class145.field2823 != null) {
                                                                if (~class19.field312 < ~class113.field2113) {
                                                                    ++class113.field2113;
                                                                    if (~class19.field312 == ~class113.field2113) {
                                                                        class160.method1095(0, class145.field2823);
                                                                    }
                                                                }
                                                            } else if (~class113.field2113 < -1) {
                                                                --class113.field2113;
                                                            }
                                                            class82.method418(true);
                                                            if (class140.field2721) {
                                                                class83.method423(-62);
                                                            }
                                                            for (int var39 = 0; var39 < 5; ++var39) {
                                                                int var10002 = class93.field1709[var39]++;
                                                            }
                                                            int var40 = class29.method163((byte) -113);
                                                            int var41 = class51.method268((byte) 72);
                                                            if (var40 > 4500 && ~var41 < -4501) {
                                                                ++class120.field2216;
                                                                class153.field2971 = 250;
                                                                class81.method409(arg0 + 10022, 4000);
                                                                class151.field2908.method47(69, 8);
                                                            }
                                                            ++class151.field2914;
                                                            ++class14.field242;
                                                            ++class130.field2462;
                                                            if (~class130.field2462 < -501) {
                                                                class130.field2462 = 0;
                                                                int var42 = (int) (Math.random() * 8.0D);
                                                                if ((2 & var42) == 2) {
                                                                    class21.field341 += class79.field1412;
                                                                }
                                                                if ((1 & var42) == 1) {
                                                                    class166.field3328 += class66.field1209;
                                                                }
                                                                if ((var42 & 4) == 4) {
                                                                    class160.field3217 += class7.field117;
                                                                }
                                                            }
                                                            if (class21.field341 < -55) {
                                                                class79.field1412 = 2;
                                                            }
                                                            if (class166.field3328 < -50) {
                                                                class66.field1209 = 2;
                                                            }
                                                            if (class151.field2914 > 500) {
                                                                class151.field2914 = 0;
                                                                int var43 = (int) (8.0D * Math.random());
                                                                if ((var43 & 1) == 1) {
                                                                    class93.field1707 += class18.field302;
                                                                }
                                                                if (~(var43 & 2) == -3) {
                                                                    class193.field3749 += class12.field201;
                                                                }
                                                            }
                                                            if (class160.field3217 < -40) {
                                                                class7.field117 = 1;
                                                            }
                                                            if (~class93.field1707 > 59) {
                                                                class18.field302 = 2;
                                                            }
                                                            if (~class21.field341 < -56) {
                                                                class79.field1412 = -2;
                                                            }
                                                            if (class193.field3749 < -20) {
                                                                class12.field201 = 1;
                                                            }
                                                            if (class160.field3217 > 40) {
                                                                class7.field117 = -1;
                                                            }
                                                            if (class93.field1707 > 60) {
                                                                class18.field302 = -2;
                                                            }
                                                            if (~class166.field3328 < -51) {
                                                                class66.field1209 = -2;
                                                            }
                                                            if (class193.field3749 > 10) {
                                                                class12.field201 = -1;
                                                            }
                                                            if (class14.field242 > 50) {
                                                                class151.field2908.method47(168, 8);
                                                                ++class108.field1967;
                                                            }
                                                            try {
                                                                if (class147.field2840 != null && ~class151.field2908.field3153 < -1) {
                                                                    class147.field2840.method6(0, class151.field2908.field3162, class151.field2908.field3153, (byte) -48);
                                                                    class14.field242 = 0;
                                                                    class151.field2908.field3153 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class136.method857(104);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field1919;
                                                        if (var34.field1127 < 0) {
                                                            break;
                                                        }
                                                        var35 = class204.method1325(65535, var34.field1143);
                                                    } while (var35 == null || var35.field1121 == null || ~var34.field1127 <= ~var35.field1121.length || var35.field1121[var34.field1127] != var34);
                                                    class82.method421(var33, false);
                                                }
                                            }
                                            var31 = var30.field1919;
                                            if (~var31.field1127 > -1) {
                                                break;
                                            }
                                            var32 = class204.method1325(65535, var31.field1143);
                                        } while (var32 == null || var32.field1121 == null || ~var32.field1121.length >= ~var31.field1127 || var32.field1121[var31.field1127] != var31);
                                        class82.method421(var30, false);
                                    }
                                }
                                var28 = var27.field1919;
                                if (~var28.field1127 > -1) {
                                    break;
                                }
                                var29 = class204.method1325(65535, var28.field1143);
                            } while (var29 == null || var29.field1121 == null || var29.field1121.length <= var28.field1127 || var29.field1121[var28.field1127] != var28);
                            class82.method421(var27, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)I")
    public static final int method364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -8434) {
            field1243 = null;
        }
        ++field1267;
        int var5 = -class150.field2888[arg4 * 1024 / arg2] + 65536 >> 1;
        return ((-var5 + 65536) * arg3 >> 16) + (arg1 * var5 >> 16);
    }
}
