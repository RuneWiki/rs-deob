import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class674 extends class173 {

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "[I")
    private int[] field8732;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[I")
    private int[] field8721;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lqd;")
    private class601 field8726;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lqd;")
    private class601 field8725;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lqd;")
    private class601 field8729;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[Lqd;")
    private class601[] field8727;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field8724 = 0;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILd;IIZLwm;)[F", line = 16)
    public final float[] method3631(int arg0, class284 arg1, int arg2, int arg3, boolean arg4, class30 arg5) {
        class121.field1629 = arg5;
        field8722++;
        int var7 = -14 % ((arg0 - 7) / 45);
        class345.field4228 = arg1;
        for (int var8 = 0; var8 < this.field8727.length; var8++) {
            this.field8727[var8].method3245(arg3, 27046, arg2);
        }
        class76.method469(arg3, true, arg2);
        float[] var9 = new float[arg2 * arg3 * 4];
        int var10 = 0;
        for (int var11 = 0; var11 < arg3; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field8725.field7646) {
                int[] var13 = this.field8725.method261(var11, (byte) -98);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field8725.method638(2017, var11);
                var16 = var17[2];
                var14 = var17[0];
                var15 = var17[1];
            }
            int[] var18;
            if (this.field8729.field7646) {
                var18 = this.field8729.method261(var11, (byte) -120);
            } else {
                var18 = this.field8729.method638(2017, var11)[0];
            }
            int[] var19;
            if (this.field8726.field7646) {
                var19 = this.field8726.method261(var11, (byte) -110);
            } else {
                var19 = this.field8726.method638(2017, var11)[0];
            }
            if (arg4) {
                var10 = var11 << 2;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                if (var21 < 0.0F) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var9[var10++] = (float) var14[var20] * var22;
                var9[var10++] = (float) var15[var20] * var22;
                var9[var10++] = (float) var16[var20] * var22;
                var9[var10++] = var21;
                if (arg4) {
                    var10 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field8727.length; var12++) {
            this.field8727[var12].method2038((byte) -122);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILd;Lwm;IIZD)[I", line = 124)
    public final int[] method3632(int arg0, class284 arg1, class30 arg2, int arg3, int arg4, boolean arg5, double arg6) {
        class121.field1629 = arg2;
        class345.field4228 = arg1;
        field8730++;
        for (int var9 = 0; var9 < this.field8727.length; var9++) {
            this.field8727[var9].method3245(arg3, arg0 + 27045, arg4);
        }
        class29.method122(arg6, arg0 ^ 0x76);
        class76.method469(arg3, true, arg4);
        int[] var10 = new int[arg3 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field8725.field7646) {
                int[] var18 = this.field8725.method261(var12, (byte) -80);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field8725.method638(2017, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field8729.field7646) {
                var19 = this.field8729.method261(var12, (byte) -82);
            } else {
                var19 = this.field8729.method638(2017, var12)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
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
                int var24 = class455.field5965[var21];
                int var25 = class455.field5965[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class455.field5965[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
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
                var10[var11++] = (var24 << 16) + ((var27 << 24) - (-(var25 << 8) - var26));
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        if (arg0 != 1) {
            field8728 = -82;
        }
        for (int var13 = 0; var13 < this.field8727.length; var13++) {
            this.field8727[var13].method2038((byte) -109);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ld;Lwm;B)Z", line = 264)
    public final boolean method3633(class284 arg0, class30 arg1, byte arg2) {
        if (arg2 != 48) {
            this.method3633(null, null, (byte) 30);
        }
        field8731++;
        if (class305.field3843 < 0) {
            for (int var4 = 0; var4 < this.field8732.length; var4++) {
                if (!arg1.method130(-2, this.field8732[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field8732.length; var5++) {
                if (!arg1.method127((byte) 97, class305.field3843, this.field8732[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field8721.length; var6++) {
            if (!arg0.method1733(-1852, this.field8721[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 322)
    public class674() {
        this.field8732 = new int[0];
        this.field8721 = new int[0];
        this.field8726 = new class609(0);
        this.field8726.field7649 = 1;
        this.field8725 = new class609();
        this.field8725.field7649 = 1;
        this.field8729 = new class609();
        this.field8727 = new class601[] { this.field8725, this.field8729, this.field8726 };
        this.field8729.field7649 = 1;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lmc;)V", line = 337)
    public class674(class234 arg0) {
        int var2 = arg0.method1509(true);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field8727 = new class601[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class601 var16 = class610.method3270((byte) -103, arg0);
            if (var16.method2039(-1) >= 0) {
                var3++;
            }
            if (var16.method3248(32727) >= 0) {
                var4++;
            }
            int var17 = var16.field7640.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1509(true);
            }
            this.field8727[var6] = var16;
        }
        this.field8732 = new int[var3];
        this.field8721 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class601 var11 = this.field8727[var9];
            int var12 = var11.field7640.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field7640[var13] = this.field8727[var5[var9][var13]];
            }
            int var14 = var11.method2039(-1);
            int var15 = var11.method3248(32727);
            if (var14 > 0) {
                this.field8732[var7++] = var14;
            }
            if (var15 > 0) {
                this.field8721[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field8725 = this.field8727[arg0.method1509(true)];
        this.field8729 = this.field8727[arg0.method1509(true)];
        this.field8726 = this.field8727[arg0.method1509(true)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILd;ZLwm;ZZD)[I", line = 424)
    public final int[] method3634(int arg0, int arg1, class284 arg2, boolean arg3, class30 arg4, boolean arg5, boolean arg6, double arg7) {
        class121.field1629 = arg4;
        field8723++;
        class345.field4228 = arg2;
        for (int var10 = 0; var10 < this.field8727.length; var10++) {
            this.field8727[var10].method3245(arg0, 27046, arg1);
        }
        class29.method122(arg7, 85);
        class76.method469(arg0, !arg6, arg1);
        int[] var11 = new int[arg0 * arg1];
        if (arg6) {
            field8728 = 67;
        }
        byte var12;
        int var13;
        int var14;
        if (arg5) {
            var12 = -1;
            var13 = arg1 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field8725.field7646) {
                int[] var22 = this.field8725.method261(var16, (byte) -82);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field8725.method638(2017, var16);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            if (arg3) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class455.field5965[var25];
                int var28 = class455.field5965[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class455.field5965[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field8727.length; var17++) {
            this.field8727[var17].method2038((byte) -120);
        }
        return var11;
    }
}
