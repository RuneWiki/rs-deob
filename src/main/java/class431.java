import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class431 extends class70 {

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Ljava/lang/Object;")
    private Object field6345 = new Object();

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[Lrn;")
    private class145[] field6351 = new class145[0];

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    private int field6352 = 0;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    private int field6354 = 0;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field6355 = -1;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "[[B")
    public static byte[][] field6341;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method433(int arg0) {
        Object var2 = this.field6345;
        synchronized (this.field6345) {
            if (arg0 != 8) {
                this.method432(-72, -103);
            }
            int var3 = 0;
            while (true) {
                if (var3 >= this.field6354) {
                    break;
                }
                if (this.field6351[var3].field2273 >= 0) {
                    this.method2667((byte) -121, this.field6351[var3].field2273);
                }
                ++var3;
            }
        }
        ++field6349;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public final void method432(int arg0, int arg1) {
        Object var3 = this.field6345;
        synchronized (this.field6345) {
            if (arg1 != 32) {
                return;
            }
            super.field875[super.field870] = (byte) arg0;
            ++super.field870;
            ++super.field861;
            ++super.field869;
            if (super.field870 >= 5000) {
                super.field870 = 0;
            }
            if (this.field6352 > 0) {
                this.field6345.notifyAll();
            }
        }
        ++field6348;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)V")
    private final void method2667(byte arg0, int arg1) {
        ++field6342;
        super.field875[super.field870] = (byte) (arg1 + 10);
        if (arg0 == -121) {
            ++super.field870;
            ++super.field869;
            if (~super.field870 <= -5001) {
                super.field870 = 0;
            }
            ++super.field861;
            if (~this.field6352 < -1) {
                Object var3 = this.field6345;
                synchronized (this.field6345) {
                    this.field6345.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method436(int arg0) {
        ++field6347;
        if (arg0 > -102) {
            this.method436(127);
        }
        try {
            Object var2 = this.field6345;
            synchronized (this.field6345) {
                while (~super.field861 != -1) {
                    this.field6345.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lwe;I)V")
    public final void method440(class232 arg0, int arg1) {
        Object var3 = this.field6345;
        synchronized (this.field6345) {
            super.field875[super.field870] = 20;
            super.field872[super.field870] = arg0;
            ++super.field870;
            if (arg1 <= 119) {
                return;
            }
            ++super.field861;
            if (super.field870 >= 5000) {
                super.field870 = 0;
            }
            ++super.field869;
            if (~this.field6352 < -1) {
                this.field6345.notifyAll();
            }
        }
        ++field6343;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public final void method435(byte arg0, int arg1) {
        ++field6350;
        if (arg0 >= -45) {
            field6355 = -41;
        }
        int var3 = 0;
        Object var4 = this.field6345;
        synchronized (this.field6345) {
            if (~this.field6354 == ~arg1) {
                for (int var5 = 0; this.field6354 > var5; ++var5) {
                    this.method2668(var3++, (byte) 88);
                }
            } else {
                for (int var6 = 0; var6 < this.field6354; ++var6) {
                    this.field6351[var6].method1051(0);
                }
                this.field6354 = arg1;
                this.field6351 = new class145[this.field6354];
                for (int var7 = 0; ~var7 > ~this.field6354; ++var7) {
                    this.field6351[var7] = new class145(this);
                    this.field6351[var7].method1050(75);
                    this.method2668(var3++, (byte) 88);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
    private final void method2668(int arg0, byte arg1) {
        super.field875[super.field870] = (byte) arg0;
        ++field6338;
        if (arg1 != 88) {
            this.field6351 = null;
        }
        ++super.field870;
        if (~super.field870 <= -5001) {
            super.field870 = 0;
        }
        ++super.field869;
        ++super.field861;
        if (~this.field6352 < -1) {
            Object var3 = this.field6345;
            synchronized (this.field6345) {
                this.field6345.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLrn;)V")
    public final void method2669(byte arg0, class145 arg1) {
        ++field6346;
        boolean var3 = false;
        boolean var23 = false;
        label385: {
            try {
                var23 = true;
                boolean var4 = false;
                float var5 = 0.0F;
                Object var6 = this.field6345;
                byte var7;
                synchronized (this.field6345) {
                    while (super.field869 == 0) {
                        ++this.field6352;
                        this.field6345.wait();
                        --this.field6352;
                    }
                    var7 = super.field875[super.field867];
                    if (arg1.field2273 >= 0) {
                        if (~var7 > -1 || var7 > 3) {
                            var3 = true;
                        }
                    } else if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                    if (var3) {
                        arg1.field1424 = super.field872[super.field867];
                        var5 = super.field874[super.field867];
                        super.field872[super.field867] = null;
                        ++super.field867;
                        if (super.field867 >= 5000) {
                            super.field867 = 0;
                        }
                        --super.field869;
                    }
                }
                if (arg0 == -25) {
                    if (!var3) {
                        Thread.yield();
                        var23 = false;
                    } else if (~arg1.field2273 <= -1) {
                        if (var7 == 21) {
                            class9.method98(arg1, (class232) arg1.field1424);
                            var23 = false;
                        } else if (var7 != 20) {
                            if (var7 >= 30 && var7 <= 33) {
                                class67.field847.method619(3000.0F, var5 * 1.5F);
                                ((class129) arg1.field1424).method784(class235.field3937, class181.field2959, class374.field5649, class241.field3991, var7 - 30 == 0);
                                var23 = false;
                            } else if (~var7 <= -41 && ~var7 >= -44) {
                                class67.field847.method619(3000.0F, var5 * 1.5F);
                                ((class129) arg1.field1424).method784(class235.field3937, class181.field2959, class374.field5649, class56.field706, ~(var7 + -40) == -1);
                                var23 = false;
                            } else if (var7 == 22) {
                                class67.field847.method575(-1, 1583160, 40);
                                var23 = false;
                            } else if (~var7 != -24) {
                                if (~var7 != -25) {
                                    if (var7 >= 10) {
                                        if (var7 <= 13) {
                                            class67.field847.method637(arg1.field2273);
                                            arg1.field2273 = -1;
                                            var23 = false;
                                        } else {
                                            var23 = false;
                                        }
                                    } else {
                                        var23 = false;
                                    }
                                } else {
                                    class67.field847.method613(0, (class62[]) null);
                                    var23 = false;
                                }
                            } else {
                                class67.field847.method673();
                                var23 = false;
                            }
                        } else {
                            class232 var8 = (class232) arg1.field1424;
                            if (var8.field3873 != null) {
                                var8.field3873.method196(class67.field847, (byte) -100);
                            }
                            if (var8.field3872 != null) {
                                var8.field3872.method196(class67.field847, (byte) -83);
                            }
                            if (var8.field3878 != null) {
                                var8.field3878.method196(class67.field847, (byte) -125);
                            }
                            if (var8.field3889 != null) {
                                var8.field3889.method196(class67.field847, (byte) -71);
                            }
                            if (var8.field3864 != null) {
                                var8.field3864.method196(class67.field847, (byte) -77);
                            }
                            for (class247 var9 = var8.field3866; var9 != null; var9 = var9.field4054) {
                                var9.field4052.method196(class67.field847, (byte) -114);
                            }
                            var23 = false;
                        }
                    } else if (~var7 <= -1) {
                        if (~var7 >= -4) {
                            arg1.field2273 = var7;
                            class67.field847.method674(var7);
                            var23 = false;
                        } else {
                            var23 = false;
                        }
                    } else {
                        var23 = false;
                    }
                    break label385;
                }
                Object var10000 = null;
                var23 = false;
            } catch (Exception var28) {
                var23 = false;
                break label385;
            } finally {
                if (var23) {
                    Object var15 = null;
                    if (var3) {
                        Object var16 = this.field6345;
                        synchronized (this.field6345) {
                            --super.field861;
                            if (~super.field861 == -1) {
                                this.field6345.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var12 = this.field6345;
                synchronized (this.field6345) {
                    --super.field861;
                    if (~super.field861 == -1) {
                        this.field6345.notifyAll();
                    }
                }
            }
            return;
        }
        Object var13 = null;
        if (var3) {
            Object var14 = this.field6345;
            synchronized (this.field6345) {
                --super.field861;
                if (~super.field861 == -1) {
                    this.field6345.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method2670(boolean arg0) {
        if (arg0) {
            field6341 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLwe;)V")
    public final void method438(byte arg0, class232 arg1) {
        if (arg0 != -9) {
            this.method2668(-87, (byte) -117);
        }
        Object var3 = this.field6345;
        synchronized (this.field6345) {
            --super.field867;
            if (~super.field867 > -1) {
                super.field867 = 4999;
            }
            super.field875[super.field867] = 21;
            super.field872[super.field867] = arg1;
            ++super.field869;
            ++super.field861;
            if (~this.field6352 < -1) {
                this.field6345.notifyAll();
            }
        }
        ++field6344;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llf;ZFIZ)V")
    public final void method437(class129 arg0, boolean arg1, float arg2, int arg3, boolean arg4) {
        Object var6 = this.field6345;
        synchronized (this.field6345) {
            super.field875[super.field870] = (byte) (!arg4 ? arg3 + 30 : arg3 + 40);
            super.field872[super.field870] = arg0;
            super.field874[super.field870] = arg2;
            if (!arg1) {
                this.method2668(-47, (byte) 70);
            }
            ++super.field870;
            ++super.field869;
            if (~super.field870 <= -5001) {
                super.field870 = 0;
            }
            ++super.field861;
            if (this.field6352 > 0) {
                this.field6345.notifyAll();
            }
        }
        ++field6339;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lwe;I)V")
    public final void method434(class232 arg0, int arg1) {
        ++field6353;
        Object var3 = this.field6345;
        synchronized (this.field6345) {
            super.field875[super.field870] = 21;
            super.field872[super.field870] = arg0;
            ++super.field870;
            if (~super.field870 <= -5001) {
                super.field870 = 0;
            }
            ++super.field869;
            ++super.field861;
            if (arg1 != -29009) {
                this.field6351 = null;
            }
            if (~this.field6352 < -1) {
                this.field6345.notifyAll();
            }
        }
    }
}
