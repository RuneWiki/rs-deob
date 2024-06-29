import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class344 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
    private int[] field5522;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field5524 = 1;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 4)
    public static final void method2425(boolean arg0, String arg1, byte arg2) {
        if (arg2 != 99) {
            method2425(true, (String) null, (byte) -67);
        }
        field5525++;
        if (!arg0) {
            try {
                class73.method499(27, "loggedout", class96.field1382.field4515);
            } catch (Throwable var8) {
            }
            try {
                class23.field353.getAppletContext().showDocument(new URL(class23.field353.getCodeBase(), arg1), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class245.field3886 && class25.field367) {
            try {
                class73.method500(new Object[] { (new URL(class23.field353.getCodeBase(), arg1)).toString() }, -25425, "openjs", class96.field1382.field4515);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class23.field353.getAppletContext().showDocument(new URL(class23.field353.getCodeBase(), arg1), "_blank");
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V", line = 55)
    public static final void method2426(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        for (class159 var2 = class300.field4955.method27(125); var2 != null; var2 = class300.field4955.method34(8)) {
            if ((long) arg0 == (var2.field2549 >> 48 & 0xFFFFL)) {
                var2.method1131(8);
            }
        }
        field5519++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V", line = 77)
    public static final void method2427(Object[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg3 > arg1) {
            int var5 = arg1;
            int var6 = (arg1 + arg3) / 2;
            long var7 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var7;
            Object var9 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var5];
                    arg2[var5] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5++] = var13;
                }
            }
            arg2[arg3] = arg2[var5];
            arg2[var5] = var7;
            arg0[arg3] = arg0[var5];
            arg0[var5] = var9;
            method2427(arg0, arg1, arg2, var5 - 1, arg4);
            method2427(arg0, var5 + 1, arg2, arg3, -2);
        }
        if (arg4 != -2) {
            method2427((Object[]) null, -102, (long[]) null, 34, -32);
        }
        field5527++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 133)
    public static final void method2428(byte arg0) {
        field5526++;
        if (class308.field5013 > 0) {
            class308.field5013--;
        }
        if (class211.field3217 > 1) {
            class282.field4631 = class12.field157;
            class211.field3217--;
        }
        if (class32.field489) {
            class32.field489 = false;
            class84.method554(100);
            return;
        }
        for (int var1 = 0; var1 < 100 && class255.method1814(38); var1++) {
        }
        if (class346.field5553 != 30) {
            return;
        }
        class204.method1390(-14, 175, class195.field2992);
        Object var2 = class251.field4011.field1068;
        synchronized (class251.field4011.field1068) {
            if (!class126.field1950) {
                class251.field4011.field1072 = 0;
            } else if (class161.field2569 != 0 || class251.field4011.field1072 >= 40) {
                class195.field2992.method250(21066, 110);
                class195.field2992.method2193(0, false);
                int var3 = 0;
                class265.field4363++;
                int var4 = class195.field2992.field5137;
                for (int var5 = 0; var5 < class251.field4011.field1072 && class195.field2992.field5137 - var4 < 240; var5++) {
                    var3++;
                    boolean var6 = false;
                    int var7 = class251.field4011.field1071[var5];
                    int var8 = class251.field4011.field1070[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class251.field4011.field1070[var5] == -1 && class251.field4011.field1071[var5] == -1) {
                        var6 = true;
                        var8 = -1;
                        var7 = -1;
                    }
                    if (class337.field5438 != var7 || class182.field2825 != var8) {
                        int var9 = var8 - class182.field2825;
                        class182.field2825 = var8;
                        int var10 = var7 - class337.field5438;
                        class337.field5438 = var7;
                        if (class191.field2963 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class195.field2992.method2206((class191.field2963 << 12) + (var10 << 6) + var9, (byte) -55);
                            class191.field2963 = 0;
                        } else if (class191.field2963 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class195.field2992.method2193(class191.field2963 + 128, false);
                            class195.field2992.method2206((var10 << 8) + var9, (byte) -40);
                            class191.field2963 = 0;
                        } else if (class191.field2963 < 32) {
                            class195.field2992.method2193(class191.field2963 + 192, false);
                            if (var6) {
                                class195.field2992.method2222(Integer.MIN_VALUE, 255);
                            } else {
                                class195.field2992.method2222(var8 << 16 | var7, 255);
                            }
                            class191.field2963 = 0;
                        } else {
                            class195.field2992.method2206(class191.field2963 + 57344, (byte) -102);
                            if (var6) {
                                class195.field2992.method2222(Integer.MIN_VALUE, 255);
                            } else {
                                class195.field2992.method2222(var8 << 16 | var7, 255);
                            }
                            class191.field2963 = 0;
                        }
                    } else if (class191.field2963 < 2047) {
                        class191.field2963++;
                    }
                }
                class195.field2992.method2240((byte) 76, class195.field2992.field5137 - var4);
                if (class251.field4011.field1072 > var3) {
                    class251.field4011.field1072 -= var3;
                    for (int var11 = 0; var11 < class251.field4011.field1072; var11++) {
                        class251.field4011.field1071[var11] = class251.field4011.field1071[var3 + var11];
                        class251.field4011.field1070[var11] = class251.field4011.field1070[var3 + var11];
                    }
                } else {
                    class251.field4011.field1072 = 0;
                }
            }
        }
        if (class161.field2569 != 0) {
            class227.field3557++;
            long var13 = (class20.field241 - class147.field2366) / 50L;
            class147.field2366 = class20.field241;
            int var15 = class69.field1074;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class241.field3777;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (class161.field2569 == 2) {
                var17 = 1;
            }
            class195.field2992.method250(21066, 194);
            int var18 = (int) var13;
            class195.field2992.method2233(var17 << 15 | var18, -29032);
            class195.field2992.method2229(var16 | var15 << 16, 17574);
        }
        if (class96.field1399 > 0) {
            class96.field1399--;
        }
        if (class58.field884 && class96.field1399 <= 0) {
            class58.field884 = false;
            class96.field1399 = 20;
            class179.field2790++;
            class195.field2992.method250(21066, 190);
            class195.field2992.method2189((int) class355.field5628, -1669644664);
            class195.field2992.method2206((int) class285.field4676, (byte) -74);
        }
        if (class23.field345 && !class159.field2544) {
            class159.field2544 = true;
            class195.field2992.method250(21066, 144);
            class195.field2992.method2193(1, false);
            class275.field4539++;
        }
        if (!class23.field345 && class159.field2544) {
            class275.field4539++;
            class159.field2544 = false;
            class195.field2992.method250(21066, 144);
            class195.field2992.method2193(0, false);
        }
        if (!class81.field1187) {
            class195.field2992.method250(21066, 88);
            class195.field2992.method2229(class355.method2477(1), 17574);
            class81.field1187 = true;
            class256.field4053++;
        }
        if (class236.field3740) {
            class236.field3740 = false;
        } else {
            class117.field1712 /= 2.0F;
        }
        if (class49.field717) {
            class49.field717 = false;
        } else {
            class41.field629 /= 2.0F;
        }
        class163.method1148((byte) 126);
        if (class346.field5553 != 30) {
            return;
        }
        class90.method595(-104);
        class206.method1403(122);
        class120.method775(-30854);
        class259.field4099++;
        if (class259.field4099 > 750) {
            class84.method554(100);
            return;
        }
        class60.method440(1);
        class70.method488(10000);
        class202.method1382(-9488);
        for (int var19 = class229.method1556(-124, true); var19 != -1; var19 = class229.method1556(-127, false)) {
            class58.method431((byte) 44, var19);
            class25.field382[class235.method1623(31, class211.field3205++)] = var19;
        }
        for (class211 var20 = class183.method1268(0); var20 != null; var20 = class183.method1268(0)) {
            int var21 = var20.method1431(18974);
            int var22 = var20.method1432(true);
            if (var21 == 1) {
                class185.field2875[var22] = var20.field3210;
                class299.field4939[class235.method1623(class201.field3095++, 31)] = var22;
            } else if (var21 == 2) {
                class314.field5182[var22] = var20.field3213;
                class83.field1201[class235.method1623(31, class138.field2178++)] = var22;
            } else if (var21 == 3) {
                class264 var43 = class94.method629(5386, var22);
                if (!var20.field3213.equals(var43.field4192)) {
                    var43.field4192 = var20.field3213;
                    class218.method1472((byte) 125, var43);
                }
            } else if (var21 == 4) {
                class264 var39 = class94.method629(5386, var22);
                int var40 = var20.field3211;
                int var41 = var20.field3210;
                int var42 = var20.field3209;
                if (var39.field4198 != var41 || var39.field4194 != var42 || var39.field4344 != var40) {
                    var39.field4344 = var40;
                    var39.field4194 = var42;
                    var39.field4198 = var41;
                    class218.method1472((byte) 121, var39);
                }
            } else if (var21 == 5) {
                class264 var38 = class94.method629(5386, var22);
                if (var20.field3210 != var38.field4296 || var20.field3210 == -1) {
                    var38.field4301 = 1;
                    var38.field4296 = var20.field3210;
                    var38.field4285 = 0;
                    var38.field4313 = 0;
                    class218.method1472((byte) 111, var38);
                }
            } else if (var21 == 6) {
                int var32 = var20.field3210;
                int var33 = var32 >> 10 & 0x1F;
                int var34 = var32 & 0x1F;
                int var35 = var32 >> 5 & 0x1F;
                class264 var36 = class94.method629(5386, var22);
                int var37 = (var33 << 19) + (var34 << 3) + (var35 << 11);
                if (var36.field4261 != var37) {
                    var36.field4261 = var37;
                    class218.method1472((byte) 98, var36);
                }
            } else if (var21 == 7) {
                class264 var23 = class94.method629(5386, var22);
                boolean var24 = var20.field3210 == 1;
                if (var24 != var23.field4181) {
                    var23.field4181 = var24;
                    class218.method1472((byte) 123, var23);
                }
            } else if (var21 == 8) {
                class264 var31 = class94.method629(5386, var22);
                if (var20.field3210 != var31.field4191 || var20.field3209 != var31.field4346 || var20.field3211 != var31.field4271) {
                    var31.field4191 = var20.field3210;
                    var31.field4346 = var20.field3209;
                    var31.field4271 = var20.field3211;
                    if (var31.field4293 != -1) {
                        if (var31.field4291 > 0) {
                            var31.field4271 = var31.field4271 * 32 / var31.field4291;
                        } else if (var31.field4188 > 0) {
                            var31.field4271 = var31.field4271 * 32 / var31.field4188;
                        }
                    }
                    class218.method1472((byte) 127, var31);
                }
            } else if (var21 == 9) {
                class264 var25 = class94.method629(5386, var22);
                if (var20.field3210 != var25.field4293 || var20.field3209 != var25.field4323) {
                    var25.field4293 = var20.field3210;
                    var25.field4323 = var20.field3209;
                    class218.method1472((byte) 97, var25);
                }
            } else if (var21 == 10) {
                class264 var30 = class94.method629(5386, var22);
                if (var20.field3210 != var30.field4248 || var20.field3209 != var30.field4327 || var20.field3211 != var30.field4297) {
                    var30.field4248 = var20.field3210;
                    var30.field4327 = var20.field3209;
                    var30.field4297 = var20.field3211;
                    class218.method1472((byte) 101, var30);
                }
            } else if (var21 == 11) {
                class264 var29 = class94.method629(5386, var22);
                var29.field4310 = var29.field4331 = var20.field3210;
                var29.field4257 = 0;
                var29.field4286 = var29.field4345 = var20.field3209;
                var29.field4270 = 0;
                class218.method1472((byte) 99, var29);
            } else if (var21 == 12) {
                class264 var26 = class94.method629(5386, var22);
                int var27 = var20.field3210;
                if (var26 != null && var26.field4350 == 0) {
                    if (var27 > (var26.field4228 - var26.field4236)) {
                        var27 = var26.field4228 - var26.field4236;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    if (var26.field4242 != var27) {
                        var26.field4242 = var27;
                        class218.method1472((byte) 127, var26);
                    }
                }
            } else if (var21 == 13) {
                class264 var28 = class94.method629(5386, var22);
                var28.field4358 = var20.field3210;
            }
        }
        if (class218.field3357 != 0) {
            class233.field3703 += 20;
            if (class233.field3703 >= 400) {
                class218.field3357 = 0;
            }
        }
        class215.field3322++;
        if (class165.field2594 != null) {
            class214.field3267++;
            if (class214.field3267 >= 15) {
                class218.method1472((byte) 115, class165.field2594);
                class165.field2594 = null;
            }
        }
        if (class185.field2876 != null) {
            class218.method1472((byte) 108, class185.field2876);
            class325.field5325++;
            if (class305.field4988 > class305.field4995 + 5 || class305.field4988 < class305.field4995 - 5 || (class248.field3924 + 5) < class130.field1982 || (class248.field3924 - 5) > class130.field1982) {
                class258.field4097 = true;
            }
            if (class197.field3032 == 0) {
                if (class258.field4097 && class325.field5325 >= 5) {
                    if (class342.field5505 == class185.field2876 && class20.field247 != class169.field2648) {
                        class81.field1183++;
                        byte var44 = 0;
                        class264 var45 = class185.field2876;
                        if (class33.field493 == 1 && var45.field4233 == 206) {
                            var44 = 1;
                        }
                        if (var45.field4330[class20.field247] <= 0) {
                            var44 = 0;
                        }
                        if (client.method898(var45).method523((byte) -122)) {
                            int var48 = class169.field2648;
                            int var49 = class20.field247;
                            var45.field4330[var49] = var45.field4330[var48];
                            var45.field4321[var49] = var45.field4321[var48];
                            var45.field4330[var48] = -1;
                            var45.field4321[var48] = 0;
                        } else if (var44 == 1) {
                            int var46 = class169.field2648;
                            int var47 = class20.field247;
                            while (var46 != var47) {
                                if (var46 > var47) {
                                    var45.method1861(var46, -1, var46 - 1);
                                    var46--;
                                } else if (var46 < var47) {
                                    var45.method1861(var46, -1, var46 + 1);
                                    var46++;
                                }
                            }
                        } else {
                            var45.method1861(class169.field2648, -1, class20.field247);
                        }
                        class195.field2992.method250(21066, 238);
                        class195.field2992.method2229(class185.field2876.field4204, 17574);
                        class195.field2992.method2196(var44, 128);
                        class195.field2992.method2189(class169.field2648, -1669644664);
                        class195.field2992.method2206(class20.field247, (byte) -69);
                    }
                } else if ((class40.field604 == 1 || class198.method1349((byte) -99, class117.field1701 - 1)) && class117.field1701 > 2) {
                    class329.method2348((byte) -124);
                } else if (class117.field1701 > 0) {
                    class285.method2015(-3);
                }
                class161.field2569 = 0;
                class185.field2876 = null;
                class214.field3267 = 10;
            }
        }
        class109.field1619 = null;
        class52.field795 = false;
        class21.field262 = 0;
        class9.field108 = false;
        class264 var50 = class261.field4110;
        class264 var51 = class295.field4899;
        class295.field4899 = null;
        class261.field4110 = null;
        while (class261.method1835((byte) 121) && class21.field262 < 128) {
            class83.field1203[class21.field262] = class181.field2815;
            class264.field4304[class21.field262] = class293.field4856;
            class21.field262++;
        }
        class6.field79 = null;
        if (class345.field5538 != -1) {
            class21.method128(class345.field5538, 0, class243.field3838, class233.field3712, 0, 80, 0, 0);
        }
        class12.field157++;
        if (class6.field79 != null) {
            class98.method646(-69);
        }
        while (true) {
            class190 var52;
            class264 var53;
            class264 var54;
            do {
                var52 = (class190) class153.field2474.method1080(-1);
                if (var52 == null) {
                    while (true) {
                        class190 var55;
                        class264 var56;
                        class264 var57;
                        do {
                            var55 = (class190) class262.field4129.method1080(-1);
                            if (var55 == null) {
                                while (true) {
                                    class190 var58;
                                    class264 var59;
                                    class264 var60;
                                    do {
                                        var58 = (class190) class268.field4420.method1080(-1);
                                        if (var58 == null) {
                                            if (class6.field79 == null) {
                                                class214.field3276 = 0;
                                            }
                                            if (class52.field788 != null) {
                                                class61.method449(18060);
                                            }
                                            if (class121.field1804 > 0 && class294.field4896[82] && class294.field4896[81] && class299.field4936 != 0) {
                                                int var61 = class120.field1779 - class299.field4936;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class51.method376(class150.field2420 + class329.field5388.field4757[0], var61, 1791677414, class329.field5388.field4762[0] + class215.field3313);
                                            }
                                            if (class121.field1804 > 0 && class294.field4896[82] && class294.field4896[81]) {
                                                if (class196.field3019 != -1) {
                                                    class51.method376(class196.field3009 + class150.field2420, class120.field1779, 1791677414, class215.field3313 + class196.field3019);
                                                }
                                                class40.field611 = 0;
                                                class28.field423 = 0;
                                            } else if (class28.field423 == 2) {
                                                if (class196.field3019 != -1) {
                                                    class195.field2992.method250(21066, 173);
                                                    class291.field4837++;
                                                    class195.field2992.method2206(class215.field3313 + class196.field3019, (byte) -99);
                                                    class195.field2992.method2206(class313.field5108, (byte) -49);
                                                    class195.field2992.method2236(-1620419064, class196.field3009 + class150.field2420);
                                                    class195.field2992.method2207(false, class345.field5530);
                                                    class233.field3703 = 0;
                                                    class218.field3357 = 1;
                                                    class269.field4431 = class69.field1074;
                                                    class105.field1526 = class241.field3777;
                                                }
                                                class28.field423 = 0;
                                            } else if (class40.field611 == 2) {
                                                if (class196.field3019 != -1) {
                                                    class195.field2992.method250(21066, 81);
                                                    class171.field2669++;
                                                    class195.field2992.method2236(-1620419064, class215.field3313 + class196.field3019);
                                                    class195.field2992.method2206(class196.field3009 + class150.field2420, (byte) -66);
                                                    class233.field3703 = 0;
                                                    class218.field3357 = 1;
                                                    class269.field4431 = class69.field1074;
                                                    class105.field1526 = class241.field3777;
                                                }
                                                class40.field611 = 0;
                                            } else if (class196.field3019 != -1 && class28.field423 == 0 && class40.field611 == 0) {
                                                class39.method318((class196.field3019 << 1) + 1 - class329.field5388.method312(-83) >> 1, (byte) -74, (class196.field3009 << 1) + 1 - class329.field5388.method312(-110) >> 1, 0);
                                                class218.field3357 = 1;
                                                class269.field4431 = class69.field1074;
                                                class105.field1526 = class241.field3777;
                                                class233.field3703 = 0;
                                            }
                                            class196.field3019 = -1;
                                            class207.method1407(false);
                                            if (class295.field4899 != var51) {
                                                if (var51 != null) {
                                                    class218.method1472((byte) 108, var51);
                                                }
                                                if (class295.field4899 != null) {
                                                    class218.method1472((byte) 116, class295.field4899);
                                                }
                                            }
                                            if (class261.field4110 != var50 && class326.field5340 == class182.field2832) {
                                                if (var50 != null) {
                                                    class218.method1472((byte) 107, var50);
                                                }
                                                if (class261.field4110 != null) {
                                                    class218.method1472((byte) 117, class261.field4110);
                                                }
                                            }
                                            if (class261.field4110 == null) {
                                                if (class326.field5340 > 0) {
                                                    class326.field5340--;
                                                }
                                            } else if (class182.field2832 > class326.field5340) {
                                                class326.field5340++;
                                                if (class326.field5340 == class182.field2832) {
                                                    class218.method1472((byte) 121, class261.field4110);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class312.field5072[var62]++;
                                            }
                                            if (arg0 >= -3) {
                                                field5523 = -125;
                                            }
                                            int var63 = class257.method1823((byte) -95);
                                            int var64 = class292.method2066(30);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class308.field5013 = 250;
                                                class34.field518++;
                                                class68.method480((byte) -97, 14500);
                                                class195.field2992.method250(21066, 127);
                                            }
                                            if (class51.field766 != null && class51.field766.field2542 == 1) {
                                                if (class51.field766.field2538 != null) {
                                                    method2425(class98.field1426, class60.field914, (byte) 99);
                                                }
                                                class98.field1426 = false;
                                                class60.field914 = null;
                                                class51.field766 = null;
                                            }
                                            class255.field4043++;
                                            class357.field5651++;
                                            if (class255.field4043 > 500) {
                                                class255.field4043 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class294.field4897 += class343.field5509;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class120.field1784 += class340.field5464;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class198.field3044 += class264.field4239;
                                                }
                                            }
                                            if (class120.field1784 < -40) {
                                                class340.field5464 = 1;
                                            }
                                            if (class120.field1784 > 40) {
                                                class340.field5464 = -1;
                                            }
                                            if (class357.field5651 > 500) {
                                                class357.field5651 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class322.field5284 += class216.field3333;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class196.field3008 += class146.field2358;
                                                }
                                            }
                                            if (class294.field4897 < -55) {
                                                class343.field5509 = 2;
                                            }
                                            if (class198.field3044 < -50) {
                                                class264.field4239 = 2;
                                            }
                                            class124.field1840++;
                                            if (class196.field3008 < -20) {
                                                class146.field2358 = 1;
                                            }
                                            if (class322.field5284 < -60) {
                                                class216.field3333 = 2;
                                            }
                                            if (class322.field5284 > 60) {
                                                class216.field3333 = -2;
                                            }
                                            if (class196.field3008 > 10) {
                                                class146.field2358 = -1;
                                            }
                                            if (class294.field4897 > 55) {
                                                class343.field5509 = -2;
                                            }
                                            if (class198.field3044 > 50) {
                                                class264.field4239 = -2;
                                            }
                                            if (class124.field1840 > 50) {
                                                class123.field1824++;
                                                class195.field2992.method250(21066, 71);
                                            }
                                            if (class253.field4016) {
                                                class189.method1310(0);
                                                class253.field4016 = false;
                                            }
                                            try {
                                                if (class346.field5545 != null && class195.field2992.field5137 > 0) {
                                                    class346.field5545.method669(0, class195.field2992.field5124, class195.field2992.field5137, (byte) -74);
                                                    class124.field1840 = 0;
                                                    class195.field2992.field5137 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class84.method554(100);
                                            }
                                            return;
                                        }
                                        var59 = var58.field2937;
                                        if (var59.field4240 < 0) {
                                            break;
                                        }
                                        var60 = class94.method629(5386, var59.field4201);
                                    } while (var60 == null || var60.field4314 == null || var59.field4240 >= var60.field4314.length || var60.field4314[var59.field4240] != var59);
                                    class201.method1372(var58, 200000);
                                }
                            }
                            var56 = var55.field2937;
                            if (var56.field4240 < 0) {
                                break;
                            }
                            var57 = class94.method629(5386, var56.field4201);
                        } while (var57 == null || var57.field4314 == null || var57.field4314.length <= var56.field4240 || var57.field4314[var56.field4240] != var56);
                        class201.method1372(var55, 200000);
                    }
                }
                var53 = var52.field2937;
                if (var53.field4240 < 0) {
                    break;
                }
                var54 = class94.method629(5386, var53.field4201);
            } while (var54 == null || var54.field4314 == null || var54.field4314.length <= var53.field4240 || var54.field4314[var53.field4240] != var53);
            class201.method1372(var52, 200000);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I", line = 1137)
    public final int method2429(int arg0, int arg1) {
        field5520++;
        int var3 = (this.field5522.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 < 68) {
            method2428((byte) 97);
        }
        while (true) {
            int var5 = this.field5522[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5522[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([I)V", line = 1165)
    public class344(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field5522 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field5522[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field5522[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field5522[var5 + var5] = arg0[var4];
            this.field5522[var5 + var5 + 1] = var4++;
        }
    }
}
