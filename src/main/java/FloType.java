import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private int field1104 = 77;

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1109 = -1;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Z")
    public boolean field1110 = false;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1111 = true;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "kc", name = "i", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "kc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1107;

    @OriginalMember(owner = "kc", name = "c", descriptor = "[Lkc;")
    public static FloType[] field1106;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZLxb;)V")
    public static void method371(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("flo.dat", null), (byte) -93);
        field1105 = var2.method231();
        if (arg0) {
            return;
        }
        if (field1106 == null) {
            field1106 = new FloType[field1105];
        }
        for (int var3 = 0; var3 < field1105; var3++) {
            if (field1106[var3] == null) {
                field1106[var3] = new FloType();
            }
            field1106[var3].method372(210, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILlb;)V")
    public void method372(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method229();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1108 = arg1.method233();
                this.method373(false, this.field1108);
            } else if (var3 == 2) {
                this.field1109 = arg1.method229();
            } else if (var3 == 3) {
                this.field1110 = true;
            } else if (var3 == 5) {
                this.field1111 = false;
            } else if (var3 == 6) {
                this.field1107 = arg1.method236();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZI)V")
    private void method373(boolean arg0, int arg1) {
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
        this.field1112 = (int) (var19 * 256.0D);
        this.field1113 = (int) (var15 * 256.0D);
        if (arg0) {
            this.field1104 = 114;
        }
        this.field1114 = (int) (var17 * 256.0D);
        if (this.field1113 < 0) {
            this.field1113 = 0;
        } else if (this.field1113 > 255) {
            this.field1113 = 255;
        }
        if (this.field1114 < 0) {
            this.field1114 = 0;
        } else if (this.field1114 > 255) {
            this.field1114 = 255;
        }
        if (var17 > 0.5D) {
            this.field1116 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1116 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1116 < 1) {
            this.field1116 = 1;
        }
        this.field1115 = (int) ((double) this.field1116 * var19);
        int var21 = this.field1112 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1113 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1114 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1117 = this.method374(var21, var22, var23);
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
