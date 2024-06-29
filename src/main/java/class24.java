import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JZNGGVQB")
public class class24 {

    @OriginalMember(owner = "client!JZNGGVQB", name = "b", descriptor = "Z")
    private boolean field849 = false;

    @OriginalMember(owner = "client!JZNGGVQB", name = "h", descriptor = "I")
    public int field855 = -1;

    @OriginalMember(owner = "client!JZNGGVQB", name = "i", descriptor = "Z")
    public boolean field856 = false;

    @OriginalMember(owner = "client!JZNGGVQB", name = "j", descriptor = "Z")
    public boolean field857 = true;

    @OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "Z")
    private static boolean field848 = true;

    @OriginalMember(owner = "client!JZNGGVQB", name = "c", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!JZNGGVQB", name = "d", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!JZNGGVQB", name = "g", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!JZNGGVQB", name = "k", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!JZNGGVQB", name = "l", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!JZNGGVQB", name = "m", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!JZNGGVQB", name = "n", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!JZNGGVQB", name = "o", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!JZNGGVQB", name = "p", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!JZNGGVQB", name = "f", descriptor = "Ljava/lang/String;")
    public String field853;

    @OriginalMember(owner = "client!JZNGGVQB", name = "e", descriptor = "[LJZNGGVQB;")
    public static class24[] field852;

    @OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(BLSXKKBWPU;)V")
    public static void method238(byte arg0, class50 arg1) {
        class53 var2 = new class53(arg1.method442("flo.dat", null), -631);
        field851 = var2.method470();
        if (field852 == null) {
            field852 = new class24[field851];
        }
        for (int var3 = 0; var3 < field851; var3++) {
            if (field852[var3] == null) {
                field852[var3] = new class24();
            }
            field852[var3].method239(3, var2);
        }
        if (arg0 != -109) {
            field848 = !field848;
        }
    }

    @OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public void method239(int arg0, class53 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.field850 = -17;
        }
        while (true) {
            int var3 = arg1.method468();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field854 = arg1.method472();
                this.method240(this.field854, 30405);
            } else if (var3 == 2) {
                this.field855 = arg1.method468();
            } else if (var3 == 3) {
                this.field856 = true;
            } else if (var3 == 5) {
                this.field857 = false;
            } else if (var3 == 6) {
                this.field853 = arg1.method475();
            } else if (var3 == 7) {
                int var4 = this.field858;
                int var5 = this.field859;
                int var6 = this.field860;
                int var7 = this.field861;
                int var8 = arg1.method472();
                this.method240(var8, 30405);
                this.field858 = var4;
                this.field859 = var5;
                this.field860 = var6;
                this.field861 = var7;
                this.field862 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(II)V")
    private void method240(int arg0, int arg1) {
        if (arg0 == 16711935) {
            arg0 = 0;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 != 30405) {
            this.field849 = !this.field849;
        }
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
        this.field858 = (int) (var19 * 256.0D);
        this.field859 = (int) (var15 * 256.0D);
        this.field860 = (int) (var17 * 256.0D);
        if (this.field859 < 0) {
            this.field859 = 0;
        } else if (this.field859 > 255) {
            this.field859 = 255;
        }
        if (this.field860 < 0) {
            this.field860 = 0;
        } else if (this.field860 > 255) {
            this.field860 = 255;
        }
        if (var17 > 0.5D) {
            this.field862 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field862 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field862 < 1) {
            this.field862 = 1;
        }
        this.field861 = (int) ((double) this.field862 * var19);
        int var21 = this.field858 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field859 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field860 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field863 = this.method241(var21, var22, var23);
    }

    @OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(III)I")
    private final int method241(int arg0, int arg1, int arg2) {
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
