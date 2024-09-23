import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NEDSEYSI")
public class class43 {

    @OriginalMember(owner = "NEDSEYSI", name = "a", descriptor = "Z")
    private boolean field1061 = false;

    @OriginalMember(owner = "NEDSEYSI", name = "g", descriptor = "I")
    public int field1067 = -1;

    @OriginalMember(owner = "NEDSEYSI", name = "h", descriptor = "Z")
    public boolean field1068 = false;

    @OriginalMember(owner = "NEDSEYSI", name = "i", descriptor = "Z")
    public boolean field1069 = true;

    @OriginalMember(owner = "NEDSEYSI", name = "b", descriptor = "I")
    private static int field1062 = 4;

    @OriginalMember(owner = "NEDSEYSI", name = "c", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "NEDSEYSI", name = "f", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "NEDSEYSI", name = "j", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "NEDSEYSI", name = "k", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "NEDSEYSI", name = "l", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "NEDSEYSI", name = "m", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "NEDSEYSI", name = "n", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "NEDSEYSI", name = "o", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "NEDSEYSI", name = "e", descriptor = "Ljava/lang/String;")
    public String field1065;

    @OriginalMember(owner = "NEDSEYSI", name = "d", descriptor = "[LNEDSEYSI;")
    public static class43[] field1064;

    @OriginalMember(owner = "NEDSEYSI", name = "a", descriptor = "(ILHRXSNEYZ;)V")
    public static void method381(int arg0, class26 arg1) {
        if (arg0 <= 0) {
            field1062 = -184;
        }
        class31 var2 = new class31(arg1.method289("flo.dat", null), 8);
        field1063 = var2.method308();
        if (field1064 == null) {
            field1064 = new class43[field1063];
        }
        for (int var3 = 0; var3 < field1063; var3++) {
            if (field1064[var3] == null) {
                field1064[var3] = new class43();
            }
            field1064[var3].method382(var2, 0);
        }
    }

    @OriginalMember(owner = "NEDSEYSI", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public void method382(class31 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method306();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1066 = arg0.method310();
                this.method383(this.field1066, -38024);
            } else if (var3 == 2) {
                this.field1067 = arg0.method306();
            } else if (var3 == 3) {
                this.field1068 = true;
            } else if (var3 == 5) {
                this.field1069 = false;
            } else if (var3 == 6) {
                this.field1065 = arg0.method313();
            } else if (var3 == 7) {
                int var4 = this.field1070;
                int var5 = this.field1071;
                int var6 = this.field1072;
                int var7 = this.field1073;
                int var8 = arg0.method310();
                this.method383(var8, -38024);
                this.field1070 = var4;
                this.field1071 = var5;
                this.field1072 = var6;
                this.field1073 = var7;
                this.field1074 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "NEDSEYSI", name = "a", descriptor = "(II)V")
    private void method383(int arg0, int arg1) {
        if (arg1 != -38024) {
            this.field1061 = !this.field1061;
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
        this.field1070 = (int) (var19 * 256.0D);
        this.field1071 = (int) (var15 * 256.0D);
        this.field1072 = (int) (var17 * 256.0D);
        if (this.field1071 < 0) {
            this.field1071 = 0;
        } else if (this.field1071 > 255) {
            this.field1071 = 255;
        }
        if (this.field1072 < 0) {
            this.field1072 = 0;
        } else if (this.field1072 > 255) {
            this.field1072 = 255;
        }
        if (var17 > 0.5D) {
            this.field1074 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1074 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1074 < 1) {
            this.field1074 = 1;
        }
        this.field1073 = (int) ((double) this.field1074 * var19);
        int var21 = this.field1070 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1071 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1072 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1075 = this.method384(var21, var22, var23);
    }

    @OriginalMember(owner = "NEDSEYSI", name = "a", descriptor = "(III)I")
    private final int method384(int arg0, int arg1, int arg2) {
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
