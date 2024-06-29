import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class78 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public static int[] field1467 = new int[50];

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lke;")
    public static class256 field1465 = class316.method2202("1", 27626);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lke;")
    public static class256 field1468 = class316.method2202("Spieler kann nicht gefunden werden: ", 27626);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
    public static boolean field1463 = false;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILmc;IJZ)Z", line = 29)
    public static final boolean method587(int arg0, int arg1, int arg2, int arg3, int arg4, class51 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class126.method872(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 75)
    public static void method588(int arg0) {
        field1465 = null;
        int var1 = 75 % ((-arg0 - 41) / 56);
        field1468 = null;
        field1467 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZIIII)V", line = 92)
    public static final void method589(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1466++;
        field1469++;
        if (!arg1) {
            class58.method455(true, (byte) -107);
            class93.method683((byte) 74, true);
            class58.method455(false, (byte) 70);
        }
        class93.method683((byte) -122, false);
        if (!arg1) {
            class157.method1167(arg3 + 22134);
        }
        class58.method456(-113);
        if (class253.field4323) {
            class107.method758(arg4, true, 3, arg0, arg5, arg2);
            arg5 = class68.field1262;
            arg0 = class197.field3606;
            arg2 = class249.field4236;
            arg4 = class310.field5340;
        }
        if (class192.field3510 == 1) {
            int var6 = class114.field2014;
            if (var6 < class180.field3193 / 256) {
                var6 = class180.field3193 / 256;
            }
            int var7 = class289.field5001 + class175.field3108 & 0x7FF;
            if (class63.field1107[4] && var6 < (class162.field2874[4] + 128)) {
                var6 = class162.field2874[4] + 128;
            }
            class252.method1692(var6, -687989968, var7, class297.method2080(class121.field2124.field1192, 121, class255.field4377, class121.field2124.field1197) - 50, class40.field734, class75.field1435, arg0, var6 * 3 + 600);
        }
        int var8 = class72.field1319;
        int var9 = class180.field3192;
        int var10 = class50.field926;
        int var11 = class10.field152;
        int var12 = class210.field3784;
        for (int var13 = arg3; var13 < 5; var13++) {
            if (class63.field1107[var13]) {
                int var14 = (int) (Math.random() * (double) (class117.field2059[var13] * 2 + 1) + Math.sin((double) class52.field956[var13] / 100.0D * (double) class121.field2130[var13]) * (double) class162.field2874[var13] - (double) class117.field2059[var13]);
                if (var13 == 0) {
                    class50.field926 += var14;
                }
                if (var13 == 1) {
                    class10.field152 += var14;
                }
                if (var13 == 3) {
                    class210.field3784 = class210.field3784 + var14 & 0x7FF;
                }
                if (var13 == 2) {
                    class72.field1319 += var14;
                }
                if (var13 == 4) {
                    class180.field3192 += var14;
                    if (class180.field3192 < 128) {
                        class180.field3192 = 128;
                    }
                    if (class180.field3192 > 383) {
                        class180.field3192 = 383;
                    }
                }
            }
        }
        class74.method565((byte) 92);
        if (class253.field4323) {
            class60.method470(arg2, arg4, arg2 + arg5, arg4 - -arg0);
            float var15 = (float) class180.field3192 * 0.17578125F;
            float var16 = (float) class210.field3784 * 0.17578125F;
            if (class192.field3510 == 3) {
                var16 = class180.field3194 * 360.0F / 6.2831855F;
                var15 = class301.field5176 * 360.0F / 6.2831855F;
            }
            class253.method1717(arg2, arg4, arg5, arg0, arg5 / 2 + arg2, arg4 - -(arg0 / 2), var15, var16, class173.field3077, class173.field3077);
        } else {
            class178.method1302(arg2, arg4, arg2 + arg5, arg0 + arg4);
            class136.method975();
        }
        if (class73.field1341 || class104.field1862 < arg2 || class104.field1862 >= (arg2 + arg5) || arg4 > class318.field5479 || (arg4 + arg0) <= class318.field5479) {
            class150.field2669 = false;
            class177.field3136 = 0;
        } else {
            class177.field3136 = 0;
            class150.field2669 = true;
            int var17 = class105.field1885;
            int var18 = class91.field1667;
            class8.field129 = (class104.field1862 - arg2) * (var18 - var17) / arg5 + var17;
            int var19 = class295.field5122;
            int var20 = class49.field890;
            class68.field1268 = (class318.field5479 - arg4) * (var20 - var19) / arg0 + var19;
        }
        class65.method506(true);
        byte var21 = class106.method750(13744) == 2 ? (byte) field1469 : 1;
        if (class253.field4323) {
            boolean var22 = false;
            class253.method1721();
            class253.method1730(true);
            class253.method1716(true);
            int var23;
            if (class86.field1550 == 10) {
                var23 = class222.method1531(class29.field398, class50.field926 >> 10, class106.field1895, class72.field1319 >> 10, true);
            } else {
                var23 = class222.method1531(class29.field398, class121.field2124.field1215[0] >> 3, class106.field1895, class121.field2124.field1254[0] >> 3, true);
            }
            class245.method1650(class45.field840, !class115.field2026);
            class253.method1722(var23);
            class57.method449(class210.field3784, class180.field3192, class10.field152, class72.field1319, class50.field926, -1459);
            class253.field4326 = class45.field840;
            class284.method1985(class50.field926, class10.field152, class72.field1319, class180.field3192, class210.field3784, class278.field4807, class208.field3769, class140.field2472, class242.field4107, class79.field1470, class57.field1033, class255.field4377 + 1, var21, class121.field2124.field1192 >> 7, class121.field2124.field1197 >> 7);
            class28.field380 = true;
            class245.method1656();
            class57.method449(0, 0, 0, 0, 0, -1459);
            class65.method506(true);
            class280.method1962();
            class27.method192(class173.field3077, class173.field3077, arg2, arg3 ^ 0x4F, arg5, arg0, arg4);
            class99.method712(arg2, (byte) 33, arg0, class173.field3077, class173.field3077, arg5, arg4);
        } else {
            class178.method1299(arg2, arg4, arg5, arg0, 0);
            class284.method1985(class50.field926, class10.field152, class72.field1319, class180.field3192, class210.field3784, class278.field4807, class208.field3769, class140.field2472, class242.field4107, class79.field1470, class57.field1033, class255.field4377 + 1, var21, class121.field2124.field1192 >> 7, class121.field2124.field1197 >> 7);
            class65.method506(true);
            class280.method1962();
            class27.method192(256, 256, arg2, 55, arg5, arg0, arg4);
            class99.method712(arg2, (byte) 33, arg0, 256, 256, arg5, arg4);
        }
        ((class27) class136.field2373).method194(class29.field398, -100);
        class247.method1670(arg5, arg0, arg2, 57092108, arg4);
        class210.field3784 = var12;
        class180.field3192 = var9;
        class50.field926 = var10;
        class10.field152 = var11;
        class72.field1319 = var8;
        if (class111.field1946 && class201.field3665.method866(-18653) == 0) {
            class111.field1946 = false;
        }
        if (class111.field1946) {
            if (class253.field4323) {
                class60.method482(arg2, arg4, arg5, arg0, 0);
            } else {
                class178.method1299(arg2, arg4, arg5, arg0, 0);
            }
            class159.method1176(false, class177.field3127, (byte) 106);
        }
        if (!arg1 && !class111.field1946 && !class73.field1341 && arg2 <= class104.field1862 && (arg2 + arg5) > class104.field1862 && class318.field5479 >= arg4 && class318.field5479 < (arg4 + arg0)) {
            class192.method1391(arg2, arg0, arg5, class104.field1862, arg4, class318.field5479, -60);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)I", line = 308)
    public static final int method590(boolean arg0, int arg1) {
        field1464++;
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = (arg1 * var2 >> 12) + 40960;
        if (arg0) {
            method589(-12, false, -47, 67, -19, 12);
        }
        return var3 * var4 >> 12;
    }
}
