import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class101 extends class335 {

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "[I")
    public static int[] field1586 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Ll;")
    public static class133 field1585;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Ll;")
    public static class133 field1588;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Lwj;")
    public static class270 field1582;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 4)
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V", line = 8)
    public static void method738(int arg0) {
        field1585 = null;
        field1586 = null;
        field1588 = null;
        if (arg0 != 0) {
            field1585 = (class133) null;
        }
        field1582 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)I", line = 21)
    public static final int method739(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 68) {
            field1583++;
            return arg1 <= arg3 ? (arg0 >= arg3 ? arg3 : arg0) : arg1;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 32)
    public static final byte[] method740(boolean arg0, Object arg1, int arg2) {
        field1581++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg1);
            return arg0 ? class29.method248(var3, true) : var3;
        } else {
            if (arg2 >= -115) {
                field1588 = (class133) null;
            }
            if (!(arg1 instanceof class139)) {
                throw new IllegalArgumentException();
            }
            class139 var4 = (class139) arg1;
            return var4.method1004(0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)[I", line = 72)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        field1587++;
        if (this.field5233.field2467) {
            class343.method2376(var3, 0, class105.field1630, class280.field4316[arg0]);
        }
        if (arg1 != 621) {
            field1585 = (class133) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)[Lmi;", line = 94)
    public static final class12[] method741(int arg0) {
        if (class208.field3190 == null) {
            class12[] var1 = class342.method2367(arg0 + 25220, class32.field471);
            int var2 = 0;
            class12[] var3 = new class12[var1.length];
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class12 var5 = var1[var4];
                if ((var5.field186 <= 0 || var5.field186 >= 24) && var5.field189 >= 800 && var5.field193 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class12 var7 = var3[var6];
                        if (var5.field189 == var7.field189 && var5.field193 == var7.field193) {
                            if (var7.field186 < var5.field186) {
                                var3[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class208.field3190 = new class12[var2];
            class343.method2371(var3, 0, class208.field3190, 0, var2);
            int[] var8 = new int[class208.field3190.length];
            for (int var9 = 0; var9 < class208.field3190.length; var9++) {
                class12 var10 = class208.field3190[var9];
                var8[var9] = var10.field193 * var10.field189;
            }
            class23.method229(var8, (byte) -45, class208.field3190);
        }
        if (arg0 == 0) {
            field1589++;
            return class208.field3190;
        } else {
            return (class12[]) null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)Z", line = 169)
    public static final boolean method742(int arg0) throws IOException {
        field1584++;
        if (class295.field4568 == null) {
            return false;
        } else if (arg0 == -29217) {
            int var1 = class295.field4568.method366(60);
            if (var1 == 0) {
                return false;
            }
            if (class342.field5333 == -1) {
                class295.field4568.method367((byte) 121, 1, 0, class10.field132.field2500);
                class10.field132.field2532 = 0;
                var1--;
                class342.field5333 = class10.field132.method754(-20368);
                class186.field2778 = class317.field4952[class342.field5333];
            }
            if (class186.field2778 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class295.field4568.method367((byte) 100, 1, 0, class10.field132.field2500);
                class186.field2778 = class10.field132.field2500[0] & 0xFF;
                var1--;
            }
            if (class186.field2778 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class295.field4568.method367((byte) 101, 2, 0, class10.field132.field2500);
                var1 -= 2;
                class10.field132.field2532 = 0;
                class186.field2778 = class10.field132.method1151(arg0 ^ 0x7245);
            }
            if (class186.field2778 > var1) {
                return false;
            }
            class10.field132.field2532 = 0;
            class295.field4568.method367((byte) 106, class186.field2778, 0, class10.field132.field2500);
            class154.field2313 = 0;
            class224.field3557 = class254.field3994;
            class254.field3994 = class336.field5264;
            class336.field5264 = class342.field5333;
            if (class342.field5333 == 46) {
                int var2 = class10.field132.method1180(128);
                int var3 = class10.field132.method1180(128);
                int var4 = class10.field132.method1129(255);
                int var5 = class10.field132.method1128((byte) -26);
                if (class115.method851(111, var3)) {
                    class333.method2317(-24897, var4, (var5 << 16) + var2);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 162) {
                int var6 = class10.field132.method1119(101);
                class220 var7 = class68.method524((byte) -94, var6);
                for (int var8 = 0; var8 < var7.field3428.length; var8++) {
                    var7.field3428[var8] = -1;
                    var7.field3428[var8] = 0;
                }
                class26.method241(3095, var7);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 202) {
                class203.field3043 = class10.field132.method1153(15673);
                class90.field1442 = class10.field132.method1153(arg0 + 44890);
                for (int var390 = class203.field3043; var390 < (class203.field3043 + 8); var390++) {
                    for (int var391 = class90.field1442; var391 < class90.field1442 + 8; var391++) {
                        if (class280.field4315[class205.field3101][var390][var391] != null) {
                            class280.field4315[class205.field3101][var390][var391] = null;
                            class276.method1893(var391, var390, false);
                        }
                    }
                }
                for (class241 var392 = (class241) class273.field4229.method636(-1); var392 != null; var392 = (class241) class273.field4229.method638(114)) {
                    if (var392.field3859 >= class203.field3043 && (class203.field3043 + 8) > var392.field3859 && class90.field1442 <= var392.field3843 && var392.field3843 < (class90.field1442 + 8) && class205.field3101 == var392.field3851) {
                        var392.field3847 = 0;
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 119) {
                long var387 = class10.field132.method1165(arg0 ^ 0xFFFF8DDF);
                String var389 = class329.method2232(class195.method1387(class67.method514(class10.field132, 77), (byte) -62));
                class29.method252(var389, class34.method289(116, var387), true, 6);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 137) {
                class235.method1652(true, arg0 ^ 0x7259);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 31) {
                int var353 = class10.field132.method1128((byte) -73);
                int var354 = class10.field132.method1128((byte) -107);
                int var355 = class10.field132.method1147((byte) 75);
                int var356 = class10.field132.method1148(-2123880488);
                if ((var355 >> 30) != 0) {
                    int var381 = var355 >> 28 & 0x3;
                    int var382 = (var355 >> 14 & 0x3FFF) - class213.field3249;
                    int var383 = (var355 & 0x3FFF) - class342.field5328;
                    if (var382 >= 0 && var383 >= 0 && var382 < 104 && var383 < 104) {
                        int var384 = var383 * 128 + 64;
                        int var385 = var382 * 128 + 64;
                        class158 var386 = new class158(var356, var381, var385, var384, class320.method2181(var385, var384, -69, var381) - var353, var354, class227.field3618);
                        class89.field1430.method632(-108, new class115(var386));
                    }
                } else if ((var355 >> 29) != 0) {
                    int var357 = var355 & 0xFFFF;
                    class313 var358 = class254.field3989[var357];
                    if (var358 != null) {
                        if (var356 == 65535) {
                            var356 = -1;
                        }
                        boolean var359 = true;
                        if (var356 != -1 && var358.field1951 != -1) {
                            if (var358.field1951 == var356) {
                                class265 var360 = class112.method831(var356, true);
                                if (var360.field4133 && var360.field4117 != -1) {
                                    class281 var361 = class133.method948(var360.field4117, (byte) 33);
                                    int var362 = var361.field4330;
                                    if (var362 == 1) {
                                        var358.field1866 = 1;
                                        var359 = false;
                                        var358.field1904 = 0;
                                        var358.field1944 = 0;
                                        var358.field1885 = 0;
                                        var358.field1895 = class227.field3618 + var354;
                                        class170.method1231(false, var358.field1905, var358.field1868, var358.field1885, var361, -24255);
                                    } else if (var362 == 2) {
                                        var359 = false;
                                        var358.field1946 = 0;
                                    }
                                }
                            } else {
                                class265 var363 = class112.method831(var356, true);
                                class265 var364 = class112.method831(var358.field1951, true);
                                if (var363.field4117 != -1 && var364.field4117 != -1) {
                                    class281 var365 = class133.method948(var363.field4117, (byte) 33);
                                    class281 var366 = class133.method948(var364.field4117, (byte) 33);
                                    if (var366.field4344 > var365.field4344) {
                                        var359 = false;
                                    }
                                }
                            }
                        }
                        if (var359) {
                            var358.field1885 = 0;
                            var358.field1904 = 0;
                            var358.field1934 = var353;
                            var358.field1951 = var356;
                            var358.field1895 = class227.field3618 + var354;
                            if (var358.field1895 > class227.field3618) {
                                var358.field1885 = -1;
                            }
                            var358.field1866 = 1;
                            if (var358.field1951 != -1 && class227.field3618 == var358.field1895) {
                                int var367 = class112.method831(var358.field1951, true).field4117;
                                if (var367 != -1) {
                                    class281 var368 = class133.method948(var367, (byte) 33);
                                    if (var368 != null && var368.field4326 != null) {
                                        class170.method1231(false, var358.field1905, var358.field1868, 0, var368, arg0 ^ 0x2C9E);
                                    }
                                }
                            }
                        }
                    }
                } else if (var355 >> 28 != 0) {
                    int var369 = var355 & 0xFFFF;
                    class33 var370;
                    if (class120.field1837 == var369) {
                        var370 = class98.field1566;
                    } else {
                        var370 = class254.field3992[var369];
                    }
                    if (var370 != null) {
                        if (var356 == 65535) {
                            var356 = -1;
                        }
                        boolean var371 = true;
                        if (var356 != -1 && var370.field1951 != -1) {
                            if (var370.field1951 == var356) {
                                class265 var376 = class112.method831(var356, true);
                                if (var376.field4133 && var376.field4117 != -1) {
                                    class281 var377 = class133.method948(var376.field4117, (byte) 33);
                                    int var378 = var377.field4330;
                                    if (var378 == 1) {
                                        var370.field1904 = 0;
                                        var370.field1866 = 1;
                                        var370.field1944 = 0;
                                        var370.field1895 = class227.field3618 + var354;
                                        var370.field1885 = 0;
                                        class170.method1231(false, var370.field1905, var370.field1868, var370.field1885, var377, -24255);
                                        var371 = false;
                                    } else if (var378 == 2) {
                                        var371 = false;
                                        var370.field1946 = 0;
                                    }
                                }
                            } else {
                                class265 var372 = class112.method831(var356, true);
                                class265 var373 = class112.method831(var370.field1951, true);
                                if (var372.field4117 != -1 && var373.field4117 != -1) {
                                    class281 var374 = class133.method948(var372.field4117, (byte) 33);
                                    class281 var375 = class133.method948(var373.field4117, (byte) 33);
                                    if (var375.field4344 > var374.field4344) {
                                        var371 = false;
                                    }
                                }
                            }
                        }
                        if (var371) {
                            var370.field1885 = 0;
                            var370.field1866 = 1;
                            var370.field1934 = var353;
                            var370.field1895 = class227.field3618 + var354;
                            if (var370.field1895 > class227.field3618) {
                                var370.field1885 = -1;
                            }
                            var370.field1951 = var356;
                            var370.field1904 = 0;
                            if (var370.field1951 == 65535) {
                                var370.field1951 = -1;
                            }
                            if (var370.field1951 != -1 && class227.field3618 == var370.field1895) {
                                int var379 = class112.method831(var370.field1951, true).field4117;
                                if (var379 != -1) {
                                    class281 var380 = class133.method948(var379, (byte) 33);
                                    if (var380 != null && var380.field4326 != null) {
                                        class170.method1231(class98.field1566 == var370, var370.field1905, var370.field1868, 0, var380, -24255);
                                    }
                                }
                            }
                        }
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 143) {
                boolean var9 = false;
                long var10 = class10.field132.method1165(arg0 ^ 0xFFFF8DDF);
                if ((var10 & Long.MIN_VALUE) != 0L) {
                    var9 = true;
                }
                int var12 = class10.field132.method1151(-114);
                byte var13 = class10.field132.method1143(arg0 + 29146);
                if (var9) {
                    if (class304.field4756 == 0) {
                        class342.field5333 = -1;
                        return true;
                    }
                    long var19 = var10 & Long.MAX_VALUE;
                    boolean var21 = false;
                    int var22;
                    for (var22 = 0; class304.field4756 > var22 && (class234.field3739[var22].field758 != var19 || class234.field3739[var22].field2793 != var12); var22++) {
                    }
                    if (class304.field4756 > var22) {
                        while ((class304.field4756 - 1) > var22) {
                            class234.field3739[var22] = class234.field3739[var22 + 1];
                            var22++;
                        }
                        class304.field4756--;
                        class234.field3739[class304.field4756] = null;
                    }
                } else {
                    String var14 = class10.field132.method1179((byte) 53);
                    class187 var15 = new class187();
                    var15.field758 = var10;
                    var15.field2791 = class53.method444(1, var15.field758);
                    var15.field2798 = var13;
                    var15.field2801 = var14;
                    var15.field2793 = var12;
                    int var16;
                    for (var16 = class304.field4756 - 1; var16 >= 0; var16--) {
                        int var17 = class234.field3739[var16].field2791.compareTo(var15.field2791);
                        if (var17 == 0) {
                            class234.field3739[var16].field2793 = var12;
                            class234.field3739[var16].field2798 = var13;
                            class234.field3739[var16].field2801 = var14;
                            if (class224.field3561 == var10) {
                                class239.field3817 = var13;
                            }
                            class139.field2173 = class291.field4524;
                            class342.field5333 = -1;
                            return true;
                        }
                        if (var17 < 0) {
                            break;
                        }
                    }
                    if (class304.field4756 >= class234.field3739.length) {
                        class342.field5333 = -1;
                        return true;
                    }
                    for (int var18 = class304.field4756 - 1; var18 > var16; var18--) {
                        class234.field3739[var18 + 1] = class234.field3739[var18];
                    }
                    if (class304.field4756 == 0) {
                        class234.field3739 = new class187[100];
                    }
                    class234.field3739[var16 + 1] = var15;
                    if (class224.field3561 == var10) {
                        class239.field3817 = var13;
                    }
                    class304.field4756++;
                }
                class139.field2173 = class291.field4524;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 172) {
                int var23 = class10.field132.method1180(128);
                int var24 = class10.field132.method1147((byte) 51);
                int var25 = class10.field132.method1129(255);
                if (class115.method851(arg0 ^ 0x7277, var23)) {
                    class61 var26 = (class61) class276.field4257.method1222(0, (long) var24);
                    class61 var27 = (class61) class276.field4257.method1222(0, (long) var25);
                    if (var27 != null) {
                        class105.method761(var27, var26 == null || var26.field982 != var27.field982, false);
                    }
                    if (var26 != null) {
                        var26.method403(1);
                        class276.field4257.method1227(var26, 0, (long) var25);
                    }
                    class220 var28 = class68.method524((byte) -97, var24);
                    if (var28 != null) {
                        class26.method241(3095, var28);
                    }
                    class220 var29 = class68.method524((byte) -127, var25);
                    if (var29 != null) {
                        class26.method241(3095, var29);
                        class96.method714(true, (byte) 71, var29);
                    }
                    if (class331.field5160 != -1) {
                        class256.method1758(true, class331.field5160, 1);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 215) {
                int var345 = class10.field132.method1137(-47);
                int var346 = class10.field132.method1151(-107);
                if (var345 < -70000) {
                    var346 += 32768;
                }
                class220 var347;
                if (var345 < 0) {
                    var347 = null;
                } else {
                    var347 = class68.method524((byte) -87, var345);
                }
                if (var347 != null) {
                    for (int var348 = 0; var348 < var347.field3428.length; var348++) {
                        var347.field3428[var348] = 0;
                        var347.field3409[var348] = 0;
                    }
                }
                class264.method1799(0, var346);
                int var349 = class10.field132.method1151(-82);
                for (int var350 = 0; var350 < var349; var350++) {
                    int var351 = class10.field132.method1172(false);
                    if (var351 == 255) {
                        var351 = class10.field132.method1129(255);
                    }
                    int var352 = class10.field132.method1180(128);
                    if (var347 != null && var350 < var347.field3428.length) {
                        var347.field3428[var350] = var352;
                        var347.field3409[var350] = var351;
                    }
                    class229.method1617(9965, var352 - 1, var350, var346, var351);
                }
                if (var347 != null) {
                    class26.method241(3095, var347);
                }
                class32.method267((byte) -103);
                class37.field561[class270.method1860(31, class284.field4405++)] = class270.method1860(var346, 32767);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 233) {
                class32.method267((byte) -103);
                class216.field3276 = class10.field132.method1178(0);
                class259.field4062 = class291.field4524;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 216) {
                class280.field4305 = class10.field132.method1178(0);
                class161.field2423 = class291.field4524;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 187) {
                int var30 = class10.field132.method1180(arg0 + 29345);
                int var31 = class10.field132.method1151(-56);
                String var32 = class10.field132.method1179((byte) -126);
                if (class115.method851(-84, var31)) {
                    class264.method1805(var30, var32, -1);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 85) {
                int var341 = class10.field132.method1128((byte) -112);
                int var342 = class10.field132.method1151(-95);
                int var343 = class10.field132.method1120(78);
                if (class115.method851(arg0 + 29120, var341)) {
                    if (var343 == 2) {
                        class339.method2354(2);
                    }
                    class331.field5160 = var342;
                    class332.method2302(var342, false);
                    class274.method1885(false, 7856);
                    class110.method824(0, class331.field5160);
                    for (int var344 = 0; var344 < 100; var344++) {
                        class34.field510[var344] = true;
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 1) {
                class278.field4290 = class10.field132.method1128((byte) -33) * 30;
                class259.field4062 = class291.field4524;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 198) {
                int var33 = class10.field132.method1128((byte) -81);
                int var34 = class10.field132.method1129(255);
                int var35 = class10.field132.method1178(0);
                if (class115.method851(110, var33)) {
                    class85.method612(true, var35, var34);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 112) {
                int var338 = class10.field132.method1128((byte) -93);
                int var339 = class10.field132.method1180(128);
                int var340 = class10.field132.method1119(122);
                if (class115.method851(95, var338)) {
                    class165.method1117(-22061, var340, var339);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 171) {
                long var36 = class10.field132.method1165(arg0 ^ 0xFFFF8DDF);
                int var38 = class10.field132.method1151(-98);
                int var39 = class10.field132.method1178(0);
                boolean var40 = true;
                String var41 = "";
                if (var38 > 0) {
                    var41 = class10.field132.method1179((byte) 101);
                }
                if (var36 < 0L) {
                    var40 = false;
                    var36 &= Long.MAX_VALUE;
                }
                String var42 = class34.method289(-108, var36);
                for (int var43 = 0; var43 < class225.field3579; var43++) {
                    if (class35.field549[var43] == var36) {
                        if (class148.field2252[var43] != var38) {
                            class148.field2252[var43] = var38;
                            if (var38 > 0) {
                                class29.method252(var42 + class104.field1614, "", true, 5);
                            }
                            if (var38 == 0) {
                                class29.method252(var42 + class238.field3787, "", true, 5);
                            }
                        }
                        class1.field13[var43] = var41;
                        var42 = null;
                        class233.field3702[var43] = var39;
                        class220.field3347[var43] = var40;
                        break;
                    }
                }
                if (var42 != null && class225.field3579 < 200) {
                    class35.field549[class225.field3579] = var36;
                    class51.field828[class225.field3579] = var42;
                    class148.field2252[class225.field3579] = var38;
                    class1.field13[class225.field3579] = var41;
                    class233.field3702[class225.field3579] = var39;
                    class220.field3347[class225.field3579] = var40;
                    class225.field3579++;
                }
                int var44 = class225.field3579;
                boolean var45 = false;
                class161.field2423 = class291.field4524;
                while (var44 > 0) {
                    var44--;
                    boolean var46 = true;
                    for (int var47 = 0; var47 < var44; var47++) {
                        if (class148.field2252[var47] != class219.field3328 && class148.field2252[var47 + 1] == class219.field3328 || class148.field2252[var47] == 0 && class148.field2252[var47 + 1] != 0) {
                            var46 = false;
                            int var48 = class148.field2252[var47];
                            class148.field2252[var47] = class148.field2252[var47 + 1];
                            class148.field2252[var47 + 1] = var48;
                            String var49 = class1.field13[var47];
                            class1.field13[var47] = class1.field13[var47 + 1];
                            class1.field13[var47 + 1] = var49;
                            String var50 = class51.field828[var47];
                            class51.field828[var47] = class51.field828[var47 + 1];
                            class51.field828[var47 + 1] = var50;
                            long var51 = class35.field549[var47];
                            class35.field549[var47] = class35.field549[var47 + 1];
                            class35.field549[var47 + 1] = var51;
                            int var53 = class233.field3702[var47];
                            class233.field3702[var47] = class233.field3702[var47 + 1];
                            class233.field3702[var47 + 1] = var53;
                            boolean var54 = class220.field3347[var47];
                            class220.field3347[var47] = class220.field3347[var47 + 1];
                            class220.field3347[var47 + 1] = var54;
                        }
                    }
                    if (var46) {
                        break;
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 93 || class342.field5333 == 79 || class342.field5333 == 37 || class342.field5333 == 183 || class342.field5333 == 91 || class342.field5333 == 237 || class342.field5333 == 11 || class342.field5333 == 120 || class342.field5333 == 153 || class342.field5333 == 60 || class342.field5333 == 220 || class342.field5333 == 110 || class342.field5333 == 8 || class342.field5333 == 43) {
                class276.method1891(-24600);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 87) {
                long var55 = class10.field132.method1165(0);
                long var57 = (long) class10.field132.method1151(-103);
                long var59 = (long) class10.field132.method1156((byte) 115);
                int var61 = class10.field132.method1178(0);
                boolean var62 = false;
                long var63 = (var57 << 32) + var59;
                int var65 = 0;
                label1354: while (true) {
                    if (var65 >= 100) {
                        if (var61 <= 1) {
                            if ((!class73.field1203 || class148.field2250) && !class33.field504) {
                                for (int var66 = 0; var66 < class336.field5253; var66++) {
                                    if (class337.field5277[var66] == var55) {
                                        var62 = true;
                                        break label1354;
                                    }
                                }
                            } else {
                                var62 = true;
                            }
                        }
                        break;
                    }
                    if (class129.field2030[var65] == var63) {
                        var62 = true;
                        break;
                    }
                    var65++;
                }
                if (!var62 && class214.field3255 == 0) {
                    class129.field2030[class206.field3164] = var63;
                    class206.field3164 = (class206.field3164 + 1) % 100;
                    String var67 = class329.method2232(class195.method1387(class67.method514(class10.field132, 125), (byte) 119));
                    if (var61 == 2 || var61 == 3) {
                        class29.method252(var67, "<img=1>" + class34.method289(23, var55), true, 7);
                    } else if (var61 == 1) {
                        class29.method252(var67, "<img=0>" + class34.method289(76, var55), true, 7);
                    } else {
                        class29.method252(var67, class34.method289(-102, var55), true, 3);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 101) {
                class336.field5253 = class186.field2778 / 8;
                for (int var337 = 0; var337 < class336.field5253; var337++) {
                    class337.field5277[var337] = class10.field132.method1165(0);
                    class54.field910[var337] = class186.method1331(class337.field5277[var337], (byte) -50);
                    class281.field4346[var337] = false;
                }
                class161.field2423 = class291.field4524;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 192) {
                class32.method267((byte) -103);
                class281.field4343 = class10.field132.method1166(52);
                class342.field5333 = -1;
                class259.field4062 = class291.field4524;
                return true;
            } else if (class342.field5333 == 78) {
                int var68 = class10.field132.method1178(0);
                if (class10.field132.method1178(arg0 + 29217) == 0) {
                    class12.field191[var68] = new class188();
                } else {
                    class10.field132.field2532--;
                    class12.field191[var68] = new class188(class10.field132);
                }
                class153.field2305 = class291.field4524;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 115) {
                class10.field132.field2532 += 28;
                if (class10.field132.method1134(-128)) {
                    class143.method1017(class10.field132, class10.field132.field2532 - 28, -24209);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 28) {
                int var331 = class10.field132.method1151(-124);
                int var332 = class10.field132.method1178(0);
                int var333 = class10.field132.method1178(0);
                int var334 = class10.field132.method1151(-64);
                int var335 = class10.field132.method1178(0);
                int var336 = class10.field132.method1178(0);
                if (class115.method851(94, var331)) {
                    class85.method611(true, -86, var332, var335, var334, var336, var333);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 127) {
                class90.field1442 = class10.field132.method1153(arg0 + 44890);
                class203.field3043 = class10.field132.method1153(15673);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 118) {
                int var69 = class10.field132.method1180(128);
                int var70 = class10.field132.method1128((byte) -87);
                if (var69 == 65535) {
                    var69 = -1;
                }
                int var71 = class10.field132.method1119(117);
                if (class115.method851(-54, var70)) {
                    class327.method2219(3, var71, -1, var69, 1);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 2) {
                int var327 = class10.field132.method1178(0);
                int var328 = class10.field132.method1151(-89);
                if (var328 == 65535) {
                    var328 = -1;
                }
                String var329 = class10.field132.method1179((byte) -112);
                int var330 = class10.field132.method1120(60);
                if (var330 >= 1 && var330 <= 8) {
                    if (var329.equalsIgnoreCase("null")) {
                        var329 = null;
                    }
                    class306.field4760[var330 - 1] = var329;
                    class134.field2145[var330 - 1] = var328;
                    class112.field1742[var330 - 1] = var327 == 0;
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 20) {
                int var72 = class10.field132.method1151(-52);
                String var73 = class10.field132.method1179((byte) 127);
                int var74 = class10.field132.method1151(arg0 + 29099);
                if (class115.method851(127, var72)) {
                    class264.method1805(var74, var73, arg0 ^ 0x7220);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 140) {
                byte var324 = class10.field132.method1133((byte) -112);
                int var325 = class10.field132.method1180(128);
                int var326 = class10.field132.method1148(-2123880488);
                if (class115.method851(126, var326)) {
                    class165.method1117(-22061, var324, var325);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 25) {
                int var319 = class10.field132.method1137(arg0 + 29183);
                int var320 = class10.field132.method1148(-2123880488);
                int var321 = class10.field132.method1151(-112);
                int var322 = class10.field132.method1128((byte) -109);
                int var323 = class10.field132.method1148(-2123880488);
                if (class115.method851(98, var320)) {
                    class107.method778(var319, var323, var322, var321, (byte) -58);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 201) {
                class202.field3035 = class10.field132.method1178(arg0 ^ 0xFFFF8DDF);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 247) {
                long var75 = class10.field132.method1165(0);
                class10.field132.method1143(arg0 + 29114);
                long var77 = class10.field132.method1165(0);
                long var79 = (long) class10.field132.method1151(-104);
                long var81 = (long) class10.field132.method1156((byte) 63);
                int var83 = class10.field132.method1178(0);
                int var84 = class10.field132.method1151(-87);
                long var85 = (var79 << 32) + var81;
                boolean var87 = false;
                int var88 = 0;
                label1378: while (true) {
                    if (var88 >= 100) {
                        if (var83 <= 1) {
                            for (int var89 = 0; var89 < class336.field5253; var89++) {
                                if (class337.field5277[var89] == var75) {
                                    var87 = true;
                                    break label1378;
                                }
                            }
                        }
                        break;
                    }
                    if (class129.field2030[var88] == var85) {
                        var87 = true;
                        break;
                    }
                    var88++;
                }
                if (!var87 && class214.field3255 == 0) {
                    class129.field2030[class206.field3164] = var85;
                    class206.field3164 = (class206.field3164 + 1) % 100;
                    String var90 = class173.method1248(var84, 125).method466(class10.field132, (byte) -106);
                    if (var83 == 2 || var83 == 3) {
                        class321.method2186(20, "<img=1>" + class34.method289(-89, var75), class34.method289(arg0 ^ 0x726F, var77), arg0 + 29217, var90, var84);
                    } else if (var83 == 1) {
                        class321.method2186(20, "<img=0>" + class34.method289(arg0 + 29305, var75), class34.method289(arg0 + 29124, var77), 0, var90, var84);
                    } else {
                        class321.method2186(20, class34.method289(-94, var75), class34.method289(-116, var77), 0, var90, var84);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 18) {
                int var317 = class10.field132.method1128((byte) -91);
                int var318 = class10.field132.method1153(arg0 + 44890);
                if (class115.method851(arg0 ^ 0xFFFF8DA2, var317)) {
                    class81.field1277 = var318;
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 27) {
                class235.method1652(false, -124);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 107) {
                int var91 = class10.field132.method1147((byte) 52);
                int var92 = class10.field132.method1180(arg0 ^ 0xFFFF8D5F);
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var93 = class10.field132.method1151(arg0 ^ 0x727F);
                int var94 = class10.field132.method1148(arg0 - 2123851271);
                int var95 = class10.field132.method1119(86);
                if (var94 == 65535) {
                    var94 = -1;
                }
                if (class115.method851(-71, var93)) {
                    for (int var96 = var92; var96 <= var94; var96++) {
                        long var97 = ((long) var95 << 32) + (long) var96;
                        class160 var99 = (class160) class47.field767.method1222(0, var97);
                        class160 var100;
                        if (var99 != null) {
                            var100 = new class160(var91, var99.field2402);
                            var99.method403(arg0 ^ 0xFFFF8DDE);
                        } else if (var96 == -1) {
                            var100 = new class160(var91, class68.method524((byte) -117, var95).field3483.field2402);
                        } else {
                            var100 = new class160(var91, -1);
                        }
                        class47.field767.method1227(var100, 0, var97);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 181) {
                long var101 = class10.field132.method1165(arg0 ^ 0xFFFF8DDF);
                long var103 = (long) class10.field132.method1151(-105);
                long var105 = (long) class10.field132.method1156((byte) 104);
                int var107 = class10.field132.method1178(0);
                long var108 = (var103 << 32) + var105;
                int var110 = class10.field132.method1151(-93);
                boolean var111 = false;
                int var112 = 0;
                label1408: while (true) {
                    if (var112 < 100) {
                        if (class129.field2030[var112] != var108) {
                            var112++;
                            continue;
                        }
                        var111 = true;
                        break;
                    }
                    if (var107 <= 1) {
                        for (int var113 = 0; var113 < class336.field5253; var113++) {
                            if (class337.field5277[var113] == var101) {
                                var111 = true;
                                break label1408;
                            }
                        }
                    }
                    break;
                }
                if (!var111 && class214.field3255 == 0) {
                    class129.field2030[class206.field3164] = var108;
                    class206.field3164 = (class206.field3164 + 1) % 100;
                    String var114 = class173.method1248(var110, 24).method466(class10.field132, (byte) -54);
                    if (var107 == 2) {
                        class321.method2186(18, "<img=1>" + class34.method289(50, var101), (String) null, arg0 + 29217, var114, var110);
                    } else if (var107 == 1) {
                        class321.method2186(18, "<img=0>" + class34.method289(88, var101), (String) null, 0, var114, var110);
                    } else {
                        class321.method2186(18, class34.method289(arg0 + 29323, var101), (String) null, 0, var114, var110);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 84) {
                int var115 = class10.field132.method1151(-115);
                int var116 = class10.field132.method1137(-65);
                if (class115.method851(102, var115)) {
                    class61 var117 = (class61) class276.field4257.method1222(0, (long) var116);
                    if (var117 != null) {
                        class105.method761(var117, true, false);
                    }
                    if (class303.field4728 != null) {
                        class26.method241(3095, class303.field4728);
                        class303.field4728 = null;
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 176) {
                int var118 = class10.field132.method1122(-106);
                int var119 = class10.field132.method1163(arg0 ^ 0xFFFF72DF);
                int var120 = class10.field132.method1129(arg0 + 29472);
                int var121 = class10.field132.method1148(-2123880488);
                if (class115.method851(-74, var121)) {
                    class237.method1658(var120, var118, var119, arg0 ^ 0xFFFFD2D2);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 121) {
                class80.method580(class10.field132.method1179((byte) 71), arg0 + 29216);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 58) {
                int var315 = class10.field132.method1128((byte) -39);
                int var316 = class10.field132.method1129(255);
                class84.method596(var316, var315, arg0 ^ 0xFFFF8DAE);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 13) {
                int var312 = class10.field132.method1147((byte) 65);
                int var313 = class10.field132.method1128((byte) -83);
                int var314 = class10.field132.method1151(arg0 ^ 0x7254);
                if (class115.method851(arg0 ^ 0x7204, var314)) {
                    class315.method2147(var312, -18191, var313);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 184) {
                int var307 = class10.field132.method1119(112);
                int var308 = class10.field132.method1172(false);
                int var309 = class10.field132.method1180(arg0 ^ 0xFFFF8D5F);
                int var310 = class10.field132.method1151(-113);
                if (class115.method851(-123, var310)) {
                    class61 var311 = (class61) class276.field4257.method1222(arg0 + 29217, (long) var307);
                    if (var311 != null) {
                        class105.method761(var311, var311.field982 != var309, false);
                    }
                    class95.method712(var307, var308, (byte) -126, var309);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 44) {
                int var303 = class10.field132.method1178(0);
                int var304 = var303 >> 5;
                int var305 = var303 & 0x1F;
                if (var305 == 0) {
                    class75.field1216[var304] = null;
                    class342.field5333 = -1;
                    return true;
                }
                class235 var306 = new class235();
                var306.field3761 = var305;
                var306.field3761 = var303 & 0x3F;
                var306.field3752 = class10.field132.method1178(0);
                if (var306.field3752 >= 0 && class314.field4876.length > var306.field3752) {
                    if (var306.field3761 == 1 || var306.field3761 == 10) {
                        var306.field3757 = class10.field132.method1151(-127);
                        class10.field132.field2532 += 5;
                    } else if (var306.field3761 >= 2 && var306.field3761 <= 6) {
                        if (var306.field3761 == 2) {
                            var306.field3744 = 64;
                            var306.field3758 = 64;
                        }
                        if (var306.field3761 == 3) {
                            var306.field3744 = 0;
                            var306.field3758 = 64;
                        }
                        if (var306.field3761 == 4) {
                            var306.field3758 = 64;
                            var306.field3744 = 128;
                        }
                        if (var306.field3761 == 5) {
                            var306.field3758 = 0;
                            var306.field3744 = 64;
                        }
                        if (var306.field3761 == 6) {
                            var306.field3744 = 64;
                            var306.field3758 = 128;
                        }
                        var306.field3761 = 2;
                        var306.field3746 = class10.field132.method1151(-105);
                        var306.field3748 = class10.field132.method1151(-108);
                        var306.field3749 = class10.field132.method1178(0);
                        var306.field3754 = class10.field132.method1151(arg0 + 29105);
                    }
                    var306.field3751 = class10.field132.method1151(arg0 + 29161);
                    if (var306.field3751 == 65535) {
                        var306.field3751 = -1;
                    }
                    class75.field1216[var304] = var306;
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 180) {
                class233.method1639(0);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 221) {
                int var122 = class10.field132.method1129(arg0 ^ 0xFFFF8D20);
                int var123 = class10.field132.method1128((byte) -86);
                if (class115.method851(127, var123)) {
                    int var124 = 0;
                    if (class98.field1566.field499 != null) {
                        var124 = class98.field1566.field499.method1352(107);
                    }
                    class327.method2219(3, var122, -1, var124, 3);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 245) {
                int var125 = class10.field132.method1151(-67);
                int var126 = class10.field132.method1119(103);
                int var127 = class10.field132.method1128((byte) -92);
                int var128 = class10.field132.method1151(-57);
                int var129 = class10.field132.method1128((byte) -31);
                if (class115.method851(-61, var129)) {
                    class327.method2219(3, var126, var127, var125 | var128 << 16, 7);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 196) {
                int var130 = class10.field132.method1148(arg0 - 2123851271);
                int var131 = class10.field132.method1129(255);
                class240.method1670(var131, var130, 0);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 203) {
                int var299 = class10.field132.method1151(arg0 ^ 0x7250);
                if (var299 == 65535) {
                    var299 = -1;
                }
                int var300 = class10.field132.method1178(0);
                int var301 = class10.field132.method1151(arg0 ^ 0x727B);
                int var302 = class10.field132.method1178(0);
                class320.method2180(var301, -1, var300, var302, var299);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 131) {
                for (int var298 = 0; var298 < class285.field4461.length; var298++) {
                    if (class285.field4461[var298] != class225.field3589[var298]) {
                        class285.field4461[var298] = class225.field3589[var298];
                        class137.method992(true, var298);
                        class39.field601[class270.method1860(class139.field2169++, 31)] = var298;
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 29) {
                class108.method792((byte) 6);
                class342.field5333 = -1;
                return false;
            } else if (class342.field5333 == 231) {
                class33.method274(class32.field471, class10.field132, class186.field2778, 0);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 98) {
                long var294 = class10.field132.method1165(0);
                int var296 = class10.field132.method1151(-105);
                String var297 = class173.method1248(var296, arg0 + 29142).method466(class10.field132, (byte) -127);
                class321.method2186(19, class34.method289(118, var294), (String) null, 0, var297, var296);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 0) {
                int var132 = class10.field132.method1120(89);
                int var133 = class10.field132.method1172(false);
                int var134 = class10.field132.method1172(false);
                class205.field3101 = var133 >> 1;
                class98.field1566.method276((var133 & 0x1) == 1, var132, -9749, var134);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 226) {
                int var135 = class10.field132.method1147((byte) 76);
                int var136 = class10.field132.method1148(-2123880488);
                int var137 = class10.field132.method1166(52);
                if (class115.method851(-94, var136)) {
                    class185.method1326((byte) -38, var137, var135);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 178) {
                int var293 = class10.field132.method1151(-93);
                if (class115.method851(-119, var293)) {
                    class18.method141((byte) -56);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 33) {
                int var138 = class10.field132.method1151(-118);
                if (class115.method851(arg0 + 29160, var138)) {
                    class225.method1592(-1);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 160) {
                class203.field3043 = class10.field132.method1178(arg0 ^ 0xFFFF8DDF);
                class90.field1442 = class10.field132.method1120(70);
                while (class10.field132.field2532 < class186.field2778) {
                    class342.field5333 = class10.field132.method1178(0);
                    class276.method1891(-24600);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 64) {
                int var291 = class10.field132.method1180(128);
                byte var292 = class10.field132.method1176(128);
                class84.method596(var292, var291, arg0 + 29271);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 174) {
                int var139 = class10.field132.method1151(-74);
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = class10.field132.method1180(128);
                int var141 = class10.field132.method1147((byte) 58);
                if (class115.method851(arg0 + 29115, var140)) {
                    class327.method2219(3, var141, -1, var139, 2);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 22) {
                class235.method1653(-103);
                class32.method267((byte) -103);
                class342.field5333 = -1;
                class139.field2169 += 32;
                return true;
            } else if (class342.field5333 == 186) {
                int var290 = class10.field132.method1148(-2123880488);
                class58.method459(-101, var290);
                class37.field561[class270.method1860(class284.field4405++, 31)] = class270.method1860(32767, var290);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 145) {
                int var142 = class10.field132.method1151(-69);
                int var143 = class10.field132.method1178(0);
                int var144 = class10.field132.method1178(0);
                int var145 = class10.field132.method1151(-114);
                int var146 = class10.field132.method1178(0);
                int var147 = class10.field132.method1178(0);
                if (class115.method851(arg0 ^ 0x725A, var142)) {
                    class81.method581(var146, var143, (byte) 125, var145, var144, var147);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 210) {
                int var279 = class10.field132.method1180(128);
                if (var279 == 65535) {
                    var279 = -1;
                }
                int var280 = class10.field132.method1153(15673);
                int var281 = var280 & 0x3;
                int var282 = var280 >> 2;
                int var283 = class177.field2683[var282];
                int var284 = class10.field132.method1147((byte) 79);
                int var285 = var284 & 0x3FFF;
                int var286 = var285 - class342.field5328;
                int var287 = (var284 & 0xFFFC94E) >> 14;
                int var288 = var284 >> 28 & 0x3;
                int var289 = var287 - class213.field3249;
                class143.method1016(-103, var283, var286, var281, var279, var288, var282, var289);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 213) {
                if (class186.field2778 == 0) {
                    class152.field2294 = class91.field1453;
                } else {
                    class152.field2294 = class10.field132.method1179((byte) -92);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 6) {
                class96.field1533 = class10.field132.method1178(0);
                class104.field1618 = class10.field132.method1178(arg0 ^ 0xFFFF8DDF);
                class160.field2400 = class10.field132.method1178(0);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 117) {
                int var273 = class10.field132.method1151(-60);
                int var274 = class10.field132.method1178(arg0 ^ 0xFFFF8DDF);
                int var275 = class10.field132.method1178(0);
                int var276 = class10.field132.method1178(0);
                int var277 = class10.field132.method1178(0);
                int var278 = class10.field132.method1151(-92);
                if (class115.method851(90, var273)) {
                    class267.field4166[var274] = true;
                    class92.field1466[var274] = var275;
                    class220.field3514[var274] = var276;
                    class214.field3258[var274] = var277;
                    class336.field5254[var274] = var278;
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 169) {
                int var148 = class10.field132.method1180(arg0 + 29345);
                int var149 = class10.field132.method1180(128);
                int var150 = class10.field132.method1151(-88);
                if (class115.method851(arg0 ^ 0xFFFF8DA8, var150)) {
                    class264.method1807(true, var149, var148);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 234) {
                long var151 = class10.field132.method1165(0);
                class10.field132.method1143(arg0 + 29134);
                long var153 = class10.field132.method1165(0);
                long var155 = (long) class10.field132.method1151(-66);
                long var157 = (long) class10.field132.method1156((byte) 127);
                boolean var159 = false;
                int var160 = class10.field132.method1178(0);
                long var161 = (var155 << 32) + var157;
                int var163 = 0;
                label1440: while (true) {
                    if (var163 < 100) {
                        if (class129.field2030[var163] != var161) {
                            var163++;
                            continue;
                        }
                        var159 = true;
                        break;
                    }
                    if (var160 <= 1) {
                        if ((!class73.field1203 || class148.field2250) && !class33.field504) {
                            for (int var164 = 0; var164 < class336.field5253; var164++) {
                                if (class337.field5277[var164] == var151) {
                                    var159 = true;
                                    break label1440;
                                }
                            }
                        } else {
                            var159 = true;
                        }
                    }
                    break;
                }
                if (!var159 && class214.field3255 == 0) {
                    class129.field2030[class206.field3164] = var161;
                    class206.field3164 = (class206.field3164 + 1) % 100;
                    String var165 = class329.method2232(class195.method1387(class67.method514(class10.field132, 96), (byte) 101));
                    if (var160 == 2 || var160 == 3) {
                        class220.method1562(class34.method289(-101, var153), var165, (byte) -125, 9, "<img=1>" + class34.method289(-111, var151));
                    } else if (var160 == 1) {
                        class220.method1562(class34.method289(-105, var153), var165, (byte) -35, 9, "<img=0>" + class34.method289(70, var151));
                    } else {
                        class220.method1562(class34.method289(-91, var153), var165, (byte) -91, 9, class34.method289(-91, var151));
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 228) {
                class139.field2173 = class291.field4524;
                long var166 = class10.field132.method1165(0);
                if (var166 == 0L) {
                    class342.field5333 = -1;
                    class304.field4756 = 0;
                    class234.field3739 = null;
                    class321.field5017 = null;
                    class189.field2824 = null;
                    return true;
                }
                long var168 = class10.field132.method1165(0);
                class321.field5017 = class53.method444(arg0 + 29218, var168);
                class189.field2824 = class53.method444(arg0 ^ 0xFFFF8DDE, var166);
                class7.field97 = class10.field132.method1143(-89);
                int var170 = class10.field132.method1178(0);
                if (var170 == 255) {
                    class342.field5333 = -1;
                    return true;
                }
                class304.field4756 = var170;
                class187[] var171 = new class187[100];
                for (int var172 = 0; var172 < class304.field4756; var172++) {
                    var171[var172] = new class187();
                    var171[var172].field758 = class10.field132.method1165(0);
                    var171[var172].field2791 = class53.method444(1, var171[var172].field758);
                    var171[var172].field2793 = class10.field132.method1151(arg0 ^ 0x7274);
                    var171[var172].field2798 = class10.field132.method1143(99);
                    var171[var172].field2801 = class10.field132.method1179((byte) -128);
                    if (class224.field3561 == var171[var172].field758) {
                        class239.field3817 = var171[var172].field2798;
                    }
                }
                boolean var173 = false;
                int var174 = class304.field4756;
                while (var174 > 0) {
                    var174--;
                    boolean var175 = true;
                    for (int var176 = 0; var176 < var174; var176++) {
                        if (var171[var176].field2791.compareTo(var171[var176 + 1].field2791) > 0) {
                            class187 var177 = var171[var176];
                            var175 = false;
                            var171[var176] = var171[var176 + 1];
                            var171[var176 + 1] = var177;
                        }
                    }
                    if (var175) {
                        break;
                    }
                }
                class342.field5333 = -1;
                class234.field3739 = var171;
                return true;
            } else if (class342.field5333 == 86) {
                class130.field2042 = 0;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 214) {
                int var272 = class10.field132.method1129(255);
                class176.field2675 = class32.field471.method1288((byte) 120, var272);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 212) {
                if (class331.field5160 != -1) {
                    class256.method1758(true, class331.field5160, 0);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 113) {
                int var266 = class10.field132.method1137(-46);
                int var267 = class10.field132.method1151(arg0 ^ 0x7249);
                if (var266 < -70000) {
                    var267 += 32768;
                }
                class220 var268;
                if (var266 >= 0) {
                    var268 = class68.method524((byte) -83, var266);
                } else {
                    var268 = null;
                }
                while (class186.field2778 > class10.field132.field2532) {
                    int var269 = class10.field132.method1145(128);
                    int var270 = class10.field132.method1151(arg0 ^ 0x7217);
                    int var271 = 0;
                    if (var270 != 0) {
                        var271 = class10.field132.method1178(arg0 + 29217);
                        if (var271 == 255) {
                            var271 = class10.field132.method1137(70);
                        }
                    }
                    if (var268 != null && var269 >= 0 && var269 < var268.field3428.length) {
                        var268.field3428[var269] = var270;
                        var268.field3409[var269] = var271;
                    }
                    class229.method1617(9965, var270 - 1, var269, var267, var271);
                }
                if (var268 != null) {
                    class26.method241(3095, var268);
                }
                class32.method267((byte) -103);
                class37.field561[class270.method1860(31, class284.field4405++)] = class270.method1860(var267, 32767);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 199) {
                int var178 = class10.field132.method1129(arg0 + 29472);
                int var179 = class10.field132.method1180(128);
                if (var179 == 65535) {
                    var179 = -1;
                }
                int var180 = class10.field132.method1151(-126);
                int var181 = class10.field132.method1148(-2123880488);
                int var182 = class10.field132.method1180(128);
                if (var182 == 65535) {
                    var182 = -1;
                }
                if (class115.method851(106, var181)) {
                    for (int var183 = var182; var183 <= var179; var183++) {
                        long var184 = ((long) var178 << 32) + (long) var183;
                        class160 var186 = (class160) class47.field767.method1222(arg0 ^ 0xFFFF8DDF, var184);
                        class160 var187;
                        if (var186 != null) {
                            var187 = new class160(var186.field2403, var180);
                            var186.method403(1);
                        } else if (var183 == -1) {
                            var187 = new class160(class68.method524((byte) -97, var178).field3483.field2403, var180);
                        } else {
                            var187 = new class160(0, var180);
                        }
                        class47.field767.method1227(var187, 0, var184);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 54) {
                String var263 = class10.field132.method1179((byte) -84);
                int var264 = class10.field132.method1119(arg0 ^ 0xFFFF8D80);
                int var265 = class10.field132.method1180(128);
                if (class115.method851(-69, var265)) {
                    class103.method747(3, var263, var264);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 65) {
                int var188 = class10.field132.method1151(-50);
                int var189 = class10.field132.method1172(false);
                int var190 = class10.field132.method1128((byte) -67);
                class313 var191 = class254.field3989[var190];
                if (var191 != null) {
                    class338.method2344(106, var188, var189, var191);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 255) {
                class32.method267((byte) -103);
                int var192 = class10.field132.method1178(arg0 + 29217);
                int var193 = class10.field132.method1147((byte) 123);
                int var194 = class10.field132.method1178(0);
                class48.field791[var192] = var193;
                class46.field764[var192] = var194;
                class128.field2004[var192] = 1;
                for (int var195 = 0; var195 < 98; var195++) {
                    if (class242.field3869[var195] <= var193) {
                        class128.field2004[var192] = var195 + 2;
                    }
                }
                class130.field2040[class270.method1860(class60.field976++, 31)] = var192;
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 50) {
                if (class195.field2917 != null) {
                    class289.method1985(-1, false, -53, class322.field5029, -1);
                }
                byte[] var196 = new byte[class186.field2778];
                class10.field132.method751(class186.field2778, 0, (byte) -25, var196);
                String var197 = class26.method240(var196, (byte) -109, 0, class186.field2778);
                if (class92.field1464 == null && class180.field2718 == 3 || !class180.field2719.startsWith("win") || class194.field2909) {
                    class231.method1629(var197, (byte) 127, true);
                } else {
                    class190.field2856 = var197;
                    class210.field3212 = true;
                    class139.field2171 = class32.field471.method1282(var197, -28);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 70) {
                class220.method1553(8596);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 47) {
                int var198 = class10.field132.method1180(128);
                int var199 = class10.field132.method1120(arg0 ^ 0xFFFF8DE3);
                if (var198 == 65535) {
                    var198 = -1;
                }
                class241.method1672(var198, var199, (byte) 64);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 223) {
                int var200 = class10.field132.method1131(-2);
                int var201 = class10.field132.method1180(128);
                if (var201 == 65535) {
                    var201 = -1;
                }
                int var202 = class10.field132.method1120(86);
                class35.method293(false, var200, var202, var201);
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 175) {
                for (int var203 = 0; var203 < class254.field3992.length; var203++) {
                    if (class254.field3992[var203] != null) {
                        class254.field3992[var203].field1912 = -1;
                    }
                }
                for (int var204 = 0; var204 < class254.field3989.length; var204++) {
                    if (class254.field3989[var204] != null) {
                        class254.field3989[var204].field1912 = -1;
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 138) {
                int var256 = class10.field132.method1180(arg0 ^ 0xFFFF8D5F);
                int var257 = class10.field132.method1148(-2123880488);
                int var258 = class10.field132.method1129(255);
                if (var257 == 65535) {
                    var257 = -1;
                }
                int var259 = class10.field132.method1119(arg0 + 29322);
                if (class115.method851(95, var256)) {
                    class220 var260 = class68.method524((byte) -120, var259);
                    if (var260.field3445) {
                        class176.method1257(var259, (byte) 49, var258, var257);
                        class299 var262 = class237.method1657(2, var257);
                        class107.method778(var259, var262.field4631, var262.field4607, var262.field4663, (byte) -58);
                        class117.method861(var262.field4661, var262.field4662, false, var259, var262.field4680);
                    } else if (var257 == -1) {
                        class342.field5333 = -1;
                        var260.field3372 = 0;
                        return true;
                    } else {
                        class299 var261 = class237.method1657(2, var257);
                        var260.field3372 = 4;
                        var260.field3350 = var261.field4663;
                        var260.field3505 = var261.field4607;
                        var260.field3516 = var261.field4631 * 100 / var258;
                        var260.field3466 = var257;
                        class26.method241(arg0 + 32312, var260);
                    }
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 69) {
                int var251 = class10.field132.method1151(-107);
                String var252 = class10.field132.method1179((byte) 125);
                Object[] var253 = new Object[var252.length() + 1];
                for (int var254 = var252.length() - 1; var254 >= 0; var254--) {
                    if (var252.charAt(var254) == 's') {
                        var253[var254 + 1] = class10.field132.method1179((byte) 98);
                    } else {
                        var253[var254 + 1] = Integer.valueOf(class10.field132.method1137(62));
                    }
                }
                var253[0] = Integer.valueOf(class10.field132.method1137(-73));
                if (class115.method851(-39, var251)) {
                    class240 var255 = new class240();
                    var255.field3826 = var253;
                    class336.method2337(var255, (byte) -71);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 177) {
                int var205 = class10.field132.method1129(255);
                int var206 = class10.field132.method1128((byte) -100);
                int var207 = class10.field132.method1148(-2123880488);
                if (class115.method851(arg0 ^ 0x724E, var206)) {
                    class111.method826(var205, 23150, var207);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 53) {
                String var210 = class10.field132.method1179((byte) 57);
                if (var210.endsWith(":tradereq:")) {
                    String var246 = var210.substring(0, var210.indexOf(":"));
                    boolean var247 = false;
                    long var248 = class128.method926(var246, (byte) -72);
                    for (int var250 = 0; var250 < class336.field5253; var250++) {
                        if (class337.field5277[var250] == var248) {
                            var247 = true;
                            break;
                        }
                    }
                    if (!var247 && class214.field3255 == 0) {
                        class29.method252(class185.field2774, var246, true, 4);
                    }
                } else if (var210.endsWith(":chalreq:")) {
                    boolean var211 = false;
                    String var212 = var210.substring(0, var210.indexOf(":"));
                    long var213 = class128.method926(var212, (byte) -87);
                    for (int var215 = 0; var215 < class336.field5253; var215++) {
                        if (class337.field5277[var215] == var213) {
                            var211 = true;
                            break;
                        }
                    }
                    if (!var211 && class214.field3255 == 0) {
                        String var216 = var210.substring(var210.indexOf(":") + 1, var210.length() + -9);
                        class29.method252(var216, var212, true, 8);
                    }
                } else if (var210.endsWith(":assistreq:")) {
                    String var217 = var210.substring(0, var210.indexOf(":"));
                    boolean var218 = false;
                    long var219 = class128.method926(var217, (byte) -54);
                    for (int var221 = 0; var221 < class336.field5253; var221++) {
                        if (class337.field5277[var221] == var219) {
                            var218 = true;
                            break;
                        }
                    }
                    if (!var218 && class214.field3255 == 0) {
                        class29.method252("", var217, true, 10);
                    }
                } else if (var210.endsWith(":clan:")) {
                    String var222 = var210.substring(0, var210.indexOf(":clan:"));
                    class29.method252(var222, "", true, 11);
                } else if (var210.endsWith(":trade:")) {
                    String var223 = var210.substring(0, var210.indexOf(":trade:"));
                    if (class214.field3255 == 0) {
                        class29.method252(var223, "", true, 12);
                    }
                } else if (var210.endsWith(":assist:")) {
                    String var245 = var210.substring(0, var210.indexOf(":assist:"));
                    if (class214.field3255 == 0) {
                        class29.method252(var245, "", true, 13);
                    }
                } else if (var210.endsWith(":duelstake:")) {
                    String var224 = var210.substring(0, var210.indexOf(":"));
                    long var225 = class128.method926(var224, (byte) -119);
                    boolean var227 = false;
                    for (int var228 = 0; var228 < class336.field5253; var228++) {
                        if (class337.field5277[var228] == var225) {
                            var227 = true;
                            break;
                        }
                    }
                    if (!var227 && class214.field3255 == 0) {
                        class29.method252("", var224, true, 14);
                    }
                } else if (var210.endsWith(":duelfriend:")) {
                    String var240 = var210.substring(0, var210.indexOf(":"));
                    long var241 = class128.method926(var240, (byte) -96);
                    boolean var243 = false;
                    for (int var244 = 0; var244 < class336.field5253; var244++) {
                        if (class337.field5277[var244] == var241) {
                            var243 = true;
                            break;
                        }
                    }
                    if (!var243 && class214.field3255 == 0) {
                        class29.method252("", var240, true, 15);
                    }
                } else if (var210.endsWith(":clanreq:")) {
                    String var235 = var210.substring(0, var210.indexOf(":"));
                    boolean var236 = false;
                    long var237 = class128.method926(var235, (byte) -75);
                    for (int var239 = 0; var239 < class336.field5253; var239++) {
                        if (class337.field5277[var239] == var237) {
                            var236 = true;
                            break;
                        }
                    }
                    if (!var236 && class214.field3255 == 0) {
                        class29.method252("", var235, true, 16);
                    }
                } else if (var210.endsWith(":allyreq:")) {
                    boolean var229 = false;
                    String var230 = var210.substring(0, var210.indexOf(":"));
                    long var231 = class128.method926(var230, (byte) -110);
                    for (int var233 = 0; var233 < class336.field5253; var233++) {
                        if (class337.field5277[var233] == var231) {
                            var229 = true;
                            break;
                        }
                    }
                    if (!var229 && class214.field3255 == 0) {
                        String var234 = var210.substring(var210.indexOf(":") + 1, var210.length() - 9);
                        class29.method252(var234, var230, true, 21);
                    }
                } else {
                    class29.method252(var210, "", true, 0);
                }
                class342.field5333 = -1;
                return true;
            } else if (class342.field5333 == 116) {
                int var208 = class10.field132.method1153(arg0 ^ 0xFFFFB0E6);
                int var209 = class10.field132.method1128((byte) -52);
                class240.method1670(var208, var209, 0);
                class342.field5333 = -1;
                return true;
            } else {
                class184.method1322((Throwable) null, "T1 - " + class342.field5333 + "," + class254.field3994 + "," + class224.field3557 + " - " + class186.field2778, (byte) -24);
                class108.method792((byte) 6);
                return true;
            }
        } else {
            return false;
        }
    }
}
