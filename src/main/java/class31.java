import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 extends Canvas {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field527;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lcd;")
    public static class64 field517 = class44.method335((byte) 71, ":duelstake:");

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
    public static int[] field525 = new int[] { 2, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 8, -1, 0, 0, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 1, 0, 9, 0, 10, 0, -1, 10, 0, 9, 0, 0, -1, 0, 0, 7, 0, 0, -2, 0, 0, 0, 0, 0, 5, -1, 0, -1, 0, 0, 0, 0, 4, 0, 15, 0, 5, -1, -2, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 7, 14, 3, 0, 6, 0, 0, 0, -1, 0, 0, 8, 0, 0, 2, 2, 0, -2, -2, 0, 0, 3, 0, 2, 4, 0, 0, -2, -1, 0, 4, 7, 1, 0, 0, 5, 0, 0, 0, -2, 0, 0, 2, -1, 0, 0, 0, 6, -1, 0, 2, 0, 0, -2, 10, 14, 0, 0, -1, 0, 0, 0, 6, 0, -2, 3, 0, 0, 0, 8, 6, 0, 0, -1, 0, 0, 0, -2, -2, 0, -1, 0, 0, 0, 7, -2, 0, 6, 24, 0, 8, 0, 12, 6, 0, 6, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 15, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 8, 1, 0, 10, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 4, 0, 3, 0, 5, 0, 8, 0, 0, 0, -2, 6, 20, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lcd;")
    private static class64 field526 = class44.method335((byte) 71, "level:");

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lcd;")
    public static class64 field523 = field526;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 6)
    public static void method265(int arg0) {
        field523 = null;
        field525 = null;
        if (arg0 != -1) {
            field523 = (class64) null;
        }
        field517 = null;
        field526 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 20)
    public static final void method266(int arg0) {
        field521++;
        class74.method595();
        class232.field3924 = -1;
        class63.field1218 = null;
        class70.method574(false);
        class308.field5254.method334(false);
        class88.field1592 = new class1();
        ((class241) class50.field816).method1752(-13871);
        class177.field3019 = new class220[255];
        class177.field3014 = 0;
        class217.method1533();
        class302.method2107();
        class200.method1402(false);
        class143.method1018(-88);
        class296.method2066(1);
        for (int var1 = 0; var1 < 2048; var1++) {
            class41 var2 = class284.field4888[var1];
            if (var2 != null) {
                var2.field664 = null;
            }
        }
        if (class123.field2216) {
            class302.method2115(104, 104);
        }
        class145.method1033(class3.field17, arg0 ^ arg0, class143.field2504);
        class229.method1653(0, class3.field17);
        if (class128.field2277 == 5) {
            class54.method411(arg0 ^ 0xFFFF8F02, class3.field17);
        }
        if (class128.field2277 == 10) {
            class74.method598(false, 315);
        }
        if (class128.field2277 == 30) {
            class153.method1107(25, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 71)
    public static final void method267(byte arg0) {
        field531++;
        class228.field3878 = 0;
        class182.field3125 = 0;
        class59.method455((byte) 117);
        class146.method1040((byte) 33);
        int var1 = 28 / ((14 - arg0) / 42);
        class297.method2075(false);
        class104.method766((byte) -64);
        for (int var2 = 0; var2 < class182.field3125; var2++) {
            int var3 = class310.field5265[var2];
            if (class29.field482 != class284.field4888[var3].field1911) {
                if (class284.field4888[var3].field675 > 0) {
                    class251.method1801(true, class284.field4888[var3]);
                }
                class284.field4888[var3] = null;
            }
        }
        if (class26.field428 != class108.field1991.field281) {
            throw new RuntimeException("gpp1 pos:" + class108.field1991.field281 + " psize:" + class26.field428);
        }
        for (int var4 = 0; var4 < class163.field2862; var4++) {
            if (class284.field4888[class194.field3307[var4]] == null) {
                throw new RuntimeException("gpp2 pos:" + var4 + " size:" + class163.field2862);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[II)V", line = 133)
    public static final void method268(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 <= 117) {
            field529 = -62;
        }
        field528++;
        arg2--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg3[var7] = arg4;
            int var8 = var7 + 1;
            arg3[var8] = arg4;
            int var9 = var8 + 1;
            arg3[var9] = arg4;
            int var10 = var9 + 1;
            arg3[var10] = arg4;
            int var11 = var10 + 1;
            arg3[var11] = arg4;
            int var12 = var11 + 1;
            arg3[var12] = arg4;
            int var13 = var12 + 1;
            arg3[var13] = arg4;
            arg2 = var13 + 1;
            arg3[arg2] = arg4;
        }
        while (var6 > arg2) {
            arg2++;
            arg3[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([[I[[F[[F[[F[[B[[I[[[BI[[I[[B[[IB[[I[[B[[B)[Lfg;", line = 161)
    public static final class204[] method269(int[][] arg0, float[][] arg1, float[][] arg2, float[][] arg3, byte[][] arg4, int[][] arg5, byte[][][] arg6, int arg7, int[][] arg8, byte[][] arg9, int[][] arg10, byte arg11, int[][] arg12, byte[][] arg13, byte[][] arg14) {
        field520++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg13[var16][var17];
                if (var18 == 0) {
                    var18 = arg13[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg13[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg13[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class137 var19 = class169.method1204((var18 & 0xFF) - 1, 1);
                    var15[var16][var17] = (var19.field2436 + 1 << 16) + var19.field2426;
                }
            }
        }
        if (arg11 >= -34) {
            return (class204[]) null;
        }
        class159 var20 = new class159(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg13[var21][var22] != 0) {
                    int[] var23;
                    if (arg9[var21][var22] == 0) {
                        var23 = class297.field5111[0];
                    } else {
                        var23 = class71.field1375[arg14[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg8 != null) {
                        var24 = arg8[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    long var28 = (long) var24 | (long) var25 << 32;
                    int var30 = var15[var21][var22 + 1];
                    long var31 = (long) var24 | (long) var26 << 32;
                    long var33 = (long) var27 << 32 | (long) var24;
                    long var35 = (long) var24 | (long) var30 << 32;
                    int var37 = var23.length / 2;
                    class204 var38 = (class204) var20.method1151(var28, 0);
                    if (var38 == null) {
                        var38 = new class204((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg5 != null, var24);
                        var20.method1149(var38, var28, -44);
                    }
                    var38.field3492++;
                    var38.field3497 += var37;
                    if (var28 != var31) {
                        class204 var39 = (class204) var20.method1151(var31, 0);
                        if (var39 == null) {
                            var39 = new class204((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg5 != null, var24);
                            var20.method1149(var39, var31, -74);
                        }
                        var39.field3492++;
                        var39.field3497 += var37;
                    }
                    if (var28 != var33 && var31 != var33) {
                        class204 var40 = (class204) var20.method1151(var33, 0);
                        if (var40 == null) {
                            var40 = new class204((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg5 != null, var24);
                            var20.method1149(var40, var33, -66);
                        }
                        var40.field3497 += var37;
                        var40.field3492++;
                    }
                    if (var28 != var35 && var31 != var35 && var33 != var35) {
                        class204 var41 = (class204) var20.method1151(var35, 0);
                        if (var41 == null) {
                            var41 = new class204((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg5 != null, var24);
                            var20.method1149(var41, var35, -68);
                        }
                        var41.field3492++;
                        var41.field3497 += var37;
                    }
                }
            }
        }
        for (class204 var42 = (class204) var20.method1143(0); var42 != null; var42 = (class204) var20.method1147((byte) 18)) {
            var42.method1428();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg13[var43][var44] != 0) {
                    int var45;
                    if ((arg6[arg7][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg6[1][var43][var44] & 0x2) == 2 && arg7 > 0) {
                        var45 = arg7 - 1;
                    } else {
                        var45 = arg7;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg8 != null) {
                        var47 = arg8[var43][var44] >>> 24 << 3;
                        var46 = arg8[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var48 = null;
                    int[] var49;
                    byte var50;
                    if (arg9[var43][var44] == 0) {
                        var49 = class297.field5111[0];
                        var50 = 0;
                    } else {
                        var50 = arg4[var43][var44];
                        var48 = class268.field4618[arg14[var43][var44]];
                        var49 = class71.field1375[arg14[var43][var44]];
                        if (var49.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44];
                    int var53 = var15[var43 + 1][var44 + 1];
                    long var54 = (long) var53 << 32 | (long) var46;
                    long var56 = (long) var46 | (long) var51 << 32;
                    int var58 = var15[var43][var44 + 1];
                    long var59 = (long) var52 << 32 | (long) var46;
                    long var61 = (long) var58 << 32 | (long) var46;
                    int var63 = arg12[var43][var44];
                    int var64 = arg12[var43 + 1][var44 + 1];
                    int var65 = arg12[var43 + 1][var44];
                    int var66 = arg12[var43][var44 + 1];
                    int var67 = arg0[var43][var44];
                    int var68 = arg0[var43 + 1][var44 + 1];
                    int var69 = (var51 >> 16) - 1;
                    int var70 = arg0[var43 + 1][var44];
                    int var71 = arg0[var43][var44 + 1];
                    int var72 = (var52 >> 16) - 1;
                    int var73 = (var53 >> 16) - 1;
                    class204 var74 = (class204) var20.method1151(var56, 0);
                    class201.method1409(class8.method78(var65, (byte) -73, var70, var69), var44, var48, var51 >= var51, var51 <= var58, var74, arg5, var43, false, arg2, class8.method78(var66, (byte) -73, var71, var69), arg1, arg3, var50, class8.method78(var64, (byte) -73, var68, var69), var45, var49, arg10, var47, var52 >= var51, class8.method78(var63, (byte) -73, var67, var69), var51 <= var53);
                    int var75 = (var58 >> 16) - 1;
                    if (var56 != var59) {
                        class204 var76 = (class204) var20.method1151(var59, 0);
                        class201.method1409(class8.method78(var65, (byte) -73, var70, var72), var44, var48, var52 <= var51, var52 <= var58, var76, arg5, var43, false, arg2, class8.method78(var66, (byte) -73, var71, var72), arg1, arg3, var50, class8.method78(var64, (byte) -73, var68, var72), var45, var49, arg10, var47, var52 >= var52, class8.method78(var63, (byte) -73, var67, var72), var52 <= var53);
                    }
                    if (var54 != var56 && var54 != var59) {
                        class204 var77 = (class204) var20.method1151(var54, 0);
                        class201.method1409(class8.method78(var65, (byte) -73, var70, var73), var44, var48, var53 <= var51, var53 <= var58, var77, arg5, var43, false, arg2, class8.method78(var66, (byte) -73, var71, var73), arg1, arg3, var50, class8.method78(var64, (byte) -73, var68, var73), var45, var49, arg10, var47, var53 <= var52, class8.method78(var63, (byte) -73, var67, var73), var53 <= var53);
                    }
                    if (var56 != var61 && var59 != var61 && var54 != var61) {
                        class204 var78 = (class204) var20.method1151(var61, 0);
                        class201.method1409(class8.method78(var65, (byte) -73, var70, var75), var44, var48, var58 <= var51, var58 >= var58, var78, arg5, var43, false, arg2, class8.method78(var66, (byte) -73, var71, var75), arg1, arg3, var50, class8.method78(var64, (byte) -73, var68, var75), var45, var49, arg10, var47, var52 >= var58, class8.method78(var63, (byte) -73, var67, var75), var58 <= var53);
                    }
                }
            }
        }
        for (class204 var79 = (class204) var20.method1143(0); var79 != null; var79 = (class204) var20.method1147((byte) 18)) {
            if (var79.field3487 == 0) {
                var79.method232(128);
            } else {
                var79.method1424();
            }
        }
        int var80 = var20.method1146(1);
        class204[] var81 = new class204[var80];
        var20.method1150(-113, var81);
        long[] var82 = new long[var80];
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field417;
        }
        class235.method1684(var82, var81, (byte) -36);
        return var81;
    }

    @OriginalMember(owner = "client!kb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 496)
    public final void update(Graphics arg0) {
        this.field527.update(arg0);
        field524++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 506)
    public static final void method270(byte arg0) {
        field518++;
        class125.field2256.method736((byte) 41);
        int var1 = 119 / ((arg0 - 84) / 42);
        for (int var2 = 0; var2 < 32; var2++) {
            class143.field2518[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class27.field433[var3] = 0L;
        }
        class199.field3389 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZB)V", line = 540)
    public static final void method271(int arg0, int arg1, boolean arg2, byte arg3) {
        field530++;
        if (arg3 <= 15) {
            method272((byte) -79, -92);
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class188.field3233 = arg2;
        class63.field1213 = arg0;
        class314.field5326 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V", line = 563)
    public static final void method272(byte arg0, int arg1) {
        field522++;
        class228.field3870.method1197((byte) 54, arg1);
        if (arg0 != 124) {
            field526 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 575)
    public class31(Component arg0) {
        this.field527 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 588)
    public final void paint(Graphics arg0) {
        this.field527.paint(arg0);
        field519++;
    }
}
