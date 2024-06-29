import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class29 extends class315 {

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Ljava/lang/Object;")
    private Object field487 = new Object();

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field491 = 0;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    private int field493 = 0;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[Lqk;")
    private class8[] field492 = new class8[0];

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Lhb;")
    public static class250 field496;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Z")
    public static boolean field497;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Ldn;")
    public static class201 field499;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
    public static int[] field498;

    static {
        new class169("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field496 = new class250(19, 0);
        field497 = false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method193(boolean arg0, int arg1) {
        ++field494;
        if (arg0) {
            field499 = null;
        }
        class203.field2665 = -1;
        if (arg1 == 37) {
            class230.field2954 = 3.0F;
        } else if (arg1 != 50) {
            if (~arg1 == -76) {
                class230.field2954 = 6.0F;
            } else if (~arg1 != -101) {
                if (arg1 == 200) {
                    class230.field2954 = 16.0F;
                }
            } else {
                class230.field2954 = 8.0F;
            }
        } else {
            class230.field2954 = 4.0F;
        }
        class203.field2665 = -1;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V", line = 39)
    private final void method194(int arg0, int arg1) {
        ++field481;
        super.field4057[super.field4053] = (byte) (arg0 + 10);
        ++super.field4053;
        if (~super.field4053 <= -5001) {
            super.field4053 = 0;
        }
        ++super.field4054;
        if (arg1 != 17025) {
            this.field491 = 8;
        }
        ++super.field4055;
        if (~this.field493 < -1) {
            Object var3 = this.field487;
            synchronized (this.field487) {
                this.field487.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLqk;)V", line = 64)
    public final void method195(byte arg0, class8 arg1) {
        ++field485;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field487;
            byte var7;
            synchronized (this.field487) {
                while (super.field4054 == 0) {
                    ++this.field493;
                    this.field487.wait();
                    --this.field493;
                }
                var7 = super.field4057[super.field4061];
                if (arg1.field74 >= 0) {
                    if (~var7 > -1 || var7 > 3) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    var3 = true;
                }
                if (arg0 != 118) {
                    this.method205(98, true);
                }
                if (var3) {
                    arg1.field3364 = super.field4056[super.field4061];
                    var5 = super.field4058[super.field4061];
                    super.field4056[super.field4061] = null;
                    ++super.field4061;
                    if (super.field4061 >= 5000) {
                        super.field4061 = 0;
                    }
                    --super.field4054;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field74 <= -1) {
                if (var7 == 21) {
                    class177.method1147(arg1, (class510) arg1.field3364);
                } else if (var7 != 20) {
                    if (var7 >= 30 && var7 <= 33) {
                        class372.field4831.method913(3000.0F, var5 * 1.5F);
                        ((class251) arg1.field3364).method1177(class225.field2922, class477.field6969, class18.field318, class357.field4598, var7 - 30 == 0);
                    } else if (~var7 <= -41 && ~var7 >= -44) {
                        class372.field4831.method913(3000.0F, var5 * 1.5F);
                        ((class251) arg1.field3364).method1177(class225.field2922, class477.field6969, class18.field318, class465.field6840, ~(var7 + -40) == -1);
                    } else if (var7 == 22) {
                        class372.field4831.method823(-1, 1583160, 40, 127);
                    } else if (~var7 != -24) {
                        if (~var7 != -25) {
                            if (var7 >= 10 && var7 <= 13) {
                                class372.field4831.method908(arg1.field74);
                                arg1.field74 = -1;
                            }
                        } else {
                            class372.field4831.method906(0, (class182[]) null);
                        }
                    } else {
                        class372.field4831.method831();
                    }
                } else {
                    class510 var8 = (class510) arg1.field3364;
                    if (var8.field7499 != null) {
                        var8.field7499.method175((byte) 91, class372.field4831);
                    }
                    if (var8.field7502 != null) {
                        var8.field7502.method175((byte) 91, class372.field4831);
                    }
                    if (var8.field7485 != null) {
                        var8.field7485.method175((byte) 91, class372.field4831);
                    }
                    if (var8.field7497 != null) {
                        var8.field7497.method175((byte) 91, class372.field4831);
                    }
                    if (var8.field7492 != null) {
                        var8.field7492.method175((byte) 91, class372.field4831);
                    }
                    for (class319 var9 = var8.field7494; var9 != null; var9 = var9.field4102) {
                        var9.field4107.method175((byte) 91, class372.field4831);
                    }
                }
            } else if (~var7 <= -1 && ~var7 >= -4) {
                arg1.field74 = var7;
                class372.field4831.method874(var7);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field487;
                synchronized (this.field487) {
                    --super.field4055;
                    if (~super.field4055 == -1) {
                        this.field487.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLtg;)V", line = 231)
    public final void method196(boolean arg0, class510 arg1) {
        ++field479;
        Object var3 = this.field487;
        synchronized (this.field487) {
            super.field4057[super.field4053] = 21;
            super.field4056[super.field4053] = arg1;
            ++super.field4053;
            ++super.field4055;
            ++super.field4054;
            if (~super.field4053 <= -5001) {
                super.field4053 = 0;
            }
            if (!arg0) {
                this.field492 = null;
            }
            if (~this.field493 < -1) {
                this.field487.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltg;B)V", line = 259)
    public final void method197(class510 arg0, byte arg1) {
        if (arg1 >= 103) {
            Object var3 = this.field487;
            synchronized (this.field487) {
                --super.field4061;
                if (~super.field4061 > -1) {
                    super.field4061 = 4999;
                }
                super.field4057[super.field4061] = 21;
                super.field4056[super.field4061] = arg0;
                ++super.field4054;
                ++super.field4055;
                if (~this.field493 < -1) {
                    this.field487.notifyAll();
                }
            }
            ++field480;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltg;I)V", line = 283)
    public final void method198(class510 arg0, int arg1) {
        Object var3 = this.field487;
        synchronized (this.field487) {
            super.field4057[super.field4053] = 20;
            super.field4056[super.field4053] = arg0;
            ++super.field4053;
            ++super.field4054;
            ++super.field4055;
            if (super.field4053 >= 5000) {
                super.field4053 = 0;
            }
            if (arg1 != -23985) {
                field497 = true;
            }
            if (~this.field493 < -1) {
                this.field487.notifyAll();
            }
        }
        ++field483;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 307)
    public final void method199(int arg0) {
        ++field490;
        Object var2 = this.field487;
        synchronized (this.field487) {
            if (arg0 != 5000) {
                this.field493 = -46;
            }
            for (int var3 = 0; this.field491 > var3; ++var3) {
                if (this.field492[var3].field74 >= 0) {
                    this.method194(this.field492[var3].field74, 17025);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 332)
    public final void method200(int arg0, int arg1) {
        ++field486;
        if (arg1 >= -127) {
            field499 = null;
        }
        int var3 = 0;
        Object var4 = this.field487;
        synchronized (this.field487) {
            if (~this.field491 == ~arg0) {
                for (int var5 = 0; var5 < this.field491; ++var5) {
                    this.method204(var3++, 122);
                }
            } else {
                for (int var6 = 0; this.field491 > var6; ++var6) {
                    this.field492[var6].method58(-76);
                }
                this.field491 = arg0;
                this.field492 = new class8[this.field491];
                for (int var7 = 0; ~this.field491 < ~var7; ++var7) {
                    this.field492[var7] = new class8(this);
                    this.field492[var7].method56(30635);
                    this.method204(var3++, 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lna;IBFZ)V", line = 384)
    public final void method201(class251 arg0, int arg1, byte arg2, float arg3, boolean arg4) {
        ++field495;
        Object var6 = this.field487;
        synchronized (this.field487) {
            super.field4057[super.field4053] = (byte) (!arg4 ? arg1 + 30 : arg1 + 40);
            super.field4056[super.field4053] = arg0;
            super.field4058[super.field4053] = arg3;
            ++super.field4053;
            ++super.field4054;
            if (arg2 < 58) {
                this.field487 = null;
            }
            ++super.field4055;
            if (~super.field4053 <= -5001) {
                super.field4053 = 0;
            }
            if (this.field493 > 0) {
                this.field487.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 422)
    public final void method202(byte arg0) {
        try {
            Object var2 = this.field487;
            synchronized (this.field487) {
                while (true) {
                    if (~super.field4055 == -1) {
                        int var3 = -36 % ((arg0 - -31) / 60);
                        break;
                    }
                    this.field487.wait();
                }
            }
        } catch (Exception var5) {
        }
        ++field489;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 443)
    public static void method203(byte arg0) {
        field496 = null;
        field499 = null;
        field498 = null;
        if (arg0 != -105) {
            method203((byte) 126);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V", line = 460)
    private final void method204(int arg0, int arg1) {
        ++field484;
        super.field4057[super.field4053] = (byte) arg0;
        ++super.field4053;
        ++super.field4054;
        ++super.field4055;
        if (~super.field4053 <= -5001) {
            super.field4053 = 0;
        }
        if (arg1 < 107) {
            this.method204(-46, -92);
        }
        if (~this.field493 < -1) {
            Object var3 = this.field487;
            synchronized (this.field487) {
                this.field487.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V", line = 485)
    public final void method205(int arg0, boolean arg1) {
        ++field488;
        Object var3 = this.field487;
        synchronized (this.field487) {
            super.field4057[super.field4053] = (byte) arg0;
            ++super.field4053;
            ++super.field4055;
            if (super.field4053 >= 5000) {
                super.field4053 = 0;
            }
            ++super.field4054;
            if (arg1) {
                if (this.field493 > 0) {
                    this.field487.notifyAll();
                }
            }
        }
    }
}
