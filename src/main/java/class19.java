import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HCUFYAUI")
public class class19 {

    @OriginalMember(owner = "HCUFYAUI", name = "f", descriptor = "I")
    public int field724 = -1;

    @OriginalMember(owner = "HCUFYAUI", name = "g", descriptor = "Z")
    public boolean field725 = false;

    @OriginalMember(owner = "HCUFYAUI", name = "h", descriptor = "Z")
    public boolean field726 = true;

    @OriginalMember(owner = "HCUFYAUI", name = "a", descriptor = "Z")
    private static boolean field719 = true;

    @OriginalMember(owner = "HCUFYAUI", name = "b", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "HCUFYAUI", name = "e", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "HCUFYAUI", name = "i", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "HCUFYAUI", name = "j", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "HCUFYAUI", name = "k", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "HCUFYAUI", name = "l", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "HCUFYAUI", name = "m", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "HCUFYAUI", name = "n", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "HCUFYAUI", name = "d", descriptor = "Ljava/lang/String;")
    public String field722;

    @OriginalMember(owner = "HCUFYAUI", name = "c", descriptor = "[LHCUFYAUI;")
    public static class19[] field721;

    @OriginalMember(owner = "HCUFYAUI", name = "a", descriptor = "(LFNOQZAYQ;I)V")
    public static void method263(class14 arg0, int arg1) {
        class11 var2 = new class11(arg0.method246("flo.dat", null), field719);
        field720 = var2.method191();
        int var3 = 40 / arg1;
        if (field721 == null) {
            field721 = new class19[field720];
        }
        for (int var4 = 0; var4 < field720; var4++) {
            if (field721[var4] == null) {
                field721[var4] = new class19();
            }
            field721[var4].method264(var2, -25);
        }
    }

    @OriginalMember(owner = "HCUFYAUI", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public void method264(class11 arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method189();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field723 = arg0.method193();
                this.method265(0, this.field723);
            } else if (var3 == 2) {
                this.field724 = arg0.method189();
            } else if (var3 == 3) {
                this.field725 = true;
            } else if (var3 == 5) {
                this.field726 = false;
            } else if (var3 == 6) {
                this.field722 = arg0.method196();
            } else if (var3 == 7) {
                int var4 = this.field727;
                int var5 = this.field728;
                int var6 = this.field729;
                int var7 = this.field730;
                int var8 = arg0.method193();
                this.method265(0, var8);
                this.field727 = var4;
                this.field728 = var5;
                this.field729 = var6;
                this.field730 = var7;
                this.field731 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "HCUFYAUI", name = "a", descriptor = "(II)V")
    private void method265(int arg0, int arg1) {
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
        if (arg0 != 0) {
            for (int var19 = 1; var19 > 0; var19++) {
            }
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
        double var20 = var13 / 6.0D;
        this.field727 = (int) (var20 * 256.0D);
        this.field728 = (int) (var15 * 256.0D);
        this.field729 = (int) (var17 * 256.0D);
        if (this.field728 < 0) {
            this.field728 = 0;
        } else if (this.field728 > 255) {
            this.field728 = 255;
        }
        if (this.field729 < 0) {
            this.field729 = 0;
        } else if (this.field729 > 255) {
            this.field729 = 255;
        }
        if (var17 > 0.5D) {
            this.field731 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field731 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field731 < 1) {
            this.field731 = 1;
        }
        this.field730 = (int) ((double) this.field731 * var20);
        int var22 = this.field727 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field728 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field729 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field732 = this.method266(var22, var23, var24);
    }

    @OriginalMember(owner = "HCUFYAUI", name = "a", descriptor = "(III)I")
    private final int method266(int arg0, int arg1, int arg2) {
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
