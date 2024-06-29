import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class510 extends class278 {

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public int field7485 = 1638;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public int field7486 = 4;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Z")
    public boolean field7484 = true;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[B")
    private byte[] field7478 = new byte[512];

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public int field7490 = 4;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public int field7482 = 0;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public int field7487 = 4;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field7483 = 0;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field7488 = 0;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Ljm;")
    public static class485 field7476 = new class485(70, 7);

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Ljm;")
    public static class485 field7493 = new class485(5, 3);

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "[[I")
    public static int[][] field7496 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "F")
    public static float field7495 = 1024.0F;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "Z")
    public static boolean field7494 = false;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "[S")
    private short[] field7475;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "[S")
    private short[] field7477;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field7497;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            this.method2998(arg1, var3, 3746);
        }
        return arg0 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
    public static void method2993(int arg0) {
        if (arg0 != 4) {
            method2994(77, 71, (class295) null, (byte) 107, (class162) null);
        }
        field7493 = null;
        field7496 = null;
        field7476 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILss;BLqa;)V")
    public static final void method2994(int arg0, int arg1, class295 arg2, byte arg3, class162 arg4) {
        ++field7474;
        class382 var5 = arg2.method1690(-1, arg4);
        if (var5 != null) {
            arg4.method462(arg0, arg1, arg2.field4022 + arg0, arg2.field3960 + arg1);
            if (class166.field2346 != 2 && ~class166.field2346 != -6 && class135.field1949 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (~class128.field1742 == -5) {
                    var6 = class127.field1740;
                    var7 = 4096;
                    var8 = class509.field7470;
                    var9 = (int) (-class40.field553) & 16383;
                } else {
                    var8 = class75.field1089.field461;
                    var7 = -(class482.field7072 * 16) + 4096;
                    var9 = (int) (-class40.field553) - -class22.field349 & 16383;
                    var6 = class75.field1089.field466;
                }
                int var10 = 48 - -(var6 / 32) - (class442.field6435 * 2 + -208);
                int var11 = class232.field3217 * 4 + 48 - var8 / 32 + -(class232.field3217 * 2) - -208;
                class135.field1949.method3107((float) arg2.field4022 / 2.0F + (float) arg0, (float) arg2.field3960 / 2.0F + (float) arg1, (float) var10, (float) var11, var7, var9 << 2, var5, arg0, arg1);
                for (class330 var12 = (class330) class336.field4578.method3072((byte) 34); var12 != null; var12 = (class330) class336.field4578.method3066(arg3 ^ -67)) {
                    int var54 = var12.field4495;
                    int var55 = (16383 & class13.field161.field6344[var54] >> 14) + -class215.field3059;
                    int var56 = (16383 & class13.field161.field6344[var54]) + -class79.field1134;
                    int var57 = var55 * 4 + 2 + -(var6 / 32);
                    int var58 = var56 * 4 - -2 + -(var8 / 32);
                    class169.method1047(var58, var5, var57, arg2, arg1, arg0, 2, arg4, class13.field161.field6340[var54]);
                }
                for (int var13 = 0; ~var13 > ~class220.field3079; ++var13) {
                    int var51 = class278.field3762[var13] * 4 - var6 / 32 + 2;
                    int var52 = class208.field2942[var13] * 4 - (-2 - -(var8 / 32));
                    class132 var53 = class82.field1154.method2121(class433.field6310[var13], true);
                    if (var53.field1814 != null) {
                        var53 = var53.method870(0, class453.field6623);
                        if (var53 == null || ~var53.field1829 == 0) {
                            continue;
                        }
                    }
                    class169.method1047(var52, var5, var51, arg2, arg1, arg0, 2, arg4, var53.field1829);
                }
                for (class152 var14 = (class152) class456.field6672.method981(0); var14 != null; var14 = (class152) class456.field6672.method989(0)) {
                    int var48 = (int) (3L & var14.field7342 >> 28);
                    if (class398.field5544 == var48) {
                        int var49 = (int) (16383L & var14.field7342) * 4 + 2 + -(var6 / 32);
                        int var50 = 2 + (int) (var14.field7342 >> 14 & 16383L) * 4 - var8 / 32;
                        class101.method667(var5, arg1, var49, var50, arg2, class377.field5313[0], false, arg0);
                    }
                }
                for (int var15 = 0; var15 < class166.field2352; ++var15) {
                    class405 var44 = class179.field2534[class54.field750[var15]];
                    if (var44 != null && var44.method2340((byte) 105) && ~class75.field1089.field464 == ~var44.field464) {
                        class336 var45 = var44.field5623;
                        if (var45 != null && var45.field4612 != null) {
                            var45 = var45.method1860(class453.field6623, (byte) -124);
                        }
                        if (var45 != null && var45.field4576 && var45.field4589) {
                            int var46 = var44.field466 / 32 + -(var6 / 32);
                            int var47 = var44.field461 / 32 + -(var8 / 32);
                            if (~var45.field4607 != 0) {
                                class169.method1047(var47, var5, var46, arg2, arg1, arg0, 2, arg4, var45.field4607);
                            } else {
                                class101.method667(var5, arg1, var46, var47, arg2, class377.field5313[1], false, arg0);
                            }
                        }
                    }
                }
                int var16 = class378.field5322;
                int[] var17 = class95.field1321;
                for (int var18 = 0; var16 > var18; ++var18) {
                    class192 var36 = class309.field4234[var17[var18]];
                    if (var36 != null && var36.method1159((byte) 105) && class75.field1089 != var36 && class75.field1089.field464 == var36.field464) {
                        int var37 = var36.field466 / 32 + -(var6 / 32);
                        int var38 = var36.field461 / 32 + -(var8 / 32);
                        boolean var39 = false;
                        for (int var40 = 0; ~class223.field3106 < ~var40; ++var40) {
                            if (var36.field2693.equals(class52.field702[var40]) && ~class405.field5628[var40] != -1) {
                                var39 = true;
                                break;
                            }
                        }
                        boolean var41 = false;
                        for (int var42 = 0; var42 < class520.field7653; ++var42) {
                            if (var36.field2693.equals(class80.field1136[var42].field2889)) {
                                var41 = true;
                                break;
                            }
                        }
                        boolean var43 = false;
                        if (~class75.field1089.field2703 != -1 && ~var36.field2703 != -1 && class75.field1089.field2703 == var36.field2703) {
                            var43 = true;
                        }
                        if (var36.field2702) {
                            class101.method667(var5, arg1, var37, var38, arg2, class377.field5313[6], false, arg0);
                        } else if (var39) {
                            class101.method667(var5, arg1, var37, var38, arg2, class377.field5313[3], false, arg0);
                        } else if (var41) {
                            class101.method667(var5, arg1, var37, var38, arg2, class377.field5313[5], false, arg0);
                        } else if (!var43) {
                            class101.method667(var5, arg1, var37, var38, arg2, class377.field5313[2], false, arg0);
                        } else {
                            class101.method667(var5, arg1, var37, var38, arg2, class377.field5313[4], false, arg0);
                        }
                    }
                }
                class473[] var19 = class324.field4457;
                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                    class473 var23 = var19[var20];
                    if (var23 != null && var23.field6911 != 0 && ~(class393.field5484 % 20) > -11) {
                        if (var23.field6911 == 1 && var23.field6904 >= 0 && var23.field6904 < class179.field2534.length) {
                            class405 var24 = class179.field2534[var23.field6904];
                            if (var24 != null) {
                                int var25 = var24.field466 / 32 - var6 / 32;
                                int var26 = var24.field461 / 32 + -(var8 / 32);
                                class238.method1383(var26, (byte) 117, arg2, var5, arg0, var23.field6905, arg1, 360000L, var25);
                            }
                        }
                        if (var23.field6911 == 2) {
                            int var27 = var23.field6908 / 32 + -(var6 / 32);
                            int var28 = var23.field6912 / 32 + -(var8 / 32);
                            long var29 = (long) (var23.field6903 << 5);
                            long var31 = var29 * var29;
                            class238.method1383(var28, (byte) 123, arg2, var5, arg0, var23.field6905, arg1, var31, var27);
                        }
                        if (~var23.field6911 == -11 && var23.field6904 >= 0 && var23.field6904 < class309.field4234.length) {
                            class192 var33 = class309.field4234[var23.field6904];
                            if (var33 != null) {
                                int var34 = var33.field466 / 32 + -(var6 / 32);
                                int var35 = var33.field461 / 32 - var8 / 32;
                                class238.method1383(var35, (byte) 122, arg2, var5, arg0, var23.field6905, arg1, 360000L, var34);
                            }
                        }
                    }
                }
                if (~class128.field1742 != -5) {
                    if (~class285.field3824 != -1) {
                        int var21 = 2 + (class285.field3824 * 4 - (var6 / 32 - class75.field1089.method167(-1) * 2 + 2));
                        int var22 = -(var8 / 32) + 2 + (class473.field6909 * 4 - -(class75.field1089.method167(arg3 + 64) * 2)) + -2;
                        class101.method667(var5, arg1, var21, var22, arg2, class530.field7777[class35.field489 ? 1 : 0], false, arg0);
                    }
                    arg4.method1006(arg2.field4022 / 2 + arg0 + -1, -1, arg2.field3960 / 2 + arg1 + -1, 3, 1, 3);
                }
            } else {
                arg4.method517(-16777216, var5, arg0, arg1);
            }
            if (arg3 != -65) {
                field7476 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)I")
    private final int method2995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7480;
        int var8 = arg0 >> 12;
        int var9 = var8 + 1;
        if (arg4 <= var9) {
            var9 = 0;
        }
        int var10 = arg0 & 4095;
        int var11 = var8 & 255;
        int var12 = var10 - 4096;
        int var13 = arg5 + -4096;
        int var14 = var9 & 255;
        int var15 = class176.field2504[var10];
        int var16 = this.field7478[arg2 + var11] & 3;
        int var17;
        if (var16 > 1) {
            var17 = ~var16 == -3 ? -arg5 + var10 : -arg5 + -var10;
        } else {
            var17 = var16 != 0 ? -var10 + arg5 : arg5 + var10;
        }
        int var18 = this.field7478[arg2 + var14] & 3;
        if (arg3 != 120354668) {
            return 1;
        } else {
            int var19;
            if (var18 > 1) {
                var19 = var18 == 2 ? -arg5 + var12 : -arg5 + -var12;
            } else {
                var19 = var18 != 0 ? -var12 + arg5 : arg5 + var12;
            }
            int var20 = 3 & this.field7478[arg6 + var11];
            int var21 = ((var19 - var17) * var15 >> 12) + var17;
            int var22;
            if (~var20 < -2) {
                var22 = ~var20 == -3 ? var10 - var13 : -var10 + -var13;
            } else {
                var22 = var20 == 0 ? var10 + var13 : -var10 + var13;
            }
            int var23 = 3 & this.field7478[arg6 + var14];
            int var24;
            if (var23 <= 1) {
                var24 = ~var23 != -1 ? var13 - var12 : var12 + var13;
            } else {
                var24 = ~var23 == -3 ? -var13 + var12 : -var12 - var13;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return var21 - -((-var21 + var25) * arg1 >> 12);
        }
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
    private final void method2996(int arg0) {
        ++field7492;
        if (this.field7485 <= arg0) {
            if (this.field7477 != null && this.field7477.length == this.field7490) {
                this.field7475 = new short[this.field7490];
                for (int var2 = 0; ~var2 > ~this.field7490; ++var2) {
                    this.field7475[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field7477 = new short[this.field7490];
            this.field7475 = new short[this.field7490];
            for (int var3 = 0; ~this.field7490 < ~var3; ++var3) {
                this.field7477[var3] = (short) ((int) (Math.pow((double) ((float) this.field7485 / 4096.0F), (double) var3) * 4096.0D));
                this.field7475[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class510() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field7491;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field7487 = arg0.method2099(255);
                                }
                            } else {
                                this.field7486 = arg0.method2099(255);
                            }
                        } else {
                            this.field7482 = arg0.method2099(arg1 ^ -30227);
                        }
                    } else {
                        this.field7486 = this.field7487 = arg0.method2099(arg1 ^ -30227);
                    }
                } else {
                    this.field7485 = arg0.method2069(-123);
                    if (~this.field7485 > -1) {
                        this.field7477 = new short[this.field7490];
                        for (int var5 = 0; ~var5 > ~this.field7490; ++var5) {
                            this.field7477[var5] = (short) arg0.method2069(-122);
                        }
                    }
                }
            } else {
                this.field7490 = arg0.method2099(255);
            }
        } else {
            this.field7484 = ~arg0.method2099(255) == -2;
        }
        if (arg1 != -30446) {
            this.field7475 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        this.field7478 = class158.method977(this.field7482, (byte) 23);
        ++field7479;
        this.method2996(arg0 + -2);
        for (int var2 = this.field7490 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field7477[var2];
            if (~var3 < -9 || var3 < -8) {
                break;
            }
            --this.field7490;
        }
        if (arg0 != 2) {
            this.field7485 = 49;
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
    public static final void method2997(byte arg0) {
        if (~class201.field2872 > -1) {
            class356.field4865 = -1;
            class517.field7596 = -1;
            class201.field2872 = 0;
        }
        ++field7481;
        if (~class481.field7051 > ~class201.field2872) {
            class356.field4865 = -1;
            class517.field7596 = -1;
            class201.field2872 = class481.field7051;
        }
        if (arg0 <= 65) {
            field7495 = 1.603505F;
        }
        if (~class137.field1956 > -1) {
            class137.field1956 = 0;
            class517.field7596 = -1;
            class356.field4865 = -1;
        }
        if (~class481.field7056 > ~class137.field1956) {
            class356.field4865 = -1;
            class517.field7596 = -1;
            class137.field1956 = class481.field7056;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[II)V")
    public final void method2998(int arg0, int[] arg1, int arg2) {
        ++field7489;
        int var4 = class454.field6637[arg0] * this.field7487;
        if (arg2 != 3746) {
            this.field7475 = null;
        }
        if (~this.field7490 != -2) {
            short var5 = this.field7477[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field7475[0] << 12;
                int var7 = this.field7486 * var6 >> 12;
                int var8 = this.field7487 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                if (~var11 <= ~var8) {
                    var11 = 0;
                }
                int var12 = var9 & 4095;
                int var13 = class176.field2504[var12];
                int var14 = 255 & this.field7478[var10 & 255];
                int var15 = 255 & this.field7478[var11 & 255];
                for (int var16 = 0; class507.field7456 > var16; ++var16) {
                    int var36 = class192.field2736[var16] * this.field7486;
                    int var37 = this.method2995(var6 * var36 >> 12, var13, var14, 120354668, var7, var12, var15);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field7490 > var17; ++var17) {
                short var18 = this.field7477[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field7475[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field7486 * var19 >> 12;
                    int var22 = this.field7487 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (~var24 <= ~var22) {
                        var24 = 0;
                    }
                    int var26 = class176.field2504[var25];
                    int var27 = this.field7478[var24 & 255] & 255;
                    int var28 = 255 & this.field7478[255 & var23];
                    if (this.field7484 && ~(this.field7490 + -1) == ~var17) {
                        for (int var29 = 0; var29 < class507.field7456; ++var29) {
                            int var30 = class192.field2736[var29] * this.field7486;
                            int var31 = this.method2995(var19 * var30 >> 12, var26, var28, 120354668, var21, var25, var27);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class507.field7456 > var33; ++var33) {
                            int var34 = class192.field2736[var33] * this.field7486;
                            int var35 = this.method2995(var19 * var34 >> 12, var26, var28, 120354668, var21, var25, var27);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field7475[0] << 12;
            short var39 = this.field7477[0];
            int var40 = this.field7486 * var38 >> 12;
            int var41 = this.field7487 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = var42 & 4095;
            if (var41 <= var44) {
                var44 = 0;
            }
            int var46 = this.field7478[255 & var44] & 255;
            int var47 = this.field7478[var43 & 255] & 255;
            int var48 = class176.field2504[var45];
            if (!this.field7484) {
                for (int var49 = 0; ~class507.field7456 < ~var49; ++var49) {
                    int var50 = class192.field2736[var49] * this.field7486;
                    int var51 = this.method2995(var38 * var50 >> 12, var48, var47, arg2 ^ 120355278, var40, var45, var46);
                    arg1[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class507.field7456; ++var52) {
                    int var53 = class192.field2736[var52] * this.field7486;
                    int var54 = this.method2995(var38 * var53 >> 12, var48, var47, 120354668, var40, var45, var46);
                    int var55 = var39 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }
}
