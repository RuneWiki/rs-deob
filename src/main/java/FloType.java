import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class FloType {

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    public int field1049 = -1;

    @OriginalMember(owner = "jc", name = "f", descriptor = "Z")
    public boolean field1050 = false;

    @OriginalMember(owner = "jc", name = "g", descriptor = "Z")
    public boolean field1051 = true;

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "jc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1052;

    @OriginalMember(owner = "jc", name = "c", descriptor = "[Ljc;")
    public static FloType[] field1047;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lyb;I)V")
    public static void method362(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("flo.dat", null), true);
        if (arg1 <= 0) {
            return;
        }
        field1046 = var2.method233();
        if (field1047 == null) {
            field1047 = new FloType[field1046];
        }
        for (int var3 = 0; var3 < field1046; var3++) {
            if (field1047[var3] == null) {
                field1047[var3] = new FloType();
            }
            field1047[var3].method363(3251, var2);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILmb;)V")
    public void method363(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method231();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1048 = arg1.method235();
                this.method364(this.field1048, true);
            } else if (var3 == 2) {
                this.field1049 = arg1.method231();
            } else if (var3 == 3) {
                this.field1050 = true;
            } else if (var3 == 5) {
                this.field1051 = false;
            } else if (var3 == 6) {
                this.field1052 = arg1.method238();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZ)V")
    private void method364(int arg0, boolean arg1) {
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
        if (!arg1) {
            this.field1045 = -230;
        }
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
        this.field1053 = (int) (var19 * 256.0D);
        this.field1054 = (int) (var15 * 256.0D);
        this.field1055 = (int) (var17 * 256.0D);
        if (this.field1054 < 0) {
            this.field1054 = 0;
        } else if (this.field1054 > 255) {
            this.field1054 = 255;
        }
        if (this.field1055 < 0) {
            this.field1055 = 0;
        } else if (this.field1055 > 255) {
            this.field1055 = 255;
        }
        if (var17 > 0.5D) {
            this.field1057 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1057 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1057 < 1) {
            this.field1057 = 1;
        }
        this.field1056 = (int) ((double) this.field1057 * var19);
        int var21 = this.field1053 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1054 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1055 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1058 = this.method365(var21, var22, var23);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)I")
    private final int method365(int arg0, int arg1, int arg2) {
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
