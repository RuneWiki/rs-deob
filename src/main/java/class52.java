import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SYTONBKT")
public class class52 {

    @OriginalMember(owner = "SYTONBKT", name = "e", descriptor = "I")
    public int field1341 = -1;

    @OriginalMember(owner = "SYTONBKT", name = "f", descriptor = "Z")
    public boolean field1342 = false;

    @OriginalMember(owner = "SYTONBKT", name = "g", descriptor = "Z")
    public boolean field1343 = true;

    @OriginalMember(owner = "SYTONBKT", name = "a", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "SYTONBKT", name = "d", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "SYTONBKT", name = "h", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "SYTONBKT", name = "i", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "SYTONBKT", name = "j", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "SYTONBKT", name = "k", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "SYTONBKT", name = "l", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "SYTONBKT", name = "m", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "SYTONBKT", name = "c", descriptor = "Ljava/lang/String;")
    public String field1339;

    @OriginalMember(owner = "SYTONBKT", name = "b", descriptor = "[LSYTONBKT;")
    public static class52[] field1338;

    @OriginalMember(owner = "SYTONBKT", name = "a", descriptor = "(ILBBMKAXRK;)V")
    public static void method449(int arg0, class6 arg1) {
        if (arg0 >= 0) {
            return;
        }
        class17 var2 = new class17(arg1.method30("flo.dat", null), -26583);
        field1337 = var2.method226();
        if (field1338 == null) {
            field1338 = new class52[field1337];
        }
        for (int var3 = 0; var3 < field1337; var3++) {
            if (field1338[var3] == null) {
                field1338[var3] = new class52();
            }
            field1338[var3].method450(var2, (byte) -50);
        }
    }

    @OriginalMember(owner = "SYTONBKT", name = "a", descriptor = "(LEILHLJCE;B)V")
    public void method450(class17 arg0, byte arg1) {
        if (arg1 != -50) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg0.method224();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1340 = arg0.method228();
                this.method451(7, this.field1340);
            } else if (var4 == 2) {
                this.field1341 = arg0.method224();
            } else if (var4 == 3) {
                this.field1342 = true;
            } else if (var4 == 5) {
                this.field1343 = false;
            } else if (var4 == 6) {
                this.field1339 = arg0.method231();
            } else if (var4 == 7) {
                int var5 = this.field1344;
                int var6 = this.field1345;
                int var7 = this.field1346;
                int var8 = this.field1347;
                int var9 = arg0.method228();
                this.method451(7, var9);
                this.field1344 = var5;
                this.field1345 = var6;
                this.field1346 = var7;
                this.field1347 = var8;
                this.field1348 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "SYTONBKT", name = "a", descriptor = "(II)V")
    private void method451(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 != 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var6 < var3) {
            var10 = var6;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var6 > var3) {
            var12 = var6;
        }
        if (var8 > var12) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
            if (var3 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var6) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field1344 = (int) (var20 * 256.0D);
        this.field1345 = (int) (var16 * 256.0D);
        this.field1346 = (int) (var18 * 256.0D);
        if (this.field1345 < 0) {
            this.field1345 = 0;
        } else if (this.field1345 > 255) {
            this.field1345 = 255;
        }
        if (this.field1346 < 0) {
            this.field1346 = 0;
        } else if (this.field1346 > 255) {
            this.field1346 = 255;
        }
        if (var18 > 0.5D) {
            this.field1348 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1348 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1348 < 1) {
            this.field1348 = 1;
        }
        this.field1347 = (int) ((double) this.field1348 * var20);
        int var22 = this.field1344 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1345 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1346 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1349 = this.method452(var22, var23, var24);
    }

    @OriginalMember(owner = "SYTONBKT", name = "a", descriptor = "(III)I")
    private final int method452(int arg0, int arg1, int arg2) {
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
