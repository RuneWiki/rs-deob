import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class467 {

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field6739 = -1;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    private int field6741 = 0;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Z")
    public boolean field6746 = true;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public int field6747 = 128;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[Laba;")
    public static class224[] field6736 = new class224[14];

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field6744 = -1;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field6748 = 0;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "[I")
    public static int[] field6743 = new int[8];

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public int field6738;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field6749;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public int field6750;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILps;)V")
    public final void method2765(int arg0, class428 arg1) {
        if (arg0 != -7095) {
            this.field6746 = false;
        }
        while (true) {
            int var3 = arg1.method2561((byte) 120);
            if (var3 == 0) {
                field6740++;
                return;
            }
            this.method2768(22187, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method2766(int arg0) {
        field6736 = null;
        field6743 = null;
        int var1 = 1 / ((arg0 - 29) / 35);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    private final void method2767(int arg0, int arg1) {
        field6742++;
        double var3 = (double) ((arg1 & 0xFF6D44) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
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
        this.field6738 = (int) (var17 * 256.0D);
        this.field6750 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field6738 < 0) {
            this.field6738 = 0;
        } else if (this.field6738 > 255) {
            this.field6738 = 255;
        }
        if (var17 > 0.5D) {
            this.field6745 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6745 = (int) (var15 * var17 * 512.0D);
        }
        if (arg0 > -30) {
            this.field6738 = -67;
        }
        if (this.field6750 < 0) {
            this.field6750 = 0;
        } else if (this.field6750 > 255) {
            this.field6750 = 255;
        }
        if (this.field6745 < 1) {
            this.field6745 = 1;
        }
        this.field6749 = (int) ((double) this.field6745 * var19);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILps;I)V")
    private final void method2768(int arg0, class428 arg1, int arg2) {
        field6737++;
        if (arg0 != 22187) {
            this.method2768(74, null, 10);
        }
        if (arg2 == 1) {
            this.field6741 = arg1.method2601(arg0 - 22094);
            this.method2767(-107, this.field6741);
        } else if (arg2 == 2) {
            this.field6739 = arg1.method2620(arg0 ^ 0x568A);
            if (this.field6739 == 65535) {
                this.field6739 = -1;
                return;
            }
            return;
        } else if (arg2 == 3) {
            this.field6747 = arg1.method2620(66) << 0;
            return;
        } else if (arg2 == 4) {
            this.field6746 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
    public static final void method2769(int arg0, int arg1) {
        field6751++;
        if (arg1 != -21766) {
            return;
        }
        class325 var2 = class161.field2155;
        synchronized (class161.field2155) {
            class161.field2155.method2028(arg0, true);
        }
        class325 var3 = class19.field173;
        synchronized (class19.field173) {
            class19.field173.method2028(arg0, true);
        }
    }
}
