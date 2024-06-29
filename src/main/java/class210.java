import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class210 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
    private int[] field3787;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "[I")
    private int[] field3791;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lli;")
    private class179 field3788;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lli;")
    private class179 field3785;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[Lli;")
    private class179[] field3790;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lke;")
    public static class256 field3786 = class316.method2202("M", 27626);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[[[I")
    public static int[][][] field3792;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IDILlb;ZLng;I)[B", line = 18)
    public final byte[] method1479(int arg0, double arg1, int arg2, class228 arg3, boolean arg4, class138 arg5, int arg6) {
        field3794++;
        class29.method210(arg1, true);
        byte[] var9 = new byte[arg2 * arg6 * 4];
        if (arg0 != 7569) {
            return (byte[]) null;
        }
        class132.field2309 = arg3;
        class118.field2076 = arg5;
        class271.method1873(arg2, (byte) -121, arg6);
        for (int var10 = 0; var10 < this.field3790.length; var10++) {
            this.field3790[var10].method1313(arg0 ^ 0xFFFFC369, arg6, arg2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3788.field3153) {
                int[] var17 = this.field3788.method41(var12, -31598);
                var15 = var17;
                var14 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field3788.method55(75, var12);
                var14 = var13[2];
                var15 = var13[1];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field3785.field3153) {
                var18 = this.field3785.method41(var12, -31598);
            } else {
                var18 = this.field3785.method55(arg0 ^ 0x1DDA, var12)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var14[var19] >> 4;
                int var23 = class56.field1018[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class56.field1018[var20];
                int var25 = class56.field1018[var22];
                int var26;
                if (var24 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg4) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3790.length; var27++) {
            this.field3790[var27].method704(-113);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 166)
    public static void method1480(int arg0) {
        field3786 = null;
        if (arg0 <= -53) {
            field3792 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(DIIIZLng;ZLlb;)[I", line = 185)
    public final int[] method1481(double arg0, int arg1, int arg2, int arg3, boolean arg4, class138 arg5, boolean arg6, class228 arg7) {
        class29.method210(arg0, true);
        class118.field2076 = arg5;
        field3793++;
        int[] var10 = new int[arg2 * arg3];
        class132.field2309 = arg7;
        class271.method1873(arg2, (byte) -120, arg3);
        for (int var11 = arg1; var11 < this.field3790.length; var11++) {
            this.field3790[var11].method1313(-8456, arg3, arg2);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg6) {
            var13 = -1;
            var14 = arg3 - 1;
            var15 = -1;
        } else {
            var15 = arg3;
            var14 = 0;
            var13 = 1;
        }
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg4) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3788.field3153) {
                int[] var21 = this.field3788.method41(var16, -31598);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field3788.method55(75, var16);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var14; var22 != var15; var22 += var13) {
                int var23 = var20[var22] >> 4;
                int var24 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class56.field1018[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = var18[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class56.field1018[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class56.field1018[var26];
                var10[var12++] = (var25 << 16) + (var27 << 8) + var28;
                if (arg4) {
                    var12 += arg3 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3790.length; var29++) {
            this.field3790[var29].method704(-77);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILlb;Lng;)Z", line = 315)
    public final boolean method1482(int arg0, class228 arg1, class138 arg2) {
        field3795++;
        if (class70.field1286 <= 0) {
            for (int var4 = 0; var4 < this.field3787.length; var4++) {
                if (!arg2.method1011(this.field3787[var4], -23605)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3787.length; var5++) {
                if (!arg2.method1021(class70.field1286, -44, this.field3787[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field3791.length; var6++) {
            if (!arg1.method197((byte) 126, this.field3791[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 369)
    public class210() {
        this.field3787 = new int[0];
        this.field3791 = new int[0];
        this.field3788 = new class233();
        this.field3788.field3164 = 1;
        this.field3785 = new class233();
        this.field3785.field3164 = 1;
        this.field3790 = new class179[] { this.field3788, this.field3785 };
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 384)
    public static final void method1483(byte arg0) {
        field3789++;
        class205.method1457();
        for (int var1 = 0; var1 < 4; var1++) {
            class124.field2201[var1].method269(0);
        }
        System.gc();
        if (arg0 != -112) {
            field3786 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lra;)V", line = 401)
    public class210(class41 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method357(false);
        this.field3790 = new class179[var4];
        int[][] var5 = new int[var4][];
        for (int var6 = 0; var6 < var4; var6++) {
            class179 var7 = class273.method1890(-57, arg0);
            if (var7.method1318(1184) >= 0) {
                var2++;
            }
            if (var7.method705(-1) >= 0) {
                var3++;
            }
            int var8 = var7.field3156.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method357(false);
            }
            this.field3790[var6] = var7;
        }
        this.field3787 = new int[var2];
        this.field3791 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var4; var12++) {
            class179 var13 = this.field3790[var12];
            int var14 = var13.field3156.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3156[var15] = this.field3790[var5[var12][var15]];
            }
            int var16 = var13.method1318(1184);
            int var17 = var13.method705(-1);
            if (var16 > 0) {
                this.field3787[var10++] = var16;
            }
            if (var17 > 0) {
                this.field3791[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field3788 = this.field3790[arg0.method357(false)];
        this.field3785 = this.field3790[arg0.method357(false)];
    }
}
