import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class99 {

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "[I")
    private int[] field2330 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "[S")
    private short[] field2341 = new short[6];

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "Z")
    public boolean field2331 = false;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    public int field2344 = -1;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "[S")
    private short[] field2345 = new short[6];

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Laf;")
    public static class7 field2324 = class48.method406(40, "Hidden)2use");

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field2327 = 0;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "J")
    public static long field2329 = 0L;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "[J")
    public static long[] field2340 = new long[200];

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!oa", name = "ob", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "[I")
    private int[] field2323;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "[Lfd;")
    public static class40[] field2336;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I")
    public static final int method799(int arg0, byte arg1) {
        field2333++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg1 >= -50) {
            method799(-4, (byte) 126);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrd;B)V")
    public final void method800(class122 arg0, byte arg1) {
        field2343++;
        while (true) {
            int var3 = arg0.method931((byte) 124);
            if (var3 == 0) {
                if (arg1 > -89) {
                    this.method804(true);
                    return;
                } else {
                    return;
                }
            }
            this.method809(72, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILaf;Lof;)Laf;")
    public static final class7 method801(int arg0, class7 arg1, class103 arg2) {
        field2328++;
        if (arg0 > -101) {
            return null;
        } else if (arg1.method72(class78.field1820, 0) == -1) {
            return arg1;
        } else {
            while (true) {
                int var3 = arg1.method72(class45.field1075, 0);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method72(class13.field338, 0);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method72(class101.field2390, 0);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method72(class54.field1326, 0);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method72(class83.field1952, 0);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method72(class44.field1060, 0);
                                                        if (var8 == -1) {
                                                            return arg1;
                                                        }
                                                        class7 var9 = class52.field1243;
                                                        if (class148.field3504 != null) {
                                                            var9 = class130.method1065(class148.field3504.field2088, -18128);
                                                            try {
                                                                if (class148.field3504.field2090 != null) {
                                                                    byte[] var10 = ((String) class148.field3504.field2090).getBytes("ISO-8859-1");
                                                                    var9 = class99.method816(var10.length, 0, false, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class116.method905(new class7[] { arg1.method77(0, 110, var8), var9, arg1.method61(-94, var8 + 4) }, 1);
                                                    }
                                                }
                                                arg1 = class116.method905(new class7[] { arg1.method77(0, 110, var7), class39.method337(class109.method866(arg2, 4, -65), 5233), arg1.method61(-96, var7 + 2) }, 1);
                                            }
                                        }
                                        arg1 = class116.method905(new class7[] { arg1.method77(0, 66, var6), class39.method337(class109.method866(arg2, 3, -88), 5233), arg1.method61(-85, var6 + 2) }, 1);
                                    }
                                }
                                arg1 = class116.method905(new class7[] { arg1.method77(0, 120, var5), class39.method337(class109.method866(arg2, 2, -80), 5233), arg1.method61(-124, var5 + 2) }, 1);
                            }
                        }
                        arg1 = class116.method905(new class7[] { arg1.method77(0, 76, var4), class39.method337(class109.method866(arg2, 1, -115), 5233), arg1.method61(-128, var4 + 2) }, 1);
                    }
                }
                arg1 = class116.method905(new class7[] { arg1.method77(0, 69, var3), class39.method337(class109.method866(arg2, 0, -123), 5233), arg1.method61(-63, var3 + 2) }, 1);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V")
    public static void method802(byte arg0) {
        field2340 = null;
        int var1 = -29 % ((-arg0 - 14) / 32);
        field2336 = null;
        field2324 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([BI[Lmd;IIII)V")
    public static final void method803(byte[] arg0, int arg1, class87[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field2326++;
        int var7 = 26 % ((arg6 + 74) / 39);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg5 + var13 > 0 && arg5 + var13 < 103 && arg4 + var14 > 0 && arg4 + var14 < 103) {
                        arg2[var8].field2047[arg5 + var13][arg4 + var14] = class84.method705(arg2[var8].field2047[arg5 + var13][arg4 + var14], -16777217);
                    }
                }
            }
        }
        class122 var9 = new class122(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    class74.method639(arg1, 0, var9, (byte) -76, var11 + arg5, arg3, arg4 + var12, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
    public final boolean method804(boolean arg0) {
        field2338++;
        if (this.field2323 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2323.length; var3++) {
            if (!client.field578.method584(this.field2323[var3], (byte) 45, 0)) {
                var2 = false;
            }
        }
        if (arg0) {
            return false;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
    public static final void method805(int arg0, boolean arg1) {
        field2332++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class45.field1084[arg0];
        int var3 = class115.field2731[arg0];
        int var4 = class147.field3473[arg0];
        int var5 = class135.field3177[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 26) {
            class141 var6 = class121.field2843[var5];
            if (var6 != null) {
                class74.field1716++;
                class57.method469(var6.field493[0], var6.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class142.field3356 = class111.field2668;
                class37.field926 = 0;
                class28.field726 = 2;
                class48.field1162 = class10.field267;
                class47.field1150.method1131(86, 2027385224);
                class47.field1150.method942(2544, var5);
            }
        }
        if (var4 == 1) {
            boolean var7 = true;
            class103 var8 = class37.method328(0, var3);
            if (var8.field2512 > 0) {
                var7 = class116.method906((byte) 66, var8);
            }
            if (var7) {
                class47.field1150.method1131(189, 2027385224);
                class123.field2936++;
                class47.field1150.method970((byte) -96, var3);
            }
        }
        if (var4 == 5) {
            class9.field228++;
            class47.field1150.method1131(92, 2027385224);
            class47.field1150.method973(128, var5);
            class47.field1150.method942(2544, var2);
            class47.field1150.method938(var3, -2097152);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 33) {
            class47.field1150.method1131(134, 2027385224);
            class47.field1150.method939(466050456, var2);
            class47.field1144++;
            class47.field1150.method938(var3, -2097152);
            class47.field1150.method973(128, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 46) {
            class141 var9 = class121.field2843[var5];
            if (var9 != null) {
                class148.field3481++;
                class57.method469(var9.field493[0], var9.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class142.field3356 = class111.field2668;
                class48.field1162 = class10.field267;
                class28.field726 = 2;
                class37.field926 = 0;
                class47.field1150.method1131(202, 2027385224);
                class47.field1150.method938(class96.field2289, -2097152);
                class47.field1150.method933((byte) 29, class21.field534);
                class47.field1150.method973(128, var5);
            }
        }
        if (var4 == 30) {
            class30.field765++;
            boolean var10 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            if (!var10) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class37.field926 = 0;
            class48.field1162 = class10.field267;
            class142.field3356 = class111.field2668;
            class28.field726 = 2;
            class47.field1150.method1131(56, 2027385224);
            class47.field1150.method973(128, var5);
            class47.field1150.method933((byte) 70, class53.field1296);
            class47.field1150.method942(2544, var3 + class32.field843);
            class47.field1150.method968(class10.field275, (byte) 107);
            class47.field1150.method939(466050456, class30.field774);
            class47.field1150.method942(2544, class153.field3585 + var2);
        }
        if (var4 == 1001) {
            class37.field926 = 0;
            class28.field726 = 2;
            class142.field3356 = class111.field2668;
            class48.field1162 = class10.field267;
            class69.field1499++;
            class47.field1150.method1131(82, 2027385224);
            class47.field1150.method933((byte) 69, var5);
        }
        if (var4 == 11) {
            class94.field2194++;
            class47.field1150.method1131(172, 2027385224);
            class47.field1150.method942(2544, var5);
            class47.field1150.method942(2544, var2);
            class47.field1150.method970((byte) -96, var3);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 43) {
            class54.method440(30077);
            class103 var12 = class37.method328(0, var3);
            class53.field1296 = var2;
            class142.field3348 = 1;
            class30.field774 = var5;
            class10.field275 = var3;
            class141.method1151(15569, var12);
            class83.field1956 = class116.method905(new class7[] { class17.field406, class64.method526(!arg1, var5).field3199, class19.field452 }, 1);
            if (class83.field1956 == null) {
                class83.field1956 = class153.field3583;
            }
            return;
        }
        if (var4 == 21) {
            class92 var13 = class18.field425[var5];
            if (var13 != null) {
                class57.method469(var13.field493[0], var13.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class142.field3356 = class111.field2668;
                class48.field1162 = class10.field267;
                class37.field926 = 0;
                class28.field726 = 2;
                class47.field1150.method1131(62, 2027385224);
                class108.field2637++;
                class47.field1150.method933((byte) 104, var5);
            }
        }
        if (var4 == 1006) {
            class48.method401(var3, var5, var2, (byte) -30);
            class47.field1150.method1131(151, 2027385224);
            class89.field2071++;
            class47.field1150.method939(466050456, class32.field843 + var3);
            class47.field1150.method973(128, var5 >> 14 & 0x7FFF);
            class47.field1150.method973(128, class153.field3585 + var2);
        }
        if (var4 == 23) {
            class141 var14 = class121.field2843[var5];
            if (var14 != null) {
                class57.method469(var14.field493[0], var14.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class48.field1162 = class10.field267;
                class28.field726 = 2;
                class21.field550++;
                class142.field3356 = class111.field2668;
                class37.field926 = 0;
                class47.field1150.method1131(184, 2027385224);
                class47.field1150.method939(466050456, var5);
            }
        }
        if (var4 == 14) {
            class111.field2685++;
            class47.field1150.method1131(63, 2027385224);
            class47.field1150.method942(2544, var2);
            class47.field1150.method968(var3, (byte) 121);
            class47.field1150.method942(2544, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 29) {
            class47.field1150.method1131(255, 2027385224);
            class10.field270++;
            class47.field1150.method973(128, class30.field774);
            class47.field1150.method973(128, var2);
            class47.field1150.method968(var3, (byte) -29);
            class47.field1150.method939(466050456, class53.field1296);
            class47.field1150.method937(class10.field275, 675597904);
            class47.field1150.method933((byte) 100, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 37) {
            class80.field1845++;
            class47.field1150.method1131(10, 2027385224);
            class47.field1150.method973(128, class21.field534);
            class47.field1150.method937(var3, 675597904);
            class47.field1150.method968(class96.field2289, (byte) -44);
            class47.field1150.method933((byte) 14, var5);
            class47.field1150.method933((byte) 112, var2);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 34) {
            class47.field1150.method1131(189, 2027385224);
            class123.field2936++;
            class47.field1150.method970((byte) -96, var3);
            class103 var15 = class37.method328(0, var3);
            if (var15.field2466 != null && var15.field2466[0][0] == 5) {
                int var16 = var15.field2466[0][1];
                class43.field1026[var16] = 1 - class43.field1026[var16];
                class19.method185(-31921, var16);
            }
        }
        if (var4 == 25) {
            class4.method26((byte) -99);
        }
        if (var4 == 45) {
            boolean var17 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            class141.field3319++;
            if (!var17) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class142.field3356 = class111.field2668;
            class37.field926 = 0;
            class48.field1162 = class10.field267;
            class28.field726 = 2;
            class47.field1150.method1131(241, 2027385224);
            class47.field1150.method973(128, var5);
            class47.field1150.method942(2544, class153.field3585 + var2);
            class47.field1150.method933((byte) 23, class32.field843 + var3);
        }
        if (var4 == 13) {
            class103 var19 = class19.method177(var3, (byte) -80, var2);
            if (var19 != null) {
                class54.method440(30077);
                class66.method528(class105.method853(class7.method98(26454, var19), 84), -5640, var2, var3);
                class142.field3348 = 0;
                class92.field2132 = class97.method792(-1, var19);
                if (class92.field2132 == null) {
                    class92.field2132 = class116.field2760;
                }
                if (!var19.field2565) {
                    class126.field3013 = class116.method905(new class7[] { class81.field1862, var19.field2475, class19.field452 }, 1);
                    return;
                }
                class126.field3013 = class116.method905(new class7[] { var19.field2541, class19.field452 }, 1);
            }
            return;
        }
        if (var4 == 35) {
            class141 var20 = class121.field2843[var5];
            if (var20 != null) {
                class130.field3085++;
                class57.method469(var20.field493[0], var20.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class28.field726 = 2;
                class48.field1162 = class10.field267;
                class142.field3356 = class111.field2668;
                class37.field926 = 0;
                class47.field1150.method1131(226, 2027385224);
                class47.field1150.method933((byte) 76, var5);
            }
        }
        if (var4 == 1007) {
            class103 var21 = class37.method328(0, var3);
            if (var21 == null || var21.field2435[var2] < 100000) {
                class69.field1499++;
                class47.field1150.method1131(82, 2027385224);
                class47.field1150.method933((byte) 35, var5);
            } else {
                class53.method432(class116.method905(new class7[] { class51.method421((byte) -86, var21.field2435[var2]), class126.field3004, class64.method526(false, var5).field3199 }, 1), 0, class52.field1243, -11);
            }
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 39) {
            class78.field1794++;
            boolean var22 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            if (!var22) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class142.field3356 = class111.field2668;
            class28.field726 = 2;
            class37.field926 = 0;
            class48.field1162 = class10.field267;
            class47.field1150.method1131(81, 2027385224);
            class47.field1150.method933((byte) 113, class153.field3585 + var2);
            class47.field1150.method933((byte) 69, class32.field843 + var3);
            class47.field1150.method942(2544, var5);
        }
        if (var4 == 19) {
            class22.field606++;
            class48.method401(var3, var5, var2, (byte) -23);
            class47.field1150.method1131(215, 2027385224);
            class47.field1150.method942(2544, class32.field843 + var3);
            class47.field1150.method933((byte) 120, var5 >> 14 & 0x7FFF);
            class47.field1150.method939(466050456, var2 + class153.field3585);
        }
        if (var4 == 2) {
            class130.field3070++;
            boolean var24 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            if (!var24) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class28.field726 = 2;
            class142.field3356 = class111.field2668;
            class37.field926 = 0;
            class48.field1162 = class10.field267;
            class47.field1150.method1131(199, 2027385224);
            class47.field1150.method973(128, var5);
            class47.field1150.method942(2544, class153.field3585 + var2);
            class47.field1150.method973(128, var3 + class32.field843);
        }
        if (var4 == 18) {
            class47.field1150.method1131(52, 2027385224);
            class47.field1150.method939(466050456, var2);
            class73.field1668++;
            class47.field1150.method937(var3, 675597904);
            class47.field1150.method933((byte) 53, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 28) {
            class47.field1150.method1131(24, 2027385224);
            class47.field1150.method942(2544, var5);
            class47.field1150.method942(2544, var2);
            class47.field1150.method937(var3, 675597904);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class102.field2415++;
            class95.field2258 = var2;
        }
        if (var4 == 44) {
            class141 var26 = class121.field2843[var5];
            if (var26 != null) {
                class50.field1190++;
                class57.method469(var26.field493[0], var26.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class37.field926 = 0;
                class142.field3356 = class111.field2668;
                class48.field1162 = class10.field267;
                class28.field726 = 2;
                class47.field1150.method1131(11, 2027385224);
                class47.field1150.method942(2544, class53.field1296);
                class47.field1150.method933((byte) 101, var5);
                class47.field1150.method933((byte) 14, class30.field774);
                class47.field1150.method968(class10.field275, (byte) 121);
            }
        }
        if (var4 == 15) {
            class137.field3265++;
            class47.field1150.method1131(237, 2027385224);
            class47.field1150.method937(var3, 675597904);
            class47.field1150.method942(2544, var2);
            class47.field1150.method933((byte) 46, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 1002) {
            class142.field3356 = class111.field2668;
            class55.field1337++;
            class28.field726 = 2;
            class37.field926 = 0;
            class48.field1162 = class10.field267;
            class47.field1150.method1131(6, 2027385224);
            class47.field1150.method973(128, var5 >> 14 & 0x7FFF);
        }
        if (!arg1) {
            return;
        }
        if (var4 == 4) {
            class80.field1857++;
            class47.field1150.method1131(65, 2027385224);
            class47.field1150.method942(2544, var2);
            class47.field1150.method938(var3, -2097152);
            class47.field1150.method942(2544, class21.field534);
            class47.field1150.method937(class96.field2289, 675597904);
        }
        if (var4 == 12 && class48.method401(var3, var5, var2, (byte) -102)) {
            class103.field2472++;
            class47.field1150.method1131(175, 2027385224);
            class47.field1150.method939(466050456, var5 >> 14 & 0x7FFF);
            class47.field1150.method939(466050456, class32.field843 + var3);
            class47.field1150.method939(466050456, class30.field774);
            class47.field1150.method937(class10.field275, 675597904);
            class47.field1150.method939(466050456, class153.field3585 + var2);
            class47.field1150.method933((byte) 24, class53.field1296);
        }
        if (var4 == 41) {
            class72.field1611++;
            boolean var27 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            if (!var27) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class48.field1162 = class10.field267;
            class142.field3356 = class111.field2668;
            class37.field926 = 0;
            class28.field726 = 2;
            class47.field1150.method1131(207, 2027385224);
            class47.field1150.method939(466050456, class32.field843 + var3);
            class47.field1150.method973(128, var5);
            class47.field1150.method933((byte) 55, class153.field3585 + var2);
        }
        if (var4 == 57 && class48.method401(var3, var5, var2, (byte) -122)) {
            class148.field3482++;
            class47.field1150.method1131(179, 2027385224);
            class47.field1150.method942(2544, var5 >> 14 & 0x7FFF);
            class47.field1150.method942(2544, class32.field843 + var3);
            class47.field1150.method937(class96.field2289, 675597904);
            class47.field1150.method973(128, class21.field534);
            class47.field1150.method973(128, class153.field3585 + var2);
        }
        if (var4 == 38) {
            class47.field1151.method1015(class8.field186, var2, var3);
        }
        if (var4 == 31) {
            class92 var29 = class18.field425[var5];
            if (var29 != null) {
                class57.method469(var29.field493[0], var29.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class127.field3038++;
                class37.field926 = 0;
                class48.field1162 = class10.field267;
                class142.field3356 = class111.field2668;
                class28.field726 = 2;
                class47.field1150.method1131(170, 2027385224);
                class47.field1150.method939(466050456, var5);
            }
        }
        if (var4 == 58) {
            class47.field1150.method1131(176, 2027385224);
            class101.field2391++;
            class47.field1150.method933((byte) 75, var2);
            class47.field1150.method973(128, var5);
            class47.field1150.method938(var3, -2097152);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 6) {
            class52.field1266++;
            class48.method401(var3, var5, var2, (byte) -86);
            class47.field1150.method1131(138, 2027385224);
            class47.field1150.method939(466050456, class153.field3585 + var2);
            class47.field1150.method942(2544, var5 >> 14 & 0x7FFF);
            class47.field1150.method939(466050456, class32.field843 + var3);
        }
        if (var4 == 49) {
            class9.field234++;
            boolean var30 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            if (!var30) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class142.field3356 = class111.field2668;
            class48.field1162 = class10.field267;
            class28.field726 = 2;
            class37.field926 = 0;
            class47.field1150.method1131(240, 2027385224);
            class47.field1150.method938(class96.field2289, -2097152);
            class47.field1150.method942(2544, class21.field534);
            class47.field1150.method942(2544, class153.field3585 + var2);
            class47.field1150.method973(128, var5);
            class47.field1150.method933((byte) 24, class32.field843 + var3);
        }
        if (var4 == 7 || var4 == 1004) {
            class86.method709(var3, 236, var2, var5, class84.field1977[arg0]);
        }
        if (var4 == 42) {
            class92 var32 = class18.field425[var5];
            if (var32 != null) {
                class57.method469(var32.field493[0], var32.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class48.field1162 = class10.field267;
                class37.field926 = 0;
                class28.field726 = 2;
                class139.field3289++;
                class142.field3356 = class111.field2668;
                class47.field1150.method1131(234, 2027385224);
                class47.field1150.method939(466050456, var5);
                class47.field1150.method942(2544, class21.field534);
                class47.field1150.method937(class96.field2289, 675597904);
            }
        }
        if (var4 == 47) {
            class48.method401(var3, var5, var2, (byte) -59);
            class12.field297++;
            class47.field1150.method1131(152, 2027385224);
            class47.field1150.method939(466050456, class32.field843 + var3);
            class47.field1150.method942(2544, var5 >> 14 & 0x7FFF);
            class47.field1150.method942(2544, var2 + class153.field3585);
        }
        if (var4 == 8) {
            class92 var33 = class18.field425[var5];
            if (var33 != null) {
                class57.method469(var33.field493[0], var33.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class48.field1162 = class10.field267;
                class37.field926 = 0;
                class28.field726 = 2;
                class27.field725++;
                class142.field3356 = class111.field2668;
                class47.field1150.method1131(84, 2027385224);
                class47.field1150.method933((byte) 63, var5);
            }
        }
        if (var4 == 9) {
            class48.method401(var3, var5, var2, (byte) -25);
            class153.field3568++;
            class47.field1150.method1131(36, 2027385224);
            class47.field1150.method933((byte) 65, var3 + class32.field843);
            class47.field1150.method939(466050456, var5 >> 14 & 0x7FFF);
            class47.field1150.method939(466050456, var2 + class153.field3585);
        }
        if (var4 == 32) {
            class141 var34 = class121.field2843[var5];
            if (var34 != null) {
                class45.field1069++;
                class57.method469(var34.field493[0], var34.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class28.field726 = 2;
                class37.field926 = 0;
                class48.field1162 = class10.field267;
                class142.field3356 = class111.field2668;
                class47.field1150.method1131(198, 2027385224);
                class47.field1150.method933((byte) 19, var5);
            }
        }
        if (var4 == 16) {
            class92 var35 = class18.field425[var5];
            if (var35 != null) {
                class32.field844++;
                class57.method469(var35.field493[0], var35.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class48.field1162 = class10.field267;
                class28.field726 = 2;
                class37.field926 = 0;
                class142.field3356 = class111.field2668;
                class47.field1150.method1131(43, 2027385224);
                class47.field1150.method933((byte) 15, class30.field774);
                class47.field1150.method933((byte) 29, class53.field1296);
                class47.field1150.method973(128, var5);
                class47.field1150.method968(class10.field275, (byte) 115);
            }
        }
        if (var4 == 24) {
            class141 var36 = class121.field2843[var5];
            if (var36 != null) {
                class80.field1860++;
                class57.method469(var36.field493[0], var36.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class142.field3356 = class111.field2668;
                class48.field1162 = class10.field267;
                class37.field926 = 0;
                class28.field726 = 2;
                class47.field1150.method1131(220, 2027385224);
                class47.field1150.method933((byte) 81, var5);
            }
        }
        if (var4 == 20) {
            class74.field1723++;
            class47.field1150.method1131(69, 2027385224);
            class47.field1150.method939(466050456, var2);
            class47.field1150.method970((byte) -96, var3);
            class47.field1150.method939(466050456, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 3) {
            class92 var37 = class18.field425[var5];
            if (var37 != null) {
                class80.field1850++;
                class57.method469(var37.field493[0], var37.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class28.field726 = 2;
                class142.field3356 = class111.field2668;
                class48.field1162 = class10.field267;
                class37.field926 = 0;
                class47.field1150.method1131(9, 2027385224);
                class47.field1150.method942(2544, var5);
            }
        }
        if (var4 == 22) {
            class47.field1150.method1131(112, 2027385224);
            class143.field3381++;
            class47.field1150.method939(466050456, var2);
            class47.field1150.method938(var3, -2097152);
            class47.field1150.method942(2544, var5);
            class120.field2836 = 0;
            class6.field118 = class37.method328(0, var3);
            class95.field2258 = var2;
        }
        if (var4 == 10) {
            class39.field976++;
            boolean var38 = class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 0, 0, false, 2, 0, class21.field531.field509[0]);
            if (!var38) {
                class57.method469(var2, var3, 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
            }
            class28.field726 = 2;
            class48.field1162 = class10.field267;
            class142.field3356 = class111.field2668;
            class37.field926 = 0;
            class47.field1150.method1131(131, 2027385224);
            class47.field1150.method942(2544, var5);
            class47.field1150.method942(2544, class32.field843 + var3);
            class47.field1150.method973(128, class153.field3585 + var2);
        }
        if (var4 == 17) {
            class92 var40 = class18.field425[var5];
            if (var40 != null) {
                class51.field1220++;
                class57.method469(var40.field493[0], var40.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                class37.field926 = 0;
                class28.field726 = 2;
                class142.field3356 = class111.field2668;
                class48.field1162 = class10.field267;
                class47.field1150.method1131(200, 2027385224);
                class47.field1150.method939(466050456, var5);
            }
        }
        if (var4 == 48 && class12.field317 == null) {
            class102.method835(var2, false, var3);
            class12.field317 = class19.method177(var3, (byte) -80, var2);
            class141.method1151(15569, class12.field317);
        }
        if (var4 == 40) {
            class123.field2936++;
            class47.field1150.method1131(189, 2027385224);
            class47.field1150.method970((byte) -96, var3);
            class103 var41 = class37.method328(0, var3);
            if (var41.field2466 != null && var41.field2466[0][0] == 5) {
                int var42 = var41.field2466[0][1];
                if (class43.field1026[var42] != var41.field2460[0]) {
                    class43.field1026[var42] = var41.field2460[0];
                    class19.method185(-31921, var42);
                }
            }
        }
        if (var4 == 1005) {
            class28.field726 = 2;
            class142.field3356 = class111.field2668;
            class37.field926 = 0;
            class48.field1162 = class10.field267;
            class141 var43 = class121.field2843[var5];
            if (var43 != null) {
                class95 var44 = var43.field3323;
                if (var44.field2213 != null) {
                    var44 = var44.method775(30856);
                }
                if (var44 != null) {
                    class130.field3081++;
                    class47.field1150.method1131(72, 2027385224);
                    class47.field1150.method973(128, var44.field2239);
                }
            }
        }
        if (class142.field3348 != 0) {
            class142.field3348 = 0;
            class141.method1151(15569, class37.method328(0, class10.field275));
        }
        if (class50.field1206) {
            class54.method440(30077);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)Z")
    public final boolean method806(byte arg0) {
        field2334++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2330[var3] != -1 && !client.field578.method584(this.field2330[var3], (byte) -81, 0)) {
                var2 = false;
            }
        }
        int var4 = 85 % ((8 - arg0) / 62);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(B)Lc;")
    public final class15 method807(byte arg0) {
        field2339++;
        if (this.field2323 == null) {
            return null;
        }
        class15[] var2 = new class15[this.field2323.length];
        int var3 = 0;
        if (arg0 > -55) {
            field2325 = 2;
        }
        while (var3 < this.field2323.length) {
            var2[var3] = class15.method152(client.field578, this.field2323[var3], 0);
            var3++;
        }
        class15 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class15(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2341[var5] != 0; var5++) {
            var4.method142(this.field2341[var5], this.field2345[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lc;")
    public final class15 method808(int arg0) {
        if (arg0 > -24) {
            return null;
        }
        field2337++;
        class15[] var2 = new class15[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2330[var4] != -1) {
                var2[var3++] = class15.method152(client.field578, this.field2330[var4], 0);
            }
        }
        class15 var5 = new class15(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2341[var6] != 0; var6++) {
            var5.method142(this.field2341[var6], this.field2345[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILrd;)V")
    private final void method809(int arg0, int arg1, class122 arg2) {
        if (arg1 == 1) {
            this.field2344 = arg2.method931((byte) 124);
        } else if (arg1 == 2) {
            int var4 = arg2.method931((byte) 124);
            this.field2323 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2323[var5] = arg2.method965(false);
            }
        } else if (arg1 == 3) {
            this.field2331 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2341[arg1 - 40] = (short) arg2.method965(false);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2345[arg1 - 50] = (short) arg2.method965(false);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2330[arg1 - 60] = arg2.method965(false);
        }
        field2335++;
        if (arg0 != 72) {
            field2327 = 112;
        }
    }
}
