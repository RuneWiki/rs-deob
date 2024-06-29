import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class176 extends class335 {

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Ljava/lang/Object;")
    private Object field2581 = new Object();

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field2588 = 0;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    private int field2593 = 0;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "[Lpe;")
    private class431[] field2597 = new class431[0];

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "Lwa;")
    public static class433 field2591 = new class433(64);

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "Lgo;")
    public static class441 field2598 = new class441(8, 0, 4, 1);

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Lgo;")
    public static class441 field2599 = new class441(7, 0, 1, 1);

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Lne;")
    public static class207 field2600 = new class207("WTQA", 2);

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V", line = 4)
    private final void method1195(int arg0, int arg1) {
        super.field4718[super.field4722] = (byte) (arg1 + 10);
        ++field2594;
        ++super.field4722;
        if (arg0 != -23831) {
            this.field2581 = null;
        }
        ++super.field4723;
        ++super.field4719;
        if (~super.field4722 <= -5001) {
            super.field4722 = 0;
        }
        if (this.field2593 > 0) {
            Object var3 = this.field2581;
            synchronized (this.field2581) {
                this.field2581.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BFLna;IZ)V", line = 29)
    public final void method951(byte arg0, float arg1, class35 arg2, int arg3, boolean arg4) {
        Object var6 = this.field2581;
        synchronized (this.field2581) {
            if (arg0 >= -126) {
                this.method1197(105, -43);
            }
            super.field4718[super.field4722] = (byte) (!arg4 ? arg3 + 30 : arg3 + 40);
            super.field4717[super.field4722] = arg2;
            super.field4725[super.field4722] = arg1;
            ++super.field4722;
            if (super.field4722 >= 5000) {
                super.field4722 = 0;
            }
            ++super.field4723;
            ++super.field4719;
            if (this.field2593 > 0) {
                this.field2581.notifyAll();
            }
        }
        ++field2582;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(II)V", line = 54)
    public static final void method1196(int arg0, int arg1) {
        class509.field7435.method1534(0, arg0);
        ++field2590;
        class478.field7022.method1534(0, arg0);
        if (arg1 < 80) {
            field2599 = null;
        }
        class352.field5399.method1534(0, arg0);
        class111.field1591.method1534(0, arg0);
        class500.field7360.method1534(0, arg0);
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(II)V", line = 71)
    private final void method1197(int arg0, int arg1) {
        ++field2580;
        if (arg1 != -18079) {
            this.field2593 = -99;
        }
        super.field4718[super.field4722] = (byte) arg0;
        ++super.field4722;
        if (super.field4722 >= 5000) {
            super.field4722 = 0;
        }
        ++super.field4723;
        ++super.field4719;
        if (this.field2593 > 0) {
            Object var3 = this.field2581;
            synchronized (this.field2581) {
                this.field2581.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLfl;)V", line = 97)
    public final void method943(boolean arg0, class518 arg1) {
        ++field2583;
        Object var3 = this.field2581;
        synchronized (this.field2581) {
            super.field4718[super.field4722] = 20;
            super.field4717[super.field4722] = arg1;
            ++super.field4722;
            ++super.field4719;
            if (~super.field4722 <= -5001) {
                super.field4722 = 0;
            }
            if (arg0) {
                ++super.field4723;
                if (this.field2593 > 0) {
                    this.field2581.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lfl;B)V", line = 121)
    public final void method953(class518 arg0, byte arg1) {
        ++field2592;
        Object var3 = this.field2581;
        synchronized (this.field2581) {
            --super.field4720;
            int var4 = 70 / ((26 - arg1) / 54);
            if (~super.field4720 > -1) {
                super.field4720 = 4999;
            }
            super.field4718[super.field4720] = 21;
            super.field4717[super.field4720] = arg0;
            ++super.field4723;
            ++super.field4719;
            if (~this.field2593 < -1) {
                this.field2581.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)[Lef;", line = 143)
    public static final class336[] method1198(byte arg0) {
        if (arg0 < 57) {
            return null;
        } else {
            ++field2587;
            return new class336[] { class46.field734, class46.field735, class46.field736, class46.field737, class46.field738, class46.field739, class46.field740, class46.field741, class46.field742, class46.field743 };
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 160)
    public final void method947(int arg0, int arg1) {
        ++field2589;
        int var3 = 0;
        if (arg1 == 2) {
            Object var4 = this.field2581;
            synchronized (this.field2581) {
                if (this.field2588 == arg0) {
                    for (int var5 = 0; this.field2588 > var5; ++var5) {
                        this.method1197(var3++, -18079);
                    }
                } else {
                    for (int var6 = 0; var6 < this.field2588; ++var6) {
                        this.field2597[var6].method2567(1);
                    }
                    this.field2588 = arg0;
                    this.field2597 = new class431[this.field2588];
                    for (int var7 = 0; var7 < this.field2588; ++var7) {
                        this.field2597[var7] = new class431(this);
                        this.field2597[var7].method2568(arg1 ^ 174);
                        this.method1197(var3++, -18079);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILfl;)V", line = 209)
    public final void method946(int arg0, class518 arg1) {
        Object var3 = this.field2581;
        synchronized (this.field2581) {
            if (arg0 >= -71) {
                this.method1195(89, -88);
            }
            super.field4718[super.field4722] = 21;
            super.field4717[super.field4722] = arg1;
            ++super.field4722;
            ++super.field4719;
            if (super.field4722 >= 5000) {
                super.field4722 = 0;
            }
            ++super.field4723;
            if (this.field2593 > 0) {
                this.field2581.notifyAll();
            }
        }
        ++field2586;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 233)
    public final void method949(int arg0) {
        if (arg0 == 38) {
            try {
                Object var2 = this.field2581;
                synchronized (this.field2581) {
                    while (~super.field4723 != -1) {
                        this.field2581.wait();
                    }
                }
            } catch (Exception var4) {
            }
            ++field2596;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILpe;)V", line = 256)
    public final void method1199(int arg0, class431 arg1) {
        ++field2595;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field2581;
            byte var7;
            synchronized (this.field2581) {
                while (~super.field4719 == -1) {
                    ++this.field2593;
                    this.field2581.wait();
                    --this.field2593;
                }
                var7 = super.field4718[super.field4720];
                if (~arg1.field6445 > -1) {
                    if (var7 >= 0 && var7 <= 3) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field2260 = super.field4717[super.field4720];
                    var5 = super.field4725[super.field4720];
                    super.field4717[super.field4720] = null;
                    ++super.field4720;
                    --super.field4719;
                    if (super.field4720 >= 5000) {
                        super.field4720 = 0;
                    }
                }
            }
            if (var3) {
                if (~arg1.field6445 > -1) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        arg1.field6445 = var7;
                        class271.field3941.method1103(var7);
                    }
                } else if (~var7 != -22) {
                    if (~var7 == -21) {
                        class518 var8 = (class518) arg1.field2260;
                        if (var8.field7559 != null) {
                            var8.field7559.method10((byte) -32, class271.field3941);
                        }
                        if (var8.field7570 != null) {
                            var8.field7570.method10((byte) -32, class271.field3941);
                        }
                        if (var8.field7551 != null) {
                            var8.field7551.method10((byte) -32, class271.field3941);
                        }
                        if (var8.field7552 != null) {
                            var8.field7552.method10((byte) -32, class271.field3941);
                        }
                        if (var8.field7550 != null) {
                            var8.field7550.method10((byte) -32, class271.field3941);
                        }
                        for (class284 var9 = var8.field7569; var9 != null; var9 = var9.field4087) {
                            var9.field4083.method10((byte) -32, class271.field3941);
                        }
                    } else if (~var7 <= -31 && ~var7 >= -34) {
                        class271.field3941.method1039(3000.0F, var5 * 1.5F);
                        ((class35) arg1.field2260).method207(class381.field5776, class346.field4983, class367.field5607, class329.field4682, var7 - 30 == 0);
                    } else if (var7 >= 40 && ~var7 >= -44) {
                        class271.field3941.method1039(3000.0F, var5 * 1.5F);
                        ((class35) arg1.field2260).method207(class381.field5776, class346.field4983, class367.field5607, class467.field6892, ~(var7 + -40) == -1);
                    } else if (~var7 == -23) {
                        class271.field3941.method1120(-1, 1583160, 40, 127);
                    } else if (var7 == 23) {
                        class271.field3941.method1116();
                    } else if (~var7 == -25) {
                        class271.field3941.method1068(0, (class107[]) null);
                    } else if (var7 >= 10 && var7 <= 13) {
                        class271.field3941.method1100(arg1.field6445);
                        arg1.field6445 = -1;
                    }
                } else {
                    class94.method546(arg1, (class518) arg1.field2260);
                }
            } else {
                Thread.yield();
            }
            if (arg0 != 11569) {
                this.method946(54, (class518) null);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field2581;
                synchronized (this.field2581) {
                    --super.field4723;
                    if (super.field4723 == 0) {
                        this.field2581.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V", line = 427)
    public static void method1200(byte arg0) {
        field2591 = null;
        field2600 = null;
        field2599 = null;
        if (arg0 > 57) {
            field2598 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 451)
    public final void method945(byte arg0) {
        ++field2585;
        Object var2 = this.field2581;
        synchronized (this.field2581) {
            for (int var3 = 0; var3 < this.field2588; ++var3) {
                if (this.field2597[var3].field6445 >= 0) {
                    this.method1195(-23831, this.field2597[var3].field6445);
                }
            }
            if (arg0 != -14) {
                field2598 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V", line = 475)
    public final void method950(int arg0, byte arg1) {
        ++field2584;
        if (arg1 == 41) {
            Object var3 = this.field2581;
            synchronized (this.field2581) {
                super.field4718[super.field4722] = (byte) arg0;
                ++super.field4722;
                ++super.field4723;
                ++super.field4719;
                if (super.field4722 >= 5000) {
                    super.field4722 = 0;
                }
                if (~this.field2593 < -1) {
                    this.field2581.notifyAll();
                }
            }
        }
    }
}
