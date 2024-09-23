import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class FloType {

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    public int field853 = -1;

    @OriginalMember(owner = "cc", name = "e", descriptor = "Z")
    public boolean field854 = false;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Z")
    public boolean field855 = true;

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "cc", name = "l", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Ljava/lang/String;")
    public String field856;

    @OriginalMember(owner = "cc", name = "b", descriptor = "[Lcc;")
    public static FloType[] field851;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLub;)V")
    public static void method284(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "flo.dat"), 4);
        field850 = var2.method203();
        if (!arg0) {
            return;
        }
        if (field851 == null) {
            field851 = new FloType[field850];
        }
        for (int var3 = 0; var3 < field850; var3++) {
            if (field851[var3] == null) {
                field851[var3] = new FloType();
            }
            field851[var3].method285(213, var2);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILkb;)V")
    public void method285(int arg0, Packet arg1) {
        int var3 = 8 / arg0;
        while (true) {
            int var4 = arg1.method201();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field852 = arg1.method205();
                this.method286((byte) 8, this.field852);
            } else if (var4 == 2) {
                this.field853 = arg1.method201();
            } else if (var4 == 3) {
                this.field854 = true;
            } else if (var4 == 5) {
                this.field855 = false;
            } else if (var4 == 6) {
                this.field856 = arg1.method208();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BI)V")
    private void method286(byte arg0, int arg1) {
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
        this.field857 = (int) (var19 * 256.0D);
        if (arg0 != 8) {
            return;
        }
        this.field858 = (int) (var15 * 256.0D);
        this.field859 = (int) (var17 * 256.0D);
        if (this.field858 < 0) {
            this.field858 = 0;
        } else if (this.field858 > 255) {
            this.field858 = 255;
        }
        if (this.field859 < 0) {
            this.field859 = 0;
        } else if (this.field859 > 255) {
            this.field859 = 255;
        }
        if (var17 > 0.5D) {
            this.field861 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field861 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field861 < 1) {
            this.field861 = 1;
        }
        this.field860 = (int) ((double) this.field861 * var19);
    }
}
