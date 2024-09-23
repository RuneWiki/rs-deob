import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ECJPTPHH")
public class class10 {

    @OriginalMember(owner = "ECJPTPHH", name = "b", descriptor = "I")
    private int field639 = 44344;

    @OriginalMember(owner = "ECJPTPHH", name = "c", descriptor = "I")
    private int field640 = 974;

    @OriginalMember(owner = "ECJPTPHH", name = "h", descriptor = "I")
    public int field645 = -1;

    @OriginalMember(owner = "ECJPTPHH", name = "i", descriptor = "Z")
    public boolean field646 = false;

    @OriginalMember(owner = "ECJPTPHH", name = "j", descriptor = "Z")
    public boolean field647 = true;

    @OriginalMember(owner = "ECJPTPHH", name = "a", descriptor = "Z")
    private static boolean field638 = true;

    @OriginalMember(owner = "ECJPTPHH", name = "d", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "ECJPTPHH", name = "g", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "ECJPTPHH", name = "k", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "ECJPTPHH", name = "l", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "ECJPTPHH", name = "m", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "ECJPTPHH", name = "n", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "ECJPTPHH", name = "o", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "ECJPTPHH", name = "p", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "ECJPTPHH", name = "f", descriptor = "Ljava/lang/String;")
    public String field643;

    @OriginalMember(owner = "ECJPTPHH", name = "e", descriptor = "[LECJPTPHH;")
    public static class10[] field642;

    @OriginalMember(owner = "ECJPTPHH", name = "a", descriptor = "(ILRVLWVPJQ;)V")
    public static void method180(int arg0, class50 arg1) {
        class55 var2 = new class55(741, arg1.method424("flo.dat", null));
        field641 = var2.method457();
        if (arg0 != 0) {
            field638 = !field638;
        }
        if (field642 == null) {
            field642 = new class10[field641];
        }
        for (int var3 = 0; var3 < field641; var3++) {
            if (field642[var3] == null) {
                field642[var3] = new class10();
            }
            field642[var3].method181(-7321, var2);
        }
    }

    @OriginalMember(owner = "ECJPTPHH", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public void method181(int arg0, class55 arg1) {
        if (arg0 != -7321) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method455();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field644 = arg1.method459();
                this.method182(this.field644, 44344);
            } else if (var4 == 2) {
                this.field645 = arg1.method455();
            } else if (var4 == 3) {
                this.field646 = true;
            } else if (var4 == 5) {
                this.field647 = false;
            } else if (var4 == 6) {
                this.field643 = arg1.method462();
            } else if (var4 == 7) {
                int var5 = this.field648;
                int var6 = this.field649;
                int var7 = this.field650;
                int var8 = this.field651;
                int var9 = arg1.method459();
                this.method182(var9, 44344);
                this.field648 = var5;
                this.field649 = var6;
                this.field650 = var7;
                this.field651 = var8;
                this.field652 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "ECJPTPHH", name = "a", descriptor = "(II)V")
    private void method182(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (this.field639 != arg1) {
            this.field640 = -246;
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
        this.field648 = (int) (var19 * 256.0D);
        this.field649 = (int) (var15 * 256.0D);
        this.field650 = (int) (var17 * 256.0D);
        if (this.field649 < 0) {
            this.field649 = 0;
        } else if (this.field649 > 255) {
            this.field649 = 255;
        }
        if (this.field650 < 0) {
            this.field650 = 0;
        } else if (this.field650 > 255) {
            this.field650 = 255;
        }
        if (var17 > 0.5D) {
            this.field652 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field652 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field652 < 1) {
            this.field652 = 1;
        }
        this.field651 = (int) ((double) this.field652 * var19);
        int var21 = this.field648 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field649 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field650 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field653 = this.method183(var21, var22, var23);
    }

    @OriginalMember(owner = "ECJPTPHH", name = "a", descriptor = "(III)I")
    private final int method183(int arg0, int arg1, int arg2) {
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
