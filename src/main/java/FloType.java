import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class FloType {

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field930 = -1;

    @OriginalMember(owner = "fc", name = "f", descriptor = "Z")
    public boolean field931 = false;

    @OriginalMember(owner = "fc", name = "g", descriptor = "Z")
    public boolean field932 = true;

    @OriginalMember(owner = "fc", name = "a", descriptor = "Z")
    private static boolean field926 = true;

    @OriginalMember(owner = "fc", name = "b", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "fc", name = "i", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "fc", name = "k", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "fc", name = "h", descriptor = "Ljava/lang/String;")
    public String field933;

    @OriginalMember(owner = "fc", name = "c", descriptor = "[Lfc;")
    public static FloType[] field928;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ILub;)V")
    public static void method314(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 64, arg1.method257(null, "flo.dat", -31149));
        field927 = var2.method218();
        if (field928 == null) {
            field928 = new FloType[field927];
        }
        for (int var3 = 0; var3 < field927; var3++) {
            if (field928[var3] == null) {
                field928[var3] = new FloType();
            }
            field928[var3].method315(var2, true);
        }
        if (arg0 != -5880) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lkb;Z)V")
    public void method315(Packet arg0, boolean arg1) {
        if (!arg1) {
            field926 = !field926;
        }
        while (true) {
            int var3 = arg0.method216();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field929 = arg0.method220();
                this.method316(this.field929, -889);
            } else if (var3 == 2) {
                this.field930 = arg0.method216();
            } else if (var3 == 3) {
                this.field931 = true;
            } else if (var3 == 5) {
                this.field932 = false;
            } else if (var3 == 6) {
                this.field933 = arg0.method223();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II)V")
    private void method316(int arg0, int arg1) {
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
        this.field934 = (int) (var19 * 256.0D);
        this.field935 = (int) (var15 * 256.0D);
        this.field936 = (int) (var17 * 256.0D);
        if (this.field935 < 0) {
            this.field935 = 0;
        } else if (this.field935 > 255) {
            this.field935 = 255;
        }
        if (this.field936 < 0) {
            this.field936 = 0;
        } else if (this.field936 > 255) {
            this.field936 = 255;
        }
        if (var17 > 0.5D) {
            this.field938 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field938 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field938 < 1) {
            this.field938 = 1;
        }
        this.field937 = (int) ((double) this.field938 * var19);
        int var21 = this.field934 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field935 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field936 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field939 = this.method317(var21, var22, var23);
        while (arg1 >= 0) {
            for (int var24 = 1; var24 > 0; var24++) {
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(III)I")
    private final int method317(int arg0, int arg1, int arg2) {
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
