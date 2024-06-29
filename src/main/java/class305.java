import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class305 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4727 = "scroll:";

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[I")
    public static int[] field4730 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4726 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Z")
    public static boolean field4732 = false;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4734;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I", line = 4)
    public static final int method2133(byte arg0) {
        if (arg0 == -61) {
            field4733++;
            return class35.field413;
        } else {
            return -87;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([[I[[F[[B[[I[[I[[F[[B[[B[[B[[I[[II[[[II[[F[[[B)[Lgj;", line = 18)
    public static final class245[] method2134(int[][] arg0, float[][] arg1, byte[][] arg2, int[][] arg3, int[][] arg4, float[][] arg5, byte[][] arg6, byte[][] arg7, byte[][] arg8, int[][] arg9, int[][] arg10, int arg11, int[][][] arg12, int arg13, float[][] arg14, byte[][][] arg15) {
        field4728++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg12 != null) {
                    int var20 = arg12[arg13][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg8[var17][var18];
                    if (var22 == 0) {
                        var22 = arg8[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg8[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg8[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg8[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg8[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17][var18];
                    }
                } else {
                    var22 = arg8[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg8[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg8[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class226 var23 = class270.method1962(-102, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field3227 + 1 << 16) + var23.field3223;
                }
            }
        }
        class224 var24 = new class224(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg8[var25][var26] != 0) {
                    int[] var27;
                    if (arg6[var25][var26] == 0) {
                        var27 = class280.field4348[0];
                    } else {
                        var27 = class7.field99[arg2[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg9 != null) {
                        var28 = arg9[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25][var26 + 1];
                    int var30 = var16[var25][var26];
                    int var31 = var16[var25 + 1][var26];
                    long var32 = (long) var28 | (long) var30 << 32;
                    long var34 = (long) var31 << 32 | (long) var28;
                    int var36 = var16[var25 + 1][var26 + 1];
                    long var37 = (long) var36 << 32 | (long) var28;
                    long var39 = (long) var28 | (long) var29 << 32;
                    int var41 = var27.length / 2;
                    class245 var42 = (class245) var24.method1537(var32, -22708);
                    if (var42 == null) {
                        var42 = new class245((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg10 != null, var28);
                        var24.method1541(false, var42, var32);
                    }
                    var42.field3703 += var41;
                    var42.field3709++;
                    if (var32 != var34) {
                        class245 var43 = (class245) var24.method1537(var34, -22708);
                        if (var43 == null) {
                            var43 = new class245((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1541(false, var43, var34);
                        }
                        var43.field3703 += var41;
                        var43.field3709++;
                    }
                    if (var32 != var37 && var34 != var37) {
                        class245 var44 = (class245) var24.method1537(var37, arg11 ^ 0x5D13);
                        if (var44 == null) {
                            var44 = new class245((var36 >> 16) - 1, (float) (var36 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1541(false, var44, var37);
                        }
                        var44.field3703 += var41;
                        var44.field3709++;
                    }
                    if (var32 != var39 && var34 != var39 && var37 != var39) {
                        class245 var45 = (class245) var24.method1537(var39, arg11 - 21267);
                        if (var45 == null) {
                            var45 = new class245((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1541(false, var45, var39);
                        }
                        var45.field3709++;
                        var45.field3703 += var41;
                    }
                }
            }
        }
        for (class245 var46 = (class245) var24.method1540(arg11 + 1453); var46 != null; var46 = (class245) var24.method1544(-18)) {
            var46.method1766();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg8[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg15[arg13][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg15[1][var47][var48] & 0x2) == 2 && arg13 > 0) {
                        var50 = arg13 - 1;
                    } else {
                        var50 = arg13;
                    }
                    int var51 = 0;
                    boolean[] var52 = null;
                    int var53 = 128;
                    if (arg9 != null) {
                        var53 = arg9[var47][var48] >>> 24 << 3;
                        var51 = arg9[var47][var48] & 0xFFFFFF;
                    }
                    byte var54;
                    int[] var55;
                    if (arg6[var47][var48] == 0) {
                        var55 = class280.field4348[0];
                        byte var56 = 0;
                        byte var57 = 0;
                        int var58 = var56 + (arg8[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        int var59 = var57 + (arg8[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        byte var60 = 0;
                        int var61 = var60 + (arg8[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var62 = 0;
                        if (arg8[var47][var48 - 1] == var49) {
                            var59++;
                            var61++;
                        } else {
                            var61--;
                            var59--;
                        }
                        if (arg8[var47 + 1][var48] == var49) {
                            var59++;
                            var58++;
                        } else {
                            var58--;
                            var59--;
                        }
                        int var63 = var62 + (arg8[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg8[var47][var48 + 1] == var49) {
                            var58++;
                            var63++;
                        } else {
                            var63--;
                            var58--;
                        }
                        if (arg8[var47 - 1][var48] == var49) {
                            var63++;
                            var61++;
                        } else {
                            var61--;
                            var63--;
                        }
                        int var64 = var59 - var63;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        int var65 = var61 - var58;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var54 = (byte) (var65 < var64 ? 1 : 0);
                        arg7[var47][var48] = var54;
                    } else {
                        var54 = arg7[var47][var48];
                        var52 = class232.field3383[arg2[var47][var48]];
                        var55 = class7.field99[arg2[var47][var48]];
                        if (var55.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47 + 1][var48 + 1];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47][var48];
                    long var69 = (long) var68 << 32 | (long) var51;
                    long var71 = (long) var51 | (long) var67 << 32;
                    long var73 = (long) var51 | (long) var66 << 32;
                    int var75 = arg0[var47 + 1][var48];
                    int var76 = arg0[var47 + 1][var48 + 1];
                    int var77 = arg0[var47][var48];
                    int var78 = arg0[var47][var48 + 1];
                    int var79 = arg4[var47 + 1][var48];
                    int var80 = arg4[var47 + 1][var48 + 1];
                    int var81 = var16[var47][var48 + 1];
                    int var82 = arg4[var47][var48];
                    int var83 = arg4[var47][var48 + 1];
                    int var84 = (var67 >> 16) - 1;
                    long var85 = (long) var81 << 32 | (long) var51;
                    int var87 = (var68 >> 16) - 1;
                    int var88 = (var66 >> 16) - 1;
                    int var89 = (var81 >> 16) - 1;
                    class245 var90 = (class245) var24.method1537(var69, -22708);
                    class47.method276(var68 >= var68, var47, var68 <= var81, var53, class233.method1645(var78, var87, arg11 ^ 0x5D7, var83), var66 >= var68, class233.method1645(var77, var87, -122, var82), class233.method1645(var75, var87, arg11 + 1326, var79), arg5, arg11 + 1441, arg14, var90, arg3, arg10, var48, var52, arg1, var55, var54, var67 >= var68, var50, class233.method1645(var76, var87, -112, var80));
                    if (var69 != var71) {
                        class245 var91 = (class245) var24.method1537(var71, -22708);
                        class47.method276(var68 >= var67, var47, var81 >= var67, var53, class233.method1645(var78, var84, -84, var83), var66 >= var67, class233.method1645(var77, var84, arg11 + 1351, var82), class233.method1645(var75, var84, -98, var79), arg5, arg11 ^ 0xFFFFFA5F, arg14, var91, arg3, arg10, var48, var52, arg1, var55, var54, var67 >= var67, var50, class233.method1645(var76, var84, -124, var80));
                    }
                    if (var69 != var73 && var71 != var73) {
                        class245 var92 = (class245) var24.method1537(var73, -22708);
                        class47.method276(var68 >= var66, var47, var81 >= var66, var53, class233.method1645(var78, var88, -81, var83), var66 <= var66, class233.method1645(var77, var88, arg11 + 1376, var82), class233.method1645(var75, var88, arg11 ^ 0x5ED, var79), arg5, 0, arg14, var92, arg3, arg10, var48, var52, arg1, var55, var54, var67 >= var66, var50, class233.method1645(var76, var88, -94, var80));
                    }
                    if (var69 != var85 && var71 != var85 && var73 != var85) {
                        class245 var93 = (class245) var24.method1537(var85, arg11 ^ 0x5D13);
                        class47.method276(var81 <= var68, var47, var81 <= var81, var53, class233.method1645(var78, var89, -102, var83), var66 >= var81, class233.method1645(var77, var89, arg11 ^ 0x5F5, var82), class233.method1645(var75, var89, -101, var79), arg5, arg11 ^ 0xFFFFFA5F, arg14, var93, arg3, arg10, var48, var52, arg1, var55, var54, var81 <= var67, var50, class233.method1645(var76, var89, -70, var80));
                    }
                }
            }
        }
        for (class245 var94 = (class245) var24.method1540(-124); var94 != null; var94 = (class245) var24.method1544(-32)) {
            if (var94.field3692 == 0) {
                var94.method2285(true);
            } else {
                var94.method1762();
            }
        }
        if (arg11 != -1441) {
            return (class245[]) null;
        }
        int var95 = var24.method1539(-112);
        long[] var96 = new long[var95];
        class245[] var97 = new class245[var95];
        var24.method1536(var97, 1);
        for (int var98 = 0; var98 < var95; var98++) {
            var96[var98] = var97[var98].field5065;
        }
        class208.method1430(arg11 ^ 0xFFFFA261, var97, var96);
        return var97;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 472)
    public static final void method2135(String arg0, int arg1) {
        if (arg1 != -1) {
            method2133((byte) 119);
        }
        field4729++;
        int var2 = class286.method2046(arg0, 0);
        if (var2 != -1) {
            int[] var3 = class69.field899.method466((class334.field5162.field4243[var2] & 0x3F9705CA) >> 28, -10, class334.field5162.field4243[var2] & 0x3FFF, (class334.field5162.field4243[var2] & 0xFFFE314) >> 14);
            class287.method2049(var3[1], var3[2], (byte) -124);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(CZ)C", line = 503)
    public static final char method2136(char arg0, boolean arg1) {
        field4725++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg1) {
            return 'T';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 532)
    public static void method2137(int arg0) {
        field4730 = null;
        field4727 = null;
        field4726 = null;
        field4734 = null;
        int var1 = 77 % ((69 - arg0) / 47);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I", line = 548)
    public static final int method2138(int arg0, int arg1, int arg2) {
        field4735++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return arg0 == 30503 ? (arg1 & 0xFF80) + var3 : -5;
        }
    }
}
