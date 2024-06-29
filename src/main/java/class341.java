import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class341 {

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5312 = "glow1:";

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[[B")
    public static byte[][] field5314 = new byte[250][];

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5316 = "yellow:";

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Lok;")
    public static class160 field5315 = null;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lim;II)V", line = 5)
    private final void method2348(class192 arg0, int arg1, int arg2) {
        field5311++;
        if (arg1 != 0) {
            field5312 = (String) null;
        }
        if (arg2 == 1) {
            this.field5308 = arg0.method1396(-57);
            this.field5306 = arg0.method1399(-1172389784);
            this.field5318 = arg0.method1399(-1172389784);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([[F[[FI[[F[[IZIFILkd;III[[IIIII)I", line = 26)
    public static final int method2349(float[][] arg0, float[][] arg1, int arg2, float[][] arg3, int[][] arg4, boolean arg5, int arg6, float arg7, int arg8, class83 arg9, int arg10, int arg11, int arg12, int[][] arg13, int arg14, int arg15, int arg16, int arg17) {
        if (arg12 == 1) {
            int var19 = arg6;
            arg6 = arg11;
            arg11 = 128 - var19;
        } else if (arg12 == 2) {
            arg11 = 128 - arg11;
            arg6 = 128 - arg6;
        } else if (arg12 == 3) {
            int var18 = arg6;
            arg6 = 128 - arg11;
            arg11 = var18;
        }
        field5317++;
        float var20;
        float var21;
        float var22;
        int var23;
        if (~arg6 == arg15 && arg11 == 0) {
            var20 = arg3[arg2][arg8];
            var21 = arg0[arg2][arg8];
            var22 = arg1[arg2][arg8];
            var23 = arg14;
        } else if (arg6 == 128 && arg11 == 0) {
            var20 = arg3[arg2 + 1][arg8];
            var22 = arg1[arg2 + 1][arg8];
            var23 = arg17;
            var21 = arg0[arg2 + 1][arg8];
        } else if (arg6 == 128 && arg11 == 128) {
            var23 = arg10;
            var21 = arg0[arg2 + 1][arg8 + 1];
            var20 = arg3[arg2 + 1][arg8 + 1];
            var22 = arg1[arg2 + 1][arg8 + 1];
        } else if (arg6 == 0 && arg11 == 128) {
            var20 = arg3[arg2][arg8 + 1];
            var23 = arg16;
            var22 = arg1[arg2][arg8 + 1];
            var21 = arg0[arg2][arg8 + 1];
        } else {
            float var24 = arg1[arg2][arg8];
            float var25 = (float) arg11 / 128.0F;
            float var26 = arg3[arg2][arg8];
            float var27 = arg3[arg2][arg8 + 1];
            float var28 = (float) arg6 / 128.0F;
            float var29 = arg0[arg2][arg8 + 1];
            float var30 = (arg0[arg2 + 1][arg8 + 1] - var29) * var28 + var29;
            float var31 = arg0[arg2][arg8];
            float var32 = (arg0[arg2 + 1][arg8] - var31) * var28 + var31;
            var21 = (var30 - var32) * var25 + var32;
            float var33 = (arg1[arg2 + 1][arg8] - var24) * var28 + var24;
            float var34 = (arg3[arg2 + 1][arg8] - var26) * var28 + var26;
            float var35 = (arg3[arg2 + 1][arg8 + 1] - var27) * var28 + var27;
            float var36 = arg1[arg2][arg8 + 1];
            var20 = (var35 - var34) * var25 + var34;
            float var37 = (arg1[arg2 + 1][arg8 + 1] - var36) * var28 + var36;
            int var38 = class313.method2179(arg6, arg17, 3, arg14);
            int var39 = class313.method2179(arg6, arg10, 3, arg16);
            var23 = class313.method2179(arg11, var39, 3, var38);
            var22 = (var37 - var33) * var25 + var33;
        }
        int var40 = (arg2 << 7) + arg6;
        int var41 = (arg8 << 7) + arg11;
        int var42 = class218.method1595(arg13, arg8, arg6, 124, arg11, arg2);
        return arg9.method616(var40, var42, var41, var20, var21, var22, arg5 ? var23 & 0xFFFFFF00 : var23, arg4 == null ? 0.0F : (float) (var42 - class218.method1595(arg4, arg8, arg6, arg15 ^ 0xFFFFFF83, arg11, arg2)) / arg7);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 134)
    public static final String method2350(byte arg0, String arg1, String arg2, String arg3) {
        field5305++;
        int var4 = arg2.indexOf(arg1);
        int var5 = -128 / ((arg0 - 24) / 43);
        while (var4 != -1) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(var4 + arg1.length());
            var4 = arg2.indexOf(arg1, var4 + arg3.length());
        }
        return arg2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 153)
    public static void method2351(byte arg0) {
        field5316 = null;
        if (arg0 >= -40) {
            field5315 = (class160) null;
        }
        field5315 = null;
        field5314 = (byte[][]) null;
        field5312 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBIIIIZF)[[I", line = 168)
    public static final int[][] method2352(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, float arg8) {
        field5307++;
        int[][] var9 = new int[arg3][arg6];
        class77 var10 = new class77();
        var10.field1154 = (int) (arg8 * 4096.0F);
        var10.field1170 = arg0;
        var10.field1162 = arg7;
        var10.field1153 = arg5;
        if (arg2 < 117) {
            field5314 = (byte[][]) ((byte[][]) null);
        }
        var10.field1152 = arg4;
        var10.method55((byte) 0);
        class93.method670((byte) 127, arg3, arg6);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method568(var9[var11], var11, -9);
        }
        return var9;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lim;B)V", line = 208)
    public final void method2353(class192 arg0, byte arg1) {
        field5313++;
        while (true) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 == 0) {
                if (arg1 != -76) {
                    method2352(-111, 97, (byte) 90, 95, -82, 20, 33, false, 0.49297184F);
                }
                return;
            }
            this.method2348(arg0, arg1 + 76, var3);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 228)
    public static final void method2354(boolean arg0) {
        class297.field4658 = (byte[][][]) null;
        class221.field3518 = null;
        class100.field1520 = (byte[][][]) null;
        class334.field5195 = null;
        class42.field587 = (byte[][][]) null;
        class183.field2956 = null;
        class327.field5092 = null;
        if (!arg0) {
            return;
        }
        class196.field3220 = (int[][][]) null;
        field5309++;
        class231.field3702 = (byte[][][]) null;
        class227.field3603 = null;
        class90.field1370 = (byte[][][]) null;
        class154.field2350 = null;
    }
}
