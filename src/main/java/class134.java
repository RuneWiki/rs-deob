import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class134 extends class58 {

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "Lcd;")
    private static class64 field2373 = class44.method335((byte) 71, "Members object");

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Lcd;")
    public static class64 field2378 = class44.method335((byte) 71, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "[I")
    public static int[] field2379 = new int[100];

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "Lcd;")
    public static class64 field2381 = field2373;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "Lih;")
    public class30 field2387;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "Lclient;")
    public static client field2370;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "[B")
    public byte[] field2375;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "[[B")
    public static byte[][] field2384;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "[[[B")
    public static byte[][][] field2377;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V", line = 10)
    public static final void method953(int arg0, int arg1) {
        field2372++;
        if (arg1 == -1 || !class60.field1076[arg1]) {
            return;
        }
        class42.field686.method1597(arg0 ^ arg0, arg1);
        if (class272.field4675[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class272.field4675[arg1].length; var3++) {
            if (class272.field4675[arg1][var3] != null) {
                if (class272.field4675[arg1][var3].field1091 == 2) {
                    var2 = false;
                } else {
                    class272.field4675[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class272.field4675[arg1] = null;
        }
        class60.field1076[arg1] = false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)I", line = 58)
    public final int method442(boolean arg0) {
        if (arg0) {
            this.field2387 = (class30) null;
        }
        field2382++;
        return this.field961 ? 0 : 100;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)[B", line = 73)
    public final byte[] method451(int arg0) {
        if (arg0 != 28985) {
            field2378 = (class64) null;
        }
        field2386++;
        if (this.field961) {
            throw new RuntimeException();
        }
        return this.field2375;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZIIILam;IILia;IIIII)Lam;", line = 93)
    public static final class243 method954(int arg0, boolean arg1, int arg2, int arg3, int arg4, class243 arg5, int arg6, int arg7, class199 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg10 << 48) + ((long) (arg7 - (-(arg13 << 16) - (arg11 << 24))) + ((long) arg12 << 32));
        field2368++;
        class243 var16 = (class243) class112.field2072.method1194(var14, (byte) -51);
        if (var16 == null) {
            byte var17;
            if (arg7 == 1) {
                var17 = 9;
            } else if (arg7 == 2) {
                var17 = 12;
            } else if (arg7 == 3) {
                var17 = 15;
            } else if (arg7 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class150 var20 = new class150(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int var21 = var20.method1080(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class50.field820[var27] * var24 + arg2 >> 16;
                    int var29 = class50.field826[var27] * var25 + arg3 >> 16;
                    var22[var23][var26] = var20.method1080(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg11 * var31 + arg13 * var32 >> 8);
                short var34 = (short) (((arg10 & 0xFC00) * var31 + (arg12 & 0xFC00) * var32 & 0xFC0000) + ((arg10 & 0x7F) * var31 + (arg12 & 0x7F) * var32 & 0x7F00) + ((arg10 & 0x380) * var31 + (arg12 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1070(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1070(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1070(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1076(64, 768, -50, -10, -50);
            class112.field2072.method1190(arg4 ^ 0x47C9, var16, var14);
        }
        int var36 = arg7 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = -var36;
        if (arg1) {
            if (arg0 > 640 && arg0 < 1408) {
                var39 = var36 + 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var37 -= 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var40 -= 128;
            }
            if (arg0 > 1152 && arg0 < 1920) {
                var38 = var36 + 128;
            }
        }
        if (arg4 != 30388) {
            field2385 = 117;
        }
        int var41 = arg5.method39();
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg5.method19();
        if (var42 > var38) {
            var42 = var38;
        }
        int var43 = arg5.method55();
        if (var43 < var40) {
            var43 = var40;
        }
        int var44 = arg5.method30();
        if (var39 < var44) {
            var44 = var39;
        }
        class78 var45 = null;
        if (arg8 != null) {
            int var46 = arg8.field3393[arg9];
            var45 = class80.method628(var46 >> 16, 0);
            arg9 = var46 & 0xFFFF;
        }
        class243 var47;
        if (var45 == null) {
            var47 = var16.method24(true, true);
            var47.method23((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method29((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method24(!var45.method614(-1, arg9), true);
            var47.method23((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method29((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method51(var45, arg9);
        }
        if (arg0 != 0) {
            var47.method27(arg0);
        }
        if (class123.field2216) {
            class217 var48 = (class217) var47;
            if (arg6 != class15.method169(arg2 + var43, arg4 ^ 0x457D, class20.field364, arg3 + var41) || class15.method169(arg2 + var44, 13257, class20.field364, arg3 + var42) != arg6) {
                for (int var49 = 0; var49 < var48.field3634; var49++) {
                    var48.field3656[var49] += class15.method169(var48.field3669[var49] + arg2, 13257, class20.field364, var48.field3664[var49] + arg3) - arg6;
                }
                var48.field3639.field613 = false;
                var48.field3648.field793 = false;
            }
        } else {
            class5 var50 = (class5) var47;
            if (arg6 != class15.method169(arg2 + var43, 13257, class20.field364, arg3 + var41) || class15.method169(arg2 + var44, arg4 ^ 0x457D, class20.field364, arg3 + var42) != arg6) {
                for (int var51 = 0; var51 < var50.field73; var51++) {
                    var50.field54[var51] += class15.method169(var50.field45[var51] + arg2, 13257, class20.field364, var50.field53[var51] + arg3) - arg6;
                }
                var50.field70 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V", line = 323)
    public static void method955(int arg0) {
        field2370 = null;
        field2379 = null;
        field2377 = (byte[][][]) null;
        field2378 = null;
        int var1 = 33 / ((-arg0 - 56) / 50);
        field2384 = (byte[][]) null;
        field2373 = null;
        field2381 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLkh;)Lmd;", line = 359)
    public static final class240 method956(byte arg0, class13 arg1) {
        arg1.method152((byte) -70);
        int var2 = arg1.method152((byte) -97);
        if (arg0 > -18) {
            field2385 = 123;
        }
        field2374++;
        class240 var3 = class64.method542(var2, (byte) 119);
        var3.field4117 = arg1.method152((byte) -84);
        int var4 = arg1.method152((byte) -118);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method152((byte) -128);
            var3.method16(2, var6, arg1);
        }
        var3.method288(17772);
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V", line = 403)
    public static final void method957(int arg0) {
        if (arg0 > -22) {
            field2378 = (class64) null;
        }
        class244.field4233 = new class106();
        field2376++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIZII)V", line = 416)
    public static final void method958(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2369++;
        int var6 = arg1;
        int var7 = arg0 * arg0;
        int var8 = arg1 * arg1;
        int var9 = var8 << 1;
        int var10 = 0;
        int var11 = var7 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var7 + var9;
        int var14 = var7 << 2;
        int var15 = var8 << 2;
        int var16 = var8 - ((var12 - 1) * var11);
        int var17 = ((var10 << 1) + 3) * var9;
        int var18 = (arg1 - 1) * var14;
        if (arg3) {
            method960(-109, 68, 97, 112, -33, -54, 73, (byte) -65);
        }
        int var19 = (var10 + 1) * var15;
        if (class180.field3098 <= arg5 && class201.field3444 >= arg5) {
            int var20 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg0 + arg4);
            int var21 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg4 - arg0);
            class31.method268(var20, 121, var21, class124.field2241[arg5], arg2);
        }
        int var22 = ((arg1 << 1) - 3) * var11;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var16 += var19;
                    var10++;
                    var13 += var17;
                    var19 += var15;
                    var17 += var15;
                }
            }
            var6--;
            int var23 = arg5 + var6;
            if (var16 < 0) {
                var16 += var19;
                var10++;
                var19 += var15;
                var13 += var17;
                var17 += var15;
            }
            int var24 = arg5 - var6;
            var16 += -var22;
            var22 -= var14;
            var13 += -var18;
            if (var23 >= class180.field3098 && var24 <= class201.field3444) {
                int var25 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg4 + var10);
                int var26 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg4 - var10);
                if (var24 >= class180.field3098) {
                    class31.method268(var25, 126, var26, class124.field2241[var24], arg2);
                }
                if (class201.field3444 >= var23) {
                    class31.method268(var25, 122, var26, class124.field2241[var23], arg2);
                }
            }
            var18 -= var14;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILkh;)V", line = 522)
    public static final void method959(int arg0, class13 arg1) {
        field2389++;
        if ((arg1.field254.length - arg1.field281) < 1) {
            return;
        }
        int var2 = arg1.method152((byte) -88);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field254.length - arg1.field281) < var3) {
            return;
        }
        class201.field3441 = arg1.method152((byte) -110);
        if (class201.field3441 < 1) {
            class201.field3441 = 1;
        } else if (class201.field3441 > 4) {
            class201.field3441 = 4;
        }
        class11.method96(108, arg1.method152((byte) -117) == 1);
        class69.field1324 = arg1.method152((byte) -89) == 1;
        class222.field3762 = arg1.method152((byte) -80) == 1;
        class83.field1522 = arg1.method152((byte) -126) == 1;
        class117.field2136 = arg1.method152((byte) -90) == 1;
        class220.field3729 = arg1.method152((byte) -69) == 1;
        class109.field2015 = arg1.method152((byte) -97) == 1;
        class263.field4510 = arg1.method152((byte) -114) == 1;
        if (arg0 != 128) {
            return;
        }
        class244.field4251 = arg1.method152((byte) -91);
        if (class244.field4251 > 2) {
            class244.field4251 = 2;
        }
        if (var2 < 2) {
            class274.field4701 = arg1.method152((byte) -83) == 1;
            arg1.method152((byte) -98);
        } else {
            class274.field4701 = arg1.method152((byte) -115) == 1;
        }
        class250.field4342 = arg1.method152((byte) -81) == 1;
        class175.field3000 = arg1.method152((byte) -76) == 1;
        class155.field2741 = arg1.method152((byte) -78);
        if (class155.field2741 > 2) {
            class155.field2741 = 2;
        }
        class275.field4718 = arg1.method152((byte) -126) == 1;
        class58.field959 = arg1.method152((byte) -87);
        if (class58.field959 > 127) {
            class58.field959 = 127;
        }
        class163.field2865 = arg1.method152((byte) -80);
        class106.field1960 = arg1.method152((byte) -84);
        if (class106.field1960 > 127) {
            class106.field1960 = 127;
        }
        if (var2 >= 1) {
            class268.field4616 = arg1.method112((byte) 92);
            class289.field4937 = arg1.method112((byte) 92);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method152((byte) -109);
        }
        if (var2 >= 4) {
            arg1.method152((byte) -82);
        }
        if (var2 >= 5) {
            class195.field3310 = arg1.method105((byte) 127);
        }
        if (var2 >= 6) {
            class304.field5200 = arg1.method152((byte) -112);
        }
        if (var2 >= 7) {
            class3.field31 = arg1.method152((byte) -105) == 1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIB)V", line = 651)
    public static final void method960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2388++;
        int var8 = arg0 + arg4;
        int var9 = arg1 + arg4;
        for (int var10 = arg0; var10 < var8; var10++) {
            class31.method268(arg2, 121, arg1, class124.field2241[var10], arg5);
        }
        int var11 = arg3 - arg4;
        for (int var12 = arg3; var12 > var11; var12--) {
            class31.method268(arg2, arg7 + 199, arg1, class124.field2241[var12], arg5);
        }
        if (arg7 != -80) {
            field2380 = 82;
        }
        int var13 = arg2 - arg4;
        for (int var14 = var8; var14 <= var11; var14++) {
            int[] var15 = class124.field2241[var14];
            class31.method268(var9, 120, arg1, var15, arg5);
            class31.method268(var13, arg7 ^ 0xFFFFFFC8, var9, var15, arg6);
            class31.method268(arg2, 127, var13, var15, arg5);
        }
    }
}
