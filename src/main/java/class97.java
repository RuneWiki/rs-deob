import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
    public static boolean field2292 = false;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lfc;")
    public static class39 field2293 = class90.method774(" zuerst von Ihrer Freunde)2Liste(Q", -87);

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lfc;")
    public static class39 field2298 = class90.method774("mapback", -90);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lfc;")
    public static class39 field2296 = class90.method774("mapmarker", -118);

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lfc;")
    private static class39 field2304 = class90.method774("Loading textures )2 ", -99);

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lfc;")
    public static class39 field2301 = field2304;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Z")
    public static boolean field2313 = false;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lfc;")
    private static class39 field2294 = class90.method774("Loading wordpack )2 ", -82);

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lfc;")
    public static class39 field2308 = class90.method774("Wen m-Ochten Sie der Liste hinzuf-Ugen?", -83);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lfc;")
    public static class39 field2302 = class90.method774("Classic", -106);

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lfc;")
    private static class39 field2311 = class90.method774("Try again in 60 secs)3)3)3", -106);

    @OriginalMember(owner = "client!o", name = "x", descriptor = "[Lfc;")
    public static class39[] field2315 = new class39[500];

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lfc;")
    public static class39 field2305 = field2311;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lfc;")
    public static class39 field2309 = field2294;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Loc;")
    public static class100 field2295;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Llf;")
    public static class82 field2297;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Lb;")
    public static class8 field2310;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "[I")
    public static int[] field2314;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[Lue;")
    public static class141[] field2307;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 51)
    public static void method813(byte arg0) {
        field2295 = null;
        field2308 = null;
        field2296 = null;
        field2310 = null;
        field2293 = null;
        field2305 = null;
        field2315 = null;
        int var1 = -69 % ((arg0 + 37) / 35);
        field2311 = null;
        field2297 = null;
        field2301 = null;
        field2307 = null;
        field2298 = null;
        field2304 = null;
        field2302 = null;
        field2309 = null;
        field2294 = null;
        field2314 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([I[IIIZ[Lbe;)V", line = 87)
    public static final void method814(int[] arg0, int[] arg1, int arg2, int arg3, boolean arg4, class13[] arg5) {
        field2303++;
        if (arg3 > arg2) {
            int var6 = arg2 - 1;
            int var7 = (arg2 + arg3) / 2;
            class13 var8 = arg5[var7];
            arg5[var7] = arg5[arg2];
            int var9 = arg3 + 1;
            arg5[arg2] = var8;
            while (var9 > var6) {
                boolean var10 = true;
                do {
                    var9--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg1[var11] == 2) {
                            var13 = var8.field334;
                            var12 = arg5[var9].field334;
                        } else if (arg1[var11] == 1) {
                            var12 = arg5[var9].field333;
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = var8.field333;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg1[var11] == 3) {
                            var12 = arg5[var9].field335 ? 1 : 0;
                            var13 = var8.field335 ? 1 : 0;
                        } else {
                            var12 = arg5[var9].field336;
                            var13 = var8.field336;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var12 <= var13) && (arg0[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg1[var15] == 2) {
                            var17 = var8.field334;
                            var16 = arg5[var6].field334;
                        } else if (arg1[var15] == 1) {
                            var16 = arg5[var6].field333;
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                            var17 = var8.field333;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg1[var15] == 3) {
                            var16 = arg5[var6].field335 ? 1 : 0;
                            var17 = var8.field335 ? 1 : 0;
                        } else {
                            var17 = var8.field336;
                            var16 = arg5[var6].field336;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var17 <= var16) && (arg0[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var9) {
                    class13 var18 = arg5[var6];
                    arg5[var6] = arg5[var9];
                    arg5[var9] = var18;
                }
            }
            method814(arg0, arg1, arg2, var9, true, arg5);
            method814(arg0, arg1, var9 + 1, arg3, true, arg5);
        }
        if (!arg4) {
            method814(null, null, -113, -36, true, null);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILac;IIIIILod;)V", line = 283)
    public static final void method815(int arg0, int arg1, int arg2, class4 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class101 arg9) {
        if (arg1 < 126) {
            field2313 = false;
        }
        field2312++;
        int var10 = class7.field219[arg7][arg0 + 1][arg6];
        int var11 = class7.field219[arg7][arg0][arg6];
        int var12 = class7.field219[arg7][arg0][arg6 + 1];
        int var13 = (arg6 << 7) + arg0 + (arg8 << 14) + 1073741824;
        int var14 = class7.field219[arg7][arg0 + 1][arg6 + 1];
        class35 var15 = class90.method776(arg8, -125);
        if (var15.field959 == 0) {
            var13 += Integer.MIN_VALUE;
        }
        int var16 = (arg2 << 6) + arg5;
        if (var15.field917 == 1) {
            var16 += 256;
        }
        int var17 = var10 + var11 + var12 + var14 >> 2;
        if (arg5 == 22) {
            class113 var18;
            if (var15.field915 == -1 && var15.field970 == null) {
                var18 = var15.method405(var12, 22, var11, arg2, var10, -125, var14);
            } else {
                var18 = new class112(arg8, 22, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method62(arg4, arg0, arg6, var17, var18, var13, var16);
            if (var15.field953 == 1) {
                arg9.method868(120, arg0, arg6);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class113 var38;
            if (var15.field915 == -1 && var15.field970 == null) {
                var38 = var15.method405(var12, 10, var11, arg2, var10, -97, var14);
            } else {
                var38 = new class112(arg8, 10, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var15.field930;
                    var39 = var15.field912;
                } else {
                    var39 = var15.field930;
                    var40 = var15.field912;
                }
                int var41 = 0;
                if (arg5 == 11) {
                    var41 += 256;
                }
                arg3.method72(arg4, arg0, arg6, var17, var40, var39, var38, var41, var13, var16);
            }
            if (var15.field953 != 0) {
                arg9.method872(-28, var15.field945, arg6, var15.field912, arg0, var15.field930, arg2);
            }
        } else if (arg5 >= 12) {
            class113 var19;
            if (var15.field915 == -1 && var15.field970 == null) {
                var19 = var15.method405(var12, arg5, var11, arg2, var10, -80, var14);
            } else {
                var19 = new class112(arg8, arg5, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method72(arg4, arg0, arg6, var17, 1, 1, var19, 0, var13, var16);
            if (var15.field953 != 0) {
                arg9.method872(-79, var15.field945, arg6, var15.field912, arg0, var15.field930, arg2);
            }
        } else if (arg5 == 0) {
            class113 var20;
            if (var15.field915 == -1 && var15.field970 == null) {
                var20 = var15.method405(var12, 0, var11, arg2, var10, -85, var14);
            } else {
                var20 = new class112(arg8, 0, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method68(arg4, arg0, arg6, var17, var20, null, class54.field1347[arg2], 0, var13, var16);
            if (var15.field953 != 0) {
                arg9.method869(arg6, arg0, (byte) -98, arg5, var15.field945, arg2);
            }
        } else if (arg5 == 1) {
            class113 var21;
            if (var15.field915 == -1 && var15.field970 == null) {
                var21 = var15.method405(var12, 1, var11, arg2, var10, -84, var14);
            } else {
                var21 = new class112(arg8, 1, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method68(arg4, arg0, arg6, var17, var21, null, class1.field12[arg2], 0, var13, var16);
            if (var15.field953 != 0) {
                arg9.method869(arg6, arg0, (byte) -97, arg5, var15.field945, arg2);
            }
        } else if (arg5 == 2) {
            int var22 = arg2 + 1 & 0x3;
            class113 var23;
            class113 var24;
            if (var15.field915 == -1 && var15.field970 == null) {
                var23 = var15.method405(var12, 2, var11, arg2 + 4, var10, -114, var14);
                var24 = var15.method405(var12, 2, var11, var22, var10, -75, var14);
            } else {
                var23 = new class112(arg8, 2, arg2 + 4, var11, var10, var14, var12, var15.field915, true, null);
                var24 = new class112(arg8, 2, var22, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method68(arg4, arg0, arg6, var17, var23, var24, class54.field1347[arg2], class54.field1347[var22], var13, var16);
            if (var15.field953 != 0) {
                arg9.method869(arg6, arg0, (byte) -83, arg5, var15.field945, arg2);
            }
        } else if (arg5 == 3) {
            class113 var25;
            if (var15.field915 == -1 && var15.field970 == null) {
                var25 = var15.method405(var12, 3, var11, arg2, var10, -105, var14);
            } else {
                var25 = new class112(arg8, 3, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method68(arg4, arg0, arg6, var17, var25, null, class1.field12[arg2], 0, var13, var16);
            if (var15.field953 != 0) {
                arg9.method869(arg6, arg0, (byte) 112, arg5, var15.field945, arg2);
            }
        } else if (arg5 == 9) {
            class113 var26;
            if (var15.field915 == -1 && var15.field970 == null) {
                var26 = var15.method405(var12, arg5, var11, arg2, var10, -113, var14);
            } else {
                var26 = new class112(arg8, arg5, arg2, var11, var10, var14, var12, var15.field915, true, null);
            }
            arg3.method72(arg4, arg0, arg6, var17, 1, 1, var26, 0, var13, var16);
            if (var15.field953 != 0) {
                arg9.method872(-52, var15.field945, arg6, var15.field912, arg0, var15.field930, arg2);
            }
        } else {
            if (var15.field924) {
                if (arg2 == 1) {
                    int var27 = var12;
                    var12 = var14;
                    var14 = var10;
                    var10 = var11;
                    var11 = var27;
                } else if (arg2 == 2) {
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                    int var30 = var14;
                    var14 = var11;
                    var11 = var30;
                } else if (arg2 == 3) {
                    int var28 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var14;
                    var14 = var28;
                }
            }
            if (arg5 == 4) {
                class113 var31;
                if (var15.field915 == -1 && var15.field970 == null) {
                    var31 = var15.method405(var12, 4, var11, 0, var10, -67, var14);
                } else {
                    var31 = new class112(arg8, 4, 0, var11, var10, var14, var12, var15.field915, true, null);
                }
                arg3.method37(arg4, arg0, arg6, var17, var31, class54.field1347[arg2], arg2 * 512, 0, 0, var13, var16);
            } else if (arg5 == 5) {
                int var32 = 16;
                int var33 = arg3.method48(arg4, arg0, arg6);
                if (var33 != 0) {
                    var32 = class90.method776(var33 >> 14 & 0x7FFF, -126).field955;
                }
                class113 var34;
                if (var15.field915 == -1 && var15.field970 == null) {
                    var34 = var15.method405(var12, 4, var11, 0, var10, -91, var14);
                } else {
                    var34 = new class112(arg8, 4, 0, var11, var10, var14, var12, var15.field915, true, null);
                }
                arg3.method37(arg4, arg0, arg6, var17, var34, class54.field1347[arg2], arg2 * 512, class71.field1657[arg2] * var32, class112.field2941[arg2] * var32, var13, var16);
            } else if (arg5 == 6) {
                class113 var35;
                if (var15.field915 == -1 && var15.field970 == null) {
                    var35 = var15.method405(var12, 4, var11, 0, var10, -112, var14);
                } else {
                    var35 = new class112(arg8, 4, 0, var11, var10, var14, var12, var15.field915, true, null);
                }
                arg3.method37(arg4, arg0, arg6, var17, var35, 256, arg2, 0, 0, var13, var16);
            } else if (arg5 == 7) {
                class113 var36;
                if (var15.field915 == -1 && var15.field970 == null) {
                    var36 = var15.method405(var12, 4, var11, 0, var10, -117, var14);
                } else {
                    var36 = new class112(arg8, 4, 0, var11, var10, var14, var12, var15.field915, true, null);
                }
                arg3.method37(arg4, arg0, arg6, var17, var36, 512, arg2, 0, 0, var13, var16);
            } else if (arg5 == 8) {
                class113 var37;
                if (var15.field915 == -1 && var15.field970 == null) {
                    var37 = var15.method405(var12, 4, var11, 0, var10, -90, var14);
                } else {
                    var37 = new class112(arg8, 4, 0, var11, var10, var14, var12, var15.field915, true, null);
                }
                arg3.method37(arg4, arg0, arg6, var17, var37, 768, arg2, 0, 0, var13, var16);
            }
        }
    }
}
