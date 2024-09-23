import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class FloType {

    @OriginalMember(owner = "fc", name = "f", descriptor = "I")
    public int field933 = -1;

    @OriginalMember(owner = "fc", name = "g", descriptor = "Z")
    public boolean field934 = false;

    @OriginalMember(owner = "fc", name = "h", descriptor = "Z")
    public boolean field935 = true;

    @OriginalMember(owner = "fc", name = "a", descriptor = "B")
    private static byte field928 = 6;

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    private static boolean field929 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "fc", name = "k", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "fc", name = "i", descriptor = "Ljava/lang/String;")
    public String field936;

    @OriginalMember(owner = "fc", name = "d", descriptor = "[Lfc;")
    public static FloType[] field931;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ILub;)V")
    public static void method306(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method249("flo.dat", true, null), field929);
        field930 = var2.method210();
        if (arg0 != 0) {
            return;
        }
        if (field931 == null) {
            field931 = new FloType[field930];
        }
        for (int var3 = 0; var3 < field930; var3++) {
            if (field931[var3] == null) {
                field931[var3] = new FloType();
            }
            field931[var3].method307(field928, var2);
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(BLkb;)V")
    public void method307(byte arg0, Packet arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method208();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field932 = arg1.method212();
                this.method308(0, this.field932);
            } else if (var5 == 2) {
                this.field933 = arg1.method208();
            } else if (var5 == 3) {
                this.field934 = true;
            } else if (var5 == 5) {
                this.field935 = false;
            } else if (var5 == 6) {
                this.field936 = arg1.method215();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II)V")
    private void method308(int arg0, int arg1) {
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
        this.field937 = (int) (var19 * 256.0D);
        this.field938 = (int) (var15 * 256.0D);
        this.field939 = (int) (var17 * 256.0D);
        if (arg0 != 0) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        if (this.field938 < 0) {
            this.field938 = 0;
        } else if (this.field938 > 255) {
            this.field938 = 255;
        }
        if (this.field939 < 0) {
            this.field939 = 0;
        } else if (this.field939 > 255) {
            this.field939 = 255;
        }
        if (var17 > 0.5D) {
            this.field941 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field941 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field941 < 1) {
            this.field941 = 1;
        }
        this.field940 = (int) ((double) this.field941 * var19);
    }
}
