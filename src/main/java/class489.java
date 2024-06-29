import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class489 {

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public int field6858 = 128;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
    public boolean field6852 = true;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public int field6859 = -1;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    private int field6856 = 0;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "Z")
    public static boolean field6854 = false;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public int field6851;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public int field6861;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public int field6865;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
    public static int[] field6850;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[I")
    public static int[] field6853;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public static void method2852(boolean arg0) {
        if (arg0) {
            field6853 = null;
            field6850 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILre;)V")
    private final void method2853(int arg0, int arg1, class446 arg2) {
        int var4 = -18 / ((arg1 - 62) / 53);
        if (arg0 == 1) {
            this.field6856 = arg2.method2613(-25778);
            this.method2856(this.field6856, (byte) 114);
        } else if (arg0 == 2) {
            this.field6859 = arg2.method2631(2530);
            if (this.field6859 == 65535) {
                this.field6859 = -1;
            }
        } else if (arg0 == 3) {
            this.field6858 = arg2.method2631(2530);
        } else if (arg0 == 4) {
            this.field6852 = false;
        }
        field6862++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public static final void method2854(byte arg0) {
        field6864++;
        if (class422.field6043 != null) {
            return;
        }
        class422.field6043 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var5 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) ((var3 & 0x38F) >> 7) / 8.0D + 0.0625D;
            double var9 = (double) (var3 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if ((var9 < 0.5D)) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - (var7 * var9);
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if ((var5 * 6.0D < 1.0D)) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if ((var5 * 2.0D < 1.0D)) {
                    var13 = var17;
                } else if (var5 * 3.0D < 2.0D) {
                    var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var25 < 0.0D) {
                    var25++;
                }
                if (var21 * 6.0D < 1.0D) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if (var21 * 2.0D < 1.0D) {
                    var11 = var17;
                } else if ((var21 * 3.0D < 2.0D)) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if ((var25 * 6.0D < 1.0D)) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if (var25 * 2.0D < 1.0D) {
                    var15 = var17;
                } else if (var25 * 3.0D < 2.0D) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var1);
            double var29 = Math.pow(var13, var1);
            double var31 = Math.pow(var15, var1);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class422.field6043[var3] = var36;
        }
        int var4 = -90 / ((69 - arg0) / 50);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lre;B)V")
    public final void method2855(class446 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field6857++;
                if (arg1 < 0) {
                    this.field6861 = -100;
                    return;
                }
                return;
            }
            this.method2853(var3, -43, arg0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
    private final void method2856(int arg0, byte arg1) {
        field6860++;
        double var3 = (double) ((arg0 & 0xFF89BA) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF13) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
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
        if (arg1 != 114) {
            method2854((byte) -57);
        }
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
        this.field6851 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field6865 = (int) (var15 * 256.0D);
        if (this.field6865 < 0) {
            this.field6865 = 0;
        } else if (this.field6865 > 255) {
            this.field6865 = 255;
        }
        if (this.field6851 < 0) {
            this.field6851 = 0;
        } else if (this.field6851 > 255) {
            this.field6851 = 255;
        }
        if (var17 > 0.5D) {
            this.field6855 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6855 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6855 < 1) {
            this.field6855 = 1;
        }
        this.field6861 = (int) ((double) this.field6855 * var19);
    }
}
