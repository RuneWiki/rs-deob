import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class169 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2584 = 0;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field2586 = new int[32768];

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[I")
    public static int[] field2587 = new int[14];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method1050(boolean arg0) {
        field2589++;
        if (arg0) {
            method1054(-6, 104, 97, (byte) -76, 17);
        }
        String var1;
        if (class114.field1738 == 1 && class218.field3278 < 2) {
            var1 = class251.field3817 + class106.field1627 + class241.field3624 + " ->";
        } else if (class153.field2305 && class218.field3278 < 2) {
            var1 = class48.field770 + class106.field1627 + class210.field3163 + " ->";
        } else if (class99.field1563 && class140.field2048[81] && class218.field3278 > 2) {
            var1 = class233.method1486(0, class218.field3278 - 2);
        } else {
            var1 = class233.method1486(0, class218.field3278 - 1);
        }
        if (class218.field3278 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class218.field3278 - 2) + class33.field483;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1051(int arg0) {
        field2587 = null;
        int var1 = -44 % ((arg0 - 68) / 32);
        field2586 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIBIIZ)V")
    public static final void method1052(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 != 126) {
            method1054(-63, -82, 85, (byte) -6, 11);
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field2585++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        class188.field2883 = (short) arg4;
        class287.field4303 = (short) arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method1053(byte arg0) {
        if (arg0 != -127) {
            method1054(-83, 63, -86, (byte) 28, 76);
        }
        while (class100.field1580.method1097(class202.field3050, 8) >= 11) {
            int var1 = class100.field1580.method1098(11, (byte) 115);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class96.field1521[var1] == null) {
                var2 = true;
                class96.field1521[var1] = new class107();
                if (class114.field1749[var1] != null) {
                    class96.field1521[var1].method675(class114.field1749[var1], -103);
                }
            }
            class58.field918[class141.field2069++] = var1;
            class107 var3 = class96.field1521[var1];
            var3.field2278 = class270.field4058;
            int var4 = class100.field1580.method1098(1, (byte) 106);
            int var5 = class100.field1580.method1098(5, (byte) 95);
            int var6 = class248.field3760[class100.field1580.method1098(3, (byte) 90)];
            if (var2) {
                var3.field2233 = var3.field2273 = var6;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class100.field1580.method1098(1, (byte) 105);
            if (var7 == 1) {
                class113.field1736[class118.field1781++] = var1;
            }
            int var8 = class100.field1580.method1098(5, (byte) 88);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method677(arg0 + 14, var4 == 1, class165.field2537.field2275[0] + var8, class165.field2537.field2297[0] - -var5);
        }
        field2588++;
        class100.field1580.method1103((byte) -65);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIBI)V")
    public static final void method1054(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class188.field2889 < 100) {
            class99.method637((byte) 68);
        }
        int var5 = -3 / ((47 - arg3) / 39);
        field2583++;
        class111.method716(arg0, arg2, arg0 + arg4, arg1 + arg2);
        if (class188.field2889 < 100) {
            int var6 = arg4 / 2 + arg0;
            byte var7 = 20;
            int var8 = arg1 / 2 + (arg2 - var7 - 18);
            class111.method702(arg0, arg2, arg4, arg1, 0);
            class111.method701(var6 - 152, var8, 304, 34, 9179409);
            class111.method701(var6 - 151, var8 + 1, 302, 32, 0);
            class111.method702(var6 - 150, var8 + 2, class188.field2889 * 3, 30, 9179409);
            class111.method702(class188.field2889 * 3 + var6 - 150, var8 + 2, 300 - class188.field2889 * 3, 30, 0);
            class192.field2953.method1037(class41.field611, var6, var7 + var8, 16777215, -1);
            return;
        }
        class265.field3997 = (int) ((float) (arg1 * 2) / class293.field4617);
        class270.field4061 = class268.field4042 - ((int) ((float) arg1 / class293.field4617));
        int var9 = class268.field4042 - ((int) ((float) arg1 / class293.field4617));
        class25.field305 = (int) ((float) (arg4 * 2) / class293.field4617);
        int var10 = class3.field51 - ((int) ((float) arg4 / class293.field4617));
        class134.field1956 = class3.field51 - ((int) ((float) arg4 / class293.field4617));
        int var11 = (int) ((float) arg1 / class293.field4617) + class268.field4042;
        int var12 = (int) ((float) arg4 / class293.field4617) + class3.field51;
        class113.method729(arg0, var12, var10, arg2, 245221232, var9, var11, arg0 + arg4, arg1 + arg2);
        class198.method1242((byte) -79, arg2, var10, arg0, class106.field1615, var12, arg1 + arg2, var9, var11, arg0 + arg4);
        class297.method1992(var9, arg2 + arg1, var11, arg2, arg0 + arg4, var10, var12, arg0, false);
        if (class143.field2096 > 0) {
            class123.field1859--;
            if (class123.field1859 == 0) {
                class123.field1859 = 20;
                class143.field2096--;
            }
        }
        if (!class177.field2703) {
            return;
        }
        int var13 = arg0 + arg4 - 5;
        int var14 = arg2 + arg1 - 8;
        class268.field4036.method1018("Fps:" + class232.field3505, var13, var14, 16776960, -1);
        int var18 = var14 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var17 = 16776960;
        if (var16 > 65536) {
            var17 = 16711680;
        }
        class268.field4036.method1018("Mem:" + var16 + "k", var13, var18, var17, -1);
        var14 = var18 - 15;
    }
}
