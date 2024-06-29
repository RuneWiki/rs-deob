import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class145 {

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    private int field106 = -1;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "Lig;")
    public static class206 field107 = new class206(57, 6);

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "Lig;")
    public static class206 field112 = new class206(25, 10);

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "Lig;")
    public static class206 field114 = new class206(64, 3);

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    public static int field115 = -1;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "[Lun;")
    public static class360[] field117 = new class360[8];

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "F")
    public static float field113;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "[I")
    public int[] field111;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "[[S")
    public static short[][] field116;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 9104) {
            field107 = null;
        }
        ++field109;
        return this.field106;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)[[I")
    public int[][] method75(byte arg0, int arg1) {
        ++field105;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917 && this.method80((byte) 16)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class441.field6574 == ~this.field100 ? arg1 : this.field100 * arg1 / class441.field6574) * this.field104;
            if (~class647.field9368 == ~this.field104) {
                for (int var8 = 0; ~class647.field9368 < ~var8; ++var8) {
                    int var9 = this.field111[var7++];
                    var6[var8] = class643.method3659(255, var9) << 4;
                    var5[var8] = class643.method3659(var9 >> 4, 4080);
                    var4[var8] = class643.method3659(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class647.field9368; ++var10) {
                    int var11 = this.field104 * var10 / class647.field9368;
                    int var12 = this.field111[var7 + var11];
                    var6[var10] = class643.method3659(var12 << 4, 4080);
                    var5[var10] = class643.method3659(4080, var12 >> 4);
                    var4[var10] = class643.method3659(var12 >> 12, 4080);
                }
            }
        }
        return arg0 > -28 ? null : var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public final void method76(int arg0) {
        ++field110;
        super.method76(arg0);
        this.field111 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILhi;IILba;IIIIILoa;)Lba;")
    public static final class327 method77(int arg0, int arg1, int arg2, int arg3, int arg4, class177 arg5, int arg6, int arg7, class327 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class605 arg14) {
        ++field108;
        if (arg8 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg5 != null) {
                int var16 = var15 | arg5.method1005(-1, arg3, false, 121);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg12 << 32) + ((long) arg2 << 48) + (long) ((arg11 << 24) + (arg1 << 16) + arg6);
            class277 var19 = class229.field3231;
            class327 var20;
            synchronized (class229.field3231) {
                var20 = (class327) class229.field3231.method1801(0, var17);
            }
            if (var20 == null || arg14.method293(var20.method1375(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg14.method300(var15, var20.method1375());
                }
                byte var21;
                if (~arg6 == -2) {
                    var21 = 9;
                } else if (~arg6 == -3) {
                    var21 = 12;
                } else if (~arg6 != -4) {
                    if (arg6 != 4) {
                        var21 = 21;
                    } else {
                        var21 = 18;
                    }
                } else {
                    var21 = 15;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class557 var24 = new class557(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                int var25 = var24.method3214(0, 0, 1, 0);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var27 > ~var22; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var30 < var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class605.field8859[var31] * var28 >> 14;
                        int var33 = class605.field8858[var31] * var29 >> 14;
                        var26[var27][var30] = var24.method3214(var32, var33, 1, 0);
                    }
                }
                for (int var34 = 0; ~var22 < ~var34; ++var34) {
                    int var35 = (var34 * 256 + 128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg1 * var36 + arg11 * var35 >> 8);
                    short var38 = (short) ((229376 & (896 & arg2) * var35 + (896 & arg12) * var36) + ((64512 & arg2) * var35 + (arg12 & 64512) * var36 & 16515072) + ((127 & arg2) * var35 + (127 & arg12) * var36 & 32512) >> 8);
                    for (int var39 = 0; var39 < var21; ++var39) {
                        if (var34 != 0) {
                            var24.method3215(var38, var26[var34 - 1][var39], (byte) 1, var26[var34][(var39 + 1) % var21], var37, (byte) -1, var26[var34 + -1][(var39 + 1) % var21], (byte) 98, (short) -1);
                            var24.method3215(var38, var26[var34 + -1][var39], (byte) 1, var26[var34][var39], var37, (byte) -1, var26[var34][(var39 + 1) % var21], (byte) 65, (short) -1);
                        } else {
                            var24.method3215(var38, var25, (byte) 1, var26[0][var39], var37, (byte) -1, var26[0][(var39 + 1) % var21], (byte) 37, (short) -1);
                        }
                    }
                }
                var20 = arg14.method326(var24, var15, class636.field9156, 64, 768);
                class277 var40 = class229.field3231;
                synchronized (class229.field3231) {
                    class229.field3231.method1808(var17, var20, (byte) -85);
                }
            }
            int var41 = (arg6 << 8) + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (~arg9 != -1) {
                if ((arg9 & 1) != 0) {
                    var45 = var41 + 512;
                }
                if ((arg9 & 4) != 0) {
                    var44 = var41 + 512;
                }
                if (~(2 & arg9) != -1) {
                    var43 -= 512;
                }
                if ((arg9 & 8) != 0) {
                    var42 -= 512;
                }
            }
            int var46 = arg8.method1349();
            int var47 = arg8.method1402();
            int var48 = arg8.method1383();
            if (~var48 > ~var43) {
                var48 = var43;
            }
            if (var46 < var42) {
                var46 = var42;
            }
            int var49 = arg8.method1374();
            if (~var44 > ~var47) {
                var47 = var44;
            }
            if (var45 < var49) {
                var49 = var45;
            }
            class66 var50 = null;
            if (arg5 != null) {
                int var51 = arg5.field2181[arg3];
                var50 = class259.field3686.method2964(var51 >> 16, 78);
                arg3 = var51 & 65535;
            }
            class327 var52;
            if (var50 != null) {
                var52 = var20.method1382((byte) 3, var15, true);
                var52.method1369(-var46 + var47 >> 1, 128, var49 - var48 >> 1);
                var52.method1354(var46 + var47 >> 1, 0, var48 + var49 >> 1);
                var52.method2120(var50, (byte) 123, arg3);
            } else {
                var52 = var20.method1382((byte) 3, var15, true);
                var52.method1369(var47 - var46 >> 1, 128, -var48 + var49 >> 1);
                var52.method1354(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
            }
            if (arg13 != 0) {
                var52.method1358(arg13);
            }
            int var53 = 2 % ((arg10 - -49) / 49);
            if (arg7 != 0) {
                var52.method1396(arg7);
            }
            if (~arg0 != -1) {
                var52.method1354(0, arg0, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(BI)V")
    public static final void method78(byte arg0, int arg1) {
        ++field101;
        class194.field2637 = arg1;
        int var2 = -45 / ((arg0 - 41) / 44);
        class277 var3 = class191.field2508;
        synchronized (class191.field2508) {
            class191.field2508.method1810(false);
        }
        class277 var4 = class4.field33;
        synchronized (class4.field33) {
            class4.field33.method1810(false);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            this.field106 = arg2.method1220(-115);
        }
        if (arg1 < -67) {
            ++field103;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
    public class13() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method79(byte arg0) {
        field116 = null;
        if (arg0 == -88) {
            field107 = null;
            field112 = null;
            field114 = null;
            field117 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
    public final boolean method80(byte arg0) {
        ++field102;
        if (arg0 != 16) {
            return true;
        } else if (this.field111 != null) {
            return true;
        } else if (~this.field106 <= -1) {
            class372 var2 = ~class198.field2673 <= -1 ? class372.method2398(class126.field1558, class198.field2673, this.field106) : class372.method2405(class126.field1558, this.field106);
            var2.method2399();
            this.field111 = var2.method2406();
            this.field104 = var2.field5688;
            this.field100 = var2.field5692;
            return true;
        } else {
            return false;
        }
    }
}
