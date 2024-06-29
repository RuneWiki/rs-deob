import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class166 extends class319 {

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public int field2366 = -1;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public int field2363 = -1;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Z")
    public static boolean field2369 = false;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[I")
    public static int[] field2368;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Laa;I)Lcn;", line = 10)
    public final class300 method131(class281 arg0, int arg1) {
        ++field2365;
        if (arg1 <= 72) {
            return null;
        } else {
            class261 var3 = arg0.method1769();
            var3.method882(super.field4382, super.field4376, super.field4380);
            class300 var4 = class8.method54((byte) -114, 3);
            if (this.field2363 != -1) {
                class75 var5 = class347.method2222(this.field2363, 18682).method2546(0, (class449) null, 1024, 0, arg0, (class412) null, 112, -1, this.field2367);
                if (var5 != null) {
                    var5.method514(var3, var4.field4152[2], 0);
                }
            }
            if (~this.field2366 != 0) {
                class75 var6 = class347.method2222(this.field2366, 18682).method2546(0, (class449) null, 1024, 0, arg0, (class412) null, 106, -1, this.field2370);
                if (var6 != null) {
                    var6.method514(var3, var4.field4152[1], 0);
                }
            }
            class75 var7 = class347.method2222(this.field2371, 18682).method2546(0, (class449) null, 1024, 0, arg0, (class412) null, 113, -1, this.field2364);
            if (var7 != null) {
                var7.method514(var3, var4.field4152[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Laa;ZIILne;Lu;)Z", line = 52)
    public static final boolean method1124(class281 arg0, boolean arg1, int arg2, int arg3, class173 arg4, class46 arg5) {
        ++field2361;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field698 != null) {
            var7 = (arg5.field697 - class42.field649 + arg4.field2457) * (-class42.field645 + class42.field632) / (-class42.field649 + class42.field638) + class42.field645;
            var8 = -((arg4.field2466 + arg5.field688 + -class42.field647) * (-class42.field634 + class42.field652) / (class42.field631 - class42.field647)) + class42.field652;
            var9 = -((arg5.field702 - (-arg4.field2466 - -class42.field647)) * (class42.field652 - class42.field634) / (class42.field631 - class42.field647)) + class42.field652;
            var6 = class42.field645 - -((class42.field632 - class42.field645) * (-class42.field649 + arg4.field2457 + arg5.field719) / (-class42.field649 + class42.field638));
        }
        class130 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg5.field690 != 0) {
            if (arg4.field2456 && arg5.field686 != -1) {
                var10 = arg5.method324(true, 0, arg0);
            } else {
                var10 = arg5.method324(false, 0, arg0);
            }
            if (var10 != null) {
                var11 = arg4.field2460 + -(var10.method874() - -1 >> 1);
                var12 = arg4.field2460 + (var10.method874() + 1 >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                if (~var7 > ~var12) {
                    var7 = var12;
                }
                var13 = arg4.field2459 - (var10.method877() - -1 >> 1);
                var14 = arg4.field2459 - -(var10.method877() - -1 >> 1);
                if (~var8 < ~var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class183 var15 = null;
        if (arg1) {
            return true;
        } else {
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            if (arg5.field711 != null) {
                var15 = class34.method253(arg5.field708, -122);
                if (var15 != null) {
                    var16 = class439.field6374.method446(-24976, (int[]) null, (class130[]) null, class356.field5011, arg5.field711);
                    int var23 = arg4.field2459;
                    if (var10 != null) {
                        var17 = var23 - ((var10.method877() >> 1) - -(var16 * var15.method1207()));
                    } else {
                        var17 = var23 - var16 * var15.method1205() / 2;
                    }
                    for (int var24 = 0; var16 > var24; ++var24) {
                        String var25 = class356.field5011[var24];
                        if (var16 + -1 > var24) {
                            var25 = var25.substring(0, var25.length() + -4);
                        }
                        int var26 = var15.method1210(var25);
                        if (~var18 > ~var26) {
                            var18 = var26;
                        }
                    }
                    var19 = -(var18 / 2) + arg4.field2460 + arg3;
                    var20 = arg4.field2460 + arg3 - -(var18 / 2);
                    if (var19 < var6) {
                        var6 = var19;
                    }
                    var21 = arg2 + var17;
                    if (~var7 > ~var20) {
                        var7 = var20;
                    }
                    var22 = arg2 + var17 - -(var15.method1207() * var16);
                    if (var8 > var21) {
                        var8 = var21;
                    }
                    if (~var9 > ~var22) {
                        var9 = var22;
                    }
                }
            }
            if (class42.field645 <= var7 && ~var6 >= ~class42.field632 && var9 >= class42.field634 && ~class42.field652 <= ~var8) {
                if (arg5.field698 != null) {
                    int[] var27 = new int[arg5.field698.length];
                    for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                        int var30 = arg5.field698[var28 * 2] - -arg4.field2457;
                        int var31 = arg5.field698[var28 * 2 + 1] + arg4.field2466;
                        var27[var28 * 2] = (-class42.field649 + var30) * (-class42.field645 + class42.field632) / (-class42.field649 + class42.field638) + class42.field645;
                        var27[var28 * 2 + 1] = -((-class42.field647 + var31) * (-class42.field634 + class42.field652) / (-class42.field647 + class42.field631)) + class42.field652;
                    }
                    class187.method1230(arg0, var27, arg5.field693);
                    for (int var29 = 0; var27.length / 2 + -1 > var29; ++var29) {
                        arg0.method1795(1, var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 1], var27[var29 * 2], arg5.field689, var27[var29 * 2 + 2]);
                    }
                    arg0.method1795(1, var27[1], var27[var27.length + -1], var27[var27.length - 2], arg5.field689, var27[0]);
                }
                if (var10 != null) {
                    if (class247.field3431 > 0 && (class79.field1230 != -1 && ~class79.field1230 == ~arg4.field2464 || class84.field1293 != -1 && ~class84.field1293 == ~arg5.field710)) {
                        int var32;
                        if (~class270.field3687 >= -51) {
                            var32 = class270.field3687 * 2;
                        } else {
                            var32 = (-class270.field3687 + 100) * 2;
                        }
                        int var33 = var32 << 24 | 16776960;
                        arg0.method1782(arg4.field2459, var33, arg4.field2460, -896242968, var10.method880() / 2 - -7);
                        arg0.method1782(arg4.field2459, var33, arg4.field2460, -896242968, 5 + var10.method880() / 2);
                        arg0.method1782(arg4.field2459, var33, arg4.field2460, -896242968, var10.method880() / 2 + 3);
                        arg0.method1782(arg4.field2459, var33, arg4.field2460, -896242968, 1 + var10.method880() / 2);
                        arg0.method1782(arg4.field2459, var33, arg4.field2460, -896242968, var10.method880() / 2);
                    }
                    var10.method867(arg4.field2460 + -(var10.method874() >> 1), arg4.field2459 + -(var10.method877() >> 1));
                }
                if (arg5.field711 != null && var15 != null) {
                    class220.method1392(10, var16, var15, arg0, var18, var17, arg5, arg4);
                }
                if (~arg5.field690 != 0 || arg5.field711 != null) {
                    class206 var34 = new class206(arg4);
                    var34.field2787 = var13;
                    var34.field2785 = var19;
                    var34.field2789 = var11;
                    var34.field2792 = var14;
                    var34.field2784 = var22;
                    var34.field2782 = var21;
                    var34.field2791 = var20;
                    var34.field2783 = var12;
                    class448.field6462.method1301(50, var34);
                }
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Laa;Z)V", line = 271)
    public final void method128(class281 arg0, boolean arg1) {
        if (arg1) {
            ++field2374;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 286)
    public static void method1125(int arg0) {
        if (arg0 == 599) {
            field2368 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILaa;)Z", line = 296)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field2362;
        class261 var5 = arg3.method1769();
        var5.method882(super.field4382, super.field4376, super.field4380);
        class75 var6 = class347.method2222(this.field2371, 18682).method2546(arg0, (class449) null, 65536, 0, arg3, (class412) null, 110, -1, this.field2364);
        if (var6 != null && var6.method516(arg1, arg2, var5, true)) {
            return true;
        } else {
            if (this.field2366 != -1) {
                class75 var7 = class347.method2222(this.field2366, arg0 ^ 18682).method2546(0, (class449) null, 65536, 0, arg3, (class412) null, 106, -1, this.field2370);
                if (var7 != null && var7.method516(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field2363 != -1) {
                class75 var8 = class347.method2222(this.field2363, 18682).method2546(0, (class449) null, 65536, 0, arg3, (class412) null, 114, -1, this.field2367);
                if (var8 != null && var8.method516(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
