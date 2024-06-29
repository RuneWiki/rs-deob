import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class157 extends class4 {

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "[I")
    private int[] field2209;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    private int[] field2203;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lgs;")
    private class747 field2202;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lgs;")
    private class747 field2199;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lgs;")
    private class747 field2200;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "[Lgs;")
    private class747[] field2208;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "J")
    public static long field2212;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "[I")
    public static int[] field2198;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILha;)V")
    public static final void method983(int arg0, class548 arg1) {
        field2207++;
        if (arg0 != -256) {
            field2212 = 17L;
        }
        int var2 = 0;
        int var3 = 0;
        if (class222.field3009) {
            var2 = class580.method3374(24188);
            var3 = class721.method4038(true);
        }
        int var4 = -10660793;
        class380.method2381(arg1, class401.field5750 + var2, var4, class686.field9524 + var3, -96, class178.field2450, -16777216, class746.field10270);
        class758.field10575.method2505(class401.field5750 + var2 + 3, -81, -1, class155.field2143.method978(class120.field1576, (byte) -109), var4, class686.field9524 + var3 + 14);
        int var5 = var2 + class103.field1419.method1553((byte) 66);
        int var6 = var3 + class103.field1419.method1556(20);
        if (class17.field153) {
            int var7 = 0;
            for (class272 var8 = (class272) class176.field2411.method3828(123); var8 != null; var8 = (class272) class176.field2411.method3829(arg0 ^ 0x72EE)) {
                int var12 = var7 * 16 + (class686.field9524 + var3 + 31);
                var7++;
                if (var8.field3953 == 1) {
                    class452.method2765(class401.field5750 + var2, (class558) var8.field3951.field9462.field33, class178.field2450, -256, -1, var12, class746.field10270, arg0 + 215, class686.field9524 + var3, var6, var5, arg1);
                } else {
                    class38.method208(var8, class746.field10270, class178.field2450, class686.field9524 + var3, class401.field5750 + var2, var6, var5, -1, arg1, -22872, var12, -256);
                }
            }
            if (class610.field8211 != null) {
                class380.method2381(arg1, class530.field7345, var4, class479.field6657, -96, class467.field6492, -16777216, class153.field2104);
                class758.field10575.method2505(class530.field7345 + 3, -77, -1, class610.field8211.field3946, var4, class479.field6657 + 14);
                int var9 = 0;
                for (class558 var10 = (class558) class610.field8211.field3951.method3828(91); var10 != null; var10 = (class558) class610.field8211.field3951.method3829(-29202)) {
                    int var11 = var9 * 16 + class479.field6657 + 31;
                    var9++;
                    class452.method2765(class530.field7345, var10, class467.field6492, -256, -1, var11, class153.field2104, 126, class479.field6657, var6, var5, arg1);
                }
                class57.method415(class467.field6492, class153.field2104, class530.field7345, 0, class479.field6657);
            }
        } else {
            int var13 = 0;
            for (class558 var14 = (class558) class290.field4161.method3618(75); var14 != null; var14 = (class558) class290.field4161.method3619(0)) {
                int var15 = class686.field9524 + var3 - (-((class284.field4103 - (var13 + 1)) * 16) + -31);
                var13++;
                class452.method2765(class401.field5750 + var2, var14, class178.field2450, -256, -1, var15, class746.field10270, 126, class686.field9524 + var3, var6, var5, arg1);
            }
        }
        class57.method415(class178.field2450, class746.field10270, class401.field5750 + var2, 0, class686.field9524 + var3);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
    public static final boolean method984(int arg0, int arg1, int arg2) {
        field2201++;
        if (arg2 != -991) {
            method983(-128, null);
        }
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ld;ILuu;)Z")
    public final boolean method985(class270 arg0, int arg1, class237 arg2) {
        if (arg1 <= 113) {
            method984(61, -27, 95);
        }
        field2211++;
        if (class196.field2635 < 0) {
            for (int var4 = 0; var4 < this.field2209.length; var4++) {
                if (!arg2.method1578(this.field2209[var4], (byte) -81)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2209.length; var5++) {
                if (!arg2.method1570(-2, class196.field2635, this.field2209[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2203.length; var6++) {
            if (!arg0.method517(this.field2203[var6], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIILuu;Ld;I)[F")
    public final float[] method986(boolean arg0, int arg1, int arg2, class237 arg3, class270 arg4, int arg5) {
        class211.field2791 = arg3;
        field2206++;
        class182.field2497 = arg4;
        int var7 = 0;
        int var8 = 51 % ((52 - arg5) / 55);
        while (this.field2208.length > var7) {
            this.field2208[var7].method725(arg2, arg1, (byte) 44);
            var7++;
        }
        class495.method2999((byte) 51, arg1, arg2);
        float[] var9 = new float[arg1 * 4 * arg2];
        int var10 = 0;
        for (int var11 = 0; var11 < arg2; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2199.field10281) {
                int[] var13 = this.field2199.method182(var11, -94);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field2199.method688(-41, var11);
                var16 = var17[2];
                var14 = var17[0];
                var15 = var17[1];
            }
            int[] var18;
            if (this.field2200.field10281) {
                var18 = this.field2200.method182(var11, -99);
            } else {
                var18 = this.field2200.method688(97, var11)[0];
            }
            int[] var19;
            if (this.field2202.field10281) {
                var19 = this.field2202.method182(var11, -127);
            } else {
                var19 = this.field2202.method688(-48, var11)[0];
            }
            if (arg0) {
                var10 = var11 << 2;
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var21 < 0.0F)) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                var9[var10++] = (float) var14[var20] * var22;
                var9[var10++] = (float) var15[var20] * var22;
                var9[var10++] = (float) var16[var20] * var22;
                var9[var10++] = var21;
                if (arg0) {
                    var10 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field2208.length; var12++) {
            this.field2208[var12].method727((byte) -88);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(DIZZLuu;Ld;II)[I")
    public final int[] method987(double arg0, int arg1, boolean arg2, boolean arg3, class237 arg4, class270 arg5, int arg6, int arg7) {
        field2210++;
        class182.field2497 = arg5;
        class211.field2791 = arg4;
        for (int var10 = 0; var10 < this.field2208.length; var10++) {
            this.field2208[var10].method725(arg6, arg7, (byte) 44);
        }
        class453.method2772(arg0, 104);
        class495.method2999((byte) 51, arg7, arg6);
        int[] var11 = new int[arg6 * arg7];
        if (arg1 != 1) {
            this.method987(-0.582021992008992D, -47, false, false, null, null, 51, -117);
        }
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = arg7 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var14 = arg7;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2199.field10281) {
                int[] var22 = this.field2199.method182(var16, -121);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2199.method688(arg1 ^ 0x5F, var16);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class11.field97[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class11.field97[var24];
                int var29 = class11.field97[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2208.length; var17++) {
            this.field2208[var17].method727((byte) -88);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        if (arg0 >= -70) {
            method983(-90, null);
        }
        field2198 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class157() {
        this.field2209 = new int[0];
        this.field2203 = new int[0];
        this.field2202 = new class268(0);
        this.field2202.field10293 = 1;
        this.field2199 = new class268();
        this.field2199.field10293 = 1;
        this.field2200 = new class268();
        this.field2200.field10293 = 1;
        this.field2208 = new class747[] { this.field2199, this.field2200, this.field2202 };
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ldc;)V")
    public class157(class63 arg0) {
        int var2 = arg0.method505((byte) -119);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2208 = new class747[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class747 var16 = class96.method645(-124, arg0);
            if (var16.method3203(false) >= 0) {
                var3++;
            }
            if (var16.method726((byte) 123) >= 0) {
                var4++;
            }
            int var17 = var16.field10280.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method505((byte) -119);
            }
            this.field2208[var6] = var16;
        }
        this.field2209 = new int[var3];
        int var7 = 0;
        this.field2203 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class747 var11 = this.field2208[var9];
            int var12 = var11.field10280.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field10280[var13] = this.field2208[var5[var9][var13]];
            }
            int var14 = var11.method3203(false);
            int var15 = var11.method726((byte) 123);
            if (var14 > 0) {
                this.field2209[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2203[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2199 = this.field2208[arg0.method505((byte) -119)];
        this.field2200 = this.field2208[arg0.method505((byte) -119)];
        Object var10 = null;
        this.field2202 = this.field2208[arg0.method505((byte) -119)];
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static final void method989(int arg0) {
        for (int var1 = arg0; var1 < class692.field9623.length; var1++) {
            for (int var2 = 0; var2 < class692.field9623[0].length; var2++) {
                for (int var3 = 0; var3 < class692.field9623[0][0].length; var3++) {
                    class692.field9623[var1][var2][var3] = 0;
                }
            }
        }
        field2213++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BDILuu;IZLd;)[I")
    public final int[] method990(byte arg0, double arg1, int arg2, class237 arg3, int arg4, boolean arg5, class270 arg6) {
        class211.field2791 = arg3;
        class182.field2497 = arg6;
        field2205++;
        for (int var9 = 0; var9 < this.field2208.length; var9++) {
            this.field2208[var9].method725(arg2, arg4, (byte) 44);
        }
        class453.method2772(arg1, 120);
        class495.method2999((byte) 51, arg4, arg2);
        int[] var10 = new int[arg2 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2199.field10281) {
                int[] var18 = this.field2199.method182(var12, -112);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field2199.method688(110, var12);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field2200.field10281) {
                var19 = this.field2200.method182(var12, -104);
            } else {
                var19 = this.field2200.method688(119, var12)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class11.field97[var22];
                int var25 = class11.field97[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class11.field97[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + (var27 << 24) - (-(var24 << 8) + -var26);
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2208.length; var13++) {
            this.field2208[var13].method727((byte) -88);
        }
        if (arg0 < 102) {
            this.method985(null, -3, null);
        }
        return var10;
    }
}
