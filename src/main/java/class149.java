import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class149 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lik;")
    public static class267 field2159 = new class267(5);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lpj;")
    public static class255 field2162;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method903(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class197.field2997 = arg1;
        class92.field1448 = arg2;
        class270.field4062 = arg3;
        class72.field1152 = new class270[arg0][class197.field2997][class92.field1448];
        class297.field4695 = new int[arg0][class197.field2997 + 1][class92.field1448 + 1];
        if (arg4) {
            class63.field997 = new class270[1][class197.field2997][class92.field1448];
            class76.field1222 = new int[class197.field2997][class92.field1448];
            class246.field3685 = new int[1][class197.field2997 + 1][class92.field1448 + 1];
        } else {
            class63.field997 = null;
            class76.field1222 = null;
            class246.field3685 = null;
        }
        class43.method282(false);
        class268.field4044 = new class141[500];
        class80.field1291 = 0;
        class139.field2041 = new class141[500];
        class187.field2832 = 0;
        class143.field2097 = new int[arg0][class197.field2997 + 1][class92.field1448 + 1];
        class173.field2627 = new class2[5000];
        class97.field1525 = 0;
        class200.field3044 = new class2[100];
        class58.field915 = new boolean[class270.field4062 + class270.field4062 + 1][class270.field4062 + class270.field4062 + 1];
        class155.field2329 = new boolean[class270.field4062 + class270.field4062 + 2][class270.field4062 + class270.field4062 + 2];
        class163.field2508 = new byte[arg0][class197.field2997][class92.field1448];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZZIBIZLte;)Lsb;")
    public static final class230 method904(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, byte arg5, int arg6, boolean arg7, class79 arg8) {
        field2156++;
        class43 var9 = class160.method999(arg1, 0);
        if (arg4 > 1 && var9.field635 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field654[var11] && var9.field654[var11] != 0) {
                    var10 = var9.field635[var11];
                }
            }
            if (var10 != -1) {
                var9 = class160.method999(var10, 0);
            }
        }
        class29 var12 = var9.method294(arg8, -127);
        if (var12 == null) {
            return null;
        }
        class201 var13 = null;
        if (var9.field643 != -1) {
            var13 = (class201) method904(1, var9.field677, true, true, 10, (byte) -103, 0, false, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field666 != -1) {
            var13 = (class201) method904(arg0, var9.field667, false, true, arg4, (byte) 76, arg6, false, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class111.field1716;
        int var15 = class111.field1719;
        int[] var16 = new int[4];
        int var17 = class111.field1718;
        class111.method723(var16);
        class201 var18 = new class201(36, 32);
        class111.method708(var18.field3047, 36, 32);
        class249.method1623();
        class249.method1622(16, 16);
        class249.field3776 = false;
        int var19 = 37 % ((-arg5 - 31) / 63);
        int var20 = var9.field665;
        if (arg2) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg0 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class249.field3781[var9.field649] * var20 >> 16;
        int var22 = class249.field3767[var9.field649] * var20 >> 16;
        var12.method109(0, var9.field623, var9.field658, var9.field649, var9.field660, var22 - (var12.method81() / 2 - var9.field650), var21 - -var9.field650, -1L);
        if (arg0 >= 1) {
            var18.method1262(1);
            if (arg0 >= 2) {
                var18.method1262(16777215);
            }
            class111.method708(var18.field3047, 36, 32);
        }
        if (arg6 != 0) {
            var18.method1270(arg6);
        }
        if (var9.field643 != -1) {
            var13.method1274(0, 0);
        } else if (var9.field666 != -1) {
            class111.method708(var13.field3047, 36, 32);
            var18.method1274(0, 0);
            var18 = var13;
        }
        if (arg7 && (var9.field648 == 1 || arg4 != 1) && arg4 != -1) {
            class206.field3085.method1024(class7.method36(arg4, 44), 0, 9, 16776960, 1);
        }
        class111.method708(var14, var15, var17);
        class111.method703(var16);
        class249.method1623();
        class249.field3776 = true;
        return var18;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field2160++;
        if (arg1 >= class248.field3765 && class163.field2505 >= arg1 && arg8 >= class248.field3765 && class163.field2505 >= arg8 && class248.field3765 <= arg5 && class163.field2505 >= arg5 && arg2 >= class248.field3765 && class163.field2505 >= arg2 && arg6 >= class243.field3635 && class118.field1782 >= arg6 && arg4 >= class243.field3635 && class118.field1782 >= arg4 && arg0 >= class243.field3635 && arg0 <= class118.field1782 && arg3 >= class243.field3635 && class118.field1782 >= arg3) {
            class214.method1371(arg5, arg6, arg2, -31, arg4, arg1, arg8, arg0, arg3, arg7);
        } else {
            class22.method141(false, arg3, arg4, arg0, arg6, arg7, arg5, arg8, arg1, arg2);
        }
        if (arg9) {
            method903(-93, -84, -9, 104, true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjj;Z)V")
    public static final void method906(int arg0, int arg1, class107 arg2, boolean arg3) {
        if (arg2.field2260 == arg0 && arg0 != -1) {
            class215 var4 = class276.method1829(arg0, 29223);
            int var5 = var4.field3220;
            if (var5 == 1) {
                arg2.field2237 = 0;
                arg2.field2204 = arg1;
                arg2.field2207 = 0;
                arg2.field2215 = 1;
                arg2.field2270 = 0;
                client.method966((byte) 52, arg2.field2207, class165.field2537 == arg2, arg2.field2234, var4, arg2.field2251);
            }
            if (var5 == 2) {
                arg2.field2270 = 0;
            }
        } else if (arg0 == -1 || arg2.field2260 == -1 || class276.method1829(arg0, 29223).field3227 >= class276.method1829(arg2.field2260, 29223).field3227) {
            arg2.field2270 = 0;
            arg2.field2207 = 0;
            arg2.field2215 = 1;
            arg2.field2260 = arg0;
            arg2.field2204 = arg1;
            arg2.field2246 = arg2.field2277;
            arg2.field2237 = 0;
            if (arg2.field2260 != -1) {
                client.method966((byte) 52, arg2.field2207, class165.field2537 == arg2, arg2.field2234, class276.method1829(arg2.field2260, 29223), arg2.field2251);
            }
        }
        field2157++;
        if (!arg3) {
            method904(-115, -95, true, false, -90, (byte) -15, -118, true, (class79) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lpf;I)V")
    public static final void method907(class294 arg0, int arg1) {
        field2158++;
        if (arg1 != 2) {
            method906(-83, -26, (class107) null, false);
        }
        class159.field2452 = arg0.method1965("titlebg", arg1 - 92);
        class268.field4037 = arg0.method1965("logo", arg1 - 79);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        field2162 = null;
        if (arg0) {
            method908(false);
        }
        field2159 = null;
    }
}
