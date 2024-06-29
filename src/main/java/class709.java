import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class709 extends class454 {

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "[I")
    private int[] field9913;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "[I")
    private int[] field9917;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "Lica;")
    private class334 field9916;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "Lica;")
    private class334 field9919;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "Lica;")
    private class334 field9912;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "[Lica;")
    private class334[] field9910;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "[J")
    public static long[] field9915 = new long[256];

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "J")
    public static long field9924;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "Lsn;")
    public static class739 field9922;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method3952(int arg0) {
        field9922 = null;
        int var1 = -96 % ((arg0 + 56) / 46);
        field9915 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZDLd;Lgga;IZ)[I")
    public final int[] method3953(int arg0, boolean arg1, double arg2, class103 arg3, class513 arg4, int arg5, boolean arg6) {
        field9920++;
        class695.field9782 = arg3;
        if (!arg1) {
            this.field9916 = null;
        }
        class694.field9779 = arg4;
        for (int var9 = 0; var9 < this.field9910.length; var9++) {
            this.field9910[var9].method2050(false, arg0, arg5);
        }
        class785.method4302((byte) -112, arg2);
        class242.method1611(arg5, -1, arg0);
        int[] var10 = new int[arg0 * arg5];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field9919.field4747) {
                int[] var18 = this.field9919.method28(var12, -22563988);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field9919.method283(true, var12);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field9912.field4747) {
                var19 = this.field9912.method28(var12, -22563988);
            } else {
                var19 = this.field9912.method283(true, var12)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
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
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class594.field8498[var22];
                int var25 = class594.field8498[var21];
                int var26 = class594.field8498[var23];
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
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field9910.length; var13++) {
            this.field9910[var13].method1064(-128);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgga;BZIILd;)[F")
    public final float[] method3954(class513 arg0, byte arg1, boolean arg2, int arg3, int arg4, class103 arg5) {
        class694.field9779 = arg0;
        class695.field9782 = arg5;
        field9918++;
        for (int var7 = 0; var7 < this.field9910.length; var7++) {
            this.field9910[var7].method2050(false, arg3, arg4);
        }
        class242.method1611(arg4, -1, arg3);
        float[] var8 = new float[arg3 * arg4 * 4];
        int var9 = 0;
        int var10 = -46 % ((arg1 + 40) / 32);
        for (int var11 = 0; var11 < arg4; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field9919.field4747) {
                int[] var13 = this.field9919.method28(var11, -22563988);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field9919.method283(true, var11);
                var14 = var17[1];
                var15 = var17[2];
                var16 = var17[0];
            }
            int[] var18;
            if (this.field9912.field4747) {
                var18 = this.field9912.method28(var11, -22563988);
            } else {
                var18 = this.field9912.method283(true, var11)[0];
            }
            if (arg2) {
                var9 = var11 << 2;
            }
            int[] var19;
            if (this.field9916.field4747) {
                var19 = this.field9916.method28(var11, -22563988);
            } else {
                var19 = this.field9916.method283(true, var11)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                if (var21 < 0.0F) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var16[var20] * var22;
                var8[var9++] = (float) var14[var20] * var22;
                var8[var9++] = (float) var15[var20] * var22;
                var8[var9++] = var21;
                if (arg2) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field9910.length; var12++) {
            this.field9910[var12].method1064(-127);
        }
        return var8;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgga;ZLd;IZDII)[I")
    public final int[] method3955(class513 arg0, boolean arg1, class103 arg2, int arg3, boolean arg4, double arg5, int arg6, int arg7) {
        field9914++;
        class694.field9779 = arg0;
        class695.field9782 = arg2;
        for (int var10 = 0; var10 < this.field9910.length; var10++) {
            this.field9910[var10].method2050(false, arg6, arg3);
        }
        class785.method4302((byte) -97, arg5);
        class242.method1611(arg3, -1, arg6);
        int[] var11 = new int[arg3 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var13 = arg6 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = 1;
            var14 = arg6;
        }
        int var15 = arg7;
        for (int var16 = 0; var16 < arg3; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field9919.field4747) {
                int[] var22 = this.field9919.method28(var16, -22563988);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field9919.method283(true, var16);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg1) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
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
                int var27 = class594.field8498[var25];
                int var28 = class594.field8498[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class594.field8498[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field9910.length; var17++) {
            this.field9910[var17].method1064(-127);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class709() {
        this.field9913 = new int[0];
        this.field9917 = new int[0];
        this.field9916 = new class789(0);
        this.field9916.field4749 = 1;
        this.field9919 = new class789();
        this.field9919.field4749 = 1;
        this.field9912 = new class789();
        this.field9912.field4749 = 1;
        this.field9910 = new class334[] { this.field9919, this.field9912, this.field9916 };
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lol;)V")
    public class709(class431 arg0) {
        int var2 = arg0.method2557(14929);
        int var3 = 0;
        int var4 = 0;
        this.field9910 = new class334[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class334 var16 = class701.method3928(arg0, false);
            if (var16.method1065(-1) >= 0) {
                var3++;
            }
            if (var16.method2054(-21437) >= 0) {
                var4++;
            }
            int var17 = var16.field4742.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2557(14929);
            }
            this.field9910[var6] = var16;
        }
        this.field9913 = new int[var3];
        this.field9917 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class334 var11 = this.field9910[var9];
            int var12 = var11.field4742.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4742[var13] = this.field9910[var5[var9][var13]];
            }
            int var14 = var11.method1065(-1);
            int var15 = var11.method2054(-21437);
            if (var14 > 0) {
                this.field9913[var7++] = var14;
            }
            if (var15 > 0) {
                this.field9917[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field9919 = this.field9910[arg0.method2557(14929)];
        this.field9912 = this.field9910[arg0.method2557(14929)];
        Object var10 = null;
        this.field9916 = this.field9910[arg0.method2557(14929)];
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgga;BLd;)Z")
    public final boolean method3956(class513 arg0, byte arg1, class103 arg2) {
        field9911++;
        if (class239.field3442 >= 0) {
            for (int var4 = 0; var4 < this.field9913.length; var4++) {
                if (!arg0.method2987(class239.field3442, arg1 - 113, this.field9913[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field9913.length; var5++) {
                if (!arg0.method3005(this.field9913[var5], (byte) -69)) {
                    return false;
                }
            }
        }
        if (arg1 != 113) {
            this.field9910 = null;
        }
        for (int var6 = 0; var6 < this.field9917.length; var6++) {
            if (!arg2.method846(this.field9917[var6], true)) {
                return false;
            }
        }
        return true;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9915[var0] = var1;
        }
        field9921 = 0;
        field9924 = -1L;
    }
}
