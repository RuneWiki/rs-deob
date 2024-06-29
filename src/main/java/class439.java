import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class439 extends class634 {

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    private int field6371 = 4;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    private int field6374 = 4;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field6372 = 0;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "[I")
    public static int[] field6377 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Luh;")
    public static class166 field6375 = new class166();

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "[Loca;")
    public static class263[] field6379 = new class263[37];

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "[I")
    public static int[] field6376;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
    public static final int method2739(int arg0, int arg1) {
        return class248.field3011 != null ? class248.field3011[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V")
    public static final void method2740(int arg0, int arg1, int arg2) {
        ++field6369;
        int var3 = class96.field1014.method3137((byte) -54, class486.field6928.method2936(class489.field6978, arg1 ^ 102));
        int var5;
        if (!class260.field3231) {
            for (class649 var4 = (class649) class265.field3289.method1719(65280); var4 != null; var4 = (class649) class265.field3289.method1723(-20665)) {
                int var6 = class74.method539(var4, 595681774);
                if (~var3 > ~var6) {
                    var3 = var6;
                }
            }
            class542.field7804 = class343.field4449 * 16 - -(class644.field9214 ? 26 : 22);
            var3 += 8;
            var5 = class343.field4449 * 16 - -21;
        } else {
            for (class177 var7 = (class177) class331.field4291.method2067(22462); var7 != null; var7 = (class177) class331.field4291.method2066(0)) {
                int var10;
                if (~var7.field2078 == -2) {
                    var10 = class74.method539((class649) var7.field2081.field4488.field8923, 595681774);
                } else {
                    var10 = class648.method3691(var7, 29749);
                }
                if (~var10 < ~var3) {
                    var3 = var10;
                }
            }
            var5 = class736.field10289 * 16 + 21;
            var3 += 8;
            class542.field7804 = (class644.field9214 ? 26 : 22) + class736.field10289 * 16;
        }
        int var8 = -(var3 / 2) + arg0;
        if (class705.field9926 < var3 + var8) {
            var8 = -var3 + class705.field9926;
        }
        if (arg1 != 0) {
            method2739(-62, 22);
        }
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg2;
        if (arg2 - -var5 > class476.field6777) {
            var9 = -var5 + class476.field6777;
        }
        if (~var9 > -1) {
            var9 = 0;
        }
        class655.field9351 = var8;
        class183.field2187 = var9;
        class236.field2806 = var3;
        class149.field1652 = true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field6378;
        int[][] var3 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int var4 = class635.field9139 / this.field6371;
            int var5 = class201.field2372 / this.field6374;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3642(0, class201.field2372 * var6 / var5, true);
            } else {
                var7 = this.method3642(0, 0, true);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class635.field9139; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class635.field9139 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        int var17 = 27 % ((-56 - arg0) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public static void method2741(int arg0) {
        field6377 = null;
        if (arg0 != -21) {
            field6379 = null;
        }
        field6376 = null;
        field6375 = null;
        field6379 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class439() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field6374 = arg1.method1423(-27);
            }
        } else {
            this.field6371 = arg1.method1423(-123);
        }
        ++field6373;
        if (arg2) {
            method2739(-93, 22);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field6370;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 >= -55) {
            return null;
        } else {
            if (super.field9114.field3897) {
                int var4 = class635.field9139 / this.field6371;
                int var5 = class201.field2372 / this.field6374;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method3641(class201.field2372 * var6 / var5, 20604, 0);
                } else {
                    var7 = this.method3641(0, 20604, 0);
                }
                for (int var8 = 0; ~var8 > ~class635.field9139; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var7[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class635.field9139 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }
}
