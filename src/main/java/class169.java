import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class169 {

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lqs;")
    public class359 field2358 = new class359();

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Lae;")
    public static class135 field2360 = new class135(5000);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "Lqs;")
    private class359 field2371;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Lqs;")
    public final class359 method1112(int arg0) {
        field2368++;
        class359 var2 = this.field2358.field5243;
        if (arg0 != -1) {
            return null;
        } else if (this.field2358 == var2) {
            return null;
        } else {
            var2.method2290((byte) 98);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1113(int arg0) {
        if (arg0 >= -26) {
            method1114(124, 74, -87, 92, -65, (byte) 73);
        }
        field2360 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2359++;
        if (arg5 != -93) {
            field2360 = null;
        }
        for (int var6 = arg4; var6 < arg0 + arg4; var6++) {
            for (int var9 = arg2; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && class279.field3935 > var9 && var6 >= 0 && class164.field2287 > var6) {
                    class30.field278[arg1][var9][var6] = arg1 > 0 ? class30.field278[arg1 - 1][var9][var6] - 240 : 0;
                }
            }
        }
        if (arg2 > 0 && class279.field3935 > arg2) {
            for (int var7 = arg4 + 1; var7 < arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < class164.field2287) {
                    class30.field278[arg1][arg2][var7] = class30.field278[arg1][arg2 - 1][var7];
                }
            }
        }
        if (arg4 > 0 && class164.field2287 > arg4) {
            for (int var8 = arg2 + 1; var8 < arg2 + arg3; var8++) {
                if (var8 >= 0 && class279.field3935 > var8) {
                    class30.field278[arg1][var8][arg4] = class30.field278[arg1][var8][arg4 - 1];
                }
            }
        }
        if (arg2 < 0 || arg4 < 0 || class279.field3935 <= arg2 || arg4 >= class164.field2287) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 <= 0 || class30.field278[arg1][arg2 - 1][arg4] == 0) {
                if (arg4 > 0 && class30.field278[arg1][arg2][arg4 - 1] != 0) {
                    class30.field278[arg1][arg2][arg4] = class30.field278[arg1][arg2][arg4 - 1];
                    return;
                }
                if (arg2 > 0 && arg4 > 0 && class30.field278[arg1][arg2 - 1][arg4 - 1] != 0) {
                    class30.field278[arg1][arg2][arg4] = class30.field278[arg1][arg2 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            class30.field278[arg1][arg2][arg4] = class30.field278[arg1][arg2 - 1][arg4];
        } else if (arg2 <= 0 || class30.field278[arg1 - 1][arg2 - 1][arg4] == class30.field278[arg1][arg2 - 1][arg4]) {
            if (arg4 > 0 && class30.field278[arg1 - 1][arg2][arg4 - 1] != class30.field278[arg1][arg2][arg4 - 1]) {
                class30.field278[arg1][arg2][arg4] = class30.field278[arg1][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && class30.field278[arg1 - 1][arg2 - 1][arg4 - 1] != class30.field278[arg1][arg2 - 1][arg4 - 1]) {
                class30.field278[arg1][arg2][arg4] = class30.field278[arg1][arg2 - 1][arg4 - 1];
                return;
            }
        } else {
            class30.field278[arg1][arg2][arg4] = class30.field278[arg1][arg2 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lvn;B)V")
    public final void method1115(class169 arg0, byte arg1) {
        this.method1121(this.field2358.field5243, false, arg0);
        field2364++;
        if (arg1 >= -38) {
            this.method1121((class359) null, true, (class169) null);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public final void method1116(byte arg0) {
        while (true) {
            class359 var2 = this.field2358.field5243;
            if (this.field2358 == var2) {
                field2355++;
                this.field2371 = null;
                int var3 = -116 / ((arg0 + 60) / 62);
                return;
            }
            var2.method2290((byte) 98);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)Lqs;")
    public final class359 method1117(byte arg0) {
        field2372++;
        class359 var2 = this.field2358.field5247;
        if (this.field2358 == var2) {
            this.field2371 = null;
            return null;
        }
        this.field2371 = var2.field5247;
        if (arg0 > -80) {
            field2357 = 74;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Lgp;")
    public static final class31 method1118(byte arg0, int arg1) {
        if (arg0 != -111) {
            field2373 = -83;
        }
        field2369++;
        if (arg1 == 0) {
            if ((double) class106.field1209 == 3.0D) {
                return class130.field1801;
            }
            if ((double) class106.field1209 == 4.0D) {
                return class81.field924;
            }
            if ((double) class106.field1209 == 6.0D) {
                return class157.field2232;
            }
            if ((double) class106.field1209 >= 8.0D) {
                return class45.field550;
            }
        } else if (arg1 == 1) {
            if ((double) class106.field1209 == 3.0D) {
                return class157.field2232;
            }
            if ((double) class106.field1209 == 4.0D) {
                return class45.field550;
            }
            if ((double) class106.field1209 == 6.0D) {
                return class148.field2078;
            }
            if ((double) class106.field1209 >= 8.0D) {
                return class417.field5985;
            }
        } else if (arg1 == 2) {
            if ((double) class106.field1209 == 3.0D) {
                return class148.field2078;
            }
            if ((double) class106.field1209 == 4.0D) {
                return class417.field5985;
            }
            if ((double) class106.field1209 == 6.0D) {
                return class366.field5351;
            }
            if ((double) class106.field1209 >= 8.0D) {
                return class393.field5747;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Lqs;")
    public final class359 method1119(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2365++;
        class359 var2 = this.field2371;
        if (this.field2358 == var2) {
            this.field2371 = null;
            return null;
        } else {
            this.field2371 = var2.field5243;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Lqs;")
    public final class359 method1120(int arg0) {
        if (arg0 != 5000) {
            this.field2358 = null;
        }
        field2370++;
        class359 var2 = this.field2371;
        if (this.field2358 == var2) {
            this.field2371 = null;
            return null;
        } else {
            this.field2371 = var2.field5247;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lqs;ZLvn;)V")
    private final void method1121(class359 arg0, boolean arg1, class169 arg2) {
        field2361++;
        class359 var4 = this.field2358.field5247;
        this.field2358.field5247 = arg0.field5247;
        if (arg1) {
            this.method1123((byte) 24, (class359) null);
        }
        arg0.field5247.field5243 = this.field2358;
        if (this.field2358 != arg0) {
            arg0.field5247 = arg2.field2358.field5247;
            arg0.field5247.field5243 = arg0;
            arg2.field2358.field5247 = var4;
            var4.field5243 = arg2.field2358;
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
    public final boolean method1122(int arg0) {
        field2367++;
        if (arg0 == -5874) {
            return this.field2358.field5243 == this.field2358;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLqs;)V")
    public final void method1123(byte arg0, class359 arg1) {
        if (arg0 != 126) {
            return;
        }
        field2354++;
        if (arg1.field5247 != null) {
            arg1.method2290((byte) 98);
        }
        arg1.field5247 = this.field2358;
        arg1.field5243 = this.field2358.field5243;
        arg1.field5247.field5243 = arg1;
        arg1.field5243.field5247 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)Lqs;")
    public final class359 method1124(int arg0) {
        field2362++;
        class359 var2 = this.field2358.field5243;
        if (this.field2358 == var2) {
            this.field2371 = null;
            return null;
        }
        if (arg0 != -1) {
            field2357 = -105;
        }
        this.field2371 = var2.field5243;
        return var2;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILqs;)V")
    public final void method1125(int arg0, class359 arg1) {
        if (arg1.field5247 != null) {
            arg1.method2290((byte) 98);
        }
        field2366++;
        arg1.field5247 = this.field2358.field5247;
        if (arg0 == -1) {
            arg1.field5243 = this.field2358;
            arg1.field5247.field5243 = arg1;
            arg1.field5243.field5247 = arg1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)I")
    public final int method1126(byte arg0) {
        field2356++;
        if (arg0 <= 117) {
            field2360 = null;
        }
        int var2 = 0;
        class359 var3 = this.field2358.field5243;
        while (this.field2358 != var3) {
            var3 = var3.field5243;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
    public class169() {
        this.field2358.field5243 = this.field2358;
        this.field2358.field5247 = this.field2358;
    }
}
