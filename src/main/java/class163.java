import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class163 extends class34 {

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    private int field2363 = 1024;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    private int field2369 = 0;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    private int field2359 = 1024;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    private int field2371 = 4;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    private int field2375 = 409;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    private int field2381 = 81;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
    private int field2384 = 204;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    private int field2365 = 8;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Ljava/lang/String;")
    public static String field2382 = "Connected to update server";

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "[I")
    public static int[] field2364 = new int[50];

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    private int field2366;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lclient;")
    public static client field2378;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "[I")
    private int[] field2373;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "[[I")
    private int[][] field2357;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "[[I")
    private int[][] field2379;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            this.field2379 = null;
        }
        ++field2362;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field2363 = arg2.method423(-96);
                                    }
                                } else {
                                    this.field2381 = arg2.method423(-128);
                                }
                            } else {
                                this.field2369 = arg2.method423(-92);
                            }
                        } else {
                            this.field2359 = arg2.method423(-87);
                        }
                    } else {
                        this.field2384 = arg2.method423(-103);
                    }
                } else {
                    this.field2375 = arg2.method423(-104);
                }
            } else {
                this.field2365 = arg2.method407(255);
            }
        } else {
            this.field2371 = arg2.method407(arg0 ^ 249);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IC)Z")
    public static final boolean method1102(int arg0, char arg1) {
        ++field2368;
        if (arg0 != -4855) {
            return true;
        } else {
            return ~arg1 <= -49 && arg1 <= '9' || ~arg1 <= -66 && ~arg1 >= -91 || ~arg1 <= -98 && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class236.method1596(arg3, arg2 + arg4, arg1 + arg7);
        ++field2376;
        if (var8 != 0L) {
            int var10 = ((int) var8 & 3236992) >> 20;
            int var11 = (int) var8 >> 14 & 31;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class188 var13 = class3.method42(-118, var12);
            if (var13.field2776 != -1) {
                if (!class100.method732(var10, arg2, arg7, arg4, arg1, var13, (byte) -85)) {
                    return false;
                }
            } else {
                int var14 = arg5;
                int[] var15 = class72.field1174;
                int var16 = arg4 * 4 + 24624 - -((-arg1 + 103) * 2048);
                if (var8 > 0L) {
                    var14 = arg0;
                }
                if (~var11 == -1 || var11 == 2) {
                    if (var10 != 0) {
                        if (~var10 == -2) {
                            var15[var16] = var14;
                            var15[var16 - -1] = var14;
                            var15[var16 + 2] = var14;
                            var15[var16 + 3] = var14;
                        } else if (var10 != 2) {
                            if (var10 == 3) {
                                var15[var16 + 1536] = var14;
                                var15[var16 + 1537] = var14;
                                var15[var16 - -1538] = var14;
                                var15[var16 - -1539] = var14;
                            }
                        } else {
                            var15[var16 + 3] = var14;
                            var15[var16 + 512 + 3] = var14;
                            var15[var16 + 1024 + 3] = var14;
                            var15[var16 + 1536 - -3] = var14;
                        }
                    } else {
                        var15[var16] = var14;
                        var15[var16 - -512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 - -1536] = var14;
                    }
                }
                if (~var11 == -4) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 != 1) {
                        if (~var10 != -3) {
                            if (~var10 == -4) {
                                var15[var16 + 1536] = var14;
                            }
                        } else {
                            var15[var16 - -1539] = var14;
                        }
                    } else {
                        var15[var16 + 3] = var14;
                    }
                }
                if (~var11 == -3) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 - -512] = var14;
                        var15[var16 - -1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (~var10 == -2) {
                        var15[var16 + 3] = var14;
                        var15[var16 - -3 + 512] = var14;
                        var15[var16 - -1027] = var14;
                        var15[var16 - -1536 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            }
        }
        long var17 = class251.method1709(arg3, arg2 + arg4, arg1 + arg7);
        if (arg6 != 15321) {
            method1106(-20, -69, 44, -14, 50, -42, -97, 7, true, -9, false, 37);
        }
        if (~var17 != -1L) {
            int var19 = (3409998 & (int) var17) >> 20;
            int var20 = (int) var17 >> 14 & 31;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class188 var22 = class3.method42(-125, var21);
            if (~var22.field2776 == 0) {
                if (~var20 == -10) {
                    int var23 = 15658734;
                    if (~var17 < -1L) {
                        var23 = 15597568;
                    }
                    int var24 = arg4 * 4 + (103 - arg1) * 2048 + 24624;
                    int[] var25 = class72.field1174;
                    if (~var19 != -1 && ~var19 != -3) {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 1024 - -2] = var23;
                        var25[var24 - -1536 + 3] = var23;
                    } else {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1024 + 1] = var23;
                        var25[var24 + 514] = var23;
                        var25[var24 + 3] = var23;
                    }
                }
            } else if (!class100.method732(var19, arg2, arg7, arg4, arg1, var22, (byte) -96)) {
                return false;
            }
        }
        long var26 = class280.method1864(arg3, arg2 + arg4, arg1 - -arg7);
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            int var29 = (3200186 & (int) var26) >> 20;
            class188 var30 = class3.method42(-124, var28);
            if (var30.field2776 != -1 && !class100.method732(var29, arg2, arg7, arg4, arg1, var30, (byte) -31)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = -98 / ((-2 - arg0) / 43);
        this.method1107(31);
        ++field2360;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    public static void method1104(byte arg0) {
        if (arg0 != -31) {
            field2377 = 123;
        }
        field2364 = null;
        field2382 = null;
        field2378 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method1105(int arg0, int arg1, int arg2, String arg3, String arg4, String arg5) {
        ++field2367;
        for (int var6 = 99; var6 > 0; --var6) {
            class196.field2962[var6] = class196.field2962[var6 + -1];
            class212.field3253[var6] = class212.field3253[var6 - 1];
            class155.field2264[var6] = class155.field2264[var6 + -1];
            class114.field1743[var6] = class114.field1743[var6 + -1];
            class220.field3424[var6] = class220.field3424[var6 - 1];
        }
        ++class208.field3123;
        class109.field1592 = class169.field2494;
        class196.field2962[0] = arg2;
        class220.field3424[0] = arg0;
        class212.field3253[0] = arg3;
        class155.field2264[0] = arg4;
        if (arg1 != -2694) {
            field2377 = 105;
        }
        class114.field1743[0] = arg5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIZIZI)V")
    public static final void method1106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10, int arg11) {
        ++field2358;
        if (!arg10) {
            method1103(-96, -127, 20, -64, -16, 2, 19, 6);
        }
        int var12 = -arg6 + arg3;
        int var13 = -arg2 + arg0;
        int var14 = -1;
        int var15 = 983040 / arg11;
        if (class283.field4344 > 0) {
            if (~class155.field2259 < -11) {
                var14 = -((class155.field2259 - 10) * 5) + 50;
            } else {
                var14 = class155.field2259 * 5;
            }
        }
        int var16 = 983040 / arg9;
        for (int var17 = -var16; ~(var13 + var16) < ~var17; ++var17) {
            int var19 = arg1 - -(arg9 * var17) >> 16;
            int var20 = (var17 + 1) * arg9 + arg1 >> 16;
            int var21 = var20 - var19;
            if (~var21 < -1) {
                int var10000 = arg5 + var20;
                int var23 = arg2 + var17 >> 6;
                int var24 = arg5 + var19;
                if (~var23 <= -1 && ~var23 >= ~(class122.field1815.length + -1)) {
                    int[][] var25 = class122.field1815[var23];
                    for (int var26 = -var15; ~(var12 + var15) < ~var26; ++var26) {
                        int var27 = arg7 - -(arg11 * var26) >> 16;
                        int var28 = (var26 - -1) * arg11 + arg7 >> 16;
                        int var29 = -var27 + var28;
                        if (var29 > 0) {
                            var10000 = arg4 + var28;
                            int var31 = arg4 + var27;
                            int var32 = arg6 + var26 >> 6;
                            if (~var32 <= -1 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = (4032 & var26 - -arg6 << 6) + (arg2 + var17 & 63);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class188 var35 = class3.method42(-110, var34 + -1);
                                    if (!class18.field322[var35.field2786]) {
                                        if (~var14 != 0 && class83.field1280 == var35.field2786) {
                                            class268 var36 = new class268();
                                            var36.field4172 = var35.field2786;
                                            var36.field4175 = var24;
                                            var36.field4171 = var31;
                                            class128.field1885.method1881(var36, (byte) -56);
                                        } else {
                                            class177.field2592[var35.field2786].method1230(var24 + -7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class268 var18 = (class268) class128.field1885.method1894((byte) -90); var18 != null; var18 = (class268) class128.field1885.method1886(-99)) {
            class72.method560(var18.field4175, var18.field4171, 15, 16776960, var14);
            class72.method560(var18.field4175, var18.field4171, 13, 16776960, var14);
            class72.method560(var18.field4175, var18.field4171, 11, 16776960, var14);
            class72.method560(var18.field4175, var18.field4171, 9, 16776960, var14);
            class177.field2592[var18.field4172].method1230(var18.field4175 + -7, var18.field4171 - 7);
        }
        class128.field1885.method1891(74);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    private final void method1107(int arg0) {
        ++field2370;
        Random var2 = new Random((long) this.field2365);
        this.field2379 = new int[this.field2365][this.field2371 + 1];
        this.field2357 = new int[this.field2365][this.field2371];
        this.field2373 = new int[this.field2365 + 1];
        this.field2361 = 4096 / this.field2365;
        this.field2373[0] = 0;
        int var3 = this.field2361 / 2;
        this.field2366 = this.field2381 / 2;
        this.field2383 = 4096 / this.field2371;
        int var4 = this.field2383 / 2;
        if (arg0 != 31) {
            method1105(32, -32, 91, (String) null, (String) null, (String) null);
        }
        for (int var5 = 0; var5 < this.field2365; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2361;
                int var7 = (class18.method129(var2, 36, 4096) - 2048) * this.field2384 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2373[var5] = this.field2373[var5 - 1] + var8;
            }
            this.field2379[var5][0] = 0;
            for (int var9 = 0; ~this.field2371 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2383;
                    int var11 = (-2048 + class18.method129(var2, -30, 4096)) * this.field2375 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2379[var5][var9] = this.field2379[var5][var9 + -1] - -var12;
                }
                this.field2357[var5][var9] = this.field2363 > 0 ? 4096 - class18.method129(var2, 110, this.field2363) : 4096;
            }
            this.field2379[var5][this.field2371] = 4096;
        }
        this.field2373[this.field2365] = 4096;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 < 75) {
            field2382 = null;
        }
        ++field2372;
        if (super.field610.field597) {
            int var4 = 0;
            int var5;
            for (var5 = class199.field2985[arg1] - -this.field2369; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field2365 < ~var4 && var5 >= this.field2373[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field2373[var4 + -1];
            int var9 = this.field2373[var4];
            if (var8 - -this.field2366 < var5 && ~(var9 - this.field2366) < ~var5) {
                for (int var10 = 0; class226.field3527 > var10; ++var10) {
                    int var11 = !var7 ? -this.field2359 : this.field2359;
                    int var12;
                    for (var12 = (this.field2383 * var11 >> 12) + class112.field1716[var10]; var12 < 0; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (~this.field2371 < ~var13 && ~this.field2379[var6][var13] >= ~var12) {
                        ++var13;
                    }
                    int var14 = this.field2379[var6][var13];
                    int var15 = var13 + -1;
                    int var16 = this.field2379[var6][var15];
                    if (~var12 < ~(this.field2366 + var16) && ~(-this.field2366 + var14) < ~var12) {
                        var3[var10] = this.field2357[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class41.method342(var3, 0, class226.field3527, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lpk;B)V")
    public static final void method1108(class237 arg0, byte arg1) {
        ++field2380;
        class244.field3788 = arg0;
        class244.field3790 = class244.field3788.method1614(0, 16);
        int var2 = -113 / ((arg1 - 40) / 49);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }
}
