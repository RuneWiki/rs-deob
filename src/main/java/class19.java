import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IMXTJGZE")
public class class19 {

    @OriginalMember(owner = "IMXTJGZE", name = "c", descriptor = "I")
    private int field859 = 956;

    @OriginalMember(owner = "IMXTJGZE", name = "h", descriptor = "I")
    public int field864 = -1;

    @OriginalMember(owner = "IMXTJGZE", name = "i", descriptor = "Z")
    public boolean field865 = false;

    @OriginalMember(owner = "IMXTJGZE", name = "j", descriptor = "Z")
    public boolean field866 = true;

    @OriginalMember(owner = "IMXTJGZE", name = "a", descriptor = "I")
    private static int field857 = -302;

    @OriginalMember(owner = "IMXTJGZE", name = "b", descriptor = "I")
    private static int field858;

    @OriginalMember(owner = "IMXTJGZE", name = "d", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "IMXTJGZE", name = "g", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "IMXTJGZE", name = "k", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "IMXTJGZE", name = "l", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "IMXTJGZE", name = "m", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "IMXTJGZE", name = "n", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "IMXTJGZE", name = "o", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "IMXTJGZE", name = "p", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "IMXTJGZE", name = "f", descriptor = "Ljava/lang/String;")
    public String field862;

    @OriginalMember(owner = "IMXTJGZE", name = "e", descriptor = "[LIMXTJGZE;")
    public static class19[] field861;

    @OriginalMember(owner = "IMXTJGZE", name = "a", descriptor = "(LLYZBHNJP;I)V")
    public static void method221(class31 arg0, int arg1) {
        class69 var2 = new class69(arg0.method290("flo.dat", null), field857);
        field860 = var2.method549();
        if (field861 == null) {
            field861 = new class19[field860];
        }
        for (int var3 = 0; var3 < field860; var3++) {
            if (field861[var3] == null) {
                field861[var3] = new class19();
            }
            field861[var3].method222(var2, (byte) 5);
        }
        if (arg1 != 0) {
            field858 = 242;
        }
    }

    @OriginalMember(owner = "IMXTJGZE", name = "a", descriptor = "(LZOMNSJJM;B)V")
    public void method222(class69 arg0, byte arg1) {
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method547();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field863 = arg0.method551();
                this.method223(this.field863, this.field859);
            } else if (var3 == 2) {
                this.field864 = arg0.method547();
            } else if (var3 == 3) {
                this.field865 = true;
            } else if (var3 == 5) {
                this.field866 = false;
            } else if (var3 == 6) {
                this.field862 = arg0.method554();
            } else if (var3 == 7) {
                int var4 = this.field867;
                int var5 = this.field868;
                int var6 = this.field869;
                int var7 = this.field870;
                int var8 = arg0.method551();
                this.method223(var8, this.field859);
                this.field867 = var4;
                this.field868 = var5;
                this.field869 = var6;
                this.field870 = var7;
                this.field871 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "IMXTJGZE", name = "a", descriptor = "(II)V")
    private void method223(int arg0, int arg1) {
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
        this.field867 = (int) (var19 * 256.0D);
        this.field868 = (int) (var15 * 256.0D);
        this.field869 = (int) (var17 * 256.0D);
        if (this.field868 < 0) {
            this.field868 = 0;
        } else if (this.field868 > 255) {
            this.field868 = 255;
        }
        if (this.field869 < 0) {
            this.field869 = 0;
        } else if (this.field869 > 255) {
            this.field869 = 255;
        }
        if (var17 > 0.5D) {
            this.field871 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field871 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field871 < 1) {
            this.field871 = 1;
        }
        this.field870 = (int) ((double) this.field871 * var19);
        int var21 = this.field867 + (int) (Math.random() * 16.0D) - 8;
        int var22 = 77 / arg1;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var23 = this.field868 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field869 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field872 = this.method224(var21, var23, var24);
    }

    @OriginalMember(owner = "IMXTJGZE", name = "a", descriptor = "(III)I")
    private final int method224(int arg0, int arg1, int arg2) {
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
