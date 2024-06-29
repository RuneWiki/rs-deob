import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class170 extends class422 {

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field2414 = new Object();

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[Lpg;")
    private class513[] field2422 = new class513[0];

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    private int field2421 = 0;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2413 = -1;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field2419;

    static {
        new class523("", 76);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V", line = 8)
    public final void method1193(byte arg0, int arg1) {
        int var3 = -118 / ((arg0 - -81) / 34);
        ++field2416;
        Object var4 = this.field2414;
        synchronized (this.field2414) {
            super.field6236[super.field6238] = (byte) arg1;
            ++super.field6238;
            if (super.field6238 >= 5000) {
                super.field6238 = 0;
            }
            ++super.field6242;
            ++super.field6239;
            if (~this.field2420 < -1) {
                this.field2414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 31)
    public static final void method1194(byte arg0) {
        if (arg0 != 3) {
            field2413 = 38;
        }
        ++field2412;
        if (class376.field5563 != null) {
            class376.field5563.method333(true);
            class376.field5563 = null;
            class450.field6643 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V", line = 49)
    private final void method1195(int arg0, int arg1) {
        ++field2417;
        super.field6236[super.field6238] = (byte) (arg1 - -10);
        ++super.field6238;
        ++super.field6242;
        if (arg0 != 0) {
            this.field2414 = null;
        }
        if (~super.field6238 <= -5001) {
            super.field6238 = 0;
        }
        ++super.field6239;
        if (~this.field2420 < -1) {
            Object var3 = this.field2414;
            synchronized (this.field2414) {
                this.field2414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLnt;)V", line = 73)
    public final void method1196(byte arg0, class148 arg1) {
        if (arg0 > -29) {
            this.field2422 = null;
        }
        Object var3 = this.field2414;
        synchronized (this.field2414) {
            --super.field6235;
            if (super.field6235 < 0) {
                super.field6235 = 4999;
            }
            super.field6236[super.field6235] = 21;
            super.field6237[super.field6235] = arg1;
            ++super.field6239;
            ++super.field6242;
            if (~this.field2420 < -1) {
                this.field2414.notifyAll();
            }
        }
        ++field2406;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZLta;FB)V", line = 99)
    public final void method1197(int arg0, boolean arg1, class142 arg2, float arg3, byte arg4) {
        Object var6 = this.field2414;
        synchronized (this.field2414) {
            super.field6236[super.field6238] = (byte) (!arg1 ? arg0 + 30 : arg0 + 40);
            super.field6237[super.field6238] = arg2;
            super.field6241[super.field6238] = arg3;
            ++super.field6238;
            ++super.field6242;
            ++super.field6239;
            if (arg4 != 46) {
                field2413 = -35;
            }
            if (super.field6238 >= 5000) {
                super.field6238 = 0;
            }
            if (~this.field2420 < -1) {
                this.field2414.notifyAll();
            }
        }
        ++field2405;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIZ)V", line = 127)
    public static final void method1198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (~class72.field992 >= ~(-arg1 + arg0) && class126.field1842 >= arg0 + arg1 && class471.field6963 <= -arg1 + arg3 && ~class401.field5947 <= ~(arg1 + arg3)) {
            class133.method1012(arg6, arg4, arg1, arg0, arg5, arg2, arg3);
        } else {
            class400.method2463((byte) 127, arg5, arg2, arg1, arg4, arg0, arg3);
        }
        if (!arg6) {
            field2418 = 48;
        }
        ++field2419;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 147)
    public final void method1199(int arg0) {
        int var2 = -29 / ((arg0 - -73) / 50);
        Object var3 = this.field2414;
        synchronized (this.field2414) {
            int var4 = 0;
            while (true) {
                if (~this.field2421 >= ~var4) {
                    break;
                }
                if (this.field2422[var4].field7570 >= 0) {
                    this.method1195(0, this.field2422[var4].field7570);
                }
                ++var4;
            }
        }
        ++field2402;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 169)
    public static final void method1200(int arg0) {
        class291.field4175 = 0;
        ++field2403;
        class498.field7394.method1016(-55);
        if (arg0 >= -87) {
            method1200(15);
        }
        class500.field7415 = false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lnt;I)V", line = 187)
    public final void method1201(class148 arg0, int arg1) {
        ++field2411;
        Object var3 = this.field2414;
        synchronized (this.field2414) {
            super.field6236[super.field6238] = 21;
            super.field6237[super.field6238] = arg0;
            ++super.field6238;
            ++super.field6242;
            ++super.field6239;
            if (~super.field6238 <= -5001) {
                super.field6238 = 0;
            }
            if (arg1 < this.field2420) {
                this.field2414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lnt;B)V", line = 208)
    public final void method1202(class148 arg0, byte arg1) {
        ++field2415;
        Object var3 = this.field2414;
        synchronized (this.field2414) {
            super.field6236[super.field6238] = 20;
            super.field6237[super.field6238] = arg0;
            ++super.field6238;
            ++super.field6242;
            if (super.field6238 >= 5000) {
                super.field6238 = 0;
            }
            ++super.field6239;
            if (arg1 != -39) {
                this.field2421 = -19;
            }
            if (this.field2420 > 0) {
                this.field2414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 233)
    public final void method1203(int arg0) {
        try {
            if (arg0 != 5000) {
                return;
            }
            Object var2 = this.field2414;
            synchronized (this.field2414) {
                while (~super.field6239 != -1) {
                    this.field2414.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field2404;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 264)
    public final void method1204(int arg0, int arg1) {
        ++field2407;
        int var3 = 0;
        Object var4 = this.field2414;
        synchronized (this.field2414) {
            if (this.field2421 == arg0) {
                for (int var5 = 0; this.field2421 > var5; ++var5) {
                    this.method1205(-21572, var3++);
                }
            } else {
                if (arg1 != 5000) {
                    method1200(35);
                }
                for (int var6 = 0; var6 < this.field2421; ++var6) {
                    this.field2422[var6].method3049((byte) -110);
                }
                this.field2421 = arg0;
                this.field2422 = new class513[this.field2421];
                for (int var7 = 0; ~this.field2421 < ~var7; ++var7) {
                    this.field2422[var7] = new class513(this);
                    this.field2422[var7].method3052((byte) -64);
                    this.method1205(arg1 + -26572, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V", line = 314)
    private final void method1205(int arg0, int arg1) {
        ++field2409;
        super.field6236[super.field6238] = (byte) arg1;
        ++super.field6238;
        ++super.field6239;
        if (~super.field6238 <= -5001) {
            super.field6238 = 0;
        }
        if (arg0 != -21572) {
            this.field2414 = null;
        }
        ++super.field6242;
        if (this.field2420 > 0) {
            Object var3 = this.field2414;
            synchronized (this.field2414) {
                this.field2414.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lpg;I)V", line = 348)
    public final void method1206(class513 arg0, int arg1) {
        ++field2408;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field2414;
            byte var7;
            synchronized (this.field2414) {
                while (~super.field6242 == -1) {
                    ++this.field2420;
                    this.field2414.wait();
                    --this.field2420;
                }
                var7 = super.field6236[super.field6235];
                if (arg0.field7570 < 0) {
                    if (var7 >= 0 && var7 <= 3) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field1040 = super.field6237[super.field6235];
                    var5 = super.field6241[super.field6235];
                    super.field6237[super.field6235] = null;
                    ++super.field6235;
                    if (super.field6235 >= 5000) {
                        super.field6235 = 0;
                    }
                    --super.field6242;
                }
            }
            if (var3) {
                if (~arg0.field7570 <= -1) {
                    if (~var7 != -22) {
                        if (~var7 == -21) {
                            class148 var8 = (class148) arg0.field1040;
                            if (var8.field2098 != null) {
                                var8.field2098.method35(class442.field6561, 68);
                            }
                            if (var8.field2078 != null) {
                                var8.field2078.method35(class442.field6561, 80);
                            }
                            if (var8.field2079 != null) {
                                var8.field2079.method35(class442.field6561, 98);
                            }
                            if (var8.field2085 != null) {
                                var8.field2085.method35(class442.field6561, 115);
                            }
                            if (var8.field2082 != null) {
                                var8.field2082.method35(class442.field6561, arg1 + -25069);
                            }
                            for (class480 var9 = var8.field2086; var9 != null; var9 = var9.field7058) {
                                var9.field7054.method35(class442.field6561, 81);
                            }
                        } else if (~var7 <= -31 && ~var7 >= -34) {
                            class442.field6561.method319(3000.0F, var5 * 1.5F);
                            ((class142) arg0.field1040).method429(class321.field4527, class209.field3040, class385.field5672, class350.field4844, var7 + -30 == 0);
                        } else if (var7 >= 40 && var7 <= 43) {
                            class442.field6561.method319(3000.0F, var5 * 1.5F);
                            ((class142) arg0.field1040).method429(class321.field4527, class209.field3040, class385.field5672, class89.field1221, var7 - 40 == 0);
                        } else if (~var7 == -23) {
                            class442.field6561.method295(-1, 1583160, 40, 127);
                        } else if (~var7 == -24) {
                            class442.field6561.method328();
                        } else if (~var7 != -25) {
                            if (~var7 <= -11 && ~var7 >= -14) {
                                class442.field6561.method382(arg0.field7570);
                                arg0.field7570 = -1;
                            }
                        } else {
                            class442.field6561.method291(0, (class124[]) null);
                        }
                    } else {
                        class410.method2510(arg0, (class148) arg0.field1040);
                    }
                } else if (~var7 <= -1 && var7 <= 3) {
                    arg0.field7570 = var7;
                    class442.field6561.method340(var7);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field2414;
                synchronized (this.field2414) {
                    --super.field6239;
                    if (super.field6239 == 0) {
                        this.field2414.notifyAll();
                    }
                }
            }
        }
        if (arg1 != 25152) {
            this.method1204(-110, -75);
        }
    }
}
