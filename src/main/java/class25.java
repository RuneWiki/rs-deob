import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HNBDHXHI")
public class class25 {

    @OriginalMember(owner = "client!HNBDHXHI", name = "e", descriptor = "I")
    public int field960 = -1;

    @OriginalMember(owner = "client!HNBDHXHI", name = "f", descriptor = "Z")
    public boolean field961 = false;

    @OriginalMember(owner = "client!HNBDHXHI", name = "g", descriptor = "Z")
    public boolean field962 = true;

    @OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!HNBDHXHI", name = "d", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!HNBDHXHI", name = "h", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!HNBDHXHI", name = "i", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!HNBDHXHI", name = "j", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!HNBDHXHI", name = "k", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!HNBDHXHI", name = "l", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!HNBDHXHI", name = "m", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!HNBDHXHI", name = "c", descriptor = "Ljava/lang/String;")
    public String field958;

    @OriginalMember(owner = "client!HNBDHXHI", name = "b", descriptor = "[LHNBDHXHI;")
    public static class25[] field957;

    @OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(LHBJEXSJX;Z)V")
    public static void method349(class24 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class18 var2 = new class18(arg0.method348("flo.dat", null), 0);
        field956 = var2.method241();
        if (field957 == null) {
            field957 = new class25[field956];
        }
        for (int var3 = 0; var3 < field956; var3++) {
            if (field957[var3] == null) {
                field957[var3] = new class25();
            }
            field957[var3].method350((byte) 5, var2);
        }
    }

    @OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(BLEYMNCFMK;)V")
    public void method350(byte arg0, class18 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method239();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field959 = arg1.method243();
                this.method351(true, this.field959);
            } else if (var3 == 2) {
                this.field960 = arg1.method239();
            } else if (var3 == 3) {
                this.field961 = true;
            } else if (var3 == 5) {
                this.field962 = false;
            } else if (var3 == 6) {
                this.field958 = arg1.method246();
            } else if (var3 == 7) {
                int var4 = this.field963;
                int var5 = this.field964;
                int var6 = this.field965;
                int var7 = this.field966;
                int var8 = arg1.method243();
                this.method351(true, var8);
                this.field963 = var4;
                this.field964 = var5;
                this.field965 = var6;
                this.field966 = var7;
                this.field967 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(ZI)V")
    private void method351(boolean arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (!arg0) {
            return;
        }
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
        this.field963 = (int) (var19 * 256.0D);
        this.field964 = (int) (var15 * 256.0D);
        this.field965 = (int) (var17 * 256.0D);
        if (this.field964 < 0) {
            this.field964 = 0;
        } else if (this.field964 > 255) {
            this.field964 = 255;
        }
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
        if (var17 > 0.5D) {
            this.field967 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field967 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field967 < 1) {
            this.field967 = 1;
        }
        this.field966 = (int) ((double) this.field967 * var19);
        int var21 = this.field963 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field964 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field965 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field968 = this.method352(var21, var22, var23);
    }

    @OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(III)I")
    private final int method352(int arg0, int arg1, int arg2) {
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
