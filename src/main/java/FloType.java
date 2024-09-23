import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1075 = -1;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Z")
    public boolean field1076 = false;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1077 = true;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    private static int field1071 = 11798;

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "kc", name = "i", descriptor = "Ljava/lang/String;")
    public String field1078;

    @OriginalMember(owner = "kc", name = "d", descriptor = "[Lkc;")
    public static FloType[] field1073;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lyb;Z)V")
    public static void method373(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(arg0.method309("flo.dat", null), 337);
        field1072 = var2.method241();
        if (!arg1) {
            field1071 = -427;
        }
        if (field1073 == null) {
            field1073 = new FloType[field1072];
        }
        for (int var3 = 0; var3 < field1072; var3++) {
            if (field1073[var3] == null) {
                field1073[var3] = new FloType();
            }
            field1073[var3].method374(0, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILmb;)V")
    public void method374(int arg0, Packet arg1) {
        if (arg0 != 0) {
            this.field1070 = -480;
        }
        while (true) {
            int var3 = arg1.method239();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1074 = arg1.method243();
                this.method375((byte) 4, this.field1074);
            } else if (var3 == 2) {
                this.field1075 = arg1.method239();
            } else if (var3 == 3) {
                this.field1076 = true;
            } else if (var3 == 5) {
                this.field1077 = false;
            } else if (var3 == 6) {
                this.field1078 = arg1.method246();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(BI)V")
    private void method375(byte arg0, int arg1) {
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
        if (arg0 != 4) {
            return;
        }
        boolean var13 = false;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var18 < 0.5D) {
                var16 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var16 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var14 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var14 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var14 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field1079 = (int) (var20 * 256.0D);
        this.field1080 = (int) (var16 * 256.0D);
        this.field1081 = (int) (var18 * 256.0D);
        if (this.field1080 < 0) {
            this.field1080 = 0;
        } else if (this.field1080 > 255) {
            this.field1080 = 255;
        }
        if (this.field1081 < 0) {
            this.field1081 = 0;
        } else if (this.field1081 > 255) {
            this.field1081 = 255;
        }
        if (var18 > 0.5D) {
            this.field1083 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1083 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1083 < 1) {
            this.field1083 = 1;
        }
        this.field1082 = (int) ((double) this.field1083 * var20);
        int var22 = this.field1079 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1080 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1081 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1084 = this.method376(var22, var23, var24);
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(III)I")
    private final int method376(int arg0, int arg1, int arg2) {
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
