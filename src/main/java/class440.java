import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class440 extends class241 {

    @OriginalMember(owner = "client!dn", name = "hb", descriptor = "Z")
    public boolean field6257 = false;

    @OriginalMember(owner = "client!dn", name = "nb", descriptor = "Z")
    public boolean field6263 = false;

    @OriginalMember(owner = "client!dn", name = "Bb", descriptor = "Z")
    public boolean field6277 = false;

    @OriginalMember(owner = "client!dn", name = "lb", descriptor = "Z")
    public boolean field6261 = false;

    @OriginalMember(owner = "client!dn", name = "xb", descriptor = "Z")
    public boolean field6273 = false;

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
    public static int field6254 = 0;

    @OriginalMember(owner = "client!dn", name = "mb", descriptor = "I")
    public static int field6262 = 0;

    @OriginalMember(owner = "client!dn", name = "ob", descriptor = "I")
    public static int field6264 = 0;

    @OriginalMember(owner = "client!dn", name = "Fb", descriptor = "F")
    public static float field6281;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!dn", name = "gb", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!dn", name = "ib", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!dn", name = "jb", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!dn", name = "kb", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!dn", name = "pb", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!dn", name = "qb", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!dn", name = "rb", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!dn", name = "sb", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!dn", name = "tb", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!dn", name = "ub", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!dn", name = "vb", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!dn", name = "wb", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!dn", name = "yb", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!dn", name = "zb", descriptor = "I")
    public int field6275;

    @OriginalMember(owner = "client!dn", name = "Ab", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!dn", name = "Cb", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!dn", name = "Db", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!dn", name = "Eb", descriptor = "Lan;")
    public static class21 field6280;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
    public final void method2596(boolean arg0, int arg1) {
        super.field3370 = arg0;
        ++field6256;
        if (arg1 <= -74) {
            if (class18.field227 != null) {
                class18.field227.method1206(0, !this.method2608(class103.field1570, (byte) -127));
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
    public final int method2597(int arg0, int arg1) {
        ++field6260;
        if (this.field6261) {
            return 0;
        } else if (!this.method2608(arg0, (byte) -118)) {
            return 1;
        } else if (arg1 != 1) {
            return 64;
        } else {
            return !super.field3345 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([Lmc;IIZII)V")
    public static final void method2598(class114[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg5 <= 111) {
            method2614(0, 105, -70, -125, 10, (byte) -97);
        }
        while (arg0.length > var6) {
            class114 var7 = arg0[var6];
            if (var7 != null && ~var7.field1897 == ~arg4) {
                class466.method2722(arg1, false, arg2, var7, arg3);
                class615.method3594(arg1, false, arg2, var7);
                if (var7.field1800 > -var7.field1853 + var7.field1846) {
                    var7.field1800 = -var7.field1853 + var7.field1846;
                }
                if (~var7.field1800 > -1) {
                    var7.field1800 = 0;
                }
                if (~(-var7.field1769 + var7.field1802) > ~var7.field1904) {
                    var7.field1904 = -var7.field1769 + var7.field1802;
                }
                if (~var7.field1904 > -1) {
                    var7.field1904 = 0;
                }
                if (~var7.field1880 == -1) {
                    class274.method1772((byte) -122, var7, arg3);
                }
            }
            ++var6;
        }
        ++field6253;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLmc;II)V")
    public static final void method2599(byte arg0, class114 arg1, int arg2, int arg3) {
        ++field6272;
        class23.field344 = arg1;
        if (arg0 != -9) {
            method2601((byte) -38, true, (String) null);
        }
        class71.field1180 = arg2;
        class101.field1543 = arg3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)I")
    private final int method2600(byte arg0, int arg1) {
        int var3 = 102 % ((74 - arg0) / 52);
        ++field6266;
        byte var4;
        if (arg1 > 12000) {
            this.method2602(0);
            var4 = 4;
        } else if (~arg1 >= -5001) {
            if (arg1 <= 2000) {
                this.method2611((byte) -98);
                var4 = 1;
            } else {
                this.method2605(2);
                var4 = 2;
            }
        } else {
            var4 = 3;
            this.method2604(1);
        }
        if (class103.field1570 != 2) {
            super.field3368 = 2;
            class452.method2658(7, 2);
        }
        this.method2607((byte) -123, class500.field6968);
        return var4;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method2601(byte arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        ++field6276;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        if (arg0 >= -46) {
            field6264 = 15;
        }
        int var7 = var6 + (arg1 ? class451.field6374.field4995 : class451.field6374.field4994);
        for (int var8 = var6; var8 < var7; ++var8) {
            class446 var11 = class451.field6374.method2202(var8, 117);
            if (var11.field6343 && var11.method2638(17611).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class568.field7844 = -1;
                    class512.field7212 = null;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var5 < ~var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class512.field7212 = var4;
        class536.field7493 = 0;
        class568.field7844 = var5;
        String[] var9 = new String[class568.field7844];
        for (int var10 = 0; var10 < class568.field7844; ++var10) {
            var9[var10] = class451.field6374.method2202(var4[var10], 127).method2638(17611);
        }
        class261.method1705(class512.field7212, -20809, var9);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    public final void method2602(int arg0) {
        this.method2596(true, -127);
        ++field6269;
        super.field3371 = super.field3381 = 2;
        super.field3358 = true;
        super.field3348 = 1;
        super.field3365 = true;
        super.field3375 = true;
        super.field3346 = true;
        super.field3376 = true;
        super.field3349 = true;
        super.field3357 = true;
        super.field3347 = true;
        super.field3361 = true;
        super.field3345 = true;
        super.field3367 = true;
        super.field3366 = super.field3360 = 0;
        if (~class366.field4987 < -96) {
            class424.method2529(2, false);
        } else {
            class424.method2529(0, false);
        }
        super.field3378 = arg0;
        super.field3351 = false;
        super.field3374 = true;
        this.method2613(arg0 ^ 4);
        super.field3356 = 4;
        class510.method2946((byte) -128);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILdaa;)V")
    private final void method2603(int arg0, class11 arg1) {
        ++field6258;
        if (~(arg1.field138.length + -arg1.field165) <= -2) {
            int var3 = arg1.method110((byte) 107);
            if (var3 >= 0 && var3 <= 18) {
                byte var4;
                if (var3 == 18) {
                    var4 = 41;
                } else if (var3 != 17) {
                    if (~var3 != -17) {
                        if (var3 != 15) {
                            if (~var3 == -15) {
                                var4 = 36;
                            } else if (var3 != 13) {
                                if (~var3 == -13) {
                                    var4 = 34;
                                } else if (var3 != 11) {
                                    if (~var3 != -11) {
                                        if (var3 == 9) {
                                            var4 = 31;
                                        } else if (var3 == 8) {
                                            var4 = 30;
                                        } else if (var3 != 7) {
                                            if (var3 == 6) {
                                                var4 = 28;
                                            } else if (var3 != 5) {
                                                if (~var3 == -5) {
                                                    var4 = 24;
                                                } else if (var3 == 3) {
                                                    var4 = 23;
                                                } else if (~var3 != -3) {
                                                    if (~var3 == -2) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 22;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 32;
                                    }
                                } else {
                                    var4 = 33;
                                }
                            } else {
                                var4 = 35;
                            }
                        } else {
                            var4 = 37;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 40;
                }
                if (~(arg1.field138.length + -arg1.field165) <= ~var4) {
                    super.field3350 = arg1.method110((byte) 77);
                    if (~super.field3350 > -2) {
                        super.field3350 = 1;
                    } else if (super.field3350 > 4) {
                        super.field3350 = 4;
                    }
                    this.method2596(arg1.method110((byte) 65) == 1, -87);
                    super.field3345 = ~arg1.method110((byte) 57) == -2;
                    super.field3367 = ~arg1.method110((byte) 70) == -2;
                    super.field3375 = arg1.method110((byte) 111) == 1;
                    super.field3348 = ~arg1.method110((byte) 86) != -2 ? 0 : 1;
                    super.field3358 = arg1.method110((byte) 120) == 1;
                    super.field3376 = ~arg1.method110((byte) 45) == -2;
                    super.field3365 = ~arg1.method110((byte) 125) == -2;
                    super.field3371 = arg1.method110((byte) 86);
                    if (~super.field3371 < -3) {
                        super.field3371 = 2;
                    }
                    if (var3 >= 17) {
                        super.field3381 = arg1.method110((byte) 104);
                    }
                    if (~var3 <= -3) {
                        super.field3347 = arg1.method110((byte) 81) == 1;
                        if (var3 >= 17) {
                            super.field3349 = ~arg1.method110((byte) 30) == -2;
                        }
                    } else {
                        super.field3347 = ~arg1.method110((byte) 56) == -2;
                        arg1.method110((byte) 24);
                    }
                    super.field3357 = arg1.method110((byte) 26) == 1;
                    super.field3346 = ~arg1.method110((byte) 121) == -2;
                    super.field3366 = arg1.method110((byte) 72);
                    if (super.field3366 > 2) {
                        super.field3366 = 2;
                    }
                    super.field3360 = super.field3366;
                    super.field3364 = arg1.method110((byte) 38) == 1;
                    super.field3372 = arg1.method110((byte) 51);
                    if (~super.field3372 < -128) {
                        super.field3372 = 127;
                    }
                    super.field3362 = arg1.method110((byte) 27);
                    super.field3354 = arg1.method110((byte) 79);
                    if (super.field3354 > 127) {
                        super.field3354 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field3379 = arg1.method93((byte) 76);
                        super.field3355 = arg1.method93((byte) 95);
                    }
                    if (arg0 == 1290) {
                        if (var3 >= 3 && ~var3 > -7) {
                            arg1.method110((byte) 82);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg1.method110((byte) 33);
                            if (~var5 > -1 || var5 > 2) {
                                var5 = 0;
                            }
                            if (class366.field4987 < 96) {
                                var5 = 0;
                            }
                            class424.method2529(var5, false);
                        }
                        if (~var3 <= -6) {
                            super.field3382 = arg1.method119(-123);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field3359 = var6 = arg1.method110((byte) 24);
                        }
                        if (~super.field3359 != -2 && ~super.field3359 != -3) {
                            super.field3359 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field3380 = arg1.method110((byte) 90) == 1;
                        }
                        if (var3 >= 8) {
                            super.field3369 = arg1.method110((byte) 29) == 1;
                        }
                        if (~var3 <= -10) {
                            super.field3378 = arg1.method110((byte) 74);
                        }
                        if (~super.field3378 > -1 || ~super.field3378 < ~class562.method3205(class366.field4987, (byte) 117)) {
                            super.field3378 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field3351 = ~arg1.method110((byte) 54) != -1;
                        }
                        if (var3 >= 11) {
                            super.field3344 = ~arg1.method110((byte) 82) != -1;
                        }
                        if (var3 >= 12) {
                            super.field3348 = arg1.method110((byte) 65);
                        }
                        if (~super.field3348 > -1 || super.field3348 > 2) {
                            super.field3348 = 1;
                        }
                        if (var3 >= 13) {
                            super.field3374 = ~arg1.method110((byte) 116) == -2;
                        }
                        if (var3 < 14) {
                            if (~var6 != -1) {
                                super.field3368 = 1;
                            } else {
                                super.field3368 = 2;
                            }
                        } else {
                            super.field3368 = arg1.method110((byte) 84);
                        }
                        if (super.field3368 < 0 || super.field3368 > 5) {
                            super.field3368 = 2;
                        }
                        if (var3 >= 15) {
                            super.field3373 = arg1.method110((byte) 84);
                            if (super.field3373 < 0 || ~super.field3373 < -5) {
                                super.field3373 = ~class252.field3493 != -2 ? 4 : 2;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field3361 = arg1.method110((byte) 46) == 1;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field3361 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (~var3 > -18 && ~super.field3368 == -1) {
                            super.field3368 = 2;
                        }
                        if (var3 >= 18) {
                            super.field3356 = arg1.method110((byte) 100);
                            if (~super.field3356 > -1 || super.field3356 > 4) {
                                super.field3356 = 0;
                            }
                            if (~super.field3356 == -3) {
                                super.field3367 = true;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    public final void method2604(int arg0) {
        ++field6274;
        this.method2596(true, -95);
        super.field3358 = true;
        super.field3367 = true;
        super.field3365 = true;
        super.field3366 = super.field3360 = 0;
        super.field3348 = 1;
        super.field3346 = true;
        super.field3375 = true;
        super.field3345 = true;
        super.field3361 = true;
        super.field3371 = super.field3381 = arg0;
        super.field3376 = true;
        super.field3347 = true;
        super.field3349 = false;
        super.field3357 = false;
        if (class366.field4987 <= 95) {
            class424.method2529(0, false);
        } else {
            class424.method2529(1, false);
        }
        super.field3351 = false;
        super.field3378 = 0;
        super.field3374 = true;
        this.method2613(4);
        super.field3356 = 3;
        class510.method2946((byte) -127);
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    public final void method2605(int arg0) {
        ++field6252;
        this.method2596(true, -113);
        super.field3376 = false;
        if (arg0 != 2) {
            this.method2600((byte) -5, 76);
        }
        super.field3348 = 0;
        super.field3346 = false;
        super.field3367 = true;
        super.field3345 = false;
        super.field3361 = false;
        super.field3375 = false;
        super.field3371 = super.field3381 = 0;
        super.field3349 = false;
        super.field3347 = false;
        super.field3365 = false;
        super.field3366 = super.field3360 = 0;
        super.field3358 = false;
        super.field3357 = false;
        class424.method2529(0, false);
        super.field3378 = 0;
        super.field3374 = true;
        super.field3351 = false;
        this.method2613(4);
        super.field3356 = 2;
        class510.method2946((byte) -125);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)I")
    private final int method2606(byte arg0) {
        ++field6270;
        byte var3;
        if (~class366.field4987 <= -97) {
            int var2 = class186.method1160((byte) -76);
            if (~var2 >= -101) {
                this.method2602(0);
                var3 = 4;
            } else if (~var2 >= -501) {
                this.method2604(1);
                var3 = 3;
            } else if (var2 <= 1000) {
                this.method2605(2);
                var3 = 2;
            } else {
                var3 = 1;
                this.method2611((byte) -98);
            }
        } else {
            var3 = 1;
            this.method2611((byte) -98);
        }
        if (class103.field1570 != 0) {
            super.field3368 = 0;
            class452.method2658(7, 0);
        }
        this.method2607((byte) -103, class500.field6968);
        return arg0 >= -25 ? 108 : var3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLdj;)V")
    public final void method2607(byte arg0, class288 arg1) {
        ++field6268;
        if (arg0 >= -64) {
            field6281 = 0.48332253F;
        }
        class116 var3 = null;
        try {
            class382 var4 = arg1.method1840("", true, (byte) 102);
            while (var4.field5134 == 0) {
                class21.method220(0, 1L);
            }
            if (var4.field5134 == 1) {
                var3 = (class116) var4.field5132;
                class11 var5 = new class11(class43.method418(72));
                this.method1503(true, var5);
                var3.method818(var5.field165, (byte) -115, var5.field138, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method821(17981);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)Z")
    public final boolean method2608(int arg0, byte arg1) {
        ++field6271;
        if (arg1 > -93) {
            this.field6261 = false;
        }
        return ~arg0 == -1 && !this.field6263 ? super.field3370 : true;
    }

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "(I)I")
    public final int method2609(int arg0) {
        ++field6267;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class288.field3965 != 3 && class288.field3965 != 2) {
            if (class288.field3967.startsWith("win")) {
                var4 = true;
                var3 = true;
                if (!class288.field3972.startsWith("amd64") && !class288.field3972.startsWith("x86_64")) {
                    var2 = true;
                }
            } else {
                var3 = true;
            }
        }
        if (this.field6273) {
            var2 = false;
        }
        if (this.field6257) {
            var3 = false;
        }
        if (this.field6277) {
            var4 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2606((byte) -39);
        } else {
            int var5 = arg0;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class568.method3228(arg0 ^ 112, 2, 1000);
                } catch (Exception var14) {
                }
            }
            if (var4) {
                try {
                    var7 = class568.method3228(-119, 3, 1000);
                    if (~class103.field1570 == -4) {
                        class384 var8 = class69.field1165.method1317();
                        long var9 = 281474976710655L & var8.field5139;
                        int var11 = var8.field5142;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var13) {
                }
            }
            if (var3) {
                try {
                    var6 = class568.method3228(121, 1, 1000);
                } catch (Exception var12) {
                }
            }
            if (var5 == -1 && ~var6 == 0 && ~var7 == 0) {
                return this.method2606((byte) -69);
            } else if (var7 < var5 && ~var6 > ~var5) {
                return this.method2600((byte) 126, var5);
            } else {
                return ~var7 >= ~var6 ? this.method2615(1, -115, var6) : this.method2615(3, -120, var7);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)Z")
    public final boolean method2610(int arg0, int arg1) {
        if (arg1 != 0) {
            return false;
        } else {
            ++field6259;
            return ~arg0 != -1 ? true : super.field3370;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V")
    public final void method2611(byte arg0) {
        this.method2596(false, -114);
        ++field6279;
        super.field3361 = false;
        super.field3345 = false;
        super.field3347 = false;
        super.field3348 = 0;
        super.field3358 = false;
        super.field3367 = false;
        super.field3366 = super.field3360 = 0;
        if (arg0 != -98) {
            this.method2604(-128);
        }
        super.field3371 = super.field3381 = 0;
        super.field3376 = false;
        super.field3349 = false;
        super.field3357 = false;
        super.field3365 = false;
        super.field3375 = false;
        super.field3346 = false;
        class424.method2529(0, false);
        super.field3374 = false;
        super.field3378 = 0;
        super.field3351 = false;
        this.method2613(4);
        super.field3356 = 1;
        class510.method2946((byte) -127);
    }

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "(I)V")
    public static void method2612(int arg0) {
        if (arg0 == 23795) {
            field6280 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)V")
    private final void method2613(int arg0) {
        ++field6265;
        if (class252.field3493 <= 1) {
            super.field3373 = 2;
        } else {
            super.field3373 = 4;
        }
        if (arg0 != 4) {
            this.method2613(-114);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2614(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class634.field9269 = arg4;
        class87.field1384 = arg1;
        class23.field335 = arg0;
        if (arg5 <= -23) {
            ++field6255;
            class124.field2019 = arg3;
            class151.field2295 = arg2;
            if (~class151.field2295 <= -101) {
                int var6 = class124.field2019 * 128 + 64;
                int var7 = class87.field1384 * 128 + 64;
                int var8 = class183.method1144(125, var6, var7, class206.field2901) - class634.field9269;
                int var9 = -class563.field7794 + var6;
                int var10 = -class117.field1930 + var8;
                int var11 = -class462.field6488 + var7;
                int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var11 * var11)));
                class160.field2349 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 16383;
                class88.field1391 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 16383;
                class264.field3688 = 0;
                if (~class160.field2349 > -1025) {
                    class160.field2349 = 1024;
                }
                if (class160.field2349 > 3072) {
                    class160.field2349 = 3072;
                }
            }
            class107.field1653 = 2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ldj;)V")
    public class440(class288 arg0) {
        super.field3350 = 3;
        super.field3356 = 3;
        this.method2596(true, -112);
        super.field3345 = true;
        super.field3364 = true;
        super.field3367 = true;
        super.field3355 = 0;
        super.field3346 = true;
        super.field3358 = true;
        super.field3347 = true;
        super.field3379 = 0;
        super.field3381 = 0;
        super.field3354 = 127;
        super.field3357 = true;
        super.field3349 = false;
        super.field3366 = 0;
        super.field3376 = true;
        super.field3360 = 0;
        super.field3348 = 1;
        super.field3372 = 127;
        super.field3375 = true;
        super.field3362 = 127;
        super.field3365 = true;
        super.field3371 = 2;
        if (~class366.field4987 <= -97) {
            class424.method2529(2, false);
        } else {
            class424.method2529(0, false);
        }
        super.field3380 = false;
        super.field3369 = false;
        super.field3368 = 2;
        super.field3378 = 0;
        super.field3374 = true;
        super.field3344 = true;
        super.field3359 = 2;
        super.field3382 = 0;
        super.field3351 = false;
        super.field3373 = ~class252.field3493 != -2 ? 4 : 2;
        class116 var2 = null;
        try {
            class382 var3 = arg0.method1840("", true, (byte) 102);
            while (var3.field5134 == 0) {
                class21.method220(0, 1L);
            }
            if (var3.field5134 == 1) {
                var2 = (class116) var3.field5132;
                byte[] var4 = new byte[(int) var2.method817(-2826)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method819(var4, -98, var4.length + -var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2603(1290, new class11(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method821(17981);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)I")
    private final int method2615(int arg0, int arg1, int arg2) {
        ++field6278;
        if (arg1 >= -114) {
            field6262 = -77;
        }
        byte var4;
        if (~arg2 >= -20001) {
            if (arg2 <= 10000) {
                if (~arg2 < -5001) {
                    var4 = 2;
                    this.method2605(2);
                } else {
                    this.method2611((byte) -98);
                    var4 = 1;
                }
            } else {
                this.method2604(1);
                var4 = 3;
            }
        } else {
            var4 = 4;
            this.method2602(0);
        }
        if (~class103.field1570 != ~arg0) {
            super.field3368 = arg0;
            class452.method2658(7, arg0);
        }
        this.method2607((byte) -101, class500.field6968);
        return var4;
    }
}
