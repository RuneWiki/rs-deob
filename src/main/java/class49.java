import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QRIJREXW")
public class class49 {

    @OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "Z")
    private boolean field1485 = false;

    @OriginalMember(owner = "client!QRIJREXW", name = "g", descriptor = "I")
    public int field1491 = -1;

    @OriginalMember(owner = "client!QRIJREXW", name = "h", descriptor = "Z")
    public boolean field1492 = false;

    @OriginalMember(owner = "client!QRIJREXW", name = "i", descriptor = "Z")
    public boolean field1493 = true;

    @OriginalMember(owner = "client!QRIJREXW", name = "b", descriptor = "Z")
    private static boolean field1486 = true;

    @OriginalMember(owner = "client!QRIJREXW", name = "c", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!QRIJREXW", name = "f", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "client!QRIJREXW", name = "j", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!QRIJREXW", name = "k", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!QRIJREXW", name = "l", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!QRIJREXW", name = "m", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!QRIJREXW", name = "n", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!QRIJREXW", name = "o", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!QRIJREXW", name = "e", descriptor = "Ljava/lang/String;")
    public String field1489;

    @OriginalMember(owner = "client!QRIJREXW", name = "d", descriptor = "[LQRIJREXW;")
    public static class49[] field1488;

    @OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(LLKPVZAQN;I)V")
    public static void method450(class33 arg0, int arg1) {
        if (arg1 <= 0) {
            field1486 = !field1486;
        }
        class58 var2 = new class58((byte) -115, arg0.method323("flo.dat", null));
        field1487 = var2.method517();
        if (field1488 == null) {
            field1488 = new class49[field1487];
        }
        for (int var3 = 0; var3 < field1487; var3++) {
            if (field1488[var3] == null) {
                field1488[var3] = new class49();
            }
            field1488[var3].method451(var2, 767);
        }
    }

    @OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public void method451(class58 arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method515();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1490 = arg0.method519();
                this.method452(true, this.field1490);
            } else if (var3 == 2) {
                this.field1491 = arg0.method515();
            } else if (var3 == 3) {
                this.field1492 = true;
            } else if (var3 == 5) {
                this.field1493 = false;
            } else if (var3 == 6) {
                this.field1489 = arg0.method522();
            } else if (var3 == 7) {
                int var4 = this.field1494;
                int var5 = this.field1495;
                int var6 = this.field1496;
                int var7 = this.field1497;
                int var8 = arg0.method519();
                this.method452(true, var8);
                this.field1494 = var4;
                this.field1495 = var5;
                this.field1496 = var6;
                this.field1497 = var7;
                this.field1498 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(ZI)V")
    private void method452(boolean arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        if (!arg0) {
            this.field1485 = !this.field1485;
        }
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
        this.field1494 = (int) (var19 * 256.0D);
        this.field1495 = (int) (var15 * 256.0D);
        this.field1496 = (int) (var17 * 256.0D);
        if (this.field1495 < 0) {
            this.field1495 = 0;
        } else if (this.field1495 > 255) {
            this.field1495 = 255;
        }
        if (this.field1496 < 0) {
            this.field1496 = 0;
        } else if (this.field1496 > 255) {
            this.field1496 = 255;
        }
        if (var17 > 0.5D) {
            this.field1498 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1498 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1498 < 1) {
            this.field1498 = 1;
        }
        this.field1497 = (int) ((double) this.field1498 * var19);
        int var21 = this.field1494 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1495 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1496 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1499 = this.method453(var21, var22, var23);
    }

    @OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(III)I")
    private final int method453(int arg0, int arg1, int arg2) {
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
