import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class190 extends class254 {

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lmi;")
    public class12 field3347 = new class12();

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "Lsc;")
    public class18 field3369 = new class18();

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "Lmd;")
    private class114 field3368;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Lnc;")
    public static class94 field3351 = class259.method1828(2);

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field3360 = 0;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "Loh;")
    public static class258 field3364 = class153.method1046("3D)2Softwarebibliothek gestartet)3", 108);

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "Loh;")
    public static class258 field3366 = class153.method1046("Spieler kann nicht gefunden werden: ", 101);

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Loh;")
    public static class258 field3363 = class153.method1046("::breakcon", 96);

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "Lte;")
    public static class115 field3365;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 4)
    public final void method114(int arg0) {
        field3354++;
        this.field3369.method114(arg0);
        for (class181 var2 = (class181) this.field3347.method83(-54); var2 != null; var2 = (class181) this.field3347.method87((byte) -80)) {
            if (!this.field3368.method826(true, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3232 >= var3) {
                        this.method1287(-1, var3, var2);
                        var2.field3232 -= var3;
                        break;
                    }
                    this.method1287(-1, var2.field3232, var2);
                    var3 -= var2.field3232;
                } while (!this.field3368.method857((byte) -121, var3, 0, (int[]) null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V", line = 43)
    public static void method1282(byte arg0) {
        field3363 = null;
        field3365 = null;
        if (arg0 < 15) {
            field3361 = -113;
        }
        field3351 = null;
        field3366 = null;
        field3364 = null;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()Lpd;", line = 57)
    public final class254 method110() {
        field3355++;
        class181 var1;
        do {
            var1 = (class181) this.field3347.method87((byte) -80);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3239 == null);
        return var1.field3239;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIII[ILsf;)V", line = 77)
    private final void method1283(byte arg0, int arg1, int arg2, int arg3, int[] arg4, class181 arg5) {
        if ((this.field3368.field2014[arg5.field3240] & 0x4) != 0 && arg5.field3254 < 0) {
            int var7 = this.field3368.field1980[arg5.field3240] / class83.field1408;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3229) / var7;
                if (var8 > arg3) {
                    arg5.field3229 += arg3 * var7;
                    break;
                }
                arg5.field3239.method113(arg4, arg1, var8);
                arg5.field3229 += var7 * var8 - 1048576;
                arg1 += var8;
                arg3 -= var8;
                int var9 = class83.field1408 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class22 var11 = arg5.field3239;
                if (this.field3368.field2031[arg5.field3240] == 0) {
                    arg5.field3239 = class22.method154(arg5.field3227, var11.method165(), var11.method176(), var11.method157());
                } else {
                    arg5.field3239 = class22.method154(arg5.field3227, var11.method165(), 0, var11.method157());
                    this.field3368.method842(arg5.field3249.field4620[arg5.field3251] < 0, true, arg5);
                    arg5.field3239.method141(var9, var11.method176());
                }
                if (arg5.field3249.field4620[arg5.field3251] < 0) {
                    arg5.field3239.method153(-1);
                }
                var11.method162(var9);
                var11.method113(arg4, arg1, arg2 - arg1);
                if (var11.method181()) {
                    this.field3369.method116(var11);
                }
            }
        }
        if (arg0 <= 89) {
            method1286((byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), 92, (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), -54, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null));
        }
        arg5.field3239.method113(arg4, arg1, arg3);
        field3353++;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "()Lpd;", line = 140)
    public final class254 method121() {
        field3370++;
        class181 var1 = (class181) this.field3347.method83(-68);
        if (var1 == null) {
            return null;
        } else if (var1.field3239 == null) {
            return this.method110();
        } else {
            return var1.field3239;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 164)
    public static final void method1284(int arg0) {
        class23.field280 = null;
        class98.field1749 = null;
        class204.field3540 = (byte[][][]) null;
        class1.field1 = null;
        class214.field3721 = (byte[][][]) null;
        class68.field1180 = (int[][][]) null;
        class242.field4206 = (byte[][][]) null;
        class242.field4197 = null;
        class167.field2829 = (byte[][][]) null;
        class36.field457 = null;
        field3350++;
        if (arg0 == 17908) {
            class152.field2613 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()I", line = 199)
    public final int method120() {
        field3349++;
        return 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([III)V", line = 209)
    public final void method113(int[] arg0, int arg1, int arg2) {
        field3352++;
        this.field3369.method113(arg0, arg1, arg2);
        for (class181 var4 = (class181) this.field3347.method83(-78); var4 != null; var4 = (class181) this.field3347.method87((byte) -80)) {
            if (!this.field3368.method826(true, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3232) {
                        this.method1283((byte) 112, var5, var5 + var6, var6, arg0, var4);
                        var4.field3232 -= var6;
                        break;
                    }
                    this.method1283((byte) 96, var5, var5 + var6, var4.field3232, arg0, var4);
                    var5 += var4.field3232;
                    var6 -= var4.field3232;
                } while (!this.field3368.method857((byte) -98, var6, var5, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 247)
    public static final void method1285(int arg0) {
        field3357++;
        if (class75.field1309 > 0) {
            class39.method306(arg0 + 21877);
            return;
        }
        class50.field758 = class73.field1289;
        class73.field1289 = null;
        class106.method791((byte) 8, 40);
        if (arg0 != -21956) {
            method1284(-66);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[[B[[I[[I[[I[[F[[FI[[B[[I[[B[[I[[BI[[B[[F)[Lgd;", line = 286)
    public static final class157[] method1286(byte[][][] arg0, int[][] arg1, int[][] arg2, int[][] arg3, float[][] arg4, float[][] arg5, int arg6, byte[][] arg7, int[][] arg8, byte[][] arg9, int[][] arg10, byte[][] arg11, int arg12, byte[][] arg13, float[][] arg14) {
        field3348++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg11[var16][var17];
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg11[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class259 var19 = class302.method2118((var18 & 0xFF) - 1, (byte) 121);
                    var15[var16][var17] = (var19.field4513 + 1 << 16) + var19.field4511;
                }
            }
        }
        class144 var20 = new class144(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg11[var21][var22] != 0) {
                    int[] var23;
                    if (arg13[var21][var22] == 0) {
                        var23 = class171.field3047[0];
                    } else {
                        var23 = class80.field1360[arg9[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg3 != null) {
                        var24 = arg3[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22 + 1];
                    int var27 = var15[var21][var22 + 1];
                    int var28 = var15[var21 + 1][var22];
                    long var29 = (long) var25 << 32 | (long) var24;
                    long var31 = (long) var24 | (long) var28 << 32;
                    long var33 = (long) var26 << 32 | (long) var24;
                    long var35 = (long) var27 << 32 | (long) var24;
                    int var37 = var23.length / 2;
                    class157 var38 = (class157) var20.method986(var29, 0);
                    if (var38 == null) {
                        var38 = new class157((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg2 != null, var24);
                        var20.method984((byte) 114, var38, var29);
                    }
                    var38.field2702++;
                    var38.field2693 += var37;
                    if (var29 != var31) {
                        class157 var39 = (class157) var20.method986(var31, arg12 ^ 0x4B7F);
                        if (var39 == null) {
                            var39 = new class157((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg2 != null, var24);
                            var20.method984((byte) 61, var39, var31);
                        }
                        var39.field2702++;
                        var39.field2693 += var37;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class157 var40 = (class157) var20.method986(var33, 0);
                        if (var40 == null) {
                            var40 = new class157((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg2 != null, var24);
                            var20.method984((byte) -111, var40, var33);
                        }
                        var40.field2702++;
                        var40.field2693 += var37;
                    }
                    if (var29 != var35 && var31 != var35 && var33 != var35) {
                        class157 var41 = (class157) var20.method986(var35, 0);
                        if (var41 == null) {
                            var41 = new class157((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg2 != null, var24);
                            var20.method984((byte) 38, var41, var35);
                        }
                        var41.field2693 += var37;
                        var41.field2702++;
                    }
                }
            }
        }
        for (class157 var42 = (class157) var20.method985(120); var42 != null; var42 = (class157) var20.method983(-1)) {
            var42.method1073();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg11[var43][var44] != 0) {
                    int var45;
                    if ((arg0[arg6][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg0[1][var43][var44] & 0x2) == 2 && arg6 > 0) {
                        var45 = arg6 - 1;
                    } else {
                        var45 = arg6;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg3 != null) {
                        var47 = arg3[var43][var44] >>> 24 << 3;
                        var46 = arg3[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var48 = null;
                    byte var49;
                    int[] var50;
                    if (arg13[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class171.field3047[0];
                    } else {
                        var48 = class31.field375[arg9[var43][var44]];
                        var50 = class80.field1360[arg9[var43][var44]];
                        var49 = arg7[var43][var44];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44 + 1];
                    int var53 = var15[var43 + 1][var44];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var51 << 32 | (long) var46;
                    long var57 = (long) var54 << 32 | (long) var46;
                    long var59 = (long) var52 << 32 | (long) var46;
                    long var61 = (long) var53 << 32 | (long) var46;
                    int var63 = arg10[var43][var44];
                    int var64 = arg10[var43 + 1][var44];
                    int var65 = arg10[var43 + 1][var44 + 1];
                    int var66 = arg10[var43][var44 + 1];
                    int var67 = arg8[var43][var44];
                    int var68 = arg8[var43 + 1][var44];
                    int var69 = arg8[var43 + 1][var44 + 1];
                    int var70 = arg8[var43][var44 + 1];
                    int var71 = (var51 >> 16) - 1;
                    int var72 = (var53 >> 16) - 1;
                    int var73 = (var54 >> 16) - 1;
                    int var74 = (var52 >> 16) - 1;
                    class157 var75 = (class157) var20.method986(var55, 0);
                    class237.method1629(var54 >= var51, var43, var49, arg2, arg5, class232.method1549(var71, -58, var70, var66), class232.method1549(var71, arg12 - 19393, var67, var63), var45, var47, var52 >= var51, class232.method1549(var71, -119, var68, var64), class232.method1549(var71, -83, var69, var65), var44, var51 <= var53, arg1, arg4, var51 <= var51, true, var50, var75, var48, arg14);
                    if (var55 != var61) {
                        class157 var76 = (class157) var20.method986(var61, arg12 ^ 0x4B7F);
                        class237.method1629(var53 <= var54, var43, var49, arg2, arg5, class232.method1549(var72, -80, var70, var66), class232.method1549(var72, arg12 - 19401, var67, var63), var45, var47, var52 >= var53, class232.method1549(var72, -60, var68, var64), class232.method1549(var72, -124, var69, var65), var44, var53 >= var53, arg1, arg4, var51 >= var53, true, var50, var76, var48, arg14);
                    }
                    if (var55 != var59 && var59 != var61) {
                        class157 var77 = (class157) var20.method986(var59, arg12 ^ 0x4B7F);
                        class237.method1629(var54 >= var52, var43, var49, arg2, arg5, class232.method1549(var74, -78, var70, var66), class232.method1549(var74, arg12 - 19415, var67, var63), var45, var47, var52 <= var52, class232.method1549(var74, -79, var68, var64), class232.method1549(var74, -120, var69, var65), var44, var53 >= var52, arg1, arg4, var52 <= var51, true, var50, var77, var48, arg14);
                    }
                    if (var55 != var57 && var57 != var61 && var57 != var59) {
                        class157 var78 = (class157) var20.method986(var57, 0);
                        class237.method1629(var54 <= var54, var43, var49, arg2, arg5, class232.method1549(var73, arg12 - 19401, var70, var66), class232.method1549(var73, arg12 ^ 0xFFFFB4D6, var67, var63), var45, var47, var54 <= var52, class232.method1549(var73, -97, var68, var64), class232.method1549(var73, -91, var69, var65), var44, var54 <= var53, arg1, arg4, var54 <= var51, true, var50, var78, var48, arg14);
                    }
                }
            }
        }
        for (class157 var79 = (class157) var20.method985(122); var79 != null; var79 = (class157) var20.method983(arg12 ^ 0xFFFFB480)) {
            if (var79.field2701 == 0) {
                var79.method1054((byte) 93);
            } else {
                var79.method1070();
            }
        }
        if (arg12 != 19327) {
            field3360 = 39;
        }
        int var80 = var20.method988((byte) 33);
        long[] var81 = new long[var80];
        class157[] var82 = new class157[var80];
        var20.method989(var82, -111);
        for (int var83 = 0; var83 < var80; var83++) {
            var81[var83] = var82[var83].field2642;
        }
        class250.method1698(var81, var82, true);
        return var82;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lmd;)V", line = 679)
    public class190(class114 arg0) {
        this.field3368 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILsf;)V", line = 630)
    private final void method1287(int arg0, int arg1, class181 arg2) {
        if (arg0 != -1) {
            field3351 = (class94) null;
        }
        if ((this.field3368.field2014[arg2.field3240] & 0x4) != 0 && arg2.field3254 < 0) {
            int var4 = this.field3368.field1980[arg2.field3240] / class83.field1408;
            int var5 = (var4 + 1048575 - arg2.field3229) / var4;
            arg2.field3229 = arg1 * var4 + arg2.field3229 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3368.field2031[arg2.field3240] == 0) {
                    arg2.field3239 = class22.method154(arg2.field3227, arg2.field3239.method165(), arg2.field3239.method176(), arg2.field3239.method157());
                } else {
                    arg2.field3239 = class22.method154(arg2.field3227, arg2.field3239.method165(), 0, arg2.field3239.method157());
                    this.field3368.method842(arg2.field3249.field4620[arg2.field3251] < 0, true, arg2);
                }
                if (arg2.field3249.field4620[arg2.field3251] < 0) {
                    arg2.field3239.method153(-1);
                }
                arg1 = arg2.field3229 / var4;
            }
        }
        field3358++;
        arg2.field3239.method114(arg1);
    }
}
