import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TFMGYYZY")
public class class57 {

    @OriginalMember(owner = "client!TFMGYYZY", name = "f", descriptor = "I")
    public int field1494 = -1;

    @OriginalMember(owner = "client!TFMGYYZY", name = "g", descriptor = "Z")
    public boolean field1495 = false;

    @OriginalMember(owner = "client!TFMGYYZY", name = "h", descriptor = "Z")
    public boolean field1496 = true;

    @OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "I")
    private static int field1489 = -254;

    @OriginalMember(owner = "client!TFMGYYZY", name = "b", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!TFMGYYZY", name = "e", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!TFMGYYZY", name = "i", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!TFMGYYZY", name = "j", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!TFMGYYZY", name = "k", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!TFMGYYZY", name = "l", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!TFMGYYZY", name = "m", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!TFMGYYZY", name = "n", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!TFMGYYZY", name = "d", descriptor = "Ljava/lang/String;")
    public String field1492;

    @OriginalMember(owner = "client!TFMGYYZY", name = "c", descriptor = "[LTFMGYYZY;")
    public static class57[] field1491;

    @OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(ZLAKPFVPPG;)V")
    public static void method468(boolean arg0, class2 arg1) {
        class13 var2 = new class13(arg1.method7("flo.dat", null), (byte) 3);
        field1490 = var2.method215();
        if (!arg0) {
            field1489 = -323;
        }
        if (field1491 == null) {
            field1491 = new class57[field1490];
        }
        for (int var3 = 0; var3 < field1490; var3++) {
            if (field1491[var3] == null) {
                field1491[var3] = new class57();
            }
            field1491[var3].method469(var2, 799);
        }
    }

    @OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(LFTMSICIZ;I)V")
    public void method469(class13 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg0.method213();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1493 = arg0.method217();
                this.method470(this.field1493, true);
            } else if (var4 == 2) {
                this.field1494 = arg0.method213();
            } else if (var4 == 3) {
                this.field1495 = true;
            } else if (var4 == 5) {
                this.field1496 = false;
            } else if (var4 == 6) {
                this.field1492 = arg0.method220();
            } else if (var4 == 7) {
                int var5 = this.field1497;
                int var6 = this.field1498;
                int var7 = this.field1499;
                int var8 = this.field1500;
                int var9 = arg0.method217();
                this.method470(var9, true);
                this.field1497 = var5;
                this.field1498 = var6;
                this.field1499 = var7;
                this.field1500 = var8;
                this.field1501 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(IZ)V")
    private void method470(int arg0, boolean arg1) {
        if (arg0 == 16711935) {
            arg0 = 0;
        }
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
        this.field1497 = (int) (var19 * 256.0D);
        this.field1498 = (int) (var15 * 256.0D);
        if (!arg1) {
            field1489 = -267;
        }
        this.field1499 = (int) (var17 * 256.0D);
        if (this.field1498 < 0) {
            this.field1498 = 0;
        } else if (this.field1498 > 255) {
            this.field1498 = 255;
        }
        if (this.field1499 < 0) {
            this.field1499 = 0;
        } else if (this.field1499 > 255) {
            this.field1499 = 255;
        }
        if (var17 > 0.5D) {
            this.field1501 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1501 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1501 < 1) {
            this.field1501 = 1;
        }
        this.field1500 = (int) ((double) this.field1501 * var19);
        int var21 = this.field1497 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1498 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1499 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1502 = this.method471(var21, var22, var23);
    }

    @OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(III)I")
    private final int method471(int arg0, int arg1, int arg2) {
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
