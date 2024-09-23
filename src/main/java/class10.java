import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EPIGJXFD")
public class class10 {

    @OriginalMember(owner = "EPIGJXFD", name = "b", descriptor = "Z")
    private boolean field700 = false;

    @OriginalMember(owner = "EPIGJXFD", name = "g", descriptor = "I")
    public int field705 = -1;

    @OriginalMember(owner = "EPIGJXFD", name = "h", descriptor = "Z")
    public boolean field706 = false;

    @OriginalMember(owner = "EPIGJXFD", name = "i", descriptor = "Z")
    public boolean field707 = true;

    @OriginalMember(owner = "EPIGJXFD", name = "a", descriptor = "I")
    private static int field699 = 627;

    @OriginalMember(owner = "EPIGJXFD", name = "c", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "EPIGJXFD", name = "f", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "EPIGJXFD", name = "j", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "EPIGJXFD", name = "k", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "EPIGJXFD", name = "l", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "EPIGJXFD", name = "m", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "EPIGJXFD", name = "n", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "EPIGJXFD", name = "o", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "EPIGJXFD", name = "e", descriptor = "Ljava/lang/String;")
    public String field703;

    @OriginalMember(owner = "EPIGJXFD", name = "d", descriptor = "[LEPIGJXFD;")
    public static class10[] field702;

    @OriginalMember(owner = "EPIGJXFD", name = "a", descriptor = "(ILSYUGXMZF;)V")
    public static void method243(int arg0, class55 arg1) {
        class30 var2 = new class30(arg1.method551("flo.dat", null), -982);
        field701 = var2.method351();
        if (arg0 >= 0) {
            field699 = 56;
        }
        if (field702 == null) {
            field702 = new class10[field701];
        }
        for (int var3 = 0; var3 < field701; var3++) {
            if (field702[var3] == null) {
                field702[var3] = new class10();
            }
            field702[var3].method244(var2, 1);
        }
    }

    @OriginalMember(owner = "EPIGJXFD", name = "a", descriptor = "(LKHOMSBHW;I)V")
    public void method244(class30 arg0, int arg1) {
        if (arg1 != 1) {
            this.field700 = !this.field700;
        }
        while (true) {
            int var3 = arg0.method349();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field704 = arg0.method353();
                this.method245((byte) 49, this.field704);
            } else if (var3 == 2) {
                this.field705 = arg0.method349();
            } else if (var3 == 3) {
                this.field706 = true;
            } else if (var3 == 5) {
                this.field707 = false;
            } else if (var3 == 6) {
                this.field703 = arg0.method356();
            } else if (var3 == 7) {
                int var4 = this.field708;
                int var5 = this.field709;
                int var6 = this.field710;
                int var7 = this.field711;
                int var8 = arg0.method353();
                this.method245((byte) 49, var8);
                this.field708 = var4;
                this.field709 = var5;
                this.field710 = var6;
                this.field711 = var7;
                this.field712 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "EPIGJXFD", name = "a", descriptor = "(BI)V")
    private void method245(byte arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 != 49) {
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
        this.field708 = (int) (var19 * 256.0D);
        this.field709 = (int) (var15 * 256.0D);
        this.field710 = (int) (var17 * 256.0D);
        if (this.field709 < 0) {
            this.field709 = 0;
        } else if (this.field709 > 255) {
            this.field709 = 255;
        }
        if (this.field710 < 0) {
            this.field710 = 0;
        } else if (this.field710 > 255) {
            this.field710 = 255;
        }
        if (var17 > 0.5D) {
            this.field712 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field712 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field712 < 1) {
            this.field712 = 1;
        }
        this.field711 = (int) ((double) this.field712 * var19);
        int var21 = this.field708 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field709 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field710 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field713 = this.method246(var21, var22, var23);
    }

    @OriginalMember(owner = "EPIGJXFD", name = "a", descriptor = "(III)I")
    private final int method246(int arg0, int arg1, int arg2) {
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
