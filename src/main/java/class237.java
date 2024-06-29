import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class237 extends class80 {

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field4114 = 0;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Lr;")
    private static class66 field4112 = class93.method641(43, "");

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lr;")
    public static class66 field4116 = field4112;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Lha;")
    public class63 field4120;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "Lha;")
    public class63 field4125;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lr;")
    public class66 field4115;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Z")
    public boolean field4123;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "[Lr;")
    public static class66[] field4129;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field4118;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILcj;I)Lni;")
    public static final class168 method1562(int arg0, class28 arg1, int arg2) {
        field4128++;
        if (arg2 < 53) {
            field4129 = null;
        }
        return class87.method618(arg1, -1, arg0) ? class139.method955((byte) -83) : null;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public static final void method1563(int arg0) {
        field4126++;
        int var1 = class129.field2407;
        int var2 = class70.field1405;
        int var3 = class9.field102;
        int var4 = class187.field3240;
        int var5 = 6116423;
        class235.method1558(var1, var2, var4, var3, var5);
        class235.method1558(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class235.method1534(var1 + 1, var2 + 18, var4 - 2, var3 + -19, 0);
        class59.field1016.method233(class135.field2500, var1 + 3, var2 - -14, var5, -1);
        int var6 = class170.field3021;
        int var7 = class50.field896;
        int var8 = 0;
        if (arg0 != 4) {
            return;
        }
        while (var8 < class176.field3105) {
            int var9 = (class176.field3105 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var4 > var6 && var7 > (var9 - 13) && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class59.field1016.method233(class183.method1218((byte) -103, var8), var1 + 3, var9, var10, 0);
            var8++;
        }
        class50.method351(-97, class187.field3240, class9.field102, class129.field2407, class70.field1405);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static final void method1564(byte arg0) {
        field4119++;
        if (arg0 > -99) {
            method1568(93, (class249) null);
        }
        for (int var1 = 0; var1 < class7.field64; var1++) {
            int var10002 = class194.field3356[var1]--;
            if (class194.field3356[var1] >= -10) {
                class71 var3 = class214.field3679[var1];
                if (var3 == null) {
                    var3 = class71.method512(class146.field2662, class230.field3984[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class194.field3356[var1] += var3.method513();
                    class214.field3679[var1] = var3;
                }
                if (class194.field3356[var1] < 0) {
                    int var4;
                    if (class178.field3123[var1] == 0) {
                        var4 = class61.field1030;
                    } else {
                        int var5 = class178.field3123[var1] >> 16 & 0xFF;
                        int var6 = (class178.field3123[var1] & 0xFF26) >> 8;
                        int var7 = var5 * 128 + 64 - class207.field3595.field2077;
                        int var8 = (class178.field3123[var1] & 0xFF) * 128;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var6 * 128 + 64 - class207.field3595.field2053;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var8 < var10) {
                            class194.field3356[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var8 - var10) * class54.field944 / var8;
                    }
                    if (var4 > 0) {
                        class177 var11 = var3.method511().method1188(class102.field1984);
                        class258 var12 = class258.method1754(var11, 100, var4);
                        var12.method1727(class257.field4521[var1] - 1);
                        class206.field3528.method1033(var12);
                    }
                    class194.field3356[var1] = -100;
                }
            } else {
                class7.field64--;
                for (int var2 = var1; var2 < class7.field64; var2++) {
                    class230.field3984[var2] = class230.field3984[var2 + 1];
                    class214.field3679[var2] = class214.field3679[var2 + 1];
                    class257.field4521[var2] = class257.field4521[var2 + 1];
                    class194.field3356[var2] = class194.field3356[var2 + 1];
                    class178.field3123[var2] = class178.field3123[var2 + 1];
                }
                var1--;
            }
        }
        if (class252.field4431 && !class257.method1723(20778)) {
            if (class164.field2936 != 0 && class67.field1350 != -1) {
                class233.method1525(class67.field1350, class28.field405, false, 0, class164.field2936, false);
            }
            class252.field4431 = false;
        } else if (class164.field2936 != 0 && class67.field1350 != -1 && !class257.method1723(20778)) {
            class28.field412.method578(-64, 247);
            class73.field1434++;
            class28.field412.method1666(544537784, class67.field1350);
            class67.field1350 = -1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IJIZ)Lr;")
    public static final class66 method1565(int arg0, long arg1, int arg2, boolean arg3) {
        field4117++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        long var6 = arg1 / (long) arg0;
        while (var6 != 0L) {
            var6 /= (long) arg0;
            var5++;
        }
        int var8 = var5;
        if (arg1 < 0L || arg3) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        if (arg2 < 18) {
            method1567(36);
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg1 % (long) arg0);
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
            arg1 /= (long) arg0;
        }
        class66 var11 = new class66();
        var11.field1308 = var8;
        var11.field1283 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4110++;
        int var9 = arg8 - arg4;
        int var10 = (arg5 - arg3 << 16) / var9;
        if (arg6 == 1391070128) {
            int var11 = arg2 - arg1;
            int var12 = (arg7 - arg0 << 16) / var11;
            class107.method728(var10, var12, arg8, true, 0, 0, arg2, arg0, arg1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
    public static void method1567(int arg0) {
        field4116 = null;
        field4112 = null;
        if (arg0 > -88) {
            method1563(-124);
        }
        field4129 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILlh;)V")
    public static final void method1568(int arg0, class249 arg1) {
        field4130++;
        while (true) {
            while (arg1.field4335 < arg1.field4350.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method1677(arg0 ^ 0xFFFFDFD3) == 1) {
                    var2 = arg1.method1677(-6677);
                    var4 = arg1.method1677(arg0 ^ 0xFFFFDFD3);
                    var3 = true;
                }
                int var5 = arg1.method1677(arg0 ^ 0xFFFFDFD3);
                int var6 = arg1.method1677(arg0 ^ 0xFFFFDFD3);
                int var7 = class89.field1727 - (1 - (class16.field208 - (var6 * 64)));
                int var8 = var5 * 64 - class73.field1439;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class33.field500 && class89.field1727 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && (var2 * 8 + 8) > var11 && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                int var13 = arg1.method1677(arg0 ^ 0xFFFFDFD3);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1677(-6677);
                                        if (class96.field1862[var10][var9] == null) {
                                            class96.field1862[var10][var9] = new byte[4096];
                                        }
                                        class96.field1862[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1674(1355769544);
                                        if (class96.field1866[var10][var9] == null) {
                                            class96.field1866[var10][var9] = new short[4096];
                                        }
                                        class96.field1866[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1677(-6677) & 0xFF << 16) - (-(arg1.method1677(-6677) & 0xFF << 8) - (arg1.method1677(-6677) & 0xFF));
                                        if (class154.field2752[var10][var9] == null) {
                                            class154.field2752[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class231 var17 = class52.method359(114, var16);
                                        if (var17.field4027 != null) {
                                            var17 = var17.method1515(-1);
                                            if (var17 == null || var17.field4013 == -1) {
                                                continue;
                                            }
                                        }
                                        class154.field2752[var10][var9][(63 - var12 << 6) + var11] = var17.field4064 + 1;
                                        class132 var18 = new class132();
                                        var18.field2468 = var17.field4013;
                                        var18.field2459 = var8;
                                        var18.field2465 = var7;
                                        class189.field3279.method866(var18, true);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1677(-6677);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field4335++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field4335 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field4335 += 3;
                            }
                        }
                    }
                }
            }
            if (arg0 != 14904) {
                method1566(69, 76, -109, 33, -58, -2, 39, 107, -25);
                return;
            }
            return;
        }
    }
}
