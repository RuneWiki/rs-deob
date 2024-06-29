import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FZFOSJCE")
public class FloType {

    @OriginalMember(owner = "client!FZFOSJCE", name = "c", descriptor = "Z")
    private boolean field794 = true;

    @OriginalMember(owner = "client!FZFOSJCE", name = "h", descriptor = "I")
    public int field799 = -1;

    @OriginalMember(owner = "client!FZFOSJCE", name = "i", descriptor = "Z")
    public boolean field800 = false;

    @OriginalMember(owner = "client!FZFOSJCE", name = "j", descriptor = "Z")
    public boolean field801 = true;

    @OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "B")
    private static byte field792 = 6;

    @OriginalMember(owner = "client!FZFOSJCE", name = "b", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!FZFOSJCE", name = "d", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!FZFOSJCE", name = "g", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!FZFOSJCE", name = "k", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!FZFOSJCE", name = "l", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!FZFOSJCE", name = "m", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!FZFOSJCE", name = "n", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!FZFOSJCE", name = "o", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!FZFOSJCE", name = "p", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!FZFOSJCE", name = "f", descriptor = "Ljava/lang/String;")
    public String field797;

    @OriginalMember(owner = "client!FZFOSJCE", name = "e", descriptor = "[LFZFOSJCE;")
    public static FloType[] field796;

    @OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(LATJMVOZR;I)V")
    public static void method216(Jagfile arg0, int arg1) {
        if (arg1 != 36135) {
            return;
        }
        Packet var2 = new Packet(true, arg0.method2("flo.dat", null));
        field795 = var2.g2();
        if (field796 == null) {
            field796 = new FloType[field795];
        }
        for (int var3 = 0; var3 < field795; var3++) {
            if (field796[var3] == null) {
                field796[var3] = new FloType();
            }
            field796[var3].method217(field792, var2);
        }
    }

    @OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(BLMFMVIYHT;)V")
    public void method217(byte arg0, Packet arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.g1();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field798 = arg1.g3();
                this.method218(true, this.field798);
            } else if (var5 == 2) {
                this.field799 = arg1.g1();
            } else if (var5 == 3) {
                this.field800 = true;
            } else if (var5 == 5) {
                this.field801 = false;
            } else if (var5 == 6) {
                this.field797 = arg1.gjstr();
            } else if (var5 == 7) {
                int var6 = this.field802;
                int var7 = this.field803;
                int var8 = this.field804;
                int var9 = this.field805;
                int var10 = arg1.g3();
                this.method218(true, var10);
                this.field802 = var6;
                this.field803 = var7;
                this.field804 = var8;
                this.field805 = var9;
                this.field806 = var9;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }

    @OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(ZI)V")
    private void method218(boolean arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
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
        this.field802 = (int) (var19 * 256.0D);
        this.field803 = (int) (var15 * 256.0D);
        this.field804 = (int) (var17 * 256.0D);
        if (!arg0) {
            this.field793 = -244;
        }
        if (this.field803 < 0) {
            this.field803 = 0;
        } else if (this.field803 > 255) {
            this.field803 = 255;
        }
        if (this.field804 < 0) {
            this.field804 = 0;
        } else if (this.field804 > 255) {
            this.field804 = 255;
        }
        if (var17 > 0.5D) {
            this.field806 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field806 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field806 < 1) {
            this.field806 = 1;
        }
        this.field805 = (int) ((double) this.field806 * var19);
        int var21 = this.field802 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field803 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field804 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field807 = this.method219(var21, var22, var23);
    }

    @OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(III)I")
    private final int method219(int arg0, int arg1, int arg2) {
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
