import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UMMMVDGS")
public class class52 {

    @OriginalMember(owner = "UMMMVDGS", name = "f", descriptor = "I")
    public int field1466 = -1;

    @OriginalMember(owner = "UMMMVDGS", name = "g", descriptor = "Z")
    public boolean field1467 = false;

    @OriginalMember(owner = "UMMMVDGS", name = "h", descriptor = "Z")
    public boolean field1468 = true;

    @OriginalMember(owner = "UMMMVDGS", name = "a", descriptor = "Z")
    private static boolean field1461 = true;

    @OriginalMember(owner = "UMMMVDGS", name = "b", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "UMMMVDGS", name = "e", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "UMMMVDGS", name = "i", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "UMMMVDGS", name = "j", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "UMMMVDGS", name = "k", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "UMMMVDGS", name = "l", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "UMMMVDGS", name = "m", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "UMMMVDGS", name = "n", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "UMMMVDGS", name = "d", descriptor = "Ljava/lang/String;")
    public String field1464;

    @OriginalMember(owner = "UMMMVDGS", name = "c", descriptor = "[LUMMMVDGS;")
    public static class52[] field1463;

    @OriginalMember(owner = "UMMMVDGS", name = "a", descriptor = "(ILINOFEYKQ;)V")
    public static void method510(int arg0, class21 arg1) {
        while (arg0 >= 0) {
            field1461 = !field1461;
        }
        class35 var2 = new class35((byte) -103, arg1.method277("flo.dat", null));
        field1462 = var2.method351();
        if (field1463 == null) {
            field1463 = new class52[field1462];
        }
        for (int var3 = 0; var3 < field1462; var3++) {
            if (field1463[var3] == null) {
                field1463[var3] = new class52();
            }
            field1463[var3].method511(false, var2);
        }
    }

    @OriginalMember(owner = "UMMMVDGS", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    public void method511(boolean arg0, class35 arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method349();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1465 = arg1.method353();
                this.method512(true, this.field1465);
            } else if (var3 == 2) {
                this.field1466 = arg1.method349();
            } else if (var3 == 3) {
                this.field1467 = true;
            } else if (var3 == 5) {
                this.field1468 = false;
            } else if (var3 == 6) {
                this.field1464 = arg1.method356();
            } else if (var3 == 7) {
                int var4 = this.field1469;
                int var5 = this.field1470;
                int var6 = this.field1471;
                int var7 = this.field1472;
                int var8 = arg1.method353();
                this.method512(true, var8);
                this.field1469 = var4;
                this.field1470 = var5;
                this.field1471 = var6;
                this.field1472 = var7;
                this.field1473 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "UMMMVDGS", name = "a", descriptor = "(ZI)V")
    private void method512(boolean arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        if (!arg0) {
            return;
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
        this.field1469 = (int) (var19 * 256.0D);
        this.field1470 = (int) (var15 * 256.0D);
        this.field1471 = (int) (var17 * 256.0D);
        if (this.field1470 < 0) {
            this.field1470 = 0;
        } else if (this.field1470 > 255) {
            this.field1470 = 255;
        }
        if (this.field1471 < 0) {
            this.field1471 = 0;
        } else if (this.field1471 > 255) {
            this.field1471 = 255;
        }
        if (var17 > 0.5D) {
            this.field1473 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1473 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1473 < 1) {
            this.field1473 = 1;
        }
        this.field1472 = (int) ((double) this.field1473 * var19);
        int var21 = this.field1469 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1470 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1471 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1474 = this.method513(var21, var22, var23);
    }

    @OriginalMember(owner = "UMMMVDGS", name = "a", descriptor = "(III)I")
    private final int method513(int arg0, int arg1, int arg2) {
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
