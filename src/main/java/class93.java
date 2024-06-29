import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class93 extends class129 {

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public int field2366 = 0;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public int field2381 = -1;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public int field2392 = -1;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "Z")
    public boolean field2384 = true;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "[[[I")
    public static int[][][] field2372 = new int[4][105][105];

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lv;")
    private static class122 field2373 = class55.method425(-86, "Your account has been disabled)3");

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lv;")
    public static class122 field2370 = class55.method425(-83, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lv;")
    public static class122 field2376 = field2373;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "Lv;")
    private static class122 field2388 = class55.method425(-120, "Public chat");

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lv;")
    public static class122 field2375 = field2388;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "Lv;")
    public static class122 field2390 = class55.method425(-88, "mapmarker");

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "Ljb;")
    public static class56 field2380 = new class56(50);

    @OriginalMember(owner = "client!pc", name = "vb", descriptor = "Z")
    public static boolean field2397 = false;

    @OriginalMember(owner = "client!pc", name = "wb", descriptor = "Lv;")
    public static class122 field2398 = class55.method425(-88, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "Lrd;")
    public static class106 field2396;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Lkb;")
    public static class62 field2368;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ[BZ)V", line = 5)
    public static final void method737(int arg0, int arg1, boolean arg2, byte[] arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        field2379++;
        if (class66.field1697 == null) {
            return;
        }
        if (class38.field992 >= 0) {
            arg1 -= 20;
            if (arg1 < 1) {
                arg1 = 1;
            }
            class28.field723 = arg1;
            if (class38.field992 == 0) {
                class92.field2357 = 0;
            } else {
                int var5 = class63.method477(class38.field992, (byte) -125);
                int var6 = var5 - class80.field2090;
                class92.field2357 = (var6 + class92.field2357 + 3600 - 1) / class92.field2357;
            }
            class14.field359 = arg3;
            class54.field1368 = arg2;
            class70.field1827 = arg0;
        } else if (class28.field723 == 0) {
            class61.method465(arg0, arg2, arg3, (byte) 94);
        } else {
            class14.field359 = arg3;
            class54.field1368 = arg2;
            class70.field1827 = arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILkd;)V", line = 59)
    public final void method738(byte arg0, int arg1, class64 arg2) {
        if (arg0 < 0) {
            return;
        }
        field2387++;
        while (true) {
            int var4 = arg2.method520(-125);
            if (var4 == 0) {
                return;
            }
            this.method740(arg1, var4, -8, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V", line = 81)
    private final void method739(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field2385++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        if (var11 < var7) {
            var11 = var7;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        this.field2391 = (int) (var15 * 256.0D);
        if (this.field2391 < 0) {
            this.field2391 = 0;
        } else if (this.field2391 > 255) {
            this.field2391 = 255;
        }
        int var19 = 61 % ((arg1 - 47) / 52);
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (-var9 + var11);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var11 - var9) / (var9 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var20 = var13 / 6.0D;
        this.field2374 = (int) (var17 * 256.0D);
        if (this.field2374 < 0) {
            this.field2374 = 0;
        } else if (this.field2374 > 255) {
            this.field2374 = 255;
        }
        this.field2394 = (int) (var20 * 256.0D);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILkd;)V", line = 172)
    private final void method740(int arg0, int arg1, int arg2, class64 arg3) {
        if (arg2 != -8) {
            field2376 = null;
        }
        if (arg1 == 1) {
            this.field2366 = arg3.method503(65280);
        } else if (arg1 == 2) {
            this.field2381 = arg3.method520(-121);
        } else if (arg1 == 5) {
            this.field2384 = false;
        } else if (arg1 == 7) {
            this.field2392 = arg3.method503(65280);
        }
        field2377++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[BI[Lcc;IBI)V", line = 209)
    private static final void method741(int arg0, byte[] arg1, int arg2, class16[] arg3, int arg4, byte arg5, int arg6) {
        field2371++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg2 + var13 > 0 && arg2 + var13 < 103) {
                        arg3[var7].field388[arg6 + var12][arg2 + var13] = class30.method286(arg3[var7].field388[arg6 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        if (arg5 != -128) {
            return;
        }
        class64 var8 = new class64(arg1);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class64.method500(var8, arg6 + var10, 0, var9, (byte) 21, arg4, arg0, arg2 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V", line = 299)
    public final void method742(int arg0) {
        if (arg0 > -36) {
            field2382 = 84;
        }
        field2369++;
        if (this.field2392 != -1) {
            this.method739(this.field2392, (byte) 105);
            this.field2389 = this.field2394;
            this.field2367 = this.field2391;
            this.field2393 = this.field2374;
        }
        this.method739(this.field2366, (byte) 112);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 319)
    public static final void method743(byte arg0) {
        class103.method789((byte) 78, false);
        field2386++;
        class19.field476 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class33.field831.length; var2++) {
            if (class51.field1328[var2] != -1 && class33.field831[var2] == null) {
                class33.field831[var2] = class59.field1531.method611(0, class51.field1328[var2], 0);
                if (class33.field831[var2] == null) {
                    var1 = false;
                    class19.field476++;
                }
            }
            if (class127.field3076[var2] != -1 && class37.field971[var2] == null) {
                class37.field971[var2] = class59.field1531.method620(-7008, class127.field3076[var2], 0, class102.field2526[var2]);
                if (class37.field971[var2] == null) {
                    class19.field476++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            client.field458 = 1;
            return;
        }
        class7.field174 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class33.field831.length; var4++) {
            byte[] var57 = class37.field971[var4];
            if (var57 != null) {
                int var58 = (class23.field608[var4] & 0xFF) * 64 - class51.field1286;
                int var59 = (class23.field608[var4] >> 8) * 64 - class2.field77;
                if (class44.field1151) {
                    var58 = 10;
                    var59 = 10;
                }
                var3 &= class2.method53(var58, var57, var59, -282);
            }
        }
        if (!var3) {
            client.field458 = 2;
            return;
        }
        int var5 = -83 % ((-arg0 - 45) / 48);
        if (client.field458 != 0) {
            class88.method697(class75.field2034, 882, class112.field2741, true);
        }
        class114.method881((byte) -123);
        class90.field2306.method37();
        System.gc();
        for (int var6 = 0; var6 < 4; var6++) {
            class41.field1048[var6].method145((byte) -30);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var55 = 0; var55 < 104; var55++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    class54.field1408[var7][var55][var56] = 0;
                }
            }
        }
        class120.method917((byte) 125);
        int var8 = class33.field831.length;
        class41.method348(6291);
        class103.method789((byte) 78, true);
        if (!class44.field1151) {
            for (int var9 = 0; var9 < var8; var9++) {
                int var18 = (class23.field608[var9] >> 8) * 64 - class2.field77;
                int var19 = (class23.field608[var9] & 0xFF) * 64 - class51.field1286;
                byte[] var20 = class33.field831[var9];
                if (var20 != null) {
                    method741((class51.field1300 - 6) * 8, var20, var19, class41.field1048, (class90.field2319 - 6) * 8, (byte) -128, var18);
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                int var15 = (class23.field608[var10] >> 8) * 64 - class2.field77;
                byte[] var16 = class33.field831[var10];
                int var17 = (class23.field608[var10] & 0xFF) * 64 - class51.field1286;
                if (var16 == null && class90.field2319 < 800) {
                    class56.method432(64, 64, var15, 0, var17);
                }
            }
            class103.method789((byte) 78, true);
            for (int var11 = 0; var11 < var8; var11++) {
                byte[] var12 = class37.field971[var11];
                if (var12 != null) {
                    int var13 = (class23.field608[var11] >> 8) * 64 - class2.field77;
                    int var14 = (class23.field608[var11] & 0xFF) * 64 - class51.field1286;
                    class23.method242(-1, var14, var13, class41.field1048, var12, class90.field2306);
                }
            }
        }
        if (class44.field1151) {
            for (int var21 = 0; var21 < 4; var21++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class122.field2938[var21][var35][var36];
                        boolean var38 = false;
                        if (var37 != -1) {
                            int var39 = var37 >> 24 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 1 & 0x3;
                            int var42 = var37 >> 3 & 0x7FF;
                            int var43 = (var40 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < class23.field608.length; var44++) {
                                if (class23.field608[var44] == var43 && class33.field831[var44] != null) {
                                    class24.method253((var42 & 0x7) * 8, (var40 & 0x7) * 8, var21, var35 * 8, var36 * 8, class33.field831[var44], var41, class41.field1048, var39, (byte) 56);
                                    var38 = true;
                                    break;
                                }
                            }
                        }
                        if (!var38) {
                            class131.method1014(var36 * 8, var35 * 8, 0, var21);
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var33 = 0; var33 < 13; var33++) {
                    int var34 = class122.field2938[0][var22][var33];
                    if (var34 == -1) {
                        class56.method432(8, 8, var22 * 8, 0, var33 * 8);
                    }
                }
            }
            class103.method789((byte) 78, true);
            for (int var23 = 0; var23 < 4; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    for (int var25 = 0; var25 < 13; var25++) {
                        int var26 = class122.field2938[var23][var24][var25];
                        if (var26 != -1) {
                            int var27 = var26 >> 24 & 0x3;
                            int var28 = var26 >> 1 & 0x3;
                            int var29 = var26 >> 14 & 0x3FF;
                            int var30 = var26 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + var30 / 8;
                            for (int var32 = 0; var32 < class23.field608.length; var32++) {
                                if (class23.field608[var32] == var31 && class37.field971[var32] != null) {
                                    class90.method718(var28, class90.field2306, (var29 & 0x7) * 8, var25 * 8, (var30 & 0x7) * 8, var27, class41.field1048, (byte) -99, var23, var24 * 8, class37.field971[var32]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class103.method789((byte) 78, true);
        class114.method881((byte) -123);
        class94.method748(false, class41.field1048, class90.field2306);
        class103.method789((byte) 78, true);
        int var45 = class92.field2344;
        if (class34.field848 < var45) {
            var45 = class34.field848;
        }
        if (var45 < class34.field848 - 1) {
            int var46 = class34.field848 - 1;
        }
        if (class109.field2703) {
            class90.field2306.method27(class92.field2344);
        } else {
            class90.field2306.method27(0);
        }
        for (int var47 = 0; var47 < 104; var47++) {
            for (int var54 = 0; var54 < 104; var54++) {
                class109.method849((byte) -85, var54, var47);
            }
        }
        class115.method885(3140);
        class11.field293.method434((byte) -76);
        if (class29.field734 != null) {
            class74.field1935.method996((byte) 61, 172);
            class33.field805++;
            class74.field1935.method509((byte) -40, 1057001181);
        }
        if (!class44.field1151) {
            int var48 = (class51.field1300 + 6) / 8;
            int var49 = (class51.field1300 - 6) / 8;
            int var50 = (class90.field2319 - 6) / 8;
            int var51 = (class90.field2319 + 6) / 8;
            for (int var52 = var49 - 1; var52 <= var48 + 1; var52++) {
                for (int var53 = var50 - 1; var53 <= var51 + 1; var53++) {
                    if (var52 < var49 || var48 < var52 || var50 > var53 || var53 > var51) {
                        class59.field1531.method615((byte) -30, class59.method454(new class122[] { client.field446, class119.method914(var52, 10), class45.field1171, class119.method914(var53, 10) }, 5176));
                        class59.field1531.method615((byte) -30, class59.method454(new class122[] { class11.field313, class119.method914(var52, 10), class45.field1171, class119.method914(var53, 10) }, 5176));
                    }
                }
            }
        }
        if (class108.field2676 == -1) {
            class76.method641(30, true);
        } else {
            class76.method641(35, true);
        }
        class52.method412(58);
        class74.field1935.method996((byte) 89, 29);
        class75.method635((byte) 123);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V", line = 773)
    public static final void method744(byte arg0) {
        try {
            Graphics var1 = class54.field1411.getGraphics();
            int var2 = 29 / ((17 - arg0) / 54);
            class37.field982.method122(115, var1, 4, 4);
        } catch (Exception var3) {
            class54.field1411.repaint();
        }
        field2383++;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V", line = 828)
    public static void method745(int arg0) {
        field2368 = null;
        field2373 = null;
        field2390 = null;
        field2388 = null;
        field2380 = null;
        field2376 = null;
        if (arg0 != 8) {
            return;
        }
        field2372 = null;
        field2396 = null;
        field2375 = null;
        field2398 = null;
        field2370 = null;
    }
}
