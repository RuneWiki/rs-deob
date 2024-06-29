import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class135 extends class23 {

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field2508 = -1;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "[I")
    public static int[] field2510 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "Li;")
    public static class88 field2520 = class208.method1425(105, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    private int field2507;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "Lq;")
    public static class174 field2516;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "[I")
    public static int[] field2512;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "[[[I")
    public static int[][][] field2513;

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class135() {
        this(0);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
    private class135(int arg0) {
        super(0, false);
        this.method901(arg0, (byte) -88);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public static void method898(byte arg0) {
        field2510 = null;
        field2520 = null;
        field2512 = null;
        if (arg0 != -1) {
            method902(12, 76L);
        }
        field2513 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lcg;IIIIII)Lcg;")
    public static final class30 method899(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2506;
        long var7 = (long) arg4;
        class30 var9 = (class30) class108.field1958.method135(-108, var7);
        if (var9 == null) {
            class82 var10 = class82.method568(class233.field4367, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method546(64, 768, -50, -10, -50);
            class108.field1958.method130(37, var7, var9);
        }
        int var11 = arg0.method194();
        int var12 = arg0.method196();
        int var13 = arg0.method186();
        int var14 = arg0.method198();
        class30 var15 = var9.method185(true, true);
        if (~arg5 != -1) {
            var15.method188(arg5);
        }
        class125 var16 = (class125) var15;
        if (~arg6 != ~class239.method1586(arg3 + var11, arg2 + var13, arg1 + 21512, class149.field2909) || ~class239.method1586(arg3 + var12, arg2 + var14, 2, class149.field2909) != ~arg6) {
            for (int var17 = 0; var16.field2273 > var17; ++var17) {
                var16.field2288[var17] += class239.method1586(var16.field2266[var17] + arg3, var16.field2289[var17] - -arg2, 2, class149.field2909) - arg6;
            }
            var16.field2260 = false;
        }
        if (arg1 != -21510) {
            field2508 = -30;
        }
        return var15;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lnb;I)V")
    public static final void method900(class144 arg0, int arg1) {
        class31.field506 = arg0;
        if (arg1 == 28809) {
            ++field2511;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(IB)V")
    private final void method901(int arg0, byte arg1) {
        if (arg1 == -88) {
            ++field2521;
            this.field2524 = 4080 & arg0 >> 4;
            this.field2522 = (255 & arg0) << 4;
            this.field2507 = arg0 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)V")
    private static final void method902(int arg0, long arg1) {
        if (arg0 <= 53) {
            field2512 = null;
        }
        ++field2523;
        if (~arg1 != -1L) {
            ++class210.field3988;
            class146.field2749.method30((byte) -82, 58);
            class146.field2749.method328(arg1, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLi;)Z")
    public static final boolean method903(byte arg0, class88 arg1) {
        ++field2518;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class146.field2731; ++var2) {
                if (arg1.method624(class23.field370[var2], (byte) 114)) {
                    return true;
                }
            }
            if (arg0 >= -36) {
                field2514 = -46;
            }
            return arg1.method624(class240.field4458.field766, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLde;I)V")
    public static final void method904(byte arg0, class39 arg1, int arg2) {
        Object[] var3 = arg1.field681;
        ++field2517;
        int var4 = (Integer) var3[0];
        class247 var5 = class59.method427(var4, 0);
        if (var5 != null) {
            int var6 = 0;
            if (arg0 <= 106) {
                method899((class30) null, 23, -19, 119, 29, 41, 84);
            }
            int var7 = 0;
            class230.field4320 = 0;
            int var8 = -1;
            int[] var9 = var5.field4523;
            byte var10 = -1;
            int[] var11 = var5.field4521;
            try {
                class242.field4479 = new int[var5.field4528];
                class153.field2965 = new class88[var5.field4519];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; ~var14 > ~var3.length; ++var14) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg1.field694;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg1.field691;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg1.field678 == null ? -1 : arg1.field678.field3425;
                        }
                        if (~var15 == 2147483643) {
                            var15 = arg1.field679;
                        }
                        if (~var15 == 2147483642) {
                            var15 = arg1.field678 != null ? arg1.field678.field3408 : -1;
                        }
                        if (~var15 == 2147483641) {
                            var15 = arg1.field676 == null ? -1 : arg1.field676.field3425;
                        }
                        if (~var15 == 2147483640) {
                            var15 = arg1.field676 != null ? arg1.field676.field3408 : -1;
                        }
                        if (~var15 == 2147483639) {
                            var15 = arg1.field682;
                        }
                        if (~var15 == 2147483638) {
                            var15 = arg1.field692;
                        }
                        class242.field4479[var13++] = var15;
                    } else if (var3[var14] instanceof class88) {
                        class88 var16 = (class88) var3[var14];
                        if (var16.method597(-112, class194.field3709)) {
                            var16 = arg1.field677;
                        }
                        class153.field2965[var12++] = var16;
                    }
                }
                int var17 = 0;
                label2553: while (true) {
                    ++var17;
                    if (~arg2 > ~var17) {
                        throw new RuntimeException("slow");
                    }
                    ++var8;
                    int var383 = var11[var8];
                    if (var383 < 100) {
                        if (var383 == 0) {
                            class108.field1946[var6++] = var9[var8];
                            continue;
                        }
                        if (var383 == 1) {
                            int var18 = var9[var8];
                            class108.field1946[var6++] = class113.field2052[var18];
                            continue;
                        }
                        if (var383 == 2) {
                            int var19 = var9[var8];
                            --var6;
                            class113.field2052[var19] = class108.field1946[var6];
                            continue;
                        }
                        if (~var383 == -4) {
                            class171.field3332[var7++] = var5.field4524[var8];
                            continue;
                        }
                        if (~var383 == -7) {
                            var8 += var9[var8];
                            continue;
                        }
                        if (~var383 == -8) {
                            var6 -= 2;
                            if (class108.field1946[var6 - -1] != class108.field1946[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var383 == -9) {
                            var6 -= 2;
                            if (class108.field1946[var6 + 1] == class108.field1946[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var383 == -10) {
                            var6 -= 2;
                            if (class108.field1946[var6 + 1] > class108.field1946[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var383 == -11) {
                            var6 -= 2;
                            if (~class108.field1946[var6] < ~class108.field1946[var6 + 1]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var383 == -22) {
                            if (~class230.field4320 == -1) {
                                return;
                            }
                            class141 var20 = class80.field1446[--class230.field4320];
                            class153.field2965 = var20.field2606;
                            class242.field4479 = var20.field2601;
                            var5 = var20.field2607;
                            var8 = var20.field2605;
                            var9 = var5.field4523;
                            var11 = var5.field4521;
                            continue;
                        }
                        if (~var383 == -26) {
                            int var21 = var9[var8];
                            class108.field1946[var6++] = class142.method932(-17611, var21);
                            continue;
                        }
                        if (var383 == 27) {
                            int var22 = var9[var8];
                            --var6;
                            class109.method757(var22, class108.field1946[var6], 68);
                            continue;
                        }
                        if (var383 == 31) {
                            var6 -= 2;
                            if (class108.field1946[var6 + 1] >= class108.field1946[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var383 == -33) {
                            var6 -= 2;
                            if (class108.field1946[var6] >= class108.field1946[var6 + 1]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var383 == -34) {
                            class108.field1946[var6++] = class242.field4479[var9[var8]];
                            continue;
                        }
                        int var10001;
                        if (var383 == 34) {
                            var10001 = var9[var8];
                            --var6;
                            class242.field4479[var10001] = class108.field1946[var6];
                            continue;
                        }
                        if (~var383 == -36) {
                            class171.field3332[var7++] = class153.field2965[var9[var8]];
                            continue;
                        }
                        if (~var383 == -37) {
                            var10001 = var9[var8];
                            --var7;
                            class153.field2965[var10001] = class171.field3332[var7];
                            continue;
                        }
                        if (~var383 == -38) {
                            int var23 = var9[var8];
                            var7 -= var23;
                            class88 var24 = class165.method1135(var23, class171.field3332, -49, var7);
                            class171.field3332[var7++] = var24;
                            continue;
                        }
                        if (var383 == 38) {
                            --var6;
                            continue;
                        }
                        if (var383 == 39) {
                            --var7;
                            continue;
                        }
                        if (var383 == 40) {
                            int var25 = var9[var8];
                            class247 var26 = class59.method427(var25, 0);
                            class88[] var27 = new class88[var26.field4519];
                            int[] var28 = new int[var26.field4528];
                            for (int var29 = 0; ~var29 > ~var26.field4522; ++var29) {
                                var28[var29] = class108.field1946[-var26.field4522 + var29 + var6];
                            }
                            for (int var30 = 0; var30 < var26.field4520; ++var30) {
                                var27[var30] = class171.field3332[-var26.field4520 + var7 + var30];
                            }
                            var6 -= var26.field4522;
                            var7 -= var26.field4520;
                            class141 var31 = new class141();
                            var31.field2607 = var5;
                            var31.field2606 = class153.field2965;
                            var31.field2605 = var8;
                            var31.field2601 = class242.field4479;
                            if (class230.field4320 >= class80.field1446.length) {
                                throw new RuntimeException();
                            }
                            var5 = var26;
                            var8 = -1;
                            class80.field1446[class230.field4320++] = var31;
                            var11 = var26.field4521;
                            class242.field4479 = var28;
                            var9 = var26.field4523;
                            class153.field2965 = var27;
                            continue;
                        }
                        if (var383 == 42) {
                            class108.field1946[var6++] = class119.field2169[var9[var8]];
                            continue;
                        }
                        if (var383 == 43) {
                            var10001 = var9[var8];
                            --var6;
                            class119.field2169[var10001] = class108.field1946[var6];
                            continue;
                        }
                        if (~var383 == -45) {
                            int var32 = var9[var8] >> 16;
                            --var6;
                            int var33 = class108.field1946[var6];
                            int var34 = 65535 & var9[var8];
                            if (var33 >= 0 && var33 <= 5000) {
                                class95.field1763[var32] = var33;
                                byte var35 = -1;
                                if (var34 == 105) {
                                    var35 = 0;
                                }
                                int var36 = 0;
                                while (true) {
                                    if (var36 >= var33) {
                                        continue label2553;
                                    }
                                    class16.field247[var32][var36] = var35;
                                    ++var36;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var383 == 45) {
                            int var37 = var9[var8];
                            --var6;
                            int var38 = class108.field1946[var6];
                            if (var38 >= 0 && class95.field1763[var37] > var38) {
                                class108.field1946[var6++] = class16.field247[var37][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var383 == 46) {
                            var6 -= 2;
                            int var39 = class108.field1946[var6];
                            int var40 = var9[var8];
                            if (var39 >= 0 && ~var39 > ~class95.field1763[var40]) {
                                class16.field247[var40][var39] = class108.field1946[var6 - -1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var383 == -48) {
                            class88 var41 = class7.field114[var9[var8]];
                            if (var41 == null) {
                                var41 = class14.field207;
                            }
                            class171.field3332[var7++] = var41;
                            continue;
                        }
                        if (~var383 == -49) {
                            var10001 = var9[var8];
                            --var7;
                            class7.field114[var10001] = class171.field3332[var7];
                            continue;
                        }
                        if (~var383 == -52) {
                            class154 var42 = var5.field4516[var9[var8]];
                            --var6;
                            class192 var43 = (class192) var42.method1051(-1, (long) class108.field1946[var6]);
                            if (var43 != null) {
                                var8 += var43.field3700;
                            }
                            continue;
                        }
                    }
                    boolean var44;
                    if (~var9[var8] != -2) {
                        var44 = false;
                    } else {
                        var44 = true;
                    }
                    if (~var383 > -301) {
                        if (var383 == 100) {
                            var6 -= 3;
                            int var45 = class108.field1946[var6];
                            int var46 = class108.field1946[var6 + 1];
                            int var47 = class108.field1946[var6 + 2];
                            if (var46 == 0) {
                                throw new RuntimeException();
                            }
                            class174 var48 = class239.method1581(-64, var45);
                            if (var48.field3467 == null) {
                                var48.field3467 = new class174[var47 + 1];
                            }
                            if (var47 >= var48.field3467.length) {
                                class174[] var49 = new class174[var47 + 1];
                                for (int var50 = 0; var48.field3467.length > var50; ++var50) {
                                    var49[var50] = var48.field3467[var50];
                                }
                                var48.field3467 = var49;
                            }
                            if (~var47 < -1 && var48.field3467[var47 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var47 + -1));
                            }
                            class174 var51 = new class174();
                            var51.field3412 = true;
                            var51.field3408 = var47;
                            var51.field3392 = var46;
                            var51.field3506 = var51.field3425 = var48.field3425;
                            var48.field3467[var47] = var51;
                            if (var44) {
                                class203.field3873 = var51;
                            } else {
                                class129.field2428 = var51;
                            }
                            class200.method1373(65280, var48);
                            continue;
                        }
                        if (~var383 == -102) {
                            class174 var52 = !var44 ? class129.field2428 : class203.field3873;
                            if (var52.field3408 == -1) {
                                if (var44) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class174 var53 = class239.method1581(-64, var52.field3425);
                            var53.field3467[var52.field3408] = null;
                            class200.method1373(65280, var53);
                            continue;
                        }
                        if (var383 == 102) {
                            --var6;
                            class174 var54 = class239.method1581(-64, class108.field1946[var6]);
                            var54.field3467 = null;
                            class200.method1373(65280, var54);
                            continue;
                        }
                        if (var383 == 200) {
                            var6 -= 2;
                            int var55 = class108.field1946[var6 + 1];
                            int var56 = class108.field1946[var6];
                            class174 var57 = class36.method238(var55, var56, true);
                            if (var57 != null && ~var55 != 0) {
                                class108.field1946[var6++] = 1;
                                if (!var44) {
                                    class129.field2428 = var57;
                                } else {
                                    class203.field3873 = var57;
                                }
                                continue;
                            }
                            class108.field1946[var6++] = 0;
                            continue;
                        }
                        if (var383 == 201) {
                            --var6;
                            int var58 = class108.field1946[var6];
                            class174 var59 = class239.method1581(-64, var58);
                            if (var59 == null) {
                                class108.field1946[var6++] = 0;
                            } else {
                                class108.field1946[var6++] = 1;
                                if (var44) {
                                    class203.field3873 = var59;
                                } else {
                                    class129.field2428 = var59;
                                }
                            }
                            continue;
                        }
                    } else if (~var383 <= -501) {
                        if ((var383 < 1000 || ~var383 <= -1101) && (var383 < 2000 || ~var383 <= -2101)) {
                            if ((~var383 > -1101 || ~var383 <= -1201) && (~var383 > -2101 || ~var383 <= -2201)) {
                                if (var383 >= 1200 && var383 < 1300 || ~var383 <= -2201 && ~var383 > -2301) {
                                    class174 var60;
                                    if (var383 >= 2000) {
                                        var383 -= 1000;
                                        --var6;
                                        var60 = class239.method1581(-64, class108.field1946[var6]);
                                    } else {
                                        var60 = var44 ? class203.field3873 : class129.field2428;
                                    }
                                    class200.method1373(65280, var60);
                                    if (var383 == 1200 || ~var383 == -1206) {
                                        var6 -= 2;
                                        int var61 = class108.field1946[var6 + 1];
                                        int var62 = class108.field1946[var6];
                                        if (~var62 == 0) {
                                            var60.field3401 = -1;
                                            var60.field3411 = -1;
                                            var60.field3432 = 1;
                                        } else {
                                            var60.field3401 = var62;
                                            var60.field3484 = var61;
                                            class149 var63 = class71.method472(var62, (byte) -122);
                                            var60.field3367 = var63.field2878;
                                            var60.field3511 = var63.field2874;
                                            var60.field3500 = var63.field2872;
                                            if (~var383 == -1206) {
                                                var60.field3466 = false;
                                            } else {
                                                var60.field3466 = true;
                                            }
                                            var60.field3457 = var63.field2875;
                                            var60.field3519 = var63.field2849;
                                            var60.field3487 = var63.field2891;
                                            if (var60.field3470 > 0) {
                                                var60.field3487 = var60.field3487 * 32 / var60.field3470;
                                            } else if (~var60.field3503 < -1) {
                                                var60.field3487 = var60.field3487 * 32 / var60.field3503;
                                            }
                                        }
                                        continue;
                                    }
                                    if (~var383 == -1202) {
                                        var60.field3432 = 2;
                                        --var6;
                                        var60.field3411 = class108.field1946[var6];
                                        continue;
                                    }
                                    if (var383 == 1202) {
                                        var60.field3432 = 3;
                                        var60.field3411 = class240.field4458.field768.method1429(108);
                                        continue;
                                    }
                                    if (var383 == 1203) {
                                        var60.field3432 = 6;
                                        --var6;
                                        var60.field3411 = class108.field1946[var6];
                                        continue;
                                    }
                                    if (var383 == 1204) {
                                        var60.field3432 = 5;
                                        --var6;
                                        var60.field3411 = class108.field1946[var6];
                                        continue;
                                    }
                                } else if ((~var383 > -1301 || var383 >= 1400) && (~var383 > -2301 || var383 >= 2400)) {
                                    if (var383 >= 1400 && var383 < 1500 || ~var383 <= -2401 && ~var383 > -2501) {
                                        int[] var64 = null;
                                        class174 var65;
                                        if (~var383 > -2001) {
                                            var65 = !var44 ? class129.field2428 : class203.field3873;
                                        } else {
                                            --var6;
                                            var65 = class239.method1581(-64, class108.field1946[var6]);
                                            var383 -= 1000;
                                        }
                                        --var7;
                                        class88 var66 = class171.field3332[var7];
                                        if (var66.method604((byte) -53) > 0 && ~var66.method599(255, -1 + var66.method604((byte) -53)) == -90) {
                                            --var6;
                                            int var67 = class108.field1946[var6];
                                            if (~var67 < -1) {
                                                var64 = new int[var67];
                                                while (~(var67--) < -1) {
                                                    --var6;
                                                    var64[var67] = class108.field1946[var6];
                                                }
                                            }
                                            var66 = var66.method623(0, (byte) -107, -1 + var66.method604((byte) -53));
                                        }
                                        Object[] var68 = new Object[var66.method604((byte) -53) - -1];
                                        for (int var69 = var68.length - 1; var69 >= 1; --var69) {
                                            if (var66.method599(255, var69 + -1) == 115) {
                                                --var7;
                                                var68[var69] = class171.field3332[var7];
                                            } else {
                                                --var6;
                                                var68[var69] = new Integer(class108.field1946[var6]);
                                            }
                                        }
                                        --var6;
                                        int var70 = class108.field1946[var6];
                                        if (var70 != -1) {
                                            var68[0] = new Integer(var70);
                                        } else {
                                            var68 = null;
                                        }
                                        if (~var383 == -1418) {
                                            var65.field3473 = var68;
                                        }
                                        if (var383 == 1403) {
                                            var65.field3372 = var68;
                                        }
                                        if (var383 == 1421) {
                                            var65.field3383 = var68;
                                        }
                                        if (var383 == 1407) {
                                            var65.field3483 = var68;
                                            var65.field3452 = var64;
                                        }
                                        if (var383 == 1408) {
                                            var65.field3460 = var68;
                                        }
                                        if (~var383 == -1413) {
                                            var65.field3512 = var68;
                                        }
                                        if (~var383 == -1419) {
                                            var65.field3520 = var68;
                                        }
                                        if (var383 == 1405) {
                                            var65.field3458 = var68;
                                        }
                                        if (var383 == 1402) {
                                            var65.field3410 = var68;
                                        }
                                        if (~var383 == -1421) {
                                            var65.field3486 = var68;
                                        }
                                        if (~var383 == -1401) {
                                            var65.field3492 = var68;
                                        }
                                        if (~var383 == -1426) {
                                            var65.field3507 = var68;
                                        }
                                        if (~var383 == -1405) {
                                            var65.field3450 = var68;
                                        }
                                        if (var383 == 1427) {
                                            var65.field3428 = var68;
                                        }
                                        if (~var383 == -1424) {
                                            var65.field3436 = var68;
                                        }
                                        if (var383 == 1401) {
                                            var65.field3505 = var68;
                                        }
                                        if (~var383 == -1423) {
                                            var65.field3446 = var68;
                                        }
                                        if (~var383 == -1410) {
                                            var65.field3403 = var68;
                                        }
                                        if (~var383 == -1420) {
                                            var65.field3379 = var68;
                                        }
                                        if (var383 == 1414) {
                                            var65.field3445 = var68;
                                            var65.field3371 = var64;
                                        }
                                        if (~var383 == -1407) {
                                            var65.field3442 = var68;
                                        }
                                        var65.field3451 = true;
                                        if (var383 == 1411) {
                                            var65.field3454 = var68;
                                        }
                                        if (~var383 == -1416) {
                                            var65.field3400 = var64;
                                            var65.field3456 = var68;
                                        }
                                        if (var383 == 1416) {
                                            var65.field3449 = var68;
                                        }
                                        if (var383 == 1424) {
                                            var65.field3497 = var68;
                                        }
                                        if (~var383 == -1411) {
                                            var65.field3414 = var68;
                                        }
                                        continue;
                                    }
                                    if (var383 < 1600) {
                                        class174 var71 = !var44 ? class129.field2428 : class203.field3873;
                                        if (~var383 == -1501) {
                                            class108.field1946[var6++] = var71.field3368;
                                            continue;
                                        }
                                        if (~var383 == -1502) {
                                            class108.field1946[var6++] = var71.field3443;
                                            continue;
                                        }
                                        if (var383 == 1502) {
                                            class108.field1946[var6++] = var71.field3382;
                                            continue;
                                        }
                                        if (var383 == 1503) {
                                            class108.field1946[var6++] = var71.field3424;
                                            continue;
                                        }
                                        if (var383 == 1504) {
                                            class108.field1946[var6++] = var71.field3380 ? 1 : 0;
                                            continue;
                                        }
                                        if (var383 == 1505) {
                                            class108.field1946[var6++] = var71.field3506;
                                            continue;
                                        }
                                    } else if (var383 < 1700) {
                                        class174 var72 = var44 ? class203.field3873 : class129.field2428;
                                        if (~var383 == -1601) {
                                            class108.field1946[var6++] = var72.field3395;
                                            continue;
                                        }
                                        if (var383 == 1601) {
                                            class108.field1946[var6++] = var72.field3417;
                                            continue;
                                        }
                                        if (~var383 == -1603) {
                                            class171.field3332[var7++] = var72.field3385;
                                            continue;
                                        }
                                        if (var383 == 1603) {
                                            class108.field1946[var6++] = var72.field3386;
                                            continue;
                                        }
                                        if (var383 == 1604) {
                                            class108.field1946[var6++] = var72.field3377;
                                            continue;
                                        }
                                        if (~var383 == -1606) {
                                            class108.field1946[var6++] = var72.field3487;
                                            continue;
                                        }
                                        if (~var383 == -1607) {
                                            class108.field1946[var6++] = var72.field3457;
                                            continue;
                                        }
                                        if (~var383 == -1608) {
                                            class108.field1946[var6++] = var72.field3519;
                                            continue;
                                        }
                                        if (~var383 == -1609) {
                                            class108.field1946[var6++] = var72.field3511;
                                            continue;
                                        }
                                        if (~var383 == -1610) {
                                            class108.field1946[var6++] = var72.field3482;
                                            continue;
                                        }
                                    } else if (var383 < 1800) {
                                        class174 var73 = var44 ? class203.field3873 : class129.field2428;
                                        if (var383 == 1700) {
                                            class108.field1946[var6++] = var73.field3401;
                                            continue;
                                        }
                                        if (var383 == 1701) {
                                            if (var73.field3401 == -1) {
                                                class108.field1946[var6++] = 0;
                                            } else {
                                                class108.field1946[var6++] = var73.field3484;
                                            }
                                            continue;
                                        }
                                        if (var383 == 1702) {
                                            class108.field1946[var6++] = var73.field3408;
                                            continue;
                                        }
                                    } else if (var383 < 1900) {
                                        class174 var74 = var44 ? class203.field3873 : class129.field2428;
                                        if (var383 == 1800) {
                                            class108.field1946[var6++] = class87.method592(1281959627, class80.method530(-881710560, var74));
                                            continue;
                                        }
                                        if (var383 == 1801) {
                                            --var6;
                                            int var75 = class108.field1946[var6];
                                            int var384 = var75 - 1;
                                            if (var74.field3375 != null && var74.field3375.length > var384 && var74.field3375[var384] != null) {
                                                class171.field3332[var7++] = var74.field3375[var384];
                                                continue;
                                            }
                                            class171.field3332[var7++] = class81.field1468;
                                            continue;
                                        }
                                        if (~var383 == -1803) {
                                            if (var74.field3459 != null) {
                                                class171.field3332[var7++] = var74.field3459;
                                            } else {
                                                class171.field3332[var7++] = class81.field1468;
                                            }
                                            continue;
                                        }
                                    } else if (var383 < 2600) {
                                        --var6;
                                        class174 var76 = class239.method1581(-64, class108.field1946[var6]);
                                        if (var383 == 2500) {
                                            class108.field1946[var6++] = var76.field3368;
                                            continue;
                                        }
                                        if (~var383 == -2502) {
                                            class108.field1946[var6++] = var76.field3443;
                                            continue;
                                        }
                                        if (~var383 == -2503) {
                                            class108.field1946[var6++] = var76.field3382;
                                            continue;
                                        }
                                        if (~var383 == -2504) {
                                            class108.field1946[var6++] = var76.field3424;
                                            continue;
                                        }
                                        if (var383 == 2504) {
                                            class108.field1946[var6++] = var76.field3380 ? 1 : 0;
                                            continue;
                                        }
                                        if (var383 == 2505) {
                                            class108.field1946[var6++] = var76.field3506;
                                            continue;
                                        }
                                    } else if (var383 < 2700) {
                                        --var6;
                                        class174 var77 = class239.method1581(-64, class108.field1946[var6]);
                                        if (var383 == 2600) {
                                            class108.field1946[var6++] = var77.field3395;
                                            continue;
                                        }
                                        if (~var383 == -2602) {
                                            class108.field1946[var6++] = var77.field3417;
                                            continue;
                                        }
                                        if (~var383 == -2603) {
                                            class171.field3332[var7++] = var77.field3385;
                                            continue;
                                        }
                                        if (~var383 == -2604) {
                                            class108.field1946[var6++] = var77.field3386;
                                            continue;
                                        }
                                        if (var383 == 2604) {
                                            class108.field1946[var6++] = var77.field3377;
                                            continue;
                                        }
                                        if (~var383 == -2606) {
                                            class108.field1946[var6++] = var77.field3487;
                                            continue;
                                        }
                                        if (~var383 == -2607) {
                                            class108.field1946[var6++] = var77.field3457;
                                            continue;
                                        }
                                        if (~var383 == -2608) {
                                            class108.field1946[var6++] = var77.field3519;
                                            continue;
                                        }
                                        if (~var383 == -2609) {
                                            class108.field1946[var6++] = var77.field3511;
                                            continue;
                                        }
                                        if (var383 == 2609) {
                                            class108.field1946[var6++] = var77.field3482;
                                            continue;
                                        }
                                    } else if (var383 >= 2800) {
                                        if (~var383 > -2901) {
                                            --var6;
                                            class174 var78 = class239.method1581(-64, class108.field1946[var6]);
                                            if (var383 == 2800) {
                                                class108.field1946[var6++] = class87.method592(1281959627, class80.method530(-881710560, var78));
                                                continue;
                                            }
                                            if (~var383 == -2802) {
                                                --var6;
                                                int var79 = class108.field1946[var6];
                                                int var385 = var79 - 1;
                                                if (var78.field3375 != null && ~var78.field3375.length < ~var385 && var78.field3375[var385] != null) {
                                                    class171.field3332[var7++] = var78.field3375[var385];
                                                    continue;
                                                }
                                                class171.field3332[var7++] = class81.field1468;
                                                continue;
                                            }
                                            if (~var383 == -2803) {
                                                if (var78.field3459 != null) {
                                                    class171.field3332[var7++] = var78.field3459;
                                                } else {
                                                    class171.field3332[var7++] = class81.field1468;
                                                }
                                                continue;
                                            }
                                        } else if (~var383 <= -3201) {
                                            if (~var383 > -3301) {
                                                if (~var383 == -3201) {
                                                    var6 -= 3;
                                                    class92.method669(class108.field1946[var6 + 1], class108.field1946[var6 + 2], class108.field1946[var6], 0);
                                                    continue;
                                                }
                                                if (var383 == 3201) {
                                                    --var6;
                                                    class116.method790((byte) -73, class108.field1946[var6]);
                                                    continue;
                                                }
                                                if (var383 == 3202) {
                                                    var6 -= 2;
                                                    class4.method23(true, class108.field1946[var6], class108.field1946[var6 + 1]);
                                                    continue;
                                                }
                                            } else if (var383 >= 3400) {
                                                if (~var383 <= -3501) {
                                                    if (var383 < 3700) {
                                                        if (var383 == 3600) {
                                                            if (~class115.field2080 == -1) {
                                                                class108.field1946[var6++] = -2;
                                                            } else if (class115.field2080 != 1) {
                                                                class108.field1946[var6++] = class146.field2731;
                                                            } else {
                                                                class108.field1946[var6++] = -1;
                                                            }
                                                            continue;
                                                        }
                                                        if (var383 == 3601) {
                                                            --var6;
                                                            int var80 = class108.field1946[var6];
                                                            if (~class115.field2080 == -3 && ~var80 > ~class146.field2731) {
                                                                class171.field3332[var7++] = class23.field370[var80];
                                                                continue;
                                                            }
                                                            class171.field3332[var7++] = class81.field1468;
                                                            continue;
                                                        }
                                                        if (~var383 == -3603) {
                                                            --var6;
                                                            int var81 = class108.field1946[var6];
                                                            if (class115.field2080 == 2 && var81 < class146.field2731) {
                                                                class108.field1946[var6++] = class160.field3094[var81];
                                                                continue;
                                                            }
                                                            class108.field1946[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (var383 == 3603) {
                                                            --var6;
                                                            int var82 = class108.field1946[var6];
                                                            if (~class115.field2080 == -3 && var82 < class146.field2731) {
                                                                class108.field1946[var6++] = class46.field845[var82];
                                                                continue;
                                                            }
                                                            class108.field1946[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (var383 == 3604) {
                                                            --var7;
                                                            class88 var83 = class171.field3332[var7];
                                                            --var6;
                                                            int var84 = class108.field1946[var6];
                                                            class171.method1215(var83, var84, 0);
                                                            continue;
                                                        }
                                                        if (~var383 == -3606) {
                                                            --var7;
                                                            class88 var85 = class171.field3332[var7];
                                                            class12.method64(-42, var85.method630(false));
                                                            continue;
                                                        }
                                                        if (var383 == 3606) {
                                                            --var7;
                                                            class88 var86 = class171.field3332[var7];
                                                            class114.method779(-16, var86.method630(false));
                                                            continue;
                                                        }
                                                        if (~var383 == -3608) {
                                                            --var7;
                                                            class88 var87 = class171.field3332[var7];
                                                            class11.method55(-8, var87.method630(false));
                                                            continue;
                                                        }
                                                        if (~var383 == -3609) {
                                                            --var7;
                                                            class88 var88 = class171.field3332[var7];
                                                            class146.method975(0, var88.method630(false));
                                                            continue;
                                                        }
                                                        if (~var383 == -3610) {
                                                            --var7;
                                                            class88 var89 = class171.field3332[var7];
                                                            if (var89.method619(-4205, class177.field3556) || var89.method619(-4205, class164.field3143)) {
                                                                var89 = var89.method635(7, -383902332);
                                                            }
                                                            class108.field1946[var6++] = !method903((byte) -71, var89) ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var383 == -3611) {
                                                            --var6;
                                                            int var90 = class108.field1946[var6];
                                                            if (~class115.field2080 == -3 && class146.field2731 > var90) {
                                                                class171.field3332[var7++] = class168.field3240[var90];
                                                                continue;
                                                            }
                                                            class171.field3332[var7++] = class81.field1468;
                                                            continue;
                                                        }
                                                        if (var383 == 3611) {
                                                            if (class222.field4184 != null) {
                                                                class171.field3332[var7++] = class222.field4184.method614((byte) 83);
                                                            } else {
                                                                class171.field3332[var7++] = class81.field1468;
                                                            }
                                                            continue;
                                                        }
                                                        if (var383 == 3612) {
                                                            if (class222.field4184 != null) {
                                                                class108.field1946[var6++] = class47.field885;
                                                            } else {
                                                                class108.field1946[var6++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var383 == -3614) {
                                                            --var6;
                                                            int var91 = class108.field1946[var6];
                                                            if (class222.field4184 != null && class47.field885 > var91) {
                                                                class171.field3332[var7++] = class88.field1647[var91].field1323.method614((byte) 83);
                                                                continue;
                                                            }
                                                            class171.field3332[var7++] = class81.field1468;
                                                            continue;
                                                        }
                                                        if (var383 == 3614) {
                                                            --var6;
                                                            int var92 = class108.field1946[var6];
                                                            if (class222.field4184 != null && ~class47.field885 < ~var92) {
                                                                class108.field1946[var6++] = class88.field1647[var92].field1317;
                                                                continue;
                                                            }
                                                            class108.field1946[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -3616) {
                                                            --var6;
                                                            int var93 = class108.field1946[var6];
                                                            if (class222.field4184 != null && ~class47.field885 < ~var93) {
                                                                class108.field1946[var6++] = class88.field1647[var93].field1315;
                                                                continue;
                                                            }
                                                            class108.field1946[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -3617) {
                                                            class108.field1946[var6++] = class170.field3303;
                                                            continue;
                                                        }
                                                        if (var383 == 3617) {
                                                            --var7;
                                                            class88 var94 = class171.field3332[var7];
                                                            class101.method703(var94, (byte) -121);
                                                            continue;
                                                        }
                                                        if (~var383 == -3619) {
                                                            class108.field1946[var6++] = class143.field2633;
                                                            continue;
                                                        }
                                                        if (var383 == 3619) {
                                                            --var7;
                                                            class88 var95 = class171.field3332[var7];
                                                            method902(111, var95.method630(false));
                                                            continue;
                                                        }
                                                        if (~var383 == -3621) {
                                                            class248.method1623((byte) -113);
                                                            continue;
                                                        }
                                                        if (var383 == 3621) {
                                                            if (~class115.field2080 == -1) {
                                                                class108.field1946[var6++] = -1;
                                                            } else {
                                                                class108.field1946[var6++] = class67.field1221;
                                                            }
                                                            continue;
                                                        }
                                                        if (var383 == 3622) {
                                                            --var6;
                                                            int var96 = class108.field1946[var6];
                                                            if (class115.field2080 != 0 && var96 < class67.field1221) {
                                                                class171.field3332[var7++] = class200.method1377(class95.field1765[var96], (byte) 73).method614((byte) 83);
                                                                continue;
                                                            }
                                                            class171.field3332[var7++] = class81.field1468;
                                                            continue;
                                                        }
                                                        if (var383 == 3623) {
                                                            --var7;
                                                            class88 var97 = class171.field3332[var7];
                                                            if (var97.method619(-4205, class177.field3556) || var97.method619(-4205, class164.field3143)) {
                                                                var97 = var97.method635(7, -383902332);
                                                            }
                                                            class108.field1946[var6++] = !class164.method1132((byte) 66, var97) ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var383 == 3624) {
                                                            --var6;
                                                            int var98 = class108.field1946[var6];
                                                            if (class88.field1647 != null && class47.field885 > var98 && class88.field1647[var98].field1323.method624(class240.field4458.field766, (byte) 75)) {
                                                                class108.field1946[var6++] = 1;
                                                                continue;
                                                            }
                                                            class108.field1946[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (var383 == 3625) {
                                                            if (class225.field4221 == null) {
                                                                class171.field3332[var7++] = class81.field1468;
                                                            } else {
                                                                class171.field3332[var7++] = class225.field4221.method614((byte) 83);
                                                            }
                                                            continue;
                                                        }
                                                        if (~var383 == -3627) {
                                                            --var6;
                                                            int var99 = class108.field1946[var6];
                                                            if (class222.field4184 != null && class47.field885 > var99) {
                                                                class171.field3332[var7++] = class88.field1647[var99].field1321;
                                                                continue;
                                                            }
                                                            class171.field3332[var7++] = class81.field1468;
                                                            continue;
                                                        }
                                                        if (var383 == 3627) {
                                                            --var6;
                                                            int var100 = class108.field1946[var6];
                                                            if (class115.field2080 == 2 && ~var100 <= -1 && var100 < class146.field2731) {
                                                                class108.field1946[var6++] = !class59.field1120[var100] ? 0 : 1;
                                                                continue;
                                                            }
                                                            class108.field1946[var6++] = 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -3629) {
                                                            --var7;
                                                            class88 var101 = class171.field3332[var7];
                                                            if (var101.method619(-4205, class177.field3556) || var101.method619(-4205, class164.field3143)) {
                                                                var101 = var101.method635(7, -383902332);
                                                            }
                                                            class108.field1946[var6++] = class120.method825(var101, 60);
                                                            continue;
                                                        }
                                                    } else if (var383 < 4000) {
                                                        if (~var383 == -3904) {
                                                            --var6;
                                                            int var102 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.field140[var102].method884(-126);
                                                            continue;
                                                        }
                                                        if (~var383 == -3905) {
                                                            --var6;
                                                            int var103 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.field140[var103].field2457;
                                                            continue;
                                                        }
                                                        if (var383 == 3905) {
                                                            --var6;
                                                            int var104 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.field140[var104].field2456;
                                                            continue;
                                                        }
                                                        if (~var383 == -3907) {
                                                            --var6;
                                                            int var105 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.field140[var105].field2452;
                                                            continue;
                                                        }
                                                        if (~var383 == -3908) {
                                                            --var6;
                                                            int var106 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.field140[var106].field2459;
                                                            continue;
                                                        }
                                                        if (var383 == 3908) {
                                                            --var6;
                                                            int var107 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.field140[var107].field2461;
                                                            continue;
                                                        }
                                                        if (~var383 == -3911) {
                                                            --var6;
                                                            int var108 = class108.field1946[var6];
                                                            int var109 = class9.field140[var108].method888((byte) -93);
                                                            class108.field1946[var6++] = var109 != 0 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var383 == -3912) {
                                                            --var6;
                                                            int var110 = class108.field1946[var6];
                                                            int var111 = class9.field140[var110].method888((byte) -93);
                                                            class108.field1946[var6++] = ~var111 != -3 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var383 == 3912) {
                                                            --var6;
                                                            int var112 = class108.field1946[var6];
                                                            int var113 = class9.field140[var112].method888((byte) -93);
                                                            class108.field1946[var6++] = var113 != 5 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var383 == 3913) {
                                                            --var6;
                                                            int var114 = class108.field1946[var6];
                                                            int var115 = class9.field140[var114].method888((byte) -93);
                                                            class108.field1946[var6++] = ~var115 != -2 ? 0 : 1;
                                                            continue;
                                                        }
                                                    } else if (~var383 > -4101) {
                                                        if (var383 == 4000) {
                                                            var6 -= 2;
                                                            int var116 = class108.field1946[var6];
                                                            int var117 = class108.field1946[var6 - -1];
                                                            class108.field1946[var6++] = var116 - -var117;
                                                            continue;
                                                        }
                                                        if (var383 == 4001) {
                                                            var6 -= 2;
                                                            int var118 = class108.field1946[var6];
                                                            int var119 = class108.field1946[var6 + 1];
                                                            class108.field1946[var6++] = -var119 + var118;
                                                            continue;
                                                        }
                                                        if (~var383 == -4003) {
                                                            var6 -= 2;
                                                            int var120 = class108.field1946[var6 - -1];
                                                            int var121 = class108.field1946[var6];
                                                            class108.field1946[var6++] = var120 * var121;
                                                            continue;
                                                        }
                                                        if (~var383 == -4004) {
                                                            var6 -= 2;
                                                            int var122 = class108.field1946[var6];
                                                            int var123 = class108.field1946[var6 + 1];
                                                            class108.field1946[var6++] = var122 / var123;
                                                            continue;
                                                        }
                                                        if (var383 == 4004) {
                                                            --var6;
                                                            int var124 = class108.field1946[var6];
                                                            class108.field1946[var6++] = (int) (Math.random() * (double) var124);
                                                            continue;
                                                        }
                                                        if (~var383 == -4006) {
                                                            --var6;
                                                            int var125 = class108.field1946[var6];
                                                            class108.field1946[var6++] = (int) ((double) (var125 + 1) * Math.random());
                                                            continue;
                                                        }
                                                        if (var383 == 4006) {
                                                            var6 -= 5;
                                                            int var126 = class108.field1946[var6];
                                                            int var127 = class108.field1946[var6 + 1];
                                                            int var128 = class108.field1946[var6 + 2];
                                                            int var129 = class108.field1946[var6 + 3];
                                                            int var130 = class108.field1946[var6 + 4];
                                                            class108.field1946[var6++] = (-var126 + var127) * (-var128 + var130) / (-var128 + var129) + var126;
                                                            continue;
                                                        }
                                                        if (~var383 == -4008) {
                                                            var6 -= 2;
                                                            long var131 = (long) class108.field1946[var6 + 1];
                                                            long var133 = (long) class108.field1946[var6];
                                                            class108.field1946[var6++] = (int) (var131 * var133 / 100L + var133);
                                                            continue;
                                                        }
                                                        if (~var383 == -4009) {
                                                            var6 -= 2;
                                                            int var135 = class108.field1946[var6];
                                                            int var136 = class108.field1946[var6 + 1];
                                                            class108.field1946[var6++] = class204.method1405(1 << var136, var135);
                                                            continue;
                                                        }
                                                        if (var383 == 4009) {
                                                            var6 -= 2;
                                                            int var137 = class108.field1946[var6 - -1];
                                                            int var138 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class70.method470(var138, -1 - (1 << var137));
                                                            continue;
                                                        }
                                                        if (var383 == 4010) {
                                                            var6 -= 2;
                                                            int var139 = class108.field1946[var6 + 1];
                                                            int var140 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class70.method470(var140, 1 << var139) != 0 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -4012) {
                                                            var6 -= 2;
                                                            int var141 = class108.field1946[var6 + 1];
                                                            int var142 = class108.field1946[var6];
                                                            class108.field1946[var6++] = var142 % var141;
                                                            continue;
                                                        }
                                                        if (var383 == 4012) {
                                                            var6 -= 2;
                                                            int var143 = class108.field1946[var6];
                                                            int var144 = class108.field1946[var6 - -1];
                                                            if (~var143 != -1) {
                                                                class108.field1946[var6++] = (int) Math.pow((double) var143, (double) var144);
                                                            } else {
                                                                class108.field1946[var6++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (var383 == 4013) {
                                                            var6 -= 2;
                                                            int var145 = class108.field1946[var6];
                                                            int var146 = class108.field1946[var6 - -1];
                                                            if (~var145 != -1) {
                                                                if (var146 == 0) {
                                                                    class108.field1946[var6++] = Integer.MAX_VALUE;
                                                                } else {
                                                                    class108.field1946[var6++] = (int) Math.pow((double) var145, 1.0D / (double) var146);
                                                                }
                                                            } else {
                                                                class108.field1946[var6++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var383 == -4015) {
                                                            var6 -= 2;
                                                            int var147 = class108.field1946[var6 + 1];
                                                            int var148 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class70.method470(var147, var148);
                                                            continue;
                                                        }
                                                        if (var383 == 4015) {
                                                            var6 -= 2;
                                                            int var149 = class108.field1946[var6 - -1];
                                                            int var150 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class204.method1405(var150, var149);
                                                            continue;
                                                        }
                                                        if (~var383 == -4017) {
                                                            var6 -= 2;
                                                            int var151 = class108.field1946[var6];
                                                            int var152 = class108.field1946[var6 - -1];
                                                            class108.field1946[var6++] = var151 < var152 ? var151 : var152;
                                                            continue;
                                                        }
                                                        if (~var383 == -4018) {
                                                            var6 -= 2;
                                                            int var153 = class108.field1946[var6];
                                                            int var154 = class108.field1946[var6 - -1];
                                                            class108.field1946[var6++] = ~var153 >= ~var154 ? var154 : var153;
                                                            continue;
                                                        }
                                                        if (var383 == 4018) {
                                                            var6 -= 3;
                                                            long var155 = (long) class108.field1946[var6];
                                                            long var157 = (long) class108.field1946[var6 + 1];
                                                            long var159 = (long) class108.field1946[var6 + 2];
                                                            class108.field1946[var6++] = (int) (var155 * var159 / var157);
                                                            continue;
                                                        }
                                                    } else if (var383 >= 4200) {
                                                        if (var383 < 4300) {
                                                            if (var383 == 4200) {
                                                                --var6;
                                                                int var161 = class108.field1946[var6];
                                                                class171.field3332[var7++] = class71.method472(var161, (byte) -120).field2894;
                                                                continue;
                                                            }
                                                            if (~var383 == -4202) {
                                                                var6 -= 2;
                                                                int var162 = class108.field1946[var6];
                                                                int var163 = class108.field1946[var6 - -1];
                                                                class149 var164 = class71.method472(var162, (byte) -106);
                                                                if (~var163 <= -2 && ~var163 >= -6 && var164.field2900[var163 + -1] != null) {
                                                                    class171.field3332[var7++] = var164.field2900[var163 + -1];
                                                                    continue;
                                                                }
                                                                class171.field3332[var7++] = class81.field1468;
                                                                continue;
                                                            }
                                                            if (var383 == 4202) {
                                                                var6 -= 2;
                                                                int var165 = class108.field1946[var6 + 1];
                                                                int var166 = class108.field1946[var6];
                                                                class149 var167 = class71.method472(var166, (byte) -119);
                                                                if (var165 >= 1 && var165 <= 5 && var167.field2906[var165 + -1] != null) {
                                                                    class171.field3332[var7++] = var167.field2906[var165 + -1];
                                                                    continue;
                                                                }
                                                                class171.field3332[var7++] = class81.field1468;
                                                                continue;
                                                            }
                                                            if (~var383 == -4204) {
                                                                --var6;
                                                                int var168 = class108.field1946[var6];
                                                                class108.field1946[var6++] = class71.method472(var168, (byte) -114).field2856;
                                                                continue;
                                                            }
                                                            if (~var383 == -4205) {
                                                                --var6;
                                                                int var169 = class108.field1946[var6];
                                                                class108.field1946[var6++] = class71.method472(var169, (byte) -105).field2854 == 1 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var383 == 4205) {
                                                                --var6;
                                                                int var170 = class108.field1946[var6];
                                                                class149 var171 = class71.method472(var170, (byte) -89);
                                                                if (~var171.field2869 == 0 && ~var171.field2843 <= -1) {
                                                                    class108.field1946[var6++] = var171.field2843;
                                                                    continue;
                                                                }
                                                                class108.field1946[var6++] = var170;
                                                                continue;
                                                            }
                                                            if (var383 == 4206) {
                                                                --var6;
                                                                int var172 = class108.field1946[var6];
                                                                class149 var173 = class71.method472(var172, (byte) -100);
                                                                if (~var173.field2869 <= -1 && ~var173.field2843 <= -1) {
                                                                    class108.field1946[var6++] = var173.field2843;
                                                                    continue;
                                                                }
                                                                class108.field1946[var6++] = var172;
                                                                continue;
                                                            }
                                                            if (~var383 == -4208) {
                                                                --var6;
                                                                int var174 = class108.field1946[var6];
                                                                class108.field1946[var6++] = !class71.method472(var174, (byte) -128).field2879 ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var383 == 4208) {
                                                                var6 -= 2;
                                                                int var175 = class108.field1946[var6 - -1];
                                                                int var176 = class108.field1946[var6];
                                                                class4 var177 = class216.method1469(var175, (byte) -37);
                                                                if (var177.method17(-19)) {
                                                                    class171.field3332[var7++] = class71.method472(var176, (byte) -89).method1011(var177.field57, (byte) -121, var175);
                                                                } else {
                                                                    class108.field1946[var6++] = class71.method472(var176, (byte) -120).method1012(true, var175, var177.field53);
                                                                }
                                                                continue;
                                                            }
                                                            if (~var383 == -4211) {
                                                                --var6;
                                                                int var178 = class108.field1946[var6];
                                                                --var7;
                                                                class88 var179 = class171.field3332[var7];
                                                                class70.method467(0, var178 == 1, var179);
                                                                class108.field1946[var6++] = class204.field3895;
                                                                continue;
                                                            }
                                                            if (var383 == 4211) {
                                                                if (class67.field1210 != null && class204.field3895 > class116.field2109) {
                                                                    class108.field1946[var6++] = class70.method470(class67.field1210[class116.field2109++], 65535);
                                                                    continue;
                                                                }
                                                                class108.field1946[var6++] = -1;
                                                                continue;
                                                            }
                                                            if (~var383 == -4213) {
                                                                class116.field2109 = 0;
                                                                continue;
                                                            }
                                                        } else if (var383 < 4400) {
                                                            if (~var383 == -4301) {
                                                                var6 -= 2;
                                                                int var180 = class108.field1946[var6];
                                                                int var181 = class108.field1946[var6 + 1];
                                                                class4 var182 = class216.method1469(var181, (byte) -77);
                                                                if (!var182.method17(-69)) {
                                                                    class108.field1946[var6++] = class147.method987(var180, -126).method856(-8931, var182.field53, var181);
                                                                } else {
                                                                    class171.field3332[var7++] = class147.method987(var180, -95).method862(var181, -97, var182.field57);
                                                                }
                                                                continue;
                                                            }
                                                        } else if (var383 >= 4500) {
                                                            if (var383 >= 4600) {
                                                                if (var383 < 5100) {
                                                                    if (~var383 == -5001) {
                                                                        class108.field1946[var6++] = class67.field1206;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5001) {
                                                                        var6 -= 3;
                                                                        ++class2.field15;
                                                                        class67.field1206 = class108.field1946[var6];
                                                                        class10.field142 = class108.field1946[var6 - -1];
                                                                        class128.field2410 = class108.field1946[var6 + 2];
                                                                        class146.field2749.method30((byte) -111, 115);
                                                                        class146.field2749.method346(255, class67.field1206);
                                                                        class146.field2749.method346(255, class10.field142);
                                                                        class146.field2749.method346(255, class128.field2410);
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5003) {
                                                                        var6 -= 2;
                                                                        ++class68.field1240;
                                                                        int var183 = class108.field1946[var6];
                                                                        --var7;
                                                                        class88 var184 = class171.field3332[var7];
                                                                        int var185 = class108.field1946[var6 + 1];
                                                                        class146.field2749.method30((byte) -91, 99);
                                                                        class146.field2749.method328(var184.method630(false), (byte) -127);
                                                                        class146.field2749.method346(255, var183 - 1);
                                                                        class146.field2749.method346(255, var185);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5003) {
                                                                        --var6;
                                                                        int var186 = class108.field1946[var6];
                                                                        class88 var187 = null;
                                                                        if (~var186 > -101) {
                                                                            var187 = class212.field4021[var186];
                                                                        }
                                                                        if (var187 == null) {
                                                                            var187 = class81.field1468;
                                                                        }
                                                                        class171.field3332[var7++] = var187;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5005) {
                                                                        int var188 = -1;
                                                                        --var6;
                                                                        int var189 = class108.field1946[var6];
                                                                        if (~var189 > -101 && class212.field4021[var189] != null) {
                                                                            var188 = class194.field3710[var189];
                                                                        }
                                                                        class108.field1946[var6++] = var188;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5006) {
                                                                        class108.field1946[var6++] = class10.field142;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5008) {
                                                                        --var7;
                                                                        class88 var190 = class171.field3332[var7];
                                                                        if (var190.method619(-4205, class120.field2196)) {
                                                                            class97.method684(var190, 2);
                                                                            continue;
                                                                        }
                                                                        if (class67.field1208 == 0 && (class238.field4430 == 1 || ~class176.field3537 == -2)) {
                                                                            continue;
                                                                        }
                                                                        ++class95.field1769;
                                                                        class88 var191 = var190.method639(123);
                                                                        byte var192 = 0;
                                                                        if (!var191.method619(-4205, class29.field488)) {
                                                                            if (var191.method619(-4205, class101.field1839)) {
                                                                                var192 = 1;
                                                                                var190 = var190.method635(class101.field1839.method604((byte) -53), -383902332);
                                                                            } else if (var191.method619(-4205, class138.field2566)) {
                                                                                var190 = var190.method635(class138.field2566.method604((byte) -53), -383902332);
                                                                                var192 = 2;
                                                                            } else if (var191.method619(-4205, class241.field4469)) {
                                                                                var192 = 3;
                                                                                var190 = var190.method635(class241.field4469.method604((byte) -53), -383902332);
                                                                            } else if (var191.method619(-4205, class232.field4365)) {
                                                                                var190 = var190.method635(class232.field4365.method604((byte) -53), -383902332);
                                                                                var192 = 4;
                                                                            } else if (!var191.method619(-4205, class74.field1355)) {
                                                                                if (!var191.method619(-4205, class37.field669)) {
                                                                                    if (var191.method619(-4205, class192.field3692)) {
                                                                                        var192 = 7;
                                                                                        var190 = var190.method635(class192.field3692.method604((byte) -53), -383902332);
                                                                                    } else if (!var191.method619(-4205, class39.field696)) {
                                                                                        if (var191.method619(-4205, class200.field3819)) {
                                                                                            var190 = var190.method635(class200.field3819.method604((byte) -53), -383902332);
                                                                                            var192 = 9;
                                                                                        } else if (!var191.method619(-4205, class160.field3086)) {
                                                                                            if (var191.method619(-4205, class192.field3705)) {
                                                                                                var190 = var190.method635(class192.field3705.method604((byte) -53), -383902332);
                                                                                                var192 = 11;
                                                                                            } else if (class126.field2350 != 0) {
                                                                                                if (!var191.method619(-4205, class29.field485)) {
                                                                                                    if (var191.method619(-4205, class101.field1844)) {
                                                                                                        var190 = var190.method635(class101.field1844.method604((byte) -53), -383902332);
                                                                                                        var192 = 1;
                                                                                                    } else if (var191.method619(-4205, class138.field2563)) {
                                                                                                        var192 = 2;
                                                                                                        var190 = var190.method635(class138.field2563.method604((byte) -53), -383902332);
                                                                                                    } else if (var191.method619(-4205, class241.field4465)) {
                                                                                                        var192 = 3;
                                                                                                        var190 = var190.method635(class241.field4465.method604((byte) -53), -383902332);
                                                                                                    } else if (var191.method619(-4205, class232.field4366)) {
                                                                                                        var190 = var190.method635(class232.field4366.method604((byte) -53), -383902332);
                                                                                                        var192 = 4;
                                                                                                    } else if (var191.method619(-4205, class74.field1354)) {
                                                                                                        var190 = var190.method635(class74.field1354.method604((byte) -53), -383902332);
                                                                                                        var192 = 5;
                                                                                                    } else if (!var191.method619(-4205, class37.field663)) {
                                                                                                        if (var191.method619(-4205, class192.field3693)) {
                                                                                                            var192 = 7;
                                                                                                            var190 = var190.method635(class192.field3693.method604((byte) -53), -383902332);
                                                                                                        } else if (!var191.method619(-4205, class39.field683)) {
                                                                                                            if (var191.method619(-4205, class200.field3815)) {
                                                                                                                var190 = var190.method635(class200.field3815.method604((byte) -53), -383902332);
                                                                                                                var192 = 9;
                                                                                                            } else if (!var191.method619(-4205, class160.field3083)) {
                                                                                                                if (var191.method619(-4205, class192.field3697)) {
                                                                                                                    var190 = var190.method635(class192.field3697.method604((byte) -53), -383902332);
                                                                                                                    var192 = 11;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var192 = 10;
                                                                                                                var190 = var190.method635(class160.field3083.method604((byte) -53), -383902332);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var190 = var190.method635(class39.field683.method604((byte) -53), -383902332);
                                                                                                            var192 = 8;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var190 = var190.method635(class37.field663.method604((byte) -53), -383902332);
                                                                                                        var192 = 6;
                                                                                                    }
                                                                                                } else {
                                                                                                    var192 = 0;
                                                                                                    var190 = var190.method635(class29.field485.method604((byte) -53), -383902332);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var192 = 10;
                                                                                            var190 = var190.method635(class160.field3086.method604((byte) -53), -383902332);
                                                                                        }
                                                                                    } else {
                                                                                        var190 = var190.method635(class39.field696.method604((byte) -53), -383902332);
                                                                                        var192 = 8;
                                                                                    }
                                                                                } else {
                                                                                    var190 = var190.method635(class37.field669.method604((byte) -53), -383902332);
                                                                                    var192 = 6;
                                                                                }
                                                                            } else {
                                                                                var190 = var190.method635(class74.field1355.method604((byte) -53), -383902332);
                                                                                var192 = 5;
                                                                            }
                                                                        } else {
                                                                            var190 = var190.method635(class29.field488.method604((byte) -53), -383902332);
                                                                            var192 = 0;
                                                                        }
                                                                        class88 var193 = var190.method639(121);
                                                                        byte var194 = 0;
                                                                        if (!var193.method619(-4205, class57.field1083)) {
                                                                            if (var193.method619(-4205, class35.field612)) {
                                                                                var190 = var190.method635(class35.field612.method604((byte) -53), -383902332);
                                                                                var194 = 2;
                                                                            } else if (!var193.method619(-4205, class71.field1308)) {
                                                                                if (!var193.method619(-4205, class17.field263)) {
                                                                                    if (var193.method619(-4205, class216.field4052)) {
                                                                                        var190 = var190.method635(class216.field4052.method604((byte) -53), -383902332);
                                                                                        var194 = 5;
                                                                                    } else if (class126.field2350 != 0) {
                                                                                        if (!var193.method619(-4205, class57.field1086)) {
                                                                                            if (!var193.method619(-4205, class35.field618)) {
                                                                                                if (var193.method619(-4205, class71.field1313)) {
                                                                                                    var190 = var190.method635(class71.field1313.method604((byte) -53), -383902332);
                                                                                                    var194 = 3;
                                                                                                } else if (var193.method619(-4205, class17.field267)) {
                                                                                                    var194 = 4;
                                                                                                    var190 = var190.method635(class17.field267.method604((byte) -53), -383902332);
                                                                                                } else if (var193.method619(-4205, class216.field4051)) {
                                                                                                    var194 = 5;
                                                                                                    var190 = var190.method635(class216.field4051.method604((byte) -53), -383902332);
                                                                                                }
                                                                                            } else {
                                                                                                var190 = var190.method635(class35.field618.method604((byte) -53), -383902332);
                                                                                                var194 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            var194 = 1;
                                                                                            var190 = var190.method635(class57.field1086.method604((byte) -53), -383902332);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var194 = 4;
                                                                                    var190 = var190.method635(class17.field263.method604((byte) -53), -383902332);
                                                                                }
                                                                            } else {
                                                                                var194 = 3;
                                                                                var190 = var190.method635(class71.field1308.method604((byte) -53), -383902332);
                                                                            }
                                                                        } else {
                                                                            var194 = 1;
                                                                            var190 = var190.method635(class57.field1083.method604((byte) -53), -383902332);
                                                                        }
                                                                        class146.field2749.method30((byte) -72, 189);
                                                                        class146.field2749.method346(255, 0);
                                                                        int var195 = class146.field2749.field831;
                                                                        class146.field2749.method346(255, var192);
                                                                        class146.field2749.method346(255, var194);
                                                                        class172.method1222(class146.field2749, var190, (byte) 113);
                                                                        class146.field2749.method341(-var195 + class146.field2749.field831, -119);
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5010) {
                                                                        var7 -= 2;
                                                                        class88 var196 = class171.field3332[var7];
                                                                        class88 var197 = class171.field3332[var7 + 1];
                                                                        if (class67.field1208 != 0 || ~class238.field4430 != -2 && ~class176.field3537 != -2) {
                                                                            ++class176.field3538;
                                                                            class146.field2749.method30((byte) -58, 80);
                                                                            class146.field2749.method346(255, 0);
                                                                            int var198 = class146.field2749.field831;
                                                                            class146.field2749.method328(var196.method630(false), (byte) -122);
                                                                            class172.method1222(class146.field2749, var197, (byte) 113);
                                                                            class146.field2749.method341(-var198 + class146.field2749.field831, 74);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5011) {
                                                                        --var6;
                                                                        int var199 = class108.field1946[var6];
                                                                        class88 var200 = null;
                                                                        if (var199 < 100) {
                                                                            var200 = class121.field2208[var199];
                                                                        }
                                                                        if (var200 == null) {
                                                                            var200 = class81.field1468;
                                                                        }
                                                                        class171.field3332[var7++] = var200;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5011) {
                                                                        class88 var201 = null;
                                                                        --var6;
                                                                        int var202 = class108.field1946[var6];
                                                                        if (~var202 > -101) {
                                                                            var201 = class228.field4282[var202];
                                                                        }
                                                                        if (var201 == null) {
                                                                            var201 = class81.field1468;
                                                                        }
                                                                        class171.field3332[var7++] = var201;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5012) {
                                                                        int var203 = -1;
                                                                        --var6;
                                                                        int var204 = class108.field1946[var6];
                                                                        if (~var204 > -101) {
                                                                            var203 = class133.field2485[var204];
                                                                        }
                                                                        class108.field1946[var6++] = var203;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5016) {
                                                                        class88 var205;
                                                                        if (class240.field4458 != null && class240.field4458.field766 != null) {
                                                                            var205 = class240.field4458.field766;
                                                                        } else {
                                                                            var205 = class209.field3969;
                                                                        }
                                                                        class171.field3332[var7++] = var205;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5016) {
                                                                        class108.field1946[var6++] = class128.field2410;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5018) {
                                                                        class108.field1946[var6++] = class34.field582;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5050) {
                                                                        --var6;
                                                                        int var206 = class108.field1946[var6];
                                                                        class171.field3332[var7++] = class115.method785(var206, 4).field2130;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5051) {
                                                                        --var6;
                                                                        int var207 = class108.field1946[var6];
                                                                        class117 var208 = class115.method785(var207, 4);
                                                                        if (var208.field2118 != null) {
                                                                            class108.field1946[var6++] = var208.field2118.length;
                                                                        } else {
                                                                            class108.field1946[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5052) {
                                                                        var6 -= 2;
                                                                        int var209 = class108.field1946[var6];
                                                                        int var210 = class108.field1946[var6 + 1];
                                                                        class117 var211 = class115.method785(var209, 4);
                                                                        int var212 = var211.field2118[var210];
                                                                        class108.field1946[var6++] = var212;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5054) {
                                                                        --var6;
                                                                        int var213 = class108.field1946[var6];
                                                                        class117 var214 = class115.method785(var213, 4);
                                                                        if (var214.field2123 == null) {
                                                                            class108.field1946[var6++] = 0;
                                                                        } else {
                                                                            class108.field1946[var6++] = var214.field2123.length;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5054) {
                                                                        var6 -= 2;
                                                                        int var215 = class108.field1946[var6];
                                                                        int var216 = class108.field1946[var6 + 1];
                                                                        class108.field1946[var6++] = class115.method785(var215, 4).field2123[var216];
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5056) {
                                                                        --var6;
                                                                        int var217 = class108.field1946[var6];
                                                                        class171.field3332[var7++] = class168.method1152((byte) 62, var217).method1412(116);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5056) {
                                                                        --var6;
                                                                        int var218 = class108.field1946[var6];
                                                                        class205 var219 = class168.method1152((byte) 62, var218);
                                                                        if (var219.field3918 == null) {
                                                                            class108.field1946[var6++] = 0;
                                                                        } else {
                                                                            class108.field1946[var6++] = var219.field3918.length;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5057) {
                                                                        var6 -= 2;
                                                                        int var220 = class108.field1946[var6 + 1];
                                                                        int var221 = class108.field1946[var6];
                                                                        class108.field1946[var6++] = class168.method1152((byte) 62, var221).field3918[var220];
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5058) {
                                                                        class15.field226 = new class217();
                                                                        --var6;
                                                                        class15.field226.field4060 = class108.field1946[var6];
                                                                        class15.field226.field4067 = class168.method1152((byte) 62, class15.field226.field4060);
                                                                        class15.field226.field4070 = new int[class15.field226.field4067.method1409((byte) 19)];
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5060) {
                                                                        class146.field2749.method30((byte) -29, 197);
                                                                        class146.field2749.method346(255, 0);
                                                                        int var222 = class146.field2749.field831;
                                                                        class146.field2749.method346(255, 0);
                                                                        ++class128.field2399;
                                                                        class146.field2749.method305(108, class15.field226.field4060);
                                                                        class15.field226.field4067.method1416(85, class146.field2749, class15.field226.field4070);
                                                                        class146.field2749.method341(-var222 + class146.field2749.field831, -124);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5060) {
                                                                        ++class60.field1135;
                                                                        --var7;
                                                                        class88 var223 = class171.field3332[var7];
                                                                        class146.field2749.method30((byte) -106, 242);
                                                                        class146.field2749.method346(255, 0);
                                                                        int var224 = class146.field2749.field831;
                                                                        class146.field2749.method328(var223.method630(false), (byte) -125);
                                                                        class146.field2749.method305(92, class15.field226.field4060);
                                                                        class15.field226.field4067.method1416(6, class146.field2749, class15.field226.field4070);
                                                                        class146.field2749.method341(-var224 + class146.field2749.field831, 107);
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5062) {
                                                                        ++class128.field2399;
                                                                        class146.field2749.method30((byte) -109, 197);
                                                                        class146.field2749.method346(255, 0);
                                                                        int var225 = class146.field2749.field831;
                                                                        class146.field2749.method346(255, 1);
                                                                        class146.field2749.method305(123, class15.field226.field4060);
                                                                        class15.field226.field4067.method1416(-33, class146.field2749, class15.field226.field4070);
                                                                        class146.field2749.method341(-var225 + class146.field2749.field831, -120);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5062) {
                                                                        var6 -= 2;
                                                                        int var226 = class108.field1946[var6 - -1];
                                                                        int var227 = class108.field1946[var6];
                                                                        class108.field1946[var6++] = class115.method785(var227, 4).field2121[var226];
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5063) {
                                                                        var6 -= 2;
                                                                        int var228 = class108.field1946[var6 + 1];
                                                                        int var229 = class108.field1946[var6];
                                                                        class108.field1946[var6++] = class115.method785(var229, 4).field2132[var228];
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5064) {
                                                                        var6 -= 2;
                                                                        int var230 = class108.field1946[var6];
                                                                        int var231 = class108.field1946[var6 + 1];
                                                                        if (~var231 != 0) {
                                                                            class108.field1946[var6++] = class115.method785(var230, 4).method798(var231, 20552);
                                                                        } else {
                                                                            class108.field1946[var6++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5065) {
                                                                        var6 -= 2;
                                                                        int var232 = class108.field1946[var6];
                                                                        int var233 = class108.field1946[var6 - -1];
                                                                        if (var233 == -1) {
                                                                            class108.field1946[var6++] = -1;
                                                                        } else {
                                                                            class108.field1946[var6++] = class115.method785(var232, 4).method794(104, var233);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5067) {
                                                                        --var6;
                                                                        int var234 = class108.field1946[var6];
                                                                        class108.field1946[var6++] = class168.method1152((byte) 62, var234).method1409((byte) 67);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5067) {
                                                                        var6 -= 2;
                                                                        int var235 = class108.field1946[var6];
                                                                        int var236 = class108.field1946[var6 + 1];
                                                                        int var237 = class168.method1152((byte) 62, var235).method1407((byte) -94, var236);
                                                                        class108.field1946[var6++] = var237;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5069) {
                                                                        var6 -= 2;
                                                                        int var238 = class108.field1946[var6 + 1];
                                                                        int var239 = class108.field1946[var6];
                                                                        class15.field226.field4070[var239] = var238;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5070) {
                                                                        var6 -= 2;
                                                                        int var240 = class108.field1946[var6];
                                                                        int var241 = class108.field1946[var6 + 1];
                                                                        class15.field226.field4070[var240] = var241;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5071) {
                                                                        var6 -= 3;
                                                                        int var242 = class108.field1946[var6];
                                                                        int var243 = class108.field1946[var6 + 1];
                                                                        int var244 = class108.field1946[var6 + 2];
                                                                        class205 var245 = class168.method1152((byte) 62, var242);
                                                                        if (~var245.method1407((byte) -105, var243) != -1) {
                                                                            throw new RuntimeException("bad command");
                                                                        }
                                                                        class108.field1946[var6++] = var245.method1414(var244, 24, var243);
                                                                        continue;
                                                                    }
                                                                } else if (var383 >= 5200) {
                                                                    if (var383 >= 5300) {
                                                                        if (~var383 <= -5401) {
                                                                            if (var383 < 5500) {
                                                                                if (var383 == 5400) {
                                                                                    ++class10.field146;
                                                                                    var7 -= 2;
                                                                                    class88 var246 = class171.field3332[var7];
                                                                                    class88 var247 = class171.field3332[var7 - -1];
                                                                                    --var6;
                                                                                    int var248 = class108.field1946[var6];
                                                                                    class146.field2749.method30((byte) -107, 85);
                                                                                    class146.field2749.method346(255, class15.method72(var246, 1) - -class15.method72(var247, 1) - -1);
                                                                                    class146.field2749.method336(var246, (byte) 0);
                                                                                    class146.field2749.method336(var247, (byte) 0);
                                                                                    class146.field2749.method346(255, var248);
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 5401) {
                                                                                    var6 -= 2;
                                                                                    class117.field2110[class108.field1946[var6]] = (short) class234.method1561(class108.field1946[var6 - -1], true);
                                                                                    class7.method37((byte) 99);
                                                                                    class204.method1401((byte) -75);
                                                                                    class103.method713(8);
                                                                                    class154.method1052((byte) -120);
                                                                                    class106.method735(0);
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else if (var383 == 5304) {
                                                                            class108.field1946[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                    } else {
                                                                        if (var383 == 5200) {
                                                                            --var6;
                                                                            class43.method277((byte) 53, class108.field1946[var6]);
                                                                            continue;
                                                                        }
                                                                        if (~var383 == -5202) {
                                                                            class108.field1946[var6++] = class102.method710(0);
                                                                            continue;
                                                                        }
                                                                        if (var383 == 5202) {
                                                                            --var6;
                                                                            class86.method581(class108.field1946[var6], true);
                                                                            continue;
                                                                        }
                                                                        if (~var383 == -5204) {
                                                                            --var7;
                                                                            class130.method881((byte) 119, class171.field3332[var7]);
                                                                            continue;
                                                                        }
                                                                        if (var383 == 5204) {
                                                                            class171.field3332[var7 + -1] = class221.method1494(class171.field3332[var7 + -1], false);
                                                                            continue;
                                                                        }
                                                                        if (var383 == 5205) {
                                                                            --var7;
                                                                            class111.method766(class171.field3332[var7], true);
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (var383 == 5100) {
                                                                        if (class247.field4513[86]) {
                                                                            class108.field1946[var6++] = 1;
                                                                        } else {
                                                                            class108.field1946[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -5102) {
                                                                        if (!class247.field4513[82]) {
                                                                            class108.field1946[var6++] = 0;
                                                                        } else {
                                                                            class108.field1946[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 5102) {
                                                                        if (class247.field4513[81]) {
                                                                            class108.field1946[var6++] = 1;
                                                                        } else {
                                                                            class108.field1946[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                }
                                                            } else if (~var383 == -4501) {
                                                                var6 -= 2;
                                                                int var249 = class108.field1946[var6 + 1];
                                                                int var250 = class108.field1946[var6];
                                                                class4 var251 = class216.method1469(var249, (byte) -2);
                                                                if (!var251.method17(-29)) {
                                                                    class108.field1946[var6++] = class22.method106((byte) 124, var250).method1267(-98, var251.field53, var249);
                                                                } else {
                                                                    class171.field3332[var7++] = class22.method106((byte) 124, var250).method1265(var251.field57, 63, var249);
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var383 == -4401) {
                                                            var6 -= 2;
                                                            int var252 = class108.field1946[var6];
                                                            int var253 = class108.field1946[var6 + 1];
                                                            class4 var254 = class216.method1469(var253, (byte) -8);
                                                            if (!var254.method17(-125)) {
                                                                class108.field1946[var6++] = class190.method1323(var252, -12450).method997((byte) -63, var254.field53, var253);
                                                            } else {
                                                                class171.field3332[var7++] = class190.method1323(var252, -12450).method1001(-25925, var254.field57, var253);
                                                            }
                                                            continue;
                                                        }
                                                    } else {
                                                        if (~var383 == -4101) {
                                                            --var7;
                                                            class88 var255 = class171.field3332[var7];
                                                            --var6;
                                                            int var256 = class108.field1946[var6];
                                                            class171.field3332[var7++] = class166.method1142(new class88[] { var255, class170.method1214(var256, 114) }, -3);
                                                            continue;
                                                        }
                                                        if (~var383 == -4102) {
                                                            var7 -= 2;
                                                            class88 var257 = class171.field3332[var7 + 1];
                                                            class88 var258 = class171.field3332[var7];
                                                            class171.field3332[var7++] = class166.method1142(new class88[] { var258, var257 }, -3);
                                                            continue;
                                                        }
                                                        if (~var383 == -4103) {
                                                            --var7;
                                                            class88 var259 = class171.field3332[var7];
                                                            --var6;
                                                            int var260 = class108.field1946[var6];
                                                            class171.field3332[var7++] = class166.method1142(new class88[] { var259, class50.method375((byte) 120, true, var260) }, -3);
                                                            continue;
                                                        }
                                                        if (~var383 == -4104) {
                                                            --var7;
                                                            class88 var261 = class171.field3332[var7];
                                                            class171.field3332[var7++] = var261.method639(127);
                                                            continue;
                                                        }
                                                        if (~var383 == -4105) {
                                                            --var6;
                                                            int var262 = class108.field1946[var6];
                                                            long var263 = ((long) var262 + 11745L) * 86400000L;
                                                            class22.field353.setTime(new Date(var263));
                                                            int var265 = class22.field353.get(5);
                                                            int var266 = class22.field353.get(2);
                                                            int var267 = class22.field353.get(1);
                                                            class171.field3332[var7++] = class166.method1142(new class88[] { class170.method1214(var265, 97), class119.field2173, class53.field992[var266], class119.field2173, class170.method1214(var267, 112) }, -3);
                                                            continue;
                                                        }
                                                        if (~var383 == -4106) {
                                                            var7 -= 2;
                                                            class88 var268 = class171.field3332[var7];
                                                            class88 var269 = class171.field3332[var7 + 1];
                                                            if (class240.field4458.field768 != null && class240.field4458.field768.field3959) {
                                                                class171.field3332[var7++] = var269;
                                                                continue;
                                                            }
                                                            class171.field3332[var7++] = var268;
                                                            continue;
                                                        }
                                                        if (~var383 == -4107) {
                                                            --var6;
                                                            int var270 = class108.field1946[var6];
                                                            class171.field3332[var7++] = class170.method1214(var270, 34);
                                                            continue;
                                                        }
                                                        if (var383 == 4107) {
                                                            var7 -= 2;
                                                            class108.field1946[var6++] = class171.field3332[var7].method627((byte) 126, class171.field3332[var7 + 1]);
                                                            continue;
                                                        }
                                                        if (var383 == 4108) {
                                                            var6 -= 2;
                                                            int var271 = class108.field1946[var6];
                                                            --var7;
                                                            class88 var272 = class171.field3332[var7];
                                                            int var273 = class108.field1946[var6 + 1];
                                                            byte[] var274 = class98.field1795.method941((byte) 56, 0, var273);
                                                            class41 var275 = new class41(var274);
                                                            var275.method149(class34.field587, (int[]) null);
                                                            class108.field1946[var6++] = var275.method163(var272, var271);
                                                            continue;
                                                        }
                                                        if (~var383 == -4110) {
                                                            var6 -= 2;
                                                            --var7;
                                                            class88 var276 = class171.field3332[var7];
                                                            int var277 = class108.field1946[var6 + 1];
                                                            int var278 = class108.field1946[var6];
                                                            byte[] var279 = class98.field1795.method941((byte) 56, 0, var277);
                                                            class41 var280 = new class41(var279);
                                                            var280.method149(class34.field587, (int[]) null);
                                                            class108.field1946[var6++] = var280.method156(var276, var278);
                                                            continue;
                                                        }
                                                        if (var383 == 4110) {
                                                            var7 -= 2;
                                                            class88 var281 = class171.field3332[var7 - -1];
                                                            class88 var282 = class171.field3332[var7];
                                                            --var6;
                                                            if (~class108.field1946[var6] == -2) {
                                                                class171.field3332[var7++] = var282;
                                                            } else {
                                                                class171.field3332[var7++] = var281;
                                                            }
                                                            continue;
                                                        }
                                                        if (var383 == 4111) {
                                                            --var7;
                                                            class88 var283 = class171.field3332[var7];
                                                            class171.field3332[var7++] = class26.method162(var283);
                                                            continue;
                                                        }
                                                        if (~var383 == -4113) {
                                                            --var6;
                                                            int var284 = class108.field1946[var6];
                                                            --var7;
                                                            class88 var285 = class171.field3332[var7];
                                                            if (var284 == -1) {
                                                                throw new RuntimeException("null char");
                                                            }
                                                            class171.field3332[var7++] = var285.method618(-120, var284);
                                                            continue;
                                                        }
                                                        if (~var383 == -4114) {
                                                            --var6;
                                                            int var286 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class221.method1491(7123, var286) ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -4115) {
                                                            --var6;
                                                            int var287 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class114.method784(false, var287) ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -4116) {
                                                            --var6;
                                                            int var288 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class109.method748(1, var288) ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var383 == -4117) {
                                                            --var6;
                                                            int var289 = class108.field1946[var6];
                                                            class108.field1946[var6++] = !class4.method24(var289, 0) ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var383 == 4117) {
                                                            --var7;
                                                            class88 var290 = class171.field3332[var7];
                                                            if (var290 == null) {
                                                                class108.field1946[var6++] = 0;
                                                            } else {
                                                                class108.field1946[var6++] = var290.method604((byte) -53);
                                                            }
                                                            continue;
                                                        }
                                                        if (~var383 == -4119) {
                                                            var6 -= 2;
                                                            --var7;
                                                            class88 var291 = class171.field3332[var7];
                                                            int var292 = class108.field1946[var6 + 1];
                                                            int var293 = class108.field1946[var6];
                                                            class171.field3332[var7++] = var291.method623(var293, (byte) -12, var292);
                                                            continue;
                                                        }
                                                        if (var383 == 4119) {
                                                            --var7;
                                                            class88 var294 = class171.field3332[var7];
                                                            class88 var295 = class165.method1137(var294.method604((byte) -53), (byte) 119);
                                                            boolean var296 = false;
                                                            for (int var297 = 0; var294.method604((byte) -53) > var297; ++var297) {
                                                                int var298 = var294.method599(255, var297);
                                                                if (~var298 == -61) {
                                                                    var296 = true;
                                                                } else if (~var298 == -63) {
                                                                    var296 = false;
                                                                } else if (!var296) {
                                                                    var295.method638(-81, var298);
                                                                }
                                                            }
                                                            var295.method629((byte) -36);
                                                            class171.field3332[var7++] = var295;
                                                            continue;
                                                        }
                                                        if (var383 == 4120) {
                                                            var6 -= 2;
                                                            --var7;
                                                            class88 var299 = class171.field3332[var7];
                                                            int var300 = class108.field1946[var6];
                                                            int var301 = class108.field1946[var6 + 1];
                                                            class108.field1946[var6++] = var299.method594((byte) 68, var300, var301);
                                                            continue;
                                                        }
                                                        if (var383 == 4121) {
                                                            var7 -= 2;
                                                            class88 var302 = class171.field3332[var7 + 1];
                                                            --var6;
                                                            int var303 = class108.field1946[var6];
                                                            class88 var304 = class171.field3332[var7];
                                                            class108.field1946[var6++] = var304.method634(var303, (byte) 41, var302);
                                                            continue;
                                                        }
                                                        if (var383 == 4122) {
                                                            --var6;
                                                            int var305 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class21.method102(-54, var305);
                                                            continue;
                                                        }
                                                        if (var383 == 4123) {
                                                            --var6;
                                                            int var306 = class108.field1946[var6];
                                                            class108.field1946[var6++] = class9.method51(var306, -45);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (~var383 == -3401) {
                                                        var6 -= 2;
                                                        int var307 = class108.field1946[var6];
                                                        int var308 = class108.field1946[var6 + 1];
                                                        class47 var309 = class167.method1150(var307, -113);
                                                        class171.field3332[var7++] = var309.method360(var308, (byte) -90);
                                                        continue;
                                                    }
                                                    if (var383 == 3408) {
                                                        var6 -= 4;
                                                        int var310 = class108.field1946[var6 - -1];
                                                        int var311 = class108.field1946[var6 + 2];
                                                        int var312 = class108.field1946[var6 - -3];
                                                        int var313 = class108.field1946[var6];
                                                        class47 var314 = class167.method1150(var311, -115);
                                                        if (~var314.field873 == ~var313 && var314.field882 == var310) {
                                                            if (var310 != 115) {
                                                                class108.field1946[var6++] = var314.method356(-1339210640, var312);
                                                            } else {
                                                                class171.field3332[var7++] = var314.method360(var312, (byte) -115);
                                                            }
                                                            continue;
                                                        }
                                                        if (~var310 != -116) {
                                                            class108.field1946[var6++] = 0;
                                                        } else {
                                                            class171.field3332[var7++] = class14.field207;
                                                        }
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var383 == 3300) {
                                                    class108.field1946[var6++] = class117.field2115;
                                                    continue;
                                                }
                                                if (var383 == 3301) {
                                                    var6 -= 2;
                                                    int var315 = class108.field1946[var6 + 1];
                                                    int var316 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class39.method255(var315, false, var316);
                                                    continue;
                                                }
                                                if (~var383 == -3303) {
                                                    var6 -= 2;
                                                    int var317 = class108.field1946[var6];
                                                    int var318 = class108.field1946[var6 + 1];
                                                    class108.field1946[var6++] = class109.method749((byte) -37, var317, var318);
                                                    continue;
                                                }
                                                if (var383 == 3303) {
                                                    var6 -= 2;
                                                    int var319 = class108.field1946[var6 - -1];
                                                    int var320 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class246.method1610(var320, 38, var319);
                                                    continue;
                                                }
                                                if (~var383 == -3305) {
                                                    --var6;
                                                    int var321 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class67.method458(var321, -84).field2069;
                                                    continue;
                                                }
                                                if (var383 == 3305) {
                                                    --var6;
                                                    int var322 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class105.field1909[var322];
                                                    continue;
                                                }
                                                if (var383 == 3306) {
                                                    --var6;
                                                    int var323 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class217.field4068[var323];
                                                    continue;
                                                }
                                                if (~var383 == -3308) {
                                                    --var6;
                                                    int var324 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class179.field3564[var324];
                                                    continue;
                                                }
                                                if (~var383 == -3309) {
                                                    int var325 = class149.field2909;
                                                    int var326 = (class240.field4458.field4123 >> 7) + class190.field3681;
                                                    int var327 = (class240.field4458.field4138 >> 7) + class223.field4214;
                                                    class108.field1946[var6++] = (var325 << 28) + (var327 << 14) + var326;
                                                    continue;
                                                }
                                                if (var383 == 3309) {
                                                    --var6;
                                                    int var328 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class70.method470(268433753, var328) >> 14;
                                                    continue;
                                                }
                                                if (~var383 == -3311) {
                                                    --var6;
                                                    int var329 = class108.field1946[var6];
                                                    class108.field1946[var6++] = var329 >> 28;
                                                    continue;
                                                }
                                                if (var383 == 3311) {
                                                    --var6;
                                                    int var330 = class108.field1946[var6];
                                                    class108.field1946[var6++] = class70.method470(var330, 16383);
                                                    continue;
                                                }
                                                if (~var383 == -3313) {
                                                    class108.field1946[var6++] = !class67.field1215 ? 0 : 1;
                                                    continue;
                                                }
                                                if (var383 == 3313) {
                                                    var6 -= 2;
                                                    int var331 = class108.field1946[var6 + 1];
                                                    int var332 = class108.field1946[var6] + 32768;
                                                    class108.field1946[var6++] = class39.method255(var331, false, var332);
                                                    continue;
                                                }
                                                if (var383 == 3314) {
                                                    var6 -= 2;
                                                    int var333 = class108.field1946[var6] + 32768;
                                                    int var334 = class108.field1946[var6 + 1];
                                                    class108.field1946[var6++] = class109.method749((byte) -37, var333, var334);
                                                    continue;
                                                }
                                                if (~var383 == -3316) {
                                                    var6 -= 2;
                                                    int var335 = class108.field1946[var6] + 32768;
                                                    int var336 = class108.field1946[var6 + 1];
                                                    class108.field1946[var6++] = class246.method1610(var335, 33, var336);
                                                    continue;
                                                }
                                                if (var383 == 3316) {
                                                    if (~class67.field1208 > -3) {
                                                        class108.field1946[var6++] = 0;
                                                    } else {
                                                        class108.field1946[var6++] = class67.field1208;
                                                    }
                                                    continue;
                                                }
                                                if (~var383 == -3318) {
                                                    class108.field1946[var6++] = class114.field2063;
                                                    continue;
                                                }
                                                if (var383 == 3318) {
                                                    class108.field1946[var6++] = class28.field470;
                                                    continue;
                                                }
                                                if (var383 == 3321) {
                                                    class108.field1946[var6++] = class240.field4460;
                                                    continue;
                                                }
                                                if (var383 == 3322) {
                                                    class108.field1946[var6++] = class199.field3790;
                                                    continue;
                                                }
                                                if (~var383 == -3324) {
                                                    if (class29.field479 >= 5 && class29.field479 <= 9) {
                                                        class108.field1946[var6++] = 1;
                                                        continue;
                                                    }
                                                    class108.field1946[var6++] = 0;
                                                    continue;
                                                }
                                                if (var383 == 3324) {
                                                    if (~class29.field479 <= -6 && ~class29.field479 >= -10) {
                                                        class108.field1946[var6++] = class29.field479;
                                                        continue;
                                                    }
                                                    class108.field1946[var6++] = 0;
                                                    continue;
                                                }
                                                if (~var383 == -3326) {
                                                    if (class6.field72 > 0) {
                                                        class108.field1946[var6++] = 1;
                                                    } else {
                                                        class108.field1946[var6++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (var383 == 3326) {
                                                    class108.field1946[var6++] = class240.field4458.field747;
                                                    continue;
                                                }
                                                if (~var383 == -3328) {
                                                    class108.field1946[var6++] = class240.field4458.field768.field3959 ? 1 : 0;
                                                    continue;
                                                }
                                                if (~var383 == -3329) {
                                                    class108.field1946[var6++] = class238.field4430;
                                                    continue;
                                                }
                                                if (var383 == 3329) {
                                                    class108.field1946[var6++] = class176.field3537;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            if (~var383 == -3101) {
                                                --var7;
                                                class88 var337 = class171.field3332[var7];
                                                class223.method1501(var337, 12, 0, class81.field1468);
                                                continue;
                                            }
                                            if (~var383 == -3102) {
                                                var6 -= 2;
                                                class226.method1517((byte) -31, class108.field1946[var6], class108.field1946[var6 + 1], class240.field4458);
                                                continue;
                                            }
                                            if (var383 == 3103) {
                                                class29.method174(-4);
                                                continue;
                                            }
                                            if (~var383 == -3105) {
                                                ++class10.field149;
                                                --var7;
                                                class88 var338 = class171.field3332[var7];
                                                int var339 = 0;
                                                if (var338.method621(10)) {
                                                    var339 = var338.method603(false);
                                                }
                                                class146.field2749.method30((byte) -89, 152);
                                                class146.field2749.method338(2112555600, var339);
                                                continue;
                                            }
                                            if (var383 == 3105) {
                                                ++class129.field2420;
                                                --var7;
                                                class88 var340 = class171.field3332[var7];
                                                class146.field2749.method30((byte) -110, 54);
                                                class146.field2749.method328(var340.method630(false), (byte) -120);
                                                continue;
                                            }
                                            if (~var383 == -3107) {
                                                ++class31.field500;
                                                --var7;
                                                class88 var341 = class171.field3332[var7];
                                                class146.field2749.method30((byte) -39, 60);
                                                class146.field2749.method346(255, 1 + var341.method604((byte) -53));
                                                class146.field2749.method336(var341, (byte) 0);
                                                continue;
                                            }
                                            if (~var383 == -3108) {
                                                --var6;
                                                int var342 = class108.field1946[var6];
                                                --var7;
                                                class88 var343 = class171.field3332[var7];
                                                class17.method82(1, var343, var342);
                                                continue;
                                            }
                                            if (~var383 == -3109) {
                                                var6 -= 3;
                                                int var344 = class108.field1946[var6];
                                                int var345 = class108.field1946[var6 - -1];
                                                int var346 = class108.field1946[var6 + 2];
                                                class174 var347 = class239.method1581(-64, var346);
                                                class80.method532(var344, 2, var345, var347);
                                                continue;
                                            }
                                            if (var383 == 3109) {
                                                var6 -= 2;
                                                int var348 = class108.field1946[var6];
                                                int var349 = class108.field1946[var6 + 1];
                                                class174 var350 = !var44 ? class129.field2428 : class203.field3873;
                                                class80.method532(var348, 2, var349, var350);
                                                continue;
                                            }
                                            if (~var383 == -3111) {
                                                ++class217.field4066;
                                                --var6;
                                                int var351 = class108.field1946[var6];
                                                class146.field2749.method30((byte) -117, 194);
                                                class146.field2749.method305(82, var351);
                                                continue;
                                            }
                                        }
                                    } else {
                                        if (~var383 == -2701) {
                                            --var6;
                                            class174 var352 = class239.method1581(-64, class108.field1946[var6]);
                                            class108.field1946[var6++] = var352.field3401;
                                            continue;
                                        }
                                        if (~var383 == -2702) {
                                            --var6;
                                            class174 var353 = class239.method1581(-64, class108.field1946[var6]);
                                            if (var353.field3401 == -1) {
                                                class108.field1946[var6++] = 0;
                                            } else {
                                                class108.field1946[var6++] = var353.field3484;
                                            }
                                            continue;
                                        }
                                        if (~var383 == -2703) {
                                            --var6;
                                            int var354 = class108.field1946[var6];
                                            class168 var355 = (class168) class128.field2397.method1051(-1, (long) var354);
                                            if (var355 == null) {
                                                class108.field1946[var6++] = 0;
                                            } else {
                                                class108.field1946[var6++] = 1;
                                            }
                                            continue;
                                        }
                                        if (~var383 == -2704) {
                                            --var6;
                                            class174 var356 = class239.method1581(-64, class108.field1946[var6]);
                                            if (var356.field3467 == null) {
                                                class108.field1946[var6++] = 0;
                                                continue;
                                            }
                                            int var357 = var356.field3467.length;
                                            for (int var358 = 0; var358 < var356.field3467.length; ++var358) {
                                                if (var356.field3467[var358] == null) {
                                                    var357 = var358;
                                                    break;
                                                }
                                            }
                                            class108.field1946[var6++] = var357;
                                            continue;
                                        }
                                        if (var383 == 2704 || var383 == 2705) {
                                            var6 -= 2;
                                            int var359 = class108.field1946[var6];
                                            int var360 = class108.field1946[var6 - -1];
                                            class168 var361 = (class168) class128.field2397.method1051(-1, (long) var359);
                                            if (var361 != null && var361.field3231 == var360) {
                                                class108.field1946[var6++] = 1;
                                                continue;
                                            }
                                            class108.field1946[var6++] = 0;
                                            continue;
                                        }
                                    }
                                } else {
                                    class174 var362;
                                    if (~var383 > -2001) {
                                        var362 = var44 ? class203.field3873 : class129.field2428;
                                    } else {
                                        --var6;
                                        var362 = class239.method1581(-64, class108.field1946[var6]);
                                        var383 -= 1000;
                                    }
                                    if (var383 == 1300) {
                                        --var6;
                                        int var363 = -1 + class108.field1946[var6];
                                        if (var363 >= 0 && var363 <= 9) {
                                            --var7;
                                            var362.method1255((byte) -127, class171.field3332[var7], var363);
                                            continue;
                                        }
                                        --var7;
                                        continue;
                                    }
                                    if (~var383 == -1302) {
                                        var6 -= 2;
                                        int var364 = class108.field1946[var6];
                                        int var365 = class108.field1946[var6 + 1];
                                        var362.field3504 = class36.method238(var365, var364, true);
                                        continue;
                                    }
                                    if (~var383 == -1303) {
                                        --var6;
                                        var362.field3429 = class108.field1946[var6] == 1;
                                        continue;
                                    }
                                    if (~var383 == -1304) {
                                        --var6;
                                        var362.field3415 = class108.field1946[var6];
                                        continue;
                                    }
                                    if (var383 == 1304) {
                                        --var6;
                                        var362.field3477 = class108.field1946[var6];
                                        continue;
                                    }
                                    if (var383 == 1305) {
                                        --var7;
                                        var362.field3459 = class171.field3332[var7];
                                        continue;
                                    }
                                    if (var383 == 1306) {
                                        --var7;
                                        var362.field3514 = class171.field3332[var7];
                                        continue;
                                    }
                                    if (var383 == 1307) {
                                        var362.field3375 = null;
                                        continue;
                                    }
                                }
                            } else {
                                class174 var366;
                                if (~var383 <= -2001) {
                                    --var6;
                                    var366 = class239.method1581(-64, class108.field1946[var6]);
                                    var383 -= 1000;
                                } else {
                                    var366 = !var44 ? class129.field2428 : class203.field3873;
                                }
                                if (~var383 == -1101) {
                                    var6 -= 2;
                                    var366.field3395 = class108.field1946[var6];
                                    if (-var366.field3382 + var366.field3386 < var366.field3395) {
                                        var366.field3395 = -var366.field3382 + var366.field3386;
                                    }
                                    if (var366.field3395 < 0) {
                                        var366.field3395 = 0;
                                    }
                                    var366.field3417 = class108.field1946[var6 + 1];
                                    if (~var366.field3417 < ~(-var366.field3424 + var366.field3377)) {
                                        var366.field3417 = -var366.field3424 + var366.field3377;
                                    }
                                    if (var366.field3417 < 0) {
                                        var366.field3417 = 0;
                                    }
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1102) {
                                    --var6;
                                    var366.field3416 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1103) {
                                    --var6;
                                    var366.field3498 = class108.field1946[var6] == 1;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1103) {
                                    --var6;
                                    var366.field3482 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1104) {
                                    --var6;
                                    var366.field3499 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1106) {
                                    --var6;
                                    var366.field3475 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1107) {
                                    --var6;
                                    var366.field3439 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1107) {
                                    --var6;
                                    var366.field3422 = class108.field1946[var6] == 1;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1108) {
                                    var366.field3432 = 1;
                                    --var6;
                                    var366.field3411 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1110) {
                                    var6 -= 6;
                                    var366.field3367 = class108.field1946[var6];
                                    var366.field3500 = class108.field1946[var6 + 1];
                                    var366.field3457 = class108.field1946[var6 - -2];
                                    var366.field3511 = class108.field1946[var6 + 3];
                                    var366.field3519 = class108.field1946[var6 - -4];
                                    var366.field3487 = class108.field1946[var6 - -5];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1110) {
                                    --var6;
                                    int var367 = class108.field1946[var6];
                                    if (var366.field3406 != var367) {
                                        var366.field3489 = 0;
                                        var366.field3406 = var367;
                                        var366.field3381 = 0;
                                        class200.method1373(65280, var366);
                                    }
                                    continue;
                                }
                                if (~var383 == -1112) {
                                    --var6;
                                    var366.field3405 = class108.field1946[var6] == 1;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1113) {
                                    --var7;
                                    class88 var368 = class171.field3332[var7];
                                    if (!var368.method597(-110, var366.field3385)) {
                                        var366.field3385 = var368;
                                        class200.method1373(65280, var366);
                                    }
                                    continue;
                                }
                                if (var383 == 1113) {
                                    --var6;
                                    var366.field3463 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1114) {
                                    var6 -= 3;
                                    var366.field3481 = class108.field1946[var6];
                                    var366.field3471 = class108.field1946[var6 + 1];
                                    var366.field3398 = class108.field1946[var6 + 2];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1116) {
                                    --var6;
                                    var366.field3437 = class108.field1946[var6] == 1;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1116) {
                                    --var6;
                                    var366.field3431 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (~var383 == -1118) {
                                    --var6;
                                    var366.field3427 = class108.field1946[var6];
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1118) {
                                    --var6;
                                    var366.field3389 = ~class108.field1946[var6] == -2;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1119) {
                                    --var6;
                                    var366.field3485 = class108.field1946[var6] == 1;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                                if (var383 == 1120) {
                                    var6 -= 2;
                                    var366.field3386 = class108.field1946[var6];
                                    var366.field3377 = class108.field1946[var6 - -1];
                                    class200.method1373(65280, var366);
                                    if (~var366.field3392 == -1) {
                                        class110.method761(false, var366, (byte) 13);
                                    }
                                    continue;
                                }
                                if (var383 == 1121) {
                                    class200.method1373(65280, var366);
                                    --var6;
                                    continue;
                                }
                                if (~var383 == -1123) {
                                    --var6;
                                    var366.field3479 = ~class108.field1946[var6] == -2;
                                    class200.method1373(65280, var366);
                                    continue;
                                }
                            }
                        } else {
                            class174 var369;
                            if (~var383 > -2001) {
                                var369 = !var44 ? class129.field2428 : class203.field3873;
                            } else {
                                var383 -= 1000;
                                --var6;
                                var369 = class239.method1581(-64, class108.field1946[var6]);
                            }
                            if (var383 == 1000) {
                                var369.field3369 = 0;
                                var6 -= 2;
                                var369.field3368 = var369.field3393 = class108.field1946[var6];
                                var369.field3453 = 0;
                                var369.field3443 = var369.field3516 = class108.field1946[var6 + 1];
                                class200.method1373(65280, var369);
                                continue;
                            }
                            if (var383 == 1001) {
                                var369.field3465 = 0;
                                var6 -= 2;
                                var369.field3382 = var369.field3503 = class108.field1946[var6];
                                var369.field3470 = 0;
                                var369.field3396 = 0;
                                var369.field3424 = var369.field3420 = class108.field1946[var6 + 1];
                                var369.field3419 = 0;
                                class200.method1373(65280, var369);
                                if (var369.field3392 == 0) {
                                    class110.method761(false, var369, (byte) 120);
                                }
                                class2.method10(var369, (byte) 126);
                                continue;
                            }
                            if (var383 == 1003) {
                                --var6;
                                boolean var370 = ~class108.field1946[var6] == -2;
                                if (!var369.field3380 != !var370) {
                                    var369.field3380 = var370;
                                    class200.method1373(65280, var369);
                                }
                                continue;
                            }
                            if (~var383 == -1005) {
                                var6 -= 4;
                                var369.field3393 = class108.field1946[var6];
                                var369.field3516 = class108.field1946[var6 + 1];
                                int var371 = class108.field1946[var6 + 2];
                                int var372 = class108.field1946[var6 + 3];
                                if (var372 < 0) {
                                    var372 = 0;
                                } else if (~var372 < -3) {
                                    var372 = 2;
                                }
                                var369.field3453 = (byte) (var372 + 3);
                                if (~var371 > -1) {
                                    var371 = 0;
                                } else if (var371 > 2) {
                                    var371 = 2;
                                }
                                var369.field3369 = (byte) (var371 + 3);
                                class200.method1373(65280, var369);
                                class2.method10(var369, (byte) 102);
                                continue;
                            }
                            if (var383 == 1005) {
                                var369.field3369 = 2;
                                var6 -= 2;
                                var369.field3393 = class108.field1946[var6];
                                var369.field3453 = 2;
                                var369.field3516 = class108.field1946[var6 - -1];
                                class200.method1373(65280, var369);
                                if (~var369.field3392 == -1) {
                                    class110.method761(false, var369, (byte) -117);
                                }
                                class2.method10(var369, (byte) 125);
                                continue;
                            }
                        }
                    } else {
                        if (~var383 == -404) {
                            var6 -= 2;
                            int var373 = class108.field1946[var6];
                            if (var373 >= 7) {
                                var373 -= 7;
                            }
                            int var374 = class108.field1946[var6 + 1];
                            class240.field4458.field768.method1437(var373, (byte) -47, var374);
                            continue;
                        }
                        if (~var383 == -405) {
                            var6 -= 2;
                            int var375 = class108.field1946[var6 + 1];
                            int var376 = class108.field1946[var6];
                            class240.field4458.field768.method1434((byte) -95, var375, var376);
                            continue;
                        }
                        if (~var383 == -411) {
                            --var6;
                            boolean var377 = ~class108.field1946[var6] != -1;
                            class240.field4458.field768.method1436(11, var377);
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var382) {
                if (var5.field4532 != null) {
                    class88 var379 = class165.method1137(30, (byte) 121);
                    var379.method616(class156.field3012, (byte) -62).method616(var5.field4532, (byte) 114);
                    for (int var380 = class230.field4320 + -1; ~var380 <= -1; --var380) {
                        var379.method616(class22.field356, (byte) 102).method616(class80.field1446[var380].field2607.field4532, (byte) -73);
                    }
                    if (var10 == 40) {
                        int var381 = var9[var8];
                        var379.method616(class134.field2498, (byte) 60).method616(class170.method1214(var381, 62), (byte) 109);
                    }
                    if (~class115.field2073 != -1) {
                        class223.method1501(class166.method1142(new class88[] { class18.field288, var5.field4532 }, -3), 12, 0, class81.field1468);
                    }
                    class221.method1490((byte) 0, "CS2 - scr:" + var5.field1219 + " op:" + var10 + new String(var379.method613(-113)), var382);
                } else {
                    if (~class115.field2073 != -1) {
                        class223.method1501(class179.field3565, 12, 0, class81.field1468);
                    }
                    class221.method1490((byte) 0, "CS2 - scr:" + var5.field1219 + " op:" + var10, var382);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.method901(arg0.method304(arg1 + -29626), (byte) -88);
        }
        if (arg1 != -3) {
            this.field2524 = -112;
        }
        ++field2519;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field2515;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (arg1 != 13) {
            return null;
        } else {
            if (super.field364.field4312) {
                int[] var4 = var3[0];
                int[] var5 = var3[2];
                int[] var6 = var3[1];
                for (int var7 = 0; class70.field1276 > var7; ++var7) {
                    var4[var7] = this.field2507;
                    var6[var7] = this.field2524;
                    var5[var7] = this.field2522;
                }
            }
            return var3;
        }
    }
}
