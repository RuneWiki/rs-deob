import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class60 {

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field999 = 0;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    public static int[] field998 = new int[50];

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lha;")
    private static class46 field1011 = class271.method1828("Walk here", -46);

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
    public static int[] field1012 = new int[1000];

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lha;")
    public static class46 field1003 = field1011;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
    public static boolean field997;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public static int[] field1006;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[[[B")
    public static byte[][][] field1001;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lha;[SBII)V")
    public static final void method402(class46[] arg0, short[] arg1, byte arg2, int arg3, int arg4) {
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            class46 var6 = arg0[var5];
            int var7 = arg3;
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var6;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var6 == null || arg0[var9] != null && arg0[var9].method333(var6, (byte) 5) < (var9 & 0x1)) {
                    class46 var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg0[arg4] = arg0[var7];
            arg0[var7] = var6;
            arg1[arg4] = arg1[var7];
            arg1[var7] = var8;
            method402(arg0, arg1, (byte) -86, arg3, var7 - 1);
            method402(arg0, arg1, (byte) -86, var7 + 1, arg4);
        }
        field1008++;
        if (arg2 != -86) {
            method411(-47);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method403(int arg0) {
        if (arg0 != 5) {
            field999 = -22;
        }
        field1000++;
        class89.field1692.method84(arg0 - 32382);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILwe;IIZIIBI)V")
    public static final void method404(int arg0, class75 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, byte arg7, int arg8) {
        field1002++;
        if (arg8 >= 0 && arg8 < 104 && arg2 >= 0 && arg2 < 104) {
            if (!arg4) {
                class111.field2081[arg5][arg8][arg2] = 0;
            }
            while (true) {
                int var9 = arg1.method558(arg7 ^ 0xFFFFFFA3);
                if (var9 == 0) {
                    if (arg4) {
                        class119.field2228[0][arg8][arg2] = class2.field33[0][arg8][arg2];
                    } else if (arg5 == 0) {
                        class119.field2228[0][arg8][arg2] = -class277.method1867(arg8 + arg6 + 932731, -76, 556238 - (-arg0 - arg2)) * 8;
                    } else {
                        class119.field2228[arg5][arg8][arg2] = class119.field2228[arg5 - 1][arg8][arg2] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg1.method558(1);
                    if (arg4) {
                        class119.field2228[0][arg8][arg2] = var10 * 8 + class2.field33[0][arg8][arg2];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg5 == 0) {
                            class119.field2228[0][arg8][arg2] = -var10 * 8;
                        } else {
                            class119.field2228[arg5][arg8][arg2] = class119.field2228[arg5 - 1][arg8][arg2] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class120.field2251[arg5][arg8][arg2] = arg1.method569((byte) -110);
                    class170.field3023[arg5][arg8][arg2] = (byte) ((var9 - 2) / 4);
                    class46.field807[arg5][arg8][arg2] = (byte) class50.method369(3, var9 + arg3 - 2);
                } else if (var9 > 81) {
                    class162.field2874[arg5][arg8][arg2] = (byte) (var9 - 81);
                } else if (!arg4) {
                    class111.field2081[arg5][arg8][arg2] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg1.method558(1);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg1.method558(arg7 ^ 0xFFFFFFA3);
                    break;
                }
                if (var11 <= 49) {
                    arg1.method558(1);
                }
            }
        }
        if (arg7 != -94) {
            method404(-88, (class75) null, 43, 47, true, -99, -9, (byte) -25, 53);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZII)V")
    public abstract void method405(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static final void method406(int arg0) {
        if (arg0 == 10499) {
            field996++;
            class23.field327.method84(arg0 - 42876);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static final void method407(int arg0) {
        if (arg0 < 39) {
            field1006 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class201.field3584[var1] = false;
        }
        class255.field4471 = -1;
        class113.field2150 = -1;
        class154.field2735 = 1;
        field1004++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method408(byte arg0) {
        if (arg0 < 3) {
            method411(-121);
        }
        field1011 = null;
        field1001 = null;
        field1012 = null;
        field998 = null;
        field1006 = null;
        field1003 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method409(int arg0, int arg1, int arg2, int arg3) {
        if (!class273.method1843(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class119.field2228[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class93.field1751) {
                    if (!class128.method993(var4, var6, var5)) {
                        return false;
                    }
                    if (!class128.method993(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class128.method993(var4, var7, var5)) {
                        return false;
                    }
                    if (!class128.method993(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class128.method993(var4, var8, var5)) {
                    return false;
                }
                if (!class128.method993(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class118.field2224) {
                    if (!class128.method993(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class128.method993(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class128.method993(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class128.method993(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class128.method993(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class128.method993(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class93.field1751) {
                    if (!class128.method993(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class128.method993(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class128.method993(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class128.method993(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class128.method993(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class128.method993(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class118.field2224) {
                    if (!class128.method993(var4, var6, var5)) {
                        return false;
                    }
                    if (!class128.method993(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class128.method993(var4, var7, var5)) {
                        return false;
                    }
                    if (!class128.method993(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class128.method993(var4, var8, var5)) {
                    return false;
                }
                if (!class128.method993(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class128.method993(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class128.method993(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class128.method993(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class128.method993(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class128.method993(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public abstract void method410(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static final void method411(int arg0) {
        if (arg0 != 128) {
            return;
        }
        while (class147.field2651.method294((byte) 123, class219.field3861) >= 27) {
            int var1 = class147.field2651.method283((byte) 0, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class2.field29[var1] == null) {
                class2.field29[var1] = new class26();
                var2 = true;
            }
            class26 var3 = class2.field29[var1];
            class33.field612[class51.field888++] = var1;
            var3.field2557 = class157.field2803;
            if (var3.field511 != null && var3.field511.method626(-25157)) {
                class174.method1250(var3, 1);
            }
            int var4 = class147.field2651.method283((byte) 0, 5);
            int var5 = class105.field1893[class147.field2651.method283((byte) 0, 3)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field2526 = var3.field2535 = var5;
            }
            int var6 = class147.field2651.method283((byte) 0, 5);
            int var7 = class147.field2651.method283((byte) 0, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.field511 = class156.method1152(class147.field2651.method283((byte) 0, 14), (byte) -128);
            int var8 = class147.field2651.method283((byte) 0, 1);
            if (var8 == 1) {
                class93.field1758[class111.field2082++] = var1;
            }
            var3.method1068(true, var3.field511.field1440);
            var3.field2529 = var3.field511.field1475;
            var3.field2550 = var3.field511.field1499;
            var3.field2568 = var3.field511.field1455;
            var3.field2561 = var3.field511.field1488;
            var3.field2541 = var3.field511.field1489;
            if (var3.field2568 == 0) {
                var3.field2535 = 0;
            }
            var3.field2531 = var3.field511.field1471;
            var3.field2559 = var3.field511.field1447;
            var3.field2553 = var3.field511.field1439;
            var3.method1069(class277.field4824.field2523[0] + var4, var3.method642(122), 0, class277.field4824.field2517[0] + var6, var7 == 1);
            if (var3.field511.method626(-25157)) {
                class66.method455((class236) null, (class81) null, arg0 - 128, class135.field2450, 0, var3, var3.field2523[0], var3.field2517[0]);
            }
        }
        class147.field2651.method289(-104);
        field1007++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)V")
    public abstract void method412(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V")
    public class60(int arg0, int arg1, int arg2) {
        this.field1005 = arg0;
        this.field1009 = arg1;
        this.field1010 = arg2;
    }
}
