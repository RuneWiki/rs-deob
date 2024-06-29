import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class140 extends class17 {

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Lmb;")
    public static class84 field3356 = class79.method672(true, "null");

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "Lmb;")
    public static class84 field3362 = class79.method672(true, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Lmb;")
    public static class84 field3363 = class79.method672(true, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Lmb;")
    public static class84 field3365 = class79.method672(true, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field3359 = 127;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Lmb;")
    public class84 field3364;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I")
    public static final int method1135(int arg0, byte arg1, int arg2) {
        field3361++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 0) {
                arg0 = 0;
            } else if (arg0 > 127) {
                arg0 = 127;
            }
            return 127 - arg0;
        } else {
            int var4 = (arg2 & 0x7F) * arg0 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            if (arg1 != -82) {
                method1135(-39, (byte) -48, 67);
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V")
    public static void method1136(boolean arg0) {
        field3362 = null;
        field3356 = null;
        field3363 = null;
        field3365 = null;
        if (arg0) {
            method1138(-4, 59, 105, -50);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 18963) {
            field3365 = null;
        }
        field3358++;
        if (arg1 < 1 || arg5 < 1 || arg1 > 102 || arg5 > 102) {
            return;
        }
        if (class124.field3012 && class13.field251 != arg4) {
            return;
        }
        int var8 = 0;
        boolean var9 = true;
        if (arg7 == 0) {
            var8 = class133.field3173.method487(arg4, arg1, arg5);
        }
        if (arg7 == 1) {
            var8 = class133.field3173.method489(arg4, arg1, arg5);
        }
        if (arg7 == 2) {
            var8 = class133.field3173.method480(arg4, arg1, arg5);
        }
        if (arg7 == 3) {
            var8 = class133.field3173.method459(arg4, arg1, arg5);
        }
        boolean var10 = false;
        boolean var11 = false;
        if (var8 != 0) {
            int var12 = class133.field3173.method499(arg4, arg1, arg5, var8);
            int var13 = var12 >> 6 & 0x3;
            int var14 = var8 >> 14 & 0x7FFF;
            int var15 = var12 & 0x1F;
            if (arg7 == 0) {
                class133.field3173.method462(arg4, arg1, arg5);
                class36 var16 = class77.method661(var14, -38);
                if (var16.field816) {
                    class65.field1603[arg4].method579(arg1, arg5, var13, var15, var16.field773, -88);
                }
            }
            if (arg7 == 1) {
                class133.field3173.method471(arg4, arg1, arg5);
            }
            if (arg7 == 2) {
                class133.field3173.method472(arg4, arg1, arg5);
                class36 var17 = class77.method661(var14, -98);
                if (var17.field767 + arg1 > 103 || var17.field767 + arg5 > 103 || var17.field756 + arg1 > 103 || var17.field756 + arg5 > 103) {
                    return;
                }
                if (var17.field816) {
                    class65.field1603[arg4].method588(var13, var17.field773, arg1, var17.field756, -1, arg5, var17.field767);
                }
            }
            if (arg7 == 3) {
                class133.field3173.method451(arg4, arg1, arg5);
                class36 var18 = class77.method661(var14, arg6 - 19025);
                if (var18.field816 && var18.field755 == 1) {
                    class65.field1603[arg4].method587(arg1, -14796, arg5);
                }
            }
        }
        if (arg0 < 0) {
            return;
        }
        int var19 = arg4;
        if (arg4 < 3 && (class62.field1540[1][arg1][arg5] & 0x2) == 2) {
            var19 = arg4 + 1;
        }
        class95.method798(arg0, var19, class65.field1603[arg4], arg4, 120, arg2, arg1, arg3, class133.field3173, arg5);
        return;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
    public static final int method1138(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 179) {
            arg2 /= 2;
        }
        field3357++;
        if (arg0 > 192) {
            arg2 /= 2;
        }
        if (arg0 > 217) {
            arg2 /= 2;
        }
        if (arg0 > 243) {
            arg2 /= 2;
        }
        return (arg3 / 4 << 10) + arg0 / 2 + (arg2 / 32 << arg1);
    }
}
