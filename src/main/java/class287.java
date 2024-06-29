import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class287 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[Z")
    public static boolean[] field3778 = new boolean[100];

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lhq;")
    public static class365 field3780 = new class365(64);

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Z")
    public static boolean field3783 = false;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIZILg;III)Z", line = 8)
    public static final boolean method1829(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class366 arg7, int arg8, int arg9, int arg10) {
        field3781++;
        int var11 = arg1;
        int var12 = arg9;
        byte var13 = 64;
        if (arg5) {
            return false;
        }
        byte var14 = 64;
        int var15 = arg1 - var13;
        int var16 = arg9 - var14;
        class428.field5847[var13][var14] = 99;
        class402.field5587[var13][var14] = 0;
        byte var17 = 0;
        class11.field135[var17] = arg1;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class261.field3355[var10001] = arg9;
        int[][] var19 = arg7.field4977;
        while (var26 != var18) {
            var11 = class11.field135[var18];
            var12 = class261.field3355[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg7.field4982;
            int var23 = var12 - arg7.field4992;
            if (arg4 == -4) {
                if (arg2 == var11 && arg3 == var12) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class347.method2206(arg2, (byte) -73, var11, 2, arg10, arg8, arg3, var12, 2)) {
                    class150.field1760 = var11;
                    class252.field3300 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg7.method2300(true, arg3, arg2, var11, arg8, 2, arg10, 2, arg0, var12)) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg7.method2312(var12, arg0, 2, arg2, arg10, arg3, var11, -1063950782, arg8)) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg7.method2315((byte) 114, arg2, arg4, var12, arg3, 2, arg6, var11)) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg7.method2303(arg2, var12, arg4, arg6, 2048, 2, var11, arg3)) {
                class252.field3300 = var12;
                class150.field1760 = var11;
                return true;
            }
            int var25 = class402.field5587[var20][var21] + 1;
            if (var20 > 0 && class428.field5847[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class11.field135[var26] = var11 - 1;
                class261.field3355[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var20 - 1][var21] = 2;
                class402.field5587[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class428.field5847[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class11.field135[var26] = var11 + 1;
                class261.field3355[var26] = var12;
                class428.field5847[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class428.field5847[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class11.field135[var26] = var11;
                class261.field3355[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var20][var21 - 1] = 1;
                class402.field5587[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class428.field5847[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class11.field135[var26] = var11;
                class261.field3355[var26] = var12 + 1;
                class428.field5847[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class428.field5847[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class11.field135[var26] = var11 - 1;
                class261.field3355[var26] = var12 - 1;
                class428.field5847[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class428.field5847[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class11.field135[var26] = var11 + 1;
                class261.field3355[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var20 + 1][var21 - 1] = 9;
                class402.field5587[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class428.field5847[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class11.field135[var26] = var11 - 1;
                class261.field3355[var26] = var12 + 1;
                class428.field5847[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class428.field5847[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class11.field135[var26] = var11 + 1;
                class261.field3355[var26] = var12 + 1;
                class428.field5847[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var20 + 1][var21 + 1] = var25;
            }
        }
        class150.field1760 = var11;
        class252.field3300 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 365)
    public static final void method1830(int arg0) {
        class365 var1 = class263.field3379;
        synchronized (class263.field3379) {
            class263.field3379.method2298(0);
        }
        field3777++;
        if (arg0 < 38) {
            field3783 = true;
        }
        class365 var2 = class20.field219;
        synchronized (class20.field219) {
            class20.field219.method2298(0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 382)
    public static void method1831(int arg0) {
        if (arg0 != -31001) {
            method1832(-39L, 85);
        }
        field3780 = null;
        field3778 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)V", line = 397)
    public static final void method1832(long arg0, int arg1) {
        int var3 = 26 % ((arg1 + 12) / 51);
        field3779++;
        int var4 = class314.field4235 + class143.field1684.field1516;
        int var5 = class79.field968 + class143.field1684.field1514;
        if (class277.field3583 - var4 < -500 || (class277.field3583 - var4) > 500 || (class374.field5069 - var5) < -500 || (class374.field5069 - var5) > 500) {
            class374.field5069 = var5;
            class277.field3583 = var4;
        }
        if (class277.field3583 != var4) {
            int var6 = var4 - class277.field3583;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 > 0) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (var7 > var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = -1;
            } else if (var7 < var6) {
                var7 = var6;
            }
            class277.field3583 += var7;
        }
        if (class374.field5069 != var5) {
            int var8 = var5 - class374.field5069;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 > 0) {
                if (var9 == 0) {
                    var9 = 1;
                } else if (var9 > var8) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = -1;
            } else if (var9 < var8) {
                var9 = var8;
            }
            class374.field5069 += var9;
        }
        if (!class244.field3246) {
            class301.field4020 += (float) arg0 * class49.field571 / 6.0F;
            class434.field5929 += (float) arg0 * class288.field3792 / 6.0F;
        }
        class355.method2248(-21491);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Lhn;")
    public abstract class57 method629(byte arg0);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public abstract void method625(int arg0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Z")
    public abstract boolean method623(int arg0, int arg1);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public abstract void method630(int arg0);
}
