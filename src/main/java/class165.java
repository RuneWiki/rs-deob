import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class165 extends class172 {

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Z")
    public static boolean field2611 = true;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field2621 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2616 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!da", name = "C", descriptor = "Ll;")
    public static class66 field2626 = new class66(64);

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2628 = "Loading defaults - ";

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Lth;")
    public static class153 field2627;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
    public boolean field2624;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZII)V", line = 4)
    public static final void method1309(boolean arg0, int arg1, int arg2) {
        field2612++;
        class138 var3 = class149.method1242(arg2, 0, 12);
        if (!arg0) {
            method1309(false, -95, 54);
        }
        var3.method1153((byte) 50);
        var3.field2282 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z", line = 26)
    public static final boolean method1310(byte arg0) {
        field2613++;
        if (arg0 >= -50) {
            field2628 = (String) null;
        }
        try {
            return class34.method352(false);
        } catch (IOException var5) {
            class184.method1423((byte) 125);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class123.field1966 + "," + class353.field5642 + "," + class203.field3150 + " - " + class122.field1945 + "," + (class173.field2746.field1300[0] + class358.field5696) + "," + (class173.field2746.field1290[0] + class49.field755) + " - ";
            for (int var4 = 0; var4 < class122.field1945 && var4 < 50; var4++) {
                var3 = var3 + class244.field3803.field448[var4] + ",";
            }
            client.method1023((byte) -109, var3, var6);
            class197.method1493(81);
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)I", line = 55)
    public static final int method1311(int arg0, int arg1, int arg2) {
        if (arg2 > -86) {
            return -53;
        }
        field2620++;
        int var3 = class305.method2193(arg1 + 91923, 4, arg0 + 45365, true) - (-(class305.method2193(arg1 + 37821, 2, arg0 + 10294, true) + -128 >> 1) + -(class305.method2193(arg1, 1, arg0, true) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I", line = 80)
    public final int method1312(int arg0) {
        int var2 = 28 / ((-arg0 - 69) / 32);
        field2622++;
        return 1;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Z", line = 94)
    public final boolean method1313(int arg0) {
        if (arg0 == 2) {
            field2625++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Z", line = 108)
    public final boolean method1314(int arg0) {
        if (arg0 == 1) {
            field2619++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([[F[[I[[B[[[I[[I[[B[[F[[F[[II[[[B[[B[[I[[B[[II)[Lmi;", line = 120)
    public static final class125[] method1315(float[][] arg0, int[][] arg1, byte[][] arg2, int[][][] arg3, int[][] arg4, byte[][] arg5, float[][] arg6, float[][] arg7, int[][] arg8, int arg9, byte[][][] arg10, byte[][] arg11, int[][] arg12, byte[][] arg13, int[][] arg14, int arg15) {
        field2614++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg3 != null) {
                    int var20 = arg3[arg9][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg13[var17][var18];
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg13[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg13[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg13[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg13[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18];
                    }
                } else {
                    var22 = arg13[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class203 var23 = class155.method1270((byte) -124, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field3137 + 1 << 16) + var23.field3141;
                }
            }
        }
        class37 var24 = new class37(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg13[var25][var26] != 0) {
                    int[] var27;
                    if (arg2[var25][var26] == 0) {
                        var27 = class263.field4091[0];
                    } else {
                        var27 = class205.field3166[arg11[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg1 != null) {
                        var28 = arg1[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25][var26];
                    int var31 = var16[var25 + 1][var26 + 1];
                    long var32 = (long) var29 << 32 | (long) var28;
                    int var34 = var16[var25][var26 + 1];
                    long var35 = (long) var28 | (long) var30 << 32;
                    long var37 = (long) var31 << 32 | (long) var28;
                    long var39 = (long) var28 | (long) var34 << 32;
                    int var41 = var27.length / 2;
                    class125 var42 = (class125) var24.method370((byte) -120, var35);
                    if (var42 == null) {
                        var42 = new class125((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg12 != null, var28);
                        var24.method375(var42, var35, arg15 + 117);
                    }
                    var42.field2091++;
                    var42.field2080 += var41;
                    if (var32 != var35) {
                        class125 var43 = (class125) var24.method370((byte) -120, var32);
                        if (var43 == null) {
                            var43 = new class125((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg12 != null, var28);
                            var24.method375(var43, var32, 4);
                        }
                        var43.field2080 += var41;
                        var43.field2091++;
                    }
                    if (var35 != var37 && var32 != var37) {
                        class125 var44 = (class125) var24.method370((byte) -120, var37);
                        if (var44 == null) {
                            var44 = new class125((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg12 != null, var28);
                            var24.method375(var44, var37, 53);
                        }
                        var44.field2080 += var41;
                        var44.field2091++;
                    }
                    if (var35 != var39 && var32 != var39 && var37 != var39) {
                        class125 var45 = (class125) var24.method370((byte) -120, var39);
                        if (var45 == null) {
                            var45 = new class125((var34 >> 16) - 1, (float) (var34 & 0xFFFF), false, arg12 != null, var28);
                            var24.method375(var45, var39, -88);
                        }
                        var45.field2091++;
                        var45.field2080 += var41;
                    }
                }
            }
        }
        for (class125 var46 = (class125) var24.method371(-19139); var46 != null; var46 = (class125) var24.method378((byte) -104)) {
            var46.method1082();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg13[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg10[arg9][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg10[1][var47][var48] & 0x2) == 2 && arg9 > 0) {
                        var50 = arg9 - 1;
                    } else {
                        var50 = arg9;
                    }
                    int var51 = 128;
                    int var52 = 0;
                    if (arg1 != null) {
                        var51 = arg1[var47][var48] >>> 24 << 3;
                        var52 = arg1[var47][var48] & 0xFFFFFF;
                    }
                    boolean[] var53 = null;
                    byte var54;
                    int[] var55;
                    if (arg2[var47][var48] == 0) {
                        var55 = class263.field4091[0];
                        byte var56 = 0;
                        int var57 = var56 + (arg13[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        byte var58 = 0;
                        int var59 = var58 + (arg13[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var60 = 0;
                        if (arg13[var47][var48 - 1] == var49) {
                            var59++;
                            var57++;
                        } else {
                            var57--;
                            var59--;
                        }
                        int var61 = var60 + (arg13[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        byte var62 = 0;
                        int var63 = var62 + (arg13[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg13[var47 + 1][var48] == var49) {
                            var57++;
                            var63++;
                        } else {
                            var57--;
                            var63--;
                        }
                        if (arg13[var47][var48 + 1] == var49) {
                            var61++;
                            var63++;
                        } else {
                            var61--;
                            var63--;
                        }
                        if (arg13[var47 - 1][var48] == var49) {
                            var59++;
                            var61++;
                        } else {
                            var61--;
                            var59--;
                        }
                        int var64 = var57 - var61;
                        int var65 = var59 - var63;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var54 = (byte) (var65 >= var64 ? 0 : 1);
                        arg5[var47][var48] = var54;
                    } else {
                        var54 = arg5[var47][var48];
                        var55 = class205.field3166[arg11[var47][var48]];
                        var53 = class256.field3939[arg11[var47][var48]];
                        if (var55.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48 + 1];
                    int var68 = var16[var47][var48 + 1];
                    int var69 = var16[var47 + 1][var48];
                    long var70 = (long) var69 << 32 | (long) var52;
                    long var72 = (long) var52 | (long) var66 << 32;
                    long var74 = (long) var52 | (long) var67 << 32;
                    long var76 = (long) var68 << 32 | (long) var52;
                    int var78 = arg4[var47][var48];
                    int var79 = arg4[var47 + 1][var48 + 1];
                    int var80 = arg4[var47 + 1][var48];
                    int var81 = arg4[var47][var48 + 1];
                    int var82 = arg14[var47][var48];
                    int var83 = arg14[var47 + 1][var48];
                    int var84 = arg14[var47 + 1][var48 + 1];
                    int var85 = arg14[var47][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var69 >> 16) - 1;
                    int var88 = (var67 >> 16) - 1;
                    int var89 = (var68 >> 16) - 1;
                    class125 var90 = (class125) var24.method370((byte) -120, var72);
                    class342.method2407(class42.method433(var85, arg15 + 22, var86, var81), arg8, var54, var51, class42.method433(var84, arg15 - 110, var86, var79), arg6, var69 >= var66, var67 >= var66, -110, var53, var90, var48, arg7, var66 <= var68, class42.method433(var82, -128, var86, var78), var66 <= var66, arg12, var47, var50, var55, class42.method433(var83, -115, var86, var80), arg0);
                    if (var70 != var72) {
                        class125 var91 = (class125) var24.method370((byte) -120, var70);
                        class342.method2407(class42.method433(var85, 28, var87, var81), arg8, var54, var51, class42.method433(var84, arg15 - 127, var87, var79), arg6, var69 <= var69, var69 <= var67, arg15 - 117, var53, var91, var48, arg7, var68 >= var69, class42.method433(var82, arg15 - 120, var87, var78), var66 >= var69, arg12, var47, var50, var55, class42.method433(var83, -116, var87, var80), arg0);
                    }
                    if (var72 != var74 && var70 != var74) {
                        class125 var92 = (class125) var24.method370((byte) -120, var74);
                        class342.method2407(class42.method433(var85, 112, var88, var81), arg8, var54, var51, class42.method433(var84, 107, var88, var79), arg6, var67 <= var69, var67 >= var67, -108, var53, var92, var48, arg7, var67 <= var68, class42.method433(var82, -115, var88, var78), var67 <= var66, arg12, var47, var50, var55, class42.method433(var83, arg15 ^ 0xFFFFFF8F, var88, var80), arg0);
                    }
                    if (var72 != var76 && var70 != var76 && var74 != var76) {
                        class125 var93 = (class125) var24.method370((byte) -120, var76);
                        class342.method2407(class42.method433(var85, -111, var89, var81), arg8, var54, var51, class42.method433(var84, arg15 + 15, var89, var79), arg6, var68 <= var69, var67 >= var68, -105, var53, var93, var48, arg7, var68 <= var68, class42.method433(var82, arg15 ^ 0x50, var89, var78), var66 >= var68, arg12, var47, var50, var55, class42.method433(var83, 32, var89, var80), arg0);
                    }
                }
            }
        }
        for (class125 var94 = (class125) var24.method371(-19139); var94 != null; var94 = (class125) var24.method378((byte) -61)) {
            if (var94.field2074 == 0) {
                var94.method1357(arg15 + 947647010);
            } else {
                var94.method1083();
            }
        }
        int var95 = var24.method380((byte) -92);
        class125[] var96 = new class125[var95];
        long[] var97 = new long[var95];
        var24.method379(var96, -6454);
        for (int var98 = arg15; var98 < var95; var98++) {
            var97[var98] = var96[var98].field2734;
        }
        class181.method1410(true, var96, var97);
        return var96;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()I", line = 581)
    public int method389() {
        field2623++;
        return 0;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V", line = 590)
    public static final void method1316(int arg0) {
        class53.field801.method656(0);
        if (arg0 > -111) {
            field2629 = -93;
        }
        field2615++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)Z", line = 602)
    public final boolean method1317(byte arg0) {
        if (arg0 >= -82) {
            this.method1314(97);
        }
        field2617++;
        return this.field2624;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lrn;I)V", line = 620)
    public static final void method1318(class18 arg0, int arg1) {
        field2618++;
        class57.field892 = arg0;
        if (arg1 <= 42) {
            method1309(false, -38, 94);
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V", line = 631)
    public static void method1319(int arg0) {
        if (arg0 > -8) {
            field2616 = (BigInteger) null;
        }
        field2621 = null;
        field2628 = null;
        field2616 = null;
        field2626 = null;
        field2627 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
    public abstract void method384(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
    public abstract boolean method388();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
    public abstract boolean method385();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public abstract void method386();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public abstract void method383(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
    public abstract void method387(int arg0, int arg1, int arg2, int arg3, int arg4);
}
