import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WDDURNZH")
public class class63 {

    @OriginalMember(owner = "WDDURNZH", name = "a", descriptor = "I")
    private int field1572 = 16191;

    @OriginalMember(owner = "WDDURNZH", name = "h", descriptor = "I")
    public int field1579 = -1;

    @OriginalMember(owner = "WDDURNZH", name = "i", descriptor = "Z")
    public boolean field1580 = false;

    @OriginalMember(owner = "WDDURNZH", name = "j", descriptor = "Z")
    public boolean field1581 = true;

    @OriginalMember(owner = "WDDURNZH", name = "b", descriptor = "I")
    private static int field1573;

    @OriginalMember(owner = "WDDURNZH", name = "d", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "WDDURNZH", name = "g", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "WDDURNZH", name = "k", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "WDDURNZH", name = "l", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "WDDURNZH", name = "m", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "WDDURNZH", name = "n", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "WDDURNZH", name = "o", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "WDDURNZH", name = "p", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "WDDURNZH", name = "f", descriptor = "Ljava/lang/String;")
    public String field1577;

    @OriginalMember(owner = "WDDURNZH", name = "c", descriptor = "Z")
    private static boolean field1574;

    @OriginalMember(owner = "WDDURNZH", name = "e", descriptor = "[LWDDURNZH;")
    public static class63[] field1576;

    @OriginalMember(owner = "WDDURNZH", name = "a", descriptor = "(ILSPZBTZXL;)V")
    public static void method561(int arg0, class51 arg1) {
        class34 var2 = new class34(arg1.method515("flo.dat", null), field1573);
        field1575 = var2.method404();
        if (arg0 <= 0) {
            field1574 = !field1574;
        }
        if (field1576 == null) {
            field1576 = new class63[field1575];
        }
        for (int var3 = 0; var3 < field1575; var3++) {
            if (field1576[var3] == null) {
                field1576[var3] = new class63();
            }
            field1576[var3].method562(var2, 16191);
        }
    }

    @OriginalMember(owner = "WDDURNZH", name = "a", descriptor = "(LLDILQFVA;I)V")
    public void method562(class34 arg0, int arg1) {
        if (this.field1572 != arg1) {
            field1574 = !field1574;
        }
        while (true) {
            int var3 = arg0.method402();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1578 = arg0.method406();
                this.method563(this.field1578, true);
            } else if (var3 == 2) {
                this.field1579 = arg0.method402();
            } else if (var3 == 3) {
                this.field1580 = true;
            } else if (var3 == 5) {
                this.field1581 = false;
            } else if (var3 == 6) {
                this.field1577 = arg0.method409();
            } else if (var3 == 7) {
                int var4 = this.field1582;
                int var5 = this.field1583;
                int var6 = this.field1584;
                int var7 = this.field1585;
                int var8 = arg0.method406();
                this.method563(var8, true);
                this.field1582 = var4;
                this.field1583 = var5;
                this.field1584 = var6;
                this.field1585 = var7;
                this.field1586 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "WDDURNZH", name = "a", descriptor = "(IZ)V")
    private void method563(int arg0, boolean arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (!arg1) {
            return;
        }
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
        this.field1582 = (int) (var19 * 256.0D);
        this.field1583 = (int) (var15 * 256.0D);
        this.field1584 = (int) (var17 * 256.0D);
        if (this.field1583 < 0) {
            this.field1583 = 0;
        } else if (this.field1583 > 255) {
            this.field1583 = 255;
        }
        if (this.field1584 < 0) {
            this.field1584 = 0;
        } else if (this.field1584 > 255) {
            this.field1584 = 255;
        }
        if (var17 > 0.5D) {
            this.field1586 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1586 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1586 < 1) {
            this.field1586 = 1;
        }
        this.field1585 = (int) ((double) this.field1586 * var19);
        int var21 = this.field1582 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1583 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1584 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1587 = this.method564(var21, var22, var23);
    }

    @OriginalMember(owner = "WDDURNZH", name = "a", descriptor = "(III)I")
    private final int method564(int arg0, int arg1, int arg2) {
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
