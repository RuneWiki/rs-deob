import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PQRCEBTR")
public class class38 {

    @OriginalMember(owner = "PQRCEBTR", name = "e", descriptor = "I")
    public int field1318 = -1;

    @OriginalMember(owner = "PQRCEBTR", name = "f", descriptor = "Z")
    public boolean field1319 = false;

    @OriginalMember(owner = "PQRCEBTR", name = "g", descriptor = "Z")
    public boolean field1320 = true;

    @OriginalMember(owner = "PQRCEBTR", name = "a", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "PQRCEBTR", name = "d", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "PQRCEBTR", name = "h", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "PQRCEBTR", name = "i", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "PQRCEBTR", name = "j", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "PQRCEBTR", name = "k", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "PQRCEBTR", name = "l", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "PQRCEBTR", name = "m", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "PQRCEBTR", name = "c", descriptor = "Ljava/lang/String;")
    public String field1316;

    @OriginalMember(owner = "PQRCEBTR", name = "b", descriptor = "[LPQRCEBTR;")
    public static class38[] field1315;

    @OriginalMember(owner = "PQRCEBTR", name = "a", descriptor = "(LDTIATKJO;I)V")
    public static void method443(class8 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        class14 var2 = new class14(-527, arg0.method168("flo.dat", null));
        field1314 = var2.method204();
        if (field1315 == null) {
            field1315 = new class38[field1314];
        }
        for (int var3 = 0; var3 < field1314; var3++) {
            if (field1315[var3] == null) {
                field1315[var3] = new class38();
            }
            field1315[var3].method444(var2, 0);
        }
    }

    @OriginalMember(owner = "PQRCEBTR", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public void method444(class14 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method202();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1317 = arg0.method206();
                this.method445(-4146, this.field1317);
            } else if (var3 == 2) {
                this.field1318 = arg0.method202();
            } else if (var3 == 3) {
                this.field1319 = true;
            } else if (var3 == 5) {
                this.field1320 = false;
            } else if (var3 == 6) {
                this.field1316 = arg0.method209();
            } else if (var3 == 7) {
                int var4 = this.field1321;
                int var5 = this.field1322;
                int var6 = this.field1323;
                int var7 = this.field1324;
                int var8 = arg0.method206();
                this.method445(-4146, var8);
                this.field1321 = var4;
                this.field1322 = var5;
                this.field1323 = var6;
                this.field1324 = var7;
                this.field1325 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "PQRCEBTR", name = "a", descriptor = "(II)V")
    private void method445(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
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
        this.field1321 = (int) (var19 * 256.0D);
        this.field1322 = (int) (var15 * 256.0D);
        this.field1323 = (int) (var17 * 256.0D);
        if (this.field1322 < 0) {
            this.field1322 = 0;
        } else if (this.field1322 > 255) {
            this.field1322 = 255;
        }
        if (this.field1323 < 0) {
            this.field1323 = 0;
        } else if (this.field1323 > 255) {
            this.field1323 = 255;
        }
        if (var17 > 0.5D) {
            this.field1325 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1325 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1325 < 1) {
            this.field1325 = 1;
        }
        this.field1324 = (int) ((double) this.field1325 * var19);
        int var21 = this.field1321 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1322 + (int) (Math.random() * 48.0D) - 24;
        if (arg0 != -4146) {
            return;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1323 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1326 = this.method446(var21, var22, var23);
    }

    @OriginalMember(owner = "PQRCEBTR", name = "a", descriptor = "(III)I")
    private final int method446(int arg0, int arg1, int arg2) {
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
