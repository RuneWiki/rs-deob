import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 extends class61 {

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    private int field2572 = -1;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "Z")
    private boolean field2578 = false;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "Z")
    private volatile boolean field2567 = false;

    @OriginalMember(owner = "client!pa", name = "Db", descriptor = "I")
    private int field2593;

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "Lic;")
    private class59 field2580;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "Lic;")
    private class59 field2564;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2562 = 0;

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "Lid;")
    public static class60 field2575 = class11.method72("Bitte geben Sie Ihren Benutzenamen ein)3", (byte) 108);

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "Lid;")
    private static class60 field2566 = class11.method72("Unable to connect)3", (byte) 125);

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Lid;")
    public static class60 field2576 = field2566;

    @OriginalMember(owner = "client!pa", name = "yb", descriptor = "[I")
    public static int[] field2588 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "[[S")
    public static short[][] field2569 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lid;")
    public static class60 field2581 = class11.method72("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", (byte) -25);

    @OriginalMember(owner = "client!pa", name = "zb", descriptor = "I")
    public static int field2589 = 0;

    @OriginalMember(owner = "client!pa", name = "wb", descriptor = "Lid;")
    public static class60 field2586 = field2566;

    @OriginalMember(owner = "client!pa", name = "vb", descriptor = "Lqd;")
    public static class115 field2585 = new class115(64);

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!pa", name = "ub", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!pa", name = "xb", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pa", name = "Bb", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pa", name = "Cb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "Le;")
    public static class29 field2583;

    @OriginalMember(owner = "client!pa", name = "Ab", descriptor = "Lmc;")
    public static class86 field2590;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "[Z")
    private volatile boolean[] field2582;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lic;Lic;IZZZ)V")
    public class105(class59 arg0, class59 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2578 = arg5;
        this.field2593 = arg2;
        this.field2580 = arg1;
        this.field2564 = arg0;
        class63.method490(this, 0, this.field2593);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZI[BLic;)V")
    public final void method858(byte arg0, boolean arg1, int arg2, byte[] arg3, class59 arg4) {
        if (arg0 < 81) {
            this.field2568 = -93;
        }
        ++field2587;
        if (this.field2580 != arg4) {
            if (!arg1 && ~this.field2572 == ~arg2) {
                this.field2567 = true;
            }
            if (arg3 != null && arg3.length > 2) {
                class35.field834.reset();
                class35.field834.update(arg3, 0, arg3.length + -2);
                int var6 = (int) class35.field834.getValue();
                int var7 = ((255 & arg3[arg3.length + -2]) << 8) + (arg3[arg3.length + -1] & 255);
                if (super.field1520[arg2] == var6 && ~super.field1528[arg2] == ~var7) {
                    this.field2582[arg2] = true;
                    if (arg1) {
                        super.field1503[arg2] = class98.method777(false, 20052, arg3);
                    }
                } else {
                    this.field2582[arg2] = false;
                    if (this.field2578 || arg1) {
                        class104.method857(arg2, (byte) 2, super.field1520[arg2], this.field2593, (byte) -124, arg1, this);
                    }
                }
            } else {
                this.field2582[arg2] = false;
                if (this.field2578 || arg1) {
                    class104.method857(arg2, (byte) 2, super.field1520[arg2], this.field2593, (byte) -124, arg1, this);
                }
            }
        } else if (this.field2567) {
            throw new RuntimeException();
        } else if (arg3 == null) {
            class104.method857(this.field2593, (byte) 0, this.field2568, 255, (byte) -125, true, this);
        } else {
            class35.field834.reset();
            class35.field834.update(arg3, 0, arg3.length);
            int var8 = (int) class35.field834.getValue();
            class103 var9 = new class103(class69.method520(arg3, true));
            int var10 = var9.method829((byte) -98);
            if (var10 != 5 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            } else {
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method803(false);
                }
                if (~this.field2568 != ~var8 || ~this.field2563 != ~var11) {
                    class104.method857(this.field2593, (byte) 0, this.field2568, 255, (byte) 39, true, this);
                } else {
                    this.method478(arg3, true);
                    this.method862(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
    public final void method472(int arg0, int arg1) {
        if (arg0 >= -1) {
            this.method862(-107);
        }
        class19.method160(this.field2593, arg1, 8);
        ++field2584;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(IB)I")
    private final int method859(int arg0, byte arg1) {
        ++field2570;
        if (super.field1503[arg0] != null) {
            return 100;
        } else if (this.field2582[arg0]) {
            return 100;
        } else {
            if (arg1 != -2) {
                field2589 = 49;
            }
            return class12.method80(false, this.field2593, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
    public final void method860(int arg0, int arg1, int arg2) {
        ++field2579;
        this.field2568 = arg0;
        this.field2563 = arg2;
        if (arg1 > 69) {
            if (this.field2580 != null) {
                class23.method182(this.field2580, this.field2593, -1, this);
            } else {
                class104.method857(this.field2593, (byte) 0, this.field2568, 255, (byte) -128, true, this);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)I")
    public final int method861(int arg0) {
        ++field2571;
        if (this.field2567) {
            return 100;
        } else if (super.field1503 != null) {
            return 99;
        } else {
            int var2 = class12.method80(false, 255, this.field2593);
            if (arg0 >= -22) {
                this.field2582 = null;
            }
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    private final void method862(int arg0) {
        ++field2574;
        this.field2582 = new boolean[super.field1503.length];
        for (int var2 = 0; ~var2 > ~this.field2582.length; ++var2) {
            this.field2582[var2] = false;
        }
        if (this.field2564 == null) {
            this.field2567 = true;
        } else {
            this.field2572 = -1;
            for (int var3 = arg0; var3 < this.field2582.length; ++var3) {
                if (~super.field1525[var3] < -1) {
                    class66.method509(this.field2564, var3, this, true);
                    this.field2572 = var3;
                }
            }
            if (this.field2572 == -1) {
                this.field2567 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZBIZ[B)V")
    public final void method863(boolean arg0, byte arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg1 > -7) {
            this.field2563 = -4;
        }
        ++field2577;
        if (!arg0) {
            arg4[arg4.length - 2] = (byte) (super.field1528[arg2] >> 8);
            arg4[arg4.length + -1] = (byte) super.field1528[arg2];
            if (this.field2564 != null) {
                class63.method491(arg4, -2273, this.field2564, arg2);
                this.field2582[arg2] = true;
            }
            if (arg3) {
                super.field1503[arg2] = class98.method777(false, 20052, arg4);
                return;
            }
        } else {
            if (this.field2567) {
                throw new RuntimeException();
            }
            if (this.field2580 != null) {
                class63.method491(arg4, -2273, this.field2580, this.field2593);
            }
            this.method478(arg4, true);
            this.method862(0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public static void method864(int arg0) {
        field2581 = null;
        field2576 = null;
        field2585 = null;
        field2583 = null;
        field2575 = null;
        field2586 = null;
        field2588 = null;
        field2569 = null;
        field2590 = null;
        if (arg0 != -1) {
            field2576 = null;
        }
        field2566 = null;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
    public final int method865(int arg0) {
        ++field2592;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~super.field1503.length < ~var4; ++var4) {
            if (~super.field1525[var4] < -1) {
                var2 += 100;
                var3 += this.method859(var4, (byte) -2);
            }
        }
        if (arg0 != -1) {
            this.field2563 = 69;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
    public final void method459(byte arg0, int arg1) {
        if (this.field2564 != null && this.field2582 != null && this.field2582[arg1]) {
            class23.method182(this.field2564, arg1, arg0 ^ -24, this);
        } else {
            class104.method857(arg1, (byte) 2, super.field1520[arg1], this.field2593, (byte) -126, true, this);
        }
        if (arg0 != 23) {
            this.method858((byte) -64, true, 41, (byte[]) null, (class59) null);
        }
        ++field2591;
    }
}
