import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IWTQKRSS")
public class class28 {

    @OriginalMember(owner = "IWTQKRSS", name = "a", descriptor = "Z")
    private boolean field930 = true;

    @OriginalMember(owner = "IWTQKRSS", name = "f", descriptor = "I")
    public int field935 = -1;

    @OriginalMember(owner = "IWTQKRSS", name = "g", descriptor = "Z")
    public boolean field936 = false;

    @OriginalMember(owner = "IWTQKRSS", name = "h", descriptor = "Z")
    public boolean field937 = true;

    @OriginalMember(owner = "IWTQKRSS", name = "b", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "IWTQKRSS", name = "e", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "IWTQKRSS", name = "i", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "IWTQKRSS", name = "j", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "IWTQKRSS", name = "k", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "IWTQKRSS", name = "l", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "IWTQKRSS", name = "m", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "IWTQKRSS", name = "n", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "IWTQKRSS", name = "d", descriptor = "Ljava/lang/String;")
    public String field933;

    @OriginalMember(owner = "IWTQKRSS", name = "c", descriptor = "[LIWTQKRSS;")
    public static class28[] field932;

    @OriginalMember(owner = "IWTQKRSS", name = "a", descriptor = "(ZLXMRRKSSB;)V")
    public static void method264(boolean arg0, class60 arg1) {
        if (arg0) {
            return;
        }
        class62 var2 = new class62(arg1.method465("flo.dat", null), 49938);
        field931 = var2.method480();
        if (field932 == null) {
            field932 = new class28[field931];
        }
        for (int var3 = 0; var3 < field931; var3++) {
            if (field932[var3] == null) {
                field932[var3] = new class28();
            }
            field932[var3].method265(var2, 168);
        }
    }

    @OriginalMember(owner = "IWTQKRSS", name = "a", descriptor = "(LXQPFGONL;I)V")
    public void method265(class62 arg0, int arg1) {
        int var3 = 34 / arg1;
        while (true) {
            int var4 = arg0.method478();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field934 = arg0.method482();
                this.method266(this.field930, this.field934);
            } else if (var4 == 2) {
                this.field935 = arg0.method478();
            } else if (var4 == 3) {
                this.field936 = true;
            } else if (var4 == 5) {
                this.field937 = false;
            } else if (var4 == 6) {
                this.field933 = arg0.method485();
            } else if (var4 == 7) {
                int var5 = this.field938;
                int var6 = this.field939;
                int var7 = this.field940;
                int var8 = this.field941;
                int var9 = arg0.method482();
                this.method266(this.field930, var9);
                this.field938 = var5;
                this.field939 = var6;
                this.field940 = var7;
                this.field941 = var8;
                this.field942 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "IWTQKRSS", name = "a", descriptor = "(ZI)V")
    private void method266(boolean arg0, int arg1) {
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
        this.field938 = (int) (var19 * 256.0D);
        this.field939 = (int) (var15 * 256.0D);
        this.field940 = (int) (var17 * 256.0D);
        if (this.field939 < 0) {
            this.field939 = 0;
        } else if (this.field939 > 255) {
            this.field939 = 255;
        }
        if (this.field940 < 0) {
            this.field940 = 0;
        } else if (this.field940 > 255) {
            this.field940 = 255;
        }
        if (var17 > 0.5D) {
            this.field942 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field942 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field942 < 1) {
            this.field942 = 1;
        }
        this.field941 = (int) ((double) this.field942 * var19);
        int var21 = this.field938 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field939 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field940 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field943 = this.method267(var21, var22, var23);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "IWTQKRSS", name = "a", descriptor = "(III)I")
    private final int method267(int arg0, int arg1, int arg2) {
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
