import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lbc;")
    public static class11 field1827 = new class11(64);

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lpe;")
    private static class109 field1830 = class141.method1120("Loaded update list", 0);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lpe;")
    public static class109 field1832 = class141.method1120("Benutzen Sie bitte eine andere Welt)3", 0);

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lpe;")
    private static class109 field1842 = class141.method1120("green:", 0);

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lpe;")
    public static class109 field1841 = field1830;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[I")
    public static int[] field1844 = new int[128];

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lpe;")
    public static class109 field1836 = field1842;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lpe;")
    public static class109 field1837 = class141.method1120("blinken1:", 0);

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lpe;")
    public static class109 field1846 = field1842;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lpe;")
    private static class109 field1847 = class141.method1120("level)2", 0);

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lpe;")
    public static class109 field1845 = field1847;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lpe;")
    public static class109 field1838 = class141.method1120("<col=c0ff00>", 0);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method719(String arg0, byte arg1) throws ClassNotFoundException {
        field1828++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            int var2 = -61 / ((arg1 + 65) / 57);
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)I")
    public static final int method720(byte arg0, int arg1, int arg2) {
        int var3 = arg2 >>> 31;
        if (arg0 > -99) {
            field1837 = null;
        }
        field1835++;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method721(byte arg0) {
        field1824++;
        try {
            if (class55.field1118 == 1) {
                int var1 = class156.field3606.method468((byte) 37);
                if (var1 > 0 && class156.field3606.method476(99)) {
                    int var2 = var1 - class95.field2036;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class156.field3606.method467(var2, 0);
                    return;
                }
                class156.field3606.method458((byte) -118);
                class156.field3606.method477(125);
                class4.field95 = null;
                class3.field61 = null;
                if (class94.field2023 == null) {
                    class55.field1118 = 0;
                } else {
                    class55.field1118 = 2;
                }
            }
            if (arg0 > -103) {
                field1832 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class156.field3606.method458((byte) -121);
            class94.field2023 = null;
            class55.field1118 = 0;
            class3.field61 = null;
            class4.field95 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field1829++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class47.field987[var12][var36] = 0;
                class23.field558[var12][var36] = 99999999;
            }
        }
        class47.field987[arg5][arg9] = 99;
        class23.field558[arg5][arg9] = 0;
        int var13 = arg5;
        int var14 = 0;
        int var15 = arg9;
        byte var16 = 0;
        class38.field818[var16] = arg5;
        boolean var17 = false;
        int var37 = var16 + 1;
        class55.field1123[var16] = arg9;
        int var18 = class38.field818.length;
        int[][] var19 = class109.field2318[class75.field1513].field1618;
        while (var14 != var37) {
            var15 = class55.field1123[var14];
            var13 = class38.field818[var14];
            var14 = (var14 + 1) % var18;
            if (arg10 == var13 && arg0 == var15) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class109.field2318[class75.field1513].method617(arg0, var15, arg3, (byte) -65, arg8 - 1, var13, arg10)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class109.field2318[class75.field1513].method611(var13, arg0, arg8 - 1, var15, arg3, 2, arg10)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg1 != 0 && class109.field2318[class75.field1513].method606(arg1, arg4, arg6, 8388608, arg0, var15, arg10, var13)) {
                var17 = true;
                break;
            }
            int var35 = class23.field558[var13][var15] + 1;
            if (var13 > 0 && class47.field987[var13 - 1][var15] == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0) {
                class38.field818[var37] = var13 - 1;
                class55.field1123[var37] = var15;
                var37 = (var37 + 1) % var18;
                class47.field987[var13 - 1][var15] = 2;
                class23.field558[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class47.field987[var13 + 1][var15] == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0) {
                class38.field818[var37] = var13 + 1;
                class55.field1123[var37] = var15;
                class47.field987[var13 + 1][var15] = 8;
                class23.field558[var13 + 1][var15] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var15 > 0 && class47.field987[var13][var15 - 1] == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class38.field818[var37] = var13;
                class55.field1123[var37] = var15 - 1;
                var37 = (var37 + 1) % var18;
                class47.field987[var13][var15 - 1] = 1;
                class23.field558[var13][var15 - 1] = var35;
            }
            if (var15 < 103 && class47.field987[var13][var15 + 1] == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class38.field818[var37] = var13;
                class55.field1123[var37] = var15 + 1;
                var37 = (var37 + 1) % var18;
                class47.field987[var13][var15 + 1] = 4;
                class23.field558[var13][var15 + 1] = var35;
            }
            if (var13 > 0 && var15 > 0 && class47.field987[var13 - 1][var15 - 1] == 0 && (var19[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class38.field818[var37] = var13 - 1;
                class55.field1123[var37] = var15 - 1;
                var37 = (var37 + 1) % var18;
                class47.field987[var13 - 1][var15 - 1] = 3;
                class23.field558[var13 - 1][var15 - 1] = var35;
            }
            if (var13 < 103 && var15 > 0 && class47.field987[var13 + 1][var15 - 1] == 0 && (var19[var13 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class38.field818[var37] = var13 + 1;
                class55.field1123[var37] = var15 - 1;
                var37 = (var37 + 1) % var18;
                class47.field987[var13 + 1][var15 - 1] = 9;
                class23.field558[var13 + 1][var15 - 1] = var35;
            }
            if (var13 > 0 && var15 < 103 && class47.field987[var13 - 1][var15 + 1] == 0 && (var19[var13 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class38.field818[var37] = var13 - 1;
                class55.field1123[var37] = var15 + 1;
                class47.field987[var13 - 1][var15 + 1] = 6;
                var37 = (var37 + 1) % var18;
                class23.field558[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class47.field987[var13 + 1][var15 + 1] == 0 && (var19[var13 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class38.field818[var37] = var13 + 1;
                class55.field1123[var37] = var15 + 1;
                class47.field987[var13 + 1][var15 + 1] = 12;
                var37 = (var37 + 1) % var18;
                class23.field558[var13 + 1][var15 + 1] = var35;
            }
        }
        class75.field1500 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg10 - var22; var23 <= arg10 + var22; var23++) {
                for (int var24 = arg0 - var22; var24 <= arg0 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class23.field558[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg10 > var23) {
                            var25 = arg10 - var23;
                        } else if (arg10 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg4 - arg10;
                        }
                        if (var24 < arg0) {
                            var26 = arg0 - var24;
                        } else if (var24 > arg0 + arg1 - 1) {
                            var26 = var24 + 1 - arg1 - arg0;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && var20 > class23.field558[var23][var24]) {
                            var15 = var24;
                            var13 = var23;
                            var21 = var27;
                            var20 = class23.field558[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg9 == var15) {
                return false;
            }
            class75.field1500 = 1;
        }
        byte var28 = 0;
        if (arg2 <= 125) {
            field1830 = null;
        }
        class38.field818[var28] = var13;
        int var38 = var28 + 1;
        class55.field1123[var28] = var15;
        int var29;
        int var30 = var29 = class47.field987[var13][var15];
        while (arg5 != var13 || arg9 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class38.field818[var38] = var13;
                class55.field1123[var38++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class47.field987[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class38.field818[var38];
            int var33 = class55.field1123[var38];
            if (arg7 == 0) {
                class13.field283++;
                class63.field1299.method535(120, -25013);
                class63.field1299.method135(var31 + var31 + 3, (byte) -50);
            }
            if (arg7 == 1) {
                class139.field3028++;
                class63.field1299.method535(95, -25013);
                class63.field1299.method135(var31 + var31 + 3 + 14, (byte) -50);
            }
            if (arg7 == 2) {
                class63.field1299.method535(74, -25013);
                class63.field1299.method135(var31 + var31 + 3, (byte) -50);
                field1834++;
            }
            class63.field1299.method129(false, class82.field1736 + var33);
            class63.field1299.method109((byte) 47, class43.field917 + var32);
            class63.field1299.method113(128, class44.field943[82] ? 1 : 0);
            class143.field3145 = class55.field1123[0];
            class88.field1865 = class38.field818[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class63.field1299.method135(class38.field818[var38] - var32, (byte) -50);
                class63.field1299.method113(128, class55.field1123[var38] - var33);
            }
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lpe;")
    public static final class109 method723(byte arg0, int arg1) {
        field1840++;
        if (arg0 <= 91) {
            field1825 = 12;
        }
        return class101.field2135[arg1].method898((byte) 123) <= 0 ? class101.field2116[arg1] : class44.method405(new class109[] { class101.field2116[arg1], class120.field2662, class101.field2135[arg1] }, (byte) -74);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1832 = null;
        field1846 = null;
        field1836 = null;
        if (arg0 != 1) {
            field1841 = null;
        }
        field1841 = null;
        field1842 = null;
        field1830 = null;
        field1837 = null;
        field1827 = null;
        field1844 = null;
        field1838 = null;
        field1845 = null;
        field1847 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILla;Lle;IZIIII)V")
    public static final void method725(int arg0, class77 arg1, class81 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field1839++;
        if (class62.field1269 && (class107.field2249[0][arg6][arg3] & 0x2) == 0) {
            if ((class107.field2249[arg7][arg6][arg3] & 0x10) != 0) {
                return;
            }
            if (class11.method99(arg3, 111, arg6, arg7) != class46.field970) {
                return;
            }
        }
        if (arg7 < class16.field407) {
            class16.field407 = arg7;
        }
        class148 var9 = class89.method736(arg5, 11893);
        int var10;
        int var11;
        if (arg0 == 1 || arg0 == 3) {
            var10 = var9.field3268;
            var11 = var9.field3240;
        } else {
            var10 = var9.field3240;
            var11 = var9.field3268;
        }
        int var12;
        int var13;
        if (arg6 + var10 <= 104) {
            var12 = (var10 + 1 >> 1) + arg6;
            var13 = arg6 + (var10 >> 1);
        } else {
            var13 = arg6;
            var12 = arg6 + 1;
        }
        int[][] var14 = class83.field1775[arg7];
        int var15 = (arg6 << 7) + (var10 << 6);
        int var16;
        int var17;
        if (arg3 + var11 > 104) {
            var16 = arg3;
            var17 = arg3 + 1;
        } else {
            var17 = (var11 + 1 >> 1) + arg3;
            var16 = (var11 >> 1) + arg3;
        }
        int var18 = var14[var12][var16] + var14[var13][var16] + var14[var13][var17] + var14[var12][var17] >> 2;
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg0 << 6) + arg8;
        if (var9.field3239 == 1) {
            var20 += 256;
        }
        int var21 = arg6 + (arg3 << 7) + (arg5 << 14) + 1073741824;
        if (!arg4) {
            return;
        }
        if (var9.field3226 == 0) {
            var21 += Integer.MIN_VALUE;
        }
        if (var9.method1162((byte) 63)) {
            class141.method1121(arg6, var9, arg0, 30923, arg3, arg7);
        }
        if (arg8 == 22) {
            if (!class62.field1269 || var9.field3226 != 0 || var9.field3278 == 1 || var9.field3222) {
                class84 var22;
                if (var9.field3273 == -1 && var9.field3229 == null) {
                    var22 = var9.method1161(var15, var14, var18, arg0, 22, var19, !arg4);
                } else {
                    var22 = new class2(arg5, 22, arg0, arg7, arg6, arg3, var9.field3273, true, null);
                }
                arg2.method662(arg7, arg6, arg3, var18, var22, var21, var20);
                if (var9.field3278 == 1 && arg1 != null) {
                    arg1.method619(arg6, arg3, (byte) -121);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class84 var45;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var45 = var9.method1161(var15, var14, var18, arg0, 10, var19, !arg4);
            } else {
                var45 = new class2(arg5, 10, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            if (var45 != null && arg2.method679(arg7, arg6, arg3, var18, var10, var11, var45, arg8 == 11 ? 256 : 0, var21, var20) && var9.field3230) {
                int var46 = 15;
                if (var45 instanceof class155) {
                    var46 = ((class155) var45).method1215() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (class126.field2796[arg7][arg6 + var47][arg3 + var48] < var46) {
                            class126.field2796[arg7][arg6 + var47][arg3 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method620(var11, var10, arg6, var9.field3276, arg3, (byte) 118);
            }
        } else if (arg8 >= 12) {
            class84 var23;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var23 = var9.method1161(var15, var14, var18, arg0, arg8, var19, false);
            } else {
                var23 = new class2(arg5, arg8, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method679(arg7, arg6, arg3, var18, 1, 1, var23, 0, var21, var20);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0) {
                class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 2340);
            }
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method620(var11, var10, arg6, var9.field3276, arg3, (byte) 118);
            }
        } else if (arg8 == 0) {
            class84 var24;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var24 = var9.method1161(var15, var14, var18, arg0, 0, var19, false);
            } else {
                var24 = new class2(arg5, 0, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method674(arg7, arg6, arg3, var18, var24, null, class64.field1304[arg0], 0, var21, var20);
            if (arg0 == 0) {
                if (var9.field3230) {
                    class126.field2796[arg7][arg6][arg3] = 50;
                    class126.field2796[arg7][arg6][arg3 + 1] = 50;
                }
                if (var9.field3247) {
                    class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 585);
                }
            } else if (arg0 == 1) {
                if (var9.field3230) {
                    class126.field2796[arg7][arg6][arg3 + 1] = 50;
                    class126.field2796[arg7][arg6 + 1][arg3 + 1] = 50;
                }
                if (var9.field3247) {
                    class6.field133[arg7][arg6][arg3 + 1] = class137.method1089(class6.field133[arg7][arg6][arg3 + 1], 1170);
                }
            } else if (arg0 == 2) {
                if (var9.field3230) {
                    class126.field2796[arg7][arg6 + 1][arg3] = 50;
                    class126.field2796[arg7][arg6 + 1][arg3 + 1] = 50;
                }
                if (var9.field3247) {
                    class6.field133[arg7][arg6 + 1][arg3] = class137.method1089(class6.field133[arg7][arg6 + 1][arg3], 585);
                }
            } else if (arg0 == 3) {
                if (var9.field3230) {
                    class126.field2796[arg7][arg6][arg3] = 50;
                    class126.field2796[arg7][arg6 + 1][arg3] = 50;
                }
                if (var9.field3247) {
                    class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 1170);
                }
            }
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method613(arg8, arg6, arg0, (byte) 58, var9.field3276, arg3);
            }
            if (var9.field3234 != 16) {
                arg2.method697(arg7, arg6, arg3, var9.field3234);
            }
        } else if (arg8 == 1) {
            class84 var25;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var25 = var9.method1161(var15, var14, var18, arg0, 1, var19, false);
            } else {
                var25 = new class2(arg5, 1, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method674(arg7, arg6, arg3, var18, var25, null, class19.field479[arg0], 0, var21, var20);
            if (var9.field3230) {
                if (arg0 == 0) {
                    class126.field2796[arg7][arg6][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    class126.field2796[arg7][arg6 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    class126.field2796[arg7][arg6 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    class126.field2796[arg7][arg6][arg3] = 50;
                }
            }
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method613(arg8, arg6, arg0, (byte) 95, var9.field3276, arg3);
            }
        } else if (arg8 == 2) {
            int var26 = arg0 + 1 & 0x3;
            class84 var27;
            class84 var28;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var27 = var9.method1161(var15, var14, var18, arg0 + 4, 2, var19, !arg4);
                var28 = var9.method1161(var15, var14, var18, var26, 2, var19, false);
            } else {
                var27 = new class2(arg5, 2, arg0 + 4, arg7, arg6, arg3, var9.field3273, true, null);
                var28 = new class2(arg5, 2, var26, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method674(arg7, arg6, arg3, var18, var27, var28, class64.field1304[arg0], class64.field1304[var26], var21, var20);
            if (var9.field3247) {
                if (arg0 == 0) {
                    class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 585);
                    class6.field133[arg7][arg6][arg3 + 1] = class137.method1089(class6.field133[arg7][arg6][arg3 + 1], 1170);
                } else if (arg0 == 1) {
                    class6.field133[arg7][arg6][arg3 + 1] = class137.method1089(class6.field133[arg7][arg6][arg3 + 1], 1170);
                    class6.field133[arg7][arg6 + 1][arg3] = class137.method1089(class6.field133[arg7][arg6 + 1][arg3], 585);
                } else if (arg0 == 2) {
                    class6.field133[arg7][arg6 + 1][arg3] = class137.method1089(class6.field133[arg7][arg6 + 1][arg3], 585);
                    class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 1170);
                } else if (arg0 == 3) {
                    class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 1170);
                    class6.field133[arg7][arg6][arg3] = class137.method1089(class6.field133[arg7][arg6][arg3], 585);
                }
            }
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method613(arg8, arg6, arg0, (byte) 63, var9.field3276, arg3);
            }
            if (var9.field3234 != 16) {
                arg2.method697(arg7, arg6, arg3, var9.field3234);
            }
        } else if (arg8 == 3) {
            class84 var29;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var29 = var9.method1161(var15, var14, var18, arg0, 3, var19, false);
            } else {
                var29 = new class2(arg5, 3, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method674(arg7, arg6, arg3, var18, var29, null, class19.field479[arg0], 0, var21, var20);
            if (var9.field3230) {
                if (arg0 == 0) {
                    class126.field2796[arg7][arg6][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    class126.field2796[arg7][arg6 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    class126.field2796[arg7][arg6 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    class126.field2796[arg7][arg6][arg3] = 50;
                }
            }
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method613(arg8, arg6, arg0, (byte) 118, var9.field3276, arg3);
            }
        } else if (arg8 == 9) {
            class84 var30;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var30 = var9.method1161(var15, var14, var18, arg0, arg8, var19, false);
            } else {
                var30 = new class2(arg5, arg8, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method679(arg7, arg6, arg3, var18, 1, 1, var30, 0, var21, var20);
            if (var9.field3278 != 0 && arg1 != null) {
                arg1.method620(var11, var10, arg6, var9.field3276, arg3, (byte) 118);
            }
            if (var9.field3234 != 16) {
                arg2.method697(arg7, arg6, arg3, var9.field3234);
            }
        } else if (arg8 == 4) {
            class84 var31;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var31 = var9.method1161(var15, var14, var18, arg0, 4, var19, false);
            } else {
                var31 = new class2(arg5, 4, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method657(arg7, arg6, arg3, var18, var31, null, class64.field1304[arg0], 0, 0, 0, var21, var20);
        } else if (arg8 == 5) {
            int var32 = arg2.method677(arg7, arg6, arg3);
            int var33 = 16;
            if (var32 != 0) {
                var33 = class89.method736(var32 >> 14 & 0x7FFF, 11893).field3234;
            }
            class84 var34;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var34 = var9.method1161(var15, var14, var18, arg0, 4, var19, false);
            } else {
                var34 = new class2(arg5, 4, arg0, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method657(arg7, arg6, arg3, var18, var34, null, class64.field1304[arg0], 0, class93.field1998[arg0] * var33, class107.field2252[arg0] * var33, var21, var20);
        } else if (arg8 == 6) {
            int var35 = 8;
            int var36 = arg2.method677(arg7, arg6, arg3);
            if (var36 != 0) {
                var35 = class89.method736(var36 >> 14 & 0x7FFF, 11893).field3234 / 2;
            }
            class84 var37;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var37 = var9.method1161(var15, var14, var18, arg0 + 4, 4, var19, false);
            } else {
                var37 = new class2(arg5, 4, arg0 + 4, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method657(arg7, arg6, arg3, var18, var37, null, 256, arg0, class158.field3652[arg0] * var35, class11.field240[arg0] * var35, var21, var20);
        } else if (arg8 == 7) {
            int var38 = arg0 + 2 & 0x3;
            class84 var39;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var39 = var9.method1161(var15, var14, var18, var38 + 4, 4, var19, false);
            } else {
                var39 = new class2(arg5, 4, var38 + 4, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method657(arg7, arg6, arg3, var18, var39, null, 256, var38, 0, 0, var21, var20);
        } else if (arg8 == 8) {
            int var40 = 8;
            int var41 = arg2.method677(arg7, arg6, arg3);
            if (var41 != 0) {
                var40 = class89.method736(var41 >> 14 & 0x7FFF, 11893).field3234 / 2;
            }
            int var42 = arg0 + 2 & 0x3;
            class84 var43;
            class84 var44;
            if (var9.field3273 == -1 && var9.field3229 == null) {
                var43 = var9.method1161(var15, var14, var18, arg0 + 4, 4, var19, false);
                var44 = var9.method1161(var15, var14, var18, var42 + 4, 4, var19, false);
            } else {
                var43 = new class2(arg5, 4, arg0 + 4, arg7, arg6, arg3, var9.field3273, true, null);
                var44 = new class2(arg5, 4, var42 + 4, arg7, arg6, arg3, var9.field3273, true, null);
            }
            arg2.method657(arg7, arg6, arg3, var18, var43, var44, 256, arg0, class158.field3652[arg0] * var40, class11.field240[arg0] * var40, var21, var20);
        }
    }
}
