import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 extends class29 {

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    private int field2272 = 0;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lwb;")
    public static class130 field2266 = class26.method212("Bitte benutzen Sie eine andere Welt)3", -32376);

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "[[I")
    public static int[][] field2278 = new int[104][104];

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lwb;")
    public static class130 field2282 = class26.method212("m-Ochte mit Ihnen handeln)3", -32376);

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "[Lwb;")
    public static class130[] field2264 = new class130[100];

    @OriginalMember(owner = "client!pd", name = "wb", descriptor = "Lwb;")
    public static class130 field2287 = class26.method212("backleft1", -32376);

    @OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
    public static int field2286 = 20;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lwb;")
    private static class130 field2271 = class26.method212(" more options", -32376);

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lwb;")
    public static class130 field2275 = class26.method212("@or2@", -32376);

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lwb;")
    public static class130 field2273 = field2271;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lwb;")
    private static class130 field2270 = class26.method212("Loaded gamescreen", -32376);

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "Lwb;")
    public static class130 field2284 = field2270;

    @OriginalMember(owner = "client!pd", name = "zb", descriptor = "Lwb;")
    private static class130 field2290 = class26.method212("Loading config )2 ", -32376);

    @OriginalMember(owner = "client!pd", name = "xb", descriptor = "Lwb;")
    public static class130 field2288 = field2290;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "Lwb;")
    public static class130 field2263 = class26.method212(":0", -32376);

    @OriginalMember(owner = "client!pd", name = "yb", descriptor = "Lwb;")
    public static class130 field2289 = class26.method212("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -32376);

    @OriginalMember(owner = "client!pd", name = "Bb", descriptor = "Z")
    public static boolean field2292 = false;

    @OriginalMember(owner = "client!pd", name = "Cb", descriptor = "Lwb;")
    private static class130 field2293 = class26.method212("Press (Wrecover a locked account(W on front page)3", -32376);

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lwb;")
    public static class130 field2268 = field2293;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pd", name = "Ab", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!pd", name = "Db", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 7)
    public final void method700(boolean arg0) {
        if (!arg0) {
            field2288 = null;
        }
        this.method703(113, this.field2272);
        field2274++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILmc;Lb;B)V", line = 25)
    public static final void method701(int arg0, class75 arg1, class7 arg2, byte arg3) {
        field2294++;
        class37 var4 = new class37();
        var4.field1088 = arg1;
        var4.field1081 = arg2;
        var4.field2329 = arg0;
        if (arg3 != 93) {
            field2273 = null;
        }
        var4.field1092 = 1;
        class108 var5 = class71.field1800;
        synchronized (class71.field1800) {
            class71.field1800.method819(var4, arg3 ^ 0xFFFFFFF3);
        }
        class115.method879(false);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfe;BI)V", line = 53)
    public final void method702(class36 arg0, byte arg1, int arg2) {
        field2277++;
        if (arg1 <= 8) {
            this.method703(3, -76);
        }
        while (true) {
            int var4 = arg0.method365((byte) -125);
            if (var4 == 0) {
                return;
            }
            this.method705(arg0, var4, 4851, arg2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 81)
    private final void method703(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        field2279++;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var5 > var3) {
            var9 = var3;
        }
        double var11 = var5;
        double var13 = 0.0D;
        int var15 = 73 / ((-arg0 - 39) / 36);
        if (var7 < var9) {
            var9 = var7;
        }
        if (var3 > var5) {
            var11 = var3;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var16 = 0.0D;
        double var18 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (-var9 + var11) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var16 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var20 = var13 / 6.0D;
        if (var18 > 0.5D) {
            this.field2265 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field2265 = (int) (var16 * var18 * 512.0D);
        }
        this.field2280 = (int) (var18 * 256.0D);
        if (this.field2280 < 0) {
            this.field2280 = 0;
        } else if (this.field2280 > 255) {
            this.field2280 = 255;
        }
        this.field2291 = (int) (var16 * 256.0D);
        if (this.field2291 < 0) {
            this.field2291 = 0;
        } else if (this.field2291 > 255) {
            this.field2291 = 255;
        }
        if (this.field2265 < 1) {
            this.field2265 = 1;
        }
        this.field2283 = (int) ((double) this.field2265 * var20);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I", line = 192)
    public static final int method704(int arg0, int arg1, int arg2) {
        field2269++;
        long var3 = (long) ((arg2 << 16) + arg0);
        if (class14.field405 != null && class14.field405.field2329 == var3) {
            if (arg1 != 0) {
                method706(65);
            }
            return class109.field2644.field1057 * 99 / (class109.field2644.field1067.length - class14.field405.field2386) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfe;III)V", line = 214)
    private final void method705(class36 arg0, int arg1, int arg2, int arg3) {
        field2276++;
        if (arg2 != 4851) {
            field2292 = true;
        }
        if (arg1 == 1) {
            this.field2272 = arg0.method343((byte) 5);
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 254)
    public static void method706(int arg0) {
        field2268 = null;
        field2287 = null;
        field2270 = null;
        field2273 = null;
        field2289 = null;
        field2275 = null;
        field2271 = null;
        if (arg0 != 255) {
            field2275 = null;
        }
        field2264 = null;
        field2282 = null;
        field2284 = null;
        field2278 = null;
        field2293 = null;
        field2263 = null;
        field2288 = null;
        field2266 = null;
        field2290 = null;
    }
}
