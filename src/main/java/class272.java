import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class272 extends class314 {

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field3868 = new Object();

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    private int field3869 = 0;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "[Lfb;")
    private class401[] field3870 = new class401[0];

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    private int field3871 = 0;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Ljf;")
    public static class119 field3849;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "Lra;")
    public static class57 field3860;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
    private final void method1723(int arg0, int arg1) {
        super.field4469[super.field4473] = (byte) (arg1 - -10);
        ++field3862;
        ++super.field4473;
        ++super.field4479;
        if (super.field4473 >= 5000) {
            super.field4473 = 0;
        }
        ++super.field4478;
        int var3 = 32 / ((-52 - arg0) / 59);
        if (~this.field3869 < -1) {
            Object var4 = this.field3868;
            synchronized (this.field3868) {
                this.field3868.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public final void method1093(byte arg0) {
        ++field3863;
        try {
            Object var2 = this.field3868;
            synchronized (this.field3868) {
                if (arg0 == 89) {
                    while (super.field4478 != 0) {
                        this.field3868.wait();
                    }
                }
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIIILmj;IILen;I)Lmj;")
    public static final class393 method1724(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class393 arg6, int arg7, int arg8, class174 arg9, int arg10) {
        ++field3855;
        long var11 = (long) arg0;
        class393 var13 = (class393) class329.field4707.method2049(-118, var11);
        int var14 = -113 / ((-4 - arg1) / 58);
        short var15 = 1031;
        if (var13 == null) {
            class200 var16 = class38.method227(arg0, class144.field2031, 0, false);
            if (var16 == null) {
                return null;
            }
            var13 = arg9.method991(var16, var15, class410.field5933, 64, 768);
            class329.field4707.method2046(var11, 0, var13);
        }
        class393 var17 = var13.method717((byte) 2, var15, true);
        if (~arg8 != -1) {
            var17.method723(arg8);
        }
        if (arg7 != 0) {
            var17.method737(arg7);
        }
        if (arg3 != 0) {
            var17.method767(arg3);
        }
        if (arg10 != 0) {
            var17.method758(0, arg10, 0);
        }
        return var17;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILdn;)V")
    public final void method1099(int arg0, class302 arg1) {
        ++field3856;
        Object var3 = this.field3868;
        synchronized (this.field3868) {
            --super.field4471;
            if (super.field4471 < 0) {
                super.field4471 = 4999;
            }
            super.field4469[super.field4471] = 21;
            super.field4480[super.field4471] = arg1;
            ++super.field4478;
            ++super.field4479;
            if (this.field3869 > arg0) {
                this.field3868.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static void method1725(int arg0) {
        if (arg0 < 62) {
            field3853 = -4;
        }
        field3860 = null;
        field3849 = null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)V")
    public static final void method1726(int arg0, int arg1, int arg2) {
        ++field3864;
        class348 var3 = class385.method2464(1, arg0 ^ 918, arg1);
        var3.method2216((byte) 23);
        if (arg0 == 1664) {
            var3.field5093 = arg2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB[B)I")
    public static final int method1727(int arg0, byte arg1, byte[] arg2) {
        ++field3861;
        if (arg1 != 110) {
            method1725(-112);
        }
        return class426.method2655(0, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ldn;B)V")
    public final void method1096(class302 arg0, byte arg1) {
        int var3 = 53 / ((arg1 - 39) / 32);
        ++field3867;
        Object var4 = this.field3868;
        synchronized (this.field3868) {
            super.field4469[super.field4473] = 20;
            super.field4480[super.field4473] = arg0;
            ++super.field4473;
            if (super.field4473 >= 5000) {
                super.field4473 = 0;
            }
            ++super.field4478;
            ++super.field4479;
            if (~this.field3869 < -1) {
                this.field3868.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLfb;)V")
    public final void method1728(byte arg0, class401 arg1) {
        ++field3850;
        boolean var3 = false;
        boolean var25 = false;
        label383: {
            try {
                try {
                    label384: {
                        var25 = true;
                        boolean var4 = false;
                        float var5 = 0.0F;
                        Object var6 = this.field3868;
                        byte var7;
                        synchronized (this.field3868) {
                            while (super.field4479 == 0) {
                                ++this.field3869;
                                this.field3868.wait();
                                --this.field3869;
                            }
                            if (arg0 != -20) {
                                Object var10000 = null;
                                var25 = false;
                                break label384;
                            }
                            var7 = super.field4469[super.field4471];
                            if (arg1.field5820 < 0) {
                                if (~var7 <= -1 && ~var7 >= -4) {
                                    var3 = true;
                                }
                            } else if (var7 < 0 || var7 > 3) {
                                var3 = true;
                            }
                            if (var3) {
                                arg1.field5281 = super.field4480[super.field4471];
                                var5 = super.field4470[super.field4471];
                                super.field4480[super.field4471] = null;
                                ++super.field4471;
                                --super.field4479;
                                if (~super.field4471 <= -5001) {
                                    super.field4471 = 0;
                                }
                            }
                        }
                        if (var3) {
                            if (~arg1.field5820 > -1) {
                                if (var7 >= 0) {
                                    if (~var7 >= -4) {
                                        arg1.field5820 = var7;
                                        class118.field1400.method985(var7);
                                        var25 = false;
                                    } else {
                                        var25 = false;
                                    }
                                } else {
                                    var25 = false;
                                }
                            } else if (var7 == 21) {
                                class102.method556(arg1, (class302) arg1.field5281);
                                var25 = false;
                            } else if (~var7 == -21) {
                                class302 var8 = (class302) arg1.field5281;
                                if (var8.field4313 != null) {
                                    var8.field4313.method211(class118.field1400, 0);
                                }
                                if (var8.field4324 != null) {
                                    var8.field4324.method211(class118.field1400, 0);
                                }
                                if (var8.field4311 != null) {
                                    var8.field4311.method211(class118.field1400, 0);
                                }
                                if (var8.field4306 != null) {
                                    var8.field4306.method211(class118.field1400, 0);
                                }
                                if (var8.field4310 != null) {
                                    var8.field4310.method211(class118.field1400, 0);
                                }
                                for (class299 var9 = var8.field4308; var9 != null; var9 = var9.field4263) {
                                    var9.field4261.method211(class118.field1400, 0);
                                }
                                var25 = false;
                            } else if (var7 >= 30 && ~var7 >= -34) {
                                class118.field1400.method1017(3000.0F, var5 * 1.5F);
                                ((class319) arg1.field5281).method1987(class239.field3251, class326.field4585, class118.field1410, class289.field4111, var7 - 30 == 0);
                                var25 = false;
                            } else if (var7 >= 40 && var7 <= 43) {
                                class118.field1400.method1017(3000.0F, var5 * 1.5F);
                                ((class319) arg1.field5281).method1987(class239.field3251, class326.field4585, class118.field1410, class240.field3264, ~(var7 + -40) == -1);
                                var25 = false;
                            } else if (~var7 != -23) {
                                if (~var7 != -24) {
                                    if (var7 == 24) {
                                        class118.field1400.method926(0, (class33[]) null);
                                        var25 = false;
                                    } else if (var7 >= 10) {
                                        if (var7 <= 13) {
                                            class118.field1400.method998(arg1.field5820);
                                            arg1.field5820 = -1;
                                            var25 = false;
                                        } else {
                                            var25 = false;
                                        }
                                    } else {
                                        var25 = false;
                                    }
                                } else {
                                    class118.field1400.method924();
                                    var25 = false;
                                }
                            } else {
                                class118.field1400.method961(-1, 1583160, 40);
                                var25 = false;
                            }
                        } else {
                            Thread.yield();
                            var25 = false;
                        }
                    }
                } catch (Exception var30) {
                    var25 = false;
                }
                break label383;
            } finally {
                if (var25) {
                    Object var17 = null;
                    if (var3) {
                        Object var18 = this.field3868;
                        synchronized (this.field3868) {
                            --super.field4478;
                            if (~super.field4478 == -1) {
                                this.field3868.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var14 = this.field3868;
                synchronized (this.field3868) {
                    --super.field4478;
                    if (~super.field4478 == -1) {
                        this.field3868.notifyAll();
                    }
                }
            }
            return;
        }
        Object var15 = null;
        if (var3) {
            Object var16 = this.field3868;
            synchronized (this.field3868) {
                --super.field4478;
                if (~super.field4478 == -1) {
                    this.field3868.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IFLac;ZI)V")
    public final void method1102(int arg0, float arg1, class319 arg2, boolean arg3, int arg4) {
        Object var6 = this.field3868;
        synchronized (this.field3868) {
            super.field4469[super.field4473] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
            super.field4480[super.field4473] = arg2;
            super.field4470[super.field4473] = arg1;
            ++super.field4473;
            if (~super.field4473 <= -5001) {
                super.field4473 = 0;
            }
            ++super.field4479;
            ++super.field4478;
            if (this.field3869 > 0) {
                this.field3868.notifyAll();
            }
        }
        ++field3857;
        if (arg4 != 1) {
            this.method1728((byte) 119, (class401) null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static final void method1729(int arg0) {
        ++field3865;
        if (!class206.field2803) {
            class404.field5889 = true;
            class206.field2803 = true;
            if (arg0 != -21453) {
                field3860 = null;
            }
            if (!class291.field4173) {
                class8.field107 += (24.0F - class8.field107) / 2.0F;
            } else {
                class276.field3893 = (float) (-128 & (int) class276.field3893 + 191);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public final void method1098(byte arg0) {
        if (arg0 != -67) {
            this.method1091((class302) null, -61);
        }
        ++field3854;
        Object var2 = this.field3868;
        synchronized (this.field3868) {
            for (int var3 = 0; ~var3 > ~this.field3871; ++var3) {
                if (~this.field3870[var3].field5820 <= -1) {
                    this.method1723(-116, this.field3870[var3].field5820);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ldn;I)V")
    public final void method1091(class302 arg0, int arg1) {
        Object var3 = this.field3868;
        synchronized (this.field3868) {
            super.field4469[super.field4473] = 21;
            super.field4480[super.field4473] = arg0;
            ++super.field4473;
            if (arg1 != -32426) {
                return;
            }
            ++super.field4478;
            ++super.field4479;
            if (~super.field4473 <= -5001) {
                super.field4473 = 0;
            }
            if (~this.field3869 < -1) {
                this.field3868.notifyAll();
            }
        }
        ++field3858;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public final void method1097(int arg0, int arg1) {
        Object var3 = this.field3868;
        synchronized (this.field3868) {
            super.field4469[super.field4473] = (byte) arg0;
            ++super.field4473;
            ++super.field4478;
            if (arg1 != 7) {
                field3852 = 63;
            }
            if (~super.field4473 <= -5001) {
                super.field4473 = 0;
            }
            ++super.field4479;
            if (~this.field3869 < -1) {
                this.field3868.notifyAll();
            }
        }
        ++field3866;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V")
    public final void method1095(byte arg0, int arg1) {
        ++field3859;
        int var3 = 0;
        Object var4 = this.field3868;
        synchronized (this.field3868) {
            if (this.field3871 == arg1) {
                for (int var5 = 0; ~var5 > ~this.field3871; ++var5) {
                    this.method1730(var3++, false);
                }
            } else {
                int var6 = 0;
                if (arg0 != 73) {
                    method1726(-21, 45, 100);
                }
                while (~this.field3871 < ~var6) {
                    this.field3870[var6].method2541(true);
                    ++var6;
                }
                this.field3871 = arg1;
                this.field3870 = new class401[this.field3871];
                for (int var7 = 0; var7 < this.field3871; ++var7) {
                    this.field3870[var7] = new class401(this);
                    this.field3870[var7].method2540((byte) 110);
                    this.method1730(var3++, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
    private final void method1730(int arg0, boolean arg1) {
        ++field3851;
        if (arg1) {
            field3849 = null;
        }
        super.field4469[super.field4473] = (byte) arg0;
        ++super.field4473;
        ++super.field4479;
        ++super.field4478;
        if (super.field4473 >= 5000) {
            super.field4473 = 0;
        }
        if (this.field3869 > 0) {
            Object var3 = this.field3868;
            synchronized (this.field3868) {
                this.field3868.notifyAll();
            }
        }
    }
}
