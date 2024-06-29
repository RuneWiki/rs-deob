import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class110 {

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    private int field568 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lmb;")
    private static class84 field549 = class79.method672(true, "Service unavailable)3");

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "Lmb;")
    private static class84 field555 = class79.method672(true, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "Lmb;")
    public static class84 field562 = field555;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Z")
    public static volatile boolean field572 = true;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "Lmb;")
    public static class84 field566 = class79.method672(true, "@cr2@");

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Lmb;")
    private static class84 field551 = class79.method672(true, "cyan:");

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Lmb;")
    public static class84 field553 = field549;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "Lmb;")
    public static class84 field554 = field551;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field563 = -1;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "Lmb;")
    public static class84 field577 = class79.method672(true, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "Lsa;")
    public static class119 field564 = new class119(100);

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "Lmb;")
    public static class84 field578 = class79.method672(true, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "Lca;")
    public static class16 field580 = new class16();

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "Ls;")
    public static class118 field571;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "Lsc;")
    public static class121 field581;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lsd;")
    public static class122 field558;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "Lhe;")
    public static class54 field573;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "[[Lia;")
    public static class57[][] field557;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lhb;III)V")
    private final void method163(class51 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 16652) {
            field559++;
            if (arg1 == 1) {
                this.field568 = arg0.method374((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    private final void method164(int arg0, int arg1) {
        field574++;
        double var3 = (double) ((arg0 & 0xFF61) >> arg1) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        if (var3 < var5) {
            var7 = var3;
        }
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var5;
        if (var5 < var3) {
            var15 = var3;
        }
        if (var15 < var9) {
            var15 = var9;
        }
        double var17 = (var7 + var15) / 2.0D;
        this.field575 = (int) (var17 * 256.0D);
        if (var7 != var15) {
            if (var5 == var15) {
                var11 = (var3 - var9) / (var15 - var7);
            } else if (var3 == var15) {
                var11 = (var9 - var5) / (var15 - var7) + 2.0D;
            } else if (var9 == var15) {
                var11 = (var5 - var3) / (var15 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var7) / (var7 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var7) / (2.0D - var15 - var7);
            }
        }
        this.field570 = (int) (var13 * 256.0D);
        if (this.field575 < 0) {
            this.field575 = 0;
        } else if (this.field575 > 255) {
            this.field575 = 255;
        }
        if (this.field570 < 0) {
            this.field570 = 0;
        } else if (this.field570 > 255) {
            this.field570 = 255;
        }
        if (var17 > 0.5D) {
            this.field552 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field552 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field552 < 1) {
            this.field552 = 1;
        }
        double var19 = var11 / 6.0D;
        this.field548 = (int) ((double) this.field552 * var19);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public final void method165(int arg0) {
        field561++;
        this.method164(this.field568, arg0 - 3034869);
        if (arg0 != -6467) {
            this.method164(-34, -25);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)I")
    public static int method166(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BILhb;)V")
    public final void method167(byte arg0, int arg1, class51 arg2) {
        if (arg0 != -110) {
            field549 = null;
        }
        field576++;
        while (true) {
            int var4 = arg2.method373(25094);
            if (var4 == 0) {
                return;
            }
            this.method163(arg2, var4, arg1, arg0 ^ 0xFFFFBE9E);
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static void method168(int arg0) {
        field581 = null;
        field571 = null;
        field557 = null;
        field573 = null;
        field558 = null;
        field553 = null;
        field555 = null;
        field551 = null;
        field578 = null;
        field562 = null;
        field580 = null;
        field549 = null;
        field566 = null;
        field554 = null;
        field564 = null;
        field577 = null;
        if (arg0 != -27079) {
            method168(125);
        }
    }
}
