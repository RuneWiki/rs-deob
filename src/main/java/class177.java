import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class177 extends class12 {

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field3517 = -1;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public int field3513 = -1;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field3522 = 0;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Z")
    public boolean field3510 = true;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Lkb;")
    private static class93 field3512 = class76.method390("purple:", 0);

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lkb;")
    public static class93 field3519 = field3512;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lkb;")
    public static class93 field3515 = field3512;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Lkb;")
    public static class93 field3523 = class76.method390("leuchten2:", 0);

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field3518 = 0;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lr;")
    public static class154 field3509 = new class154();

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Lnb;")
    public static class120 field3525 = new class120(5);

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Lkb;")
    public static class93 field3526 = class76.method390("b12_full", 0);

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Lkb;")
    private static class93 field3527 = class76.method390("flash2:", 0);

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lkb;")
    private static class93 field3528 = class76.method390("au", 0);

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Lkb;")
    public static class93 field3530 = field3527;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "Lkb;")
    public static class93 field3531 = field3527;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "Lkb;")
    public static class93 field3532 = class76.method390("http:)4)4", 0);

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "[I")
    public static int[] field3529;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field3532 = null;
        field3512 = null;
        if (arg0 != 1) {
            return;
        }
        field3509 = null;
        field3526 = null;
        field3515 = null;
        field3528 = null;
        field3530 = null;
        field3529 = null;
        field3531 = null;
        field3527 = null;
        field3519 = null;
        field3523 = null;
        field3525 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public static final void method1167(int arg0, int arg1) {
        field3524++;
        if (arg0 == -1 || !class140.field2730[arg0]) {
            return;
        }
        class18.field305.method463(arg0, -42);
        if (class28.field460[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class28.field460[arg0].length; var3++) {
            if (class28.field460[arg0][var3] != null) {
                if (class28.field460[arg0][var3].field1076 == 2) {
                    var2 = false;
                } else {
                    class28.field460[arg0][var3] = null;
                }
            }
        }
        if (arg1 < 64) {
            field3530 = null;
        }
        if (var2) {
            class28.field460[arg0] = null;
        }
        class140.field2730[arg0] = false;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(ZLkb;)I")
    public static final int method1168(boolean arg0, class93 arg1) {
        field3520++;
        if (class139.field2693 == 1) {
            return 7;
        } else if (arg1.method501(-104, class194.field3766)) {
            return 1;
        } else if (arg1.method501(-116, class75.field1358)) {
            return 1;
        } else if (arg1.method501(-120, class186.field3649)) {
            return 2;
        } else if (arg1.method501(-108, class14.field251)) {
            return 2;
        } else {
            if (arg0) {
                field3530 = null;
            }
            if (arg1.method501(-67, field3528)) {
                return 3;
            } else if (arg1.method501(-57, class28.field464)) {
                return 4;
            } else if (arg1.method501(-4, class69.field1275)) {
                return 4;
            } else if (arg1.method501(-126, class64.field1019)) {
                return 5;
            } else if (arg1.method501(-21, class126.field2372)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lrd;IB)V")
    public final void method1169(class158 arg0, int arg1, byte arg2) {
        if (arg2 != -12) {
            return;
        }
        field3521++;
        while (true) {
            int var4 = arg0.method1054(128);
            if (var4 == 0) {
                return;
            }
            this.method1172(arg1, (byte) -126, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
    private final int method1170(int arg0, int arg1) {
        field3514++;
        if (arg0 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        int var11 = -16 / ((arg1 - 62) / 53);
        if (var3 < var5) {
            var9 = var3;
        }
        double var12 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        double var14 = var5;
        if (var5 < var3) {
            var14 = var3;
        }
        if (var7 > var14) {
            var14 = var7;
        }
        double var16 = (var9 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        double var19 = 0.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var9 != var14) {
            if (var5 == var14) {
                var12 = (var3 - var7) / (-var9 + var14);
            } else if (var3 == var14) {
                var12 = (var7 - var5) / (-var9 + var14) + 2.0D;
            } else if (var7 == var14) {
                var12 = (var5 - var3) / (var14 - var9) + 4.0D;
            }
            if (var16 < 0.5D) {
                var19 = (var14 - var9) / (var9 + var14);
            }
            if (var16 >= 0.5D) {
                var19 = (var14 - var9) / (2.0D - var14 - var9);
            }
        }
        int var21 = (int) (var19 * 256.0D);
        double var22 = var12 / 6.0D;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var24 = (int) (var22 * 256.0D);
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var18 >> 1) + ((var24 >> 2 << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
    public static final boolean method1171(int arg0, int arg1, int arg2) {
        field3516++;
        if (arg0 != -218) {
            method1168(false, null);
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBILrd;)V")
    private final void method1172(int arg0, byte arg1, int arg2, class158 arg3) {
        field3511++;
        if (arg1 >= -109) {
            this.field3513 = -53;
        }
        if (arg2 == 1) {
            this.field3522 = this.method1170(arg3.method1060(255), 127);
        } else if (arg2 == 2) {
            this.field3517 = arg3.method1054(128);
            return;
        } else if (arg2 == 3) {
            this.field3517 = arg3.method1071(28101);
            if (this.field3517 == 65535) {
                this.field3517 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field3510 = false;
            return;
        } else {
            if (arg2 == 7) {
                this.field3513 = this.method1170(arg3.method1060(255), 115);
            } else if (arg2 != 8 && arg2 == 9) {
                arg3.method1071(28101);
                return;
            }
            return;
        }
    }
}
