import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class135 extends class263 {

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field1839 = new Object();

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[Lga;")
    private class342[] field1848 = new class342[0];

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    private int field1847 = 0;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    private int field1849 = 0;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Llu;")
    public static class610 field1840 = new class610(20, 7);

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "J")
    public static long field1846 = -1L;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Luk;")
    public static class219 field1843 = new class219(128);

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V", line = 3)
    private final void method927(boolean arg0, int arg1) {
        if (arg0) {
            ++field1834;
            super.field3744[super.field3741] = (byte) (arg1 + 10);
            ++super.field3741;
            ++super.field3747;
            ++super.field3748;
            if (super.field3741 >= 5000) {
                super.field3741 = 0;
            }
            if (~this.field1849 < -1) {
                Object var3 = this.field1839;
                synchronized (this.field1839) {
                    this.field1839.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lnj;I)V", line = 31)
    public final void method928(class205 arg0, int arg1) {
        if (arg1 != -8186) {
            this.method935(44, -0.38440177F, (class176) null, true, 120);
        }
        ++field1835;
        Object var3 = this.field1839;
        synchronized (this.field1839) {
            super.field3744[super.field3741] = 20;
            super.field3751[super.field3741] = arg0;
            ++super.field3741;
            ++super.field3748;
            if (~super.field3741 <= -5001) {
                super.field3741 = 0;
            }
            ++super.field3747;
            if (~this.field1849 < -1) {
                this.field1839.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Lnj;B)V", line = 58)
    public final void method929(class205 arg0, byte arg1) {
        ++field1833;
        Object var3 = this.field1839;
        synchronized (this.field1839) {
            super.field3744[super.field3741] = 21;
            super.field3751[super.field3741] = arg0;
            ++super.field3741;
            ++super.field3748;
            ++super.field3747;
            if (~super.field3741 <= -5001) {
                super.field3741 = 0;
            }
            if (~this.field1849 < -1) {
                this.field1839.notifyAll();
            }
            int var4 = -16 / ((-35 - arg1) / 56);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lga;B)V", line = 82)
    public final void method930(class342 arg0, byte arg1) {
        if (arg1 != -115) {
            this.method935(-104, -0.025933294F, (class176) null, true, -30);
        }
        ++field1836;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field1839;
            byte var7;
            synchronized (this.field1839) {
                while (super.field3748 == 0) {
                    ++this.field1849;
                    this.field1839.wait();
                    --this.field1849;
                }
                var7 = super.field3744[super.field3750];
                if (~arg0.field4734 > -1) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (var7 < 0 || var7 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field596 = super.field3751[super.field3750];
                    var5 = super.field3745[super.field3750];
                    super.field3751[super.field3750] = null;
                    ++super.field3750;
                    if (~super.field3750 <= -5001) {
                        super.field3750 = 0;
                    }
                    --super.field3748;
                }
            }
            if (var3) {
                if (arg0.field4734 < 0) {
                    if (~var7 <= -1 && var7 <= 3) {
                        arg0.field4734 = var7;
                        class193.field2864.method459(var7);
                    }
                } else if (~var7 != -22) {
                    if (~var7 != -21) {
                        if (~var7 <= -31 && var7 <= 33) {
                            class193.field2864.method422(3000.0F, var5 * 1.5F);
                            ((class176) arg0.field596).method1230(class297.field4092, class18.field169, class504.field7141, class222.field3230, ~(var7 - 30) == -1);
                        } else if (var7 >= 40 && var7 <= 43) {
                            class193.field2864.method422(3000.0F, var5 * 1.5F);
                            ((class176) arg0.field596).method1230(class297.field4092, class18.field169, class504.field7141, class25.field245, var7 + -40 == 0);
                        } else if (var7 != 22) {
                            if (var7 != 23) {
                                if (var7 == 24) {
                                    class193.field2864.method429(0, (class405[]) null);
                                } else if (~var7 <= -11 && var7 <= 13) {
                                    class193.field2864.method461(arg0.field4734);
                                    arg0.field4734 = -1;
                                }
                            } else {
                                class193.field2864.method440();
                            }
                        } else {
                            class193.field2864.method443(-1, 1583160, 40, 127);
                        }
                    } else {
                        class205 var8 = (class205) arg0.field596;
                        if (var8.field3047 != null) {
                            var8.field3047.method194(arg1 ^ -115, class193.field2864);
                        }
                        if (var8.field3037 != null) {
                            var8.field3037.method194(0, class193.field2864);
                        }
                        if (var8.field3040 != null) {
                            var8.field3040.method194(arg1 ^ -115, class193.field2864);
                        }
                        if (var8.field3050 != null) {
                            var8.field3050.method194(0, class193.field2864);
                        }
                        if (var8.field3045 != null) {
                            var8.field3045.method194(0, class193.field2864);
                        }
                        for (class636 var9 = var8.field3029; var9 != null; var9 = var9.field9302) {
                            var9.field9299.method194(arg1 ^ -115, class193.field2864);
                        }
                    }
                } else {
                    class328.method1963(arg0, (class205) arg0.field596);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field1839;
                synchronized (this.field1839) {
                    --super.field3747;
                    if (~super.field3747 == -1) {
                        this.field1839.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V", line = 252)
    public final void method931(int arg0, int arg1) {
        ++field1841;
        int var3 = 0;
        Object var4 = this.field1839;
        synchronized (this.field1839) {
            if (arg0 > -35) {
                this.field1849 = 1;
            }
            if (~this.field1847 == ~arg1) {
                for (int var5 = 0; var5 < this.field1847; ++var5) {
                    this.method933((byte) 107, var3++);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field1847; ++var6) {
                    this.field1848[var6].method2094(true);
                }
                this.field1847 = arg1;
                this.field1848 = new class342[this.field1847];
                for (int var7 = 0; var7 < this.field1847; ++var7) {
                    this.field1848[var7] = new class342(this);
                    this.field1848[var7].method2097(true);
                    this.method933((byte) 124, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 303)
    public static void method932(int arg0) {
        field1840 = null;
        field1843 = null;
        if (arg0 != 0) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V", line = 314)
    private final void method933(byte arg0, int arg1) {
        ++field1838;
        super.field3744[super.field3741] = (byte) arg1;
        ++super.field3741;
        if (super.field3741 >= 5000) {
            super.field3741 = 0;
        }
        ++super.field3748;
        ++super.field3747;
        if (this.field1849 > 0) {
            Object var3 = this.field1839;
            synchronized (this.field1839) {
                this.field1839.notifyAll();
            }
        }
        if (arg0 < 94) {
            this.field1849 = 18;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lnj;B)V", line = 339)
    public final void method934(class205 arg0, byte arg1) {
        ++field1842;
        Object var3 = this.field1839;
        synchronized (this.field1839) {
            --super.field3750;
            if (super.field3750 < 0) {
                super.field3750 = 4999;
            }
            if (arg1 != -28) {
                field1846 = 49L;
            }
            super.field3744[super.field3750] = 21;
            super.field3751[super.field3750] = arg0;
            ++super.field3748;
            ++super.field3747;
            if (~this.field1849 < -1) {
                this.field1839.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IFLsa;ZI)V", line = 364)
    public final void method935(int arg0, float arg1, class176 arg2, boolean arg3, int arg4) {
        Object var6 = this.field1839;
        synchronized (this.field1839) {
            super.field3744[super.field3741] = (byte) (!arg3 ? arg0 + 30 : arg0 + 40);
            super.field3751[super.field3741] = arg2;
            super.field3745[super.field3741] = arg1;
            ++super.field3741;
            ++super.field3748;
            if (~super.field3741 <= -5001) {
                super.field3741 = 0;
            }
            ++super.field3747;
            if (this.field1849 > 0) {
                this.field1839.notifyAll();
            }
        }
        if (arg4 != 17246) {
            field1843 = null;
        }
        ++field1844;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 394)
    public static final void method936(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field3045 != null) {
                var3.field3045 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 411)
    public final void method937(int arg0, int arg1) {
        ++field1845;
        Object var3 = this.field1839;
        synchronized (this.field1839) {
            if (arg0 != 23354) {
                this.method934((class205) null, (byte) 13);
            }
            super.field3744[super.field3741] = (byte) arg1;
            ++super.field3741;
            if (super.field3741 >= 5000) {
                super.field3741 = 0;
            }
            ++super.field3747;
            ++super.field3748;
            if (this.field1849 > 0) {
                this.field1839.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 438)
    public final void method938(int arg0) {
        ++field1837;
        try {
            Object var2 = this.field1839;
            synchronized (this.field1839) {
                while (super.field3747 != 0) {
                    this.field1839.wait();
                }
            }
        } catch (Exception var4) {
        }
        if (arg0 != 5126) {
            this.method937(-117, -9);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 473)
    public final void method939(int arg0) {
        Object var2 = this.field1839;
        synchronized (this.field1839) {
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field1847) {
                    if (arg0 < 12) {
                        this.method933((byte) -112, -109);
                    }
                    break;
                }
                if (this.field1848[var3].field4734 >= 0) {
                    this.method927(true, this.field1848[var3].field4734);
                }
                ++var3;
            }
        }
        ++field1832;
    }
}
