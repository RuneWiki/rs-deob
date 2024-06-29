import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class361 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    private int field5466 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public int field5472 = -1;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public int field5475 = 128;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Z")
    public boolean field5479 = true;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "S")
    public static short field5468 = 256;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[[Z")
    public static boolean[][] field5474 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field5476 = -1;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "F")
    public static float field5467;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public int field5478;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field5480;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 6)
    private final void method2268(int arg0, int arg1) {
        field5471++;
        double var3 = (double) (arg1 >> 16 & arg0) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
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
        this.field5473 = (int) (var17 * 256.0D);
        this.field5480 = (int) (var15 * 256.0D);
        if (this.field5480 < 0) {
            this.field5480 = 0;
        } else if (this.field5480 > 255) {
            this.field5480 = 255;
        }
        if (this.field5473 < 0) {
            this.field5473 = 0;
        } else if (this.field5473 > 255) {
            this.field5473 = 255;
        }
        if (var17 > 0.5D) {
            this.field5470 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5470 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5470 < 1) {
            this.field5470 = 1;
        }
        this.field5478 = (int) ((double) this.field5470 * var19);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lcu;I)V", line = 95)
    public final void method2269(class145 arg0, int arg1) {
        if (arg1 >= -106) {
            this.method2271(89, 101, null);
        }
        while (true) {
            int var3 = arg0.method1063((byte) -97);
            if (var3 == 0) {
                field5477++;
                return;
            }
            this.method2271(var3, 4, arg0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 118)
    public static void method2270(int arg0) {
        field5474 = null;
        if (arg0 != -1) {
            method2270(-12);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILcu;)V", line = 155)
    private final void method2271(int arg0, int arg1, class145 arg2) {
        if (arg1 != 4) {
            this.method2269(null, -108);
        }
        if (arg0 == 1) {
            this.field5466 = arg2.method1085(127);
            this.method2268(255, this.field5466);
        } else if (arg0 == 2) {
            this.field5472 = arg2.method1069((byte) -25);
            if (this.field5472 == 65535) {
                this.field5472 = -1;
            }
        } else if (arg0 == 3) {
            this.field5475 = arg2.method1069((byte) -111) << 0;
        } else if (arg0 == 4) {
            this.field5479 = false;
        }
        field5469++;
    }
}
