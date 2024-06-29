import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class263 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    public boolean field3424 = true;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    private int field3425 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field3433 = 512;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Z")
    public boolean field3432 = true;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public int field3431 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static final void method1584(boolean arg0) {
        if (arg0) {
            method1584(true);
        }
        field3430++;
        int var1 = 0;
        if (class602.field8408 != null) {
            var1 = class602.field8408.method3561(false, class618.field8566);
        }
        if (var1 == 2) {
            int var2 = class455.field5994 > 800 ? 800 : class455.field5994;
            class399.field5301 = var2;
            int var3 = class246.field3213 > 600 ? 600 : class246.field3213;
            class646.field8936 = (class455.field5994 - var2) / 2;
            class628.field8692 = 0;
            class60.field750 = var3;
        } else if (var1 == 1) {
            int var4 = class455.field5994 <= 1024 ? class455.field5994 : 1024;
            int var5 = class246.field3213 > 768 ? 768 : class246.field3213;
            class646.field8936 = (class455.field5994 - var4) / 2;
            class399.field5301 = var4;
            class628.field8692 = 0;
            class60.field750 = var5;
        } else {
            class399.field5301 = class455.field5994;
            class628.field8692 = 0;
            class60.field750 = class246.field3213;
            class646.field8936 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lio;II)V")
    private final void method1585(class157 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field3424 = false;
        }
        field3427++;
        if (arg2 == 1) {
            this.field3425 = arg0.method933((byte) 1);
            this.method1586(256, this.field3425);
        } else if (arg2 == 2) {
            this.field3431 = arg0.method963(-124);
            if (this.field3431 == 65535) {
                this.field3431 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field3433 = arg0.method963(arg1 ^ 0xFFFFFF8A) << 2;
        } else {
            if (arg2 == 4) {
                this.field3432 = false;
            } else if (arg2 == 5) {
                this.field3424 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    private final void method1586(int arg0, int arg1) {
        field3434++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF79) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field3423 = (int) ((double) arg0 * var15);
        this.field3435 = (int) (var17 * 256.0D);
        if (this.field3423 < 0) {
            this.field3423 = 0;
        } else if (this.field3423 > 255) {
            this.field3423 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3426 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3426 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3435 < 0) {
            this.field3435 = 0;
        } else if (this.field3435 > 255) {
            this.field3435 = 255;
        }
        if (this.field3426 < 1) {
            this.field3426 = 1;
        }
        this.field3428 = (int) ((double) this.field3426 * var19);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lio;I)V")
    public final void method1587(class157 arg0, int arg1) {
        field3429++;
        if (arg1 != -12807) {
            this.field3425 = 32;
        }
        while (true) {
            int var3 = arg0.method930(arg1 + 13062);
            if (var3 == 0) {
                return;
            }
            this.method1585(arg0, arg1 + 12807, var3);
        }
    }
}
