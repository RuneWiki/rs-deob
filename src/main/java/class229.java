import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class229 extends class219 {

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    private int field3808 = 4096;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field3810 = 128;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "[I")
    public static int[] field3804 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Lbd;")
    public static class162 field3812 = class17.method142(0, ": ");

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Lqb;")
    public static class209 field3807 = new class209(64);

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[I")
    public static int[] field3817 = new int[100];

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "J")
    public static long field3818 = 0L;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Ldc;")
    public static class71 field3806;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 6)
    public static void method1635(int arg0) {
        field3817 = null;
        if (arg0 == 158) {
            field3812 = null;
            field3807 = null;
            field3804 = null;
            field3806 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 42)
    public class229() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method1636(byte arg0, int arg1) {
        field3809++;
        int var2 = 17 % ((-arg0 - 8) / 62);
        class288.field4852.method1538(arg1, (byte) -26);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILb;)V", line = 46)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            method1638(false, (class142) null, -39, -84, 77, 77);
        }
        if (arg0 == 0) {
            this.field3808 = arg2.method761((byte) 108);
        }
        field3803++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)Lsi;", line = 60)
    public static final class311 method1637(int arg0, byte arg1) {
        field3815++;
        class311 var2 = (class311) class112.field2022.method1536((long) arg0, arg1 - 221);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field3555.method1128(class95.method769(36, arg0), arg1 - 93, class35.method277(false, arg0));
        class311 var4 = new class311();
        var4.field5219 = arg0;
        if (var3 != null) {
            var4.method2104(new class94(var3), 0);
        }
        var4.method2098(false);
        if (!class73.field1167 && var4.field5186) {
            var4.field5196 = null;
        }
        if (arg1 != 93) {
            method1636((byte) -26, -40);
        }
        if (var4.field5251) {
            var4.field5245 = 0;
            var4.field5230 = false;
        }
        class112.field2022.method1532((long) arg0, -85, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)[I", line = 101)
    public final int[] method41(boolean arg0, int arg1) {
        field3814++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, class60.field927 & arg1 - 1, -6606);
            int[] var5 = this.method1585(0, arg1, -6606);
            int[] var6 = this.method1585(0, arg1 + 1 & class60.field927, -6606);
            for (int var7 = 0; var7 < class128.field2326; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3808;
                int var9 = var8 >> 12;
                int var10 = var9 * var9 >> 12;
                int var11 = (var5[var7 + 1 & class252.field4208] - var5[var7 - 1 & class252.field4208]) * this.field3808;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var10 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLeg;IIII)V", line = 161)
    public static final void method1638(boolean arg0, class142 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3813++;
        if (class255.field4233 >= 50 || arg1.field2546 == null || arg2 >= arg1.field2546.length || arg1.field2546[arg2] == null) {
            return;
        }
        int var6 = arg1.field2546[arg2][0];
        int var7 = var6 & 0xF;
        int var8 = (var6 & 0x79) >> 4;
        int var9 = var6 >> 8;
        if (arg4 != -648569400) {
            method1636((byte) 49, 111);
        }
        if (arg1.field2546[arg2].length > 1) {
            int var10 = (int) ((double) arg1.field2546[arg2].length * Math.random());
            if (var10 > 0) {
                var9 = arg1.field2546[arg2][var10];
            }
        }
        if (var7 == 0) {
            if (arg0) {
                class89.method676(arg4 + 648569524, var9, var8, 0);
            }
        } else if (class256.field4256 != 0) {
            class270.field4518[class255.field4233] = var9;
            class29.field495[class255.field4233] = var8;
            int var11 = (arg5 - 64) / 128;
            class237.field3948[class255.field4233] = 0;
            class194.field3270[class255.field4233] = null;
            int var12 = (arg3 - 64) / 128;
            class30.field504[class255.field4233] = (var11 << 16) + (var12 << 8) + var7;
            class255.field4233++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIIII)V", line = 240)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg10 - arg6;
        int var12 = arg0 - arg1;
        if (arg9 != -1) {
            return;
        }
        field3816++;
        int var13 = 983040 / arg3;
        int var14 = 983040 / arg5;
        boolean var15;
        if (class255.field4226 > 0 && (class255.field4226 % 10) < 5) {
            var15 = true;
        } else {
            var15 = false;
        }
        for (int var16 = -var13; var16 < (var12 + var13); var16++) {
            int var17 = arg4 + ((var16 + 1) * arg3) >> 16;
            int var18 = arg3 * var16 + arg4 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var10000 = arg2 + var17;
                int var21 = arg2 + var18;
                int var22 = arg1 + var16 >> 6;
                if (var22 >= 0 && class206.field3474.length - 1 >= var22) {
                    int[][] var23 = class206.field3474[var22];
                    for (int var24 = -var14; var24 < var11 + var14; var24++) {
                        int var25 = arg5 * var24 + arg8 >> 16;
                        int var26 = (var24 + 1) * arg5 + arg8 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg7 + var25;
                            int var29 = arg6 + var24 >> 6;
                            var10000 = arg7 + var26;
                            if (var29 >= 0 && var23.length - 1 >= var29 && var23[var29] != null) {
                                int var31 = ((arg6 + var24 & 0x3F) << 6) + (var16 + arg1 & 0x3F);
                                int var32 = var23[var29][var31];
                                if (var32 != 0) {
                                    class311 var33 = method1637(var32 - 1, (byte) 93);
                                    if (var15 && class172.field2984 == var33.field5239) {
                                        class133 var34 = new class133();
                                        var34.field2379 = var28;
                                        var34.field2382 = var21;
                                        var34.field2384 = var33.field5239;
                                        class86.field1525.method167(false, var34);
                                    }
                                    class183.field3144[var33.field5239].method285(var21 - 7, var28 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class133 var35 = (class133) class86.field1525.method169(arg9 ^ 0x77); var35 != null; var35 = (class133) class86.field1525.method165((byte) -101)) {
            class183.field3144[var35.field2384].method285(var35.field2382 - 7, var35.field2379 + -7);
            class316.method2172(var35.field2382, var35.field2379, 15, 16776960, 128);
            class316.method2172(var35.field2382, var35.field2379, 7, 16777215, 256);
        }
        class86.field1525.method171(-102);
    }
}
