import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GLVFVUWP")
public class class24 {

    @OriginalMember(owner = "GLVFVUWP", name = "f", descriptor = "I")
    public int field805 = -1;

    @OriginalMember(owner = "GLVFVUWP", name = "g", descriptor = "Z")
    public boolean field806 = false;

    @OriginalMember(owner = "GLVFVUWP", name = "h", descriptor = "Z")
    public boolean field807 = true;

    @OriginalMember(owner = "GLVFVUWP", name = "a", descriptor = "Z")
    private static boolean field800 = true;

    @OriginalMember(owner = "GLVFVUWP", name = "b", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "GLVFVUWP", name = "e", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "GLVFVUWP", name = "i", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "GLVFVUWP", name = "j", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "GLVFVUWP", name = "k", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "GLVFVUWP", name = "l", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "GLVFVUWP", name = "m", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "GLVFVUWP", name = "n", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "GLVFVUWP", name = "d", descriptor = "Ljava/lang/String;")
    public String field803;

    @OriginalMember(owner = "GLVFVUWP", name = "c", descriptor = "[LGLVFVUWP;")
    public static class24[] field802;

    @OriginalMember(owner = "GLVFVUWP", name = "a", descriptor = "(ILTKEGJSFV;)V")
    public static void method315(int arg0, class58 arg1) {
        class15 var2 = new class15(arg1.method542("flo.dat", null), false);
        field801 = var2.method263();
        if (arg0 != 0) {
            field800 = !field800;
        }
        if (field802 == null) {
            field802 = new class24[field801];
        }
        for (int var3 = 0; var3 < field801; var3++) {
            if (field802[var3] == null) {
                field802[var3] = new class24();
            }
            field802[var3].method316(var2, true);
        }
    }

    @OriginalMember(owner = "GLVFVUWP", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    public void method316(class15 arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method261();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field804 = arg0.method265();
                this.method317(1, this.field804);
            } else if (var3 == 2) {
                this.field805 = arg0.method261();
            } else if (var3 == 3) {
                this.field806 = true;
            } else if (var3 == 5) {
                this.field807 = false;
            } else if (var3 == 6) {
                this.field803 = arg0.method268();
            } else if (var3 == 7) {
                int var4 = this.field808;
                int var5 = this.field809;
                int var6 = this.field810;
                int var7 = this.field811;
                int var8 = arg0.method265();
                this.method317(1, var8);
                this.field808 = var4;
                this.field809 = var5;
                this.field810 = var6;
                this.field811 = var7;
                this.field812 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "GLVFVUWP", name = "a", descriptor = "(II)V")
    private void method317(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
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
        double var19 = var13 / 6.0D;
        this.field808 = (int) (var19 * 256.0D);
        this.field809 = (int) (var15 * 256.0D);
        this.field810 = (int) (var17 * 256.0D);
        if (this.field809 < 0) {
            this.field809 = 0;
        } else if (this.field809 > 255) {
            this.field809 = 255;
        }
        if (this.field810 < 0) {
            this.field810 = 0;
        } else if (this.field810 > 255) {
            this.field810 = 255;
        }
        if (var17 > 0.5D) {
            this.field812 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field812 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field812 < 1) {
            this.field812 = 1;
        }
        this.field811 = (int) ((double) this.field812 * var19);
        int var21 = this.field808 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field809 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field810 + (int) (Math.random() * 48.0D) - 24;
        if (arg0 != 1) {
            for (int var24 = 1; var24 > 0; var24++) {
            }
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field813 = this.method318(var21, var22, var23);
    }

    @OriginalMember(owner = "GLVFVUWP", name = "a", descriptor = "(III)I")
    private final int method318(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
