import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class496 extends class243 {

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field7177 = new Object();

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    private int field7180 = 0;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    private int field7181 = 0;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "[Lsl;")
    private class418[] field7183 = new class418[0];

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Z")
    public static boolean field7165 = false;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "F")
    public static float field7163;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljo;")
    public static class303 field7167;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLsl;)V", line = 3)
    public final void method2855(boolean arg0, class418 arg1) {
        ++field7174;
        boolean var3 = arg0;
        try {
            boolean var4 = false;
            Object var5 = this.field7177;
            byte var6;
            synchronized (this.field7177) {
                while (~super.field3152 == -1) {
                    ++this.field7180;
                    this.field7177.wait();
                    --this.field7180;
                }
                var6 = super.field3148[super.field3150];
                if (arg1.field5562 >= 0) {
                    if (var6 < 0 || ~var6 < -4) {
                        var3 = true;
                    }
                } else if (~var6 <= -1 && var6 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field2058 = super.field3149[super.field3150];
                    super.field3149[super.field3150] = null;
                    ++super.field3150;
                    if (super.field3150 >= 5000) {
                        super.field3150 = 0;
                    }
                    --super.field3152;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field5562 <= -1) {
                if (var6 != 21) {
                    if (var6 == 20) {
                        class287 var7 = (class287) arg1.field2058;
                        if (var7.field3697 != null) {
                            var7.field3697.method451(class618.field8703, 31055);
                        }
                        if (var7.field3690 != null) {
                            var7.field3690.method451(class618.field8703, 31055);
                        }
                        if (var7.field3678 != null) {
                            var7.field3678.method451(class618.field8703, 31055);
                        }
                        if (var7.field3677 != null) {
                            var7.field3677.method451(class618.field8703, 31055);
                        }
                        if (var7.field3686 != null) {
                            var7.field3686.method451(class618.field8703, 31055);
                        }
                        for (class60 var8 = var7.field3680; var8 != null; var8 = var8.field623) {
                            var8.field625.method451(class618.field8703, 31055);
                        }
                    } else if (~var6 <= -31 && ~var6 >= -34) {
                        ((class137) arg1.field2058).method245(class325.field4238, class75.field789, class658.field9390, class581.field8258, var6 + -30 == 0);
                    } else if (~var6 <= -41 && var6 <= 43) {
                        ((class137) arg1.field2058).method245(class325.field4238, class75.field789, class658.field9390, class321.field4164, ~(var6 + -40) == -1);
                    } else if (~var6 != -23) {
                        if (var6 == 23) {
                            class618.field8703.method339();
                        } else if (var6 != 24) {
                            if (var6 >= 10 && var6 <= 13) {
                                class618.field8703.method322(arg1.field5562);
                                arg1.field5562 = -1;
                            }
                        } else {
                            class618.field8703.method355(0, (class463[]) null);
                        }
                    } else {
                        class618.field8703.method278(-1, 1583160, 40, 127);
                    }
                } else {
                    class397.method2175(arg1, (class287) arg1.field2058);
                }
            } else if (var6 >= 0 && ~var6 >= -4) {
                arg1.field5562 = var6;
                class618.field8703.method288(var6);
            }
        } catch (Exception var21) {
        } finally {
            Object var12 = null;
            if (var3) {
                Object var13 = this.field7177;
                synchronized (this.field7177) {
                    --super.field3153;
                    if (~super.field3153 == -1) {
                        this.field7177.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ld;IZI)V", line = 171)
    public final void method1411(class137 arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != -3172) {
            method2861(true, (byte) -121);
        }
        Object var5 = this.field7177;
        synchronized (this.field7177) {
            super.field3148[super.field3155] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            super.field3149[super.field3155] = arg0;
            ++super.field3155;
            ++super.field3152;
            ++super.field3153;
            if (super.field3155 >= 5000) {
                super.field3155 = 0;
            }
            if (this.field7180 > 0) {
                this.field7177.notifyAll();
            }
        }
        ++field7168;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 197)
    public final void method1412(byte arg0) {
        ++field7169;
        try {
            Object var2 = this.field7177;
            synchronized (this.field7177) {
                int var3 = 117 % ((17 - arg0) / 45);
                while (~super.field3153 != -1) {
                    this.field7177.wait();
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILne;)V", line = 222)
    public final void method1408(int arg0, class287 arg1) {
        ++field7171;
        Object var3 = this.field7177;
        synchronized (this.field7177) {
            super.field3148[super.field3155] = 20;
            super.field3149[super.field3155] = arg1;
            ++super.field3155;
            ++super.field3153;
            if (super.field3155 >= 5000) {
                super.field3155 = 0;
            }
            ++super.field3152;
            if (this.field7180 > arg0) {
                this.field7177.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V", line = 244)
    public static final void method2856(int arg0, int arg1) {
        ++field7170;
        class530 var2 = class242.method1402(-78, 1, arg0);
        var2.method3027((byte) -118);
        if (arg1 >= -87) {
            field7167 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(ILne;)V", line = 257)
    public final void method1409(int arg0, class287 arg1) {
        ++field7184;
        Object var3 = this.field7177;
        synchronized (this.field7177) {
            if (arg0 != 0) {
                field7167 = null;
            }
            super.field3148[super.field3155] = 21;
            super.field3149[super.field3155] = arg1;
            ++super.field3155;
            ++super.field3152;
            if (~super.field3155 <= -5001) {
                super.field3155 = 0;
            }
            ++super.field3153;
            if (~this.field7180 < -1) {
                this.field7177.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 286)
    public final void method1405(int arg0) {
        ++field7175;
        Object var2 = this.field7177;
        synchronized (this.field7177) {
            for (int var3 = 0; ~var3 > ~this.field7181; ++var3) {
                if (~this.field7183[var3].field5562 <= -1) {
                    this.method2857(true, this.field7183[var3].field5562);
                }
            }
            if (arg0 >= -117) {
                this.method1408(45, (class287) null);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 310)
    public final void method1407(int arg0, int arg1) {
        ++field7166;
        int var3 = 0;
        Object var4 = this.field7177;
        synchronized (this.field7177) {
            if (this.field7181 == arg0) {
                for (int var5 = 0; this.field7181 > var5; ++var5) {
                    this.method2862(var3++, 95);
                }
            } else if (arg1 == 3) {
                for (int var6 = 0; ~var6 > ~this.field7181; ++var6) {
                    this.field7183[var6].method2262(-1);
                }
                this.field7181 = arg0;
                this.field7183 = new class418[this.field7181];
                for (int var7 = 0; ~var7 > ~this.field7181; ++var7) {
                    this.field7183[var7] = new class418(this);
                    this.field7183[var7].method2261(89);
                    this.method2862(var3++, 104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLne;)V", line = 363)
    public final void method1406(boolean arg0, class287 arg1) {
        Object var3 = this.field7177;
        synchronized (this.field7177) {
            --super.field3150;
            if (!arg0) {
                field7165 = false;
            }
            if (~super.field3150 > -1) {
                super.field3150 = 4999;
            }
            super.field3148[super.field3150] = 21;
            super.field3149[super.field3150] = arg1;
            ++super.field3152;
            ++super.field3153;
            if (~this.field7180 < -1) {
                this.field7177.notifyAll();
            }
        }
        ++field7178;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)V", line = 387)
    private final void method2857(boolean arg0, int arg1) {
        super.field3148[super.field3155] = (byte) (arg1 + 10);
        ++field7176;
        if (!arg0) {
            this.method1413(-111, -34);
        }
        ++super.field3155;
        ++super.field3152;
        if (super.field3155 >= 5000) {
            super.field3155 = 0;
        }
        ++super.field3153;
        if (this.field7180 > 0) {
            Object var3 = this.field7177;
            synchronized (this.field7177) {
                this.field7177.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 412)
    public static void method2858(int arg0) {
        field7167 = null;
        if (arg0 >= -2) {
            method2859(-91, -101, -61);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V", line = 425)
    public static final void method2859(int arg0, int arg1, int arg2) {
        if (class637.field9019 < class637.field9024) {
            class637.field9019 = (float) ((double) class637.field9019 / 30.0D + (double) class637.field9019);
            if (class637.field9024 < class637.field9019) {
                class637.field9019 = class637.field9024;
            }
            class99.method613((byte) 97);
            class637.field9023 = (int) class637.field9019 >> 1;
            class637.field9020 = class598.method3345(false, class637.field9023);
        } else if (class637.field9019 > class637.field9024) {
            class637.field9019 = (float) ((double) class637.field9019 - (double) class637.field9019 / 30.0D);
            if (class637.field9019 < class637.field9024) {
                class637.field9019 = class637.field9024;
            }
            class99.method613((byte) 123);
            class637.field9023 = (int) class637.field9019 >> 1;
            class637.field9020 = class598.method3345(false, class637.field9023);
        }
        ++field7182;
        if (~class472.field6590 != 0 && class580.field8249 != -1) {
            int var3 = -class306.field3998 + class472.field6590;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class122.field1375 + class580.field8249;
            if (~var4 > -3 || var4 > 2) {
                var4 /= 8;
            }
            class306.field3998 += var3;
            if (var3 == 0 && var4 == 0) {
                class580.field8249 = -1;
                class472.field6590 = -1;
            }
            class122.field1375 += var4;
            class99.method613((byte) 106);
        }
        if (class235.field2997 <= arg2) {
            class685.field9699 = -1;
            class388.field5189 = -1;
        } else {
            --class2.field19;
            if (~class2.field19 == -1) {
                --class235.field2997;
                class2.field19 = 100;
            }
        }
        if (class285.field3657 && class504.field7252 != null) {
            for (class433 var5 = (class433) class504.field7252.method3174((byte) 49); var5 != null; var5 = (class433) class504.field7252.method3168(false)) {
                class89 var6 = class637.field9013.method1972(var5.field5706.field3483, (byte) -18);
                if (var5.method2312(arg1, arg0, Integer.MAX_VALUE)) {
                    if (var6.field948 != null) {
                        if (var6.field948[4] != null) {
                            class459.method2618(false, arg2 ^ 500, -1, var6.field951, var6.field967, true, 0, (long) var5.field5706.field3483, var6.field948[4], 1003, -1);
                        }
                        if (var6.field948[3] != null) {
                            class459.method2618(false, 500, -1, var6.field951, var6.field967, true, 0, (long) var5.field5706.field3483, var6.field948[3], 1006, -1);
                        }
                        if (var6.field948[2] != null) {
                            class459.method2618(false, 500, -1, var6.field951, var6.field967, true, 0, (long) var5.field5706.field3483, var6.field948[2], 1010, -1);
                        }
                        if (var6.field948[1] != null) {
                            class459.method2618(false, arg2 + 500, -1, var6.field951, var6.field967, true, 0, (long) var5.field5706.field3483, var6.field948[1], 1001, -1);
                        }
                        if (var6.field948[0] != null) {
                            class459.method2618(false, 500, -1, var6.field951, var6.field967, true, 0, (long) var5.field5706.field3483, var6.field948[0], 1007, -1);
                        }
                    }
                    if (!var5.field5706.field3486) {
                        var5.field5706.field3486 = true;
                        class364.method2008(class408.field5433, var5.field5706.field3483, var6.field967);
                    }
                    if (var5.field5706.field3486) {
                        class364.method2008(class684.field9693, var5.field5706.field3483, var6.field967);
                    }
                } else if (var5.field5706.field3486) {
                    var5.field5706.field3486 = false;
                    class364.method2008(class272.field3442, var5.field5706.field3483, var6.field967);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIII)V", line = 560)
    public static final void method2860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7173;
        if (class315.method1784(arg3, 4269)) {
            if (arg6 == -1) {
                if (class461.field6408[arg3] != null) {
                    client.method1527(class461.field6408[arg3], -1, arg7, arg1, arg0, arg5, arg9, arg8, arg2, arg4);
                } else {
                    client.method1527(class271.field3434[arg3], -1, arg7, arg1, arg0, arg5, arg9, arg8, arg2, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZB)V", line = 583)
    public static final void method2861(boolean arg0, byte arg1) {
        if (arg1 < 103) {
            field7165 = false;
        }
        ++field7179;
        class312.field4030.method1754(109, arg0 || class453.field6284 != null && class453.field6284.method338());
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V", line = 597)
    public final void method1413(int arg0, int arg1) {
        ++field7172;
        Object var3 = this.field7177;
        synchronized (this.field7177) {
            super.field3148[super.field3155] = (byte) arg1;
            ++super.field3155;
            ++super.field3152;
            if (~super.field3155 <= -5001) {
                super.field3155 = 0;
            }
            ++super.field3153;
            if (arg0 != -8076) {
                this.method1405(99);
            }
            if (~this.field7180 < -1) {
                this.field7177.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V", line = 629)
    private final void method2862(int arg0, int arg1) {
        ++field7164;
        super.field3148[super.field3155] = (byte) arg0;
        ++super.field3155;
        if (~super.field3155 <= -5001) {
            super.field3155 = 0;
        }
        ++super.field3152;
        if (arg1 < 92) {
            this.field7177 = null;
        }
        ++super.field3153;
        if (~this.field7180 < -1) {
            Object var3 = this.field7177;
            synchronized (this.field7177) {
                this.field7177.notifyAll();
            }
        }
    }
}
