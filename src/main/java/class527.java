import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class527 extends class633 {

    @OriginalMember(owner = "client!kv", name = "Rb", descriptor = "Z")
    public boolean field7299 = true;

    @OriginalMember(owner = "client!kv", name = "xb", descriptor = "Lej;")
    public static class229 field7279 = new class229("", 16);

    @OriginalMember(owner = "client!kv", name = "Ub", descriptor = "[I")
    public static int[] field7302 = new int[64];

    @OriginalMember(owner = "client!kv", name = "sb", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!kv", name = "tb", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!kv", name = "ub", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!kv", name = "vb", descriptor = "I")
    private int field7277;

    @OriginalMember(owner = "client!kv", name = "wb", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!kv", name = "yb", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!kv", name = "zb", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!kv", name = "Ab", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!kv", name = "Bb", descriptor = "I")
    private int field7283;

    @OriginalMember(owner = "client!kv", name = "Cb", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!kv", name = "Db", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!kv", name = "Fb", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!kv", name = "Gb", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!kv", name = "Hb", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!kv", name = "Ib", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!kv", name = "Jb", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!kv", name = "Kb", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!kv", name = "Lb", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!kv", name = "Mb", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!kv", name = "Nb", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!kv", name = "Ob", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!kv", name = "Sb", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!kv", name = "Tb", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!kv", name = "Pb", descriptor = "Lsba;")
    public static class151 field7297;

    @OriginalMember(owner = "client!kv", name = "Eb", descriptor = "[I")
    public int[] field7286;

    @OriginalMember(owner = "client!kv", name = "Qb", descriptor = "[I")
    public static int[] field7298;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)V")
    public final void method1793(int arg0) {
        super.field8597 = arg0;
        ++field7300;
        super.field8608 = new class388[super.field8597];
        for (int var2 = 0; ~var2 > ~super.field8597; ++var2) {
            super.field8608[var2] = new class388(this);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lrf;IIII)Lba;")
    public final class629 method1784(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7282;
        return new class444(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class527(Canvas arg0, class479 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1790(Canvas arg0) {
        ++field7294;
        class7 var2 = (class7) super.field8587.method2506(118, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method175(30604);
            class7 var3 = class624.method3410(arg0, true);
            super.field8587.method2504((long) arg0.hashCode(), -19, var3);
            if (super.field8589 == arg0 && super.field8627 == null) {
                super.field8588 = var3;
                super.field8604 = var3.field65;
                super.field8599 = var3.field64;
                super.field8633 = var3.field66;
                if (~super.field8633 != ~this.field7283 || ~super.field8604 != ~this.field7277) {
                    this.field7283 = super.field8633;
                    this.field7277 = super.field8604;
                    this.field7286 = new int[this.field7283 * this.field7277];
                }
                this.method3448();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7296;
        class388 var11 = (class388) this.method1789(Thread.currentThread());
        class406 var12 = var11.field5600;
        var12.field5725 = ~arg0 > -1 || var12.field5735 < arg0 || ~arg2 > -1 || ~arg2 < ~var12.field5735 || ~arg4 > -1 || var12.field5735 < arg4;
        var12.field5730 = false;
        int var13 = arg1 - super.field8622;
        int var14 = arg5 - super.field8622;
        int var15 = arg2 - super.field8594;
        int var16 = arg0 - super.field8594;
        int var17 = arg3 - super.field8622;
        int var18 = arg4 - super.field8594;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || ~var19 != -256)) {
            if (arg9 == 1) {
                var12.field5723 = false;
                var12.field5727 = -var19 + 255;
                var12.method2382(var13, var17, var14, var16, var15, var18, 100, 100, 100, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field5727 = 128;
                var12.field5723 = true;
                var12.method2382(var13, var17, var14, var16, var15, var18, 100, 100, 100, arg6, arg7, arg8);
            }
        } else {
            var12.field5727 = 0;
            var12.field5723 = false;
            var12.method2382(var13, var17, var14, var16, var15, var18, 100, 100, 100, arg6, arg7, arg8);
        }
        var12.field5730 = true;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
    public final void method1794(int arg0) {
        super.field8608[arg0].method2275((Runnable) null, true);
        ++field7292;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
    public final void method821() {
        ++field7301;
        if (super.field8620 == 0 && super.field8633 == super.field8596 && ~super.field8612 == -1 && ~super.field8624 == ~super.field8604) {
            int var1 = this.field7286.length;
            int var2 = -var1 + var1 & 7;
            int var3 = 0;
            while (~var3 > ~var2) {
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
                this.field7286[var3++] = Integer.MAX_VALUE;
            }
            while (var1 > var3) {
                this.field7286[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = -super.field8620 + super.field8596;
            int var5 = -super.field8612 + super.field8624;
            int var6 = -var4 + super.field8633;
            int var7 = super.field8633 * super.field8612 + super.field8620;
            int var8 = var4 >> 3;
            int var9 = 7 & var4;
            int var10 = var7 + -1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (~var8 < -1) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (~var12 < -1);
                }
                if (~var9 < -1) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field7286[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (~var13 < -1);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([Lba;Lq;[Lqn;I)V")
    public final void method1799(class629[] arg0, class111 arg1, class455[] arg2, int arg3) {
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method665(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field7276;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1786(Canvas arg0) {
        if (arg0 != null) {
            class7 var2 = (class7) super.field8587.method2506(111, (long) arg0.hashCode());
            if (var2 != null) {
                super.field8589 = arg0;
                super.field8588 = var2;
                if (super.field8627 == null) {
                    super.field8633 = var2.field66;
                    super.field8599 = var2.field64;
                    super.field8604 = var2.field65;
                    if (super.field8633 != this.field7283 || super.field8604 != this.field7277) {
                        this.field7277 = super.field8604;
                        this.field7283 = super.field8633;
                        this.field7286 = new int[this.field7283 * this.field7277];
                    }
                    this.method3448();
                }
            }
        } else {
            super.field8588 = null;
            super.field8589 = null;
            if (super.field8627 == null) {
                super.field8599 = null;
                super.field8633 = super.field8604 = 1;
                this.field7283 = this.field7277 = 1;
                this.method3448();
            }
        }
        ++field7275;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class176 method1787(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7295;
        return new class471(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2996(String arg0, byte arg1) {
        ++field7274;
        StringBuffer var2 = new StringBuffer();
        if (arg1 >= -89) {
            return null;
        } else {
            int var3 = arg0.length();
            for (int var4 = 0; ~var4 > ~var3; ++var4) {
                char var5 = arg0.charAt(var4);
                if (var5 == '%' && var4 - -2 < var3) {
                    char var6 = arg0.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (~var6 <= -49 && ~var6 >= -58) {
                        var8 = var6 + -48;
                    } else if (var6 >= 'a' && ~var6 >= -103) {
                        var8 = var6 + -87;
                    } else {
                        if (var6 < 'A' || ~var6 < -71) {
                            var2.append('%');
                            continue;
                        }
                        var8 = -55 - -var6;
                    }
                    char var9 = arg0.charAt(var4 - -2);
                    int var10 = var8 * 16;
                    int var11;
                    if (~var9 <= -49 && ~var9 >= -58) {
                        var11 = var9 + -48 + var10;
                    } else if (var9 >= 'a' && var9 <= 'f') {
                        var11 = var9 + '\n' - 97 + var10;
                    } else {
                        if (~var9 > -66 || ~var9 < -71) {
                            var2.append('%');
                            continue;
                        }
                        var11 = -55 - -var9 + var10;
                    }
                    if (~var11 != -1 && class431.method2485(false, (byte) var11)) {
                        var2.append(class679.method3748((byte) var11, -161));
                    }
                    var4 += 2;
                } else if (~var5 == -44) {
                    var2.append(' ');
                } else {
                    var2.append(var5);
                }
            }
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([Lba;Lob;Lq;[Lqn;I)V")
    public final void method1796(class629[] arg0, class309 arg1, class111 arg2, class455[] arg3, int arg4) {
        ++field7280;
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                ((class115) arg0[var6]).method685(arg2, arg3 != null ? arg3[var6] : null, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lpl;IIII)V")
    public final void method1788(class220 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7287;
        int var6 = arg0.field2864;
        int var8 = arg4 << 1;
        if (var6 != -1) {
            if (super.field8635 != var6) {
                class424 var9 = (class424) super.field8593.method3134((long) var6, -46);
                if (var9 == null) {
                    int[] var10 = this.method3455(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = !this.method3453(var6) ? 128 : 64;
                    var9 = this.method1894(var10, 0, var11, var11, var11);
                    super.field8593.method3130((long) var6, true, var9);
                }
                super.field8635 = var6;
                super.field8634 = var9;
            }
            ++var8;
            this.method2999(1, arg3, -arg4 + arg1, true, 0, (class10) super.field8634, var8, arg0.field2859, var8, -arg4 + arg2);
        } else {
            this.method2998(1, arg2, arg0.field2859, (byte) -121, arg3, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(Z)V")
    public final void method1798(boolean arg0) {
        ++field7293;
        this.field7299 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "(I)V")
    public static void method2997(int arg0) {
        field7279 = null;
        if (arg0 != 1) {
            method2996((String) null, (byte) -35);
        }
        field7298 = null;
        field7302 = null;
        field7297 = null;
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)V")
    public final void method1797(int arg0) {
        super.field8608[arg0].method2275(Thread.currentThread(), true);
        ++field7289;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBIII)V")
    private final void method2998(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg6 < 0) {
            arg6 = -arg6;
        }
        ++field7285;
        int var8 = arg4 << 8;
        int var9 = -arg6 + arg1;
        if (var9 < super.field8612) {
            var9 = super.field8612;
        }
        int var10 = arg6 + 1 + arg1;
        if (~var10 < ~super.field8624) {
            var10 = super.field8624;
        }
        int var11 = var9;
        int var12 = arg6 * arg6;
        int var13 = 0;
        int var14 = arg1 - var9;
        if (arg3 < -118) {
            int var15 = var14 * var14;
            int var16 = -var14 + var15;
            if (~var10 > ~arg1) {
                arg1 = var10;
            }
            int var17 = arg2 >>> 24;
            if (~arg0 == -1 || ~arg0 == -2 && ~var17 == -256) {
                while (var11 < arg1) {
                    while (var16 <= var12 || ~var15 >= ~var12) {
                        var15 += var13 + var13;
                        var16 += var13++ + var13;
                    }
                    int var67 = -var13 + arg5 + 1;
                    if (~var67 > ~super.field8620) {
                        var67 = super.field8620;
                    }
                    int var68 = arg5 + var13;
                    if (super.field8596 < var68) {
                        var68 = super.field8596;
                    }
                    int var69 = super.field8633 * var11 + var67;
                    ++var11;
                    for (int var70 = var67; ~var70 > ~var68; ++var70) {
                        if (this.field7286[var69] > var8) {
                            super.field8599[var69] = arg2;
                        }
                        ++var69;
                    }
                    var15 -= var14-- + var14;
                    var16 -= var14 + var14;
                }
                int var58 = arg6;
                int var59 = var11 - arg1;
                int var60 = var59 * var59 - -var12;
                int var61 = var60 - arg6;
                int var62 = var60 - var59;
                while (var11 < var10) {
                    while (~var62 < ~var12 && var61 > var12) {
                        var62 -= var58-- + var58;
                        var61 -= var58 + var58;
                    }
                    int var63 = arg5 - var58;
                    if (super.field8620 > var63) {
                        var63 = super.field8620;
                    }
                    int var64 = arg5 + var58;
                    if (~(super.field8596 + -1) > ~var64) {
                        var64 = super.field8596 + -1;
                    }
                    int var65 = var63 - -(super.field8633 * var11);
                    ++var11;
                    var62 += var59 + var59;
                    for (int var66 = var63; var66 <= var64; ++var66) {
                        if (this.field7286[var65] > var8) {
                            super.field8599[var65] = arg2;
                        }
                        ++var65;
                    }
                    var61 += var59++ + var59;
                }
            } else if (arg0 != 1) {
                if (arg0 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    while (~var11 > ~arg1) {
                        while (var12 >= var16 || ~var15 >= ~var12) {
                            var15 += var13 + var13;
                            var16 += var13++ + var13;
                        }
                        int var31 = -var13 + 1 + arg5;
                        if (~var31 > ~super.field8620) {
                            var31 = super.field8620;
                        }
                        int var32 = arg5 + var13;
                        if (~super.field8596 > ~var32) {
                            var32 = super.field8596;
                        }
                        int var33 = super.field8633 * var11 + var31;
                        for (int var34 = var31; var32 > var34; ++var34) {
                            if (~var8 > ~this.field7286[var33]) {
                                int var35 = super.field8599[var33];
                                int var36 = arg2 - -var35;
                                int var37 = (16711935 & arg2) + (16711935 & var35);
                                int var38 = (65536 & -var37 + var36) + (var37 & 16777472);
                                super.field8599[var33] = class288.method1722(-(var38 >>> 8) + var38, -var38 + var36);
                            }
                            ++var33;
                        }
                        var15 -= var14-- + var14;
                        ++var11;
                        var16 -= var14 - -var14;
                    }
                    int var18 = arg6;
                    int var19 = -var14;
                    int var20 = var19 * var19 - -var12;
                    int var21 = -arg6 + var20;
                    int var22 = var20 - var19;
                    while (var11 < var10) {
                        while (~var22 < ~var12 && var12 < var21) {
                            var22 -= var18-- - -var18;
                            var21 -= var18 - -var18;
                        }
                        int var23 = -var18 + arg5;
                        if (~var23 > ~super.field8620) {
                            var23 = super.field8620;
                        }
                        int var24 = arg5 + var18;
                        if (var24 > super.field8596 + -1) {
                            var24 = super.field8596 - 1;
                        }
                        int var25 = super.field8633 * var11 + var23;
                        ++var11;
                        var22 += var19 + var19;
                        for (int var26 = var23; var24 >= var26; ++var26) {
                            if (this.field7286[var25] > var8) {
                                int var27 = super.field8599[var25];
                                int var28 = arg2 + var27;
                                int var29 = (arg2 & 16711935) + (16711935 & var27);
                                int var30 = (65536 & -var29 + var28) + (16777472 & var29);
                                super.field8599[var25] = class288.method1722(-var30 + var28, var30 - (var30 >>> 8));
                            }
                            ++var25;
                        }
                        var21 += var19++ - -var19;
                    }
                }
            } else {
                int var39 = ((arg2 & 16711935) * var17 >> 8 & 16711935) + (var17 << 24) + (65280 & (65280 & arg2) * var17 >> 8);
                int var40 = 256 - var17;
                while (var11 < arg1) {
                    while (var12 >= var16 || var15 <= var12) {
                        var15 += var13 + var13;
                        var16 += var13++ + var13;
                    }
                    int var52 = arg5 - -1 + -var13;
                    if (~var52 > ~super.field8620) {
                        var52 = super.field8620;
                    }
                    int var53 = arg5 + var13;
                    if (~super.field8596 > ~var53) {
                        var53 = super.field8596;
                    }
                    int var54 = var52 - -(super.field8633 * var11);
                    for (int var55 = var52; var55 < var53; ++var55) {
                        if (this.field7286[var54] > var8) {
                            int var56 = super.field8599[var54];
                            int var57 = ((16711935 & var56) * var40 >> 8 & 16711935) - -((65280 & var56) * var40 >> 8 & 65280);
                            super.field8599[var54] = var39 + var57;
                        }
                        ++var54;
                    }
                    var15 -= var14-- - -var14;
                    ++var11;
                    var16 -= var14 + var14;
                }
                int var41 = -var14;
                int var42 = arg6;
                int var43 = var41 * var41 + var12;
                int var44 = var43 - arg6;
                int var45 = var43 - var41;
                while (var10 > var11) {
                    while (var45 > var12 && var12 < var44) {
                        var45 -= var42-- + var42;
                        var44 -= var42 + var42;
                    }
                    int var46 = -var42 + arg5;
                    if (~var46 > ~super.field8620) {
                        var46 = super.field8620;
                    }
                    int var47 = arg5 - -var42;
                    if (var47 > super.field8596 + -1) {
                        var47 = super.field8596 + -1;
                    }
                    int var48 = super.field8633 * var11 + var46;
                    for (int var49 = var46; ~var49 >= ~var47; ++var49) {
                        if (var8 < this.field7286[var48]) {
                            int var50 = super.field8599[var48];
                            int var51 = ((var50 & 16711935) * var40 >> 8 & 16711935) - -((16711861 & (65280 & var50) * var40) >> 8);
                            super.field8599[var48] = var39 + var51;
                        }
                        ++var48;
                    }
                    var45 += var41 + var41;
                    ++var11;
                    var44 += var41++ - -var41;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)V")
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7281;
        class388 var8 = (class388) this.method1789(Thread.currentThread());
        class406 var9 = var8.field5600;
        int var10 = arg2 - arg0;
        int var11 = -arg1 + arg3;
        int var12 = var10 < 0 ? -var10 : var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var13 > var12) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var16 < ~var15) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method2398();
            int var24 = arg1 - var9.method2393();
            int var25 = var23 - -var19;
            int var26 = -var20 + var23;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 - -var19;
            int var29 = var24 - -var21;
            int var30 = -var22 + var24;
            int var31 = var24 - -var18 + -var22;
            int var32 = var18 + var21 + var24;
            if (~arg6 == -1) {
                var9.field5727 = 0;
            } else {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field5727 = -(arg4 >>> 24) + 255;
            }
            var9.field5725 = ~var25 > -1 || ~var9.field5735 > ~var25 || ~var26 > -1 || ~var26 < ~var9.field5735 || ~var27 > -1 || ~var9.field5735 > ~var27;
            var9.method2396(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field5725 = ~var25 > -1 || ~var9.field5735 > ~var25 || var27 < 0 || ~var27 < ~var9.field5735 || ~var28 > -1 || ~var9.field5735 > ~var28;
            var9.method2396(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7288;
        if (arg3 != 0 && arg4 != 0) {
            if (~arg6 != -65536 && !super.field9731.method1728(-103, arg6).field7857) {
                if (~super.field8635 != ~arg6) {
                    class424 var11 = (class424) super.field8593.method3134((long) arg6, -68);
                    if (var11 == null) {
                        int[] var12 = this.method3455(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = !this.method3453(arg6) ? 128 : 64;
                        var11 = this.method1894(var12, 0, var13, var13, var13);
                        super.field8593.method3130((long) arg6, true, var11);
                    }
                    super.field8635 = arg6;
                    super.field8634 = var11;
                }
                this.method2999(arg9, arg2, -arg3 + arg0, true, arg8, (class10) super.field8634, arg3 << 1, arg7, arg4 << 1, -arg4 + arg1);
            } else {
                this.method2998(arg9, arg1, arg7, (byte) -126, arg2, arg0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "()V")
    public final void method1785() {
        super.field8622 = -super.field8632 + super.field8612;
        super.field8619 = -super.field8632 + super.field8624;
        ++field7291;
        super.field8594 = -super.field8606 + super.field8620;
        super.field8613 = super.field8596 - super.field8606;
        for (int var1 = 0; ~super.field8597 < ~var1; ++var1) {
            class406 var5 = ((class388) super.field8608[var1]).field5600;
            var5.field5722 = -super.field8612 + super.field8624;
            var5.field5735 = -super.field8620 + super.field8596;
            var5.field5729 = -super.field8612 + super.field8632;
            var5.field5732 = super.field8606 - super.field8620;
        }
        int var2 = super.field8633 * super.field8612 + super.field8620;
        for (int var3 = super.field8612; ~var3 > ~super.field8624; ++var3) {
            for (int var4 = 0; var4 < super.field8597; ++var4) {
                ((class388) super.field8608[var4]).field5600.field5728[-super.field8612 + var3] = var2;
            }
            var2 += super.field8633;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lhi;")
    public final class372 method1789(Runnable arg0) {
        ++field7290;
        for (int var2 = 0; super.field8597 > var2; ++var2) {
            if (super.field8608[var2].field5331 == arg0) {
                return super.field8608[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIZILbaa;IIII)V")
    private final void method2999(int arg0, int arg1, int arg2, boolean arg3, int arg4, class10 arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7278;
        if (~arg6 < -1 && ~arg8 < -1) {
            int var11 = arg1 << 8;
            int var12 = 0;
            int var13 = 0;
            int var14 = arg5.field2189 + arg5.field2178 + arg5.field2183;
            int var15 = arg5.field2194 + arg5.field2191 + arg5.field2172;
            int var16 = (var14 << 16) / arg6;
            int var17 = (var15 << 16) / arg8;
            if (~arg5.field2189 < -1) {
                int var18 = ((arg5.field2189 << 16) + var16 + -1) / var16;
                var12 += var16 * var18 + -(arg5.field2189 << 16);
                arg2 += var18;
            }
            if (~arg5.field2194 < -1) {
                int var19 = ((arg5.field2194 << 16) + var17 + -1) / var17;
                var13 += var17 * var19 + -(arg5.field2194 << 16);
                arg9 += var19;
            }
            if (var14 > arg5.field2178) {
                arg6 = ((arg5.field2178 << 16) + -var12 + var16 - 1) / var16;
            }
            if (~arg5.field2172 > ~var15) {
                arg8 = ((arg5.field2172 << 16) + -var13 + var17 - 1) / var17;
            }
            int var20 = super.field8633 * arg9 + arg2;
            if (~(arg8 + arg9) < ~super.field8624) {
                arg8 -= arg9 - -arg8 + -super.field8624;
            }
            int var21 = -arg6 + super.field8633;
            if (~super.field8612 < ~arg9) {
                int var22 = -arg9 + super.field8612;
                var20 += super.field8633 * var22;
                var13 += var17 * var22;
                arg8 -= var22;
            }
            if (arg2 + arg6 > super.field8596) {
                int var23 = arg2 - (-arg6 + super.field8596);
                var21 += var23;
                arg6 -= var23;
            }
            if (super.field8620 > arg2) {
                int var24 = -arg2 + super.field8620;
                arg6 -= var24;
                var21 += var24;
                var20 += var24;
                var12 += var16 * var24;
            }
            if (!arg3) {
                this.method1800(-78, -96, 91, 120, 115, -103, -72);
            }
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        throw new IllegalArgumentException();
                    } else if (arg4 != 1) {
                        if (~arg4 == -1) {
                            int var25 = var12;
                            int var26 = (arg7 & 16711680) >> 16;
                            int var27 = (arg7 & 65280) >> 8;
                            int var28 = arg7 & 255;
                            for (int var29 = -arg8; ~var29 > -1; ++var29) {
                                int var30 = (var13 >> 16) * arg5.field2178;
                                var13 += var17;
                                for (int var31 = -arg6; var31 < 0; ++var31) {
                                    if (var11 < this.field7286[var20]) {
                                        int var32 = arg5.field107[(var12 >> 16) + var30];
                                        if (~var32 != -1) {
                                            int var33 = (16711680 & var32) * var26 & -16777216;
                                            int var34 = (65280 & var32) * var27 & 16711680;
                                            int var35 = 65280 & (var32 & 255) * var28;
                                            int var36 = (var35 | var33 | var34) >>> 8;
                                            int var37 = super.field8599[var20];
                                            int var38 = var36 + var37;
                                            int var39 = (16711935 & var36) + (16711935 & var37);
                                            int var40 = (65536 & -var39 + var38) + (var39 & 16777472);
                                            super.field8599[var20] = class288.method1722(-var40 + var38, -(var40 >>> 8) + var40);
                                        }
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var12 = var25;
                                var20 += var21;
                            }
                        } else if (~arg4 == -4) {
                            int var41 = var12;
                            for (int var42 = -arg8; ~var42 > -1; ++var42) {
                                int var43 = (var13 >> 16) * arg5.field2178;
                                for (int var44 = -arg6; ~var44 > -1; ++var44) {
                                    if (~var11 > ~this.field7286[var20]) {
                                        int var45 = arg5.field107[(var12 >> 16) + var43];
                                        int var46 = var45 - -arg7;
                                        int var47 = (16711935 & arg7) + (var45 & 16711935);
                                        int var48 = (65536 & -var47 + var46) + (16777472 & var47);
                                        int var49 = -(var48 >>> 8) + var48 | -var48 + var46;
                                        int var50 = super.field8599[var20];
                                        int var51 = var49 + var50;
                                        int var52 = (16711935 & var49) + (var50 & 16711935);
                                        int var53 = (var52 & 16777472) - -(-var52 + var51 & 65536);
                                        super.field8599[var20] = class288.method1722(-(var53 >>> 8) + var53, -var53 + var51);
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var13 += var17;
                                var12 = var41;
                                var20 += var21;
                            }
                        } else if (~arg4 != -3) {
                            throw new IllegalArgumentException();
                        } else {
                            int var54 = arg7 >>> 24;
                            int var55 = 256 - var54;
                            int var56 = (16711935 & arg7) * var55 & -16711936;
                            int var57 = 16711680 & (arg7 & 65280) * var55;
                            int var58 = (var56 | var57) >>> 8;
                            int var59 = var12;
                            for (int var60 = -arg8; ~var60 > -1; ++var60) {
                                int var61 = (var13 >> 16) * arg5.field2178;
                                var13 += var17;
                                for (int var62 = -arg6; var62 < 0; ++var62) {
                                    if (this.field7286[var20] > var11) {
                                        int var63 = arg5.field107[(var12 >> 16) + var61];
                                        if (~var63 != -1) {
                                            int var64 = 16711680 & (var63 & 65280) * var54;
                                            int var65 = (var63 & 16711935) * var54 & -16711936;
                                            int var66 = ((var64 | var65) >>> 8) - -var58;
                                            int var67 = super.field8599[var20];
                                            int var68 = var66 + var67;
                                            int var69 = (16711935 & var66) + (var67 & 16711935);
                                            int var70 = (16777472 & var69) - -(65536 & var68 - var69);
                                            super.field8599[var20] = class288.method1722(-var70 + var68, -(var70 >>> 8) + var70);
                                        }
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var12 = var59;
                                var20 += var21;
                            }
                        }
                    } else {
                        int var71 = var12;
                        for (int var72 = -arg8; ~var72 > -1; ++var72) {
                            int var73 = (var13 >> 16) * arg5.field2178;
                            var13 += var17;
                            for (int var74 = -arg6; var74 < 0; ++var74) {
                                if (var11 < this.field7286[var20]) {
                                    int var75 = arg5.field107[(var12 >> 16) + var73];
                                    if (var75 != 0) {
                                        int var76 = super.field8599[var20];
                                        int var77 = var75 + var76;
                                        int var78 = (var75 & 16711935) - -(16711935 & var76);
                                        int var79 = (65536 & -var78 + var77) + (var78 & 16777472);
                                        super.field8599[var20] = class288.method1722(var79 - (var79 >>> 8), -var79 + var77);
                                    }
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var20 += var21;
                            var12 = var71;
                        }
                    }
                } else if (arg4 != 1) {
                    if (~arg4 != -1) {
                        if (~arg4 == -4) {
                            int var80 = var12;
                            for (int var81 = -arg8; ~var81 > -1; ++var81) {
                                int var82 = (var13 >> 16) * arg5.field2178;
                                for (int var83 = -arg6; var83 < 0; ++var83) {
                                    if (var11 < this.field7286[var20]) {
                                        int var84 = arg5.field107[(var12 >> 16) + var82];
                                        int var85 = arg7 + var84;
                                        int var86 = (16711935 & var84) - -(arg7 & 16711935);
                                        int var87 = (-var86 + var85 & 65536) + (16777472 & var86);
                                        int var88 = -var87 + var85 | -(var87 >>> 8) + var87;
                                        int var89 = (arg7 >>> 24) * (var88 >>> 24) >> 8;
                                        int var90 = -var89 + 256;
                                        if (~var89 != -256) {
                                            int var92 = super.field8599[var20];
                                            var88 = (16711680 & (var88 & 65280) * var89 - -((var92 & 65280) * var90)) + ((var88 & 16711935) * var89 + (var92 & 16711935) * var90 & -16711936) >> 8;
                                        }
                                        super.field8599[var20] = var88;
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var13 += var17;
                                var12 = var80;
                                var20 += var21;
                            }
                        } else if (arg4 != 2) {
                            throw new IllegalArgumentException();
                        } else {
                            int var93 = arg7 >>> 24;
                            int var94 = -var93 + 256;
                            int var95 = -16711936 & (16711935 & arg7) * var94;
                            int var96 = 16711680 & (65280 & arg7) * var94;
                            int var97 = (var96 | var95) >>> 8;
                            int var98 = var12;
                            for (int var99 = -arg8; ~var99 > -1; ++var99) {
                                int var100 = (var13 >> 16) * arg5.field2178;
                                for (int var101 = -arg6; ~var101 > -1; ++var101) {
                                    if (var11 < this.field7286[var20]) {
                                        int var102 = arg5.field107[(var12 >> 16) + var100];
                                        int var103 = var102 >>> 24;
                                        int var104 = -16711936 & (var102 & 16711935) * var93;
                                        int var105 = 256 - var103;
                                        int var106 = (var102 & 65280) * var93 & 16711680;
                                        int var107 = ((var104 | var106) >>> 8) + var97;
                                        int var108 = super.field8599[var20];
                                        super.field8599[var20] = class230.method1424(class230.method1424(var107, 16711935) * var103 - -(var105 * class230.method1424(16711935, var108)), -16711936) - -class230.method1424(16711680, class230.method1424(65280, var107) * var103 + var105 * class230.method1424(65280, var108)) >> 8;
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var13 += var17;
                                var12 = var98;
                                var20 += var21;
                            }
                        }
                    } else {
                        int var109 = var12;
                        if ((16777215 & arg7) != 16777215) {
                            int var110 = (16711680 & arg7) >> 16;
                            int var111 = 255 & arg7 >> 8;
                            int var112 = arg7 & 255;
                            for (int var113 = -arg8; var113 < 0; ++var113) {
                                int var114 = (var13 >> 16) * arg5.field2178;
                                var13 += var17;
                                for (int var115 = -arg6; ~var115 > -1; ++var115) {
                                    if (~var11 > ~this.field7286[var20]) {
                                        int var116 = arg5.field107[(var12 >> 16) + var114];
                                        int var117 = (arg7 >>> 24) * (var116 >>> 24) >> 8;
                                        int var118 = -var117 + 256;
                                        if (var117 == 255) {
                                            int var119 = (16711680 & var116) * var110 & -16777216;
                                            int var120 = 16711680 & (var116 & 65280) * var111;
                                            int var121 = (var116 & 255) * var112 & 65280;
                                            super.field8599[var20] = class288.method1722(var121, class288.method1722(var120, var119)) >>> 8;
                                        } else {
                                            int var122 = -16777216 & (16711680 & var116) * var110;
                                            int var123 = (var116 & 65280) * var111 & 16711680;
                                            int var124 = (var116 & 255) * var112 & 65280;
                                            int var125 = (var124 | var123 | var122) >>> 8;
                                            int var126 = super.field8599[var20];
                                            super.field8599[var20] = class230.method1424(class230.method1424(var125, 65280) * var117 - -(var118 * class230.method1424(var126, 65280)), 16711680) + class230.method1424(-16711936, var118 * class230.method1424(var126, 16711935) + var117 * class230.method1424(var125, 16711935)) >> 8;
                                        }
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var20 += var21;
                                var12 = var109;
                            }
                        } else {
                            for (int var127 = -arg8; var127 < 0; ++var127) {
                                int var128 = (var13 >> 16) * arg5.field2178;
                                var13 += var17;
                                for (int var129 = -arg6; var129 < 0; ++var129) {
                                    if (~this.field7286[var20] < ~var11) {
                                        int var130 = arg5.field107[(var12 >> 16) + var128];
                                        int var131 = (arg7 >>> 24) * (var130 >>> 24) >> 8;
                                        int var132 = -var131 + 256;
                                        int var133 = super.field8599[var20];
                                        super.field8599[var20] = class230.method1424(class230.method1424(65280, var130) * var131 - -(class230.method1424(65280, var133) * var132), 16711680) + class230.method1424(var132 * class230.method1424(var133, 16711935) + var131 * class230.method1424(16711935, var130), -16711936) >> 8;
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var20 += var21;
                                var12 = var109;
                            }
                        }
                    }
                } else {
                    int var134 = var12;
                    for (int var135 = -arg8; var135 < 0; ++var135) {
                        int var136 = (var13 >> 16) * arg5.field2178;
                        var13 += var17;
                        for (int var137 = -arg6; var137 < 0; ++var137) {
                            if (~var11 > ~this.field7286[var20]) {
                                int var138 = arg5.field107[(var12 >> 16) + var136];
                                int var139 = var138 >>> 24;
                                int var140 = -var139 + 256;
                                int var141 = super.field8599[var20];
                                super.field8599[var20] = (class230.method1424(var140 * class230.method1424(16711935, var141) + var139 * class230.method1424(16711935, var138), -16711936) >> 8) + class230.method1424(-16711936, var139 * (class230.method1424(var138, -16711936) >>> 8) - -(var140 * class230.method1424(var141 >>> 8, 16711935)));
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var12 = var134;
                        var20 += var21;
                    }
                }
            } else if (arg4 == 1) {
                int var142 = var12;
                for (int var143 = -arg8; ~var143 > -1; ++var143) {
                    int var144 = (var13 >> 16) * arg5.field2178;
                    var13 += var17;
                    for (int var145 = -arg6; var145 < 0; ++var145) {
                        if (~this.field7286[var20] < ~var11) {
                            super.field8599[var20] = arg5.field107[(var12 >> 16) + var144];
                        }
                        var12 += var16;
                        ++var20;
                    }
                    var20 += var21;
                    var12 = var142;
                }
            } else if (arg4 != 0) {
                if (arg4 != 3) {
                    if (~arg4 != -3) {
                        throw new IllegalArgumentException();
                    } else {
                        int var146 = arg7 >>> 24;
                        int var147 = -var146 + 256;
                        int var148 = -16711936 & (arg7 & 16711935) * var147;
                        int var149 = (65280 & arg7) * var147 & 16711680;
                        int var150 = (var148 | var149) >>> 8;
                        int var151 = var12;
                        for (int var152 = -arg8; var152 < 0; ++var152) {
                            int var153 = (var13 >> 16) * arg5.field2178;
                            var13 += var17;
                            for (int var154 = -arg6; var154 < 0; ++var154) {
                                if (~var11 > ~this.field7286[var20]) {
                                    int var155 = arg5.field107[(var12 >> 16) + var153];
                                    int var156 = -16711936 & (var155 & 16711935) * var146;
                                    int var157 = 16711680 & (65280 & var155) * var146;
                                    super.field8599[var20] = (class288.method1722(var157, var156) >>> 8) + var150;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var20 += var21;
                            var12 = var151;
                        }
                    }
                } else {
                    int var158 = var12;
                    for (int var159 = -arg8; ~var159 > -1; ++var159) {
                        int var160 = (var13 >> 16) * arg5.field2178;
                        for (int var161 = -arg6; var161 < 0; ++var161) {
                            if (~var11 > ~this.field7286[var20]) {
                                int var162 = arg5.field107[(var12 >> 16) + var160];
                                int var163 = arg7 + var162;
                                int var164 = (16711935 & arg7) + (var162 & 16711935);
                                int var165 = (-var164 + var163 & 65536) + (var164 & 16777472);
                                super.field8599[var20] = class288.method1722(-var165 + var163, var165 - (var165 >>> 8));
                            }
                            ++var20;
                            var12 += var16;
                        }
                        var13 += var17;
                        var12 = var158;
                        var20 += var21;
                    }
                }
            } else {
                int var166 = 255 & arg7 >> 16;
                int var167 = (arg7 & 65280) >> 8;
                int var168 = 255 & arg7;
                int var169 = var12;
                for (int var170 = -arg8; var170 < 0; ++var170) {
                    int var171 = (var13 >> 16) * arg5.field2178;
                    var13 += var17;
                    for (int var172 = -arg6; ~var172 > -1; ++var172) {
                        if (var11 < this.field7286[var20]) {
                            int var173 = arg5.field107[(var12 >> 16) + var171];
                            int var174 = (16711680 & var173) * var166 & -16777216;
                            int var175 = (65280 & var173) * var167 & 16711680;
                            int var176 = 65280 & (var173 & 255) * var168;
                            super.field8599[var20] = class288.method1722(class288.method1722(var174, var175), var176) >>> 8;
                        }
                        ++var20;
                        var12 += var16;
                    }
                    var20 += var21;
                    var12 = var169;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "()Z")
    public final boolean method1791() {
        ++field7284;
        return true;
    }
}
