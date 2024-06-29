import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class102 extends class98 {

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    private int field1242 = 1;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    private int field1244 = 1;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "[Lp;")
    public static class119[] field1247 = new class119[4];

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1239 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field1250 = 0;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILfj;Z)V")
    public static final void method569(int arg0, int arg1, int arg2, class396 arg3, boolean arg4) {
        ++field1248;
        class306 var5 = arg3.method2526(4);
        int var6 = -arg3.field5602.field4806 + arg3.field5646 & 16383;
        if (arg1 == -1) {
            if (~var6 == -1 && ~arg3.field5595 >= -26) {
                if (!arg3.field5613 || !var5.method2019((byte) 17, arg3.field5640)) {
                    arg3.field5640 = var5.method2018((byte) 109);
                    arg3.field5613 = ~arg3.field5640 != 0;
                }
            } else {
                arg3.field5613 = false;
                if (arg2 < 0 && var5.field4316 != -1) {
                    arg3.field5640 = var5.field4316;
                } else if (arg2 > 0 && var5.field4339 != -1) {
                    arg3.field5640 = var5.field4339;
                } else {
                    arg3.field5640 = var5.field4315;
                }
            }
        } else if (~arg3.field5574 != 0 && (~var6 <= -10241 || var6 <= 2048)) {
            int var7 = 16383 & class76.field893[arg0] - arg3.field5602.field4806;
            arg3.field5613 = false;
            if (~arg1 == -3 && var5.field4335 != -1) {
                if (var7 > 2048 && ~var7 >= -6145 && ~var5.field4330 != 0) {
                    arg3.field5640 = var5.field4330;
                } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field4342 != 0) {
                    arg3.field5640 = var5.field4342;
                } else if (var7 > 6144 && var7 < 10240 && ~var5.field4320 != 0) {
                    arg3.field5640 = var5.field4320;
                } else {
                    arg3.field5640 = var5.field4335;
                }
            } else if (arg1 == 0 && var5.field4290 != -1) {
                if (~var7 < -2049 && var7 <= 6144 && ~var5.field4311 != 0) {
                    arg3.field5640 = var5.field4311;
                } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field4309 != 0) {
                    arg3.field5640 = var5.field4309;
                } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field4319 != 0) {
                    arg3.field5640 = var5.field4319;
                } else {
                    arg3.field5640 = var5.field4290;
                }
            } else if (var7 > 2048 && ~var7 >= -6145 && var5.field4331 != -1) {
                arg3.field5640 = var5.field4331;
            } else if (~var7 <= -10241 && var7 < 14336 && var5.field4308 != -1) {
                arg3.field5640 = var5.field4308;
            } else if (var7 > 6144 && var7 < 10240 && ~var5.field4336 != 0) {
                arg3.field5640 = var5.field4336;
            } else {
                arg3.field5640 = var5.field4315;
            }
        } else if (var6 == 0 && arg3.field5595 <= 25) {
            arg3.field5613 = false;
            if (~arg1 == -3 && ~var5.field4335 != 0) {
                arg3.field5640 = var5.field4335;
            } else if (arg1 == 0 && ~var5.field4290 != 0) {
                arg3.field5640 = var5.field4290;
            } else {
                arg3.field5640 = var5.field4315;
            }
        } else {
            arg3.field5613 = false;
            if (~arg1 == -3 && var5.field4335 != -1) {
                if (arg2 < 0 && var5.field4312 != -1) {
                    arg3.field5640 = var5.field4312;
                } else if (~arg2 < -1 && var5.field4293 != -1) {
                    arg3.field5640 = var5.field4293;
                } else {
                    arg3.field5640 = var5.field4335;
                }
            } else if (arg1 == 0 && var5.field4290 != -1) {
                if (~arg2 > -1 && ~var5.field4302 != 0) {
                    arg3.field5640 = var5.field4302;
                } else if (~arg2 < -1 && var5.field4313 != -1) {
                    arg3.field5640 = var5.field4313;
                } else {
                    arg3.field5640 = var5.field4290;
                }
            } else if (arg2 < 0 && var5.field4338 != -1) {
                arg3.field5640 = var5.field4338;
            } else if (arg2 > 0 && var5.field4334 != -1) {
                arg3.field5640 = var5.field4334;
            } else {
                arg3.field5640 = var5.field4315;
            }
        }
        if (arg4) {
            method571((class134) null, (class343) null, 5);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field1246;
        if (arg0 != 0) {
            this.field1244 = 3;
        }
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = this.field1244 - -1 + this.field1244;
            int var5 = 65536 / var4;
            int var6 = this.field1242 + this.field1242 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1244 + arg1; ~var9 >= ~(this.field1244 + arg1); ++var9) {
                int[] var13 = this.method539(0, (byte) -86, class225.field3153 & var9);
                int[] var14 = new int[class268.field3811];
                int var15 = 0;
                for (int var16 = -this.field1242; this.field1242 >= var16; ++var16) {
                    var15 += var13[var16 & class210.field2995];
                }
                int var17 = 0;
                while (class268.field3811 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1242 + var17 & class210.field2995];
                    ++var17;
                    var15 = var13[this.field1242 + var17 & class210.field2995] + var18;
                }
                var8[this.field1244 + var9 - arg1] = var14;
            }
            for (int var10 = 0; var10 < class268.field3811; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field1238;
        int var3 = 124 / ((60 - arg1) / 43);
        int[][] var4 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int var5 = this.field1244 - (-this.field1244 + -1);
            int var6 = 65536 / var5;
            int var7 = this.field1242 + this.field1242 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field1244 + arg0; ~var10 >= ~(this.field1244 + arg0); ++var10) {
                int[][] var20 = this.method546(var10 & class225.field3153, (byte) 33, 0);
                int[][] var21 = new int[3][class268.field3811];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field1242; ~var28 >= ~this.field1242; ++var28) {
                    int var38 = class210.field2995 & var28;
                    var23 += var26[var38];
                    var24 += var27[var38];
                    var22 += var25[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (class268.field3811 > var32) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = -this.field1242 + var32 & class210.field2995;
                    int var34 = var23 - var26[var33];
                    int var35 = var24 - var27[var33];
                    int var36 = var22 - var25[var33];
                    ++var32;
                    int var37 = var32 - -this.field1242 & class210.field2995;
                    var22 = var25[var37] + var36;
                    var24 = var27[var37] + var35;
                    var23 = var26[var37] + var34;
                }
                var9[this.field1244 + var10 + -arg0] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; var14 < class268.field3811; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var15 += var19[0][var14];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(B)V")
    public static void method570(byte arg0) {
        int var1 = -75 % ((-13 - arg0) / 43);
        field1239 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lae;Lul;I)V")
    public static final void method571(class134 arg0, class343 arg1, int arg2) {
        ++field1243;
        if (class308.field4345 != null) {
            if (class310.field4383 < 10) {
                if (!class308.field4344.method2427((byte) 125, class308.field4345.field4208)) {
                    class310.field4383 = class4.field32.method2430((byte) -99, class308.field4345.field4208) / 10;
                    return;
                }
                class89.method491(102);
                class310.field4383 = 10;
            }
            if (class310.field4383 == 10) {
                class308.field4367 = class308.field4345.field4202 >> 6 << 6;
                class308.field4368 = class308.field4345.field4207 >> 6 << 6;
                class308.field4364 = (class308.field4345.field4205 >> 6 << 6) + 64 + -class308.field4367;
                class308.field4359 = (class308.field4345.field4204 >> 6 << 6) + -class308.field4368 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class308.field4345.method1980(0, class41.field496 - -(class384.field5422.field3269 >> 7), (class384.field5422.field3284 >> 7) + class114.field1403, class129.field1570, var3)) {
                    var4 = var3[1] + -class308.field4368;
                    var5 = var3[2] + -class308.field4367;
                }
                if (!class356.field5013 && var4 >= 0 && ~var4 > ~class308.field4359 && var5 >= 0 && ~class308.field4364 < ~var5) {
                    int var6 = var4 + ((int) (Math.random() * 10.0D) - 5);
                    int var7 = var5 + -5 + (int) (Math.random() * 10.0D);
                    class419.field5993 = var7;
                    class324.field4619 = var6;
                } else if (class121.field1490 != -1 && ~class255.field3675 != 0) {
                    class308.field4345.method1981(class121.field1490, var3, 1, class255.field3675);
                    if (var3 != null) {
                        class419.field5993 = var3[2] + -class308.field4367;
                        class324.field4619 = var3[1] + -class308.field4368;
                    }
                    class356.field5013 = false;
                    class255.field3675 = -1;
                    class121.field1490 = -1;
                } else {
                    class308.field4345.method1981((268425089 & class308.field4345.field4206) >> 14, var3, 1, 16383 & class308.field4345.field4206);
                    class324.field4619 = var3[1] + -class308.field4368;
                    class419.field5993 = var3[2] + -class308.field4367;
                }
                if (class308.field4345.field4200 != 37) {
                    if (class308.field4345.field4200 != 50) {
                        if (~class308.field4345.field4200 == -76) {
                            class308.field4355 = 6.0F;
                            class308.field4351 = 6.0F;
                        } else if (~class308.field4345.field4200 == -101) {
                            class308.field4355 = 8.0F;
                            class308.field4351 = 8.0F;
                        } else if (class308.field4345.field4200 == 200) {
                            class308.field4355 = 16.0F;
                            class308.field4351 = 16.0F;
                        } else {
                            class308.field4355 = 8.0F;
                            class308.field4351 = 8.0F;
                        }
                    } else {
                        class308.field4355 = 4.0F;
                        class308.field4351 = 4.0F;
                    }
                } else {
                    class308.field4355 = 3.0F;
                    class308.field4351 = 3.0F;
                }
                class308.field4354 = (int) class308.field4355 >> 1;
                class308.field4348 = class138.method857(class308.field4354, -14209);
                class181.method1221(0);
                class308.method2037();
                class174.field2393 = new class92();
                class308.field4350 += -2 + (int) (Math.random() * 5.0D);
                if (class308.field4350 < -8) {
                    class308.field4350 = -8;
                }
                if (class308.field4350 > 8) {
                    class308.field4350 = 8;
                }
                class308.field4347 += -2 + (int) (5.0D * Math.random());
                if (class308.field4347 < -16) {
                    class308.field4347 = -16;
                }
                if (class308.field4347 > 16) {
                    class308.field4347 = 16;
                }
                class308.method2034(arg1, class308.field4350 >> 2 << 10, class308.field4347 >> 1);
                class35.method216(256, 1024, (byte) -22);
                class19.method133(256, 256, -28663);
                class192.method1304((byte) 4, 4096);
                class347.method2215(123, 256);
                class310.field4383 = 20;
            } else if (class310.field4383 == 20) {
                class87.method470(true, (byte) -23);
                class308.method2023(arg0, class308.field4350, class308.field4347);
                class310.field4383 = 60;
                class87.method470(true, (byte) -102);
                class135.method845(256);
            } else {
                int var8 = -32 % ((-11 - arg2) / 41);
                if (~class310.field4383 == -61) {
                    if (class308.field4344.method2405(class308.field4345.field4208 + "_staticelements", (byte) -65)) {
                        if (!class308.field4344.method2427((byte) 125, class308.field4345.field4208 + "_staticelements")) {
                            return;
                        }
                        class308.field4353 = class297.method1963(class308.field4344, 14003, class308.field4345.field4208 + "_staticelements", class190.field2742);
                    } else {
                        class308.field4353 = new class230(0);
                    }
                    class308.method2038();
                    class310.field4383 = 70;
                    class87.method470(true, (byte) -83);
                    class135.method845(256);
                } else if (~class310.field4383 == -71) {
                    class11.field143 = new class60(arg0, 11, true, class402.field5767);
                    class310.field4383 = 73;
                    class87.method470(true, (byte) 111);
                    class135.method845(256);
                } else if (class310.field4383 == 73) {
                    class302.field4256 = new class60(arg0, 12, true, class402.field5767);
                    class310.field4383 = 76;
                    class87.method470(true, (byte) 116);
                    class135.method845(256);
                } else if (class310.field4383 == 76) {
                    class279.field3952 = new class60(arg0, 14, true, class402.field5767);
                    class310.field4383 = 79;
                    class87.method470(true, (byte) 110);
                    class135.method845(256);
                } else if (~class310.field4383 == -80) {
                    class325.field4626 = new class60(arg0, 17, true, class402.field5767);
                    class310.field4383 = 82;
                    class87.method470(true, (byte) -118);
                    class135.method845(256);
                } else if (~class310.field4383 == -83) {
                    class382.field5364 = new class60(arg0, 19, true, class402.field5767);
                    class310.field4383 = 85;
                    class87.method470(true, (byte) -90);
                    class135.method845(256);
                } else if (~class310.field4383 == -86) {
                    class232.field3266 = new class60(arg0, 22, true, class402.field5767);
                    class310.field4383 = 88;
                    class87.method470(true, (byte) -90);
                    class135.method845(256);
                } else if (~class310.field4383 == -89) {
                    class210.field2994 = new class60(arg0, 26, true, class402.field5767);
                    class310.field4383 = 91;
                    class87.method470(true, (byte) 112);
                    class135.method845(256);
                } else {
                    class148.field1820 = new class60(arg0, 30, true, class402.field5767);
                    class310.field4383 = 100;
                    class87.method470(true, (byte) 126);
                    class135.method845(256);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)V")
    public static final void method572(byte arg0, int arg1, int arg2) {
        if (arg0 > -65) {
            method569(-57, -75, 79, (class396) null, true);
        }
        class151.field1865[arg1] = arg2;
        ++field1241;
        class164 var3 = (class164) class281.field3985.method1888((long) arg1, (byte) -30);
        if (var3 != null) {
            if (var3.field2315 != 4611686018427387905L) {
                var3.field2315 = 500L + class175.method1195(89) | 4611686018427387904L;
                return;
            }
        } else {
            class164 var4 = new class164(4611686018427387905L);
            class281.field3985.method1886(var4, (long) arg1, 1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
    public static final void method573(int arg0, int arg1) {
        class367.field5205 = arg0;
        class193.field2793 = -1;
        ++field1249;
        class383.field5407 = 1;
        class128.field1558 = arg1;
        class295.field4117 = false;
        class362.field5168 = null;
        class311.field4393 = 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            method571((class134) null, (class343) null, 13);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1176 = ~arg1.method1574(arg2 + -99) == -2;
                }
            } else {
                this.field1244 = arg1.method1574(-5);
            }
        } else {
            this.field1242 = arg1.method1574(-52);
        }
        ++field1240;
    }
}
