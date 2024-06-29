import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QDVRTZST")
public class class45 {

    @OriginalMember(owner = "client!QDVRTZST", name = "e", descriptor = "I")
    public int field1389 = -1;

    @OriginalMember(owner = "client!QDVRTZST", name = "f", descriptor = "Z")
    public boolean field1390 = false;

    @OriginalMember(owner = "client!QDVRTZST", name = "g", descriptor = "Z")
    public boolean field1391 = true;

    @OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!QDVRTZST", name = "d", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!QDVRTZST", name = "h", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!QDVRTZST", name = "i", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!QDVRTZST", name = "j", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!QDVRTZST", name = "k", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!QDVRTZST", name = "l", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!QDVRTZST", name = "m", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!QDVRTZST", name = "c", descriptor = "Ljava/lang/String;")
    public String field1387;

    @OriginalMember(owner = "client!QDVRTZST", name = "b", descriptor = "[LQDVRTZST;")
    public static class45[] field1386;

    @OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(BLIEMHZJLX;)V")
    public static void method479(byte arg0, class23 arg1) {
        class38 var2 = new class38(0, arg1.method242("flo.dat", null));
        field1385 = var2.method359();
        if (field1386 == null) {
            field1386 = new class45[field1385];
        }
        for (int var3 = 0; var3 < field1385; var3++) {
            if (field1386[var3] == null) {
                field1386[var3] = new class45();
            }
            field1386[var3].method480(403, var2);
        }
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(ILMVHXDWGI;)V")
    public void method480(int arg0, class38 arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method357();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1388 = arg1.method361();
                this.method481(this.field1388, true);
            } else if (var4 == 2) {
                this.field1389 = arg1.method357();
            } else if (var4 == 3) {
                this.field1390 = true;
            } else if (var4 == 5) {
                this.field1391 = false;
            } else if (var4 == 6) {
                this.field1387 = arg1.method364();
            } else if (var4 == 7) {
                int var5 = this.field1392;
                int var6 = this.field1393;
                int var7 = this.field1394;
                int var8 = this.field1395;
                int var9 = arg1.method361();
                this.method481(var9, true);
                this.field1392 = var5;
                this.field1393 = var6;
                this.field1394 = var7;
                this.field1395 = var8;
                this.field1396 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(IZ)V")
    private void method481(int arg0, boolean arg1) {
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
        this.field1392 = (int) (var19 * 256.0D);
        this.field1393 = (int) (var15 * 256.0D);
        this.field1394 = (int) (var17 * 256.0D);
        if (this.field1393 < 0) {
            this.field1393 = 0;
        } else if (this.field1393 > 255) {
            this.field1393 = 255;
        }
        if (this.field1394 < 0) {
            this.field1394 = 0;
        } else if (this.field1394 > 255) {
            this.field1394 = 255;
        }
        if (var17 > 0.5D) {
            this.field1396 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1396 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1396 < 1) {
            this.field1396 = 1;
        }
        this.field1395 = (int) ((double) this.field1396 * var19);
        int var21 = this.field1392 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1393 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1394 + (int) (Math.random() * 48.0D) - 24;
        if (!arg1) {
            return;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1397 = this.method482(var21, var22, var23);
    }

    @OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(III)I")
    private final int method482(int arg0, int arg1, int arg2) {
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
