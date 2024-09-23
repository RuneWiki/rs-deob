import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GQFZPMGS")
public class class19 {

    @OriginalMember(owner = "GQFZPMGS", name = "b", descriptor = "Z")
    private boolean field740 = true;

    @OriginalMember(owner = "GQFZPMGS", name = "g", descriptor = "I")
    public int field745 = -1;

    @OriginalMember(owner = "GQFZPMGS", name = "h", descriptor = "Z")
    public boolean field746 = false;

    @OriginalMember(owner = "GQFZPMGS", name = "i", descriptor = "Z")
    public boolean field747 = true;

    @OriginalMember(owner = "GQFZPMGS", name = "a", descriptor = "I")
    private static int field739 = 8;

    @OriginalMember(owner = "GQFZPMGS", name = "c", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "GQFZPMGS", name = "f", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "GQFZPMGS", name = "j", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "GQFZPMGS", name = "k", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "GQFZPMGS", name = "l", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "GQFZPMGS", name = "m", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "GQFZPMGS", name = "n", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "GQFZPMGS", name = "o", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "GQFZPMGS", name = "e", descriptor = "Ljava/lang/String;")
    public String field743;

    @OriginalMember(owner = "GQFZPMGS", name = "d", descriptor = "[LGQFZPMGS;")
    public static class19[] field742;

    @OriginalMember(owner = "GQFZPMGS", name = "a", descriptor = "(LBYZSQZUF;Z)V")
    public static void method211(class7 arg0, boolean arg1) {
        class24 var2 = new class24(0, arg0.method29("flo.dat", null));
        field741 = var2.method240();
        if (arg1) {
            return;
        }
        if (field742 == null) {
            field742 = new class19[field741];
        }
        for (int var3 = 0; var3 < field741; var3++) {
            if (field742[var3] == null) {
                field742[var3] = new class19();
            }
            field742[var3].method212(field739, var2);
        }
    }

    @OriginalMember(owner = "GQFZPMGS", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public void method212(int arg0, class24 arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field740 = !this.field740;
        }
        while (true) {
            int var3 = arg1.method238();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field744 = arg1.method242();
                this.method213(this.field744, 4);
            } else if (var3 == 2) {
                this.field745 = arg1.method238();
            } else if (var3 == 3) {
                this.field746 = true;
            } else if (var3 == 5) {
                this.field747 = false;
            } else if (var3 == 6) {
                this.field743 = arg1.method245();
            } else if (var3 == 7) {
                int var4 = this.field748;
                int var5 = this.field749;
                int var6 = this.field750;
                int var7 = this.field751;
                int var8 = arg1.method242();
                this.method213(var8, 4);
                this.field748 = var4;
                this.field749 = var5;
                this.field750 = var6;
                this.field751 = var7;
                this.field752 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "GQFZPMGS", name = "a", descriptor = "(II)V")
    private void method213(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
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
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (arg1 < 4 || arg1 > 4) {
            this.field740 = !this.field740;
        }
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
        this.field748 = (int) (var19 * 256.0D);
        this.field749 = (int) (var15 * 256.0D);
        this.field750 = (int) (var17 * 256.0D);
        if (this.field749 < 0) {
            this.field749 = 0;
        } else if (this.field749 > 255) {
            this.field749 = 255;
        }
        if (this.field750 < 0) {
            this.field750 = 0;
        } else if (this.field750 > 255) {
            this.field750 = 255;
        }
        if (var17 > 0.5D) {
            this.field752 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field752 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field752 < 1) {
            this.field752 = 1;
        }
        this.field751 = (int) ((double) this.field752 * var19);
        int var21 = this.field748 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field749 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field750 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field753 = this.method214(var21, var22, var23);
    }

    @OriginalMember(owner = "GQFZPMGS", name = "a", descriptor = "(III)I")
    private final int method214(int arg0, int arg1, int arg2) {
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
