import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class106 extends class37 {

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    private int field2368 = 0;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    private int field2374 = 0;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    private int field2375 = 0;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field2359 = 0;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Ldd;")
    public static class35 field2365 = class180.method1196((byte) -44, "Konfig geladen)3");

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Ldd;")
    public static class35 field2372 = class180.method1196((byte) 127, "Benutzername: ");

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    private int field2360;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    private int field2366;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    private int field2370;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)I")
    public static final int method782(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 23446) {
            field2373 = -35;
        }
        ++field2356;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return -arg3 + 7;
        } else {
            return var4 == 2 ? 7 - arg2 : arg3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 != 1) {
            this.field2360 = 58;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2368 = (arg2.method225((byte) -119) << 12) / 100;
                }
            } else {
                this.field2375 = (arg2.method225((byte) -106) << 12) / 100;
            }
        } else {
            this.field2374 = arg2.method241(false);
        }
        ++field2363;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(IIII)V")
    private final void method783(int arg0, int arg1, int arg2, int arg3) {
        ++field2361;
        int var5 = 74 / ((arg3 - -16) / 34);
        int var6 = arg0 > 2048 ? -(arg0 * arg2 >> 12) + arg0 + arg2 : (arg2 + 4096) * arg0 >> 12;
        if (~var6 >= -1) {
            this.field2371 = this.field2370 = this.field2360 = arg0;
        } else {
            int var7 = arg1 * 6;
            int var8 = arg0 + arg0 + -var6;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = var7 - (var10 << 12);
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = -var14 + var6;
            int var16 = var8 - -var14;
            if (~var10 != -1) {
                if (~var10 != -2) {
                    if (~var10 != -3) {
                        if (~var10 != -4) {
                            if (~var10 != -5) {
                                if (var10 == 5) {
                                    this.field2370 = var8;
                                    this.field2371 = var6;
                                    this.field2360 = var15;
                                }
                            } else {
                                this.field2370 = var8;
                                this.field2371 = var16;
                                this.field2360 = var6;
                            }
                        } else {
                            this.field2371 = var8;
                            this.field2360 = var6;
                            this.field2370 = var15;
                        }
                    } else {
                        this.field2371 = var8;
                        this.field2360 = var16;
                        this.field2370 = var6;
                    }
                } else {
                    this.field2360 = var8;
                    this.field2370 = var6;
                    this.field2371 = var15;
                }
            } else {
                this.field2371 = var6;
                this.field2370 = var16;
                this.field2360 = var8;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method784(boolean arg0, int arg1, Object arg2) {
        ++field2357;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class122.method871(-91, var3) : var3;
        } else if (arg2 instanceof class28) {
            class28 var4 = (class28) arg2;
            return var4.method268(false);
        } else {
            if (arg1 < 69) {
                field2373 = 113;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(IIII)V")
    private final void method785(int arg0, int arg1, int arg2, int arg3) {
        ++field2369;
        int var5 = ~arg0 < ~arg2 ? arg2 : arg0;
        int var6 = ~arg2 < ~arg0 ? arg2 : arg0;
        int var7 = var5 <= arg1 ? var5 : arg1;
        int var8 = ~arg1 >= ~var6 ? var6 : arg1;
        int var9 = var8 - var7;
        if (arg3 > 90) {
            this.field2364 = (var7 + var8) / 2;
            if (var9 > 0) {
                if (~this.field2364 < -1 && ~this.field2364 > -4097) {
                    this.field2366 = (var9 << 12) / (this.field2364 <= 2048 ? this.field2364 * 2 : 8192 - this.field2364 * 2);
                }
                int var10 = (-arg2 + var8 << 12) / var9;
                int var11 = (-arg0 + var8 << 12) / var9;
                int var12 = (-arg1 + var8 << 12) / var9;
                if (arg2 == var8) {
                    this.field2362 = ~arg0 == ~var7 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg0 != ~var8) {
                    this.field2362 = ~arg2 == ~var7 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field2362 = arg1 == var7 ? var10 + 4096 : -var12 + 12288;
                }
                this.field2362 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class56 var20 = new class56(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class191.field3853[var21][arg1][arg2] == null) {
                    class191.field3853[var21][arg1][arg2] = new class54(var21, arg1, arg2);
                }
            }
            class191.field3853[arg0][arg1][arg2].field1224 = var20;
        } else if (arg3 != 1) {
            class117 var24 = new class117(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class191.field3853[var25][arg1][arg2] == null) {
                    class191.field3853[var25][arg1][arg2] = new class54(var25, arg1, arg2);
                }
            }
            class191.field3853[arg0][arg1][arg2].field1212 = var24;
        } else {
            class56 var22 = new class56(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class191.field3853[var23][arg1][arg2] == null) {
                    class191.field3853[var23][arg1][arg2] = new class54(var23, arg1, arg2);
                }
            }
            class191.field3853[arg0][arg1][arg2].field1224 = var22;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
    public static void method787(int arg0) {
        field2372 = null;
        field2365 = null;
        int var1 = 86 / ((arg0 - 49) / 48);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (arg1 < 5) {
            field2365 = null;
        }
        ++field2358;
        if (super.field832.field1978) {
            int[][] var4 = this.method370(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class72.field1719; ++var11) {
                this.method785(var6[var11], var10[var11], var5[var11], 121);
                for (this.field2362 += this.field2374; this.field2362 < 0; this.field2362 += 4096) {
                }
                while (~this.field2362 < -4097) {
                    this.field2362 -= 4096;
                }
                this.field2366 += this.field2375;
                if (~this.field2366 > -1) {
                    this.field2366 = 0;
                }
                if (this.field2366 > 4096) {
                    this.field2366 = 4096;
                }
                this.field2364 += this.field2368;
                if (~this.field2364 > -1) {
                    this.field2364 = 0;
                }
                if (this.field2364 > 4096) {
                    this.field2364 = 4096;
                }
                this.method783(this.field2364, this.field2362, this.field2366, 66);
                var7[var11] = this.field2371;
                var8[var11] = this.field2370;
                var9[var11] = this.field2360;
            }
        }
        return var3;
    }
}
