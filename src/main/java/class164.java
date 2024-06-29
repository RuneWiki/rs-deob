import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class164 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lbe;")
    public static class283 field2704 = class153.method941(127, "gleiten:");

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lbe;")
    public static class283 field2710 = class153.method941(126, ")4g");

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[[B")
    public static byte[][] field2705 = new byte[250][];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    public static boolean field2707 = false;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field2713 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field2711;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 10)
    public static void method996(boolean arg0) {
        field2711 = null;
        field2705 = (byte[][]) null;
        if (arg0) {
            field2707 = true;
        }
        field2710 = null;
        field2704 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[I[[III[[FLsf;FIZI[[F[[FIIIIII)I", line = 45)
    public static final int method997(int[][] arg0, int[][] arg1, int arg2, int arg3, float[][] arg4, class100 arg5, float arg6, int arg7, boolean arg8, int arg9, float[][] arg10, float[][] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17) {
        if (arg13 != 210) {
            return 65;
        }
        field2708++;
        if (arg9 == 1) {
            int var19 = arg12;
            arg12 = arg2;
            arg2 = 128 - var19;
        } else if (arg9 == 2) {
            arg2 = 128 - arg2;
            arg12 = 128 - arg12;
        } else if (arg9 == 3) {
            int var18 = arg12;
            arg12 = 128 - arg2;
            arg2 = var18;
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg12 == 0 && arg2 == 0) {
            var20 = arg11[arg16][arg7];
            var21 = arg10[arg16][arg7];
            var22 = arg14;
            var23 = arg4[arg16][arg7];
        } else if (arg12 == 128 && arg2 == 0) {
            var21 = arg10[arg16 + 1][arg7];
            var23 = arg4[arg16 + 1][arg7];
            var22 = arg3;
            var20 = arg11[arg16 + 1][arg7];
        } else if (arg12 == 128 && arg2 == 128) {
            var21 = arg10[arg16 + 1][arg7 + 1];
            var22 = arg17;
            var23 = arg4[arg16 + 1][arg7 + 1];
            var20 = arg11[arg16 + 1][arg7 + 1];
        } else if (arg12 == 0 && arg2 == 128) {
            var22 = arg15;
            var21 = arg10[arg16][arg7 + 1];
            var20 = arg11[arg16][arg7 + 1];
            var23 = arg4[arg16][arg7 + 1];
        } else {
            float var24 = arg11[arg16][arg7];
            float var25 = arg4[arg16][arg7];
            float var26 = arg10[arg16][arg7];
            float var27 = (float) arg12 / 128.0F;
            float var28 = (arg11[arg16 + 1][arg7] - var24) * var27 + var24;
            float var29 = (arg4[arg16 + 1][arg7] - var25) * var27 + var25;
            float var30 = (float) arg2 / 128.0F;
            float var31 = (arg10[arg16 + 1][arg7] - var26) * var27 + var26;
            float var32 = arg11[arg16][arg7 + 1];
            float var33 = (arg11[arg16 + 1][arg7 + 1] - var32) * var27 + var32;
            var20 = (var33 - var28) * var30 + var28;
            float var34 = arg10[arg16][arg7 + 1];
            float var35 = arg4[arg16][arg7 + 1];
            float var36 = (arg10[arg16 + 1][arg7 + 1] - var34) * var27 + var34;
            float var37 = (arg4[arg16 + 1][arg7 + 1] - var35) * var27 + var35;
            var21 = (var36 - var31) * var30 + var31;
            var23 = (var37 - var29) * var30 + var29;
            int var38 = class176.method1163(arg12, (byte) -128, arg14, arg3);
            int var39 = class176.method1163(arg12, (byte) -126, arg15, arg17);
            var22 = class176.method1163(arg2, (byte) -118, var38, var39);
        }
        int var40 = (arg16 << 7) + arg12;
        int var41 = (arg7 << 7) + arg2;
        int var42 = class168.method1067(arg7, arg2, arg16, arg12, 85, arg1);
        return arg5.method664(var40, var42, var41, var20, var21, var23, arg8 ? var22 & 0xFFFFFF00 : var22, arg0 == null ? 0.0F : (float) (var42 - class168.method1067(arg7, arg2, arg16, arg12, arg13 ^ 0xB6, arg0)) / arg6);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZLbe;)V", line = 163)
    public static final void method998(int arg0, boolean arg1, class283 arg2) {
        int var3 = 0;
        short[] var4 = new short[16];
        if (arg0 > -38) {
            field2707 = true;
        }
        class283 var5 = arg2.method1912(9974);
        field2706++;
        for (int var6 = 0; var6 < class72.field1259; var6++) {
            class304 var7 = class103.method676(var6, -1);
            if ((!arg1 || var7.field5157) && var7.field5143 == -1 && var7.field5135 == -1 && var7.field5176 == 0 && var7.field5155.method1912(9974).method1951(var5, (byte) 22) != -1) {
                if (var3 >= 250) {
                    class89.field1515 = -1;
                    class57.field785 = null;
                    return;
                }
                if (var4.length <= var3) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var3; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var3++] = (short) var6;
            }
        }
        class89.field1515 = var3;
        class283[] var10 = new class283[class89.field1515];
        class57.field785 = var4;
        class259.field4401 = 0;
        for (int var11 = 0; var11 < class89.field1515; var11++) {
            var10[var11] = class103.method676(var4[var11], -1).field5155;
        }
        class168.method1064(-85, class57.field785, var10);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)V", line = 243)
    public static final void method999(int arg0, boolean arg1) {
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class63.field872;
        } else {
            var3 = class254.field4296;
            var2 = 4;
        }
        field2703++;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            int var7 = (class177.field3039[var5] >> 8) * 64 - class214.field3637;
            int var8 = (class177.field3039[var5] & 0xFF) * 64 - class107.field1833;
            if (var6 != null) {
                class281.method1876((byte) -121);
                class262.method1772(var6, var7, arg1, var8, (byte) 119, class184.field3170 * 8 - 48, class180.field3102, class114.field1914 * 8 - 48);
            }
        }
        for (int var9 = arg0; var9 < var4; var9++) {
            int var10 = (class177.field3039[var9] >> 8) * 64 - class214.field3637;
            int var11 = (class177.field3039[var9] & 0xFF) * 64 - class107.field1833;
            byte[] var12 = var3[var9];
            if (var12 == null && class114.field1914 < 800) {
                class281.method1876((byte) -120);
                for (int var13 = 0; var13 < var2; var13++) {
                    class129.method807(var11, 64, 64, var13, var10, (byte) -67);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILka;Lka;)V", line = 330)
    public static final void method1000(int arg0, class177 arg1, class177 arg2) {
        field2712++;
        if (arg2.field3038 != null) {
            arg2.method1168(arg0 - 60);
        }
        arg2.field3038 = arg1;
        arg2.field3053 = arg1.field3053;
        arg2.field3038.field3053 = arg2;
        if (arg0 != 64) {
            method996(true);
        }
        arg2.field3053.field3038 = arg2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIII)V", line = 349)
    public static final void method1001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 78) {
            field2710 = (class283) null;
        }
        if (class269.field4551 <= arg3 && arg3 <= class166.field2765 && arg8 >= class269.field4551 && class166.field2765 >= arg8 && class269.field4551 <= arg9 && class166.field2765 >= arg9 && class269.field4551 <= arg7 && arg7 <= class166.field2765 && class217.field3677 <= arg0 && arg0 <= class247.field4220 && class217.field3677 <= arg1 && class247.field4220 >= arg1 && class217.field3677 <= arg2 && class247.field4220 >= arg2 && class217.field3677 <= arg4 && arg4 <= class247.field4220) {
            class182.method1203(arg9, 83, arg8, arg0, arg2, arg1, arg7, arg6, arg4, arg3);
        } else {
            class269.method1819(arg0, arg3, -105, arg7, arg6, arg4, arg1, arg9, arg2, arg8);
        }
        field2709++;
    }
}
