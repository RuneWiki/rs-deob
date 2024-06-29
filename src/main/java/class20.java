import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 extends class131 {

    @OriginalMember(owner = "client!bk", name = "ic", descriptor = "[Lid;")
    public static class149[] field292 = new class149[8];

    @OriginalMember(owner = "client!bk", name = "nc", descriptor = "Lid;")
    public static class149 field297 = class60.method382("Untersuchen", (byte) 22);

    @OriginalMember(owner = "client!bk", name = "vc", descriptor = "Z")
    public static boolean field305 = false;

    @OriginalMember(owner = "client!bk", name = "jc", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bk", name = "kc", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bk", name = "lc", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bk", name = "oc", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bk", name = "pc", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!bk", name = "qc", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bk", name = "rc", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bk", name = "sc", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bk", name = "tc", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bk", name = "uc", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bk", name = "wc", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bk", name = "mc", descriptor = "Lja;")
    public class59 field296;

    @OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field301;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(III)Lmh;")
    public static final class152 method111(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class152 var4 = var3.field4052;
            var3.field4052 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()I")
    public final int method53() {
        ++field306;
        return super.field2390;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field304;
        if (arg0 != 0) {
            method114(true);
        }
        if (~class245.field4306 != -1 && this.field296.field1046 != null) {
            class59 var2 = this.field296.method374(-1);
            if (var2 != null && ~var2.field1027 != 0) {
                return var2.field1027;
            }
        }
        return super.field2342;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIBII)V")
    public static final void method113(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field299;
        if (arg3 >= 122) {
            for (int var6 = arg2; var6 <= arg2 + arg4; ++var6) {
                for (int var11 = arg0; ~(arg0 - -arg1) <= ~var11; ++var11) {
                    if (~var11 <= -1 && ~var11 > -105 && ~var6 <= -1 && var6 < 104) {
                        class108.field1883[arg5][var11][var6] = 127;
                    }
                }
            }
            for (int var7 = arg2; var7 < arg2 + arg4; ++var7) {
                for (int var10 = arg0; var10 < arg0 + arg1; ++var10) {
                    if (var10 >= 0 && var10 < 104 && ~var7 <= -1 && var7 < 104) {
                        class189.field3393[arg5][var10][var7] = ~arg5 < -1 ? class189.field3393[arg5 + -1][var10][var7] : 0;
                    }
                }
            }
            if (~arg0 < -1 && ~arg0 > -105) {
                for (int var8 = arg2 + 1; ~var8 > ~(arg2 - -arg4); ++var8) {
                    if (~var8 <= -1 && var8 < 104) {
                        class189.field3393[arg5][arg0][var8] = class189.field3393[arg5][arg0 + -1][var8];
                    }
                }
            }
            if (~arg2 < -1 && ~arg2 > -105) {
                for (int var9 = arg0 + 1; arg0 + arg1 > var9; ++var9) {
                    if (~var9 <= -1 && ~var9 > -105) {
                        class189.field3393[arg5][var9][arg2] = class189.field3393[arg5][var9][arg2 + -1];
                    }
                }
            }
            if (~arg0 <= -1 && arg2 >= 0 && arg0 < 104 && arg2 < 104) {
                if (arg5 == 0) {
                    if (~arg0 < -1 && ~class189.field3393[arg5][arg0 + -1][arg2] != -1) {
                        class189.field3393[arg5][arg0][arg2] = class189.field3393[arg5][arg0 + -1][arg2];
                        return;
                    }
                    if (arg2 > 0 && ~class189.field3393[arg5][arg0][arg2 - 1] != -1) {
                        class189.field3393[arg5][arg0][arg2] = class189.field3393[arg5][arg0][arg2 + -1];
                        return;
                    }
                    if (arg0 > 0 && arg2 > 0 && class189.field3393[arg5][arg0 - 1][arg2 + -1] != 0) {
                        class189.field3393[arg5][arg0][arg2] = class189.field3393[arg5][arg0 + -1][arg2 + -1];
                        return;
                    }
                } else {
                    if (~arg0 >= -1 || ~class189.field3393[arg5][arg0 + -1][arg2] == ~class189.field3393[arg5 - 1][arg0 + -1][arg2]) {
                        if (~arg2 < -1 && class189.field3393[arg5 - 1][arg0][arg2 + -1] != class189.field3393[arg5][arg0][arg2 + -1]) {
                            class189.field3393[arg5][arg0][arg2] = class189.field3393[arg5][arg0][arg2 + -1];
                            return;
                        }
                        if (~arg0 < -1 && arg2 > 0 && class189.field3393[arg5][arg0 - 1][arg2 + -1] != class189.field3393[arg5 - 1][arg0 + -1][arg2 + -1]) {
                            class189.field3393[arg5][arg0][arg2] = class189.field3393[arg5][arg0 + -1][arg2 + -1];
                            return;
                        }
                        return;
                    }
                    class189.field3393[arg5][arg0][arg2] = class189.field3393[arg5][arg0 - 1][arg2];
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method114(boolean arg0) {
        field297 = null;
        if (!arg0) {
            field297 = null;
        }
        field292 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        ++field294;
        if (this.field296 != null) {
            class164 var13 = super.field2349 != -1 && super.field2406 == 0 ? class69.method436(super.field2349, -32) : null;
            class164 var14 = ~super.field2334 == 0 || ~super.field2334 == ~this.method923((byte) -87).field4718 && var13 != null ? null : class69.method436(super.field2334, -32);
            class262 var15 = this.field296.method366(super.field2363, super.field2397, var13, super.field2331, super.field2318, super.field2355, (byte) -105, super.field2336, super.field2372, var14);
            if (var15 != null) {
                super.field2390 = var15.method53();
                class59 var16 = this.field296;
                if (var16.field1046 != null) {
                    var16 = var16.method374(-1);
                }
                if (class116.field1989 && var16.field1072) {
                    class262 var17 = class278.method1917(super.field2340, this.field296.field1049, var15, this.field296.field1030, this.field296.field1022, true, this.field296.field1054, var14 == null ? var13 : var14, super.field2347, super.field2313, arg0, this.field296.field1024, var14 != null ? super.field2372 : super.field2397, super.field2329);
                    var17.method54(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field2346);
                }
                class262 var18 = null;
                this.method926((byte) 123, var15);
                this.method917(arg0, var15, true);
                if (~super.field2353 != 0 && ~super.field2359 != 0) {
                    class288 var19 = class200.method1374(-17177, super.field2353);
                    var18 = var19.method1972(super.field2394, (byte) -50, super.field2326, super.field2359);
                    if (var18 != null) {
                        var18.method826(0, -super.field2374, 0);
                        if (var19.field5125) {
                            if (class272.field4889 != 0) {
                                var18.method858(class272.field4889);
                            }
                            if (class199.field3611 != 0) {
                                var18.method833(class199.field3611);
                            }
                            if (~class78.field1463 != -1) {
                                var18.method826(0, class78.field1463, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class121) var15).method827(var18);
                }
                if (~this.field296.field1049 == -2) {
                    var15.field4670 = true;
                }
                var15.method54(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2346);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLja;)V")
    public final void method115(byte arg0, class59 arg1) {
        ++field293;
        this.field296 = arg1;
        if (arg0 != -51) {
            this.method49(-58, 68, 22, 12, -50);
        }
        if (super.field2346 != null) {
            super.field2346.method653();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field303;
        if (this.field296 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIZ)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field297 = null;
        }
        int var5 = 0;
        class141.method987(2, -arg2 + arg1, class15.field220[arg0], arg1 + arg2, arg3);
        ++field298;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        while (~var5 > ~var6) {
            ++var5;
            var8 += 2;
            var7 += var8;
            if (~var7 <= -1) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class15.field220[arg0 + var6];
                int[] var10 = class15.field220[-var6 + arg0];
                int var11 = -var5 + arg1;
                int var12 = arg1 + var5;
                class141.method987(2, var11, var9, var12, arg3);
                class141.method987(2, var11, var10, var12, arg3);
            }
            int var13 = arg1 - -var6;
            int[] var14 = class15.field220[arg0 + var5];
            int var15 = arg1 - var6;
            int[] var16 = class15.field220[arg0 - var5];
            class141.method987(2, var15, var14, var13, arg3);
            class141.method987(2, var15, var16, var13, arg3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)Z")
    public final boolean method117(byte arg0) {
        if (arg0 != 62) {
            field292 = null;
        }
        ++field295;
        return this.field296 != null;
    }
}
