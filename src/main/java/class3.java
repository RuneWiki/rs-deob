import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AKWMUTZI")
public class class3 {

    @OriginalMember(owner = "client!AKWMUTZI", name = "f", descriptor = "I")
    public int field33 = -1;

    @OriginalMember(owner = "client!AKWMUTZI", name = "g", descriptor = "Z")
    public boolean field34 = false;

    @OriginalMember(owner = "client!AKWMUTZI", name = "h", descriptor = "Z")
    public boolean field35 = true;

    @OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "I")
    private static int field28 = 558;

    @OriginalMember(owner = "client!AKWMUTZI", name = "b", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!AKWMUTZI", name = "e", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!AKWMUTZI", name = "i", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!AKWMUTZI", name = "j", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!AKWMUTZI", name = "k", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!AKWMUTZI", name = "l", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!AKWMUTZI", name = "m", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!AKWMUTZI", name = "n", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!AKWMUTZI", name = "d", descriptor = "Ljava/lang/String;")
    public String field31;

    @OriginalMember(owner = "client!AKWMUTZI", name = "c", descriptor = "[LAKWMUTZI;")
    public static class3[] field30;

    @OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(LFUZJMGZB;I)V")
    public static void method3(class19 arg0, int arg1) {
        class32 var2 = new class32((byte) 114, arg0.method277("flo.dat", null));
        if (arg1 < 5 || arg1 > 5) {
            field28 = 283;
        }
        field29 = var2.method371();
        if (field30 == null) {
            field30 = new class3[field29];
        }
        for (int var3 = 0; var3 < field29; var3++) {
            if (field30[var3] == null) {
                field30[var3] = new class3();
            }
            field30[var3].method4(var2, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(LLBBVYYXO;B)V")
    public void method4(class32 arg0, byte arg1) {
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method369();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field32 = arg0.method373();
                this.method5(27771, this.field32);
            } else if (var3 == 2) {
                this.field33 = arg0.method369();
            } else if (var3 == 3) {
                this.field34 = true;
            } else if (var3 == 5) {
                this.field35 = false;
            } else if (var3 == 6) {
                this.field31 = arg0.method376();
            } else if (var3 == 7) {
                int var4 = this.field36;
                int var5 = this.field37;
                int var6 = this.field38;
                int var7 = this.field39;
                int var8 = arg0.method373();
                this.method5(27771, var8);
                this.field36 = var4;
                this.field37 = var5;
                this.field38 = var6;
                this.field39 = var7;
                this.field40 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(II)V")
    private void method5(int arg0, int arg1) {
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
        if (arg0 != 27771) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var18 < 0.5D) {
                var16 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var16 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var14 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var14 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var14 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field36 = (int) (var20 * 256.0D);
        this.field37 = (int) (var16 * 256.0D);
        this.field38 = (int) (var18 * 256.0D);
        if (this.field37 < 0) {
            this.field37 = 0;
        } else if (this.field37 > 255) {
            this.field37 = 255;
        }
        if (this.field38 < 0) {
            this.field38 = 0;
        } else if (this.field38 > 255) {
            this.field38 = 255;
        }
        if (var18 > 0.5D) {
            this.field40 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field40 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field40 < 1) {
            this.field40 = 1;
        }
        this.field39 = (int) ((double) this.field40 * var20);
        int var22 = this.field36 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field37 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field38 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field41 = this.method6(var22, var23, var24);
    }

    @OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(III)I")
    private final int method6(int arg0, int arg1, int arg2) {
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
