import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class58 {

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Ldu;")
    public static class242 field730 = new class242(2, 17);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method476(int arg0) {
        field730 = null;
        if (arg0 != 4) {
            field730 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljp;ILir;II)V")
    public static final void method477(class241 arg0, int arg1, class22 arg2, int arg3, int arg4) {
        field728++;
        if (arg3 < 51) {
            return;
        }
        byte var5 = -1;
        if ((arg1 & 0x20000) != 0) {
            arg2.field3343 = arg0.method2352(128);
            arg2.field3310 = arg0.method2352(128);
            arg2.field3309 = arg0.method2359(49);
            arg2.field3347 = (byte) arg0.method2370((byte) 41);
            arg2.field3348 = class390.field5481 + arg0.method2338(0);
            arg2.field3341 = class390.field5481 + arg0.method2324(-1033632760);
        }
        if ((arg1 & 0x8000) != 0) {
            arg2.field276 = arg0.method2361(255) == 1;
        }
        if ((arg1 & 0x4000) != 0) {
            arg2.field3304 = arg0.method2365(false);
            arg2.field3351 = arg0.method2352(128);
            arg2.field3324 = arg0.method2341(false);
            arg2.field3307 = arg0.method2341(false);
            arg2.field3319 = arg0.method2334(-128) + class390.field5481;
            arg2.field3365 = arg0.method2380(199752600) + class390.field5481;
            arg2.field3305 = arg0.method2361(255);
            arg2.field3376 = 0;
            if (arg2.field258) {
                arg2.field3351 += arg2.field263;
                arg2.field3324 += arg2.field290;
                arg2.field3369 = 0;
                arg2.field3307 += arg2.field263;
                arg2.field3304 += arg2.field290;
            } else {
                arg2.field3351 += arg2.field3378[0];
                arg2.field3304 += arg2.field3368[0];
                arg2.field3324 += arg2.field3368[0];
                arg2.field3307 += arg2.field3378[0];
                arg2.field3369 = 1;
            }
        }
        if ((arg1 & 0x8) != 0) {
            arg2.field259 = arg0.method2334(-128);
            if (arg2.field3369 == 0) {
                arg2.method1400(arg2.field259, true);
                arg2.field259 = -1;
            }
        }
        if ((arg1 & 0x1000) != 0) {
            int var6 = arg0.method2380(199752600);
            arg2.field3278 = arg0.method2326(1789029408);
            arg2.field3355 = arg0.method2326(1789029408);
            arg2.field3283 = var6 & 0x7FFF;
            arg2.field3333 = (var6 & 0x8000) != 0;
            arg2.field3360 = class390.field5481 + arg2.field3283 + arg2.field3278;
        }
        if ((arg1 & 0x800) != 0) {
            var5 = arg0.method2341(false);
        }
        if ((arg1 & 0x10000) != 0) {
            int var7 = arg0.method2380(199752600);
            int var8 = arg0.method2342(29707);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var9 = arg0.method2357((byte) 104);
            arg2.method1401(var7, true, var9, 0, var8);
        }
        if ((arg1 & 0x80) != 0) {
            int var10 = arg0.method2324(-1033632760);
            int var11 = arg0.method2357((byte) 110);
            int var12 = arg0.method2370((byte) 41);
            int var13 = arg0.field5665;
            boolean var14 = (var10 & 0x8000) != 0;
            if (arg2.field256 != null && arg2.field288 != null) {
                boolean var15 = false;
                if (var11 <= 1) {
                    if (!var14 && !(!class236.field3442 || class215.field3120) || class467.field6528) {
                        var15 = true;
                    } else if (class167.method1051(arg2.field256, (byte) -120)) {
                        var15 = true;
                    }
                }
                if (!var15 && class225.field3233 == 0) {
                    class330.field4816.field5665 = 0;
                    arg0.method2379(var12, 39, class330.field4816.field5663, 0);
                    class330.field4816.field5665 = 0;
                    int var16 = -1;
                    String var18;
                    if (var14) {
                        var10 &= 0x7FFF;
                        class393 var17 = class482.method2782((byte) 82, class330.field4816);
                        var16 = var17.field5519;
                        var18 = var17.field5523.method641((byte) -124, class330.field4816);
                    } else {
                        var18 = class31.method187((byte) 69, class288.method1776(class330.field4816, true));
                    }
                    arg2.field3315 = var18.trim();
                    arg2.field3323 = 150;
                    arg2.field3342 = var10 & 0xFF;
                    arg2.field3363 = var10 >> 8;
                    int var19;
                    if (var11 == 1 || var11 == 2) {
                        var19 = var14 ? 17 : 1;
                    } else {
                        var19 = var14 ? 17 : 2;
                    }
                    if (var11 == 2) {
                        class387.method2241(null, 0, var18, (byte) 95, "<img=1>" + arg2.method132(false, false), var19, var16, "<img=1>" + arg2.method137(true, -20951));
                    } else if (var11 == 1) {
                        class387.method2241(null, 0, var18, (byte) -98, "<img=0>" + arg2.method132(false, false), var19, var16, "<img=0>" + arg2.method137(true, -20951));
                    } else {
                        class387.method2241(null, 0, var18, (byte) -85, arg2.method132(false, false), var19, var16, arg2.method137(true, -20951));
                    }
                }
            }
            arg0.field5665 = var12 + var13;
        }
        if ((arg1 & 0x1) != 0) {
            int var20 = arg0.method2357((byte) 119);
            byte[] var21 = new byte[var20];
            class403 var22 = new class403(var21);
            arg0.method2379(var20, -120, var21, 0);
            class226.field3255[arg4] = var22;
            arg2.method131(var22, -1);
        }
        if ((arg1 & 0x10) != 0) {
            int var23 = arg0.method2324(-1033632760);
            if (var23 == 65535) {
                var23 = -1;
            }
            arg2.field3338 = var23;
        }
        if ((arg1 & 0x2) != 0) {
            int var24 = arg0.method2324(-1033632760);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg0.method2361(255);
            class197.method1249(var24, -125, var25, arg2);
        }
        if ((arg1 & 0x100) != 0) {
            int var26 = class390.field5481;
            int var27 = arg0.method2325(true);
            int var28 = arg0.method2361(255);
            arg2.method1399(var27, var26, var28, 70);
        }
        if ((arg1 & 0x40) != 0) {
            class124.field1684[arg4] = arg0.method2365(false);
        }
        if ((arg1 & 0x400) != 0) {
            int var29 = arg0.method2338(0);
            int var30 = arg0.method2319((byte) 94);
            if (var29 == 65535) {
                var29 = -1;
            }
            int var31 = arg0.method2361(255);
            arg2.method1401(var29, false, var31, 0, var30);
        }
        if ((arg1 & 0x2000) != 0) {
            arg2.field3315 = arg0.method2356(-25178);
            if (arg2.field3315.charAt(0) == '~') {
                arg2.field3315 = arg2.field3315.substring(1);
                class92.method661(arg2.field3315, -1, arg2.method132(false, false), arg2.method137(true, -20951), 2, 0);
            } else if (class246.field3587 == arg2) {
                class92.method661(arg2.field3315, -1, arg2.method132(false, false), arg2.method137(true, -20951), 2, 0);
            }
            arg2.field3323 = 150;
            arg2.field3363 = 0;
            arg2.field3342 = 0;
        }
        if ((arg1 & 0x40000) != 0) {
            int var32 = arg0.method2361(255);
            int[] var33 = new int[var32];
            int[] var34 = new int[var32];
            int[] var35 = new int[var32];
            for (int var36 = 0; var36 < var32; var36++) {
                int var37 = arg0.method2380(199752600);
                if (var37 == 65535) {
                    var37 = -1;
                }
                var33[var36] = var37;
                var34[var36] = arg0.method2370((byte) 41);
                var35[var36] = arg0.method2334(-128);
            }
            class450.method2632(var33, (byte) 61, var34, arg2, var35);
        }
        if ((arg1 & 0x4) != 0) {
            int var38 = arg0.method2325(true);
            int var39 = arg0.method2357((byte) 106);
            arg2.method1399(var38, class390.field5481, var39, 70);
            arg2.field3327 = class390.field5481 + 300;
            arg2.field3336 = arg0.method2370((byte) 41);
        }
        if (!arg2.field258) {
            return;
        }
        if (var5 == 127) {
            arg2.method138(arg2.field263, arg2.field290, (byte) -97);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class124.field1684[arg4];
        } else {
            var40 = var5;
        }
        arg2.method133((byte) -17, arg2.field290, var40, arg2.field263);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field729++;
        if (arg9 <= 53) {
            field730 = null;
        }
        if (arg2 < 128 || arg0 < 128 || (class43.field494 * 128 - 256) < arg2 || (class500.field7068 - 2) * 128 < arg0) {
            class153.field2194[0] = class153.field2194[1] = -1;
            return;
        }
        int var10 = class488.method2817(arg2, true, arg0, arg8) - arg5;
        class375.field5329.method824(arg6, 0, 0);
        class385.field5414.method367(class375.field5329);
        class385.field5414.method305(arg2, var10, arg0, class153.field2194);
        class375.field5329.method824(-arg6, 0, 0);
        class385.field5414.method367(class375.field5329);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([I[BB[[BI[II[[B)I")
    public static final int method479(int[] arg0, byte[] arg1, byte arg2, byte[][] arg3, int arg4, int[] arg5, int arg6, byte[][] arg7) {
        field727++;
        int var8 = arg0[arg6];
        int var9 = var8 + arg5[arg6];
        int var10 = arg0[arg4];
        int var11 = arg5[arg4] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg1[arg6] & 0xFF;
        if ((arg1[arg4] & 0xFF) < var14) {
            var14 = arg1[arg4] & 0xFF;
        }
        byte[] var15 = arg3[arg6];
        byte[] var16 = arg7[arg4];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        if (arg2 <= 122) {
            return 32;
        } else {
            return -var14;
        }
    }
}
