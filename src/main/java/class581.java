import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class581 extends class107 {

    @OriginalMember(owner = "client!sp", name = "Ob", descriptor = "Z")
    public boolean field8117 = true;

    @OriginalMember(owner = "client!sp", name = "qb", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!sp", name = "rb", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!sp", name = "sb", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!sp", name = "tb", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!sp", name = "ub", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!sp", name = "vb", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!sp", name = "wb", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!sp", name = "xb", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!sp", name = "zb", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!sp", name = "Ab", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!sp", name = "Bb", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!sp", name = "Cb", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!sp", name = "Db", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!sp", name = "Eb", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!sp", name = "Fb", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!sp", name = "Hb", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!sp", name = "Ib", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!sp", name = "Jb", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!sp", name = "Kb", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!sp", name = "Mb", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!sp", name = "Nb", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!sp", name = "Pb", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!sp", name = "Qb", descriptor = "I")
    private int field8119;

    @OriginalMember(owner = "client!sp", name = "yb", descriptor = "Z")
    public static boolean field8101;

    @OriginalMember(owner = "client!sp", name = "Gb", descriptor = "[I")
    public int[] field8109;

    @OriginalMember(owner = "client!sp", name = "Lb", descriptor = "[Ld;")
    public static class136[] field8114;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8112;
        return new class437(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method381(Canvas arg0) {
        if (arg0 == null) {
            super.field1429 = null;
            super.field1433 = null;
            if (super.field1447 == null) {
                super.field1453 = super.field1444 = 1;
                super.field1471 = null;
                this.field8100 = this.field8119 = 1;
                this.method805();
            }
        } else {
            class246 var2 = (class246) super.field1428.method2061(-17305, (long) arg0.hashCode());
            if (var2 != null) {
                super.field1429 = arg0;
                super.field1433 = var2;
                if (super.field1447 == null) {
                    super.field1471 = var2.field3503;
                    super.field1444 = var2.field3502;
                    super.field1453 = var2.field3498;
                    if (this.field8100 != super.field1453 || this.field8119 != super.field1444) {
                        this.field8119 = super.field1444;
                        this.field8100 = super.field1453;
                        this.field8109 = new int[this.field8119 * this.field8100];
                    }
                    this.method805();
                }
            }
        }
        ++field8097;
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(Z)V")
    public static void method3254(boolean arg0) {
        field8114 = null;
        if (arg0) {
            method3254(false);
        }
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(Z)V")
    public final void method387(boolean arg0) {
        this.field8117 = arg0;
        ++field8102;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
    public final void method386(int arg0) {
        ++field8118;
        super.field1462 = arg0;
        super.field1456 = new class85[super.field1462];
        for (int var2 = 0; super.field1462 > var2; ++var2) {
            super.field1456[var2] = new class85(this);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class581(Canvas arg0, class489 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/Runnable;)Lvd;")
    public final class36 method392(Runnable arg0) {
        ++field8107;
        for (int var2 = 0; ~var2 > ~super.field1462; ++var2) {
            if (super.field1456[var2].field455 == arg0) {
                return super.field1456[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "()V")
    public final void method344() {
        ++field8094;
        if (super.field1440 == 0 && ~super.field1453 == ~super.field1446 && super.field1470 == 0 && super.field1450 == super.field1444) {
            int var1 = this.field8109.length;
            int var2 = 7 & -var1 + var1;
            int var3 = 0;
            while (~var3 > ~var2) {
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
                this.field8109[var3++] = Integer.MAX_VALUE;
            }
            while (~var1 < ~var3) {
                this.field8109[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = -super.field1440 + super.field1446;
            int var5 = -super.field1470 + super.field1450;
            int var6 = -var4 + super.field1453;
            int var7 = super.field1470 * super.field1453 + super.field1440;
            int var8 = var4 >> 3;
            int var9 = 7 & var4;
            int var10 = var7 + -1;
            for (int var11 = -var5; ~var11 > -1; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (~var9 < -1) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field8109[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (~var13 < -1);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8096;
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field9050.method588(-26679, arg6).field3821) {
                if (super.field1477 != arg6) {
                    class461 var11 = (class461) super.field1469.method1986((byte) -90, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method807(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method812(arg6) ? 64 : 128;
                        var11 = this.method452(var12, 0, var13, var13, var13);
                        super.field1469.method1985(var11, (long) arg6, (byte) -102);
                    }
                    super.field1476 = var11;
                    super.field1477 = arg6;
                }
                this.method3256(false, (class541) super.field1476, arg7, arg8, -arg3 + arg0, arg3 << 1, arg4 << 1, arg9, -arg4 + arg1, arg2);
            } else {
                this.method3255(true, arg2, arg1, arg3, arg9, arg0, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V")
    public final void method382(int arg0) {
        super.field1456[arg0].method172((byte) -103, Thread.currentThread());
        ++field8103;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method395(Canvas arg0) {
        ++field8116;
        class246 var2 = (class246) super.field1428.method2061(-17305, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2971(1);
            class246 var3 = class397.method2257(114, arg0);
            super.field1428.method2063((long) arg0.hashCode(), 1, var3);
            if (super.field1429 == arg0 && super.field1447 == null) {
                super.field1444 = var3.field3502;
                super.field1471 = var3.field3503;
                super.field1433 = var3;
                super.field1453 = var3.field3498;
                if (this.field8100 != super.field1453 || ~this.field8119 != ~super.field1444) {
                    this.field8100 = super.field1453;
                    this.field8119 = super.field1444;
                    this.field8109 = new int[this.field8119 * this.field8100];
                }
                this.method805();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V")
    public final void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4) {
        ++field8104;
        for (int var6 = 0; ~arg0.length < ~var6; ++var6) {
            if (arg0[var6] != null) {
                ((class636) arg0[var6]).method3536(arg2, arg3 != null ? arg3[var6] : null, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8115;
        class85 var8 = (class85) this.method392(Thread.currentThread());
        class56 var9 = var8.field1175;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 < 0 ? -var10 : var10;
        int var13 = ~var11 <= -1 ? var11 : -var11;
        int var14 = var12;
        if (var13 > var12) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var15 >= var16) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 - -1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 - -1 >> 17;
            int var23 = arg0 - var9.method491();
            int var24 = arg1 - var9.method490();
            int var25 = var19 + var23;
            int var26 = -var20 + var23;
            int var27 = -var20 + var23 + var17;
            int var28 = var17 + var19 + var23;
            int var29 = var24 - -var21;
            int var30 = -var22 + var24;
            int var31 = var24 - var22 + var18;
            int var32 = var21 + var24 + var18;
            if (~arg6 != -1) {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field801 = -(arg4 >>> 24) + 255;
            } else {
                var9.field801 = 0;
            }
            var9.field789 = var25 < 0 || var25 > var9.field787 || var26 < 0 || ~var9.field787 > ~var26 || var27 < 0 || var9.field787 < var27;
            var9.method483(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field789 = ~var25 > -1 || var25 > var9.field787 || ~var27 > -1 || ~var27 < ~var9.field787 || ~var28 > -1 || ~var9.field787 > ~var28;
            var9.method483(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8106;
        class85 var11 = (class85) this.method392(Thread.currentThread());
        class56 var12 = var11.field1175;
        var12.field796 = false;
        var12.field789 = ~arg0 > -1 || var12.field787 < arg0 || arg2 < 0 || ~var12.field787 > ~arg2 || arg4 < 0 || ~arg4 < ~var12.field787;
        int var13 = arg4 - super.field1465;
        int var14 = arg2 - super.field1465;
        int var15 = arg1 - super.field1457;
        int var16 = arg3 - super.field1457;
        int var17 = arg0 - super.field1465;
        int var18 = arg5 - super.field1457;
        int var19 = arg6 >>> 24;
        if (~arg9 != -1 && (arg9 != 1 || var19 != 255)) {
            if (~arg9 != -2) {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field801 = 128;
                var12.field798 = true;
                var12.method489(var15, var16, var18, var17, var14, var13, 100, 100, 100, arg6, arg7, arg8);
            } else {
                var12.field801 = -var19 + 255;
                var12.field798 = false;
                var12.method489(var15, var16, var18, var17, var14, var13, 100, 100, 100, arg6, arg7, arg8);
            }
        } else {
            var12.field801 = 0;
            var12.field798 = false;
            var12.method489(var15, var16, var18, var17, var14, var13, 100, 100, 100, arg6, arg7, arg8);
        }
        var12.field796 = true;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V")
    public final void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3) {
        ++field8113;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method205(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIIIIII)V")
    private final void method3255(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8093;
        int var8 = arg1 << 8;
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var9 = -arg3 + arg2;
        if (~var9 > ~super.field1470) {
            var9 = super.field1470;
        }
        int var10 = arg2 - -arg3 - -1;
        if (~var10 < ~super.field1450) {
            var10 = super.field1450;
        }
        int var11 = var9;
        if (arg0) {
            int var12 = arg3 * arg3;
            int var13 = 0;
            int var14 = arg2 - var9;
            int var15 = var14 * var14;
            int var16 = -var14 + var15;
            if (~var10 > ~arg2) {
                arg2 = var10;
            }
            int var17 = arg6 >>> 24;
            if (~arg4 == -1 || arg4 == 1 && var17 == 255) {
                while (var11 < arg2) {
                    while (~var16 >= ~var12 || ~var15 >= ~var12) {
                        var15 += var13 + var13;
                        var16 += var13++ + var13;
                    }
                    int var67 = -var13 + arg5 - -1;
                    if (var67 < super.field1440) {
                        var67 = super.field1440;
                    }
                    int var68 = arg5 + var13;
                    if (var68 > super.field1446) {
                        var68 = super.field1446;
                    }
                    int var69 = var67 - -(super.field1453 * var11);
                    for (int var70 = var67; var70 < var68; ++var70) {
                        if (this.field8109[var69] > var8) {
                            super.field1471[var69] = arg6;
                        }
                        ++var69;
                    }
                    ++var11;
                    var15 -= var14-- + var14;
                    var16 -= var14 + var14;
                }
                int var58 = arg3;
                int var59 = -arg2 + var11;
                int var60 = var59 * var59 - -var12;
                int var61 = -arg3 + var60;
                int var62 = var60 - var59;
                while (var11 < var10) {
                    while (var62 > var12 && var12 < var61) {
                        var62 -= var58-- + var58;
                        var61 -= var58 + var58;
                    }
                    int var63 = arg5 - var58;
                    if (var63 < super.field1440) {
                        var63 = super.field1440;
                    }
                    int var64 = arg5 + var58;
                    if (var64 > super.field1446 - 1) {
                        var64 = super.field1446 + -1;
                    }
                    int var65 = super.field1453 * var11 + var63;
                    ++var11;
                    var62 += var59 + var59;
                    for (int var66 = var63; var66 <= var64; ++var66) {
                        if (var8 < this.field8109[var65]) {
                            super.field1471[var65] = arg6;
                        }
                        ++var65;
                    }
                    var61 += var59++ + var59;
                }
            } else if (~arg4 != -2) {
                if (~arg4 != -3) {
                    throw new IllegalArgumentException();
                } else {
                    while (~arg2 < ~var11) {
                        while (~var12 <= ~var16 || ~var12 <= ~var15) {
                            var15 += var13 + var13;
                            var16 += var13++ - -var13;
                        }
                        int var31 = arg5 - -1 + -var13;
                        if (~var31 > ~super.field1440) {
                            var31 = super.field1440;
                        }
                        int var32 = arg5 + var13;
                        if (var32 > super.field1446) {
                            var32 = super.field1446;
                        }
                        int var33 = super.field1453 * var11 + var31;
                        ++var11;
                        for (int var34 = var31; ~var32 < ~var34; ++var34) {
                            if (var8 < this.field8109[var33]) {
                                int var35 = super.field1471[var33];
                                int var36 = arg6 - -var35;
                                int var37 = (16711935 & arg6) + (16711935 & var35);
                                int var38 = (var37 & 16777472) - -(65536 & -var37 + var36);
                                super.field1471[var33] = class266.method1624(-(var38 >>> 8) + var38, -var38 + var36);
                            }
                            ++var33;
                        }
                        var15 -= var14-- + var14;
                        var16 -= var14 - -var14;
                    }
                    int var18 = arg3;
                    int var19 = -var14;
                    int var20 = var19 * var19 + var12;
                    int var21 = -arg3 + var20;
                    int var22 = var20 - var19;
                    while (~var10 < ~var11) {
                        while (~var12 > ~var22 && ~var12 > ~var21) {
                            var22 -= var18-- - -var18;
                            var21 -= var18 + var18;
                        }
                        int var23 = -var18 + arg5;
                        if (var23 < super.field1440) {
                            var23 = super.field1440;
                        }
                        int var24 = arg5 - -var18;
                        if (var24 > super.field1446 - 1) {
                            var24 = super.field1446 - 1;
                        }
                        int var25 = var23 - -(super.field1453 * var11);
                        ++var11;
                        var22 += var19 + var19;
                        for (int var26 = var23; var26 <= var24; ++var26) {
                            if (this.field8109[var25] > var8) {
                                int var27 = super.field1471[var25];
                                int var28 = arg6 - -var27;
                                int var29 = (arg6 & 16711935) + (var27 & 16711935);
                                int var30 = (-var29 + var28 & 65536) + (var29 & 16777472);
                                super.field1471[var25] = class266.method1624(-var30 + var28, -(var30 >>> 8) + var30);
                            }
                            ++var25;
                        }
                        var21 += var19++ - -var19;
                    }
                }
            } else {
                int var39 = (var17 << 24) + ((16711878 & (65280 & arg6) * var17) >> 8) + (16711935 & (arg6 & 16711935) * var17 >> 8);
                int var40 = -var17 + 256;
                while (arg2 > var11) {
                    while (var12 >= var16 || var15 <= var12) {
                        var15 += var13 + var13;
                        var16 += var13++ - -var13;
                    }
                    int var52 = arg5 - -1 + -var13;
                    if (~var52 > ~super.field1440) {
                        var52 = super.field1440;
                    }
                    int var53 = arg5 + var13;
                    if (~var53 < ~super.field1446) {
                        var53 = super.field1446;
                    }
                    int var54 = super.field1453 * var11 + var52;
                    ++var11;
                    var15 -= var14-- - -var14;
                    for (int var55 = var52; ~var53 < ~var55; ++var55) {
                        if (~var8 > ~this.field8109[var54]) {
                            int var56 = super.field1471[var54];
                            int var57 = ((16711935 & var56) * var40 >> 8 & 16711935) - -((16711793 & (65280 & var56) * var40) >> 8);
                            super.field1471[var54] = var39 - -var57;
                        }
                        ++var54;
                    }
                    var16 -= var14 + var14;
                }
                int var41 = arg3;
                int var42 = -var14;
                int var43 = var42 * var42 + var12;
                int var44 = -arg3 + var43;
                int var45 = var43 - var42;
                while (~var10 < ~var11) {
                    while (var45 > var12 && ~var44 < ~var12) {
                        var45 -= var41-- + var41;
                        var44 -= var41 - -var41;
                    }
                    int var46 = -var41 + arg5;
                    if (var46 < super.field1440) {
                        var46 = super.field1440;
                    }
                    int var47 = arg5 + var41;
                    if (~var47 < ~(super.field1446 + -1)) {
                        var47 = super.field1446 + -1;
                    }
                    int var48 = super.field1453 * var11 + var46;
                    for (int var49 = var46; var49 <= var47; ++var49) {
                        if (~var8 > ~this.field8109[var48]) {
                            int var50 = super.field1471[var48];
                            int var51 = (((var50 & 65280) * var40 & 16711821) >> 8) + ((16711935 & var50) * var40 >> 8 & 16711935);
                            super.field1471[var48] = var39 + var51;
                        }
                        ++var48;
                    }
                    ++var11;
                    var45 += var42 - -var42;
                    var44 += var42++ - -var42;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lcq;IIII)V")
    public final void method389(class429 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8095;
        int var6 = arg0.field6024;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3255(true, arg3, arg2, arg4, 1, arg1, arg0.field6023);
        } else {
            if (~super.field1477 != ~var6) {
                class461 var9 = (class461) super.field1469.method1986((byte) -126, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method807(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = !this.method812(var6) ? 128 : 64;
                    var9 = this.method452(var10, 0, var11, var11, var11);
                    super.field1469.method1985(var9, (long) var6, (byte) -102);
                }
                super.field1476 = var9;
                super.field1477 = var6;
            }
            ++var8;
            this.method3256(false, (class541) super.field1476, arg0.field6023, 0, -arg4 + arg1, var8, var8, 1, arg2 - arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "()Z")
    public final boolean method385() {
        ++field8110;
        return true;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public final void method394(int arg0) {
        ++field8099;
        super.field1456[arg0].method172((byte) -71, (Runnable) null);
    }

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "()V")
    public final void method380() {
        super.field1445 = -super.field1468 + super.field1446;
        super.field1465 = -super.field1468 + super.field1440;
        super.field1448 = super.field1450 - super.field1442;
        ++field8111;
        super.field1457 = super.field1470 - super.field1442;
        for (int var1 = 0; super.field1462 > var1; ++var1) {
            class56 var5 = ((class85) super.field1456[var1]).field1175;
            var5.field794 = -super.field1470 + super.field1442;
            var5.field787 = -super.field1440 + super.field1446;
            var5.field793 = -super.field1440 + super.field1468;
            var5.field800 = -super.field1470 + super.field1450;
        }
        int var2 = super.field1470 * super.field1453 - -super.field1440;
        for (int var3 = super.field1470; super.field1450 > var3; ++var3) {
            for (int var4 = 0; ~super.field1462 < ~var4; ++var4) {
                ((class85) super.field1456[var4]).field1175.field792[-super.field1470 + var3] = var2;
            }
            var2 += super.field1453;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lhn;IIII)Lba;")
    public final class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8105;
        return new class544(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZLvs;IIIIIIII)V")
    private final void method3256(boolean arg0, class541 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8098;
        if (arg5 > 0 && ~arg6 < -1) {
            int var11 = arg9 << 8;
            int var12 = 0;
            int var13 = 0;
            int var14 = arg1.field32 - -arg1.field46 - -arg1.field47;
            int var15 = arg1.field37 - -arg1.field26 + arg1.field44;
            int var16 = (var14 << 16) / arg5;
            int var17 = (var15 << 16) / arg6;
            if (~arg1.field32 < -1) {
                int var18 = ((arg1.field32 << 16) + (var16 - 1)) / var16;
                arg4 += var18;
                var12 += var16 * var18 + -(arg1.field32 << 16);
            }
            if (~var14 < ~arg1.field46) {
                arg5 = ((arg1.field46 << 16) - -var16 + -var12 + -1) / var16;
            }
            if (~arg1.field37 < -1) {
                int var19 = ((arg1.field37 << 16) + var17 + -1) / var17;
                var13 += var17 * var19 + -(arg1.field37 << 16);
                arg8 += var19;
            }
            if (var15 > arg1.field26) {
                arg6 = ((arg1.field26 << 16) + var17 - (var13 - -1)) / var17;
            }
            int var20 = super.field1453 * arg8 + arg4;
            if (super.field1450 < arg6 + arg8) {
                arg6 -= arg6 + arg8 + -super.field1450;
            }
            int var21 = -arg5 + super.field1453;
            if (~super.field1470 < ~arg8) {
                int var22 = -arg8 + super.field1470;
                var13 += var17 * var22;
                var20 += super.field1453 * var22;
                arg6 -= var22;
            }
            if (arg4 + arg5 > super.field1446) {
                int var23 = -super.field1446 + arg5 + arg4;
                arg5 -= var23;
                var21 += var23;
            }
            if (~arg4 > ~super.field1440) {
                int var24 = -arg4 + super.field1440;
                var21 += var24;
                arg5 -= var24;
                var20 += var24;
                var12 += var16 * var24;
            }
            if (!arg0) {
                if (arg7 != 0) {
                    if (~arg7 != -2) {
                        if (~arg7 != -3) {
                            throw new IllegalArgumentException();
                        } else if (~arg3 == -2) {
                            int var25 = var12;
                            for (int var26 = -arg6; ~var26 > -1; ++var26) {
                                int var27 = (var13 >> 16) * arg1.field46;
                                var13 += var17;
                                for (int var28 = -arg5; ~var28 > -1; ++var28) {
                                    if (~var11 > ~this.field8109[var20]) {
                                        int var29 = arg1.field7369[(var12 >> 16) + var27];
                                        if (~var29 != -1) {
                                            int var30 = super.field1471[var20];
                                            int var31 = var29 + var30;
                                            int var32 = (16711935 & var29) + (var30 & 16711935);
                                            int var33 = (-var32 + var31 & 65536) + (var32 & 16777472);
                                            super.field1471[var20] = class266.method1624(-var33 + var31, -(var33 >>> 8) + var33);
                                        }
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var20 += var21;
                                var12 = var25;
                            }
                        } else if (arg3 != 0) {
                            if (arg3 == 3) {
                                int var34 = var12;
                                for (int var35 = -arg6; var35 < 0; ++var35) {
                                    int var36 = (var13 >> 16) * arg1.field46;
                                    var13 += var17;
                                    for (int var37 = -arg5; var37 < 0; ++var37) {
                                        if (~this.field8109[var20] < ~var11) {
                                            int var38 = arg1.field7369[(var12 >> 16) + var36];
                                            int var39 = var38 - -arg2;
                                            int var40 = (16711935 & var38) - -(arg2 & 16711935);
                                            int var41 = (-var40 + var39 & 65536) + (16777472 & var40);
                                            int var42 = -var41 + var39 | -(var41 >>> 8) + var41;
                                            int var43 = super.field1471[var20];
                                            int var44 = var42 + var43;
                                            int var45 = (var42 & 16711935) - -(16711935 & var43);
                                            int var46 = (65536 & -var45 + var44) + (16777472 & var45);
                                            super.field1471[var20] = class266.method1624(-var46 + var44, -(var46 >>> 8) + var46);
                                        }
                                        var12 += var16;
                                        ++var20;
                                    }
                                    var20 += var21;
                                    var12 = var34;
                                }
                            } else if (arg3 != 2) {
                                throw new IllegalArgumentException();
                            } else {
                                int var47 = arg2 >>> 24;
                                int var48 = 256 - var47;
                                int var49 = (16711935 & arg2) * var48 & -16711936;
                                int var50 = (arg2 & 65280) * var48 & 16711680;
                                int var51 = (var49 | var50) >>> 8;
                                int var52 = var12;
                                for (int var53 = -arg6; ~var53 > -1; ++var53) {
                                    int var54 = (var13 >> 16) * arg1.field46;
                                    for (int var55 = -arg5; var55 < 0; ++var55) {
                                        if (~var11 > ~this.field8109[var20]) {
                                            int var56 = arg1.field7369[(var12 >> 16) + var54];
                                            if (~var56 != -1) {
                                                int var57 = 16711680 & (var56 & 65280) * var47;
                                                int var58 = -16711936 & (var56 & 16711935) * var47;
                                                int var59 = ((var58 | var57) >>> 8) - -var51;
                                                int var60 = super.field1471[var20];
                                                int var61 = var59 + var60;
                                                int var62 = (var59 & 16711935) + (16711935 & var60);
                                                int var63 = (65536 & -var62 + var61) + (var62 & 16777472);
                                                super.field1471[var20] = class266.method1624(var63 - (var63 >>> 8), -var63 + var61);
                                            }
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var13 += var17;
                                    var12 = var52;
                                    var20 += var21;
                                }
                            }
                        } else {
                            int var64 = var12;
                            int var65 = (16711680 & arg2) >> 16;
                            int var66 = 255 & arg2 >> 8;
                            int var67 = arg2 & 255;
                            for (int var68 = -arg6; ~var68 > -1; ++var68) {
                                int var69 = (var13 >> 16) * arg1.field46;
                                for (int var70 = -arg5; var70 < 0; ++var70) {
                                    if (~var11 > ~this.field8109[var20]) {
                                        int var71 = arg1.field7369[(var12 >> 16) + var69];
                                        if (~var71 != -1) {
                                            int var72 = (var71 & 16711680) * var65 & -16777216;
                                            int var73 = (65280 & var71) * var66 & 16711680;
                                            int var74 = (var71 & 255) * var67 & 65280;
                                            int var75 = (var74 | var73 | var72) >>> 8;
                                            int var76 = super.field1471[var20];
                                            int var77 = var75 + var76;
                                            int var78 = (var75 & 16711935) + (16711935 & var76);
                                            int var79 = (var78 & 16777472) - -(65536 & -var78 + var77);
                                            super.field1471[var20] = class266.method1624(-var79 + var77, var79 - (var79 >>> 8));
                                        }
                                    }
                                    var12 += var16;
                                    ++var20;
                                }
                                var13 += var17;
                                var20 += var21;
                                var12 = var64;
                            }
                        }
                    } else if (~arg3 != -2) {
                        if (~arg3 != -1) {
                            if (arg3 != 3) {
                                if (~arg3 != -3) {
                                    throw new IllegalArgumentException();
                                } else {
                                    int var80 = arg2 >>> 24;
                                    int var81 = 256 - var80;
                                    int var82 = -16711936 & (arg2 & 16711935) * var81;
                                    int var83 = 16711680 & (65280 & arg2) * var81;
                                    int var84 = (var82 | var83) >>> 8;
                                    int var85 = var12;
                                    for (int var86 = -arg6; var86 < 0; ++var86) {
                                        int var87 = (var13 >> 16) * arg1.field46;
                                        var13 += var17;
                                        for (int var88 = -arg5; var88 < 0; ++var88) {
                                            if (~this.field8109[var20] < ~var11) {
                                                int var89 = arg1.field7369[(var12 >> 16) + var87];
                                                int var90 = var89 >>> 24;
                                                int var91 = (var89 & 16711935) * var80 & -16711936;
                                                int var92 = -var90 + 256;
                                                int var93 = (65280 & var89) * var80 & 16711680;
                                                int var94 = ((var91 | var93) >>> 8) - -var84;
                                                int var95 = super.field1471[var20];
                                                super.field1471[var20] = class249.method1537(16711680, class249.method1537(var95, 65280) * var92 + var90 * class249.method1537(var94, 65280)) + class249.method1537(-16711936, var90 * class249.method1537(var94, 16711935) - -(class249.method1537(var95, 16711935) * var92)) >> 8;
                                            }
                                            ++var20;
                                            var12 += var16;
                                        }
                                        var20 += var21;
                                        var12 = var85;
                                    }
                                }
                            } else {
                                int var96 = var12;
                                for (int var97 = -arg6; var97 < 0; ++var97) {
                                    int var98 = (var13 >> 16) * arg1.field46;
                                    var13 += var17;
                                    for (int var99 = -arg5; ~var99 > -1; ++var99) {
                                        if (~this.field8109[var20] < ~var11) {
                                            int var100 = arg1.field7369[(var12 >> 16) - -var98];
                                            int var101 = var100 - -arg2;
                                            int var102 = (16711935 & arg2) + (16711935 & var100);
                                            int var103 = (-var102 + var101 & 65536) + (var102 & 16777472);
                                            int var104 = -var103 + var101 | -(var103 >>> 8) + var103;
                                            int var105 = (arg2 >>> 24) * (var104 >>> 24) >> 8;
                                            int var106 = -var105 + 256;
                                            if (var105 != 255) {
                                                int var108 = super.field1471[var20];
                                                var104 = ((var104 & 16711935) * var105 + (var108 & 16711935) * var106 & -16711936) + (16711680 & (var104 & 65280) * var105 + (65280 & var108) * var106) >> 8;
                                            }
                                            super.field1471[var20] = var104;
                                        }
                                        var12 += var16;
                                        ++var20;
                                    }
                                    var12 = var96;
                                    var20 += var21;
                                }
                            }
                        } else {
                            int var109 = var12;
                            if (~(16777215 & arg2) != -16777216) {
                                int var110 = arg2 >> 16 & 255;
                                int var111 = (65280 & arg2) >> 8;
                                int var112 = 255 & arg2;
                                for (int var113 = -arg6; var113 < 0; ++var113) {
                                    int var114 = (var13 >> 16) * arg1.field46;
                                    var13 += var17;
                                    for (int var115 = -arg5; var115 < 0; ++var115) {
                                        if (var11 < this.field8109[var20]) {
                                            int var116 = arg1.field7369[(var12 >> 16) + var114];
                                            int var117 = (arg2 >>> 24) * (var116 >>> 24) >> 8;
                                            int var118 = -var117 + 256;
                                            if (var117 != 255) {
                                                int var119 = -16777216 & (16711680 & var116) * var110;
                                                int var120 = (var116 & 65280) * var111 & 16711680;
                                                int var121 = 65280 & (var116 & 255) * var112;
                                                int var122 = (var121 | var120 | var119) >>> 8;
                                                int var123 = super.field1471[var20];
                                                super.field1471[var20] = class249.method1537(class249.method1537(var123, 16711935) * var118 + class249.method1537(var122, 16711935) * var117, -16711936) - -class249.method1537(16711680, class249.method1537(var123, 65280) * var118 + class249.method1537(var122, 65280) * var117) >> 8;
                                            } else {
                                                int var124 = -16777216 & (var116 & 16711680) * var110;
                                                int var125 = 16711680 & (65280 & var116) * var111;
                                                int var126 = (255 & var116) * var112 & 65280;
                                                super.field1471[var20] = class266.method1624(class266.method1624(var125, var124), var126) >>> 8;
                                            }
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var20 += var21;
                                    var12 = var109;
                                }
                            } else {
                                for (int var127 = -arg6; var127 < 0; ++var127) {
                                    int var128 = (var13 >> 16) * arg1.field46;
                                    var13 += var17;
                                    for (int var129 = -arg5; ~var129 > -1; ++var129) {
                                        if (~var11 > ~this.field8109[var20]) {
                                            int var130 = arg1.field7369[(var12 >> 16) + var128];
                                            int var131 = (arg2 >>> 24) * (var130 >>> 24) >> 8;
                                            int var132 = -var131 + 256;
                                            int var133 = super.field1471[var20];
                                            super.field1471[var20] = class249.method1537(var131 * class249.method1537(16711935, var130) - -(class249.method1537(16711935, var133) * var132), -16711936) - -class249.method1537(16711680, var132 * class249.method1537(65280, var133) + class249.method1537(65280, var130) * var131) >> 8;
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
                        for (int var135 = -arg6; var135 < 0; ++var135) {
                            int var136 = (var13 >> 16) * arg1.field46;
                            for (int var137 = -arg5; ~var137 > -1; ++var137) {
                                if (this.field8109[var20] > var11) {
                                    int var138 = arg1.field7369[(var12 >> 16) + var136];
                                    int var139 = var138 >>> 24;
                                    int var140 = -var139 + 256;
                                    int var141 = super.field1471[var20];
                                    super.field1471[var20] = class249.method1537(class249.method1537(16711935, var138) * var139 + var140 * class249.method1537(16711935, var141) >> 8, -65281) - -class249.method1537(-16711936, var140 * class249.method1537(var141 >>> 8, 16711935) + var139 * (class249.method1537(-16711936, var138) >>> 8));
                                }
                                ++var20;
                                var12 += var16;
                            }
                            var13 += var17;
                            var20 += var21;
                            var12 = var134;
                        }
                    }
                } else if (arg3 != 1) {
                    if (arg3 != 0) {
                        if (~arg3 != -4) {
                            if (arg3 != 2) {
                                throw new IllegalArgumentException();
                            } else {
                                int var142 = arg2 >>> 24;
                                int var143 = -var142 + 256;
                                int var144 = (16711935 & arg2) * var143 & -16711936;
                                int var145 = 16711680 & (arg2 & 65280) * var143;
                                int var146 = (var144 | var145) >>> 8;
                                int var147 = var12;
                                for (int var148 = -arg6; ~var148 > -1; ++var148) {
                                    int var149 = (var13 >> 16) * arg1.field46;
                                    var13 += var17;
                                    for (int var150 = -arg5; var150 < 0; ++var150) {
                                        if (~var11 > ~this.field8109[var20]) {
                                            int var151 = arg1.field7369[(var12 >> 16) + var149];
                                            int var152 = 16711680 & (65280 & var151) * var142;
                                            int var153 = (var151 & 16711935) * var142 & -16711936;
                                            super.field1471[var20] = (class266.method1624(var153, var152) >>> 8) + var146;
                                        }
                                        ++var20;
                                        var12 += var16;
                                    }
                                    var12 = var147;
                                    var20 += var21;
                                }
                            }
                        } else {
                            int var154 = var12;
                            for (int var155 = -arg6; var155 < 0; ++var155) {
                                int var156 = (var13 >> 16) * arg1.field46;
                                var13 += var17;
                                for (int var157 = -arg5; var157 < 0; ++var157) {
                                    if (~this.field8109[var20] < ~var11) {
                                        int var158 = arg1.field7369[(var12 >> 16) + var156];
                                        int var159 = arg2 + var158;
                                        int var160 = (16711935 & var158) - -(arg2 & 16711935);
                                        int var161 = (65536 & -var160 + var159) + (16777472 & var160);
                                        super.field1471[var20] = class266.method1624(-(var161 >>> 8) + var161, var159 - var161);
                                    }
                                    ++var20;
                                    var12 += var16;
                                }
                                var20 += var21;
                                var12 = var154;
                            }
                        }
                    } else {
                        int var162 = (arg2 & 16711680) >> 16;
                        int var163 = (arg2 & 65280) >> 8;
                        int var164 = arg2 & 255;
                        int var165 = var12;
                        for (int var166 = -arg6; ~var166 > -1; ++var166) {
                            int var167 = (var13 >> 16) * arg1.field46;
                            var13 += var17;
                            for (int var168 = -arg5; var168 < 0; ++var168) {
                                if (~var11 > ~this.field8109[var20]) {
                                    int var169 = arg1.field7369[(var12 >> 16) + var167];
                                    int var170 = -16777216 & (16711680 & var169) * var162;
                                    int var171 = (65280 & var169) * var163 & 16711680;
                                    int var172 = 65280 & (255 & var169) * var164;
                                    super.field1471[var20] = class266.method1624(class266.method1624(var171, var170), var172) >>> 8;
                                }
                                var12 += var16;
                                ++var20;
                            }
                            var12 = var165;
                            var20 += var21;
                        }
                    }
                } else {
                    int var173 = var12;
                    for (int var174 = -arg6; var174 < 0; ++var174) {
                        int var175 = (var13 >> 16) * arg1.field46;
                        var13 += var17;
                        for (int var176 = -arg5; var176 < 0; ++var176) {
                            if (~this.field8109[var20] < ~var11) {
                                super.field1471[var20] = arg1.field7369[(var12 >> 16) + var175];
                            }
                            var12 += var16;
                            ++var20;
                        }
                        var12 = var173;
                        var20 += var21;
                    }
                }
            }
        }
    }
}
