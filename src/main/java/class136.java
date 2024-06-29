import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class136 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljn;")
    public static class409 field1859 = new class409("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    public static int[] field1868 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1866 = 0;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lct;")
    public static class104 field1865;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public int[] field1857;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[Lae;")
    public static class285[] field1870;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIII)V")
    public static final void method903(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 39) {
            return;
        }
        field1861++;
        if (arg5 > class146.field1978 || class248.field3659 > arg4) {
            return;
        }
        boolean var6;
        if (class9.field128 > arg0) {
            arg0 = class9.field128;
            var6 = false;
        } else if (class63.field838 < arg0) {
            var6 = false;
            arg0 = class63.field838;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class9.field128 > arg3) {
            var7 = false;
            arg3 = class9.field128;
        } else if (class63.field838 >= arg3) {
            var7 = true;
        } else {
            var7 = false;
            arg3 = class63.field838;
        }
        if (arg5 < class248.field3659) {
            arg5 = class248.field3659;
        } else {
            class381.method2419((byte) 15, arg1, arg0, class323.field4774[arg5++], arg3);
        }
        if (class146.field1978 < arg4) {
            arg4 = class146.field1978;
        } else {
            class381.method2419((byte) 92, arg1, arg0, class323.field4774[arg4--], arg3);
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg4; var8++) {
                int[] var9 = class323.field4774[var8];
                var9[arg0] = var9[arg3] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg5; var10 <= arg4; var10++) {
                class323.field4774[var10][arg0] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg5; var11 <= arg4; var11++) {
                class323.field4774[var11][arg3] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILva;IIZ)V")
    public static final void method904(int arg0, class58 arg1, int arg2, int arg3, boolean arg4) {
        field1858++;
        class446 var5 = arg1.method450(0);
        if (!arg4) {
            field1870 = null;
        }
        int var6 = arg1.field752 - arg1.field705.field3724 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg1.field768 > 25) {
                arg1.field719 = false;
                if (arg2 < 0 && var5.field6501 != -1) {
                    arg1.field706 = var5.field6501;
                } else if (arg2 <= 0 || var5.field6526 == -1) {
                    arg1.field706 = var5.field6520;
                } else {
                    arg1.field706 = var5.field6526;
                }
            } else if (!arg1.field719 || !var5.method2743(arg1.field706, -128)) {
                arg1.field706 = var5.method2747(9999);
                arg1.field719 = arg1.field706 != -1;
            }
        } else if (arg1.field709 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class323.field4767[arg0] - arg1.field705.field3724 & 0x3FFF;
            if (arg3 == 2 && var5.field6484 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6499 != -1) {
                    arg1.field706 = var5.field6499;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6537 != -1) {
                    arg1.field706 = var5.field6537;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6486 == -1) {
                    arg1.field706 = var5.field6484;
                } else {
                    arg1.field706 = var5.field6486;
                }
            } else if (arg3 == 0 && var5.field6504 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6503 != -1) {
                    arg1.field706 = var5.field6503;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6505 != -1) {
                    arg1.field706 = var5.field6505;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6498 == -1) {
                    arg1.field706 = var5.field6504;
                } else {
                    arg1.field706 = var5.field6498;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6529 != -1) {
                arg1.field706 = var5.field6529;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6485 != -1) {
                arg1.field706 = var5.field6485;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6510 == -1) {
                arg1.field706 = var5.field6520;
            } else {
                arg1.field706 = var5.field6510;
            }
            arg1.field719 = false;
        } else if (var6 == 0 && arg1.field768 <= 25) {
            if (arg3 == 2 && var5.field6484 != -1) {
                arg1.field706 = var5.field6484;
            } else if (arg3 == 0 && var5.field6504 != -1) {
                arg1.field706 = var5.field6504;
            } else {
                arg1.field706 = var5.field6520;
            }
            arg1.field719 = false;
        } else {
            if (arg3 == 2 && var5.field6484 != -1) {
                if (arg2 < 0 && var5.field6489 != -1) {
                    arg1.field706 = var5.field6489;
                } else if (arg2 <= 0 || var5.field6515 == -1) {
                    arg1.field706 = var5.field6484;
                } else {
                    arg1.field706 = var5.field6515;
                }
            } else if (arg3 == 0 && var5.field6504 != -1) {
                if (arg2 < 0 && var5.field6492 != -1) {
                    arg1.field706 = var5.field6492;
                } else if (arg2 <= 0 || var5.field6527 == -1) {
                    arg1.field706 = var5.field6504;
                } else {
                    arg1.field706 = var5.field6527;
                }
            } else if (arg2 < 0 && var5.field6512 != -1) {
                arg1.field706 = var5.field6512;
            } else if (arg2 <= 0 || var5.field6525 == -1) {
                arg1.field706 = var5.field6520;
            } else {
                arg1.field706 = var5.field6525;
            }
            arg1.field719 = false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method905(int arg0) {
        field1865 = null;
        field1859 = null;
        field1868 = null;
        if (arg0 == -1) {
            field1870 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)I")
    public static final int method906(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg2 != 0) {
            field1862 = -97;
        }
        field1855++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method858(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public abstract void method860(int arg0, Graphics arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public abstract void method859(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZI)Z")
    public static final boolean method907(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            method908(-57, 90, 35, true);
        }
        field1864++;
        if ((class131.field1790[0][arg0][arg1] & 0x2) != 0) {
            return true;
        } else if ((class131.field1790[arg2][arg0][arg1] & 0x10) == 0) {
            return arg4 == class367.method2338(arg0, (byte) 116, arg2, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V")
    public static final void method908(int arg0, int arg1, int arg2, boolean arg3) {
        field1860++;
        class131.field1790 = new byte[arg1][arg0][arg2];
        if (!arg3) {
            method907(67, 88, 56, true, 94);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILth;IIIIIBIII)Z")
    public static final boolean method909(int arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field1871++;
        int var11 = arg2;
        int var12 = arg8;
        byte var13 = 64;
        if (arg7 >= -116) {
            field1868 = null;
        }
        byte var14 = 64;
        int var15 = arg2 - var13;
        class157.field2117[var13][var14] = 99;
        int var16 = arg8 - var14;
        class443.field6448[var13][var14] = 0;
        byte var17 = 0;
        class464.field6840[var17] = arg2;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class147.field1990[var10001] = arg8;
        int[][] var19 = arg1.field2408;
        while (var26 != var18) {
            var12 = class147.field1990[var18];
            var11 = class464.field6840[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - arg1.field2419;
            int var21 = var12 - var16;
            int var22 = var11 - var15;
            int var23 = var12 - arg1.field2400;
            if (arg0 == -4) {
                if (arg9 == var11 && arg6 == var12) {
                    class106.field1431 = var11;
                    class369.field5349 = var12;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class100.method659(var12, (byte) -36, arg6, var11, arg10, arg3, 1, 1, arg9)) {
                    class106.field1431 = var11;
                    class369.field5349 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg1.method1214(arg3, var11, arg10, var12, -111, 1, arg6, arg9, 1, arg5)) {
                    class106.field1431 = var11;
                    class369.field5349 = var12;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg1.method1203(var11, arg5, arg3, arg6, var12, 1, (byte) -128, arg10, arg9)) {
                    class106.field1431 = var11;
                    class369.field5349 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg1.method1207(arg0, arg4, var11, 1, arg6, -1, var12, arg9)) {
                    class106.field1431 = var11;
                    class369.field5349 = var12;
                    return true;
                }
            } else if (arg1.method1204((byte) -30, arg4, 1, var12, arg9, var11, arg0, arg6)) {
                class106.field1431 = var11;
                class369.field5349 = var12;
                return true;
            }
            int var25 = class443.field6448[var22][var21] + 1;
            if (var22 > 0 && class157.field2117[var22 - 1][var21] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class464.field6840[var26] = var11 - 1;
                class147.field1990[var26] = var12;
                class157.field2117[var22 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var22 - 1][var21] = var25;
            }
            if (var22 < 127 && class157.field2117[var22 + 1][var21] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class464.field6840[var26] = var11 + 1;
                class147.field1990[var26] = var12;
                class157.field2117[var22 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var22 + 1][var21] = var25;
            }
            if (var21 > 0 && class157.field2117[var22][var21 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class464.field6840[var26] = var11;
                class147.field1990[var26] = var12 - 1;
                class157.field2117[var22][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var22][var21 - 1] = var25;
            }
            if (var21 < 127 && class157.field2117[var22][var21 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class464.field6840[var26] = var11;
                class147.field1990[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var22][var21 + 1] = 4;
                class443.field6448[var22][var21 + 1] = var25;
            }
            if (var22 > 0 && var21 > 0 && class157.field2117[var22 - 1][var21 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class464.field6840[var26] = var11 - 1;
                class147.field1990[var26] = var12 - 1;
                class157.field2117[var22 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var22 - 1][var21 - 1] = var25;
            }
            if (var22 < 127 && var21 > 0 && class157.field2117[var22 + 1][var21 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class464.field6840[var26] = var11 + 1;
                class147.field1990[var26] = var12 - 1;
                class157.field2117[var22 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class443.field6448[var22 + 1][var21 - 1] = var25;
            }
            if (var22 > 0 && var21 < 127 && class157.field2117[var22 - 1][var21 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class464.field6840[var26] = var11 - 1;
                class147.field1990[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var22 - 1][var21 + 1] = 6;
                class443.field6448[var22 - 1][var21 + 1] = var25;
            }
            if (var22 < 127 && var21 < 127 && class157.field2117[var22 + 1][var21 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class464.field6840[var26] = var11 + 1;
                class147.field1990[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class157.field2117[var22 + 1][var21 + 1] = 12;
                class443.field6448[var22 + 1][var21 + 1] = var25;
            }
        }
        class369.field5349 = var12;
        class106.field1431 = var11;
        return false;
    }
}
