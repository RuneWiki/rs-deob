import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class141 extends class212 {

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    private int field2282 = 4096;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    private int field2280 = 4096;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    private int field2276 = 4096;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "Lre;")
    public static class78 field2275 = new class78(5000);

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjb;)V")
    public static final void method901(int arg0, class11 arg1) {
        class2.field59 = arg1;
        if (arg0 != 105) {
            method902((class157) null, (byte) 31);
        }
        ++field2281;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Leg;B)V")
    public static final void method902(class157 arg0, byte arg1) {
        arg0.field2629 = arg0.field2655;
        ++field2278;
        if (arg0.field2631 == 0) {
            arg0.field2651 = 0;
        } else {
            if (~arg0.field2685 != 0 && arg0.field2618 == 0) {
                class254 var2 = class128.method827(arg0.field2685, 122);
                if (arg0.field2676 > 0 && var2.field4433 == 0) {
                    ++arg0.field2651;
                    return;
                }
                if (~arg0.field2676 >= -1 && ~var2.field4436 == -1) {
                    ++arg0.field2651;
                    return;
                }
            }
            int var3 = arg0.field2654;
            int var4 = arg0.field2681;
            int var5 = arg0.field2672[arg0.field2631 + -1] * 128 - -(arg0.field2619 * 64);
            int var6 = arg0.field2623[arg0.field2631 + -1] * 128 + arg0.field2619 * 64;
            if (~(-var3 + var5) >= -257 && -var3 + var5 >= -256 && ~(-var4 + var6) >= -257 && -var4 + var6 >= -256) {
                if (~var3 > ~var5) {
                    if (~var4 <= ~var6) {
                        if (~var4 >= ~var6) {
                            arg0.field2616 = 1536;
                        } else {
                            arg0.field2616 = 1792;
                        }
                    } else {
                        arg0.field2616 = 1280;
                    }
                } else if (var3 > var5) {
                    if (~var4 > ~var6) {
                        arg0.field2616 = 768;
                    } else if (var6 < var4) {
                        arg0.field2616 = 256;
                    } else {
                        arg0.field2616 = 512;
                    }
                } else if (var6 > var4) {
                    arg0.field2616 = 1024;
                } else if (var4 > var6) {
                    arg0.field2616 = 0;
                }
                int var7 = 4;
                int var8 = 2047 & -arg0.field2675 + arg0.field2616;
                if (~var8 < -1025) {
                    var8 -= 2048;
                }
                int var9 = arg0.field2669;
                if (arg1 > -5) {
                    method904(false, 12);
                }
                boolean var10 = true;
                if (var8 >= -256 && ~var8 >= -257) {
                    var9 = arg0.field2671;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field2653;
                } else if (var8 >= -768 && ~var8 >= 255) {
                    var9 = arg0.field2689;
                }
                if (var9 == -1) {
                    var9 = arg0.field2671;
                }
                arg0.field2629 = var9;
                if (arg0 instanceof class178) {
                    var10 = ((class178) arg0).field3117.field1033;
                }
                if (!var10) {
                    if (~arg0.field2631 < -2) {
                        var7 = 6;
                    }
                    if (arg0.field2631 > 2) {
                        var7 = 8;
                    }
                    if (~arg0.field2651 < -1 && ~arg0.field2631 < -2) {
                        var7 = 8;
                        --arg0.field2651;
                    }
                } else {
                    if (arg0.field2675 != arg0.field2616 && arg0.field2658 == -1 && arg0.field2628 != 0) {
                        var7 = 2;
                    }
                    if (~arg0.field2631 < -3) {
                        var7 = 6;
                    }
                    if (arg0.field2631 > 3) {
                        var7 = 8;
                    }
                    if (arg0.field2651 > 0 && ~arg0.field2631 < -2) {
                        --arg0.field2651;
                        var7 = 8;
                    }
                }
                if (arg0.field2637[arg0.field2631 + -1]) {
                    var7 <<= 1;
                }
                if (var5 > var3) {
                    arg0.field2654 += var7;
                    if (~arg0.field2654 < ~var5) {
                        arg0.field2654 = var5;
                    }
                } else if (var5 < var3) {
                    arg0.field2654 -= var7;
                    if (~var5 < ~arg0.field2654) {
                        arg0.field2654 = var5;
                    }
                }
                if (var6 > var4) {
                    arg0.field2681 += var7;
                    if (~var6 > ~arg0.field2681) {
                        arg0.field2681 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field2681 -= var7;
                    if (var6 > arg0.field2681) {
                        arg0.field2681 = var6;
                    }
                }
                if (var7 >= 8 && ~arg0.field2671 == ~arg0.field2629 && ~arg0.field2625 != 0) {
                    arg0.field2629 = arg0.field2625;
                }
                if (arg0.field2654 == var5 && ~arg0.field2681 == ~var6) {
                    if (~arg0.field2676 < -1) {
                        --arg0.field2676;
                    }
                    --arg0.field2631;
                }
            } else {
                arg0.field2681 = var6;
                arg0.field2654 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public static void method903(byte arg0) {
        field2275 = null;
        int var1 = -40 / ((arg0 - 5) / 42);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    public static final void method904(boolean arg0, int arg1) {
        if (arg1 < -54) {
            class107.field1746 = new int[104];
            class203.field3508 = new int[104];
            class218.field3749 = new int[104];
            class196.field3424 = new int[104];
            ++field2277;
            class124.field2027 = new int[104];
            class107.field1754 = 99;
            byte var2;
            if (!arg0) {
                var2 = 4;
            } else {
                var2 = 1;
            }
            class18.field328 = new byte[var2][104][104];
            class113.field1836 = new byte[var2][105][105];
            class35.field548 = new byte[var2][104][104];
            class2.field61 = new byte[var2][104][104];
            class52.field813 = new int[var2][105][105];
            class1.field29 = new byte[var2][104][104];
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field2284;
        if (arg2 != -3) {
            field2275 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2282 = arg0.method1535(~arg2);
                }
            } else {
                this.field2280 = arg0.method1535(2);
            }
        } else {
            this.field2276 = arg0.method1535(2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field2279;
        int[][] var3 = super.field3645.method1352(arg0, -117);
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -69);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class26.field452 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field2276 * var12 >> 12;
                    var10[var11] = this.field2280 * var13 >> 12;
                    var9[var11] = this.field2282 * var14 >> 12;
                } else {
                    var8[var11] = this.field2276;
                    var10[var11] = this.field2280;
                    var9[var11] = this.field2282;
                }
            }
        }
        if (arg1 != 16383) {
            this.field2280 = -34;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Z")
    public static final boolean method905(int arg0) {
        if (arg0 != -7569) {
            return true;
        } else {
            ++field2283;
            return class97.field1575 != 0 ? true : class247.field4317.method1269(-125);
        }
    }
}
