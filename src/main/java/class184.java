import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class184 extends class149 {

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field2676 = new Object();

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "[Lal;")
    private class128[] field2683 = new class128[0];

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    private int field2685 = 0;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    private int field2686 = 0;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Z")
    public static boolean field2668 = false;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Lmn;")
    public static class162 field2680;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
    public final void method908(int arg0, int arg1) {
        ++field2677;
        if (arg1 > -16) {
            this.field2676 = null;
        }
        int var3 = 0;
        Object var4 = this.field2676;
        synchronized (this.field2676) {
            if (this.field2685 == arg0) {
                for (int var5 = 0; var5 < this.field2685; ++var5) {
                    this.method1157(0, var3++);
                }
            } else {
                for (int var6 = 0; ~this.field2685 < ~var6; ++var6) {
                    this.field2683[var6].method798((byte) -42);
                }
                this.field2685 = arg0;
                this.field2683 = new class128[this.field2685];
                for (int var7 = 0; ~var7 > ~this.field2685; ++var7) {
                    this.field2683[var7] = new class128(this);
                    this.field2683[var7].method797(1);
                    this.method1157(0, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field2680 = null;
        if (arg0 >= -38) {
            method1155(-89, -25, 97, 28, 52);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V")
    public final void method909(int arg0, int arg1) {
        Object var3 = this.field2676;
        synchronized (this.field2676) {
            super.field2006[super.field2005] = (byte) arg0;
            ++super.field2005;
            ++super.field2007;
            if (super.field2005 >= 5000) {
                super.field2005 = 0;
            }
            ++super.field2002;
            if (arg1 != 5) {
                field2668 = true;
            }
            if (~this.field2686 < -1) {
                this.field2676.notifyAll();
            }
        }
        ++field2675;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILal;)V")
    public final void method1153(int arg0, class128 arg1) {
        ++field2684;
        boolean var3 = false;
        if (arg0 != -34) {
            field2681 = 101;
        }
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field2676;
            byte var7;
            synchronized (this.field2676) {
                while (~super.field2007 == -1) {
                    ++this.field2686;
                    this.field2676.wait();
                    --this.field2686;
                }
                var7 = super.field2006[super.field2009];
                if (arg1.field1736 < 0) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (var7 < 0 || var7 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field7567 = super.field2008[super.field2009];
                    var5 = super.field2004[super.field2009];
                    super.field2008[super.field2009] = null;
                    ++super.field2009;
                    --super.field2007;
                    if (~super.field2009 <= -5001) {
                        super.field2009 = 0;
                    }
                }
            }
            if (var3) {
                if (arg1.field1736 >= 0) {
                    if (var7 != 21) {
                        if (var7 != 20) {
                            if (~var7 <= -31 && ~var7 >= -34) {
                                class104.field1523.method1309(3000.0F, var5 * 1.5F);
                                ((class223) arg1.field7567).method689(class192.field2847, class241.field3919, class78.field1156, class357.field5543, ~(var7 - 30) == -1);
                            } else if (var7 >= 40 && ~var7 >= -44) {
                                class104.field1523.method1309(3000.0F, var5 * 1.5F);
                                ((class223) arg1.field7567).method689(class192.field2847, class241.field3919, class78.field1156, class221.field3735, var7 + -40 == 0);
                            } else if (~var7 == -23) {
                                class104.field1523.method1326(-1, 1583160, 40, 127);
                            } else if (var7 != 23) {
                                if (var7 == 24) {
                                    class104.field1523.method1242(0, (class415[]) null);
                                } else if (var7 >= 10 && var7 <= 13) {
                                    class104.field1523.method1288(arg1.field1736);
                                    arg1.field1736 = -1;
                                }
                            } else {
                                class104.field1523.method1245();
                            }
                        } else {
                            class409 var8 = (class409) arg1.field7567;
                            if (var8.field6180 != null) {
                                var8.field6180.method102(-1, class104.field1523);
                            }
                            if (var8.field6188 != null) {
                                var8.field6188.method102(-1, class104.field1523);
                            }
                            if (var8.field6189 != null) {
                                var8.field6189.method102(-1, class104.field1523);
                            }
                            if (var8.field6192 != null) {
                                var8.field6192.method102(-1, class104.field1523);
                            }
                            if (var8.field6176 != null) {
                                var8.field6176.method102(-1, class104.field1523);
                            }
                            for (class192 var9 = var8.field6175; var9 != null; var9 = var9.field2841) {
                                var9.field2845.method102(-1, class104.field1523);
                            }
                        }
                    } else {
                        class31.method204(arg1, (class409) arg1.field7567);
                    }
                } else if (~var7 <= -1 && var7 <= 3) {
                    arg1.field1736 = var7;
                    class104.field1523.method1265(var7);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field2676;
                synchronized (this.field2676) {
                    --super.field2002;
                    if (~super.field2002 == -1) {
                        this.field2676.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public final void method913(int arg0) {
        ++field2682;
        try {
            if (arg0 == 0) {
                Object var2 = this.field2676;
                synchronized (this.field2676) {
                    while (~super.field2002 != -1) {
                        this.field2676.wait();
                    }
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILce;)V")
    public final void method911(int arg0, class409 arg1) {
        ++field2669;
        if (arg0 < 64) {
            this.method1156(113, -125);
        }
        Object var3 = this.field2676;
        synchronized (this.field2676) {
            super.field2006[super.field2005] = 21;
            super.field2008[super.field2005] = arg1;
            ++super.field2005;
            ++super.field2007;
            ++super.field2002;
            if (~super.field2005 <= -5001) {
                super.field2005 = 0;
            }
            if (this.field2686 > 0) {
                this.field2676.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLce;)V")
    public final void method910(byte arg0, class409 arg1) {
        Object var3 = this.field2676;
        synchronized (this.field2676) {
            --super.field2009;
            if (arg0 <= 123) {
                this.field2686 = 74;
            }
            if (~super.field2009 > -1) {
                super.field2009 = 4999;
            }
            super.field2006[super.field2009] = 21;
            super.field2008[super.field2009] = arg1;
            ++super.field2007;
            ++super.field2002;
            if (this.field2686 > 0) {
                this.field2676.notifyAll();
            }
        }
        ++field2670;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(FLya;BIZ)V")
    public final void method906(float arg0, class223 arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 == 111) {
            ++field2674;
            Object var6 = this.field2676;
            synchronized (this.field2676) {
                super.field2006[super.field2005] = (byte) (!arg4 ? arg3 + 30 : arg3 + 40);
                super.field2008[super.field2005] = arg1;
                super.field2004[super.field2005] = arg0;
                ++super.field2005;
                ++super.field2002;
                if (~super.field2005 <= -5001) {
                    super.field2005 = 0;
                }
                ++super.field2007;
                if (this.field2686 > 0) {
                    this.field2676.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2679;
        class422 var10 = null;
        int var11 = -9 % ((49 - arg8) / 34);
        for (class422 var12 = (class422) class497.field7476.method2123(-15); var12 != null; var12 = (class422) class497.field7476.method2126((byte) 61)) {
            if (~var12.field6403 == ~arg6 && ~var12.field6402 == ~arg2 && ~var12.field6404 == ~arg3 && ~var12.field6398 == ~arg0) {
                var10 = var12;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class422();
            var10.field6398 = arg0;
            var10.field6403 = arg6;
            var10.field6404 = arg3;
            var10.field6402 = arg2;
            if (~arg2 <= -1 && ~arg3 <= -1 && ~arg2 > ~class135.field1839 && class197.field3038 > arg3) {
                class346.method2286(var10, (byte) -101);
            }
            class497.field7476.method2124(var10, (byte) 115);
        }
        var10.field6396 = arg1;
        var10.field6407 = arg7;
        var10.field6405 = arg4;
        var10.field6397 = arg5;
        var10.field6408 = arg9;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V")
    public static final void method1155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 112 / ((63 - arg4) / 49);
        ++field2673;
        if (~(arg1 - arg3) <= ~class178.field2609 && ~class460.field7096 <= ~(arg1 + arg3) && ~(-arg3 + arg2) <= ~class462.field7105 && class222.field3750 >= arg2 + arg3) {
            class167.method1055(arg2, arg3, true, arg0, arg1);
        } else {
            class252.method1738((byte) 76, arg0, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public final void method915(int arg0) {
        ++field2667;
        Object var2 = this.field2676;
        synchronized (this.field2676) {
            for (int var3 = arg0; ~var3 > ~this.field2685; ++var3) {
                if (~this.field2683[var3].field1736 <= -1) {
                    this.method1156(arg0, this.field2683[var3].field1736);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(II)V")
    private final void method1156(int arg0, int arg1) {
        super.field2006[super.field2005] = (byte) (arg1 + 10);
        ++field2678;
        ++super.field2005;
        ++super.field2007;
        ++super.field2002;
        if (~super.field2005 <= -5001) {
            super.field2005 = 0;
        }
        if (this.field2686 > 0) {
            Object var3 = this.field2676;
            synchronized (this.field2676) {
                this.field2676.notifyAll();
            }
        }
        if (arg0 != 0) {
            this.method909(-91, -123);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(BLce;)V")
    public final void method912(byte arg0, class409 arg1) {
        ++field2671;
        Object var3 = this.field2676;
        synchronized (this.field2676) {
            super.field2006[super.field2005] = 20;
            super.field2008[super.field2005] = arg1;
            ++super.field2005;
            if (~super.field2005 <= -5001) {
                super.field2005 = 0;
            }
            ++super.field2002;
            ++super.field2007;
            if (this.field2686 > 0) {
                this.field2676.notifyAll();
            }
        }
        if (arg0 >= -1) {
            method1152((byte) -59);
        }
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(II)V")
    private final void method1157(int arg0, int arg1) {
        ++field2672;
        super.field2006[super.field2005] = (byte) arg1;
        ++super.field2005;
        ++super.field2007;
        ++super.field2002;
        if (~super.field2005 <= -5001) {
            super.field2005 = 0;
        }
        if (this.field2686 > arg0) {
            Object var3 = this.field2676;
            synchronized (this.field2676) {
                this.field2676.notifyAll();
            }
        }
    }
}
