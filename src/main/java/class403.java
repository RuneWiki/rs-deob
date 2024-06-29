import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class403 extends class710 {

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field5698 = 1;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Ljo;")
    public static class351 field5700 = new class351(7, 12);

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Lbe;")
    public static class41 field5704 = new class41();

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Lke;")
    public static class622 field5705 = new class622(56, 4);

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field5707 = 0;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static void method2431(byte arg0) {
        field5705 = null;
        field5704 = null;
        if (arg0 != 43) {
            field5705 = null;
        }
        field5700 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2432(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = 58 / ((-arg4 - 33) / 40);
        for (class202 var8 = (class202) class602.field8486.method2033(0); var8 != null; var8 = (class202) class602.field8486.method2025((byte) -88)) {
            if (var8.field2950 <= class673.field9441) {
                var8.method592(2);
            } else {
                class50.method340(arg3, false, var8.field2955 * 2, (var8.field2963 << 9) + 256, (var8.field2952 << 9) + 256, arg5, arg6 >> 1, arg2 >> 1, var8.field2953);
                class546.field7704.method523(var8.field2959 | 0xFF000000, arg0 + class632.field8926[0], var8.field2954, arg1 + class632.field8926[1], true, 0);
            }
        }
        field5701++;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)Lmu;")
    public abstract class314 method2433(int arg0);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BD)V")
    public static final void method2434(byte arg0, double arg1) {
        field5703++;
        class599.field8453.method1950(class754.field10433);
        class599.field8453.method1952(0, 0, (int) arg1);
        class438.field6281.method445(class599.field8453);
        if (arg0 < 99) {
            field5707 = 38;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZIILli;)V")
    public static final void method2435(int arg0, boolean arg1, int arg2, int arg3, class449 arg4) {
        field5699++;
        class607 var5 = arg4.method2708(116);
        if (arg1) {
            return;
        }
        int var6 = arg4.field6351 - arg4.field6420.field437 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg4.field6395 > 25) {
                if (arg3 < 0 && var5.field8534 != -1) {
                    arg4.field6383 = var5.field8534;
                    arg4.field6358 = false;
                } else if (arg3 <= 0 || var5.field8545 == -1) {
                    arg4.field6383 = var5.field8527;
                } else {
                    arg4.field6383 = var5.field8545;
                }
                arg4.field6358 = false;
            } else if (!arg4.field6358 || !var5.method3500(arg4.field6383, -34)) {
                arg4.field6383 = var5.method3501(-32);
                arg4.field6358 = arg4.field6383 != -1;
            }
        } else if (arg4.field6343 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class417.field5883[arg0] - arg4.field6420.field437 & 0x3FFF;
            if (arg2 == 2 && var5.field8544 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field8562 != -1) {
                    arg4.field6383 = var5.field8562;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field8546 != -1) {
                    arg4.field6383 = var5.field8546;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field8577 == -1) {
                    arg4.field6383 = var5.field8544;
                } else {
                    arg4.field6383 = var5.field8577;
                }
            } else if (arg2 == 0 && var5.field8569 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field8550 != -1) {
                    arg4.field6383 = var5.field8550;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field8535 != -1) {
                    arg4.field6383 = var5.field8535;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field8566 == -1) {
                    arg4.field6383 = var5.field8569;
                } else {
                    arg4.field6383 = var5.field8566;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field8547 != -1) {
                arg4.field6383 = var5.field8547;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field8532 != -1) {
                arg4.field6383 = var5.field8532;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field8564 == -1) {
                arg4.field6383 = var5.field8527;
            } else {
                arg4.field6383 = var5.field8564;
            }
            arg4.field6358 = false;
        } else if (var6 == 0 && arg4.field6395 <= 25) {
            if (arg2 == 2 && var5.field8544 != -1) {
                arg4.field6383 = var5.field8544;
            } else if (arg2 == 0 && var5.field8569 != -1) {
                arg4.field6383 = var5.field8569;
            } else {
                arg4.field6383 = var5.field8527;
            }
            arg4.field6358 = false;
        } else {
            arg4.field6358 = false;
            if (arg2 == 2 && var5.field8544 != -1) {
                if (arg3 < 0 && var5.field8571 != -1) {
                    arg4.field6383 = var5.field8571;
                } else if (arg3 <= 0 || var5.field8541 == -1) {
                    arg4.field6383 = var5.field8544;
                } else {
                    arg4.field6383 = var5.field8541;
                }
            } else if (arg2 == 0 && var5.field8569 != -1) {
                if (arg3 < 0 && var5.field8528 != -1) {
                    arg4.field6383 = var5.field8528;
                } else if (arg3 <= 0 || var5.field8531 == -1) {
                    arg4.field6383 = var5.field8569;
                } else {
                    arg4.field6383 = var5.field8531;
                }
            } else if (arg3 < 0 && var5.field8555 != -1) {
                arg4.field6383 = var5.field8555;
            } else if (arg3 <= 0 || var5.field8553 == -1) {
                arg4.field6383 = var5.field8527;
            } else {
                arg4.field6383 = var5.field8553;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
    public static final void method2436(int arg0, int arg1, int arg2, long[] arg3, Object[] arg4) {
        if (arg0 != -18477) {
            method2432(113, -110, 61, -99, (byte) 50, 112, 118);
        }
        field5702++;
        if (arg1 <= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg2;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg2; var11 < arg1; var11++) {
            if ((long) (var10 & var11) + var7 > arg3[var11]) {
                long var12 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg3[arg1] = arg3[var6];
        arg3[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var9;
        method2436(arg0, var6 - 1, arg2, arg3, arg4);
        method2436(-18477, arg1, var6 + 1, arg3, arg4);
    }
}
