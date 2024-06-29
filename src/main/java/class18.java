import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "J")
    public static long field162 = 0L;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lgw;")
    public static class148 field165 = new class148(new byte[5000]);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field170 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[[I")
    public static int[][] field168 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!l", name = "g", descriptor = "F")
    public static float field167;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lkda;")
    public static class328 field171;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 6)
    public static void method114(boolean arg0) {
        field170 = null;
        if (arg0) {
            field165 = null;
        }
        field168 = null;
        field165 = null;
        field171 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 19)
    public static final void method115(byte arg0) {
        field166++;
        if (arg0 != -90) {
            method114(false);
        }
        method117((byte) -85, 10);
        class378.method2256(-1);
        System.gc();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBII[FI)V", line = 34)
    public static final void method116(int arg0, int arg1, byte arg2, int arg3, int arg4, float[] arg5, int arg6) {
        if (arg2 != 14) {
            return;
        }
        field163++;
        if (arg3 > 0 && !class452.method2749(arg3, false)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class452.method2749(arg6, false)) {
            int var7 = class488.method2926(-6410, arg1);
            int var8 = 0;
            int var9 = arg3 < arg6 ? arg3 : arg6;
            int var10 = arg3 >> 1;
            int var11 = arg6 >> 1;
            float[] var12 = arg5;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var8, arg4, arg3, arg6, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg6 = var11;
                arg3 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V", line = 132)
    public static final void method117(byte arg0, int arg1) {
        field164++;
        if (class472.field6670 == arg1) {
            return;
        }
        if (class472.field6670 == 0) {
            class58.method390((byte) -64);
        }
        if (arg1 == 12) {
            if (class183.field2754 == null) {
                class246.method1560(class569.field8400, (byte) -16, class84.field1208, class537.field8006);
            } else {
                class644.method3724(-46, class84.field1208);
            }
        }
        if (arg1 != 12 && class494.field7033 != null) {
            class494.field7033.method1830(arg0 ^ 0x29);
            class494.field7033 = null;
        }
        if (arg1 == 2) {
            class378.method2257(class488.field6935 != class340.field4708, arg0 - 14051);
        }
        if (arg1 == 6) {
            class480.method2889(19298, class47.field564 != class340.field4708);
        }
        if (arg1 == 4) {
            if (class183.field2754 == null) {
                class459.method2777(class569.field8400, class537.field8006, true);
            } else {
                class132.method915((byte) 16);
            }
        } else if (arg1 == 5) {
            if (class183.field2754 == null) {
                class246.method1560(class569.field8400, (byte) -16, class84.field1208, class537.field8006);
            } else {
                class644.method3724(-66, class84.field1208);
            }
        } else if (arg1 == 8) {
            if (class183.field2754 == null) {
                class246.method1560(class569.field8400, (byte) -16, class84.field1208, class537.field8006);
            } else {
                class644.method3724(121, class84.field1208);
            }
        } else if (arg1 == 11) {
            if (class183.field2754 == null) {
                class459.method2777(class569.field8400, class537.field8006, true);
            } else {
                class132.method915((byte) 16);
            }
        }
        if (class343.method2099(class472.field6670, (byte) 27)) {
            class493.field7012.field4501 = 2;
            class11.field110.field4501 = 2;
            class392.field5396.field4501 = 2;
            class49.field572.field4501 = 2;
            class146.field2116.field4501 = 2;
            class195.field2890.field4501 = 2;
            class286.field3991.field4501 = 2;
        }
        if (class343.method2099(arg1, (byte) 27)) {
            class493.field7014 = 1;
            class66.field809 = 1;
            class156.field2319 = 0;
            class139.field1983 = 0;
            class120.field1695 = 0;
            class536.method3246(true, 9057);
            class493.field7012.field4501 = 1;
            class11.field110.field4501 = 1;
            class392.field5396.field4501 = 1;
            class49.field572.field4501 = 1;
            class146.field2116.field4501 = 1;
            class195.field2890.field4501 = 1;
            class286.field3991.field4501 = 1;
        }
        if (arg0 != -85) {
            return;
        }
        if (arg1 == 10 || arg1 == 2) {
            class352.method2133(false);
        }
        if (arg1 == 1) {
            class354.method2136(class585.field8595, (byte) -104, class99.field1445);
        } else {
            class40.method254((byte) 107);
        }
        boolean var2 = arg1 == 1 || class453.method2755(arg1, 24152) || class136.method942(arg1, arg0 ^ 0xFFFFFFAD);
        boolean var3 = class472.field6670 == 1 || class453.method2755(class472.field6670, arg0 + 24237) || class136.method942(class472.field6670, 6);
        if (var2 != var3) {
            if (var2) {
                class625.field9210 = class101.field1471;
                if (class56.field668.field6850 == 0) {
                    class240.method1529(2, (byte) 102);
                } else {
                    class574.method3420(1, 0, class333.field4619, false, 2, class56.field668.field6850, class101.field1471);
                }
                class177.field2706.method2467((byte) 127, false);
            } else {
                class240.method1529(2, (byte) 102);
                class177.field2706.method2467((byte) 127, true);
            }
        }
        if (class343.method2099(arg1, (byte) 27) || arg1 == 12) {
            class99.field1445.method433();
        }
        class472.field6670 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 292)
    public static final void method118(int arg0, int arg1) {
        field161++;
        if (class509.field7234 == arg1) {
            return;
        }
        class146.field2125 = class410.field5609 = class467.field6572[arg1];
        if (arg0 != -28206) {
            field162 = 36L;
        }
        class238.method1523(50);
        class539.field8026 = new int[class146.field2125][class410.field5609];
        class118.field1670 = new int[class146.field2125][class410.field5609];
        class123.field1726 = new int[4][class146.field2125 >> 3][class410.field5609 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class127.field1774[var2] = class545.method3317((byte) -29, class146.field2125, class410.field5609);
        }
        class383.field5270 = new byte[4][class146.field2125][class410.field5609];
        class246.method1559(4, class410.field5609, -26184, class146.field2125);
        class197.method1326(class99.field1445, class410.field5609 >> 3, 2, class146.field2125 >> 3);
        class509.field7234 = arg1;
    }
}
