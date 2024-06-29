import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class186 extends class748 {

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    private int field2727 = 4096;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    private int field2724 = 3216;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    private int field2732 = 3216;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "[I")
    private int[] field2723 = new int[3];

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "Lqs;")
    public static class605 field2725 = new class605();

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field2734 = new String[8];

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "[I")
    public static int[] field2737 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
    public static final void method1246(byte arg0, int arg1) {
        ++field2722;
        if (arg0 != -14) {
            method1248(33, 83, 30);
        }
        class118 var2 = class126.method814(true, arg1, 8);
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2728;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            method1249(0, 95, -125);
        }
        if (super.field10407.field9527) {
            int var4 = class752.field10444 * this.field2727 >> 12;
            int[] var5 = this.method4157(0, (byte) -96, arg0 + -1 & class150.field2077);
            int[] var6 = this.method4157(0, (byte) 89, arg0);
            int[] var7 = this.method4157(0, (byte) -122, class150.field2077 & arg0 + 1);
            for (int var8 = 0; ~var8 > ~class424.field5889; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class354.field4552] + -var6[var8 - -1 & class354.field4552]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class488.field6579[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field2723[0] * var14 >> 12;
                int var18 = this.field2723[2] * var15 >> 12;
                int var19 = this.field2723[1] * var16 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2729;
        class200 var10 = null;
        for (class200 var11 = (class200) class503.field7030.method3118((byte) 73); var11 != null; var11 = (class200) class503.field7030.method3111(118)) {
            if (var11.field2893 == arg1 && var11.field2900 == arg4 && ~var11.field2895 == ~arg8 && var11.field2894 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class200();
            var10.field2894 = arg7;
            var10.field2900 = arg4;
            var10.field2893 = arg1;
            var10.field2895 = arg8;
            if (arg4 >= 0 && ~arg8 <= -1 && ~class514.field7179 < ~arg4 && ~arg8 > ~class456.field6281) {
                class576.method3444(true, var10);
            }
            class503.field7030.method3116(29066, var10);
        }
        var10.field2896 = arg3;
        var10.field2891 = arg2;
        var10.field2903 = arg9;
        var10.field2889 = arg6;
        if (arg0 == 0) {
            var10.field2899 = arg5;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(III)Z")
    public static final boolean method1248(int arg0, int arg1, int arg2) {
        ++field2733;
        if (arg1 <= 32) {
            return true;
        } else {
            return ~(458752 & arg2) != -1 | class453.method2727(65, arg2, arg0) || class705.method3964(arg0, arg2, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(III)V")
    public static final void method1249(int arg0, int arg1, int arg2) {
        ++field2726;
        class364 var3 = class87.field1201[arg2][arg1];
        if (var3 != null) {
            class354.field4554 = var3.field4663;
            class646.field9165 = var3.field4654;
            class395.field5492 = var3.field4662;
        }
        class477.method2823((byte) 95);
        if (arg0 != -4755) {
            method1247(-8, 19, 17, 55, -26, 14, -65, 63, -4, -9);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field2735;
        if (arg1) {
            method1248(-94, -105, 5);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2724 = arg2.method193(2);
                }
            } else {
                this.field2732 = arg2.method193(2);
            }
        } else {
            this.field2727 = arg2.method193(2);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        if (arg0 != 67) {
            method1249(-36, -75, 72);
        }
        this.method1250(false);
        ++field2730;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
    private final void method1250(boolean arg0) {
        ++field2731;
        double var2 = Math.cos((double) ((float) this.field2724 / 4096.0F));
        this.field2723[0] = (int) (Math.sin((double) ((float) this.field2732 / 4096.0F)) * var2 * 4096.0D);
        this.field2723[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2732 / 4096.0F)));
        this.field2723[2] = (int) (Math.sin((double) ((float) this.field2724 / 4096.0F)) * 4096.0D);
        int var4 = this.field2723[0] * this.field2723[0] >> 12;
        if (!arg0) {
            int var5 = this.field2723[1] * this.field2723[1] >> 12;
            int var6 = this.field2723[2] * this.field2723[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 - -var6 + var5 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field2723[2] = (this.field2723[2] << 12) / var7;
                this.field2723[0] = (this.field2723[0] << 12) / var7;
                this.field2723[1] = (this.field2723[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V")
    public static void method1251(int arg0) {
        field2737 = null;
        if (arg0 <= 23) {
            method1251(108);
        }
        field2725 = null;
        field2734 = null;
    }
}
