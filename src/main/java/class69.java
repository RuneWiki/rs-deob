import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YTVETJJL")
public class class69 {

    @OriginalMember(owner = "YTVETJJL", name = "c", descriptor = "B")
    private byte field1667 = -122;

    @OriginalMember(owner = "YTVETJJL", name = "h", descriptor = "I")
    public int field1672 = -1;

    @OriginalMember(owner = "YTVETJJL", name = "i", descriptor = "Z")
    public boolean field1673 = false;

    @OriginalMember(owner = "YTVETJJL", name = "j", descriptor = "Z")
    public boolean field1674 = true;

    @OriginalMember(owner = "YTVETJJL", name = "a", descriptor = "I")
    private static int field1665 = 8;

    @OriginalMember(owner = "YTVETJJL", name = "b", descriptor = "Z")
    private static boolean field1666 = true;

    @OriginalMember(owner = "YTVETJJL", name = "d", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "YTVETJJL", name = "g", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "YTVETJJL", name = "k", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "YTVETJJL", name = "l", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "YTVETJJL", name = "m", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "YTVETJJL", name = "n", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "YTVETJJL", name = "o", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "YTVETJJL", name = "p", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "YTVETJJL", name = "f", descriptor = "Ljava/lang/String;")
    public String field1670;

    @OriginalMember(owner = "YTVETJJL", name = "e", descriptor = "[LYTVETJJL;")
    public static class69[] field1669;

    @OriginalMember(owner = "YTVETJJL", name = "a", descriptor = "(LFIGUVTWB;Z)V")
    public static void method568(class15 arg0, boolean arg1) {
        class33 var2 = new class33(field1665, arg0.method209("flo.dat", null));
        field1668 = var2.method294();
        if (field1669 == null) {
            field1669 = new class69[field1668];
        }
        for (int var3 = 0; var3 < field1668; var3++) {
            if (field1669[var3] == null) {
                field1669[var3] = new class69();
            }
            field1669[var3].method569(var2, false);
        }
        if (arg1) {
            field1666 = !field1666;
        }
    }

    @OriginalMember(owner = "YTVETJJL", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public void method569(class33 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method292();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1671 = arg0.method296();
                this.method570(this.field1671, (byte) -122);
            } else if (var3 == 2) {
                this.field1672 = arg0.method292();
            } else if (var3 == 3) {
                this.field1673 = true;
            } else if (var3 == 5) {
                this.field1674 = false;
            } else if (var3 == 6) {
                this.field1670 = arg0.method299();
            } else if (var3 == 7) {
                int var4 = this.field1675;
                int var5 = this.field1676;
                int var6 = this.field1677;
                int var7 = this.field1678;
                int var8 = arg0.method296();
                this.method570(var8, (byte) -122);
                this.field1675 = var4;
                this.field1676 = var5;
                this.field1677 = var6;
                this.field1678 = var7;
                this.field1679 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "YTVETJJL", name = "a", descriptor = "(IB)V")
    private void method570(int arg0, byte arg1) {
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
        this.field1675 = (int) (var19 * 256.0D);
        this.field1676 = (int) (var15 * 256.0D);
        this.field1677 = (int) (var17 * 256.0D);
        if (this.field1676 < 0) {
            this.field1676 = 0;
        } else if (this.field1676 > 255) {
            this.field1676 = 255;
        }
        if (this.field1677 < 0) {
            this.field1677 = 0;
        } else if (this.field1677 > 255) {
            this.field1677 = 255;
        }
        if (var17 > 0.5D) {
            this.field1679 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1679 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1679 < 1) {
            this.field1679 = 1;
        }
        this.field1678 = (int) ((double) this.field1679 * var19);
        int var21 = this.field1675 + (int) (Math.random() * 16.0D) - 8;
        if (this.field1667 != arg1) {
            return;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1676 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1677 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1680 = this.method571(var21, var22, var23);
    }

    @OriginalMember(owner = "YTVETJJL", name = "a", descriptor = "(III)I")
    private final int method571(int arg0, int arg1, int arg2) {
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
