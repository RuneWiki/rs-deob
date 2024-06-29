import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class219 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Z")
    public static boolean field3542 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class336.field5249 = arg4;
        class191.field3131 = arg3;
        class98.field1410 = arg1;
        field3537++;
        class279.field4497 = arg0;
        if (arg2 >= -75) {
            field3542 = true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 28)
    public static final void method1557(int arg0, int arg1) {
        class185.field3070--;
        field3541++;
        if (class185.field3070 == arg1) {
            return;
        }
        class9.method48(class168.field2777, arg1 + 1, class168.field2777, arg1, class185.field3070 - arg1);
        class9.method48(class157.field2458, arg1 + 1, class157.field2458, arg1, class185.field3070 - arg1);
        class9.method53(class212.field3474, arg1 + 1, class212.field3474, arg1, class185.field3070 - arg1);
        class9.method51(class113.field1727, arg1 + 1, class113.field1727, arg1, class185.field3070 - arg1);
        class9.method47(class190.field3108, arg1 - arg0, class190.field3108, arg1, class185.field3070 - arg1);
        class9.method53(class193.field3155, arg1 + 1, class193.field3155, arg1, class185.field3070 - arg1);
        class9.method53(class343.field5338, arg1 + 1, class343.field5338, arg1, class185.field3070 - arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BII[Lac;IIIIZBI)V", line = 46)
    public static final void method1558(byte[] arg0, int arg1, int arg2, class108[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9, int arg10) {
        if (arg9 >= -93) {
            return;
        }
        field3536++;
        int var11 = -1;
        class44 var12 = new class44(arg0);
        while (true) {
            int var13 = var12.method260(8);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method281(-110);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var12.method286((byte) -71);
                int var19 = (var14 & 0xFD8) >> 6;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg2 == var17 && arg4 <= var19 && var19 < (arg4 + 8) && arg1 <= var16 && var16 < (arg1 + 8)) {
                    class97 var22 = class69.method454(false, var11);
                    int var23 = arg5 + class173.method1306(arg6, var22.field1337, var19 & 0x7, var16 & 0x7, var21, var22.field1343, true);
                    int var24 = arg7 + class177.method1330(var22.field1343, var22.field1337, -1455863777, var21, var19 & 0x7, arg6, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class108 var25 = null;
                        if (!arg8) {
                            int var26 = arg10;
                            if ((class129.field2025[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class277.method2009(var11, !arg8, var24, var20, var23, arg10, var25, arg8, (byte) -78, arg10, arg6 + var21 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIZIIIIII)V", line = 134)
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg11 - arg10;
        field3539++;
        int var13 = -1;
        int var14 = arg9 - arg4;
        int var15 = 983040 / arg2;
        if (class69.field969 > 0) {
            if (class165.field2743 <= 10) {
                var13 = class165.field2743 * 5;
            } else {
                var13 = (10 + 10 - class165.field2743) * 5;
            }
        }
        int var16 = 983040 / arg7;
        int var17 = -var15;
        if (arg8 != 0) {
            method1556(-125, 16, -76, 92, -126);
        }
        while (var17 < var12 + var15) {
            int var18 = arg1 + (arg2 * var17) >> 16;
            int var19 = arg1 + ((var17 + 1) * arg2) >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg0 + var18;
                int var22 = arg10 + var17 >> 6;
                int var10000 = arg0 + var19;
                if (var22 >= 0 && (class296.field4683.length - 1) >= var22) {
                    int[][] var24 = class296.field4683[var22];
                    for (int var25 = -var16; var25 < (var14 + var16); var25++) {
                        int var26 = arg7 * var25 + arg6 >> 16;
                        int var27 = (var25 + 1) * arg7 + arg6 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = var25 + arg4 >> 6;
                            var10000 = arg3 + var27;
                            int var31 = arg3 + var26;
                            if (var29 >= 0 && var24.length - 1 >= var29 && var24[var29] != null) {
                                int var32 = (arg4 + var25 & 0x3F << 6) + (arg10 + var17 & 0x3F);
                                int var33 = var24[var29][var32];
                                if (var33 != 0) {
                                    class97 var34 = class69.method454(false, var33 - 1);
                                    if (!class258.field4142[var34.field1319]) {
                                        if (var13 != -1 && class304.field4758 == var34.field1319) {
                                            class280 var35 = new class280();
                                            var35.field4517 = var34.field1319;
                                            var35.field4521 = var21;
                                            var35.field4513 = var31;
                                            class57.field810.method1232(99, var35);
                                        } else {
                                            class253.field4041[var34.field1319].method375(var21 - 7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var17++;
        }
        for (class280 var36 = (class280) class57.field810.method1240(3); var36 != null; var36 = (class280) class57.field810.method1235(false)) {
            class59.method392(var36.field4521, var36.field4513, 15, 16776960, var13);
            class59.method392(var36.field4521, var36.field4513, 13, 16776960, var13);
            class59.method392(var36.field4521, var36.field4513, 11, 16776960, var13);
            class59.method392(var36.field4521, var36.field4513, 9, 16776960, var13);
            class253.field4041[var36.field4517].method375(var36.field4521 - 7, var36.field4513 + -7);
        }
        class57.field810.method1233(30602);
    }
}
