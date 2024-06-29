import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class148 extends class135 {

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "I")
    private int field2341 = 0;

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "I")
    private int field2349 = 0;

    @OriginalMember(owner = "client!je", name = "rb", descriptor = "I")
    private int field2352 = 0;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "Lqj;")
    public static class196 field2335 = class80.method502("unzap", -48);

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Lqj;")
    public static class196 field2330 = class80.method502(")3)3)3", -48);

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "[I")
    public static int[] field2334 = new int[1000];

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field2336 = 0;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "Lqj;")
    public static class196 field2344 = class80.method502(" <col=ffff00>", -48);

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!je", name = "pb", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!je", name = "qb", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!je", name = "sb", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!je", name = "tb", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!je", name = "ub", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "Lah;")
    public static class22 field2338;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lbk;B)V")
    public static final void method922(class136 arg0, byte arg1) {
        ++field2355;
        if (arg1 != 56) {
            method926(-32, 42, -63, 10, 110, 38, -103, -118);
        }
        class72.field1032 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I")
    public static final int method923(byte arg0) {
        ++field2353;
        if (class25.field315 == 3.0D) {
            return 37;
        } else if (class25.field315 == 4.0D) {
            return 50;
        } else {
            if (arg0 >= -54) {
                field2330 = null;
            }
            return class25.field315 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V")
    public static final void method924(byte arg0) {
        class126.field1785.method1529(382);
        ++field2331;
        class198.field3515.method135(-98);
        int var1 = 98 % ((arg0 - 5) / 44);
        class256.field4497.method1529(382);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZ)V")
    private final void method925(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2351;
        int var5 = ~arg2 <= ~arg0 ? arg2 : arg0;
        if (!arg3) {
            this.method97((class56) null, -32, -22);
        }
        int var6 = var5 < arg1 ? arg1 : var5;
        int var7 = ~arg2 >= ~arg0 ? arg2 : arg0;
        int var8 = arg1 < var7 ? arg1 : var7;
        this.field2337 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field2333 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (arg0 != var6) {
                if (~arg2 == ~var6) {
                    this.field2333 = ~arg1 == ~var8 ? var10 + 4096 : -var12 + 12288;
                } else {
                    this.field2333 = ~arg0 == ~var8 ? var11 + 12288 : -var10 + 20480;
                }
            } else {
                this.field2333 = ~arg2 == ~var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field2333 /= 6;
        }
        if (this.field2337 > 0 && ~this.field2337 > -4097) {
            this.field2343 = (var9 << 12) / (~this.field2337 >= -2049 ? this.field2337 * 2 : -(this.field2337 * 2) + 8192);
        } else {
            this.field2343 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        if (arg0 != 260028743) {
            this.method925(-94, 14, 120, false);
        }
        int[][] var3 = super.field1947.method511(arg1, -1);
        ++field2332;
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(2, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; ~var11 > ~class131.field1862; ++var11) {
                this.method925(var10[var11], var7[var11], var5[var11], true);
                this.field2337 += this.field2341;
                if (this.field2337 < 0) {
                    this.field2337 = 0;
                }
                this.field2343 += this.field2352;
                this.field2333 += this.field2349;
                if (~this.field2343 > -1) {
                    this.field2343 = 0;
                }
                if (this.field2343 > 4096) {
                    this.field2343 = 4096;
                }
                while (~this.field2333 > -1) {
                    this.field2333 += 4096;
                }
                if (~this.field2337 < -4097) {
                    this.field2337 = 4096;
                }
                while (~this.field2333 < -4097) {
                    this.field2333 -= 4096;
                }
                this.method927(this.field2337, (byte) -70, this.field2343, this.field2333);
                var6[var11] = this.field2354;
                var8[var11] = this.field2342;
                var9[var11] = this.field2346;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2348;
        int var8 = -24 / ((-23 - arg3) / 63);
        if (arg4 >= 1 && ~arg0 <= -2 && ~arg4 >= -103 && ~arg0 >= -103) {
            if (!class9.method37(0) && (2 & class88.field1300[0][arg4][arg0]) == 0) {
                int var9 = arg2;
                if ((class88.field1300[arg2][arg4][arg0] & 8) != 0) {
                    var9 = 0;
                }
                if (~class67.field948 != ~var9) {
                    return;
                }
            }
            int var10 = arg2;
            if (~arg2 > -4 && ~(2 & class88.field1300[1][arg4][arg0]) == -3) {
                var10 = arg2 + 1;
            }
            class153.method972(arg0, arg4, 1, arg6, var10, arg2, class188.field3298[arg2]);
            if (~arg5 <= -1) {
                boolean var11 = class219.field3919;
                class219.field3919 = true;
                class142.method877(arg2, arg5, false, arg0, var10, class188.field3298[arg2], arg4, arg7, false, false, arg1);
                class219.field3919 = var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBII)V")
    private final void method927(int arg0, byte arg1, int arg2, int arg3) {
        ++field2339;
        int var5 = arg0 > 2048 ? arg0 - -arg2 + -(arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
        if (arg1 == -70) {
            if (~var5 >= -1) {
                this.field2354 = this.field2342 = this.field2346 = arg0;
            } else {
                int var6 = arg3 * 6;
                int var7 = arg0 + arg0 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = -var13 + var5;
                int var15 = var7 - -var13;
                if (var9 != 0) {
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 != -4) {
                                if (~var9 != -5) {
                                    if (var9 == 5) {
                                        this.field2342 = var7;
                                        this.field2354 = var5;
                                        this.field2346 = var14;
                                    }
                                } else {
                                    this.field2342 = var7;
                                    this.field2354 = var15;
                                    this.field2346 = var5;
                                }
                            } else {
                                this.field2346 = var5;
                                this.field2354 = var7;
                                this.field2342 = var14;
                            }
                        } else {
                            this.field2354 = var7;
                            this.field2342 = var5;
                            this.field2346 = var15;
                        }
                    } else {
                        this.field2354 = var14;
                        this.field2342 = var5;
                        this.field2346 = var7;
                    }
                } else {
                    this.field2342 = var15;
                    this.field2346 = var7;
                    this.field2354 = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 != -16231) {
            field2334 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2341 = (arg0.method350(16) << 12) / 100;
                }
            } else {
                this.field2352 = (arg0.method350(arg2 + 16247) << 12) / 100;
            }
        } else {
            this.field2349 = arg0.method338((byte) -99);
        }
        ++field2340;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2335 = null;
        field2338 = null;
        if (arg0 == -777239092) {
            field2344 = null;
            field2330 = null;
            field2334 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)Lc;")
    public static final class209 method929(int arg0, int arg1) {
        ++field2350;
        class209 var2 = (class209) class193.field3386.method1537((long) arg1, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class127.field1796.method842(class151.method952(arg1, 0), (byte) 56, class118.method713(false, arg1));
            class209 var4 = new class209();
            var4.field3767 = arg1;
            if (var3 != null) {
                var4.method1450(-31684, new class56(var3));
            }
            if (arg0 != 1) {
                return null;
            } else {
                class193.field3386.method1532(true, (long) arg1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLdc;III)V")
    public static final void method930(byte arg0, class145 arg1, int arg2, int arg3, int arg4) {
        ++field2345;
        for (class72 var5 = (class72) class62.field852.method1651((byte) -94); var5 != null; var5 = (class72) class62.field852.method1656(-85)) {
            if (var5.field1025 == arg2 && arg3 * 128 == var5.field1021 && ~(arg4 * 128) == ~var5.field1028 && var5.field1024.field2244 == arg1.field2244) {
                if (var5.field1019 != null) {
                    class161.field2589.method690(var5.field1019);
                    var5.field1019 = null;
                }
                if (var5.field1017 != null) {
                    class161.field2589.method690(var5.field1017);
                    var5.field1017 = null;
                }
                var5.method797((byte) 108);
                return;
            }
        }
        if (arg0 <= 38) {
            field2336 = -5;
        }
    }
}
