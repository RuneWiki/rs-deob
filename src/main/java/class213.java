import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class213 extends class287 {

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    private int field3368;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    private int field3369;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    private int field3354;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    private int field3361;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    private int field3362;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lug;")
    public static class253 field3352;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[I")
    public static int[] field3355;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 4)
    public static void method1548(int arg0) {
        field3352 = null;
        field3355 = null;
        if (arg0 != 28986) {
            field3355 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lnm;I)I", line = 23)
    public static final int method1549(class212 arg0, int arg1) {
        if (arg1 <= 17) {
            return 100;
        }
        field3359++;
        class161 var2 = arg0.field3346;
        if (var2.field2585 != null) {
            var2 = var2.method1192(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2575;
        class107 var4 = arg0.method2100(2000117776);
        if (arg0.field4724 == var4.field1451) {
            var3 = var2.field2579;
        } else if (arg0.field4724 == var4.field1420 || arg0.field4724 == var4.field1431 || arg0.field4724 == var4.field1446 || arg0.field4724 == var4.field1408) {
            var3 = var2.field2569;
        } else if (arg0.field4724 == var4.field1415 || arg0.field4724 == var4.field1427 || arg0.field4724 == var4.field1435 || arg0.field4724 == var4.field1409) {
            var3 = var2.field2572;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z", line = 60)
    public final boolean method1550(int arg0, int arg1, int arg2) {
        field3357++;
        if (arg2 < 87) {
            this.method1551(-82, false, 34);
        }
        return arg1 >= this.field3362 && arg1 <= this.field3354 && this.field3361 <= arg0 && this.field3369 >= arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZI)[I", line = 76)
    public final int[] method1551(int arg0, boolean arg1, int arg2) {
        field3356++;
        return arg1 ? new int[] { this.field3368, this.field3362 + arg2 - this.field3360, -this.field3365 - (-this.field3361 - arg0) } : (int[]) null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)[I", line = 87)
    public final int[] method1552(int arg0, int arg1, int arg2) {
        field3371++;
        if (arg0 <= 95) {
            field3352 = (class253) null;
        }
        return new int[] { this.field3366, arg2 + this.field3360 - this.field3362, -this.field3361 + this.field3365 + arg1 };
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 99)
    public static final void method1553(byte arg0) {
        class139.method1035();
        field3351++;
        for (int var1 = 0; var1 < 4; var1++) {
            class134.field1970[var1].method1481(true);
        }
        if (arg0 != 49) {
            field3355 = (int[]) null;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBI)Z", line = 118)
    public final boolean method1554(int arg0, int arg1, byte arg2, int arg3) {
        field3353++;
        int var5 = -88 / ((76 - arg2) / 38);
        return this.field3368 == arg3 && this.field3362 <= arg0 && arg0 <= this.field3354 && this.field3361 <= arg1 && arg1 <= this.field3369;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V", line = 134)
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3363++;
        if (class109.field1458) {
            class122.method885(arg0, arg1, arg0 + arg2, arg1 + arg4);
            class122.method897(arg0, arg1, arg2, arg4, 0);
        } else {
            class280.method1978(arg0, arg1, arg0 + arg2, arg1 + arg4);
            class280.method1971(arg0, arg1, arg2, arg4, 0);
        }
        if (class2.field22 < 100) {
            return;
        }
        if (class79.field1085 == null || class79.field1085.field2788 != arg2 || class79.field1085.field2791 != arg4) {
            class190 var5 = new class190(arg2, arg4);
            class280.method1983(var5.field3038, arg2, arg4);
            class61.method501(class251.field3959, class340.field5301, 0, arg4, arg2, 0, -100, 0, 0);
            if (class109.field1458) {
                class79.field1085 = new class239(var5);
            } else {
                class79.field1085 = var5;
            }
            if (class109.field1458) {
                class280.field4310 = null;
            } else {
                class42.field583.method512(6);
            }
        }
        class79.field1085.method1269(arg0, arg1);
        int var6 = class304.field4759 * arg2 / class251.field3959 + arg0;
        int var7 = class156.field2413 * arg4 / class340.field5301;
        int var8 = class6.field90 * arg2 / class251.field3959;
        int var9 = arg1 + (class328.field5136 * arg4 / class340.field5301);
        int var10 = 16711680;
        if (class27.field409 == 1) {
            var10 = 16777215;
        }
        if (class109.field1458) {
            class122.method893(var6, var9, var8, var7, var10, 128);
            class122.method888(var6, var9, var8, var7, var10);
        } else {
            class280.method1970(var6, var9, var8, var7, var10, 128);
            class280.method1979(var6, var9, var8, var7, var10);
        }
        if (arg3 >= class56.field779) {
            return;
        }
        int var11;
        if (class1.field4 > 10) {
            var11 = 500 - class1.field4 * 25;
        } else {
            var11 = class1.field4 * 25;
        }
        for (class144 var12 = (class144) class204.field3237.method22((byte) 126); var12 != null; var12 = (class144) class204.field3237.method26((byte) -123)) {
            if (class105.field1392 == var12.field2274) {
                int var13 = var12.field2280 * arg4 / class340.field5301 + arg1;
                int var14 = var12.field2281 * arg2 / class251.field3959 + arg0;
                if (class109.field1458) {
                    class122.method893(var14 - 2, var13 + -2, 4, 4, 16776960, var11);
                } else {
                    class280.method1970(var14 - 2, var13 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)Z", line = 235)
    public final boolean method1556(int arg0, int arg1, int arg2) {
        field3367++;
        if (arg1 == 8) {
            return arg0 >= this.field3360 && arg0 <= this.field3370 && arg2 >= this.field3365 && this.field3364 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)V", line = 253)
    public static final void method1557(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field3352 = (class253) null;
        }
        class248.field3909 = arg0;
        if (class248.field3909) {
            int var16 = class111.field1544.method38(60);
            class111.field1544.method1941(128);
            for (int var17 = 0; var17 < 4; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    for (int var19 = 0; var19 < 13; var19++) {
                        int var20 = class111.field1544.method1950((byte) 122, 1);
                        if (var20 == 1) {
                            class339.field5298[var17][var18][var19] = class111.field1544.method1950((byte) 116, 26);
                        } else {
                            class339.field5298[var17][var18][var19] = -1;
                        }
                    }
                }
            }
            class111.field1544.method1945((byte) -118);
            int var21 = (class61.field899 - class111.field1544.field111) / 16;
            class81.field1111 = new int[var21][4];
            for (int var22 = 0; var22 < var21; var22++) {
                for (int var23 = 0; var23 < 4; var23++) {
                    class81.field1111[var22][var23] = class111.field1544.method73((byte) 19);
                }
            }
            int var24 = class111.field1544.method89(108);
            int var25 = class111.field1544.method68(arg1 ^ 0xFFFFEF1B);
            boolean var26 = class179.method1323(class111.field1544.method42((byte) 15), 4);
            int var27 = class111.field1544.method39((byte) 55);
            int var28 = class111.field1544.method89(arg1 + 117);
            class277.field4288 = new int[var21];
            class117.field1620 = new int[var21];
            class232.field3616 = new int[var21];
            class293.field4540 = new byte[var21][];
            class251.field3946 = (byte[][]) null;
            class333.field5188 = new int[var21];
            class215.field3392 = null;
            class181.field2933 = new byte[var21][];
            class249.field3928 = new int[var21];
            class206.field3269 = new byte[var21][];
            class174.field2857 = new byte[var21][];
            int var29 = 0;
            for (int var30 = 0; var30 < 4; var30++) {
                for (int var31 = 0; var31 < 13; var31++) {
                    for (int var32 = 0; var32 < 13; var32++) {
                        int var33 = class339.field5298[var30][var31][var32];
                        if (var33 != -1) {
                            int var34 = var33 >> 14 & 0x3FF;
                            int var35 = (var33 & 0x3FF9) >> 3;
                            int var36 = (var34 / 8 << 8) + (var35 / 8);
                            for (int var37 = 0; var37 < var29; var37++) {
                                if (class232.field3616[var37] == var36) {
                                    var36 = -1;
                                    break;
                                }
                            }
                            if (var36 != -1) {
                                int var38 = var36 >> 8 & 0xFF;
                                int var39 = var36 & 0xFF;
                                class232.field3616[var29] = var36;
                                class277.field4288[var29] = class290.field4476.method1808(-1, "m" + var38 + "_" + var39);
                                class117.field1620[var29] = class290.field4476.method1808(class4.method16(arg1, -1), "l" + var38 + "_" + var39);
                                class249.field3928[var29] = class290.field4476.method1808(-1, "um" + var38 + "_" + var39);
                                class333.field5188[var29] = class290.field4476.method1808(-1, "ul" + var38 + "_" + var39);
                                var29++;
                            }
                        }
                    }
                }
            }
            class329.method2306(var24, var16, false, 119, var27, var26, var28, var25);
        } else {
            int var2 = class111.field1544.method58(-288140008);
            boolean var3 = class179.method1323(class111.field1544.method38(95), 4);
            int var4 = class111.field1544.method39((byte) 57);
            int var5 = class111.field1544.method72((byte) -66);
            int var6 = (class61.field899 - class111.field1544.field111) / 16;
            class81.field1111 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class81.field1111[var7][var8] = class111.field1544.method90((byte) -52);
                }
            }
            int var9 = class111.field1544.method39((byte) 108);
            int var10 = class111.field1544.method68(-4325);
            class181.field2933 = new byte[var6][];
            class333.field5188 = new int[var6];
            class293.field4540 = new byte[var6][];
            class249.field3928 = new int[var6];
            class174.field2857 = new byte[var6][];
            class251.field3946 = (byte[][]) null;
            class117.field1620 = new int[var6];
            class206.field3269 = new byte[var6][];
            boolean var11 = false;
            if ((var10 / 8 == 48 || (var10 / 8) == 49) && var5 / 8 == 48) {
                var11 = true;
            }
            if ((var10 / 8) == 48 && var5 / 8 == 148) {
                var11 = true;
            }
            class277.field4288 = new int[var6];
            class232.field3616 = new int[var6];
            int var12 = 0;
            class215.field3392 = null;
            for (int var13 = (var10 - 6) / 8; var13 <= (var10 + 6) / 8; var13++) {
                for (int var14 = (var5 - 6) / 8; var14 <= ((var5 + 6) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class232.field3616[var12] = var15;
                        class277.field4288[var12] = -1;
                        class117.field1620[var12] = -1;
                        class249.field3928[var12] = -1;
                        class333.field5188[var12] = -1;
                    } else {
                        class232.field3616[var12] = var15;
                        class277.field4288[var12] = class290.field4476.method1808(-1, "m" + var13 + "_" + var14);
                        class117.field1620[var12] = class290.field4476.method1808(-1, "l" + var13 + "_" + var14);
                        class249.field3928[var12] = class290.field4476.method1808(-1, "um" + var13 + "_" + var14);
                        class333.field5188[var12] = class290.field4476.method1808(arg1 - 1, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class329.method2306(var4, var2, false, 107, var9, var3, var10, var5);
        }
        field3358++;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 504)
    public class213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3368 = arg0;
        this.field3366 = arg1;
        this.field3369 = arg5;
        this.field3354 = arg4;
        this.field3361 = arg3;
        this.field3360 = arg6;
        this.field3365 = arg7;
        this.field3370 = arg8;
        this.field3362 = arg2;
        this.field3364 = arg9;
    }
}
