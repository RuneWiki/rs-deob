import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class326 extends class207 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field4906 = new Object();

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "[Lpi;")
    private class347[] field4914 = new class347[0];

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    private int field4918 = 0;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    private int field4915 = 0;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "Lam;")
    public static class449 field4910;

    static {
        new class234("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lfq;I)V", line = 3)
    public final void method1429(class138 arg0, int arg1) {
        Object var3 = this.field4906;
        synchronized (this.field4906) {
            super.field3392[super.field3386] = 20;
            super.field3389[super.field3386] = arg0;
            ++super.field3386;
            if (arg1 <= super.field3386) {
                super.field3386 = 0;
            }
            ++super.field3390;
            ++super.field3388;
            if (this.field4918 > 0) {
                this.field4906.notifyAll();
            }
        }
        ++field4900;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLfq;)V", line = 29)
    public final void method1437(byte arg0, class138 arg1) {
        ++field4902;
        Object var3 = this.field4906;
        synchronized (this.field4906) {
            --super.field3391;
            if (super.field3391 < 0) {
                super.field3391 = 4999;
            }
            super.field3392[super.field3391] = 21;
            super.field3389[super.field3391] = arg1;
            ++super.field3390;
            ++super.field3388;
            if (arg0 < -46) {
                if (~this.field4918 < -1) {
                    this.field4906.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 54)
    public final void method1428(byte arg0) {
        Object var2 = this.field4906;
        synchronized (this.field4906) {
            if (arg0 != 12) {
                field4910 = null;
            }
            int var3 = 0;
            while (true) {
                if (~this.field4915 >= ~var3) {
                    break;
                }
                if (this.field4914[var3].field5128 >= 0) {
                    this.method2080(this.field4914[var3].field5128, arg0 ^ 26137);
                }
                ++var3;
            }
        }
        ++field4912;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 77)
    public final void method1431(int arg0, int arg1) {
        ++field4908;
        int var3 = 0;
        Object var4 = this.field4906;
        synchronized (this.field4906) {
            if (~this.field4915 == ~arg0) {
                for (int var5 = 0; this.field4915 > var5; ++var5) {
                    this.method2079((byte) 42, var3++);
                }
            } else {
                for (int var6 = arg1; var6 < this.field4915; ++var6) {
                    this.field4914[var6].method2161((byte) 127);
                }
                this.field4915 = arg0;
                this.field4914 = new class347[this.field4915];
                for (int var7 = 0; ~var7 > ~this.field4915; ++var7) {
                    this.field4914[var7] = new class347(this);
                    this.field4914[var7].method2163(-24576);
                    this.method2079((byte) 42, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V", line = 123)
    public static void method2075(byte arg0) {
        if (arg0 >= -11) {
            field4910 = null;
        }
        field4910 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILpi;)V", line = 134)
    public final void method2076(int arg0, class347 arg1) {
        ++field4907;
        boolean var3 = false;
        boolean var23 = false;
        label384: {
            try {
                var23 = true;
                boolean var4 = false;
                if (arg0 == -22545) {
                    float var5 = 0.0F;
                    Object var6 = this.field4906;
                    byte var7;
                    synchronized (this.field4906) {
                        while (super.field3388 == 0) {
                            ++this.field4918;
                            this.field4906.wait();
                            --this.field4918;
                        }
                        var7 = super.field3392[super.field3391];
                        if (~arg1.field5128 > -1) {
                            if (var7 >= 0 && var7 <= 3) {
                                var3 = true;
                            }
                        } else if (var7 < 0 || var7 > 3) {
                            var3 = true;
                        }
                        if (var3) {
                            arg1.field1312 = super.field3389[super.field3391];
                            var5 = super.field3393[super.field3391];
                            super.field3389[super.field3391] = null;
                            ++super.field3391;
                            --super.field3388;
                            if (~super.field3391 <= -5001) {
                                super.field3391 = 0;
                            }
                        }
                    }
                    if (var3) {
                        if (arg1.field5128 >= 0) {
                            if (~var7 == -22) {
                                class530.method3142(arg1, (class138) arg1.field1312);
                                var23 = false;
                            } else if (~var7 != -21) {
                                if (var7 >= 30 && var7 <= 33) {
                                    class291.field4407.method365(3000.0F, var5 * 1.5F);
                                    ((class145) arg1.field1312).method404(class395.field5900, class284.field4314, class46.field602, class265.field4070, ~(var7 - 30) == -1);
                                    var23 = false;
                                } else if (~var7 <= -41 && ~var7 >= -44) {
                                    class291.field4407.method365(3000.0F, var5 * 1.5F);
                                    ((class145) arg1.field1312).method404(class395.field5900, class284.field4314, class46.field602, class60.field721, ~(var7 - 40) == -1);
                                    var23 = false;
                                } else if (~var7 == -23) {
                                    class291.field4407.method309(-1, 1583160, 40, 127);
                                    var23 = false;
                                } else if (var7 != 23) {
                                    if (var7 == 24) {
                                        class291.field4407.method359(0, (class470[]) null);
                                        var23 = false;
                                    } else if (~var7 <= -11) {
                                        if (~var7 >= -14) {
                                            class291.field4407.method265(arg1.field5128);
                                            arg1.field5128 = -1;
                                            var23 = false;
                                        } else {
                                            var23 = false;
                                        }
                                    } else {
                                        var23 = false;
                                    }
                                } else {
                                    class291.field4407.method331();
                                    var23 = false;
                                }
                            } else {
                                class138 var8 = (class138) arg1.field1312;
                                if (var8.field2114 != null) {
                                    var8.field2114.method25(class291.field4407, false);
                                }
                                if (var8.field2104 != null) {
                                    var8.field2104.method25(class291.field4407, false);
                                }
                                if (var8.field2115 != null) {
                                    var8.field2115.method25(class291.field4407, false);
                                }
                                if (var8.field2106 != null) {
                                    var8.field2106.method25(class291.field4407, false);
                                }
                                if (var8.field2105 != null) {
                                    var8.field2105.method25(class291.field4407, false);
                                }
                                for (class327 var9 = var8.field2118; var9 != null; var9 = var9.field4922) {
                                    var9.field4921.method25(class291.field4407, false);
                                }
                                var23 = false;
                            }
                        } else if (~var7 <= -1) {
                            if (~var7 >= -4) {
                                arg1.field5128 = var7;
                                class291.field4407.method318(var7);
                                var23 = false;
                            } else {
                                var23 = false;
                            }
                        } else {
                            var23 = false;
                        }
                    } else {
                        Thread.yield();
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
                        Object var16 = this.field4906;
                        synchronized (this.field4906) {
                            --super.field3390;
                            if (super.field3390 == 0) {
                                this.field4906.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var12 = this.field4906;
                synchronized (this.field4906) {
                    --super.field3390;
                    if (super.field3390 == 0) {
                        this.field4906.notifyAll();
                    }
                }
            }
            return;
        }
        Object var13 = null;
        if (var3) {
            Object var14 = this.field4906;
            synchronized (this.field4906) {
                --super.field3390;
                if (super.field3390 == 0) {
                    this.field4906.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(FZILta;I)V", line = 302)
    public final void method1432(float arg0, boolean arg1, int arg2, class145 arg3, int arg4) {
        ++field4916;
        Object var6 = this.field4906;
        synchronized (this.field4906) {
            super.field3392[super.field3386] = (byte) (!arg1 ? arg2 + 30 : arg2 + 40);
            super.field3389[super.field3386] = arg3;
            super.field3393[super.field3386] = arg0;
            ++super.field3386;
            ++super.field3388;
            if (arg4 == -20295) {
                ++super.field3390;
                if (super.field3386 >= 5000) {
                    super.field3386 = 0;
                }
                if (~this.field4918 < -1) {
                    this.field4906.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLkl;)Z", line = 336)
    public static final boolean method2077(byte arg0, class56 arg1) {
        ++field4905;
        if (arg0 != 55) {
            field4910 = null;
        }
        return class100.field1425 == arg1 || class459.field6684 == arg1 || class313.field4716 == arg1 || class240.field3830 == arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIBIII)V", line = 347)
    public static final void method2078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        ++field4904;
        class155 var10 = null;
        if (arg6 >= 105) {
            for (class155 var11 = (class155) class483.field6941.method1004((byte) -108); var11 != null; var11 = (class155) class483.field6941.method996(1)) {
                if (~var11.field2298 == ~arg5 && var11.field2306 == arg3 && var11.field2302 == arg2 && ~var11.field2301 == ~arg8) {
                    var10 = var11;
                    break;
                }
            }
            if (var10 == null) {
                var10 = new class155();
                var10.field2301 = arg8;
                var10.field2298 = arg5;
                var10.field2302 = arg2;
                var10.field2306 = arg3;
                if (arg3 >= 0 && ~arg2 <= -1 && ~class69.field976 < ~arg3 && ~arg2 > ~class285.field4328) {
                    class425.method2654(var10, (byte) -100);
                }
                class483.field6941.method994(var10, -3610);
            }
            var10.field2299 = arg4;
            var10.field2305 = arg7;
            var10.field2308 = arg9;
            var10.field2295 = arg1;
            var10.field2309 = arg0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 393)
    public final void method1435(int arg0) {
        ++field4917;
        try {
            Object var2 = this.field4906;
            synchronized (this.field4906) {
                while (~super.field3390 != -1) {
                    this.field4906.wait();
                }
            }
        } catch (Exception var4) {
        }
        if (arg0 < 104) {
            this.method2079((byte) 59, -122);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V", line = 424)
    private final void method2079(byte arg0, int arg1) {
        super.field3392[super.field3386] = (byte) arg1;
        ++field4901;
        if (arg0 != 42) {
            this.field4906 = null;
        }
        ++super.field3386;
        if (~super.field3386 <= -5001) {
            super.field3386 = 0;
        }
        ++super.field3390;
        ++super.field3388;
        if (this.field4918 > 0) {
            Object var3 = this.field4906;
            synchronized (this.field4906) {
                this.field4906.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V", line = 452)
    private final void method2080(int arg0, int arg1) {
        ++field4913;
        super.field3392[super.field3386] = (byte) (arg0 + 10);
        ++super.field3386;
        if (~super.field3386 <= -5001) {
            super.field3386 = 0;
        }
        ++super.field3388;
        ++super.field3390;
        if (arg1 != 26133) {
            this.method1438(false, (class138) null);
        }
        if (~this.field4918 < -1) {
            Object var3 = this.field4906;
            synchronized (this.field4906) {
                this.field4906.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLfq;)V", line = 487)
    public final void method1438(boolean arg0, class138 arg1) {
        Object var3 = this.field4906;
        synchronized (this.field4906) {
            super.field3392[super.field3386] = 21;
            super.field3389[super.field3386] = arg1;
            ++super.field3386;
            ++super.field3388;
            ++super.field3390;
            if (super.field3386 >= 5000) {
                super.field3386 = 0;
            }
            if (this.field4918 > 0) {
                this.field4906.notifyAll();
            }
        }
        if (!arg0) {
            this.field4918 = -106;
        }
        ++field4911;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V", line = 517)
    public final void method1434(int arg0, int arg1) {
        ++field4903;
        Object var3 = this.field4906;
        synchronized (this.field4906) {
            super.field3392[super.field3386] = (byte) arg0;
            ++super.field3386;
            if (super.field3386 >= 5000) {
                super.field3386 = 0;
            }
            ++super.field3388;
            int var4 = -8 % ((arg1 - -80) / 46);
            ++super.field3390;
            if (this.field4918 > 0) {
                this.field4906.notifyAll();
            }
        }
    }
}
