import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class195 extends class34 {

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    private int field2605;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    private int field2615;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    private int field2609;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field2610 = -1;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "[Lsp;")
    public static class422[] field2617;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "[Lcq;")
    public static class67[] field2608;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V", line = 3)
    public final void method224(int arg0, int arg1, int arg2) {
        ++field2612;
        int var4 = this.field2606 * arg2 >> 12;
        if (arg1 == 512) {
            int var5 = this.field2615 * arg2 >> 12;
            int var6 = this.field2605 * arg0 >> 12;
            int var7 = this.field2609 * arg0 >> 12;
            class193.method1161(var4, -113, var5, var6, super.field480, super.field479, var7);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILdc;IIIZILrj;IIIIILii;I)Ldc;", line = 26)
    public static final class375 method1166(int arg0, class375 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class12 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class405 arg13, int arg14) {
        ++field2614;
        if (arg1 == null) {
            return null;
        } else {
            int var15 = 1031;
            if (arg7 != null) {
                int var16 = var15 | arg7.method86((byte) 119, arg9, -1, false);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg4 << 32) + ((long) arg14 << 48) + (long) (arg10 - -(arg11 << 16) - -(arg8 << 24));
            class189 var19 = class48.field674;
            class375 var20;
            synchronized (class48.field674) {
                var20 = (class375) class48.field674.method1137(var17, 2108653711);
            }
            if (var20 == null || ~arg13.method1643(var20.method1608(), var15) != -1) {
                if (var20 != null) {
                    var15 = arg13.method1620(var15, var20.method1608());
                }
                byte var21;
                if (~arg10 == -2) {
                    var21 = 9;
                } else if (arg10 == 2) {
                    var21 = 12;
                } else if (arg10 != 3) {
                    if (arg10 == 4) {
                        var21 = 18;
                    } else {
                        var21 = 21;
                    }
                } else {
                    var21 = 15;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class245 var24 = new class245(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
                int var25 = var24.method1477(0, 0, 0, (byte) 116);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var27 > ~var22; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var21 > var30; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class117.field1644[var31] * var28 >> 15;
                        int var33 = class117.field1636[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method1477(var33, 0, var32, (byte) 123);
                    }
                }
                for (int var34 = 0; ~var34 > ~var22; ++var34) {
                    int var35 = (var34 * 256 + 128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg8 * var35 + arg11 * var36 >> 8);
                    short var38 = (short) (((arg4 & 896) * var36 + (896 & arg14) * var35 & 229376) + (16515072 & (arg4 & 64512) * var36 + (arg14 & 64512) * var35) + ((127 & arg4) * var36 + (arg14 & 127) * var35 & 32512) >> 8);
                    for (int var39 = 0; ~var39 > ~var21; ++var39) {
                        if (~var34 != -1) {
                            var24.method1473(var26[var34][(var39 + 1) % var21], (byte) -1, var38, (byte) 113, (byte) 1, var26[var34 + -1][(var39 - -1) % var21], var26[var34 - 1][var39], (short) -1, var37);
                            var24.method1473(var26[var34][var39], (byte) -1, var38, (byte) 107, (byte) 1, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], (short) -1, var37);
                        } else {
                            var24.method1473(var26[0][var39], (byte) -1, var38, (byte) 63, (byte) 1, var26[0][(var39 - -1) % var21], var25, (short) -1, var37);
                        }
                    }
                }
                var20 = arg13.method1715(var24, var15, class367.field5300, 64, 768);
                class189 var40 = class48.field674;
                synchronized (class48.field674) {
                    class48.field674.method1144(var17, var20, -3480);
                }
            }
            int var41 = arg10 * 64 + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg5) {
                if (~arg0 < -13313 || ~arg0 > -3073) {
                    var43 -= 128;
                }
                if (arg0 > 1024 && arg0 < 7168) {
                    var42 -= 128;
                }
                if (~arg0 < -5121 && ~arg0 > -11265) {
                    var45 = var41 + 128;
                }
                if (~arg0 < -9217 && arg0 < 15360) {
                    var44 = var41 + 128;
                }
            }
            int var46 = arg1.method1581();
            int var47 = arg1.method1613();
            if (arg3 > -69) {
                method1166(115, (class375) null, 98, 121, -51, true, -9, (class12) null, -94, 112, -87, 65, -29, (class405) null, -96);
            }
            int var48 = arg1.method1603();
            if (~var42 < ~var46) {
                var46 = var42;
            }
            if (~var44 > ~var47) {
                var47 = var44;
            }
            if (var43 > var48) {
                var48 = var43;
            }
            int var49 = arg1.method1592();
            if (~var45 > ~var49) {
                var49 = var45;
            }
            class442 var50 = null;
            if (arg7 != null) {
                int var51 = arg7.field182[arg9];
                var50 = class307.method2093(3, var51 >> 16);
                arg9 = var51 & 65535;
            }
            class375 var52;
            if (var50 == null) {
                var52 = var20.method1568((byte) 3, var15, true);
                var52.method1562((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                var52.method1567((var46 - -var47) / 2, 0, (var48 + var49) / 2);
            } else {
                var52 = var20.method1568((byte) 3, var15, true);
                var52.method1562((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                var52.method1567((var46 + var47) / 2, 0, (var48 + var49) / 2);
                var52.method2432(arg9, (byte) 118, var50);
            }
            if (arg6 != 0) {
                var52.method1571(arg6);
            }
            if (arg2 != 0) {
                var52.method1572(arg2);
            }
            if (arg12 != 0) {
                var52.method1567(0, arg12, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(III)V", line = 238)
    public final void method228(int arg0, int arg1, int arg2) {
        ++field2611;
        int var4 = this.field2606 * arg1 >> 12;
        int var5 = this.field2615 * arg1 >> 12;
        int var6 = this.field2605 * arg2 >> 12;
        if (arg0 != 0) {
            this.method224(-86, -50, -84);
        }
        int var7 = this.field2609 * arg2 >> 12;
        class315.method2131(var6, var5, var7, -102, var4, super.field481);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIII)V", line = 259)
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2605 = arg1;
        this.field2606 = arg0;
        this.field2615 = arg2;
        this.field2609 = arg3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 278)
    public static void method1167(byte arg0) {
        field2608 = null;
        if (arg0 <= 90) {
            method1167((byte) 115);
        }
        field2617 = null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)V", line = 295)
    public final void method227(int arg0, int arg1, int arg2) {
        ++field2616;
        if (arg0 >= 26) {
            int var4 = this.field2606 * arg1 >> 12;
            int var5 = this.field2615 * arg1 >> 12;
            int var6 = this.field2605 * arg2 >> 12;
            int var7 = this.field2609 * arg2 >> 12;
            class15.method94(super.field480, (byte) -128, super.field479, super.field481, var7, var4, var6, var5);
        }
    }
}
