import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class42 extends class300 {

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    private int field511 = 4;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    private int field507 = 4;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "Lvl;")
    public static class73 field515;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class197.field3123 == -1) {
            int var7 = class190.field2955;
            int var8 = class169.field2607;
            int var9 = class89.field1349;
            int var10 = class220.field3444;
            int var11 = (arg1 - arg4) * (var8 - var7) / arg2 + var7;
            int var12 = (-arg6 + arg3) * (-var10 + var9) / arg5 - -var10;
            if (class63.field911 && (64 & class111.field1613) != 0) {
                class231 var13 = class282.method1942(class71.field1034, class304.field4829, (byte) -113);
                if (var13 == null) {
                    class223.method1582(true);
                } else {
                    class28.method142(" ->", 90, class59.field865, var12, (short) 22, 0L, var11, class122.field1757);
                }
            } else {
                ++class237.field3820;
                if (~class257.field4188 == -2) {
                    class28.method142("", -123, class161.field2413, var12, (short) 28, 0L, var11, -1);
                }
                class28.method142("", -84, class248.field4034, var12, (short) 15, 0L, var11, -1);
            }
        }
        ++field513;
        long var14 = -1L;
        for (int var16 = 0; var16 < class22.field287; ++var16) {
            long var17 = class268.field4354[var16];
            int var19 = (int) var17 & 127;
            int var20 = (int) var17 >> 29 & 3;
            int var21 = (16306 & (int) var17) >> 7;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (~var14 != ~var17) {
                var14 = var17;
                if (var20 == 2 && class223.method1584(class148.field2204, var19, var21, var17)) {
                    class191 var23 = class128.method822(var22, (byte) 92);
                    if (var23.field2963 != null) {
                        var23 = var23.method1340(arg0 ^ 1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class197.field3123 == 1) {
                        class28.method142(class230.field3551 + " -> <col=00ffff>" + var23.field3013, -82, class179.field2800, var21, (short) 43, var17, var19, class123.field1773);
                        ++class129.field1851;
                    } else if (class63.field911) {
                        class226 var24 = ~class78.field1181 != 0 ? class214.method1501(class78.field1181, (byte) -59) : null;
                        if (~(class111.field1613 & 4) != -1 && (var24 == null || ~var23.method1331(var24.field3519, -30336, class78.field1181) != ~var24.field3519)) {
                            ++class291.field4683;
                            class28.method142(class284.field4604 + " -> <col=00ffff>" + var23.field3013, 127, class59.field865, var21, (short) 11, var17, var19, class122.field1757);
                        }
                    } else {
                        ++class291.field4681;
                        String[] var25 = var23.field3012;
                        if (class287.field4637) {
                            var25 = class20.method115(-6, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; ~var26 <= -1; --var26) {
                                if (var25[var26] != null) {
                                    ++class137.field1970;
                                    int var27 = -1;
                                    if (var23.field3026 == var26) {
                                        var27 = var23.field2976;
                                    }
                                    if (var23.field3011 == var26) {
                                        var27 = var23.field3004;
                                    }
                                    short var28 = 0;
                                    if (var26 == 0) {
                                        var28 = 13;
                                    }
                                    if (~var26 == -2) {
                                        var28 = 35;
                                    }
                                    if (~var26 == -3) {
                                        var28 = 17;
                                    }
                                    if (var26 == 3) {
                                        var28 = 23;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1007;
                                    }
                                    class28.method142("<col=00ffff>" + var23.field3013, -124, var25[var26], var21, var28, var17, var19, var27);
                                }
                            }
                        }
                        class28.method142("<col=00ffff>" + var23.field3013, -81, class298.field4761, var21, (short) 1004, (long) var23.field3019, var19, class104.field1522);
                    }
                }
                if (var20 == 1) {
                    class86 var29 = class191.field3045[var22];
                    if ((1 & var29.field1321.field1925) == 0 && ~(var29.field3915 & 127) == -1 && (var29.field3920 & 127) == 0 || (1 & var29.field1321.field1925) == 1 && ~(var29.field3915 & 127) == -65 && (127 & var29.field3920) == 64) {
                        int var30 = 64 - (var29.field1321.field1925 * 64 - var29.field3915);
                        int var31 = 64 - var29.field1321.field1925 * 64 + var29.field3920;
                        for (int var32 = 0; ~class80.field1211 < ~var32; ++var32) {
                            class86 var37 = class191.field3045[class187.field2939[var32]];
                            if (var37 != null && !var37.field3988 && var29 != var37 && var37.field3903) {
                                int var38 = -((var37.field1321.field1925 + -1) * 64) + var37.field3920;
                                int var39 = var37.field3915 - (var37.field1321.field1925 + -1) * 64;
                                if (~var39 <= ~var30 && -(-var30 + var39 >> 7) + var29.field1321.field1925 >= var37.field1321.field1925 && var38 >= var31 && -(var38 - var31 >> 7) + var29.field1321.field1925 >= var37.field1321.field1925) {
                                    class20.method113(var19, class187.field2939[var32], var37.field1321, var21, -5190);
                                    var37.field3988 = true;
                                }
                            }
                        }
                        for (int var33 = 0; ~var33 > ~class272.field4432; ++var33) {
                            class1 var34 = class35.field409[class52.field745[var33]];
                            if (var34 != null && !var34.field3988 && var34.field3903) {
                                int var35 = var34.field3915 - (-1 + var34.method8((byte) -90)) * 64;
                                int var36 = var34.field3920 - -64 - 64 * var34.method8((byte) -121);
                                if (~var35 <= ~var30 && ~var34.method8((byte) -43) >= ~(-(-var30 + var35 >> 7) + var29.field1321.field1925) && ~var36 <= ~var31 && ~var34.method8((byte) -117) >= ~(var29.field1321.field1925 - (-var31 + var36 >> 7))) {
                                    class248.method1768(var21, var34, (byte) 123, class52.field745[var33], var19);
                                    var34.field3988 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3988) {
                        continue;
                    }
                    class20.method113(var19, var22, var29.field1321, var21, -5190);
                    var29.field3988 = true;
                }
                if (~var20 == -1) {
                    class1 var40 = class35.field409[var22];
                    if (~(127 & var40.field3915) == -65 && ~(var40.field3920 & 127) == -65) {
                        int var41 = var40.field3915 + 64 + -(64 * var40.method8((byte) -57));
                        int var42 = var40.field3920 - (64 * var40.method8((byte) -99) + -64);
                        for (int var43 = 0; var43 < class80.field1211; ++var43) {
                            class86 var48 = class191.field3045[class187.field2939[var43]];
                            if (var48 != null && !var48.field3988 && var48.field3903) {
                                int var49 = -((var48.field1321.field1925 + -1) * 64) + var48.field3920;
                                int var50 = -(var48.field1321.field1925 * 64) + var48.field3915 - -64;
                                if (~var41 >= ~var50 && ~var48.field1321.field1925 >= ~(var40.method8((byte) -119) - (-var41 + var50 >> 7)) && var49 >= var42 && ~var48.field1321.field1925 >= ~(-(-var42 + var49 >> 7) + var40.method8((byte) -103))) {
                                    class20.method113(var19, class187.field2939[var43], var48.field1321, var21, -5190);
                                    var48.field3988 = true;
                                }
                            }
                        }
                        for (int var44 = 0; class272.field4432 > var44; ++var44) {
                            class1 var45 = class35.field409[class52.field745[var44]];
                            if (var45 != null && !var45.field3988 && var40 != var45 && var45.field3903) {
                                int var46 = var45.field3915 + 64 + -(var45.method8((byte) -113) * 64);
                                int var47 = var45.field3920 + -((-1 + var45.method8((byte) -65)) * 64);
                                if (~var46 <= ~var41 && ~var45.method8((byte) -64) >= ~(-(-var41 + var46 >> 7) + var40.method8((byte) -111)) && ~var42 >= ~var47 && var45.method8((byte) -99) <= var40.method8((byte) -42) - (-var42 + var47 >> 7)) {
                                    class248.method1768(var21, var45, (byte) 125, class52.field745[var44], var19);
                                    var45.field3988 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3988) {
                        continue;
                    }
                    class248.method1768(var21, var40, (byte) -4, var22, var19);
                    var40.field3988 = true;
                }
                if (~var20 == -4) {
                    class220 var51 = class74.field1128[class148.field2204][var19][var21];
                    if (var51 != null) {
                        for (class212 var52 = (class212) var51.method1541(1); var52 != null; var52 = (class212) var51.method1538(true)) {
                            int var53 = var52.field3303.field1527;
                            class162 var54 = class104.method696((byte) -26, var53);
                            if (class197.field3123 == 1) {
                                class28.method142(class230.field3551 + " -> <col=ff9040>" + var54.field2425, 43, class179.field2800, var21, (short) 21, (long) var53, var19, class123.field1773);
                                ++class84.field1296;
                            } else if (class63.field911) {
                                class226 var55 = ~class78.field1181 != 0 ? class214.method1501(class78.field1181, (byte) -59) : null;
                                if ((1 & class111.field1613) != 0 && (var55 == null || var54.method1109(class78.field1181, var55.field3519, (byte) -65) != var55.field3519)) {
                                    class28.method142(class284.field4604 + " -> <col=ff9040>" + var54.field2425, 79, class59.field865, var21, (short) 39, (long) var53, var19, class122.field1757);
                                    ++class39.field472;
                                }
                            } else {
                                ++class191.field3014;
                                String[] var56 = var54.field2432;
                                if (class287.field4637) {
                                    var56 = class20.method115(-6, var56);
                                }
                                for (int var57 = 4; ~var57 <= -1; --var57) {
                                    if (var56 != null && var56[var57] != null) {
                                        byte var58 = 0;
                                        if (~var57 == -1) {
                                            var58 = 8;
                                        }
                                        if (~var57 == -2) {
                                            var58 = 58;
                                        }
                                        ++class121.field1738;
                                        int var59 = -1;
                                        if (~var54.field2458 == ~var57) {
                                            var59 = var54.field2450;
                                        }
                                        if (var57 == 2) {
                                            var58 = 14;
                                        }
                                        if (~var57 == -4) {
                                            var58 = 34;
                                        }
                                        if (~var54.field2436 == ~var57) {
                                            var59 = var54.field2482;
                                        }
                                        if (~var57 == -5) {
                                            var58 = 18;
                                        }
                                        class28.method142("<col=ff9040>" + var54.field2425, 100, var56[var57], var21, var58, (long) var53, var19, var59);
                                    }
                                }
                                class28.method142("<col=ff9040>" + var54.field2425, arg0 ^ 99, class298.field4761, var21, (short) 1003, (long) var53, var19, class104.field1522);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 1) {
            field508 = 113;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        int[] var3 = super.field4797.method217(arg0, true);
        if (arg1 != -957953300) {
            method240(-5, -5, 89, 91, 67, 109, 108);
        }
        ++field516;
        if (super.field4797.field470) {
            int var4 = class180.field2826 / this.field511;
            int var5 = class4.field61 / this.field507;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method2018(0, -1, class4.field61 * var6 / var5);
            } else {
                var7 = this.method2018(0, arg1 ^ 957953299, 0);
            }
            for (int var8 = 0; ~var8 > ~class180.field2826; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class180.field2826 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field514;
        int var3 = -6 % (arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) -6);
        if (super.field4786.field1200) {
            int var5 = class180.field2826 / this.field511;
            int var6 = class4.field61 / this.field507;
            int[][] var8;
            if (~var6 < -1) {
                int var7 = arg1 % var6;
                var8 = this.method2021(class4.field61 * var7 / var6, false, 0);
            } else {
                var8 = this.method2021(0, false, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var4[0];
            int[] var12 = var8[2];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class180.field2826 < ~var15; ++var15) {
                int var17;
                if (~var5 < -1) {
                    int var16 = var15 % var5;
                    var17 = class180.field2826 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var11[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var12[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)V")
    public static void method241(int arg0) {
        field515 = null;
        if (arg0 != 1) {
            method242((byte) -109, true, -28, true, false);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class42() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field510;
        if (arg1 >= -43) {
            this.method99(-82, -72);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field507 = arg0.method1218(-37);
            }
        } else {
            this.field511 = arg0.method1218(78);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZIZZ)Lvl;")
    public static final class73 method242(byte arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        ++field509;
        if (arg0 < 10) {
            method241(-71);
        }
        class278 var5 = null;
        if (class138.field1988 != null) {
            var5 = new class278(arg2, class138.field1988, class112.field1628[arg2], 1000000);
        }
        class122.field1758[arg2] = class159.field2394.method553(class14.field201, var5, arg2, 8);
        if (arg3) {
            class122.field1758[arg2].method254((byte) 1);
        }
        return new class73(class122.field1758[arg2], arg1, arg4);
    }
}
