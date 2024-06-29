import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class600 extends class677 {

    @OriginalMember(owner = "client!oh", name = "Wc", descriptor = "I")
    public int field8443 = -1;

    @OriginalMember(owner = "client!oh", name = "nd", descriptor = "I")
    public int field8460 = -1;

    @OriginalMember(owner = "client!oh", name = "Zc", descriptor = "Lht;")
    public static class607 field8446 = new class607("", 14);

    @OriginalMember(owner = "client!oh", name = "qd", descriptor = "Ldba;")
    public static class240 field8463 = new class240();

    @OriginalMember(owner = "client!oh", name = "sd", descriptor = "Z")
    public static boolean field8465 = false;

    @OriginalMember(owner = "client!oh", name = "Sc", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!oh", name = "Tc", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!oh", name = "Uc", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!oh", name = "Vc", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!oh", name = "Xc", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!oh", name = "ad", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!oh", name = "bd", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!oh", name = "cd", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!oh", name = "dd", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!oh", name = "ed", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!oh", name = "fd", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!oh", name = "gd", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!oh", name = "hd", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!oh", name = "id", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!oh", name = "jd", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!oh", name = "kd", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!oh", name = "ld", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!oh", name = "md", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!oh", name = "pd", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!oh", name = "rd", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!oh", name = "Yc", descriptor = "Lqda;")
    public static class173 field8445;

    @OriginalMember(owner = "client!oh", name = "od", descriptor = "Lpw;")
    public class210 field8461;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lr;Z)V", line = 8)
    public final void method172(class564 arg0, boolean arg1) {
        ++field8452;
        if (this.field8461 != null) {
            if (super.field9519 || this.method3356(arg0, 0, !arg1)) {
                class490 var3 = arg0.method950();
                var3.method16(super.field9446.method3391(109));
                var3.method30(super.field5179, super.field5178 - 20, super.field5176);
                if (!arg1) {
                    this.method3741(arg0, super.field9521, var3, super.field9519, 0);
                    super.field9521[0] = super.field9521[1] = super.field9521[2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lr;IZ)Z", line = 37)
    private final boolean method3356(class564 arg0, int arg1, boolean arg2) {
        ++field8451;
        int var4 = arg1;
        if (!arg2) {
            field8445 = null;
        }
        class543 var5 = this.method3737((byte) 101);
        class257 var6 = ~super.field9455 != 0 && ~super.field9482 == -1 ? class265.field3301.method3043(super.field9455, -8191) : null;
        class257 var7 = super.field9487 == -1 || super.field9473 && var6 != null ? null : class265.field3301.method3043(super.field9487, -8191);
        int var8 = var5.field7670;
        int var9 = var5.field7659;
        if (~var8 != -1 || var9 != 0 || var5.field7671 != 0 || ~var5.field7635 != -1) {
            arg1 |= 7;
        }
        boolean var10 = super.field9458 != 0 && super.field9460 <= class678.field9539 && ~super.field9486 < ~class678.field9539;
        if (var10) {
            arg1 |= 524288;
        }
        class473 var11 = super.field9521[0] = this.field8461.method1250(super.field9502, (byte) -128, var7, arg1, class628.field8859, class400.field5381, arg0, super.field9435, super.field9421, super.field9442, super.field9483, super.field9423, class265.field3301, super.field9503, var6);
        if (var11 == null) {
            return false;
        } else {
            super.field9489 = var11.method1869();
            super.field9425 = var11.method1868();
            this.method3734(var11, 0);
            int var12 = super.field9446.method3391(110);
            if (~var8 == -1 && var9 == 0) {
                this.method3743(0, 0, (byte) -62, this.method1414(-31789) << 9, this.method1414(-31789) << 9, var12);
            } else {
                this.method3743(var5.field7645, var5.field7668, (byte) -62, var9, var8, var12);
                if (~super.field9422 != -1) {
                    super.field9521[0].method1884(super.field9422);
                }
                if (~super.field9445 != -1) {
                    super.field9521[0].method1902(super.field9445);
                }
                if (~super.field9439 != -1) {
                    super.field9521[0].method1915(0, super.field9439, 0);
                }
            }
            if (var10) {
                var11.method1858(super.field9485, super.field9464, super.field9507, 255 & super.field9458);
            }
            if (~super.field9504 != 0 && ~super.field9501 != 0) {
                class681 var13 = class63.field654.method2191(false, super.field9504);
                boolean var14 = var13.field9615 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (~super.field9490 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field9415 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class473 var16 = super.field9521[1] = var13.method3780(var15, class265.field3301, arg0, -118, super.field9468, super.field9501, super.field9431);
                if (var16 != null) {
                    if (super.field9415 != 0) {
                        var16.method1915(0, -super.field9415 << 2, 0);
                    }
                    if (~super.field9490 != -1) {
                        var16.method1879(super.field9490 * 2048);
                    }
                    if (var14) {
                        if (super.field9422 != 0) {
                            var16.method1884(super.field9422);
                        }
                        if (~super.field9445 != -1) {
                            var16.method1902(super.field9445);
                        }
                        if (super.field9439 != 0) {
                            var16.method1915(0, super.field9439, 0);
                        }
                    }
                }
            } else {
                super.field9521[1] = null;
            }
            if (~super.field9447 != 0 && super.field9416 != -1) {
                class681 var17 = class63.field654.method2191(false, super.field9447);
                boolean var18 = var17.field9615 == 3 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field9428 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field9467 != 0) {
                        var19 |= 2;
                    }
                }
                class473 var20 = super.field9521[2] = var17.method3778(arg0, var19, class265.field3301, super.field9498, super.field9440, super.field9416, -80);
                if (var20 != null) {
                    if (super.field9467 != 0) {
                        var20.method1915(0, -super.field9467 << 2, 0);
                    }
                    if (~super.field9428 != -1) {
                        var20.method1879(super.field9428 * 2048);
                    }
                    if (var18) {
                        if (super.field9422 != 0) {
                            var20.method1884(super.field9422);
                        }
                        if (super.field9445 != 0) {
                            var20.method1902(super.field9445);
                        }
                        if (~super.field9439 != -1) {
                            var20.method1915(0, super.field9439, 0);
                        }
                    }
                }
            } else {
                super.field9521[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "(I)V", line = 208)
    public static final void method3357(int arg0) {
        if (arg0 == 0) {
            if (class15.field126 == 2) {
                class642.field9080[0].method3322(class472.field6799[0]);
                class642.field9080[1].method3322(class472.field6799[1]);
            } else if (class15.field126 == 3) {
                class642.field9080[0].method3322(class472.field6799[0]);
                class642.field9080[1].method3322(class472.field6799[1]);
                class642.field9080[2].method3322(class472.field6799[2]);
            } else {
                class642.field9080[0].method3322(class472.field6799[0]);
                class642.field9080[1].method3322(class472.field6799[1]);
                class642.field9080[2].method3322(class472.field6799[2]);
                class642.field9080[3].method3322(class472.field6799[3]);
            }
        } else if (arg0 == 1) {
            if (class15.field126 == 2) {
                class642.field9080[0].method3322(class472.field6799[2]);
            } else if (class15.field126 == 3) {
                class642.field9080[0].method3322(class472.field6799[3]);
                class642.field9080[1].method3322(class472.field6799[4]);
            } else {
                class642.field9080[0].method3322(class472.field6799[4]);
                class642.field9080[1].method3322(class472.field6799[5]);
                class642.field9080[2].method3322(class472.field6799[6]);
            }
        } else {
            if (arg0 == 2) {
                if (class15.field126 == 2) {
                    class642.field9080[0].method3322(class472.field6799[3]);
                    return;
                }
                if (class15.field126 == 3) {
                    class642.field9080[0].method3322(class472.field6799[5]);
                    return;
                }
                class642.field9080[0].method3322(class472.field6799[7]);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIIIB)V", line = 282)
    public final void method3358(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field8456;
        super.field5166 = super.field5169 = (byte) arg1;
        if (class568.method3221(arg3, arg2, 0)) {
            ++super.field5169;
        }
        if (~super.field9455 != 0 && class265.field3301.method3043(super.field9455, -8191).field3229 == 1) {
            super.field9455 = -1;
            super.field9466 = null;
        }
        if (super.field9504 != -1) {
            class681 var7 = class63.field654.method2191(false, super.field9504);
            if (var7.field9596 && ~var7.field9611 != 0 && ~class265.field3301.method3043(var7.field9611, -8191).field3229 == -2) {
                super.field9504 = -1;
            }
        }
        int var8 = -23 / ((-15 - arg5) / 60);
        if (super.field9447 != -1) {
            class681 var9 = class63.field654.method2191(false, super.field9447);
            if (var9.field9596 && ~var9.field9611 != 0 && ~class265.field3301.method3043(var9.field9611, -8191).field3229 == -2) {
                super.field9447 = -1;
            }
        }
        if (!arg0) {
            int var10 = -super.field9517[0] + arg2;
            int var11 = -super.field9513[0] + arg3;
            if (var10 >= -8 && var10 <= 8 && ~var11 <= 7 && ~var11 >= -9) {
                if (~super.field9518 > -10) {
                    ++super.field9518;
                }
                for (int var12 = super.field9518; var12 > 0; --var12) {
                    super.field9517[var12] = super.field9517[var12 - 1];
                    super.field9513[var12] = super.field9513[var12 + -1];
                    super.field9523[var12] = super.field9523[var12 + -1];
                }
                super.field9517[0] = arg2;
                super.field9513[0] = arg3;
                super.field9523[0] = 1;
                return;
            }
        }
        super.field9516 = 0;
        super.field9518 = 0;
        super.field9517[0] = arg2;
        super.field9514 = 0;
        super.field9513[0] = arg3;
        super.field5179 = (super.field9517[0] << 9) - -(arg4 << 8);
        super.field5176 = (super.field9513[0] << 9) + (arg4 << 8);
        if (super.field9515 != null) {
            super.field9515.method1958();
        }
    }

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "(I)Z", line = 368)
    public final boolean method3359(int arg0) {
        ++field8444;
        if (this.field8461 == null) {
            return false;
        } else {
            int var2 = 91 % ((arg0 - -64) / 45);
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "(I)I", line = 382)
    public final int method1409(int arg0) {
        if (arg0 != 0) {
            this.method3358(false, 95, 15, -2, 75, (byte) 62);
        }
        ++field8439;
        if (this.field8461.field2492 != null) {
            class210 var2 = this.field8461.method1247((byte) 121, class628.field8859);
            if (var2 != null && var2.field2536 != -1) {
                return var2.field2536;
            }
        }
        return this.field8461.field2536;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(Lr;I)Lwj;", line = 402)
    public final class315 method182(class564 arg0, int arg1) {
        ++field8440;
        if (this.field8461 != null && this.method3356(arg0, 2048, true)) {
            class490 var3 = arg0.method950();
            int var4 = super.field9446.method3391(109);
            var3.method16(var4);
            class499 var5 = class487.field7044[super.field5166][super.field5179 >> class559.field7984][super.field5176 >> class559.field7984];
            if (var5 != null && var5.field7230 != null) {
                int var6 = -var5.field7230.field8104 + super.field9481;
                super.field9481 = (int) ((float) super.field9481 - (float) var6 / 10.0F);
            } else {
                super.field9481 = (int) ((float) super.field9481 - (float) super.field9481 / 10.0F);
            }
            var3.method30(super.field5179, super.field5178 + -20 + -super.field9481, super.field5176);
            class543 var7 = this.method3737((byte) 84);
            class210 var8 = this.field8461.field2492 != null ? this.field8461.method1247((byte) 67, class628.field8859) : this.field8461;
            super.field9522 = false;
            if (class639.field9075.field6760 && var8.field2496 && var7.field7658) {
                class257 var9 = super.field9455 != -1 && ~super.field9482 == -1 ? class265.field3301.method3043(super.field9455, -8191) : null;
                class257 var10 = super.field9487 == -1 || super.field9473 && var9 != null ? null : class265.field3301.method3043(super.field9487, arg1 ^ -8191);
                class473 var11 = class645.method3612(65535 & this.field8461.field2482, this.field8461.field2511 & 255, var4, super.field9439, super.field9445, var10 == null ? var9 : var10, this.field8461.field2524, (byte) -113, var10 != null ? super.field9502 : super.field9435, super.field9422, this.field8461.field2531 & 65535, super.field9521[0], this.field8461.field2546 & 255, arg0);
                if (var11 != null) {
                    super.field9522 = true;
                    arg0.method955(false);
                    if (class460.field6553) {
                        var11.method1875(var3, (class374) null, class682.field9623, 0);
                    } else {
                        var11.method1914(var3, (class374) null, 0);
                    }
                    arg0.method955(true);
                }
            }
            var3.method16(var4);
            var3.method30(super.field5179, super.field5178 + -5 + -super.field9481, super.field5176);
            class315 var12 = null;
            if (this.method3362(arg1)) {
                var12 = class419.method2349((byte) 127, super.field9521.length);
            }
            this.method3741(arg0, super.field9521, var3, false, 0);
            if (!class460.field6553) {
                for (int var13 = 0; super.field9521.length > var13; ++var13) {
                    if (super.field9521[var13] != null) {
                        super.field9521[var13].method1914(var3, var12 == null ? null : var12.field3912[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field9521.length < ~var14; ++var14) {
                    if (super.field9521[var14] != null) {
                        super.field9521[var14].method1875(var3, var12 == null ? null : var12.field3912[var14], class682.field9623, 0);
                    }
                }
            }
            if (super.field9515 != null) {
                class332 var15 = super.field9515.method1952();
                if (!class460.field6553) {
                    arg0.method1033(var15);
                } else {
                    arg0.method1048(var15, class682.field9623);
                }
            }
            for (int var16 = 0; ~super.field9521.length < ~var16; ++var16) {
                if (super.field9521[var16] != null) {
                    super.field9522 |= super.field9521[var16].method1913();
                }
            }
            super.field9470 = class330.field4057;
            super.field9521[0] = super.field9521[1] = super.field9521[2] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "(I)V", line = 525)
    public static final void method3360(int arg0) {
        if (arg0 != -14687) {
            field8445 = null;
        }
        ++field8464;
        class310.field3831.method80((byte) 101);
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "(I)V", line = 536)
    public final void method170(int arg0) {
        ++field8448;
        if (arg0 <= 20) {
            method3360(-52);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V", line = 547)
    public final void method3361(int arg0, int arg1, int arg2) {
        ++field8458;
        int var4 = super.field9517[0];
        int var5 = super.field9513[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            --var5;
            ++var4;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (~super.field9455 != 0 && ~class265.field3301.method3043(super.field9455, -8191).field3229 == -2) {
            super.field9466 = null;
            super.field9455 = -1;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (arg0 != -27766) {
            this.method1409(22);
        }
        if (super.field9504 != -1) {
            class681 var6 = class63.field654.method2191(false, super.field9504);
            if (var6.field9596 && var6.field9611 != -1 && ~class265.field3301.method3043(var6.field9611, arg0 + 19575).field3229 == -2) {
                super.field9504 = -1;
            }
        }
        if (super.field9447 != -1) {
            class681 var7 = class63.field654.method2191(false, super.field9447);
            if (var7.field9596 && var7.field9611 != -1 && class265.field3301.method3043(var7.field9611, -8191).field3229 == 1) {
                super.field9447 = -1;
            }
        }
        if (~super.field9518 > -10) {
            ++super.field9518;
        }
        for (int var8 = super.field9518; var8 > 0; --var8) {
            super.field9517[var8] = super.field9517[var8 + -1];
            super.field9513[var8] = super.field9513[var8 + -1];
            super.field9523[var8] = super.field9523[var8 + -1];
        }
        super.field9517[0] = var4;
        super.field9513[0] = var5;
        super.field9523[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lr;III)Z", line = 646)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field8454;
        if (this.field8461 != null && this.method3356(arg0, 131072, true)) {
            class490 var5 = arg0.method950();
            int var6 = super.field9446.method3391(99);
            var5.method16(var6);
            var5.method30(super.field5179, super.field5178, super.field5176);
            boolean var7 = false;
            for (int var8 = arg2; ~super.field9521.length < ~var8; ++var8) {
                if (super.field9521[var8] != null) {
                    boolean var9 = this.field8461.field2526 == -1 ? ~this.field8461.field2524 == -2 : this.field8461.field2526 == 1;
                    boolean var10;
                    if (!class460.field6553) {
                        var10 = super.field9521[var8].method1867(arg1, arg3, var5, var9);
                    } else {
                        var10 = super.field9521[var8].method1896(arg1, arg3, var5, var9, class682.field9623);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field9521[0] = super.field9521[1] = super.field9521[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "(I)Z", line = 697)
    private final boolean method3362(int arg0) {
        ++field8455;
        if (arg0 != 0) {
            this.field8460 = 88;
        }
        return this.field8461.field2499;
    }

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "(I)I", line = 709)
    public final int method1419(int arg0) {
        int var2 = -111 / ((-29 - arg0) / 59);
        ++field8441;
        if (this.field8461.field2492 != null) {
            class210 var3 = this.field8461.method1247((byte) 75, class628.field8859);
            if (var3 != null && var3.field2515 != -1) {
                return var3.field2515;
            }
        }
        return this.field8461.field2515;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z", line = 738)
    public static final boolean method3363(int arg0, int arg1, int arg2) {
        if (arg1 != 27241) {
            method3367(4);
        }
        ++field8459;
        return class186.method1131((byte) 34, arg2, arg0) | (arg2 & 393216) != 0 || class148.method814(arg2, (byte) 102, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILrb;Lr;Z)V", line = 750)
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (arg2 != 2) {
            field8463 = null;
        }
        ++field8442;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLwn;Z)V", line = 763)
    public static final void method3364(byte arg0, class236 arg1, boolean arg2) {
        ++field8450;
        if (class661.field9266 < 400) {
            if (class362.field4859 == arg1) {
                if (class348.field4665 && (16 & class512.field7345) != 0) {
                    ++class347.field4650;
                    class53.method279(-1, 0, class679.field9566 + " -> <col=ffffff>" + class198.field2322.method1195((byte) 62, class504.field7267), 0L, arg0 ^ 100, true, 25, class286.field3580, false, class185.field2084, 0);
                }
            } else {
                String var9;
                if (~arg1.field2936 == -1) {
                    boolean var3 = true;
                    if (~class362.field4859.field2891 != 0 && arg1.field2891 != -1) {
                        int var4 = ~class362.field4859.field2935 < ~arg1.field2935 ? class362.field4859.field2935 : arg1.field2935;
                        int var5 = arg1.field2891 > class362.field4859.field2891 ? class362.field4859.field2891 : arg1.field2891;
                        int var6 = var4 * 10 / 100 + 5 + var5;
                        int var7 = -arg1.field2935 + class362.field4859.field2935;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        if (~var7 < ~var6) {
                            var3 = false;
                        }
                    }
                    String var8 = class312.field3886 != class246.field3031 ? class198.field2313.method1195((byte) 62, class504.field7267) : class198.field2315.method1195((byte) 62, class504.field7267);
                    if (~arg1.field2896 < ~arg1.field2935) {
                        var9 = arg1.method1418(-26900, true) + (var3 ? class260.method1538(arg1.field2935, false, class362.field4859.field2935) : "<col=ffffff>") + " (" + var8 + arg1.field2935 + "+" + (arg1.field2896 - arg1.field2935) + ")";
                    } else {
                        var9 = arg1.method1418(arg0 ^ -26894, true) + (!var3 ? "<col=ffffff>" : class260.method1538(arg1.field2935, false, class362.field4859.field2935)) + " (" + var8 + arg1.field2935 + ")";
                    }
                } else if (~arg1.field2936 == 0) {
                    var9 = arg1.method1418(-26900, true);
                } else {
                    var9 = arg1.method1418(-26900, true) + " (" + class198.field2314.method1195((byte) 62, class504.field7267) + arg1.field2936 + ")";
                }
                if (class348.field4665 && !arg2 && ~(8 & class512.field7345) != -1) {
                    class53.method279(-1, 0, class679.field9566 + " -> <col=ffffff>" + var9, (long) arg1.field9434, arg0 ^ 120, true, 23, class286.field3580, false, class185.field2084, 0);
                    ++class388.field5244;
                }
                if (!arg2) {
                    for (int var10 = 7; ~var10 <= -1; --var10) {
                        if (class364.field4890[var10] != null) {
                            short var11 = 0;
                            if (class616.field8685 == class246.field3031 && class364.field4890[var10].equalsIgnoreCase(class198.field2308.method1195((byte) 62, class504.field7267))) {
                                if (~arg1.field2935 < ~class362.field4859.field2935) {
                                    var11 = 2000;
                                }
                                if (~class362.field4859.field2938 != -1 && ~arg1.field2938 != -1) {
                                    if (class362.field4859.field2938 != arg1.field2938) {
                                        var11 = 0;
                                    } else {
                                        var11 = 2000;
                                    }
                                }
                            } else if (class421.field5612[var10]) {
                                var11 = 2000;
                            }
                            short var12 = (short) (class510.field7322[var10] + var11);
                            int var13 = class518.field7378[var10] != -1 ? class518.field7378[var10] : class329.field4032;
                            ++class223.field2775;
                            class53.method279(-1, 0, "<col=ffffff>" + var9, (long) arg1.field9434, 123, true, var12, class364.field4890[var10], false, var13, 0);
                        }
                    }
                } else {
                    class53.method279(0, 0, "", 0L, arg0 ^ 102, false, -1, "<col=cccccc>" + var9, true, -1, 0);
                }
                if (arg0 == 30) {
                    if (!arg2) {
                        for (class336 var14 = (class336) class694.field9730.method3434((byte) 2); var14 != null; var14 = (class336) class694.field9730.method3430(true)) {
                            if (~var14.field4231 == -20) {
                                var14.field4221 = "<col=ffffff>" + var9;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(Lr;I)Llf;", line = 924)
    public final class676 method185(class564 arg0, int arg1) {
        ++field8453;
        return arg1 <= 42 ? null : null;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)Z", line = 935)
    public final boolean method183(byte arg0) {
        ++field8447;
        int var2 = 11 % ((12 - arg0) / 62);
        return false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I", line = 950)
    public final int method3365(byte arg0) {
        if (arg0 >= -122) {
            this.method3365((byte) -10);
        }
        ++field8462;
        if (this.field8461.field2492 != null) {
            class210 var2 = this.field8461.method1247((byte) 127, class628.field8859);
            if (var2 != null && var2.field2533 != -1) {
                return var2.field2533;
            }
        }
        return ~this.field8461.field2533 == 0 ? super.method3365((byte) -125) : this.field8461.field2533;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(III)Z", line = 972)
    public static final boolean method3366(int arg0, int arg1, int arg2) {
        ++field8449;
        if (arg2 != -1) {
            field8445 = null;
        }
        return ~(arg1 & 544) == -545 | ~(24 & arg1) != -1;
    }

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "(I)V", line = 983)
    public static void method3367(int arg0) {
        field8463 = null;
        if (arg0 != 5479) {
            field8446 = null;
        }
        field8446 = null;
        field8445 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLpw;)V", line = 1000)
    public final void method3368(byte arg0, class210 arg1) {
        this.field8461 = arg1;
        ++field8457;
        if (super.field9515 != null) {
            super.field9515.method1958();
        }
        int var3 = -121 / ((-61 - arg0) / 47);
    }
}
