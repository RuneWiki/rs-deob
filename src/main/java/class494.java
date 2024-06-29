import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class494 extends class372 {

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field7156 = new Object();

    @OriginalMember(owner = "client!bw", name = "H", descriptor = "[Lnw;")
    private class422[] field7159 = new class422[0];

    @OriginalMember(owner = "client!bw", name = "I", descriptor = "I")
    private int field7160 = 0;

    @OriginalMember(owner = "client!bw", name = "J", descriptor = "I")
    private int field7161 = 0;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "[Lki;")
    public static class510[] field7143 = new class510[2048];

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "Z")
    public static boolean field7139 = false;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "Lqv;")
    public static class316 field7149 = new class316(104, 19);

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "Z")
    public static boolean field7146;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Lpl;")
    public static final class469 method2896(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2774;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
    public final void method770(int arg0, int arg1) {
        ++field7151;
        Object var3 = this.field7156;
        synchronized (this.field7156) {
            super.field5367[super.field5359] = (byte) arg0;
            ++super.field5359;
            if (~super.field5359 <= -5001) {
                super.field5359 = 0;
            }
            if (arg1 != -26602) {
                this.method777((byte) -10);
            }
            ++super.field5368;
            ++super.field5363;
            if (~this.field7160 < -1) {
                this.field7156.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2897(String arg0, int arg1) {
        ++field7145;
        if (arg1 == 1) {
            if (arg0 != null) {
                if (arg0.startsWith("*")) {
                    arg0 = arg0.substring(1);
                }
                String var2 = class274.method1769(0, arg0);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class290.field4314; ++var3) {
                        String var4 = class163.field2463[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class274.method1769(0, var4);
                        if (var5 != null && var5.equals(var2)) {
                            --class290.field4314;
                            for (int var6 = var3; ~class290.field4314 < ~var6; ++var6) {
                                class163.field2463[var6] = class163.field2463[var6 + 1];
                                class397.field5630[var6] = class397.field5630[var6 - -1];
                                class292.field4344[var6] = class292.field4344[var6 - -1];
                                class306.field4540[var6] = class306.field4540[var6 + 1];
                                class418.field5942[var6] = class418.field5942[var6 + 1];
                                class79.field1291[var6] = class79.field1291[var6 - -1];
                            }
                            ++class152.field2318;
                            class196.field2864 = class426.field6113;
                            class228.method1528(true, class390.field5538);
                            class276.field4124.method3048(-2034159384, class132.method966(arg0, 10240));
                            class276.field4124.method3057((byte) -28, arg0);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(II)V")
    private final void method2898(int arg0, int arg1) {
        super.field5367[super.field5359] = (byte) arg1;
        ++field7157;
        ++super.field5359;
        if (arg0 == -32041) {
            ++super.field5368;
            ++super.field5363;
            if (super.field5359 >= 5000) {
                super.field5359 = 0;
            }
            if (~this.field7160 < -1) {
                Object var3 = this.field7156;
                synchronized (this.field7156) {
                    this.field7156.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(II)V")
    public static final void method2899(int arg0, int arg1) {
        class184.field2726 = arg1;
        ++field7147;
        class511 var2 = class502.field7245;
        synchronized (class502.field7245) {
            class502.field7245.method2990((byte) -49);
        }
        if (arg0 != 5000) {
            method2897((String) null, -97);
        }
        class511 var3 = class190.field2779;
        synchronized (class190.field2779) {
            class190.field2779.method2990((byte) -59);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lmm;Z)V")
    public final void method772(class188 arg0, boolean arg1) {
        ++field7153;
        Object var3 = this.field7156;
        synchronized (this.field7156) {
            if (arg1) {
                super.field5367[super.field5359] = 20;
                super.field5357[super.field5359] = arg0;
                ++super.field5359;
                ++super.field5368;
                ++super.field5363;
                if (super.field5359 >= 5000) {
                    super.field5359 = 0;
                }
                if (~this.field7160 < -1) {
                    this.field7156.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)Z")
    public static final boolean method2900(byte arg0, int arg1) {
        int var2 = -56 / ((-50 - arg0) / 35);
        ++field7141;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILmm;)V")
    public final void method776(int arg0, class188 arg1) {
        ++field7154;
        Object var3 = this.field7156;
        synchronized (this.field7156) {
            --super.field5365;
            if (super.field5365 < arg0) {
                super.field5365 = 4999;
            }
            super.field5367[super.field5365] = 21;
            super.field5357[super.field5365] = arg1;
            ++super.field5363;
            ++super.field5368;
            if (~this.field7160 < -1) {
                this.field7156.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method777(byte arg0) {
        int var2 = 99 / ((arg0 - 48) / 62);
        ++field7155;
        Object var3 = this.field7156;
        synchronized (this.field7156) {
            for (int var4 = 0; ~this.field7161 < ~var4; ++var4) {
                if (~this.field7159[var4].field5982 <= -1) {
                    this.method2903(this.field7159[var4].field5982, (byte) -82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static void method2901(byte arg0) {
        if (arg0 != 98) {
            field7146 = true;
        }
        field7149 = null;
        field7143 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILnw;)V")
    public final void method2902(int arg0, class422 arg1) {
        ++field7152;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field7156;
            byte var7;
            synchronized (this.field7156) {
                while (super.field5368 == 0) {
                    ++this.field7160;
                    this.field7156.wait();
                    --this.field7160;
                }
                var7 = super.field5367[super.field5365];
                if (arg1.field5982 < 0) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (~var7 > -1 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field2317 = super.field5357[super.field5365];
                    var5 = super.field5362[super.field5365];
                    super.field5357[super.field5365] = null;
                    ++super.field5365;
                    if (~super.field5365 <= -5001) {
                        super.field5365 = 0;
                    }
                    --super.field5368;
                }
            }
            int var8 = -117 / ((arg0 - -4) / 36);
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field5982 <= -1) {
                if (~var7 == -22) {
                    class117.method851(arg1, (class188) arg1.field2317);
                } else if (var7 != 20) {
                    if (~var7 <= -31 && var7 <= 33) {
                        class141.field2179.method221(3000.0F, var5 * 1.5F);
                        ((class24) arg1.field2317).method152(class295.field4418, class118.field1845, class272.field4085, class334.field4958, var7 + -30 == 0);
                    } else if (~var7 <= -41 && ~var7 >= -44) {
                        class141.field2179.method221(3000.0F, var5 * 1.5F);
                        ((class24) arg1.field2317).method152(class295.field4418, class118.field1845, class272.field4085, class214.field3232, ~(var7 - 40) == -1);
                    } else if (~var7 == -23) {
                        class141.field2179.method190(-1, 1583160, 40, 127);
                    } else if (var7 == 23) {
                        class141.field2179.method305();
                    } else if (var7 != 24) {
                        if (var7 >= 10 && var7 <= 13) {
                            class141.field2179.method213(arg1.field5982);
                            arg1.field5982 = -1;
                        }
                    } else {
                        class141.field2179.method226(0, (class369[]) null);
                    }
                } else {
                    class188 var9 = (class188) arg1.field2317;
                    if (var9.field2764 != null) {
                        var9.field2764.method552(class141.field2179, (byte) -128);
                    }
                    if (var9.field2751 != null) {
                        var9.field2751.method552(class141.field2179, (byte) -127);
                    }
                    if (var9.field2755 != null) {
                        var9.field2755.method552(class141.field2179, (byte) -122);
                    }
                    if (var9.field2774 != null) {
                        var9.field2774.method552(class141.field2179, (byte) -125);
                    }
                    if (var9.field2756 != null) {
                        var9.field2756.method552(class141.field2179, (byte) -122);
                    }
                    for (class317 var10 = var9.field2773; var10 != null; var10 = var10.field4709) {
                        var10.field4711.method552(class141.field2179, (byte) -127);
                    }
                }
            } else if (~var7 <= -1 && var7 <= 3) {
                arg1.field5982 = var7;
                class141.field2179.method192(var7);
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field7156;
                synchronized (this.field7156) {
                    --super.field5363;
                    if (super.field5363 == 0) {
                        this.field7156.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)V")
    private final void method2903(int arg0, byte arg1) {
        ++field7142;
        super.field5367[super.field5359] = (byte) (arg0 + 10);
        int var3 = -118 / ((-43 - arg1) / 39);
        ++super.field5359;
        ++super.field5368;
        ++super.field5363;
        if (super.field5359 >= 5000) {
            super.field5359 = 0;
        }
        if (~this.field7160 < -1) {
            Object var4 = this.field7156;
            synchronized (this.field7156) {
                this.field7156.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
    public final void method780(int arg0, int arg1) {
        ++field7138;
        int var3 = 0;
        Object var4 = this.field7156;
        synchronized (this.field7156) {
            if (this.field7161 == arg1) {
                for (int var5 = 0; ~this.field7161 < ~var5; ++var5) {
                    this.method2898(-32041, var3++);
                }
            } else {
                for (int var6 = 0; var6 < this.field7161; ++var6) {
                    this.field7159[var6].method2505(107);
                }
                this.field7161 = arg1;
                this.field7159 = new class422[this.field7161];
                for (int var7 = 0; var7 < this.field7161; ++var7) {
                    this.field7159[var7] = new class422(this);
                    this.field7159[var7].method2506(true);
                    this.method2898(-32041, var3++);
                }
                if (arg0 >= -82) {
                    this.field7156 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lci;III)Lch;")
    public static final class330 method2904(class320 arg0, int arg1, int arg2, int arg3) {
        ++field7158;
        byte[] var4 = arg0.method2037(arg1, (byte) -118, arg2);
        if (arg3 != -3808) {
            return null;
        } else {
            return var4 == null ? null : new class330(var4);
        }
    }

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "(II)Z")
    public static final boolean method2905(int arg0, int arg1) {
        if (arg0 < 118) {
            method2897((String) null, 94);
        }
        ++field7150;
        return arg1 >= 12 && ~arg1 >= -18;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method769(int arg0) {
        ++field7140;
        try {
            Object var2 = this.field7156;
            synchronized (this.field7156) {
                while (super.field5363 != 0) {
                    this.field7156.wait();
                }
                if (arg0 >= -76) {
                    this.method772((class188) null, true);
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLmm;)V")
    public final void method775(byte arg0, class188 arg1) {
        ++field7144;
        Object var3 = this.field7156;
        synchronized (this.field7156) {
            super.field5367[super.field5359] = 21;
            super.field5357[super.field5359] = arg1;
            ++super.field5359;
            if (arg0 < 0) {
                ++super.field5363;
                ++super.field5368;
                if (super.field5359 >= 5000) {
                    super.field5359 = 0;
                }
                if (this.field7160 > 0) {
                    this.field7156.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lo;ZFII)V")
    public final void method778(class24 arg0, boolean arg1, float arg2, int arg3, int arg4) {
        ++field7148;
        Object var6 = this.field7156;
        synchronized (this.field7156) {
            if (arg3 <= -18) {
                super.field5367[super.field5359] = (byte) (!arg1 ? arg4 + 30 : arg4 + 40);
                super.field5357[super.field5359] = arg0;
                super.field5362[super.field5359] = arg2;
                ++super.field5359;
                if (~super.field5359 <= -5001) {
                    super.field5359 = 0;
                }
                ++super.field5363;
                ++super.field5368;
                if (this.field7160 > 0) {
                    this.field7156.notifyAll();
                }
            }
        }
    }
}
