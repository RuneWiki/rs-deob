import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SCDBMUNA")
public class class56 {

    @OriginalMember(owner = "SCDBMUNA", name = "e", descriptor = "I")
    public int field1415 = -1;

    @OriginalMember(owner = "SCDBMUNA", name = "f", descriptor = "Z")
    public boolean field1416 = false;

    @OriginalMember(owner = "SCDBMUNA", name = "g", descriptor = "Z")
    public boolean field1417 = true;

    @OriginalMember(owner = "SCDBMUNA", name = "a", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "SCDBMUNA", name = "d", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "SCDBMUNA", name = "h", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "SCDBMUNA", name = "i", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "SCDBMUNA", name = "j", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "SCDBMUNA", name = "k", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "SCDBMUNA", name = "l", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "SCDBMUNA", name = "m", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "SCDBMUNA", name = "c", descriptor = "Ljava/lang/String;")
    public String field1413;

    @OriginalMember(owner = "SCDBMUNA", name = "b", descriptor = "[LSCDBMUNA;")
    public static class56[] field1412;

    @OriginalMember(owner = "SCDBMUNA", name = "a", descriptor = "(LDYBMLHQM;Z)V")
    public static void method475(class16 arg0, boolean arg1) {
        class29 var2 = new class29((byte) -28, arg0.method248("flo.dat", null));
        field1411 = var2.method310();
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1412 == null) {
            field1412 = new class56[field1411];
        }
        for (int var4 = 0; var4 < field1411; var4++) {
            if (field1412[var4] == null) {
                field1412[var4] = new class56();
            }
            field1412[var4].method476(6, var2);
        }
    }

    @OriginalMember(owner = "SCDBMUNA", name = "a", descriptor = "(ILINLHDAGO;)V")
    public void method476(int arg0, class29 arg1) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method308();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1414 = arg1.method312();
                this.method477(-342, this.field1414);
            } else if (var4 == 2) {
                this.field1415 = arg1.method308();
            } else if (var4 == 3) {
                this.field1416 = true;
            } else if (var4 == 5) {
                this.field1417 = false;
            } else if (var4 == 6) {
                this.field1413 = arg1.method315();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "SCDBMUNA", name = "a", descriptor = "(II)V")
    private void method477(int arg0, int arg1) {
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
        this.field1418 = (int) (var19 * 256.0D);
        this.field1419 = (int) (var15 * 256.0D);
        this.field1420 = (int) (var17 * 256.0D);
        if (this.field1419 < 0) {
            this.field1419 = 0;
        } else if (this.field1419 > 255) {
            this.field1419 = 255;
        }
        if (this.field1420 < 0) {
            this.field1420 = 0;
        } else if (this.field1420 > 255) {
            this.field1420 = 255;
        }
        if (var17 > 0.5D) {
            this.field1422 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1422 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1422 < 1) {
            this.field1422 = 1;
        }
        this.field1421 = (int) ((double) this.field1422 * var19);
        int var21 = this.field1418 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1419 + (int) (Math.random() * 48.0D) - 24;
        while (arg0 >= 0) {
            for (int var24 = 1; var24 > 0; var24++) {
            }
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1420 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1423 = this.method478(var21, var22, var23);
    }

    @OriginalMember(owner = "SCDBMUNA", name = "a", descriptor = "(III)I")
    private final int method478(int arg0, int arg1, int arg2) {
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
