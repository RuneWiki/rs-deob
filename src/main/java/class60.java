import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VDWALSCV")
public class class60 {

    @OriginalMember(owner = "client!VDWALSCV", name = "b", descriptor = "Z")
    private boolean field1560 = false;

    @OriginalMember(owner = "client!VDWALSCV", name = "g", descriptor = "I")
    public int field1565 = -1;

    @OriginalMember(owner = "client!VDWALSCV", name = "h", descriptor = "Z")
    public boolean field1566 = false;

    @OriginalMember(owner = "client!VDWALSCV", name = "i", descriptor = "Z")
    public boolean field1567 = true;

    @OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!VDWALSCV", name = "c", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!VDWALSCV", name = "f", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!VDWALSCV", name = "j", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!VDWALSCV", name = "k", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!VDWALSCV", name = "l", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!VDWALSCV", name = "m", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!VDWALSCV", name = "n", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!VDWALSCV", name = "o", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!VDWALSCV", name = "e", descriptor = "Ljava/lang/String;")
    public String field1563;

    @OriginalMember(owner = "client!VDWALSCV", name = "d", descriptor = "[LVDWALSCV;")
    public static class60[] field1562;

    @OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(LSMIVAFST;I)V")
    public static void method535(class52 arg0, int arg1) {
        class7 var2 = new class7(arg0.method512("flo.dat", null), (byte) 3);
        if (arg1 != -29636) {
            return;
        }
        field1561 = var2.method49();
        if (field1562 == null) {
            field1562 = new class60[field1561];
        }
        for (int var3 = 0; var3 < field1561; var3++) {
            if (field1562[var3] == null) {
                field1562[var3] = new class60();
            }
            field1562[var3].method536(7, var2);
        }
    }

    @OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(ILBSNPYLEV;)V")
    public void method536(int arg0, class7 arg1) {
        if (arg0 < 7 || arg0 > 7) {
            this.field1560 = !this.field1560;
        }
        while (true) {
            int var3 = arg1.method47();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1564 = arg1.method51();
                this.method537(this.field1564, this.field1559);
            } else if (var3 == 2) {
                this.field1565 = arg1.method47();
            } else if (var3 == 3) {
                this.field1566 = true;
            } else if (var3 == 5) {
                this.field1567 = false;
            } else if (var3 == 6) {
                this.field1563 = arg1.method54();
            } else if (var3 == 7) {
                int var4 = this.field1568;
                int var5 = this.field1569;
                int var6 = this.field1570;
                int var7 = this.field1571;
                int var8 = arg1.method51();
                this.method537(var8, this.field1559);
                this.field1568 = var4;
                this.field1569 = var5;
                this.field1570 = var6;
                this.field1571 = var7;
                this.field1572 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(II)V")
    private void method537(int arg0, int arg1) {
        if (arg0 == 16711935) {
            arg0 = 0;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != 0) {
            this.field1559 = 221;
        }
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
        this.field1568 = (int) (var19 * 256.0D);
        this.field1569 = (int) (var15 * 256.0D);
        this.field1570 = (int) (var17 * 256.0D);
        if (this.field1569 < 0) {
            this.field1569 = 0;
        } else if (this.field1569 > 255) {
            this.field1569 = 255;
        }
        if (this.field1570 < 0) {
            this.field1570 = 0;
        } else if (this.field1570 > 255) {
            this.field1570 = 255;
        }
        if (var17 > 0.5D) {
            this.field1572 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1572 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1572 < 1) {
            this.field1572 = 1;
        }
        this.field1571 = (int) ((double) this.field1572 * var19);
        int var21 = this.field1568 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1569 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1570 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1573 = this.method538(var21, var22, var23);
    }

    @OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(III)I")
    private final int method538(int arg0, int arg1, int arg2) {
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
