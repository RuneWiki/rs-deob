import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lam;")
    public static class180 field213 = new class180();

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[S")
    public static short[] field214 = new short[256];

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field215 = "Loaded textures";

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lhc;")
    public static class235 field211;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method111(int arg0) {
        field215 = null;
        field214 = null;
        field211 = null;
        if (arg0 == 128) {
            field213 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method112(int arg0, int arg1, int arg2, int arg3) {
        if (!class268.method1805(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class66.field1107[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class6.field127) {
                    if (!class162.method1104(var4, var6, var5)) {
                        return false;
                    }
                    if (!class162.method1104(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class162.method1104(var4, var7, var5)) {
                        return false;
                    }
                    if (!class162.method1104(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class162.method1104(var4, var8, var5)) {
                    return false;
                }
                if (!class162.method1104(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class193.field3029) {
                    if (!class162.method1104(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class162.method1104(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class162.method1104(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class162.method1104(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class162.method1104(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class162.method1104(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class6.field127) {
                    if (!class162.method1104(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class162.method1104(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class162.method1104(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class162.method1104(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class162.method1104(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class162.method1104(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class193.field3029) {
                    if (!class162.method1104(var4, var6, var5)) {
                        return false;
                    }
                    if (!class162.method1104(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class162.method1104(var4, var7, var5)) {
                        return false;
                    }
                    if (!class162.method1104(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class162.method1104(var4, var8, var5)) {
                    return false;
                }
                if (!class162.method1104(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class162.method1104(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class162.method1104(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class162.method1104(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class162.method1104(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class162.method1104(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class143.field2192[arg0][var8][var14] == -class297.field4689) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class66.field1107[arg0][arg1][arg3] + arg5;
            if (!class162.method1104(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class162.method1104(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class162.method1104(var9, var11, var13)) {
                return false;
            } else if (class162.method1104(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class268.method1805(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class162.method1104(var6 + 1, class66.field1107[arg0][arg1][arg3] + arg5, var7 + 1) && class162.method1104(var6 + 128 - 1, class66.field1107[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class162.method1104(var6 + 128 - 1, class66.field1107[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class162.method1104(var6 + 1, class66.field1107[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
