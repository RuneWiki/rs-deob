import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class153 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field2504 = 100;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ltl;")
    public static class59 field2507 = class85.method639(" )2> <col=ff9040>", 9588);

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1095(boolean arg0) {
        class234.field3888.method1768(arg0, 161);
        class150.field2462++;
        field2508++;
        class234.field3888.method1206(0L, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 50)
    public static void method1096(byte arg0) {
        field2507 = null;
        if (arg0 != -79) {
            method1095(true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V", line = 66)
    public static final void method1097(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2506++;
        if (class55.field815) {
            class240.method1689(arg4, arg2, arg4 + arg0, arg1 + arg2);
            class240.method1688(arg4, arg2, arg0, arg1, 0);
        } else {
            class272.method1901(arg4, arg2, arg0 + arg4, arg1 + arg2);
            class272.method1892(arg4, arg2, arg0, arg1, 0);
        }
        if (class78.field1248 < 100) {
            return;
        }
        if (class228.field3679 == null || class228.field3679.field4342 != arg0 || class228.field3679.field4337 != arg1) {
            class47 var5 = new class47(arg0, arg1);
            class272.method1912(var5.field757, arg0, arg1);
            class292.method2020(0, 0, 0, class62.field966, 0, 0, class216.field3532, arg1, arg0);
            if (class55.field815) {
                class228.field3679 = new class122(var5);
            } else {
                class228.field3679 = var5;
            }
            if (class55.field815) {
                class272.field4709 = null;
            } else {
                class221.field3582.method1320(arg3 + 15961);
            }
        }
        class228.field3679.method341(arg4, arg2);
        int var6 = class116.field1901 * arg0 / class62.field966 + arg4;
        int var7 = class155.field2534 * arg1 / class216.field3532 + arg2;
        if (arg3 != 128) {
            method1095(true);
        }
        int var8 = class299.field5110 * arg0 / class62.field966;
        int var9 = class251.field4189 * arg1 / class216.field3532;
        if (class55.field815) {
            class240.method1687(var6, var7, var8, var9, 16711680, 128);
            class240.method1680(var6, var7, var8, var9, 16711680);
        } else {
            class272.method1905(var6, var7, var8, var9, 16711680, 128);
            class272.method1899(var6, var7, var8, var9, 16711680);
        }
        if (class306.field5194 <= 0 || class306.field5194 % 10 >= 5) {
            return;
        }
        for (class243 var10 = (class243) class36.field529.method536(2); var10 != null; var10 = (class243) class36.field529.method533(24)) {
            if (class285.field4894 == var10.field4069) {
                int var11 = var10.field4070 * arg0 / class62.field966 + arg4;
                int var12 = var10.field4071 * arg1 / class216.field3532 + arg2;
                if (class55.field815) {
                    class240.method1688(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class272.method1892(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIIII)V", line = 161)
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2505++;
        int var11 = arg1 - arg8;
        int var12 = arg10 - arg9;
        boolean var13;
        if (class306.field5194 > 0 && (class306.field5194 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg2;
        if (arg4 != -7) {
            method1098(-25, 4, 43, 19, -104, -119, -126, -46, 94, 4, 84);
        }
        int var15 = 983040 / arg7;
        for (int var16 = -var14; var16 < var11 + var14; var16++) {
            int var17 = arg6 + (arg2 * var16) >> 16;
            int var18 = (var16 + 1) * arg2 + arg6 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg5 + var18;
                int var21 = arg5 + var17;
                int var22 = arg8 + var16 >> 6;
                if (var22 >= 0 && var22 <= (class162.field2647.length - 1)) {
                    int[][] var23 = class162.field2647[var22];
                    for (int var24 = -var15; var24 < (var12 + var15); var24++) {
                        int var25 = arg7 * var24 + arg0 >> 16;
                        int var26 = (var24 + 1) * arg7 + arg0 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg3 + var26;
                            int var29 = arg9 + var24 >> 6;
                            int var30 = arg3 + var25;
                            if (var29 >= 0 && var23.length - 1 >= var29 && var23[var29] != null) {
                                int var31 = (arg9 + var24 & 0x3F << 6) + (arg8 + var16 & 0x3F);
                                int var32 = var23[var29][var31];
                                if (var32 != 0) {
                                    class180 var33 = class188.method1390(var32 - 1, false);
                                    if (var13 && class285.field4894 == var33.field2996) {
                                        class243 var34 = new class243();
                                        var34.field4070 = var21;
                                        var34.field4069 = var33.field2996;
                                        var34.field4071 = var30;
                                        class21.field277.method532(85, var34);
                                    }
                                    class170.field2754[var33.field2996].method337(var21 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class243 var35 = (class243) class21.field277.method536(2); var35 != null; var35 = (class243) class21.field277.method533(24)) {
            class170.field2754[var35.field4069].method337(var35.field4070 - 7, var35.field4071 + -7);
            class272.method1915(var35.field4070, var35.field4071, 15, 16776960, 128);
            class272.method1915(var35.field4070, var35.field4071, 7, 16777215, 256);
        }
        class21.field277.method530(-15068);
    }
}
