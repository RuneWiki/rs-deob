import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class228 extends class300 {

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3529 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3536 = "Loading interfaces - ";

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "[I")
    public static int[] field3534;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
    public static void method1603(byte arg0) {
        if (arg0 == 109) {
            field3536 = null;
            field3529 = null;
            field3534 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIII)V")
    public static final void method1604(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3526;
        if (~class200.field3150 > -101) {
            class240.method1689(-83);
        }
        class151.method1042(arg0, arg4, arg0 + arg3, arg2 + arg4);
        if (class200.field3150 < 100) {
            byte var5 = 20;
            int var6 = arg3 / 2 + arg0;
            int var7 = arg2 / 2 + arg4 + -18 - var5;
            class151.method1026(arg0, arg4, arg3, arg2, 0);
            class151.method1040(var6 + -152, var7, 304, 34, 9179409);
            class151.method1026(var6 + -150, var7 + 2, class200.field3150 * 3, 30, 9179409);
            class306.field4885.method1473(class130.field1867, var6, var5 + var7, 16777215, -1);
        } else {
            class230.field3553 = -((int) ((float) arg2 / class207.field3245)) + class229.field3544;
            class58.field862 = -((int) ((float) arg3 / class207.field3245)) + class311.field4993;
            class276.field4471 = (int) ((float) (arg3 * 2) / class207.field3245);
            int var8 = class229.field3544 - (int) ((float) arg2 / class207.field3245);
            int var9 = class229.field3544 - -((int) ((float) arg2 / class207.field3245));
            class307.field4895 = (int) ((float) (arg2 * 2) / class207.field3245);
            int var10 = class311.field4993 - -((int) ((float) arg3 / class207.field3245));
            int var11 = class311.field4993 - (int) ((float) arg3 / class207.field3245);
            class207.method1435(var11, var8, var10, var9, arg0, arg4, arg0 - -arg3, arg2 + 1 + arg4);
            class207.method1430();
            class220 var12 = class207.method1441();
            if (arg1 <= 68) {
                field3534 = null;
            }
            class83.method569((byte) 46, var12, 0, 0);
            if (class99.field1490 > 0) {
                --class124.field1785;
                if (~class124.field1785 == -1) {
                    --class99.field1490;
                    class124.field1785 = 20;
                }
            }
            if (class159.field2388) {
                int var13 = arg4 - -arg2 + -8;
                int var14 = arg0 - 5 + arg3;
                class183.field2880.method1481("Fps:" + class266.field4326, var14, var13, 16776960, -1);
                int var15 = 16776960;
                Runtime var16 = Runtime.getRuntime();
                int var18 = var13 - 15;
                int var17 = (int) ((var16.totalMemory() + -var16.freeMemory()) / 1024L);
                if (var17 > 65536) {
                    var15 = 16711680;
                }
                class183.field2880.method1481("Mem:" + var17 + "k", var14, var18, var15, -1);
                var13 = var18 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3528;
        int var8 = arg2 + 1;
        class16.method97(-7, class78.field1180[arg2], arg4, arg1, arg3);
        int var9 = arg5 - 1;
        class16.method97(-7, class78.field1180[arg5], arg4, arg1, arg3);
        int var6 = var8;
        if (arg0 != -13295) {
            method1608((byte) -64, (byte[]) null);
        }
        while (~var6 >= ~var9) {
            int[] var7 = class78.field1180[var6];
            var7[arg3] = var7[arg4] = arg1;
            ++var6;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)I")
    private final int method1606(int arg0, int arg1, int arg2) {
        ++field3531;
        if (arg1 != 15) {
            this.method1606(-107, 90, -100);
        }
        int var4 = arg2 - -(arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)I")
    public static final int method1607(int arg0, int arg1) {
        ++field3527;
        double var2 = (double) ((arg1 & 16738802) >> 16) / 256.0D;
        double var4 = var2;
        double var6 = (double) (255 & arg1 >> 8) / 256.0D;
        if (var2 > var6) {
            var4 = var6;
        }
        double var8 = (double) (arg1 & 255) / 256.0D;
        if (var4 > var8) {
            var4 = var8;
        }
        double var10 = var2;
        double var12 = 0.0D;
        if (var2 < var6) {
            var10 = var6;
        }
        if (arg0 > -61) {
            field3529 = null;
        }
        if (var8 > var10) {
            var10 = var8;
        }
        double var14 = (var4 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var4 != var10) {
            if (var2 != var10) {
                if (var6 != var10) {
                    if (var8 == var10) {
                        var12 = (var2 - var6) / (-var4 + var10) + 4.0D;
                    }
                } else {
                    var12 = (var8 - var2) / (var10 - var4) + 2.0D;
                }
            } else {
                var12 = (-var8 + var6) / (var10 - var4);
            }
            if (var14 < 0.5D) {
                var16 = (var10 - var4) / (var4 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (-var4 + var10) / (-var10 + 2.0D + -var4);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (~var21 <= -1) {
            if (~var21 < -256) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (~var22 < -256) {
            var22 = 255;
        }
        if (var22 <= 243) {
            if (~var22 >= -218) {
                if (~var22 < -193) {
                    var21 >>= 2;
                } else if (var22 > 179) {
                    var21 >>= 1;
                }
            } else {
                var21 >>= 3;
            }
        } else {
            var21 >>= 4;
        }
        return (var20 >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1608(byte arg0, byte[] arg1) {
        ++field3535;
        class170 var2 = new class170(arg1);
        if (arg0 <= 31) {
            field3529 = null;
        }
        int var3 = var2.method1218(-61);
        int var4 = var2.method1190(6345);
        if (~var4 <= -1 && (class183.field2876 == 0 || class183.field2876 >= var4)) {
            if (~var3 == -1) {
                byte[] var7 = new byte[var4];
                var2.method1165(0, false, var4, var7);
                return var7;
            } else {
                int var5 = var2.method1190(6345);
                if (~var5 <= -1 && (~class183.field2876 == -1 || var5 <= class183.field2876)) {
                    byte[] var6 = new byte[var5];
                    if (~var3 == -2) {
                        class155.method1079(var6, var5, arg1, var4, 9);
                    } else {
                        class274.field4453.method388(var6, 10087, var2);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field3525;
        int[] var3 = super.field4797.method217(arg0, true);
        if (arg1 != -957953300) {
            return null;
        } else {
            if (super.field4797.field470) {
                int var4 = class235.field3797[arg0];
                for (int var5 = 0; var5 < class180.field2826; ++var5) {
                    var3[var5] = this.method1606(var4, 15, class5.field73[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)I")
    public static final int method1609(int arg0, boolean arg1) {
        if (!arg1) {
            method1605(105, -35, 81, 123, 112, -9);
        }
        ++field3533;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIB)V")
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3532;
        class181 var5 = class95.method652(4, (byte) 34, arg2);
        if (arg4 == 93) {
            var5.method1285((byte) 64);
            var5.field2847 = arg3;
            var5.field2845 = arg1;
            var5.field2843 = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZBLfc;)V")
    public static final void method1611(boolean arg0, byte arg1, class213 arg2) {
        if (arg0) {
            int var3 = class126.field1814;
            int var4 = var3 * 956 / 503;
            class27.field317.method292((class112.field1626 - var4) / 2, 0, var4, var3);
            class305.field4868.method621(class112.field1626 / 2 + -(class305.field4868.field2946 / 2), 18);
        }
        ++field3530;
        arg2.method1473(~class257.field4188 == -2 ? class112.field1619 : class7.field102, class112.field1626 / 2, class126.field1814 / 2 + -26, 16777215, -1);
        int var5 = class126.field1814 / 2 + -18;
        int var6 = -30 % ((arg1 - 63) / 34);
        class151.method1040(class112.field1626 / 2 - 152, var5, 304, 34, 9179409);
        class151.method1040(class112.field1626 / 2 + -151, var5 + 1, 302, 32, 0);
        class151.method1026(class112.field1626 / 2 + -150, var5 + 2, class166.field2567 * 3, 30, 9179409);
        class151.method1026(class112.field1626 / 2 - 150 - -(class166.field2567 * 3), var5 - -2, -(class166.field2567 * 3) + 300, 30, 0);
        arg2.method1473(class200.field3153, class112.field1626 / 2, class126.field1814 / 2 - -4, 16777215, -1);
    }
}
