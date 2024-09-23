import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1114 = -1;

    @OriginalMember(owner = "kc", name = "f", descriptor = "Z")
    public boolean field1115 = false;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Z")
    public boolean field1116 = true;

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "kc", name = "d", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "kc", name = "h", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "kc", name = "i", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "kc", name = "c", descriptor = "Ljava/lang/String;")
    public String field1112;

    @OriginalMember(owner = "kc", name = "b", descriptor = "[Lkc;")
    public static FloType[] field1111;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lxb;Z)V")
    public static void method371(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(-49365, arg0.method299("flo.dat", null));
        field1110 = var2.method231();
        if (arg1) {
            return;
        }
        if (field1111 == null) {
            field1111 = new FloType[field1110];
        }
        for (int var3 = 0; var3 < field1110; var3++) {
            if (field1111[var3] == null) {
                field1111[var3] = new FloType();
            }
            field1111[var3].method372(var2, false);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Llb;Z)V")
    public void method372(Packet arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method229();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1113 = arg0.method233();
                this.method373(this.field1113, 155);
            } else if (var3 == 2) {
                this.field1114 = arg0.method229();
            } else if (var3 == 3) {
                this.field1115 = true;
            } else if (var3 == 5) {
                this.field1116 = false;
            } else if (var3 == 6) {
                this.field1112 = arg0.method236();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(II)V")
    private void method373(int arg0, int arg1) {
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
        this.field1117 = (int) (var19 * 256.0D);
        this.field1118 = (int) (var15 * 256.0D);
        this.field1119 = (int) (var17 * 256.0D);
        if (this.field1118 < 0) {
            this.field1118 = 0;
        } else if (this.field1118 > 255) {
            this.field1118 = 255;
        }
        if (this.field1119 < 0) {
            this.field1119 = 0;
        } else if (this.field1119 > 255) {
            this.field1119 = 255;
        }
        if (var17 > 0.5D) {
            this.field1121 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1121 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1121 < 1) {
            this.field1121 = 1;
        }
        this.field1120 = (int) ((double) this.field1121 * var19);
        int var21 = this.field1117 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1118 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1119 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1122 = this.method374(var21, var22, var23);
        int var24 = 3 / arg1;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(III)I")
    private final int method374(int arg0, int arg1, int arg2) {
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
