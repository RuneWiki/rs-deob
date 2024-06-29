import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class65 {

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lsk;")
    private class170 field893 = new class170();

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lwe;")
    private class24 field902 = new class24();

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Ltn;")
    private class109 field901;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "F")
    public static float field897;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lij;")
    public static class316 field888;

    // $FF: synthetic field
    @OriginalMember(owner = "client!le", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field903;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLea;)Z")
    public static final boolean method514(int arg0, byte arg1, class58 arg2) {
        field890++;
        if (arg1 <= 7) {
            method516(-121, -107, 70, -45, -29, 109, 51, -62, -74, -56, (class325) null);
        }
        int var3 = (class11.field107 - 104) / 2;
        int var4 = (class264.field3620 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class227.method1483(-21801, var52, var6, arg0, var51)) {
                        int var53 = var52;
                        if (class21.method120((byte) 59, var6, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class54.method431(73, var53, var6, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class435.field6148 = arg2.method232(var7, 0, 512, 512, 512);
        class372.method2327(74);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + 238 - 10 | 0xFF000000;
        int var10 = (((int) (Math.random() * 20.0D)) + 238 - 10 | 0x2E5AFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class372.field5155][class372.field5155];
        for (int var13 = var3; var13 < var3 + 104; var13 += class372.field5155) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class372.field5155) {
                arg2.method227(0, 0, class372.field5155 * 4, class372.field5155 * 4);
                arg2.method183(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class372.field5155; var44++) {
                        for (int var50 = 0; var50 < class372.field5155; var50++) {
                            var12[var44][var50] = class227.method1483(-21801, var37, var13 + var44, arg0, var36 + var50);
                        }
                    }
                    class82.field1130[var37].method330(0, 0, 1024, var13, var36, class372.field5155 + var13, class372.field5155 + var36, var12);
                    if (!class119.field1807) {
                        for (int var45 = -4; var45 < class372.field5155; var45++) {
                            for (int var46 = -4; var46 < class372.field5155; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var48 >= var4 && class227.method1483(-21801, var37, var47, arg0, var48)) {
                                    int var49 = var37;
                                    if (class21.method120((byte) 59, var47, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class263.method1687(arg2, (class372.field5155 - var46) * 4 - 4, var10, var45 * 4, (byte) -126, var48, var9, var47, var49);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class119.field1807) {
                    class325 var38 = class403.field5567[arg0];
                    for (int var39 = 0; var39 < class372.field5155; var39++) {
                        for (int var40 = 0; var40 < class372.field5155; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field4416[var41 - var38.field4427][var42 - var38.field4426];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method461(4, -1713569622, 4, -91, var39 * 4, (class372.field5155 - var40) * 4 - 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method459(4, (class372.field5155 - var40) * 4 - 4, -1713569622, var39 * 4, true);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method451((byte) -44, -1713569622, var39 * 4 + 3, 4, (class372.field5155 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method459(4, (class372.field5155 - var40) * 4 + 3 - 4, -1713569622, var39 * 4, true);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method451((byte) -44, -1713569622, var39 * 4, 4, (class372.field5155 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg2.method245(0, 0, class372.field5155 * 4, class372.field5155 * 4, var11, 2);
                class435.field6148.method622((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 - class372.field5155 * 4, class372.field5155 * 4, class372.field5155 * 4, 0, 0);
            }
        }
        arg2.method204();
        arg2.method183(-16777215);
        class136.method1018((byte) 127);
        class251.field3506 = 0;
        class133.field1991.method1168(123);
        if (!class119.field1807) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; (arg0 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class227.method1483(-21801, var21, var14, arg0, var20)) {
                            class223 var22 = (class223) class111.method852(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class223) class95.method734(var21, var14, var20, field903 == null ? (field903 = method522("iq")) : field903);
                            }
                            if (var22 == null) {
                                var22 = (class223) class243.method1587(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class223) class85.method680(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class447 var23 = class133.method996((byte) -19, var22.method711(true));
                                if (!var23.field6265 || class55.field701) {
                                    int var24 = var23.field6293;
                                    if (var23.field6307 != null) {
                                        for (int var25 = 0; var25 < var23.field6307.length; var25++) {
                                            if (var23.field6307[var25] != -1) {
                                                class447 var26 = class133.method996((byte) -19, var23.field6307[var25]);
                                                if (var26.field6293 >= 0) {
                                                    var24 = var26.field6293;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class430 var28 = class204.method1389(var24, -121);
                                            if (var28 != null && var28.field5985) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class403.field5567[var21].field4416;
                                            int var32 = class403.field5567[var21].field4427;
                                            int var33 = class403.field5567[var21].field4426;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 103) > var29 && var29 < var14 + 3 && (var31[var29 - (var32 - 1)][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class124.field1874[class251.field3506] = var23.field6323;
                                        class132.field1975[class251.field3506] = var29;
                                        class25.field324[class251.field3506] = var30;
                                        class251.field3506++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class430.field5988 != null) {
                class453.field6506.field4299 = 1;
                class18.method109(64, 1024, (byte) 127);
                for (int var15 = 0; var15 < class430.field5988.field2132; var15++) {
                    int var16 = class430.field5988.field2133[var15];
                    if ((var16 >> 28) == class343.field4623) {
                        int var17 = ((var16 & 0xFFFD5F7) >> 14) - class6.field65;
                        int var18 = (var16 & 0x3FFF) - class371.field5148;
                        if (var17 >= 0 && class11.field107 > var17 && var18 >= 0 && var18 < class264.field3620) {
                            class133.field1991.method1162(115, new class166(var15));
                        } else {
                            class430 var19 = class204.method1389(class430.field5988.field2140[var15], 57);
                            if (var19.field6007 != null && (var19.field5994 + var17) >= 0 && (var19.field5998 + var17) < class11.field107 && var19.field5995 + var18 >= 0 && (var18 + var19.field6006) < class264.field3620) {
                                class133.field1991.method1162(122, new class166(var15));
                            }
                        }
                    }
                }
                class18.method109(64, 128, (byte) 86);
                class453.field6506.field4299 = 2;
                class453.field6506.method1912(-1);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IJ)Lsk;")
    public final class170 method515(int arg0, long arg1) {
        field894++;
        class170 var4 = (class170) this.field901.method837((byte) -72, arg1);
        if (var4 != null) {
            this.field902.method145(var4, false);
        }
        if (arg0 != -1) {
            this.field893 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIILbm;)Z")
    public static final boolean method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class325 arg10) {
        field896++;
        int var11 = arg4;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        class340.field4600[var13][var14] = 99;
        int var16 = arg7 - var14;
        class34.field459[var13][var14] = 0;
        if (arg3 != 512) {
            return true;
        }
        byte var17 = 0;
        int var18 = 0;
        class196.field2841[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class215.field3010[var10001] = arg7;
        int[][] var19 = arg10.field4416;
        while (var26 != var18) {
            var12 = class215.field3010[var18];
            var11 = class196.field2841[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg10.field4427;
            int var23 = var12 - arg10.field4426;
            if (arg6 == -4) {
                if (arg0 == var11 && arg8 == var12) {
                    class389.field5425 = var11;
                    class214.field3002 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class146.method1051(var12, arg9, 2, false, arg0, arg5, var11, arg8, 2)) {
                    class214.field3002 = var12;
                    class389.field5425 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg10.method1988(var12, var11, 2, arg5, arg8, 1, arg0, 2, arg9, arg2)) {
                    class389.field5425 = var11;
                    class214.field3002 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg10.method1989(arg2, var11, arg8, arg5, arg0, var12, -35, arg9, 2)) {
                    class389.field5425 = var11;
                    class214.field3002 = var12;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg10.method1974(arg8, arg6, 2, arg1, arg0, var11, var12, arg3 - 512)) {
                    class389.field5425 = var11;
                    class214.field3002 = var12;
                    return true;
                }
            } else if (arg10.method1990(arg0, 2, arg8, arg1, arg3 ^ 0x220, var11, var12, arg6)) {
                class389.field5425 = var11;
                class214.field3002 = var12;
                return true;
            }
            int var25 = class34.field459[var21][var20] + 1;
            if (var21 > 0 && class340.field4600[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class196.field2841[var26] = var11 - 1;
                class215.field3010[var26] = var12;
                class340.field4600[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class340.field4600[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class196.field2841[var26] = var11 + 1;
                class215.field3010[var26] = var12;
                class340.field4600[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class340.field4600[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class196.field2841[var26] = var11;
                class215.field3010[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21][var20 - 1] = 1;
                class34.field459[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class340.field4600[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class196.field2841[var26] = var11;
                class215.field3010[var26] = var12 + 1;
                class340.field4600[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class340.field4600[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class196.field2841[var26] = var11 - 1;
                class215.field3010[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 - 1][var20 - 1] = 3;
                class34.field459[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class340.field4600[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class196.field2841[var26] = var11 + 1;
                class215.field3010[var26] = var12 - 1;
                class340.field4600[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class340.field4600[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class196.field2841[var26] = var11 - 1;
                class215.field3010[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 - 1][var20 + 1] = 6;
                class34.field459[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class340.field4600[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class196.field2841[var26] = var11 + 1;
                class215.field3010[var26] = var12 + 1;
                class340.field4600[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21 + 1][var20 + 1] = var25;
            }
        }
        class214.field3002 = var12;
        class389.field5425 = var11;
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method517(int arg0) {
        if (arg0 != 11978) {
            return;
        }
        field891++;
        this.field902.method151(77);
        this.field901.method843(arg0 ^ 0xFFFFD135);
        this.field893 = new class170();
        this.field900 = this.field899;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method518(int arg0) {
        field888 = null;
        if (arg0 != -8299) {
            field885 = -57;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JZLsk;)V")
    public final void method519(long arg0, boolean arg1, class170 arg2) {
        if (this.field900 == 0) {
            class170 var5 = this.field902.method146((byte) 121);
            var5.method1884(false);
            var5.method1213((byte) 106);
            if (this.field893 == var5) {
                class170 var6 = this.field902.method146((byte) 121);
                var6.method1884(!arg1);
                var6.method1213((byte) 106);
            }
        } else {
            this.field900--;
        }
        field895++;
        this.field901.method835(4, arg2, arg0);
        this.field902.method145(arg2, false);
        if (!arg1) {
            method521((byte) -61);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIBIII)V")
    public static final void method520(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field886++;
        int var7 = 80 % ((arg3 + 43) / 60);
        if (class80.field1119 <= arg2 - arg1 && arg1 + arg2 <= class430.field6003 && arg5 - arg1 >= class143.field2090 && class42.field543 >= (arg5 + arg1)) {
            class225.method1482(arg6, arg0, (byte) -108, arg4, arg2, arg1, arg5);
        } else {
            class276.method1742(arg5, arg0, arg6, arg2, -1743385695, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method521(byte arg0) {
        field892++;
        class178.field2543 = new String[500];
        class82.field1135 = class280.field3810.field5419 + class280.field3810.field5406 + 2;
        class118.field1799 = class387.field5363.field5419 + class387.field5363.field5406 + 2;
        for (int var1 = 0; var1 < class178.field2543.length; var1++) {
            class178.field2543[var1] = "";
        }
        if (arg0 != 71) {
            field897 = -0.30680373F;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
    public class65(int arg0) {
        this.field900 = arg0;
        this.field899 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field901 = new class109(var2);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method522(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class368("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
