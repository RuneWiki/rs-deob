import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class88 extends class213 {

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Z")
    public volatile boolean field1109 = true;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "[Lml;")
    public static class197[] field1106 = new class197[4];

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1108 = "purple:";

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "[I")
    public static int[] field1116 = new int[8];

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
    public boolean field1105;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Z")
    public boolean field1111;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 6)
    public static void method637(boolean arg0) {
        field1116 = null;
        if (arg0) {
            method643(true, true);
        }
        field1106 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lch;[BIIIIIIZI)[I", line = 37)
    private static final int[] method639(int arg0, class8[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        int var11 = (arg10 & 0x7) * 8;
        int var12 = (arg4 & 0x7) * 8;
        if (!arg9) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class105.method745(var14 & 0x7, arg6, var13 & 0x7, 1) + arg3;
                    int var16 = arg5 + class54.method417(arg6, 7, var13 & 0x7, var14 & 0x7);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg1[arg8].field89[var15][var16] = class335.method2339(arg1[arg8].field89[var15][var16], -2097153);
                    }
                }
            }
        }
        if (arg7 < 3) {
            field1106 = (class197[]) null;
        }
        class299 var17 = new class299(arg2);
        field1107++;
        byte var18;
        if (arg9) {
            var18 = 1;
        } else {
            var18 = 4;
        }
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        int var21 = (arg10 & 0xFFFFFFF8) << 3;
        byte var22 = 0;
        if (arg6 == 1) {
            var22 = 1;
        } else if (arg6 == 2) {
            var20 = 1;
            var22 = 1;
        } else if (arg6 == 3) {
            var20 = 1;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg0 != var23 || var24 < var12 || (var12 + 8) < var24 || var25 < var11 || var25 > var11 + 8) {
                        class134.method1018(var17, false, false, arg9, 0, 0, 0, -1, 0, 0, 0, -1);
                    } else if ((var12 + 8) == var24 || var11 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg6 == 0) {
                            var32 = var24 - (var12 - arg3);
                            var33 = var25 + arg5 - var11;
                        } else if (arg6 == 1) {
                            var33 = arg5 + var12 + 8 - var24;
                            var32 = arg3 - (var11 - var25);
                        } else if (arg6 == 2) {
                            var32 = arg3 + 8 - (var24 - var12);
                            var33 = arg5 - (var25 - var11 - 8);
                        } else {
                            var32 = arg3 + var11 + 8 - var25;
                            var33 = arg5 - (var12 - var24);
                        }
                        class134.method1018(var17, false, true, arg9, arg8, var19 + var24, var21 + var25, var33, 0, 0, 0, var32);
                    } else {
                        int var26 = class105.method745(var25 & 0x7, arg6, var24 & 0x7, 1) + arg3;
                        int var27 = class54.method417(arg6, 7, var24 & 0x7, var25 & 0x7) + arg5;
                        class134.method1018(var17, false, false, arg9, arg8, var19 + var24, var21 + var25, var27, arg6, var22, var20, var26);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg6 == 0) {
                                var30 = arg5 + var29 - var11;
                                var31 = arg3 - (var12 - var28);
                            } else if (arg6 == 1) {
                                var31 = var29 + arg3 - var11;
                                var30 = arg5 + var12 - (var28 - 8);
                            } else if (arg6 == 2) {
                                var31 = arg3 - (-(var12 - var28) - 8);
                                var30 = arg5 + var11 + 8 - var29;
                            } else {
                                var30 = var28 + arg5 - var12;
                                var31 = arg3 + var11 + 8 - var29;
                            }
                            if (var31 >= 0 && var31 < 104 && var30 >= 0 && var30 < 104) {
                                class74.field978[arg8][var31][var30] = class74.field978[arg8][var20 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var17.field4350.length > var17.field4351) {
            int var36 = var17.method2096((byte) -122);
            if (var36 == 128) {
                var34 = true;
                class83.field1070[0] = var17.method2083((byte) -49);
                class83.field1070[1] = var17.method2043(true);
                class83.field1070[2] = var17.method2043(true);
                class83.field1070[3] = var17.method2043(true);
                class83.field1070[4] = var17.method2083((byte) -16);
            } else {
                if (var36 != 129) {
                    var17.field4351--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var17.method2104(112);
                    if (var38 == 0) {
                        if (var37 <= arg0) {
                            int var39 = arg3 + 7;
                            int var40 = arg3;
                            if (arg3 < 0) {
                                var40 = 0;
                            } else if (arg3 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg5;
                            if (arg5 < 0) {
                                var41 = 0;
                            } else if (arg5 >= 104) {
                                var41 = 104;
                            }
                            int var42 = arg5 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            while (var39 > var40) {
                                while (var41 < var42) {
                                    class9.field100[arg8][var40][var41] = 0;
                                    var41++;
                                }
                                var40++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var17.method2104(103);
                                if (var37 <= arg0) {
                                    for (int var46 = var43; var46 < (var43 + 4); var46++) {
                                        for (int var47 = var44; var47 < (var44 + 4); var47++) {
                                            if (var46 >= var12 && var12 + 8 > var46 && var11 <= var47 && var11 < var11 + 8) {
                                                int var48 = arg3 + class105.method745(var47 & 0x7, arg6, var46 & 0x7, 1);
                                                int var49 = class54.method417(arg6, 7, var46 & 0x7, var47 & 0x7) + arg5;
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class9.field100[arg8][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class47.field623 && !arg9) {
            class80 var50 = null;
            while (true) {
                while (var17.field4350.length > var17.field4351) {
                    int var51 = var17.method2096((byte) -122);
                    if (var51 == 0) {
                        var50 = new class80(var17);
                    } else if (var51 == 1) {
                        int var52 = var17.method2096((byte) -122);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class339 var54 = new class339(var17);
                                if (var54.field5285 == 31) {
                                    class355 var55 = class335.method2340(var17.method2083((byte) -84), (byte) -107);
                                    var54.method2356(var55.field5561, 1056, var55.field5557, var55.field5559, var55.field5558);
                                }
                                int var56 = var54.field5309 >> 7;
                                int var57 = var54.field5282 >> 7;
                                if (var54.field5293 == arg0 && var56 >= var12 && (var12 + 8) > var56 && var11 <= var57 && (var11 + 8) > var57) {
                                    int var58 = (arg3 << 7) + class304.method2130(var54.field5309 & 0x3FF, arg6, var54.field5282 & 0x3FF, (byte) 24);
                                    int var59 = (arg5 << 7) + class282.method1921(var54.field5282 & 0x3FF, 3, var54.field5309 & 0x3FF, arg6);
                                    var54.field5309 = var58;
                                    var54.field5282 = var59;
                                    int var60 = var54.field5282 >> 7;
                                    int var61 = var54.field5309 >> 7;
                                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                        var54.field5295 = (class9.field101[1][var61][var60] & 0x2) != 0;
                                        var54.field5284 = class74.field978[var54.field5293][var61][var60] - var54.field5284;
                                        class22.method138(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class80();
                        }
                        var50.method566(var17, -27409);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class80();
                }
                class25.field295[arg3 >> 3][arg5 >> 3] = var50;
                break;
            }
        }
        if (!var35) {
            int var62 = arg5 + 7;
            int var63 = arg3 + 7;
            for (int var64 = arg3; var64 < var63; var64++) {
                for (int var65 = arg5; var65 < var62; var65++) {
                    class9.field100[arg8][var64][var65] = 0;
                }
            }
        }
        return var34 ? class83.field1070 : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)I", line = 498)
    public static final int method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        field1113++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 7 + 1 - arg1 - arg3;
        } else {
            if (arg0 != -10524) {
                field1106 = (class197[]) null;
            }
            return var8 == 2 ? 1 + 7 - arg5 - arg2 : arg1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V", line = 532)
    public static final void method641(String arg0, int arg1, boolean arg2, String arg3) {
        class65.method474(arg0, -1, (String) null, arg1, arg3, 0);
        field1110++;
        if (arg2) {
            field1116 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)[Lfe;", line = 548)
    public static final class153[] method642(int arg0) {
        class153[] var1 = new class153[class171.field2369];
        if (arg0 <= 63) {
            return (class153[]) null;
        }
        for (int var2 = 0; var2 < class171.field2369; var2++) {
            var1[var2] = new class153(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], class338.field5276[var2], class292.field4253);
        }
        field1114++;
        class236.method1685(false);
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZ)V", line = 571)
    public static final void method643(boolean arg0, boolean arg1) {
        field1112++;
        if (arg1) {
            return;
        }
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (class47.field623 && arg0) {
            var3 = 1;
            var4 = class305.field4461;
        } else {
            var3 = 4;
            var4 = class101.field1316;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class323.method2235(false);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class305.field4460[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x6) >> 1;
                            int var12 = (var9 & 0xFFDEF6) >> 14;
                            int var13 = (var9 & 0x3FFF) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class305.field4457.length; var15++) {
                                if (class305.field4457[var15] == var14 && var4[var15] != null) {
                                    var8 = true;
                                    int[] var16 = method639(var10, class231.field3312, var4[var15], var6 * 8, var12, var7 * 8, var11, 24, var5, arg0, var13);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class137.method1034(var6 * 8, var5, 8, var7 * 8, 8, -1);
                    }
                }
            }
        }
        if (var2 == null) {
            class238.field3437 = -1;
            return;
        }
        class104.field1358 = var2[3];
        class238.field3437 = var2[0];
        class138.field1907 = var2[2];
        class72.field966 = var2[4];
        class199.field2799 = var2[1];
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)[B")
    public abstract byte[] method636(byte arg0);

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
    public abstract int method638(int arg0);
}
