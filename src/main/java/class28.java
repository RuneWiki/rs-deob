import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KJOXMCRE")
public class class28 {

    @OriginalMember(owner = "KJOXMCRE", name = "a", descriptor = "I")
    private int field1030 = -293;

    @OriginalMember(owner = "KJOXMCRE", name = "f", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "KJOXMCRE", name = "g", descriptor = "Z")
    public boolean field1036 = false;

    @OriginalMember(owner = "KJOXMCRE", name = "h", descriptor = "Z")
    public boolean field1037 = true;

    @OriginalMember(owner = "KJOXMCRE", name = "b", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "KJOXMCRE", name = "e", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "KJOXMCRE", name = "i", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "KJOXMCRE", name = "j", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "KJOXMCRE", name = "k", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "KJOXMCRE", name = "l", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "KJOXMCRE", name = "m", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "KJOXMCRE", name = "n", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "KJOXMCRE", name = "d", descriptor = "Ljava/lang/String;")
    public String field1033;

    @OriginalMember(owner = "KJOXMCRE", name = "c", descriptor = "[LKJOXMCRE;")
    public static class28[] field1032;

    @OriginalMember(owner = "KJOXMCRE", name = "a", descriptor = "(LMNPBQFWE;B)V")
    public static void method355(class37 arg0, byte arg1) {
        class3 var2 = new class3(false, arg0.method429("flo.dat", null));
        field1031 = var2.method17();
        if (field1032 == null) {
            field1032 = new class28[field1031];
        }
        for (int var3 = 0; var3 < field1031; var3++) {
            if (field1032[var3] == null) {
                field1032[var3] = new class28();
            }
            field1032[var3].method356(674, var2);
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "KJOXMCRE", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    public void method356(int arg0, class3 arg1) {
        if (arg0 <= 0) {
            this.field1030 = -103;
        }
        while (true) {
            int var3 = arg1.method15();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1034 = arg1.method19();
                this.method357(this.field1034, true);
            } else if (var3 == 2) {
                this.field1035 = arg1.method15();
            } else if (var3 == 3) {
                this.field1036 = true;
            } else if (var3 == 5) {
                this.field1037 = false;
            } else if (var3 == 6) {
                this.field1033 = arg1.method22();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "KJOXMCRE", name = "a", descriptor = "(IZ)V")
    private void method357(int arg0, boolean arg1) {
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
        this.field1038 = (int) (var19 * 256.0D);
        if (!arg1) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        this.field1039 = (int) (var15 * 256.0D);
        this.field1040 = (int) (var17 * 256.0D);
        if (this.field1039 < 0) {
            this.field1039 = 0;
        } else if (this.field1039 > 255) {
            this.field1039 = 255;
        }
        if (this.field1040 < 0) {
            this.field1040 = 0;
        } else if (this.field1040 > 255) {
            this.field1040 = 255;
        }
        if (var17 > 0.5D) {
            this.field1042 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1042 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1042 < 1) {
            this.field1042 = 1;
        }
        this.field1041 = (int) ((double) this.field1042 * var19);
        int var22 = this.field1038 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1039 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1040 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1043 = this.method358(var22, var23, var24);
    }

    @OriginalMember(owner = "KJOXMCRE", name = "a", descriptor = "(III)I")
    private final int method358(int arg0, int arg1, int arg2) {
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
