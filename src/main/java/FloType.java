import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class FloType {

    @OriginalMember(owner = "fc", name = "h", descriptor = "I")
    public int field950 = -1;

    @OriginalMember(owner = "fc", name = "i", descriptor = "Z")
    public boolean field951 = false;

    @OriginalMember(owner = "fc", name = "j", descriptor = "Z")
    public boolean field952 = true;

    @OriginalMember(owner = "fc", name = "a", descriptor = "B")
    private static byte field943 = 8;

    @OriginalMember(owner = "fc", name = "b", descriptor = "B")
    private static byte field944 = 4;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    private static int field946 = 33182;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "fc", name = "g", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "fc", name = "o", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "fc", name = "p", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "fc", name = "k", descriptor = "Ljava/lang/String;")
    public String field953;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    private static boolean field945;

    @OriginalMember(owner = "fc", name = "f", descriptor = "[Lfc;")
    public static FloType[] field948;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ILub;)V")
    public static void method307(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field944, "flo.dat", null), 0);
        field947 = var2.method211();
        if (arg0 < 4 || arg0 > 4) {
            field945 = !field945;
        }
        if (field948 == null) {
            field948 = new FloType[field947];
        }
        for (int var3 = 0; var3 < field947; var3++) {
            if (field948[var3] == null) {
                field948[var3] = new FloType();
            }
            field948[var3].method308(field943, var2);
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(BLkb;)V")
    public void method308(byte arg0, Packet arg1) {
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            field946 = -246;
        }
        while (true) {
            int var4 = arg1.method209();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field949 = arg1.method213();
                this.method309(0, this.field949);
            } else if (var4 == 2) {
                this.field950 = arg1.method209();
            } else if (var4 == 3) {
                this.field951 = true;
            } else if (var4 == 5) {
                this.field952 = false;
            } else if (var4 == 6) {
                this.field953 = arg1.method216();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II)V")
    private void method309(int arg0, int arg1) {
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
        if (arg0 != 0) {
            return;
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
        this.field954 = (int) (var19 * 256.0D);
        this.field955 = (int) (var15 * 256.0D);
        this.field956 = (int) (var17 * 256.0D);
        if (this.field955 < 0) {
            this.field955 = 0;
        } else if (this.field955 > 255) {
            this.field955 = 255;
        }
        if (this.field956 < 0) {
            this.field956 = 0;
        } else if (this.field956 > 255) {
            this.field956 = 255;
        }
        if (var17 > 0.5D) {
            this.field958 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field958 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field958 < 1) {
            this.field958 = 1;
        }
        this.field957 = (int) ((double) this.field958 * var19);
    }
}
