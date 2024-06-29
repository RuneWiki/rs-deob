import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class548 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field7725 = 512;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field7726 = -1;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    private int field7730 = 0;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Z")
    public boolean field7735 = true;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Z")
    public boolean field7736 = true;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public int field7728;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field7733;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field7734;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lji;ZI)V")
    private final void method3103(class611 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field7730 = arg0.method3385(-126);
            this.method3105(0, this.field7730);
        } else if (arg2 == 2) {
            this.field7726 = arg0.method3402((byte) 127);
            if (this.field7726 == 65535) {
                this.field7726 = -1;
            }
        } else if (arg2 == 3) {
            this.field7725 = arg0.method3402((byte) 127) << 2;
        } else if (arg2 == 4) {
            this.field7736 = false;
        } else if (arg2 == 5) {
            this.field7735 = false;
        }
        if (!arg1) {
            this.field7725 = -118;
        }
        field7732++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lji;I)V")
    public final void method3104(class611 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3428((byte) 40);
            if (var3 == 0) {
                if (arg1 > -25) {
                    this.field7730 = 39;
                }
                field7729++;
                return;
            }
            this.method3103(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
    private final void method3105(int arg0, int arg1) {
        field7727++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF10) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
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
        this.field7734 = (int) (var17 * 256.0D);
        this.field7733 = (int) (var15 * 256.0D);
        if (this.field7734 < 0) {
            this.field7734 = 0;
        } else if (this.field7734 > 255) {
            this.field7734 = 255;
        }
        if (arg0 > this.field7733) {
            this.field7733 = 0;
        } else if (this.field7733 > 255) {
            this.field7733 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field7731 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7731 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7731 < 1) {
            this.field7731 = 1;
        }
        this.field7728 = (int) ((double) this.field7731 * var19);
    }
}
