import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class7 extends class376 {

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field93 = new Object();

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "[Lbj;")
    private class360[] field95 = new class360[0];

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    private int field96 = 0;

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "Lkc;")
    public static class157 field89 = new class157("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "Lde;")
    public static class10 field97;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "[[B")
    public static byte[][] field94;

    static {
        new class301("", 76);
        field97 = new class10(10, 2, 2, 0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BI)V", line = 6)
    public final void method39(byte arg0, int arg1) {
        ++field81;
        Object var3 = this.field93;
        synchronized (this.field93) {
            super.field5400[super.field5405] = (byte) arg1;
            if (arg0 >= 120) {
                ++super.field5405;
                ++super.field5398;
                if (~super.field5405 <= -5001) {
                    super.field5405 = 0;
                }
                ++super.field5407;
                if (~this.field98 < -1) {
                    this.field93.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILwr;)V", line = 28)
    public final void method40(int arg0, class532 arg1) {
        ++field92;
        Object var3 = this.field93;
        synchronized (this.field93) {
            super.field5400[super.field5405] = 21;
            super.field5406[super.field5405] = arg1;
            ++super.field5405;
            if (super.field5405 >= 5000) {
                super.field5405 = 0;
            }
            if (arg0 != -26704) {
                field89 = null;
            }
            ++super.field5407;
            ++super.field5398;
            if (~this.field98 < -1) {
                this.field93.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lya;IZZF)V", line = 54)
    public final void method41(class11 arg0, int arg1, boolean arg2, boolean arg3, float arg4) {
        Object var6 = this.field93;
        synchronized (this.field93) {
            super.field5400[super.field5405] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
            super.field5406[super.field5405] = arg0;
            super.field5403[super.field5405] = arg4;
            ++super.field5405;
            ++super.field5407;
            ++super.field5398;
            if (super.field5405 >= 5000) {
                super.field5405 = 0;
            }
            if (~this.field98 < -1) {
                this.field93.notifyAll();
            }
        }
        if (!arg3) {
            this.method39((byte) -55, 25);
        }
        ++field80;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 79)
    public final void method42(int arg0) {
        try {
            Object var2 = this.field93;
            synchronized (this.field93) {
                while (true) {
                    if (super.field5407 == 0) {
                        break;
                    }
                    this.field93.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field84;
        if (arg0 != 0) {
            this.method41((class11) null, 24, false, false, -0.84653306F);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V", line = 101)
    private final void method43(int arg0, int arg1) {
        ++field88;
        super.field5400[super.field5405] = (byte) arg0;
        if (arg1 == 0) {
            ++super.field5405;
            ++super.field5407;
            ++super.field5398;
            if (super.field5405 >= 5000) {
                super.field5405 = 0;
            }
            if (~this.field98 < -1) {
                Object var3 = this.field93;
                synchronized (this.field93) {
                    this.field93.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILbj;)V", line = 126)
    public final void method44(int arg0, class360 arg1) {
        ++field87;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field93;
            byte var7;
            synchronized (this.field93) {
                while (super.field5398 == 0) {
                    ++this.field98;
                    this.field93.wait();
                    --this.field98;
                }
                var7 = super.field5400[super.field5402];
                if (~arg1.field5177 <= -1) {
                    if (~var7 > -1 || var7 > 3) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    var3 = true;
                }
                int var8 = -10 / ((-78 - arg0) / 32);
                if (var3) {
                    arg1.field3159 = super.field5406[super.field5402];
                    var5 = super.field5403[super.field5402];
                    super.field5406[super.field5402] = null;
                    ++super.field5402;
                    --super.field5398;
                    if (~super.field5402 <= -5001) {
                        super.field5402 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field5177 > -1) {
                if (~var7 <= -1 && ~var7 >= -4) {
                    arg1.field5177 = var7;
                    class77.field1093.method494(var7);
                }
            } else if (var7 == 21) {
                class364.method2182(arg1, (class532) arg1.field3159);
            } else if (var7 == 20) {
                class532 var9 = (class532) arg1.field3159;
                if (var9.field7830 != null) {
                    var9.field7830.method166(class77.field1093, 78);
                }
                if (var9.field7822 != null) {
                    var9.field7822.method166(class77.field1093, 82);
                }
                if (var9.field7833 != null) {
                    var9.field7833.method166(class77.field1093, 21);
                }
                if (var9.field7835 != null) {
                    var9.field7835.method166(class77.field1093, 33);
                }
                if (var9.field7838 != null) {
                    var9.field7838.method166(class77.field1093, 68);
                }
                for (class201 var10 = var9.field7828; var10 != null; var10 = var10.field2918) {
                    var10.field2915.method166(class77.field1093, 107);
                }
            } else if (var7 >= 30 && ~var7 >= -34) {
                class77.field1093.method462(3000.0F, var5 * 1.5F);
                ((class11) arg1.field3159).method82(class39.field578, class119.field1859, class282.field3832, class223.field3153, ~(var7 + -30) == -1);
            } else if (var7 >= 40 && ~var7 >= -44) {
                class77.field1093.method462(3000.0F, var5 * 1.5F);
                ((class11) arg1.field3159).method82(class39.field578, class119.field1859, class282.field3832, class18.field280, var7 + -40 == 0);
            } else if (~var7 != -23) {
                if (~var7 == -24) {
                    class77.field1093.method488();
                } else if (~var7 == -25) {
                    class77.field1093.method503(0, (class447[]) null);
                } else if (var7 >= 10 && var7 <= 13) {
                    class77.field1093.method513(arg1.field5177);
                    arg1.field5177 = -1;
                }
            } else {
                class77.field1093.method517(-1, 1583160, 40, 127);
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field93;
                synchronized (this.field93) {
                    --super.field5407;
                    if (~super.field5407 == -1) {
                        this.field93.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjm;)I", line = 294)
    public static final int method45(int arg0, class209 arg1) {
        ++field85;
        class83 var2 = arg1.field2976;
        if (var2.field1272 != null) {
            var2 = var2.method655(class309.field4200, (byte) 126);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != 20215) {
            return -99;
        } else {
            int var3 = var2.field1220;
            class495 var4 = arg1.method108(true);
            if (!arg1.field247) {
                if (~arg1.field186 != ~var4.field7176 && ~arg1.field186 != ~var4.field7202 && arg1.field186 != var4.field7172 && arg1.field186 != var4.field7173) {
                    if (arg1.field186 == var4.field7206 || ~arg1.field186 == ~var4.field7186 || ~arg1.field186 == ~var4.field7190 || arg1.field186 == var4.field7165) {
                        var3 = var2.field1265;
                    }
                } else {
                    var3 = var2.field1286;
                }
            } else {
                var3 = var2.field1231;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 333)
    public final void method46(int arg0) {
        ++field86;
        Object var2 = this.field93;
        synchronized (this.field93) {
            for (int var3 = 0; ~var3 > ~this.field96; ++var3) {
                if (this.field95[var3].field5177 >= 0) {
                    this.method50(this.field95[var3].field5177, -107);
                }
            }
            if (arg0 != 15609) {
                field89 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lwr;I)V", line = 362)
    public final void method47(class532 arg0, int arg1) {
        ++field82;
        Object var3 = this.field93;
        synchronized (this.field93) {
            super.field5400[super.field5405] = 20;
            super.field5406[super.field5405] = arg0;
            ++super.field5405;
            if (super.field5405 >= 5000) {
                super.field5405 = 0;
            }
            ++super.field5407;
            ++super.field5398;
            if (arg1 != -51) {
                this.field96 = 2;
            }
            if (this.field98 > 0) {
                this.field93.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)V", line = 387)
    public final void method48(int arg0, byte arg1) {
        ++field91;
        int var3 = 0;
        Object var4 = this.field93;
        synchronized (this.field93) {
            if (this.field96 == arg0) {
                for (int var5 = 0; this.field96 > var5; ++var5) {
                    this.method43(var3++, 0);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field96; ++var6) {
                    this.field95[var6].method2147(967669134);
                }
                this.field96 = arg0;
                this.field95 = new class360[this.field96];
                if (arg1 <= -34) {
                    for (int var7 = 0; ~this.field96 < ~var7; ++var7) {
                        this.field95[var7] = new class360(this);
                        this.field95[var7].method2149((byte) -107);
                        this.method43(var3++, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V", line = 436)
    public static void method49(int arg0) {
        if (arg0 != 26779) {
            field97 = null;
        }
        field97 = null;
        field94 = null;
        field89 = null;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)V", line = 458)
    private final void method50(int arg0, int arg1) {
        ++field90;
        super.field5400[super.field5405] = (byte) (arg0 + 10);
        ++super.field5405;
        int var3 = -103 % ((arg1 - -22) / 62);
        ++super.field5407;
        ++super.field5398;
        if (super.field5405 >= 5000) {
            super.field5405 = 0;
        }
        if (~this.field98 < -1) {
            Object var4 = this.field93;
            synchronized (this.field93) {
                this.field93.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLwr;)V", line = 493)
    public final void method51(byte arg0, class532 arg1) {
        Object var3 = this.field93;
        synchronized (this.field93) {
            --super.field5402;
            if (super.field5402 < 0) {
                super.field5402 = 4999;
            }
            super.field5400[super.field5402] = 21;
            super.field5406[super.field5402] = arg1;
            ++super.field5407;
            if (arg0 > -74) {
                return;
            }
            ++super.field5398;
            if (this.field98 > 0) {
                this.field93.notifyAll();
            }
        }
        ++field83;
    }
}
