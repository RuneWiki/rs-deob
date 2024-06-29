import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class46 extends class678 {

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "[I")
    private int[] field1119;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "[I")
    private int[] field1124;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "Lmfa;")
    private class573 field1131;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "Lmfa;")
    private class573 field1126;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "Lmfa;")
    private class573 field1132;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "[Lmfa;")
    private class573[] field1120;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "Z")
    public static boolean field1130 = false;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "[[I")
    public static int[][] field1133 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "Lom;")
    public static class344 field1128;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILom;Lfa;ZII)[F")
    public final float[] method591(int arg0, class344 arg1, class214 arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 != 255) {
            method593(16, (byte) 41, -85, null);
        }
        field1123++;
        class220.field3333 = arg1;
        class350.field5256 = arg2;
        for (int var7 = 0; var7 < this.field1120.length; var7++) {
            this.field1120[var7].method790(arg0, (byte) 111, arg4);
        }
        class453.method2728(arg0, arg4, (byte) 109);
        float[] var8 = new float[arg0 * 4 * arg4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1126.field8334) {
                int[] var12 = this.field1126.method619(var10, 1);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1126.method442(-122, var10);
                var13 = var16[0];
                var15 = var16[1];
                var14 = var16[2];
            }
            int[] var17;
            if (this.field1132.field8334) {
                var17 = this.field1132.method619(var10, arg5 ^ 0xFE);
            } else {
                var17 = this.field1132.method442(-124, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field1131.field8334) {
                var18 = this.field1131.method619(var10, arg5 ^ 0xFE);
            } else {
                var18 = this.field1131.method442(-120, var10)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1120.length; var11++) {
            this.field1120[var11].method671(-10208);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
    public static void method592(byte arg0) {
        int var1 = 83 / ((24 - arg0) / 42);
        field1128 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBILlk;)V")
    public static final void method593(int arg0, byte arg1, int arg2, class545 arg3) {
        class569.field8294 = arg2;
        if (arg1 != 66) {
            field1130 = false;
        }
        class348.field5183 = arg0;
        field1125++;
        class691.field9760 = arg3;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZLom;IIIZDLfa;)[I")
    public final int[] method594(boolean arg0, class344 arg1, int arg2, int arg3, int arg4, boolean arg5, double arg6, class214 arg7) {
        class220.field3333 = arg1;
        class350.field5256 = arg7;
        field1122++;
        for (int var10 = 0; var10 < this.field1120.length; var10++) {
            this.field1120[var10].method790(arg2, (byte) 5, arg4);
        }
        class117.method1024(arg6, -1973);
        if (arg3 <= 107) {
            this.field1120 = null;
        }
        class453.method2728(arg2, arg4, (byte) 109);
        int[] var11 = new int[arg2 * arg4];
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var13 = arg4 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg4;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1126.field8334) {
                int[] var18 = this.field1126.method619(var16, 1);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1126.method442(-127, var16);
                var21 = var22[2];
                var19 = var22[0];
                var20 = var22[1];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
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
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class560.field7908[var25];
                int var28 = class560.field7908[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class560.field7908[var26];
                int var30 = (var28 << 16) - (-(var27 << 8) - var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1120.length; var17++) {
            this.field1120[var17].method671(-10208);
        }
        return var11;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lom;IDIILfa;Z)[I")
    public final int[] method595(class344 arg0, int arg1, double arg2, int arg3, int arg4, class214 arg5, boolean arg6) {
        field1127++;
        class220.field3333 = arg0;
        class350.field5256 = arg5;
        for (int var9 = 0; var9 < this.field1120.length; var9++) {
            this.field1120[var9].method790(arg4, (byte) -52, arg3);
        }
        class117.method1024(arg2, -1973);
        class453.method2728(arg4, arg3, (byte) 109);
        int[] var10 = new int[arg3 * arg4 * 4];
        int var11 = 0;
        if (arg1 != -256) {
            this.method594(true, null, -94, -100, -19, true, -1.0370746590068416D, null);
        }
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1126.field8334) {
                int[] var14 = this.field1126.method619(var12, 1);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1126.method442(-120, var12);
                var17 = var18[0];
                var16 = var18[2];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field1132.field8334) {
                var19 = this.field1132.method619(var12, arg1 ^ 0xFFFFFF01);
            } else {
                var19 = this.field1132.method442(arg1 ^ 0x80, var12)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
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
                int var24 = class560.field7908[var21];
                int var25 = class560.field7908[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class560.field7908[var23];
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
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg6) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1120.length; var13++) {
            this.field1120[var13].method671(arg1 ^ 0x2720);
        }
        return var10;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
    public class46() {
        this.field1119 = new int[0];
        this.field1124 = new int[0];
        this.field1131 = new class417(0);
        this.field1131.field8315 = 1;
        this.field1126 = new class417();
        this.field1126.field8315 = 1;
        this.field1132 = new class417();
        this.field1120 = new class573[] { this.field1126, this.field1132, this.field1131 };
        this.field1132.field8315 = 1;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lqh;)V")
    public class46(class61 arg0) {
        int var2 = arg0.method732(-559537960);
        int var3 = 0;
        int var4 = 0;
        this.field1120 = new class573[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class573 var16 = class399.method2452(-114, arg0);
            if (var16.method672((byte) 126) >= 0) {
                var3++;
            }
            if (var16.method793(967) >= 0) {
                var4++;
            }
            int var17 = var16.field8324.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method732(-559537960);
            }
            this.field1120[var6] = var16;
        }
        this.field1119 = new int[var3];
        int var7 = 0;
        this.field1124 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class573 var11 = this.field1120[var9];
            int var12 = var11.field8324.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field8324[var13] = this.field1120[var5[var9][var13]];
            }
            int var14 = var11.method672((byte) 127);
            int var15 = var11.method793(967);
            if (var14 > 0) {
                this.field1119[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1124[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1126 = this.field1120[arg0.method732(-559537960)];
        this.field1132 = this.field1120[arg0.method732(-559537960)];
        this.field1131 = this.field1120[arg0.method732(-559537960)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lfa;Lom;I)Z")
    public final boolean method596(class214 arg0, class344 arg1, int arg2) {
        field1121++;
        int var4 = -119 / ((-arg2 - 43) / 37);
        if (class533.field7465 >= 0) {
            for (int var5 = 0; var5 < this.field1119.length; var5++) {
                if (!arg1.method2217(class533.field7465, -99, this.field1119[var5])) {
                    return false;
                }
            }
        } else {
            for (int var6 = 0; var6 < this.field1119.length; var6++) {
                if (!arg1.method2230((byte) -93, this.field1119[var6])) {
                    return false;
                }
            }
        }
        for (int var7 = 0; var7 < this.field1124.length; var7++) {
            if (!arg0.method1499(this.field1124[var7], -24052)) {
                return false;
            }
        }
        return true;
    }
}
