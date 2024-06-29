import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LDSGOGGM")
public class class33 {

    @OriginalMember(owner = "client!LDSGOGGM", name = "f", descriptor = "I")
    public int field1119 = -1;

    @OriginalMember(owner = "client!LDSGOGGM", name = "g", descriptor = "Z")
    public boolean field1120 = false;

    @OriginalMember(owner = "client!LDSGOGGM", name = "h", descriptor = "Z")
    public boolean field1121 = true;

    @OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "I")
    private static int field1114 = 34;

    @OriginalMember(owner = "client!LDSGOGGM", name = "b", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!LDSGOGGM", name = "e", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!LDSGOGGM", name = "i", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!LDSGOGGM", name = "j", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!LDSGOGGM", name = "k", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!LDSGOGGM", name = "l", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!LDSGOGGM", name = "m", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!LDSGOGGM", name = "n", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!LDSGOGGM", name = "d", descriptor = "Ljava/lang/String;")
    public String field1117;

    @OriginalMember(owner = "client!LDSGOGGM", name = "c", descriptor = "[LLDSGOGGM;")
    public static class33[] field1116;

    @OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(BLXOJZVVDK;)V")
    public static void method276(byte arg0, class60 arg1) {
        class41 var2 = new class41(888, arg1.method560("flo.dat", null));
        field1115 = var2.method342();
        if (field1116 == null) {
            field1116 = new class33[field1115];
        }
        for (int var3 = 0; var3 < field1115; var3++) {
            if (field1116[var3] == null) {
                field1116[var3] = new class33();
            }
            field1116[var3].method277(var2, false);
        }
        if (arg0 != -82) {
            field1114 = -352;
        }
    }

    @OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    public void method277(class41 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method340();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1118 = arg0.method344();
                this.method278((byte) 0, this.field1118);
            } else if (var3 == 2) {
                this.field1119 = arg0.method340();
            } else if (var3 == 3) {
                this.field1120 = true;
            } else if (var3 == 5) {
                this.field1121 = false;
            } else if (var3 == 6) {
                this.field1117 = arg0.method347();
            } else if (var3 == 7) {
                int var4 = this.field1122;
                int var5 = this.field1123;
                int var6 = this.field1124;
                int var7 = this.field1125;
                int var8 = arg0.method344();
                this.method278((byte) 0, var8);
                this.field1122 = var4;
                this.field1123 = var5;
                this.field1124 = var6;
                this.field1125 = var7;
                this.field1126 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(BI)V")
    private void method278(byte arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        if (arg1 == 16711935) {
            arg1 = 0;
        }
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
        this.field1122 = (int) (var19 * 256.0D);
        this.field1123 = (int) (var15 * 256.0D);
        this.field1124 = (int) (var17 * 256.0D);
        if (this.field1123 < 0) {
            this.field1123 = 0;
        } else if (this.field1123 > 255) {
            this.field1123 = 255;
        }
        if (this.field1124 < 0) {
            this.field1124 = 0;
        } else if (this.field1124 > 255) {
            this.field1124 = 255;
        }
        if (var17 > 0.5D) {
            this.field1126 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1126 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1126 < 1) {
            this.field1126 = 1;
        }
        this.field1125 = (int) ((double) this.field1126 * var19);
        int var21 = this.field1122 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1123 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1124 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1127 = this.method279(var21, var22, var23);
    }

    @OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(III)I")
    private final int method279(int arg0, int arg1, int arg2) {
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
