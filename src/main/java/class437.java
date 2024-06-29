import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class437 {

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "[I")
    private int[] field6413 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "[I")
    private int[] field6425 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public int field6395;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public int field6405;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "Lqga;")
    private class196 field6397;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "Llja;")
    private class743 field6399;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field6419;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "Z")
    public boolean field6424;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "[[[B")
    private byte[][][] field6410;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "[[[B")
    private byte[][][] field6417;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "[[[B")
    public byte[][][] field6414;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "[[[I")
    public int[][][] field6418;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "[[[B")
    private byte[][][] field6408;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "[[[B")
    private byte[][][] field6402;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field6426 = new String[] { method3362(method3361("6|I/D")), method3362(method3361("-~\u000b\t")), method3362(method3361("6|I&D")), method3362(method3361("8%IK\u0011")), method3362(method3361("6|I#D")), method3362(method3361("6|I*D")), method3362(method3361("6|I!D")), method3362(method3361("y+")), method3362(method3361("6|I(D")), method3362(method3361("6|I+D")), method3362(method3361("6|I D")), method3362(method3361("6|I,D")), method3362(method3361("6|I$D")), method3362(method3361("6|I'D")), method3362(method3361("6|IY\u0005-b\u0013[D")), method3362(method3361("6|I)D")), method3362(method3361("6|I-D")), method3362(method3361("6|I\"D")), method3362(method3361("6|I.D")) };

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "[B")
    public static byte[] field6422 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "Z")
    public static boolean field6396 = false;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "[[[B")
    public byte[][][] field6412;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZII)V", line = 5)
    public static final void method3346(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            field6423++;
            int var4 = arg2 + class494.field7101;
            int var5 = class281.field4219 + arg0;
            if (class734.field10683 != null && arg2 >= 0 && arg0 >= 0 && arg2 < class648.field9378 && class659.field9506 > arg0 && class289.field4305.field825.method717(arg1) != 0 || class225.field3446.field6200 == arg3) {
                long var6 = (long) (arg3 << 28 | var5 << 14 | var4);
                class672 var8 = (class672) class29.field357.method977(var6, 1);
                if (var8 == null) {
                    class264.method2210(arg3, arg2, arg0);
                } else {
                    class719 var9 = (class719) var8.field9756.method3863((byte) 64);
                    if (var9 == null) {
                        class264.method2210(arg3, arg2, arg0);
                    } else {
                        class289 var10 = (class289) class264.method2210(arg3, arg2, arg0);
                        if (var10 == null) {
                            var10 = new class289(arg2 << 9, class555.field8261[arg3].method2407(arg0, arg2, -123), arg0 << 9, arg3, arg3);
                        } else {
                            var10.field4298 = var10.field4287 = -1;
                        }
                        var10.field4284 = var9.field10412;
                        var10.field4301 = var9.field10410;
                        label69: while (true) {
                            class719 var11 = (class719) var8.field9756.method3862(-353);
                            if (var11 == null) {
                                break;
                            }
                            if (var10.field4301 != var11.field10410) {
                                var10.field4298 = var11.field10410;
                                var10.field4297 = var11.field10412;
                                while (true) {
                                    class719 var12 = (class719) var8.field9756.method3862(-353);
                                    if (var12 == null) {
                                        break label69;
                                    }
                                    if (var10.field4301 != var12.field10410 && var10.field4298 != var12.field10410) {
                                        var10.field4287 = var12.field10410;
                                        var10.field4294 = var12.field10412;
                                    }
                                }
                            }
                        }
                        int var13 = class316.method2656((arg2 << 9) + 256, arg3, (arg0 << 9) + 256, 0);
                        var10.field4289 = 0;
                        var10.field6211 = arg0 << 9;
                        var10.field6199 = var13;
                        var10.field6205 = (byte) arg3;
                        var10.field6200 = (byte) arg3;
                        var10.field6197 = arg2 << 9;
                        if (class231.method1980(1, arg0, arg2)) {
                            var10.field6205++;
                        }
                        class476.method3622(arg3, arg2, arg0, var13, var10);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field6426[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V", line = 101)
    public static void method3347(byte arg0) {
        try {
            if (arg0 != 37) {
                method3350(31, null);
            }
            field6422 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6426[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILha;Ls;Ls;ILs;[[I)V", line = 121)
    private final void method3348(int arg0, class66 arg1, class294 arg2, class294 arg3, int arg4, class294 arg5, int[][] arg6) {
        try {
            field6420++;
            byte[][] var8 = this.field6402[arg0];
            byte[][] var9 = this.field6408[arg0];
            if (arg4 >= -127) {
                this.field6402 = null;
            }
            byte[][] var10 = this.field6417[arg0];
            byte[][] var11 = this.field6410[arg0];
            for (int var12 = 0; var12 < this.field6395; var12++) {
                int var13 = var12 < (this.field6395 - 1) ? var12 + 1 : var12;
                for (int var14 = 0; var14 < this.field6405; var14++) {
                    int var15 = (this.field6405 - 1) > var14 ? var14 + 1 : var14;
                    if (class394.field5908 == -1 || class256.method2171(2, arg0, var14, class394.field5908, var12)) {
                        boolean var16 = false;
                        boolean var17 = false;
                        boolean[] var18 = new boolean[4];
                        int var19 = var8[var12][var14];
                        int var20 = var9[var12][var14];
                        int var21 = var11[var12][var14] & 0xFF;
                        int var22 = var10[var12][var14] & 0xFF;
                        int var23 = var10[var12][var15] & 0xFF;
                        int var24 = var10[var13][var15] & 0xFF;
                        int var25 = var10[var13][var14] & 0xFF;
                        if (var21 != 0 || var22 != 0) {
                            class502 var26 = var21 == 0 ? null : this.field6397.method1672(var21 - 1, -2049);
                            if (var19 == 0 && var26 == null) {
                                var19 = 12;
                            }
                            class350 var27 = var22 == 0 ? null : this.field6399.method5415((byte) 36, var22 - 1);
                            class502 var28 = var26;
                            if (var26 != null) {
                                if (var26.field7263 == -1 && var26.field7264 == -1) {
                                    var28 = var26;
                                    var26 = null;
                                } else if (var27 != null && var19 != 0) {
                                    var17 = var26.field7266;
                                }
                            }
                            if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field6395 && var14 < this.field6405) {
                                byte var29 = 0;
                                byte var30 = 0;
                                byte var31 = 0;
                                int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                                int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                                byte var34 = 0;
                                int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                                int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                                if (var10[var12][var14 - 1] == var22) {
                                    var33++;
                                    var35++;
                                } else {
                                    var33--;
                                    var35--;
                                }
                                if (var10[var13][var14] == var22) {
                                    var35++;
                                    var32++;
                                } else {
                                    var35--;
                                    var32--;
                                }
                                if (var10[var12][var15] == var22) {
                                    var36++;
                                    var32++;
                                } else {
                                    var36--;
                                    var32--;
                                }
                                if (var10[var12 - 1][var14] == var22) {
                                    var36++;
                                    var33++;
                                } else {
                                    var33--;
                                    var36--;
                                }
                                int var37 = var33 - var32;
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                int var38 = var35 - var36;
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var37 == var38) {
                                    var37 = arg5.method2407(var14, var12, -122) - arg5.method2407(var15, var13, -103);
                                    var38 = arg5.method2407(var14, var13, 67) - arg5.method2407(var15, var12, -106);
                                    if (var37 < 0) {
                                        var37 = -var37;
                                    }
                                    if (var38 < 0) {
                                        var38 = -var38;
                                    }
                                }
                                var20 = var37 >= var38 ? 0 : 1;
                            }
                            for (int var39 = 0; var39 < 13; var39++) {
                                class502.field7249[var39] = -1;
                                class454.field6639[var39] = 1;
                            }
                            boolean[] var40 = var26 != null && var26.field7266 ? class261.field4024[var19] : class148.field1813[var19];
                            this.method3353(this.field6405, var27, var19, var26, arg1, 1, var18, var14, var9, var20, var8, this.field6395, var11, var12);
                            boolean var41 = var26 != null && var26.field7264 != var26.field7263;
                            if (!var41) {
                                for (int var42 = 0; var42 < 8; var42++) {
                                    if (class502.field7249[var42] >= 0 && class336.field5247[var42] != class204.field3164[var42]) {
                                        var41 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var40[var20 + 1 & 0x3]) {
                                var18[1] = class553.method4163(var18[1], class291.method2359(class454.field6639[2], class454.field6639[4]) == 0);
                            }
                            if (!var40[var20 + 3 & 0x3]) {
                                var18[3] = class553.method4163(var18[3], class291.method2359(class454.field6639[6], class454.field6639[0]) == 0);
                            }
                            if (!var40[var20 & 0x3]) {
                                var18[0] = class553.method4163(var18[0], class291.method2359(class454.field6639[2], class454.field6639[0]) == 0);
                            }
                            if (!var40[var20 + 2 & 0x3]) {
                                var18[2] = class553.method4163(var18[2], class291.method2359(class454.field6639[4], class454.field6639[6]) == 0);
                            }
                            if (!var17 && (var19 == 0 || var19 == 12)) {
                                if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                    var19 = var19 == 0 ? 13 : 14;
                                    var18[0] = var18[3] = false;
                                    var20 = 0;
                                } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                    var19 = var19 == 0 ? 13 : 14;
                                    var20 = 3;
                                    var18[0] = var18[1] = false;
                                } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                    var18[1] = var18[2] = false;
                                    var20 = 2;
                                    var19 = var19 == 0 ? 13 : 14;
                                } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                    var19 = var19 == 0 ? 13 : 14;
                                    var18[2] = var18[3] = false;
                                    var20 = 1;
                                }
                            }
                            boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                            int[] var44 = null;
                            int[] var45;
                            int var46;
                            int[] var47;
                            int[] var48;
                            int var49;
                            if (var43) {
                                var46 = var26 == null ? 0 : class97.field1092[var19];
                                var45 = class613.field8961[var19];
                                var47 = class236.field3565[var19];
                                var49 = var27 == null ? 0 : class659.field9509[var19];
                                var48 = class11.field137[var19];
                            } else if (var17) {
                                var45 = class374.field5706[var19];
                                var44 = class260.field4016[var19];
                                var46 = var26 == null ? 0 : class674.field9779[var19];
                                var47 = class646.field9352[var19];
                                var48 = class568.field8409[var19];
                                var49 = var27 == null ? 0 : class9.field96[var19];
                            } else {
                                var47 = class605.field8863[var19];
                                var45 = class719.field10413[var19];
                                var44 = class786.field11478[var19];
                                var49 = var27 == null ? 0 : class299.field4709[var19];
                                var48 = class138.field1648[var19];
                                var46 = var26 == null ? 0 : class668.field9706[var19];
                            }
                            int var50 = var46 + var49;
                            if (var50 <= 0) {
                                class366.method2963(arg0, var12, var14);
                            } else {
                                if (var18[0]) {
                                    var50++;
                                }
                                if (var18[2]) {
                                    var50++;
                                }
                                if (var18[1]) {
                                    var50++;
                                }
                                if (var18[3]) {
                                    var50++;
                                }
                                int var51 = 0;
                                int var52 = 0;
                                int var53 = var50 * 3;
                                int[] var54 = var41 ? new int[var53] : null;
                                int[] var55 = new int[var53];
                                int[] var56 = new int[var53];
                                int[] var57 = new int[var53];
                                int[] var58 = new int[var53];
                                int[] var59 = new int[var53];
                                int[] var60 = arg3 == null ? null : new int[var53];
                                int[] var61 = arg3 == null && arg2 == null ? null : new int[var53];
                                int var62 = -1;
                                int var63 = -1;
                                int var64 = 256;
                                if (var26 != null) {
                                    var63 = var26.field7268;
                                    var64 = var26.field7269;
                                    var62 = var26.field7263;
                                    int var65 = class209.method1844(arg1, var26, false);
                                    for (int var66 = 0; var66 < var46; var66++) {
                                        boolean var67 = false;
                                        byte var68;
                                        if (var18[-var20 & 0x3] && var44[0] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 1;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 1;
                                            class778.field11311[4] = var47[var51];
                                            class778.field11311[5] = var45[var51];
                                            var68 = 6;
                                        } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 5;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 5;
                                            class778.field11311[4] = var47[var51];
                                            class778.field11311[5] = var45[var51];
                                            var68 = 6;
                                        } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 3;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 3;
                                            class778.field11311[4] = var47[var51];
                                            var68 = 6;
                                            class778.field11311[5] = var45[var51];
                                        } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 7;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 7;
                                            class778.field11311[4] = var47[var51];
                                            var68 = 6;
                                            class778.field11311[5] = var45[var51];
                                        } else {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = var47[var51];
                                            var68 = 3;
                                            class778.field11311[2] = var45[var51];
                                        }
                                        for (int var69 = 0; var69 < var68; var69++) {
                                            int var70 = class778.field11311[var69];
                                            int var71 = var70 - (var20 * 2) & 0x7;
                                            int var72 = this.field6413[var70];
                                            int var73 = this.field6425[var70];
                                            int var74;
                                            int var75;
                                            if (var20 == 1) {
                                                var74 = 512 - var72;
                                                var75 = var73;
                                            } else if (var20 == 2) {
                                                var75 = 512 - var72;
                                                var74 = 512 - var73;
                                            } else if (var20 == 3) {
                                                var74 = var72;
                                                var75 = 512 - var73;
                                            } else {
                                                var74 = var73;
                                                var75 = var72;
                                            }
                                            var55[var52] = var75;
                                            var56[var52] = var74;
                                            if (var60 != null && class689.field9985[var19][var70]) {
                                                int var76 = (var12 << 9) + var75;
                                                int var77 = (var14 << 9) + var74;
                                                var60[var52] = arg3.method2404((byte) 121, var76, var77) - arg5.method2404((byte) 103, var76, var77);
                                            }
                                            if (var61 != null) {
                                                if (arg3 != null && !class689.field9985[var19][var70]) {
                                                    int var80 = (var12 << 9) + var75;
                                                    int var81 = (var14 << 9) + var74;
                                                    var61[var52] = arg5.method2404((byte) 124, var80, var81) - arg3.method2404((byte) 103, var80, var81);
                                                } else if (arg2 != null && !class330.field5193[var19][var70]) {
                                                    int var78 = (var12 << 9) + var75;
                                                    int var79 = (var14 << 9) + var74;
                                                    var61[var52] = arg2.method2404((byte) 112, var78, var79) - arg5.method2404((byte) 109, var78, var79);
                                                }
                                            }
                                            if (var70 < 8 && var26.field7255 < class502.field7249[var71]) {
                                                if (var54 != null) {
                                                    var54[var52] = class204.field3164[var71];
                                                }
                                                var59[var52] = class647.field9374[var71];
                                                var58[var52] = class342.field5314[var71];
                                                var57[var52] = class336.field5247[var71];
                                            } else {
                                                if (var54 != null) {
                                                    var54[var52] = var65;
                                                }
                                                var58[var52] = var26.field7268;
                                                var59[var52] = var26.field7269;
                                                var57[var52] = var62;
                                            }
                                            var52++;
                                        }
                                        var51++;
                                    }
                                    if (!this.field6424 && arg0 == 0) {
                                        class626.method4646(var12, var14, var26.field7254, var26.field7250 * 8, var26.field7251);
                                    }
                                    if (var19 != 12 && var26.field7263 != -1 && var26.field7261) {
                                        var16 = true;
                                    }
                                } else if (var43) {
                                    var51 += class97.field1092[var19];
                                } else if (var17) {
                                    var51 += class674.field9779[var19];
                                } else {
                                    var51 += class668.field9706[var19];
                                }
                                if (var27 != null) {
                                    if (var24 == 0) {
                                        var24 = var22;
                                    }
                                    if (var25 == 0) {
                                        var25 = var22;
                                    }
                                    if (var23 == 0) {
                                        var23 = var22;
                                    }
                                    class350 var82 = this.field6399.method5415((byte) 36, var22 - 1);
                                    class350 var83 = this.field6399.method5415((byte) 36, var23 - 1);
                                    class350 var84 = this.field6399.method5415((byte) 36, var24 - 1);
                                    class350 var85 = this.field6399.method5415((byte) 36, var25 - 1);
                                    for (int var86 = 0; var86 < var49; var86++) {
                                        boolean var87 = false;
                                        byte var88;
                                        if (var18[-var20 & 0x3] && var44[0] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 1;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 1;
                                            class778.field11311[4] = var47[var51];
                                            class778.field11311[5] = var45[var51];
                                            var88 = 6;
                                        } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 5;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 5;
                                            class778.field11311[4] = var47[var51];
                                            var88 = 6;
                                            class778.field11311[5] = var45[var51];
                                        } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 3;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 3;
                                            class778.field11311[4] = var47[var51];
                                            class778.field11311[5] = var45[var51];
                                            var88 = 6;
                                        } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = 7;
                                            class778.field11311[2] = var45[var51];
                                            class778.field11311[3] = 7;
                                            class778.field11311[4] = var47[var51];
                                            class778.field11311[5] = var45[var51];
                                            var88 = 6;
                                        } else {
                                            class778.field11311[0] = var48[var51];
                                            class778.field11311[1] = var47[var51];
                                            var88 = 3;
                                            class778.field11311[2] = var45[var51];
                                        }
                                        var51++;
                                        for (int var89 = 0; var89 < var88; var89++) {
                                            int var90 = class778.field11311[var89];
                                            int var91 = var90 - var20 * 2 & 0x7;
                                            int var92 = this.field6413[var90];
                                            int var93 = this.field6425[var90];
                                            int var94;
                                            int var95;
                                            if (var20 == 1) {
                                                var94 = var93;
                                                var95 = 512 - var92;
                                            } else if (var20 == 2) {
                                                var95 = 512 - var93;
                                                var94 = 512 - var92;
                                            } else if (var20 == 3) {
                                                var95 = var92;
                                                var94 = 512 - var93;
                                            } else {
                                                var95 = var93;
                                                var94 = var92;
                                            }
                                            var55[var52] = var94;
                                            var56[var52] = var95;
                                            if (var60 != null && class689.field9985[var19][var90]) {
                                                int var96 = (var12 << 9) + var94;
                                                int var97 = (var14 << 9) + var95;
                                                var60[var52] = arg3.method2404((byte) 113, var96, var97) - arg5.method2404((byte) 119, var96, var97);
                                            }
                                            if (var61 != null) {
                                                if (arg3 != null && !class689.field9985[var19][var90]) {
                                                    int var100 = (var12 << 9) + var94;
                                                    int var101 = (var14 << 9) + var95;
                                                    var61[var52] = arg5.method2404((byte) 117, var100, var101) - arg3.method2404((byte) 103, var100, var101);
                                                } else if (arg2 != null && !class330.field5193[var19][var90]) {
                                                    int var98 = (var12 << 9) + var94;
                                                    int var99 = (var14 << 9) + var95;
                                                    var61[var52] = arg2.method2404((byte) 110, var98, var99) - arg5.method2404((byte) 105, var98, var99);
                                                }
                                            }
                                            if (var90 < 8 && class502.field7249[var91] >= 0) {
                                                if (var54 != null) {
                                                    var54[var52] = class204.field3164[var91];
                                                }
                                                var59[var52] = class647.field9374[var91];
                                                var58[var52] = class342.field5314[var91];
                                                var57[var52] = class336.field5247[var91];
                                            } else {
                                                if (var17 && class689.field9985[var19][var90]) {
                                                    var58[var52] = var63;
                                                    var59[var52] = var64;
                                                    var57[var52] = var62;
                                                } else if (var94 == 0 && var95 == 0) {
                                                    var57[var52] = arg6[var12][var14];
                                                    var58[var52] = var82.field5412;
                                                    var59[var52] = var82.field5401;
                                                } else if (var94 == 0 && var95 == 512) {
                                                    var57[var52] = arg6[var12][var15];
                                                    var58[var52] = var83.field5412;
                                                    var59[var52] = var83.field5401;
                                                } else if (var94 == 512 && var95 == 512) {
                                                    var57[var52] = arg6[var13][var15];
                                                    var58[var52] = var84.field5412;
                                                    var59[var52] = var84.field5401;
                                                } else if (var94 == 512 && var95 == 0) {
                                                    var57[var52] = arg6[var13][var14];
                                                    var58[var52] = var85.field5412;
                                                    var59[var52] = var85.field5401;
                                                } else {
                                                    if (var94 >= 256) {
                                                        if (var95 < 256) {
                                                            var58[var52] = var85.field5412;
                                                            var59[var52] = var85.field5401;
                                                        } else {
                                                            var58[var52] = var84.field5412;
                                                            var59[var52] = var84.field5401;
                                                        }
                                                    } else if (var95 >= 256) {
                                                        var58[var52] = var83.field5412;
                                                        var59[var52] = var83.field5401;
                                                    } else {
                                                        var58[var52] = var82.field5412;
                                                        var59[var52] = var82.field5401;
                                                    }
                                                    int var102 = class136.method1155((byte) 39, var94 << 7 >> 9, arg6[var13][var14], arg6[var12][var14]);
                                                    int var103 = class136.method1155((byte) 39, var94 << 7 >> 9, arg6[var13][var15], arg6[var12][var15]);
                                                    var57[var52] = class136.method1155((byte) 39, var95 << 7 >> 9, var103, var102);
                                                }
                                                if (var54 != null) {
                                                    var54[var52] = var57[var52];
                                                }
                                            }
                                            var52++;
                                        }
                                    }
                                    if (var19 != 0 && var27.field5411) {
                                        var16 = true;
                                    }
                                }
                                int var104 = arg5.method2407(var14, var12, 117);
                                int var105 = arg5.method2407(var14, var13, -90);
                                int var106 = arg5.method2407(var15, var13, 121);
                                int var107 = arg5.method2407(var15, var12, 124);
                                boolean var108 = class231.method1980(1, var14, var12);
                                if (var108 && arg0 > 1 || !var108 && arg0 > 0) {
                                    boolean var109 = true;
                                    if (var27 != null && !var27.field5398) {
                                        var109 = false;
                                    } else if (var22 == 0 && var19 != 0) {
                                        var109 = false;
                                    } else if (var21 > 0 && var28 != null && !var28.field7265) {
                                        var109 = false;
                                    }
                                    if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                        this.field6414[arg0][var12][var14] = (byte) class544.method4107(this.field6414[arg0][var12][var14], 4);
                                    }
                                }
                                int var110 = 0;
                                int var111 = 0;
                                int var112 = 0;
                                if (this.field6424) {
                                    var110 = class114.method1005(var12, var14);
                                    var111 = class218.method1907(var12, var14);
                                    var112 = class695.method5076(var12, var14);
                                }
                                arg5.method1503(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                                class366.method2963(arg0, var12, var14);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var114) {
            throw class759.method5498(var114, field6426[5] + arg0 + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + (arg2 == null ? field6426[1] : field6426[3]) + ',' + (arg3 == null ? field6426[1] : field6426[3]) + ',' + arg4 + ',' + (arg5 == null ? field6426[1] : field6426[3]) + ',' + (arg6 == null ? field6426[1] : field6426[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILha;Ls;Ls;)V", line = 983)
    public final void method3349(int arg0, class66 arg1, class294 arg2, class294 arg3) {
        try {
            field6403++;
            int[][] var5 = new int[this.field6395][this.field6405];
            if (class109.field1269 == null || class109.field1269.length != this.field6405) {
                class418.field6160 = new int[this.field6405];
                class69.field745 = new int[this.field6405];
                class150.field1858 = new int[this.field6405];
                class605.field8868 = new int[this.field6405];
                class109.field1269 = new int[this.field6405];
            }
            if (arg0 != -1) {
                this.field6424 = true;
            }
            for (int var6 = 0; var6 < this.field6419; var6++) {
                for (int var7 = 0; var7 < this.field6405; var7++) {
                    class109.field1269[var7] = 0;
                    class418.field6160[var7] = 0;
                    class150.field1858[var7] = 0;
                    class69.field745[var7] = 0;
                    class605.field8868[var7] = 0;
                }
                for (int var8 = -5; var8 < this.field6395; var8++) {
                    for (int var9 = 0; var9 < this.field6405; var9++) {
                        int var10 = var8 + 5;
                        int var10002;
                        if (this.field6395 > var10) {
                            int var11 = this.field6417[var6][var10][var9] & 0xFF;
                            if (var11 > 0) {
                                class350 var12 = this.field6399.method5415((byte) 36, var11 - 1);
                                class109.field1269[var9] += var12.field5408;
                                class418.field6160[var9] += var12.field5409;
                                class150.field1858[var9] += var12.field5405;
                                class69.field745[var9] += var12.field5406;
                                var10002 = class605.field8868[var9]++;
                            }
                        }
                        int var13 = var8 - 5;
                        if (var13 >= 0) {
                            int var14 = this.field6417[var6][var13][var9] & 0xFF;
                            if (var14 > 0) {
                                class350 var15 = this.field6399.method5415((byte) 36, var14 - 1);
                                class109.field1269[var9] -= var15.field5408;
                                class418.field6160[var9] -= var15.field5409;
                                class150.field1858[var9] -= var15.field5405;
                                class69.field745[var9] -= var15.field5406;
                                var10002 = class605.field8868[var9]--;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        int var16 = 0;
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        int var20 = 0;
                        for (int var21 = -5; var21 < this.field6405; var21++) {
                            int var22 = var21 + 5;
                            if (this.field6405 > var22) {
                                var17 += class418.field6160[var22];
                                var19 += class69.field745[var22];
                                var16 += class109.field1269[var22];
                                var18 += class150.field1858[var22];
                                var20 += class605.field8868[var22];
                            }
                            int var23 = var21 - 5;
                            if (var23 >= 0) {
                                var18 -= class150.field1858[var23];
                                var16 -= class109.field1269[var23];
                                var20 -= class605.field8868[var23];
                                var17 -= class418.field6160[var23];
                                var19 -= class69.field745[var23];
                            }
                            if (var21 >= 0 && var19 > 0 && var20 > 0) {
                                var5[var8][var21] = class640.method4697(var16 * 256 / var19, var17 / var20, -1131410014, var18 / var20);
                            }
                        }
                    }
                }
                if (class387.field5848) {
                    this.method3348(var6, arg1, var6 == 0 ? arg2 : null, var6 == 0 ? arg3 : null, -128, class555.field8261[var6], var5);
                } else {
                    this.method3357(var6 == 0 ? arg3 : null, var6 == 0 ? arg2 : null, class555.field8261[var6], var6, arg1, var5, arg0 ^ 0x40);
                }
                this.field6417[var6] = null;
                this.field6410[var6] = null;
                this.field6402[var6] = null;
                this.field6408[var6] = null;
            }
            if (!this.field6424) {
                if (class277.field4176 != 0) {
                    class41.method283();
                }
                if (class685.field9935) {
                    class566.method4221();
                }
            }
            for (int var24 = 0; var24 < this.field6419; var24++) {
                class555.field8261[var24].method1500();
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field6426[2] + arg0 + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + (arg2 == null ? field6426[1] : field6426[3]) + ',' + (arg3 == null ? field6426[1] : field6426[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1161)
    public static final void method3350(int arg0, String arg1) {
        try {
            field6401++;
            if (class725.field10472 == null) {
                class40.method272(0);
            }
            class733.field10645.setTime(new Date(class430.method3299(74)));
            int var2 = class733.field10645.get(11);
            int var3 = class733.field10645.get(12);
            int var4 = class733.field10645.get(13);
            String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
            if (arg0 < 19) {
                method3346(44, false, -63, -84);
            }
            String[] var6 = class350.method2878(arg1, '\n', (byte) 77);
            for (int var7 = 0; var7 < var6.length; var7++) {
                for (int var8 = class627.field9183; var8 > 0; var8--) {
                    class725.field10472[var8] = class725.field10472[var8 - 1];
                }
                class725.field10472[0] = var5 + field6426[7] + var6[var7];
                if (class643.field9331 != null) {
                    try {
                        class643.field9331.write(class425.method3278(class725.field10472[0] + "\n", 127));
                    } catch (IOException var10) {
                    }
                }
                if (class725.field10472.length - 1 > class627.field9183) {
                    if (class787.field11485 > 0) {
                        class787.field11485++;
                    }
                    class627.field9183++;
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6426[6] + arg0 + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[Ldja;IIBLib;I)V", line = 1221)
    public final void method3351(int arg0, class324[] arg1, int arg2, int arg3, byte arg4, class163 arg5, int arg6) {
        try {
            if (arg4 != -65) {
                this.field6405 = 126;
            }
            field6421++;
            if (!this.field6424) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class324 var9 = arg1[var8];
                    for (int var10 = 0; var10 < 64; var10++) {
                        for (int var11 = 0; var11 < 64; var11++) {
                            int var12 = arg3 + var10;
                            int var13 = arg0 + var11;
                            if (var12 >= 0 && var12 < this.field6395 && var13 >= 0 && var13 < this.field6405) {
                                var9.method2736((byte) -42, var13, var12);
                            }
                        }
                    }
                }
            }
            int var14 = arg3 + arg6;
            int var15 = arg0 + arg2;
            for (int var16 = 0; var16 < this.field6419; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    for (int var18 = 0; var18 < 64; var18++) {
                        this.method3360(arg3 + var17, false, (byte) 121, 0, var16, var15 + var18, arg5, 0, arg0 + var18, 0, var14 + var17);
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field6426[13] + arg0 + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field6426[1] : field6426[3]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBIIII)V", line = 1299)
    public final void method3352(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            for (int var7 = arg2; var7 < (arg2 + arg4); var7++) {
                for (int var8 = arg5; var8 < arg0 + arg5; var8++) {
                    if (var8 >= 0 && this.field6395 > var8 && var7 >= 0 && var7 < this.field6405) {
                        this.field6418[arg3][var8][var7] = arg3 <= 0 ? 0 : this.field6418[arg3 - 1][var8][var7] - 960;
                    }
                }
            }
            field6416++;
            if (arg5 > 0 && this.field6395 > arg5) {
                for (int var9 = arg2 + 1; var9 < arg2 + arg4; var9++) {
                    if (var9 >= 0 && this.field6405 > var9) {
                        this.field6418[arg3][arg5][var9] = this.field6418[arg3][arg5 - 1][var9];
                    }
                }
            }
            if (arg1 <= 80) {
                this.field6408 = null;
            }
            if (arg2 > 0 && this.field6405 > arg2) {
                for (int var10 = arg5 + 1; var10 < arg5 + arg0; var10++) {
                    if (var10 >= 0 && var10 < this.field6395) {
                        this.field6418[arg3][var10][arg2] = this.field6418[arg3][var10][arg2 - 1];
                    }
                }
            }
            if (arg5 >= 0 && arg2 >= 0 && arg5 < this.field6395 && arg2 < this.field6405) {
                if (arg3 != 0) {
                    if (arg5 > 0 && this.field6418[arg3 - 1][arg5 - 1][arg2] != this.field6418[arg3][arg5 - 1][arg2]) {
                        this.field6418[arg3][arg5][arg2] = this.field6418[arg3][arg5 - 1][arg2];
                        return;
                    }
                    if (arg2 > 0 && this.field6418[arg3][arg5][arg2 - 1] != this.field6418[arg3 - 1][arg5][arg2 - 1]) {
                        this.field6418[arg3][arg5][arg2] = this.field6418[arg3][arg5][arg2 - 1];
                        return;
                    }
                    if (arg5 > 0 && arg2 > 0 && this.field6418[arg3][arg5 - 1][arg2 - 1] != this.field6418[arg3 - 1][arg5 - 1][arg2 - 1]) {
                        this.field6418[arg3][arg5][arg2] = this.field6418[arg3][arg5 - 1][arg2 - 1];
                        return;
                    }
                    return;
                }
                if (arg5 > 0 && this.field6418[arg3][arg5 - 1][arg2] != 0) {
                    this.field6418[arg3][arg5][arg2] = this.field6418[arg3][arg5 - 1][arg2];
                    return;
                }
                if (arg2 > 0 && this.field6418[arg3][arg5][arg2 - 1] != 0) {
                    this.field6418[arg3][arg5][arg2] = this.field6418[arg3][arg5][arg2 - 1];
                    return;
                }
                if (arg5 > 0 && arg2 > 0 && this.field6418[arg3][arg5 - 1][arg2 - 1] != 0) {
                    this.field6418[arg3][arg5][arg2] = this.field6418[arg3][arg5 - 1][arg2 - 1];
                    return;
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6426[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILpba;ILap;Lha;I[ZI[[BI[[BI[[BI)V", line = 1397)
    private final void method3353(int arg0, class350 arg1, int arg2, class502 arg3, class66 arg4, int arg5, boolean[] arg6, int arg7, byte[][] arg8, int arg9, byte[][] arg10, int arg11, byte[][] arg12, int arg13) {
        try {
            field6398++;
            boolean[] var15 = arg3 != null && arg3.field7266 ? class261.field4024[arg2] : class148.field1813[arg2];
            if (arg7 > 0) {
                if (arg13 > 0) {
                    int var16 = arg12[arg13 - 1][arg7 - 1] & 0xFF;
                    if (var16 > 0) {
                        class502 var17 = this.field6397.method1672(var16 - 1, arg5 + -2050);
                        if (var17.field7263 != -1 && var17.field7266) {
                            byte var18 = arg10[arg13 - 1][arg7 - 1];
                            int var19 = (arg8[arg13 - 1][arg7 - 1] * 2) + 4 & 0x7;
                            int var20 = class209.method1844(arg4, var17, false);
                            if (class689.field9985[var18][var19]) {
                                class336.field5247[0] = var17.field7263;
                                class204.field3164[0] = var20;
                                class342.field5314[0] = var17.field7268;
                                class647.field9374[0] = var17.field7269;
                                class502.field7249[0] = var17.field7255;
                                class454.field6639[0] = 256;
                            }
                        }
                    }
                }
                if ((arg11 - 1) > arg13) {
                    int var21 = arg12[arg13 + 1][arg7 - 1] & 0xFF;
                    if (var21 > 0) {
                        class502 var22 = this.field6397.method1672(var21 - 1, -2049);
                        if (var22.field7263 != -1 && var22.field7266) {
                            byte var23 = arg10[arg13 + 1][arg7 - 1];
                            int var24 = arg8[arg13 + 1][arg7 - 1] * 2 + 6 & 0x7;
                            int var25 = class209.method1844(arg4, var22, false);
                            if (class689.field9985[var23][var24]) {
                                class336.field5247[2] = var22.field7263;
                                class204.field3164[2] = var25;
                                class342.field5314[2] = var22.field7268;
                                class647.field9374[2] = var22.field7269;
                                class502.field7249[2] = var22.field7255;
                                class454.field6639[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg0 - 1 > arg7) {
                if (arg13 > 0) {
                    int var26 = arg12[arg13 - 1][arg7 + 1] & 0xFF;
                    if (var26 > 0) {
                        class502 var27 = this.field6397.method1672(var26 - 1, -2049);
                        if (var27.field7263 != -1 && var27.field7266) {
                            byte var28 = arg10[arg13 - 1][arg7 + 1];
                            int var29 = (arg8[arg13 - 1][arg7 + 1] * 2) + 2 & 0x7;
                            int var30 = class209.method1844(arg4, var27, false);
                            if (class689.field9985[var28][var29]) {
                                class336.field5247[6] = var27.field7263;
                                class204.field3164[6] = var30;
                                class342.field5314[6] = var27.field7268;
                                class647.field9374[6] = var27.field7269;
                                class502.field7249[6] = var27.field7255;
                                class454.field6639[6] = 64;
                            }
                        }
                    }
                }
                if ((arg11 - 1) > arg13) {
                    int var31 = arg12[arg13 + 1][arg7 + 1] & 0xFF;
                    if (var31 > 0) {
                        class502 var32 = this.field6397.method1672(var31 - 1, -2049);
                        if (var32.field7263 != -1 && var32.field7266) {
                            byte var33 = arg10[arg13 + 1][arg7 + 1];
                            int var34 = arg8[arg13 + 1][arg7 + 1] * 2 & 0x7;
                            int var35 = class209.method1844(arg4, var32, false);
                            if (class689.field9985[var33][var34]) {
                                class336.field5247[4] = var32.field7263;
                                class204.field3164[4] = var35;
                                class342.field5314[4] = var32.field7268;
                                class647.field9374[4] = var32.field7269;
                                class502.field7249[4] = var32.field7255;
                                class454.field6639[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg7 > 0) {
                int var36 = arg12[arg13][arg7 - 1] & 0xFF;
                if (var36 > 0) {
                    class502 var37 = this.field6397.method1672(var36 - 1, arg5 ^ 0xFFFFF7FE);
                    if (var37.field7263 != -1) {
                        byte var38 = arg10[arg13][arg7 - 1];
                        byte var39 = arg8[arg13][arg7 - 1];
                        if (var37.field7266) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class209.method1844(arg4, var37, false);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class689.field9985[var38][var41] && class502.field7249[var40] <= var37.field7255) {
                                    class336.field5247[var40] = var37.field7263;
                                    class204.field3164[var40] = var42;
                                    class342.field5314[var40] = var37.field7268;
                                    class647.field9374[var40] = var37.field7269;
                                    if (class502.field7249[var40] == var37.field7255) {
                                        class454.field6639[var40] = class544.method4107(class454.field6639[var40], 32);
                                    } else {
                                        class454.field6639[var40] = 32;
                                    }
                                    class502.field7249[var40] = var37.field7255;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[-(-arg9) & 0x3]) {
                                arg6[0] = class261.field4024[var38][class291.method2359(3, var39 + 2)];
                            }
                        } else if (!var15[arg9 & 0x3]) {
                            arg6[0] = class148.field1813[var38][class291.method2359(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg5 != 1) {
                this.field6425 = null;
            }
            if ((arg0 - 1) > arg7) {
                int var44 = arg12[arg13][arg7 + 1] & 0xFF;
                if (var44 > 0) {
                    class502 var45 = this.field6397.method1672(var44 - 1, arg5 + -2050);
                    if (var45.field7263 != -1) {
                        byte var46 = arg10[arg13][arg7 + 1];
                        byte var47 = arg8[arg13][arg7 + 1];
                        if (var45.field7266) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class209.method1844(arg4, var45, false);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class689.field9985[var46][var49] && class502.field7249[var48] <= var45.field7255) {
                                    class336.field5247[var48] = var45.field7263;
                                    class204.field3164[var48] = var50;
                                    class342.field5314[var48] = var45.field7268;
                                    class647.field9374[var48] = var45.field7269;
                                    if (class502.field7249[var48] == var45.field7255) {
                                        class454.field6639[var48] = class544.method4107(class454.field6639[var48], 16);
                                    } else {
                                        class454.field6639[var48] = 16;
                                    }
                                    class502.field7249[var48] = var45.field7255;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg9 + 2 & 0x3]) {
                                arg6[2] = class261.field4024[var46][class291.method2359(3, -(-var47))];
                            }
                        } else if (!var15[arg9 + 2 & 0x3]) {
                            arg6[2] = class148.field1813[var46][class291.method2359(var47, 3)];
                        }
                    }
                }
            }
            if (arg13 > 0) {
                int var52 = arg12[arg13 - 1][arg7] & 0xFF;
                if (var52 > 0) {
                    class502 var53 = this.field6397.method1672(var52 - 1, -2049);
                    if (var53.field7263 != -1) {
                        byte var54 = arg10[arg13 - 1][arg7];
                        byte var55 = arg8[arg13 - 1][arg7];
                        if (var53.field7266) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class209.method1844(arg4, var53, false);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class689.field9985[var54][var57] && var53.field7255 >= class502.field7249[var56]) {
                                    class336.field5247[var56] = var53.field7263;
                                    class204.field3164[var56] = var58;
                                    class342.field5314[var56] = var53.field7268;
                                    class647.field9374[var56] = var53.field7269;
                                    if (class502.field7249[var56] == var53.field7255) {
                                        class454.field6639[var56] = class544.method4107(class454.field6639[var56], 8);
                                    } else {
                                        class454.field6639[var56] = 8;
                                    }
                                    class502.field7249[var56] = var53.field7255;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg9 + 3 & 0x3]) {
                                arg6[3] = class261.field4024[var54][class291.method2359(3, var55 + 1)];
                            }
                        } else if (!var15[arg9 + 3 & 0x3]) {
                            arg6[3] = class148.field1813[var54][class291.method2359(3, var55 + 1)];
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg13) {
                int var60 = arg12[arg13 + 1][arg7] & 0xFF;
                if (var60 > 0) {
                    class502 var61 = this.field6397.method1672(var60 - 1, -2049);
                    if (var61.field7263 != -1) {
                        byte var62 = arg10[arg13 + 1][arg7];
                        byte var63 = arg8[arg13 + 1][arg7];
                        if (var61.field7266) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class209.method1844(arg4, var61, false);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class689.field9985[var62][var65] && class502.field7249[var64] <= var61.field7255) {
                                    class336.field5247[var64] = var61.field7263;
                                    class204.field3164[var64] = var66;
                                    class342.field5314[var64] = var61.field7268;
                                    class647.field9374[var64] = var61.field7269;
                                    if (class502.field7249[var64] == var61.field7255) {
                                        class454.field6639[var64] = class544.method4107(class454.field6639[var64], 4);
                                    } else {
                                        class454.field6639[var64] = 4;
                                    }
                                    class502.field7249[var64] = var61.field7255;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg9 + 1 & 0x3]) {
                                arg6[1] = class261.field4024[var62][class291.method2359(var63 + 3, 3)];
                            }
                        } else if (!var15[arg9 + 1 & 0x3]) {
                            arg6[1] = class148.field1813[var62][class291.method2359(var63 + 3, 3)];
                        }
                    }
                }
            }
            if (arg3 != null) {
                int var68 = class209.method1844(arg4, arg3, false);
                if (arg3.field7266) {
                    for (int var69 = 0; var69 < 8; var69++) {
                        int var70 = var69 - (arg9 * 2) & 0x7;
                        if (class689.field9985[arg2][var69] && arg3.field7255 >= class502.field7249[var70]) {
                            class336.field5247[var70] = arg3.field7263;
                            class204.field3164[var70] = var68;
                            class342.field5314[var70] = arg3.field7268;
                            class647.field9374[var70] = arg3.field7269;
                            if (class502.field7249[var70] == arg3.field7255) {
                                class454.field6639[var70] = class544.method4107(class454.field6639[var70], 2);
                            } else {
                                class454.field6639[var70] = 2;
                            }
                            class502.field7249[var70] = arg3.field7255;
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var72) {
            throw class759.method5498(var72, field6426[4] + arg0 + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + arg2 + ',' + (arg3 == null ? field6426[1] : field6426[3]) + ',' + (arg4 == null ? field6426[1] : field6426[3]) + ',' + arg5 + ',' + (arg6 == null ? field6426[1] : field6426[3]) + ',' + arg7 + ',' + (arg8 == null ? field6426[1] : field6426[3]) + ',' + arg9 + ',' + (arg10 == null ? field6426[1] : field6426[3]) + ',' + arg11 + ',' + (arg12 == null ? field6426[1] : field6426[3]) + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lha;[Ldja;B[[[I)V", line = 1862)
    public final void method3354(class66 arg0, class324[] arg1, byte arg2, int[][][] arg3) {
        try {
            if (arg2 != 23) {
                this.method3352(103, (byte) 126, 41, 17, 37, -51);
            }
            if (!this.field6424) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 0; var6 < this.field6395; var6++) {
                        for (int var7 = 0; var7 < this.field6405; var7++) {
                            if ((class184.field2545[var5][var6][var7] & 0x1) != 0) {
                                int var8 = var5;
                                if ((class184.field2545[1][var6][var7] & 0x2) != 0) {
                                    var8 = var5 - 1;
                                }
                                if (var8 >= 0) {
                                    arg1[var8].method2732(var7, var6, 116);
                                }
                            }
                        }
                    }
                }
            }
            field6407++;
            for (int var9 = 0; var9 < this.field6419; var9++) {
                int var10 = 0;
                int var11 = 0;
                if (!this.field6424) {
                    if (class685.field9935) {
                        var10 |= 0x2;
                    }
                    if (class744.field10820) {
                        var11 |= 0x8;
                    }
                    if (class277.field4176 != 0) {
                        var10 |= 0x1;
                        if (class222.field3405 | var9 == 0) {
                            var11 |= 0x10;
                        }
                    }
                }
                if (class685.field9935) {
                    var11 |= 0x7;
                }
                if (!class560.field8341) {
                    var11 |= 0x20;
                }
                int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field6418[var9] : arg3[var9];
                class263.method2206(var9, arg0.method477(this.field6395, this.field6405, this.field6418[var9], var12, 512, var10, var11));
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field6426[12] + (arg0 == null ? field6426[1] : field6426[3]) + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + arg2 + ',' + (arg3 == null ? field6426[1] : field6426[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIIIII[Ldja;Lib;)V", line = 1970)
    public final void method3355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class324[] arg8, class163 arg9) {
        try {
            field6400++;
            int var11 = (arg7 & 0x7) * 8;
            if (!this.field6424) {
                class324 var12 = arg8[arg2];
                for (int var13 = 0; var13 < 8; var13++) {
                    for (int var14 = 0; var14 < 8; var14++) {
                        int var15 = arg5 + class122.method1057(var13 & 0x7, arg3 - 56, arg6, var14 & 0x7);
                        int var16 = arg1 + class383.method3066(arg6, var13 & 0x7, (byte) -124, var14 & 0x7);
                        if (var15 > 0 && var15 < (this.field6395 - 1) && var16 > 0 && this.field6405 - 1 > var16) {
                            var12.method2736((byte) -42, var16, var15);
                        }
                    }
                }
            }
            int var17 = (arg4 & 0x7) * 8;
            int var18 = arg7 & 0x1FFFFFF8 << 3;
            if (arg3 != 64) {
                this.method3356(123, -16, -61, -114, -40);
            }
            int var19 = arg4 & 0x1FFFFFF8 << 3;
            byte var20 = 0;
            byte var21 = 0;
            if (arg6 == 1) {
                var21 = 1;
            } else if (arg6 == 2) {
                var20 = 1;
                var21 = 1;
            } else if (arg6 == 3) {
                var20 = 1;
            }
            for (int var22 = 0; var22 < this.field6419; var22++) {
                for (int var23 = 0; var23 < 64; var23++) {
                    for (int var24 = 0; var24 < 64; var24++) {
                        if (arg0 == var22 && var23 >= var11 && var11 + 8 >= var23 && var17 <= var24 && var24 <= var17 + 8) {
                            int var25;
                            int var26;
                            if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                                if (arg6 == 0) {
                                    var26 = var24 + arg1 - var17;
                                    var25 = arg5 + var23 - var11;
                                } else if (arg6 == 1) {
                                    var26 = arg1 + var11 + 8 - var23;
                                    var25 = var24 + arg5 - var17;
                                } else if (arg6 == 2) {
                                    var26 = arg1 + var17 + 8 - var24;
                                    var25 = arg5 + var11 + 8 - var23;
                                } else {
                                    var25 = arg5 + var17 + 8 - var24;
                                    var26 = arg1 - (var11 - var23);
                                }
                                this.method3360(var25, true, (byte) 56, 0, arg2, var19 + var24, arg9, 0, var26, 0, var18 + var23);
                            } else {
                                var25 = class122.method1057(var23 & 0x7, 89, arg6, var24 & 0x7) + arg5;
                                var26 = class383.method3066(arg6, var23 & 0x7, (byte) -124, var24 & 0x7) + arg1;
                                this.method3360(var25, false, (byte) 59, var20, arg2, var19 + var24, arg9, arg6, var26, var21, var18 + var23);
                            }
                            if (var23 == 63 || var24 == 63) {
                                byte var27 = 1;
                                if (var23 == 63 && var24 == 63) {
                                    var27 = 3;
                                }
                                for (int var28 = 0; var28 < var27; var28++) {
                                    int var29 = var23;
                                    int var30 = var24;
                                    if (var28 == 0) {
                                        var30 = var24 == 63 ? 64 : var24;
                                        var29 = var23 == 63 ? 64 : var23;
                                    } else if (var28 == 1) {
                                        var29 = 64;
                                    } else if (var28 == 2) {
                                        var30 = 64;
                                    }
                                    int var31;
                                    int var32;
                                    if (arg6 == 0) {
                                        var31 = var30 + arg1 - var17;
                                        var32 = arg5 + var29 - var11;
                                    } else if (arg6 == 1) {
                                        var31 = arg1 + 8 - (var29 - var11);
                                        var32 = var30 + arg5 - var17;
                                    } else if (arg6 == 2) {
                                        var31 = arg1 + var17 + 8 - var30;
                                        var32 = -var29 - (-var11 - (arg5 + 8));
                                    } else {
                                        var32 = var17 + arg5 + 8 - var30;
                                        var31 = arg1 - (var11 - var29);
                                    }
                                    if (var32 >= 0 && var32 < this.field6395 && var31 >= 0 && this.field6405 > var31) {
                                        this.field6418[arg2][var32][var31] = this.field6418[arg2][var20 + var25][var26 + var21];
                                    }
                                }
                            }
                        } else {
                            this.method3360(-1, false, (byte) 66, 0, 0, 0, arg9, 0, -1, 0, 0);
                        }
                    }
                }
            }
        } catch (RuntimeException var34) {
            throw class759.method5498(var34, field6426[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field6426[1] : field6426[3]) + ',' + (arg9 == null ? field6426[1] : field6426[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIII)V", line = 2174)
    public final void method3356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            for (int var6 = 0; var6 < this.field6419; var6++) {
                this.method3352(arg1, (byte) 101, arg0, var6, arg2, arg3);
            }
            if (arg4 != -20411) {
                this.method3351(-62, null, 55, -9, (byte) -128, null, -48);
            }
            field6406++;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6426[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ls;Ls;Ls;ILha;[[II)V", line = 2192)
    private final void method3357(class294 arg0, class294 arg1, class294 arg2, int arg3, class66 arg4, int[][] arg5, int arg6) {
        try {
            for (int var8 = 0; var8 < this.field6395; var8++) {
                for (int var9 = 0; var9 < this.field6405; var9++) {
                    if (class394.field5908 == -1 || class256.method2171(2, arg3, var9, class394.field5908, var8)) {
                        byte var10 = this.field6402[arg3][var8][var9];
                        byte var11 = this.field6408[arg3][var8][var9];
                        int var12 = this.field6410[arg3][var8][var9] & 0xFF;
                        int var13 = this.field6417[arg3][var8][var9] & 0xFF;
                        class502 var14 = var12 == 0 ? null : this.field6397.method1672(var12 - 1, -2049);
                        class350 var15 = var13 == 0 ? null : this.field6399.method5415((byte) 36, var13 - 1);
                        if (var10 == 0 && var14 == null) {
                            var10 = 12;
                        }
                        class502 var16 = var14;
                        if (var14 != null && var14.field7263 == -1 && var14.field7264 == -1) {
                            var16 = var14;
                            var14 = null;
                        }
                        if (var14 != null || var15 != null) {
                            int var17 = class659.field9509[var10];
                            int var18 = class97.field1092[var10];
                            int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                            int var20 = 0;
                            int var21 = 0;
                            int var22 = var14 == null ? -1 : var14.field7268;
                            int var23 = var15 == null ? -1 : var15.field5412;
                            int[] var24 = new int[var19];
                            int[] var25 = new int[var19];
                            int[] var26 = new int[var19];
                            int[] var27 = new int[var19];
                            int[] var28 = new int[var19];
                            int[] var29 = new int[var19];
                            int[] var30 = var14 == null || var14.field7264 == -1 ? null : new int[var19];
                            if (var14 == null) {
                                var21 += var18;
                            } else {
                                for (int var31 = 0; var31 < var18; var31++) {
                                    var24[var20] = class11.field137[var10][var21];
                                    var25[var20] = class236.field3565[var10][var21];
                                    var26[var20] = class613.field8961[var10][var21];
                                    var28[var20] = var22;
                                    var29[var20] = var14.field7269;
                                    var27[var20] = var14.field7263;
                                    if (var30 != null) {
                                        var30[var20] = var14.field7264;
                                    }
                                    var21++;
                                    var20++;
                                }
                                if (!this.field6424 && arg3 == 0) {
                                    class626.method4646(var8, var9, var14.field7254, var14.field7250 * 8, var14.field7251);
                                }
                            }
                            if (var15 != null) {
                                for (int var32 = 0; var32 < var17; var32++) {
                                    var24[var20] = class11.field137[var10][var21];
                                    var25[var20] = class236.field3565[var10][var21];
                                    var26[var20] = class613.field8961[var10][var21];
                                    var28[var20] = var23;
                                    var29[var20] = var15.field5401;
                                    var27[var20] = arg5[var8][var9];
                                    if (var30 != null) {
                                        var30[var20] = var27[var20];
                                    }
                                    var21++;
                                    var20++;
                                }
                            }
                            int var33 = this.field6413.length;
                            int[] var34 = new int[var33];
                            int[] var35 = new int[var33];
                            int[] var36 = arg0 == null ? null : new int[var33];
                            int[] var37 = arg0 == null && arg1 == null ? null : new int[var33];
                            for (int var38 = 0; var38 < var33; var38++) {
                                int var39 = this.field6413[var38];
                                int var40 = this.field6425[var38];
                                if (var11 == 0) {
                                    var34[var38] = var39;
                                    var35[var38] = var40;
                                } else if (var11 == 1) {
                                    var34[var38] = var40;
                                    var35[var38] = 512 - var39;
                                } else if (var11 == 2) {
                                    var34[var38] = 512 - var39;
                                    var35[var38] = 512 - var40;
                                } else if (var11 == 3) {
                                    var34[var38] = 512 - var40;
                                    var35[var38] = var39;
                                }
                                if (var36 != null && class689.field9985[var10][var38]) {
                                    int var43 = (var8 << 9) + var34[var38];
                                    int var44 = (var9 << 9) + var35[var38];
                                    var36[var38] = arg0.method2404((byte) 112, var43, var44) - arg2.method2404((byte) 107, var43, var44);
                                }
                                if (var37 != null) {
                                    if (arg0 != null && !class689.field9985[var10][var38]) {
                                        int var47 = (var8 << 9) + var34[var38];
                                        int var48 = (var9 << 9) + var35[var38];
                                        var37[var38] = arg2.method2404((byte) 113, var47, var48) - arg0.method2404((byte) 115, var47, var48);
                                    } else if (arg1 != null && !class330.field5193[var10][var38]) {
                                        int var45 = (var8 << 9) + var34[var38];
                                        int var46 = (var9 << 9) + var35[var38];
                                        var37[var38] = arg1.method2404((byte) 108, var45, var46) - arg2.method2404((byte) 116, var45, var46);
                                    }
                                }
                            }
                            int var49 = arg2.method2407(var9, var8, 63);
                            int var50 = arg2.method2407(var9, var8 + 1, -128);
                            int var51 = arg2.method2407(var9 + 1, var8 + 1, 31);
                            int var52 = arg2.method2407(var9 + 1, var8, 107);
                            boolean var53 = class231.method1980(1, var9, var8);
                            if (var53 && arg3 > 1 || !var53 && arg3 > 0) {
                                boolean var54 = true;
                                if (var15 != null && !var15.field5398) {
                                    var54 = false;
                                } else if (var13 == 0 && var10 != 0) {
                                    var54 = false;
                                } else if (var12 > 0 && var16 != null && !var16.field7265) {
                                    var54 = false;
                                }
                                if (var54 && var49 == var50 && var49 == var51 && var49 == var52) {
                                    this.field6414[arg3][var8][var9] = (byte) class544.method4107(this.field6414[arg3][var8][var9], 4);
                                }
                            }
                            int var55 = 0;
                            int var56 = 0;
                            int var57 = 0;
                            if (this.field6424) {
                                var55 = class114.method1005(var8, var9);
                                var56 = class218.method1907(var8, var9);
                                var57 = class695.method5076(var8, var9);
                            }
                            arg2.method1506(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var55, var56, var57, false);
                            class366.method2963(arg3, var8, var9);
                        }
                    }
                }
            }
            field6411++;
            int var58 = -87 / ((arg6 - 24) / 49);
        } catch (RuntimeException var60) {
            throw class759.method5498(var60, field6426[18] + (arg0 == null ? field6426[1] : field6426[3]) + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + (arg2 == null ? field6426[1] : field6426[3]) + ',' + arg3 + ',' + (arg4 == null ? field6426[1] : field6426[3]) + ',' + (arg5 == null ? field6426[1] : field6426[3]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(FIIFF)F", line = 2482)
    public static final float method3358(float arg0, int arg1, int arg2, float arg3, float arg4) {
        try {
            field6404++;
            float[] var5 = class660.field9531[arg2];
            if (arg1 != -24559) {
                field6396 = true;
            }
            return var5[2] * arg4 + var5[1] * arg0 + var5[0] * arg3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6426[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[[IB)V", line = 2495)
    public final void method3359(int arg0, int[][] arg1, byte arg2) {
        try {
            field6415++;
            int[][] var4 = this.field6418[arg0];
            for (int var5 = 0; var5 < this.field6395 + 1; var5++) {
                for (int var6 = 0; var6 < this.field6405 + 1; var6++) {
                    var4[var5][var6] += arg1[var5][var6];
                }
            }
            if (arg2 >= -43) {
                this.method3348(-116, null, null, null, 73, null, null);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6426[8] + arg0 + ',' + (arg1 == null ? field6426[1] : field6426[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIZLqga;Llja;)V", line = 2658)
    public class437(int arg0, int arg1, int arg2, boolean arg3, class196 arg4, class743 arg5) {
        try {
            this.field6395 = arg1;
            this.field6405 = arg2;
            this.field6397 = arg4;
            this.field6399 = arg5;
            this.field6419 = arg0;
            this.field6424 = arg3;
            this.field6410 = new byte[this.field6419][this.field6395][this.field6405];
            this.field6417 = new byte[this.field6419][this.field6395][this.field6405];
            this.field6414 = new byte[this.field6419][this.field6395 + 1][this.field6405 + 1];
            this.field6418 = new int[this.field6419][this.field6395 + 1][this.field6405 + 1];
            this.field6408 = new byte[this.field6419][this.field6395][this.field6405];
            this.field6402 = new byte[this.field6419][this.field6395][this.field6405];
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6426[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field6426[1] : field6426[3]) + ',' + (arg5 == null ? field6426[1] : field6426[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZBIIILib;IIII)V", line = 2528)
    private final void method3360(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, class163 arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            field6409++;
            if (arg2 >= 49) {
                if (arg7 == 1) {
                    arg9 = 1;
                } else if (arg7 == 2) {
                    arg3 = 1;
                    arg9 = 1;
                } else if (arg7 == 3) {
                    arg3 = 1;
                }
                if (arg0 >= 0 && arg0 < this.field6395 && arg8 >= 0 && this.field6405 > arg8) {
                    if (!this.field6424 && !arg1) {
                        class184.field2545[arg4][arg0][arg8] = 0;
                    }
                    while (true) {
                        int var12 = arg6.method1455((byte) 62);
                        if (var12 == 0) {
                            if (this.field6424) {
                                this.field6418[0][arg0 + arg3][arg8 + arg9] = 0;
                                return;
                            } else if (arg4 == 0) {
                                this.field6418[0][arg0 + arg3][arg8 + arg9] = -class207.method1831(4, arg5 + 556238, arg10 + 932731) * 8 << 2;
                                return;
                            } else {
                                this.field6418[arg4][arg0 + arg3][arg8 + arg9] = this.field6418[arg4 - 1][arg0 + arg3][arg8 + arg9] - 960;
                                return;
                            }
                        }
                        if (var12 == 1) {
                            int var13 = arg6.method1455((byte) 62);
                            if (this.field6424) {
                                this.field6418[0][arg0 + arg3][arg8 + arg9] = var13 * 8 << 2;
                                return;
                            }
                            if (var13 == 1) {
                                var13 = 0;
                            }
                            if (arg4 == 0) {
                                this.field6418[0][arg0 + arg3][arg8 + arg9] = -var13 * 8 << 2;
                                return;
                            }
                            this.field6418[arg4][arg0 + arg3][arg8 + arg9] = this.field6418[arg4 - 1][arg0 + arg3][arg8 + arg9] - (var13 * 8 << 2);
                            return;
                        }
                        if (var12 <= 49) {
                            if (arg1) {
                                arg6.method1455((byte) 62);
                            } else {
                                this.field6410[arg4][arg0][arg8] = arg6.method1414(1);
                                this.field6402[arg4][arg0][arg8] = (byte) ((var12 - 2) / 4);
                                this.field6408[arg4][arg0][arg8] = (byte) class291.method2359(arg7 + var12 - 2, 3);
                            }
                        } else if (var12 <= 81) {
                            if (!this.field6424 && !arg1) {
                                class184.field2545[arg4][arg0][arg8] = (byte) (var12 - 49);
                            }
                        } else if (!arg1) {
                            this.field6417[arg4][arg0][arg8] = (byte) (var12 - 81);
                        }
                    }
                } else {
                    while (true) {
                        int var14 = arg6.method1455((byte) 62);
                        if (var14 == 0) {
                            return;
                        }
                        if (var14 == 1) {
                            arg6.method1455((byte) 62);
                            return;
                        }
                        if (var14 <= 49) {
                            arg6.method1455((byte) 62);
                        }
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field6426[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field6426[1] : field6426[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3361(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3362(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
