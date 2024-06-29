import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class324 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field5528 = 128;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    private int field5538 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
    public boolean field5531 = true;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field5539 = -1;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lph;")
    public static class229 field5530 = class266.method1858(" loggt sich aus)3", 0);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lfe;")
    public static class97 field5529 = new class97(512);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field5540 = 0;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lph;")
    private static class229 field5546 = class266.method1858("Drop", 0);

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lph;")
    public static class229 field5542 = field5546;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field5526;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field5532;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field5536;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[[[Lkk;")
    public static class72[][][] field5533;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 21)
    public static void method2220(boolean arg0) {
        field5533 = (class72[][][]) null;
        field5530 = null;
        field5542 = null;
        if (arg0) {
            field5546 = null;
            field5529 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILhb;I)V", line = 38)
    public final void method2221(int arg0, class164 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1178(8);
            if (var4 == 0) {
                field5537++;
                if (arg2 != 0) {
                    this.method2221(-115, (class164) null, 61);
                }
                return;
            }
            this.method2222(arg1, arg0, 28405, var4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lhb;III)V", line = 68)
    private final void method2222(class164 arg0, int arg1, int arg2, int arg3) {
        field5545++;
        if (arg2 != 28405) {
            return;
        }
        if (arg3 == 1) {
            this.field5538 = arg0.method1176(1048115912);
            this.method2223(this.field5538, true);
        } else if (arg3 == 2) {
            this.field5539 = arg0.method1161(true);
            if (this.field5539 == 65535) {
                this.field5539 = -1;
            }
        } else if (arg3 == 3) {
            this.field5528 = arg0.method1161(true);
        } else if (arg3 == 4) {
            this.field5531 = false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V", line = 117)
    private final void method2223(int arg0, boolean arg1) {
        double var3 = (double) ((arg0 & 0xFFD932) >> 16) / 256.0D;
        field5535++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        double var11 = 0.0D;
        if (!arg1) {
            field5544 = -82;
        }
        double var13 = 0.0D;
        double var15 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var5 > var3) {
            var15 = var5;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        if (var15 < var9) {
            var15 = var9;
        }
        double var17 = (var7 + var15) / 2.0D;
        if (var7 != var15) {
            if (var17 < 0.5D) {
                var13 = (var15 - var7) / (var7 + var15);
            }
            if (var3 == var15) {
                var11 = (var5 - var9) / (var15 - var7);
            } else if (var5 == var15) {
                var11 = (var9 - var3) / (var15 - var7) + 2.0D;
            } else if (var9 == var15) {
                var11 = (var3 - var5) / (var15 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var7) / (2.0D - var15 - var7);
            }
        }
        double var19 = var11 / 6.0D;
        this.field5541 = (int) (var13 * 256.0D);
        if (this.field5541 < 0) {
            this.field5541 = 0;
        } else if (this.field5541 > 255) {
            this.field5541 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field5536 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field5536 = (int) (var13 * var17 * 512.0D);
        }
        this.field5532 = (int) (var17 * 256.0D);
        if (this.field5532 < 0) {
            this.field5532 = 0;
        } else if (this.field5532 > 255) {
            this.field5532 = 255;
        }
        if (this.field5536 < 1) {
            this.field5536 = 1;
        }
        this.field5526 = (int) ((double) this.field5536 * var19);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 221)
    public static final void method2224(int arg0) {
        if (arg0 != 255) {
            method2224(-119);
        }
        field5527++;
        class285.method1964(arg0 - 128, 0, 0);
    }
}
