import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CMUBOYNL")
public class class6 {

    @OriginalMember(owner = "CMUBOYNL", name = "f", descriptor = "I")
    public int field624 = -1;

    @OriginalMember(owner = "CMUBOYNL", name = "g", descriptor = "Z")
    public boolean field625 = false;

    @OriginalMember(owner = "CMUBOYNL", name = "h", descriptor = "Z")
    public boolean field626 = true;

    @OriginalMember(owner = "CMUBOYNL", name = "b", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "CMUBOYNL", name = "e", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "CMUBOYNL", name = "i", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "CMUBOYNL", name = "j", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "CMUBOYNL", name = "k", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "CMUBOYNL", name = "l", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "CMUBOYNL", name = "m", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "CMUBOYNL", name = "n", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "CMUBOYNL", name = "d", descriptor = "Ljava/lang/String;")
    public String field622;

    @OriginalMember(owner = "CMUBOYNL", name = "a", descriptor = "Z")
    private static boolean field619;

    @OriginalMember(owner = "CMUBOYNL", name = "c", descriptor = "[LCMUBOYNL;")
    public static class6[] field621;

    @OriginalMember(owner = "CMUBOYNL", name = "a", descriptor = "(ZLEAXVDNXA;)V")
    public static void method225(boolean arg0, class12 arg1) {
        if (!arg0) {
            field619 = !field619;
        }
        class5 var2 = new class5(2, arg1.method255("flo.dat", null));
        field620 = var2.method46();
        if (field621 == null) {
            field621 = new class6[field620];
        }
        for (int var3 = 0; var3 < field620; var3++) {
            if (field621[var3] == null) {
                field621[var3] = new class6();
            }
            field621[var3].method226((byte) -18, var2);
        }
    }

    @OriginalMember(owner = "CMUBOYNL", name = "a", descriptor = "(BLCKBTFRZM;)V")
    public void method226(byte arg0, class5 arg1) {
        if (arg0 != -18) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method44();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field623 = arg1.method48();
                this.method227(this.field623, 914);
            } else if (var4 == 2) {
                this.field624 = arg1.method44();
            } else if (var4 == 3) {
                this.field625 = true;
            } else if (var4 == 5) {
                this.field626 = false;
            } else if (var4 == 6) {
                this.field622 = arg1.method51();
            } else if (var4 == 7) {
                int var5 = this.field627;
                int var6 = this.field628;
                int var7 = this.field629;
                int var8 = this.field630;
                int var9 = arg1.method48();
                this.method227(var9, 914);
                this.field627 = var5;
                this.field628 = var6;
                this.field629 = var7;
                this.field630 = var8;
                this.field631 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "CMUBOYNL", name = "a", descriptor = "(II)V")
    private void method227(int arg0, int arg1) {
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
        this.field627 = (int) (var19 * 256.0D);
        this.field628 = (int) (var15 * 256.0D);
        int var21 = 25 / arg1;
        this.field629 = (int) (var17 * 256.0D);
        if (this.field628 < 0) {
            this.field628 = 0;
        } else if (this.field628 > 255) {
            this.field628 = 255;
        }
        if (this.field629 < 0) {
            this.field629 = 0;
        } else if (this.field629 > 255) {
            this.field629 = 255;
        }
        if (var17 > 0.5D) {
            this.field631 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field631 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field631 < 1) {
            this.field631 = 1;
        }
        this.field630 = (int) ((double) this.field631 * var19);
        int var22 = this.field627 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field628 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field629 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field632 = this.method228(var22, var23, var24);
    }

    @OriginalMember(owner = "CMUBOYNL", name = "a", descriptor = "(III)I")
    private final int method228(int arg0, int arg1, int arg2) {
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
