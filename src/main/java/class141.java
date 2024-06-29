import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class141 extends class223 {

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    private int field2090 = 2048;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    private int field2092 = 1024;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    private int field2091 = 1024;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    private int field2097 = 0;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    private int field2099 = 1024;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    private int field2095 = 0;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    private int field2100 = 409;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    private int field2109 = 819;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    private int field2110 = 1024;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "Lnf;")
    public static class162 field2102 = new class162(2);

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "[[[B")
    public static byte[][][] field2108;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BIIIZLpk;IIILhd;IIII)Lhd;")
    public static final class11 method1027(byte arg0, int arg1, int arg2, int arg3, boolean arg4, class103 arg5, int arg6, int arg7, int arg8, class11 arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field2103;
        long var14 = ((long) arg7 << 48) + ((long) arg2 << 32) + (long) ((arg3 << 24) + (arg11 - -(arg10 << 16)));
        class11 var16 = (class11) class150.field2219.method1173(var14, true);
        if (var16 == null) {
            byte var17;
            if (arg11 == 1) {
                var17 = 9;
            } else if (arg11 == 2) {
                var17 = 12;
            } else if (~arg11 != -4) {
                if (arg11 == 4) {
                    var17 = 18;
                } else {
                    var17 = 21;
                }
            } else {
                var17 = 15;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class271 var20 = new class271(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1849(0, 0, 0);
            for (int var23 = 0; var23 < var18; ++var23) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; ~var32 > ~var17; ++var32) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class224.field3601[var33] * var31 + arg12 >> 16;
                    int var35 = class224.field3597[var33] * var30 + arg6 >> 16;
                    var21[var23][var32] = var20.method1849(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var18 < ~var24; ++var24) {
                int var25 = (var24 * 256 - -128) / var18;
                int var26 = -var25 + 256;
                short var27 = (short) ((16515072 & (arg2 & 64512) * var26 + (64512 & arg7) * var25) + ((arg2 & 127) * var26 + (127 & arg7) * var25 & 32512) + (229376 & (arg2 & 896) * var26 + (896 & arg7) * var25) >> 8);
                byte var28 = (byte) (arg3 * var25 + arg10 * var26 >> 8);
                for (int var29 = 0; var29 < var17; ++var29) {
                    if (var24 == 0) {
                        var20.method1853(var22, var21[0][(var29 - -1) % var17], var21[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1853(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method1853(var21[var24 + -1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1844(64, 768, -50, -10, -50);
            class150.field2219.method1167((byte) -89, var16, var14);
        }
        int var36 = arg11 * 64 + -1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = arg9.method67();
        int var41 = arg9.method89();
        int var42 = arg9.method76();
        class50 var43 = null;
        int var44 = -var36;
        int var45 = arg9.method72();
        if (arg4) {
            if (~arg8 < -641 && ~arg8 > -1409) {
                var38 = var36 + 128;
            }
            if (~arg8 < -129 && ~arg8 > -897) {
                var44 -= 128;
            }
            if (arg8 > 1664 || ~arg8 > -385) {
                var37 -= 128;
            }
            if (arg8 > 1152 && arg8 < 1920) {
                var39 = var36 + 128;
            }
        }
        if (var44 > var40) {
            var40 = var44;
        }
        if (arg5 != null) {
            int var46 = arg5.field1606[arg1];
            var43 = class208.method1454((byte) -118, var46 >> 16);
            arg1 = var46 & 65535;
        }
        if (~var38 > ~var45) {
            var45 = var38;
        }
        int var47 = -16 / ((30 - arg0) / 40);
        if (~var37 < ~var42) {
            var42 = var37;
        }
        if (var39 < var41) {
            var41 = var39;
        }
        class11 var48;
        if (var43 != null) {
            var48 = var16.method68(!var43.method416(true, arg1), !var43.method415(arg1, (byte) 27), true);
            var48.method64((-var40 + var41) / 2, 128, (-var42 + var45) / 2);
            var48.method93((var40 + var41) / 2, 0, (var42 + var45) / 2);
            var48.method88(var43, arg1);
        } else {
            var48 = var16.method68(true, true, true);
            var48.method64((-var40 + var41) / 2, 128, (-var42 + var45) / 2);
            var48.method93((var40 + var41) / 2, 0, (var42 - -var45) / 2);
        }
        if (~arg8 != -1) {
            var48.method66(arg8);
        }
        class87 var49 = (class87) var48;
        if (class254.method1721(-580808345, class130.field1941, arg6 - -var42, arg12 + var40) != arg13 || ~arg13 != ~class254.method1721(-580808345, class130.field1941, arg6 + var45, arg12 + var41)) {
            for (int var50 = 0; var49.field1304 > var50; ++var50) {
                var49.field1329[var50] += -arg13 + class254.method1721(-580808345, class130.field1941, var49.field1296[var50] - -arg6, var49.field1291[var50] - -arg12);
            }
            var49.field1307 = false;
        }
        return var48;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 == 102) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 != 6) {
                                        if (~arg1 != -8) {
                                            if (~arg1 == -9) {
                                                this.field2110 = arg0.method260((byte) -67);
                                            }
                                        } else {
                                            this.field2092 = arg0.method260((byte) -67);
                                        }
                                    } else {
                                        this.field2095 = arg0.method265(-89);
                                    }
                                } else {
                                    this.field2091 = arg0.method260((byte) -67);
                                }
                            } else {
                                this.field2109 = arg0.method260((byte) -67);
                            }
                        } else {
                            this.field2100 = arg0.method260((byte) -67);
                        }
                    } else {
                        this.field2090 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field2099 = arg0.method260((byte) -67);
                }
            } else {
                this.field2097 = arg0.method265(-85);
            }
            ++field2105;
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static void method1028(int arg0) {
        field2102 = null;
        if (arg0 != -31269) {
            method1029((byte) -65, -120, 16);
        }
        field2108 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)Lng;")
    public static final class79 method1029(byte arg0, int arg1, int arg2) {
        ++field2096;
        class79 var3 = new class79();
        if (arg0 <= 75) {
            field2102 = null;
        }
        for (class303 var4 = (class303) class112.field1719.method2049(0); var4 != null; var4 = (class303) class112.field1719.method2047(-110)) {
            if (var4.field4884 && var4.method2034(false, arg1, arg2)) {
                var3.method621(var4, (byte) -53);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field2104;
        if (arg0 != 500) {
            method1027((byte) 116, 65, 94, -25, true, (class103) null, -114, -15, 7, (class11) null, -43, -28, -81, 121);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V")
    private final void method1030(int arg0, int[][] arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg6 >= -108) {
            this.method37((class31) null, -99, (byte) -110);
        }
        int var8 = this.field2110 <= 0 ? 4096 : -class216.method1495(-2, arg5, this.field2110) + 4096;
        ++field2106;
        int var9 = this.field2094 * this.field2092 >> 12;
        int var10 = this.field2094 + -(~var9 >= -1 ? 0 : class216.method1495(-2, arg5, var9));
        if (~arg3 <= ~class250.field4008) {
            arg3 -= class250.field4008;
        }
        if (~var10 >= -1) {
            if (~class250.field4008 <= ~(arg3 + arg4)) {
                for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                    class81.method633(arg1[arg0 - -var11], arg3, arg4, var8);
                }
            } else {
                int var12 = class250.field4008 - arg3;
                for (int var13 = 0; ~arg2 < ~var13; ++var13) {
                    int[] var14 = arg1[arg0 + var13];
                    class81.method633(var14, arg3, var12, var8);
                    class81.method633(var14, 0, -var12 + arg4, var8);
                }
            }
        } else if (~arg2 < -1 && arg4 > 0) {
            int var15 = arg4 / 2;
            int var16 = arg2 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg3 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg2; ++var21) {
                int[] var22 = arg1[arg0 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field2095 != -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class118.method863(arg3 + var24, class280.field4430)] = var22[class118.method863(class280.field4430, -var24 - 1 + arg3 + arg4)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class118.method863(class280.field4430, arg3 + var26)] = var22[class118.method863(-var26 + arg4 + arg3 + -1, class280.field4430)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 - -var20) < ~class250.field4008) {
                        int var27 = class250.field4008 - var19;
                        class81.method633(var22, var19, var27, var23);
                        class81.method633(var22, 0, -var27 + var20, var23);
                    } else {
                        class81.method633(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg2 - 1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field2095 != -1) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class118.method863(class280.field4430, arg3 - -var31)] = var22[class118.method863(arg3 - -arg4 - var31 + -1, class280.field4430)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class118.method863(class280.field4430, arg3 - -var33)] = var22[class118.method863(class280.field4430, -var33 + -1 + arg4 + arg3)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class250.field4008 > ~(var19 - -var20)) {
                            int var34 = -var19 + class250.field4008;
                            class81.method633(var22, var19, var34, var30);
                            class81.method633(var22, 0, var20 - var34, var30);
                        } else {
                            class81.method633(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class118.method863(arg3 + var36, class280.field4430)] = var22[class118.method863(class280.field4430, arg3 - -arg4 + -var36 + -1)] = var8 * var36 / var17;
                        }
                        if (var19 + var20 <= class250.field4008) {
                            class81.method633(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class250.field4008;
                            class81.method633(var22, var19, var37, var8);
                            class81.method633(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)Lli;")
    public static final class308 method1031(int arg0, int arg1) {
        class308 var2 = (class308) class140.field2087.method1361((byte) -95, (long) arg1);
        ++field2093;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 <= -32769) {
                var3 = class220.field3355.method721((byte) -117, 0, 32767 & arg1);
            } else {
                var3 = class268.field4237.method721((byte) -117, 0, arg1);
            }
            class308 var4 = new class308();
            if (var3 != null) {
                var4.method2064(true, new class31(var3));
            }
            if (~arg1 <= -32769) {
                var4.method2061((byte) -36);
            }
            if (arg0 >= -117) {
                method1031(-114, -18);
            }
            class140.field2087.method1365((long) arg1, (byte) 13, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            return null;
        } else {
            ++field2098;
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                int[][] var4 = super.field3588.method1612((byte) 105);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                boolean var9 = true;
                boolean var10 = true;
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int var14 = class250.field4008 * this.field2099 >> 12;
                int var15 = class250.field4008 * this.field2090 >> 12;
                int var16 = class172.field2654 * this.field2100 >> 12;
                int var17 = class172.field2654 * this.field2109 >> 12;
                if (var17 <= 1) {
                    return var4[arg1];
                } else {
                    this.field2094 = class250.field4008 / 8 * this.field2091 >> 12;
                    int var18 = 1 - -(class250.field4008 / var14);
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field2097);
                    while (true) {
                        while (true) {
                            int var22 = class216.method1495(-2, var21, -var14 + var15) + var14;
                            int var23 = var8 - -var22;
                            int var24 = var16 - -class216.method1495(-2, var21, var17 - var16);
                            if (class250.field4008 < var23) {
                                var22 = -var8 + class250.field4008;
                                var23 = class250.field4008;
                            }
                            int var27;
                            if (var10) {
                                var27 = 0;
                            } else {
                                int var25 = var11;
                                int[] var26 = var20[var11];
                                var27 = var26[2];
                                int var28 = 0;
                                int var29 = var5 + var23;
                                if (var29 < 0) {
                                    var29 += class250.field4008;
                                }
                                if (~class250.field4008 > ~var29) {
                                    var29 -= class250.field4008;
                                }
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (var29 >= var30[0] && ~var30[1] <= ~var29) {
                                        if (var11 != var25) {
                                            int var31 = var5 + var8;
                                            if (~var31 > -1) {
                                                var31 += class250.field4008;
                                            }
                                            if (~class250.field4008 > ~var31) {
                                                var31 -= class250.field4008;
                                            }
                                            for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                                int[] var40 = var20[(var11 - -var32) % var12];
                                                var27 = Math.max(var27, var40[2]);
                                            }
                                            for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                                int[] var34 = var20[(var11 + var33) % var12];
                                                int var35 = var34[2];
                                                if (~var27 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (~var31 <= ~var29) {
                                                        if (var36 == 0) {
                                                            var38 = 0;
                                                            var39 = Math.min(var29, var37);
                                                        } else {
                                                            var38 = Math.max(var31, var36);
                                                            var39 = class250.field4008;
                                                        }
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                    this.method1030(var35, var4, -var35 + var27, var6 + var38, var39 - var38, var21, -126);
                                                }
                                            }
                                        }
                                        var11 = var25;
                                        break;
                                    }
                                    ++var28;
                                    ++var25;
                                    if (var12 <= var25) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (var24 + var27 <= class172.field2654) {
                                var9 = false;
                            } else {
                                var24 = -var27 + class172.field2654;
                            }
                            if (~class250.field4008 == ~var23) {
                                this.method1030(var27, var4, var24, var7 + var8, var22, var21, -123);
                                if (var9) {
                                    return var3;
                                }
                                var6 = var7;
                                var10 = false;
                                var9 = true;
                                var11 = 0;
                                int[] var41 = var19[var13++];
                                var41[1] = var23;
                                var41[0] = var8;
                                var41[2] = var27 - -var24;
                                var7 = class216.method1495(-2, var21, class250.field4008);
                                int[][] var42 = var20;
                                var20 = var19;
                                var12 = var13;
                                var5 = var7 - var6;
                                var19 = var42;
                                var8 = 0;
                                int var43 = var5;
                                if (var5 < 0) {
                                    var43 = class250.field4008 + var5;
                                }
                                var13 = 0;
                                if (~var43 < ~class250.field4008) {
                                    var43 -= class250.field4008;
                                }
                                while (true) {
                                    int[] var44 = var20[var11];
                                    if (~var43 <= ~var44[0] && ~var43 >= ~var44[1]) {
                                        break;
                                    }
                                    ++var11;
                                    if (var11 >= var12) {
                                        var11 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[0] = var8;
                                var45[2] = var27 - -var24;
                                var45[1] = var23;
                                this.method1030(var27, var4, var24, var7 + var8, var22, var21, -127);
                                var8 = var23;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }
}
