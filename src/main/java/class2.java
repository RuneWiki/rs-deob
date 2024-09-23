import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BXKOBEWK")
public class class2 {

    @OriginalMember(owner = "BXKOBEWK", name = "a", descriptor = "I")
    private int field4 = -261;

    @OriginalMember(owner = "BXKOBEWK", name = "b", descriptor = "Z")
    private boolean field5 = true;

    @OriginalMember(owner = "BXKOBEWK", name = "g", descriptor = "I")
    public int field10 = -1;

    @OriginalMember(owner = "BXKOBEWK", name = "h", descriptor = "Z")
    public boolean field11 = false;

    @OriginalMember(owner = "BXKOBEWK", name = "i", descriptor = "Z")
    public boolean field12 = true;

    @OriginalMember(owner = "BXKOBEWK", name = "j", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "BXKOBEWK", name = "k", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "BXKOBEWK", name = "l", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "BXKOBEWK", name = "m", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "BXKOBEWK", name = "n", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "BXKOBEWK", name = "o", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "BXKOBEWK", name = "c", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "BXKOBEWK", name = "f", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "BXKOBEWK", name = "e", descriptor = "Ljava/lang/String;")
    public String field8;

    @OriginalMember(owner = "BXKOBEWK", name = "d", descriptor = "[LBXKOBEWK;")
    public static class2[] field7;

    @OriginalMember(owner = "BXKOBEWK", name = "a", descriptor = "(LCXFTMSCH;B)V")
    public static void method3(class8 arg0, byte arg1) {
        class33 var2 = new class33(true, arg0.method176("flo.dat", null));
        if (arg1 != 51) {
            return;
        }
        field6 = var2.method327();
        if (field7 == null) {
            field7 = new class2[field6];
        }
        for (int var3 = 0; var3 < field6; var3++) {
            if (field7[var3] == null) {
                field7[var3] = new class2();
            }
            field7[var3].method4(var2, -261);
        }
    }

    @OriginalMember(owner = "BXKOBEWK", name = "a", descriptor = "(LMQZHAILV;I)V")
    public void method4(class33 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg0.method325();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field9 = arg0.method329();
                this.method5(this.field9, false);
            } else if (var4 == 2) {
                this.field10 = arg0.method325();
            } else if (var4 == 3) {
                this.field11 = true;
            } else if (var4 == 5) {
                this.field12 = false;
            } else if (var4 == 6) {
                this.field8 = arg0.method332();
            } else if (var4 == 7) {
                int var5 = this.field13;
                int var6 = this.field14;
                int var7 = this.field15;
                int var8 = this.field16;
                int var9 = arg0.method329();
                this.method5(var9, false);
                this.field13 = var5;
                this.field14 = var6;
                this.field15 = var7;
                this.field16 = var8;
                this.field17 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "BXKOBEWK", name = "a", descriptor = "(IZ)V")
    private void method5(int arg0, boolean arg1) {
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
        this.field13 = (int) (var19 * 256.0D);
        this.field14 = (int) (var15 * 256.0D);
        this.field15 = (int) (var17 * 256.0D);
        if (this.field14 < 0) {
            this.field14 = 0;
        } else if (this.field14 > 255) {
            this.field14 = 255;
        }
        if (this.field15 < 0) {
            this.field15 = 0;
        } else if (this.field15 > 255) {
            this.field15 = 255;
        }
        if (var17 > 0.5D) {
            this.field17 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field17 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field17 < 1) {
            this.field17 = 1;
        }
        this.field16 = (int) ((double) this.field17 * var19);
        int var21 = this.field13 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field14 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field15 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field18 = this.method6(var21, var22, var23);
        if (arg1) {
            this.field5 = !this.field5;
        }
    }

    @OriginalMember(owner = "BXKOBEWK", name = "a", descriptor = "(III)I")
    private final int method6(int arg0, int arg1, int arg2) {
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
