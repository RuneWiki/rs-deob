import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class120 extends class63 {

    @OriginalMember(owner = "client!va", name = "Vb", descriptor = "I")
    public int field2342 = -1;

    @OriginalMember(owner = "client!va", name = "Ub", descriptor = "I")
    public int field2341 = 0;

    @OriginalMember(owner = "client!va", name = "bc", descriptor = "S")
    private short field2348 = 0;

    @OriginalMember(owner = "client!va", name = "Pb", descriptor = "I")
    public int field2336 = -1;

    @OriginalMember(owner = "client!va", name = "hc", descriptor = "I")
    public int field2354 = 0;

    @OriginalMember(owner = "client!va", name = "lc", descriptor = "I")
    public int field2358 = 0;

    @OriginalMember(owner = "client!va", name = "ic", descriptor = "Z")
    public boolean field2355 = false;

    @OriginalMember(owner = "client!va", name = "vc", descriptor = "I")
    public int field2368 = -1;

    @OriginalMember(owner = "client!va", name = "kc", descriptor = "I")
    public int field2357 = -1;

    @OriginalMember(owner = "client!va", name = "qc", descriptor = "I")
    public int field2363 = 0;

    @OriginalMember(owner = "client!va", name = "uc", descriptor = "I")
    public int field2367 = 0;

    @OriginalMember(owner = "client!va", name = "oc", descriptor = "I")
    public int field2361 = 0;

    @OriginalMember(owner = "client!va", name = "xc", descriptor = "I")
    public int field2370 = 0;

    @OriginalMember(owner = "client!va", name = "fc", descriptor = "I")
    public int field2352 = -1;

    @OriginalMember(owner = "client!va", name = "Ac", descriptor = "S")
    private short field2373 = 0;

    @OriginalMember(owner = "client!va", name = "ec", descriptor = "I")
    public int field2351 = -1;

    @OriginalMember(owner = "client!va", name = "tc", descriptor = "I")
    private int field2366 = 0;

    @OriginalMember(owner = "client!va", name = "gc", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!va", name = "mc", descriptor = "I")
    public static int field2359 = 0;

    @OriginalMember(owner = "client!va", name = "Ob", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!va", name = "Qb", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!va", name = "Tb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!va", name = "Xb", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!va", name = "Yb", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!va", name = "Zb", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!va", name = "ac", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!va", name = "dc", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!va", name = "jc", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!va", name = "nc", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!va", name = "pc", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!va", name = "rc", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!va", name = "sc", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!va", name = "wc", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!va", name = "yc", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!va", name = "zc", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!va", name = "Bc", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!va", name = "Cc", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!va", name = "Rb", descriptor = "Lpj;")
    public static class152 field2338;

    @OriginalMember(owner = "client!va", name = "Wb", descriptor = "Lti;")
    public class185 field2343;

    @OriginalMember(owner = "client!va", name = "Sb", descriptor = "Lfi;")
    public class217 field2339;

    @OriginalMember(owner = "client!va", name = "cc", descriptor = "Lsg;")
    public class30 field2349;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()I")
    public final int method22() {
        ++field2340;
        return super.field1405;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLaa;)V")
    public final void method912(boolean arg0, class8 arg1) {
        arg1.field146 = 0;
        ++field2347;
        int var3 = arg1.method63((byte) 75);
        if ((2 & var3) != 2) {
            this.field2373 = 0;
            this.field2348 = 0;
        } else {
            this.field2348 = (short) (arg1.method63((byte) 48) << 2);
            this.field2373 = (short) (arg1.method63((byte) 57) << 2);
        }
        int var4 = super.method574(true);
        boolean var5 = (var3 & 4) != 0;
        int var6 = var3 & 1;
        int var7 = -1;
        int[] var8 = new int[12];
        this.method567((byte) 82, ((var3 & 58) >> 3) + 1);
        this.field2366 = (var3 & 239) >> 6;
        super.field1360 += (this.method574(true) + -var4) * 64;
        super.field1336 += 64 * (this.method574(true) - var4);
        this.field2336 = arg1.method98(1);
        this.field2357 = arg1.method98(1);
        this.field2354 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method63((byte) 78);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method63((byte) 118);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method65((byte) 107);
                    break;
                }
                if (~var12 <= -32769) {
                    int var23 = class59.field1288[var12 - 32768];
                    var8[var9] = class182.method1314(1073741824, var23);
                    int var24 = class201.method1425(59, var23).field3120;
                    if (var24 != 0) {
                        this.field2354 = var24;
                    }
                } else {
                    var8[var9] = class182.method1314(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var22 = arg1.method63((byte) 77);
            if (var22 < 0 || var22 >= class239.field4253[var14].length) {
                var22 = 0;
            }
            var13[var14] = var22;
        }
        super.field1362 = arg1.method65((byte) 127);
        if (super.field1362 == 65535) {
            super.field1362 = -1;
        }
        super.field1392 = arg1.method65((byte) 123);
        if (~super.field1392 == -65536) {
            super.field1392 = -1;
        }
        super.field1376 = super.field1392;
        super.field1399 = arg1.method65((byte) 107);
        if (super.field1399 == 65535) {
            super.field1399 = -1;
        }
        super.field1378 = arg1.method65((byte) 117);
        if (~super.field1378 == -65536) {
            super.field1378 = -1;
        }
        super.field1354 = arg1.method65((byte) 113);
        if (~super.field1354 == -65536) {
            super.field1354 = -1;
        }
        if (arg0) {
            this.field2362 = 30;
        }
        super.field1385 = arg1.method65((byte) 114);
        if (~super.field1385 == -65536) {
            super.field1385 = -1;
        }
        super.field1359 = arg1.method65((byte) 111);
        if (super.field1359 == 65535) {
            super.field1359 = -1;
        }
        long var15 = arg1.method101(-98);
        this.field2349 = class197.method1422(var15, -122).method256(107);
        this.field2341 = arg1.method63((byte) 80);
        if (var5) {
            this.field2363 = arg1.method65((byte) 120);
            this.field2370 = this.field2341;
            this.field2351 = -1;
        } else {
            this.field2363 = 0;
            this.field2370 = arg1.method63((byte) 74);
            this.field2351 = arg1.method63((byte) 63);
            if (~this.field2351 == -256) {
                this.field2351 = -1;
            }
        }
        int var17 = this.field2358;
        this.field2358 = arg1.method63((byte) 48);
        if (this.field2358 == 0) {
            class269.method1843(this, -1);
        } else {
            int var18 = this.field2352;
            int var19 = this.field2368;
            int var20 = this.field2342;
            this.field2352 = arg1.method65((byte) 121);
            this.field2368 = arg1.method65((byte) 113);
            this.field2342 = arg1.method65((byte) 108);
            if (this.field2358 != var17 || ~this.field2352 != ~var18 || ~this.field2368 != ~var19 || this.field2342 != var20) {
                class92.method745((byte) -114, this);
            }
        }
        if (this.field2343 == null) {
            this.field2343 = new class185();
        }
        int var21 = this.field2343.field3397;
        this.field2343.method1328(0, var13, ~var6 == -2, var8, var7);
        if (~var7 != ~var21) {
            super.field1360 = super.field1349[0] * 128 - -(this.method574(true) * 64);
            super.field1336 = super.field1372[0] * 128 - -(this.method574(!arg0) * 64);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I")
    public static final int method913(int arg0, int arg1) {
        ++field2345;
        int var2 = 0;
        if (arg0 < 0 || ~arg0 <= -65537) {
            arg0 >>>= 16;
            var2 += 16;
        }
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg1 != 16) {
            method913(-58, -77);
        }
        if (~arg0 <= -5) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
    public final boolean method568(byte arg0) {
        int var2 = -2 / ((13 - arg0) / 62);
        ++field2369;
        return this.field2343 != null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2344;
        if (this.field2343 != null) {
            class138 var11 = super.field1364 != -1 && ~super.field1386 == -1 ? class193.method1396(-30590, super.field1364) : null;
            class138 var12 = super.field1370 == -1 || this.field2355 || super.field1370 == super.field1362 && var11 != null ? null : class193.method1396(-30590, super.field1370);
            class217 var13 = this.field2343.method1330(var12, super.field1402, var11, false, super.field1351);
            if (var13 != null) {
                super.field1405 = var13.method22();
                if (class113.field2240 && (~this.field2343.field3397 == 0 || class2.method14(false, this.field2343.field3397).field4262)) {
                    class217 var14 = class21.method197(0, var13, super.field1343, super.field1379, var12 != null ? super.field1351 : super.field1402, arg0, 240, true, 0, 160, 1, super.field1360, var12 != null ? var12 : var11, super.field1336);
                    var14.method21(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class247.field4394 == this) {
                    for (int var15 = class262.field4620.length + -1; var15 >= 0; --var15) {
                        class143 var16 = class262.field4620[var15];
                        if (var16 != null && ~var16.field2753 != 0) {
                            if (var16.field2754 == 1 && var16.field2755 >= 0 && ~var16.field2755 > ~class125.field2443.length) {
                                class275 var17 = class125.field2443[var16.field2755];
                                if (var17 != null) {
                                    int var18 = var17.field1360 / 32 + -(class247.field4394.field1360 / 32);
                                    int var19 = var17.field1336 / 32 - class247.field4394.field1336 / 32;
                                    this.method915(arg0, arg3, arg6, var16.field2753, arg5, var18, var13, arg1, arg7, arg2, arg4, (byte) -44, var19);
                                }
                            }
                            if (~var16.field2754 == -3) {
                                int var20 = (-class22.field421 + var16.field2760) * 4 - (class247.field4394.field1360 / 32 + -2);
                                int var21 = (-class196.field3547 + var16.field2763) * 4 + 2 + -(class247.field4394.field1336 / 32);
                                this.method915(arg0, arg3, arg6, var16.field2753, arg5, var20, var13, arg1, arg7, arg2, arg4, (byte) -57, var21);
                            }
                            if (~var16.field2754 == -11 && var16.field2755 >= 0 && class75.field1670.length > var16.field2755) {
                                class120 var22 = class75.field1670[var16.field2755];
                                if (var22 != null) {
                                    int var23 = var22.field1360 / 32 + -(class247.field4394.field1360 / 32);
                                    int var24 = var22.field1336 / 32 + -(class247.field4394.field1336 / 32);
                                    this.method915(arg0, arg3, arg6, var16.field2753, arg5, var23, var13, arg1, arg7, arg2, arg4, (byte) -104, var24);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (~this.field2348 != -1 && ~this.field2373 != -1) {
                    int var28 = class213.field3849[arg0];
                    int var29 = class213.field3846[arg0];
                    short var30 = this.field2348;
                    short var31 = this.field2373;
                    int var32 = -var31 / 2;
                    int var33 = -var30 / 2;
                    int var34 = var29 * var32 - var28 * var33 >> 16;
                    int var35 = var28 * var32 + var29 * var33 >> 16;
                    int var36 = class31.method303(super.field1360 + var35, super.field1336 - -var34, class159.field2998, -4);
                    int var37 = -var31 / 2;
                    int var38 = var30 / 2;
                    int var39 = var28 * var37 + var29 * var38 >> 16;
                    int var40 = var29 * var37 + -(var28 * var38) >> 16;
                    int var41 = class31.method303(super.field1360 + var39, super.field1336 + var40, class159.field2998, -4);
                    int var42 = var31 / 2;
                    int var43 = -var30 / 2;
                    int var44 = var28 * var42 + var29 * var43 >> 16;
                    int var45 = var30 / 2;
                    int var46 = var29 * var42 - var28 * var43 >> 16;
                    int var47 = var31 / 2;
                    int var48 = var29 * var47 - var28 * var45 >> 16;
                    int var49 = var28 * var47 - -(var29 * var45) >> 16;
                    int var50 = class31.method303(super.field1360 + var44, super.field1336 + var46, class159.field2998, -4);
                    int var51 = class31.method303(super.field1360 + var49, super.field1336 + var48, class159.field2998, -4);
                    int var52 = var36 + var51;
                    if (~(var41 + var50) > ~var52) {
                        var52 = var41 + var50;
                    }
                    int var53 = var41 > var36 ? var36 : var41;
                    int var54 = ~var51 < ~var41 ? var41 : var51;
                    int var55 = ~var50 >= ~var36 ? var50 : var36;
                    int var56 = var50 >= var51 ? var51 : var50;
                    var27 = (int) (325.95D * Math.atan2((double) (-var56 + var53), (double) var31)) & 2047;
                    if (~var27 != -1) {
                        var13.method1570(var27);
                    }
                    var25 = (int) (325.95D * Math.atan2((double) (-var54 + var55), (double) var30)) & 2047;
                    if (~var25 != -1) {
                        var13.method1559(var25);
                    }
                    var26 = (var52 >> 1) + -super.field1379;
                    if (~var26 != -1) {
                        var13.method1549(0, var26, 0);
                    }
                }
                class217 var57 = null;
                if (!this.field2355 && ~super.field1345 != 0 && super.field1403 != -1) {
                    class24 var58 = class263.method1819(super.field1345, -4);
                    var57 = var58.method217(0, super.field1403);
                    if (var57 != null) {
                        var57.method1549(0, -super.field1369, 0);
                        if (var58.field457) {
                            if (var27 != 0) {
                                var57.method1570(var27);
                            }
                            if (~var25 != -1) {
                                var57.method1559(var25);
                            }
                            if (~var26 != -1) {
                                var57.method1549(0, var26, 0);
                            }
                        }
                    }
                }
                class217 var59 = null;
                if (!this.field2355 && this.field2339 != null) {
                    if (this.field2361 <= class133.field2617) {
                        this.field2339 = null;
                    }
                    if (~class133.field2617 <= ~this.field2367 && class133.field2617 < this.field2361) {
                        var59 = this.field2339;
                        var59.method1549(-super.field1360 + this.field2350, this.field2360 - super.field1379, -super.field1336 + this.field2372);
                        if (~super.field1337 == -513) {
                            var59.method1551();
                        } else if (~super.field1337 == -1025) {
                            var59.method1567();
                        } else if (super.field1337 == 1536) {
                            var59.method1548();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class214) var13).method1561(var57);
                }
                if (var59 != null) {
                    var13 = ((class214) var13).method1561(var59);
                }
                var13.field3948 = true;
                var13.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (~super.field1337 == -513) {
                        var59.method1548();
                    } else if (super.field1337 != 1024) {
                        if (super.field1337 == 1536) {
                            var59.method1551();
                        }
                    } else {
                        var59.method1567();
                    }
                    var59.method1549(-this.field2350 + super.field1360, super.field1379 - this.field2360, -this.field2372 + super.field1336);
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZI)V")
    public final void method914(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 != 0) {
            this.field2373 = 65;
        }
        ++field2346;
        super.method569((byte) -17, arg2, arg0, this.method574(true), arg1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIILfi;IIIIBI)V")
    private final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12) {
        ++field2365;
        if (arg11 < -40) {
            int var14 = arg5 * arg5 + arg12 * arg12;
            if (var14 >= 16 && ~var14 >= -360001) {
                int var15 = 2047 & (int) (325.949D * Math.atan2((double) arg5, (double) arg12));
                class217 var16 = class92.method747(super.field1379, var15, -23983, super.field1336, arg3, super.field1360, arg6);
                if (var16 != null) {
                    var16.method21(0, arg7, arg9, arg1, arg10, arg4, arg2, arg8, -1L);
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lsg;")
    public final class30 method916(int arg0) {
        ++field2335;
        class30 var2 = this.field2349;
        if (class29.field563 != null) {
            var2 = class160.method1188(new class30[] { class29.field563[this.field2366], var2 }, 0);
        }
        if (class273.field4790 != null) {
            var2 = class160.method1188(new class30[] { var2, class273.field4790[this.field2366] }, 0);
        }
        return arg0 != -1 ? null : var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
    public final int method574(boolean arg0) {
        ++field2364;
        if (this.field2343 != null && ~this.field2343.field3397 != 0) {
            return class2.method14(false, this.field2343.field3397).field4307;
        } else {
            if (!arg0) {
                this.method22();
            }
            return super.method574(true);
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
    public static void method917(byte arg0) {
        field2338 = null;
        if (arg0 != 112) {
            field2353 = 96;
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(B)V")
    public static final void method918(byte arg0) {
        ++field2375;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~var2 > ~(class52.field1165 + -1); ++var2) {
                if (~class30.field602[var2] > -1001 && ~class30.field602[var2 - -1] < -1001) {
                    class30 var3 = class48.field1088[var2];
                    var1 = false;
                    class48.field1088[var2] = class48.field1088[var2 + 1];
                    class48.field1088[var2 + 1] = var3;
                    class30 var4 = class167.field3078[var2];
                    class167.field3078[var2] = class167.field3078[var2 + 1];
                    class167.field3078[var2 + 1] = var4;
                    int var5 = class231.field4108[var2];
                    class231.field4108[var2] = class231.field4108[var2 + 1];
                    class231.field4108[var2 + 1] = var5;
                    int var6 = class97.field1969[var2];
                    class97.field1969[var2] = class97.field1969[var2 + 1];
                    class97.field1969[var2 + 1] = var6;
                    short var7 = class30.field602[var2];
                    class30.field602[var2] = class30.field602[var2 + 1];
                    class30.field602[var2 + 1] = var7;
                    long var8 = class43.field1031[var2];
                    class43.field1031[var2] = class43.field1031[var2 + 1];
                    class43.field1031[var2 - -1] = var8;
                }
            }
        }
        if (arg0 != -26) {
            field2359 = -65;
        }
    }
}
