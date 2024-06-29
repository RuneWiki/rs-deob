import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class110 extends class173 {

    @OriginalMember(owner = "client!jfa", name = "Ib", descriptor = "Z")
    public boolean field1439 = true;

    @OriginalMember(owner = "client!jfa", name = "Eb", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!jfa", name = "mb", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!jfa", name = "nb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!jfa", name = "ob", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!jfa", name = "pb", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!jfa", name = "qb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!jfa", name = "rb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jfa", name = "sb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!jfa", name = "tb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jfa", name = "ub", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jfa", name = "vb", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jfa", name = "wb", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!jfa", name = "xb", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!jfa", name = "yb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jfa", name = "zb", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client!jfa", name = "Ab", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jfa", name = "Cb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!jfa", name = "Db", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jfa", name = "Fb", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jfa", name = "Gb", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!jfa", name = "Hb", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jfa", name = "Jb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!jfa", name = "Kb", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!jfa", name = "Lb", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!jfa", name = "Mb", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jfa", name = "Nb", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!jfa", name = "Ob", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jfa", name = "Pb", descriptor = "I")
    public static int field1446;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jfa", name = "Qb", descriptor = "Ljava/lang/Class;")
    public static Class field1447;

    @OriginalMember(owner = "client!jfa", name = "Bb", descriptor = "[I")
    public int[] field1432;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)V")
    public final void method391(boolean arg0) {
        this.field1439 = arg0;
        ++field1434;
    }

    @OriginalMember(owner = "client!jfa", name = "G", descriptor = "()V")
    public final void method841() {
        super.field2137 = -super.field2149 + super.field2144;
        super.field2135 = super.field2157 - super.field2149;
        super.field2163 = -super.field2143 + super.field2140;
        ++field1444;
        super.field2173 = -super.field2143 + super.field2136;
        for (int var1 = 0; ~var1 > ~super.field2141; ++var1) {
            class670 var5 = ((class639) super.field2142[var1]).field8892;
            var5.field9299 = super.field2143 - super.field2136;
            var5.field9311 = super.field2140 - super.field2136;
            var5.field9309 = -super.field2144 + super.field2149;
            var5.field9306 = -super.field2144 + super.field2157;
        }
        int var2 = super.field2167 * super.field2136 + super.field2144;
        for (int var3 = super.field2136; var3 < super.field2140; ++var3) {
            for (int var4 = 0; ~var4 > ~super.field2141; ++var4) {
                ((class639) super.field2142[var4]).field8892.field9302[-super.field2136 + var3] = var2;
            }
            var2 += super.field2167;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "([Lba;Lqu;Lq;[Lht;I)V")
    public final void method349(class107[] arg0, class282 arg1, class151 arg2, class108[] arg3, int arg4) {
        ++field1417;
        for (int var6 = 0; arg0.length > var6; ++var6) {
            if (arg0[var6] != null) {
                ((class182) arg0[var6]).method1223(arg2, arg3 != null ? arg3[var6] : null, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILfd;)Lnl;")
    public static final class634 method842(int arg0, class418 arg1) {
        if (arg0 != -25390) {
            field1435 = -72;
        }
        ++field1431;
        return new class634(arg1.method2383(arg0 ^ -39982), arg1.method2383(65280), arg1.method2383(65280), arg1.method2383(65280), arg1.method2364(-74), arg1.method2396(77));
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lcp;III)V")
    public static final void method843(class242 arg0, int arg1, int arg2, int arg3) {
        long var4 = class283.field3689[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3251 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field3254[arg0.field3251++] = class421.field5440[var8 - 1].field4631;
            var6 += 16L;
        }
        for (int var9 = arg0.field3251; var9 < 4; ++var9) {
            arg0.field3254[var9] = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1423;
        class639 var11 = (class639) this.method846(Thread.currentThread());
        class670 var12 = var11.field8892;
        var12.field9308 = ~arg0 > -1 || var12.field9306 < arg0 || ~arg2 > -1 || arg2 > var12.field9306 || ~arg4 > -1 || var12.field9306 < arg4;
        var12.field9303 = false;
        int var13 = arg4 - super.field2137;
        int var14 = arg0 - super.field2137;
        int var15 = arg1 - super.field2173;
        int var16 = arg3 - super.field2173;
        int var17 = arg5 - super.field2173;
        int var18 = arg2 - super.field2137;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || ~var19 != -256)) {
            if (arg9 != 1) {
                if (~arg9 != -3) {
                    throw new IllegalArgumentException();
                }
                var12.field9305 = 128;
                var12.field9300 = true;
                var12.method3673(var15, var16, var17, var14, var18, var13, 100, 100, 100, arg6, arg7, arg8);
            } else {
                var12.field9305 = -var19 + 255;
                var12.field9300 = false;
                var12.method3673(var15, var16, var17, var14, var18, var13, 100, 100, 100, arg6, arg7, arg8);
            }
        } else {
            var12.field9300 = false;
            var12.field9305 = 0;
            var12.method3673(var15, var16, var17, var14, var18, var13, 100, 100, 100, arg6, arg7, arg8);
        }
        var12.field9303 = true;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class88 method413(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1426;
        return new class563(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jfa", name = "A", descriptor = "()V")
    public final void method205() {
        if (~super.field2144 == -1 && ~super.field2167 == ~super.field2157 && super.field2136 == 0 && ~super.field2169 == ~super.field2140) {
            int var1 = this.field1432.length;
            int var2 = -var1 + var1 & 7;
            int var3 = 0;
            while (~var2 < ~var3) {
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
                this.field1432[var3++] = Integer.MAX_VALUE;
            }
            while (var1 > var3) {
                this.field1432[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = super.field2157 - super.field2144;
            int var5 = super.field2140 - super.field2136;
            int var6 = -var4 + super.field2167;
            int var7 = super.field2167 * super.field2136 + super.field2144;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 + -1;
            for (int var11 = -var5; ~var11 > -1; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (~var12 < -1);
                }
                if (~var9 < -1) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field1432[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
        ++field1424;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lgda;")
    public static final class486 method844(Component arg0, int arg1, boolean arg2) {
        ++field1429;
        try {
            Constructor var3 = Class.forName("sba").getDeclaredConstructor(field1447 != null ? field1447 : (field1447 = method851("java.awt.Component")), Boolean.TYPE);
            return (class486) var3.newInstance(arg0, new Boolean(arg2));
        } catch (Throwable var4) {
            if (arg1 != 1) {
                field1435 = 88;
            }
            return new class441(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "()V")
    public final void method173() {
        ++field1443;
        if (super.field2131 != null) {
            super.field2139 = super.field2132.field3895;
            super.field2167 = super.field2132.field3899;
            super.field2169 = super.field2132.field3894;
        } else {
            super.field2169 = 1;
            super.field2167 = 1;
            super.field2139 = null;
        }
        super.field2148 = null;
        this.method1172();
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method374(Canvas arg0) {
        ++field1442;
        if (arg0 != null) {
            class298 var2 = (class298) super.field2129.method39((long) arg0.hashCode(), 31750);
            if (var2 != null) {
                super.field2131 = arg0;
                super.field2132 = var2;
                if (super.field2148 == null) {
                    super.field2139 = var2.field3895;
                    super.field2169 = var2.field3894;
                    super.field2167 = var2.field3899;
                    if (~super.field2167 != ~this.field1419 || ~super.field2169 != ~this.field1430) {
                        this.field1419 = super.field2167;
                        this.field1430 = super.field2169;
                        this.field1432 = new int[this.field1430 * this.field1419];
                    }
                    this.method1172();
                    return;
                }
            }
        } else {
            super.field2131 = null;
            super.field2132 = null;
            if (super.field2148 != null) {
                return;
            }
            super.field2167 = super.field2169 = 1;
            super.field2139 = null;
            this.field1419 = this.field1430 = 1;
            this.method1172();
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIB)V")
    public static final void method845(int arg0, int arg1, int arg2, byte arg3) {
        ++field1420;
        class367 var4 = class573.method3057(11, arg2, arg3 ^ 99);
        var4.method2115(arg3 ^ 96);
        var4.field4736 = arg0;
        if (arg3 == 97) {
            var4.field4735 = arg1;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lxa;Z)V")
    public final void method234(class511 arg0, boolean arg1) {
        ++field1433;
        if (arg0 instanceof class464) {
            class464 var3 = (class464) arg0;
            super.field2167 = var3.field3165;
            super.field2148 = arg0;
            super.field2139 = var3.field6065;
            super.field2169 = var3.field3154;
        } else {
            if (!(arg0 instanceof class334)) {
                throw new RuntimeException();
            }
            class334 var4 = (class334) arg0;
            super.field2139 = var4.field4328;
            super.field2148 = arg0;
            super.field2169 = var4.field3154;
            super.field2167 = var4.field3165;
        }
        this.method1172();
    }

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V")
    public final void method373(int arg0) {
        ++field1436;
        super.field2142[arg0].method2478(64, Thread.currentThread());
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/Runnable;)Ltv;")
    public final class434 method846(Runnable arg0) {
        ++field1438;
        for (int var2 = 0; super.field2141 > var2; ++var2) {
            if (super.field2142[var2].field5590 == arg0) {
                return super.field2142[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
    public final void method359(int arg0) {
        super.field2141 = arg0;
        ++field1441;
        super.field2142 = new class639[super.field2141];
        for (int var2 = 0; ~super.field2141 < ~var2; ++var2) {
            super.field2142[var2] = new class639(this);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lfu;IIII)V")
    public final void method847(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1428;
        int var6 = arg0.field905;
        int var8 = arg4 << 1;
        if (~var6 != 0) {
            if (~super.field2177 != ~var6) {
                class511 var9 = (class511) super.field2154.method3655(28, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1173(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1170(var6) ? 64 : 128;
                    var9 = this.method381(var10, 0, var11, var11, var11);
                    super.field2154.method3650((long) var6, -102, var9);
                }
                super.field2177 = var6;
                super.field2178 = var9;
            }
            ++var8;
            this.method849((class334) super.field2178, arg3, -arg4 + arg2, 1, var8, 0, arg0.field902, var8, arg1 - arg4, -1551981679);
        } else {
            this.method850(arg1, 126, arg2, arg0.field902, arg3, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field1445;
        super.field2142[arg0].method2478(64, (Runnable) null);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1427;
        if (arg3 != 0 && arg4 != 0) {
            if (~arg6 != -65536 && !super.field598.method3162((byte) -104, arg6).field799) {
                if (super.field2177 != arg6) {
                    class511 var11 = (class511) super.field2154.method3655(83, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1173(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = !this.method1170(arg6) ? 128 : 64;
                        var11 = this.method381(var12, 0, var13, var13, var13);
                        super.field2154.method3650((long) arg6, -102, var11);
                    }
                    super.field2177 = arg6;
                    super.field2178 = var11;
                }
                this.method849((class334) super.field2178, arg2, -arg4 + arg1, arg9, arg4 << 1, arg8, arg7, arg3 << 1, arg0 - arg3, -1551981679);
            } else {
                this.method850(arg0, 99, arg1, arg7, arg2, arg3, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lpo;IIIIIIIII)V")
    private final void method849(class334 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1437;
        if (~arg7 < -1 && arg4 > 0) {
            int var11 = arg1 << 8;
            int var12 = 0;
            if (arg9 == -1551981679) {
                int var13 = 0;
                int var14 = arg0.field3171 + arg0.field3165 + arg0.field3167;
                int var15 = arg0.field3180 + arg0.field3154 + arg0.field3153;
                int var16 = (var14 << 16) / arg7;
                if (arg0.field3171 > 0) {
                    int var17 = ((arg0.field3171 << 16) + -1 + var16) / var16;
                    var12 += var16 * var17 + -(arg0.field3171 << 16);
                    arg8 += var17;
                }
                int var18 = (var15 << 16) / arg4;
                if (arg0.field3180 > 0) {
                    int var19 = ((arg0.field3180 << 16) + -1 + var18) / var18;
                    arg2 += var19;
                    var13 += var18 * var19 + -(arg0.field3180 << 16);
                }
                if (~arg0.field3165 > ~var14) {
                    arg7 = ((arg0.field3165 << 16) + -var12 + var16 + -1) / var16;
                }
                if (~arg0.field3154 > ~var15) {
                    arg4 = ((arg0.field3154 << 16) + var18 - (var13 - -1)) / var18;
                }
                int var20 = super.field2167 * arg2 + arg8;
                int var21 = super.field2167 - arg7;
                if (~(arg2 + arg4) < ~super.field2140) {
                    arg4 -= -super.field2140 + arg2 - -arg4;
                }
                if (arg2 < super.field2136) {
                    int var22 = super.field2136 - arg2;
                    var20 += super.field2167 * var22;
                    arg4 -= var22;
                    var13 += var18 * var22;
                }
                if (super.field2157 < arg7 + arg8) {
                    int var23 = -super.field2157 + arg8 + arg7;
                    arg7 -= var23;
                    var21 += var23;
                }
                if (arg8 < super.field2144) {
                    int var24 = -arg8 + super.field2144;
                    var21 += var24;
                    var20 += var24;
                    var12 += var16 * var24;
                    arg7 -= var24;
                }
                if (~arg3 == -1) {
                    if (arg5 == 1) {
                        int var25 = var12;
                        for (int var26 = -arg4; ~var26 > -1; ++var26) {
                            int var27 = (var13 >> 16) * arg0.field3165;
                            var13 += var18;
                            for (int var28 = -arg7; ~var28 > -1; ++var28) {
                                if (var11 < this.field1432[var20]) {
                                    super.field2139[var20] = arg0.field4328[(var12 >> 16) + var27];
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var20 += var21;
                            var12 = var25;
                        }
                    } else if (arg5 != 0) {
                        if (~arg5 != -4) {
                            if (~arg5 != -3) {
                                throw new IllegalArgumentException();
                            } else {
                                int var29 = arg6 >>> 24;
                                int var30 = -var29 + 256;
                                int var31 = -16711936 & (arg6 & 16711935) * var30;
                                int var32 = (arg6 & 65280) * var30 & 16711680;
                                int var33 = (var31 | var32) >>> 8;
                                int var34 = var12;
                                for (int var35 = -arg4; ~var35 > -1; ++var35) {
                                    int var36 = (var13 >> 16) * arg0.field3165;
                                    for (int var37 = -arg7; var37 < 0; ++var37) {
                                        if (~var11 > ~this.field1432[var20]) {
                                            int var38 = arg0.field4328[(var12 >> 16) + var36];
                                            int var39 = 16711680 & (var38 & 65280) * var29;
                                            int var40 = (16711935 & var38) * var29 & -16711936;
                                            super.field2139[var20] = var33 + (class131.method954(var39, var40) >>> 8);
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var13 += var18;
                                    var12 = var34;
                                    var20 += var21;
                                }
                            }
                        } else {
                            int var41 = var12;
                            for (int var42 = -arg4; var42 < 0; ++var42) {
                                int var43 = (var13 >> 16) * arg0.field3165;
                                for (int var44 = -arg7; ~var44 > -1; ++var44) {
                                    if (var11 < this.field1432[var20]) {
                                        int var45 = arg0.field4328[(var12 >> 16) - -var43];
                                        int var46 = var45 - -arg6;
                                        int var47 = (16711935 & arg6) + (16711935 & var45);
                                        int var48 = (-var47 + var46 & 65536) + (var47 & 16777472);
                                        super.field2139[var20] = class131.method954(-(var48 >>> 8) + var48, -var48 + var46);
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var13 += var18;
                                var20 += var21;
                                var12 = var41;
                            }
                        }
                    } else {
                        int var49 = (16711680 & arg6) >> 16;
                        int var50 = arg6 >> 8 & 255;
                        int var51 = 255 & arg6;
                        int var52 = var12;
                        for (int var53 = -arg4; var53 < 0; ++var53) {
                            int var54 = (var13 >> 16) * arg0.field3165;
                            var13 += var18;
                            for (int var55 = -arg7; ~var55 > -1; ++var55) {
                                if (~this.field1432[var20] < ~var11) {
                                    int var56 = arg0.field4328[(var12 >> 16) + var54];
                                    int var57 = -16777216 & (var56 & 16711680) * var49;
                                    int var58 = 16711680 & (var56 & 65280) * var50;
                                    int var59 = 65280 & (var56 & 255) * var51;
                                    super.field2139[var20] = class131.method954(class131.method954(var58, var57), var59) >>> 8;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var12 = var52;
                            var20 += var21;
                        }
                    }
                } else if (arg3 != 1) {
                    if (~arg3 != -3) {
                        throw new IllegalArgumentException();
                    } else if (arg5 != 1) {
                        if (~arg5 != -1) {
                            if (arg5 != 3) {
                                if (~arg5 != -3) {
                                    throw new IllegalArgumentException();
                                } else {
                                    int var60 = arg6 >>> 24;
                                    int var61 = -var60 + 256;
                                    int var62 = (arg6 & 16711935) * var61 & -16711936;
                                    int var63 = 16711680 & (arg6 & 65280) * var61;
                                    int var64 = (var63 | var62) >>> 8;
                                    int var65 = var12;
                                    for (int var66 = -arg4; ~var66 > -1; ++var66) {
                                        int var67 = (var13 >> 16) * arg0.field3165;
                                        var13 += var18;
                                        for (int var68 = -arg7; ~var68 > -1; ++var68) {
                                            if (this.field1432[var20] > var11) {
                                                int var69 = arg0.field4328[(var12 >> 16) + var67];
                                                if (~var69 != -1) {
                                                    int var70 = -16711936 & (16711935 & var69) * var60;
                                                    int var71 = (65280 & var69) * var60 & 16711680;
                                                    int var72 = ((var70 | var71) >>> 8) + var64;
                                                    int var73 = super.field2139[var20];
                                                    int var74 = var72 + var73;
                                                    int var75 = (16711935 & var72) + (16711935 & var73);
                                                    int var76 = (16777472 & var75) - -(65536 & var74 - var75);
                                                    super.field2139[var20] = class131.method954(-var76 + var74, -(var76 >>> 8) + var76);
                                                }
                                            }
                                            ++var20;
                                            var12 += var16;
                                        }
                                        var20 += var21;
                                        var12 = var65;
                                    }
                                }
                            } else {
                                int var77 = var12;
                                for (int var78 = -arg4; ~var78 > -1; ++var78) {
                                    int var79 = (var13 >> 16) * arg0.field3165;
                                    var13 += var18;
                                    for (int var80 = -arg7; var80 < 0; ++var80) {
                                        if (~this.field1432[var20] < ~var11) {
                                            int var81 = arg0.field4328[(var12 >> 16) + var79];
                                            int var82 = arg6 + var81;
                                            int var83 = (16711935 & arg6) + (16711935 & var81);
                                            int var84 = (-var83 + var82 & 65536) + (16777472 & var83);
                                            int var85 = -(var84 >>> 8) + var84 | -var84 + var82;
                                            int var86 = super.field2139[var20];
                                            int var87 = var85 + var86;
                                            int var88 = (var85 & 16711935) + (var86 & 16711935);
                                            int var89 = (var88 & 16777472) - -(65536 & var87 - var88);
                                            super.field2139[var20] = class131.method954(-(var89 >>> 8) + var89, -var89 + var87);
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var20 += var21;
                                    var12 = var77;
                                }
                            }
                        } else {
                            int var90 = var12;
                            int var91 = (16711680 & arg6) >> 16;
                            int var92 = arg6 >> 8 & 255;
                            int var93 = arg6 & 255;
                            for (int var94 = -arg4; var94 < 0; ++var94) {
                                int var95 = (var13 >> 16) * arg0.field3165;
                                var13 += var18;
                                for (int var96 = -arg7; ~var96 > -1; ++var96) {
                                    if (var11 < this.field1432[var20]) {
                                        int var97 = arg0.field4328[(var12 >> 16) + var95];
                                        if (var97 != 0) {
                                            int var98 = -16777216 & (var97 & 16711680) * var91;
                                            int var99 = (var97 & 65280) * var92 & 16711680;
                                            int var100 = 65280 & (var97 & 255) * var93;
                                            int var101 = (var99 | var98 | var100) >>> 8;
                                            int var102 = super.field2139[var20];
                                            int var103 = var101 - -var102;
                                            int var104 = (var101 & 16711935) + (16711935 & var102);
                                            int var105 = (16777472 & var104) - -(-var104 + var103 & 65536);
                                            super.field2139[var20] = class131.method954(-var105 + var103, -(var105 >>> 8) + var105);
                                        }
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var20 += var21;
                                var12 = var90;
                            }
                        }
                    } else {
                        int var106 = var12;
                        for (int var107 = -arg4; var107 < 0; ++var107) {
                            int var108 = (var13 >> 16) * arg0.field3165;
                            var13 += var18;
                            for (int var109 = -arg7; var109 < 0; ++var109) {
                                if (var11 < this.field1432[var20]) {
                                    int var110 = arg0.field4328[(var12 >> 16) + var108];
                                    if (var110 != 0) {
                                        int var111 = super.field2139[var20];
                                        int var112 = var110 + var111;
                                        int var113 = (var110 & 16711935) + (var111 & 16711935);
                                        int var114 = (-var113 + var112 & 65536) + (16777472 & var113);
                                        super.field2139[var20] = class131.method954(-var114 + var112, -(var114 >>> 8) + var114);
                                    }
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var12 = var106;
                            var20 += var21;
                        }
                    }
                } else if (arg5 == 1) {
                    int var115 = var12;
                    for (int var116 = -arg4; var116 < 0; ++var116) {
                        int var117 = (var13 >> 16) * arg0.field3165;
                        for (int var118 = -arg7; ~var118 > -1; ++var118) {
                            if (this.field1432[var20] > var11) {
                                int var119 = arg0.field4328[(var12 >> 16) + var117];
                                int var120 = var119 >>> 24;
                                int var121 = 256 - var120;
                                int var122 = super.field2139[var20];
                                super.field2139[var20] = class597.method3238(class597.method3238(16711935, var122) * var121 + class597.method3238(var119, 16711935) * var120 >> 8, -65281) + class597.method3238(class597.method3238(var122 >>> 8, 16711935) * var121 + var120 * (class597.method3238(-16711936, var119) >>> 8), -16711936);
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var13 += var18;
                        var20 += var21;
                        var12 = var115;
                    }
                } else if (~arg5 != -1) {
                    if (arg5 == 3) {
                        int var123 = var12;
                        for (int var124 = -arg4; ~var124 > -1; ++var124) {
                            int var125 = (var13 >> 16) * arg0.field3165;
                            for (int var126 = -arg7; ~var126 > -1; ++var126) {
                                if (~var11 > ~this.field1432[var20]) {
                                    int var127 = arg0.field4328[(var12 >> 16) + var125];
                                    int var128 = arg6 + var127;
                                    int var129 = (arg6 & 16711935) + (var127 & 16711935);
                                    int var130 = (16777472 & var129) - -(65536 & var128 - var129);
                                    int var131 = -(var130 >>> 8) + var130 | -var130 + var128;
                                    int var132 = (arg6 >>> 24) * (var131 >>> 24) >> 8;
                                    int var133 = -var132 + 256;
                                    if (var132 != 255) {
                                        int var135 = super.field2139[var20];
                                        var131 = ((65280 & var131) * var132 + (65280 & var135) * var133 & 16711680) + ((16711935 & var131) * var132 + (16711935 & var135) * var133 & -16711936) >> 8;
                                    }
                                    super.field2139[var20] = var131;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var13 += var18;
                            var20 += var21;
                            var12 = var123;
                        }
                    } else if (arg5 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var136 = arg6 >>> 24;
                        int var137 = -var136 + 256;
                        int var138 = (16711935 & arg6) * var137 & -16711936;
                        int var139 = 16711680 & (65280 & arg6) * var137;
                        int var140 = (var138 | var139) >>> 8;
                        int var141 = var12;
                        for (int var142 = -arg4; ~var142 > -1; ++var142) {
                            int var143 = (var13 >> 16) * arg0.field3165;
                            var13 += var18;
                            for (int var144 = -arg7; var144 < 0; ++var144) {
                                if (~this.field1432[var20] < ~var11) {
                                    int var145 = arg0.field4328[(var12 >> 16) + var143];
                                    int var146 = var145 >>> 24;
                                    int var147 = 256 - var146;
                                    int var148 = (65280 & var145) * var136 & 16711680;
                                    int var149 = (var145 & 16711935) * var136 & -16711936;
                                    int var150 = ((var148 | var149) >>> 8) - -var140;
                                    int var151 = super.field2139[var20];
                                    super.field2139[var20] = class597.method3238(-16711936, var146 * class597.method3238(var150, 16711935) - -(var147 * class597.method3238(16711935, var151))) - -class597.method3238(class597.method3238(var151, 65280) * var147 + var146 * class597.method3238(var150, 65280), 16711680) >> 8;
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var12 = var141;
                            var20 += var21;
                        }
                    }
                } else {
                    int var152 = var12;
                    if ((16777215 & arg6) != 16777215) {
                        int var153 = (arg6 & 16711680) >> 16;
                        int var154 = 255 & arg6 >> 8;
                        int var155 = 255 & arg6;
                        for (int var156 = -arg4; var156 < 0; ++var156) {
                            int var157 = (var13 >> 16) * arg0.field3165;
                            for (int var158 = -arg7; var158 < 0; ++var158) {
                                if (~this.field1432[var20] < ~var11) {
                                    int var159 = arg0.field4328[(var12 >> 16) - -var157];
                                    int var160 = (arg6 >>> 24) * (var159 >>> 24) >> 8;
                                    int var161 = -var160 + 256;
                                    if (var160 == 255) {
                                        int var162 = (16711680 & var159) * var153 & -16777216;
                                        int var163 = (65280 & var159) * var154 & 16711680;
                                        int var164 = 65280 & (255 & var159) * var155;
                                        super.field2139[var20] = class131.method954(class131.method954(var162, var163), var164) >>> 8;
                                    } else {
                                        int var165 = (var159 & 16711680) * var153 & -16777216;
                                        int var166 = 16711680 & (var159 & 65280) * var154;
                                        int var167 = 65280 & (255 & var159) * var155;
                                        int var168 = (var165 | var166 | var167) >>> 8;
                                        int var169 = super.field2139[var20];
                                        super.field2139[var20] = class597.method3238(16711680, class597.method3238(var168, 65280) * var160 - -(class597.method3238(var169, 65280) * var161)) + class597.method3238(-16711936, var161 * class597.method3238(16711935, var169) + var160 * class597.method3238(var168, 16711935)) >> 8;
                                    }
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var13 += var18;
                            var20 += var21;
                            var12 = var152;
                        }
                    } else {
                        for (int var170 = -arg4; var170 < 0; ++var170) {
                            int var171 = (var13 >> 16) * arg0.field3165;
                            for (int var172 = -arg7; var172 < 0; ++var172) {
                                if (this.field1432[var20] > var11) {
                                    int var173 = arg0.field4328[(var12 >> 16) + var171];
                                    int var174 = (arg6 >>> 24) * (var173 >>> 24) >> 8;
                                    int var175 = -var174 + 256;
                                    int var176 = super.field2139[var20];
                                    super.field2139[var20] = class597.method3238(var175 * class597.method3238(var176, 16711935) + var174 * class597.method3238(var173, 16711935), -16711936) + class597.method3238(16711680, class597.method3238(65280, var176) * var175 + class597.method3238(var173, 65280) * var174) >> 8;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var13 += var18;
                            var20 += var21;
                            var12 = var152;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1418;
        class639 var8 = (class639) this.method846(Thread.currentThread());
        class670 var9 = var8.field8892;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 <= -1 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (~var13 < ~var12) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (~var15 <= ~var17) {
                var15 = -var15;
            } else {
                var17 = -var17;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method3668();
            int var23 = arg5 * var15 - -1 >> 17;
            int var24 = arg1 - var9.method3682();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = var16 + var22 + -var20;
            int var28 = var19 + var22 - -var16;
            int var29 = var21 + var24;
            int var30 = -var23 + var24;
            int var31 = var18 + var24 + -var23;
            int var32 = var18 + var24 + var21;
            if (arg6 != 0) {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field9305 = 255 - (arg4 >>> 24);
            } else {
                var9.field9305 = 0;
            }
            var9.field9308 = var25 < 0 || ~var9.field9306 > ~var25 || var26 < 0 || ~var26 < ~var9.field9306 || ~var27 > -1 || ~var9.field9306 > ~var27;
            var9.method3671(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field9308 = var25 < 0 || var25 > var9.field9306 || var27 < 0 || var27 > var9.field9306 || ~var28 > -1 || ~var28 < ~var9.field9306;
            var9.method3671(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method367(Canvas arg0) {
        ++field1425;
        class298 var2 = (class298) super.field2129.method39((long) arg0.hashCode(), 31750);
        if (var2 != null) {
            var2.method2438((byte) 119);
            class298 var3 = class577.method3165(false, arg0);
            super.field2129.method38(var3, -97, (long) arg0.hashCode());
            if (super.field2131 == arg0 && super.field2148 == null) {
                super.field2139 = var3.field3895;
                super.field2169 = var3.field3894;
                super.field2167 = var3.field3899;
                super.field2132 = var3;
                if (super.field2167 != this.field1419 || ~super.field2169 != ~this.field1430) {
                    this.field1419 = super.field2167;
                    this.field1430 = super.field2169;
                    this.field1432 = new int[this.field1430 * this.field1419];
                }
                this.method1172();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lfca;IIII)Lba;")
    public final class107 method410(class645 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1440;
        return new class55(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(IIIIIII)V")
    private final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1421;
        int var8 = arg4 << 8;
        if (~arg5 > -1) {
            arg5 = -arg5;
        }
        int var9 = arg2 - arg5;
        if (var9 < super.field2136) {
            var9 = super.field2136;
        }
        int var10 = arg5 + 1 + arg2;
        if (~var10 < ~super.field2140) {
            var10 = super.field2140;
        }
        int var11 = var9;
        int var12 = arg5 * arg5;
        int var13 = 0;
        int var14 = arg2 - var9;
        int var15 = var14 * var14;
        if (var10 < arg2) {
            arg2 = var10;
        }
        int var16 = -var14 + var15;
        if (arg1 <= 94) {
            field1435 = 6;
        }
        int var17 = arg3 >>> 24;
        if (arg6 == 0 || ~arg6 == -2 && var17 == 255) {
            while (arg2 > var11) {
                while (var16 <= var12 || var12 >= var15) {
                    var15 += var13 + var13;
                    var16 += var13++ - -var13;
                }
                int var67 = arg0 + 1 - var13;
                if (~var67 > ~super.field2144) {
                    var67 = super.field2144;
                }
                int var68 = arg0 + var13;
                if (super.field2157 < var68) {
                    var68 = super.field2157;
                }
                int var69 = super.field2167 * var11 + var67;
                ++var11;
                for (int var70 = var67; ~var70 > ~var68; ++var70) {
                    if (this.field1432[var69] > var8) {
                        super.field2139[var69] = arg3;
                    }
                    ++var69;
                }
                var15 -= var14-- - -var14;
                var16 -= var14 + var14;
            }
            int var58 = arg5;
            int var59 = -arg2 + var11;
            int var60 = var59 * var59 - -var12;
            int var61 = var60 - arg5;
            int var62 = var60 - var59;
            while (~var11 > ~var10) {
                while (var12 < var62 && var12 < var61) {
                    var62 -= var58-- + var58;
                    var61 -= var58 + var58;
                }
                int var63 = arg0 - var58;
                if (super.field2144 > var63) {
                    var63 = super.field2144;
                }
                int var64 = arg0 - -var58;
                if (var64 > super.field2157 + -1) {
                    var64 = super.field2157 + -1;
                }
                int var65 = super.field2167 * var11 + var63;
                var62 += var59 + var59;
                ++var11;
                for (int var66 = var63; ~var64 <= ~var66; ++var66) {
                    if (~var8 > ~this.field1432[var65]) {
                        super.field2139[var65] = arg3;
                    }
                    ++var65;
                }
                var61 += var59++ + var59;
            }
        } else if (arg6 == 1) {
            int var18 = (var17 << 24) + (16711935 & (16711935 & arg3) * var17 >> 8) + (65280 & (65280 & arg3) * var17 >> 8);
            int var19 = -var17 + 256;
            while (arg2 > var11) {
                while (~var12 <= ~var16 || var15 <= var12) {
                    var15 += var13 - -var13;
                    var16 += var13++ - -var13;
                }
                int var31 = arg0 - var13 + 1;
                if (~var31 > ~super.field2144) {
                    var31 = super.field2144;
                }
                int var32 = arg0 + var13;
                if (~super.field2157 > ~var32) {
                    var32 = super.field2157;
                }
                int var33 = super.field2167 * var11 + var31;
                ++var11;
                var15 -= var14-- - -var14;
                for (int var34 = var31; var32 > var34; ++var34) {
                    if (~this.field1432[var33] < ~var8) {
                        int var35 = super.field2139[var33];
                        int var36 = ((16711723 & (65280 & var35) * var19) >> 8) + ((var35 & 16711935) * var19 >> 8 & 16711935);
                        super.field2139[var33] = var18 + var36;
                    }
                    ++var33;
                }
                var16 -= var14 + var14;
            }
            int var20 = arg5;
            int var21 = -var14;
            int var22 = var21 * var21 + var12;
            int var23 = -arg5 + var22;
            int var24 = var22 - var21;
            while (var11 < var10) {
                while (~var12 > ~var24 && var23 > var12) {
                    var24 -= var20-- + var20;
                    var23 -= var20 + var20;
                }
                int var25 = -var20 + arg0;
                if (~var25 > ~super.field2144) {
                    var25 = super.field2144;
                }
                int var26 = arg0 + var20;
                if (super.field2157 - 1 < var26) {
                    var26 = super.field2157 + -1;
                }
                int var27 = super.field2167 * var11 + var25;
                for (int var28 = var25; var28 <= var26; ++var28) {
                    if (~var8 > ~this.field1432[var27]) {
                        int var29 = super.field2139[var27];
                        int var30 = ((16711844 & (65280 & var29) * var19) >> 8) + (16711935 & (16711935 & var29) * var19 >> 8);
                        super.field2139[var27] = var18 + var30;
                    }
                    ++var27;
                }
                ++var11;
                var24 += var21 + var21;
                var23 += var21++ + var21;
            }
        } else if (arg6 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (~arg2 < ~var11) {
                while (var16 <= var12 || ~var12 <= ~var15) {
                    var15 += var13 + var13;
                    var16 += var13++ - -var13;
                }
                int var50 = -var13 + arg0 + 1;
                if (var50 < super.field2144) {
                    var50 = super.field2144;
                }
                int var51 = arg0 - -var13;
                if (super.field2157 < var51) {
                    var51 = super.field2157;
                }
                int var52 = super.field2167 * var11 + var50;
                var15 -= var14-- - -var14;
                ++var11;
                for (int var53 = var50; ~var53 > ~var51; ++var53) {
                    if (~this.field1432[var52] < ~var8) {
                        int var54 = super.field2139[var52];
                        int var55 = arg3 + var54;
                        int var56 = (arg3 & 16711935) + (16711935 & var54);
                        int var57 = (65536 & var55 - var56) + (16777472 & var56);
                        super.field2139[var52] = class131.method954(-var57 + var55, var57 - (var57 >>> 8));
                    }
                    ++var52;
                }
                var16 -= var14 + var14;
            }
            int var37 = arg5;
            int var38 = -var14;
            int var39 = var38 * var38 + var12;
            int var40 = var39 - arg5;
            int var41 = var39 - var38;
            while (var11 < var10) {
                while (~var41 < ~var12 && ~var12 > ~var40) {
                    var41 -= var37-- - -var37;
                    var40 -= var37 + var37;
                }
                int var42 = -var37 + arg0;
                if (var42 < super.field2144) {
                    var42 = super.field2144;
                }
                int var43 = arg0 + var37;
                if (super.field2157 + -1 < var43) {
                    var43 = super.field2157 + -1;
                }
                int var44 = super.field2167 * var11 + var42;
                var41 += var38 + var38;
                for (int var45 = var42; ~var43 <= ~var45; ++var45) {
                    if (~this.field1432[var44] < ~var8) {
                        int var46 = super.field2139[var44];
                        int var47 = arg3 + var46;
                        int var48 = (arg3 & 16711935) - -(16711935 & var46);
                        int var49 = (65536 & -var48 + var47) + (var48 & 16777472);
                        super.field2139[var44] = class131.method954(var47 - var49, -(var49 >>> 8) + var49);
                    }
                    ++var44;
                }
                ++var11;
                var40 += var38++ - -var38;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "([Lba;Lq;[Lht;I)V")
    public final void method366(class107[] arg0, class151 arg1, class108[] arg2, int arg3) {
        ++field1422;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method827(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class110(Canvas arg0, class702 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "()Z")
    public final boolean method340() {
        ++field1446;
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method851(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
