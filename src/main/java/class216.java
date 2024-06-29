import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class216 {

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3291 = "flash1:";

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lwg;")
    public class254 field3274;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[I")
    public int[] field3275;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "[I")
    public int[] field3282;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "[I")
    public int[] field3284;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "[I")
    public int[] field3285;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "[I")
    public int[] field3290;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "[I")
    public int[] field3295;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "[Lwg;")
    public class254[] field3294;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "[[I")
    public int[][] field3280;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "[[I")
    public int[][] field3288;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[[[I")
    public static int[][][] field3293;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 20)
    public static void method1525(int arg0) {
        field3293 = (int[][][]) null;
        if (arg0 == -28) {
            field3291 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BZ)V", line = 32)
    private final void method1526(byte[] arg0, boolean arg1) {
        class166 var3 = new class166(class345.method2386(21301, arg0));
        field3292++;
        int var4 = var3.method1178(0);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3278 = 0;
        } else {
            this.field3278 = var3.method1137(-39);
        }
        if (!arg1) {
            this.field3284 = (int[]) null;
        }
        int var5 = var3.method1178(0);
        int var6 = -1;
        this.field3277 = var3.method1151(-72);
        this.field3282 = new int[this.field3277];
        int var7 = 0;
        for (int var8 = 0; var8 < this.field3277; var8++) {
            this.field3282[var8] = var7 += var3.method1151(-127);
            if (this.field3282[var8] > var6) {
                var6 = this.field3282[var8];
            }
        }
        this.field3289 = var6 + 1;
        this.field3275 = new int[this.field3289];
        this.field3284 = new int[this.field3289];
        this.field3285 = new int[this.field3289];
        this.field3290 = new int[this.field3289];
        this.field3288 = new int[this.field3289][];
        if (var5 != 0) {
            this.field3295 = new int[this.field3289];
            for (int var9 = 0; var9 < this.field3289; var9++) {
                this.field3295[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3277; var10++) {
                this.field3295[this.field3282[var10]] = var3.method1137(127);
            }
            this.field3274 = new class254(this.field3295);
        }
        for (int var11 = 0; var11 < this.field3277; var11++) {
            this.field3275[this.field3282[var11]] = var3.method1137(63);
        }
        for (int var12 = 0; var12 < this.field3277; var12++) {
            this.field3290[this.field3282[var12]] = var3.method1137(-71);
        }
        for (int var13 = 0; var13 < this.field3277; var13++) {
            this.field3285[this.field3282[var13]] = var3.method1151(-62);
        }
        for (int var14 = 0; var14 < this.field3277; var14++) {
            int var15 = this.field3282[var14];
            int var16 = this.field3285[var15];
            int var17 = -1;
            this.field3288[var15] = new int[var16];
            int var18 = 0;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = this.field3288[var15][var19] = var18 += var3.method1151(-124);
                if (var17 < var20) {
                    var17 = var20;
                }
            }
            this.field3284[var15] = var17 + 1;
            if ((var17 + 1) == var16) {
                this.field3288[var15] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3294 = new class254[var6 + 1];
        this.field3280 = new int[var6 + 1][];
        for (int var21 = 0; var21 < this.field3277; var21++) {
            int var22 = this.field3282[var21];
            int var23 = this.field3285[var22];
            this.field3280[var22] = new int[this.field3284[var22]];
            for (int var24 = 0; var24 < this.field3284[var22]; var24++) {
                this.field3280[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field3288[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field3288[var22][var25];
                }
                this.field3280[var22][var26] = var3.method1137(-82);
            }
            this.field3294[var22] = new class254(this.field3280[var22]);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V", line = 206)
    public static final void method1527(boolean arg0) {
        field3281++;
        if (!arg0) {
            method1527(false);
        }
        for (int var1 = 0; var1 < class98.field1562; var1++) {
            int var2 = class260.field4065[var1];
            class313 var3 = class254.field3989[var2];
            int var4 = class10.field132.method1178(0);
            if ((var4 & 0x4) != 0) {
                var4 += class10.field132.method1178(0) << 8;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class10.field132.method1153(15673);
                int var6 = class10.field132.method1178(0);
                var3.method887(-124, var5, class227.field3618, var6);
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class10.field132.method1180(128);
                int var8 = class10.field132.method1129(255);
                boolean var9 = true;
                if (var7 == 65535) {
                    var7 = -1;
                }
                if (var7 != -1 && var3.field1951 != -1 && class133.method948(class112.method831(var7, arg0).field4117, (byte) 33).field4344 < class133.method948(class112.method831(var3.field1951, arg0).field4117, (byte) 33).field4344) {
                    var9 = false;
                }
                if (var9) {
                    var3.field1934 = var8 >> 16;
                    var3.field1866 = 1;
                    var3.field1885 = 0;
                    var3.field1904 = 0;
                    var3.field1951 = var7;
                    var3.field1895 = (var8 & 0xFFFF) + class227.field3618;
                    if (var3.field1895 > class227.field3618) {
                        var3.field1885 = -1;
                    }
                    if (var3.field1951 != -1 && class227.field3618 == var3.field1895) {
                        int var10 = class112.method831(var3.field1951, true).field4117;
                        if (var10 != -1) {
                            class281 var11 = class133.method948(var10, (byte) 33);
                            if (var11 != null && var11.field4326 != null) {
                                class170.method1231(false, var3.field1905, var3.field1868, 0, var11, -24255);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class10.field132.method1172(false);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class10.field132.method1128((byte) -24);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class10.field132.method1178(0);
                    var15[var16] = class10.field132.method1128((byte) -73);
                }
                class214.method1508(var15, var14, var13, 0, var3);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1853 = class10.field132.method1180(128);
                if (var3.field1853 == 65535) {
                    var3.field1853 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1945 = class10.field132.method1179((byte) 77);
                var3.field1916 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var18 = class10.field132.method1148(-2123880488);
                int var19 = class10.field132.method1178(0);
                if (var18 == 65535) {
                    var18 = -1;
                }
                class338.method2344(79, var18, var19, var3);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1917 = class10.field132.method1128((byte) -85);
                var3.field1929 = class10.field132.method1148(-2123880488);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field4859.method1469(-8968)) {
                    class295.method2006(-23156, var3);
                }
                var3.method2126(class231.method1630(-93, class10.field132.method1128((byte) -111)), 18570);
                var3.method891(2047, var3.field4859.field3118);
                var3.field1883 = var3.field4859.field3138;
                var3.field1941 = var3.field4859.field3142;
                if (var3.field4859.method1469(-8968)) {
                    class11.method82(class205.field3101, (class85) null, var3.field1938[0], var3, (class33) null, var3.field1910[0], 128, 0);
                }
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class10.field132.method1172(false);
                int var21 = class10.field132.method1178(0);
                var3.method887(-128, var20, class227.field3618, var21);
                var3.field1902 = class227.field3618 + 300;
                var3.field1859 = class10.field132.method1178(0);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z", line = 393)
    public static final boolean method1528(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class160.field2412; var3++) {
            class282 var4 = class332.field5162[var3];
            if (var4.field4353 == 1) {
                int var5 = var4.field4372 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4364 * var5 >> 8) + var4.field4350;
                    int var7 = (var4.field4355 * var5 >> 8) + var4.field4347;
                    int var8 = (var4.field4371 * var5 >> 8) + var4.field4358;
                    int var9 = (var4.field4356 * var5 >> 8) + var4.field4357;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4353 == 2) {
                int var10 = arg0 - var4.field4372;
                if (var10 > 0) {
                    int var11 = (var4.field4364 * var10 >> 8) + var4.field4350;
                    int var12 = (var4.field4355 * var10 >> 8) + var4.field4347;
                    int var13 = (var4.field4371 * var10 >> 8) + var4.field4358;
                    int var14 = (var4.field4356 * var10 >> 8) + var4.field4357;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4353 == 3) {
                int var15 = var4.field4350 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4359 * var15 >> 8) + var4.field4372;
                    int var17 = (var4.field4370 * var15 >> 8) + var4.field4351;
                    int var18 = (var4.field4371 * var15 >> 8) + var4.field4358;
                    int var19 = (var4.field4356 * var15 >> 8) + var4.field4357;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4353 == 4) {
                int var20 = arg2 - var4.field4350;
                if (var20 > 0) {
                    int var21 = (var4.field4359 * var20 >> 8) + var4.field4372;
                    int var22 = (var4.field4370 * var20 >> 8) + var4.field4351;
                    int var23 = (var4.field4371 * var20 >> 8) + var4.field4358;
                    int var24 = (var4.field4356 * var20 >> 8) + var4.field4357;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4353 == 5) {
                int var25 = arg1 - var4.field4358;
                if (var25 > 0) {
                    int var26 = (var4.field4359 * var25 >> 8) + var4.field4372;
                    int var27 = (var4.field4370 * var25 >> 8) + var4.field4351;
                    int var28 = (var4.field4364 * var25 >> 8) + var4.field4350;
                    int var29 = (var4.field4355 * var25 >> 8) + var4.field4347;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 518)
    public static final void method1529(int arg0, int arg1) {
        if (arg0 != 11212) {
            field3293 = (int[][][]) ((int[][][]) null);
        }
        field3283++;
        class335.field5238.method2175(arg1, -1401253017);
        class181.field2732.method2175(arg1, -1401253017);
        class186.field2787.method2175(arg1, -1401253017);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 531)
    public static final void method1530(int arg0) {
        field3287++;
        if (!class35.field545) {
            return;
        }
        class220 var1 = class177.method1263(class224.field3573, -123, class52.field868);
        if (arg0 != -20640) {
            return;
        }
        if (var1 != null && var1.field3504 != null) {
            class240 var2 = new class240();
            var2.field3834 = var1;
            var2.field3826 = var1.field3504;
            class336.method2337(var2, (byte) -71);
        }
        class35.field545 = false;
        class207.field3175 = -1;
        class26.method241(3095, var1);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIZIIII)V", line = 565)
    public static final void method1531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field3279++;
        if (!arg6) {
            return;
        }
        int var11 = arg8 - arg9;
        int var12 = arg2 - arg4;
        if (arg8 < class313.field4863) {
            var11++;
        }
        if (arg2 < class233.field3706) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg1 * var13 + arg0 >> 16;
            int var15 = (var13 + 1) * arg1 + arg0 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg9 + var13 >> 6;
                if (var17 >= 0 && (class223.field3545.length - 1) >= var17) {
                    byte[][] var18 = class89.field1432[var17];
                    int var19 = arg7 + var14;
                    byte[][] var20 = class70.field1139[var17];
                    int var21 = arg7 + var15;
                    int[][] var22 = class223.field3545[var17];
                    byte[][] var23 = class307.field4773[var17];
                    byte[][] var24 = class19.field260[var17];
                    byte[][] var25 = class150.field2268[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg3 * var26 + arg5 >> 16;
                        int var28 = arg5 + ((var26 + 1) * arg3) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg10 + var27;
                            int var31 = arg4 + var26 & 0x3F;
                            int var32 = arg10 + var28;
                            int var33 = var13 + arg9 & 0x3F;
                            int var34 = (var31 << 6) + var33;
                            int var35 = var26 + arg4 >> 6;
                            int var36;
                            if (var35 < 0 || var35 > var22.length - 1 || var22[var35] == null) {
                                if (class214.field3256.field24 != -1) {
                                    var36 = class214.field3256.field24;
                                } else if ((arg4 + var26 & 0x4) == (arg9 + var13 & 0x4)) {
                                    var36 = class99.field1576[class318.field4976 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var35 < 0 || var35 > (var22.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class109.method812(var19, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var22[var35][var34];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var18[var35] == null ? 0 : class99.field1576[var18[var35][var34] & 0xFF];
                            int var38 = var23[var35] == null ? 0 : class99.field1576[var23[var35][var34] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class109.method812(var19, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    byte var39 = var20[var35] == null ? 0 : var20[var35][var34];
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class109.method812(var19, var30, var16, var29, var37);
                                    } else {
                                        class20.method152(var40 >> 2, var29, var37, (byte) 108, class109.field1704, var19, var39 & 0x3, true, var16, var30, var36);
                                    }
                                }
                                if (var38 != 0) {
                                    byte var41 = var24[var35][var34];
                                    int var42 = var41 & 0xFC;
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class109.method812(var19, var30, var16, var29, var38);
                                    }
                                    class20.method152(var42 >> 2, var29, var38, (byte) 80, class109.field1704, var19, var41 & 0x3, var37 == 0, var16, var30, 0);
                                }
                            }
                            if (var25[var35] != null) {
                                int var43 = var25[var35][var34] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var21 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var30;
                                    } else {
                                        var45 = var32 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class109.method813(var19, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class109.method805(var19, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class109.method813(var44, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class109.method805(var19, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class109.method813(var19, var30, var29, 16777215);
                                        class109.method805(var19, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class109.method813(var44, var30, var29, 16777215);
                                        class109.method805(var19, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class109.method813(var44, var30, var29, 16777215);
                                        class109.method805(var19, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class109.method813(var19, var30, var29, 16777215);
                                        class109.method805(var19, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class109.method805(var19, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class109.method805(var44, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class109.method805(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class109.method805(var19, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class109.method805(var19 + var48, -var48 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class109.method805(var19 + var47, var30 + var47, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg7 + var15;
                    int var50 = arg7 + var14;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class214.field3256.field24 != -1) {
                            var52 = class214.field3256.field24;
                        } else if ((arg4 + var51 & 0x4) == (arg9 + var13 & 0x4)) {
                            var52 = class99.field1576[class318.field4976 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg5 + (arg3 * var51) >> 16) + arg10;
                        int var54 = ((var51 + 1) * arg3 + arg5 >> 16) + arg10;
                        int var55 = var54 - var53;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        class109.method812(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = arg0 + (arg1 * var56) >> 16;
            int var58 = (var56 + 1) * arg1 + arg0 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = var56 + arg9 >> 6;
                int var61 = arg7 + var57;
                var10000 = arg7 + var58;
                if (var60 >= 0 && class188.field2808.length - 1 >= var60) {
                    int[][] var63 = class188.field2808[var60];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg3 * var64 + arg5 >> 16;
                        int var66 = (var64 + 1) * arg3 + arg5 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg10 + var66;
                            int var69 = arg10 + var65;
                            int var70 = arg4 + var64 >> 6;
                            if (var70 >= 0 && var70 <= var63.length - 1) {
                                int var71 = (arg4 + var64 & 0x3F << 6) + (var56 + arg9 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class264 var74 = class214.method1507((byte) -75, var73 - 1);
                                        boolean var75 = (var72 >> 15 & 0x1) == 1;
                                        int var76 = var72 >> 13 & 0x3;
                                        class168 var77 = var74.method1800(var75, (byte) -65, var76);
                                        if (var77 != null) {
                                            int var78 = var77.field3972 * var59 / 4;
                                            int var79 = var77.field3980 * var67 / 4;
                                            if (var74.field4108) {
                                                int var80 = var72 >> 16 & 0xF;
                                                int var81 = (var72 & 0xF24496) >> 20;
                                                if ((var76 & 0x1) == 1) {
                                                    int var82 = var80;
                                                    var80 = var81;
                                                    var81 = var82;
                                                }
                                                var79 = var67 * var81;
                                                var78 = var59 * var80;
                                            }
                                            if (var78 != 0 && var79 != 0) {
                                                if (var74.field4109 == 0) {
                                                    var77.method1208(var61, var69 - (var79 - var67), var78, var79);
                                                } else {
                                                    var77.method1214(var61, var67 + var69 - var79, var78, var79, var74.field4109);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([BI)V", line = 989)
    public class216(byte[] arg0, int arg1) {
        this.field3286 = class263.method1789((byte) -22, arg0, arg0.length);
        if (this.field3286 != arg1) {
            throw new RuntimeException();
        }
        this.method1526(arg0, true);
    }
}
