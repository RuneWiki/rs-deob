import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class32 extends class170 {

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field535 = new Object();

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    private int field542 = 0;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    private int field541 = 0;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "[Lpr;")
    private class301[] field544 = new class301[0];

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Lqa;")
    public static class243 field533;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(IB)V")
    private final void method263(int arg0, byte arg1) {
        ++field530;
        if (arg1 <= -89) {
            super.field2238[super.field2240] = (byte) (arg0 + 10);
            ++super.field2240;
            ++super.field2239;
            if (super.field2240 >= 5000) {
                super.field2240 = 0;
            }
            ++super.field2237;
            if (this.field541 > 0) {
                Object var3 = this.field535;
                synchronized (this.field535) {
                    this.field535.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLpm;)V")
    public final void method264(byte arg0, class10 arg1) {
        Object var3 = this.field535;
        synchronized (this.field535) {
            super.field2238[super.field2240] = 21;
            super.field2249[super.field2240] = arg1;
            ++super.field2240;
            ++super.field2237;
            ++super.field2239;
            if (super.field2240 >= 5000) {
                super.field2240 = 0;
            }
            if (~this.field541 < -1) {
                this.field535.notifyAll();
            }
            if (arg0 != 121) {
                field533 = null;
            }
        }
        ++field529;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lpm;B)V")
    public final void method265(class10 arg0, byte arg1) {
        ++field532;
        Object var3 = this.field535;
        synchronized (this.field535) {
            super.field2238[super.field2240] = 20;
            super.field2249[super.field2240] = arg0;
            int var4 = -65 % ((arg1 - -6) / 55);
            ++super.field2240;
            if (~super.field2240 <= -5001) {
                super.field2240 = 0;
            }
            ++super.field2239;
            ++super.field2237;
            if (~this.field541 < -1) {
                this.field535.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
    private final void method266(int arg0, int arg1) {
        super.field2238[super.field2240] = (byte) arg1;
        ++field543;
        ++super.field2240;
        if (~super.field2240 <= -5001) {
            super.field2240 = 0;
        }
        ++super.field2239;
        ++super.field2237;
        if (this.field541 > 0) {
            Object var3 = this.field535;
            synchronized (this.field535) {
                this.field535.notifyAll();
            }
        }
        if (arg0 != -16968) {
            this.method269((class337) null, 0.50579524F, false, 97, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lil;I)Lmn;")
    public static final class78 method267(class265 arg0, int arg1) {
        ++field539;
        if (arg1 >= -98) {
            method267((class265) null, -95);
        }
        return new class78(arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1698(1625554944), arg0.method1691(false), arg0.method1697(117));
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public final void method268(int arg0) {
        Object var2 = this.field535;
        synchronized (this.field535) {
            int var3 = 0;
            while (true) {
                if (this.field542 <= var3) {
                    if (arg0 != 15226) {
                        this.field542 = 21;
                    }
                    break;
                }
                if (this.field544[var3].field4326 >= 0) {
                    this.method263(this.field544[var3].field4326, (byte) -121);
                }
                ++var3;
            }
        }
        ++field540;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lgm;FZIB)V")
    public final void method269(class337 arg0, float arg1, boolean arg2, int arg3, byte arg4) {
        ++field534;
        Object var6 = this.field535;
        synchronized (this.field535) {
            super.field2238[super.field2240] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            super.field2249[super.field2240] = arg0;
            super.field2242[super.field2240] = arg1;
            ++super.field2240;
            if (super.field2240 >= 5000) {
                super.field2240 = 0;
            }
            int var7 = 21 / ((arg4 - 9) / 57);
            ++super.field2239;
            ++super.field2237;
            if (this.field541 > 0) {
                this.field535.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILpm;)V")
    public final void method270(int arg0, class10 arg1) {
        ++field537;
        Object var3 = this.field535;
        synchronized (this.field535) {
            --super.field2246;
            if (~super.field2246 > -1) {
                super.field2246 = 4999;
            }
            super.field2238[super.field2246] = 21;
            super.field2249[super.field2246] = arg1;
            ++super.field2237;
            if (arg0 != 5000) {
                this.field535 = null;
            }
            ++super.field2239;
            if (this.field541 > 0) {
                this.field535.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method271(int arg0) {
        ++field538;
        try {
            Object var2 = this.field535;
            synchronized (this.field535) {
                while (super.field2237 != 0) {
                    this.field535.wait();
                }
            }
        } catch (Exception var5) {
        }
        int var3 = -117 % ((48 - arg0) / 59);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lpr;B)V")
    public final void method272(class301 arg0, byte arg1) {
        ++field536;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field535;
            byte var7;
            synchronized (this.field535) {
                if (arg1 != 23) {
                    this.method274(-76, (byte) 64);
                }
                while (~super.field2239 == -1) {
                    ++this.field541;
                    this.field535.wait();
                    --this.field541;
                }
                var7 = super.field2238[super.field2246];
                if (arg0.field4326 >= 0) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field1617 = super.field2249[super.field2246];
                    var5 = super.field2242[super.field2246];
                    super.field2249[super.field2246] = null;
                    ++super.field2246;
                    if (~super.field2246 <= -5001) {
                        super.field2246 = 0;
                    }
                    --super.field2239;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg0.field4326 < 0) {
                if (~var7 <= -1 && ~var7 >= -4) {
                    arg0.field4326 = var7;
                    class310.field4442.method2161(var7);
                }
            } else if (~var7 == -22) {
                class358.method2348(arg0, (class10) arg0.field1617);
            } else if (~var7 == -21) {
                class10 var8 = (class10) arg0.field1617;
                if (var8.field117 != null) {
                    var8.field117.method161(class310.field4442, arg1 ^ 23);
                }
                if (var8.field120 != null) {
                    var8.field120.method161(class310.field4442, arg1 ^ 23);
                }
                if (var8.field123 != null) {
                    var8.field123.method161(class310.field4442, 0);
                }
                if (var8.field102 != null) {
                    var8.field102.method161(class310.field4442, 0);
                }
                if (var8.field124 != null) {
                    var8.field124.method161(class310.field4442, 0);
                }
                for (class39 var9 = var8.field109; var9 != null; var9 = var9.field627) {
                    var9.field621.method161(class310.field4442, arg1 ^ 23);
                }
            } else if (~var7 <= -31 && ~var7 >= -34) {
                class310.field4442.method2107(3000.0F, var5 * 1.5F);
                ((class337) arg0.field1617).method790(class308.field4398, class383.field5729, class27.field480, class337.field4974, ~(var7 + -30) == -1);
            } else if (var7 >= 40 && var7 <= 43) {
                class310.field4442.method2107(3000.0F, var5 * 1.5F);
                ((class337) arg0.field1617).method790(class308.field4398, class383.field5729, class27.field480, class19.field325, var7 + -40 == 0);
            } else if (var7 != 22) {
                if (~var7 == -24) {
                    class310.field4442.method2054();
                } else if (var7 == 24) {
                    class310.field4442.method2151(0, (class403[]) null);
                } else if (~var7 <= -11 && ~var7 >= -14) {
                    class310.field4442.method2120(arg0.field4326);
                    arg0.field4326 = -1;
                }
            } else {
                class310.field4442.method2114(-1, 1583160, 40);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field535;
                synchronized (this.field535) {
                    --super.field2237;
                    if (~super.field2237 == -1) {
                        this.field535.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    public final void method273(int arg0, byte arg1) {
        ++field531;
        Object var3 = this.field535;
        synchronized (this.field535) {
            super.field2238[super.field2240] = (byte) arg0;
            ++super.field2240;
            ++super.field2239;
            ++super.field2237;
            if (~super.field2240 <= -5001) {
                super.field2240 = 0;
            }
            if (arg1 < -126) {
                if (~this.field541 < -1) {
                    this.field535.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IB)V")
    public final void method274(int arg0, byte arg1) {
        ++field545;
        int var3 = 0;
        Object var4 = this.field535;
        synchronized (this.field535) {
            if (~this.field542 == ~arg0) {
                for (int var5 = 0; var5 < this.field542; ++var5) {
                    this.method266(arg1 + -17094, var3++);
                }
            } else {
                for (int var6 = 0; this.field542 > var6; ++var6) {
                    this.field544[var6].method1908((byte) 87);
                }
                this.field542 = arg0;
                if (arg1 != 126) {
                    this.method269((class337) null, 1.7343023F, false, -46, (byte) 16);
                }
                this.field544 = new class301[this.field542];
                for (int var7 = 0; this.field542 > var7; ++var7) {
                    this.field544[var7] = new class301(this);
                    this.field544[var7].method1909((byte) 96);
                    this.method266(arg1 ^ -16954, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public static void method275(int arg0) {
        if (arg0 >= -70) {
            field533 = null;
        }
        field533 = null;
    }
}
