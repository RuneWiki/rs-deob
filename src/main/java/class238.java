import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class238 extends class112 {

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Z")
    public volatile boolean field3756 = true;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "[I")
    public static int[] field3750 = new int[2500];

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3758 = "red:";

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "Lre;")
    public static class266 field3755 = new class266();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Z")
    public boolean field3753;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Z")
    public boolean field3754;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I")
    public abstract int method734(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1570(byte arg0, String arg1) {
        if (arg0 != -73) {
            return;
        }
        field3749++;
        int var2 = class45.method390(arg1, 30320);
        if (var2 != -1) {
            int[] var3 = class152.field2484.method869(class143.field2358.field4042[var2] & 0x3FFF, class143.field2358.field4042[var2] >> 14 & 0x3FFF, class143.field2358.field4042[var2] >> 28 & 0x3, (byte) -87);
            class15.method102(var3[2], var3[1], 108);
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field3750 = null;
        if (arg0 != 63) {
            method1574(-31, -95, 116, 89, 6, -39, -110);
        }
        field3758 = null;
        field3755 = null;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)[B")
    public abstract byte[] method733(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BILmk;I)V")
    public static final void method1572(byte arg0, int arg1, class213 arg2, int arg3) {
        if (arg0 < 101) {
            field3757 = -110;
        }
        field3747++;
        if (arg2.field2816 == arg3 && arg3 != -1) {
            class77 var4 = class28.method246(-106, arg3);
            int var5 = var4.field1270;
            if (var5 == 1) {
                arg2.field2886 = 1;
                arg2.field2885 = arg1;
                arg2.field2888 = 0;
                arg2.field2903 = 0;
                arg2.field2826 = 0;
                class124.method916(arg2.field2887, arg2.field2849, 477628496, class48.field878 == arg2, var4, arg2.field2903);
            }
            if (var5 == 2) {
                arg2.field2888 = 0;
                return;
            }
        } else if (arg3 == -1 || arg2.field2816 == -1 || class28.method246(66, arg3).field1257 >= class28.method246(-77, arg2.field2816).field1257) {
            arg2.field2886 = 1;
            arg2.field2888 = 0;
            arg2.field2885 = arg1;
            arg2.field2826 = 0;
            arg2.field2903 = 0;
            arg2.field2816 = arg3;
            arg2.field2883 = arg2.field2843;
            if (arg2.field2816 != -1) {
                class124.method916(arg2.field2887, arg2.field2849, 477628496, class48.field878 == arg2, class28.method246(-27, arg2.field2816), arg2.field2903);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method1573(int arg0) {
        field3759++;
        if (class161.field2619 < 128.0F) {
            class161.field2619 = 128.0F;
        }
        if (class161.field2619 > 383.0F) {
            class161.field2619 = 383.0F;
        }
        while (class1.field1 >= 2048.0F) {
            class1.field1 -= 2048.0F;
        }
        while (class1.field1 < 0.0F) {
            class1.field1 += 2048.0F;
        }
        int var1 = class260.field4134 >> 7;
        int var2 = class29.field507 >> 7;
        int var3 = class218.method1450(class29.field507, class260.field4134, true, class92.field1448);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class92.field1448;
                    if (var7 < 3 && (class43.field790[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class273.field4356[var7][var5][var6] & 0xFF) * 8 + var3 - class21.field327[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        int var10 = 23 % ((63 - arg0) / 58);
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class72.field1198 < var9) {
            class72.field1198 += (var9 - class72.field1198) / 24;
        } else if (class72.field1198 > var9) {
            class72.field1198 += (var9 - class72.field1198) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3748++;
        int var7 = class32.method278(class108.field1650, 1, class154.field2509, arg3);
        int var8 = class32.method278(class108.field1650, 1, class154.field2509, arg2);
        int var9 = class32.method278(class32.field540, 1, class61.field1034, arg6);
        int var10 = class32.method278(class32.field540, arg4 ^ 0x2, class61.field1034, arg0);
        int var11 = class32.method278(class108.field1650, 1, class154.field2509, arg3 + arg1);
        int var12 = class32.method278(class108.field1650, arg4 - 2, class154.field2509, arg2 - arg1);
        if (arg4 != 3) {
            return;
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class224.method1504(arg5, var10, var9, class114.field1841[var13], arg4 ^ 0x4);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class224.method1504(arg5, var10, var9, class114.field1841[var14], 7);
        }
        int var15 = class32.method278(class32.field540, 1, class61.field1034, arg1 + arg6);
        int var16 = class32.method278(class32.field540, 1, class61.field1034, arg0 - arg1);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class114.field1841[var17];
            class224.method1504(arg5, var15, var9, var18, 7);
            class224.method1504(arg5, var10, var16, var18, 7);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILig;IZIIZIII)V")
    public static final void method1575(int arg0, class136 arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        byte var10 = 0;
        byte var11 = 0;
        if (arg2 == 1) {
            var10 = 1;
        } else if (arg2 == 2) {
            var10 = 1;
            var11 = 1;
        } else if (arg2 == 3) {
            var11 = 1;
        }
        if (arg0 != 1) {
            return;
        }
        field3751++;
        if (arg7 < 0 || arg7 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var14 = arg1.method1012(4);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg1.method1012(4);
                    return;
                }
                if (var14 <= 49) {
                    arg1.method1012(4);
                }
            }
        }
        if (!arg6 && !arg3) {
            class43.field790[arg5][arg7][arg4] = 0;
        }
        while (true) {
            int var12 = arg1.method1012(4);
            if (var12 == 0) {
                if (arg6) {
                    class21.field327[0][arg7 + var11][arg4 + var10] = class161.field2627[0][arg7 + var11][arg4 + var10];
                    return;
                } else if (arg5 == 0) {
                    class21.field327[0][arg7 + var11][arg4 + var10] = -class35.method293(arg9 + 932731, 556238 - -arg8, 24651) * 8;
                    return;
                } else {
                    class21.field327[arg5][arg7 + var11][arg4 + var10] = class21.field327[arg5 - 1][arg7 + var11][arg4 + var10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg1.method1012(arg0 + 3);
                if (arg6) {
                    class21.field327[0][arg7 + var11][arg4 + var10] = var13 * 8 + class161.field2627[0][arg7 + var11][arg4 + var10];
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg5 != 0) {
                    class21.field327[arg5][arg7 + var11][arg4 + var10] = class21.field327[arg5 - 1][arg7 + var11][arg4 + var10] - (var13 * 8);
                    return;
                }
                class21.field327[0][arg7 + var11][arg4 + var10] = -var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg1.method1012(4);
                } else {
                    class185.field3042[arg5][arg7][arg4] = arg1.method981(false);
                    class70.field1173[arg5][arg7][arg4] = (byte) ((var12 - 2) / 4);
                    class64.field1060[arg5][arg7][arg4] = (byte) class64.method498(var12 + arg2 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg6 && !arg3) {
                    class43.field790[arg5][arg7][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                class229.field3658[arg5][arg7][arg4] = (byte) (var12 - 81);
            }
        }
    }
}
