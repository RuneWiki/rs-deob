import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class237 {

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public int field3331 = 0;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field3332 = 70;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Ljava/lang/String;")
    private String field3338 = "";

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    private int field3326 = -1;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field3341 = -1;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    private int field3342 = -1;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field3344 = -1;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field3345 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public int field3334 = -1;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public int field3339 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    private int field3327 = -1;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field3348 = 16777215;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    private int field3346 = -1;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lae;")
    public class254 field3347;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lee;B)V", line = 6)
    public final void method1488(class677 arg0, byte arg1) {
        if (arg1 < 14) {
            this.field3338 = null;
        }
        field3336++;
        while (true) {
            int var3 = arg0.method3821((byte) -56);
            if (var3 == 0) {
                return;
            }
            this.method1489(arg0, (byte) -101, var3);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lee;BI)V", line = 27)
    private final void method1489(class677 arg0, byte arg1, int arg2) {
        field3325++;
        if (arg2 == 1) {
            this.field3334 = arg0.method3807(-1);
        } else if (arg2 == 2) {
            this.field3348 = arg0.method3833(255);
        } else if (arg2 == 3) {
            this.field3346 = arg0.method3807(-1);
        } else if (arg2 == 4) {
            this.field3326 = arg0.method3807(-1);
        } else if (arg2 == 5) {
            this.field3342 = arg0.method3807(-1);
        } else if (arg2 == 6) {
            this.field3327 = arg0.method3807(-1);
        } else if (arg2 == 7) {
            this.field3339 = arg0.method3771((byte) -10);
        } else if (arg2 == 8) {
            this.field3338 = arg0.method3824(-123);
        } else if (arg2 == 9) {
            this.field3332 = arg0.method3807(-1);
        } else if (arg2 == 10) {
            this.field3331 = arg0.method3771((byte) -10);
        } else if (arg2 == 11) {
            this.field3344 = 0;
        } else if (arg2 == 12) {
            this.field3341 = arg0.method3821((byte) 123);
        } else if (arg2 == 13) {
            this.field3345 = arg0.method3771((byte) -10);
        } else if (arg2 == 14) {
            this.field3344 = arg0.method3807(-1);
        }
        int var4 = -101 % ((arg1 - 68) / 44);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILha;)Lhu;", line = 101)
    public final class133 method1490(int arg0, class59 arg1) {
        field3333++;
        if (arg0 < ~this.field3346) {
            return null;
        }
        class133 var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3346);
        if (var3 == null) {
            this.method1491(arg1, false);
            var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3346);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lha;Z)V", line = 132)
    private final void method1491(class59 arg0, boolean arg1) {
        field3343++;
        class376 var3 = this.field3347.field3490;
        if (this.field3346 >= 0 && this.field3347.field3496.method552(4, (long) this.field3346) == null && var3.method2216(this.field3346, -75)) {
            class720 var4 = class720.method4037(var3, this.field3346);
            this.field3347.field3496.method556((byte) 0, (long) this.field3346, arg0.method415(var4, true));
        }
        if (this.field3342 >= 0 && this.field3347.field3496.method552(4, (long) this.field3342) == null && var3.method2216(this.field3342, 123)) {
            class720 var5 = class720.method4037(var3, this.field3342);
            this.field3347.field3496.method556((byte) 0, (long) this.field3342, arg0.method415(var5, true));
        }
        if (arg1) {
            this.method1488(null, (byte) 28);
        }
        if (this.field3326 >= 0 && this.field3347.field3496.method552(4, (long) this.field3326) == null && var3.method2216(this.field3326, -86)) {
            class720 var6 = class720.method4037(var3, this.field3326);
            this.field3347.field3496.method556((byte) 0, (long) this.field3326, arg0.method415(var6, true));
        }
        if (this.field3327 >= 0 && this.field3347.field3496.method552(4, (long) this.field3327) == null && var3.method2216(this.field3327, 88)) {
            class720 var7 = class720.method4037(var3, this.field3327);
            this.field3347.field3496.method556((byte) 0, (long) this.field3327, arg0.method415(var7, true));
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLha;)Lhu;", line = 193)
    public final class133 method1492(boolean arg0, class59 arg1) {
        field3328++;
        if (this.field3342 < 0) {
            return null;
        }
        class133 var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3342);
        if (var3 == null) {
            this.method1491(arg1, false);
            var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3342);
        }
        if (!arg0) {
            this.method1490(-47, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILha;)Lhu;", line = 219)
    public final class133 method1493(int arg0, class59 arg1) {
        field3330++;
        if (~this.field3326 > arg0) {
            return null;
        }
        class133 var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3326);
        if (var3 == null) {
            this.method1491(arg1, false);
            var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3326);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)J", line = 247)
    public static final long method1494(boolean arg0) {
        field3340++;
        return arg0 ? class238.field3352.method1094(-21571) : -77L;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BIIIIBI[B)V", line = 265)
    public static final void method1495(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, byte[] arg8) {
        field3324++;
        if (arg6 != -108) {
            return;
        }
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg3++];
                int var14 = arg0++;
                arg8[var14] += arg1[arg3++];
                int var15 = arg0++;
                arg8[var15] += arg1[arg3++];
                int var16 = arg0++;
                arg8[var16] += arg1[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg3++];
            }
            arg3 += arg7;
            arg0 += arg5;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 328)
    public final String method1496(byte arg0, int arg1) {
        field3329++;
        String var3 = this.field3338;
        if (arg0 != 43) {
            this.field3347 = null;
        }
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class684.method3860(arg1, false, (byte) -67) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lha;I)Lhu;", line = 362)
    public final class133 method1497(class59 arg0, int arg1) {
        field3337++;
        if (this.field3327 < 0) {
            return null;
        }
        if (arg1 >= -55) {
            this.field3327 = 73;
        }
        class133 var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3327);
        if (var3 == null) {
            this.method1491(arg0, false);
            var3 = (class133) this.field3347.field3496.method552(4, (long) this.field3327);
        }
        return var3;
    }
}
