import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class FloType {

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "jc", name = "e", descriptor = "Z")
    public boolean field1039 = false;

    @OriginalMember(owner = "jc", name = "f", descriptor = "Z")
    public boolean field1040 = true;

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "jc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1041;

    @OriginalMember(owner = "jc", name = "b", descriptor = "[Ljc;")
    public static FloType[] field1036;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lyb;B)V")
    public static void method358(Jagfile arg0, byte arg1) {
        Packet var2 = new Packet(699, arg0.method295("flo.dat", null));
        field1035 = var2.method233();
        if (field1036 == null) {
            field1036 = new FloType[field1035];
        }
        for (int var3 = 0; var3 < field1035; var3++) {
            if (field1036[var3] == null) {
                field1036[var3] = new FloType();
            }
            field1036[var3].method359(false, var2);
        }
        if (arg1 != 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZLmb;)V")
    public void method359(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method231();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1037 = arg1.method235();
                this.method360(this.field1037, (byte) 82);
            } else if (var3 == 2) {
                this.field1038 = arg1.method231();
            } else if (var3 == 3) {
                this.field1039 = true;
            } else if (var3 == 5) {
                this.field1040 = false;
            } else if (var3 == 6) {
                this.field1041 = arg1.method238();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IB)V")
    private void method360(int arg0, byte arg1) {
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
        this.field1042 = (int) (var19 * 256.0D);
        this.field1043 = (int) (var15 * 256.0D);
        this.field1044 = (int) (var17 * 256.0D);
        if (this.field1043 < 0) {
            this.field1043 = 0;
        } else if (this.field1043 > 255) {
            this.field1043 = 255;
        }
        if (this.field1044 < 0) {
            this.field1044 = 0;
        } else if (this.field1044 > 255) {
            this.field1044 = 255;
        }
        if (var17 > 0.5D) {
            this.field1046 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1046 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1046 < 1) {
            this.field1046 = 1;
        }
        this.field1045 = (int) ((double) this.field1046 * var19);
        int var21 = this.field1042 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1043 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1044 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1047 = this.method361(var21, var22, var23);
        if (arg1 == 82) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)I")
    private final int method361(int arg0, int arg1, int arg2) {
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
