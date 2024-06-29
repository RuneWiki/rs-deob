import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class121 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field1859 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Loj;")
    public static class168 field1857 = new class168();

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[Z")
    public static boolean[] field1861 = new boolean[100];

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lec;")
    public static class99 field1862 = new class99(50);

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "J")
    public static long field1863 = 0L;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1864 = " is already on your ignore list.";

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "F")
    public static float field1865;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBIIIII)V", line = 11)
    public static final void method912(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field1860++;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg5 - arg4;
        int var12 = arg1 * arg1;
        int var13 = arg5 * arg5;
        int var14 = arg1 - arg4;
        int var15 = var14 * var14;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = var11 << 1;
        int var21 = arg5 << 1;
        int var22 = var15 << 1;
        int var23 = (1 - var21) * var12 + var17;
        int var24 = var16 - ((var20 - 1) * var22);
        int var25 = var13 - ((var21 - 1) * var18);
        int var26 = (1 - var20) * var15 + var19;
        int var27 = var12 << 2;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = var19 * 3;
        int var33 = (var21 - 3) * var18;
        int var34 = var28;
        int var35 = (var20 - 3) * var22;
        int var36 = var30;
        int var37 = (arg5 - 1) * var27;
        int var38 = (var11 - 1) * var29;
        int[] var39 = class79.field1178[arg0];
        class7.method72(arg7 - var14, arg2 + 76, arg7 - arg1, var39, arg3);
        class7.method72(arg7 + var14, -7, -var14 + arg7, var39, arg6);
        class7.method72(arg1 + arg7, -7, arg7 + var14, var39, arg3);
        if (arg2 != -83) {
            method913(9);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var31 += var28;
                    var25 += var34;
                    var34 += var28;
                }
            }
            if (var25 < 0) {
                var25 += var34;
                var8++;
                var34 += var28;
                var23 += var31;
                var31 += var28;
            }
            var25 += -var33;
            var33 -= var27;
            boolean var40 = var9 <= var11;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var10++;
                        var24 += var36;
                        var26 += var32;
                        var32 += var30;
                        var36 += var30;
                    }
                }
                if (var24 < 0) {
                    var26 += var32;
                    var10++;
                    var24 += var36;
                    var32 += var30;
                    var36 += var30;
                }
                var24 += -var35;
                var26 += -var38;
                var35 -= var29;
                var38 -= var29;
            }
            var23 += -var37;
            var9--;
            var37 -= var27;
            int var41 = arg0 + var9;
            int var42 = arg0 - var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class7.method72(var46, -7, var44, class79.field1178[var42], arg3);
                class7.method72(var45, -7, var46, class79.field1178[var42], arg6);
                class7.method72(var43, -7, var45, class79.field1178[var42], arg3);
                class7.method72(var46, arg2 ^ 0x54, var44, class79.field1178[var41], arg3);
                class7.method72(var45, -7, var46, class79.field1178[var41], arg6);
                class7.method72(var43, -7, var45, class79.field1178[var41], arg3);
            } else {
                class7.method72(var43, -7, var44, class79.field1178[var42], arg3);
                class7.method72(var43, arg2 + 76, var44, class79.field1178[var41], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 180)
    public static final void method913(int arg0) {
        field1856++;
        int var1 = class204.field3136.method1132(8, 113);
        if (class234.field3563 > var1) {
            for (int var2 = var1; var2 < class234.field3563; var2++) {
                class291.field4479[class110.field1668++] = class291.field4475[var2];
            }
        }
        if (class234.field3563 < var1) {
            throw new RuntimeException("gppov1");
        }
        class234.field3563 = 0;
        if (arg0 != -18846) {
            method915(25);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class291.field4475[var3];
            class270 var5 = class201.field3096[var4];
            int var6 = class204.field3136.method1132(1, 121);
            if (var6 == 0) {
                class291.field4475[class234.field3563++] = var4;
                var5.field4711 = class233.field3542;
            } else {
                int var7 = class204.field3136.method1132(2, 121);
                if (var7 == 0) {
                    class291.field4475[class234.field3563++] = var4;
                    var5.field4711 = class233.field3542;
                    class219.field3351[class67.field970++] = var4;
                } else if (var7 == 1) {
                    class291.field4475[class234.field3563++] = var4;
                    var5.field4711 = class233.field3542;
                    int var8 = class204.field3136.method1132(3, 113);
                    var5.method2091(1, var8, false);
                    int var9 = class204.field3136.method1132(1, 117);
                    if (var9 == 1) {
                        class219.field3351[class67.field970++] = var4;
                    }
                } else if (var7 == 2) {
                    class291.field4475[class234.field3563++] = var4;
                    var5.field4711 = class233.field3542;
                    if (class204.field3136.method1132(1, 112) == 1) {
                        int var10 = class204.field3136.method1132(3, 115);
                        var5.method2091(2, var10, false);
                        int var11 = class204.field3136.method1132(3, 116);
                        var5.method2091(2, var11, false);
                    } else {
                        int var12 = class204.field3136.method1132(3, arg0 ^ 0xFFFFB619);
                        var5.method2091(0, var12, false);
                    }
                    int var13 = class204.field3136.method1132(1, 119);
                    if (var13 == 1) {
                        class219.field3351[class67.field970++] = var4;
                    }
                } else if (var7 == 3) {
                    class291.field4479[class110.field1668++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)V", line = 294)
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1858++;
        int var6 = (arg4 - 32) * arg4 / arg0;
        if (arg1 != 50) {
            field1857 = (class168) null;
        }
        class198.field3037[0].method322(arg2, arg5);
        if (var6 < 8) {
            var6 = 8;
        }
        class198.field3037[1].method322(arg2, arg5 + arg4 - 16);
        int var7 = (arg4 - var6 - 32) * arg3 / (arg0 - arg4);
        if (!class73.field1058) {
            class287.method1987(arg2, arg5 + 16, 16, arg4 - 32, class61.field818);
            class287.method1987(arg2, arg5 + var7 + 16, 16, var6, class141.field2175);
            class287.method1979(arg2, arg5 + var7 + 16, var6, class59.field786);
            class287.method1979(arg2 + 1, arg5 - (-16 - var7), var6, class59.field786);
            class287.method1990(arg2, arg5 + var7 + 16, 16, class59.field786);
            class287.method1990(arg2, arg5 + var7 + 17, 16, class59.field786);
            class287.method1979(arg2 + 15, arg5 + 16 + var7, var6, class132.field2024);
            class287.method1979(arg2 + 14, arg5 + var7 - -17, var6 - 1, class132.field2024);
            class287.method1990(arg2, arg5 + var6 + var7 + 15, 16, class132.field2024);
            class287.method1990(arg2 + 1, var7 - -var6 + arg5 + 14, 15, class132.field2024);
            return;
        }
        class175.method1322(arg2, arg5 + 16, 16, arg4 - 32, class61.field818);
        class175.method1322(arg2, arg5 + var7 + 16, 16, var6, class141.field2175);
        class175.method1319(arg2, arg5 + var7 + 16, var6, class59.field786);
        class175.method1319(arg2 + 1, var7 + 16 + arg5, var6, class59.field786);
        class175.method1309(arg2, arg5 + var7 + 16, 16, class59.field786);
        class175.method1309(arg2, arg5 + var7 + 17, 16, class59.field786);
        class175.method1319(arg2 + 15, var7 + 16 + arg5, var6, class132.field2024);
        class175.method1319(arg2 + 14, arg5 + 17 + var7, var6 - 1, class132.field2024);
        class175.method1309(arg2, var7 + var6 + arg5 + 15, 16, class132.field2024);
        class175.method1309(arg2 + 1, arg5 - -14 + var6 + var7, 15, class132.field2024);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 344)
    public static void method915(int arg0) {
        if (arg0 != 16) {
            field1859 = 10;
        }
        field1857 = null;
        field1861 = null;
        field1864 = null;
        field1862 = null;
    }
}
