import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class17 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Z")
    public boolean field241 = false;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field240 = 0;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field252 = 0;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
    public static boolean field242 = false;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Lna;")
    public static class26 field248 = class69.method505("::wm2", (byte) -118);

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Lna;")
    public static class26 field247 = class69.method505("Hidden)2", (byte) -119);

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Lna;")
    public static class26 field250 = class69.method505("gleiten:", (byte) -117);

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Lvi;")
    public class6 field244;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field245;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 6)
    public static void method115(int arg0) {
        field250 = null;
        field248 = null;
        field247 = null;
        if (arg0 != -17148) {
            field243 = 54;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IFII[[I[[II[[FIBIZLhg;[[FII[[FI)I", line = 27)
    public static final int method116(int arg0, float arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, float[][] arg7, int arg8, byte arg9, int arg10, boolean arg11, class172 arg12, float[][] arg13, int arg14, int arg15, float[][] arg16, int arg17) {
        field249++;
        if (arg10 == 1) {
            int var19 = arg15;
            arg15 = arg17;
            arg17 = 128 - var19;
        } else if (arg10 == 2) {
            arg17 = 128 - arg17;
            arg15 = 128 - arg15;
        } else if (arg10 == 3) {
            int var18 = arg15;
            arg15 = 128 - arg17;
            arg17 = var18;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg15 == 0 && arg17 == 0) {
            var20 = arg16[arg6][arg14];
            var21 = arg7[arg6][arg14];
            var22 = arg13[arg6][arg14];
            var23 = arg2;
        } else if (arg15 == 128 && arg17 == 0) {
            var23 = arg3;
            var20 = arg16[arg6 + 1][arg14];
            var21 = arg7[arg6 + 1][arg14];
            var22 = arg13[arg6 + 1][arg14];
        } else if (arg15 == 128 && arg17 == 128) {
            var21 = arg7[arg6 + 1][arg14 + 1];
            var22 = arg13[arg6 + 1][arg14 + 1];
            var20 = arg16[arg6 + 1][arg14 + 1];
            var23 = arg8;
        } else if (arg15 == 0 && arg17 == 128) {
            var21 = arg7[arg6][arg14 + 1];
            var20 = arg16[arg6][arg14 + 1];
            var22 = arg13[arg6][arg14 + 1];
            var23 = arg0;
        } else {
            float var24 = arg13[arg6][arg14];
            float var25 = arg16[arg6][arg14];
            float var26 = (float) arg17 / 128.0F;
            float var27 = (float) arg15 / 128.0F;
            float var28 = (arg13[arg6 + 1][arg14] - var24) * var27 + var24;
            float var29 = (arg16[arg6 + 1][arg14] - var25) * var27 + var25;
            float var30 = arg13[arg6][arg14 + 1];
            float var31 = arg16[arg6][arg14 + 1];
            float var32 = (arg16[arg6 + 1][arg14 + 1] - var31) * var27 + var31;
            float var33 = arg7[arg6][arg14];
            var20 = (var32 - var29) * var26 + var29;
            float var34 = arg7[arg6][arg14 + 1];
            float var35 = (arg13[arg6 + 1][arg14 + 1] - var30) * var27 + var30;
            var22 = (var35 - var28) * var26 + var28;
            float var36 = (arg7[arg6 + 1][arg14 + 1] - var34) * var27 + var34;
            float var37 = (arg7[arg6 + 1][arg14] - var33) * var27 + var33;
            var21 = (var36 - var37) * var26 + var37;
            int var38 = class198.method1329(18348, arg15, arg2, arg3);
            int var39 = class198.method1329(18348, arg15, arg0, arg8);
            var23 = class198.method1329(18348, arg17, var38, var39);
        }
        if (arg9 > -111) {
            return -54;
        } else {
            int var40 = (arg14 << 7) + arg17;
            int var41 = class323.method2246(arg15, (byte) -51, arg14, arg5, arg6, arg17);
            int var42 = (arg6 << 7) + arg15;
            return arg12.method1180(var42, var41, var40, var22, var20, var21, arg11 ? var23 & 0xFFFFFF00 : var23, arg4 == null ? 0.0F : (float) (var41 - class323.method2246(arg15, (byte) 103, arg14, arg4, arg6, arg17)) / arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I", line = 152)
    public static final int method117(int arg0) {
        field246++;
        try {
            if (class215.field3348 == 0) {
                if ((class128.method869((byte) -55) - 5000L) < class126.field1951) {
                    return 0;
                }
                class224.field3544 = class45.field712.method1056((byte) 8, class122.field1910, class269.field4443);
                class297.field5067 = class128.method869((byte) -55);
                class215.field3348 = 1;
            }
            if (class297.field5067 + 30000L < class128.method869((byte) -55)) {
                return class320.method2223((byte) 92, 1000);
            }
            if (class215.field3348 == 1) {
                if (class224.field3544.field2811 == 2) {
                    return class320.method2223((byte) 92, 1001);
                }
                if (class224.field3544.field2811 != 1) {
                    return -1;
                }
                class88.field1449 = new class285((Socket) class224.field3544.field2812, class45.field712);
                class114.field1789.field1301 = 0;
                class224.field3544 = null;
                int var1 = 0;
                if (class41.field690) {
                    var1 = class8.field101;
                }
                class114.field1789.method591((byte) -67, 255);
                class114.field1789.method577(arg0 - 30105, var1);
                class88.field1449.method2014(false, 0, class114.field1789.field1280, class114.field1789.field1301);
                if (class166.field2580 != null) {
                    class166.field2580.method393(67);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(101);
                }
                int var2 = class88.field1449.method2012(arg0 ^ 0x7520);
                if (class166.field2580 != null) {
                    class166.field2580.method393(55);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(arg0 ^ 0x757B);
                }
                if (var2 != 0) {
                    return class320.method2223((byte) 92, var2);
                }
                class215.field3348 = 2;
            }
            if (class215.field3348 == 2) {
                if (class88.field1449.method2015(-18358) < 2) {
                    return -1;
                }
                class28.field486 = class88.field1449.method2012(0);
                class28.field486 <<= 0x8;
                class28.field486 += class88.field1449.method2012(0);
                class215.field3348 = 3;
                class210.field3263 = 0;
                class315.field5397 = new byte[class28.field486];
            }
            if (class215.field3348 == 3) {
                int var3 = class88.field1449.method2015(arg0 - 48342);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > class28.field486 - class210.field3263) {
                    var3 = class28.field486 - class210.field3263;
                }
                class88.field1449.method2011(class210.field3263, var3, -18455, class315.field5397);
                class210.field3263 += var3;
                if (class210.field3263 >= class28.field486) {
                    if (class115.method800(4, class315.field5397)) {
                        class20.field282 = new class166[class117.field1844];
                        int var4 = 0;
                        for (int var5 = class84.field1365; var5 <= class24.field353; var5++) {
                            class166 var6 = class294.method2069(91, var5);
                            if (var6 != null) {
                                class20.field282[var4++] = var6;
                            }
                        }
                        class88.field1449.method2018(14821);
                        class88.field1449 = null;
                        class233.field3701 = 0;
                        class215.field3348 = 0;
                        class315.field5397 = null;
                        class126.field1951 = class128.method869((byte) -55);
                        return 0;
                    }
                    return class320.method2223((byte) 92, 1002);
                }
                return -1;
            }
        } catch (IOException var8) {
            return class320.method2223((byte) 92, 1003);
        }
        if (arg0 != 29984) {
            method116(13, 0.10791027F, 20, 124, (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), -85, (float[][]) ((float[][]) null), -119, (byte) -105, -5, false, (class172) null, (float[][]) ((float[][]) null), 5, -100, (float[][]) ((float[][]) null), -36);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I", line = 292)
    public static final int method118(int arg0, int arg1, int arg2, int arg3) {
        field251++;
        if (class229.field3635 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg3 & 0x7F;
        int var8 = arg0;
        if (arg0 < 3 && (class92.field1492[1][var4][var5] & 0x2) == 2) {
            var8 = arg0 + 1;
        }
        int var9 = (128 - var6) * class229.field3635[var8][var4][var5 + 1] + class229.field3635[var8][arg1 + var4][var5 + 1] * var6 >> 7;
        int var10 = (128 - var6) * class229.field3635[var8][var4][var5] + class229.field3635[var8][var4 + 1][var5] * var6 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }
}
