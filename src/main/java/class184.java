import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class184 extends class197 {

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field2918 = new Object();

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    private int field2925 = 0;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    private int field2929 = 0;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "[Lge;")
    private class481[] field2930 = new class481[0];

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Loe;")
    public static class127 field2919 = new class127(57, 2);

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2928 = null;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Loe;")
    public static class127 field2926 = new class127(12, 5);

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "Loe;")
    public static class127 field2933 = new class127(54, 18);

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "Z")
    public static boolean field2935 = true;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Loh;I)V")
    public final void method864(class268 arg0, int arg1) {
        ++field2921;
        Object var3 = this.field2918;
        synchronized (this.field2918) {
            super.field3108[super.field3099] = 21;
            super.field3112[super.field3099] = arg0;
            ++super.field3099;
            ++super.field3104;
            ++super.field3106;
            if (~super.field3099 <= -5001) {
                super.field3099 = 0;
            }
            if (arg1 > 103) {
                if (~this.field2929 < -1) {
                    this.field2918.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLoh;)V")
    public final void method862(byte arg0, class268 arg1) {
        ++field2923;
        Object var3 = this.field2918;
        synchronized (this.field2918) {
            super.field3108[super.field3099] = 20;
            if (arg0 != 94) {
                this.method855(120, -39);
            }
            super.field3112[super.field3099] = arg1;
            ++super.field3099;
            ++super.field3104;
            if (super.field3099 >= 5000) {
                super.field3099 = 0;
            }
            ++super.field3106;
            if (~this.field2929 < -1) {
                this.field2918.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public final void method860(boolean arg0) {
        ++field2937;
        Object var2 = this.field2918;
        synchronized (this.field2918) {
            if (arg0) {
                for (int var3 = 0; this.field2925 > var3; ++var3) {
                    if (this.field2930[var3].field7339 >= 0) {
                        this.method1150(this.field2930[var3].field7339, -116);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(II)V")
    private final void method1149(int arg0, int arg1) {
        if (arg0 == 0) {
            super.field3108[super.field3099] = (byte) arg1;
            ++field2920;
            ++super.field3099;
            ++super.field3106;
            ++super.field3104;
            if (super.field3099 >= 5000) {
                super.field3099 = 0;
            }
            if (~this.field2929 < -1) {
                Object var3 = this.field2918;
                synchronized (this.field2918) {
                    this.field2918.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIFLfo;Z)V")
    public final void method856(int arg0, int arg1, float arg2, class343 arg3, boolean arg4) {
        Object var6 = this.field2918;
        synchronized (this.field2918) {
            super.field3108[super.field3099] = (byte) (arg4 ? arg0 + 40 : arg0 + 30);
            super.field3112[super.field3099] = arg3;
            super.field3102[super.field3099] = arg2;
            ++super.field3099;
            ++super.field3104;
            if (super.field3099 >= 5000) {
                super.field3099 = 0;
            }
            ++super.field3106;
            if (this.field2929 > arg1) {
                this.field2918.notifyAll();
            }
        }
        ++field2932;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Loh;I)V")
    public final void method857(class268 arg0, int arg1) {
        ++field2936;
        Object var3 = this.field2918;
        synchronized (this.field2918) {
            if (arg1 != 0) {
                this.method1149(13, 38);
            }
            --super.field3107;
            if (~super.field3107 > -1) {
                super.field3107 = 4999;
            }
            super.field3108[super.field3107] = 21;
            super.field3112[super.field3107] = arg0;
            ++super.field3106;
            ++super.field3104;
            if (~this.field2929 < -1) {
                this.field2918.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public final void method855(int arg0, int arg1) {
        ++field2934;
        int var3 = 0;
        Object var4 = this.field2918;
        synchronized (this.field2918) {
            if (this.field2925 == arg1) {
                for (int var5 = 0; ~var5 > ~this.field2925; ++var5) {
                    this.method1149(0, var3++);
                }
            } else {
                for (int var6 = 0; this.field2925 > var6; ++var6) {
                    this.field2930[var6].method2905((byte) 0);
                }
                this.field2925 = arg1;
                if (arg0 != 768) {
                    field2935 = false;
                }
                this.field2930 = new class481[this.field2925];
                for (int var7 = 0; ~this.field2925 < ~var7; ++var7) {
                    this.field2930[var7] = new class481(this);
                    this.field2930[var7].method2908(1432);
                    this.method1149(0, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public final void method858(byte arg0) {
        ++field2931;
        try {
            Object var2 = this.field2918;
            synchronized (this.field2918) {
                while (super.field3104 != 0) {
                    this.field2918.wait();
                }
            }
        } catch (Exception var4) {
        }
        if (arg0 >= -46) {
            this.field2930 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(II)V")
    private final void method1150(int arg0, int arg1) {
        if (arg1 > -82) {
            field2933 = null;
        }
        ++field2927;
        super.field3108[super.field3099] = (byte) (arg0 - -10);
        ++super.field3099;
        ++super.field3106;
        if (~super.field3099 <= -5001) {
            super.field3099 = 0;
        }
        ++super.field3104;
        if (~this.field2929 < -1) {
            Object var3 = this.field2918;
            synchronized (this.field2918) {
                this.field2918.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
    public final void method859(int arg0, int arg1) {
        if (arg1 != 768) {
            field2926 = null;
        }
        ++field2922;
        Object var3 = this.field2918;
        synchronized (this.field2918) {
            super.field3108[super.field3099] = (byte) arg0;
            ++super.field3099;
            ++super.field3106;
            ++super.field3104;
            if (super.field3099 >= 5000) {
                super.field3099 = 0;
            }
            if (~this.field2929 < -1) {
                this.field2918.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lge;B)V")
    public final void method1151(class481 arg0, byte arg1) {
        ++field2924;
        boolean var3 = false;
        try {
            int var4 = -24 / ((arg1 - -84) / 40);
            boolean var5 = false;
            float var6 = 0.0F;
            Object var7 = this.field2918;
            byte var8;
            synchronized (this.field2918) {
                while (~super.field3106 == -1) {
                    ++this.field2929;
                    this.field2918.wait();
                    --this.field2929;
                }
                var8 = super.field3108[super.field3107];
                if (~arg0.field7339 > -1) {
                    if (var8 >= 0 && var8 <= 3) {
                        var3 = true;
                    }
                } else if (~var8 > -1 || var8 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field4924 = super.field3112[super.field3107];
                    var6 = super.field3102[super.field3107];
                    super.field3112[super.field3107] = null;
                    ++super.field3107;
                    if (~super.field3107 <= -5001) {
                        super.field3107 = 0;
                    }
                    --super.field3106;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg0.field7339 < 0) {
                if (var8 >= 0 && ~var8 >= -4) {
                    arg0.field7339 = var8;
                    class179.field2801.method1902(var8);
                }
            } else if (~var8 != -22) {
                if (var8 != 20) {
                    if (~var8 <= -31 && ~var8 >= -34) {
                        class179.field2801.method1993(3000.0F, var6 * 1.5F);
                        ((class343) arg0.field4924).method312(class7.field82, class248.field3812, class320.field4826, class358.field5313, ~(var8 + -30) == -1);
                    } else if (~var8 <= -41 && ~var8 >= -44) {
                        class179.field2801.method1993(3000.0F, var6 * 1.5F);
                        ((class343) arg0.field4924).method312(class7.field82, class248.field3812, class320.field4826, class323.field4845, var8 + -40 == 0);
                    } else if (~var8 != -23) {
                        if (~var8 != -24) {
                            if (~var8 != -25) {
                                if (~var8 <= -11 && ~var8 >= -14) {
                                    class179.field2801.method1910(arg0.field7339);
                                    arg0.field7339 = -1;
                                }
                            } else {
                                class179.field2801.method1916(0, (class480[]) null);
                            }
                        } else {
                            class179.field2801.method1958();
                        }
                    } else {
                        class179.field2801.method1940(-1, 1583160, 40, 127);
                    }
                } else {
                    class268 var9 = (class268) arg0.field4924;
                    if (var9.field4059 != null) {
                        var9.field4059.method172(false, class179.field2801);
                    }
                    if (var9.field4063 != null) {
                        var9.field4063.method172(false, class179.field2801);
                    }
                    if (var9.field4052 != null) {
                        var9.field4052.method172(false, class179.field2801);
                    }
                    if (var9.field4051 != null) {
                        var9.field4051.method172(false, class179.field2801);
                    }
                    if (var9.field4042 != null) {
                        var9.field4042.method172(false, class179.field2801);
                    }
                    for (class297 var10 = var9.field4045; var10 != null; var10 = var10.field4500) {
                        var10.field4505.method172(false, class179.field2801);
                    }
                }
            } else {
                class376.method2267(arg0, (class268) arg0.field4924);
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field2918;
                synchronized (this.field2918) {
                    --super.field3104;
                    if (super.field3104 == 0) {
                        this.field2918.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Z)V")
    public static void method1152(boolean arg0) {
        field2933 = null;
        field2919 = null;
        if (!arg0) {
            method1152(true);
        }
        field2928 = null;
        field2926 = null;
    }
}
