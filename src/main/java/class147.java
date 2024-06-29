import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class147 extends class225 {

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Z")
    private boolean field2590 = false;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "Z")
    private volatile boolean field2582 = false;

    @OriginalMember(owner = "client!nf", name = "sb", descriptor = "I")
    private int field2597 = -1;

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "Laf;")
    private class7 field2587;

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "Laf;")
    private class7 field2596;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "Ldj;")
    public static class44 field2589 = class89.method650(255, ")3");

    @OriginalMember(owner = "client!nf", name = "wb", descriptor = "Ldj;")
    public static class44 field2601 = class89.method650(255, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "[J")
    public static long[] field2586 = new long[32];

    @OriginalMember(owner = "client!nf", name = "ub", descriptor = "Z")
    public static boolean field2599 = false;

    @OriginalMember(owner = "client!nf", name = "yb", descriptor = "Ldj;")
    public static class44 field2603 = class89.method650(255, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!nf", name = "xb", descriptor = "[I")
    public static int[] field2602 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

    @OriginalMember(owner = "client!nf", name = "vb", descriptor = "Ldj;")
    public static class44 field2600 = class89.method650(255, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!nf", name = "Ab", descriptor = "[I")
    public static int[] field2605 = new int[5];

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!nf", name = "tb", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!nf", name = "Bb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "Z")
    public static boolean field2594;

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "[Z")
    private volatile boolean[] field2593;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2601 = null;
        field2600 = null;
        if (arg0 != 4832) {
            field2602 = null;
        }
        field2603 = null;
        field2586 = null;
        field2605 = null;
        field2589 = null;
        field2602 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ[BII)V")
    public final void method959(boolean arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        if (arg3 != -2) {
            this.field2587 = null;
        }
        ++field2585;
        if (arg1) {
            if (this.field2582) {
                throw new RuntimeException();
            } else {
                if (this.field2587 != null) {
                    class129.method879(this.field2580, arg2, this.field2587, (byte) -25);
                }
                this.method1459((byte) 45, arg2);
                this.method963(false);
            }
        } else {
            arg2[arg2.length + -2] = (byte) (super.field4230[arg4] >> 8);
            arg2[arg2.length + -1] = (byte) super.field4230[arg4];
            if (this.field2596 != null) {
                class129.method879(arg4, arg2, this.field2596, (byte) -29);
                this.field2593[arg4] = true;
            }
            if (arg0) {
                super.field4212[arg4] = class62.method468(arg2, false, 28544);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)I")
    public final int method960(int arg0) {
        ++field2591;
        if (this.field2582) {
            return 100;
        } else if (super.field4212 != null) {
            return 99;
        } else {
            int var2 = class214.method1392(this.field2580, -6756, 255);
            int var3 = 75 % ((79 - arg0) / 47);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ[BILaf;)V")
    public final void method961(int arg0, boolean arg1, byte[] arg2, int arg3, class7 arg4) {
        ++field2598;
        if (arg3 >= 61) {
            if (this.field2587 != arg4) {
                if (!arg1 && this.field2597 == arg0) {
                    this.field2582 = true;
                }
                if (arg2 == null || ~arg2.length >= -3) {
                    this.field2593[arg0] = false;
                    if (this.field2590 || arg1) {
                        class27.method191(this, (byte) 2, arg0, (byte) 92, super.field4219[arg0], arg1, this.field2580);
                    }
                    return;
                }
                class227.field4270.reset();
                class227.field4270.update(arg2, 0, arg2.length + -2);
                int var6 = (int) class227.field4270.getValue();
                int var7 = (65280 & arg2[arg2.length + -2] << 8) + (255 & arg2[arg2.length + -1]);
                if (super.field4219[arg0] != var6 || super.field4230[arg0] != var7) {
                    this.field2593[arg0] = false;
                    if (this.field2590 || arg1) {
                        class27.method191(this, (byte) 2, arg0, (byte) 42, super.field4219[arg0], arg1, this.field2580);
                    }
                    return;
                }
                this.field2593[arg0] = true;
                if (arg1) {
                    super.field4212[arg0] = class62.method468(arg2, false, 28544);
                    return;
                }
            } else {
                if (this.field2582) {
                    throw new RuntimeException();
                }
                if (arg2 == null) {
                    class27.method191(this, (byte) 0, this.field2580, (byte) 38, this.field2595, true, 255);
                    return;
                }
                class227.field4270.reset();
                class227.field4270.update(arg2, 0, arg2.length);
                int var8 = (int) class227.field4270.getValue();
                if (~this.field2595 != ~var8) {
                    class27.method191(this, (byte) 0, this.field2580, (byte) -123, this.field2595, true, 255);
                    return;
                }
                class66 var9;
                try {
                    var9 = new class66(class234.method1528(arg2, false));
                } catch (RuntimeException var12) {
                    class27.method191(this, (byte) 0, this.field2580, (byte) -109, this.field2595, true, 255);
                    return;
                }
                int var10 = var9.method506(255);
                if (~var10 != -6 && ~var10 != -7) {
                    class27.method191(this, (byte) 0, this.field2580, (byte) -126, this.field2595, true, 255);
                    return;
                }
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method528(true);
                }
                if (~this.field2604 != ~var11) {
                    class27.method191(this, (byte) 0, this.field2580, (byte) -112, this.field2595, true, 255);
                    return;
                }
                this.method1459((byte) 45, arg2);
                this.method963(false);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Laf;Laf;IZZZ)V")
    public class147(class7 arg0, class7 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2587 = arg1;
        this.field2596 = arg0;
        this.field2590 = arg5;
        this.field2580 = arg2;
        class156.method1029(this, this.field2580, 4679);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public final void method962(int arg0, int arg1) {
        ++field2588;
        if (this.method1464(23529, arg1)) {
            if (arg0 != 2130) {
                field2599 = true;
            }
            if (this.field2596 != null && this.field2593 != null && this.field2593[arg1]) {
                class29.method205(this, this.field2596, arg1, -127);
            } else {
                class27.method191(this, (byte) 2, arg1, (byte) 79, super.field4219[arg1], true, this.field2580);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    private final void method963(boolean arg0) {
        this.field2593 = new boolean[super.field4212.length];
        if (arg0) {
            this.method959(false, true, (byte[]) null, 24, -111);
        }
        ++field2606;
        for (int var2 = 0; var2 < this.field2593.length; ++var2) {
            this.field2593[var2] = false;
        }
        if (this.field2596 == null) {
            this.field2582 = true;
        } else {
            this.field2597 = -1;
            for (int var3 = 0; ~var3 > ~this.field2593.length; ++var3) {
                if (~super.field4195[var3] < -1) {
                    class112.method792(true, this.field2596, var3, this);
                    this.field2597 = var3;
                }
            }
            if (this.field2597 == -1) {
                this.field2582 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IZ)V")
    public final void method964(int arg0, boolean arg1) {
        if (!arg1) {
            ++field2583;
            if (this.method1464(23529, arg0)) {
                class168.method1064(arg0, (byte) 92, this.field2580);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IZI)V")
    public final void method965(int arg0, boolean arg1, int arg2) {
        this.field2604 = arg0;
        ++field2592;
        this.field2595 = arg2;
        if (this.field2587 == null) {
            class27.method191(this, (byte) 0, this.field2580, (byte) 22, this.field2595, true, 255);
        } else {
            class29.method205(this, this.field2587, this.field2580, -128);
        }
        if (arg1) {
            this.method961(-93, true, (byte[]) null, -80, (class7) null);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)I")
    public final int method966(int arg0, boolean arg1) {
        ++field2581;
        if (!this.method1464(23529, arg0)) {
            return 0;
        } else if (super.field4212[arg0] != null) {
            return 100;
        } else if (this.field2593[arg0]) {
            return 100;
        } else {
            if (arg1) {
                this.method962(55, -27);
            }
            return class214.method1392(arg0, -6756, this.field2580);
        }
    }
}
