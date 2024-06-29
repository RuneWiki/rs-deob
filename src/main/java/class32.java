import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class32 extends class12 {

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    private int field547 = 4;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Z")
    private boolean field548 = true;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    private int field557 = 4;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "[I")
    private int[] field551 = new int[512];

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    private int field556 = 0;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    private int field549 = 1638;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    private int field561 = 4;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Ltg;")
    public static class184 field542 = class135.method812("title_mute", 3);

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lnd;")
    public static class127 field554 = new class127(100);

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Ltg;")
    public static class184 field555 = class135.method812("und die Schaltfl-=che (WSpielkonto erstellen(W am", 3);

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "[I")
    public static int[] field560 = new int[256];

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "J")
    public static long field564;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "Ltg;")
    public static class184 field566;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "Ltg;")
    private static class184 field565;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "Ltg;")
    public static class184 field562;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "Ltg;")
    public static class184 field567;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Ltg;")
    public static class184 field568;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "[I")
    private int[] field552;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "[I")
    private int[] field558;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "[I")
    public static int[] field563;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    private final void method198(int arg0) {
        if (arg0 == 9648) {
            ++field546;
            if (~this.field549 >= -1) {
                if (this.field552 != null && ~this.field552.length == ~this.field547) {
                    this.field558 = new int[this.field547];
                    for (int var2 = 0; ~this.field547 < ~var2; ++var2) {
                        this.field558[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
                    }
                    return;
                }
            } else {
                this.field552 = new int[this.field547];
                this.field558 = new int[this.field547];
                for (int var3 = 0; ~this.field547 < ~var3; ++var3) {
                    this.field552[var3] = (int) (4096.0D * Math.pow((double) (this.field549 / 4096), (double) var3));
                    this.field558[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvb;ZLvb;Lna;B)V")
    public static final void method199(class197 arg0, boolean arg1, class197 arg2, class124 arg3, byte arg4) {
        int var5 = -21 / ((arg4 - -1) / 55);
        ++field543;
        class191.field3719 = arg0;
        class125.field2259 = arg2;
        class6.field118 = arg1;
        class12.field216 = class125.field2259.method1272(10, 19661);
        class111.field2017 = arg3;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        this.method202(-4096);
        ++field544;
        this.method198(9648);
        if (arg0 != 57) {
            this.method59((class97) null, -57, true);
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static void method200(int arg0) {
        field562 = null;
        field566 = null;
        if (arg0 > -89) {
            method199((class197) null, true, (class197) null, (class124) null, (byte) -75);
        }
        field560 = null;
        field542 = null;
        field555 = null;
        field567 = null;
        field563 = null;
        field568 = null;
        field554 = null;
        field565 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBII)I")
    private final int method201(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field559;
        int var6 = -4096 & arg3;
        int var7 = arg3 - var6;
        int var8 = arg4 & -4096;
        int var9 = -4096 & arg1;
        int var10 = var6 >> 12;
        if (arg2 != 25) {
            field568 = null;
        }
        int var11 = arg4 - var8;
        int var12 = var8 >> 12;
        int var13 = var12 + 1;
        int var14 = var10 - -1;
        int var15 = var10 & 255;
        if (~var14 <= ~(var9 >> 12)) {
            var14 = 0;
        }
        int var16 = var12 & 255;
        int var17 = var14 & 255;
        int var18 = arg0 & -4096;
        if (var13 >= var18 >> 12) {
            var13 = 0;
        }
        int var19 = this.field551[var15 - -this.field551[var16]] % 4;
        int var20 = var13 & 255;
        int var21 = this.field551[this.field551[var20] + var15] % 4;
        int var22 = this.field551[var17 - -this.field551[var16]] % 4;
        int var23 = this.field551[var17 - -this.field551[var20]] % 4;
        int var24 = class35.method209(var7, 0, class212.field4107[var19], var11);
        int var25 = class35.method209(var7 + -4096, arg2 + -25, class212.field4107[var22], var11);
        int var26 = class35.method209(var7, 0, class212.field4107[var21], var11 + -4096);
        int var27 = class35.method209(var7 + -4096, 0, class212.field4107[var23], var11 + -4096);
        int var28 = class135.method813(var7, arg2 ^ 31);
        int var29 = class135.method813(var11, 6);
        int var30 = class155.method938(var24, var28, -654375572, var25);
        int var31 = class155.method938(var26, var28, -654375572, var27);
        return class155.method938(var30, var29, -654375572, var31);
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    private final void method202(int arg0) {
        ++field545;
        Random var2 = new Random((long) this.field556);
        if (arg0 == -4096) {
            for (int var3 = 0; ~var3 > -256; ++var3) {
                this.field551[var3] = -1;
            }
            for (int var4 = 0; var4 < 255; ++var4) {
                int var5;
                do {
                    var5 = class116.method712(255, false, var2);
                } while (this.field551[var5] != -1);
                this.field551[var5 + 255] = this.field551[var5] = var4;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field561 = arg0.method588((byte) -56);
                                }
                            } else {
                                this.field557 = arg0.method588((byte) -83);
                            }
                        } else {
                            this.field556 = arg0.method588((byte) -108);
                        }
                    } else {
                        this.field557 = this.field561 = arg0.method588((byte) -42);
                    }
                } else {
                    this.field549 = arg0.method584((byte) -124);
                    if (this.field549 < 0) {
                        this.field552 = new int[this.field547];
                        for (int var5 = 0; ~var5 > ~this.field547; ++var5) {
                            this.field552[var5] = arg0.method584((byte) -119);
                        }
                    }
                }
            } else {
                this.field547 = arg0.method588((byte) -70);
            }
        } else {
            this.field548 = arg0.method588((byte) -98) == 1;
        }
        if (arg2) {
            field563 = null;
        }
        ++field541;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILvb;)[Loe;")
    public static final class137[] method203(int arg0, int arg1, int arg2, class197 arg3) {
        ++field540;
        if (arg2 <= 74) {
            field562 = null;
        }
        return !class94.method542(arg3, -85, arg1, arg0) ? null : class2.method10(-12513);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field550;
        if (arg1 != 17) {
            method200(-4);
        }
        int[] var3 = super.field224.method7((byte) -65, arg0);
        if (super.field224.field53) {
            int var4 = this.field557 << 12;
            int var5 = this.field561 << 12;
            int var6 = class37.field698[arg0] * this.field561;
            for (int var7 = 0; ~class201.field3889 < ~var7; ++var7) {
                int var8 = class131.field2381[var7] * this.field557;
                int var9 = 0;
                for (int var10 = 0; var10 < this.field547; ++var10) {
                    int var11 = this.field558[var10];
                    int var12 = this.field552[var10];
                    int var13 = this.method201(var5 * var11 >> 12, var4 * var11 >> 12, (byte) 25, var8 * var11 >> 12, var6 * var11 >> 12);
                    var9 += var12 * var13 >> 12;
                }
                if (this.field548) {
                    var9 = (var9 >> 1) + 2048;
                }
                var3[var7] = var9;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field560[var0] = var1;
        }
        field564 = 0L;
        field566 = class135.method812("bevor Sie den Vorgang wiederholen)3", 3);
        field565 = class135.method812("scroll:", 3);
        field562 = field565;
        field567 = field565;
        field568 = class135.method812("Lade)3)3)3", 3);
    }
}
