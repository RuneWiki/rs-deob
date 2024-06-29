import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class197 extends class98 {

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "Ltl;")
    private static class59 field3250 = class85.method639("", 9588);

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "Ltl;")
    public static class59 field3247 = class85.method639("<col=ffff00>", 9588);

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "[I")
    public static int[] field3255 = new int[100];

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Ltl;")
    public static class59 field3259 = class85.method639("Verbindung mit Update)2Server)3)3)3", 9588);

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Ltl;")
    public static class59 field3257 = field3250;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "Ltg;")
    public class154 field3248;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "[B")
    public byte[] field3253;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V", line = 7)
    public static void method1422(int arg0) {
        field3257 = null;
        field3250 = null;
        int var1 = 19 % ((arg0 - 78) / 36);
        field3247 = null;
        field3259 = null;
        field3255 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)V", line = 22)
    public static final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3258++;
        for (int var6 = arg2; var6 <= (arg2 + arg5); var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg0; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class249.field4145[arg3][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg2; var8 < arg2 + arg5; var8++) {
            for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class97.field1558[arg3][var9][var8] = arg3 > 0 ? class97.field1558[arg3 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg4 != -22896) {
            method1425((class133) null, 48, 39, -25, 117, 66, -11, 57, false);
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var10 = arg2 + 1; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class97.field1558[arg3][arg1][var10] = class97.field1558[arg3][arg1 - 1][var10];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var11 = arg1 + 1; var11 < (arg0 + arg1); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class97.field1558[arg3][var11][arg2] = class97.field1558[arg3][var11][arg2 - 1];
                }
            }
        }
        if (arg1 < 0 || arg2 < 0 || arg1 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 > 0 && class97.field1558[arg3][arg1 - 1][arg2] != 0) {
                class97.field1558[arg3][arg1][arg2] = class97.field1558[arg3][arg1 - 1][arg2];
            } else if (arg2 > 0 && class97.field1558[arg3][arg1][arg2 - 1] != 0) {
                class97.field1558[arg3][arg1][arg2] = class97.field1558[arg3][arg1][arg2 - 1];
            } else if (arg1 > 0 && arg2 > 0 && class97.field1558[arg3][arg1 - 1][arg2 - 1] != 0) {
                class97.field1558[arg3][arg1][arg2] = class97.field1558[arg3][arg1 - 1][arg2 - 1];
            }
        } else if (arg1 > 0 && class97.field1558[arg3 - 1][arg1 - 1][arg2] != class97.field1558[arg3][arg1 - 1][arg2]) {
            class97.field1558[arg3][arg1][arg2] = class97.field1558[arg3][arg1 - 1][arg2];
        } else if (arg2 > 0 && class97.field1558[arg3 - 1][arg1][arg2 - 1] != class97.field1558[arg3][arg1][arg2 - 1]) {
            class97.field1558[arg3][arg1][arg2] = class97.field1558[arg3][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class97.field1558[arg3][arg1 - 1][arg2 - 1] != class97.field1558[arg3 - 1][arg1 - 1][arg2 - 1]) {
            class97.field1558[arg3][arg1][arg2] = class97.field1558[arg3][arg1 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[Lkj;)V", line = 147)
    public static final void method1424(int arg0, class32[] arg1) {
        class45.field725[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)[B", line = 155)
    public final byte[] method53(int arg0) {
        field3251++;
        if (this.field1577) {
            throw new RuntimeException();
        }
        int var2 = -124 % ((73 - arg0) / 32);
        return this.field3253;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lih;IIIIIIIZ)V", line = 173)
    public static final void method1425(class133 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class235.field3901;
        int var11;
        int var12 = var11 = (arg7 << 7) - class70.field1073;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class97.field1558[arg1][arg6][arg7] - class189.field3158;
        int var18 = class97.field1558[arg1][arg6 + 1][arg7] - class189.field3158;
        int var19 = class97.field1558[arg1][arg6 + 1][arg7 + 1] - class189.field3158;
        int var20 = class97.field1558[arg1][arg6][arg7 + 1] - class189.field3158;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class298.field5098;
        int var46 = (var24 << 9) / var25 + class298.field5096;
        int var47 = (var27 << 9) / var31 + class298.field5098;
        int var48 = (var30 << 9) / var31 + class298.field5096;
        int var49 = (var33 << 9) / var37 + class298.field5098;
        int var50 = (var36 << 9) / var37 + class298.field5096;
        int var51 = (var39 << 9) / var43 + class298.field5098;
        int var52 = (var42 << 9) / var43 + class298.field5096;
        class298.field5091 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class274.field4719 && class255.method1776(class298.field5098 + class155.field2532, class298.field5096 + class27.field359, var50, var52, var48, var49, var51, var47)) {
                class262.field4374 = arg6;
                class266.field4592 = arg7;
            }
            if (!class55.field815 && !arg8) {
                class298.field5105 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class298.field5092 || var51 > class298.field5092 || var47 > class298.field5092) {
                    class298.field5105 = true;
                }
                if (arg0.field2199 == -1) {
                    if (arg0.field2214 != 12345678) {
                        class298.method2086(var50, var52, var48, var49, var51, var47, arg0.field2214, arg0.field2207, arg0.field2216);
                    }
                } else if (!class67.field1036) {
                    int var53 = class298.field5107.method374(arg0.field2199, -2);
                    class298.method2086(var50, var52, var48, var49, var51, var47, class102.method777(var53, arg0.field2214), class102.method777(var53, arg0.field2207), class102.method777(var53, arg0.field2216));
                } else if (arg0.field2208) {
                    class298.method2080(var50, var52, var48, var49, var51, var47, arg0.field2214, arg0.field2207, arg0.field2216, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2199);
                } else {
                    class298.method2080(var50, var52, var48, var49, var51, var47, arg0.field2214, arg0.field2207, arg0.field2216, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2199);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class274.field4719 && class255.method1776(class298.field5098 + class155.field2532, class298.field5096 + class27.field359, var46, var48, var52, var45, var47, var51)) {
            class262.field4374 = arg6;
            class266.field4592 = arg7;
        }
        if (class55.field815 || arg8) {
            return;
        }
        class298.field5105 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class298.field5092 || var47 > class298.field5092 || var51 > class298.field5092) {
            class298.field5105 = true;
        }
        if (arg0.field2199 == -1) {
            if (arg0.field2201 != 12345678) {
                class298.method2086(var46, var48, var52, var45, var47, var51, arg0.field2201, arg0.field2216, arg0.field2207);
            }
        } else if (class67.field1036) {
            class298.method2080(var46, var48, var52, var45, var47, var51, arg0.field2201, arg0.field2216, arg0.field2207, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2199);
        } else {
            int var54 = class298.field5107.method374(arg0.field2199, -2);
            class298.method2086(var46, var48, var52, var45, var47, var51, class102.method777(var54, arg0.field2201), class102.method777(var54, arg0.field2216), class102.method777(var54, arg0.field2207));
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V", line = 339)
    public static final void method1426(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3256++;
        if (class78.field1248 < 100) {
            class210.method1476(10);
        }
        if (class55.field815) {
            class240.method1689(arg0, arg3, arg0 + arg4, arg2 + arg3);
        } else {
            class272.method1901(arg0, arg3, arg0 + arg4, arg2 + arg3);
        }
        if (class78.field1248 < 100) {
            byte var14 = 20;
            int var15 = arg4 / 2 + arg0;
            int var16 = arg2 / 2 + arg3 - (18 - -var14);
            if (class55.field815) {
                class240.method1688(arg0, arg3, arg4, arg2, 0);
                class240.method1680(var15 - 152, var16, 304, 34, 9179409);
                class240.method1680(var15 - 151, var16 + 1, 302, 32, 0);
                class240.method1688(var15 - 150, var16 - -2, class78.field1248 * 3, 30, 9179409);
                class240.method1688(class78.field1248 * 3 + var15 - 150, var16 + 2, 300 - (class78.field1248 * 3), 30, 0);
            } else {
                class272.method1892(arg0, arg3, arg4, arg2, 0);
                class272.method1899(var15 - 152, var16, 304, 34, 9179409);
                class272.method1899(var15 - 151, var16 + 1, 302, 32, 0);
                class272.method1892(var15 - 150, var16 + 2, class78.field1248 * 3, 30, 9179409);
                class272.method1892(class78.field1248 * 3 + var15 - 150, var16 + 2, 300 - (class78.field1248 * 3), 30, 0);
            }
            class251.field4187.method697(class11.field140, var15, var14 + var16, 16777215, -1);
            return;
        }
        class251.field4189 = (int) ((float) (arg2 * 2) / class293.field4998);
        class299.field5110 = (int) ((float) (arg4 * 2) / class293.field4998);
        int var5 = class120.field2005 - (int) ((float) arg4 / class293.field4998);
        int var6 = class100.field1624 - ((int) ((float) arg2 / class293.field4998));
        if (arg1 != -12309) {
            field3257 = (class59) null;
        }
        class155.field2534 = class100.field1624 - ((int) ((float) arg2 / class293.field4998));
        int var7 = (int) ((float) arg2 / class293.field4998) + class100.field1624;
        int var8 = (int) ((float) arg4 / class293.field4998) + class120.field2005;
        class116.field1901 = class120.field2005 - ((int) ((float) arg4 / class293.field4998));
        if (class55.field815) {
            if (class40.field606 == null || class40.field606.field4342 != arg4 || class40.field606.field4337 != arg2) {
                class40.field606 = null;
                class40.field606 = new class52(arg4, arg2);
            }
            class272.method1912(class40.field606.field757, arg4, arg2);
            class292.method2020(var5, 0, var6, var8, 0, 0, var7, arg2, arg4);
            class125.method924(arg2, 0, var6, 2076831952, arg4, 0, var5, var7, var8);
            class130.method955(var7, var8, 0, arg4, arg2, var6, 0, 124, var5);
            class40.field606.method341(arg0, arg3);
        } else {
            class292.method2020(var5, arg0, var6, var8, arg3, 0, var7, arg2 + arg3, arg0 - -arg4);
            class125.method924(arg2 + arg3, arg3, var6, 2076831952, arg0 + arg4, arg0, var5, var7, var8);
            class130.method955(var7, var8, arg3, arg0 + arg4, arg2 + arg3, var6, arg0, arg1 + 12436, var5);
        }
        if (class306.field5194 > 0) {
            class306.field5194--;
        }
        if (!class222.field3592) {
            return;
        }
        int var9 = arg0 + arg4 - 5;
        int var10 = arg3 + arg2 - 8;
        class69.field1062.method698(class233.method1630(new class59[] { class73.field1169, class81.method619((byte) -117, class247.field4111) }, -2883), var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        int var13 = 16776960;
        if (var12 > 65536) {
            var13 = 16711680;
        }
        class69.field1062.method698(class233.method1630(new class59[] { class156.field2544, class81.method619((byte) -120, var12), class14.field200 }, arg1 + 9426), var9, var17, var13, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I", line = 447)
    public final int method56(byte arg0) {
        field3261++;
        if (this.field1577) {
            return 0;
        } else {
            if (arg0 <= 23) {
                method1425((class133) null, 109, -117, 87, 74, 87, -44, -19, true);
            }
            return 100;
        }
    }
}
