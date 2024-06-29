import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class48 {

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Z")
    public boolean field669 = true;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "Z")
    public boolean field673 = true;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    private int field668 = 0;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public int field680 = -1;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public int field682 = 512;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "Lsj;")
    public static class668 field671;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(FB)F")
    public static final float method302(float arg0, byte arg1) {
        int var2 = 83 / ((-arg1 - 67) / 52);
        field677++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method303(int arg0) {
        field671 = null;
        if (arg0 != 4833) {
            method305(false, true, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILes;I)V")
    private final void method304(int arg0, class630 arg1, int arg2) {
        field681++;
        if (arg2 != 65289) {
            return;
        }
        if (arg0 == 1) {
            this.field668 = arg1.method3517(-1);
            this.method306(arg2 ^ 0xFFF6, this.field668);
        } else if (arg0 == 2) {
            this.field680 = arg1.method3470(arg2 - 52178);
            if (this.field680 != 65535) {
                return;
            }
            this.field680 = -1;
        } else if (arg0 == 3) {
            this.field682 = arg1.method3470(13111) << 2;
            return;
        } else if (arg0 == 4) {
            this.field669 = false;
            return;
        } else if (arg0 == 5) {
            this.field673 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZZB)V")
    public static final void method305(boolean arg0, boolean arg1, byte arg2) {
        field679++;
        if (arg0) {
            class294.field3640++;
            class356.method1951(true);
        }
        if (arg2 != 88) {
            field671 = null;
        }
        if (arg1) {
            class473.field6008++;
            class593.method3259(73);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V")
    private final void method306(int arg0, int arg1) {
        field675++;
        double var3 = (double) ((arg1 & 0xFFE825) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF09) >> 8) / 256.0D;
        double var7 = (double) (arg0 & arg1) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
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
        this.field676 = (int) (var17 * 256.0D);
        this.field678 = (int) (var15 * 256.0D);
        if (this.field676 < 0) {
            this.field676 = 0;
        } else if (this.field676 > 255) {
            this.field676 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field674 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field674 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field678 < 0) {
            this.field678 = 0;
        } else if (this.field678 > 255) {
            this.field678 = 255;
        }
        if (this.field674 < 1) {
            this.field674 = 1;
        }
        this.field670 = (int) ((double) this.field674 * var19);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Les;I)V")
    public final void method307(class630 arg0, int arg1) {
        if (arg1 <= 15) {
            this.method304(27, null, -126);
        }
        field672++;
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method304(var3, arg0, 65289);
        }
    }
}
