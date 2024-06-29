import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class211 {

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "[F")
    public float[] field3445 = new float[4];

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Z")
    public boolean field3432;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Z")
    public boolean field3460;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public int field3443;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "[S")
    public short[] field3459;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Ltl;")
    public static class59 field3436 = class85.method639("Fertigkeit: ", 9588);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[Lch;")
    public static class102[] field3438 = new class102[2048];

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lma;")
    public static class263 field3435 = null;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Z")
    public static boolean field3450 = true;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field3454 = -1;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
    public static int[] field3434 = new int[5];

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Ltl;")
    public static class59 field3437 = class85.method639("Texturen geladen)3", 9588);

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Ltl;")
    public static class59 field3464 = null;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "F")
    public float field3440;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "F")
    public float field3452;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Lam;")
    public class136 field3457;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIZ)V", line = 12)
    public final void method1477(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        int var4 = this.field3449 + (this.field3446 * arg1 / 50) & 0x7FF;
        field3442++;
        int var5 = this.field3444;
        int var6;
        if (var5 == 1) {
            var6 = (class298.field5095[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class143.field2363[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field3440 = (float) ((this.field3463 * var6 >> 11) + this.field3458) / 2048.0F;
        float var7 = this.field3440 / 255.0F;
        this.field3445[2] = var7 * (float) class93.method680(255, this.field3455);
        this.field3445[1] = var7 * (float) (class93.method680(65391, this.field3455) >> 8);
        this.field3445[0] = (float) (class93.method680(this.field3455, 16771072) >> 16) * var7;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 90)
    public static final void method1478(int arg0) {
        if (arg0 != -1736199583) {
            field3439 = 108;
        }
        class284.field4885 = new class64();
        field3462++;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 393)
    protected class211() {
        if (class143.field2363 == null) {
            class233.method1624(27339);
        }
        this.method1479(66);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ls;)V", line = 404)
    public class211(class170 arg0) {
        if (class143.field2363 == null) {
            class233.method1624(27339);
        }
        this.field3447 = arg0.method1221(94);
        this.field3432 = (this.field3447 & 0x8) != 0;
        this.field3460 = (this.field3447 & 0x10) != 0;
        this.field3447 &= 0x7;
        this.field3443 = arg0.method1214(-18254);
        this.field3441 = arg0.method1214(-18254);
        this.field3461 = arg0.method1214(-18254);
        this.field3433 = arg0.method1221(79);
        this.method1480(1);
        this.field3459 = new short[this.field3433 * 2 + 1];
        for (int var2 = 0; var2 < this.field3459.length; var2++) {
            this.field3459[var2] = (short) arg0.method1214(-18254);
        }
        this.field3455 = class298.field5102[arg0.method1214(-18254)];
        int var3 = arg0.method1221(118);
        this.field3449 = (var3 & 0xE0) << 3;
        this.field3448 = var3 & 0x1F;
        this.method1479(45);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 187)
    private final void method1479(int arg0) {
        int var2 = this.field3448;
        if (var2 == 2) {
            this.field3463 = 2048;
            this.field3446 = 2048;
            this.field3458 = 0;
            this.field3444 = 1;
        } else if (var2 == 3) {
            this.field3458 = 0;
            this.field3463 = 2048;
            this.field3444 = 1;
            this.field3446 = 4096;
        } else if (var2 == 4) {
            this.field3444 = 4;
            this.field3446 = 2048;
            this.field3463 = 2048;
            this.field3458 = 0;
        } else if (var2 == 5) {
            this.field3444 = 4;
            this.field3458 = 0;
            this.field3446 = 8192;
            this.field3463 = 2048;
        } else if (var2 == 12) {
            this.field3444 = 2;
            this.field3463 = 2048;
            this.field3446 = 2048;
            this.field3458 = 0;
        } else if (var2 == 13) {
            this.field3444 = 2;
            this.field3458 = 0;
            this.field3446 = 8192;
            this.field3463 = 2048;
        } else if (var2 == 10) {
            this.field3444 = 3;
            this.field3458 = 1536;
            this.field3463 = 512;
            this.field3446 = 2048;
        } else if (var2 == 11) {
            this.field3444 = 3;
            this.field3463 = 512;
            this.field3446 = 4096;
            this.field3458 = 1536;
        } else if (var2 == 6) {
            this.field3444 = 3;
            this.field3458 = 1280;
            this.field3463 = 768;
            this.field3446 = 2048;
        } else if (var2 == 7) {
            this.field3463 = 768;
            this.field3446 = 4096;
            this.field3458 = 1280;
            this.field3444 = 3;
        } else if (var2 == 8) {
            this.field3463 = 1024;
            this.field3446 = 2048;
            this.field3458 = 1024;
            this.field3444 = 3;
        } else if (var2 == 9) {
            this.field3446 = 4096;
            this.field3458 = 1024;
            this.field3444 = 3;
            this.field3463 = 1024;
        } else if (var2 == 14) {
            this.field3463 = 768;
            this.field3458 = 1280;
            this.field3446 = 2048;
            this.field3444 = 1;
        } else if (var2 == 15) {
            this.field3458 = 1536;
            this.field3446 = 4096;
            this.field3463 = 512;
            this.field3444 = 1;
        } else if (var2 == 16) {
            this.field3444 = 1;
            this.field3458 = 1792;
            this.field3463 = 256;
            this.field3446 = 8192;
        } else {
            this.field3446 = 2048;
            this.field3463 = 2048;
            this.field3458 = 0;
            this.field3444 = 0;
        }
        int var3 = -128 / ((arg0 + 54) / 57);
        field3451++;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 352)
    private final void method1480(int arg0) {
        field3453++;
        int var2 = (this.field3433 << 7) + 64;
        this.field3452 = 1.0F / (float) (var2 * var2);
        if (arg0 != 1) {
            method1481(true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 372)
    public static void method1481(boolean arg0) {
        field3436 = null;
        field3464 = null;
        if (!arg0) {
            field3434 = null;
            field3437 = null;
            field3438 = null;
            field3435 = null;
        }
    }
}
