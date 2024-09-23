import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "a", descriptor = "Z")
    private boolean field1108 = false;

    @OriginalMember(owner = "kc", name = "g", descriptor = "I")
    public int field1114 = -1;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1115 = false;

    @OriginalMember(owner = "kc", name = "i", descriptor = "Z")
    public boolean field1116 = true;

    @OriginalMember(owner = "kc", name = "b", descriptor = "Z")
    private static boolean field1109 = true;

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "kc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1112;

    @OriginalMember(owner = "kc", name = "d", descriptor = "[Lkc;")
    public static FloType[] field1111;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZLxb;)V")
    public static void method367(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method297("flo.dat", null), 15787);
        field1110 = var2.method229();
        if (field1111 == null) {
            field1111 = new FloType[field1110];
        }
        for (int var3 = 0; var3 < field1110; var3++) {
            if (field1111[var3] == null) {
                field1111[var3] = new FloType();
            }
            field1111[var3].method368(false, var2);
        }
        if (!arg0) {
            field1109 = !field1109;
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZLlb;)V")
    public void method368(boolean arg0, Packet arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method227();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1113 = arg1.method231();
                this.method369(this.field1113, true);
            } else if (var4 == 2) {
                this.field1114 = arg1.method227();
            } else if (var4 == 3) {
                this.field1115 = true;
            } else if (var4 == 5) {
                this.field1116 = false;
            } else if (var4 == 6) {
                this.field1112 = arg1.method234();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IZ)V")
    private void method369(int arg0, boolean arg1) {
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
        if (!arg1) {
            return;
        }
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
        this.field1122 = this.method370(var21, var22, var23);
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(III)I")
    private final int method370(int arg0, int arg1, int arg2) {
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
