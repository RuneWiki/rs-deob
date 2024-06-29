import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class170 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3021 = 0;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lqc;")
    public static class245 field3020 = new class245(5);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lr;")
    public static class66 field3023 = class93.method641(43, "<)4col>");

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    public static int[] field3027 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Ljb;")
    public static class256 field3026;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[I")
    public static int[] field3025;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1159(byte arg0) {
        if (arg0 <= 61) {
            return;
        }
        field3025 = null;
        field3020 = null;
        field3027 = null;
        field3023 = null;
        field3026 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIILlh;IIBI)V")
    public static final void method1160(boolean arg0, int arg1, int arg2, int arg3, class249 arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3022++;
        if (arg1 >= 0 && arg1 < 104 && arg8 >= 0 && arg8 < 104) {
            if (!arg0) {
                class47.field846[arg5][arg1][arg8] = 0;
            }
            while (true) {
                int var9 = arg4.method1677(-6677);
                if (var9 == 0) {
                    if (arg0) {
                        class30.field453[0][arg1][arg8] = class250.field4412[0][arg1][arg8];
                    } else if (arg5 == 0) {
                        class30.field453[0][arg1][arg8] = -class233.method1521(arg8 + arg3 + 556238, true, arg1 + arg2 + 932731) * 8;
                    } else {
                        class30.field453[arg5][arg1][arg8] = class30.field453[arg5 - 1][arg1][arg8] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg4.method1677(-6677);
                    if (arg0) {
                        class30.field453[0][arg1][arg8] = var10 * 8 + class250.field4412[0][arg1][arg8];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg5 == 0) {
                            class30.field453[0][arg1][arg8] = -var10 * 8;
                        } else {
                            class30.field453[arg5][arg1][arg8] = class30.field453[arg5 - 1][arg1][arg8] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class34.field514[arg5][arg1][arg8] = arg4.method1682(3390);
                    class193.field3350[arg5][arg1][arg8] = (byte) ((var9 - 2) / 4);
                    class192.field3326[arg5][arg1][arg8] = (byte) class115.method767(3, var9 + arg6 - 2);
                } else if (var9 > 81) {
                    class242.field4241[arg5][arg1][arg8] = (byte) (var9 - 81);
                } else if (!arg0) {
                    class47.field846[arg5][arg1][arg8] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg4.method1677(-6677);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg4.method1677(-6677);
                    break;
                }
                if (var11 <= 49) {
                    arg4.method1677(-6677);
                }
            }
        }
        if (arg7 <= 25) {
            method1161(-35, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)Z")
    public static final boolean method1161(int arg0, byte arg1) {
        if (arg1 > -112) {
            return false;
        } else {
            field3024++;
            return (arg0 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIII)I")
    public static final int method1162(boolean arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) class84.field1631.method1381((long) arg2, -60);
        field3019++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg3; var6 < var4.field195.length; var6++) {
            if (var4.field195[var6] >= 0 && class133.field2480 > var4.field195[var6]) {
                class157 var7 = class40.method242(-25672, var4.field195[var6]);
                if (var7.field2845 != null) {
                    class49 var8 = (class49) var7.field2845.method1381((long) arg1, -103);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field192[var6] * var8.field873;
                        } else {
                            var5 += var8.field873;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
