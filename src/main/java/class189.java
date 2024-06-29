import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class189 extends class83 {

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    private int field2381 = 8192;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    private int field2380 = 2048;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    private int field2387 = 2048;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    private int field2390 = 0;

    @OriginalMember(owner = "client!cr", name = "W", descriptor = "I")
    private int field2392 = 0;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    private int field2389 = 4096;

    @OriginalMember(owner = "client!cr", name = "V", descriptor = "I")
    private int field2391 = 12288;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "Lph;")
    public static class114 field2388 = new class114(2);

    @OriginalMember(owner = "client!cr", name = "X", descriptor = "Luc;")
    public static class58 field2393 = new class58(8);

    @OriginalMember(owner = "client!cr", name = "ab", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!cr", name = "bb", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!cr", name = "Y", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!cr", name = "cb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!cr", name = "Z", descriptor = "Lam;")
    public static class286 field2395;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1016(byte arg0, byte[] arg1) {
        ++field2384;
        class250 var2 = new class250(arg1);
        int var3 = var2.method1350(31351);
        int var4 = var2.method1359(255);
        if (var4 >= 0 && (~class127.field1641 == -1 || ~var4 >= ~class127.field1641)) {
            if (arg0 <= 95) {
                method1018(115, -32, 0, -57, 108, (byte) 80, 66, -70, 54, -77, -102, 96, 16);
            }
            if (var3 == 0) {
                byte[] var5 = new byte[var4];
                var2.method1351(var5, (byte) 79, 0, var4);
                return var5;
            } else {
                int var6 = var2.method1359(255);
                if (var6 >= 0 && (~class127.field1641 == -1 || class127.field1641 >= var6)) {
                    byte[] var7 = new byte[var6];
                    if (var3 != 1) {
                        class139.field1783.method1779(-26241, var2, var7);
                    } else {
                        class186.method998(var7, var6, arg1, var4, 9);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field2382;
        if (arg0 != 2) {
            this.field2381 = -86;
        }
        int[] var3 = super.field916.method1813(arg1, (byte) -38);
        if (super.field916.field4174) {
            int var4 = class225.field3036[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class420.field6139; ++var5) {
                int var6 = class402.field5863[var5] + -2048;
                int var7 = var6 - -this.field2380;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field2390;
                int var11 = var10 >= -2048 ? var10 : var10 - -4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field2392;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = this.field2387 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method1020(0, var12, var9) && !this.method1017(var18, var15, 90) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(III)Z")
    private final boolean method1017(int arg0, int arg1, int arg2) {
        if (arg2 < 54) {
            this.method120(true);
        }
        ++field2383;
        int var4 = (arg0 + arg1) * this.field2391 >> 12;
        int var5 = class204.field2764[(var4 * 255 & 1045809) >> 12];
        int var6 = (var5 << 12) / this.field2391;
        int var7 = (var6 << 12) / this.field2381;
        int var8 = this.field2389 * var7 >> 12;
        return ~var8 < ~(-arg1 + arg0) && ~(-arg1 + arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIBIIIIIII)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2394;
        class242 var13 = new class242();
        var13.field3299 = arg11;
        var13.field3286 = arg4;
        var13.field3291 = arg6;
        var13.field3302 = arg10;
        var13.field3296 = arg12;
        var13.field3287 = arg0;
        var13.field3298 = arg2;
        var13.field3293 = arg3;
        var13.field3290 = arg9;
        var13.field3288 = arg1;
        var13.field3294 = arg8;
        var13.field3300 = arg7;
        if (arg5 >= 17) {
            class281.field3852.method825(68, var13);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)V")
    public static void method1019(int arg0) {
        if (arg0 == 2020) {
            field2393 = null;
            field2395 = null;
            field2388 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        ++field2398;
        if (!arg0) {
            class58.method316((byte) -16);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field2385;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2381 = arg2.method1374(-2);
                                }
                            } else {
                                this.field2389 = arg2.method1374(-2);
                            }
                        } else {
                            this.field2391 = arg2.method1374(-2);
                        }
                    } else {
                        this.field2387 = arg2.method1374(-2);
                    }
                } else {
                    this.field2392 = arg2.method1374(-2);
                }
            } else {
                this.field2390 = arg2.method1374(-2);
            }
        } else {
            this.field2380 = arg2.method1374(-2);
        }
        int var5 = -93 % ((arg1 - -27) / 50);
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(III)Z")
    private final boolean method1020(int arg0, int arg1, int arg2) {
        ++field2386;
        int var4 = (-arg2 + arg1) * this.field2391 >> 12;
        if (arg0 != 0) {
            this.method1020(-1, -34, -87);
        }
        int var5 = class204.field2764[(var4 * 255 & 1044534) >> 12];
        int var6 = (var5 << 12) / this.field2391;
        int var7 = (var6 << 12) / this.field2381;
        int var8 = this.field2389 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && ~(-var8) > ~(arg1 + arg2);
    }
}
