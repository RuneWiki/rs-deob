import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class145 {

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Ltl;")
    private static class59 field2376 = class85.method639("Loading textures )2 ", 9588);

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Ltl;")
    public static class59 field2379 = field2376;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lj;")
    public static class138 field2373 = new class138(64);

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "Ltl;")
    public static class59 field2381 = class85.method639("::fpsoff", 9588);

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Ltl;")
    public static class59 field2382 = class85.method639("Loaded titlescreen)3", 9588);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Li;")
    public static class305 field2380;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)[Lhi;", line = 5)
    public static final class189[] method1050(byte arg0) {
        class189[] var1 = new class189[class306.field5183];
        for (int var2 = 0; var2 < class306.field5183; var2++) {
            if (class55.field815) {
                var1[var2] = new class302(class300.field5123, class165.field2680, class243.field4061[var2], class311.field5274[var2], class41.field615[var2], class236.field3925[var2], class53.field794[var2], class284.field4879);
            } else {
                var1[var2] = new class5(class300.field5123, class165.field2680, class243.field4061[var2], class311.field5274[var2], class41.field615[var2], class236.field3925[var2], class53.field794[var2], class284.field4879);
            }
        }
        int var3 = -41 / ((-arg0 - 54) / 45);
        class133.method974((byte) -84);
        field2371++;
        return var1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 32)
    public static void method1051(int arg0) {
        field2379 = null;
        field2381 = null;
        if (arg0 != 0) {
            method1056((byte) -107, (class287) null, (class287) null);
        }
        field2380 = null;
        field2376 = null;
        field2373 = null;
        field2382 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I", line = 53)
    public static final int method1052(int arg0, int arg1) {
        field2378++;
        double var2 = (double) ((arg1 & 0xFF2BC7) >> 16) / 256.0D;
        if (arg0 != 16416) {
            field2373 = (class138) null;
        }
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        double var12 = 0.0D;
        if (var2 > var4) {
            var10 = var4;
        }
        if (var2 < var4) {
            var8 = var4;
        }
        double var14 = 0.0D;
        if (var6 < var10) {
            var10 = var6;
        }
        if (var8 < var6) {
            var8 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var12 = (var8 - var10) / (var8 + var10);
            }
            if (var2 == var8) {
                var14 = (var4 - var6) / (var8 - var10);
            } else if (var4 == var8) {
                var14 = (var6 - var2) / (var8 - var10) + 2.0D;
            } else if (var6 == var8) {
                var14 = (var2 - var4) / (var8 - var10) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var12 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        int var18 = (int) (var12 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var14 / 6.0D;
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var21 > 243) {
            var18 >>= 0x4;
        } else if (var21 > 217) {
            var18 >>= 0x3;
        } else if (var21 > 192) {
            var18 >>= 0x2;
        } else if (var21 > 179) {
            var18 >>= 0x1;
        }
        int var22 = (int) (var19 * 256.0D);
        return (var21 >> 1) + (var18 >> 5 << 7) + (var22 >> 2 << 10);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIILfg;IJ)Z", line = 155)
    public static final boolean method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class176 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class12.method82(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)[Llj;", line = 172)
    public static final class5[] method1054(byte arg0) {
        if (arg0 != -99) {
            field2373 = (class138) null;
        }
        field2377++;
        class5[] var1 = new class5[class306.field5183];
        for (int var2 = 0; var2 < class306.field5183; var2++) {
            var1[var2] = new class5(class300.field5123, class165.field2680, class243.field4061[var2], class311.field5274[var2], class41.field615[var2], class236.field3925[var2], class53.field794[var2], class284.field4879);
        }
        class133.method974((byte) -86);
        return var1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILma;)Z", line = 206)
    public static final boolean method1055(int arg0, class263 arg1) {
        field2374++;
        if (arg1.field4437 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != 4) {
            return true;
        }
        while (var2 < arg1.field4437.length) {
            int var3 = class85.method643(4365, arg1, var2);
            int var4 = arg1.field4423[var2];
            if (arg1.field4437[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4437[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field4437[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLhf;Lhf;)V", line = 264)
    public static final void method1056(byte arg0, class287 arg1, class287 arg2) {
        field2372++;
        if (arg1.field4941 != null) {
            arg1.method2000(127);
        }
        arg1.field4939 = arg2;
        arg1.field4941 = arg2.field4941;
        if (arg0 <= -45) {
            arg1.field4941.field4939 = arg1;
            arg1.field4939.field4941 = arg1;
        }
    }
}
