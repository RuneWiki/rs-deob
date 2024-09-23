import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QXFWPOFL")
public class class49 {

    @OriginalMember(owner = "QXFWPOFL", name = "f", descriptor = "I")
    public int field1299 = -1;

    @OriginalMember(owner = "QXFWPOFL", name = "g", descriptor = "Z")
    public boolean field1300 = false;

    @OriginalMember(owner = "QXFWPOFL", name = "h", descriptor = "Z")
    public boolean field1301 = true;

    @OriginalMember(owner = "QXFWPOFL", name = "a", descriptor = "Z")
    private static boolean field1294 = true;

    @OriginalMember(owner = "QXFWPOFL", name = "b", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "QXFWPOFL", name = "e", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "QXFWPOFL", name = "i", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "QXFWPOFL", name = "j", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "QXFWPOFL", name = "k", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "QXFWPOFL", name = "l", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "QXFWPOFL", name = "m", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "QXFWPOFL", name = "n", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "QXFWPOFL", name = "d", descriptor = "Ljava/lang/String;")
    public String field1297;

    @OriginalMember(owner = "QXFWPOFL", name = "c", descriptor = "[LQXFWPOFL;")
    public static class49[] field1296;

    @OriginalMember(owner = "QXFWPOFL", name = "a", descriptor = "(ILTXPLZUUI;)V")
    public static void method450(int arg0, class60 arg1) {
        class43 var2 = new class43(arg1.method506("flo.dat", null), 0);
        field1295 = var2.method332();
        if (field1296 == null) {
            field1296 = new class49[field1295];
        }
        for (int var3 = 0; var3 < field1295; var3++) {
            if (field1296[var3] == null) {
                field1296[var3] = new class49();
            }
            field1296[var3].method451(var2, field1294);
        }
        if (arg0 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "QXFWPOFL", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    public void method451(class43 arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method330();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1298 = arg0.method334();
                this.method452(this.field1298, (byte) 8);
            } else if (var3 == 2) {
                this.field1299 = arg0.method330();
            } else if (var3 == 3) {
                this.field1300 = true;
            } else if (var3 == 5) {
                this.field1301 = false;
            } else if (var3 == 6) {
                this.field1297 = arg0.method337();
            } else if (var3 == 7) {
                int var4 = this.field1302;
                int var5 = this.field1303;
                int var6 = this.field1304;
                int var7 = this.field1305;
                int var8 = arg0.method334();
                this.method452(var8, (byte) 8);
                this.field1302 = var4;
                this.field1303 = var5;
                this.field1304 = var6;
                this.field1305 = var7;
                this.field1306 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "QXFWPOFL", name = "a", descriptor = "(IB)V")
    private void method452(int arg0, byte arg1) {
        if (arg1 != 8) {
            return;
        }
        boolean var3 = false;
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var4;
        if (var6 < var4) {
            var10 = var6;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var4;
        if (var6 > var4) {
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
            if (var4 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var4) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var4 - var6) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field1302 = (int) (var20 * 256.0D);
        this.field1303 = (int) (var16 * 256.0D);
        this.field1304 = (int) (var18 * 256.0D);
        if (this.field1303 < 0) {
            this.field1303 = 0;
        } else if (this.field1303 > 255) {
            this.field1303 = 255;
        }
        if (this.field1304 < 0) {
            this.field1304 = 0;
        } else if (this.field1304 > 255) {
            this.field1304 = 255;
        }
        if (var18 > 0.5D) {
            this.field1306 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1306 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1306 < 1) {
            this.field1306 = 1;
        }
        this.field1305 = (int) ((double) this.field1306 * var20);
        int var22 = this.field1302 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1303 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1304 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1307 = this.method453(var22, var23, var24);
    }

    @OriginalMember(owner = "QXFWPOFL", name = "a", descriptor = "(III)I")
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
