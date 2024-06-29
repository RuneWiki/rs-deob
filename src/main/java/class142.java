import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class142 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lil;")
    public static class274 field1932 = new class274(12, 15);

    @OriginalMember(owner = "client!od", name = "e", descriptor = "S")
    public static short field1934 = 32767;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[I")
    public static int[] field1933 = new int[6];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lbn;")
    public static class160 field1935 = new class160(77, 3);

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Z")
    public static boolean field1936 = false;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1937 = null;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIBII)V", line = 4)
    public static final void method938(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1931++;
        class223 var7 = class99.method654(-1, arg1, arg5);
        if (var7 == null) {
            return;
        }
        if (var7.field3256 != null) {
            class288 var8 = new class288();
            var8.field4217 = var7;
            var8.field4218 = var7.field3256;
            class107.method762(var8);
        }
        class90.field1107 = arg3;
        if (arg4 != 52) {
            method938(107, 126, 33, -7, (byte) -102, -105, 51);
        }
        class147.field1993 = true;
        class74.field949 = arg5;
        class243.field3605 = arg1;
        class433.field6315 = arg0;
        class392.field5703 = arg2;
        class356.field5173 = arg6;
        class155.field2092 = var7.field3363;
        class15.method216((byte) 127, var7);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 45)
    public static void method939(byte arg0) {
        field1937 = null;
        field1935 = null;
        field1932 = null;
        int var1 = -72 / ((-arg0 - 43) / 41);
        field1933 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIBZ)V", line = 58)
    public static final void method940(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field1930++;
        if (class178.field2530 == null) {
            class74.field942.method150(-7, arg2, arg3, arg0, -16777216, arg1);
        } else if (class187.field2619.field4954 >= 0 && class187.field2619.field4954 < class195.field2745 * 128 && class187.field2619.field4951 >= 0 && (class78.field984 * 128) > class187.field2619.field4951) {
            class253.field3713++;
            if (class187.field2619 != null && (class187.field2619.field4954 - (class187.field2619.method446(10) * 64 - 64) >> 7) == class36.field516 && class187.field2619.field4951 + (64 - (class187.field2619.method446(10) * 64)) >> 7 == class247.field3647) {
                class247.field3647 = -1;
                class36.field516 = -1;
                class294.method1955((byte) -120);
            }
            class323.method2123((byte) 113);
            if (!arg5) {
                class408.method2535(-1);
            }
            class178.method1245(-6);
            class346.method2242(arg3, true, 334, arg1, arg0, arg2);
            int var6 = class127.field1685;
            int var7 = class3.field45;
            int var8 = class363.field5257;
            int var9 = class338.field4978;
            if (class28.field402 == 1) {
                int var12 = (int) class170.field2220;
                if (var12 < (class137.field1875 >> 8)) {
                    var12 = class137.field1875 >> 8;
                }
                if (class260.field3858[4] && var12 < class14.field229[4] + 128) {
                    var12 = class14.field229[4] + 128;
                }
                int var13 = (int) class1.field19 + class146.field1977 & 0x3FFF;
                class429.method2640(var12, class108.field1463, (var12 >> 3) * 3 + 600, var6, class171.field2236, true, var13, class133.method889(class423.field6117, class187.field2619.field4954, class187.field2619.field4951, false) - 50);
            } else if (class28.field402 == 4) {
                int var10 = (int) class170.field2220;
                if ((class137.field1875 >> 8) > var10) {
                    var10 = class137.field1875 >> 8;
                }
                if (class260.field3858[4] && var10 < class14.field229[4] + 128) {
                    var10 = class14.field229[4] + 128;
                }
                int var11 = (int) class1.field19 & 0x3FFF;
                class429.method2640(var10, class108.field1463, (var10 >> 3) * 3 + 600, var6, class171.field2236, true, var11, class133.method889(class423.field6117, class152.field2056, class188.field2629, false) - 50);
            } else if (class28.field402 == 5) {
                class29.method300((byte) 122, var6);
            }
            int var14 = class298.field4343;
            int var15 = class164.field2171;
            int var16 = class345.field5077;
            int var17 = class103.field1341;
            int var18 = class136.field1867;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class260.field3858[var19]) {
                    int var22 = (int) ((double) (-class2.field25[var19]) + (double) (class2.field25[var19] * 2 + 1) * Math.random() + Math.sin((double) class265.field3924[var19] / 100.0D * (double) class51.field645[var19]) * (double) class14.field229[var19]);
                    if (var19 == 3) {
                        class136.field1867 = class136.field1867 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class164.field2171 += var22;
                    }
                    if (var19 == 4) {
                        class103.field1341 += var22;
                        if (class103.field1341 < 1024) {
                            class103.field1341 = 1024;
                        } else if (class103.field1341 > 3072) {
                            class103.field1341 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class345.field5077 += var22;
                    }
                    if (var19 == 0) {
                        class298.field4343 += var22;
                    }
                }
            }
            if (class298.field4343 < 0) {
                class298.field4343 = 0;
            }
            if ((class329.field4899 << 7) - 1 < class298.field4343) {
                class298.field4343 = (class329.field4899 << 7) - 1;
            }
            if (class345.field5077 < 0) {
                class345.field5077 = 0;
            }
            if ((class380.field5590 << 7) - 1 < class345.field5077) {
                class345.field5077 = (class380.field5590 << 7) - 1;
            }
            class166.method1098(true);
            class59.method451(5000);
            class74.field942.method77(var9, var8, var9 + var7, var6 + var8);
            class74.field942.method131();
            int var20 = class294.field4275;
            if (class187.field2613 == null) {
                class74.field942.method138(var20);
            } else {
                class187.field2613.method2186(var7, var6, class240.field3568 << 3, class103.field1341, var20, true, class136.field1867, var8, var9, class74.field942);
            }
            class60.method457(14597);
            class444.field6476.method822(class298.field4343, class164.field2171, class345.field5077, -class103.field1341 & 0x3FFF, -class136.field1867 & 0x3FFF, -class86.field1067 & 0x3FFF);
            class74.field942.method107(class444.field6476);
            class74.field942.method101(var7 / 2 + var9, var6 / 2 + var8, class272.field4019 << 1, class272.field4019 << 1);
            class444.method2731(class272.field4019 << 1, class272.field4019 << 1, var8 + (var6 / 2), 123, var9 + (var7 / 2));
            class322.method2116(class345.field5077, -class136.field1867 & 0x3FFF, class164.field2171, -class103.field1341 & 0x3FFF, class298.field4343, -class86.field1067 & 0x3FFF, 6469);
            byte var21 = class369.method2346(0) == 2 ? (byte) class253.field3713 : 1;
            class441.method2708(class74.field942, class388.field5665, client.field3883, class444.field6476, class298.field4343, class164.field2171, class345.field5077, class444.field6472, class421.field6095, class433.field6313, class345.field5078, class436.field6369, class456.field6751, class187.field2619.field4960 + 1, var21, class187.field2619.field4954 >> 7, class187.field2619.field4951 >> 7, !class62.field826);
            class60.method457(14597);
            if (class120.field1610 == 30) {
                class244.method1632(var9, var8, 256, var7, var6, 256, 33);
                class435.method2667(-5480, var8, var6, 256, 256, var7, var9);
                class384.method2427(256, var9, var7, 103, 256, var8, var6);
                class238.method1600(var9, var8, var7, (byte) 25, var6);
            }
            class28.method293();
            class298.field4343 = var14;
            class103.field1341 = var17;
            class136.field1867 = var18;
            class345.field5077 = var16;
            class164.field2171 = var15;
            if (arg4 < 28) {
                method939((byte) 119);
            }
            if (class353.field5142 && class257.field3800.method2670(-1) == 0) {
                class353.field5142 = false;
            }
            if (class353.field5142) {
                class74.field942.method150(-99, var8, var9, var6, -16777216, var7);
                class76.method536(false, class196.field2755.method2543(false, class153.field2073), false, class13.field215);
            }
        } else {
            class74.field942.method150(-30, arg2, arg3, arg0, -16777216, arg1);
        }
    }
}
