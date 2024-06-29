import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class35 {

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    private int field542 = 0;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    private int field545 = -1;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Ljava/lang/String;")
    public static String field538 = "purple:";

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[J")
    public static long[] field546 = new long[256];

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field548 = 1;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field540 = -2;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field550 = -1;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[[B")
    public static byte[][] field535;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    private final void method234(int arg0, int arg1) {
        field549++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 > -91) {
            this.field534 = -116;
        }
        double var5 = (double) ((arg1 & 0xFF989D) >> 16) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        double var11 = 0.0D;
        double var13 = 0.0D;
        if (var5 > var3) {
            var9 = var3;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var15 = var5;
        if (var3 > var5) {
            var15 = var3;
        }
        if (var7 > var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var5 == var15) {
                var11 = (var3 - var7) / (var15 - var9);
            } else if (var3 == var15) {
                var11 = (var7 - var5) / (var15 - var9) + 2.0D;
            } else if (var7 == var15) {
                var11 = (var5 - var3) / (var15 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field544 = (int) (var13 * 256.0D);
        if (this.field544 < 0) {
            this.field544 = 0;
        } else if (this.field544 > 255) {
            this.field544 = 255;
        }
        double var19 = var11 / 6.0D;
        this.field534 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field543 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field543 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field534 < 0) {
            this.field534 = 0;
        } else if (this.field534 > 255) {
            this.field534 = 255;
        }
        if (this.field543 < 1) {
            this.field543 = 1;
        }
        this.field536 = (int) ((double) this.field543 * var19);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLql;II)V")
    private final void method235(byte arg0, class224 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field542 = arg1.method1454(-106);
            this.method234(-125, this.field542);
        } else if (arg2 == 2) {
            this.field545 = arg1.method1445(false);
            if (this.field545 == 65535) {
                this.field545 = -1;
            }
        } else if (arg2 == 3) {
            arg1.method1445(false);
        }
        field539++;
        int var5 = 58 / ((39 - arg0) / 41);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method236(byte arg0) {
        if (arg0 == -126) {
            field535 = null;
            field538 = null;
            field546 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILql;)V")
    public final void method237(int arg0, int arg1, class224 arg2) {
        field547++;
        int var4 = 94 / ((-arg0 - 2) / 49);
        while (true) {
            int var5 = arg2.method1453((byte) -128);
            if (var5 == 0) {
                return;
            }
            this.method235((byte) 80, arg2, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
    public static final void method238(int arg0, int arg1, int arg2) {
        class280 var3 = class181.method1180(arg0, 0, 6);
        if (arg2 <= -79) {
            var3.method1876(1840457248);
            field551++;
            var3.field4330 = arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public static final void method239(int arg0, int arg1) {
        field541++;
        if (arg1 != 1936963112) {
            field550 = -31;
        }
        class193.field2657.method536(arg1 ^ 0x8C8C49B2, arg0);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field546[var0] = var1;
        }
    }
}
