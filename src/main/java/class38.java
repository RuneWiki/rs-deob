import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class38 extends class258 {

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "Ljf;")
    public static class229 field711 = class212.method1457((byte) 92, "Choisir une option");

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "Z")
    public static boolean field713 = true;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "Lvj;")
    public class107 field707;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "[B")
    public byte[] field709;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)I", line = 10)
    public final int method333(int arg0) {
        int var2 = -44 % ((-arg0 - 24) / 51);
        field706++;
        return this.field4499 ? 0 : 100;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V", line = 33)
    public static final void method334(int arg0) {
        field712++;
        class167.field2861.method609(false);
        for (int var1 = 0; var1 < 32; var1++) {
            class174.field3036[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class151.field2607[var2] = 0L;
        }
        class189.field3303 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([[[BB[[I[[I[[F[[I[[B[[F[[B[[B[[F[[II[[I[[B)[Lkc;", line = 59)
    public static final class37[] method335(byte[][][] arg0, byte arg1, int[][] arg2, int[][] arg3, float[][] arg4, int[][] arg5, byte[][] arg6, float[][] arg7, byte[][] arg8, byte[][] arg9, float[][] arg10, int[][] arg11, int arg12, int[][] arg13, byte[][] arg14) {
        field703++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg9[var16][var17];
                if (var18 == 0) {
                    var18 = arg9[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg9[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg9[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class173 var19 = class305.method2085(arg1 - 88, (var18 & 0xFF) + -1);
                    var15[var16][var17] = (var19.field3023 + 1 << 16) + var19.field3018;
                }
            }
        }
        class268 var20 = new class268(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg9[var21][var22] != 0) {
                    int[] var23;
                    if (arg14[var21][var22] == 0) {
                        var23 = class169.field2948[0];
                    } else {
                        var23 = class3.field16[arg6[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21][var22];
                    int var25 = var15[var21 + 1][var22];
                    int var26 = 0;
                    if (arg13 != null) {
                        var26 = arg13[var21][var22] & 0xFFFFFF;
                    }
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var24 << 32 | (long) var26;
                    long var31 = (long) var26 | (long) var25 << 32;
                    long var33 = (long) var26 | (long) var27 << 32;
                    int var35 = var23.length / 2;
                    class37 var36 = (class37) var20.method1890(var29, -115);
                    if (var36 == null) {
                        var36 = new class37((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg3 != null, var26);
                        var20.method1885(var29, var36, (byte) -83);
                    }
                    var36.field677 += var35;
                    var36.field688++;
                    if (var29 != var31) {
                        class37 var37 = (class37) var20.method1890(var31, -99);
                        if (var37 == null) {
                            var37 = new class37((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg3 != null, var26);
                            var20.method1885(var31, var37, (byte) -65);
                        }
                        var37.field688++;
                        var37.field677 += var35;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class37 var38 = (class37) var20.method1890(var33, -98);
                        if (var38 == null) {
                            var38 = new class37((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg3 != null, var26);
                            var20.method1885(var33, var38, (byte) -116);
                        }
                        var38.field677 += var35;
                        var38.field688++;
                    }
                    long var39 = (long) var28 << 32 | (long) var26;
                    if (var29 != var39 && var31 != var39 && var33 != var39) {
                        class37 var41 = (class37) var20.method1890(var39, arg1 ^ 0xFFFFFFC4);
                        if (var41 == null) {
                            var41 = new class37((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg3 != null, var26);
                            var20.method1885(var39, var41, (byte) -103);
                        }
                        var41.field677 += var35;
                        var41.field688++;
                    }
                }
            }
        }
        for (class37 var42 = (class37) var20.method1884((byte) -74); var42 != null; var42 = (class37) var20.method1886(-128)) {
            var42.method326();
        }
        int var43 = 1;
        if (arg1 != 89) {
            method337((class185) null, (byte) 10);
        }
        while (var43 <= 102) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg9[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg0[arg12][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg0[1][var43][var44] & 0x2) == 2 && arg12 > 0) {
                        var46 = arg12 - 1;
                    } else {
                        var46 = arg12;
                    }
                    int var47 = 0;
                    int var48 = 128;
                    boolean[] var49 = null;
                    if (arg13 != null) {
                        var47 = arg13[var43][var44] & 0xFFFFFF;
                        var48 = arg13[var43][var44] >>> 24 << 3;
                    }
                    byte var50;
                    int[] var51;
                    if (arg14[var43][var44] == 0) {
                        var51 = class169.field2948[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg9[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var54 = 0;
                        byte var55 = 0;
                        int var56 = var54 + (arg9[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        int var57 = var55 + (arg9[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        byte var58 = 0;
                        int var59 = var58 + (arg9[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg9[var43][var44 - 1] == var45) {
                            var53++;
                            var57++;
                        } else {
                            var53--;
                            var57--;
                        }
                        if (arg9[var43 + 1][var44] == var45) {
                            var57++;
                            var56++;
                        } else {
                            var56--;
                            var57--;
                        }
                        if (arg9[var43][var44 + 1] == var45) {
                            var59++;
                            var56++;
                        } else {
                            var56--;
                            var59--;
                        }
                        if (arg9[var43 - 1][var44] == var45) {
                            var59++;
                            var53++;
                        } else {
                            var59--;
                            var53--;
                        }
                        int var60 = var53 - var56;
                        int var61 = var57 - var59;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        var50 = (byte) (var60 < var61 ? 1 : 0);
                        arg8[var43][var44] = var50;
                    } else {
                        var50 = arg8[var43][var44];
                        var51 = class3.field16[arg6[var43][var44]];
                        var49 = class28.field499[arg6[var43][var44]];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44 + 1];
                    long var64 = (long) var47 | (long) var62 << 32;
                    int var66 = var15[var43][var44 + 1];
                    long var67 = (long) var47 | (long) var63 << 32;
                    int var69 = var15[var43 + 1][var44];
                    long var70 = (long) var47 | (long) var66 << 32;
                    long var72 = (long) var47 | (long) var69 << 32;
                    int var74 = arg2[var43 + 1][var44 + 1];
                    int var75 = arg2[var43][var44];
                    int var76 = arg2[var43 + 1][var44];
                    int var77 = arg2[var43][var44 + 1];
                    int var78 = arg11[var43][var44];
                    int var79 = arg11[var43][var44 + 1];
                    int var80 = (var62 >> 16) - 1;
                    int var81 = arg11[var43 + 1][var44 + 1];
                    int var82 = (var69 >> 16) - 1;
                    int var83 = (var63 >> 16) - 1;
                    int var84 = arg11[var43 + 1][var44];
                    int var85 = (var66 >> 16) - 1;
                    class37 var86 = (class37) var20.method1890(var64, arg1 - 213);
                    class61.method458(var62 <= var69, var49, var44, var43, arg10, var46, var66 >= var62, var48, arg4, arg5, class59.method453(var79, var77, var80, 718654344), class59.method453(var78, var75, var80, 718654344), var50, arg3, class59.method453(var84, var76, var80, 718654344), (byte) -81, var63 >= var62, var62 <= var62, arg7, var51, class59.method453(var81, var74, var80, 718654344), var86);
                    if (var64 != var72) {
                        class37 var87 = (class37) var20.method1890(var72, arg1 ^ 0xFFFFFFFB);
                        class61.method458(var69 >= var69, var49, var44, var43, arg10, var46, var69 <= var66, var48, arg4, arg5, class59.method453(var79, var77, var82, 718654344), class59.method453(var78, var75, var82, 718654344), var50, arg3, class59.method453(var84, var76, var82, 718654344), (byte) -81, var69 <= var63, var62 >= var69, arg7, var51, class59.method453(var81, var74, var82, arg1 + 718654255), var87);
                    }
                    if (var64 != var67 && var67 != var72) {
                        class37 var88 = (class37) var20.method1890(var67, -121);
                        class61.method458(var69 >= var63, var49, var44, var43, arg10, var46, var66 >= var63, var48, arg4, arg5, class59.method453(var79, var77, var83, 718654344), class59.method453(var78, var75, var83, 718654344), var50, arg3, class59.method453(var84, var76, var83, 718654344), (byte) -81, var63 <= var63, var62 >= var63, arg7, var51, class59.method453(var81, var74, var83, 718654344), var88);
                    }
                    if (var64 != var70 && var70 != var72 && var67 != var70) {
                        class37 var89 = (class37) var20.method1890(var70, -125);
                        class61.method458(var66 <= var69, var49, var44, var43, arg10, var46, var66 >= var66, var48, arg4, arg5, class59.method453(var79, var77, var85, 718654344), class59.method453(var78, var75, var85, 718654344), var50, arg3, class59.method453(var84, var76, var85, arg1 ^ 0x2AD5CBD1), (byte) -81, var66 <= var63, var66 <= var62, arg7, var51, class59.method453(var81, var74, var85, 718654344), var89);
                    }
                }
            }
            var43++;
        }
        for (class37 var90 = (class37) var20.method1884((byte) 114); var90 != null; var90 = (class37) var20.method1886(arg1 ^ 0xFFFFFFD9)) {
            if (var90.field675 == 0) {
                var90.method1747((byte) -107);
            } else {
                var90.method332();
            }
        }
        int var91 = var20.method1895(0);
        class37[] var92 = new class37[var91];
        var20.method1894(var92, true);
        long[] var93 = new long[var91];
        for (int var94 = 0; var94 < var91; var94++) {
            var93[var94] = var92[var94].field4265;
        }
        class183.method1252(var93, arg1 - 89, var92);
        return var92;
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V", line = 456)
    public static void method336(int arg0) {
        field711 = null;
        if (arg0 != -1785) {
            method334(87);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lek;B)V", line = 466)
    public static final void method337(class185 arg0, byte arg1) {
        field708++;
        if (arg1 == -100) {
            class90.field1648 = arg0;
            class113.field2045 = class90.field1648.method1268(4, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V", line = 480)
    public static final void method338(int arg0) {
        class217.field3730.method230(true);
        int var1 = 96 % ((arg0 - 23) / 49);
        field704++;
        class206.field3596.method230(true);
        class306.field5172.method230(true);
        class144.field2513.method230(true);
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)[B", line = 495)
    public final byte[] method339(byte arg0) {
        field710++;
        if (this.field4499) {
            throw new RuntimeException();
        }
        int var2 = -81 / ((-arg0 - 68) / 48);
        return this.field709;
    }
}
