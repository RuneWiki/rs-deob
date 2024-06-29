import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class97 extends class34 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1891 = -1;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[S")
    public static short[] field1892 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Lcc;")
    public static class209 field1897 = class95.method669(109, "0");

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "Z")
    public static volatile boolean field1900 = true;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "Lcc;")
    public static class209 field1903 = class95.method669(124, "<col=00ffff>");

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Lcc;")
    public static class209 field1904 = class95.method669(109, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Lcc;")
    public static class209 field1890 = class95.method669(120, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "Lcc;")
    public static class209 field1906 = class95.method669(92, "null");

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Lsj;")
    public static class49 field1905;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "[Lal;")
    public static class231[] field1896;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[[[I")
    public static int[][][] field1887;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
    public static void method676(int arg0) {
        field1887 = null;
        field1903 = null;
        field1896 = null;
        if (arg0 != 1) {
            return;
        }
        field1906 = null;
        field1890 = null;
        field1897 = null;
        field1892 = null;
        field1905 = null;
        field1904 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIBII)V")
    public static final void method677(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1899++;
        class176.method1215(arg4 - arg1, arg0, class252.field4543[arg2], arg1 + arg4, (byte) -124);
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg5 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = var9 << 2;
        int var15 = (1 - var12) * var8 + var11;
        int var16 = var8 << 2;
        int var17 = ((arg5 << 1) - 3) * var10;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = (arg5 - 1) * var16;
        int var20 = (var6 + 1) * var14;
        while (var7 > 0) {
            var7--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var6++;
                    var13 += var20;
                    var15 += var18;
                    var18 += var14;
                    var20 += var14;
                }
            }
            int var21 = arg2 - var7;
            int var22 = arg2 + var7;
            if (var13 < 0) {
                var13 += var20;
                var20 += var14;
                var15 += var18;
                var6++;
                var18 += var14;
            }
            var13 += -var17;
            var17 -= var16;
            int var23 = arg4 - var6;
            int var24 = arg4 + var6;
            class176.method1215(var23, arg0, class252.field4543[var21], var24, (byte) 117);
            class176.method1215(var23, arg0, class252.field4543[var22], var24, (byte) 12);
            var15 += -var19;
            var19 -= var16;
        }
        if (arg3 != -35) {
            field1891 = -65;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method678(int arg0, Component arg1) {
        field1889++;
        if (arg0 != 15483) {
            method678(78, (Component) null);
        }
        Method var2 = class143.field2649;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class226.field4117);
        arg1.addFocusListener(class226.field4117);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)Z")
    public static final boolean method679(boolean arg0) {
        field1902++;
        class2 var1 = class226.field4117;
        synchronized (class226.field4117) {
            if (class253.field4573 == class205.field3660) {
                return false;
            }
            class69.field1315 = class2.field35[class205.field3660];
            class148.field2713 = class196.field3523[class205.field3660];
            if (!arg0) {
                method680(-3, 62, -24, -100, 62, -43, 21, -16, 62, true, -98, -119, true);
            }
            class205.field3660 = class205.field3660 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIIZIIZ)Z")
    public static final boolean method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, boolean arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class277.field4883[var13][var40] = 0;
                class50.field997[var13][var40] = 99999999;
            }
        }
        class277.field4883[arg3][arg8] = 99;
        int var14 = arg3;
        field1893++;
        class50.field997[arg3][arg8] = 0;
        int var15 = 0;
        boolean var16 = false;
        int var17 = arg8;
        byte var18 = 0;
        class195.field3499[var18] = arg3;
        int var41 = var18 + 1;
        class265.field4756[var18] = arg8;
        int[][] var19 = class122.field2404[class99.field1937].field3103;
        label372: while (var15 != var41) {
            var14 = class195.field3499[var15];
            var17 = class265.field4756[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg7 == var14 && arg6 == var17) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class122.field2404[class99.field1937].method1178(var17, arg7, arg4 - 1, var14, (byte) 47, arg2, arg6, arg5)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class122.field2404[class99.field1937].method1174(arg6, var17, arg5, arg2, arg7, (byte) 92, arg4 - 1, var14)) {
                    var16 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg1 != 0 && class122.field2404[class99.field1937].method1175(arg0, var17, arg6, arg1, var14, arg10, arg7, (byte) 114, arg5)) {
                var16 = true;
                break;
            }
            int var31 = class50.field997[var14][var17] + 1;
            if (var14 > 0 && class277.field4883[var14 - 1][var17] == 0 && (var19[var14 - 1][var17] & 0x12C010E) == 0 && (var19[var14 - 1][arg5 + var17 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= (arg5 - 1)) {
                        class195.field3499[var41] = var14 - 1;
                        class265.field4756[var41] = var17;
                        class277.field4883[var14 - 1][var17] = 2;
                        class50.field997[var14 - 1][var17] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var17 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class277.field4883[var14 + 1][var17] == 0 && (var19[var14 + arg5][var17] & 0x12C0183) == 0 && (var19[arg5 + var14][arg5 + var17 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg5 - 1 <= var33) {
                        class195.field3499[var41] = var14 + 1;
                        class265.field4756[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class277.field4883[var14 + 1][var17] = 8;
                        class50.field997[var14 + 1][var17] = var31;
                        break;
                    }
                    if ((var19[arg5 + var14][var17 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var17 > 0 && class277.field4883[var14][var17 - 1] == 0 && (var19[var14][var17 - 1] & 0x12C010E) == 0 && (var19[var14 + arg5 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if ((arg5 - 1) <= var34) {
                        class195.field3499[var41] = var14;
                        class265.field4756[var41] = var17 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class277.field4883[var14][var17 - 1] = 1;
                        class50.field997[var14][var17 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var17 < 102 && class277.field4883[var14][var17 + 1] == 0 && (var19[var14][arg5 + var17] & 0x12C0138) == 0 && (var19[arg5 + var14 - 1][arg5 + var17] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if ((arg5 - 1) <= var35) {
                        class195.field3499[var41] = var14;
                        class265.field4756[var41] = var17 + 1;
                        class277.field4883[var14][var17 + 1] = 4;
                        class50.field997[var14][var17 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var35][var17 + arg5] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var17 > 0 && class277.field4883[var14 - 1][var17 - 1] == 0 && (var19[var14 - 1][var17 + arg5 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var17 - 1] & 0x12C010E) == 0 && (var19[var14 + arg5 - 1 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= arg5 - 1) {
                        class195.field3499[var41] = var14 - 1;
                        class265.field4756[var41] = var17 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class277.field4883[var14 - 1][var17 - 1] = 3;
                        class50.field997[var14 - 1][var17 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var17 + var36 - 1] & 0x12C013E) != 0 || (var19[var36 + var14 - 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var17 > 0 && class277.field4883[var14 + 1][var17 - 1] == 0 && (var19[var14 + 1][var17 - 1] & 0x12C010E) == 0 && (var19[arg5 + var14][var17 - 1] & 0x12C0183) == 0 && (var19[arg5 + var14][var17 + arg5 - 2] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if ((arg5 - 1) <= var37) {
                        class195.field3499[var41] = var14 + 1;
                        class265.field4756[var41] = var17 - 1;
                        class277.field4883[var14 + 1][var17 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class50.field997[var14 + 1][var17 - 1] = var31;
                        break;
                    }
                    if ((var19[arg5 + var14][var17 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var17 < 102 && class277.field4883[var14 - 1][var17 + 1] == 0 && (var19[var14 - 1][var17 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var17 + arg5] & 0x12C0138) == 0 && (var19[var14][arg5 + var17] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg5 - 1) {
                        class195.field3499[var41] = var14 - 1;
                        class265.field4756[var41] = var17 + 1;
                        class277.field4883[var14 - 1][var17 + 1] = 6;
                        class50.field997[var14 - 1][var17 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var17 + var38 + 1] & 0x12C013E) != 0 || (var19[var38 + var14 - 1][var17 + arg5] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var17 < 102 && class277.field4883[var14 + 1][var17 + 1] == 0 && (var19[var14 + 1][arg5 + var17] & 0x12C0138) == 0 && (var19[arg5 + var14][arg5 + var17] & 0x12C01E0) == 0 && (var19[var14 + arg5][var17 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg5 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg5 + var17] & 0x12C01F8) != 0 || (var19[var14 + arg5][var17 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class195.field3499[var41] = var14 + 1;
                class265.field4756[var41] = var17 + 1;
                var41 = var41 + 1 & 0xFFF;
                class277.field4883[var14 + 1][var17 + 1] = 12;
                class50.field997[var14 + 1][var17 + 1] = var31;
            }
        }
        class48.field922 = 0;
        if (!arg12) {
            return false;
        }
        if (!var16) {
            if (!arg9) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg7 - var22; var23 <= arg7 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= (arg6 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class50.field997[var23][var24] < 100) {
                        int var25 = 0;
                        if (var24 < arg6) {
                            var25 = arg6 - var24;
                        } else if (var24 > arg6 + arg1 - 1) {
                            var25 = var24 + 1 - arg6 - arg1;
                        }
                        int var26 = 0;
                        if (var23 < arg7) {
                            var26 = arg7 - var23;
                        } else if (var23 > (arg0 + arg7 - 1)) {
                            var26 = var23 - (arg7 + arg0 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var21 > class50.field997[var23][var24]) {
                            var14 = var23;
                            var20 = var27;
                            var17 = var24;
                            var21 = class50.field997[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg3 == var14 && arg8 == var17) {
                return false;
            }
            class48.field922 = 1;
        }
        byte var28 = 0;
        class195.field3499[var28] = var14;
        int var42 = var28 + 1;
        class265.field4756[var28] = var17;
        int var29;
        int var30 = var29 = class277.field4883[var14][var17];
        while (arg3 != var14 || arg8 != var17) {
            if (var29 != var30) {
                class195.field3499[var42] = var14;
                var29 = var30;
                class265.field4756[var42++] = var17;
            }
            if ((var30 & 0x1) != 0) {
                var17++;
            } else if ((var30 & 0x4) != 0) {
                var17--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class277.field4883[var14][var17];
        }
        if (var42 > 0) {
            class124.method903(20948, arg11, var42);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public static final void method681(int arg0, int arg1, int arg2) {
        field1901++;
        if (arg2 <= -65) {
            class195 var3 = class178.method1229(arg1, 13, -125);
            var3.method1338(0);
            var3.field3511 = arg0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V")
    public static final void method682(boolean arg0) {
        class1.field20.method665(1);
        field1894++;
        if (!arg0) {
            method677(127, -2, -61, (byte) -2, 7, 56);
        }
    }
}
