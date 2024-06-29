import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class186 extends class18 {

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Lhc;")
    public static class235 field2872;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2868;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)I")
    public static final int method1252(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        if (arg1 <= 90) {
            method1257(-87, 78, 95, -103, 8);
        }
        field2881++;
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    public static final void method1253(int arg0) {
        if (arg0 != 13312) {
            return;
        }
        class61 var1 = (class61) class240.field3899.method1221(116);
        field2883++;
        while (var1 != null) {
            class52 var2 = var1.field1049;
            if (class240.field3892 != var2.field766 || class192.field2978 > var2.field788) {
                var1.method1123(0);
            } else if (class192.field2978 >= var2.field767) {
                if (var2.field778 > 0) {
                    class45 var3 = class255.field4082[var2.field778 - 1];
                    if (var3 != null && var3.field2240 >= 0 && var3.field2240 < 13312 && var3.field2278 >= 0 && var3.field2278 < 13312) {
                        var2.method387(class192.field2978, var3.field2240, var3.field2278, class34.method269(var2.field766, var3.field2278, var3.field2240, 103) - var2.field758, 107);
                    }
                }
                if (var2.field778 < 0) {
                    int var4 = -var2.field778 - 1;
                    class236 var5;
                    if (class116.field1897 == var4) {
                        var5 = class283.field4473;
                    } else {
                        var5 = class210.field3267[var4];
                    }
                    if (var5 != null && var5.field2240 >= 0 && var5.field2240 < 13312 && var5.field2278 >= 0 && var5.field2278 < 13312) {
                        var2.method387(class192.field2978, var5.field2240, var5.field2278, class34.method269(var2.field766, var5.field2278, var5.field2240, 103) - var2.field758, 83);
                    }
                }
                var2.method383(class84.field1413, -106);
                class70.method506(class240.field3892, (int) var2.field751, (int) var2.field775, (int) var2.field791, 60, var2, var2.field779, -1L, false);
            }
            var1 = (class61) class240.field3899.method1227(-10626);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
    public abstract void method845(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
    public static final void method1254(int arg0) {
        class31.field460 = arg0;
        for (int var1 = 0; var1 < class142.field2166; var1++) {
            for (int var2 = 0; var2 < class280.field4424; var2++) {
                if (class269.field4298[arg0][var1][var2] == null) {
                    class269.field4298[arg0][var1][var2] = new class6(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(II)V")
    public abstract void method856(int arg0, int arg1);

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(II)V")
    public abstract void method858(int arg0, int arg1);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
    public abstract void method852(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIIIIIZILai;)V")
    public static final void method1255(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class88 arg9) {
        field2882++;
        if (arg2 > -88) {
            return;
        }
        byte var10 = 0;
        byte var11 = 0;
        if (arg0 == 1) {
            var11 = 1;
        } else if (arg0 == 2) {
            var10 = 1;
            var11 = 1;
        } else if (arg0 == 3) {
            var10 = 1;
        }
        if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var14 = arg9.method633(66);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method633(76);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method633(61);
                }
            }
        }
        if (!arg1 && !arg7) {
            class181.field2827[arg8][arg5][arg4] = 0;
        }
        while (true) {
            int var12 = arg9.method633(119);
            if (var12 == 0) {
                if (arg1) {
                    class66.field1107[0][arg5 + var10][arg4 + var11] = class5.field60[0][arg5 + var10][arg4 + var11];
                    return;
                } else if (arg8 == 0) {
                    class66.field1107[0][arg5 + var10][arg4 + var11] = -class158.method1069(arg6 + 932731, 556238 - -arg3, 186742850) * 8;
                    return;
                } else {
                    class66.field1107[arg8][arg5 + var10][arg4 + var11] = class66.field1107[arg8 - 1][arg5 + var10][arg4 + var11] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method633(81);
                if (!arg1) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 != 0) {
                        class66.field1107[arg8][arg5 + var10][arg4 + var11] = class66.field1107[arg8 - 1][arg5 + var10][arg4 + var11] - var13 * 8;
                        return;
                    }
                    class66.field1107[0][arg5 + var10][arg4 + var11] = -var13 * 8;
                    return;
                }
                class66.field1107[0][arg5 + var10][arg4 + var11] = var13 * 8 + class5.field60[0][arg5 + var10][arg4 + var11];
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg9.method633(67);
                } else {
                    class268.field4272[arg8][arg5][arg4] = arg9.method656(-252);
                    class50.field737[arg8][arg5][arg4] = (byte) ((var12 - 2) / 4);
                    class180.field2818[arg8][arg5][arg4] = (byte) class55.method420(3, arg0 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg1 && !arg7) {
                    class181.field2827[arg8][arg5][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                class113.field1852[arg8][arg5][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2876++;
        if (arg0 != 23419) {
            return;
        }
        if (class53.method394(false, arg8)) {
            class185.method1250(class193.field3052[arg8], arg3, -1, arg7, arg5, arg4, arg1, arg6, (byte) -62, arg2);
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class25.field335[var9] = true;
            }
        } else {
            class25.field335[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class77.field1262; var5++) {
            if ((class251.field4040[var5] + class129.field2025[var5]) > arg3 && arg2 + arg3 > class129.field2025[var5] && (class278.field4418[var5] + class115.field1879[var5]) > arg0 && class115.field1879[var5] < (arg0 + arg1)) {
                class85.field1428[var5] = true;
            }
        }
        field2880++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public abstract void method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(II)V")
    public abstract void method850(int arg0, int arg1);

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field2872 = null;
        if (arg0 == -2) {
            field2868 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(II)V")
    public static final void method1259(int arg0, int arg1) {
        if (arg1 == 0) {
            field2875++;
            class41 var2 = class221.method1492((byte) -42, arg0, 12);
            var2.method303(arg1 + 23981);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIII)V")
    public abstract void method854(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIIII)V")
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2878++;
        if (arg1 <= 53) {
            method1257(3, 62, 102, 88, 41);
        }
        int var6 = this.field2869 << 3;
        int var7 = this.field2877 << 3;
        int var8 = (arg4 << 4) + (var6 & 0xF);
        int var9 = (arg2 << 4) + (var7 & 0xF);
        this.method849(var6, var7, var8, var9, arg0, arg3);
    }
}
