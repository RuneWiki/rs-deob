import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class692 extends class117 {

    @OriginalMember(owner = "client!io", name = "v", descriptor = "Ljava/lang/Object;")
    private Object field9463 = new Object();

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    private int field9464 = 0;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    private int field9467 = 0;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "[Lpq;")
    private class171[] field9465 = new class171[0];

    @OriginalMember(owner = "client!io", name = "m", descriptor = "Lki;")
    public static class364 field9454 = new class364();

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Lnj;")
    public static class415 field9462 = new class415(21, 3);

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V", line = 3)
    public final void method876(int arg0, int arg1) {
        ++field9458;
        int var3 = 0;
        Object var4 = this.field9463;
        synchronized (this.field9463) {
            if (this.field9464 == arg0) {
                for (int var5 = 0; ~var5 > ~this.field9464; ++var5) {
                    this.method3771(var3++, 0);
                }
            } else {
                for (int var6 = 0; ~this.field9464 < ~var6; ++var6) {
                    this.field9465[var6].method1164(false);
                }
                if (arg1 != -10363) {
                    this.field9465 = null;
                }
                this.field9464 = arg0;
                this.field9465 = new class171[this.field9464];
                for (int var7 = 0; ~this.field9464 < ~var7; ++var7) {
                    this.field9465[var7] = new class171(this);
                    this.field9465[var7].method1163((byte) 78);
                    this.method3771(var3++, arg1 + 10363);
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V", line = 54)
    private final void method3766(int arg0, int arg1) {
        ++field9460;
        super.field1501[super.field1503] = (byte) (arg0 + 10);
        ++super.field1503;
        if (super.field1503 >= 5000) {
            super.field1503 = 0;
        }
        ++super.field1502;
        if (arg1 < 68) {
            this.field9465 = null;
        }
        ++super.field1505;
        if (this.field9467 > 0) {
            Object var3 = this.field9463;
            synchronized (this.field9463) {
                this.field9463.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIFF[FII)V", line = 78)
    public static final void method3767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float[] arg8, int arg9, int arg10) {
        int var11 = arg0 - arg1;
        ++field9452;
        int var12 = arg2 - arg9;
        int var13 = arg5 - arg10;
        float var14 = arg8[2] * (float) var11 + arg8[1] * (float) var13 + arg8[0] * (float) var12;
        float var15 = arg8[5] * (float) var11 + arg8[3] * (float) var12 + arg8[4] * (float) var13;
        float var16 = arg8[8] * (float) var11 + arg8[7] * (float) var13 + arg8[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        float var18 = var15 + 0.5F + arg7;
        if (arg4 == -1) {
            if (~arg3 != -2) {
                if (~arg3 == -3) {
                    var17 = -var17;
                    var18 = -var18;
                } else if (~arg3 == -4) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                float var20 = var17;
                var17 = -var18;
                var18 = var20;
            }
            class287.field3719 = var18;
            class579.field7892 = var17;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILpq;)V", line = 131)
    public final void method3768(int arg0, class171 arg1) {
        ++field9450;
        boolean var3 = false;
        boolean var24 = false;
        label383: {
            try {
                try {
                    label384: {
                        var24 = true;
                        boolean var4 = false;
                        Object var5 = this.field9463;
                        byte var6;
                        synchronized (this.field9463) {
                            while (~super.field1505 == -1) {
                                ++this.field9467;
                                this.field9463.wait();
                                --this.field9467;
                            }
                            if (arg0 != 511122) {
                                Object var10000 = null;
                                var24 = false;
                                break label384;
                            }
                            var6 = super.field1501[super.field1504];
                            if (arg1.field2118 >= 0) {
                                if (~var6 > -1 || var6 > 3) {
                                    var3 = true;
                                }
                            } else if (~var6 <= -1 && ~var6 >= -4) {
                                var3 = true;
                            }
                            if (var3) {
                                arg1.field3246 = super.field1506[super.field1504];
                                super.field1506[super.field1504] = null;
                                ++super.field1504;
                                --super.field1505;
                                if (~super.field1504 <= -5001) {
                                    super.field1504 = 0;
                                }
                            }
                        }
                        if (var3) {
                            if (arg1.field2118 >= 0) {
                                if (var6 != 21) {
                                    if (~var6 == -21) {
                                        class530 var7 = (class530) arg1.field3246;
                                        if (var7.field6879 != null) {
                                            var7.field6879.method67(class273.field3602, 2);
                                        }
                                        if (var7.field6886 != null) {
                                            var7.field6886.method67(class273.field3602, 2);
                                        }
                                        if (var7.field6895 != null) {
                                            var7.field6895.method67(class273.field3602, 2);
                                        }
                                        if (var7.field6893 != null) {
                                            var7.field6893.method67(class273.field3602, 2);
                                        }
                                        if (var7.field6878 != null) {
                                            var7.field6878.method67(class273.field3602, 2);
                                        }
                                        for (class571 var8 = var7.field6887; var8 != null; var8 = var8.field7445) {
                                            var8.field7444.method67(class273.field3602, 2);
                                        }
                                        var24 = false;
                                    } else if (~var6 <= -31 && var6 <= 33) {
                                        ((class88) arg1.field3246).method660(class658.field9175, class659.field9178, class703.field9809, class505.field6641, ~(var6 + -30) == -1);
                                        var24 = false;
                                    } else if (var6 >= 40 && ~var6 >= -44) {
                                        ((class88) arg1.field3246).method660(class658.field9175, class659.field9178, class703.field9809, class294.field3808, ~(var6 + -40) == -1);
                                        var24 = false;
                                    } else if (var6 == 22) {
                                        class273.field3602.method394(-1, 1583160, 40, 127);
                                        var24 = false;
                                    } else if (~var6 != -24) {
                                        if (~var6 != -25) {
                                            if (var6 >= 10) {
                                                if (var6 <= 13) {
                                                    class273.field3602.method398(arg1.field2118);
                                                    arg1.field2118 = -1;
                                                    var24 = false;
                                                } else {
                                                    var24 = false;
                                                }
                                            } else {
                                                var24 = false;
                                            }
                                        } else {
                                            class273.field3602.method412(0, (class296[]) null);
                                            var24 = false;
                                        }
                                    } else {
                                        class273.field3602.method351();
                                        var24 = false;
                                    }
                                } else {
                                    class399.method2282(arg1, (class530) arg1.field3246);
                                    var24 = false;
                                }
                            } else if (var6 >= 0) {
                                if (var6 <= 3) {
                                    arg1.field2118 = var6;
                                    class273.field3602.method373(var6);
                                    var24 = false;
                                } else {
                                    var24 = false;
                                }
                            } else {
                                var24 = false;
                            }
                        } else {
                            Thread.yield();
                            var24 = false;
                        }
                    }
                } catch (Exception var29) {
                    var24 = false;
                }
                break label383;
            } finally {
                if (var24) {
                    Object var16 = null;
                    if (var3) {
                        Object var17 = this.field9463;
                        synchronized (this.field9463) {
                            --super.field1502;
                            if (super.field1502 == 0) {
                                this.field9463.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var13 = this.field9463;
                synchronized (this.field9463) {
                    --super.field1502;
                    if (super.field1502 == 0) {
                        this.field9463.notifyAll();
                    }
                }
            }
            return;
        }
        Object var14 = null;
        if (var3) {
            Object var15 = this.field9463;
            synchronized (this.field9463) {
                --super.field1502;
                if (super.field1502 == 0) {
                    this.field9463.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 306)
    public final void method877(byte arg0) {
        try {
            Object var2 = this.field9463;
            synchronized (this.field9463) {
                while (true) {
                    if (~super.field1502 == -1) {
                        break;
                    }
                    this.field9463.wait();
                }
            }
            int var3 = 70 % ((arg0 - 64) / 45);
        } catch (Exception var5) {
        }
        ++field9456;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILgn;)V", line = 327)
    public final void method878(int arg0, class530 arg1) {
        Object var3 = this.field9463;
        synchronized (this.field9463) {
            --super.field1504;
            if (~super.field1504 > -1) {
                super.field1504 = 4999;
            }
            super.field1501[super.field1504] = 21;
            super.field1506[super.field1504] = arg1;
            ++super.field1502;
            ++super.field1505;
            int var4 = -15 % ((arg0 - 79) / 37);
            if (~this.field9467 < -1) {
                this.field9463.notifyAll();
            }
        }
        ++field9451;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 352)
    public final void method880(int arg0) {
        ++field9453;
        Object var2 = this.field9463;
        synchronized (this.field9463) {
            for (int var3 = 0; this.field9464 > var3; ++var3) {
                if (this.field9465[var3].field2118 >= 0) {
                    this.method3766(this.field9465[var3].field2118, 114);
                }
            }
            if (arg0 != 5000) {
                this.method879(true, (byte) 74, (class88) null, 6);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 376)
    public static void method3769(int arg0) {
        field9462 = null;
        field9454 = null;
        if (arg0 != 21560) {
            field9462 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIJ)V", line = 389)
    public static final void method3770(int arg0, int arg1, int arg2, long arg3) {
        ++field9461;
        int var5 = ((int) arg3 & 511122) >> 14;
        if (arg1 != 8080) {
            field9462 = null;
        }
        int var6 = 3 & (int) arg3 >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && ~var5 != -12 && ~var5 != -23) {
            class367.method2112(0, var5, true, arg0, arg2, 0, 0, var6, true);
        } else {
            class698 var8 = class348.field4436.method1900(-127, var7);
            int var9;
            int var10;
            if (var6 != 0 && var6 != 2) {
                var9 = var8.field9589;
                var10 = var8.field9654;
            } else {
                var9 = var8.field9654;
                var10 = var8.field9589;
            }
            int var11 = var8.field9651;
            if (~var6 != -1) {
                var11 = (var11 << var6 & 15) - -(var11 >> 4 - var6);
            }
            class367.method2112(var11, 0, true, arg0, arg2, var10, var9, 0, true);
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(II)V", line = 440)
    private final void method3771(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method880(-56);
        }
        super.field1501[super.field1503] = (byte) arg0;
        ++field9449;
        ++super.field1503;
        ++super.field1502;
        ++super.field1505;
        if (~super.field1503 <= -5001) {
            super.field1503 = 0;
        }
        if (~this.field9467 < -1) {
            Object var3 = this.field9463;
            synchronized (this.field9463) {
                this.field9463.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 467)
    public final void method875(int arg0, int arg1) {
        ++field9459;
        Object var3 = this.field9463;
        synchronized (this.field9463) {
            if (arg1 != 0) {
                this.field9463 = null;
            }
            super.field1501[super.field1503] = (byte) arg0;
            ++super.field1503;
            if (super.field1503 >= 5000) {
                super.field1503 = 0;
            }
            ++super.field1505;
            ++super.field1502;
            if (~this.field9467 < -1) {
                this.field9463.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lgn;Z)V", line = 490)
    public final void method883(class530 arg0, boolean arg1) {
        Object var3 = this.field9463;
        synchronized (this.field9463) {
            super.field1501[super.field1503] = 21;
            super.field1506[super.field1503] = arg0;
            ++super.field1503;
            ++super.field1505;
            if (~super.field1503 <= -5001) {
                super.field1503 = 0;
            }
            ++super.field1502;
            if (this.field9467 > 0) {
                this.field9463.notifyAll();
            }
        }
        if (arg1) {
            ++field9455;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZBLd;I)V", line = 515)
    public final void method879(boolean arg0, byte arg1, class88 arg2, int arg3) {
        Object var5 = this.field9463;
        synchronized (this.field9463) {
            super.field1501[super.field1503] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
            super.field1506[super.field1503] = arg2;
            ++super.field1503;
            ++super.field1502;
            if (super.field1503 >= 5000) {
                super.field1503 = 0;
            }
            ++super.field1505;
            if (~this.field9467 < -1) {
                this.field9463.notifyAll();
            }
        }
        ++field9466;
        int var6 = 96 / ((arg1 - 50) / 50);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lgn;I)V", line = 541)
    public final void method881(class530 arg0, int arg1) {
        Object var3 = this.field9463;
        synchronized (this.field9463) {
            super.field1501[super.field1503] = 20;
            super.field1506[super.field1503] = arg0;
            ++super.field1503;
            ++super.field1502;
            if (~super.field1503 <= -5001) {
                super.field1503 = 0;
            }
            ++super.field1505;
            if (~this.field9467 < -1) {
                this.field9463.notifyAll();
            }
            if (arg1 < 83) {
                this.method876(-35, -74);
            }
        }
        ++field9457;
    }
}
