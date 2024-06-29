import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class273 {

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    private int field302 = 81;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    private int field305 = 204;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    private int field309 = 1024;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    private int field320 = 4;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    private int field313 = 0;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    private int field322 = 409;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    private int field303 = 1024;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    private int field316 = 8;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Ljd;")
    public static class86 field318 = class122.method868(")1", true);

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "Ljd;")
    public static class86 field317 = class122.method868("Mem:", true);

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    public static int field324 = 1;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "Ljd;")
    public static class86 field326 = class122.method868("Musik)2Engine vorbereitet)3", true);

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "[I")
    private int[] field308;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "[[I")
    private int[][] field304;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "[[I")
    private int[][] field319;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "[[[B")
    public static byte[][][] field315;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILbj;)Lod;")
    public static final class90 method80(int arg0, int arg1, class151 arg2) {
        if (arg0 != 2) {
            method81(-92);
        }
        ++field325;
        return !class81.method570(14, arg2, arg1) ? null : class43.method346(4096);
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public static void method81(int arg0) {
        field318 = null;
        field317 = null;
        field326 = null;
        field315 = null;
        if (arg0 != -129) {
            method82(54, false, 127, -27, (class122) null, -45, 3, 107, -10, -59, -86, 53, 125, (class32) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZIILq;IIIIIIIILie;)Lie;")
    public static final class32 method82(int arg0, boolean arg1, int arg2, int arg3, class122 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class32 arg13) {
        ++field307;
        long var14 = ((long) arg6 << 48) + (long) ((arg5 << 24) + (arg7 - -(arg2 << 16))) - -((long) arg9 << 32);
        class32 var16 = (class32) class119.field2327.method701((byte) -125, var14);
        if (var16 == null) {
            int[] var17 = new int[] { 64, 96, 128 };
            byte var18;
            if (~arg7 == -2) {
                var18 = 9;
            } else if (arg7 != 2) {
                if (arg7 != 3) {
                    if (~arg7 == -5) {
                        var18 = 18;
                    } else {
                        var18 = 21;
                    }
                } else {
                    var18 = 15;
                }
            } else {
                var18 = 12;
            }
            byte var19 = 3;
            class192 var20 = new class192(var18 * var19 + 1, var18 * var19 * 2 + -var18, 0);
            int var21 = var20.method1328(0, 0, 0);
            int[][] var22 = new int[var19][var18];
            for (int var23 = 0; var23 < var19; ++var23) {
                int var30 = var17[var23];
                int var31 = var17[var23];
                for (int var32 = 0; var18 > var32; ++var32) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = class145.field2746[var33] * var30 + arg10 >> 16;
                    int var35 = class145.field2742[var33] * var31 + arg3 >> 16;
                    var22[var23][var32] = var20.method1328(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var24 > ~var19; ++var24) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                short var27 = (short) ((32512 & (127 & arg6) * var25 + (127 & arg9) * var26) + ((arg6 & 896) * var25 + (896 & arg9) * var26 & 229376) + ((arg6 & 64512) * var25 + (arg9 & 64512) * var26 & 16515072) >> 8);
                byte var28 = (byte) (arg2 * var26 + arg5 * var25 >> 8);
                for (int var29 = 0; ~var18 < ~var29; ++var29) {
                    if (~var24 == -1) {
                        var20.method1313(var21, var22[0][(var29 + 1) % var18], var22[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1313(var22[var24 - 1][var29], var22[var24 + -1][(var29 + 1) % var18], var22[var24][(var29 + 1) % var18], (byte) 1, var27, var28);
                        var20.method1313(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var18], var22[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1316(64, 768, -50, -10, -50);
            class119.field2327.method696(var14, var16, (byte) -96);
        }
        if (arg8 != 15) {
            method82(-81, true, 126, -74, (class122) null, 13, -106, -20, 30, -49, 55, -10, 96, (class32) null);
        }
        int var36 = arg7 * 64 + -1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg13.method214();
        int var41 = arg13.method223();
        int var42 = var36;
        if (arg1) {
            if (~arg0 < -1153 && arg0 < 1920) {
                var39 = var36 + 128;
            }
            if (~arg0 < -1665 || arg0 < 384) {
                var38 -= 128;
            }
            if (~arg0 < -129 && arg0 < 896) {
                var37 -= 128;
            }
            if (~arg0 < -641 && arg0 < 1408) {
                var42 = var36 + 128;
            }
        }
        if (~var41 < ~var39) {
            var41 = var39;
        }
        if (~var40 > ~var37) {
            var40 = var37;
        }
        int var43 = arg13.method212();
        int var44 = arg13.method213();
        if (var38 > var43) {
            var43 = var38;
        }
        if (~var44 < ~var42) {
            var44 = var42;
        }
        class193 var45 = null;
        if (arg4 != null) {
            int var46 = arg4.field2361[arg11];
            var45 = class57.method417(var46 >> 16, 104);
            arg11 = var46 & 65535;
        }
        class32 var47;
        if (var45 != null) {
            var47 = var16.method219(!var45.method1344(-125, arg11), true);
            var47.method225((-var40 + var41) / 2, 128, (var44 - var43) / 2);
            var47.method215((var40 + var41) / 2, 0, (var43 + var44) / 2);
            var47.method222(var45, arg11);
        } else {
            var47 = var16.method219(true, true);
            var47.method225((-var40 + var41) / 2, 128, (-var43 + var44) / 2);
            var47.method215((var40 + var41) / 2, 0, (var43 + var44) / 2);
        }
        if (~arg0 != -1) {
            var47.method226(arg0);
        }
        class89 var48 = (class89) var47;
        if (class30.method198(31482, arg10 + var40, arg3 + var43, class180.field3244) != arg12 || ~arg12 != ~class30.method198(31482, arg10 + var41, arg3 + var44, class180.field3244)) {
            for (int var49 = 0; var48.field1790 > var49; ++var49) {
                var48.field1783[var49] += class30.method198(31482, var48.field1772[var49] + arg10, var48.field1785[var49] + arg3, class180.field3244) + -arg12;
            }
            var48.field1780 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    private final void method83(int arg0) {
        ++field310;
        Random var2 = new Random((long) this.field316);
        this.field319 = new int[this.field316][this.field320];
        this.field304 = new int[this.field316][this.field320 + arg0];
        this.field311 = 4096 / this.field316;
        this.field306 = 4096 / this.field320;
        int var3 = this.field306 / 2;
        this.field323 = this.field302 / 2;
        this.field308 = new int[this.field316 - -1];
        int var4 = this.field311 / 2;
        this.field308[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field316; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field311;
                int var7 = (class30.method197(28, 4096, var2) + -2048) * this.field305 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field308[var5] = this.field308[var5 - 1] + var8;
            }
            this.field304[var5][0] = 0;
            for (int var9 = 0; this.field320 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field306;
                    int var11 = (class30.method197(arg0 + 24, 4096, var2) - 2048) * this.field322 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field304[var5][var9] = this.field304[var5][var9 + -1] + var12;
                }
                this.field319[var5][var9] = ~this.field303 < -1 ? -class30.method197(56, this.field303, var2) + 4096 : 4096;
            }
            this.field304[var5][this.field320] = 4096;
        }
        this.field308[this.field316] = 4096;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field314;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field303 = arg1.method1410(-70);
                                    }
                                } else {
                                    this.field302 = arg1.method1410(-88);
                                }
                            } else {
                                this.field313 = arg1.method1410(-89);
                            }
                        } else {
                            this.field309 = arg1.method1410(-115);
                        }
                    } else {
                        this.field305 = arg1.method1410(-85);
                    }
                } else {
                    this.field322 = arg1.method1410(-112);
                }
            } else {
                this.field316 = arg1.method1408((byte) -72);
            }
        } else {
            this.field320 = arg1.method1408((byte) -120);
        }
        if (arg2 >= -16) {
            this.field308 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field321;
        if (arg0 != -7420) {
            this.field308 = null;
        }
        int[] var3 = super.field4800.method1224(arg1, arg0 + 7420);
        if (super.field4800.field3160) {
            int var4 = 0;
            int var5;
            for (var5 = class143.field2711[arg1] - -this.field313; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field316 > var4 && ~var5 <= ~this.field308[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field308[var4];
            int var9 = this.field308[var4 - 1];
            if (~(var9 - -this.field323) > ~var5 && ~var5 > ~(-this.field323 + var8)) {
                for (int var10 = 0; ~class176.field3200 < ~var10; ++var10) {
                    int var11 = var7 ? this.field309 : -this.field309;
                    int var12;
                    for (var12 = class114.field2184[var10] - -(this.field306 * var11 >> 12); var12 < 0; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field320 > var13 && ~this.field304[var6][var13] >= ~var12) {
                        ++var13;
                    }
                    int var14 = this.field304[var6][var13];
                    int var15 = var13 - 1;
                    int var16 = this.field304[var6][var15];
                    if (~(this.field323 + var16) > ~var12 && -this.field323 + var14 > var12) {
                        var3[var10] = this.field319[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class250.method1688(var3, 0, class176.field3200, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 != 4095) {
            this.field323 = 93;
        }
        this.method83(1);
        ++field312;
    }
}
