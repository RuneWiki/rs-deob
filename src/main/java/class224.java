import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class224 extends class283 {

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field3149 = new Object();

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "[Lqga;")
    private class172[] field3155 = new class172[0];

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    private int field3151 = 0;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    private int field3163 = 0;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILqga;)V")
    public final void method1399(int arg0, class172 arg1) {
        ++field3150;
        boolean var3 = false;
        try {
            boolean var4 = false;
            Object var5 = this.field3149;
            byte var6;
            synchronized (this.field3149) {
                while (~super.field4013 == -1) {
                    ++this.field3151;
                    this.field3149.wait();
                    --this.field3151;
                }
                var6 = super.field4006[super.field4011];
                if (~arg1.field2655 <= -1) {
                    if (~var6 > -1 || var6 > 3) {
                        var3 = true;
                    }
                } else if (~var6 <= -1 && var6 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field9526 = super.field4007[super.field4011];
                    super.field4007[super.field4011] = null;
                    ++super.field4011;
                    --super.field4013;
                    if (super.field4011 >= 5000) {
                        super.field4011 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg1.field2655 >= 0) {
                if (~var6 != -22) {
                    if (~var6 != -21) {
                        if (var6 >= 30 && var6 <= 33) {
                            ((class139) arg1.field9526).method201(class350.field4797, class173.field2673, class364.field4927, class516.field6888, ~(var6 + -30) == -1);
                        } else if (var6 >= 40 && ~var6 >= -44) {
                            ((class139) arg1.field9526).method201(class350.field4797, class173.field2673, class364.field4927, class659.field9356, var6 + -40 == 0);
                        } else if (var6 == 22) {
                            class269.field3751.method387(-1, 1583160, 40, 127);
                        } else if (var6 == 23) {
                            class269.field3751.method414();
                        } else if (~var6 == -25) {
                            class269.field3751.method400(0, (class65[]) null);
                        } else if (var6 >= 10 && var6 <= 13) {
                            class269.field3751.method378(arg1.field2655);
                            arg1.field2655 = -1;
                        }
                    } else {
                        class24 var7 = (class24) arg1.field9526;
                        if (var7.field411 != null) {
                            var7.field411.method147(class269.field3751, true);
                        }
                        if (var7.field406 != null) {
                            var7.field406.method147(class269.field3751, true);
                        }
                        if (var7.field396 != null) {
                            var7.field396.method147(class269.field3751, true);
                        }
                        if (var7.field413 != null) {
                            var7.field413.method147(class269.field3751, true);
                        }
                        if (var7.field422 != null) {
                            var7.field422.method147(class269.field3751, true);
                        }
                        for (class684 var8 = var7.field409; var8 != null; var8 = var8.field9618) {
                            var8.field9619.method147(class269.field3751, true);
                        }
                    }
                } else {
                    class615.method3367(arg1, (class24) arg1.field9526);
                }
            } else if (~var6 <= -1 && ~var6 >= -4) {
                arg1.field2655 = var6;
                class269.field3751.method425(var6);
            }
        } catch (Exception var21) {
        } finally {
            Object var12 = null;
            if (var3) {
                Object var13 = this.field3149;
                synchronized (this.field3149) {
                    --super.field4010;
                    if (~super.field4010 == -1) {
                        this.field3149.notifyAll();
                    }
                }
            }
        }
        if (arg0 != 5000) {
            this.method1411((byte) 87, (class139) null, -122, false);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public final void method1400(boolean arg0) {
        if (!arg0) {
            this.method1401(27, 60);
        }
        ++field3160;
        Object var2 = this.field3149;
        synchronized (this.field3149) {
            for (int var3 = 0; this.field3163 > var3; ++var3) {
                if (this.field3155[var3].field2655 >= 0) {
                    this.method1401(this.field3155[var3].field2655, 108);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
    private final void method1401(int arg0, int arg1) {
        super.field4006[super.field4004] = (byte) (arg0 - -10);
        ++field3148;
        ++super.field4004;
        if (arg1 < 81) {
            this.field3155 = null;
        }
        ++super.field4013;
        if (~super.field4004 <= -5001) {
            super.field4004 = 0;
        }
        ++super.field4010;
        if (~this.field3151 < -1) {
            Object var3 = this.field3149;
            synchronized (this.field3149) {
                this.field3149.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
    private final void method1402(int arg0, int arg1) {
        super.field4006[super.field4004] = (byte) arg0;
        ++field3147;
        ++super.field4004;
        if (super.field4004 >= 5000) {
            super.field4004 = 0;
        }
        int var3 = 76 / ((arg1 - 31) / 62);
        ++super.field4013;
        ++super.field4010;
        if (~this.field3151 < -1) {
            Object var4 = this.field3149;
            synchronized (this.field3149) {
                this.field3149.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "([I[II)V")
    public static final void method1403(int[] arg0, int[] arg1, int arg2) {
        ++field3158;
        if (arg1 != null && arg0 != null) {
            class546.field7271 = arg1;
            class91.field1385 = new int[arg1.length];
            class191.field2811 = new byte[arg1.length][][];
            for (int var3 = arg2; class546.field7271.length > var3; ++var3) {
                class191.field2811[var3] = new byte[arg0[var3]][];
            }
        } else {
            class91.field1385 = null;
            class191.field2811 = null;
            class546.field7271 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIIII)V")
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3154;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 - 1) * var11) + var9;
        if (arg3 > -114) {
            field3162 = 110;
        }
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 - -1) * var16;
        class475.method2668(arg4, arg5 - -arg2, 7, class236.field3325[arg1], -arg2 + arg5);
        int var20 = (arg0 + -1) * var15;
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    ++var6;
                    var17 += var16;
                }
            }
            if (~var14 > -1) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            --var7;
            var20 -= var15;
            int var21 = -var7 + arg1;
            int var22 = arg1 - -var7;
            int var23 = arg5 + var6;
            int var24 = -var6 + arg5;
            class475.method2668(arg4, var23, 7, class236.field3325[var21], var24);
            class475.method2668(arg4, var23, 7, class236.field3325[var22], var24);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lfba;I)V")
    public final void method1405(class24 arg0, int arg1) {
        Object var3 = this.field3149;
        synchronized (this.field3149) {
            super.field4006[super.field4004] = 21;
            super.field4007[super.field4004] = arg0;
            ++super.field4004;
            ++super.field4010;
            ++super.field4013;
            if (~super.field4004 <= -5001) {
                super.field4004 = 0;
            }
            if (~this.field3151 < -1) {
                this.field3149.notifyAll();
            }
        }
        if (arg1 != 103) {
            field3157 = 127;
        }
        ++field3159;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lfba;B)V")
    public final void method1406(class24 arg0, byte arg1) {
        ++field3165;
        if (arg1 >= -69) {
            field3162 = -61;
        }
        Object var3 = this.field3149;
        synchronized (this.field3149) {
            --super.field4011;
            if (super.field4011 < 0) {
                super.field4011 = 4999;
            }
            super.field4006[super.field4011] = 21;
            super.field4007[super.field4011] = arg0;
            ++super.field4013;
            ++super.field4010;
            if (this.field3151 > 0) {
                this.field3149.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
    public final void method1407(boolean arg0) {
        try {
            Object var2 = this.field3149;
            synchronized (this.field3149) {
                while (true) {
                    if (super.field4010 == 0) {
                        break;
                    }
                    this.field3149.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field3152;
        if (!arg0) {
            this.method1411((byte) 65, (class139) null, -17, false);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V")
    public final void method1408(int arg0, byte arg1) {
        ++field3156;
        int var3 = 0;
        Object var4 = this.field3149;
        synchronized (this.field3149) {
            if (~this.field3163 == ~arg0) {
                for (int var5 = 0; this.field3163 > var5; ++var5) {
                    this.method1402(var3++, arg1 + 110);
                }
            } else {
                if (arg1 != 6) {
                    this.method1411((byte) -85, (class139) null, 19, false);
                }
                for (int var6 = 0; this.field3163 > var6; ++var6) {
                    this.field3155[var6].method1165(arg1 ^ -88);
                }
                this.field3163 = arg0;
                this.field3155 = new class172[this.field3163];
                for (int var7 = 0; var7 < this.field3163; ++var7) {
                    this.field3155[var7] = new class172(this);
                    this.field3155[var7].method1168((byte) 95);
                    this.method1402(var3++, 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)V")
    public final void method1409(boolean arg0, int arg1) {
        if (arg0) {
            ++field3164;
            Object var3 = this.field3149;
            synchronized (this.field3149) {
                super.field4006[super.field4004] = (byte) arg1;
                ++super.field4004;
                ++super.field4010;
                ++super.field4013;
                if (super.field4004 >= 5000) {
                    super.field4004 = 0;
                }
                if (~this.field3151 < -1) {
                    this.field3149.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILfba;)V")
    public final void method1410(int arg0, class24 arg1) {
        Object var3 = this.field3149;
        synchronized (this.field3149) {
            if (arg0 <= 42) {
                return;
            }
            super.field4006[super.field4004] = 20;
            super.field4007[super.field4004] = arg1;
            ++super.field4004;
            ++super.field4013;
            if (~super.field4004 <= -5001) {
                super.field4004 = 0;
            }
            ++super.field4010;
            if (this.field3151 > 0) {
                this.field3149.notifyAll();
            }
        }
        ++field3161;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLd;IZ)V")
    public final void method1411(byte arg0, class139 arg1, int arg2, boolean arg3) {
        ++field3153;
        Object var5 = this.field3149;
        synchronized (this.field3149) {
            if (arg0 < 86) {
                this.method1408(-53, (byte) 100);
            }
            super.field4006[super.field4004] = (byte) (!arg3 ? arg2 + 30 : arg2 + 40);
            super.field4007[super.field4004] = arg1;
            ++super.field4004;
            if (~super.field4004 <= -5001) {
                super.field4004 = 0;
            }
            ++super.field4010;
            ++super.field4013;
            if (~this.field3151 < -1) {
                this.field3149.notifyAll();
            }
        }
    }
}
