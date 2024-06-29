import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class415 extends class203 {

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field5997 = new Object();

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    private int field6009 = 0;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    private int field6012 = 0;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "[Lac;")
    private class136[] field6008 = new class136[0];

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Luc;")
    public static class51 field6013 = new class51(4);

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Lsj;")
    public static class248 field6015 = null;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6005;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 3)
    public static final void method2617(int arg0) {
        class86.field1193 = new class138(class7.field102, "", class295.field4448, (short) arg0, 0L, 0, 0);
        ++field5996;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLdh;)V", line = 11)
    public final void method1276(boolean arg0, class77 arg1) {
        Object var3 = this.field5997;
        synchronized (this.field5997) {
            super.field2805[super.field2798] = 21;
            super.field2800[super.field2798] = arg1;
            ++super.field2798;
            if (super.field2798 >= 5000) {
                super.field2798 = 0;
            }
            ++super.field2799;
            ++super.field2802;
            if (~this.field6012 < -1) {
                this.field5997.notifyAll();
            }
        }
        ++field5993;
        if (arg0) {
            method2618(119);
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 35)
    public static void method2618(int arg0) {
        field6015 = null;
        field6013 = null;
        field6005 = null;
        if (arg0 > -52) {
            method2625((String) null, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 49)
    public static final void method2619(boolean arg0) {
        class439.field6369 = 0;
        class203.field2797 = 0;
        class237.field3312 = 0;
        class372.field5484 = 0;
        ++field5994;
        if (!arg0) {
            field6015 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)I", line = 62)
    public static final int method2620(int arg0, int arg1, boolean arg2) {
        ++field5998;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg2 ? 122 : (133763565 & var5) >> 19;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V", line = 78)
    public final void method1278(int arg0, int arg1) {
        Object var3 = this.field5997;
        synchronized (this.field5997) {
            super.field2805[super.field2798] = (byte) arg1;
            ++super.field2798;
            ++super.field2802;
            if (~super.field2798 <= -5001) {
                super.field2798 = 0;
            }
            if (arg0 != -9877) {
                this.method1282(false, -2.6912546F, -105, 67, (class193) null);
            }
            ++super.field2799;
            if (~this.field6012 < -1) {
                this.field5997.notifyAll();
            }
        }
        ++field6004;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBZ)Ljava/lang/String;", line = 101)
    public static final String method2621(int arg0, byte arg1, boolean arg2) {
        ++field5995;
        if (arg2 && ~arg0 <= -1) {
            if (arg1 != -21) {
                method2625((String) null, (byte) 122);
            }
            return class197.method1302(arg2, (byte) -118, 10, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 116)
    public final void method1279(int arg0) {
        ++field6014;
        try {
            Object var2 = this.field5997;
            synchronized (this.field5997) {
                while (super.field2799 != 0) {
                    this.field5997.wait();
                }
            }
        } catch (Exception var4) {
        }
        if (arg0 != 8192) {
            method2619(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lac;Z)V", line = 138)
    public final void method2622(class136 arg0, boolean arg1) {
        ++field6011;
        boolean var3 = arg1;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field5997;
            byte var7;
            synchronized (this.field5997) {
                while (~super.field2802 == -1) {
                    ++this.field6012;
                    this.field5997.wait();
                    --this.field6012;
                }
                var7 = super.field2805[super.field2808];
                if (arg0.field1762 >= 0) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field5016 = super.field2800[super.field2808];
                    var5 = super.field2807[super.field2808];
                    super.field2800[super.field2808] = null;
                    ++super.field2808;
                    if (~super.field2808 <= -5001) {
                        super.field2808 = 0;
                    }
                    --super.field2802;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg0.field1762 > -1) {
                if (~var7 <= -1 && var7 <= 3) {
                    arg0.field1762 = var7;
                    class185.field2528.method527(var7);
                }
            } else if (~var7 != -22) {
                if (var7 == 20) {
                    class77 var8 = (class77) arg0.field5016;
                    if (var8.field1067 != null) {
                        var8.field1067.method126((byte) 50, class185.field2528);
                    }
                    if (var8.field1087 != null) {
                        var8.field1087.method126((byte) 50, class185.field2528);
                    }
                    if (var8.field1063 != null) {
                        var8.field1063.method126((byte) 50, class185.field2528);
                    }
                    if (var8.field1076 != null) {
                        var8.field1076.method126((byte) 50, class185.field2528);
                    }
                    if (var8.field1079 != null) {
                        var8.field1079.method126((byte) 50, class185.field2528);
                    }
                    for (class356 var9 = var8.field1064; var9 != null; var9 = var9.field5275) {
                        var9.field5274.method126((byte) 50, class185.field2528);
                    }
                } else if (var7 >= 30 && ~var7 >= -34) {
                    class185.field2528.method481(3000.0F, var5 * 1.5F);
                    ((class193) arg0.field5016).method739(class167.field2261, class437.field6352, class251.field3687, class277.field4069, ~(var7 - 30) == -1);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class185.field2528.method481(3000.0F, var5 * 1.5F);
                    ((class193) arg0.field5016).method739(class167.field2261, class437.field6352, class251.field3687, class349.field5191, ~(var7 + -40) == -1);
                } else if (var7 != 22) {
                    if (var7 != 23) {
                        if (~var7 == -25) {
                            class185.field2528.method505(0, (class16[]) null);
                        } else if (var7 >= 10 && var7 <= 13) {
                            class185.field2528.method494(arg0.field1762);
                            arg0.field1762 = -1;
                        }
                    } else {
                        class185.field2528.method476();
                    }
                } else {
                    class185.field2528.method525(-1, 1583160, 40);
                }
            } else {
                class394.method2531(arg0, (class77) arg0.field5016);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field5997;
                synchronized (this.field5997) {
                    --super.field2799;
                    if (super.field2799 == 0) {
                        this.field5997.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLdh;)V", line = 304)
    public final void method1277(byte arg0, class77 arg1) {
        if (arg0 == 40) {
            Object var3 = this.field5997;
            synchronized (this.field5997) {
                --super.field2808;
                if (~super.field2808 > -1) {
                    super.field2808 = 4999;
                }
                super.field2805[super.field2808] = 21;
                super.field2800[super.field2808] = arg1;
                ++super.field2802;
                ++super.field2799;
                if (~this.field6012 < -1) {
                    this.field5997.notifyAll();
                }
            }
            ++field6007;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V", line = 330)
    private final void method2623(int arg0, int arg1) {
        ++field6001;
        super.field2805[super.field2798] = (byte) (arg0 - -10);
        ++super.field2798;
        ++super.field2799;
        if (super.field2798 >= 5000) {
            super.field2798 = 0;
        }
        ++super.field2802;
        if (this.field6012 > 0) {
            Object var3 = this.field5997;
            synchronized (this.field5997) {
                this.field5997.notifyAll();
            }
        }
        if (arg1 != 11678) {
            this.field6012 = 74;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldh;I)V", line = 354)
    public final void method1275(class77 arg0, int arg1) {
        ++field6010;
        Object var3 = this.field5997;
        synchronized (this.field5997) {
            super.field2805[super.field2798] = 20;
            super.field2800[super.field2798] = arg0;
            ++super.field2798;
            ++super.field2802;
            if (arg1 != -25427) {
                this.method1282(true, 0.43415672F, -100, 40, (class193) null);
            }
            if (super.field2798 >= 5000) {
                super.field2798 = 0;
            }
            ++super.field2799;
            if (this.field6012 > 0) {
                this.field5997.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 379)
    public final void method1283(int arg0) {
        Object var2 = this.field5997;
        synchronized (this.field5997) {
            if (arg0 <= 100) {
                return;
            }
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field6009) {
                    break;
                }
                if (~this.field6008[var3].field1762 <= -1) {
                    this.method2623(this.field6008[var3].field1762, 11678);
                }
                ++var3;
            }
        }
        ++field5999;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)V", line = 406)
    private final void method2624(int arg0, byte arg1) {
        super.field2805[super.field2798] = (byte) arg0;
        ++field6002;
        ++super.field2798;
        if (arg1 > -33) {
            this.method1281(-128, 57);
        }
        if (~super.field2798 <= -5001) {
            super.field2798 = 0;
        }
        ++super.field2799;
        ++super.field2802;
        if (~this.field6012 < -1) {
            Object var3 = this.field5997;
            synchronized (this.field5997) {
                this.field5997.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)V", line = 432)
    public final void method1281(int arg0, int arg1) {
        ++field6003;
        int var3 = 0;
        Object var4 = this.field5997;
        synchronized (this.field5997) {
            if (this.field6009 == arg1) {
                for (int var5 = 0; this.field6009 > var5; ++var5) {
                    this.method2624(var3++, (byte) -82);
                }
            } else {
                int var6 = 36 / ((arg0 - -58) / 40);
                for (int var7 = 0; ~var7 > ~this.field6009; ++var7) {
                    this.field6008[var7].method961(false);
                }
                this.field6009 = arg1;
                this.field6008 = new class136[this.field6009];
                for (int var8 = 0; this.field6009 > var8; ++var8) {
                    this.field6008[var8] = new class136(this);
                    this.field6008[var8].method960(100);
                    this.method2624(var3++, (byte) -92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZFIILda;)V", line = 481)
    public final void method1282(boolean arg0, float arg1, int arg2, int arg3, class193 arg4) {
        ++field6000;
        Object var6 = this.field5997;
        synchronized (this.field5997) {
            super.field2805[super.field2798] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
            super.field2800[super.field2798] = arg4;
            super.field2807[super.field2798] = arg1;
            ++super.field2798;
            ++super.field2799;
            ++super.field2802;
            if (super.field2798 >= 5000) {
                super.field2798 = 0;
            }
            if (~this.field6012 < -1) {
                this.field5997.notifyAll();
            }
        }
        if (arg2 != 1) {
            this.method1278(-88, 19);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 524)
    public static final long method2625(String arg0, byte arg1) {
        ++field6006;
        if (arg1 <= 29) {
            field6005 = null;
        }
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; ++var5) {
            var3 = (var3 << 5) + -var3 - -((long) arg0.charAt(var5));
        }
        return var3;
    }
}
