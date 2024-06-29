import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class333 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public int field4112 = 512;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public int field4120 = -1;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    private int field4118 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
    public boolean field4121 = true;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Z")
    public boolean field4124 = true;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[Z")
    public static boolean[] field4125 = new boolean[8];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    public static int[] field4111 = new int[2];

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lhj;")
    public static class596 field4119 = new class596(133, 4);

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Llja;")
    public static class744 field4127 = new class744(49, -1);

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method1972(int arg0) {
        if (arg0 != 19413) {
            method1972(43);
        }
        field4119 = null;
        field4127 = null;
        field4111 = null;
        field4125 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLes;I)V")
    private final void method1973(byte arg0, class403 arg1, int arg2) {
        if (arg0 > -19) {
            this.field4112 = 110;
        }
        field4122++;
        if (arg2 == 1) {
            this.field4118 = arg1.method2358(62);
            this.method1975(true, this.field4118);
        } else if (arg2 == 2) {
            this.field4120 = arg1.method2390((byte) -112);
            if (this.field4120 == 65535) {
                this.field4120 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field4112 = arg1.method2390((byte) -106) << 2;
        } else if (arg2 == 4) {
            this.field4124 = false;
            return;
        } else if (arg2 == 5) {
            this.field4121 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLes;)V")
    public final void method1974(boolean arg0, class403 arg1) {
        field4117++;
        while (true) {
            int var3 = arg1.method2396((byte) 123);
            if (var3 == 0) {
                if (arg0) {
                    method1972(-126);
                    return;
                } else {
                    return;
                }
            }
            this.method1973((byte) -22, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
    private final void method1975(boolean arg0, int arg1) {
        field4116++;
        double var3 = (double) ((arg1 & 0xFF53D7) >> 16) / 256.0D;
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
        if (!arg0) {
            return;
        }
        this.field4126 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field4113 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field4123 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4123 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4113 < 0) {
            this.field4113 = 0;
        } else if (this.field4113 > 255) {
            this.field4113 = 255;
        }
        if (this.field4126 < 0) {
            this.field4126 = 0;
        } else if (this.field4126 > 255) {
            this.field4126 = 255;
        }
        if (this.field4123 < 1) {
            this.field4123 = 1;
        }
        this.field4114 = (int) ((double) this.field4123 * var19);
    }
}
