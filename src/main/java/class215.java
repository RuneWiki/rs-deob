import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class215 extends class171 {

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public int field3244 = 0;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public int field3239 = -1;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "[I")
    public static int[] field3233 = new int[14];

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3250 = "";

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "[I")
    public static int[] field3231;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I")
    public static final int method1398(int arg0, int arg1, int arg2) {
        int var3 = arg2;
        while (arg1 > 0) {
            arg1--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        field3246++;
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
    public static final void method1399(int arg0) {
        while (true) {
            class217 var1 = (class217) class140.field1940.method997((byte) -128);
            if (var1 == null) {
                if (arg0 != 128) {
                    return;
                }
                field3236++;
                return;
            }
            class266 var3;
            if (var1.field3274 < 0) {
                int var2 = -var1.field3274 - 1;
                if (class35.field550 == var2) {
                    var3 = class217.field3280;
                } else {
                    var3 = class154.field2133[var2];
                }
            } else {
                int var4 = var1.field3274 - 1;
                var3 = class119.field1679[var4];
            }
            if (var3 != null) {
                class111 var5 = class76.method489(var1.field3268, 37);
                int var6;
                int var7;
                if (var1.field3271 == 1 || var1.field3271 == 3) {
                    var6 = var5.field1582;
                    var7 = var5.field1598;
                } else {
                    var6 = var5.field1598;
                    var7 = var5.field1582;
                }
                int var8 = (var7 + 1 >> 1) + var1.field3270;
                int var9 = var1.field3270 + (var7 >> 1);
                int var10 = (var6 + 1 >> 1) + var1.field3267;
                int var11 = (var6 >> 1) + var1.field3267;
                int[][] var12 = class200.field2788[class295.field4642];
                int var13 = var12[var9][var11] + var12[var8][var10] + var12[var8][var11] + var12[var9][var10] >> 2;
                int var14 = class102.field1425[var1.field3284];
                class268 var15 = null;
                if (var14 == 0) {
                    class197 var16 = class43.method288(class295.field4642, var1.field3270, var1.field3267);
                    if (var16 != null) {
                        var15 = var16.field2725;
                    }
                } else if (var14 == 1) {
                    class228 var17 = class77.method497(class295.field4642, var1.field3270, var1.field3267);
                    if (var17 != null) {
                        var15 = var17.field3459;
                    }
                } else if (var14 == 2) {
                    class198 var19 = class188.method1207(class295.field4642, var1.field3270, var1.field3267);
                    if (var19 != null) {
                        var15 = var19.field2752;
                    }
                } else if (var14 == 3) {
                    class23 var18 = class92.method604(class295.field4642, var1.field3270, var1.field3267);
                    if (var18 != null) {
                        var15 = var18.field328;
                    }
                }
                if (var15 != null) {
                    class86.method537(var1.field3270, -1, 0, var1.field3279 + 1, var14, 0, (byte) -120, class295.field4642, var1.field3267, var1.field3277 + 1);
                    var3.field3998 = var1.field3267 * 128 + var6 * 64;
                    var3.field4079 = var1.field3279 + class52.field740;
                    var3.field4058 = var13;
                    int var20 = var1.field3272;
                    var3.field4038 = class52.field740 + var1.field3277;
                    int var21 = var1.field3273;
                    int var22 = var1.field3281;
                    int var23 = var1.field3283;
                    if (var23 < var22) {
                        int var24 = var22;
                        var22 = var23;
                        var23 = var24;
                    }
                    var3.field3986 = var1.field3270 * 128 + var7 * 64;
                    if (var21 < var20) {
                        int var25 = var20;
                        var20 = var21;
                        var21 = var25;
                    }
                    var3.field4037 = var1.field3270 + var22;
                    var3.field4039 = var1.field3267 + var20;
                    var3.field4083 = var1.field3267 + var21;
                    var3.field3989 = var15;
                    var3.field4051 = var1.field3270 + var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
    public static void method1400(int arg0) {
        if (arg0 == -2) {
            field3250 = null;
            field3231 = null;
            field3233 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
    public static final void method1401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3234++;
        if (arg3 != -11687) {
            return;
        }
        if (arg1 - arg4 >= class93.field1294 && class296.field4668 >= (arg1 + arg4) && arg0 - arg4 >= class273.field4228 && arg0 + arg4 <= class127.field1782) {
            class188.method1205(arg4, arg2, arg0, (byte) 115, arg1);
        } else {
            class77.method499(arg1, arg2, arg4, arg0, -111);
        }
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V")
    public static final void method1402(int arg0) {
        field3240++;
        int var1 = -126 / ((arg0 - 50) / 54);
        if (class79.field1097 == 30) {
            class145.method977(118, 25);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([Ljb;ZI[BIZ)V")
    public static final void method1403(class276[] arg0, boolean arg1, int arg2, byte[] arg3, int arg4, boolean arg5) {
        if (arg5) {
            field3231 = null;
        }
        int var6 = -1;
        class224 var7 = new class224(arg3);
        field3247++;
        while (true) {
            int var8 = var7.method1469(31412);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method1461(true);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var7.method1453((byte) -128);
                int var15 = var14 >> 2;
                int var16 = arg4 + var13;
                int var17 = var14 & 0x3;
                int var18 = arg2 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class276 var19 = null;
                    if (!arg1) {
                        int var20 = var12;
                        if ((class230.field3489[1][var16][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class21.method160(!arg1, arg1, var19, (byte) 124, var18, var12, var15, var16, var12, var17, var6);
                }
            }
        }
    }
}
