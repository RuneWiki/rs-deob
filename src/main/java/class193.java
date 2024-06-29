import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class193 extends class179 {

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    private int field3530 = 1;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    private int field3533 = 1;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "Lke;")
    public static class256 field3529 = class316.method2202(")1 ", 27626);

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Lke;")
    private static class256 field3528 = class316.method2202("Loading sprites )2 ", 27626);

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lke;")
    public static class256 field3532 = field3528;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lke;")
    public static class256 field3536 = class316.method2202("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 27626);

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Z")
    public static boolean field3531 = true;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method1397(boolean arg0) {
        if (!arg0) {
            field3536 = (class256) null;
        }
        field3526++;
        int var1 = class17.field215.method2045(class64.field1142);
        for (int var2 = 0; var2 < class17.field244; var2++) {
            int var3 = class17.field215.method2045(class191.method1387(var2, (byte) -104));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class104.field1862 - (var1 / 2);
        if (var1 + var4 > class112.field1969) {
            var4 = class112.field1969 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class318.field5479;
        int var6 = class17.field244 * 15 + 21;
        if (var5 + var6 > class124.field2200) {
            var5 = class124.field2200 - var6;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class246.field4196 == 1) {
            if (class244.field4156 == class104.field1862 && class318.field5479 == field3534) {
                class85.field1538 = var1;
                class73.field1341 = true;
                class173.field3074 = class17.field244 * 15 + (class36.field650 ? 26 : 22);
                class148.field2609 = var5;
                class246.field4196 = 0;
                class137.field2389 = var4;
            }
        } else if (class311.field5365 == class104.field1862 && class318.field5479 == class160.field2855) {
            class173.field3074 = (class36.field650 ? 26 : 22) + class17.field244 * 15;
            class85.field1538 = var1;
            class148.field2609 = var5;
            class246.field4196 = 0;
            class73.field1341 = true;
            class137.field2389 = var4;
        } else {
            field3534 = class160.field2855;
            class246.field4196 = 1;
            class244.field4156 = class311.field5365;
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(III)V", line = 106)
    public static final void method1398(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class86.field1547; var3++) {
            for (int var4 = 0; var4 < class129.field2264; var4++) {
                for (int var5 = 0; var5 < class57.field1051; var5++) {
                    class271 var6 = class41.field790[var3][var4][var5];
                    if (var6 != null) {
                        class197 var7 = var6.field4639;
                        if (var7 != null && var7.field3597.method408()) {
                            class274.method1901(var7.field3597, var3, var4, var5, 1, 1);
                            if (var7.field3596 != null && var7.field3596.method408()) {
                                class274.method1901(var7.field3596, var3, var4, var5, 1, 1);
                                var7.field3597.method410(var7.field3596, 0, 0, 0, false);
                                var7.field3596 = var7.field3596.method411(arg0, arg1, arg2);
                            }
                            var7.field3597 = var7.field3597.method411(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4641; var8++) {
                            class269 var9 = var6.field4624[var8];
                            if (var9 != null && var9.field4590.method408()) {
                                class274.method1901(var9.field4590, var3, var4, var5, var9.field4597 + 1 - var9.field4594, var9.field4599 - var9.field4587 + 1);
                                var9.field4590 = var9.field4590.method411(arg0, arg1, arg2);
                            }
                        }
                        class223 var10 = var6.field4628;
                        if (var10 != null && var10.field3905.method408()) {
                            class163.method1201(var10.field3905, var3, var4, var5);
                            var10.field3905 = var10.field3905.method411(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 178)
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[[I", line = 182)
    public final int[][] method55(int arg0, int arg1) {
        if (arg0 != 75) {
            method1398(45, -95, 60);
        }
        field3524++;
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int var4 = this.field3530 + this.field3530 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3533 + this.field3533 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field3530; var9 <= (this.field3530 + arg1); var9++) {
                int[][] var10 = this.method1314(class19.field255 & var9, 158, 0);
                int var11 = 0;
                int[][] var12 = new int[3][class161.field2858];
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[2];
                int[] var16 = var10[0];
                int[] var17 = var10[1];
                for (int var18 = -this.field3533; var18 <= this.field3533; var18++) {
                    int var19 = class285.field4945 & var18;
                    var11 += var16[var19];
                    var13 += var17[var19];
                    var14 += var15[var19];
                }
                int[] var20 = var12[0];
                int[] var21 = var12[1];
                int[] var22 = var12[2];
                int var23 = 0;
                while (class161.field2858 > var23) {
                    var20[var23] = var8 * var11 >> 16;
                    var21[var23] = var8 * var13 >> 16;
                    var22[var23] = var8 * var14 >> 16;
                    int var24 = var23 - this.field3533 & class285.field4945;
                    int var25 = var13 - var17[var24];
                    var23++;
                    int var26 = var11 - var16[var24];
                    int var27 = var14 - var15[var24];
                    int var28 = class285.field4945 & this.field3533 + var23;
                    var14 = var15[var28] + var27;
                    var11 = var16[var28] + var26;
                    var13 = var17[var28] + var25;
                }
                var7[var9 - (arg1 - this.field3530)] = var12;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class161.field2858; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var7[var36];
                    var33 += var37[2][var32];
                    var35 += var37[0][var32];
                    var34 += var37[1][var32];
                }
                var29[var32] = var5 * var35 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var33 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 316)
    public static void method1399(byte arg0) {
        if (arg0 < -19) {
            field3536 = null;
            field3528 = null;
            field3529 = null;
            field3532 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(I)V", line = 345)
    public static final void method1400(int arg0) {
        field3535++;
        int var1 = class48.field872 * 128 + 64;
        int var2 = class288.field4984 * 128 + 64;
        int var3 = class297.method2080(var1, 124, class255.field4377, var2) - class142.field2495;
        if (class31.field502 >= 100) {
            class72.field1319 = class288.field4984 * 128 + 64;
            class50.field926 = class48.field872 * 128 + 64;
            class10.field152 = class297.method2080(class50.field926, 121, class255.field4377, class72.field1319) - class142.field2495;
        } else {
            if (var2 > class72.field1319) {
                class72.field1319 += (var2 - class72.field1319) * class31.field502 / 1000 + class49.field894;
                if (var2 < class72.field1319) {
                    class72.field1319 = var2;
                }
            }
            if (var3 > class10.field152) {
                class10.field152 += (var3 - class10.field152) * class31.field502 / 1000 + class49.field894;
                if (var3 < class10.field152) {
                    class10.field152 = var3;
                }
            }
            if (var1 > class50.field926) {
                class50.field926 += (var1 - class50.field926) * class31.field502 / 1000 + class49.field894;
                if (class50.field926 > var1) {
                    class50.field926 = var1;
                }
            }
            if (var2 < class72.field1319) {
                class72.field1319 -= class49.field894 + ((class72.field1319 - var2) * class31.field502 / 1000);
                if (class72.field1319 < var2) {
                    class72.field1319 = var2;
                }
            }
            if (var3 < class10.field152) {
                class10.field152 -= (class10.field152 - var3) * class31.field502 / 1000 + class49.field894;
                if (class10.field152 < var3) {
                    class10.field152 = var3;
                }
            }
            if (class50.field926 > var1) {
                class50.field926 -= class49.field894 + ((class50.field926 - var1) * class31.field502 / 1000);
                if (class50.field926 < var1) {
                    class50.field926 = var1;
                }
            }
        }
        int var4 = class14.field189 * 128 + 64;
        int var5 = class111.field1943 * 128 + 64;
        int var6 = class297.method2080(var5, arg0 ^ 0xFFFFFF8F, class255.field4377, var4) - class148.field2595;
        int var7 = var4 - class72.field1319;
        int var8 = var5 - class50.field926;
        int var9 = var6 - class10.field152;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var8, (double) var7) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class210.field3784;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (arg0 > ~var13) {
            class210.field3784 += class64.field1118 * var13 / 1000 + class14.field192;
            class210.field3784 &= 0x7FF;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class180.field3192) {
            class180.field3192 += (var11 - class180.field3192) * class64.field1118 / 1000 + class14.field192;
            if (var11 < class180.field3192) {
                class180.field3192 = var11;
            }
        }
        if (var13 < 0) {
            class210.field3784 -= class14.field192 + (-var13 * class64.field1118 / 1000);
            class210.field3784 &= 0x7FF;
        }
        int var14 = var12 - class210.field3784;
        if (class180.field3192 > var11) {
            class180.field3192 -= (class180.field3192 - var11) * class64.field1118 / 1000 + class14.field192;
            if (var11 > class180.field3192) {
                class180.field3192 = var11;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class210.field3784 = var12;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I", line = 510)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            field3536 = (class256) null;
        }
        field3527++;
        int[] var3 = this.field3157.method1258(arg1 ^ 0x7B0C, arg0);
        if (this.field3157.field3081) {
            int var4 = this.field3533 + this.field3533 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3530 + this.field3530 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var6][];
            for (int var9 = arg0 - this.field3530; var9 <= (this.field3530 + arg0); var9++) {
                int[] var10 = this.method1312(0, var9 & class19.field255, (byte) 115);
                int[] var11 = new int[class161.field2858];
                int var12 = 0;
                for (int var13 = -this.field3533; var13 <= this.field3533; var13++) {
                    var12 += var10[var13 & class285.field4945];
                }
                int var14 = 0;
                while (class161.field2858 > var14) {
                    var11[var14] = var5 * var12 >> 16;
                    int var15 = var12 - var10[class285.field4945 & var14 - this.field3533];
                    var14++;
                    var12 = var10[this.field3533 + var14 & class285.field4945] + var15;
                }
                var8[this.field3530 + var9 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class161.field2858; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var6; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var7 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILra;I)V", line = 607)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field3537++;
        if (arg2 == 0) {
            this.field3533 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field3530 = arg1.method357(false);
        } else if (arg2 == 2) {
            this.field3153 = arg1.method357(false) == 1;
        }
        if (arg0 < 108) {
            field3536 = (class256) null;
        }
    }
}
