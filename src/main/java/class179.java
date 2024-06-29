import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class179 extends class22 {

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field2568 = new Object();

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    private int field2583 = 0;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "[Lwh;")
    private class95[] field2580 = new class95[0];

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    private int field2582 = 0;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "[B")
    public static byte[] field2577 = new byte[520];

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "[Z")
    public static boolean[] field2584 = new boolean[5];

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "[[B")
    public static byte[][] field2567;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(BLhg;)V", line = 7)
    public final void method155(byte arg0, class468 arg1) {
        Object var3 = this.field2568;
        synchronized (this.field2568) {
            super.field286[super.field287] = 21;
            super.field290[super.field287] = arg1;
            ++super.field287;
            if (super.field287 >= 5000) {
                super.field287 = 0;
            }
            ++super.field288;
            ++super.field292;
            if (this.field2583 > 0) {
                this.field2568.notifyAll();
            }
        }
        if (arg0 == 108) {
            ++field2570;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)V", line = 31)
    public final void method154(int arg0, int arg1) {
        Object var3 = this.field2568;
        synchronized (this.field2568) {
            super.field286[super.field287] = (byte) arg0;
            ++super.field287;
            ++super.field288;
            if (super.field287 >= arg1) {
                super.field287 = 0;
            }
            ++super.field292;
            if (~this.field2583 < -1) {
                this.field2568.notifyAll();
            }
        }
        ++field2571;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 56)
    public final void method157(int arg0) {
        ++field2576;
        Object var2 = this.field2568;
        synchronized (this.field2568) {
            if (arg0 < 2) {
                this.method148((class441) null, -112, 96, 0.1769559F, false);
            }
            for (int var3 = 0; ~this.field2582 < ~var3; ++var3) {
                if (~this.field2580[var3].field1277 <= -1) {
                    this.method1140(120, this.field2580[var3].field1277);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V", line = 79)
    public static void method1135(int arg0) {
        if (arg0 != -26350) {
            method1137(105, (class356) null, 4, -69);
        }
        field2567 = null;
        field2577 = null;
        field2584 = null;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)V", line = 94)
    private final void method1136(int arg0, int arg1) {
        ++field2575;
        super.field286[super.field287] = (byte) arg0;
        if (arg1 != -21326) {
            field2577 = null;
        }
        ++super.field287;
        ++super.field288;
        if (~super.field287 <= -5001) {
            super.field287 = 0;
        }
        ++super.field292;
        if (this.field2583 > 0) {
            Object var3 = this.field2568;
            synchronized (this.field2568) {
                this.field2568.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILts;II)V", line = 125)
    public static final void method1137(int arg0, class356 arg1, int arg2, int arg3) {
        ++field2566;
        if (arg0 != -1) {
            method1139(-96, -96, -128);
        }
        if (arg1 != null) {
            if (arg1.field5176 != null) {
                class99 var4 = new class99();
                var4.field1346 = arg1.field5176;
                var4.field1343 = arg1;
                class396.method2358(var4);
            }
            class278.field3963 = arg3;
            class71.field1052 = arg1.field5184;
            class472.field6827 = arg1.field5174;
            class303.field4394 = arg1.field5185;
            class288.field4128 = true;
            class272.field3802 = arg1.field5248;
            class450.field6553 = arg1.field5263;
            class450.field6554 = arg2;
            class170.method1068(arg0 ^ 81, arg1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLhg;)V", line = 158)
    public final void method149(byte arg0, class468 arg1) {
        Object var3 = this.field2568;
        synchronized (this.field2568) {
            --super.field289;
            if (~super.field289 > -1) {
                super.field289 = 4999;
            }
            super.field286[super.field289] = 21;
            super.field290[super.field289] = arg1;
            ++super.field288;
            int var4 = 103 / ((arg0 - 65) / 38);
            ++super.field292;
            if (~this.field2583 < -1) {
                this.field2568.notifyAll();
            }
        }
        ++field2578;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lwh;B)V", line = 181)
    public final void method1138(class95 arg0, byte arg1) {
        ++field2573;
        boolean var3 = false;
        boolean var25 = false;
        label386: {
            try {
                var25 = true;
                boolean var4 = false;
                float var5 = 0.0F;
                Object var6 = this.field2568;
                byte var7;
                synchronized (this.field2568) {
                    while (~super.field288 == -1) {
                        ++this.field2583;
                        this.field2568.wait();
                        --this.field2583;
                    }
                    if (arg1 != 3) {
                        Object var10000 = null;
                        var25 = false;
                        break label386;
                    }
                    var7 = super.field286[super.field289];
                    if (~arg0.field1277 <= -1) {
                        if (var7 < 0 || var7 > 3) {
                            var3 = true;
                        }
                    } else if (~var7 <= -1 && var7 <= 3) {
                        var3 = true;
                    }
                    if (var3) {
                        arg0.field4787 = super.field290[super.field289];
                        var5 = super.field291[super.field289];
                        super.field290[super.field289] = null;
                        ++super.field289;
                        if (super.field289 >= 5000) {
                            super.field289 = 0;
                        }
                        --super.field288;
                    }
                }
                if (var3) {
                    if (~arg0.field1277 <= -1) {
                        if (~var7 == -22) {
                            class376.method2284(arg0, (class468) arg0.field4787);
                            var25 = false;
                        } else if (var7 != 20) {
                            if (var7 >= 30 && var7 <= 33) {
                                class473.field6834.method821(3000.0F, var5 * 1.5F);
                                ((class441) arg0.field4787).method859(class463.field6724, class284.field4053, class210.field2977, class52.field777, var7 + -30 == 0);
                                var25 = false;
                            } else if (~var7 <= -41 && ~var7 >= -44) {
                                class473.field6834.method821(3000.0F, var5 * 1.5F);
                                ((class441) arg0.field4787).method859(class463.field6724, class284.field4053, class210.field2977, class139.field1822, ~(var7 + -40) == -1);
                                var25 = false;
                            } else if (~var7 == -23) {
                                class473.field6834.method808(-1, 1583160, 40, 127);
                                var25 = false;
                            } else if (var7 == 23) {
                                class473.field6834.method768();
                                var25 = false;
                            } else if (~var7 != -25) {
                                if (var7 >= 10) {
                                    if (~var7 >= -14) {
                                        class473.field6834.method839(arg0.field1277);
                                        arg0.field1277 = -1;
                                        var25 = false;
                                    } else {
                                        var25 = false;
                                    }
                                } else {
                                    var25 = false;
                                }
                            } else {
                                class473.field6834.method766(0, (class472[]) null);
                                var25 = false;
                            }
                        } else {
                            class468 var8 = (class468) arg0.field4787;
                            if (var8.field6778 != null) {
                                var8.field6778.method361(class473.field6834, -1);
                            }
                            if (var8.field6766 != null) {
                                var8.field6766.method361(class473.field6834, -1);
                            }
                            if (var8.field6772 != null) {
                                var8.field6772.method361(class473.field6834, arg1 + -4);
                            }
                            if (var8.field6777 != null) {
                                var8.field6777.method361(class473.field6834, -1);
                            }
                            if (var8.field6761 != null) {
                                var8.field6761.method361(class473.field6834, -1);
                            }
                            for (class323 var9 = var8.field6769; var9 != null; var9 = var9.field4727) {
                                var9.field4726.method361(class473.field6834, -1);
                            }
                            var25 = false;
                        }
                    } else if (~var7 <= -1) {
                        if (~var7 >= -4) {
                            arg0.field1277 = var7;
                            class473.field6834.method813(var7);
                            var25 = false;
                        } else {
                            var25 = false;
                        }
                    } else {
                        var25 = false;
                    }
                } else {
                    Thread.yield();
                    var25 = false;
                }
            } catch (Exception var30) {
                var25 = false;
            } finally {
                if (var25) {
                    Object var17 = null;
                    if (var3) {
                        Object var18 = this.field2568;
                        synchronized (this.field2568) {
                            --super.field292;
                            if (~super.field292 == -1) {
                                this.field2568.notifyAll();
                            }
                        }
                    }
                }
            }
            Object var15 = null;
            if (var3) {
                Object var16 = this.field2568;
                synchronized (this.field2568) {
                    --super.field292;
                    if (~super.field292 == -1) {
                        this.field2568.notifyAll();
                    }
                }
            }
            return;
        }
        if (var3) {
            Object var14 = this.field2568;
            synchronized (this.field2568) {
                --super.field292;
                if (~super.field292 == -1) {
                    this.field2568.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 346)
    public final void method156(byte arg0) {
        try {
            Object var2 = this.field2568;
            synchronized (this.field2568) {
                while (true) {
                    if (~super.field292 == -1) {
                        if (arg0 < 93) {
                            this.field2582 = 65;
                        }
                        break;
                    }
                    this.field2568.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field2572;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Log;IIFZ)V", line = 374)
    public final void method148(class441 arg0, int arg1, int arg2, float arg3, boolean arg4) {
        Object var6 = this.field2568;
        synchronized (this.field2568) {
            super.field286[super.field287] = (byte) (!arg4 ? arg2 + 30 : arg2 + 40);
            super.field290[super.field287] = arg0;
            super.field291[super.field287] = arg3;
            ++super.field287;
            if (~super.field287 <= -5001) {
                super.field287 = 0;
            }
            ++super.field292;
            ++super.field288;
            if (arg1 != 0) {
                method1139(-67, -62, -49);
            }
            if (~this.field2583 < -1) {
                this.field2568.notifyAll();
            }
        }
        ++field2565;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V", line = 399)
    public final void method153(int arg0, int arg1) {
        ++field2581;
        int var3 = 0;
        Object var4 = this.field2568;
        synchronized (this.field2568) {
            if (this.field2582 == arg0) {
                for (int var5 = 0; this.field2582 > var5; ++var5) {
                    this.method1136(var3++, arg1 + -21330);
                }
            } else {
                if (arg1 != 4) {
                    this.field2583 = 47;
                }
                for (int var6 = 0; this.field2582 > var6; ++var6) {
                    this.field2580[var6].method583((byte) 3);
                }
                this.field2582 = arg0;
                this.field2580 = new class95[this.field2582];
                for (int var7 = 0; var7 < this.field2582; ++var7) {
                    this.field2580[var7] = new class95(this);
                    this.field2580[var7].method579((byte) 57);
                    this.method1136(var3++, -21326);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lhg;I)V", line = 452)
    public final void method150(class468 arg0, int arg1) {
        Object var3 = this.field2568;
        synchronized (this.field2568) {
            if (arg1 <= 82) {
                method1135(76);
            }
            super.field286[super.field287] = 20;
            super.field290[super.field287] = arg0;
            ++super.field287;
            if (super.field287 >= 5000) {
                super.field287 = 0;
            }
            ++super.field292;
            ++super.field288;
            if (~this.field2583 < -1) {
                this.field2568.notifyAll();
            }
        }
        ++field2569;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z", line = 481)
    public static final boolean method1139(int arg0, int arg1, int arg2) {
        ++field2574;
        if (arg1 != 8765) {
            field2584 = null;
        }
        return ~(1408 & arg2) != -1;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)V", line = 495)
    private final void method1140(int arg0, int arg1) {
        super.field286[super.field287] = (byte) (arg1 + 10);
        ++field2579;
        ++super.field287;
        ++super.field288;
        if (super.field287 >= 5000) {
            super.field287 = 0;
        }
        ++super.field292;
        if (this.field2583 > 0) {
            Object var3 = this.field2568;
            synchronized (this.field2568) {
                this.field2568.notifyAll();
            }
        }
        int var4 = -34 % ((42 - arg0) / 42);
    }
}
