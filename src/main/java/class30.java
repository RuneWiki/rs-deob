import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class30 extends class86 {

    @OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
    private int[] field510 = new int[this.field1199];

    @OriginalMember(owner = "client!he", name = "A", descriptor = "[I")
    public static int[] field515 = new int[14];

    @OriginalMember(owner = "client!he", name = "G", descriptor = "[Lkj;")
    public static class236[] field521 = new class236[14];

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lmj;")
    public static class170 field514;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lqj;")
    public static class238 field513;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "[B")
    private byte[] field522;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[I")
    public static int[] field520;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[Lqa;")
    public static class243[] field518;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V", line = 4)
    public final void method255(boolean arg0) {
        if (arg0) {
            method259(4);
        }
        this.field516 = Math.abs(this.field516);
        ++field517;
        if (~this.field516 <= -4097) {
            this.field516 = 4095;
        }
        this.method257(this.field512++, (byte) (this.field516 >> 4));
        this.field516 = 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V", line = 21)
    public final void method256(int arg0, int arg1, int arg2) {
        this.field516 += this.field510[arg2] * arg0 >> 12;
        int var4 = -12 / ((67 - arg1) / 50);
        ++field509;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V", line = 35)
    public void method257(int arg0, byte arg1) {
        this.field522[this.field512++] = (byte) (127 + (class401.method2606(arg1, 255) >> 1));
        ++field524;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILnr;ILdr;IZZIILtb;ILnr;)Lqa;", line = 48)
    public static final class243 method258(int arg0, class437 arg1, int arg2, class213 arg3, int arg4, boolean arg5, boolean arg6, int arg7, int arg8, class103 arg9, int arg10, class437 arg11) {
        ++field519;
        class243 var12 = class439.method2778(arg1, 1483, arg4, arg0, arg9, arg10, arg8, arg7);
        if (var12 != null) {
            return var12;
        } else {
            class193 var13 = class166.method1031(arg4, false);
            if (arg10 > 1 && var13.field2748 != null) {
                int var14 = -1;
                for (int var15 = 0; var15 < 10; ++var15) {
                    if (var13.field2680[var15] <= arg10 && ~var13.field2680[var15] != -1) {
                        var14 = var13.field2748[var15];
                    }
                }
                if (~var14 != 0) {
                    var13 = class166.method1031(var14, false);
                }
            }
            class180 var16 = class357.method2343(var13.field2681, 0, class123.field1649, 1);
            if (var16 == null) {
                return null;
            } else {
                if (var13.field2698 != null) {
                    for (int var17 = 0; var13.field2698.length > var17; ++var17) {
                        if (var13.field2747 != null && var17 < var13.field2747.length) {
                            var16.method1117(class127.field1691[var13.field2747[var17] & 255], var13.field2698[var17], 113);
                        } else {
                            var16.method1117(var13.field2712[var17], var13.field2698[var17], -120);
                        }
                    }
                }
                if (var13.field2707 != null) {
                    for (int var18 = 0; var18 < var13.field2707.length; ++var18) {
                        var16.method1114(arg2 ^ -122, var13.field2707[var18], var13.field2726[var18]);
                    }
                }
                if (arg9 != null) {
                    for (int var19 = 0; ~var19 > -6; ++var19) {
                        if (arg9.field1391[var19] < class132.field1777[var19].length) {
                            var16.method1117(class132.field1777[var19][arg9.field1391[var19]], class434.field6394[var19], 116);
                        }
                        if (~arg9.field1391[var19] > ~class312.field4467[var19].length) {
                            var16.method1117(class312.field4467[var19][arg9.field1391[var19]], class34.field557[var19], -93);
                        }
                    }
                }
                int var20 = 1024;
                boolean var21 = false;
                if (var13.field2730 != 128 || ~var13.field2723 != -129 || ~var13.field2752 != -129) {
                    var21 = true;
                    var20 |= 7;
                }
                class95 var22 = arg11.method2164(var16, var20, 0, var13.field2740 + 64, var13.field2720 + 768);
                if (!var22.method627()) {
                    return null;
                } else {
                    if (var21) {
                        var22.method603(var13.field2730, var13.field2723, var13.field2752);
                    }
                    class243 var23 = null;
                    if (~var13.field2706 != 0) {
                        var23 = method258(0, arg1, 0, arg3, var13.field2682, true, true, 1, 0, arg9, 10, arg11);
                        if (var23 == null) {
                            return null;
                        }
                    } else if (var13.field2697 != -1) {
                        var23 = method258(arg0, arg1, arg2, arg3, var13.field2749, true, false, arg7, 0, arg9, arg10, arg11);
                        if (var23 == null) {
                            return null;
                        }
                    }
                    int var24 = var13.field2725;
                    arg11.method2074(16, 16, 512, 512);
                    if (arg6) {
                        var24 = (int) ((double) var24 * 1.5D);
                    } else if (~arg7 == -3) {
                        var24 = (int) ((double) var24 * 1.04D);
                    }
                    class116 var25 = arg11.method2060();
                    var25.method817();
                    arg11.method2059(var25);
                    arg11.method2063(1.0F);
                    arg11.method2139(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
                    class116 var26 = arg11.method2026();
                    var26.method803(-var13.field2744 << 3);
                    var26.method820(var13.field2691 << 3);
                    var26.method802(var13.field2755, (class190.field2644[var13.field2705 << 3] * var24 >> 15) - (var22.method597() / 2 + -var13.field2751), (class190.field2635[var13.field2705 << 3] * var24 >> 15) + var13.field2751);
                    var26.method807(var13.field2705 << 3);
                    int var27 = arg11.method2182();
                    int var28 = arg11.method2099();
                    arg11.method2097(50, Integer.MAX_VALUE);
                    arg11.method2033();
                    arg11.method2034();
                    arg11.method2188(0, 0, 36, 32, 0, arg2);
                    var22.method602(var26, (class206) null, 1);
                    arg11.method2097(var27, var28);
                    int[] var29 = arg11.method2119(0, 0, 36, 32);
                    if (arg7 >= 1) {
                        var29 = class165.method1019(-16777215, var29, 36);
                        if (arg7 >= 2) {
                            var29 = class165.method1019(-1, var29, 36);
                        }
                    }
                    if (arg0 != 0) {
                        class344.method2271(var29, arg0, -22286);
                    }
                    arg11.method2158(var29, 0, 36, 36, 32).method1499(0, 0);
                    if (var13.field2706 != -1) {
                        var23.method1499(0, 0);
                    } else if (var13.field2697 != -1) {
                        var23.method1499(0, 0);
                    }
                    if (~arg8 == -2 || ~arg8 == -3 && (var13.field2692 == 1 || ~arg10 != -2) && arg10 != -1) {
                        arg3.method1319(arg2 ^ -8219, class185.method1139(arg10, false), -256, 9, 0, -16777215);
                    }
                    int[] var30 = arg11.method2119(0, 0, 36, 32);
                    for (int var31 = 0; var31 < var30.length; ++var31) {
                        if ((var30[var31] & 16777215) == 0) {
                            var30[var31] = 0;
                        } else {
                            var30[var31] = class128.method871(var30[var31], -16777216);
                        }
                    }
                    class243 var32;
                    if (!arg5) {
                        var32 = arg1.method2158(var30, 0, 36, 36, 32);
                    } else {
                        var32 = arg11.method2158(var30, 0, 36, 36, 32);
                    }
                    if (!arg5) {
                        class272 var33 = new class272();
                        var33.field3992 = arg7;
                        var33.field3983 = arg0;
                        var33.field3977 = arg10;
                        var33.field3979 = arg4;
                        var33.field3976 = arg9 != null;
                        var33.field3980 = arg1.field6424;
                        var33.field3991 = arg8;
                        class114.field1551.method1637(var33, 0, var32);
                    }
                    return var32;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIF)V", line = 282)
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field1199; ++var7) {
            this.field510[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 301)
    public static void method259(int arg0) {
        field513 = null;
        field515 = null;
        field521 = null;
        if (arg0 != 32731) {
            method260(-84, 79, -5, false, -18, -89);
        }
        field514 = null;
        field518 = null;
        field520 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIZII)V", line = 321)
    public static final void method260(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (~arg0 > -2) {
            arg0 = 1;
        }
        ++field511;
        int var6 = arg0 + -334;
        if (var6 >= 0) {
            if (~var6 < -101) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = (-class64.field904 + class312.field4471) * var6 / 100 + class64.field904;
        if (~var7 > ~class360.field5283) {
            var7 = class360.field5283;
        } else if (~class349.field5177 > ~var7) {
            var7 = class349.field5177;
        }
        int var8 = arg0 * var7 * 512 / (arg1 * 334);
        if (~var8 > ~class122.field1627) {
            short var9 = class122.field1627;
            var7 = var9 * 334 * arg1 / (arg0 * 512);
            if (class349.field5177 < var7) {
                var7 = class349.field5177;
                int var10 = arg0 * var7 * 512 / (var9 * 334);
                int var11 = (-var10 + arg1) / 2;
                if (arg3) {
                    class35.field574.method2034();
                    class35.field574.method2766(var11, arg0, arg4, arg2, -16777216, -105);
                    class35.field574.method2766(var11, arg0, arg1 + arg4 + -var11, arg2, -16777216, -111);
                }
                arg4 += var11;
                arg1 -= var11 * 2;
            }
        } else if (~var8 < ~class392.field5865) {
            short var12 = class392.field5865;
            var7 = arg1 * 334 * var12 / (arg0 * 512);
            if (class360.field5283 > var7) {
                var7 = class360.field5283;
                int var13 = var12 * 334 * arg1 / (var7 * 512);
                int var14 = (-var13 + arg0) / 2;
                if (arg3) {
                    class35.field574.method2034();
                    class35.field574.method2766(arg1, var14, arg4, arg2, -16777216, arg5 + -3622);
                    class35.field574.method2766(arg1, var14, arg4, -var14 + arg0 + arg2, -16777216, 33);
                }
                arg0 -= var14 * 2;
                arg2 += var14;
            }
        }
        class115.field1560 = arg0 * var7 / 334;
        class451.field6581 = arg2;
        class322.field4597 = arg4;
        if (arg5 != 3516) {
            field520 = null;
        }
        class367.field5460 = (short) arg1;
        class27.field485 = (short) arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 419)
    public final void method261(byte arg0) {
        ++field523;
        this.field512 = 0;
        this.field516 = 0;
        if (arg0 != 122) {
            this.field510 = null;
        }
    }
}
