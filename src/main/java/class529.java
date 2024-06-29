import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class529 extends class337 {

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field7800 = new Object();

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    private int field7810 = 0;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "[Lau;")
    private class515[] field7811 = new class515[0];

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "I")
    private int field7813 = 0;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "[F")
    public static float[] field7804 = new float[4];

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public static int field7812 = 0;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "[Lna;")
    public static class35[] field7807;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public final void method2212(boolean arg0) {
        if (!arg0) {
            Object var2 = this.field7800;
            synchronized (this.field7800) {
                int var3 = 0;
                while (true) {
                    if (var3 >= this.field7810) {
                        break;
                    }
                    if (~this.field7811[var3].field7570 <= -1) {
                        this.method3135(this.field7811[var3].field7570, 4583);
                    }
                    ++var3;
                }
            }
            ++field7809;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lkf;B)V")
    public final void method2211(class165 arg0, byte arg1) {
        ++field7796;
        Object var3 = this.field7800;
        synchronized (this.field7800) {
            super.field5150[super.field5147] = 20;
            super.field5151[super.field5147] = arg0;
            if (arg1 > -99) {
                this.field7800 = null;
            }
            ++super.field5147;
            if (~super.field5147 <= -5001) {
                super.field5147 = 0;
            }
            ++super.field5145;
            ++super.field5149;
            if (this.field7813 > 0) {
                this.field7800.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public final void method2209(byte arg0) {
        try {
            Object var2 = this.field7800;
            synchronized (this.field7800) {
                while (true) {
                    if (~super.field5149 == -1) {
                        break;
                    }
                    this.field7800.wait();
                }
            }
            if (arg0 > -123) {
                this.method3138(false, (class515) null);
            }
        } catch (Exception var4) {
        }
        ++field7793;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method3134(int arg0) {
        field7807 = null;
        field7804 = null;
        int var1 = 107 / ((arg0 - 11) / 61);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)V")
    private final void method3135(int arg0, int arg1) {
        ++field7801;
        super.field5150[super.field5147] = (byte) (arg0 + 10);
        ++super.field5147;
        if (arg1 != 4583) {
            this.method2207(false, -75);
        }
        ++super.field5145;
        if (super.field5147 >= 5000) {
            super.field5147 = 0;
        }
        ++super.field5149;
        if (~this.field7813 < -1) {
            Object var3 = this.field7800;
            synchronized (this.field7800) {
                this.field7800.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(IZ)V")
    private final void method3136(int arg0, boolean arg1) {
        super.field5150[super.field5147] = (byte) arg0;
        ++field7799;
        ++super.field5147;
        if (arg1) {
            this.field7813 = -26;
        }
        if (~super.field5147 <= -5001) {
            super.field5147 = 0;
        }
        ++super.field5149;
        ++super.field5145;
        if (~this.field7813 < -1) {
            Object var3 = this.field7800;
            synchronized (this.field7800) {
                this.field7800.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
    public final void method2208(int arg0, boolean arg1) {
        ++field7805;
        Object var3 = this.field7800;
        synchronized (this.field7800) {
            super.field5150[super.field5147] = (byte) arg0;
            ++super.field5147;
            if (~super.field5147 <= -5001) {
                super.field5147 = 0;
            }
            ++super.field5145;
            ++super.field5149;
            if (~this.field7813 < -1) {
                this.field7800.notifyAll();
            }
        }
        if (!arg1) {
            this.field7813 = 7;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Lkf;I)V")
    public final void method2205(class165 arg0, int arg1) {
        Object var3 = this.field7800;
        synchronized (this.field7800) {
            super.field5150[super.field5147] = 21;
            super.field5151[super.field5147] = arg0;
            ++super.field5147;
            ++super.field5145;
            ++super.field5149;
            if (~super.field5147 <= -5001) {
                super.field5147 = 0;
            }
            if (arg1 < 33) {
                method3134(-29);
            }
            if (this.field7813 > 0) {
                this.field7800.notifyAll();
            }
        }
        ++field7803;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZFBLna;I)V")
    public final void method2206(boolean arg0, float arg1, byte arg2, class35 arg3, int arg4) {
        Object var6 = this.field7800;
        synchronized (this.field7800) {
            super.field5150[super.field5147] = (byte) (arg0 ? arg4 + 40 : arg4 + 30);
            super.field5151[super.field5147] = arg3;
            super.field5141[super.field5147] = arg1;
            ++super.field5147;
            if (super.field5147 >= 5000) {
                super.field5147 = 0;
            }
            ++super.field5145;
            ++super.field5149;
            if (arg2 > -73) {
                field7812 = -78;
            }
            if (~this.field7813 < -1) {
                this.field7800.notifyAll();
            }
        }
        ++field7797;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZI)V")
    public final void method2207(boolean arg0, int arg1) {
        ++field7802;
        int var3 = 0;
        Object var4 = this.field7800;
        synchronized (this.field7800) {
            if (this.field7810 == arg1) {
                for (int var5 = 0; this.field7810 > var5; ++var5) {
                    this.method3136(var3++, false);
                }
            } else {
                for (int var6 = 0; ~this.field7810 < ~var6; ++var6) {
                    this.field7811[var6].method3053(36);
                }
                this.field7810 = arg1;
                this.field7811 = new class515[this.field7810];
                if (arg0) {
                    this.field7813 = 89;
                }
                for (int var7 = 0; this.field7810 > var7; ++var7) {
                    this.field7811[var7] = new class515(this);
                    this.field7811[var7].method3054(1);
                    this.method3136(var3++, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IJ)V")
    public static final void method3137(int arg0, long arg1) {
        ++field7808;
        class86.field1436.field4333 = 0;
        class86.field1436.method1923((byte) 62, class224.field3254.field6584);
        class86.field1436.method1872(-1, arg1);
        class303.field4362 = arg0;
        class267.field3859 = 1;
        class343.field5238 = 0;
        class412.field6071 = -3;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lkf;I)V")
    public final void method2204(class165 arg0, int arg1) {
        Object var3 = this.field7800;
        synchronized (this.field7800) {
            --super.field5143;
            if (~super.field5143 > -1) {
                super.field5143 = 4999;
            }
            super.field5150[super.field5143] = 21;
            super.field5151[super.field5143] = arg0;
            ++super.field5149;
            ++super.field5145;
            if (this.field7813 > arg1) {
                this.field7800.notifyAll();
            }
        }
        ++field7794;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLau;)V")
    public final void method3138(boolean arg0, class515 arg1) {
        ++field7795;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            if (!arg0) {
                field7812 = 102;
            }
            Object var6 = this.field7800;
            byte var7;
            synchronized (this.field7800) {
                while (super.field5145 == 0) {
                    ++this.field7813;
                    this.field7800.wait();
                    --this.field7813;
                }
                var7 = super.field5150[super.field5143];
                if (~arg1.field7570 <= -1) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field3685 = super.field5151[super.field5143];
                    var5 = super.field5141[super.field5143];
                    super.field5151[super.field5143] = null;
                    ++super.field5143;
                    if (super.field5143 >= 5000) {
                        super.field5143 = 0;
                    }
                    --super.field5145;
                }
            }
            if (var3) {
                if (~arg1.field7570 > -1) {
                    if (~var7 <= -1 && var7 <= 3) {
                        arg1.field7570 = var7;
                        class44.field675.method468(var7);
                    }
                } else if (var7 != 21) {
                    if (~var7 == -21) {
                        class165 var8 = (class165) arg1.field3685;
                        if (var8.field2480 != null) {
                            var8.field2480.method126(class44.field675, -122);
                        }
                        if (var8.field2484 != null) {
                            var8.field2484.method126(class44.field675, -53);
                        }
                        if (var8.field2482 != null) {
                            var8.field2482.method126(class44.field675, -54);
                        }
                        if (var8.field2493 != null) {
                            var8.field2493.method126(class44.field675, -56);
                        }
                        if (var8.field2487 != null) {
                            var8.field2487.method126(class44.field675, -55);
                        }
                        for (class525 var9 = var8.field2490; var9 != null; var9 = var9.field7716) {
                            var9.field7711.method126(class44.field675, -89);
                        }
                    } else if (var7 >= 30 && var7 <= 33) {
                        class44.field675.method514(3000.0F, var5 * 1.5F);
                        ((class35) arg1.field3685).method283(class97.field1574, class105.field1653, class117.field1846, class298.field4257, var7 + -30 == 0);
                    } else if (~var7 <= -41 && var7 <= 43) {
                        class44.field675.method514(3000.0F, var5 * 1.5F);
                        ((class35) arg1.field3685).method283(class97.field1574, class105.field1653, class117.field1846, class342.field5220, var7 - 40 == 0);
                    } else if (var7 != 22) {
                        if (var7 != 23) {
                            if (~var7 != -25) {
                                if (~var7 <= -11 && ~var7 >= -14) {
                                    class44.field675.method454(arg1.field7570);
                                    arg1.field7570 = -1;
                                }
                            } else {
                                class44.field675.method464(0, (class131[]) null);
                            }
                        } else {
                            class44.field675.method501();
                        }
                    } else {
                        class44.field675.method502(-1, 1583160, 40, 127);
                    }
                } else {
                    class363.method2331(arg1, (class165) arg1.field3685);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field7800;
                synchronized (this.field7800) {
                    --super.field5149;
                    if (super.field5149 == 0) {
                        this.field7800.notifyAll();
                    }
                }
            }
        }
    }

    static {
        new class180("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
