import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class195 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    public static int[] field3213 = new int[256];

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lve;")
    public static class255 field3214 = class87.method607(35, "<col=ffffff>)0");

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lva;")
    public static class137 field3208;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[I")
    public static int[] field3211;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 12)
    public static final void method1393(Throwable arg0, int arg1, String arg2) {
        field3215++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class131.method966(arg0, true);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg1 != 0) {
                return;
            }
            if (class305.field5214.field626 == null) {
                return;
            }
            class169 var8 = class305.field5214.method242(new URL(class305.field5214.field626.getCodeBase(), "clienterror.ws?c=" + class222.field3731 + "&u=" + class256.field4378 + "&v1=" + class40.field620 + "&v2=" + class40.field629 + "&e=" + var7), arg1 + 1161386192);
            while (var8.field2833 == 0) {
                class137.method1027(1L, arg1);
            }
            if (var8.field2833 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2832;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lrg;ILrg;)V", line = 65)
    public static final void method1394(class88 arg0, int arg1, class88 arg2) {
        if (arg1 == 1) {
            field3218++;
            class55.field867 = arg2;
            class59.field901 = arg0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILrg;)Lvi;", line = 80)
    public static final class5 method1395(int arg0, int arg1, class88 arg2) {
        if (arg1 != 26773) {
            method1394((class88) null, -56, (class88) null);
        }
        field3219++;
        return class305.method2119(arg0, arg2, 42) ? class315.method2177(-8621) : null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V", line = 123)
    public static final void method1396(int arg0, int arg1) {
        int var2 = 55 % ((arg1 - 4) / 47);
        field3212++;
        class271.field4658.method562((byte) 117, arg0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[I[[I[[B[[F[[I[[I[[B[[[B[[II[[FI[[B[[B[[F)[Ldi;", line = 137)
    public static final class142[] method1397(int[][] arg0, int[][] arg1, byte[][] arg2, float[][] arg3, int[][] arg4, int[][] arg5, byte[][] arg6, byte[][][] arg7, int[][] arg8, int arg9, float[][] arg10, int arg11, byte[][] arg12, byte[][] arg13, float[][] arg14) {
        field3209++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg2[var16][var17];
                if (var18 == 0) {
                    var18 = arg2[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg2[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg2[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class277 var19 = class58.method356((byte) 73, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field4754 + 1 << 16) + var19.field4750;
                }
            }
        }
        class47 var20 = new class47(128);
        for (int var21 = arg11; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg2[var21][var22] != 0) {
                    int[] var23;
                    if (arg13[var21][var22] == 0) {
                        var23 = class112.field1900[0];
                    } else {
                        var23 = class231.field3822[arg6[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21 + 1][var22];
                    int var26 = var15[var21][var22];
                    if (arg8 != null) {
                        var24 = arg8[var21][var22] & 0xFFFFFF;
                    }
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var25 << 32 | (long) var24;
                    long var31 = (long) var24 | (long) var26 << 32;
                    long var33 = (long) var24 | (long) var27 << 32;
                    long var35 = (long) var28 << 32 | (long) var24;
                    int var37 = var23.length / 2;
                    class142 var38 = (class142) var20.method280(var31, 29153);
                    if (var38 == null) {
                        var38 = new class142((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg1 != null, var24);
                        var20.method284(true, var31, var38);
                    }
                    var38.field2362 += var37;
                    var38.field2359++;
                    if (var29 != var31) {
                        class142 var39 = (class142) var20.method280(var29, arg11 ^ 0x71E0);
                        if (var39 == null) {
                            var39 = new class142((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg1 != null, var24);
                            var20.method284(true, var29, var39);
                        }
                        var39.field2359++;
                        var39.field2362 += var37;
                    }
                    if (var31 != var33 && var29 != var33) {
                        class142 var40 = (class142) var20.method280(var33, 29153);
                        if (var40 == null) {
                            var40 = new class142((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg1 != null, var24);
                            var20.method284(true, var33, var40);
                        }
                        var40.field2362 += var37;
                        var40.field2359++;
                    }
                    if (var31 != var35 && var29 != var35 && var33 != var35) {
                        class142 var41 = (class142) var20.method280(var35, 29153);
                        if (var41 == null) {
                            var41 = new class142((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg1 != null, var24);
                            var20.method284(true, var35, var41);
                        }
                        var41.field2362 += var37;
                        var41.field2359++;
                    }
                }
            }
        }
        for (class142 var42 = (class142) var20.method288((byte) -42); var42 != null; var42 = (class142) var20.method289(arg11 ^ 0x64)) {
            var42.method1054();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg2[var43][var44] != 0) {
                    int var45;
                    if ((arg7[arg9][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg7[1][var43][var44] & 0x2) == 2 && arg9 > 0) {
                        var45 = arg9 - 1;
                    } else {
                        var45 = arg9;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg8 != null) {
                        var46 = arg8[var43][var44] & 0xFFFFFF;
                        var47 = arg8[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    int[] var49;
                    byte var50;
                    if (arg13[var43][var44] == 0) {
                        var49 = class112.field1900[0];
                        var50 = 0;
                    } else {
                        var49 = class231.field3822[arg6[var43][var44]];
                        var48 = client.field4038[arg6[var43][var44]];
                        var50 = arg12[var43][var44];
                        if (var49.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44];
                    int var53 = var15[var43 + 1][var44 + 1];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var46 | (long) var52 << 32;
                    long var57 = (long) var53 << 32 | (long) var46;
                    long var59 = (long) var51 << 32 | (long) var46;
                    int var61 = arg4[var43 + 1][var44];
                    long var62 = (long) var46 | (long) var54 << 32;
                    int var64 = arg4[var43 + 1][var44 + 1];
                    int var65 = arg0[var43][var44];
                    int var66 = arg0[var43 + 1][var44];
                    int var67 = arg4[var43][var44 + 1];
                    int var68 = arg4[var43][var44];
                    int var69 = arg0[var43 + 1][var44 + 1];
                    int var70 = arg0[var43][var44 + 1];
                    int var71 = (var51 >> 16) - 1;
                    int var72 = (var52 >> 16) - 1;
                    int var73 = (var53 >> 16) - 1;
                    class142 var74 = (class142) var20.method280(var59, 29153);
                    int var75 = (var54 >> 16) - 1;
                    class143.method1062(arg14, class262.method1826(var71, var66, var61, -25165), var48, arg3, var45, class262.method1826(var71, var70, var67, -25165), arg1, class262.method1826(var71, var69, var64, -25165), var44, var74, arg10, var54 >= var51, var47, var51 >= var51, var50, class262.method1826(var71, var65, var68, arg11 - 25166), var43, var49, var51 <= var53, var52 >= var51, (byte) 26, arg5);
                    if (var55 != var59) {
                        class142 var76 = (class142) var20.method280(var55, 29153);
                        class143.method1062(arg14, class262.method1826(var72, var66, var61, -25165), var48, arg3, var45, class262.method1826(var72, var70, var67, -25165), arg1, class262.method1826(var72, var69, var64, arg11 - 25166), var44, var76, arg10, var52 <= var54, var47, var51 >= var52, var50, class262.method1826(var72, var65, var68, -25165), var43, var49, var53 >= var52, var52 <= var52, (byte) 26, arg5);
                    }
                    if (var57 != var59 && var55 != var57) {
                        class142 var77 = (class142) var20.method280(var57, 29153);
                        class143.method1062(arg14, class262.method1826(var73, var66, var61, -25165), var48, arg3, var45, class262.method1826(var73, var70, var67, arg11 ^ 0xFFFF9DB2), arg1, class262.method1826(var73, var69, var64, -25165), var44, var77, arg10, var54 >= var53, var47, var51 >= var53, var50, class262.method1826(var73, var65, var68, -25165), var43, var49, var53 <= var53, var52 >= var53, (byte) 26, arg5);
                    }
                    if (var59 != var62 && var55 != var62 && var57 != var62) {
                        class142 var78 = (class142) var20.method280(var62, 29153);
                        class143.method1062(arg14, class262.method1826(var75, var66, var61, -25165), var48, arg3, var45, class262.method1826(var75, var70, var67, -25165), arg1, class262.method1826(var75, var69, var64, -25165), var44, var78, arg10, var54 <= var54, var47, var51 >= var54, var50, class262.method1826(var75, var65, var68, -25165), var43, var49, var53 >= var54, var52 >= var54, (byte) 26, arg5);
                    }
                }
            }
        }
        for (class142 var79 = (class142) var20.method288((byte) -42); var79 != null; var79 = (class142) var20.method289(arg11 + 104)) {
            if (var79.field2373 == 0) {
                var79.method1502((byte) -82);
            } else {
                var79.method1055();
            }
        }
        int var80 = var20.method286((byte) 90);
        class142[] var81 = new class142[var80];
        long[] var82 = new long[var80];
        var20.method283(var81, false);
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field3568;
        }
        class34.method191(var82, arg11 + 28776, var81);
        return var81;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 455)
    public static void method1398(int arg0) {
        if (arg0 == -515504848) {
            field3214 = null;
            field3208 = null;
            field3211 = null;
            field3213 = null;
        }
    }
}
