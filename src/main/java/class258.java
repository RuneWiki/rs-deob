import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class258 extends class6 {

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lkt;")
    public class108 field3588;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "[I")
    public static int[] field3594 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field3597;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Lwj;")
    public static class270 field3598;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lc;")
    public static class122 field3593;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "Ll;")
    public static class16 field3592;

    static {
        new class466("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3597 = new String[200];
        field3598 = new class270(40, 12);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1552(boolean arg0) {
        if (arg0) {
            field3594 = null;
        }
        field3594 = null;
        field3598 = null;
        field3597 = null;
        field3592 = null;
        field3593 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(FIFZFIII)[F", line = 18)
    public static final float[] method1553(float arg0, int arg1, float arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7) {
        field3589++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
        var8[2] = var11;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[0] = var10;
        if (!arg3) {
            field3597 = null;
        }
        var8[6] = -var11;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = (float) Math.sqrt((double) (arg6 * arg6 + arg7 * arg7));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg7 / var19;
                var14 = (float) (-arg6) / var19;
            }
            var13[4] = var16;
            var13[7] = -var14 * var18;
            var13[0] = var14 * var14 * var17 + var16;
            var13[8] = var15 * var15 * var17 + var16;
            var13[1] = var15 * var18;
            var13[3] = -var15 * var18;
            var13[2] = var14 * var15 * var17;
            var13[5] = var14 * var18;
            var13[6] = var14 * var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg4;
        var9[8] *= arg0;
        var9[1] *= arg4;
        var9[4] *= arg2;
        var9[5] *= arg2;
        var9[6] *= arg0;
        var9[3] *= arg2;
        var9[7] *= arg0;
        var9[2] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIJILma;IILem;I)V", line = 101)
    public static final void method1554(int arg0, int arg1, long arg2, int arg3, class10 arg4, int arg5, int arg6, class150 arg7, int arg8) {
        field3596++;
        int var10 = arg1 * arg1 + arg6 * arg6;
        if (arg5 != 10) {
            field3593 = null;
        }
        if (((long) var10) > arg2) {
            return;
        }
        int var11 = Math.min(arg7.field2204 / 2, arg7.field2322 / 2);
        if (var11 * var11 >= var10) {
            class315.method1835(arg1, 0, arg4, arg0, class50.field602[arg8], arg6, arg3, arg7);
            return;
        }
        var11 -= 10;
        int var12;
        if (class491.field7168 == 4) {
            var12 = (int) class498.field7255 & 0x3FFF;
        } else {
            var12 = (int) class498.field7255 + class302.field4143 & 0x3FFF;
        }
        int var13 = class183.field2684[var12];
        int var14 = class183.field2678[var12];
        if (class491.field7168 != 4) {
            var14 = var14 * 256 / (class162.field2435 + 256);
            var13 = var13 * 256 / (class162.field2435 + 256);
        }
        int var15 = arg1 * var14 + arg6 * var13 >> 15;
        int var16 = arg6 * var14 - (arg1 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class345.field4954[arg8].method92((float) arg7.field2204 / 2.0F + (float) arg0 + (float) var19, (float) arg7.field2322 / 2.0F + (float) arg3 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)I", line = 156)
    public static final int method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg2;
            arg2 = var8;
        }
        if (arg1 != 4400) {
            return 37;
        }
        field3587++;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 1 + 7 - arg5 - arg0;
        } else {
            return 7 + 1 - arg4 - arg2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBIII)V", line = 190)
    public static final void method1556(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3590++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg1 * arg1;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = 117 % ((arg2 + 42) / 46);
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg4 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg4 - 1) * var16;
        if (arg3 >= class417.field6057 && arg3 <= class224.field3193) {
            int var22 = class46.method425(true, arg1 + arg5, class76.field1021, class424.field6204);
            int var23 = class46.method425(true, arg5 - arg1, class76.field1021, class424.field6204);
            class210.method1300(var23, class437.field6400[arg3], (byte) 98, var22, arg0);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var20;
                    var13 += var18;
                    var18 += var17;
                    var20 += var17;
                    var6++;
                }
            }
            if (var15 < 0) {
                var13 += var18;
                var15 += var20;
                var20 += var17;
                var6++;
                var18 += var17;
            }
            var15 += -var19;
            var13 += -var21;
            var21 -= var16;
            var19 -= var16;
            var7--;
            int var24 = arg3 - var7;
            int var25 = arg3 + var7;
            if (class417.field6057 <= var25 && class224.field3193 >= var24) {
                int var26 = class46.method425(true, arg5 + var6, class76.field1021, class424.field6204);
                int var27 = class46.method425(true, arg5 - var6, class76.field1021, class424.field6204);
                if (class417.field6057 <= var24) {
                    class210.method1300(var27, class437.field6400[var24], (byte) 95, var26, arg0);
                }
                if (class224.field3193 >= var25) {
                    class210.method1300(var27, class437.field6400[var25], (byte) 116, var26, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lkt;)V", line = 291)
    public class258(class108 arg0) {
        this.field3588 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V", line = 303)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3) {
        field3595++;
        if (arg3 != -24278) {
            method1552(false);
        }
        int var4 = class20.field269.field7671 * arg1 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class5.method31(false, class414.field6044, 0, (byte) 115, arg2, var4);
            class486.field7122 = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILid;)V", line = 324)
    public static final void method1558(int arg0, int arg1, int arg2, int arg3, class413 arg4) {
        class486 var5 = class307.method1784(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field6026 = (arg1 << class523.field7736) + class131.field1925;
        arg4.field6021 = arg3;
        arg4.field6025 = (arg2 << class523.field7736) + class131.field1925;
        for (class164 var7 = var5.field7115; var7 != null; var7 = var7.field2467) {
            if (var7.field2468.field1731) {
                int var8 = var7.field2468.method792(true);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field6021 += var6;
            arg4.field6034 = true;
        }
        var5.field7097 = arg4;
    }
}
