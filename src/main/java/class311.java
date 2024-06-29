import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class311 extends class236 {

    @OriginalMember(owner = "client!os", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field4531 = new Object();

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    private int field4535 = 0;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "[Log;")
    private class467[] field4537 = new class467[0];

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    private int field4538 = 0;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "Lfc;")
    public static class174 field4524 = new class174(260);

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ILrb;)V")
    public final void method1457(int arg0, class239 arg1) {
        Object var3 = this.field4531;
        synchronized (this.field4531) {
            --super.field3435;
            if (super.field3435 < 0) {
                super.field3435 = 4999;
            }
            super.field3432[super.field3435] = 21;
            super.field3433[super.field3435] = arg1;
            ++super.field3443;
            ++super.field3430;
            if (this.field4535 > 0) {
                this.field4531.notifyAll();
            }
        }
        ++field4521;
        int var4 = -49 % ((arg0 - 8) / 41);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLrb;)V")
    public final void method1450(byte arg0, class239 arg1) {
        ++field4532;
        Object var3 = this.field4531;
        synchronized (this.field4531) {
            super.field3432[super.field3429] = 20;
            super.field3433[super.field3429] = arg1;
            ++super.field3429;
            ++super.field3443;
            int var4 = -18 / ((arg0 - -61) / 47);
            ++super.field3430;
            if (super.field3429 >= 5000) {
                super.field3429 = 0;
            }
            if (~this.field4535 < -1) {
                this.field4531.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Log;I)V")
    public final void method1881(class467 arg0, int arg1) {
        ++field4529;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            int var6 = 126 / ((38 - arg1) / 63);
            Object var7 = this.field4531;
            byte var8;
            synchronized (this.field4531) {
                while (~super.field3430 == -1) {
                    ++this.field4535;
                    this.field4531.wait();
                    --this.field4535;
                }
                var8 = super.field3432[super.field3435];
                if (arg0.field6525 < 0) {
                    if (var8 >= 0 && ~var8 >= -4) {
                        var3 = true;
                    }
                } else if (var8 < 0 || ~var8 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field1664 = super.field3433[super.field3435];
                    var5 = super.field3437[super.field3435];
                    super.field3433[super.field3435] = null;
                    ++super.field3435;
                    --super.field3430;
                    if (super.field3435 >= 5000) {
                        super.field3435 = 0;
                    }
                }
            }
            if (var3) {
                if (~arg0.field6525 > -1) {
                    if (var8 >= 0 && ~var8 >= -4) {
                        arg0.field6525 = var8;
                        class489.field6839.method375(var8);
                    }
                } else if (var8 == 21) {
                    class530.method3114(arg0, (class239) arg0.field1664);
                } else if (var8 != 20) {
                    if (var8 >= 30 && ~var8 >= -34) {
                        class489.field6839.method365(3000.0F, var5 * 1.5F);
                        ((class38) arg0.field1664).method2(class88.field1096, class204.field2910, class153.field2206, class477.field6647, var8 + -30 == 0);
                    } else if (~var8 <= -41 && var8 <= 43) {
                        class489.field6839.method365(3000.0F, var5 * 1.5F);
                        ((class38) arg0.field1664).method2(class88.field1096, class204.field2910, class153.field2206, class12.field156, var8 + -40 == 0);
                    } else if (var8 == 22) {
                        class489.field6839.method355(-1, 1583160, 40, 127);
                    } else if (var8 != 23) {
                        if (var8 != 24) {
                            if (~var8 <= -11 && var8 <= 13) {
                                class489.field6839.method389(arg0.field6525);
                                arg0.field6525 = -1;
                            }
                        } else {
                            class489.field6839.method352(0, (class95[]) null);
                        }
                    } else {
                        class489.field6839.method320();
                    }
                } else {
                    class239 var9 = (class239) arg0.field1664;
                    if (var9.field3487 != null) {
                        var9.field3487.method130(class489.field6839, 0);
                    }
                    if (var9.field3473 != null) {
                        var9.field3473.method130(class489.field6839, 0);
                    }
                    if (var9.field3474 != null) {
                        var9.field3474.method130(class489.field6839, 0);
                    }
                    if (var9.field3471 != null) {
                        var9.field3471.method130(class489.field6839, 0);
                    }
                    if (var9.field3493 != null) {
                        var9.field3493.method130(class489.field6839, 0);
                    }
                    for (class134 var10 = var9.field3482; var10 != null; var10 = var10.field1755) {
                        var10.field1761.method130(class489.field6839, 0);
                    }
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field4531;
                synchronized (this.field4531) {
                    --super.field3443;
                    if (~super.field3443 == -1) {
                        this.field4531.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public static void method1882(boolean arg0) {
        field4524 = null;
        if (arg0) {
            field4524 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public final void method1446(byte arg0) {
        Object var2 = this.field4531;
        synchronized (this.field4531) {
            int var3 = 0;
            while (true) {
                if (~this.field4538 >= ~var3) {
                    int var4 = -49 / ((arg0 - -21) / 44);
                    break;
                }
                if (~this.field4537[var3].field6525 <= -1) {
                    this.method1883(this.field4537[var3].field6525, -82);
                }
                ++var3;
            }
        }
        ++field4526;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
    private final void method1883(int arg0, int arg1) {
        ++field4523;
        super.field3432[super.field3429] = (byte) (arg0 + 10);
        ++super.field3429;
        ++super.field3443;
        if (super.field3429 >= 5000) {
            super.field3429 = 0;
        }
        int var3 = -20 % ((arg1 - -21) / 33);
        ++super.field3430;
        if (this.field4535 > 0) {
            Object var4 = this.field4531;
            synchronized (this.field4531) {
                this.field4531.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
    public final void method1449(byte arg0) {
        try {
            Object var2 = this.field4531;
            synchronized (this.field4531) {
                while (true) {
                    if (super.field3443 == 0) {
                        break;
                    }
                    this.field4531.wait();
                }
            }
            int var3 = 75 / ((-38 - arg0) / 39);
        } catch (Exception var5) {
        }
        ++field4525;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILhm;Lza;)V")
    public static final void method1884(int arg0, class150 arg1, class290 arg2) {
        ++field4539;
        boolean var3 = class344.field5000.method992(arg1.field1995, arg1.field2109, arg2, arg1.field2089, arg1.field2103 | arg0, -108, !arg1.field2067 ? null : class246.field3587.field288, arg1.field1996) == null;
        if (var3) {
            class344.field5002.method2657(8492, new class101(arg1.field2089, arg1.field1995, arg1.field2109, arg1.field2103 | -16777216, arg1.field1996, arg1.field2067));
            class187.method1190(arg1, 119);
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
    private final void method1885(int arg0, int arg1) {
        super.field3432[super.field3429] = (byte) arg0;
        ++field4522;
        ++super.field3429;
        ++super.field3430;
        ++super.field3443;
        if (super.field3429 >= 5000) {
            super.field3429 = 0;
        }
        if (arg1 != 2) {
            method1887(true, true, -7);
        }
        if (this.field4535 > 0) {
            Object var3 = this.field4531;
            synchronized (this.field4531) {
                this.field4531.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(II)Z")
    public static final boolean method1886(int arg0, int arg1) {
        if (arg0 != -25866) {
            return false;
        } else {
            ++field4533;
            return arg1 == 6 || arg1 == 7 || ~arg1 == -9;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILrb;)V")
    public final void method1455(int arg0, class239 arg1) {
        Object var3 = this.field4531;
        synchronized (this.field4531) {
            super.field3432[super.field3429] = 21;
            super.field3433[super.field3429] = arg1;
            ++super.field3429;
            ++super.field3443;
            ++super.field3430;
            if (~super.field3429 <= -5001) {
                super.field3429 = 0;
            }
            if (this.field4535 > 0) {
                this.field4531.notifyAll();
            }
        }
        if (arg0 > -95) {
            this.field4538 = 82;
        }
        ++field4528;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZZI)V")
    public static final void method1887(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            --class422.field5950;
            if (~class422.field5950 == -1) {
                class538.field7872 = null;
            }
        }
        if (arg2 != 0) {
            field4524 = null;
        }
        ++field4530;
        if (arg0) {
            --class267.field3899;
            if (~class267.field3899 == -1) {
                class391.field5502 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZILya;FI)V")
    public final void method1451(boolean arg0, int arg1, class38 arg2, float arg3, int arg4) {
        ++field4536;
        Object var6 = this.field4531;
        synchronized (this.field4531) {
            super.field3432[super.field3429] = (byte) (!arg0 ? arg4 + 30 : arg4 + 40);
            super.field3433[super.field3429] = arg2;
            super.field3437[super.field3429] = arg3;
            ++super.field3429;
            ++super.field3430;
            ++super.field3443;
            if (super.field3429 >= 5000) {
                super.field3429 = 0;
            }
            if (this.field4535 > arg1) {
                this.field4531.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
    public final void method1454(byte arg0, int arg1) {
        Object var3 = this.field4531;
        synchronized (this.field4531) {
            super.field3432[super.field3429] = (byte) arg1;
            int var4 = 94 / ((-7 - arg0) / 56);
            ++super.field3429;
            ++super.field3443;
            ++super.field3430;
            if (super.field3429 >= 5000) {
                super.field3429 = 0;
            }
            if (this.field4535 > 0) {
                this.field4531.notifyAll();
            }
        }
        ++field4534;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
    public final void method1456(int arg0, int arg1) {
        ++field4527;
        int var3 = 0;
        Object var4 = this.field4531;
        synchronized (this.field4531) {
            if (this.field4538 == arg1) {
                for (int var5 = 0; var5 < this.field4538; ++var5) {
                    this.method1885(var3++, 2);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field4538; ++var6) {
                    this.field4537[var6].method2708((byte) -95);
                }
                this.field4538 = arg1;
                this.field4537 = new class467[this.field4538];
                for (int var7 = 0; var7 < this.field4538; ++var7) {
                    this.field4537[var7] = new class467(this);
                    this.field4537[var7].method2706(arg0 ^ -111);
                    this.method1885(var3++, arg0 ^ 6);
                }
                if (arg0 != 4) {
                    this.field4535 = 3;
                }
            }
        }
    }
}
