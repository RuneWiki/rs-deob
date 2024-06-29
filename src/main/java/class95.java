import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class95 extends class189 {

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "[I")
    public int[] field1107 = new int[] { -1 };

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "[I")
    public int[] field1113 = new int[1];

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "[I")
    public static int[] field1115 = new int[5];

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "Lqg;")
    public static class462 field1114 = new class462(14, 0);

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "Lqg;")
    public static class462 field1116 = new class462(15, 4);

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "Lqg;")
    public static class462 field1117 = new class462(16, -2);

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "Lqg;")
    public static class462 field1118 = new class462(17, 0);

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "Lqg;")
    public static class462 field1119 = new class462(18, -2);

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "Lqg;")
    public static class462 field1120 = new class462(19, -2);

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "Lqg;")
    public static class462 field1121 = new class462(20, 6);

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "Lqg;")
    public static class462 field1122 = new class462(21, 9);

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "Lqg;")
    public static class462 field1123 = new class462(22, -2);

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "Lqg;")
    public static class462 field1124 = new class462(23, 4);

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "Lqg;")
    public static class462 field1125 = new class462(24, -1);

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "Lqg;")
    public static class462 field1126 = new class462(26, 0);

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Lqg;")
    public static class462 field1127 = new class462(27, 0);

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "Lqg;")
    public static class462 field1128 = new class462(28, -2);

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "[Lqg;")
    private static class462[] field1129 = new class462[32];

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "[I")
    public static int[] field1110;

    static {
        class462[] var0 = class665.method3637(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1129[var0[var1].field6501] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(FIIBIFIF)[F", line = 10)
    public static final float[] method700(float arg0, int arg1, int arg2, byte arg3, int arg4, float arg5, int arg6, float arg7) {
        field1111++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        int var13 = -50 / ((arg3 - 60) / 53);
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[0] = var10;
        var8[8] = var10;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = 0.0F;
        float var17 = (float) arg2 / 32767.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var17 * var17))));
        float var19 = 1.0F - var17;
        float var20 = (float) Math.sqrt((double) (arg4 * arg4 + arg6 * arg6));
        if (var20 == 0.0F && var17 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var16 = (float) arg6 / var20;
                var15 = (float) (-arg4) / var20;
            }
            var14[0] = var15 * var15 * var19 + var17;
            var14[4] = var17;
            var14[5] = var15 * var18;
            var14[3] = -var16 * var18;
            var14[2] = var15 * var16 * var19;
            var14[8] = var16 * var16 * var19 + var17;
            var14[6] = var15 * var16 * var19;
            var14[1] = var16 * var18;
            var14[7] = -var15 * var18;
            var9[0] = var8[2] * var14[6] + var8[1] * var14[3] + var8[0] * var14[0];
            var9[1] = var8[2] * var14[7] + var8[1] * var14[4] + var8[0] * var14[1];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[3] = var8[5] * var14[6] + var8[4] * var14[3] + var8[3] * var14[0];
            var9[4] = var8[5] * var14[7] + var8[3] * var14[1] + var8[4] * var14[4];
            var9[6] = var8[8] * var14[6] + var8[6] * var14[0] + var8[7] * var14[3];
            var9[5] = var8[5] * var14[8] + var8[3] * var14[2] + var8[4] * var14[5];
            var9[7] = var8[8] * var14[7] + var8[7] * var14[4] + var8[6] * var14[1];
            var9[8] = var8[8] * var14[8] + var8[7] * var14[5] + var8[6] * var14[2];
        }
        var9[8] *= arg5;
        var9[0] *= arg7;
        var9[7] *= arg5;
        var9[2] *= arg7;
        var9[1] *= arg7;
        var9[3] *= arg0;
        var9[5] *= arg0;
        var9[4] *= arg0;
        var9[6] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V", line = 102)
    public static final void method701(byte arg0) {
        if (class268.field3831.method476()) {
            class268.field3831.method477(class366.field5196);
            class737.method4123(98);
            if (class589.field8295) {
                class591.method3344(27634, class366.field5196);
            } else {
                Dimension var1 = class366.field5196.getSize();
                class268.field3831.method403(class366.field5196, var1.width, var1.height);
            }
            class268.field3831.method450(class366.field5196);
        } else {
            class759.method4212(false, 0, class557.field7812.field6521.method2556(false));
        }
        field1108++;
        if (arg0 > -22) {
            method700(-0.8139066F, 16, -43, (byte) 40, -107, -1.914978F, -23, 0.7198109F);
        }
        class350.method2257(-101);
        class230.field3098 = true;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 132)
    public static void method702(int arg0) {
        field1119 = null;
        field1127 = null;
        field1128 = null;
        field1125 = null;
        field1121 = null;
        field1118 = null;
        field1126 = null;
        field1117 = null;
        field1115 = null;
        field1114 = null;
        field1116 = null;
        field1122 = null;
        if (arg0 != 19) {
            method700(-0.91950655F, -85, 107, (byte) -91, 15, -0.18214524F, -76, -0.38330656F);
        }
        field1120 = null;
        field1124 = null;
        field1110 = null;
        field1129 = null;
        field1123 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ[II[I)J", line = 160)
    private final long method703(int arg0, boolean arg1, int[] arg2, int arg3, int[] arg4) {
        field1112++;
        long[] var6 = class344.field4828;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg0 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg2[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)];
            }
        }
        long var15 = var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        if (arg3 < 39) {
            field1129 = null;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZBLmga;ILha;IIIILof;)Lka;", line = 210)
    public final class471 method704(boolean arg0, byte arg1, class709 arg2, int arg3, class58 arg4, int arg5, int arg6, int arg7, int arg8, class621 arg9) {
        field1109++;
        if (arg1 >= -62) {
            field1122 = null;
        }
        class471 var11 = null;
        int var12 = arg5;
        class224 var13 = null;
        if (arg3 != -1) {
            var13 = class200.field2638.method3506(arg3, 64);
        }
        int[] var14 = this.field1107;
        if (var13 != null && var13.field3005 != null) {
            var14 = new int[var13.field3005.length];
            for (int var15 = 0; var15 < var13.field3005.length; var15++) {
                int var16 = var13.field3005[var15];
                if (var16 >= 0 && this.field1107.length > var16) {
                    var14[var15] = this.field1107[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class494 var24 = null;
        class494 var25 = null;
        if (arg2 != null) {
            int var26 = arg2.field9826[arg8];
            var12 = arg5 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class343.field4785.method3521(111, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2958(false, var21);
                var17 |= var24.method2957(126, var21);
                var20 |= var24.method2953(var21, 1);
                var19 |= arg2.field9852;
            }
            if ((arg2.field9830 || class411.field5804) && arg6 != -1 && arg6 < arg2.field9826.length) {
                int var28 = arg2.field9826[arg6];
                var23 = arg2.field9849[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class343.field4785.method3521(59, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2958(false, var22);
                    var17 |= var25.method2957(127, var22);
                    var20 |= var25.method2953(var22, 1);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method703(arg3, arg0, var14, 70, arg9 == null ? null : arg9.field8657);
        if (class565.field8027 != null) {
            var11 = (class471) class565.field8027.method4022(var30, (byte) 81);
        }
        if (var11 == null || arg4.method466(var11.method228(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method479(var12, var11.method228());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class682.field9361.method3424(var14[var34], false).method3181(arg0, (byte) 42)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class6[] var35 = new class6[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class682.field9361.method3424(var14[var36], false).method3189(arg0, 4371);
                }
            }
            if (var13 != null && var13.field3016 != null) {
                for (int var37 = 0; var37 < var13.field3016.length; var37++) {
                    if (var13.field3016[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3016[var37][0];
                        int var39 = var13.field3016[var37][1];
                        int var40 = var13.field3016[var37][2];
                        int var41 = var13.field3016[var37][3];
                        int var42 = var13.field3016[var37][4];
                        int var43 = var13.field3016[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method39(var41, var43, 0, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method30(var39, (byte) 79, var40, var38);
                        }
                    }
                }
            }
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            class6 var44 = new class6(var35, var35.length);
            var11 = arg4.method397(var44, var32, class93.field1090, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class485.field6815.length; var46++) {
                        if (arg9.field8657[var45] < class485.field6815[var46][var45].length) {
                            var11.method261(class465.field6591[var46][var45], class485.field6815[var46][var45][arg9.field8657[var45]]);
                        }
                    }
                }
            }
            if (class565.field8027 != null) {
                var11.method242(var12);
                class565.field8027.method4018((byte) 127, var11, var30);
            }
        }
        if (arg2 == null || var24 == null) {
            return var11;
        } else {
            class471 var47 = var11.method226((byte) 1, var12, true);
            var47.method2810(var24, arg7 - 1, var21, var22, arg2.field9852, 0, var23, var25, 1000);
            return var47;
        }
    }
}
