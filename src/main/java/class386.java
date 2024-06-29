import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class386 extends class232 {

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field5093 = new Object();

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "[Lgba;")
    private class571[] field5099 = new class571[0];

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    private int field5101 = 0;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    private int field5100 = 0;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
    public static int[] field5088 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "[I")
    public static int[] field5085;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2223(int arg0, int arg1, int arg2) {
        ++field5090;
        int var3 = 26 / ((arg1 - -17) / 44);
        return ~(458752 & arg0) != -1 | class13.method103(arg2, 2, arg0) || class264.method1476(10, arg0, arg2);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V", line = 14)
    public final void method1324(int arg0, boolean arg1) {
        ++field5097;
        int var3 = 0;
        Object var4 = this.field5093;
        synchronized (this.field5093) {
            if (this.field5100 == arg0) {
                for (int var5 = 0; this.field5100 > var5; ++var5) {
                    this.method2227((byte) 99, var3++);
                }
            } else {
                int var6 = 0;
                if (!arg1) {
                    while (~var6 > ~this.field5100) {
                        this.field5099[var6].method3327(arg1);
                        ++var6;
                    }
                    this.field5100 = arg0;
                    this.field5099 = new class571[this.field5100];
                    for (int var7 = 0; var7 < this.field5100; ++var7) {
                        this.field5099[var7] = new class571(this);
                        this.field5099[var7].method3325((byte) 127);
                        this.method2227((byte) 99, var3++);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 62)
    public final void method1323(byte arg0) {
        ++field5098;
        try {
            Object var2 = this.field5093;
            synchronized (this.field5093) {
                if (arg0 <= 104) {
                    this.field5100 = -45;
                }
                while (~super.field2858 != -1) {
                    this.field5093.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdg;)V", line = 89)
    public final void method1326(int arg0, class349 arg1) {
        ++field5096;
        Object var3 = this.field5093;
        synchronized (this.field5093) {
            if (arg0 == -15218) {
                --super.field2864;
                if (super.field2864 < 0) {
                    super.field2864 = 4999;
                }
                super.field2870[super.field2864] = 21;
                super.field2869[super.field2864] = arg1;
                ++super.field2858;
                ++super.field2866;
                if (~this.field5101 < -1) {
                    this.field5093.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lsa;IIZF)V", line = 114)
    public final void method1330(class174 arg0, int arg1, int arg2, boolean arg3, float arg4) {
        ++field5094;
        Object var6 = this.field5093;
        synchronized (this.field5093) {
            if (arg2 == 15547) {
                super.field2870[super.field2862] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
                super.field2869[super.field2862] = arg0;
                super.field2863[super.field2862] = arg4;
                ++super.field2862;
                if (~super.field2862 <= -5001) {
                    super.field2862 = 0;
                }
                ++super.field2866;
                ++super.field2858;
                if (~this.field5101 < -1) {
                    this.field5093.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILgba;)V", line = 140)
    public final void method2224(int arg0, class571 arg1) {
        ++field5087;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field5093;
            byte var7;
            synchronized (this.field5093) {
                while (~super.field2866 == -1) {
                    ++this.field5101;
                    this.field5093.wait();
                    --this.field5101;
                }
                var7 = super.field2870[super.field2864];
                if (arg1.field8375 < 0) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field4290 = super.field2869[super.field2864];
                    var5 = super.field2863[super.field2864];
                    super.field2869[super.field2864] = null;
                    ++super.field2864;
                    --super.field2866;
                    if (~super.field2864 <= -5001) {
                        super.field2864 = 0;
                    }
                }
            }
            if (arg0 < 13) {
                this.method2227((byte) -54, 108);
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field8375 <= -1) {
                if (var7 == 21) {
                    class167.method930(arg1, (class349) arg1.field4290);
                } else if (~var7 == -21) {
                    class349 var8 = (class349) arg1.field4290;
                    if (var8.field4496 != null) {
                        var8.field4496.method326(29657, class638.field9190);
                    }
                    if (var8.field4497 != null) {
                        var8.field4497.method326(29657, class638.field9190);
                    }
                    if (var8.field4507 != null) {
                        var8.field4507.method326(29657, class638.field9190);
                    }
                    if (var8.field4498 != null) {
                        var8.field4498.method326(29657, class638.field9190);
                    }
                    if (var8.field4506 != null) {
                        var8.field4506.method326(29657, class638.field9190);
                    }
                    for (class61 var9 = var8.field4499; var9 != null; var9 = var9.field595) {
                        var9.field589.method326(29657, class638.field9190);
                    }
                } else if (~var7 <= -31 && ~var7 >= -34) {
                    class638.field9190.method1106(3000.0F, var5 * 1.5F);
                    ((class174) arg1.field4290).method854(class144.field1735, class222.field2728, class244.field3140, class201.field2419, ~(var7 + -30) == -1);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class638.field9190.method1106(3000.0F, var5 * 1.5F);
                    ((class174) arg1.field4290).method854(class144.field1735, class222.field2728, class244.field3140, class78.field918, ~(var7 - 40) == -1);
                } else if (~var7 == -23) {
                    class638.field9190.method1164(-1, 1583160, 40, 127);
                } else if (~var7 != -24) {
                    if (var7 == 24) {
                        class638.field9190.method1193(0, (class469[]) null);
                    } else if (var7 >= 10 && ~var7 >= -14) {
                        class638.field9190.method275(arg1.field8375);
                        arg1.field8375 = -1;
                    }
                } else {
                    class638.field9190.method1146();
                }
            } else if (var7 >= 0 && ~var7 >= -4) {
                arg1.field8375 = var7;
                class638.field9190.method278(var7);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field5093;
                synchronized (this.field5093) {
                    --super.field2858;
                    if (super.field2858 == 0) {
                        this.field5093.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V", line = 308)
    private final void method2225(int arg0, int arg1) {
        ++field5095;
        super.field2870[super.field2862] = (byte) (arg0 + 10);
        ++super.field2862;
        if (~super.field2862 <= -5001) {
            super.field2862 = 0;
        }
        ++super.field2858;
        ++super.field2866;
        if (this.field5101 > arg1) {
            Object var3 = this.field5093;
            synchronized (this.field5093) {
                this.field5093.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 333)
    public static void method2226(int arg0) {
        field5088 = null;
        field5085 = null;
        if (arg0 < 27) {
            method2223(-42, -96, 110);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ldg;Z)V", line = 344)
    public final void method1327(class349 arg0, boolean arg1) {
        ++field5083;
        Object var3 = this.field5093;
        synchronized (this.field5093) {
            super.field2870[super.field2862] = 21;
            super.field2869[super.field2862] = arg0;
            ++super.field2862;
            if (super.field2862 >= 5000) {
                super.field2862 = 0;
            }
            if (arg1) {
                ++super.field2858;
                ++super.field2866;
                if (~this.field5101 < -1) {
                    this.field5093.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V", line = 368)
    public final void method1333(int arg0, int arg1) {
        Object var3 = this.field5093;
        synchronized (this.field5093) {
            super.field2870[super.field2862] = (byte) arg1;
            if (arg0 != 18936) {
                method2226(-37);
            }
            ++super.field2862;
            ++super.field2858;
            ++super.field2866;
            if (super.field2862 >= 5000) {
                super.field2862 = 0;
            }
            if (~this.field5101 < -1) {
                this.field5093.notifyAll();
            }
        }
        ++field5092;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 391)
    public final void method1329(int arg0) {
        if (arg0 != 5000) {
            this.method1327((class349) null, true);
        }
        Object var2 = this.field5093;
        synchronized (this.field5093) {
            int var3 = 0;
            while (true) {
                if (var3 >= this.field5100) {
                    break;
                }
                if (this.field5099[var3].field8375 >= 0) {
                    this.method2225(this.field5099[var3].field8375, 0);
                }
                ++var3;
            }
        }
        ++field5091;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ldg;B)V", line = 417)
    public final void method1331(class349 arg0, byte arg1) {
        ++field5089;
        Object var3 = this.field5093;
        synchronized (this.field5093) {
            int var4 = -88 / ((arg1 - 33) / 58);
            super.field2870[super.field2862] = 20;
            super.field2869[super.field2862] = arg0;
            ++super.field2862;
            ++super.field2866;
            if (super.field2862 >= 5000) {
                super.field2862 = 0;
            }
            ++super.field2858;
            if (this.field5101 > 0) {
                this.field5093.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V", line = 441)
    private final void method2227(byte arg0, int arg1) {
        super.field2870[super.field2862] = (byte) arg1;
        ++field5086;
        if (arg0 == 99) {
            ++super.field2862;
            ++super.field2866;
            ++super.field2858;
            if (super.field2862 >= 5000) {
                super.field2862 = 0;
            }
            if (this.field5101 > 0) {
                Object var3 = this.field5093;
                synchronized (this.field5093) {
                    this.field5093.notifyAll();
                }
            }
        }
    }
}
