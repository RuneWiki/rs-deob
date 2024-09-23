import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class FloType {

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1100 = -1;

    @OriginalMember(owner = "lc", name = "f", descriptor = "Z")
    public boolean field1101 = false;

    @OriginalMember(owner = "lc", name = "g", descriptor = "Z")
    public boolean field1102 = true;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private static int field1096 = 6771;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "lc", name = "i", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "lc", name = "j", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "lc", name = "k", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "lc", name = "l", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "lc", name = "m", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "lc", name = "n", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "lc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1103;

    @OriginalMember(owner = "lc", name = "c", descriptor = "[Llc;")
    public static FloType[] field1098;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILyb;)V")
    public static void method368(int arg0, Jagfile arg1) {
        if (field1096 != arg0) {
            return;
        }
        Packet var2 = new Packet(arg1.method298("flo.dat", null), true);
        field1097 = var2.method230();
        if (field1098 == null) {
            field1098 = new FloType[field1097];
        }
        for (int var3 = 0; var3 < field1097; var3++) {
            if (field1098[var3] == null) {
                field1098[var3] = new FloType();
            }
            field1098[var3].method369((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(BLmb;)V")
    public void method369(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method228();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1099 = arg1.method232();
                this.method370(this.field1099, -930);
            } else if (var3 == 2) {
                this.field1100 = arg1.method228();
            } else if (var3 == 3) {
                this.field1101 = true;
            } else if (var3 == 5) {
                this.field1102 = false;
            } else if (var3 == 6) {
                this.field1103 = arg1.method235();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(II)V")
    private void method370(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var5 < var3) {
            var10 = var5;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var5 > var3) {
            var12 = var5;
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
            if (var3 == var12) {
                var14 = (var5 - var8) / (var12 - var10);
            } else if (var5 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var5) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field1104 = (int) (var20 * 256.0D);
        this.field1105 = (int) (var16 * 256.0D);
        this.field1106 = (int) (var18 * 256.0D);
        if (this.field1105 < 0) {
            this.field1105 = 0;
        } else if (this.field1105 > 255) {
            this.field1105 = 255;
        }
        if (this.field1106 < 0) {
            this.field1106 = 0;
        } else if (this.field1106 > 255) {
            this.field1106 = 255;
        }
        if (var18 > 0.5D) {
            this.field1108 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1108 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1108 < 1) {
            this.field1108 = 1;
        }
        this.field1107 = (int) ((double) this.field1108 * var20);
        int var22 = this.field1104 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1105 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1106 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1109 = this.method371(var22, var23, var24);
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(III)I")
    private final int method371(int arg0, int arg1, int arg2) {
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
