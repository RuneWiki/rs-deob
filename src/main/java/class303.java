import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class303 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4722 = 0;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4724 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ldb;")
    public static class109 field4718 = new class109();

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "F")
    public static float field4723;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lrn;")
    public static class18 field4725;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lrn;")
    public static class18 field4727;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 6)
    public static final void method2184(int arg0, String arg1, boolean arg2) {
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        field4726++;
        int var5 = 0;
        for (int var6 = 0; var6 < class310.field4791; var6++) {
            class263 var7 = class48.method469(arg0 ^ 0xFFFFFFF5, var6);
            if ((!arg2 || var7.field4026) && var7.field4062 == -1 && var7.field4094 == -1 && var7.field4083 == 0 && var7.field4058.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class123.field1970 = null;
                    class29.field468 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class81.field1177 = 0;
        class123.field1970 = var3;
        class29.field468 = var5;
        String[] var10 = new String[class29.field468];
        if (arg0 != -1) {
            field4723 = 0.041954577F;
        }
        for (int var11 = 0; var11 < class29.field468; var11++) {
            var10[var11] = class48.method469(10, var3[var11]).field4058;
        }
        class233.method1748(var10, (byte) 111, class123.field1970);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 79)
    public static final void method2185(int arg0) {
        field4720++;
        if (class155.field2501 == -1 || class345.field5481 == -1) {
            return;
        }
        float[] var1 = new float[3];
        if (arg0 < 8) {
            return;
        }
        int var2 = ((class205.field3164 - class162.field2582) * class209.field3215 >> 16) + class162.field2582;
        int var3 = class362.field5725 * 2;
        class209.field3215 += var2;
        if (class209.field3215 < 65535) {
            class349.field5545 = false;
            class238.field3691 = false;
        } else {
            class209.field3215 = 65535;
            if (class238.field3691) {
                class349.field5545 = false;
            } else {
                class349.field5545 = true;
            }
            class238.field3691 = true;
        }
        float var4 = (float) class209.field3215 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class78.field1137[class155.field2501][var3][var5] * 3;
            int var7 = class78.field1137[class155.field2501][var3 + 1][var5] * 3;
            int var8 = (class78.field1137[class155.field2501][var3 + 2][var5] + class78.field1137[class155.field2501][var3 + 2][var5] - class78.field1137[class155.field2501][var3 + 3][var5]) * 3;
            int var9 = class78.field1137[class155.field2501][var3][var5];
            int var10 = var6 + var8 - (var7 * 2);
            int var11 = var7 - var6;
            int var12 = var7 + class78.field1137[class155.field2501][var3 + 2][var5] - var8 - var9;
            var1[var5] = (((float) var12 * var4 + (float) var10) * var4 + (float) var11) * var4 + (float) var9;
        }
        class151.field2465 = (int) var1[0] - (class358.field5696 * 128);
        class10.field143 = (int) var1[2] - (class49.field755 * 128);
        class64.field975 = (int) var1[1] * -1;
        float[] var13 = new float[3];
        int var14 = class264.field4111 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class78.field1137[class345.field5481][var14][var15] * 3;
            int var17 = class78.field1137[class345.field5481][var14 + 1][var15] * 3;
            int var18 = (class78.field1137[class345.field5481][var14 + 2][var15] + class78.field1137[class345.field5481][var14 + 2][var15] - class78.field1137[class345.field5481][var14 + 3][var15]) * 3;
            int var19 = class78.field1137[class345.field5481][var14][var15];
            int var20 = var17 - var16;
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class78.field1137[class345.field5481][var14 + 2][var15] + var17 - var19 - var18;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var19;
        }
        float var23 = var13[0] - var1[0];
        float var24 = (var13[1] - var1[1]) * -1.0F;
        float var25 = var13[2] - var1[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class176.field2780 = (float) Math.atan2((double) var24, var26);
        class318.field4902 = -((float) Math.atan2((double) var23, (double) var25));
        class15.field248 = (int) ((double) class318.field4902 * 325.949D) & 0x7FF;
        class191.field3005 = (int) ((double) class176.field2780 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 185)
    public static void method2186(byte arg0) {
        field4725 = null;
        field4727 = null;
        field4718 = null;
        if (arg0 > -43) {
            field4725 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 197)
    public static final void method2187(int arg0) {
        if (class192.field3028 != -1) {
            class85.method771(false, -1, class192.field3028, -1, (byte) -119);
            class192.field3028 = -1;
        }
        field4721++;
        if (arg0 != -11826) {
            field4725 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V", line = 230)
    public static final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4719++;
        if (arg4 != 3 || arg3 < 0 || arg6 < 0 || arg3 >= 103 || arg6 >= 103) {
            return;
        }
        if (arg7 == 0) {
            class202 var8 = class327.method2320(arg5, arg3, arg6);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field3111 >>> 32);
                if (arg2 == 2) {
                    var8.field3121 = new class288(var9, 2, arg1 + 4, arg5, arg3, arg6, arg0, false, var8.field3121);
                    var8.field3116 = new class288(var9, 2, arg1 + 1 & 0x3, arg5, arg3, arg6, arg0, false, var8.field3116);
                } else {
                    var8.field3121 = new class288(var9, arg2, arg1, arg5, arg3, arg6, arg0, false, var8.field3121);
                }
            }
        }
        if (arg7 == 1) {
            class280 var10 = class294.method2123(arg5, arg3, arg6);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field4325 >>> 32);
                if (arg2 == 4 || arg2 == 5) {
                    var10.field4319 = new class288(var11, 4, arg1, arg5, arg3, arg6, arg0, false, var10.field4319);
                } else if (arg2 == 6) {
                    var10.field4319 = new class288(var11, 4, arg1 + 4, arg5, arg3, arg6, arg0, false, var10.field4319);
                } else if (arg2 == 7) {
                    var10.field4319 = new class288(var11, 4, (arg1 + 2 & 0x3) + 4, arg5, arg3, arg6, arg0, false, var10.field4319);
                } else if (arg2 == 8) {
                    var10.field4319 = new class288(var11, 4, arg1 + 4, arg5, arg3, arg6, arg0, false, var10.field4319);
                    var10.field4317 = new class288(var11, 4, (arg1 + 2 & 0x3) + 4, arg5, arg3, arg6, arg0, false, var10.field4317);
                }
            }
        }
        if (arg7 == 2) {
            if (arg2 == 11) {
                arg2 = 10;
            }
            class297 var12 = class203.method1520(arg5, arg3, arg6);
            if (var12 != null) {
                var12.field4605 = new class288(Integer.MAX_VALUE & (int) (var12.field4611 >>> 32), arg2, arg1, arg5, arg3, arg6, arg0, false, var12.field4605);
            }
        }
        if (arg7 == 3) {
            class44 var13 = class315.method2226(arg5, arg3, arg6);
            if (var13 != null) {
                var13.field714 = new class288(Integer.MAX_VALUE & (int) (var13.field701 >>> 32), 22, arg1, arg5, arg3, arg6, arg0, false, var13.field714);
            }
        }
    }
}
