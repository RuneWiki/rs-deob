import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class215 extends class270 {

    @OriginalMember(owner = "client!q", name = "X", descriptor = "[I")
    private int[] field3645 = new int[257];

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Lmh;")
    private static class62 field3644 = class201.method1405(true, "Loading)3)3)3");

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "Lmh;")
    public static class62 field3650 = field3644;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field3646 = 0;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "Lmh;")
    public static class62 field3651 = class201.method1405(true, "::rect_debug");

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "[[Lrl;")
    public static class307[][] field3648 = new class307[13][13];

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "Lmh;")
    public static class62 field3659 = class201.method1405(true, "Nehmen");

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "Z")
    public static boolean field3652 = false;

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "Lmh;")
    public static class62 field3658 = class201.method1405(true, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "Lmh;")
    public static class62 field3660 = class201.method1405(true, ":allyreq:");

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "[[I")
    private int[][] field3654;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lhi;B)V", line = 13)
    public static final void method1517(class26 arg0, byte arg1) {
        int var2 = -79 % ((84 - arg1) / 33);
        class184.field2954 = arg0.method153((byte) 110, class115.field1933);
        field3653++;
        class256.field4321 = arg0.method153((byte) 110, class7.field69);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)[[I", line = 27)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            return (int[][]) ((int[][]) null);
        }
        field3649++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[] var4 = this.method1850(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class109.field1770; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3645[var9];
                var5[var8] = class234.method1648(var10, 16711680) >> 12;
                var7[var8] = class234.method1648(4080, var10 >> 4);
                var6[var8] = class234.method1648(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)V", line = 79)
    public static final void method1518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class170.field2770 = 0;
        field3655++;
        for (int var7 = -1; var7 < (class133.field2163 + class118.field1975); var7++) {
            class222 var8;
            if (var7 == -1) {
                var8 = class268.field4551;
            } else if (var7 < class118.field1975) {
                var8 = class5.field50[class98.field1617[var7]];
            } else {
                var8 = class301.field5186[class288.field4914[var7 - class118.field1975]];
            }
            if (var8 != null && var8.method1100(26422)) {
                if (var8 instanceof class204) {
                    class275 var9 = ((class204) var8).field3435;
                    if (var9.field4720 != null) {
                        var9 = var9.method1878(false);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class118.field1975) {
                    class275 var15 = ((class204) var8).field3435;
                    if (var15.field4720 != null) {
                        var15 = var15.method1878(false);
                    }
                    if (var15.field4683 >= 0 && var15.field4683 < class109.field1761.length) {
                        int var16;
                        if (var15.field4671 == -1) {
                            var16 = var8.method1582(20479) + 15;
                        } else {
                            var16 = var15.field4671 + 15;
                        }
                        class12.method48(arg1 >> 1, (byte) -75, arg2, arg5 >> 1, arg3, var16, var8);
                        if (class62.field934 > -1) {
                            class109.field1761[var15.field4683].method305(class62.field934 + arg6 - 12, arg4 + -30 + class148.field2327);
                        }
                    }
                    class133[] var17 = class189.field3012;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class133 var19 = var17[var18];
                        if (var19 != null && var19.field2171 == 1 && class288.field4914[var7 - class118.field1975] == var19.field2173 && (class199.field3367 % 20) < 10) {
                            int var20;
                            if (var15.field4671 == -1) {
                                var20 = var8.method1582(20479) + 15;
                            } else {
                                var20 = var15.field4671 + 15;
                            }
                            class12.method48(arg1 >> 1, (byte) 120, arg2, arg5 >> 1, arg3, var20, var8);
                            if (class62.field934 > -1) {
                                class298.field5088[var19.field2158].method305(arg6 + class62.field934 - 12, arg4 - 28 + class148.field2327);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class153 var11 = (class153) var8;
                    if (var11.field2413 != -1 || var11.field2412 != -1) {
                        class12.method48(arg1 >> 1, (byte) 122, arg2, arg5 >> 1, arg3, var8.method1582(20479) + 15, var8);
                        if (class62.field934 > -1) {
                            if (var11.field2413 != -1) {
                                class286.field4890[var11.field2413].method305(class62.field934 + arg6 - 12, class148.field2327 - var10 + arg4);
                                var10 += 25;
                            }
                            if (var11.field2412 != -1) {
                                class109.field1761[var11.field2412].method305(class62.field934 + arg6 - 12, -var10 + class148.field2327 + arg4);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class133[] var12 = class189.field3012;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class133 var14 = var12[var13];
                            if (var14 != null && var14.field2171 == 10 && class98.field1617[var7] == var14.field2173) {
                                class12.method48(arg1 >> 1, (byte) -85, arg2, arg5 >> 1, arg3, var8.method1582(20479) + 15, var8);
                                if (class62.field934 > -1) {
                                    class298.field5088[var14.field2158].method305(arg6 + class62.field934 - 12, -var10 + arg4 - -class148.field2327);
                                }
                            }
                        }
                    }
                }
                if (var8.field3869 != null && (class118.field1975 <= var7 || class7.field68 == 0 || class7.field68 == 3 || class7.field68 == 1 && class256.method1781(((class153) var8).field2430, (byte) 37))) {
                    class12.method48(arg1 >> 1, (byte) -49, arg2, arg5 >> 1, arg3, var8.method1582(20479), var8);
                    if (class62.field934 > -1 && class201.field3400 > class170.field2770) {
                        class201.field3412[class170.field2770] = class296.field5047.method2040(var8.field3869) / 2;
                        class201.field3393[class170.field2770] = class296.field5047.field5109;
                        class201.field3414[class170.field2770] = class62.field934;
                        class201.field3397[class170.field2770] = class148.field2327;
                        class201.field3394[class170.field2770] = var8.field3850;
                        class201.field3402[class170.field2770] = var8.field3825;
                        class201.field3404[class170.field2770] = var8.field3844;
                        class201.field3407[class170.field2770] = var8.field3869;
                        class170.field2770++;
                    }
                }
                if (var8.field3863 > class199.field3367) {
                    class135 var21 = class151.field2379[0];
                    class135 var22 = class151.field2379[1];
                    int var26;
                    if (var8 instanceof class204) {
                        class204 var23 = (class204) var8;
                        class135[] var24 = (class135[]) ((class135[]) class102.field1688.method1396(0, (long) var23.field3435.field4661));
                        if (var24 == null) {
                            var24 = class49.method319(class53.field781, 0, 29956, var23.field3435.field4661);
                            if (var24 != null) {
                                class102.field1688.method1397((long) var23.field3435.field4661, var24, true);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[0];
                            var22 = var24[1];
                        }
                        class275 var25 = var23.field3435;
                        if (var25.field4671 == -1) {
                            var26 = var8.method1582(20479);
                        } else {
                            var26 = var25.field4671;
                        }
                    } else {
                        var26 = var8.method1582(20479);
                    }
                    class12.method48(arg1 >> 1, (byte) -95, arg2, arg5 >> 1, arg3, var26 + var21.field2202 + 10, var8);
                    if (class62.field934 > -1) {
                        int var27 = class62.field934 + arg6 - (var21.field2207 >> 1);
                        int var28 = arg4 + class148.field2327 - 3;
                        var21.method305(var27, var28);
                        int var29 = var21.field2202;
                        int var30 = var8.field3867 * var21.field2207 / 255;
                        class311.method2109(var27, var28, var27 + var30, var28 + var29);
                        var22.method305(var27, var28);
                        class311.method2118(arg6, arg4, arg5 + arg6, arg4 - -arg1);
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class199.field3367 < var8.field3874[var31]) {
                        int var34;
                        if (var8 instanceof class204) {
                            class204 var32 = (class204) var8;
                            class275 var33 = var32.field3435;
                            if (var33.field4671 == -1) {
                                var34 = var8.method1582(20479) / 2;
                            } else {
                                var34 = var33.field4671 / 2;
                            }
                        } else {
                            var34 = var8.method1582(20479) / 2;
                        }
                        class12.method48(arg1 >> 1, (byte) -45, arg2, arg5 >> 1, arg3, var34, var8);
                        if (class62.field934 > -1) {
                            if (var31 == 1) {
                                class148.field2327 -= 20;
                            }
                            if (var31 == 2) {
                                class148.field2327 -= 10;
                                class62.field934 -= 15;
                            }
                            if (var31 == 3) {
                                class62.field934 += 15;
                                class148.field2327 -= 10;
                            }
                            class1.field5[var8.field3812[var31]].method305(class62.field934 + arg6 - 12, class148.field2327 + arg4 + -12);
                            class125.field2097.method2018(class42.method284(var8.field3841[var31], -126), arg6 + class62.field934 - 1, class148.field2327 + arg4 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class170.field2770; var35++) {
            int var36 = class201.field3414[var35];
            int var37 = class201.field3412[var35];
            int var38 = class201.field3397[var35];
            boolean var39 = true;
            int var40 = class201.field3393[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var38 + 2 > class201.field3397[var41] - class201.field3393[var41] && (class201.field3397[var41] + 2) > (var38 - var40) && class201.field3414[var41] + class201.field3412[var41] > -var37 + var36 && (class201.field3414[var41] - class201.field3412[var41]) < (var36 + var37) && (class201.field3397[var41] - class201.field3393[var41]) < var38) {
                        var39 = true;
                        var38 = class201.field3397[var41] - class201.field3393[var41];
                    }
                }
            }
            class62.field934 = class201.field3414[var35];
            class148.field2327 = class201.field3397[var35] = var38;
            class62 var42 = class201.field3407[var35];
            if (class4.field39 == 0) {
                int var43 = 16776960;
                if (class201.field3394[var35] < 6) {
                    var43 = class225.field3917[class201.field3394[var35]];
                }
                if (class201.field3394[var35] == 6) {
                    var43 = (class282.field4815 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class201.field3394[var35] == 7) {
                    var43 = class282.field4815 % 20 < 10 ? 255 : 65535;
                }
                if (class201.field3394[var35] == 8) {
                    var43 = (class282.field4815 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class201.field3394[var35] == 9) {
                    int var44 = 150 - class201.field3404[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 65280 - 500;
                    }
                }
                if (class201.field3394[var35] == 10) {
                    int var45 = 150 - class201.field3404[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 33095935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 - ((var45 + -100) * 5) - 32768000;
                    }
                }
                if (class201.field3394[var35] == 11) {
                    int var46 = 150 - class201.field3404[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = ((var46 - 50) * 327685) + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class201.field3402[var35] == 0) {
                    class296.field5047.method2018(var42, class62.field934 + arg6, class148.field2327 + arg4, var43, 0);
                }
                if (class201.field3402[var35] == 1) {
                    class296.field5047.method2039(var42, class62.field934 + arg6, arg4 - -class148.field2327, var43, 0, class282.field4815);
                }
                if (class201.field3402[var35] == 2) {
                    class296.field5047.method2030(var42, class62.field934 + arg6, arg4 - -class148.field2327, var43, 0, class282.field4815);
                }
                if (class201.field3402[var35] == 3) {
                    class296.field5047.method2028(var42, class62.field934 + arg6, arg4 - -class148.field2327, var43, 0, class282.field4815, 150 - class201.field3404[var35]);
                }
                if (class201.field3402[var35] == 4) {
                    int var47 = (150 - class201.field3404[var35]) * (class296.field5047.method2040(var42) + 100) / 150;
                    class311.method2109(class62.field934 + arg6 - 50, arg4, class62.field934 + arg6 + 50, arg1 + arg4);
                    class296.field5047.method2021(var42, class62.field934 + arg6 + 50 - var47, arg4 - -class148.field2327, var43, 0);
                    class311.method2118(arg6, arg4, arg5 + arg6, arg1 + arg4);
                }
                if (class201.field3402[var35] == 5) {
                    int var48 = 150 - class201.field3404[var35];
                    class311.method2109(arg6, arg4 + class148.field2327 - class296.field5047.field5109 - 1, arg5 + arg6, class148.field2327 + arg4 + 5);
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class296.field5047.method2018(var42, class62.field934 + arg6, arg4 - -var49 + class148.field2327, var43, 0);
                    class311.method2118(arg6, arg4, arg5 + arg6, arg4 - -arg1);
                }
            } else {
                class296.field5047.method2018(var42, class62.field934 + arg6, class148.field2327 + arg4, 16776960, 0);
            }
        }
        if (arg0 > -119) {
            field3646 = 24;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 554)
    public class215() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lmi;II)V", line = 558)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field3641++;
        int var4 = 100 / ((arg2 + 8) / 53);
        if (arg1 != 0) {
            return;
        }
        int var5 = arg0.method702(-1);
        if (var5 != 0) {
            this.method1521(var5, true);
            return;
        }
        this.field3654 = new int[arg0.method702(-1)][4];
        for (int var6 = 0; var6 < this.field3654.length; var6++) {
            this.field3654[var6][0] = arg0.method721(89);
            this.field3654[var6][1] = arg0.method702(-1) << 4;
            this.field3654[var6][2] = arg0.method702(-1) << 4;
            this.field3654[var6][3] = arg0.method702(-1) << 4;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 633)
    public static final void method1519(int arg0) {
        class270.field4575.method1395((byte) -43);
        field3657++;
        if (arg0 < 72) {
            method1520(true);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 646)
    public static void method1520(boolean arg0) {
        field3644 = null;
        field3658 = null;
        field3651 = null;
        field3660 = null;
        if (!arg0) {
            field3652 = false;
        }
        field3659 = null;
        field3648 = (class307[][]) null;
        field3650 = null;
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(B)V", line = 662)
    public final void method231(byte arg0) {
        if (this.field3654 == null) {
            this.method1521(1, true);
        }
        field3643++;
        if (arg0 != 90) {
            this.method8((class92) null, 65, -28);
        }
        this.method1522(16483);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V", line = 681)
    private final void method1521(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field3642++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            this.field3654 = new int[2][4];
            this.field3654[0][1] = 0;
            this.field3654[0][2] = 0;
            this.field3654[1][1] = 4096;
            this.field3654[1][2] = 4096;
            this.field3654[0][3] = 0;
            this.field3654[0][0] = 0;
            this.field3654[1][0] = 4096;
            this.field3654[1][3] = 4096;
        } else if (arg0 == 2) {
            this.field3654 = new int[8][4];
            this.field3654[0][1] = 2650;
            this.field3654[1][1] = 2313;
            this.field3654[0][0] = 0;
            this.field3654[0][2] = 2602;
            this.field3654[0][3] = 2361;
            this.field3654[1][0] = 2867;
            this.field3654[1][2] = 1799;
            this.field3654[2][0] = 3072;
            this.field3654[1][3] = 1558;
            this.field3654[2][2] = 1734;
            this.field3654[3][0] = 3276;
            this.field3654[2][1] = 2618;
            this.field3654[4][0] = 3481;
            this.field3654[3][2] = 1220;
            this.field3654[3][1] = 2296;
            this.field3654[2][3] = 1413;
            this.field3654[4][2] = 963;
            this.field3654[5][0] = 3686;
            this.field3654[6][0] = 3891;
            this.field3654[7][0] = 4096;
            this.field3654[5][2] = 2152;
            this.field3654[6][2] = 1060;
            this.field3654[7][2] = 1413;
            this.field3654[3][3] = 947;
            this.field3654[4][1] = 2072;
            this.field3654[4][3] = 722;
            this.field3654[5][1] = 2730;
            this.field3654[6][1] = 2232;
            this.field3654[5][3] = 1766;
            this.field3654[6][3] = 915;
            this.field3654[7][3] = 1140;
            this.field3654[7][1] = 1686;
        } else if (arg0 == 3) {
            this.field3654 = new int[7][4];
            this.field3654[0][2] = 0;
            this.field3654[0][1] = 0;
            this.field3654[0][3] = 4096;
            this.field3654[1][1] = 0;
            this.field3654[1][2] = 4096;
            this.field3654[2][2] = 4096;
            this.field3654[0][0] = 0;
            this.field3654[3][2] = 4096;
            this.field3654[1][0] = 663;
            this.field3654[4][2] = 0;
            this.field3654[2][1] = 0;
            this.field3654[3][1] = 4096;
            this.field3654[5][2] = 0;
            this.field3654[1][3] = 4096;
            this.field3654[4][1] = 4096;
            this.field3654[2][3] = 0;
            this.field3654[3][3] = 0;
            this.field3654[6][2] = 0;
            this.field3654[2][0] = 1363;
            this.field3654[5][1] = 4096;
            this.field3654[4][3] = 0;
            this.field3654[3][0] = 2048;
            this.field3654[6][1] = 0;
            this.field3654[4][0] = 2727;
            this.field3654[5][0] = 3411;
            this.field3654[6][0] = 4096;
            this.field3654[5][3] = 4096;
            this.field3654[6][3] = 4096;
        } else if (arg0 == 4) {
            this.field3654 = new int[6][4];
            this.field3654[0][0] = 0;
            this.field3654[0][1] = 0;
            this.field3654[0][2] = 0;
            this.field3654[1][1] = 0;
            this.field3654[2][1] = 0;
            this.field3654[3][1] = 0;
            this.field3654[1][2] = 0;
            this.field3654[2][2] = 0;
            this.field3654[3][2] = 1124;
            this.field3654[0][3] = 0;
            this.field3654[1][3] = 1493;
            this.field3654[1][0] = 1843;
            this.field3654[2][0] = 2457;
            this.field3654[4][1] = 546;
            this.field3654[3][0] = 2781;
            this.field3654[4][0] = 3481;
            this.field3654[5][1] = 4096;
            this.field3654[2][3] = 2939;
            this.field3654[5][0] = 4096;
            this.field3654[4][2] = 3084;
            this.field3654[3][3] = 3565;
            this.field3654[5][2] = 4096;
            this.field3654[4][3] = 4031;
            this.field3654[5][3] = 4096;
        } else if (arg0 == 5) {
            this.field3654 = new int[16][4];
            this.field3654[0][1] = 80;
            this.field3654[0][3] = 321;
            this.field3654[0][2] = 192;
            this.field3654[0][0] = 0;
            this.field3654[1][0] = 155;
            this.field3654[1][1] = 321;
            this.field3654[2][0] = 389;
            this.field3654[2][1] = 578;
            this.field3654[3][0] = 671;
            this.field3654[4][0] = 897;
            this.field3654[1][3] = 562;
            this.field3654[3][1] = 947;
            this.field3654[4][1] = 1285;
            this.field3654[2][3] = 803;
            this.field3654[5][0] = 1175;
            this.field3654[5][1] = 1525;
            this.field3654[6][1] = 1734;
            this.field3654[7][1] = 1413;
            this.field3654[3][3] = 1140;
            this.field3654[1][2] = 449;
            this.field3654[8][1] = 1108;
            this.field3654[6][0] = 1368;
            this.field3654[2][2] = 690;
            this.field3654[7][0] = 1507;
            this.field3654[4][3] = 1509;
            this.field3654[8][0] = 1736;
            this.field3654[9][0] = 2088;
            this.field3654[10][0] = 2355;
            this.field3654[9][1] = 1766;
            this.field3654[11][0] = 2691;
            this.field3654[5][3] = 1413;
            this.field3654[6][3] = 1333;
            this.field3654[12][0] = 3031;
            this.field3654[10][1] = 2409;
            this.field3654[11][1] = 3116;
            this.field3654[12][1] = 3806;
            this.field3654[13][1] = 3437;
            this.field3654[3][2] = 995;
            this.field3654[4][2] = 1397;
            this.field3654[5][2] = 1429;
            this.field3654[14][1] = 3116;
            this.field3654[7][3] = 1702;
            this.field3654[6][2] = 1461;
            this.field3654[13][0] = 3522;
            this.field3654[15][1] = 2377;
            this.field3654[8][3] = 2056;
            this.field3654[7][2] = 1525;
            this.field3654[9][3] = 2666;
            this.field3654[8][2] = 1590;
            this.field3654[9][2] = 2056;
            this.field3654[14][0] = 3727;
            this.field3654[10][2] = 2586;
            this.field3654[10][3] = 3276;
            this.field3654[11][2] = 3148;
            this.field3654[15][0] = 4096;
            this.field3654[12][2] = 3710;
            this.field3654[13][2] = 3421;
            this.field3654[14][2] = 3148;
            this.field3654[15][2] = 2505;
            this.field3654[11][3] = 3228;
            this.field3654[12][3] = 3196;
            this.field3654[13][3] = 3019;
            this.field3654[14][3] = 3228;
            this.field3654[15][3] = 2746;
        } else if (arg0 == 6) {
            this.field3654 = new int[4][4];
            this.field3654[0][2] = 4096;
            this.field3654[0][3] = 0;
            this.field3654[0][1] = 0;
            this.field3654[1][1] = 4096;
            this.field3654[0][0] = 2048;
            this.field3654[1][2] = 4096;
            this.field3654[1][3] = 0;
            this.field3654[2][1] = 4096;
            this.field3654[1][0] = 2867;
            this.field3654[2][2] = 4096;
            this.field3654[3][1] = 4096;
            this.field3654[3][2] = 0;
            this.field3654[2][3] = 0;
            this.field3654[3][3] = 0;
            this.field3654[2][0] = 3276;
            this.field3654[3][0] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 939)
    private final void method1522(int arg0) {
        if (arg0 != 16483) {
            this.method11(true, -73);
        }
        field3656++;
        int var2 = this.field3654.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = var3 << 4;
            int var5 = 0;
            for (int var6 = 0; var2 > var6 && var4 >= this.field3654[var6][0]; var6++) {
                var5++;
            }
            int var8;
            int var9;
            int var10;
            if (var5 >= var2) {
                int[] var7 = this.field3654[var2 - 1];
                var8 = var7[2];
                var9 = var7[1];
                var10 = var7[3];
            } else {
                int[] var11 = this.field3654[var5];
                if (var5 > 0) {
                    int[] var12 = this.field3654[var5 - 1];
                    int var13 = (var4 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                } else {
                    var9 = var11[1];
                    var8 = var11[2];
                    var10 = var11[3];
                }
            }
            int var15 = var10 >> 4;
            int var16 = var9 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field3645[var3] = class270.method1854(var15, class270.method1854(var17 << 8, var16 << 16));
        }
    }
}
