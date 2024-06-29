import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class87 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "S")
    public short field1362;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
    public boolean field1365;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "B")
    public byte field1360;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "S")
    public short field1370;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "S")
    public short field1359;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "B")
    public byte field1363;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Laa;")
    public static class76 field1364 = new class76(11, 4);

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[I")
    public static int[] field1366 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "Ltv;")
    public static class294 field1371;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIII)V")
    public static final void method683(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1358++;
        if (class236.field3305 == null) {
            class407.field6147.method67(arg3 ^ 0x43, arg2, -16777216, arg1, arg5, arg4);
        } else if (class410.field6198.field7681 >= 0 && (class50.field640 * 128) > class410.field6198.field7681 && class410.field6198.field7671 >= 0 && class410.field6198.field7671 < class448.field6611 * 128) {
            class439.field6459++;
            if (class410.field6198 != null && class410.field6198.field7681 + 64 - class410.field6198.method2419((byte) 108) * 64 >> 7 == class504.field7423 && (class410.field6198.field7671 + 64 - (class410.field6198.method2419((byte) 107) * 64) >> 7) == class182.field2702) {
                class182.field2702 = -1;
                class504.field7423 = -1;
                class125.method920(arg3 ^ 0xB);
            }
            class235.method1448((byte) 120);
            if (!arg0) {
                class83.method666((byte) 67);
            }
            class486.method2907(1);
            class182.method1238(arg2, arg1, true, arg5, arg4, arg3 ^ 0xFFFFFF3C);
            int var6 = class20.field306;
            int var7 = class141.field2127;
            int var8 = class407.field6145;
            int var9 = class379.field5704;
            if (class350.field5388 == 1) {
                int var12 = (int) class254.field3443;
                if (var12 < (class196.field2881 >> 8)) {
                    var12 = class196.field2881 >> 8;
                }
                if (class233.field3277[4] && var12 < (class303.field4520[4] + 128)) {
                    var12 = class303.field4520[4] + 128;
                }
                int var13 = (int) class311.field4836 + class80.field1096 & 0x3FFF;
                class277.method1736(class125.field1880, (var12 >> 3) * 3 + 600 << 0, class50.method373(class521.field7651, 14966, class410.field6198.field7671, class410.field6198.field7681) - 50, class295.field4416, (byte) -128, var13, var12, var6);
            } else if (class350.field5388 == 4) {
                int var10 = (int) class254.field3443;
                if ((class196.field2881 >> 8) > var10) {
                    var10 = class196.field2881 >> 8;
                }
                if (class233.field3277[4] && class303.field4520[4] + 128 > var10) {
                    var10 = class303.field4520[4] + 128;
                }
                int var11 = (int) class311.field4836 & 0x3FFF;
                class277.method1736(class125.field1880, (var10 >> 3) * 3 + 600 << 0, class50.method373(class521.field7651, 14966, class444.field6528, class382.field5746) - 50, class295.field4416, (byte) -128, var11, var10, var6);
            } else if (class350.field5388 == 5) {
                class305.method1902(-78, var6);
            }
            int var14 = class282.field4263;
            int var15 = class201.field2925;
            int var16 = class393.field5897;
            int var17 = class350.field5383;
            int var18 = class431.field6396;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class233.field3277[var19]) {
                    int var22 = (int) ((double) (-class105.field1578[var19]) + Math.random() * (double) (class105.field1578[var19] * 2 + 1) + Math.sin((double) class316.field4884[var19] / 100.0D * (double) class377.field5689[var19]) * (double) class303.field4520[var19]);
                    if (var19 == 2) {
                        class393.field5897 += var22;
                    }
                    if (var19 == 3) {
                        class431.field6396 = class431.field6396 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class282.field4263 += var22;
                    }
                    if (var19 == 4) {
                        class350.field5383 += var22;
                        if (class350.field5383 < 1024) {
                            class350.field5383 = 1024;
                        } else if (class350.field5383 > 3072) {
                            class350.field5383 = 3072;
                        }
                    }
                    if (var19 == 1) {
                        class201.field2925 += var22;
                    }
                }
            }
            if (class282.field4263 < 0) {
                class282.field4263 = 0;
            }
            if (class393.field5897 < 0) {
                class393.field5897 = 0;
            }
            if (class282.field4263 > (class445.field6562 << 7) - 1) {
                class282.field4263 = (class445.field6562 << 7) - 1;
            }
            if (class393.field5897 > (class167.field2473 << 7) - 1) {
                class393.field5897 = (class167.field2473 << 7) - 1;
            }
            class49.method367(-17675);
            class258.method1592(-6402);
            class407.field6147.method84(var7, var9, var7 + var8, var6 + var9);
            class407.field6147.method56();
            int var20 = class385.field5803;
            if (class89.field1394 == null) {
                class407.field6147.method85(var20);
            } else {
                class89.field1394.method2381((byte) 73, var8, class431.field6396, class407.field6146 << 3, var20, var6, var7, var9, class350.field5383, class407.field6147);
            }
            class436.method2565(arg3 ^ 0xFFFFFFA8);
            class151.field2293.method1300(class282.field4263, class201.field2925, class393.field5897, -class350.field5383 & 0x3FFF, -class431.field6396 & 0x3FFF, -class487.field7247 & 0x3FFF);
            class407.field6147.method55(class151.field2293);
            class407.field6147.method59(var8 / 2 + var7, var9 - -(var6 / 2), class2.field11 << 1, class2.field11 << 1);
            class406.method2443(var8 / 2 + var7, class2.field11 << 1, var6 / 2 + var9, false, class2.field11 << 1);
            method686(-class350.field5383 & 0x3FFF, true, class393.field5897, -class431.field6396 & 0x3FFF, class201.field2925, -class487.field7247 & 0x3FFF, class282.field4263);
            if (arg3 == 4) {
                byte var21 = class454.field6661.method1534(class113.field1723, (byte) 123) == 2 ? (byte) class439.field6459 : 1;
                class84.method676(class407.field6147, class86.field1350, class336.field5185, class151.field2293, class282.field4263, class201.field2925, class393.field5897, class274.field4082, class349.field5380, class52.field671, class455.field6666, class170.field2499, class12.field119, class410.field6198.field7686 + 1, var21, class410.field6198.field7681 >> 7, class410.field6198.field7671 >> 7, !class454.field6661.field1005);
                class436.method2565(-113);
                if (class411.field6213 == 9) {
                    class301.method1872(-345763903, var6, var9, var7, 256, 256, var8);
                    class153.method1105(var7, var6, 256, var9, var8, arg3 ^ 0xFFFFFF9B, 256);
                    class259.method1623(256, var9, var8, var6, var7, -121, 256);
                    class496.method2945(var7, var8, var9, true, var6);
                }
                class133.method978();
                class282.field4263 = var14;
                class431.field6396 = var18;
                class393.field5897 = var16;
                class350.field5383 = var17;
                class201.field2925 = var15;
                if (class112.field1700 && class264.field3946.method1798(0) == 0) {
                    class112.field1700 = false;
                }
                if (class112.field1700) {
                    class407.field6147.method67(82, var8, -16777216, var7, var6, var9);
                    class351.method2123((byte) -86, class164.field2445, class221.field3157.method2103(class30.field430, (byte) 34), false);
                }
            }
        } else {
            class407.field6147.method67(103, arg2, -16777216, arg1, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        field1366 = null;
        if (arg0 != 92) {
            method683(true, -90, -35, -2, -32, -70);
        }
        field1371 = null;
        field1364 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)Ldl;")
    public final class87 method685(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1368++;
        if (arg2 != 3) {
            field1364 = null;
        }
        return new class87(arg0, arg3, arg4, arg1, this.field1370, this.field1362, this.field1359, this.field1363, this.field1360, this.field1365);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIIIII)V")
    private static final void method686(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class451.field6637 = arg6;
        if (!arg1) {
            return;
        }
        class288.field4307 = arg0;
        class530.field7810 = arg4;
        class192.field2800 = arg5;
        field1369++;
        class277.field4199 = arg3;
        class373.field5642 = arg2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
    public static final boolean method687(int arg0, int arg1, int arg2) {
        field1367++;
        if (arg1 != 2048) {
            method683(true, -103, 124, 122, -93, -21);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1362 = (short) arg5;
        this.field1365 = arg9;
        this.field1361 = arg0;
        this.field1360 = (byte) arg8;
        this.field1370 = (short) arg4;
        this.field1359 = (short) arg6;
        this.field1363 = (byte) arg7;
    }
}
