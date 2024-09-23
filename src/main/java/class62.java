import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XDCFWJPT")
public class class62 {

    @OriginalMember(owner = "XDCFWJPT", name = "a", descriptor = "B")
    private byte field1505 = 44;

    @OriginalMember(owner = "XDCFWJPT", name = "b", descriptor = "Z")
    private boolean field1506 = false;

    @OriginalMember(owner = "XDCFWJPT", name = "h", descriptor = "I")
    public int field1512 = -1;

    @OriginalMember(owner = "XDCFWJPT", name = "i", descriptor = "Z")
    public boolean field1513 = false;

    @OriginalMember(owner = "XDCFWJPT", name = "j", descriptor = "Z")
    public boolean field1514 = true;

    @OriginalMember(owner = "XDCFWJPT", name = "d", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "XDCFWJPT", name = "g", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "XDCFWJPT", name = "k", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "XDCFWJPT", name = "l", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "XDCFWJPT", name = "m", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "XDCFWJPT", name = "n", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "XDCFWJPT", name = "o", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "XDCFWJPT", name = "p", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "XDCFWJPT", name = "f", descriptor = "Ljava/lang/String;")
    public String field1510;

    @OriginalMember(owner = "XDCFWJPT", name = "c", descriptor = "Z")
    private static boolean field1507;

    @OriginalMember(owner = "XDCFWJPT", name = "e", descriptor = "[LXDCFWJPT;")
    public static class62[] field1509;

    @OriginalMember(owner = "XDCFWJPT", name = "a", descriptor = "(LOTSGNSQM;Z)V")
    public static void method516(class41 arg0, boolean arg1) {
        class68 var2 = new class68(arg0.method376("flo.dat", null), -103);
        field1508 = var2.method551();
        if (arg1) {
            field1507 = !field1507;
        }
        if (field1509 == null) {
            field1509 = new class62[field1508];
        }
        for (int var3 = 0; var3 < field1508; var3++) {
            if (field1509[var3] == null) {
                field1509[var3] = new class62();
            }
            field1509[var3].method517((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "XDCFWJPT", name = "a", descriptor = "(BLYOXDZEVD;)V")
    public void method517(byte arg0, class68 arg1) {
        if (this.field1505 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method549();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1511 = arg1.method553();
                this.method518(this.field1506, this.field1511);
            } else if (var4 == 2) {
                this.field1512 = arg1.method549();
            } else if (var4 == 3) {
                this.field1513 = true;
            } else if (var4 == 5) {
                this.field1514 = false;
            } else if (var4 == 6) {
                this.field1510 = arg1.method556();
            } else if (var4 == 7) {
                int var5 = this.field1515;
                int var6 = this.field1516;
                int var7 = this.field1517;
                int var8 = this.field1518;
                int var9 = arg1.method553();
                this.method518(this.field1506, var9);
                this.field1515 = var5;
                this.field1516 = var6;
                this.field1517 = var7;
                this.field1518 = var8;
                this.field1519 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "XDCFWJPT", name = "a", descriptor = "(ZI)V")
    private void method518(boolean arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0) {
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
        this.field1515 = (int) (var19 * 256.0D);
        this.field1516 = (int) (var15 * 256.0D);
        this.field1517 = (int) (var17 * 256.0D);
        if (this.field1516 < 0) {
            this.field1516 = 0;
        } else if (this.field1516 > 255) {
            this.field1516 = 255;
        }
        if (this.field1517 < 0) {
            this.field1517 = 0;
        } else if (this.field1517 > 255) {
            this.field1517 = 255;
        }
        if (var17 > 0.5D) {
            this.field1519 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1519 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1519 < 1) {
            this.field1519 = 1;
        }
        this.field1518 = (int) ((double) this.field1519 * var19);
        int var21 = this.field1515 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1516 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1517 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1520 = this.method519(var21, var22, var23);
    }

    @OriginalMember(owner = "XDCFWJPT", name = "a", descriptor = "(III)I")
    private final int method519(int arg0, int arg1, int arg2) {
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
