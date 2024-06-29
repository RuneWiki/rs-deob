import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class631 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field8007 = -1;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Z")
    public boolean field8004 = true;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    private int field8012 = 0;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field8013 = 512;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Z")
    public boolean field8005 = true;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field8001;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field8006;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field8008;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field8010;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z")
    public static final boolean method3367(boolean arg0) {
        field8002++;
        if (!arg0) {
            method3367(false);
        }
        if (class7.field72 == null) {
            return false;
        } else {
            if (class7.field72.field10412 >= 2000) {
                class7.field72.field10412 -= 2000;
            }
            return class7.field72.field10412 == 1012;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmc;II)V")
    private final void method3368(class234 arg0, int arg1, int arg2) {
        field8003++;
        if (arg2 == 1) {
            this.field8012 = arg0.method1500((byte) -69);
            this.method3370(-46, this.field8012);
        } else if (arg2 == 2) {
            this.field8007 = arg0.method1553((byte) 97);
            if (this.field8007 == 65535) {
                this.field8007 = -1;
            }
        } else if (arg2 == 3) {
            this.field8013 = arg0.method1553((byte) -123) << 2;
        } else if (arg2 == 4) {
            this.field8004 = false;
        } else if (arg2 == 5) {
            this.field8005 = false;
        }
        if (arg1 <= 7) {
            this.method3368(null, 88, 118);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmc;I)V")
    public final void method3369(class234 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                field8009++;
                if (arg1 > -23) {
                    this.method3369(null, -41);
                    return;
                }
                return;
            }
            this.method3368(arg0, 91, var3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    private final void method3370(int arg0, int arg1) {
        field8011++;
        double var3 = (double) ((arg1 & 0xFF8DBD) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (arg0 >= -38) {
            return;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field8008 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field8010 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field8006 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field8006 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field8010 < 0) {
            this.field8010 = 0;
        } else if (this.field8010 > 255) {
            this.field8010 = 255;
        }
        if (this.field8008 < 0) {
            this.field8008 = 0;
        } else if (this.field8008 > 255) {
            this.field8008 = 255;
        }
        if (this.field8006 < 1) {
            this.field8006 = 1;
        }
        this.field8001 = (int) ((double) this.field8006 * var19);
    }
}
