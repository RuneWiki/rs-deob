import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kh")
public class class102 extends class85 {

    @OriginalMember(owner = "kh", name = "Q", descriptor = "I")
    private int field2015 = 4096;

    @OriginalMember(owner = "kh", name = "T", descriptor = "[I")
    public static int[] field2018 = new int[2048];

    @OriginalMember(owner = "kh", name = "R", descriptor = "Lrc;")
    public static class160 field2016 = new class160(64);

    @OriginalMember(owner = "kh", name = "W", descriptor = "Llf;")
    public static class109 field2021 = class35.method275("Begeben Sie sich in ein freies Gebiet)1 um", 2);

    @OriginalMember(owner = "kh", name = "Z", descriptor = "I")
    public static int field2024 = 0;

    @OriginalMember(owner = "kh", name = "S", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "kh", name = "U", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "kh", name = "V", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "kh", name = "X", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "kh", name = "Y", descriptor = "Lke;")
    public static class99 field2023;

    @OriginalMember(owner = "kh", name = "c", descriptor = "(III)V")
    public static final void method733(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class44.field920; ++var3) {
            for (int var4 = 0; var4 < class103.field2036; ++var4) {
                for (int var5 = 0; var5 < class65.field1245; ++var5) {
                    class3 var6 = class78.field1550[var3][var4][var5];
                    if (var6 != null) {
                        class12 var7 = var6.field31;
                        if (var7 != null && var7.field188 instanceof class135) {
                            class135 var8 = (class135) var7.field188;
                            class45.method312(var8, var3, var4, var5, 1, 1);
                            if (var7.field190 instanceof class135) {
                                class135 var9 = (class135) var7.field190;
                                class45.method312(var9, var3, var4, var5, 1, 1);
                                class135.method959(var8, var9, 0, 0, 0, false);
                                var7.field190 = var9.method967(var9.field2602, var9.field2598, arg0, arg1, arg2, false, false);
                            }
                            var7.field188 = var8.method967(var8.field2602, var8.field2598, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field13; ++var10) {
                            class45 var13 = var6.field17[var10];
                            if (var13 != null && var13.field945 instanceof class135) {
                                class135 var14 = (class135) var13.field945;
                                class45.method312(var14, var3, var4, var5, var13.field927 - var13.field947 + 1, var13.field944 - var13.field932 + 1);
                                var13.field945 = var14.method967(var14.field2602, var14.field2598, arg0, arg1, arg2, false, false);
                            }
                        }
                        class50 var11 = var6.field27;
                        if (var11 != null && var11.field1027 instanceof class135) {
                            class135 var12 = (class135) var11.field1027;
                            class57.method375(var12, var3, var4, var5);
                            var11.field1027 = var12.method967(var12.field2602, var12.field2598, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "kh", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (~arg1 == -1) {
            this.field2015 = arg2.method569(true);
        }
        if (arg0 < -120) {
            ++field2019;
        }
    }

    @OriginalMember(owner = "kh", name = "a", descriptor = "(IBI)I")
    public static final int method734(int arg0, byte arg1, int arg2) {
        ++field2017;
        int var3 = -128 + class115.method845(arg1 ^ 24919, 4, arg0 - -91923, arg2 + 45365) + (class115.method845(24916, 2, arg0 + 37821, arg2 - -10294) - 128 >> 1) - -(-128 + class115.method845(24916, 1, arg0, arg2) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 >= 10) {
            if (~var4 < -61) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        return arg1 != 3 ? -11 : var4;
    }

    @OriginalMember(owner = "kh", name = "d", descriptor = "(B)V")
    public static void method735(byte arg0) {
        field2021 = null;
        field2018 = null;
        field2023 = null;
        int var1 = -73 % ((arg0 - 14) / 50);
        field2016 = null;
    }

    @OriginalMember(owner = "kh", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field2022;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 >= -49) {
            field2021 = null;
        }
        if (super.field1736.field2253) {
            int[] var4 = this.method540(class150.field2892 & arg1 + -1, 26, 0);
            int[] var5 = this.method540(arg1, -124, 0);
            int[] var6 = this.method540(class150.field2892 & arg1 + 1, 61, 0);
            for (int var7 = 0; ~class57.field1152 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2015;
                int var9 = var8 >> 12;
                int var10 = (var5[class29.field624 & var7 + 1] + -var5[class29.field624 & var7 - 1]) * this.field2015;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var12 + 4096 + var13) / 4096)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "kh", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, true);
    }
}
