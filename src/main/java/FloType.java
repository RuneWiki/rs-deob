import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class FloType {

    @OriginalMember(owner = "fc", name = "f", descriptor = "I")
    public int field936 = -1;

    @OriginalMember(owner = "fc", name = "g", descriptor = "Z")
    public boolean field937 = false;

    @OriginalMember(owner = "fc", name = "h", descriptor = "Z")
    public boolean field938 = true;

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private static int field931 = 473;

    @OriginalMember(owner = "fc", name = "b", descriptor = "I")
    private static int field932 = -546;

    @OriginalMember(owner = "fc", name = "c", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "fc", name = "k", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "fc", name = "o", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "fc", name = "i", descriptor = "Ljava/lang/String;")
    public String field939;

    @OriginalMember(owner = "fc", name = "d", descriptor = "[Lfc;")
    public static FloType[] field934;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lub;I)V")
    public static void method314(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(363, arg0.read("flo.dat", null, (byte) 2));
        field933 = var2.method218();
        int var3 = 35 / arg1;
        if (field934 == null) {
            field934 = new FloType[field933];
        }
        for (int var4 = 0; var4 < field933; var4++) {
            if (field934[var4] == null) {
                field934[var4] = new FloType();
            }
            field934[var4].method315(false, var2);
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ZLkb;)V")
    public void method315(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method216();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field935 = arg1.method220();
                this.method316(field932, this.field935);
            } else if (var3 == 2) {
                this.field936 = arg1.method216();
            } else if (var3 == 3) {
                this.field937 = true;
            } else if (var3 == 5) {
                this.field938 = false;
            } else if (var3 == 6) {
                this.field939 = arg1.method223();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II)V")
    private void method316(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var6 < var3) {
            var10 = var6;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var6 > var3) {
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
            if (var3 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var6) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field940 = (int) (var20 * 256.0D);
        this.field941 = (int) (var16 * 256.0D);
        this.field942 = (int) (var18 * 256.0D);
        if (this.field941 < 0) {
            this.field941 = 0;
        } else if (this.field941 > 255) {
            this.field941 = 255;
        }
        if (this.field942 < 0) {
            this.field942 = 0;
        } else if (this.field942 > 255) {
            this.field942 = 255;
        }
        if (var18 > 0.5D) {
            this.field944 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field944 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field944 < 1) {
            this.field944 = 1;
        }
        this.field943 = (int) ((double) this.field944 * var20);
        int var22 = this.field940 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field941 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field942 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field945 = this.method317(var22, var23, var24);
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(III)I")
    private final int method317(int arg0, int arg1, int arg2) {
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
