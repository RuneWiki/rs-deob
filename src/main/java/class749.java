import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class749 extends class13 {

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "[I")
    private int[] field10370;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "[I")
    private int[] field10371;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "Ltf;")
    private class297 field10375;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "Ltf;")
    private class297 field10368;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "Ltf;")
    private class297 field10374;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "[Ltf;")
    private class297[] field10367;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "Loaa;")
    public static class290 field10377 = new class290(6, 0, 4, 2);

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "[Lll;")
    public static class366[] field10381 = new class366[128];

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "Lej;")
    public static class124 field10380 = new class124(57, 3);

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "D")
    public static double field10378;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ld;IIZDLin;B)[I")
    public final int[] method4176(class152 arg0, int arg1, int arg2, boolean arg3, double arg4, class91 arg5, byte arg6) {
        field10369++;
        class700.field9462 = arg0;
        class362.field5199 = arg5;
        for (int var9 = 0; var9 < this.field10367.length; var9++) {
            this.field10367[var9].method1184(arg1, arg2, -256);
        }
        class462.method2729(arg4, (byte) -122);
        class334.method2113(arg2, arg1, (byte) 114);
        int[] var10 = new int[arg1 * arg2];
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field10368.field4178) {
                int[] var14 = this.field10368.method15(var12, 255);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field10368.method18(var12, -1564599039);
                var16 = var18[2];
                var17 = var18[1];
                var15 = var18[0];
            }
            if (arg3) {
                var11 = var12;
            }
            int[] var19;
            if (this.field10374.field4178) {
                var19 = this.field10374.method15(var12, arg6 + 244);
            } else {
                var19 = this.field10374.method18(var12, -1564599039)[0];
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
                int var24 = class390.field5692[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class390.field5692[var21];
                int var26 = class390.field5692[var23];
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
                var10[var11++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                if (arg3) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field10367.length; var13++) {
            this.field10367[var13].method1170((byte) -116);
        }
        if (arg6 != 11) {
            field10379 = 97;
        }
        return var10;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ld;Lin;I)Z")
    public final boolean method4177(class152 arg0, class91 arg1, int arg2) {
        field10376++;
        if (class81.field1453 < 0) {
            for (int var4 = 0; var4 < this.field10371.length; var4++) {
                if (!arg1.method874(false, this.field10371[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field10371.length; var5++) {
                if (!arg1.method873(-10499, class81.field1453, this.field10371[var5])) {
                    return false;
                }
            }
        }
        int var6 = 0;
        int var7 = -109 / ((10 - arg2) / 60);
        while (this.field10370.length > var6) {
            if (!arg0.method1181(-7953, this.field10370[var6])) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILd;IZDZLin;I)[I")
    public final int[] method4178(int arg0, class152 arg1, int arg2, boolean arg3, double arg4, boolean arg5, class91 arg6, int arg7) {
        class700.field9462 = arg1;
        class362.field5199 = arg6;
        field10373++;
        for (int var10 = 0; var10 < this.field10367.length; var10++) {
            this.field10367[var10].method1184(arg0, arg7, arg2 - 256);
        }
        class462.method2729(arg4, (byte) -89);
        class334.method2113(arg7, arg0, (byte) 122);
        int[] var11 = new int[arg0 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg5) {
            var12 = arg0 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field10368.field4178) {
                int[] var18 = this.field10368.method15(var16, 255);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field10368.method18(var16, -1564599039);
                var19 = var22[1];
                var20 = var22[0];
                var21 = var22[2];
            }
            if (arg3) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
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
                int var27 = class390.field5692[var25];
                int var28 = class390.field5692[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class390.field5692[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = arg2; var17 < this.field10367.length; var17++) {
            this.field10367[var17].method1170((byte) -106);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILd;ZILin;I)[F")
    public final float[] method4179(int arg0, class152 arg1, boolean arg2, int arg3, class91 arg4, int arg5) {
        field10372++;
        class362.field5199 = arg4;
        class700.field9462 = arg1;
        if (arg5 >= -1) {
            this.method4176(null, -60, 98, false, -0.11623531533038078D, null, (byte) -72);
        }
        for (int var7 = 0; var7 < this.field10367.length; var7++) {
            this.field10367[var7].method1184(arg0, arg3, -256);
        }
        class334.method2113(arg3, arg0, (byte) 115);
        float[] var8 = new float[arg0 * 4 * arg3];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field10368.field4178) {
                int[] var16 = this.field10368.method15(var10, 255);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field10368.method18(var10, -1564599039);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field10374.field4178) {
                var17 = this.field10374.method15(var10, 255);
            } else {
                var17 = this.field10374.method18(var10, -1564599039)[0];
            }
            int[] var18;
            if (this.field10375.field4178) {
                var18 = this.field10375.method15(var10, 255);
            } else {
                var18 = this.field10375.method18(var10, -1564599039)[0];
            }
            if (arg2) {
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
                if (arg2) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field10367.length; var11++) {
            this.field10367[var11].method1170((byte) -125);
        }
        return var8;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V")
    public static void method4180(byte arg0) {
        field10381 = null;
        int var1 = 19 % ((76 - arg0) / 39);
        field10380 = null;
        field10377 = null;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class749() {
        this.field10370 = new int[0];
        this.field10371 = new int[0];
        this.field10375 = new class333(0);
        this.field10375.field4169 = 1;
        this.field10368 = new class333();
        this.field10368.field4169 = 1;
        this.field10374 = new class333();
        this.field10367 = new class297[] { this.field10368, this.field10374, this.field10375 };
        this.field10374.field4169 = 1;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lcea;)V")
    public class749(class215 arg0) {
        int var2 = arg0.method1535(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field10367 = new class297[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class297 var16 = class206.method1427(125, arg0);
            if (var16.method1169(-121) >= 0) {
                var3++;
            }
            if (var16.method1187(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field4164.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1535(255);
            }
            this.field10367[var6] = var16;
        }
        this.field10371 = new int[var3];
        this.field10370 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class297 var11 = this.field10367[var9];
            int var12 = var11.field4164.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4164[var13] = this.field10367[var5[var9][var13]];
            }
            int var14 = var11.method1169(-119);
            int var15 = var11.method1187(-1);
            if (var14 > 0) {
                this.field10371[var7++] = var14;
            }
            if (var15 > 0) {
                this.field10370[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field10368 = this.field10367[arg0.method1535(255)];
        this.field10374 = this.field10367[arg0.method1535(255)];
        this.field10375 = this.field10367[arg0.method1535(255)];
        Object var10 = null;
    }
}
