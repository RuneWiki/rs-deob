import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GOLZJDMQ")
public class class21 {

    @OriginalMember(owner = "client!GOLZJDMQ", name = "g", descriptor = "I")
    public int field851 = -1;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "h", descriptor = "Z")
    public boolean field852 = false;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "i", descriptor = "Z")
    public boolean field853 = true;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "I")
    private static int field845 = 536;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "b", descriptor = "I")
    private static int field846 = 3;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "c", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "f", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "j", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "k", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "l", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "m", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "n", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "o", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "e", descriptor = "Ljava/lang/String;")
    public String field849;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "d", descriptor = "[LGOLZJDMQ;")
    public static class21[] field848;

    @OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(ILUUIGNTAD;)V")
    public static void method295(int arg0, class59 arg1) {
        if (arg0 < field846 || arg0 > field846) {
            return;
        }
        class10 var2 = new class10(arg1.method545("flo.dat", null), field845);
        field847 = var2.method196();
        if (field848 == null) {
            field848 = new class21[field847];
        }
        for (int var3 = 0; var3 < field847; var3++) {
            if (field848[var3] == null) {
                field848[var3] = new class21();
            }
            field848[var3].method296(var2, -593);
        }
    }

    @OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(LCMGGUSPR;I)V")
    public void method296(class10 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg0.method194();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field850 = arg0.method198();
                this.method297(476, this.field850);
            } else if (var4 == 2) {
                this.field851 = arg0.method194();
            } else if (var4 == 3) {
                this.field852 = true;
            } else if (var4 == 5) {
                this.field853 = false;
            } else if (var4 == 6) {
                this.field849 = arg0.method201();
            } else if (var4 == 7) {
                int var5 = this.field854;
                int var6 = this.field855;
                int var7 = this.field856;
                int var8 = this.field857;
                int var9 = arg0.method198();
                this.method297(476, var9);
                this.field854 = var5;
                this.field855 = var6;
                this.field856 = var7;
                this.field857 = var8;
                this.field858 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(II)V")
    private void method297(int arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        int var7 = 25 / arg0;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var5 < var3) {
            var10 = var5;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var5 > var3) {
            var12 = var5;
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
                var14 = (var5 - var8) / (var12 - var10);
            } else if (var5 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var5) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field854 = (int) (var20 * 256.0D);
        this.field855 = (int) (var16 * 256.0D);
        this.field856 = (int) (var18 * 256.0D);
        if (this.field855 < 0) {
            this.field855 = 0;
        } else if (this.field855 > 255) {
            this.field855 = 255;
        }
        if (this.field856 < 0) {
            this.field856 = 0;
        } else if (this.field856 > 255) {
            this.field856 = 255;
        }
        if (var18 > 0.5D) {
            this.field858 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field858 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field858 < 1) {
            this.field858 = 1;
        }
        this.field857 = (int) ((double) this.field858 * var20);
        int var22 = this.field854 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field855 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field856 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field859 = this.method298(var22, var23, var24);
    }

    @OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(III)I")
    private final int method298(int arg0, int arg1, int arg2) {
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
