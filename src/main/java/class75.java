import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class75 extends class117 {

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    private int field1243 = 16;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    private int field1250 = 0;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    private int field1246 = 0;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    private int field1244 = 4096;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    private int field1254 = 2000;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Lqd;")
    public static class173 field1245 = new class173(4);

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILwd;)V")
    public static final void method504(int arg0, class162 arg1) {
        int var2 = class275.field4414 >> 2 << 10;
        int var3 = class275.field4415 >> 1;
        ++field1248;
        if (arg0 != -1) {
            field1245 = null;
        }
        byte[][] var4 = new byte[class275.field4408][class275.field4416];
        while (arg1.field2568 < arg1.field2573.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (~arg1.method1133((byte) 53) == -2) {
                var35 = arg1.method1133((byte) 53);
                var33 = true;
                var34 = arg1.method1133((byte) 53);
            }
            int var36 = arg1.method1133((byte) 53);
            int var37 = arg1.method1133((byte) 53);
            int var38 = var36 * 64 + -class275.field4412;
            int var39 = class275.field4416 - 1 + -(var37 * 64) + class275.field4413;
            if (~var38 <= -1 && var39 - 63 >= 0 && var38 - -63 < class275.field4408 && var39 < class275.field4416) {
                for (int var40 = 0; var40 < 64; ++var40) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; ++var42) {
                        if (!var33 || var40 >= var35 * 8 && var40 < var35 * 8 - -8 && var34 * 8 <= var42 && ~var42 > ~(var34 * 8 - -8)) {
                            var41[var39 - var42] = arg1.method1107((byte) -105);
                        }
                    }
                }
            } else if (var33) {
                arg1.field2568 += 64;
            } else {
                arg1.field2568 += 4096;
            }
        }
        int var5 = class275.field4408;
        int var6 = class275.field4416;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; ++var12) {
            if (~(511 & var12) == -1) {
                class32.method204(-31, true);
            }
            for (int var13 = 0; var6 > var13; ++var13) {
                int var27 = var12 + 5;
                int var10002;
                if (~var5 < ~var27) {
                    int var28 = var4[var27][var13] & 255;
                    if (var28 > 0) {
                        class144 var29 = class193.method1364(var28 - 1, -80);
                        var11[var13] += var29.field2287;
                        var8[var13] += var29.field2284;
                        var9[var13] += var29.field2279;
                        var7[var13] += var29.field2272;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 + -5;
                if (~var30 <= -1) {
                    int var31 = var4[var30][var13] & 255;
                    if (~var31 < -1) {
                        class144 var32 = class193.method1364(var31 + -1, -78);
                        var11[var13] -= var32.field2287;
                        var8[var13] -= var32.field2284;
                        var9[var13] -= var32.field2279;
                        var7[var13] -= var32.field2272;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (~var12 <= -1) {
                int var14 = 0;
                int[][] var15 = class275.field4430[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var6 > var20; ++var20) {
                    int var21 = var20 + 5;
                    int var22 = var20 + -5;
                    if (var21 < var6) {
                        var16 += var8[var21];
                        var17 += var9[var21];
                        var19 += var10[var21];
                        var18 += var7[var21];
                        var14 += var11[var21];
                    }
                    if (var22 >= 0) {
                        var17 -= var9[var22];
                        var16 -= var8[var22];
                        var14 -= var11[var22];
                        var19 -= var10[var22];
                        var18 -= var7[var22];
                    }
                    if (~var20 <= -1 && ~var19 < -1) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class218.method1508(var16 / var19, var17 / var19, -97, var14 * 256 / var18);
                        if (var4[var12][var20] == 0) {
                            if (var23 != null) {
                                var23[class51.method359(63, var12) + (class51.method359(63, var20) << 6)] = 0;
                            }
                        } else {
                            int var25 = (var24 & 127) + var3;
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            if (var25 >= 0) {
                                if (var25 > 127) {
                                    var25 = 127;
                                }
                            } else {
                                var25 = 0;
                            }
                            int var26 = (64512 & var2 + var24) + (var24 & 896) + var25;
                            var23[class51.method359(63, var12) + class51.method359(var20 << 6, 4032)] = class302.field4819[class63.method442(class98.method672(arg0, 82), var26, 96)];
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != 1) {
            method506(64);
        }
        ++field1247;
        class11.method53(-16416);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method505(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class173.field2830;
        class115.field1836 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class188.field3056; var12 < class183.field3013; ++var12) {
            class151[][] var38 = class218.field3584[var12];
            for (int var39 = class308.field4924; var39 < class189.field3060; ++var39) {
                for (int var40 = class52.field874; var40 < class107.field1711; ++var40) {
                    class151 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class203.field3245[var39 - class39.field562 + class209.field3307][var40 - class39.field576 + class209.field3307] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2359 = true;
                            var41.field2361 = true;
                            if (var41.field2357 > 0) {
                                var41.field2363 = true;
                            } else {
                                var41.field2363 = false;
                            }
                            ++class115.field1836;
                        } else {
                            var41.field2359 = false;
                            var41.field2361 = false;
                            var41.field2344 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2352 != null) {
                                    class209 var42 = var41.field2352;
                                    var42.field3305.method10(0, var12, var42.field3306, var42.field3312, var42.field3308);
                                    if (var42.field3316 != null) {
                                        var42.field3316.method10(0, var12, var42.field3306, var42.field3312, var42.field3308);
                                    }
                                }
                                if (var41.field2355 != null) {
                                    class259 var43 = var41.field2355;
                                    var43.field4174.method10(var43.field4187, var12, var43.field4179, var43.field4192, var43.field4183);
                                    if (var43.field4186 != null) {
                                        var43.field4186.method10(var43.field4187, var12, var43.field4179, var43.field4192, var43.field4183);
                                    }
                                }
                                if (var41.field2364 != null) {
                                    class188 var44 = var41.field2364;
                                    var44.field3057.method10(0, var12, var44.field3054, var44.field3053, var44.field3055);
                                }
                                if (var41.field2347 != null) {
                                    for (int var45 = 0; var45 < var41.field2357; ++var45) {
                                        class179 var46 = var41.field2347[var45];
                                        var46.field2932.method10(var46.field2927, var12, var46.field2924, var46.field2917, var46.field2926);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class267.field4304 == class26.field324;
        for (int var14 = class188.field3056; var14 < class183.field3013; ++var14) {
            class151[][] var27 = class218.field3584[var14];
            for (int var28 = -class209.field3307; var28 <= 0; ++var28) {
                int var29 = class39.field562 + var28;
                int var30 = class39.field562 - var28;
                if (var29 >= class308.field4924 || var30 < class189.field3060) {
                    for (int var31 = -class209.field3307; var31 <= 0; ++var31) {
                        int var32 = class39.field576 + var31;
                        int var33 = class39.field576 - var31;
                        if (var29 >= class308.field4924) {
                            if (var32 >= class52.field874) {
                                class151 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2359) {
                                    class59.method404(var34, true);
                                }
                            }
                            if (var33 < class107.field1711) {
                                class151 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2359) {
                                    class59.method404(var35, true);
                                }
                            }
                        }
                        if (var30 < class189.field3060) {
                            if (var32 >= class52.field874) {
                                class151 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2359) {
                                    class59.method404(var36, true);
                                }
                            }
                            if (var33 < class107.field1711) {
                                class151 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2359) {
                                    class59.method404(var37, true);
                                }
                            }
                        }
                        if (class115.field1836 == 0) {
                            if (!var13) {
                                class148.field2313 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class188.field3056; var15 < class183.field3013; ++var15) {
            class151[][] var16 = class218.field3584[var15];
            for (int var17 = -class209.field3307; var17 <= 0; ++var17) {
                int var18 = class39.field562 + var17;
                int var19 = class39.field562 - var17;
                if (var18 >= class308.field4924 || var19 < class189.field3060) {
                    for (int var20 = -class209.field3307; var20 <= 0; ++var20) {
                        int var21 = class39.field576 + var20;
                        int var22 = class39.field576 - var20;
                        if (var18 >= class308.field4924) {
                            if (var21 >= class52.field874) {
                                class151 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2359) {
                                    class59.method404(var23, false);
                                }
                            }
                            if (var22 < class107.field1711) {
                                class151 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2359) {
                                    class59.method404(var24, false);
                                }
                            }
                        }
                        if (var19 < class189.field3060) {
                            if (var21 >= class52.field874) {
                                class151 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2359) {
                                    class59.method404(var25, false);
                                }
                            }
                            if (var22 < class107.field1711) {
                                class151 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2359) {
                                    class59.method404(var26, false);
                                }
                            }
                        }
                        if (class115.field1836 == 0) {
                            if (!var13) {
                                class148.field2313 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class148.field2313 = false;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "(I)V")
    public static void method506(int arg0) {
        if (arg0 >= -9) {
            field1245 = null;
        }
        field1245 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            int[] var3 = super.field1883.method531(arg1, (byte) 62);
            if (super.field1883.field1313) {
                int var4 = this.field1244 >> 1;
                int[][] var5 = super.field1883.method532((byte) -10);
                Random var6 = new Random((long) this.field1246);
                for (int var7 = 0; ~this.field1254 < ~var7; ++var7) {
                    int var8 = ~this.field1244 < -1 ? this.field1250 + class67.method469(0, this.field1244, var6) - var4 : this.field1250;
                    int var9 = class67.method469(0, class168.field2737, var6);
                    int var10 = (var8 & 4090) >> 4;
                    int var11 = class67.method469(0, class149.field2335, var6);
                    int var12 = (class2.field32[var10] * this.field1243 >> 12) + var9;
                    int var13 = var11 - -(class261.field4202[var10] * this.field1243 >> 12);
                    int var14 = -var11 + var13;
                    int var15 = -var9 + var12;
                    if (var15 != 0 || var14 != 0) {
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var14 < ~var15;
                        if (var16) {
                            int var17 = var9;
                            var9 = var11;
                            var11 = var17;
                            int var18 = var12;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var9 > var12) {
                            int var19 = var9;
                            int var20 = var11;
                            var9 = var12;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var9 + var12;
                        int var23 = -var11 + var13;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var24 = -var22 / 2;
                        int var25 = 1024 + -(class67.method469(0, 4096, var6) >> 2);
                        int var26 = 2048 / var22;
                        int var27 = ~var11 <= ~var13 ? -1 : 1;
                        for (int var28 = var9; ~var28 > ~var12; ++var28) {
                            var24 += var23;
                            int var29 = (-var9 + var28) * var26 + var25 + 1024;
                            int var30 = class293.field4689 & var21;
                            int var31 = class234.field3769 & var28;
                            if (!var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (var24 > 0) {
                                var21 += var27;
                                var24 -= var22;
                            }
                        }
                    }
                }
            }
            ++field1249;
            return var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field1251;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field1244 = arg0.method1142(-18970);
                        }
                    } else {
                        this.field1250 = arg0.method1142(-18970);
                    }
                } else {
                    this.field1243 = arg0.method1133((byte) 53);
                }
            } else {
                this.field1254 = arg0.method1142(-18970);
            }
        } else {
            this.field1246 = arg0.method1133((byte) 53);
        }
        if (arg1 != 255) {
            method504(-58, (class162) null);
        }
    }
}
