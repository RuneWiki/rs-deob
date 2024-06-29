import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class438 extends class56 {

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    private int field5763 = -1;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "Lkq;")
    public static class620 field5760 = null;

    @OriginalMember(owner = "client!uw", name = "O", descriptor = "Z")
    public static boolean field5771 = false;

    @OriginalMember(owner = "client!uw", name = "P", descriptor = "Z")
    public static boolean field5772 = false;

    @OriginalMember(owner = "client!uw", name = "M", descriptor = "Z")
    public static boolean field5769 = false;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!uw", name = "Q", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!uw", name = "R", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!uw", name = "S", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!uw", name = "T", descriptor = "I")
    public int field5776;

    @OriginalMember(owner = "client!uw", name = "U", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "[I")
    public int[] field5768;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(Z)V", line = 4)
    public final void method489(boolean arg0) {
        super.method489(arg0);
        ++field5767;
        this.field5768 = null;
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V", line = 13)
    public static final void method2582(int arg0) {
        if (arg0 != 1024) {
            field5772 = false;
        }
        class645.field8787 = null;
        class256.field2987 = null;
        class304.field3625 = null;
        class134.field1676 = false;
        class372.field4690 = null;
        class124.field1583 = null;
        ++field5766;
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(Z)V", line = 34)
    public static final void method2583(boolean arg0) {
        ++field5775;
        for (int var1 = 0; ~var1 > ~class358.field4430; ++var1) {
            int var2 = class7.field123[var1];
            class388 var3 = ((class273) class30.field444.method2121(87, (long) var2)).field3210;
            int var4 = class583.field7964.method2396((byte) 33);
            if ((4 & var4) != 0) {
                var4 += class583.field7964.method2396((byte) 29) << 8;
            }
            if ((var4 & 32768) != 0) {
                var4 += class583.field7964.method2396((byte) -91) << 16;
            }
            if ((var4 & 2048) != 0) {
                int var5 = class583.field7964.method2421((byte) 99);
                var3.field3411 = class583.field7964.method2374((byte) 66);
                var3.field3441 = class583.field7964.method2396((byte) 60);
                var3.field3371 = (32768 & var5) != 0;
                var3.field3362 = 32767 & var5;
                var3.field3379 = class228.field2707 - -var3.field3411 + var3.field3362;
            }
            if (~(1024 & var4) != -1) {
                int var6 = class583.field7964.method2386((byte) -114);
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                for (int var10 = 0; ~var10 > ~var6; ++var10) {
                    int var11 = class583.field7964.method2414(255);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    var7[var10] = var11;
                    var8[var10] = class583.field7964.method2374((byte) 110);
                    var9[var10] = class583.field7964.method2414(255);
                }
                class632.method3570(var7, var8, var3, var9, (byte) -37);
            }
            if (~(16 & var4) != -1) {
                var3.field3377 = class583.field7964.method2414(255);
                if (var3.field3377 == 65535) {
                    var3.field3377 = -1;
                }
            }
            if (~(var4 & 65536) != -1) {
                int var12 = var3.field5003.field6665.length;
                int var13 = 0;
                if (var3.field5003.field6655 != null) {
                    var13 = var3.field5003.field6655.length;
                }
                if (var3.field5003.field6690 != null) {
                    var13 = var3.field5003.field6690.length;
                }
                byte var14 = 0;
                int var15 = class583.field7964.method2386((byte) -92);
                if (~(1 & var15) != -2) {
                    int[] var16 = null;
                    if ((var15 & 2) == 2) {
                        var16 = new int[var12];
                        for (int var17 = 0; var17 < var12; ++var17) {
                            var16[var17] = class583.field7964.method2414(255);
                        }
                    }
                    short[] var18 = null;
                    if (~(var15 & 4) == -5) {
                        var18 = new short[var13];
                        for (int var19 = 0; var13 > var19; ++var19) {
                            var18[var19] = (short) class583.field7964.method2421((byte) 126);
                        }
                    }
                    short[] var20 = null;
                    if ((var15 & 8) == 8) {
                        var20 = new short[var14];
                        for (int var21 = 0; var21 < var14; ++var21) {
                            var20[var21] = (short) class583.field7964.method2402((byte) 80);
                        }
                    }
                    long var22 = (long) var2 | (long) (var3.field4992++) << 32;
                    new class782(var22, var16, var18, var20);
                }
            }
            if ((8 & var4) != 0) {
                if (var3.field5003.method2845(false)) {
                    class382.method2253(var3, true);
                }
                var3.method2275(class444.field5956.method1070(class583.field7964.method2402((byte) 116), true), (byte) -115);
                var3.method1666(var3.field5003.field6710, true);
                var3.field3413 = var3.field5003.field6688 << 3;
                if (var3.field5003.method2845(false)) {
                    class250.method1497(84, var3, (class521) null, var3.field808, var3.field3455[0], (class174) null, 0, var3.field3453[0]);
                }
            }
            if ((2 & var4) != 0) {
                var3.field4989 = class583.field7964.method2390((byte) -124);
                var3.field4978 = class583.field7964.method2390((byte) 71);
            }
            if ((524288 & var4) != 0) {
                int var24 = class583.field7964.method2402((byte) 107);
                int var25 = class583.field7964.method2368(-129);
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var26 = class583.field7964.method2374((byte) 92);
                int var27 = 7 & var26;
                int var28 = var26 >> 3 & 15;
                if (~var28 == -16) {
                    var28 = -1;
                }
                var3.method1681(2, var24, var28, -1, var27, var25);
            }
            if ((16384 & var4) != 0) {
                var3.field3403 = class583.field7964.method2392(116);
                var3.field3366 = class583.field7964.method2413(-28137);
                var3.field3416 = class583.field7964.method2406(-123);
                var3.field3427 = (byte) class583.field7964.method2374((byte) 116);
                var3.field3387 = class228.field2707 + class583.field7964.method2390((byte) 89);
                var3.field3440 = class228.field2707 - -class583.field7964.method2421((byte) 117);
            }
            if (~(var4 & 8192) != -1) {
                int var29 = class583.field7964.method2396((byte) 47);
                int[] var30 = new int[var29];
                int[] var31 = new int[var29];
                for (int var32 = 0; ~var32 > ~var29; ++var32) {
                    int var33 = class583.field7964.method2421((byte) 86);
                    if (~(49152 & var33) != -49153) {
                        var30[var32] = var33;
                    } else {
                        int var34 = class583.field7964.method2421((byte) 47);
                        var30[var32] = class5.method105(var34, var33 << 16);
                    }
                    var31[var32] = class583.field7964.method2414(255);
                }
                var3.method1679(1, var31, var30);
            }
            if (~(4096 & var4) != -1) {
                var3.field3383 = class583.field7964.method2362((byte) 110);
                var3.field3401 = class583.field7964.method2413(-28137);
                var3.field3357 = class583.field7964.method2413(-28137);
                var3.field3398 = class583.field7964.method2392(126);
                var3.field3375 = class583.field7964.method2390((byte) -127) + class228.field2707;
                var3.field3428 = class583.field7964.method2402((byte) 104) + class228.field2707;
                var3.field3418 = class583.field7964.method2374((byte) 59);
                var3.field3458 = 1;
                var3.field3401 += var3.field3455[0];
                var3.field3398 += var3.field3455[0];
                var3.field3357 += var3.field3453[0];
                var3.field3456 = 0;
                var3.field3383 += var3.field3453[0];
            }
            if (~(32 & var4) != -1) {
                int var35 = class583.field7964.method2393((byte) -107);
                if (~var35 < -1) {
                    for (int var36 = 0; var35 > var36; ++var36) {
                        int var37 = -1;
                        int var38 = -1;
                        int var39 = class583.field7964.method2354((byte) -114);
                        int var40 = -1;
                        if (var39 != 32767) {
                            if (var39 != 32766) {
                                var38 = class583.field7964.method2354((byte) -126);
                            } else {
                                var39 = -1;
                            }
                        } else {
                            var39 = class583.field7964.method2354((byte) -106);
                            var38 = class583.field7964.method2354((byte) 112);
                            var37 = class583.field7964.method2354((byte) 20);
                            var40 = class583.field7964.method2354((byte) 105);
                        }
                        int var41 = class583.field7964.method2354((byte) 77);
                        int var42 = class583.field7964.method2386((byte) -128);
                        var3.method1662(arg0, var40, var37, var38, class228.field2707, var39, var42, var41);
                    }
                }
            }
            if ((262144 & var4) != 0) {
                var3.field4998 = class583.field7964.method2384(-6435);
                if ("".equals(var3.field4998) || var3.field4998.equals(var3.field5003.field6647)) {
                    var3.field4998 = var3.field5003.field6647;
                }
            }
            if (~(1 & var4) != -1) {
                var3.field3381 = class583.field7964.method2384(-6435);
                var3.field3437 = 100;
            }
            if (~(512 & var4) != -1) {
                int var43 = class583.field7964.method2390((byte) -127);
                int var44 = class583.field7964.method2381((byte) 23);
                if (var43 == 65535) {
                    var43 = -1;
                }
                int var45 = class583.field7964.method2396((byte) -125);
                int var46 = 7 & var45;
                int var47 = 15 & var45 >> 3;
                if (~var47 == -16) {
                    var47 = -1;
                }
                var3.method1681(1, var43, var47, -1, var46, var44);
            }
            if (~(var4 & 64) != -1) {
                int var48 = class583.field7964.method2402((byte) 106);
                int var49 = class583.field7964.method2381((byte) 96);
                if (~var48 == -65536) {
                    var48 = -1;
                }
                int var50 = class583.field7964.method2386((byte) -123);
                int var51 = 7 & var50;
                int var52 = var50 >> 3 & 15;
                if (~var52 == -16) {
                    var52 = -1;
                }
                var3.method1681(0, var48, var52, -1, var51, var49);
            }
            if (~(var4 & 128) != -1) {
                int[] var53 = new int[4];
                for (int var54 = 0; ~var54 > -5; ++var54) {
                    var53[var54] = class583.field7964.method2421((byte) 99);
                    if (var53[var54] == 65535) {
                        var53[var54] = -1;
                    }
                }
                int var55 = class583.field7964.method2386((byte) -122);
                class95.method832(var55, var53, 0, var3);
            }
            if ((var4 & 256) != 0) {
                int var56 = var3.field5003.field6701.length;
                int var57 = 0;
                if (var3.field5003.field6655 != null) {
                    var57 = var3.field5003.field6655.length;
                }
                int var58 = 0;
                if (var3.field5003.field6690 != null) {
                    var58 = var3.field5003.field6690.length;
                }
                int var59 = class583.field7964.method2374((byte) 77);
                if (~(var59 & 1) == -2) {
                    var3.field4982 = null;
                } else {
                    int[] var60 = null;
                    if ((2 & var59) == 2) {
                        var60 = new int[var56];
                        for (int var61 = 0; ~var56 < ~var61; ++var61) {
                            var60[var61] = class583.field7964.method2390((byte) -2);
                        }
                    }
                    short[] var62 = null;
                    if (~(4 & var59) == -5) {
                        var62 = new short[var57];
                        for (int var63 = 0; var57 > var63; ++var63) {
                            var62[var63] = (short) class583.field7964.method2390((byte) -113);
                        }
                    }
                    short[] var64 = null;
                    if ((8 & var59) == 8) {
                        var64 = new short[var58];
                        for (int var65 = 0; ~var65 > ~var58; ++var65) {
                            var64[var65] = (short) class583.field7964.method2421((byte) 45);
                        }
                    }
                    long var66 = (long) (var3.field5004++) << 32 | (long) var2;
                    var3.field4982 = new class782(var66, var60, var62, var64);
                }
            }
            if ((131072 & var4) != 0) {
                var3.field4996 = class583.field7964.method2421((byte) 33);
                if (var3.field4996 == 65535) {
                    var3.field4996 = var3.field5003.field6709;
                }
            }
        }
        if (arg0) {
            field5760 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)V", line = 524)
    public static final void method2584(int arg0) {
        if (arg0 != 13827) {
            field5769 = false;
        }
        ++field5774;
        class678.method3815(-123);
        int var1 = class118.field1503.field10673.method2087(0);
        if (~var1 != -3) {
            if (~var1 == -4) {
                class290.method1698(class363.field4526, true, 2, class701.field9880, class705.field9921, 2, class507.field7209, class248.field2925);
            }
        } else {
            class710.method4026(100, class705.field9921, class701.field9880, -1, 100, class363.field4526);
        }
        if (class118.field1503.field10673.method2088(124)) {
            class5.method104(arg0 + -23453, class109.field1370);
        }
        if (class363.field4526 != null) {
            class587.method3368((byte) 69);
        }
        class502.field7084 = class118.field1503.field10673.method2087(0) != 0;
        class769.field10572 = class118.field1503.field10673.method2088(118);
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V", line = 568)
    public class438() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBI)I", line = 571)
    public static final int method2585(int arg0, byte arg1, int arg2) {
        int var3 = -101 % ((arg1 - 80) / 36);
        ++field5762;
        return arg0 != 1 && arg0 != 3 ? class172.field2053[arg2 & 3] : class427.field5653[arg2 & 3];
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V", line = 589)
    public static void method2586(byte arg0) {
        field5760 = null;
        if (arg0 < 2) {
            field5760 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I", line = 605)
    public final int method494(int arg0) {
        if (arg0 != -1) {
            return 108;
        } else {
            ++field5765;
            return this.field5763;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BILes;)V", line = 620)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 == 0) {
            this.field5763 = arg2.method2390((byte) 6);
        }
        ++field5773;
        if (arg0 > -44) {
            this.method2587(true);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BI)[[I", line = 640)
    public int[][] method187(byte arg0, int arg1) {
        ++field5770;
        if (arg0 < 35) {
            this.method494(37);
        }
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341 && this.method2587(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class784.field10832 != this.field5777 ? this.field5777 * arg1 / class784.field10832 : arg1) * this.field5776;
            if (~class642.field8759 != ~this.field5776) {
                for (int var8 = 0; class642.field8759 > var8; ++var8) {
                    int var9 = this.field5776 * var8 / class642.field8759;
                    int var10 = this.field5768[var7 + var9];
                    var6[var8] = class296.method1733(4080, var10 << 4);
                    var5[var8] = class296.method1733(65280, var10) >> 4;
                    var4[var8] = class296.method1733(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class642.field8759; ++var11) {
                    int var12 = this.field5768[var7++];
                    var6[var11] = class296.method1733(255, var12) << 4;
                    var5[var11] = class296.method1733(4080, var12 >> 4);
                    var4[var11] = class296.method1733(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(Z)Z", line = 709)
    public final boolean method2587(boolean arg0) {
        if (!arg0) {
            method2584(-8);
        }
        ++field5761;
        if (this.field5768 != null) {
            return true;
        } else if (this.field5763 >= 0) {
            class600 var2 = class543.field7622 >= 0 ? class600.method3429(class722.field10136, class543.field7622, this.field5763) : class600.method3431(class722.field10136, this.field5763);
            var2.method3421();
            this.field5768 = var2.method3425();
            this.field5776 = var2.field8123;
            this.field5777 = var2.field8116;
            return true;
        } else {
            return false;
        }
    }
}
