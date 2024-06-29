import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class225 {

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
    public boolean field3929 = true;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    private int field3931 = 0;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field3932 = 128;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field3941 = -1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lmh;")
    public static class128 field3919 = class22.method156(125, "Nehmen");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3920 = 0;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field3930 = 0;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lmh;")
    private static class128 field3934 = class22.method156(124, "slide:");

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lmh;")
    public static class128 field3936 = field3934;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "S")
    public static short field3926 = 205;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lmh;")
    public static class128 field3940 = field3934;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lek;")
    public static class174 field3928;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 14)
    private final void method1547(int arg0, int arg1) {
        field3923++;
        double var3 = (double) ((arg1 & 0xFF7F9E) >> 16) / 256.0D;
        double var5 = var3;
        double var7 = var3;
        double var9 = 0.0D;
        double var11 = (double) ((arg1 & 0xFF07) >> 8) / 256.0D;
        if (var3 < var11) {
            var7 = var11;
        }
        double var13 = 0.0D;
        double var15 = (double) (arg1 & 0xFF) / 256.0D;
        if (var7 < var15) {
            var7 = var15;
        }
        if (var11 < var3) {
            var5 = var11;
        }
        if (var15 < var5) {
            var5 = var15;
        }
        double var17 = (var5 + var7) / 2.0D;
        if (var5 != var7) {
            if (var3 == var7) {
                var9 = (var11 - var15) / (var7 - var5);
            } else if (var7 == var11) {
                var9 = (var15 - var3) / (var7 - var5) + 2.0D;
            } else if (var7 == var15) {
                var9 = (var3 - var11) / (var7 - var5) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var7 - var5) / (var5 + var7);
            }
            if (var17 >= 0.5D) {
                var13 = (var7 - var5) / (2.0D - var7 - var5);
            }
        }
        if (var17 > 0.5D) {
            this.field3937 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3937 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var9 / 6.0D;
        if (this.field3937 < 1) {
            this.field3937 = 1;
        }
        this.field3922 = (int) (var13 * 256.0D);
        this.field3933 = (int) (var17 * 256.0D);
        if (~this.field3933 > arg0) {
            this.field3933 = 0;
        } else if (this.field3933 > 255) {
            this.field3933 = 255;
        }
        this.field3939 = (int) ((double) this.field3937 * var19);
        if (this.field3922 < 0) {
            this.field3922 = 0;
        } else if (this.field3922 > 255) {
            this.field3922 = 255;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lbg;IB)V", line = 124)
    public final void method1548(class194 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1325(7627);
            if (var4 == 0) {
                field3927++;
                int var5 = -21 / ((78 - arg2) / 46);
                return;
            }
            this.method1549(arg0, (byte) 50, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lbg;BII)V", line = 144)
    private final void method1549(class194 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 50) {
            this.method1547(80, -25);
        }
        field3925++;
        if (arg2 == 1) {
            this.field3931 = arg0.method1349((byte) 91);
            this.method1547(-1, this.field3931);
        } else if (arg2 == 2) {
            this.field3941 = arg0.method1308(-26);
            if (this.field3941 == 65535) {
                this.field3941 = -1;
            }
        } else if (arg2 == 3) {
            this.field3932 = arg0.method1308(-63);
        } else if (arg2 == 4) {
            this.field3929 = false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBI)V", line = 186)
    public static final void method1550(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3924++;
        int var5 = 0;
        int var6 = arg0;
        class314.method2138(arg0 + arg2, true, arg4, class219.field3850[arg1], arg2 - arg0);
        if (arg3 < 121) {
            return;
        }
        int var7 = -arg0;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class219.field3850[arg1 + var6];
                var7 -= var6 << 1;
                int[] var10 = class219.field3850[arg1 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class314.method2138(var11, true, arg4, var9, var12);
                class314.method2138(var11, true, arg4, var10, var12);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class219.field3850[arg1 + var5];
            int[] var16 = class219.field3850[arg1 - var5];
            class314.method2138(var13, true, arg4, var15, var14);
            class314.method2138(var13, true, arg4, var16, var14);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 238)
    public static void method1551(int arg0) {
        field3928 = null;
        field3919 = null;
        int var1 = 110 % ((-arg0 - 20) / 36);
        field3936 = null;
        field3934 = null;
        field3940 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILem;)Lem;", line = 261)
    public static final class10 method1552(int arg0, class10 arg1) {
        field3921++;
        if (arg1.field267 != -1) {
            return class233.method1606(true, arg1.field267);
        }
        int var2 = arg1.field230 >>> 16;
        class151 var3 = new class151(class182.field3198);
        int var4 = -47 % ((-arg0 - 77) / 43);
        for (class88 var5 = (class88) var3.method1006(0); var5 != null; var5 = (class88) var3.method1010((byte) -118)) {
            if (var5.field1510 == var2) {
                return class233.method1606(true, (int) var5.field4915);
            }
        }
        return null;
    }
}
