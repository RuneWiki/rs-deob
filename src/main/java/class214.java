import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class214 {

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    private int field2642 = 0;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
    public boolean field2644 = true;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public int field2643 = 128;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public int field2648 = -1;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2639 = -1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "Lwo;")
    public static class285 field2647;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Z")
    public static boolean field2645;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 6)
    public static void method1310(byte arg0) {
        if (arg0 >= -88) {
            field2641 = 14;
        }
        field2647 = null;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V", line = 18)
    public static final void method1311(byte arg0) {
        if (arg0 != 121) {
            field2641 = 127;
        }
        class157.field1828.method2290(13831);
        field2638++;
        class373.field5051.method2290(13831);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILbg;I)V", line = 39)
    private final void method1312(int arg0, int arg1, class242 arg2, int arg3) {
        if (arg3 != -5) {
            this.method1314(false, 20);
        }
        if (arg1 == 1) {
            this.field2642 = arg2.method1545(8);
            this.method1314(true, this.field2642);
        } else if (arg1 == 2) {
            this.field2648 = arg2.method1587((byte) -102);
            if (this.field2648 == 65535) {
                this.field2648 = -1;
            }
        } else if (arg1 == 3) {
            this.field2643 = arg2.method1587((byte) -102);
        } else if (arg1 == 4) {
            this.field2644 = false;
        }
        field2636++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILbg;)V", line = 93)
    public final void method1313(int arg0, int arg1, class242 arg2) {
        while (true) {
            int var4 = arg2.method1563(-128);
            if (var4 == 0) {
                field2637++;
                if (arg0 != 867) {
                    this.method1312(-11, 96, (class242) null, 91);
                    return;
                }
                return;
            }
            this.method1312(arg1, var4, arg2, -5);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)V", line = 113)
    private final void method1314(boolean arg0, int arg1) {
        field2646++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
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
        this.field2651 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2650 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field2640 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2640 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2650 < 0) {
            this.field2650 = 0;
        } else if (this.field2650 > 255) {
            this.field2650 = 255;
        }
        if (this.field2651 < 0) {
            this.field2651 = 0;
        } else if (this.field2651 > 255) {
            this.field2651 = 255;
        }
        if (!arg0) {
            method1310((byte) 73);
        }
        if (this.field2640 < 1) {
            this.field2640 = 1;
        }
        this.field2649 = (int) ((double) this.field2640 * var19);
    }
}
