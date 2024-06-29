import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class437 extends class578 {

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field5497 = new Object();

    @OriginalMember(owner = "client!vaa", name = "D", descriptor = "[Lwba;")
    private class46[] field5508 = new class46[0];

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
    private int field5504 = 0;

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
    private int field5510 = 0;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "F")
    public static float field5495;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "F")
    public static float field5501;

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "F")
    public static float field5503;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!vaa", name = "A", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!vaa", name = "B", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!vaa", name = "C", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "I")
    public static int field5511;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field5512;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2406(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILwba;)V", line = 7)
    public final void method2401(int arg0, class46 arg1) {
        ++field5499;
        boolean var3 = false;
        int var4 = 55 % ((arg0 - -42) / 63);
        try {
            boolean var5 = false;
            Object var6 = this.field5497;
            byte var7;
            synchronized (this.field5497) {
                while (super.field7763 == 0) {
                    ++this.field5504;
                    this.field5497.wait();
                    --this.field5504;
                }
                var7 = super.field7759[super.field7762];
                if (arg1.field626 >= 0) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field793 = super.field7761[super.field7762];
                    super.field7761[super.field7762] = null;
                    ++super.field7762;
                    --super.field7763;
                    if (~super.field7762 <= -5001) {
                        super.field7762 = 0;
                    }
                }
            }
            if (var3) {
                if (arg1.field626 < 0) {
                    if (var7 >= 0 && var7 <= 3) {
                        arg1.field626 = var7;
                        class687.field9409.method494(var7);
                    }
                } else if (var7 == 21) {
                    class73.method586(arg1, (class565) arg1.field793);
                } else if (~var7 == -21) {
                    class565 var8 = (class565) arg1.field793;
                    if (var8.field7079 != null) {
                        var8.field7079.method7(class687.field9409, (byte) 98);
                    }
                    if (var8.field7087 != null) {
                        var8.field7087.method7(class687.field9409, (byte) 98);
                    }
                    if (var8.field7082 != null) {
                        var8.field7082.method7(class687.field9409, (byte) 98);
                    }
                    if (var8.field7073 != null) {
                        var8.field7073.method7(class687.field9409, (byte) 98);
                    }
                    if (var8.field7085 != null) {
                        var8.field7085.method7(class687.field9409, (byte) 98);
                    }
                    for (class436 var9 = var8.field7074; var9 != null; var9 = var9.field5485) {
                        var9.field5486.method7(class687.field9409, (byte) 98);
                    }
                } else if (var7 >= 30 && var7 <= 33) {
                    ((class140) arg1.field793).method195(class662.field8971, class513.field6440, class664.field9021, class82.field1060, ~(var7 + -30) == -1);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    ((class140) arg1.field793).method195(class662.field8971, class513.field6440, class664.field9021, class42.field597, var7 + -40 == 0);
                } else if (~var7 == -23) {
                    class687.field9409.method484(-1, 1583160, 40, 127);
                } else if (~var7 == -24) {
                    class687.field9409.method409();
                } else if (var7 == 24) {
                    class687.field9409.method473(0, (class227[]) null);
                } else if (var7 >= 10 && ~var7 >= -14) {
                    class687.field9409.method476(arg1.field626);
                    arg1.field626 = -1;
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field5497;
                synchronized (this.field5497) {
                    --super.field7758;
                    if (super.field7758 == 0) {
                        this.field5497.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lqs;B)V", line = 182)
    public final void method1797(class565 arg0, byte arg1) {
        ++field5496;
        Object var3 = this.field5497;
        synchronized (this.field5497) {
            --super.field7762;
            if (super.field7762 < 0) {
                super.field7762 = 4999;
            }
            super.field7759[super.field7762] = 21;
            super.field7761[super.field7762] = arg0;
            ++super.field7758;
            ++super.field7763;
            if (this.field5504 > 0) {
                this.field5497.notifyAll();
            }
        }
        if (arg1 != 97) {
            this.field5508 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BI)V", line = 206)
    private final void method2402(byte arg0, int arg1) {
        ++field5502;
        super.field7759[super.field7757] = (byte) (arg1 + 10);
        ++super.field7757;
        int var3 = 92 % ((arg0 - 49) / 47);
        ++super.field7758;
        ++super.field7763;
        if (super.field7757 >= 5000) {
            super.field7757 = 0;
        }
        if (~this.field5504 < -1) {
            Object var4 = this.field5497;
            synchronized (this.field5497) {
                this.field5497.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V", line = 231)
    public final void method1806(int arg0, boolean arg1) {
        Object var3 = this.field5497;
        synchronized (this.field5497) {
            super.field7759[super.field7757] = (byte) arg0;
            ++super.field7757;
            ++super.field7758;
            if (super.field7757 >= 5000) {
                super.field7757 = 0;
            }
            ++super.field7763;
            if (this.field5504 > 0) {
                this.field5497.notifyAll();
            }
        }
        ++field5505;
        if (!arg1) {
            this.method1802((class565) null, -125);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILqs;)V", line = 262)
    public final void method1807(int arg0, class565 arg1) {
        Object var3 = this.field5497;
        synchronized (this.field5497) {
            super.field7759[super.field7757] = 21;
            if (arg0 != -18542) {
                this.method2402((byte) -31, 62);
            }
            super.field7761[super.field7757] = arg1;
            ++super.field7757;
            if (super.field7757 >= 5000) {
                super.field7757 = 0;
            }
            ++super.field7758;
            ++super.field7763;
            if (~this.field5504 < -1) {
                this.field5497.notifyAll();
            }
        }
        ++field5494;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BZILd;)V", line = 286)
    public final void method1803(byte arg0, boolean arg1, int arg2, class140 arg3) {
        ++field5493;
        Object var5 = this.field5497;
        synchronized (this.field5497) {
            int var6 = -25 % ((arg0 - 40) / 55);
            super.field7759[super.field7757] = (byte) (!arg1 ? arg2 + 30 : arg2 + 40);
            super.field7761[super.field7757] = arg3;
            ++super.field7757;
            ++super.field7758;
            if (~super.field7757 <= -5001) {
                super.field7757 = 0;
            }
            ++super.field7763;
            if (~this.field5504 < -1) {
                this.field5497.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V", line = 311)
    public static final void method2403(boolean arg0) {
        ++field5507;
        if (!class386.field4955.field5925) {
            try {
                Method var1 = (field5512 != null ? field5512 : (field5512 = method2406("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class357.field4610 = (int) (var3 / 1048576L) - -1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        } else {
            class357.field4610 = 96;
        }
        if (!arg0) {
            field5503 = -0.8105145F;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IB)V", line = 345)
    private final void method2404(int arg0, byte arg1) {
        ++field5498;
        super.field7759[super.field7757] = (byte) arg0;
        ++super.field7757;
        ++super.field7763;
        if (~super.field7757 <= -5001) {
            super.field7757 = 0;
        }
        if (arg1 != -24) {
            this.field5508 = null;
        }
        ++super.field7758;
        if (this.field5504 > 0) {
            Object var3 = this.field5497;
            synchronized (this.field5497) {
                this.field5497.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lqs;I)V", line = 380)
    public final void method1802(class565 arg0, int arg1) {
        Object var3 = this.field5497;
        synchronized (this.field5497) {
            super.field7759[super.field7757] = 20;
            super.field7761[super.field7757] = arg0;
            ++super.field7757;
            ++super.field7763;
            if (super.field7757 >= 5000) {
                super.field7757 = 0;
            }
            ++super.field7758;
            if (this.field5504 > arg1) {
                this.field5497.notifyAll();
            }
        }
        ++field5509;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V", line = 401)
    public final void method1804(int arg0, int arg1) {
        ++field5506;
        int var3 = 0;
        Object var4 = this.field5497;
        synchronized (this.field5497) {
            if (~this.field5510 == ~arg0) {
                for (int var5 = 0; this.field5510 > var5; ++var5) {
                    this.method2404(var3++, (byte) -24);
                }
            } else {
                int var6 = -48 % ((-55 - arg1) / 34);
                for (int var7 = 0; this.field5510 > var7; ++var7) {
                    this.field5508[var7].method283((byte) -16);
                }
                this.field5510 = arg0;
                this.field5508 = new class46[this.field5510];
                for (int var8 = 0; var8 < this.field5510; ++var8) {
                    this.field5508[var8] = new class46(this);
                    this.field5508[var8].method280((byte) 96);
                    this.method2404(var3++, (byte) -24);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 453)
    public final void method1801(int arg0) {
        ++field5511;
        Object var2 = this.field5497;
        synchronized (this.field5497) {
            for (int var3 = arg0; var3 < this.field5510; ++var3) {
                if (~this.field5508[var3].field626 <= -1) {
                    this.method2402((byte) 2, this.field5508[var3].field626);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIILou;Lou;)V", line = 483)
    public static final void method2405(int arg0, int arg1, int arg2, class567 arg3, class567 arg4) {
        class565 var5 = class417.method2319(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7079 = arg3;
            var5.field7087 = arg4;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V", line = 492)
    public final void method1808(int arg0) {
        ++field5492;
        try {
            Object var2 = this.field5497;
            synchronized (this.field5497) {
                while (~super.field7758 != -1) {
                    this.field5497.wait();
                }
            }
            if (arg0 != 3) {
                method2403(false);
            }
        } catch (Exception var4) {
        }
    }
}
