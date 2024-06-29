import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class77 extends class89 {

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    private int field1271 = 0;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    private int field1263 = 0;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    private int field1270 = 0;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "Lda;")
    private static class275 field1262 = class255.method1672(122, " is already on your friend list)3");

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "Lda;")
    public static class275 field1268 = class255.method1672(120, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "[Lo;")
    public static class263[] field1265 = new class263[4];

    @OriginalMember(owner = "client!kg", name = "kb", descriptor = "[I")
    public static int[] field1278 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "[I")
    public static int[] field1276 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!kg", name = "qb", descriptor = "Z")
    public static boolean field1284 = true;

    @OriginalMember(owner = "client!kg", name = "rb", descriptor = "Lda;")
    public static class275 field1285 = class255.method1672(99, "<img=1>");

    @OriginalMember(owner = "client!kg", name = "ob", descriptor = "Lda;")
    public static class275 field1282 = field1262;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!kg", name = "lb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!kg", name = "mb", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!kg", name = "nb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!kg", name = "pb", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!kg", name = "sb", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!kg", name = "tb", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "[I")
    public static int[] field1260;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[Lrk;")
    public static class20[] field1259;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field1273;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field1512.method824(arg1, (byte) -33);
            if (super.field1512.field2007) {
                int[][] var4 = this.method648(true, 0, arg1);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~var11 > ~class65.field1070; ++var11) {
                    this.method509(var5[var11], var7[var11], (byte) -118, var6[var11]);
                    this.field1287 += this.field1270;
                    this.field1261 += this.field1263;
                    this.field1264 += this.field1271;
                    if (~this.field1287 > -1) {
                        this.field1287 = 0;
                    }
                    if (~this.field1261 > -1) {
                        this.field1261 = 0;
                    }
                    while (~this.field1264 > -1) {
                        this.field1264 += 4096;
                    }
                    if (this.field1261 > 4096) {
                        this.field1261 = 4096;
                    }
                    while (~this.field1264 < -4097) {
                        this.field1264 -= 4096;
                    }
                    if (~this.field1287 < -4097) {
                        this.field1287 = 4096;
                    }
                    this.method507(this.field1264, this.field1287, this.field1261, -51);
                    var8[var11] = this.field1274;
                    var10[var11] = this.field1286;
                    var9[var11] = this.field1283;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "(I)V")
    public static final void method503(int arg0) {
        int var1 = class276.method1859((byte) -98);
        if (var1 == 0) {
            class241.field4225 = null;
            class209.method1345(0, 0);
        } else if (~var1 == -2) {
            class201.method1318((byte) 0, -44);
            class209.method1345(512, 0);
            class14.method70((byte) -114);
        } else {
            class201.method1318((byte) (class168.field2925 + -4 & 255), 114);
            class209.method1345(2, 0);
        }
        if (arg0 < 115) {
            method503(-96);
        }
        ++field1281;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field1272;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1263 = (arg1.method581(8) << 12) / 100;
                }
            } else {
                this.field1270 = (arg1.method581(8) << 12) / 100;
            }
        } else {
            this.field1271 = arg1.method570(255);
        }
        if (arg0 != -20503) {
            this.method507(45, -19, -61, 56);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class77() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static final void method504(byte arg0) {
        ++field1266;
        class71.field1160.method270(2);
        int var1 = -72 % ((77 - arg0) / 44);
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class181.field3110[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; ++var3) {
            class251.field4456[var3] = 0L;
        }
        class166.field2883 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1268 = null;
        field1262 = null;
        field1265 = null;
        if (arg0 != -7699) {
            field1282 = null;
        }
        field1259 = null;
        field1278 = null;
        field1260 = null;
        field1285 = null;
        field1282 = null;
        field1276 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lda;I[S)V")
    public static final void method506(class275[] arg0, int arg1, short[] arg2) {
        ++field1279;
        class138.method997(arg0.length + -1, arg1, 2, arg2, arg0);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIII)V")
    private final void method507(int arg0, int arg1, int arg2, int arg3) {
        ++field1280;
        int var5 = ~arg2 >= -2049 ? (arg1 + 4096) * arg2 >> 12 : arg1 + arg2 + -(arg1 * arg2 >> 12);
        if (~var5 < -1) {
            int var6 = -var5 + arg2 + arg2;
            int var7 = arg0 * 6;
            int var8 = (-var6 + var5 << 12) / var5;
            int var9 = var7 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = -(var9 << 12) + var7;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var6 + var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field1283 = var14;
                                    this.field1274 = var5;
                                    this.field1286 = var6;
                                }
                            } else {
                                this.field1274 = var15;
                                this.field1286 = var6;
                                this.field1283 = var5;
                            }
                        } else {
                            this.field1286 = var14;
                            this.field1274 = var6;
                            this.field1283 = var5;
                        }
                    } else {
                        this.field1286 = var5;
                        this.field1283 = var15;
                        this.field1274 = var6;
                    }
                } else {
                    this.field1283 = var6;
                    this.field1274 = var14;
                    this.field1286 = var5;
                }
            } else {
                this.field1274 = var5;
                this.field1283 = var6;
                this.field1286 = var15;
            }
        } else {
            this.field1274 = this.field1286 = this.field1283 = arg2;
        }
        int var17 = -111 % ((55 - arg3) / 48);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIIIII)V")
    public static final void method508(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1267;
        if (~class54.field921 != ~arg4 || class66.field1085 != arg3 || class122.field2185 != arg5 && !class262.method1714(-1)) {
            class122.field2185 = arg5;
            class54.field921 = arg4;
            class66.field1085 = arg3;
            if (class262.method1714(-1)) {
                class122.field2185 = 0;
            }
            if (!arg1) {
                class265.method1746((byte) -52, 25);
            } else {
                class265.method1746((byte) -52, 28);
            }
            class102.method731(true, 98, class237.field4123);
            int var7 = class16.field237;
            class16.field237 = (arg4 - 6) * 8;
            int var8 = class234.field4083;
            class234.field4083 = arg3 * 8 + -48;
            class138.field2418 = class231.method1500(arg6 ^ -16102, class54.field921 * 8, class66.field1085 * 8);
            class142.field2504 = null;
            int var9 = class16.field237 - var7;
            int var10 = -var8 + class234.field4083;
            int var11 = class234.field4083;
            int var12 = class16.field237;
            if (arg1) {
                class181.field3118 = 0;
                for (int var13 = 0; ~var13 > -32769; ++var13) {
                    class165 var14 = class31.field478[var13];
                    if (var14 != null) {
                        var14.field1758 -= var10 * 128;
                        var14.field1770 -= var9 * 128;
                        if (~var14.field1770 <= -1 && var14.field1770 <= 13184 && var14.field1758 >= 0 && var14.field1758 <= 13184) {
                            for (int var15 = 0; var15 < 10; ++var15) {
                                var14.field1752[var15] -= var9;
                                var14.field1722[var15] -= var10;
                            }
                            class228.field3851[class181.field3118++] = var13;
                        } else {
                            class31.field478[var13].field2873 = null;
                            class31.field478[var13] = null;
                        }
                    }
                }
            } else {
                for (int var16 = 0; ~var16 > -32769; ++var16) {
                    class165 var32 = class31.field478[var16];
                    if (var32 != null) {
                        for (int var33 = 0; var33 < 10; ++var33) {
                            var32.field1752[var33] -= var9;
                            var32.field1722[var33] -= var10;
                        }
                        var32.field1770 -= var9 * 128;
                        var32.field1758 -= var10 * 128;
                    }
                }
            }
            for (int var17 = 0; var17 < 2048; ++var17) {
                class109 var30 = class16.field238[var17];
                if (var30 != null) {
                    for (int var31 = 0; ~var31 > -11; ++var31) {
                        var30.field1752[var31] -= var9;
                        var30.field1722[var31] -= var10;
                    }
                    var30.field1770 -= var9 * 128;
                    var30.field1758 -= var10 * 128;
                }
            }
            byte var18 = 0;
            byte var19 = 104;
            byte var20 = 1;
            if (var9 < 0) {
                var18 = 103;
                var20 = -1;
                var19 = -1;
            }
            class159.field2790 = arg5;
            class66.field1094.method810(arg2, (byte) -122, arg0, false);
            byte var21 = 104;
            byte var22 = 1;
            byte var23 = 0;
            if (var10 < 0) {
                var22 = -1;
                var21 = -1;
                var23 = 103;
            }
            int var24 = var18;
            if (arg6 == 16055) {
                while (var19 != var24) {
                    for (int var26 = var23; var21 != var26; var26 += var22) {
                        int var27 = var9 + var24;
                        int var28 = var26 - -var10;
                        for (int var29 = 0; var29 < 4; ++var29) {
                            if (~var27 <= -1 && ~var28 <= -1 && ~var27 > -105 && ~var28 > -105) {
                                class118.field2122[var29][var24][var26] = class118.field2122[var29][var27][var28];
                            } else {
                                class118.field2122[var29][var24][var26] = null;
                            }
                        }
                    }
                    var24 += var20;
                }
                for (class8 var25 = (class8) class22.field336.method550(-99); var25 != null; var25 = (class8) class22.field336.method545(104)) {
                    var25.field122 -= var9;
                    var25.field126 -= var10;
                    if (var25.field122 < 0 || var25.field126 < 0 || ~var25.field122 <= -105 || var25.field126 >= 104) {
                        var25.method741(3);
                    }
                }
                class178.field3069 = -1;
                if (!arg1) {
                    class159.field2789 = 1;
                } else {
                    class23.field388 -= var10;
                    class229.field3920 -= var10;
                    class40.field670 -= var9;
                    class11.field166 -= var9;
                }
                class17.field247 = 0;
                if (~class220.field3746 != -1) {
                    class220.field3746 -= var9;
                    class108.field1878 -= var10;
                }
                class141.field2494.method549((byte) -81);
                class216.field3696.method549((byte) -115);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBI)V")
    private final void method509(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = ~arg3 < ~arg0 ? arg3 : arg0;
        int var6 = ~arg1 >= ~var5 ? var5 : arg1;
        int var7 = ~arg0 >= ~arg3 ? arg0 : arg3;
        int var8 = var7 > arg1 ? arg1 : var7;
        int var9 = -var8 + var6;
        ++field1269;
        if (var9 > 0) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (~arg3 != ~var6) {
                if (arg0 != var6) {
                    this.field1264 = arg3 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field1264 = arg1 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field1264 = ~arg0 == ~var8 ? var12 + 20480 : 4096 - var11;
            }
            this.field1264 /= 6;
        } else {
            this.field1264 = 0;
        }
        this.field1261 = (var8 - -var6) / 2;
        if (arg2 > -111) {
            this.method507(38, 100, 42, 11);
        }
        if (this.field1261 > 0 && ~this.field1261 > -4097) {
            this.field1287 = (var9 << 12) / (~this.field1261 >= -2049 ? this.field1261 * 2 : -(this.field1261 * 2) + 8192);
        } else {
            this.field1287 = 0;
        }
    }
}
