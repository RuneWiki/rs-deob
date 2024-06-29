import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class70 extends class413 {

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field942 = new Object();

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    private int field944 = 0;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "[Lvs;")
    private class469[] field945 = new class469[0];

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "S")
    public static short field934 = 320;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "[I")
    public static int[] field933;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILrr;)V", line = 5)
    public final void method488(int arg0, class306 arg1) {
        Object var3 = this.field942;
        synchronized (this.field942) {
            super.field6228[super.field6224] = 20;
            super.field6231[super.field6224] = arg1;
            if (arg0 > -109) {
                this.field944 = 85;
            }
            ++super.field6224;
            if (~super.field6224 <= -5001) {
                super.field6224 = 0;
            }
            ++super.field6226;
            ++super.field6229;
            if (~this.field946 < -1) {
                this.field942.notifyAll();
            }
        }
        ++field939;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lrr;I)V", line = 29)
    public final void method489(class306 arg0, int arg1) {
        ++field940;
        Object var3 = this.field942;
        synchronized (this.field942) {
            super.field6228[super.field6224] = 21;
            super.field6231[super.field6224] = arg0;
            ++super.field6224;
            ++super.field6226;
            if (~super.field6224 <= -5001) {
                super.field6224 = 0;
            }
            ++super.field6229;
            if (arg1 < this.field946) {
                this.field942.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZFLta;II)V", line = 51)
    public final void method490(boolean arg0, float arg1, class337 arg2, int arg3, int arg4) {
        if (arg4 < 120) {
            field934 = 108;
        }
        ++field929;
        Object var6 = this.field942;
        synchronized (this.field942) {
            super.field6228[super.field6224] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
            super.field6231[super.field6224] = arg2;
            super.field6232[super.field6224] = arg1;
            ++super.field6224;
            if (super.field6224 >= 5000) {
                super.field6224 = 0;
            }
            ++super.field6229;
            ++super.field6226;
            if (~this.field946 < -1) {
                this.field942.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V", line = 80)
    public final void method491(int arg0, int arg1) {
        ++field932;
        Object var3 = this.field942;
        synchronized (this.field942) {
            super.field6228[super.field6224] = (byte) arg0;
            if (arg1 == 1048576) {
                ++super.field6224;
                ++super.field6226;
                if (super.field6224 >= 5000) {
                    super.field6224 = 0;
                }
                ++super.field6229;
                if (this.field946 > 0) {
                    this.field942.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 105)
    public static void method492(byte arg0) {
        int var1 = 83 / ((arg0 - -26) / 51);
        field933 = null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 115)
    public final void method493(int arg0) {
        try {
            Object var2 = this.field942;
            synchronized (this.field942) {
                while (true) {
                    if (~super.field6226 == -1) {
                        break;
                    }
                    this.field942.wait();
                }
            }
            if (arg0 != 0) {
                this.field946 = 25;
            }
        } catch (Exception var4) {
        }
        ++field937;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V", line = 137)
    private final void method494(int arg0, int arg1) {
        ++field943;
        super.field6228[super.field6224] = (byte) arg0;
        ++super.field6224;
        ++super.field6229;
        if (arg1 > -96) {
            this.method490(true, -1.7942387F, (class337) null, 22, -77);
        }
        ++super.field6226;
        if (~super.field6224 <= -5001) {
            super.field6224 = 0;
        }
        if (~this.field946 < -1) {
            Object var3 = this.field942;
            synchronized (this.field942) {
                this.field942.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLvs;)V", line = 166)
    public final void method495(boolean arg0, class469 arg1) {
        ++field941;
        boolean var3 = arg0;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field942;
            byte var7;
            synchronized (this.field942) {
                while (super.field6229 == 0) {
                    ++this.field946;
                    this.field942.wait();
                    --this.field946;
                }
                var7 = super.field6228[super.field6233];
                if (arg1.field6870 >= 0) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field1089 = super.field6231[super.field6233];
                    var5 = super.field6232[super.field6233];
                    super.field6231[super.field6233] = null;
                    ++super.field6233;
                    if (~super.field6233 <= -5001) {
                        super.field6233 = 0;
                    }
                    --super.field6229;
                }
            }
            if (var3) {
                if (~arg1.field6870 > -1) {
                    if (~var7 <= -1 && var7 <= 3) {
                        arg1.field6870 = var7;
                        class521.field7669.method145(var7);
                    }
                } else if (var7 != 21) {
                    if (var7 == 20) {
                        class306 var8 = (class306) arg1.field1089;
                        if (var8.field4596 != null) {
                            var8.field4596.method234(class521.field7669, 28007);
                        }
                        if (var8.field4582 != null) {
                            var8.field4582.method234(class521.field7669, 28007);
                        }
                        if (var8.field4592 != null) {
                            var8.field4592.method234(class521.field7669, 28007);
                        }
                        if (var8.field4586 != null) {
                            var8.field4586.method234(class521.field7669, 28007);
                        }
                        if (var8.field4577 != null) {
                            var8.field4577.method234(class521.field7669, 28007);
                        }
                        for (class17 var9 = var8.field4589; var9 != null; var9 = var9.field281) {
                            var9.field279.method234(class521.field7669, 28007);
                        }
                    } else if (var7 >= 30 && ~var7 >= -34) {
                        class521.field7669.method154(3000.0F, var5 * 1.5F);
                        ((class337) arg1.field1089).method711(class487.field7256, class301.field4475, class489.field7290, class522.field7677, var7 + -30 == 0);
                    } else if (~var7 <= -41 && var7 <= 43) {
                        class521.field7669.method154(3000.0F, var5 * 1.5F);
                        ((class337) arg1.field1089).method711(class487.field7256, class301.field4475, class489.field7290, class283.field4278, var7 + -40 == 0);
                    } else if (var7 != 22) {
                        if (var7 == 23) {
                            class521.field7669.method62();
                        } else if (var7 == 24) {
                            class521.field7669.method114(0, (class531[]) null);
                        } else if (var7 >= 10 && ~var7 >= -14) {
                            class521.field7669.method96(arg1.field6870);
                            arg1.field6870 = -1;
                        }
                    } else {
                        class521.field7669.method104(-1, 1583160, 40, 127);
                    }
                } else {
                    class51.method381(arg1, (class306) arg1.field1089);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field942;
                synchronized (this.field942) {
                    --super.field6226;
                    if (super.field6226 == 0) {
                        this.field942.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 333)
    public final void method496(int arg0) {
        ++field935;
        Object var2 = this.field942;
        synchronized (this.field942) {
            for (int var3 = arg0; var3 < this.field944; ++var3) {
                if (~this.field945[var3].field6870 <= -1) {
                    this.method498(arg0 + -72, this.field945[var3].field6870);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I", line = 353)
    public static final int method497(int arg0, int arg1, int arg2) {
        ++field930;
        int var3 = arg0 >> 31 & arg1 + -1;
        int var4 = -76 % ((arg2 - -23) / 36);
        return (arg0 - -(arg0 >>> 31)) % arg1 - -var3;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V", line = 370)
    private final void method498(int arg0, int arg1) {
        super.field6228[super.field6224] = (byte) (arg1 + 10);
        ++field931;
        ++super.field6224;
        if (~super.field6224 <= -5001) {
            super.field6224 = 0;
        }
        ++super.field6226;
        if (arg0 < -39) {
            ++super.field6229;
            if (this.field946 > 0) {
                Object var3 = this.field942;
                synchronized (this.field942) {
                    this.field942.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V", line = 403)
    public final void method499(int arg0, int arg1) {
        ++field936;
        int var3 = 0;
        Object var4 = this.field942;
        synchronized (this.field942) {
            if (this.field944 == arg0) {
                for (int var5 = 0; var5 < this.field944; ++var5) {
                    this.method494(var3++, -115);
                }
            } else {
                for (int var6 = 0; this.field944 > var6; ++var6) {
                    this.field945[var6].method2779(true);
                }
                this.field944 = arg0;
                this.field945 = new class469[this.field944];
                for (int var7 = 0; ~this.field944 < ~var7; ++var7) {
                    this.field945[var7] = new class469(this);
                    this.field945[var7].method2782(true);
                    this.method494(var3++, -120);
                }
                if (arg1 != 1) {
                    method492((byte) -9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrr;I)V", line = 453)
    public final void method500(class306 arg0, int arg1) {
        if (arg1 > -55) {
            this.field945 = null;
        }
        ++field938;
        Object var3 = this.field942;
        synchronized (this.field942) {
            --super.field6233;
            if (super.field6233 < 0) {
                super.field6233 = 4999;
            }
            super.field6228[super.field6233] = 21;
            super.field6231[super.field6233] = arg0;
            ++super.field6226;
            ++super.field6229;
            if (~this.field946 < -1) {
                this.field942.notifyAll();
            }
        }
    }
}
