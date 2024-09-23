import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1097 = -1;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Z")
    public boolean field1098 = false;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1099 = true;

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private static int field1092 = 1000;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "kc", name = "i", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "kc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1095;

    @OriginalMember(owner = "kc", name = "c", descriptor = "[Lkc;")
    public static FloType[] field1094;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lxb;I)V")
    public static void method371(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(field1092, arg0.method299("flo.dat", null));
        field1093 = var2.method231();
        if (arg1 < 0 || arg1 > 0) {
            field1092 = -301;
        }
        if (field1094 == null) {
            field1094 = new FloType[field1093];
        }
        for (int var3 = 0; var3 < field1093; var3++) {
            if (field1094[var3] == null) {
                field1094[var3] = new FloType();
            }
            field1094[var3].method372(8, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILlb;)V")
    public void method372(int arg0, Packet arg1) {
        if (arg0 != 8) {
            field1092 = 189;
        }
        while (true) {
            int var3 = arg1.method229();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1096 = arg1.method233();
                this.method373(372, this.field1096);
            } else if (var3 == 2) {
                this.field1097 = arg1.method229();
            } else if (var3 == 3) {
                this.field1098 = true;
            } else if (var3 == 5) {
                this.field1099 = false;
            } else if (var3 == 6) {
                this.field1095 = arg1.method236();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(II)V")
    private void method373(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        double var4 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var4;
        if (var6 < var4) {
            var10 = var6;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var4;
        if (var6 > var4) {
            var12 = var6;
        }
        if (var8 > var12) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
            if (var4 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var4) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var4 - var6) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field1100 = (int) (var20 * 256.0D);
        this.field1101 = (int) (var16 * 256.0D);
        this.field1102 = (int) (var18 * 256.0D);
        if (this.field1101 < 0) {
            this.field1101 = 0;
        } else if (this.field1101 > 255) {
            this.field1101 = 255;
        }
        if (this.field1102 < 0) {
            this.field1102 = 0;
        } else if (this.field1102 > 255) {
            this.field1102 = 255;
        }
        if (var18 > 0.5D) {
            this.field1104 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1104 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1104 < 1) {
            this.field1104 = 1;
        }
        this.field1103 = (int) ((double) this.field1104 * var20);
        int var22 = this.field1100 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1101 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1102 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1105 = this.method374(var22, var23, var24);
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
