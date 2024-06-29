import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class240 extends class462 {

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field3605 = new Object();

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    private int field3607 = 0;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    private int field3608 = 0;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "[Lnd;")
    private class458[] field3610 = new class458[0];

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field3600 = 0;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ldc;I)V")
    public final void method1465(class13 arg0, int arg1) {
        ++field3598;
        Object var3 = this.field3605;
        synchronized (this.field3605) {
            super.field6816[super.field6814] = 21;
            super.field6817[super.field6814] = arg0;
            ++super.field6814;
            ++super.field6813;
            ++super.field6811;
            if (super.field6814 >= 5000) {
                super.field6814 = 0;
            }
            if (arg1 == 5) {
                if (this.field3607 > 0) {
                    this.field3605.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLnd;)V")
    public final void method1466(byte arg0, class458 arg1) {
        ++field3594;
        boolean var3 = false;
        if (arg0 < 5) {
            field3600 = 40;
        }
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field3605;
            byte var7;
            synchronized (this.field3605) {
                while (super.field6813 == 0) {
                    ++this.field3607;
                    this.field3605.wait();
                    --this.field3607;
                }
                var7 = super.field6816[super.field6812];
                if (arg1.field6786 >= 0) {
                    if (~var7 > -1 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field561 = super.field6817[super.field6812];
                    var5 = super.field6818[super.field6812];
                    super.field6817[super.field6812] = null;
                    ++super.field6812;
                    --super.field6813;
                    if (super.field6812 >= 5000) {
                        super.field6812 = 0;
                    }
                }
            }
            if (var3) {
                if (arg1.field6786 >= 0) {
                    if (~var7 == -22) {
                        class236.method1424(arg1, (class13) arg1.field561);
                    } else if (var7 == 20) {
                        class13 var8 = (class13) arg1.field561;
                        if (var8.field167 != null) {
                            var8.field167.method15(class1.field14, 116);
                        }
                        if (var8.field163 != null) {
                            var8.field163.method15(class1.field14, 125);
                        }
                        if (var8.field164 != null) {
                            var8.field164.method15(class1.field14, 115);
                        }
                        if (var8.field149 != null) {
                            var8.field149.method15(class1.field14, 116);
                        }
                        if (var8.field166 != null) {
                            var8.field166.method15(class1.field14, 115);
                        }
                        for (class466 var9 = var8.field151; var9 != null; var9 = var9.field6853) {
                            var9.field6862.method15(class1.field14, 122);
                        }
                    } else if (var7 >= 30 && ~var7 >= -34) {
                        class1.field14.method423(3000.0F, var5 * 1.5F);
                        ((class143) arg1.field561).method107(class319.field4825, class426.field6265, class246.field3690, class423.field6230, var7 + -30 == 0);
                    } else if (~var7 <= -41 && var7 <= 43) {
                        class1.field14.method423(3000.0F, var5 * 1.5F);
                        ((class143) arg1.field561).method107(class319.field4825, class426.field6265, class246.field3690, class60.field774, ~(var7 - 40) == -1);
                    } else if (var7 == 22) {
                        class1.field14.method364(-1, 1583160, 40);
                    } else if (~var7 != -24) {
                        if (var7 == 24) {
                            class1.field14.method408(0, (class147[]) null);
                        } else if (~var7 <= -11 && ~var7 >= -14) {
                            class1.field14.method428(arg1.field6786);
                            arg1.field6786 = -1;
                        }
                    } else {
                        class1.field14.method429();
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    arg1.field6786 = var7;
                    class1.field14.method383(var7);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field3605;
                synchronized (this.field3605) {
                    --super.field6811;
                    if (~super.field6811 == -1) {
                        this.field3605.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)V")
    private final void method1467(int arg0, byte arg1) {
        super.field6816[super.field6814] = (byte) arg0;
        ++field3603;
        ++super.field6814;
        if (super.field6814 >= 5000) {
            super.field6814 = 0;
        }
        ++super.field6811;
        ++super.field6813;
        if (~this.field3607 < -1) {
            Object var3 = this.field3605;
            synchronized (this.field3605) {
                this.field3605.notifyAll();
            }
        }
        int var4 = 18 % ((arg1 - -23) / 59);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V")
    public final void method1468(byte arg0, int arg1) {
        int var3 = 62 / ((arg0 - -66) / 52);
        ++field3606;
        int var4 = 0;
        Object var5 = this.field3605;
        synchronized (this.field3605) {
            if (~this.field3608 == ~arg1) {
                for (int var6 = 0; ~var6 > ~this.field3608; ++var6) {
                    this.method1467(var4++, (byte) 115);
                }
            } else {
                for (int var7 = 0; ~var7 > ~this.field3608; ++var7) {
                    this.field3610[var7].method2839(1);
                }
                this.field3608 = arg1;
                this.field3610 = new class458[this.field3608];
                for (int var8 = 0; this.field3608 > var8; ++var8) {
                    this.field3610[var8] = new class458(this);
                    this.field3610[var8].method2843((byte) -91);
                    this.method1467(var4++, (byte) -86);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
    public final void method1469(int arg0, byte arg1) {
        Object var3 = this.field3605;
        synchronized (this.field3605) {
            super.field6816[super.field6814] = (byte) arg0;
            ++super.field6814;
            if (arg1 != 14) {
                this.method1476(-6);
            }
            ++super.field6811;
            if (super.field6814 >= 5000) {
                super.field6814 = 0;
            }
            ++super.field6813;
            if (this.field3607 > 0) {
                this.field3605.notifyAll();
            }
        }
        ++field3611;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
    private final void method1470(boolean arg0, int arg1) {
        super.field6816[super.field6814] = (byte) (arg1 - -10);
        ++field3609;
        ++super.field6814;
        ++super.field6813;
        if (~super.field6814 <= -5001) {
            super.field6814 = 0;
        }
        if (arg0) {
            this.field3608 = 36;
        }
        ++super.field6811;
        if (this.field3607 > 0) {
            Object var3 = this.field3605;
            synchronized (this.field3605) {
                this.field3605.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILdc;)V")
    public final void method1471(int arg0, class13 arg1) {
        ++field3599;
        Object var3 = this.field3605;
        synchronized (this.field3605) {
            --super.field6812;
            if (super.field6812 < 0) {
                super.field6812 = 4999;
            }
            super.field6816[super.field6812] = 21;
            if (arg0 != 5000) {
                this.method1475(false);
            }
            super.field6817[super.field6812] = arg1;
            ++super.field6811;
            ++super.field6813;
            if (this.field3607 > 0) {
                this.field3605.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ldc;B)V")
    public final void method1472(class13 arg0, byte arg1) {
        ++field3593;
        Object var3 = this.field3605;
        synchronized (this.field3605) {
            if (arg1 != 51) {
                method1474(113);
            }
            super.field6816[super.field6814] = 20;
            super.field6817[super.field6814] = arg0;
            ++super.field6814;
            ++super.field6811;
            if (super.field6814 >= 5000) {
                super.field6814 = 0;
            }
            ++super.field6813;
            if (this.field3607 > 0) {
                this.field3605.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZZLs;F)V")
    public final void method1473(int arg0, boolean arg1, boolean arg2, class143 arg3, float arg4) {
        ++field3602;
        Object var6 = this.field3605;
        synchronized (this.field3605) {
            super.field6816[super.field6814] = (byte) (arg2 ? arg0 + 40 : arg0 + 30);
            super.field6817[super.field6814] = arg3;
            super.field6818[super.field6814] = arg4;
            ++super.field6814;
            if (super.field6814 >= 5000) {
                super.field6814 = 0;
            }
            ++super.field6813;
            ++super.field6811;
            if (arg1) {
                field3601 = 21;
            }
            if (this.field3607 > 0) {
                this.field3605.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
    public static final void method1474(int arg0) {
        class451.field6647 = null;
        if (arg0 != -20561) {
            method1474(-76);
        }
        class440.field6477 = null;
        ++field3596;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    public final void method1475(boolean arg0) {
        ++field3604;
        if (arg0) {
            try {
                Object var2 = this.field3605;
                synchronized (this.field3605) {
                    while (~super.field6811 != -1) {
                        this.field3605.wait();
                    }
                }
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public final void method1476(int arg0) {
        if (arg0 == -6723) {
            Object var2 = this.field3605;
            synchronized (this.field3605) {
                int var3 = 0;
                while (true) {
                    if (this.field3608 <= var3) {
                        break;
                    }
                    if (this.field3610[var3].field6786 >= 0) {
                        this.method1470(false, this.field3610[var3].field6786);
                    }
                    ++var3;
                }
            }
            ++field3595;
        }
    }
}
