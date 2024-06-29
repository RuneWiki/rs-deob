import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class674 extends class92 {

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Ljava/lang/Object;")
    private Object field9552 = new Object();

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "[Lab;")
    private class539[] field9554 = new class539[0];

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    private int field9556 = 0;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    private int field9555 = 0;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
    public static boolean field9548 = false;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "F")
    public static float field9550;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V")
    private final void method3723(byte arg0, int arg1) {
        super.field1130[super.field1137] = (byte) (arg1 - -10);
        ++field9544;
        ++super.field1137;
        ++super.field1136;
        ++super.field1133;
        if (arg0 == -59) {
            if (super.field1137 >= 5000) {
                super.field1137 = 0;
            }
            if (~this.field9556 < -1) {
                Object var3 = this.field9552;
                synchronized (this.field9552) {
                    this.field9552.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Laf;I)V")
    public final void method513(class651 arg0, int arg1) {
        ++field9547;
        Object var3 = this.field9552;
        synchronized (this.field9552) {
            --super.field1138;
            if (~super.field1138 > -1) {
                super.field1138 = 4999;
            }
            super.field1130[super.field1138] = 21;
            super.field1132[super.field1138] = arg0;
            ++super.field1133;
            ++super.field1136;
            if (this.field9556 > 0) {
                this.field9552.notifyAll();
            }
        }
        if (arg1 != 5000) {
            this.method513((class651) null, -88);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Laf;I)V")
    public final void method512(class651 arg0, int arg1) {
        Object var3 = this.field9552;
        synchronized (this.field9552) {
            super.field1130[super.field1137] = 20;
            super.field1132[super.field1137] = arg0;
            ++super.field1137;
            ++super.field1133;
            if (arg1 != 19048) {
                this.method517(true, -29);
            }
            ++super.field1136;
            if (~super.field1137 <= -5001) {
                super.field1137 = 0;
            }
            if (this.field9556 > 0) {
                this.field9552.notifyAll();
            }
        }
        ++field9543;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ld;IZI)V")
    public final void method516(class176 arg0, int arg1, boolean arg2, int arg3) {
        ++field9541;
        Object var5 = this.field9552;
        synchronized (this.field9552) {
            super.field1130[super.field1137] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            super.field1132[super.field1137] = arg0;
            ++super.field1137;
            ++super.field1136;
            ++super.field1133;
            if (~super.field1137 <= -5001) {
                super.field1137 = 0;
            }
            if (arg1 != -1) {
                this.field9552 = null;
            }
            if (this.field9556 > 0) {
                this.field9552.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILaf;)V")
    public final void method511(int arg0, class651 arg1) {
        Object var3 = this.field9552;
        synchronized (this.field9552) {
            if (arg0 < 89) {
                this.method510(true);
            }
            super.field1130[super.field1137] = 21;
            super.field1132[super.field1137] = arg1;
            ++super.field1137;
            if (super.field1137 >= 5000) {
                super.field1137 = 0;
            }
            ++super.field1133;
            ++super.field1136;
            if (this.field9556 > 0) {
                this.field9552.notifyAll();
            }
        }
        ++field9549;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public final void method510(boolean arg0) {
        try {
            Object var2 = this.field9552;
            synchronized (this.field9552) {
                while (true) {
                    if (~super.field1133 == -1) {
                        break;
                    }
                    this.field9552.wait();
                }
            }
        } catch (Exception var4) {
        }
        if (arg0) {
            ++field9553;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        ++field9545;
        int var3 = 0;
        Object var4 = this.field9552;
        synchronized (this.field9552) {
            if (~this.field9555 == ~arg1) {
                for (int var5 = 0; ~var5 > ~this.field9555; ++var5) {
                    this.method3725(var3++, 5);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field9555; ++var6) {
                    this.field9554[var6].method3037(false);
                }
                this.field9555 = arg1;
                this.field9554 = new class539[this.field9555];
                if (arg0) {
                    this.method3724((class539) null, (byte) 24);
                }
                for (int var7 = 0; var7 < this.field9555; ++var7) {
                    this.field9554[var7] = new class539(this);
                    this.field9554[var7].method3038(31497);
                    this.method3725(var3++, 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lab;B)V")
    public final void method3724(class539 arg0, byte arg1) {
        ++field9540;
        boolean var3 = false;
        try {
            int var4 = -124 % ((arg1 - 54) / 48);
            boolean var5 = false;
            Object var6 = this.field9552;
            byte var7;
            synchronized (this.field9552) {
                while (super.field1136 == 0) {
                    ++this.field9556;
                    this.field9552.wait();
                    --this.field9556;
                }
                var7 = super.field1130[super.field1138];
                if (arg0.field7384 >= 0) {
                    if (~var7 > -1 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field3518 = super.field1132[super.field1138];
                    super.field1132[super.field1138] = null;
                    ++super.field1138;
                    if (~super.field1138 <= -5001) {
                        super.field1138 = 0;
                    }
                    --super.field1136;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg0.field7384 <= -1) {
                if (~var7 == -22) {
                    class176.method1164(arg0, (class651) arg0.field3518);
                } else if (var7 == 20) {
                    class651 var8 = (class651) arg0.field3518;
                    if (var8.field9220 != null) {
                        var8.field9220.method123((byte) 96, class277.field3750);
                    }
                    if (var8.field9224 != null) {
                        var8.field9224.method123((byte) 100, class277.field3750);
                    }
                    if (var8.field9238 != null) {
                        var8.field9238.method123((byte) 108, class277.field3750);
                    }
                    if (var8.field9234 != null) {
                        var8.field9234.method123((byte) 113, class277.field3750);
                    }
                    if (var8.field9227 != null) {
                        var8.field9227.method123((byte) 96, class277.field3750);
                    }
                    for (class82 var9 = var8.field9228; var9 != null; var9 = var9.field1024) {
                        var9.field1027.method123((byte) 103, class277.field3750);
                    }
                } else if (~var7 <= -31 && var7 <= 33) {
                    ((class176) arg0.field3518).method149(class297.field3975, class274.field3710, class351.field5123, class554.field7580, var7 + -30 == 0);
                } else if (~var7 <= -41 && var7 <= 43) {
                    ((class176) arg0.field3518).method149(class297.field3975, class274.field3710, class351.field5123, class32.field307, ~(var7 + -40) == -1);
                } else if (var7 != 22) {
                    if (var7 != 23) {
                        if (~var7 != -25) {
                            if (var7 >= 10 && ~var7 >= -14) {
                                class277.field3750.method1794(arg0.field7384);
                                arg0.field7384 = -1;
                            }
                        } else {
                            class277.field3750.method2016(0, (class329[]) null);
                        }
                    } else {
                        class277.field3750.method1953();
                    }
                } else {
                    class277.field3750.method1878(-1, 1583160, 40, 127);
                }
            } else if (var7 >= 0 && ~var7 >= -4) {
                arg0.field7384 = var7;
                class277.field3750.method1797(var7);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field9552;
                synchronized (this.field9552) {
                    --super.field1133;
                    if (super.field1133 == 0) {
                        this.field9552.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    private final void method3725(int arg0, int arg1) {
        super.field1130[super.field1137] = (byte) arg0;
        ++field9546;
        ++super.field1137;
        if (super.field1137 >= 5000) {
            super.field1137 = 0;
        }
        ++super.field1133;
        ++super.field1136;
        if (arg1 == 5) {
            if (~this.field9556 < -1) {
                Object var3 = this.field9552;
                synchronized (this.field9552) {
                    this.field9552.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
    public final void method509(boolean arg0, int arg1) {
        Object var3 = this.field9552;
        synchronized (this.field9552) {
            super.field1130[super.field1137] = (byte) arg1;
            ++super.field1137;
            if (~super.field1137 <= -5001) {
                super.field1137 = 0;
            }
            ++super.field1133;
            ++super.field1136;
            if (~this.field9556 < -1) {
                this.field9552.notifyAll();
            }
        }
        ++field9551;
        if (arg0) {
            field9548 = false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public final void method515(int arg0) {
        Object var2 = this.field9552;
        synchronized (this.field9552) {
            int var3 = 0;
            if (arg0 != -30473) {
                return;
            }
            while (true) {
                if (this.field9555 <= var3) {
                    break;
                }
                if (this.field9554[var3].field7384 >= 0) {
                    this.method3723((byte) -59, this.field9554[var3].field7384);
                }
                ++var3;
            }
        }
        ++field9542;
    }
}
