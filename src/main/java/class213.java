import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class213 extends class208 {

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field2930 = new Object();

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Lln;")
    private class320[] field2941 = new class320[0];

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    private int field2937 = 0;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field2940 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lig;")
    public static class206 field2928 = new class206(35, -1);

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Loo;")
    public static class543 field2944 = new class543("WIP", 2);

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "F")
    public static float field2946 = 0.25F;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public final void method741(int arg0, int arg1) {
        Object var3 = this.field2930;
        synchronized (this.field2930) {
            super.field2788[super.field2786] = (byte) arg1;
            ++super.field2786;
            ++super.field2789;
            ++super.field2785;
            if (arg0 <= super.field2786) {
                super.field2786 = 0;
            }
            if (this.field2937 > 0) {
                this.field2930.notifyAll();
            }
        }
        ++field2942;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Luaa;Z)V")
    public final void method742(class99 arg0, boolean arg1) {
        ++field2934;
        Object var3 = this.field2930;
        synchronized (this.field2930) {
            --super.field2790;
            if (~super.field2790 > -1) {
                super.field2790 = 4999;
            }
            if (arg1) {
                field2946 = -0.572464F;
            }
            super.field2788[super.field2790] = 21;
            super.field2787[super.field2790] = arg0;
            ++super.field2785;
            ++super.field2789;
            if (~this.field2937 < -1) {
                this.field2930.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
    private final void method1403(int arg0, int arg1) {
        ++field2931;
        super.field2788[super.field2786] = (byte) (arg1 + 10);
        ++super.field2786;
        if (arg0 <= super.field2786) {
            super.field2786 = 0;
        }
        ++super.field2789;
        ++super.field2785;
        if (this.field2937 > 0) {
            Object var3 = this.field2930;
            synchronized (this.field2930) {
                this.field2930.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public final void method734(boolean arg0) {
        try {
            Object var2 = this.field2930;
            synchronized (this.field2930) {
                while (true) {
                    if (~super.field2789 == -1) {
                        break;
                    }
                    this.field2930.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field2943;
        if (arg0) {
            method1404(34);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLuaa;)V")
    public final void method736(boolean arg0, class99 arg1) {
        ++field2933;
        Object var3 = this.field2930;
        synchronized (this.field2930) {
            super.field2788[super.field2786] = 21;
            super.field2787[super.field2786] = arg1;
            ++super.field2786;
            ++super.field2785;
            ++super.field2789;
            if (~super.field2786 <= -5001) {
                super.field2786 = 0;
            }
            if (!arg0) {
                if (~this.field2937 < -1) {
                    this.field2930.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public final void method739(boolean arg0) {
        if (arg0) {
            this.method735((class132) null, 52, (byte) 124, true);
        }
        ++field2935;
        Object var2 = this.field2930;
        synchronized (this.field2930) {
            for (int var3 = 0; this.field2940 > var3; ++var3) {
                if (~this.field2941[var3].field4628 <= -1) {
                    this.method1403(5000, this.field2941[var3].field4628);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field2928 = null;
        field2944 = null;
        if (arg0 > -81) {
            method1404(43);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
    private final void method1405(int arg0, byte arg1) {
        super.field2788[super.field2786] = (byte) arg0;
        ++field2936;
        int var3 = -79 % ((4 - arg1) / 48);
        ++super.field2786;
        if (~super.field2786 <= -5001) {
            super.field2786 = 0;
        }
        ++super.field2789;
        ++super.field2785;
        if (this.field2937 > 0) {
            Object var4 = this.field2930;
            synchronized (this.field2930) {
                this.field2930.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
    public final void method738(int arg0, boolean arg1) {
        if (!arg1) {
            this.method738(111, true);
        }
        ++field2929;
        int var3 = 0;
        Object var4 = this.field2930;
        synchronized (this.field2930) {
            if (this.field2940 == arg0) {
                for (int var5 = 0; ~var5 > ~this.field2940; ++var5) {
                    this.method1405(var3++, (byte) 55);
                }
            } else {
                for (int var6 = 0; var6 < this.field2940; ++var6) {
                    this.field2941[var6].method2084(3156);
                }
                this.field2940 = arg0;
                this.field2941 = new class320[this.field2940];
                for (int var7 = 0; ~this.field2940 < ~var7; ++var7) {
                    this.field2941[var7] = new class320(this);
                    this.field2941[var7].method2090(true);
                    this.method1405(var3++, (byte) 66);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ld;IBZ)V")
    public final void method735(class132 arg0, int arg1, byte arg2, boolean arg3) {
        Object var5 = this.field2930;
        synchronized (this.field2930) {
            super.field2788[super.field2786] = (byte) (!arg3 ? arg1 + 30 : arg1 + 40);
            super.field2787[super.field2786] = arg0;
            ++super.field2786;
            ++super.field2785;
            if (super.field2786 >= 5000) {
                super.field2786 = 0;
            }
            ++super.field2789;
            if (this.field2937 > 0) {
                this.field2930.notifyAll();
            }
        }
        ++field2938;
        if (arg2 != -10) {
            field2945 = 62;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lln;B)V")
    public final void method1406(class320 arg0, byte arg1) {
        ++field2932;
        boolean var3 = false;
        try {
            boolean var4 = false;
            Object var5 = this.field2930;
            byte var6;
            synchronized (this.field2930) {
                while (super.field2785 == 0) {
                    ++this.field2937;
                    this.field2930.wait();
                    --this.field2937;
                }
                var6 = super.field2788[super.field2790];
                if (arg0.field4628 < 0) {
                    if (~var6 <= -1 && var6 <= 3) {
                        var3 = true;
                    }
                } else if (var6 < 0 || var6 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field6867 = super.field2787[super.field2790];
                    super.field2787[super.field2790] = null;
                    ++super.field2790;
                    --super.field2785;
                    if (~super.field2790 <= -5001) {
                        super.field2790 = 0;
                    }
                }
            }
            if (var3) {
                if (arg0.field4628 < 0) {
                    if (var6 >= 0 && ~var6 >= -4) {
                        arg0.field4628 = var6;
                        class103.field1228.method345(var6);
                    }
                } else if (var6 != 21) {
                    if (var6 != 20) {
                        if (~var6 <= -31 && ~var6 >= -34) {
                            ((class132) arg0.field6867).method262(class550.field7844, class650.field9385, class224.field3164, class437.field6505, var6 - 30 == 0);
                        } else if (~var6 <= -41 && ~var6 >= -44) {
                            ((class132) arg0.field6867).method262(class550.field7844, class650.field9385, class224.field3164, class270.field3789, var6 + -40 == 0);
                        } else if (var6 == 22) {
                            class103.field1228.method365(-1, 1583160, 40, 127);
                        } else if (~var6 != -24) {
                            if (var6 == 24) {
                                class103.field1228.method340(0, (class321[]) null);
                            } else if (~var6 <= -11 && var6 <= 13) {
                                class103.field1228.method296(arg0.field4628);
                                arg0.field4628 = -1;
                            }
                        } else {
                            class103.field1228.method373();
                        }
                    } else {
                        class99 var7 = (class99) arg0.field6867;
                        if (var7.field1168 != null) {
                            var7.field1168.method90(class103.field1228, -5);
                        }
                        if (var7.field1176 != null) {
                            var7.field1176.method90(class103.field1228, arg1 + -25);
                        }
                        if (var7.field1175 != null) {
                            var7.field1175.method90(class103.field1228, -5);
                        }
                        if (var7.field1161 != null) {
                            var7.field1161.method90(class103.field1228, arg1 + -25);
                        }
                        if (var7.field1174 != null) {
                            var7.field1174.method90(class103.field1228, -5);
                        }
                        for (class104 var8 = var7.field1167; var8 != null; var8 = var8.field1251) {
                            var8.field1253.method90(class103.field1228, -5);
                        }
                    }
                } else {
                    class435.method2716(arg0, (class99) arg0.field6867);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var21) {
        } finally {
            Object var12 = null;
            if (var3) {
                Object var13 = this.field2930;
                synchronized (this.field2930) {
                    --super.field2789;
                    if (~super.field2789 == -1) {
                        this.field2930.notifyAll();
                    }
                }
            }
        }
        if (arg1 != 20) {
            this.method738(10, false);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Luaa;B)V")
    public final void method740(class99 arg0, byte arg1) {
        Object var3 = this.field2930;
        synchronized (this.field2930) {
            if (arg1 != 13) {
                return;
            }
            super.field2788[super.field2786] = 20;
            super.field2787[super.field2786] = arg0;
            ++super.field2786;
            if (super.field2786 >= 5000) {
                super.field2786 = 0;
            }
            ++super.field2789;
            ++super.field2785;
            if (this.field2937 > 0) {
                this.field2930.notifyAll();
            }
        }
        ++field2939;
    }
}
