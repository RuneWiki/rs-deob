import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class190 extends class219 {

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    private int field3250 = 1;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    private int field3254 = 1;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Lbd;")
    public static class162 field3248 = class17.method142(0, ":tradereq:");

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Lbd;")
    public static class162 field3246 = null;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Lbd;")
    private static class162 field3241 = class17.method142(0, " more options");

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Lbd;")
    public static class162 field3245 = field3241;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "Lbd;")
    public static class162 field3242 = class17.method142(0, "(Y<)4col>");

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "[I")
    public static int[] field3253;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "[[[B")
    public static byte[][][] field3244;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lpc;", line = 17)
    public static final class87 method1415(int arg0, int arg1) {
        if (arg1 != 6047) {
            return (class87) null;
        }
        field3240++;
        class87 var2 = (class87) class230.field3827.method1382((byte) -71, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class19.field314.method1128(arg0, arg1 ^ 0x179F, 1);
        } else {
            var3 = class301.field5010.method1128(arg0 & 0x7FFF, 0, 1);
        }
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method662(false, new class94(var3));
        }
        if (arg0 >= 32768) {
            var4.method660(arg1 - 22999);
        }
        class230.field3827.method1386(var4, -119, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V", line = 50)
    public static final void method1416(byte arg0) {
        if (arg0 < 87) {
            return;
        }
        class63.field975.method352(10);
        field3247++;
        int var1 = class63.field975.method344(2, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class63.field975.method344(2, 2);
        if (var2 == 0) {
            class181.field3118[class267.field4446++] = 2047;
        } else if (var2 == 1) {
            int var10 = class63.field975.method344(2, 3);
            class122.field2215.method2053(var10, false, 0);
            int var11 = class63.field975.method344(2, 1);
            if (var11 == 1) {
                class181.field3118[class267.field4446++] = 2047;
            }
        } else if (var2 == 2) {
            int var7 = class63.field975.method344(2, 3);
            class122.field2215.method2053(var7, true, 0);
            int var8 = class63.field975.method344(2, 3);
            class122.field2215.method2053(var8, true, 0);
            int var9 = class63.field975.method344(2, 1);
            if (var9 == 1) {
                class181.field3118[class267.field4446++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class63.field975.method344(2, 7);
            int var4 = class63.field975.method344(2, 1);
            if (var4 == 1) {
                class181.field3118[class267.field4446++] = 2047;
            }
            class157.field2765 = class63.field975.method344(2, 2);
            int var5 = class63.field975.method344(2, 1);
            int var6 = class63.field975.method344(2, 7);
            class122.field2215.method288(var3, var6, -28150, ~var5 == -2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILb;)V", line = 148)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == 0) {
            this.field3250 = arg2.method756(arg1 ^ 0x36979D60);
        } else if (arg0 == 1) {
            this.field3254 = arg2.method756(915905888);
        } else if (arg0 == 2) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        if (arg1 != 0) {
            field3242 = (class162) null;
        }
        field3252++;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 193)
    public class190() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[I", line = 209)
    public final int[] method41(boolean arg0, int arg1) {
        field3243++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (!arg0) {
            return (int[]) null;
        }
        if (this.field3654.field4967) {
            int var4 = this.field3254 + this.field3254 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3250 + this.field3250 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field3254; var9 <= this.field3254 + arg1; var9++) {
                int[] var10 = this.method1585(0, var9 & class60.field927, -6606);
                int[] var11 = new int[class128.field2326];
                int var12 = 0;
                for (int var13 = -this.field3250; var13 <= this.field3250; var13++) {
                    var12 += var10[var13 & class252.field4208];
                }
                int var14 = 0;
                while (class128.field2326 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class252.field4208 & var14 - this.field3250];
                    var14++;
                    var12 = var10[class252.field4208 & var14 + this.field3250] + var15;
                }
                var8[this.field3254 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class128.field2326; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[[I", line = 296)
    public final int[][] method219(int arg0, byte arg1) {
        if (arg1 != 83) {
            this.method42(-46, -62, (class94) null);
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        field3251++;
        if (this.field3651.field917) {
            int var4 = this.field3254 + this.field3254 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field3250 + this.field3250 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg0 - this.field3254; var9 <= this.field3254 + arg0; var9++) {
                int[][] var10 = this.method1583(var9 & class60.field927, true, 0);
                int var11 = 0;
                int var12 = 0;
                int[] var13 = var10[1];
                int[] var14 = var10[0];
                int[][] var15 = new int[3][class128.field2326];
                int[] var16 = var10[2];
                int var17 = 0;
                for (int var18 = -this.field3250; var18 <= this.field3250; var18++) {
                    int var19 = var18 & class252.field4208;
                    var12 += var13[var19];
                    var11 += var14[var19];
                    var17 += var16[var19];
                }
                int[] var20 = var15[0];
                int[] var21 = var15[1];
                int[] var22 = var15[2];
                int var23 = 0;
                while (var23 < class128.field2326) {
                    var20[var23] = var8 * var11 >> 16;
                    var21[var23] = var8 * var12 >> 16;
                    var22[var23] = var8 * var17 >> 16;
                    int var24 = var23 - this.field3250 & class252.field4208;
                    int var25 = var12 - var13[var24];
                    int var26 = var11 - var14[var24];
                    var23++;
                    int var27 = var17 - var16[var24];
                    int var28 = this.field3250 + var23 & class252.field4208;
                    var17 = var16[var28] + var27;
                    var11 = var14[var28] + var26;
                    var12 = var13[var28] + var25;
                }
                var6[this.field3254 + var9 - arg0] = var15;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class128.field2326; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var33 += var37[0][var32];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lda;I)V", line = 432)
    public static final void method1417(class143 arg0, int arg1) {
        field3249++;
        class18.field303 = class91.method686(class51.field818, arg0, (byte) 49, 0);
        class129.field2336 = new class99[class18.field303.length];
        class297.field4978 = new class99[class18.field303.length];
        class128.field2325 = new class99[class18.field303.length];
        for (int var2 = 0; var2 < class18.field303.length; var2++) {
            class18.field303[var2].method792();
            class129.field2336[var2] = class18.field303[var2].method793();
            class18.field303[var2].method792();
            class297.field4978[var2] = class18.field303[var2].method793();
            class18.field303[var2].method792();
            class128.field2325[var2] = class18.field303[var2].method793();
            class18.field303[var2].method792();
        }
        class63.field989 = class216.method1570(29931, 0, class42.field676, arg0);
        class213.field3579 = class39.method290(0, class250.field4181, arg0, 0);
        class106.field1926 = class39.method290(0, class207.field3497, arg0, 0);
        class165.field2924 = class39.method290(0, class10.field119, arg0, 0);
        class50.field801 = class39.method290(0, class295.field4944, arg0, 0);
        class251.field4187 = class173.method1323(arg1 + 234, arg0, class314.field5291, 0);
        class27.field463 = class173.method1323(255, arg0, class172.field2981, 0);
        class305.field5140 = class265.method1816(0, arg0, (byte) 52, class115.field2043);
        class62.field959 = class173.method1323(255, arg0, class110.field1994, 0);
        class93.field1642 = class173.method1323(255, arg0, class213.field3571, 0);
        class46.field731 = class120.method978(class233.field3881, (byte) 37, 0, arg0);
        class131.field2360 = class120.method978(class205.field3462, (byte) 33, 0, arg0);
        class268.field4487.method1877(class131.field2360, (int[]) null);
        class286.field4831.method1877(class131.field2360, (int[]) null);
        class207.field3507.method1877(class131.field2360, (int[]) null);
        if (class117.field2159) {
            class287.field4837 = class91.method686(class278.field4670, arg0, (byte) 49, 0);
            for (int var3 = 0; var3 < class287.field4837.length; var3++) {
                class287.field4837[var3].method789();
            }
        }
        class79 var4 = class112.method902(class106.field1929, arg0, 0, 29);
        var4.method612();
        if (class117.field2159) {
            class218.field3629 = new class140(var4);
        } else {
            class218.field3629 = var4;
        }
        class79[] var5 = class216.method1570(29931, 0, class162.field2833, arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method612();
        }
        if (class117.field2159) {
            class222.field3709 = new class71[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class222.field3709[var7] = new class140(var5[var7]);
            }
        } else {
            class222.field3709 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * (double) arg1) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class63.field989.length; var12++) {
            class63.field989[var12].method614(var8 + var11, var9 + var11, var10 + var11);
        }
        class18.field303[0].method794(var8 + var11, var9 + var11, var10 + var11);
        if (class117.field2159) {
            class258.field4284 = new class71[class63.field989.length];
            for (int var13 = 0; var13 < class63.field989.length; var13++) {
                class258.field4284[var13] = new class140(class63.field989[var13]);
            }
        } else {
            class258.field4284 = class63.field989;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V", line = 548)
    public static void method1418(boolean arg0) {
        if (arg0) {
            field3245 = (class162) null;
        }
        field3245 = null;
        field3248 = null;
        field3242 = null;
        field3246 = null;
        field3253 = null;
        field3244 = (byte[][][]) null;
        field3241 = null;
    }
}
