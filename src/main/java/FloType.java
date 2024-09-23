import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class FloType {

    @OriginalMember(owner = "bc", name = "e", descriptor = "I")
    public int field840 = -1;

    @OriginalMember(owner = "bc", name = "f", descriptor = "Z")
    public boolean field841 = false;

    @OriginalMember(owner = "bc", name = "g", descriptor = "Z")
    public boolean field842 = true;

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private static int field836;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "bc", name = "d", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "bc", name = "h", descriptor = "Ljava/lang/String;")
    public String field843;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[Lbc;")
    public static FloType[] field838;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Ltb;I)V")
    public static void method268(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method225(0, null, "flo.dat"), (byte) 63);
        field837 = var2.method187();
        if (field838 == null) {
            field838 = new FloType[field837];
        }
        for (int var3 = 0; var3 < field837; var3++) {
            if (field838[var3] == null) {
                field838[var3] = new FloType();
            }
            field838[var3].method269((byte) 4, var2);
        }
        if (arg1 == -47511) {
            ;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BLjb;)V")
    public void method269(byte arg0, Packet arg1) {
        if (arg0 != 4) {
            field836 = -239;
        }
        while (true) {
            int var3 = arg1.method185();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field839 = arg1.method189();
                this.method270(this.field839, 40841);
            } else if (var3 == 2) {
                this.field840 = arg1.method185();
            } else if (var3 == 3) {
                this.field841 = true;
            } else if (var3 == 5) {
                this.field842 = false;
            } else if (var3 == 6) {
                this.field843 = arg1.method192();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II)V")
    private void method270(int arg0, int arg1) {
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
        this.field844 = (int) (var19 * 256.0D);
        this.field845 = (int) (var15 * 256.0D);
        if (arg1 != 40841) {
            field836 = 443;
        }
        this.field846 = (int) (var17 * 256.0D);
        if (this.field845 < 0) {
            this.field845 = 0;
        } else if (this.field845 > 255) {
            this.field845 = 255;
        }
        if (this.field846 < 0) {
            this.field846 = 0;
        } else if (this.field846 > 255) {
            this.field846 = 255;
        }
        if (var17 > 0.5D) {
            this.field848 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field848 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field848 < 1) {
            this.field848 = 1;
        }
        this.field847 = (int) ((double) this.field848 * var19);
    }
}
