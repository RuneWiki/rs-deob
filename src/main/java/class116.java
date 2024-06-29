import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class116 {

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public int field1375 = -1;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "[I")
    public static int[] field1373 = new int[50];

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field1368 = 0;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1362 = -1;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "J")
    private long field1356;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "J")
    private long field1366;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "Z")
    public boolean field1369;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
    private int[] field1360;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "[I")
    public int[] field1374;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "[[I")
    private int[][] field1361;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
    public final void method642(int arg0, int arg1, int arg2) {
        this.field1374[arg0] = arg2;
        if (arg1 != 512) {
            this.method645((byte) -123, 47, -24, -55, -38, (class174) null, (class182) null);
        }
        field1371++;
        this.method646(-16384);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static final void method643(int arg0) {
        class329.field4711 = null;
        class142.field1996 = null;
        class40.field425 = null;
        class66.field740 = null;
        class221.field3034 = null;
        class100.field1125 = null;
        field1357++;
        if (arg0 != 16384) {
            method643(71);
        }
        class252.field3409 = null;
        class401.field5821 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjf;IILen;IILhm;I)V")
    public static final void method644(int arg0, class119 arg1, int arg2, int arg3, class174 arg4, int arg5, int arg6, class121 arg7, int arg8) {
        if (arg0 != 65535) {
            return;
        }
        field1367++;
        class290 var9 = class117.method661((byte) 68, arg6);
        if (var9 == null || !var9.field4133 || !var9.method1853(-7348)) {
            return;
        }
        if (var9.field4158 != null) {
            int[] var10 = new int[var9.field4158.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class231.field3128 == 4) {
                    var13 = (int) class276.field3893 & 0x3FFF;
                } else {
                    var13 = (int) class276.field3893 + class260.field3585 & 0x3FFF;
                }
                int var14 = class286.field4025[var13];
                int var15 = class286.field4035[var13];
                if (class231.field3128 != 4) {
                    var15 = var15 * 256 / (class164.field2288 + 256);
                    var14 = var14 * 256 / (class164.field2288 + 256);
                }
                var10[var11 * 2] = ((arg8 + (var9.field4158[var11 * 2] * 4)) * var15 + (var9.field4158[var11 * 2 + 1] * 4 + arg2) * var14 >> 15) + arg1.field1552 / 2 + arg5;
                var10[var11 * 2 + 1] = arg1.field1498 / 2 + arg3 - ((var9.field4158[var11 * 2 - -1] * 4 + arg2) * var15 + -((var9.field4158[var11 * 2] * 4 + arg8) * var14) >> 15);
            }
            class309.method1938(arg4, var10, var9.field4127, arg1.field1465, arg1.field1492);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg4.method982(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field4138, 1, arg7, arg5, arg3);
            }
            arg4.method982(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4138, 1, arg7, arg5, arg3);
        }
        class11 var16 = null;
        if (var9.field4123 != -1) {
            var16 = var9.method1851(arg4, false, false);
            if (var16 != null) {
                class327.method2016(arg5, arg3, arg2, arg7, arg1, (byte) -127, arg8, var16);
            }
        }
        if (var9.field4142 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method49();
        }
        class196 var18 = class105.field1192;
        class277 var19 = class324.field4570;
        if (var9.field4128 == 1) {
            var18 = class2.field20;
            var19 = class1.field1;
        }
        if (var9.field4128 == 2) {
            var18 = class287.field4059;
            var19 = class268.field3775;
        }
        class433.method2685(arg2, arg8, var9.field4142, arg7, var17, arg5, arg1, arg3, var9.field4149, arg0 - 72388, var19, var18);
        return;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIIIILen;Lbb;)Lmj;")
    public final class393 method645(byte arg0, int arg1, int arg2, int arg3, int arg4, class174 arg5, class182 arg6) {
        field1359++;
        if (arg0 != 17) {
            this.field1374 = null;
        }
        if (this.field1375 != -1) {
            return class282.method1806(arg0 ^ 0x4F, this.field1375).method2159(arg6, arg1, true, arg3, arg4, arg2, arg5);
        }
        int var8 = arg3;
        if (arg6 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            Object var15 = null;
            var8 = arg3 | 0x20;
            int var16 = arg6.field2493[arg1];
            int var17 = var16 >>> 16;
            int var18 = var16 & 0xFFFF;
            class152 var19 = class158.method1040(var17, false);
            if (var19 != null) {
                var10 |= var19.method914(var18, -1);
                var9 |= var19.method908(var18, (byte) -115);
                var11 |= arg6.field2496;
            }
            if ((arg6.field2490 || class98.field1105) && arg4 != -1 && arg4 < arg6.field2493.length) {
                int var20 = arg6.field2493[arg4];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class152 var23;
                if (var17 == var21) {
                    var23 = var19;
                } else {
                    var23 = class158.method1040(var22 >>> 16, false);
                }
                if (var23 != null) {
                    var10 |= var23.method914(var22, -1);
                    var9 |= var23.method908(var22, (byte) -95);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class331 var24 = class422.field6060;
        class393 var25;
        synchronized (class422.field6060) {
            var25 = (class393) class422.field6060.method2049(-66, this.field1366);
        }
        if (var25 == null || arg5.method1016(var25.method720(), var8) != 0) {
            if (var25 != null) {
                var8 = arg5.method1013(var8, var25.method720());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field1360[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class238.method1518((byte) 101, var29 & 0x3FFFFFFF).method2294(0)) {
                        var27 = true;
                    }
                } else if (!class392.method2498(var29 & 0x3FFFFFFF, arg0 ^ 0xFFFFFF99).method1621(this.field1369, false)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class200[] var30 = new class200[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field1360[var32];
                if ((var33 & 0x40000000) != 0) {
                    class200 var35 = class392.method2498(var33 & 0x3FFFFFFF, -111).method1631(this.field1369, (byte) -89);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class200 var34 = class238.method1518((byte) 118, var33 & 0x3FFFFFFF).method2296(-1);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                }
            }
            class200 var36 = new class200(var30, var31);
            int var37 = var8 | 0x2000;
            var25 = arg5.method991(var36, var37, class256.field3440, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (this.field1374[var38] < class198.field2693[var38].length) {
                    var25.method751(class323.field4559[var38], class198.field2693[var38][this.field1374[var38]]);
                }
                if (class101.field1147[var38].length > this.field1374[var38]) {
                    var25.method751(class108.field1248[var38], class101.field1147[var38][this.field1374[var38]]);
                }
            }
            var25.method774(var8);
            class331 var39 = class422.field6060;
            synchronized (class422.field6060) {
                class422.field6060.method2046(this.field1366, arg0 - 17, var25);
            }
        }
        if (arg6 == null) {
            return var25;
        } else {
            var25.method717((byte) 1, var8, true);
            return arg6.method1188(arg3, arg2, true, var25, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    private final void method646(int arg0) {
        field1364++;
        long[] var2 = class189.field2567;
        this.field1366 = -1L;
        this.field1366 = this.field1366 >>> 8 ^ var2[(int) (((long) (this.field1363 >> 8) ^ this.field1366) & 0xFFL)];
        this.field1366 = var2[(int) ((this.field1366 ^ (long) this.field1363) & 0xFFL)] ^ this.field1366 >>> 8;
        if (arg0 != -16384) {
            method652((byte) -1);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1366 = var2[(int) (((long) (this.field1360[var3] >> 24) ^ this.field1366) & 0xFFL)] ^ this.field1366 >>> 8;
            this.field1366 = this.field1366 >>> 8 ^ var2[(int) (((long) (this.field1360[var3] >> 16) ^ this.field1366) & 0xFFL)];
            this.field1366 = var2[(int) (((long) (this.field1360[var3] >> 8) ^ this.field1366) & 0xFFL)] ^ this.field1366 >>> 8;
            this.field1366 = this.field1366 >>> 8 ^ var2[(int) ((this.field1366 ^ (long) this.field1360[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1366 = this.field1366 >>> 8 ^ var2[(int) ((this.field1366 ^ (long) this.field1374[var4]) & 0xFFL)];
        }
        this.field1366 = this.field1366 >>> 8 ^ var2[(int) ((this.field1366 ^ (long) (this.field1369 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
    public final void method647(int arg0, int arg1, int arg2) {
        field1376++;
        int var4 = class186.field2531[arg1];
        if (this.field1360[var4] == 0 || class238.method1518((byte) -90, arg2) == null) {
            return;
        }
        this.field1360[var4] = class164.method1059(Integer.MIN_VALUE, arg2);
        this.method646(-16384);
        if (arg0 > -5) {
            this.field1363 = -96;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lbb;II[Lok;IIIILbb;IZBLen;)Lmj;")
    public final class393 method648(class182 arg0, int arg1, int arg2, class138[] arg3, int arg4, int arg5, int arg6, int arg7, class182 arg8, int arg9, boolean arg10, byte arg11, class174 arg12) {
        field1358++;
        if (this.field1375 != -1) {
            return class282.method1806(118, this.field1375).method2154(arg2, arg3, arg5, arg6, arg4, arg9, arg7, arg12, arg0, 21, arg1, arg8);
        }
        int var14 = arg5;
        if (arg11 > -82) {
            field1362 = 14;
        }
        long var15 = this.field1366;
        int[] var17 = this.field1360;
        if (arg0 != null && (arg0.field2497 >= 0 || arg0.field2502 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field1360[var18];
            }
            if (arg0.field2497 >= 0) {
                if (arg0.field2497 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class164.method1059(arg0.field2497, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg0.field2502 >= 0) {
                if (arg0.field2502 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class164.method1059(arg0.field2502, 1073741824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg0 != null || arg8 != null;
        int var22 = arg3 == null ? 0 : arg3.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class77.field866[var23] = null;
            if (arg3[var23] != null) {
                class182 var24 = class437.method2717(arg3[var23].field1963, (byte) -103);
                if (var24.field2493 != null) {
                    class375.field5472[var23] = var24;
                    var21 = true;
                    int var25 = arg3[var23].field1959;
                    int var26 = arg3[var23].field1967;
                    int var27 = var24.field2493[var25];
                    class77.field866[var23] = class158.method1040(var27 >>> 16, false);
                    int var28 = var27 & 0xFFFF;
                    class7.field90[var23] = var28;
                    if (class77.field866[var23] != null) {
                        var20 |= class77.field866[var23].method914(var28, -1);
                        var19 |= class77.field866[var23].method908(var28, (byte) -96);
                    }
                    if ((var24.field2490 || class98.field1105) && var26 != -1 && var26 < var24.field2493.length) {
                        class427.field6214[var23] = var24.field2513[var25];
                        class33.field303[var23] = arg3[var23].field1970;
                        int var29 = var24.field2493[var26];
                        class362.field5284[var23] = class158.method1040(var29 >>> 16, false);
                        int var30 = var29 & 0xFFFF;
                        class20.field206[var23] = var30;
                        if (class362.field5284[var23] != null) {
                            var20 |= class362.field5284[var23].method914(var30, -1);
                            var19 |= class362.field5284[var23].method908(var30, (byte) -104);
                        }
                    } else {
                        class427.field6214[var23] = 0;
                        class33.field303[var23] = 0;
                        class362.field5284[var23] = null;
                        class20.field206[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class152 var34 = null;
        class152 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class152 var39 = null;
        class152 var40 = null;
        if (var21) {
            var14 = arg5 | 0x20;
            if (arg0 != null) {
                int var41 = arg0.field2493[arg7];
                int var42 = var41 >>> 16;
                var34 = class158.method1040(var42, false);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method914(var31, -1);
                    var19 |= var34.method908(var31, (byte) -95);
                }
                if ((arg0.field2490 || class98.field1105) && arg1 != -1 && arg0.field2493.length > arg1) {
                    int var43 = arg0.field2493[arg1];
                    var33 = arg0.field2513[arg7];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = class158.method1040(var32 >>> 16, false);
                    }
                    if (var35 != null) {
                        var20 |= var35.method914(var32, -1);
                        var19 |= var35.method908(var32, (byte) -128);
                    }
                }
            }
            if (arg8 != null) {
                int var45 = arg8.field2493[arg6];
                int var46 = var45 >>> 16;
                var36 = var45 & 0xFFFF;
                var39 = class158.method1040(var46, false);
                if (var39 != null) {
                    var20 |= var39.method914(var36, -1);
                    var19 |= var39.method908(var36, (byte) -120);
                }
                if ((arg8.field2490 || class98.field1105) && arg4 != -1 && arg4 < arg8.field2493.length) {
                    var38 = arg8.field2513[arg6];
                    int var47 = arg8.field2493[arg4];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = class158.method1040(var37 >>> 16, false);
                    }
                    if (var40 != null) {
                        var20 |= var40.method914(var37, -1);
                        var19 |= var40.method908(var37, (byte) -119);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class331 var49 = class350.field5107;
        class393 var50;
        synchronized (class350.field5107) {
            var50 = (class393) class350.field5107.method2049(-63, var15);
        }
        class270 var51 = null;
        if (this.field1363 != -1) {
            var51 = class403.method2555(this.field1363, (byte) 49);
        }
        if (var50 == null || arg12.method1016(var50.method720(), var14) != 0 || var51 != null && var51.field3833 != null && this.field1361 == null) {
            if (var50 != null) {
                var14 = arg12.method1013(var14, var50.method720());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field1356 != -1L) {
                            class331 var81 = class350.field5107;
                            synchronized (class350.field5107) {
                                var50 = (class393) class350.field5107.method2049(-114, this.field1356);
                            }
                        }
                        if (var50 == null || arg12.method1016(var50.method720(), var14) != 0 || var51 != null && var51.field3833 != null && this.field1361 == null) {
                            return null;
                        }
                    } else {
                        class200[] var56 = new class200[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class200 var59 = class392.method2498(var58 & 0x3FFFFFFF, -118).method1636(this.field1369, (byte) 82);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            } else if ((Integer.MIN_VALUE & var58) != 0) {
                                class200 var60 = class238.method1518((byte) 101, var58 & 0x3FFFFFFF).method2302(0);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            }
                        }
                        if (var51 != null && var51.field3833 != null) {
                            for (int var61 = 0; var61 < var51.field3833.length; var61++) {
                                if (var51.field3833[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field3833[var61][0];
                                    int var63 = var51.field3833[var61][1];
                                    int var64 = var51.field3833[var61][2];
                                    int var65 = var51.field3833[var61][3] << 3;
                                    int var66 = var51.field3833[var61][4] << 3;
                                    int var67 = var51.field3833[var61][5] << 3;
                                    if (this.field1361 == null) {
                                        this.field1361 = new int[var51.field3833.length][];
                                    }
                                    if (this.field1361[var61] == null) {
                                        int[] var68 = this.field1361[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[14] = -var64;
                                            var68[13] = -var63;
                                            var68[12] = -var62;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                        } else {
                                            int var69 = class286.field4035[var65];
                                            int var70 = class286.field4025[var65];
                                            int var71 = class286.field4035[var66];
                                            int var72 = class286.field4025[var66];
                                            int var73 = class286.field4035[var67];
                                            int var74 = class286.field4025[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[0] = var71 * var73 + (var72 * var76) + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[7] = -var72 * -var74 + (var71 * var75) + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[6] = -var72 * var73 + (var71 * var76) + 16384 >> 15;
                                            var68[1] = -var74 * var71 + (var72 * var75) + 16384 >> 15;
                                            var68[12] = var68[3] * -var63 + var68[0] * -var62 + (var68[6] * -var64) + 16384 >> 15;
                                            var68[13] = var68[4] * -var63 + (var68[1] * -var62 - (-(var68[7] * -var64) - 16384)) >> 15;
                                            var68[14] = var68[2] * -var62 + 16384 - (-(var68[5] * -var63) + -(var68[8] * -var64)) >> 15;
                                        }
                                        var68[11] = var64;
                                        var68[9] = var62;
                                        var68[10] = var63;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method1271((byte) 21, var66, var65, var67);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method1275(var62, var63, 57, var64);
                                    }
                                }
                            }
                        }
                        class200 var77 = new class200(var56, var56.length);
                        int var78 = var14 | 0x2000;
                        var50 = arg12.method991(var77, var78, class256.field3440, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (this.field1374[var79] < class198.field2693[var79].length) {
                                var50.method751(class323.field4559[var79], class198.field2693[var79][this.field1374[var79]]);
                            }
                            if (this.field1374[var79] < class101.field1147[var79].length) {
                                var50.method751(class108.field1248[var79], class101.field1147[var79][this.field1374[var79]]);
                            }
                        }
                        if (arg10) {
                            var50.method774(var14);
                            class331 var80 = class350.field5107;
                            synchronized (class350.field5107) {
                                class350.field5107.method2046(var15, 0, var50);
                            }
                            this.field1356 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class238.method1518((byte) 99, var55 & 0x3FFFFFFF).method2295(-7745)) {
                        var53 = true;
                    }
                } else if (!class392.method2498(var55 & 0x3FFFFFFF, -125).method1623((byte) -102, this.field1369)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class393 var82 = var50.method717((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class77.field866[var83] != null) {
                var82.method2504(var84, 0, class77.field866[var83], class20.field206[var83], 0, class427.field6214[var83], false, class33.field303[var83] - 1, this.field1361 == null ? null : this.field1361[var83], class7.field90[var83], class362.field5284[var83]);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method2505(var36, var38, var32, var39, arg9 - 1, var34, var35, var31, arg2 - 1, false, 5965, arg0.field2486, var33, var37, var40);
        } else if (var34 != null) {
            var82.method2503(var33, var32, var31, (byte) 83, false, var34, arg2 - 1, 0, var35);
        } else if (var39 != null) {
            var82.method2503(var38, var37, var36, (byte) 95, false, var39, arg9 - 1, 0, var40);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class77.field866[var85] = null;
            class362.field5284[var85] = null;
            class375.field5472[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZB)V")
    public final void method649(boolean arg0, byte arg1) {
        if (arg1 == -4) {
            this.field1369 = arg0;
            field1355++;
            this.method646(-16384);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z[II[III)V")
    public final void method650(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (this.field1363 != arg4) {
            this.field1361 = null;
            this.field1363 = arg4;
        }
        field1365++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class315.field4486; var8++) {
                    class360 var9 = class238.method1518((byte) 125, var8);
                    if (var9 != null && !var9.field5252 && (arg0 ? class81.field906[var7] : class158.field2241[var7]) == var9.field5263) {
                        arg1[class186.field2531[var7]] = class164.method1059(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1360 = arg1;
        this.field1374 = arg3;
        this.field1375 = arg2;
        if (arg5 == 0) {
            this.field1369 = arg0;
            this.method646(-16384);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILbb;IIIIILen;I)Lmj;")
    public final class393 method651(int arg0, int arg1, class182 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class174 arg8, int arg9) {
        if (arg1 != -1) {
            this.field1356 = 106L;
        }
        field1370++;
        int var11 = arg9;
        if (arg2 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            int var18 = arg2.field2493[arg7];
            Object var19 = null;
            var11 = arg9 | 0x20;
            int var20 = var18 >>> 16;
            int var21 = var18 & 0xFFFF;
            class152 var22 = class158.method1040(var20, false);
            if (var22 != null) {
                var13 |= var22.method914(var21, -1);
                var12 |= var22.method908(var21, (byte) -123);
                var14 |= arg2.field2496;
            }
            if ((arg2.field2490 || class98.field1105) && arg5 != -1 && arg5 < arg2.field2493.length) {
                int var23 = arg2.field2493[arg5];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class152 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class158.method1040(var25 >>> 16, false);
                }
                if (var26 != null) {
                    var13 |= var26.method914(var25, arg1);
                    var12 |= var26.method908(var25, (byte) -95);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg3 << 32 | (long) (arg4 << 16) | (long) arg6;
        class331 var29 = class422.field6060;
        class393 var30;
        synchronized (class422.field6060) {
            var30 = (class393) class422.field6060.method2049(-110, var27);
        }
        if (var30 == null || arg8.method1016(var30.method720(), var11) != 0) {
            if (var30 != null) {
                var11 = arg8.method1013(var11, var30.method720());
            }
            class200[] var32 = new class200[3];
            int var33 = 0;
            if (!class238.method1518((byte) 121, arg6).method2294(0) || !class238.method1518((byte) 118, arg4).method2294(0) || !class238.method1518((byte) -49, arg3).method2294(0)) {
                return null;
            }
            class200 var34 = class238.method1518((byte) 98, arg6).method2296(-1);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class200 var35 = class238.method1518((byte) 101, arg4).method2296(-1);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class200 var36 = class238.method1518((byte) 95, arg3).method2296(arg1);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class200 var38 = new class200(var32, var33);
            var30 = arg8.method991(var38, var37, class256.field3440, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class198.field2693[var39].length > this.field1374[var39]) {
                    var30.method751(class323.field4559[var39], class198.field2693[var39][this.field1374[var39]]);
                }
                if (class101.field1147[var39].length > this.field1374[var39]) {
                    var30.method751(class108.field1248[var39], class101.field1147[var39][this.field1374[var39]]);
                }
            }
            var30.method774(var11);
            class331 var40 = class422.field6060;
            synchronized (class422.field6060) {
                class422.field6060.method2046(var27, 0, var30);
            }
        }
        if (arg2 == null) {
            return var30;
        } else {
            class393 var41 = var30.method717((byte) 1, var11, true);
            return arg2.method1188(arg9, arg0, true, var41, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method652(byte arg0) {
        if (arg0 != 93) {
            method644(26, (class119) null, -9, 104, (class174) null, -75, 45, (class121) null, -127);
        }
        field1373 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1377++;
        if (class19.field202 == null) {
            class218.field2991.method1150((byte) 127, arg0, arg4, arg2, arg3, -16777216);
            return;
        }
        class54.field606++;
        if (class390.field5715 != null && class390.field5715.field1304 - ((class390.field5715.method786((byte) 70) - 1) * 64) >> 7 == class450.field6576 && (class390.field5715.field1311 - (class390.field5715.method786((byte) 70) * 64 - 64) >> 7) == class435.field6384) {
            class435.field6384 = -1;
            class450.field6576 = -1;
            class196.method1249(arg1 + 90);
        }
        class353.method2243(1);
        if (!arg5) {
            class3.method26(-39);
        }
        class303.method1909(arg1 + 125);
        class240.method1532(arg3, -7509, true, arg2, arg0, arg4);
        int var6 = class38.field393;
        int var7 = class34.field336;
        int var8 = class24.field242;
        int var9 = class220.field3020;
        if (class231.field3128 == 1) {
            int var10 = (int) class135.field1886;
            if ((class51.field590 >> 8) > var10) {
                var10 = class51.field590 >> 8;
            }
            if (class8.field105[4] && var10 < class174.field2421[4] + 128) {
                var10 = class174.field2421[4] + 128;
            }
            int var11 = (int) class276.field3893 + class266.field3721 & 0x3FFF;
            class96.method518(class10.field113, class372.method2335(class390.field5715.field1311, class410.field5931, (byte) 47, class390.field5715.field1304) - 50, (byte) -123, var11, (var10 >> 3) * 3 + 600, var7, var10, class297.field4241);
        } else if (class231.field3128 == 4) {
            int var12 = (int) class135.field1886;
            if (var12 < class51.field590 >> 8) {
                var12 = class51.field590 >> 8;
            }
            if (class8.field105[4] && var12 < (class174.field2421[4] + 128)) {
                var12 = class174.field2421[4] + 128;
            }
            int var13 = (int) class276.field3893 & 0x3FFF;
            class96.method518(class10.field113, class372.method2335(class132.field1811, class410.field5931, (byte) 53, class355.field5200) - 50, (byte) -123, var13, ((var12 >> 3) * 3) + 600, var7, var12, class297.field4241);
        } else if (class231.field3128 == 5) {
            class452.method2814(-10335, var7);
        }
        int var14 = class272.field3853;
        int var15 = class164.field2289;
        int var16 = class272.field3852;
        int var17 = class314.field4472;
        int var18 = class77.field869;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class8.field105[var19]) {
                int var22 = (int) ((double) (-class288.field4077[var19]) + Math.random() * (double) (class288.field4077[var19] * 2 + 1) + Math.sin((double) class206.field2811[var19] / 100.0D * (double) class435.field6377[var19]) * (double) class174.field2421[var19]);
                if (var19 == 0) {
                    class272.field3853 += var22;
                }
                if (var19 == 1) {
                    class164.field2289 += var22;
                }
                if (var19 == 4) {
                    class314.field4472 += var22;
                    if (class314.field4472 < 1024) {
                        class314.field4472 = 1024;
                    } else if (class314.field4472 > 3072) {
                        class314.field4472 = 3072;
                    }
                }
                if (var19 == 2) {
                    class272.field3852 += var22;
                }
                if (var19 == 3) {
                    class77.field869 = class77.field869 + var22 & 0x3FFF;
                }
            }
        }
        if (class272.field3853 < 0) {
            class272.field3853 = 0;
        }
        if (class272.field3852 < 0) {
            class272.field3852 = 0;
        }
        if (class272.field3853 > (class158.field2245 << 7) - 1) {
            class272.field3853 = (class158.field2245 << 7) - 1;
        }
        if (((class52.field598 << 7) - 1) < class272.field3852) {
            class272.field3852 = (class52.field598 << 7) - 1;
        }
        class77.method437(-121);
        class369.method2327(0);
        class218.field2991.method968(var8, var6, var8 + var9, var6 + var7);
        class218.field2991.method934();
        int var20 = class37.field363;
        if (class434.field6366 == null) {
            class218.field2991.method929(var20);
        } else {
            class434.field6366.method197(arg1 - 2, class218.field2991, var9, var7, class77.field869, var8, var20, class50.field582 << 3, var6, class314.field4472);
        }
        class58.method365(-26586);
        class397.field5789.method127(class272.field3853, class164.field2289, class272.field3852, -class314.field4472 & 0x3FFF, -class77.field869 & 0x3FFF, -class137.field1952 & 0x3FFF);
        class218.field2991.method949(class397.field5789);
        class218.field2991.method971(var9 / 2 + var8, var7 / 2 + var6, class108.field1249 << 1, class108.field1249 << 1);
        class377.method2371(var8 + (var9 / 2), var7 / 2 + var6, class108.field1249 << 1, class108.field1249 << 1, (byte) 120);
        class140.method833(~arg1, class272.field3853, -class314.field4472 & 0x3FFF, class164.field2289, -class137.field1952 & 0x3FFF, -class77.field869 & 0x3FFF, class272.field3852);
        byte var21 = class93.method501((byte) 99) == 2 ? (byte) class54.field606 : 1;
        class419.method2605(class218.field2991, class221.field3033, class404.field5887, class397.field5789, class272.field3853, class164.field2289, class272.field3852, class266.field3716, class217.field2969, class245.field3332, class173.field2413, class366.field5349, class123.field1638, class410.field5931 + 1, var21, class390.field5715.field1304 >> 7, class390.field5715.field1311 >> 7, !class40.field424);
        class58.method365(-26586);
        if (class105.field1191 == 30) {
            class93.method504(var8, (byte) 122, var7, var6, 256, var9, 256);
            class433.method2681(256, var6, var8, var9, 256, var7, -6);
            class78.method441(var6, var9, var7, 256, 256, var8, 2);
            class178.method1168(var9, var7, var6, (byte) 85, var8);
        }
        class57.method336();
        if (arg1 != 2) {
            method643(-5);
        }
        class77.field869 = var18;
        class314.field4472 = var17;
        class272.field3852 = var16;
        class272.field3853 = var14;
        class164.field2289 = var15;
        if (class115.field1343 && class355.field5204.method1416(4) == 0) {
            class115.field1343 = false;
        }
        if (class115.field1343) {
            class218.field2991.method1150((byte) 125, var6, var8, var7, var9, -16777216);
            class289.method1846(class407.field5907, class2.field20, false, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
    public static final void method654(int arg0, int arg1) {
        class331 var2 = class39.field403;
        synchronized (class39.field403) {
            class39.field403.method2054(arg0 ^ 0xFFFF0071, arg1);
            if (arg0 != 65535) {
                method644(54, (class119) null, -70, 112, (class174) null, -17, -94, (class121) null, -85);
            }
        }
        field1372++;
        class331 var3 = client.field2307;
        synchronized (client.field2307) {
            client.field2307.method2054(67, arg1);
        }
        class331 var4 = class193.field2629;
        synchronized (class193.field2629) {
            class193.field2629.method2054(-77, arg1);
        }
    }
}
