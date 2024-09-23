import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1121 = -1;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Z")
    public boolean field1122 = false;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1123 = true;

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "kc", name = "i", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "kc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1119;

    @OriginalMember(owner = "kc", name = "c", descriptor = "[Lkc;")
    public static FloType[] field1118;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILxb;)V")
    public static void method371(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(false, arg1.method299("flo.dat", null));
        field1117 = var2.method231();
        if (field1118 == null) {
            field1118 = new FloType[field1117];
        }
        for (int var3 = 0; var3 < field1117; var3++) {
            if (field1118[var3] == null) {
                field1118[var3] = new FloType();
            }
            field1118[var3].method372(var2, false);
        }
        if (arg0 == 35102) {
            ;
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Llb;Z)V")
    public void method372(Packet arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg0.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1120 = arg0.method233();
                this.method373(-881, this.field1120);
            } else if (var4 == 2) {
                this.field1121 = arg0.method229();
            } else if (var4 == 3) {
                this.field1122 = true;
            } else if (var4 == 5) {
                this.field1123 = false;
            } else if (var4 == 6) {
                this.field1119 = arg0.method236();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(II)V")
    private void method373(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        while (arg0 >= 0) {
            this.field1116 = -395;
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
        this.field1124 = (int) (var19 * 256.0D);
        this.field1125 = (int) (var15 * 256.0D);
        this.field1126 = (int) (var17 * 256.0D);
        if (this.field1125 < 0) {
            this.field1125 = 0;
        } else if (this.field1125 > 255) {
            this.field1125 = 255;
        }
        if (this.field1126 < 0) {
            this.field1126 = 0;
        } else if (this.field1126 > 255) {
            this.field1126 = 255;
        }
        if (var17 > 0.5D) {
            this.field1128 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1128 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1128 < 1) {
            this.field1128 = 1;
        }
        this.field1127 = (int) ((double) this.field1128 * var19);
        int var21 = this.field1124 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1125 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1126 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1129 = this.method374(var21, var22, var23);
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
