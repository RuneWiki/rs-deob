import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class145 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field2562 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lke;")
    public static class256 field2561 = class316.method2202("compass", 27626);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field2566 = 0;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lrj;")
    public static class254 field2564 = new class254(16);

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[[I")
    public static int[][] field2567 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I", line = 13)
    public static final int method1060(int arg0, int arg1) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field2565++;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != 4158) {
            field2561 = (class256) null;
        }
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var18 >>= 0x4;
        } else if (var22 > 217) {
            var18 >>= 0x3;
        } else if (var22 > 192) {
            var18 >>= 0x2;
        } else if (var22 > 179) {
            var18 >>= 0x1;
        }
        return (var22 >> 1) + (var18 >> 5 << 7) + (var21 >> 2 << 10);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V", line = 113)
    public static final void method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2563++;
        for (int var6 = arg5; var6 <= arg3 + arg5; var6++) {
            for (int var7 = arg4; var7 <= arg2 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class249.field4234[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg5; var8 < arg3 + arg5; var8++) {
            for (int var9 = arg4; var9 < (arg2 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class118.field2090[arg1][var9][var8] = arg1 <= 0 ? 0 : class118.field2090[arg1 - 1][var9][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var10 = arg5 + 1; var10 < (arg3 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class118.field2090[arg1][arg4][var10] = class118.field2090[arg1][arg4 - 1][var10];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var11 = arg4 + 1; var11 < (arg2 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class118.field2090[arg1][var11][arg5] = class118.field2090[arg1][var11][arg5 - 1];
                }
            }
        }
        if (arg4 < arg0 || arg5 < 0 || arg4 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 > 0 && class118.field2090[arg1][arg4 - 1][arg5] != 0) {
                class118.field2090[arg1][arg4][arg5] = class118.field2090[arg1][arg4 - 1][arg5];
            } else if (arg5 > 0 && class118.field2090[arg1][arg4][arg5 - 1] != 0) {
                class118.field2090[arg1][arg4][arg5] = class118.field2090[arg1][arg4][arg5 - 1];
            } else if (arg4 > 0 && arg5 > 0 && class118.field2090[arg1][arg4 - 1][arg5 - 1] != 0) {
                class118.field2090[arg1][arg4][arg5] = class118.field2090[arg1][arg4 - 1][arg5 - 1];
            }
        } else if (arg4 > 0 && class118.field2090[arg1 - 1][arg4 - 1][arg5] != class118.field2090[arg1][arg4 - 1][arg5]) {
            class118.field2090[arg1][arg4][arg5] = class118.field2090[arg1][arg4 - 1][arg5];
        } else if (arg5 > 0 && class118.field2090[arg1][arg4][arg5 - 1] != class118.field2090[arg1 - 1][arg4][arg5 - 1]) {
            class118.field2090[arg1][arg4][arg5] = class118.field2090[arg1][arg4][arg5 - 1];
        } else if (arg4 > 0 && arg5 > 0 && class118.field2090[arg1][arg4 - 1][arg5 - 1] != class118.field2090[arg1 - 1][arg4 - 1][arg5 - 1]) {
            class118.field2090[arg1][arg4][arg5] = class118.field2090[arg1][arg4 - 1][arg5 - 1];
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 234)
    public static void method1062(boolean arg0) {
        field2564 = null;
        field2567 = (int[][]) null;
        if (arg0) {
            method1062(true);
        }
        field2561 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)Z", line = 259)
    public static final boolean method1063(int arg0, int arg1, int arg2, int arg3) {
        if (!class233.method1582(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class118.field2090[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class310.field5346) {
                    if (!class101.method732(var4, var6, var5)) {
                        return false;
                    }
                    if (!class101.method732(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class101.method732(var4, var7, var5)) {
                        return false;
                    }
                    if (!class101.method732(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class101.method732(var4, var8, var5)) {
                    return false;
                }
                if (!class101.method732(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class271.field4623) {
                    if (!class101.method732(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class101.method732(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class101.method732(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class101.method732(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class101.method732(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class101.method732(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class310.field5346) {
                    if (!class101.method732(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class101.method732(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class101.method732(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class101.method732(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class101.method732(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class101.method732(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class271.field4623) {
                    if (!class101.method732(var4, var6, var5)) {
                        return false;
                    }
                    if (!class101.method732(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class101.method732(var4, var7, var5)) {
                        return false;
                    }
                    if (!class101.method732(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class101.method732(var4, var8, var5)) {
                    return false;
                }
                if (!class101.method732(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class101.method732(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class101.method732(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class101.method732(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class101.method732(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class101.method732(var4, var8, var5);
        } else {
            return true;
        }
    }
}
