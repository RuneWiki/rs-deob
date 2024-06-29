import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class196 {

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public int field3343 = 128;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private int field3339 = 0;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public int field3347 = -1;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
    public boolean field3346 = true;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lbe;")
    public static class283 field3338 = class153.method941(23, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field3344 = 2;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lbe;")
    public static class283 field3342 = class153.method941(20, "Art");

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lbe;")
    public static class283 field3341 = class237.method1583(160, 32722);

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field3351 = -1;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Lbe;")
    public static class283 field3352 = class153.method941(-95, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[Lkj;")
    public static class165[] field3355 = new class165[4];

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[I")
    public static int[] field3356 = new int[4096];

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Lek;")
    public static class172 field3354;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[[[Lrd;")
    public static class160[][][] field3336;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3356[var0] = class109.method726(true, var0);
        }
        field3357 = 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLfe;II)V", line = 37)
    private final void method1256(byte arg0, class229 arg1, int arg2, int arg3) {
        field3337++;
        if (arg2 == 1) {
            this.field3339 = arg1.method1551(110);
            this.method1259(-71, this.field3339);
        } else if (arg2 == 2) {
            this.field3347 = arg1.method1496(true);
            if (this.field3347 == 65535) {
                this.field3347 = -1;
            }
        } else if (arg2 == 3) {
            this.field3343 = arg1.method1496(true);
        } else if (arg2 == 4) {
            this.field3346 = false;
        }
        int var5 = -117 % ((-arg0 - 84) / 33);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)V", line = 77)
    public static final void method1257(int arg0, byte arg1, int arg2) {
        field3345++;
        if (class42.field589 < 2 && class222.field3727 == 0 && !class103.field1760) {
            return;
        }
        int var3 = 50 % ((arg1 + 17) / 53);
        class283 var4;
        if (class222.field3727 == 1 && class42.field589 < 2) {
            var4 = class299.method2022(new class283[] { class40.field562, class202.field3445, class222.field3745, class174.field2979 }, (byte) 115);
        } else if (class103.field1760 && class42.field589 < 2) {
            var4 = class299.method2022(new class283[] { class89.field1514, class202.field3445, class135.field2272, class174.field2979 }, (byte) 24);
        } else {
            var4 = class183.method1207(class42.field589 - 1, (byte) -42);
        }
        if (class42.field589 > 2) {
            var4 = class299.method2022(new class283[] { var4, class216.field3663, class296.method2012(class42.field589 - 2, (byte) 120), class99.field1687 }, (byte) 8);
        }
        int var5 = class240.field4056.method1646(var4, arg2 + 4, arg0 + 15, 16777215, 0, class163.field2692, class30.field466);
        class277.method1849(var5 + class240.field4056.method1656(var4), 1, arg2 + 4, arg0, 15);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lfe;II)V", line = 110)
    public final void method1258(class229 arg0, int arg1, int arg2) {
        if (arg1 != -22083) {
            method1260(12);
        }
        field3334++;
        while (true) {
            int var4 = arg0.method1535((byte) 81);
            if (var4 == 0) {
                return;
            }
            this.method1256((byte) -19, arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 130)
    private final void method1259(int arg0, int arg1) {
        field3348++;
        if (arg0 > -12) {
            method1261((class69) null, -22);
        }
        double var3 = (double) ((arg1 & 0xFFC69E) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 > var5) {
            var11 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        if (var9 < var7) {
            var9 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field3350 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        if (this.field3350 < 0) {
            this.field3350 = 0;
        } else if (this.field3350 > 255) {
            this.field3350 = 255;
        }
        if (var17 > 0.5D) {
            this.field3335 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3335 = (int) (var15 * var17 * 512.0D);
        }
        this.field3340 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3335 < 1) {
            this.field3335 = 1;
        }
        if (this.field3340 < 0) {
            this.field3340 = 0;
        } else if (this.field3340 > 255) {
            this.field3340 = 255;
        }
        this.field3349 = (int) ((double) this.field3335 * var19);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 233)
    public static void method1260(int arg0) {
        if (arg0 != 0) {
            field3341 = (class283) null;
        }
        field3342 = null;
        field3338 = null;
        field3352 = null;
        field3356 = null;
        field3341 = null;
        field3355 = null;
        field3336 = (class160[][][]) null;
        field3354 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lkg;I)Lkg;", line = 250)
    public static final class69 method1261(class69 arg0, int arg1) {
        field3353++;
        if (arg0.field1059 != -1) {
            return class65.method418(-8429, arg0.field1059);
        }
        int var2 = arg0.field1079 >>> 16;
        class81 var3 = new class81(class58.field805);
        class159 var4 = (class159) var3.method530(-10664);
        if (arg1 > -86) {
            method1257(108, (byte) 30, 90);
        }
        while (var4 != null) {
            if (var4.field2600 == var2) {
                return class65.method418(-8429, (int) var4.field1445);
            }
            var4 = (class159) var3.method527(-1);
        }
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z", line = 295)
    public static final boolean method1262(int arg0, int arg1, int arg2) {
        int var3 = class36.field530[arg0][arg1][arg2];
        if (-class109.field1838 == var3) {
            return false;
        } else if (class109.field1838 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class46.method267(var4 + 1, class65.field890[arg0][arg1][arg2], var5 + 1) && class46.method267(var4 + 128 - 1, class65.field890[arg0][arg1 + 1][arg2], var5 + 1) && class46.method267(var4 + 128 - 1, class65.field890[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class46.method267(var4 + 1, class65.field890[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class36.field530[arg0][arg1][arg2] = class109.field1838;
                return true;
            } else {
                class36.field530[arg0][arg1][arg2] = -class109.field1838;
                return false;
            }
        }
    }
}
