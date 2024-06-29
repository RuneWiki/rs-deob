import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class152 extends class361 {

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Ljava/lang/Object;")
    private Object field2190 = new Object();

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    private int field2206 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[Lue;")
    private class154[] field2198 = new class154[0];

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field2204 = 0;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lwv;")
    public static class26 field2203 = new class26("WTQA", 2);

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Lvj;")
    public static class304 field2209 = new class304("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lmk;I)V", line = 3)
    public static final void method1037(class39 arg0, int arg1) {
        ++field2192;
        if (!class379.field5189) {
            if (arg1 < 18) {
                method1043((byte) -38, (class117) null, false);
            }
            arg0.method300(false);
            --class412.field5693;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V", line = 21)
    public final void method1038(int arg0, byte arg1) {
        ++field2205;
        Object var3 = this.field2190;
        synchronized (this.field2190) {
            super.field4873[super.field4879] = (byte) arg0;
            ++super.field4879;
            ++super.field4876;
            ++super.field4869;
            if (~super.field4879 <= -5001) {
                super.field4879 = 0;
            }
            if (~this.field2206 < -1) {
                this.field2190.notifyAll();
            }
        }
        if (arg1 != -110) {
            this.method1045(-61, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 50)
    public final void method1039(byte arg0) {
        ++field2196;
        try {
            Object var2 = this.field2190;
            synchronized (this.field2190) {
                while (~super.field4876 != -1) {
                    this.field2190.wait();
                }
                if (arg0 <= 68) {
                    this.method1048(113, 110);
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 74)
    public static void method1040(int arg0) {
        field2203 = null;
        if (arg0 == 20339) {
            field2209 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lht;I)V", line = 85)
    public final void method1041(class409 arg0, int arg1) {
        ++field2193;
        Object var3 = this.field2190;
        synchronized (this.field2190) {
            --super.field4875;
            if (~super.field4875 > -1) {
                super.field4875 = 4999;
            }
            super.field4873[super.field4875] = 21;
            super.field4874[super.field4875] = arg0;
            ++super.field4869;
            ++super.field4876;
            if (this.field2206 > arg1) {
                this.field2190.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILht;)V", line = 105)
    public final void method1042(int arg0, class409 arg1) {
        ++field2197;
        Object var3 = this.field2190;
        synchronized (this.field2190) {
            super.field4873[super.field4879] = 21;
            super.field4874[super.field4879] = arg1;
            ++super.field4879;
            if (~super.field4879 <= -5001) {
                super.field4879 = 0;
            }
            ++super.field4869;
            ++super.field4876;
            if (arg0 < this.field2206) {
                this.field2190.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLsq;Z)V", line = 130)
    public static final void method1043(byte arg0, class117 arg1, boolean arg2) {
        ++field2199;
        if (~class412.field5693 > -401) {
            class506 var3 = arg1.field1661;
            if (var3.field6971 != null) {
                var3 = var3.method2885(1, class301.field3980);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field6991) {
                int var4 = 123 % ((arg0 - -44) / 54);
                String var5 = var3.field7004;
                if (~var3.field6975 != -1) {
                    String var6 = class191.field2691 == class155.field2265 ? class57.field886.method1764(class489.field6789, false) : class101.field1502.method1764(class489.field6789, false);
                    var5 = var5 + class177.method1183((byte) -90, var3.field6975, class385.field5232.field7607) + " (" + var6 + var3.field6975 + ")";
                }
                if (!class32.field529) {
                    if (!arg2) {
                        String[] var7 = var3.field6998;
                        if (class413.field5718) {
                            var7 = class165.method1116(var7, false);
                        }
                        if (var7 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (var7[var8] != null && (class362.field4883 != class155.field2265 || !var7[var8].equalsIgnoreCase(class191.field2693.method1764(class489.field6789, false)))) {
                                    byte var9 = 0;
                                    if (~var8 == -1) {
                                        var9 = 21;
                                    }
                                    int var10 = class420.field5751;
                                    if (~var8 == -2) {
                                        var9 = 44;
                                    }
                                    if (~var8 == -3) {
                                        var9 = 13;
                                    }
                                    if (~var8 == -4) {
                                        var9 = 5;
                                    }
                                    if (var8 == 4) {
                                        var9 = 48;
                                    }
                                    if (~var3.field6972 == ~var8) {
                                        var10 = var3.field7016;
                                    }
                                    if (var3.field6982 == var8) {
                                        var10 = var3.field7015;
                                    }
                                    class70.method459(-1, "<col=ffff00>" + var5, true, 0, var9, 23856, var7[var8], var10, (long) arg1.field6170, 0, false);
                                    ++class322.field4220;
                                }
                            }
                        }
                        if (class362.field4883 == class155.field2265 && var7 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var7[var11] != null && var7[var11].equalsIgnoreCase(class191.field2693.method1764(class489.field6789, false))) {
                                    short var12 = 0;
                                    if (~var3.field6975 < ~class385.field5232.field7607) {
                                        var12 = 2000;
                                    }
                                    short var13 = 0;
                                    if (~var11 == -1) {
                                        var13 = 21;
                                    }
                                    if (~var11 == -2) {
                                        var13 = 44;
                                    }
                                    if (var11 == 2) {
                                        var13 = 13;
                                    }
                                    if (~var11 == -4) {
                                        var13 = 5;
                                    }
                                    if (var11 == 4) {
                                        var13 = 48;
                                    }
                                    if (var13 != 0) {
                                        var13 += var12;
                                    }
                                    class70.method459(-1, "<col=ffff00>" + var5, true, 0, var13, 23856, var7[var11], var3.field6984, (long) arg1.field6170, 0, false);
                                    ++class517.field7657;
                                }
                            }
                        }
                    }
                    ++class470.field6480;
                    class70.method459(-1, "<col=ffff00>" + var5, true, 0, 1004, 23856, class148.field2101.method1764(class489.field6789, false), class290.field3800, (long) arg1.field6170, 0, arg2);
                } else {
                    if (!arg2) {
                        class495 var14 = class450.field6125 != -1 ? class270.field3546.method693(class450.field6125, 118) : null;
                        if ((2 & class351.field4740) != 0) {
                            if (var14 == null || var3.method2894(var14.field6873, class450.field6125, 3830) != var14.field6873) {
                                class70.method459(-1, class455.field6214 + " -> <col=ffff00>" + var5, true, 0, 4, 23856, class59.field925, class394.field5341, (long) arg1.field6170, 0, false);
                                ++class12.field250;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 294)
    public final void method1044(int arg0) {
        Object var2 = this.field2190;
        synchronized (this.field2190) {
            int var3 = arg0;
            while (true) {
                if (~this.field2204 >= ~var3) {
                    break;
                }
                if (this.field2198[var3].field2239 >= 0) {
                    this.method1049(5332, this.field2198[var3].field2239);
                }
                ++var3;
            }
        }
        ++field2195;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V", line = 317)
    private final void method1045(int arg0, byte arg1) {
        super.field4873[super.field4879] = (byte) arg0;
        if (arg1 > -85) {
            field2203 = null;
        }
        ++field2194;
        ++super.field4879;
        ++super.field4876;
        ++super.field4869;
        if (super.field4879 >= 5000) {
            super.field4879 = 0;
        }
        if (this.field2206 > 0) {
            Object var3 = this.field2190;
            synchronized (this.field2190) {
                this.field2190.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILht;)V", line = 345)
    public final void method1046(int arg0, class409 arg1) {
        ++field2200;
        Object var3 = this.field2190;
        synchronized (this.field2190) {
            super.field4873[super.field4879] = 20;
            super.field4874[super.field4879] = arg1;
            ++super.field4879;
            if (super.field4879 >= 5000) {
                super.field4879 = 0;
            }
            ++super.field4869;
            ++super.field4876;
            if (arg0 == 29736) {
                if (this.field2206 > 0) {
                    this.field2190.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IFZLna;I)V", line = 377)
    public final void method1047(int arg0, float arg1, boolean arg2, class35 arg3, int arg4) {
        Object var6 = this.field2190;
        synchronized (this.field2190) {
            super.field4873[super.field4879] = (byte) (!arg2 ? arg0 + 30 : arg0 + 40);
            super.field4874[super.field4879] = arg3;
            super.field4872[super.field4879] = arg1;
            ++super.field4879;
            ++super.field4869;
            if (super.field4879 >= 5000) {
                super.field4879 = 0;
            }
            ++super.field4876;
            if (arg4 < this.field2206) {
                this.field2190.notifyAll();
            }
        }
        ++field2191;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 399)
    public final void method1048(int arg0, int arg1) {
        ++field2208;
        if (arg1 >= -57) {
            this.method1038(-1, (byte) 56);
        }
        int var3 = 0;
        Object var4 = this.field2190;
        synchronized (this.field2190) {
            if (this.field2204 == arg0) {
                for (int var5 = 0; ~this.field2204 < ~var5; ++var5) {
                    this.method1045(var3++, (byte) -96);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field2204; ++var6) {
                    this.field2198[var6].method1062(-128);
                }
                this.field2204 = arg0;
                this.field2198 = new class154[this.field2204];
                for (int var7 = 0; this.field2204 > var7; ++var7) {
                    this.field2198[var7] = new class154(this);
                    this.field2198[var7].method1060((byte) 95);
                    this.method1045(var3++, (byte) -123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V", line = 457)
    private final void method1049(int arg0, int arg1) {
        if (arg0 != 5332) {
            this.field2190 = null;
        }
        ++field2207;
        super.field4873[super.field4879] = (byte) (arg1 + 10);
        ++super.field4879;
        ++super.field4876;
        if (super.field4879 >= 5000) {
            super.field4879 = 0;
        }
        ++super.field4869;
        if (~this.field2206 < -1) {
            Object var3 = this.field2190;
            synchronized (this.field2190) {
                this.field2190.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lue;I)V", line = 484)
    public final void method1050(class154 arg0, int arg1) {
        ++field2201;
        boolean var3 = false;
        try {
            if (arg1 != 1224) {
                this.method1050((class154) null, 86);
            }
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field2190;
            byte var7;
            synchronized (this.field2190) {
                while (~super.field4869 == -1) {
                    ++this.field2206;
                    this.field2190.wait();
                    --this.field2206;
                }
                var7 = super.field4873[super.field4875];
                if (~arg0.field2239 > -1) {
                    if (var7 >= 0 && var7 <= 3) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field4382 = super.field4874[super.field4875];
                    var5 = super.field4872[super.field4875];
                    super.field4874[super.field4875] = null;
                    ++super.field4875;
                    --super.field4869;
                    if (super.field4875 >= 5000) {
                        super.field4875 = 0;
                    }
                }
            }
            if (var3) {
                if (arg0.field2239 < 0) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        arg0.field2239 = var7;
                        class280.field3693.method625(var7);
                    }
                } else if (~var7 == -22) {
                    class96.method689(arg0, (class409) arg0.field4382);
                } else if (~var7 == -21) {
                    class409 var8 = (class409) arg0.field4382;
                    if (var8.field5627 != null) {
                        var8.field5627.method334(class280.field3693, true);
                    }
                    if (var8.field5607 != null) {
                        var8.field5607.method334(class280.field3693, true);
                    }
                    if (var8.field5625 != null) {
                        var8.field5625.method334(class280.field3693, true);
                    }
                    if (var8.field5628 != null) {
                        var8.field5628.method334(class280.field3693, true);
                    }
                    if (var8.field5618 != null) {
                        var8.field5618.method334(class280.field3693, true);
                    }
                    for (class165 var9 = var8.field5630; var9 != null; var9 = var9.field2400) {
                        var9.field2402.method334(class280.field3693, true);
                    }
                } else if (~var7 <= -31 && ~var7 >= -34) {
                    class280.field3693.method568(3000.0F, var5 * 1.5F);
                    ((class35) arg0.field4382).method270(class95.field1428, class259.field3429, class22.field388, class461.field6365, var7 + -30 == 0);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class280.field3693.method568(3000.0F, var5 * 1.5F);
                    ((class35) arg0.field4382).method270(class95.field1428, class259.field3429, class22.field388, class245.field3273, var7 - 40 == 0);
                } else if (~var7 == -23) {
                    class280.field3693.method521(-1, 1583160, 40, 127);
                } else if (var7 != 23) {
                    if (var7 != 24) {
                        if (~var7 <= -11 && ~var7 >= -14) {
                            class280.field3693.method620(arg0.field2239);
                            arg0.field2239 = -1;
                        }
                    } else {
                        class280.field3693.method609(0, (class451[]) null);
                    }
                } else {
                    class280.field3693.method536();
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field2190;
                synchronized (this.field2190) {
                    --super.field4876;
                    if (~super.field4876 == -1) {
                        this.field2190.notifyAll();
                    }
                }
            }
        }
    }
}
