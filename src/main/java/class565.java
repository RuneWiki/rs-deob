import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class565 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
    public boolean field8108 = true;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Z")
    public boolean field8109 = true;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    private int field8117 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field8106 = -1;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public int field8120 = 512;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[Lmh;")
    public static class585[] field8115 = new class585[16];

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lmea;")
    public static class395 field8119 = new class395();

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lrl;")
    public static class672 field8121 = new class672(42, 3);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field8111;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public int field8113;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public int field8114;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field8116;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[S")
    public static short[] field8122;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lie;II)V")
    private final void method3345(class6 arg0, int arg1, int arg2) {
        int var4 = -32 / ((35 - arg2) / 54);
        if (arg1 == 1) {
            this.field8117 = arg0.method86(-121);
            this.method3348(-92, this.field8117);
        } else if (arg1 == 2) {
            this.field8106 = arg0.method67(12021);
            if (this.field8106 == 65535) {
                this.field8106 = -1;
            }
        } else if (arg1 == 3) {
            this.field8120 = arg0.method67(12021) << 2;
        } else if (arg1 == 4) {
            this.field8108 = false;
        } else if (arg1 == 5) {
            this.field8109 = false;
        }
        field8118++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z[IIILer;III)Lcea;")
    public static final class197 method3346(boolean arg0, int[] arg1, int arg2, int arg3, class92 arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -2) {
            method3346(true, null, -93, 96, null, 9, -26, -121);
        }
        field8107++;
        if (!arg4.field1376 && (!class416.method2649(arg3, true) || !class416.method2649(arg6, true))) {
            return arg4.field1428 ? new class197(arg4, 34037, arg3, arg6, arg0, arg1, arg2, arg7) : new class197(arg4, arg3, arg6, class413.method2636(arg3, 127), class413.method2636(arg6, 127), arg1);
        } else {
            return new class197(arg4, 3553, arg3, arg6, arg0, arg1, arg2, arg7);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILie;)V")
    public final void method3347(int arg0, class6 arg1) {
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field8110++;
                return;
            }
            this.method3345(arg1, var3, 96);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    private final void method3348(int arg0, int arg1) {
        field8112++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFC3) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        int var9 = 83 / ((arg0 - 58) / 40);
        double var10 = var3;
        if (var5 < var3) {
            var10 = var5;
        }
        if (var7 < var10) {
            var10 = var7;
        }
        double var12 = var3;
        if (var5 > var3) {
            var12 = var5;
        }
        if (var7 > var12) {
            var12 = var7;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
            if (var3 == var12) {
                var14 = (var5 - var7) / (var12 - var10);
            } else if (var5 == var12) {
                var14 = (var7 - var3) / (var12 - var10) + 2.0D;
            } else if (var7 == var12) {
                var14 = (var3 - var5) / (var12 - var10) + 4.0D;
            }
        }
        this.field8116 = (int) (var16 * 256.0D);
        this.field8114 = (int) (var18 * 256.0D);
        double var20 = var14 / 6.0D;
        if (var18 > 0.5D) {
            this.field8111 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field8111 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field8114 < 0) {
            this.field8114 = 0;
        } else if (this.field8114 > 255) {
            this.field8114 = 255;
        }
        if (this.field8116 < 0) {
            this.field8116 = 0;
        } else if (this.field8116 > 255) {
            this.field8116 = 255;
        }
        if (this.field8111 < 1) {
            this.field8111 = 1;
        }
        this.field8113 = (int) ((double) this.field8111 * var20);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method3349(int arg0) {
        if (arg0 != -30642) {
            method3349(-87);
        }
        field8115 = null;
        field8122 = null;
        field8121 = null;
        field8119 = null;
    }
}
