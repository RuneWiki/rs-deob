import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class201 extends class300 {

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    private int field3170 = 32768;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "[I")
    public static int[] field3166 = new int[3];

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3169 = "Please remove ";

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "J")
    public static long field3174 = 0L;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Ltf;")
    public static class244 field3176;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field3171;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field4784 = arg0.method1218(-106) == 1;
            }
        } else {
            this.field3170 = arg0.method1186((byte) -110) << 4;
        }
        if (arg1 > -43) {
            method1396(-88);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field3175;
        if (arg1 != -957953300) {
            this.method35((class170) null, (byte) -113, 119);
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int[] var4 = this.method2018(1, arg1 ^ 957953299, arg0);
            int[] var5 = this.method2018(2, -1, arg0);
            for (int var6 = 0; class180.field2826 > var6; ++var6) {
                int var7 = var5[var6] * this.field3170 >> 12;
                int var8 = var4[var6] >> 4 & 255;
                int var9 = class299.field4774[var8] * var7 >> 12;
                int var10 = (var9 >> 12) + arg0 & class285.field4611;
                int var11 = class255.field4160[var8] * var7 >> 12;
                int var12 = class277.field4503 & (var11 >> 12) + var6;
                int[] var13 = this.method2018(0, -1, var10);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        field3176 = null;
        if (arg0 == 32) {
            field3166 = null;
            field3169 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class201() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        class158.field2372 = -1;
        class105.field1530 = -1;
        class205.field3200 = 0;
        class150.field2218.field2676 = 0;
        class175.field2763.field2676 = 0;
        class215.field3354 = 0;
        class297.field4735 = -1;
        class311.field4995 = false;
        class173.field2721 = 0;
        int var1 = -103 / ((arg0 - -11) / 39);
        class303.field4812 = -1;
        class262.field4252 = 0;
        class181.method1284(0);
        ++field3173;
        for (int var2 = 0; var2 < class35.field409.length; ++var2) {
            if (class35.field409[var2] != null) {
                class35.field409[var2].field3927 = -1;
            }
        }
        for (int var3 = 0; ~class191.field3045.length < ~var3; ++var3) {
            if (class191.field3045[var3] != null) {
                class191.field3045[var3].field3927 = -1;
            }
        }
        class243.method1727(107);
        class158.field2370 = 1;
        class95.method651(30, (byte) 51);
        for (int var4 = 0; var4 < 100; ++var4) {
            class302.field4808[var4] = true;
        }
        class38.method218(-8);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBIIII)V")
    public static final void method1397(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3172;
        class16.method97(-7, class78.field1180[arg4], arg3 + arg5, arg0, -arg5 + arg3);
        int var6 = 0;
        int var7 = arg5 * arg5;
        int var8 = arg2;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        int var13 = -((var12 - 1) * var11) + var9;
        int var14 = var9 << 2;
        int var15 = (-var12 + 1) * var7 - -var10;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var14;
        int var20 = (arg2 - 1) * var16;
        while (var8 > 0) {
            --var8;
            int var22 = arg4 - -var8;
            if (var15 < 0) {
                while (~var15 > -1) {
                    var13 += var19;
                    ++var6;
                    var19 += var14;
                    var15 += var17;
                    var17 += var14;
                }
            }
            if (~var13 > -1) {
                ++var6;
                var13 += var19;
                var15 += var17;
                var19 += var14;
                var17 += var14;
            }
            var15 += -var20;
            var13 += -var18;
            int var23 = -var8 + arg4;
            var20 -= var16;
            var18 -= var16;
            int var24 = arg3 + var6;
            int var25 = arg3 - var6;
            class16.method97(-7, class78.field1180[var23], var24, arg0, var25);
            class16.method97(-7, class78.field1180[var22], var24, arg0, var25);
        }
        int var21 = -82 % ((-68 - arg1) / 33);
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)Lfe;")
    public static final class231 method1398(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        ++field3177;
        int var3 = arg0 & 65535;
        if (class68.field1018[var2] == null || class68.field1018[var2][var3] == null) {
            boolean var4 = class190.method1322(var2, (byte) 97);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != 0) {
            field3174 = -112L;
        }
        return class68.field1018[var2][var3];
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field3167;
        if (arg0 <= 126) {
            this.method99(58, 100);
        }
        class123.method801(-104);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = -111 % (-arg0 / 47);
        ++field3178;
        int[][] var4 = super.field4786.method538(arg1, (byte) 121);
        if (super.field4786.field1200) {
            int[] var5 = this.method2018(1, -1, arg1);
            int[] var6 = this.method2018(2, -1, arg1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class180.field2826; ++var10) {
                int var11 = (var5[var10] * 255 & 1047795) >> 12;
                int var12 = var6[var10] * this.field3170 >> 12;
                int var13 = class255.field4160[var11] * var12 >> 12;
                int var14 = (var13 >> 12) + var10 & class277.field4503;
                int var15 = class299.field4774[var11] * var12 >> 12;
                int var16 = class285.field4611 & (var15 >> 12) + arg1;
                int[][] var17 = this.method2021(var16, false, 0);
                var7[var10] = var17[0][var14];
                var8[var10] = var17[1][var14];
                var9[var10] = var17[2][var14];
            }
        }
        return var4;
    }
}
