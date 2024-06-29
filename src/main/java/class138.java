import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class138 extends class388 {

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "[I")
    private int[] field1888;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[I")
    private int[] field1894;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Lih;")
    private class739 field1893;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "Lih;")
    private class739 field1896;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Lih;")
    private class739 field1895;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "[Lih;")
    private class739[] field1886;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1891 = new Hashtable();

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIDZLd;Lla;Z)[I", line = 10)
    public final int[] method976(int arg0, int arg1, double arg2, boolean arg3, class267 arg4, class423 arg5, boolean arg6) {
        class40.field684 = arg4;
        field1890++;
        if (!arg6) {
            this.field1895 = null;
        }
        class625.field8883 = arg5;
        for (int var9 = 0; var9 < this.field1886.length; var9++) {
            this.field1886[var9].method2798(arg0, arg1, (byte) -56);
        }
        class502.method3058(-1, arg2);
        class148.method1039(arg1, arg0, -8540);
        int[] var10 = new int[arg0 * arg1];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1896.field10320) {
                int[] var18 = this.field1896.method445(false, var12);
                var15 = var18;
                var17 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field1896.method113(var12, 8213);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            if (arg3) {
                var11 = var12;
            }
            int[] var19;
            if (this.field1895.field10320) {
                var19 = this.field1895.method445(false, var12);
            } else {
                var19 = this.field1895.method113(var12, 8213)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
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
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class280.field3928[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class280.field3928[var21];
                int var26 = class280.field3928[var23];
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
                var10[var11++] = (var27 << 24) + (var24 << 8) + (var25 << 16) + var26;
                if (arg3) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1886.length; var13++) {
            this.field1886[var13].method586(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLd;ZDZLla;II)[I", line = 144)
    public final int[] method977(byte arg0, class267 arg1, boolean arg2, double arg3, boolean arg4, class423 arg5, int arg6, int arg7) {
        class40.field684 = arg1;
        class625.field8883 = arg5;
        field1887++;
        for (int var10 = 0; var10 < this.field1886.length; var10++) {
            this.field1886[var10].method2798(arg7, arg6, (byte) -56);
        }
        class502.method3058(arg0 ^ 0x6, arg3);
        class148.method1039(arg6, arg7, arg0 - 8533);
        int[] var11 = new int[arg6 * arg7];
        if (arg0 != -7) {
            this.field1893 = null;
        }
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var14 = arg6 - 1;
            var13 = -1;
            var12 = -1;
        } else {
            var12 = arg6;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1896.field10320) {
                int[] var22 = this.field1896.method445(false, var16);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field1896.method113(var16, 8213);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg2) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var20[var23] >> 4;
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
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class280.field3928[var24];
                int var28 = class280.field3928[var25];
                int var29 = class280.field3928[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1886.length; var17++) {
            this.field1886[var17].method586(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIILd;Lla;Z)[F", line = 279)
    public final float[] method978(int arg0, int arg1, int arg2, class267 arg3, class423 arg4, boolean arg5) {
        field1889++;
        class40.field684 = arg3;
        class625.field8883 = arg4;
        for (int var7 = 0; var7 < this.field1886.length; var7++) {
            this.field1886[var7].method2798(arg1, arg0, (byte) -23);
        }
        class148.method1039(arg0, arg1, -8540);
        float[] var8 = new float[arg0 * arg1 * 4];
        int var9 = arg2;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1896.field10320) {
                int[] var16 = this.field1896.method445(false, var10);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field1896.method113(var10, 8213);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field1895.field10320) {
                var17 = this.field1895.method445(false, var10);
            } else {
                var17 = this.field1895.method113(var10, arg2 + 8213)[0];
            }
            int[] var18;
            if (this.field1893.field10320) {
                var18 = this.field1893.method445(false, var10);
            } else {
                var18 = this.field1893.method113(var10, 8213)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1886.length; var11++) {
            this.field1886[var11].method586(false);
        }
        return var8;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 389)
    public static void method979(byte arg0) {
        if (arg0 > 101) {
            field1891 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lla;ILd;)Z", line = 408)
    public final boolean method980(class423 arg0, int arg1, class267 arg2) {
        field1892++;
        if (arg1 != 31562) {
            return false;
        }
        if (class645.field9290 >= 0) {
            for (int var4 = 0; var4 < this.field1894.length; var4++) {
                if (!arg0.method2613(this.field1894[var4], class645.field9290, arg1 - 31581)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1894.length; var5++) {
                if (!arg0.method2609(0, this.field1894[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1888.length; var6++) {
            if (!arg2.method963((byte) 41, this.field1888[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 460)
    public class138() {
        this.field1888 = new int[0];
        this.field1894 = new int[0];
        this.field1893 = new class425(0);
        this.field1893.field10318 = 1;
        this.field1896 = new class425();
        this.field1896.field10318 = 1;
        this.field1895 = new class425();
        this.field1886 = new class739[] { this.field1896, this.field1895, this.field1893 };
        this.field1895.field10318 = 1;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lsl;)V", line = 475)
    public class138(class479 arg0) {
        int var2 = arg0.method2886(true);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1886 = new class739[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class739 var16 = class684.method3887(21347, arg0);
            if (var16.method587((byte) 58) >= 0) {
                var3++;
            }
            if (var16.method2797(-76) >= 0) {
                var4++;
            }
            int var17 = var16.field10331.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2886(true);
            }
            this.field1886[var6] = var16;
        }
        this.field1894 = new int[var3];
        this.field1888 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class739 var11 = this.field1886[var9];
            int var12 = var11.field10331.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field10331[var13] = this.field1886[var5[var9][var13]];
            }
            int var14 = var11.method587((byte) -105);
            int var15 = var11.method2797(-124);
            if (var14 > 0) {
                this.field1894[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1888[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1896 = this.field1886[arg0.method2886(true)];
        this.field1895 = this.field1886[arg0.method2886(true)];
        Object var10 = null;
        this.field1893 = this.field1886[arg0.method2886(true)];
    }
}
