import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class242 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
    public static int[] field3837 = new int[25];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3834 = "green:";

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[I")
    public static int[] field3835 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lic;")
    public static class160 field3836 = new class160(16);

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method1601(byte arg0) {
        field3837 = null;
        field3836 = null;
        field3835 = null;
        int var1 = -86 / ((arg0 + 19) / 59);
        field3834 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static final void method1602(int arg0) {
        field3841++;
        class28.method249(5, (byte) 96);
        class207.method1389(5, arg0 ^ 0xFFFFFF95);
        class11.method75((byte) 21, 5);
        class25.method222(5, -27);
        class233.method1545(5, 1915);
        class285.method1911(5, 1);
        class96.method730(true, 5);
        class206.method1385((byte) -128, 5);
        class29.method258(2, 5);
        class222.method1496(-1, 5);
        class247.method1640(5, 1926);
        class279.method1874(102, 5);
        class141.method1050(5, arg0 - 5);
        class248.method1658((byte) 112, 5);
        class154.method1111(-47, 5);
        class283.method1903(16914, 5);
        class234.method1551(5, -4);
        class263.method1766(1, 50);
        class240.method1585((byte) -81, arg0);
        class195.method1334(95, 5);
        class50.field922.method1163(5, false);
        class3.field37.method1163(5, false);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([IIIIII)V")
    public static final void method1603(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class129 var6 = class26.field455[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class105 var7 = var6.field2132;
        if (var7 != null) {
            int var8 = var7.field1606;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class117 var10 = var6.field2146;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1968;
        int var12 = var10.field1976;
        int var13 = var10.field1980;
        int var14 = var10.field1962;
        int[] var15 = class107.field1637[var11];
        int[] var16 = class48.field883[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V")
    public static final void method1604() {
        if (class9.field127 != null) {
            for (int var0 = 0; var0 < class9.field127.length; var0++) {
                for (int var1 = 0; var1 < class129.field2127; var1++) {
                    for (int var2 = 0; var2 < class130.field2161; var2++) {
                        class9.field127[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class5.field61 != null) {
            for (int var3 = 0; var3 < class5.field61.length; var3++) {
                for (int var4 = 0; var4 < class129.field2127; var4++) {
                    for (int var5 = 0; var5 < class130.field2161; var5++) {
                        class5.field61[var3][var4][var5] = null;
                    }
                }
            }
        }
        class272.field4349 = 0;
        if (class193.field3164 != null) {
            for (int var6 = 0; var6 < class272.field4349; var6++) {
                class193.field3164[var6] = null;
            }
        }
        if (class195.field3194 != null) {
            for (int var7 = 0; var7 < class150.field2462; var7++) {
                class195.field3194[var7] = null;
            }
            class150.field2462 = 0;
        }
        if (class7.field89 != null) {
            for (int var8 = 0; var8 < class7.field89.length; var8++) {
                class7.field89[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)Lwg;")
    public static final class23 method1605(byte arg0) {
        field3839++;
        class23 var1 = (class23) class239.field3773.method62(0);
        if (var1 != null) {
            var1.method1074((byte) -124);
            var1.method827((byte) -98);
            return var1;
        }
        if (arg0 != 38) {
            method1604();
        }
        class23 var2;
        do {
            var2 = (class23) class77.field1277.method62(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method189((byte) 41) > class62.method472(45)) {
                return null;
            }
            var2.method1074((byte) -120);
            var2.method827((byte) -98);
        } while ((var2.field1727 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIZIIII)V")
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg10 - arg2;
        field3840++;
        int var13 = arg0 - arg8;
        int var14 = -1;
        int var15 = 983040 / arg4;
        int var16 = -62 % ((59 - arg3) / 35);
        if (class124.field2066 > 0) {
            if (class165.field2714 <= 10) {
                var14 = class165.field2714 * 5;
            } else {
                var14 = (10 + 10 - class165.field2714) * 5;
            }
        }
        int var17 = 983040 / arg5;
        for (int var18 = -var15; var18 < var12 + var15; var18++) {
            int var20 = arg4 * var18 + arg9 >> 16;
            int var21 = (var18 + 1) * arg4 + arg9 >> 16;
            int var22 = var21 - var20;
            if (var22 > 0) {
                int var23 = arg2 + var18 >> 6;
                int var24 = arg11 + var20;
                int var10000 = arg11 + var21;
                if (var23 >= 0 && var23 <= (class149.field2446.length - 1)) {
                    int[][] var26 = class149.field2446[var23];
                    for (int var27 = -var17; var27 < (var13 + var17); var27++) {
                        int var28 = arg5 * var27 + arg1 >> 16;
                        int var29 = arg1 + ((var27 + 1) * arg5) >> 16;
                        int var30 = var29 - var28;
                        if (var30 > 0) {
                            int var31 = arg6 + var28;
                            int var32 = var27 + arg8 >> 6;
                            var10000 = arg6 + var29;
                            if (var32 >= 0 && (var26.length - 1) >= var32 && var26[var32] != null) {
                                int var34 = (var27 + arg8 & 0x3F << 6) + (arg2 + var18 & 0x3F);
                                int var35 = var26[var32][var34];
                                if (var35 != 0) {
                                    class248 var36 = class46.method396(var35 - 1, (byte) 63);
                                    if (!class157.field2555[var36.field3907]) {
                                        if (var14 != -1 && class240.field3777 == var36.field3907) {
                                            class61 var37 = new class61();
                                            var37.field1038 = var24;
                                            var37.field1042 = var31;
                                            var37.field1043 = var36.field3907;
                                            class149.field2438.method1809(5, var37);
                                        } else {
                                            client.field4577[var36.field3907].method124(var24 - 7, var31 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class61 var19 = (class61) class149.field2438.method1807(-124); var19 != null; var19 = (class61) class149.field2438.method1808((byte) 82)) {
            class63.method486(var19.field1038, var19.field1042, 15, 16776960, var14);
            class63.method486(var19.field1038, var19.field1042, 13, 16776960, var14);
            class63.method486(var19.field1038, var19.field1042, 11, 16776960, var14);
            class63.method486(var19.field1038, var19.field1042, 9, 16776960, var14);
            client.field4577[var19.field1043].method124(var19.field1038 - 7, var19.field1042 + -7);
        }
        class149.field2438.method1818(-49);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIIIII)V")
    public static final void method1607(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= class154.field2509 && class108.field1650 <= arg1) {
            boolean var6;
            if (class32.field540 > arg5) {
                var6 = false;
                arg5 = class32.field540;
            } else if (class61.field1034 >= arg5) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class61.field1034;
            }
            boolean var7;
            if (arg2 < class32.field540) {
                var7 = false;
                arg2 = class32.field540;
            } else if (class61.field1034 < arg2) {
                var7 = false;
                arg2 = class61.field1034;
            } else {
                var7 = true;
            }
            if (class108.field1650 > arg4) {
                arg4 = class108.field1650;
            } else {
                class224.method1504(arg3, arg5, arg2, class114.field1841[arg4++], 7);
            }
            if (class154.field2509 >= arg1) {
                class224.method1504(arg3, arg5, arg2, class114.field1841[arg1--], 7);
            } else {
                arg1 = class154.field2509;
            }
            if (var7 && var6) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    int[] var9 = class114.field1841[var8];
                    var9[arg2] = var9[arg5] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg1; var11++) {
                    class114.field1841[var11][arg2] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg1; var10++) {
                    class114.field1841[var10][arg5] = arg3;
                }
            }
        }
        field3838++;
        if (arg0 >= -36) {
            field3837 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V")
    public static final void method1608(byte arg0, int arg1) {
        class165.field2714 = 20;
        if (arg0 >= -32) {
            field3837 = null;
        }
        field3842++;
        class240.field3777 = arg1;
        class124.field2066 = 3;
    }
}
