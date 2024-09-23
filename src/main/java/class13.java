import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ECSVNCGM")
public class class13 {

    @OriginalMember(owner = "ECSVNCGM", name = "e", descriptor = "I")
    public int field644 = -1;

    @OriginalMember(owner = "ECSVNCGM", name = "f", descriptor = "Z")
    public boolean field645 = false;

    @OriginalMember(owner = "ECSVNCGM", name = "g", descriptor = "Z")
    public boolean field646 = true;

    @OriginalMember(owner = "ECSVNCGM", name = "a", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "ECSVNCGM", name = "d", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "ECSVNCGM", name = "h", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "ECSVNCGM", name = "i", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "ECSVNCGM", name = "j", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "ECSVNCGM", name = "k", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "ECSVNCGM", name = "l", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "ECSVNCGM", name = "m", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "ECSVNCGM", name = "c", descriptor = "Ljava/lang/String;")
    public String field642;

    @OriginalMember(owner = "ECSVNCGM", name = "b", descriptor = "[LECSVNCGM;")
    public static class13[] field641;

    @OriginalMember(owner = "ECSVNCGM", name = "a", descriptor = "(ILCVNWKEAW;)V")
    public static void method211(int arg0, class7 arg1) {
        class62 var2 = new class62(-417, arg1.method180("flo.dat", null));
        field640 = var2.method523();
        if (field641 == null) {
            field641 = new class13[field640];
        }
        for (int var3 = 0; var3 < field640; var3++) {
            if (field641[var3] == null) {
                field641[var3] = new class13();
            }
            field641[var3].method212((byte) 5, var2);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ECSVNCGM", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public void method212(byte arg0, class62 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            int var4 = arg1.method521();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field643 = arg1.method525();
                this.method213(this.field643, 205);
            } else if (var4 == 2) {
                this.field644 = arg1.method521();
            } else if (var4 == 3) {
                this.field645 = true;
            } else if (var4 == 5) {
                this.field646 = false;
            } else if (var4 == 6) {
                this.field642 = arg1.method528();
            } else if (var4 == 7) {
                int var5 = this.field647;
                int var6 = this.field648;
                int var7 = this.field649;
                int var8 = this.field650;
                int var9 = arg1.method525();
                this.method213(var9, 205);
                this.field647 = var5;
                this.field648 = var6;
                this.field649 = var7;
                this.field650 = var8;
                this.field651 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "ECSVNCGM", name = "a", descriptor = "(II)V")
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
        this.field647 = (int) (var19 * 256.0D);
        this.field648 = (int) (var15 * 256.0D);
        if (arg1 <= 0) {
            return;
        }
        this.field649 = (int) (var17 * 256.0D);
        if (this.field648 < 0) {
            this.field648 = 0;
        } else if (this.field648 > 255) {
            this.field648 = 255;
        }
        if (this.field649 < 0) {
            this.field649 = 0;
        } else if (this.field649 > 255) {
            this.field649 = 255;
        }
        if (var17 > 0.5D) {
            this.field651 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field651 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field651 < 1) {
            this.field651 = 1;
        }
        this.field650 = (int) ((double) this.field651 * var19);
        int var21 = this.field647 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field648 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field649 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field652 = this.method214(var21, var22, var23);
    }

    @OriginalMember(owner = "ECSVNCGM", name = "a", descriptor = "(III)I")
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
