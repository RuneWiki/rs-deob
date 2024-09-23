import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class FloType {

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field934 = -1;

    @OriginalMember(owner = "fc", name = "f", descriptor = "Z")
    public boolean field935 = false;

    @OriginalMember(owner = "fc", name = "g", descriptor = "Z")
    public boolean field936 = true;

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private static int field930 = 3;

    @OriginalMember(owner = "fc", name = "b", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "fc", name = "i", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "fc", name = "k", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "fc", name = "h", descriptor = "Ljava/lang/String;")
    public String field937;

    @OriginalMember(owner = "fc", name = "c", descriptor = "[Lfc;")
    public static FloType[] field932;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lub;I)V")
    public static void method307(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(0, arg0.method250("flo.dat", null, 8));
        field931 = var2.method211();
        if (field932 == null) {
            field932 = new FloType[field931];
        }
        for (int var3 = 0; var3 < field931; var3++) {
            if (field932[var3] == null) {
                field932[var3] = new FloType();
            }
            field932[var3].method308(var2, 0);
        }
        if (field930 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lkb;I)V")
    public void method308(Packet arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method209();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field933 = arg0.method213();
                this.method309(this.field933, (byte) 8);
            } else if (var3 == 2) {
                this.field934 = arg0.method209();
            } else if (var3 == 3) {
                this.field935 = true;
            } else if (var3 == 5) {
                this.field936 = false;
            } else if (var3 == 6) {
                this.field937 = arg0.method216();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(IB)V")
    private void method309(int arg0, byte arg1) {
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
        if (arg1 != 8) {
            return;
        }
        this.field938 = (int) (var19 * 256.0D);
        this.field939 = (int) (var15 * 256.0D);
        this.field940 = (int) (var17 * 256.0D);
        if (this.field939 < 0) {
            this.field939 = 0;
        } else if (this.field939 > 255) {
            this.field939 = 255;
        }
        if (this.field940 < 0) {
            this.field940 = 0;
        } else if (this.field940 > 255) {
            this.field940 = 255;
        }
        if (var17 > 0.5D) {
            this.field942 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field942 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field942 < 1) {
            this.field942 = 1;
        }
        this.field941 = (int) ((double) this.field942 * var19);
    }
}
