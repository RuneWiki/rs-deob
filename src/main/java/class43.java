import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QFWUSXIS")
public class class43 {

    @OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "I")
    private int field1155 = -16070;

    @OriginalMember(owner = "client!QFWUSXIS", name = "f", descriptor = "I")
    public int field1160 = -1;

    @OriginalMember(owner = "client!QFWUSXIS", name = "g", descriptor = "Z")
    public boolean field1161 = false;

    @OriginalMember(owner = "client!QFWUSXIS", name = "h", descriptor = "Z")
    public boolean field1162 = true;

    @OriginalMember(owner = "client!QFWUSXIS", name = "b", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!QFWUSXIS", name = "e", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!QFWUSXIS", name = "i", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!QFWUSXIS", name = "j", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!QFWUSXIS", name = "k", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!QFWUSXIS", name = "l", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!QFWUSXIS", name = "m", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!QFWUSXIS", name = "n", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!QFWUSXIS", name = "d", descriptor = "Ljava/lang/String;")
    public String field1158;

    @OriginalMember(owner = "client!QFWUSXIS", name = "c", descriptor = "[LQFWUSXIS;")
    public static class43[] field1157;

    @OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(LRSPRYUFS;I)V")
    public static void method416(class49 arg0, int arg1) {
        class36 var2 = new class36(-587, arg0.method427("flo.dat", null));
        field1156 = var2.method341();
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1157 == null) {
            field1157 = new class43[field1156];
        }
        for (int var4 = 0; var4 < field1156; var4++) {
            if (field1157[var4] == null) {
                field1157[var4] = new class43();
            }
            field1157[var4].method417((byte) 6, var2);
        }
    }

    @OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(BLNQUAUMDT;)V")
    public void method417(byte arg0, class36 arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method339();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1159 = arg1.method343();
                this.method418(this.field1159, false);
            } else if (var3 == 2) {
                this.field1160 = arg1.method339();
            } else if (var3 == 3) {
                this.field1161 = true;
            } else if (var3 == 5) {
                this.field1162 = false;
            } else if (var3 == 6) {
                this.field1158 = arg1.method346();
            } else if (var3 == 7) {
                int var4 = this.field1163;
                int var5 = this.field1164;
                int var6 = this.field1165;
                int var7 = this.field1166;
                int var8 = arg1.method343();
                this.method418(var8, false);
                this.field1163 = var4;
                this.field1164 = var5;
                this.field1165 = var6;
                this.field1166 = var7;
                this.field1167 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(IZ)V")
    private void method418(int arg0, boolean arg1) {
        if (arg0 == 16711935) {
            arg0 = 0;
        }
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
        this.field1163 = (int) (var19 * 256.0D);
        this.field1164 = (int) (var15 * 256.0D);
        this.field1165 = (int) (var17 * 256.0D);
        if (this.field1164 < 0) {
            this.field1164 = 0;
        } else if (this.field1164 > 255) {
            this.field1164 = 255;
        }
        if (this.field1165 < 0) {
            this.field1165 = 0;
        } else if (this.field1165 > 255) {
            this.field1165 = 255;
        }
        if (var17 > 0.5D) {
            this.field1167 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1167 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1167 < 1) {
            this.field1167 = 1;
        }
        this.field1166 = (int) ((double) this.field1167 * var19);
        int var21 = this.field1163 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1164 + (int) (Math.random() * 48.0D) - 24;
        if (arg1) {
            this.field1155 = -23;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1165 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1168 = this.method419(var21, var22, var23);
    }

    @OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(III)I")
    private final int method419(int arg0, int arg1, int arg2) {
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
