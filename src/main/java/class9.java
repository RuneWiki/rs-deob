import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EPJTEXKD")
public class class9 {

    @OriginalMember(owner = "client!EPJTEXKD", name = "f", descriptor = "I")
    public int field597 = -1;

    @OriginalMember(owner = "client!EPJTEXKD", name = "g", descriptor = "Z")
    public boolean field598 = false;

    @OriginalMember(owner = "client!EPJTEXKD", name = "h", descriptor = "Z")
    public boolean field599 = true;

    @OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "Z")
    private static boolean field592 = true;

    @OriginalMember(owner = "client!EPJTEXKD", name = "b", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!EPJTEXKD", name = "e", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!EPJTEXKD", name = "i", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!EPJTEXKD", name = "j", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!EPJTEXKD", name = "k", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!EPJTEXKD", name = "l", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!EPJTEXKD", name = "m", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!EPJTEXKD", name = "n", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!EPJTEXKD", name = "d", descriptor = "Ljava/lang/String;")
    public String field595;

    @OriginalMember(owner = "client!EPJTEXKD", name = "c", descriptor = "[LEPJTEXKD;")
    public static class9[] field594;

    @OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(LWEMOPWVJ;I)V")
    public static void method171(class62 arg0, int arg1) {
        class52 var2 = new class52(arg0.method559("flo.dat", null), true);
        if (arg1 != 24414) {
            field592 = !field592;
        }
        field593 = var2.method463();
        if (field594 == null) {
            field594 = new class9[field593];
        }
        for (int var3 = 0; var3 < field593; var3++) {
            if (field594[var3] == null) {
                field594[var3] = new class9();
            }
            field594[var3].method172(-13096, var2);
        }
    }

    @OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public void method172(int arg0, class52 arg1) {
        if (arg0 != -13096) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method461();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field596 = arg1.method465();
                this.method173(this.field596, -2629);
            } else if (var3 == 2) {
                this.field597 = arg1.method461();
            } else if (var3 == 3) {
                this.field598 = true;
            } else if (var3 == 5) {
                this.field599 = false;
            } else if (var3 == 6) {
                this.field595 = arg1.method468();
            } else if (var3 == 7) {
                int var4 = this.field600;
                int var5 = this.field601;
                int var6 = this.field602;
                int var7 = this.field603;
                int var8 = arg1.method465();
                this.method173(var8, -2629);
                this.field600 = var4;
                this.field601 = var5;
                this.field602 = var6;
                this.field603 = var7;
                this.field604 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(II)V")
    private void method173(int arg0, int arg1) {
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
        if (arg1 != -2629) {
            field592 = !field592;
        }
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
        this.field600 = (int) (var19 * 256.0D);
        this.field601 = (int) (var15 * 256.0D);
        this.field602 = (int) (var17 * 256.0D);
        if (this.field601 < 0) {
            this.field601 = 0;
        } else if (this.field601 > 255) {
            this.field601 = 255;
        }
        if (this.field602 < 0) {
            this.field602 = 0;
        } else if (this.field602 > 255) {
            this.field602 = 255;
        }
        if (var17 > 0.5D) {
            this.field604 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field604 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field604 < 1) {
            this.field604 = 1;
        }
        this.field603 = (int) ((double) this.field604 * var19);
        int var21 = this.field600 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field601 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field602 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field605 = this.method174(var21, var22, var23);
    }

    @OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(III)I")
    private final int method174(int arg0, int arg1, int arg2) {
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
