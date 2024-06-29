import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class264 extends class739 {

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
    private int field3779 = 4096;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    private int field3783 = 4096;

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
    private int field3787 = 4096;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "Lgr;")
    public static class530 field3780 = new class530(66, 0);

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "Lri;")
    public static class342 field3788;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3783 = arg0.method2882(-1);
                }
            } else {
                this.field3787 = arg0.method2882(arg2 + -2);
            }
        } else {
            this.field3779 = arg0.method2882(-1);
        }
        if (arg2 != 1) {
            field3780 = null;
        }
        ++field3784;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        if (arg1 != 8213) {
            return null;
        } else {
            ++field3782;
            int[][] var3 = super.field10328.method2106(arg0, true);
            if (super.field10328.field4727) {
                int[][] var4 = this.method4124(arg0, 0, true);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class399.field5703 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && var13 == var14) {
                        var8[var11] = this.field3779 * var12 >> 12;
                        var9[var11] = this.field3787 * var13 >> 12;
                        var10[var11] = this.field3783 * var14 >> 12;
                    } else {
                        var8[var11] = this.field3779;
                        var9[var11] = this.field3787;
                        var10[var11] = this.field3783;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
    public static final void method1743(byte arg0) {
        class390.field5621 = null;
        class724.field10164 = null;
        if (arg0 != 45) {
            field3780 = null;
        }
        ++field3785;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBIIILfj;)V")
    public static final void method1744(int arg0, byte arg1, int arg2, int arg3, int arg4, class654 arg5) {
        ++field3786;
        if (~arg5.field9354 != 0 || arg5.field9365 != null) {
            int var6 = 0;
            int var7 = arg5.field9373 * class243.field3580.field8000.method3577(false) >> 8;
            if (arg5.field9362 >= arg0) {
                if (~arg5.field9379 < ~arg0) {
                    var6 += -arg0 + arg5.field9379;
                }
            } else {
                var6 += arg0 - arg5.field9362;
            }
            if (arg4 > arg5.field9368) {
                var6 += arg4 - arg5.field9368;
            } else if (~arg4 > ~arg5.field9359) {
                var6 += arg5.field9359 - arg4;
            }
            if (arg1 != 124) {
                field3789 = -111;
            }
            if (~arg5.field9380 != -1 && var6 - 256 <= arg5.field9380 && class243.field3580.field8000.method3577(false) != 0 && ~arg5.field9371 == ~arg2) {
                var6 -= 256;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (arg5.field9380 - var6) * var7 / arg5.field9380;
                class108.field1536.method2053(true);
                int var9 = 8192;
                int var10 = (arg5.field9379 + arg5.field9362) / 2 + -arg0;
                int var11 = (arg5.field9368 - -arg5.field9359) / 2 + -arg4;
                if (~var10 != -1 || ~var11 != -1) {
                    int var12 = 16383 & -class179.field2487 + -((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) + -4096;
                    if (~var12 < -8193) {
                        var12 = 16384 - var12;
                    }
                    int var13;
                    if (var6 <= 0) {
                        var13 = 8192;
                    } else if (~var6 <= -4097) {
                        var13 = 16384;
                    } else {
                        var13 = var6 * 8192 / 4096 + 8192;
                    }
                    var9 = var12 * var13 / 8192 - -(16384 - var13 >> 1);
                }
                if (arg5.field9375 == null) {
                    if (arg5.field9354 >= 0) {
                        int var14 = arg5.field9377 == 256 && arg5.field9382 == 256 ? 256 : class68.method603(arg5.field9382, 255, arg5.field9377);
                        if (!arg5.field9355) {
                            class29 var15 = class29.method147(class551.field8040, arg5.field9354, 0);
                            if (var15 != null) {
                                class673 var16 = var15.method146().method3829(class695.field9833);
                                class149 var17 = class149.method1064(var16, var14, var8 << 6, var9);
                                var17.method1075(-1);
                                class593.field8429.method3657(var17);
                                arg5.field9375 = var17;
                            }
                        } else {
                            if (arg5.field9363 == null) {
                                arg5.field9363 = class531.method3227(class633.field8934, arg5.field9354);
                            }
                            if (arg5.field9363 != null) {
                                if (arg5.field9381 == null) {
                                    arg5.field9381 = arg5.field9363.method3229(new int[] { 22050 });
                                }
                                if (arg5.field9381 != null) {
                                    class149 var18 = class149.method1064(arg5.field9381, var14, var8 << 6, var9);
                                    var18.method1075(-1);
                                    class593.field8429.method3657(var18);
                                    arg5.field9375 = var18;
                                }
                            }
                        }
                    }
                } else {
                    arg5.field9375.method1085(var8);
                    arg5.field9375.method1079(var9);
                }
                if (arg5.field9385 != null) {
                    arg5.field9385.method1085(var8);
                    arg5.field9385.method1079(var9);
                    if (!arg5.field9385.method2657(false)) {
                        arg5.field9385 = null;
                        arg5.field9357 = null;
                        arg5.field9370 = null;
                    }
                } else {
                    if (arg5.field9365 != null && ~(arg5.field9360 -= arg3) >= -1) {
                        int var19 = ~arg5.field9377 == -257 && ~arg5.field9382 == -257 ? 256 : (int) ((double) (-arg5.field9382 + arg5.field9377) * Math.random()) - -arg5.field9382;
                        if (!arg5.field9372) {
                            int var20 = (int) (Math.random() * (double) arg5.field9365.length);
                            class29 var21 = class29.method147(class551.field8040, arg5.field9365[var20], 0);
                            if (var21 != null) {
                                class673 var22 = var21.method146().method3829(class695.field9833);
                                class149 var23 = class149.method1064(var22, var19, var8 << 6, var9);
                                var23.method1075(0);
                                class593.field8429.method3657(var23);
                                arg5.field9360 = (int) ((double) (-arg5.field9378 + arg5.field9361) * Math.random()) + arg5.field9378;
                                arg5.field9385 = var23;
                                return;
                            }
                            return;
                        }
                        if (arg5.field9357 == null) {
                            int var24 = (int) ((double) arg5.field9365.length * Math.random());
                            arg5.field9357 = class531.method3227(class633.field8934, arg5.field9365[var24]);
                        }
                        if (arg5.field9357 != null) {
                            if (arg5.field9370 == null) {
                                arg5.field9370 = arg5.field9357.method3229(new int[] { 22050 });
                            }
                            if (arg5.field9370 != null) {
                                class149 var25 = class149.method1064(arg5.field9370, var19, var8 << 6, var9);
                                var25.method1075(0);
                                class593.field8429.method3657(var25);
                                arg5.field9360 = arg5.field9378 + (int) (Math.random() * (double) (-arg5.field9378 + arg5.field9361));
                                arg5.field9385 = var25;
                                return;
                            }
                        }
                    }
                }
            } else {
                if (arg5.field9375 != null) {
                    class593.field8429.method3652(arg5.field9375);
                    arg5.field9375 = null;
                    arg5.field9363 = null;
                    arg5.field9381 = null;
                }
                if (arg5.field9385 != null) {
                    class593.field8429.method3652(arg5.field9385);
                    arg5.field9357 = null;
                    arg5.field9385 = null;
                    arg5.field9370 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZZ)V")
    public static final void method1745(int arg0, boolean arg1, boolean arg2) {
        ++field3781;
        if (!arg1) {
            field3789 = 49;
        }
        if (arg2) {
            class88 var3 = class448.method2741((byte) 60, class422.field6015, class583.field8319);
            var3.field1260.method2862(arg0, -1166933656);
            class523.method3183(var3, (byte) 31);
        } else {
            class529.method3206(class589.field8387, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljw;[Lwh;)V")
    public static final void method1746(class280 arg0, class40[] arg1) {
        if (class431.field6192) {
            int var2 = arg0.method90(-1, arg1);
            class391.field5644.method277(var2, arg1);
        }
        if (class95.field1372 == class25.field221) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class638) {
                var5 = ((class638) arg0).field9038;
                var6 = ((class638) arg0).field9035;
            } else {
                var5 = arg0.field3923 >> class639.field9095;
                var6 = arg0.field3916 >> class639.field9095;
            }
            class391.field5644.method206(class491.field7079[0].method2089(26448, arg0.field3923, arg0.field3916), class135.method965(var5, var6), class94.method732(var5, var6), class451.method2759(var5, var6));
        }
        class603 var7 = arg0.method613((byte) 80, class391.field5644);
        if (var7 != null) {
            if (arg0.field3915) {
                class373[] var8 = var7.field8543;
                for (int var9 = 0; var9 < var8.length; ++var9) {
                    class373 var10 = var8[var9];
                    if (var10.field5409) {
                        class545.method3277(var10.field5407 - var10.field5412, var10.field5410 - var10.field5412, var10.field5412 + var10.field5408, -82, var10.field5412 + var10.field5411);
                    }
                }
            }
            if (var7.field8545) {
                var7.field8541 = arg0;
                if (class564.field8170) {
                    class678 var11 = class465.field6628;
                    synchronized (class465.field6628) {
                        class465.field6628.method3856(var7, -111);
                        return;
                    }
                }
                class465.field6628.method3856(var7, -59);
                return;
            }
            class111.method809(var7, true);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
    public static void method1747(int arg0) {
        if (arg0 != 0) {
            method1744(-121, (byte) 120, 37, -48, -44, (class654) null);
        }
        field3780 = null;
        field3788 = null;
    }
}
