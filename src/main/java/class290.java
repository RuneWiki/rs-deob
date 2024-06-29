import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class290 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Z")
    public boolean field3800 = true;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field3799 = -1;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Z")
    public boolean field3796 = true;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field3798 = 512;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    private int field3809 = 0;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Z")
    public static boolean field3802 = false;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Ltba;")
    public static class165 field3804 = new class165(8);

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field3810 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "[Liea;")
    public static class481[] field3811;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILjava/lang/Class;)Lii;")
    public static final class556 method1735(int arg0, int arg1, int arg2, Class arg3) {
        class14 var4 = class197.field2689[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class621 var5 = var4.field289; var5 != null; var5 = var5.field8560) {
            class556 var6 = var5.field8559;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7734 == arg1 && var6.field7746 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
    private final void method1736(int arg0, int arg1) {
        field3808++;
        if (arg1 <= 3) {
            this.field3800 = false;
        }
        double var3 = (double) ((arg0 & 0xFFB596) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
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
        this.field3803 = (int) (var17 * 256.0D);
        this.field3805 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field3797 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3797 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3803 < 0) {
            this.field3803 = 0;
        } else if (this.field3803 > 255) {
            this.field3803 = 255;
        }
        if (this.field3805 < 0) {
            this.field3805 = 0;
        } else if (this.field3805 > 255) {
            this.field3805 = 255;
        }
        if (this.field3797 < 1) {
            this.field3797 = 1;
        }
        this.field3807 = (int) ((double) this.field3797 * var19);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method1737(int arg0) {
        field3804 = null;
        field3811 = null;
        if (arg0 != 255) {
            method1737(-86);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lsl;B)V")
    public final void method1738(class461 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2600((byte) -124);
            if (var3 == 0) {
                field3806++;
                int var4 = 39 / ((1 - arg1) / 32);
                return;
            }
            this.method1739(var3, (byte) 103, arg0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBLsl;)V")
    private final void method1739(int arg0, byte arg1, class461 arg2) {
        if (arg1 != 103) {
            this.field3803 = 50;
        }
        field3795++;
        if (arg0 == 1) {
            this.field3809 = arg2.method2576((byte) 120);
            this.method1736(this.field3809, 111);
        } else if (arg0 == 2) {
            this.field3799 = arg2.method2566(-2);
            if (this.field3799 == 65535) {
                this.field3799 = -1;
                return;
            }
        } else if (arg0 == 3) {
            this.field3798 = arg2.method2566(arg1 ^ 0xFFFFFF99) << 2;
        } else {
            if (arg0 == 4) {
                this.field3796 = false;
            } else if (arg0 == 5) {
                this.field3800 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILii;)Ltl;")
    public static final class621 method1740(int arg0, class556 arg1) {
        if (arg0 != -15180) {
            method1740(70, null);
        }
        field3801++;
        class621 var2;
        if (class516.field7230 == null) {
            var2 = new class621();
        } else {
            var2 = class516.field7230;
            class516.field7230 = class516.field7230.field8560;
            class263.field3319--;
            var2.field8560 = null;
        }
        var2.field8559 = arg1;
        return var2;
    }
}
