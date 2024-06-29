import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class272 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    private int field4845 = 0;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    private int field4855 = -1;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lvh;")
    public static class43 field4856 = null;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field4850;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field4851;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "[[[I")
    public static int[][][] field4858;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field4856 = null;
        if (arg0 != -1) {
            method1798(-89, -63, -94);
        }
        field4858 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILh;I)V")
    public final void method1795(int arg0, class190 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1265(arg0 - 129);
            if (var4 == 0) {
                if (arg0 != 256) {
                    return;
                }
                field4847++;
                return;
            }
            this.method1797(arg1, var4, arg2, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    private final void method1796(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field4849++;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var11 = var3;
        double var13 = (double) arg1;
        double var15 = 0.0D;
        if (var3 < var9) {
            var11 = var9;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        if (var9 < var3) {
            var7 = var9;
        }
        if (var5 < var7) {
            var7 = var5;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var15 = (var9 - var5) / (var11 - var7);
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (var11 - var7) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var9) / (var11 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field4850 = (int) (var13 * 256.0D);
        if (this.field4850 < 0) {
            this.field4850 = 0;
        } else if (this.field4850 > 255) {
            this.field4850 = 255;
        }
        this.field4853 = (int) (var17 * 256.0D);
        double var19 = var15 / 6.0D;
        if (this.field4853 < 0) {
            this.field4853 = 0;
        } else if (this.field4853 > 255) {
            this.field4853 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field4851 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field4851 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field4851 < 1) {
            this.field4851 = 1;
        }
        this.field4852 = (int) ((double) this.field4851 * var19);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lh;IIB)V")
    private final void method1797(class190 arg0, int arg1, int arg2, byte arg3) {
        field4848++;
        if (arg1 == 1) {
            this.field4845 = arg0.method1282(123);
            this.method1796(this.field4845, 0);
        } else if (arg1 == 2) {
            this.field4855 = arg0.method1275(128);
            if (this.field4855 == 65535) {
                this.field4855 = -1;
            }
        } else if (arg1 == 3) {
            arg0.method1275(128);
        }
        if (arg3 < 46) {
            this.field4852 = -67;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Lqg;")
    public static final class211 method1798(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2134; var4++) {
            class211 var5 = var3.field2144[var4];
            if ((var5.field3928 >> 29 & 0x3L) == 2L && var5.field3931 == arg1 && var5.field3919 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ldl;I)I")
    public static final int method1799(class32 arg0, int arg1) {
        if (arg1 != 29875) {
            field4858 = null;
        }
        field4846++;
        int var2 = arg0.field542;
        if (arg0.field4137 == arg0.field4133) {
            var2 = arg0.field534;
        } else if (arg0.field4171 == arg0.field4133) {
            var2 = arg0.field522;
        }
        return var2;
    }
}
