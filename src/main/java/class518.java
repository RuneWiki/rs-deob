import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class518 extends class431 {

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field7696 = new Object();

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "[Lcb;")
    private class359[] field7710 = new class359[0];

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    private int field7709 = 0;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field7712 = 0;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field7708 = 0;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "Ljava/lang/String;")
    public static String field7711;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V", line = 7)
    public final void method331(int arg0, int arg1) {
        ++field7701;
        Object var3 = this.field7696;
        synchronized (this.field7696) {
            int var4 = -46 % ((arg0 - 30) / 48);
            super.field6414[super.field6409] = (byte) arg1;
            ++super.field6409;
            if (~super.field6409 <= -5001) {
                super.field6409 = 0;
            }
            ++super.field6413;
            ++super.field6406;
            if (~this.field7709 < -1) {
                this.field7696.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 29)
    public final void method329(byte arg0) {
        ++field7707;
        try {
            Object var2 = this.field7696;
            synchronized (this.field7696) {
                while (super.field6413 != 0) {
                    this.field7696.wait();
                }
                if (arg0 <= 32) {
                    this.field7696 = null;
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V", line = 52)
    private final void method3096(byte arg0, int arg1) {
        super.field6414[super.field6409] = (byte) arg1;
        ++field7705;
        ++super.field6409;
        ++super.field6406;
        if (~super.field6409 <= -5001) {
            super.field6409 = 0;
        }
        if (arg0 != 68) {
            this.field7712 = 76;
        }
        ++super.field6413;
        if (~this.field7709 < -1) {
            Object var3 = this.field7696;
            synchronized (this.field7696) {
                this.field7696.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V", line = 79)
    private final void method3097(int arg0, int arg1) {
        super.field6414[super.field6409] = (byte) (arg1 + 10);
        ++field7704;
        ++super.field6409;
        ++super.field6413;
        if (~super.field6409 <= -5001) {
            super.field6409 = 0;
        }
        ++super.field6406;
        if (arg0 < -21) {
            if (~this.field7709 < -1) {
                Object var3 = this.field7696;
                synchronized (this.field7696) {
                    this.field7696.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Liq;B)V", line = 107)
    public final void method323(class429 arg0, byte arg1) {
        if (arg1 < 20) {
            this.field7710 = null;
        }
        Object var3 = this.field7696;
        synchronized (this.field7696) {
            super.field6414[super.field6409] = 21;
            super.field6408[super.field6409] = arg0;
            ++super.field6409;
            ++super.field6413;
            ++super.field6406;
            if (~super.field6409 <= -5001) {
                super.field6409 = 0;
            }
            if (this.field7709 > 0) {
                this.field7696.notifyAll();
            }
        }
        ++field7702;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(FZILna;B)V", line = 133)
    public final void method333(float arg0, boolean arg1, int arg2, class35 arg3, byte arg4) {
        ++field7703;
        Object var6 = this.field7696;
        synchronized (this.field7696) {
            super.field6414[super.field6409] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
            super.field6408[super.field6409] = arg3;
            super.field6407[super.field6409] = arg0;
            int var7 = 53 / ((arg4 - -63) / 57);
            ++super.field6409;
            ++super.field6413;
            if (super.field6409 >= 5000) {
                super.field6409 = 0;
            }
            ++super.field6406;
            if (~this.field7709 < -1) {
                this.field7696.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLiq;)V", line = 157)
    public final void method322(byte arg0, class429 arg1) {
        Object var3 = this.field7696;
        synchronized (this.field7696) {
            --super.field6405;
            if (super.field6405 < 0) {
                super.field6405 = 4999;
            }
            super.field6414[super.field6405] = 21;
            int var4 = -58 / ((-34 - arg0) / 41);
            super.field6408[super.field6405] = arg1;
            ++super.field6413;
            ++super.field6406;
            if (~this.field7709 < -1) {
                this.field7696.notifyAll();
            }
        }
        ++field7706;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 182)
    public final void method327(int arg0) {
        ++field7697;
        Object var2 = this.field7696;
        synchronized (this.field7696) {
            for (int var3 = 0; this.field7712 > var3; ++var3) {
                if (~this.field7710[var3].field5453 <= -1) {
                    this.method3097(-37, this.field7710[var3].field5453);
                }
            }
            if (arg0 != 1) {
                field7708 = 47;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLiq;)V", line = 207)
    public final void method324(byte arg0, class429 arg1) {
        ++field7698;
        Object var3 = this.field7696;
        synchronized (this.field7696) {
            super.field6414[super.field6409] = 20;
            super.field6408[super.field6409] = arg1;
            ++super.field6409;
            ++super.field6413;
            if (super.field6409 >= 5000) {
                super.field6409 = 0;
            }
            if (arg0 != 36) {
                this.method328(103, 91);
            }
            ++super.field6406;
            if (this.field7709 > 0) {
                this.field7696.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 245)
    public static void method3098(int arg0) {
        field7711 = null;
        if (arg0 != -24) {
            field7711 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lcb;B)V", line = 255)
    public final void method3099(class359 arg0, byte arg1) {
        ++field7700;
        boolean var3 = false;
        boolean var23 = false;
        label384: {
            try {
                var23 = true;
                boolean var4 = false;
                if (arg1 == 92) {
                    float var5 = 0.0F;
                    Object var6 = this.field7696;
                    byte var7;
                    synchronized (this.field7696) {
                        while (~super.field6406 == -1) {
                            ++this.field7709;
                            this.field7696.wait();
                            --this.field7709;
                        }
                        var7 = super.field6414[super.field6405];
                        if (arg0.field5453 >= 0) {
                            if (~var7 > -1 || var7 > 3) {
                                var3 = true;
                            }
                        } else if (~var7 <= -1 && var7 <= 3) {
                            var3 = true;
                        }
                        if (var3) {
                            arg0.field7127 = super.field6408[super.field6405];
                            var5 = super.field6407[super.field6405];
                            super.field6408[super.field6405] = null;
                            ++super.field6405;
                            --super.field6406;
                            if (~super.field6405 <= -5001) {
                                super.field6405 = 0;
                            }
                        }
                    }
                    if (!var3) {
                        Thread.yield();
                        var23 = false;
                    } else if (arg0.field5453 >= 0) {
                        if (var7 != 21) {
                            if (var7 != 20) {
                                if (var7 >= 30 && var7 <= 33) {
                                    class95.field1609.method300(3000.0F, var5 * 1.5F);
                                    ((class35) arg0.field7127).method375(class267.field3846, class388.field5834, class369.field5579, class62.field1078, ~(var7 + -30) == -1);
                                    var23 = false;
                                } else if (~var7 <= -41 && ~var7 >= -44) {
                                    class95.field1609.method300(3000.0F, var5 * 1.5F);
                                    ((class35) arg0.field7127).method375(class267.field3846, class388.field5834, class369.field5579, class20.field352, ~(var7 + -40) == -1);
                                    var23 = false;
                                } else if (~var7 == -23) {
                                    class95.field1609.method266(-1, 1583160, 40, 127);
                                    var23 = false;
                                } else if (~var7 == -24) {
                                    class95.field1609.method222();
                                    var23 = false;
                                } else if (~var7 != -25) {
                                    if (var7 >= 10) {
                                        if (~var7 >= -14) {
                                            class95.field1609.method212(arg0.field5453);
                                            arg0.field5453 = -1;
                                            var23 = false;
                                        } else {
                                            var23 = false;
                                        }
                                    } else {
                                        var23 = false;
                                    }
                                } else {
                                    class95.field1609.method289(0, (class462[]) null);
                                    var23 = false;
                                }
                            } else {
                                class429 var8 = (class429) arg0.field7127;
                                if (var8.field6370 != null) {
                                    var8.field6370.method25((byte) 79, class95.field1609);
                                }
                                if (var8.field6365 != null) {
                                    var8.field6365.method25((byte) -96, class95.field1609);
                                }
                                if (var8.field6380 != null) {
                                    var8.field6380.method25((byte) 72, class95.field1609);
                                }
                                if (var8.field6367 != null) {
                                    var8.field6367.method25((byte) 26, class95.field1609);
                                }
                                if (var8.field6366 != null) {
                                    var8.field6366.method25((byte) 47, class95.field1609);
                                }
                                for (class166 var9 = var8.field6364; var9 != null; var9 = var9.field2572) {
                                    var9.field2576.method25((byte) -128, class95.field1609);
                                }
                                var23 = false;
                            }
                        } else {
                            class337.method2162(arg0, (class429) arg0.field7127);
                            var23 = false;
                        }
                    } else if (var7 >= 0) {
                        if (var7 <= 3) {
                            arg0.field5453 = var7;
                            class95.field1609.method277(var7);
                            var23 = false;
                        } else {
                            var23 = false;
                        }
                    } else {
                        var23 = false;
                    }
                    break label384;
                }
                Object var10000 = null;
                var23 = false;
            } catch (Exception var28) {
                var23 = false;
                break label384;
            } finally {
                if (var23) {
                    Object var15 = null;
                    if (var3) {
                        Object var16 = this.field7696;
                        synchronized (this.field7696) {
                            --super.field6413;
                            if (~super.field6413 == -1) {
                                this.field7696.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var12 = this.field7696;
                synchronized (this.field7696) {
                    --super.field6413;
                    if (~super.field6413 == -1) {
                        this.field7696.notifyAll();
                    }
                }
            }
            return;
        }
        Object var13 = null;
        if (var3) {
            Object var14 = this.field7696;
            synchronized (this.field7696) {
                --super.field6413;
                if (~super.field6413 == -1) {
                    this.field7696.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 419)
    public final void method328(int arg0, int arg1) {
        ++field7699;
        int var3 = 0;
        Object var4 = this.field7696;
        synchronized (this.field7696) {
            if (this.field7712 == arg1) {
                for (int var5 = 0; ~var5 > ~this.field7712; ++var5) {
                    this.method3096((byte) 68, var3++);
                }
            } else {
                for (int var6 = arg0; this.field7712 > var6; ++var6) {
                    this.field7710[var6].method2263((byte) -89);
                }
                this.field7712 = arg1;
                this.field7710 = new class359[this.field7712];
                for (int var7 = 0; ~this.field7712 < ~var7; ++var7) {
                    this.field7710[var7] = new class359(this);
                    this.field7710[var7].method2265((byte) -111);
                    this.method3096((byte) 68, var3++);
                }
            }
        }
    }
}
