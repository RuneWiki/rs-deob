import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UFJMYAXC")
public class class53 {

    @OriginalMember(owner = "UFJMYAXC", name = "g", descriptor = "I")
    public int field1447 = -1;

    @OriginalMember(owner = "UFJMYAXC", name = "h", descriptor = "Z")
    public boolean field1448 = false;

    @OriginalMember(owner = "UFJMYAXC", name = "i", descriptor = "Z")
    public boolean field1449 = true;

    @OriginalMember(owner = "UFJMYAXC", name = "a", descriptor = "I")
    private static int field1441 = 974;

    @OriginalMember(owner = "UFJMYAXC", name = "b", descriptor = "Z")
    private static boolean field1442 = true;

    @OriginalMember(owner = "UFJMYAXC", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "UFJMYAXC", name = "f", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "UFJMYAXC", name = "j", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "UFJMYAXC", name = "k", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "UFJMYAXC", name = "l", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "UFJMYAXC", name = "m", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "UFJMYAXC", name = "n", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "UFJMYAXC", name = "o", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "UFJMYAXC", name = "e", descriptor = "Ljava/lang/String;")
    public String field1445;

    @OriginalMember(owner = "UFJMYAXC", name = "d", descriptor = "[LUFJMYAXC;")
    public static class53[] field1444;

    @OriginalMember(owner = "UFJMYAXC", name = "a", descriptor = "(ILQDHHNYHL;)V")
    public static void method519(int arg0, class44 arg1) {
        class42 var2 = new class42(5, arg1.method488("flo.dat", null));
        field1443 = var2.method422();
        if (arg0 != 0) {
            field1442 = !field1442;
        }
        if (field1444 == null) {
            field1444 = new class53[field1443];
        }
        for (int var3 = 0; var3 < field1443; var3++) {
            if (field1444[var3] == null) {
                field1444[var3] = new class53();
            }
            field1444[var3].method520(var2, field1441);
        }
    }

    @OriginalMember(owner = "UFJMYAXC", name = "a", descriptor = "(LPGNBHFUF;I)V")
    public void method520(class42 arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method420();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1446 = arg0.method424();
                this.method521(this.field1446, 0);
            } else if (var3 == 2) {
                this.field1447 = arg0.method420();
            } else if (var3 == 3) {
                this.field1448 = true;
            } else if (var3 == 5) {
                this.field1449 = false;
            } else if (var3 == 6) {
                this.field1445 = arg0.method427();
            } else if (var3 == 7) {
                int var4 = this.field1450;
                int var5 = this.field1451;
                int var6 = this.field1452;
                int var7 = this.field1453;
                int var8 = arg0.method424();
                this.method521(var8, 0);
                this.field1450 = var4;
                this.field1451 = var5;
                this.field1452 = var6;
                this.field1453 = var7;
                this.field1454 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "UFJMYAXC", name = "a", descriptor = "(II)V")
    private void method521(int arg0, int arg1) {
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
        this.field1450 = (int) (var19 * 256.0D);
        if (arg1 != 0) {
            return;
        }
        this.field1451 = (int) (var15 * 256.0D);
        this.field1452 = (int) (var17 * 256.0D);
        if (this.field1451 < 0) {
            this.field1451 = 0;
        } else if (this.field1451 > 255) {
            this.field1451 = 255;
        }
        if (this.field1452 < 0) {
            this.field1452 = 0;
        } else if (this.field1452 > 255) {
            this.field1452 = 255;
        }
        if (var17 > 0.5D) {
            this.field1454 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1454 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1454 < 1) {
            this.field1454 = 1;
        }
        this.field1453 = (int) ((double) this.field1454 * var19);
        int var21 = this.field1450 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1451 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1452 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1455 = this.method522(var21, var22, var23);
    }

    @OriginalMember(owner = "UFJMYAXC", name = "a", descriptor = "(III)I")
    private final int method522(int arg0, int arg1, int arg2) {
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
