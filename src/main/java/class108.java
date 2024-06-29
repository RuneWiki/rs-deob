import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class87 {

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "Z")
    private boolean field2536 = false;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    private int field2530 = -1;

    @OriginalMember(owner = "client!pd", name = "yb", descriptor = "Z")
    private volatile boolean field2556 = false;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "Laf;")
    private class7 field2546;

    @OriginalMember(owner = "client!pd", name = "Ab", descriptor = "Laf;")
    private class7 field2558;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Ltd;")
    public static class136 field2535 = class145.method1172("<col=ff3000>", 45);

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "Ltd;")
    public static class136 field2539 = class145.method1172("Spiel)2Engine wird gestartet)3)3)3", 45);

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "[I")
    public static int[] field2532 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "[Ltd;")
    public static class136[] field2534 = new class136[100];

    @OriginalMember(owner = "client!pd", name = "Bb", descriptor = "Ltd;")
    public static class136 field2559 = class145.method1172("Lade Schrifts-=tze )2 ", 45);

    @OriginalMember(owner = "client!pd", name = "wb", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!pd", name = "Db", descriptor = "Ltd;")
    private static class136 field2561 = class145.method1172("white:", 45);

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "Ltd;")
    private static class136 field2545 = class145.method1172(" more options", 45);

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Ltd;")
    public static class136 field2540 = field2561;

    @OriginalMember(owner = "client!pd", name = "Cb", descriptor = "Ltd;")
    public static class136 field2560 = field2545;

    @OriginalMember(owner = "client!pd", name = "Eb", descriptor = "Ltd;")
    public static class136 field2562 = field2561;

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "Lue;")
    public static class143 field2550 = new class143(64);

    @OriginalMember(owner = "client!pd", name = "Hb", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!pd", name = "Ib", descriptor = "Ltd;")
    public static class136 field2566 = class145.method1172("null", 45);

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    private int field2541;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pd", name = "xb", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pd", name = "zb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lpd;")
    public static class108 field2537;

    @OriginalMember(owner = "client!pd", name = "Gb", descriptor = "[I")
    public static int[] field2564;

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "[Z")
    private volatile boolean[] field2551;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method851(int arg0) {
        ++field2552;
        if (class40.field933) {
            class74 var1 = class125.method965(class69.field1457, (byte) 80, class94.field2202);
            if (arg0 == 255) {
                if (var1 != null && var1.field1660 != null) {
                    class139 var2 = new class139();
                    var2.field3244 = var1.field1660;
                    var2.field3222 = var1;
                    class96.method734(-9063, var2);
                }
                class40.field933 = false;
                class145.method1173(var1, arg0 + -4263);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)V")
    public final void method852(int arg0, int arg1, int arg2) {
        this.field2541 = arg0;
        if (arg2 >= -53) {
            field2540 = null;
        }
        ++field2553;
        this.field2543 = arg1;
        if (this.field2558 != null) {
            class1.method3(this, this.field2549, 0, this.field2558);
        } else {
            class49.method416((byte) 0, this, this.field2541, true, true, this.field2549, 255);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BZZB)V")
    public final void method853(int arg0, byte[] arg1, boolean arg2, boolean arg3, byte arg4) {
        ++field2563;
        if (arg3) {
            if (this.field2556) {
                throw new RuntimeException();
            }
            if (this.field2558 != null) {
                class110.method864(arg1, this.field2558, this.field2549, (byte) 90);
            }
            this.method655(arg1, 0);
            this.method854((byte) -43);
        } else {
            arg1[arg1.length + -2] = (byte) (super.field2068[arg0] >> 8);
            arg1[arg1.length + -1] = (byte) super.field2068[arg0];
            if (this.field2546 != null) {
                class110.method864(arg1, this.field2546, arg0, (byte) 77);
                this.field2551[arg0] = true;
            }
            if (arg2) {
                super.field2042[arg0] = class1.method4(arg1, false, 111);
            }
        }
        if (arg4 != 0) {
            field2540 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    private final void method854(byte arg0) {
        ++field2555;
        this.field2551 = new boolean[super.field2042.length];
        for (int var2 = 0; var2 < this.field2551.length; ++var2) {
            this.field2551[var2] = false;
        }
        if (this.field2546 == null) {
            this.field2556 = true;
        } else {
            this.field2530 = -1;
            if (arg0 == -43) {
                for (int var3 = 0; this.field2551.length > var3; ++var3) {
                    if (~super.field2056[var3] < -1) {
                        class38.method323(this, (byte) 46, this.field2546, var3);
                        this.field2530 = var3;
                    }
                }
                if (~this.field2530 == 0) {
                    this.field2556 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(BI)V")
    public final void method665(byte arg0, int arg1) {
        ++field2533;
        class110.method870(arg1, this.field2549, false);
        if (arg0 > -75) {
            this.field2549 = -37;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Laf;Laf;IZZZ)V")
    public class108(class7 arg0, class7 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2546 = arg0;
        this.field2536 = arg5;
        this.field2558 = arg1;
        this.field2549 = arg2;
        class44.method355((byte) -118, this, this.field2549);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)I")
    public final int method855(byte arg0) {
        ++field2557;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field2042.length; ++var4) {
            if (super.field2056[var4] > 0) {
                var2 += 100;
                var3 += this.method859(var4, arg0 ^ -87);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            if (arg0 != -21) {
                field2561 = null;
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)I")
    public final int method856(byte arg0) {
        ++field2538;
        if (this.field2556) {
            return 100;
        } else if (super.field2042 != null) {
            return 99;
        } else {
            int var2 = class104.method840(this.field2549, 255, 65536);
            if (arg0 >= -68) {
                this.field2556 = true;
            }
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZB[BLaf;)V")
    public final void method857(int arg0, boolean arg1, byte arg2, byte[] arg3, class7 arg4) {
        if (arg2 != 26) {
            field2560 = null;
        }
        ++field2544;
        if (this.field2558 == arg4) {
            if (this.field2556) {
                throw new RuntimeException();
            } else if (arg3 == null) {
                class49.method416((byte) 0, this, this.field2541, true, true, this.field2549, 255);
            } else {
                class12.field215.reset();
                class12.field215.update(arg3, 0, arg3.length);
                int var6 = (int) class12.field215.getValue();
                class127 var7 = new class127(class55.method442(arg3, (byte) -85));
                int var8 = var7.method1011(126);
                if (~var8 != -6 && var8 != 6) {
                    throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
                } else {
                    int var9 = 0;
                    if (~var8 <= -7) {
                        var9 = var7.method986(-126);
                    }
                    if (this.field2541 == var6 && this.field2543 == var9) {
                        this.method655(arg3, arg2 + -26);
                        this.method854((byte) -43);
                    } else {
                        class49.method416((byte) 0, this, this.field2541, true, true, this.field2549, 255);
                    }
                }
            }
        } else {
            if (!arg1 && this.field2530 == arg0) {
                this.field2556 = true;
            }
            if (arg3 != null && ~arg3.length < -3) {
                class12.field215.reset();
                class12.field215.update(arg3, 0, arg3.length + -2);
                int var10 = (int) class12.field215.getValue();
                int var11 = (65280 & arg3[arg3.length + -2] << 8) + (255 & arg3[arg3.length + -1]);
                if (super.field2054[arg0] == var10 && super.field2068[arg0] == var11) {
                    this.field2551[arg0] = true;
                    if (arg1) {
                        super.field2042[arg0] = class1.method4(arg3, false, arg2 + 84);
                    }
                } else {
                    this.field2551[arg0] = false;
                    if (this.field2536 || arg1) {
                        class49.method416((byte) 2, this, super.field2054[arg0], arg1, true, arg0, this.field2549);
                    }
                }
            } else {
                this.field2551[arg0] = false;
                if (this.field2536 || arg1) {
                    class49.method416((byte) 2, this, super.field2054[arg0], arg1, true, arg0, this.field2549);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
    public final void method660(int arg0, byte arg1) {
        if (arg1 >= -23) {
            this.field2541 = -120;
        }
        if (this.field2546 != null && this.field2551 != null && this.field2551[arg0]) {
            class1.method3(this, arg0, 0, this.field2546);
        } else {
            class49.method416((byte) 2, this, super.field2054[arg0], true, true, arg0, this.field2549);
        }
        ++field2547;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field2566 = null;
        field2560 = null;
        field2562 = null;
        field2540 = null;
        field2550 = null;
        field2564 = null;
        field2534 = null;
        field2535 = null;
        field2561 = null;
        field2559 = null;
        if (arg0 <= -34) {
            field2539 = null;
            field2532 = null;
            field2537 = null;
            field2545 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(II)I")
    private final int method859(int arg0, int arg1) {
        if (arg1 < 62) {
            return -125;
        } else {
            ++field2531;
            if (super.field2042[arg0] != null) {
                return 100;
            } else {
                return this.field2551[arg0] ? 100 : class104.method840(arg0, this.field2549, 65536);
            }
        }
    }
}
