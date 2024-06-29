import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class543 extends class635 {

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Lor;")
    public class593 field7640;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "S")
    private short field7642;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "S")
    private short field7645;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "S")
    private short field7641;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "S")
    private short field7646;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "S")
    private short field7644;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    private int field7643;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    private int field7639;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "S")
    private short field7647;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
    public final void method3077() {
        this.field7640.field8375.field434[this.field7647] = null;
        class21.field280[class564.field7954] = this;
        class564.field7954 = class564.field7954 + 1 & 1023;
        this.method3414(0);
        this.method2396(1000);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
    private final void method3078() {
        int var1 = this.field7640.field8375.field432;
        if (this.field7640.field8375.field434[var1] != null) {
            this.field7640.field8375.field434[var1].method3077();
        }
        this.field7640.field8375.field434[var1] = this;
        this.field7647 = (short) this.field7640.field8375.field432;
        this.field7640.field8375.field432 = var1 + 1 & 8191;
        this.field7640.field8380.method2413(this, (byte) 118);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lor;IIIIIIIIIIIZZ)V")
    public final void method3079(class593 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7640 = arg0;
        super.field8982 = arg1 << 12;
        super.field8988 = arg2 << 12;
        super.field8987 = arg3 << 12;
        super.field8986 = arg9;
        this.field7645 = this.field7642 = (short) arg8;
        super.field8989 = arg10;
        super.field8990 = arg11;
        super.field8983 = arg13;
        this.field7641 = (short) arg4;
        this.field7646 = (short) arg5;
        this.field7644 = (short) arg6;
        this.field7643 = arg7;
        super.field8981 = this.field7640.field8374.field7984;
        this.method3078();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lr;J)V")
    public final void method3080(class166 arg0, long arg1) {
        int var4 = super.field8982 >> class310.field4593 + 12;
        int var5 = super.field8987 >> class310.field4593 + 12;
        int var6 = super.field8988 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class302.field4492 && var5 >= 0 && var5 < class8.field82) {
            class29 var7 = this.field7640.field8375;
            class542 var8 = this.field7640.field8370;
            class37[] var9 = class296.field4340;
            int var10 = var7.field447;
            class40 var11 = class153.field2210[var7.field447][var4][var5];
            if (var11 != null) {
                var10 = var11.field672;
            }
            int var12 = var9[var10].method432(var4, false, var5);
            int var13;
            if (var10 < class41.field685 - 1) {
                var13 = var9[var10 + 1].method432(var4, false, var5);
            } else {
                var13 = var12 - (8 << class310.field4593);
            }
            if (var8.field7601) {
                if (var8.field7621 == -1 && var6 > var12) {
                    this.method3077();
                    return;
                }
                if (var8.field7621 >= 0 && var6 > var9[var8.field7621].method432(var4, false, var5)) {
                    this.method3077();
                    return;
                }
                if (var8.field7602 == -1 && var6 < var13) {
                    this.method3077();
                    return;
                }
                if (var8.field7602 >= 0 && var6 < var9[var8.field7602 + 1].method432(var4, false, var5)) {
                    this.method3077();
                    return;
                }
            }
            int var14;
            for (var14 = class41.field685 - 1; var14 > 0 && var6 > var9[var14].method432(var4, false, var5); --var14) {
            }
            if (var8.field7632 && var14 == 0 && var6 > var9[0].method432(var4, false, var5)) {
                this.method3077();
            } else if (class41.field685 - 1 == var14 && var9[var14].method432(var4, false, var5) - var6 > 8 << class310.field4593) {
                this.method3077();
            } else {
                class40 var15 = class153.field2210[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class153.field2210[0][var4][var5] == null) {
                        var15 = class153.field2210[0][var4][var5] = new class40(0);
                    }
                    boolean var16 = class153.field2210[0][var4][var5].field668 != null;
                    if (var14 == 3 && var16) {
                        this.method3077();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class153.field2210[var17][var4][var5] == null) {
                            var15 = class153.field2210[var17][var4][var5] = new class40(var17);
                            if (var16) {
                                ++var15.field672;
                            }
                        }
                    }
                }
                if (var8.field7605) {
                    int var18 = super.field8982 >> 12;
                    int var19 = super.field8987 >> 12;
                    if (var15.field658 != null) {
                        class548 var20 = var15.field658.method1183(6433, arg0);
                        if (var20 != null && var20.method3100((byte) -125, var18, var6, var19)) {
                            this.method3077();
                            return;
                        }
                    }
                    if (var15.field669 != null) {
                        class548 var21 = var15.field669.method1183(6433, arg0);
                        if (var21 != null && var21.method3100((byte) -125, var18, var6, var19)) {
                            this.method3077();
                            return;
                        }
                    }
                    if (var15.field663 != null) {
                        class548 var22 = var15.field663.method1183(6433, arg0);
                        if (var22 != null && var22.method3100((byte) -125, var18, var6, var19)) {
                            this.method3077();
                            return;
                        }
                    }
                    for (class106 var23 = var15.field671; var23 != null; var23 = var23.field1641) {
                        class548 var24 = var23.field1638.method1183(6433, arg0);
                        if (var24 != null && var24.method3100((byte) -125, var18, var6, var19)) {
                            this.method3077();
                            return;
                        }
                    }
                }
                var7.field443.field7068.method3343(this, 38);
            }
        } else {
            this.method3077();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(JI)V")
    public final void method3081(long arg0, int arg1) {
        this.field7642 = (short) (this.field7642 - arg1);
        if (this.field7642 <= 0) {
            this.method3077();
        } else {
            int var4 = super.field8982 >> 12;
            int var5 = super.field8988 >> 12;
            int var6 = super.field8987 >> 12;
            class29 var7 = this.field7640.field8375;
            class542 var8 = this.field7640.field8370;
            if (var8.field7619 != 0) {
                if (this.field7645 - this.field7642 <= var8.field7576) {
                    int var9 = var8.field7567 * arg1 + (super.field8986 >> 8 & 65280) + (this.field7639 >> 16 & 255);
                    int var10 = var8.field7629 * arg1 + (this.field7639 >> 8 & 255) + (super.field8986 & 65280);
                    int var11 = var8.field7607 * arg1 + (super.field8986 << 8 & 65280) + (this.field7639 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field8986 &= -16777216;
                    super.field8986 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7639 &= -16777216;
                    this.field7639 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7645 - this.field7642 <= var8.field7615) {
                    int var12 = var8.field7604 * arg1 + (super.field8986 >> 16 & 65280) + (this.field7639 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field8986 &= 16777215;
                    super.field8986 |= (var12 & 65280) << 16;
                    this.field7639 &= 16777215;
                    this.field7639 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7623 != -1 && this.field7645 - this.field7642 <= var8.field7578) {
                this.field7643 += var8.field7630 * arg1;
            }
            if (var8.field7634 != -1 && this.field7645 - this.field7642 <= var8.field7581) {
                super.field8989 += var8.field7579 * arg1;
            }
            double var13 = (double) this.field7641;
            double var15 = (double) this.field7646;
            double var17 = (double) this.field7644;
            boolean var19 = false;
            if (var8.field7618 == 1) {
                int var20 = var4 - this.field7640.field8376.field3778;
                int var21 = var5 - this.field7640.field8376.field3770;
                int var22 = var6 - this.field7640.field8376.field3784;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field7614 * var23 * arg1);
                this.field7643 = (int) ((long) this.field7643 - ((long) this.field7643 * var24 >> 18));
            } else if (var8.field7618 == 2) {
                int var26 = var4 - this.field7640.field8376.field3778;
                int var27 = var5 - this.field7640.field8376.field3770;
                int var28 = var6 - this.field7640.field8376.field3784;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field7614 * var29 * arg1);
                this.field7643 = (int) ((long) this.field7643 - ((long) this.field7643 * var30 >> 28));
            }
            if (var8.field7568 != null) {
                class665 var32 = var7.field441.field716;
                for (class665 var33 = var32.field9382; var32 != var33; var33 = var33.field9382) {
                    class162 var34 = (class162) var33;
                    class152 var35 = var34.field2318;
                    if (var35.field2185 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field7568.length; ++var37) {
                            if (var8.field7568[var37] == var35.field2192) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field2323);
                            double var40 = (double) (var5 - var34.field2329);
                            double var42 = (double) (var6 - var34.field2331);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field2188)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field2319 * var42 + (double) var34.field2327 * var38 + (double) var35.field2200 * var40) * 65535.0D / ((double) var35.field2187 * var46);
                                if (!(var48 < (double) var35.field2199)) {
                                    double var50 = 0.0D;
                                    if (var35.field2202 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field2191;
                                    } else if (var35.field2202 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field2191;
                                    }
                                    if (var35.field2189 == 0) {
                                        if (var35.field2186 == 0) {
                                            var13 += ((double) var34.field2327 - var50) * (double) arg1;
                                            var15 += ((double) var35.field2200 - var50) * (double) arg1;
                                            var17 += ((double) var34.field2319 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field8982 = (int) ((double) super.field8982 + ((double) var34.field2327 - var50) * (double) arg1);
                                            super.field8988 = (int) ((double) super.field8988 + ((double) var35.field2200 - var50) * (double) arg1);
                                            super.field8987 = (int) ((double) super.field8987 + ((double) var34.field2319 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field2187;
                                        double var54 = var40 / var46 * (double) var35.field2187;
                                        double var56 = var42 / var46 * (double) var35.field2187;
                                        if (var35.field2186 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field8982 = (int) ((double) super.field8982 + (double) arg1 * var52);
                                            super.field8988 = (int) ((double) super.field8988 + (double) arg1 * var54);
                                            super.field8987 = (int) ((double) super.field8987 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7592 != null) {
                for (int var58 = 0; var58 < var8.field7592.length; ++var58) {
                    class162 var59 = (class162) class535.field7504.method1962((byte) -23, (long) var8.field7592[var58]);
                    while (var59 != null) {
                        class152 var60 = var59.field2318;
                        double var61 = (double) (var4 - var59.field2323);
                        double var63 = (double) (var5 - var59.field2329);
                        double var65 = (double) (var6 - var59.field2331);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field2188) {
                            var59 = (class162) class535.field7504.method1960((byte) 41);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field2319 * var65 + (double) var59.field2327 * var61 + (double) var60.field2200 * var63) * 65535.0D / ((double) var60.field2187 * var69);
                            if (var71 < (double) var60.field2199) {
                                var59 = (class162) class535.field7504.method1960((byte) 41);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field2202 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field2191;
                                } else if (var60.field2202 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field2191;
                                }
                                if (var60.field2189 == 0) {
                                    if (var60.field2186 == 0) {
                                        var13 += ((double) var59.field2327 - var73) * (double) arg1;
                                        var15 += ((double) var60.field2200 - var73) * (double) arg1;
                                        var17 += ((double) var59.field2319 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field8982 = (int) ((double) super.field8982 + ((double) var59.field2327 - var73) * (double) arg1);
                                        super.field8988 = (int) ((double) super.field8988 + ((double) var60.field2200 - var73) * (double) arg1);
                                        super.field8987 = (int) ((double) super.field8987 + ((double) var59.field2319 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field2187;
                                    double var77 = var63 / var69 * (double) var60.field2187;
                                    double var79 = var65 / var69 * (double) var60.field2187;
                                    if (var60.field2186 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field8982 = (int) ((double) super.field8982 + (double) arg1 * var75);
                                        super.field8988 = (int) ((double) super.field8988 + (double) arg1 * var77);
                                        super.field8987 = (int) ((double) super.field8987 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class162) class535.field7504.method1960((byte) 41);
                            }
                        }
                    }
                }
            }
            if (var8.field7589 != null) {
                if (var8.field7575 == null) {
                    var8.field7575 = new int[var8.field7589.length];
                    for (int var81 = 0; var81 < var8.field7589.length; ++var81) {
                        class429.method2567(-3, var8.field7589[var81]);
                        var8.field7575[var81] = ((class111) class502.field7111.method1405((long) var8.field7589[var81], (byte) -48)).field1683;
                    }
                }
                for (int var82 = 0; var82 < var8.field7575.length; ++var82) {
                    class152 var83 = class693.field9739[var8.field7575[var82]];
                    if (var83.field2186 == 0) {
                        var13 += (double) (var83.field2194 * arg1);
                        var15 += (double) (var83.field2200 * arg1);
                        var17 += (double) (var83.field2197 * arg1);
                        var19 = true;
                    } else {
                        super.field8982 += var83.field2194 * arg1;
                        super.field8988 += var83.field2200 * arg1;
                        super.field8987 += var83.field2197 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field7641 = (short) ((int) var13);
                        this.field7646 = (short) ((int) var15);
                        this.field7644 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field7643 <<= 1;
                }
            }
            super.field8982 = (int) ((long) super.field8982 + ((long) (this.field7643 << 2) * (long) this.field7641 >> 23) * (long) arg1);
            super.field8988 = (int) ((long) super.field8988 + ((long) (this.field7643 << 2) * (long) this.field7646 >> 23) * (long) arg1);
            super.field8987 = (int) ((long) super.field8987 + ((long) (this.field7643 << 2) * (long) this.field7644 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lor;IIIIIIIIIIIZZ)V")
    public class543(class593 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7640 = arg0;
        super.field8982 = arg1 << 12;
        super.field8988 = arg2 << 12;
        super.field8987 = arg3 << 12;
        super.field8986 = arg9;
        this.field7645 = this.field7642 = (short) arg8;
        super.field8989 = arg10;
        super.field8990 = arg11;
        super.field8983 = arg13;
        this.field7641 = (short) arg4;
        this.field7646 = (short) arg5;
        this.field7644 = (short) arg6;
        this.field7643 = arg7;
        super.field8981 = this.field7640.field8374.field7984;
        this.method3078();
    }
}
