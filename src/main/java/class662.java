import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class662 extends class339 {

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "[I")
    private int[] field9432;

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "[I")
    private int[] field9439;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "Llm;")
    private class335 field9430;

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "Llm;")
    private class335 field9438;

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "Llm;")
    private class335 field9436;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "[Llm;")
    private class335[] field9427;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[I")
    public static int[] field9431 = new int[1];

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "Lwh;")
    public static class546 field9434 = new class546(8);

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "F")
    public static float field9429;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "[I")
    public static int[] field9440;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lfa;Lga;I)Z", line = 4)
    public final boolean method3776(class522 arg0, class332 arg1, int arg2) {
        field9437++;
        if (class49.field576 < 0) {
            for (int var4 = 0; var4 < this.field9432.length; var4++) {
                if (!arg1.method1931(1, this.field9432[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field9432.length; var5++) {
                if (!arg1.method1962(this.field9432[var5], 126, class49.field576)) {
                    return false;
                }
            }
        }
        if (arg2 != 2) {
            this.method3780(-52, false, -45, 114, null, null);
        }
        for (int var6 = 0; var6 < this.field9439.length; var6++) {
            if (!arg0.method2961(true, this.field9439[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V", line = 61)
    public static void method3777(boolean arg0) {
        field9440 = null;
        field9431 = null;
        if (!arg0) {
            field9434 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIZILfa;Lga;D)[I", line = 73)
    public final int[] method3778(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, class522 arg5, class332 arg6, double arg7) {
        field9426++;
        class209.field2794 = arg5;
        class348.field4636 = arg6;
        for (int var10 = 0; var10 < this.field9427.length; var10++) {
            this.field9427[var10].method1276(255, arg2, arg4);
        }
        class32.method198(arg7, (byte) -97);
        class239.method1483(arg2, arg0 + 10304, arg4);
        int[] var11 = new int[arg2 * arg4];
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = arg4 - 1;
            var14 = -1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = arg4;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field9438.field4537) {
                int[] var18 = this.field9438.method3(true, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field9438.method1(var16, false);
                var19 = var22[1];
                var21 = var22[0];
                var20 = var22[2];
            }
            if (arg3) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
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
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class601.field8355[var25];
                int var28 = class601.field8355[var24];
                int var29 = class601.field8355[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg4 - 1;
                }
            }
        }
        if (arg0 != -10304) {
            field9434 = null;
        }
        for (int var17 = 0; var17 < this.field9427.length; var17++) {
            this.field9427[var17].method1277((byte) 91);
        }
        return var11;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;[BII)I", line = 222)
    public static final int method3779(String arg0, byte[] arg1, int arg2, int arg3) {
        field9433++;
        int var4 = arg0.length();
        if (arg3 != 63) {
            return -44;
        }
        int var5 = arg2;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) class665.method3789(192, var7 >> 6);
                arg1[var5++] = (byte) class665.method3789(class15.method97(var7, 63), 128);
            } else {
                arg1[var5++] = (byte) class665.method3789(var7 >> 12, 224);
                arg1[var5++] = (byte) class665.method3789(128, class15.method97(var7 >> 6, 63));
                arg1[var5++] = (byte) class665.method3789(class15.method97(var7, 63), 128);
            }
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIILfa;Lga;)[F", line = 265)
    public final float[] method3780(int arg0, boolean arg1, int arg2, int arg3, class522 arg4, class332 arg5) {
        class348.field4636 = arg5;
        if (arg2 <= 59) {
            this.method3778(-40, true, -23, false, -83, null, null, -0.8209476855647482D);
        }
        class209.field2794 = arg4;
        field9435++;
        for (int var7 = 0; var7 < this.field9427.length; var7++) {
            this.field9427[var7].method1276(255, arg0, arg3);
        }
        class239.method1483(arg0, 0, arg3);
        float[] var8 = new float[arg0 * arg3 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field9438.field4537) {
                int[] var16 = this.field9438.method3(true, var10);
                var13 = var16;
                var15 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field9438.method1(var10, false);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field9436.field4537) {
                var17 = this.field9436.method3(true, var10);
            } else {
                var17 = this.field9436.method1(var10, false)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field9430.field4537) {
                var18 = this.field9430.method3(true, var10);
            } else {
                var18 = this.field9430.method1(var10, false)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field9427.length; var11++) {
            this.field9427[var11].method1277((byte) 118);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILga;ZILfa;D)[I", line = 379)
    public final int[] method3781(int arg0, int arg1, class332 arg2, boolean arg3, int arg4, class522 arg5, double arg6) {
        if (arg4 <= 92) {
            field9434 = null;
        }
        class209.field2794 = arg5;
        class348.field4636 = arg2;
        field9428++;
        for (int var9 = 0; var9 < this.field9427.length; var9++) {
            this.field9427[var9].method1276(255, arg1, arg0);
        }
        class32.method198(arg6, (byte) -104);
        class239.method1483(arg1, 0, arg0);
        int[] var10 = new int[arg1 * 4 * arg0];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field9438.field4537) {
                int[] var18 = this.field9438.method3(true, var12);
                var15 = var18;
                var17 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field9438.method1(var12, false);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            int[] var19;
            if (this.field9436.field4537) {
                var19 = this.field9436.method3(true, var12);
            } else {
                var19 = this.field9436.method1(var12, false)[0];
            }
            if (arg3) {
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
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class601.field8355[var22];
                int var25 = class601.field8355[var21];
                int var26 = class601.field8355[var23];
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
                var10[var11++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                if (arg3) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field9427.length; var13++) {
            this.field9427[var13].method1277((byte) 100);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V", line = 525)
    public class662() {
        this.field9432 = new int[0];
        this.field9439 = new int[0];
        this.field9430 = new class251(0);
        this.field9430.field4532 = 1;
        this.field9438 = new class251();
        this.field9438.field4532 = 1;
        this.field9436 = new class251();
        this.field9436.field4532 = 1;
        this.field9427 = new class335[] { this.field9438, this.field9436, this.field9430 };
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lio;)V", line = 540)
    public class662(class157 arg0) {
        int var2 = arg0.method930(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field9427 = new class335[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class335 var16 = class694.method3913(arg0, 896);
            if (var16.method1749(true) >= 0) {
                var3++;
            }
            if (var16.method1278(-88) >= 0) {
                var4++;
            }
            int var17 = var16.field4521.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method930(255);
            }
            this.field9427[var6] = var16;
        }
        this.field9432 = new int[var3];
        int var7 = 0;
        this.field9439 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class335 var11 = this.field9427[var9];
            int var12 = var11.field4521.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4521[var13] = this.field9427[var5[var9][var13]];
            }
            int var14 = var11.method1749(true);
            int var15 = var11.method1278(-101);
            if (var14 > 0) {
                this.field9432[var7++] = var14;
            }
            if (var15 > 0) {
                this.field9439[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field9438 = this.field9427[arg0.method930(255)];
        this.field9436 = this.field9427[arg0.method930(255)];
        Object var10 = null;
        this.field9430 = this.field9427[arg0.method930(255)];
    }
}
