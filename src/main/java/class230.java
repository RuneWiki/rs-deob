import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class230 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field3554 = 0;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    private int field3549 = -1;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3551 = null;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3559 = "shake:";

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lsd;")
    public static class26 field3560;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[I")
    public static int[] field3552;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1616(int arg0) {
        field3559 = null;
        field3552 = null;
        field3551 = null;
        if (arg0 == 24470) {
            field3560 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLim;)V")
    public final void method1617(int arg0, boolean arg1, class170 arg2) {
        field3561++;
        if (arg1) {
            this.method1619(-80, (class170) null, -90, 24);
        }
        while (true) {
            int var4 = arg2.method1218(75);
            if (var4 == 0) {
                return;
            }
            this.method1619(-123, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
    private final void method1618(int arg0, byte arg1) {
        field3557++;
        double var3 = (double) ((arg0 & 0xFF9A4B) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        if (arg1 > -8) {
            this.method1619(118, (class170) null, 96, -43);
        }
        double var13 = 0.0D;
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        this.field3562 = (int) (var15 * 256.0D);
        if (var9 != var11) {
            if (var15 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var17 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var17 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var17 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var15 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var17 / 6.0D;
        if (this.field3562 < 0) {
            this.field3562 = 0;
        } else if (this.field3562 > 255) {
            this.field3562 = 255;
        }
        this.field3550 = (int) (var13 * 256.0D);
        if (this.field3550 < 0) {
            this.field3550 = 0;
        } else if (this.field3550 > 255) {
            this.field3550 = 255;
        }
        if ((var15 > 0.5D)) {
            this.field3556 = (int) ((1.0D - var15) * var13 * 512.0D);
        } else {
            this.field3556 = (int) (var13 * var15 * 512.0D);
        }
        if (this.field3556 < 1) {
            this.field3556 = 1;
        }
        this.field3558 = (int) ((double) this.field3556 * var19);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILim;II)V")
    private final void method1619(int arg0, class170 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field3554 = arg1.method1212(460736848);
            this.method1618(this.field3554, (byte) -107);
        } else if (arg2 == 2) {
            this.field3549 = arg1.method1186((byte) -36);
            if (this.field3549 == 65535) {
                this.field3549 = -1;
            }
        } else if (arg2 == 3) {
            arg1.method1186((byte) -112);
        }
        field3555++;
        if (arg0 >= -95) {
            this.method1619(-8, (class170) null, 67, 73);
        }
    }
}
