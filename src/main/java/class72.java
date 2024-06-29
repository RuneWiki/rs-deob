import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class72 extends class88 {

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Z")
    public static boolean field1256 = false;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Li;")
    public static class74 field1259;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method508(byte arg0) {
        field1255++;
        if (arg0 >= -80) {
            field1256 = false;
        }
        for (int var1 = 0; var1 < class303.field4932; var1++) {
            int var2 = class186.field2972[var1];
            class307 var3 = class57.field1002[var2];
            if (var3 != null) {
                class26.method166((byte) 95, var3.field4960.field915, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method509(int arg0) {
        if (arg0 >= -32) {
            field1257 = -9;
        }
        field1259 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZIIZLlb;IIII)V")
    public static final void method510(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, class311 arg6, int arg7, int arg8, int arg9, int arg10) {
        field1260++;
        if (arg5 && !class136.method1011(false) && (class67.field1132[0][arg4][arg0] & 0x2) == 0) {
            if ((class67.field1132[arg3][arg4][arg0] & 0x10) != 0) {
                return;
            }
            if (class187.method1354(arg0, arg3, arg4, (byte) -123) != class73.field1286) {
                return;
            }
        }
        if (arg3 < class113.field1933) {
            class113.field1933 = arg3;
        }
        class1 var11 = class110.method827(arg8, (byte) -28);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var12 = var11.field57;
            var13 = var11.field10;
        } else {
            var12 = var11.field10;
            var13 = var11.field57;
        }
        int var14;
        int var15;
        if (arg4 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg4;
            var15 = (var13 >> 1) + arg4;
        } else {
            var15 = arg4;
            var14 = arg4 + 1;
        }
        int[][] var16 = class245.field4123[arg9];
        int var17;
        int var18;
        if (arg0 + var12 <= 104) {
            var17 = (var12 >> 1) + arg0;
            var18 = (var12 + 1 >> 1) + arg0;
        } else {
            var18 = arg0 + 1;
            var17 = arg0;
        }
        int var19 = (arg4 << 7) + (var13 << 6);
        int var20 = (arg0 << 7) + (var12 << 6);
        int var21 = var16[var15][var18] + var16[var14][var18] + var16[var14][var17] + var16[var15][var17] >> 2;
        int[][] var22 = null;
        if (arg2) {
            var22 = class207.field3401[0];
        } else if (arg9 < 3) {
            var22 = class245.field4123[arg9 + 1];
        }
        long var23 = (long) (arg0 | 0x800000 << 7 | arg4 | arg10 << 14 | arg7 << 20);
        if (var11.field2 == 0 || arg2) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field89 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field31) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg8 << 32;
        if (var11.method16((byte) -120)) {
            class169.method1264(arg3, (class307) null, 0, arg0, arg4, var11, (class123) null, 128, arg7);
        }
        boolean var27 = !arg2 & var11.field59;
        if (arg10 == 22) {
            if (class162.field2636 || var11.field2 != 0 || var11.field36 == 1 || var11.field61) {
                class312 var29;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var28 = var11.method11(var16, 22, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                    var29 = var28.field3720;
                } else {
                    var29 = new class271(arg8, 22, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class273.method1926(arg3, arg4, arg0, var21, var29, var25, var11.field16);
                if (var11.field36 == 1 && arg6 != null) {
                    arg6.method2093(arg4, 128, arg0);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class312 var69;
            if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                class221 var68 = var11.method11(var16, 10, (byte) -53, var21, var22, arg10 == 11 ? arg7 + 4 : arg7, var19, var20, (class230) null, var27, arg5);
                var69 = var68.field3720;
            } else {
                var69 = new class271(arg8, 10, arg10 == 11 ? arg7 + 4 : arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
            }
            if (var69 != null) {
                boolean var70 = class24.method154(arg3, arg4, arg0, var21, var13, var12, var69, 0, var25);
                if (var11.field46 && var70 && arg5) {
                    int var71 = 15;
                    if (var69 instanceof class242) {
                        var71 = ((class242) var69).method854() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class4.field115[arg3][arg4 + var72][arg0 + var73]) {
                                class4.field115[arg3][arg4 + var72][arg0 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field36 != 0 && arg6 != null) {
                arg6.method2102(var13, 1, var11.field17, arg0, var12, arg4, !var11.field35);
            }
        } else if (arg10 >= 12) {
            class312 var31;
            if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                class221 var30 = var11.method11(var16, arg10, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                var31 = var30.field3720;
            } else {
                var31 = new class271(arg8, arg10, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
            }
            class24.method154(arg3, arg4, arg0, var21, 1, 1, var31, 0, var25);
            if (arg5 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg3 > 0 && var11.field87 != 0) {
                class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 4);
            }
            if (var11.field36 != 0 && arg6 != null) {
                arg6.method2102(var13, 1, var11.field17, arg0, var12, arg4, !var11.field35);
            }
        } else if (arg10 == 0) {
            class312 var33;
            if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                class221 var32 = var11.method11(var16, 0, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                var33 = var32.field3720;
            } else {
                var33 = new class271(arg8, 0, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
            }
            class173.method1280(arg3, arg4, arg0, var21, var33, (class312) null, class123.field2087[arg7], 0, var25);
            if (arg5) {
                if (arg7 == 0) {
                    if (var11.field46) {
                        class4.field115[arg3][arg4][arg0] = 50;
                        class4.field115[arg3][arg4][arg0 + 1] = 50;
                    }
                    if (var11.field87 == 1) {
                        class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field46) {
                        class4.field115[arg3][arg4][arg0 + 1] = 50;
                        class4.field115[arg3][arg4 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field87 == 1) {
                        class271.field4516[arg3][arg4][arg0 + 1] = class312.method2107(class271.field4516[arg3][arg4][arg0 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field46) {
                        class4.field115[arg3][arg4 + 1][arg0] = 50;
                        class4.field115[arg3][arg4 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field87 == 1) {
                        class271.field4516[arg3][arg4 + 1][arg0] = class312.method2107(class271.field4516[arg3][arg4 + 1][arg0], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field46) {
                        class4.field115[arg3][arg4][arg0] = 50;
                        class4.field115[arg3][arg4 + 1][arg0] = 50;
                    }
                    if (var11.field87 == 1) {
                        class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 2);
                    }
                }
            }
            if (var11.field36 != 0 && arg6 != null) {
                arg6.method2095(arg7, !var11.field35, arg10, arg0, var11.field17, arg4, (byte) -62);
            }
            if (var11.field9 != 16) {
                class213.method1515(arg3, arg4, arg0, var11.field9);
            }
        } else if (arg10 == 1) {
            class312 var35;
            if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                class221 var34 = var11.method11(var16, 1, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                var35 = var34.field3720;
            } else {
                var35 = new class271(arg8, 1, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
            }
            class173.method1280(arg3, arg4, arg0, var21, var35, (class312) null, class239.field4020[arg7], 0, var25);
            if (var11.field46 && arg5) {
                if (arg7 == 0) {
                    class4.field115[arg3][arg4][arg0 + 1] = 50;
                } else if (arg7 == 1) {
                    class4.field115[arg3][arg4 + 1][arg0 + 1] = 50;
                } else if (arg7 == 2) {
                    class4.field115[arg3][arg4 + 1][arg0] = 50;
                } else if (arg7 == 3) {
                    class4.field115[arg3][arg4][arg0] = 50;
                }
            }
            if (var11.field36 != 0 && arg6 != null) {
                arg6.method2095(arg7, !var11.field35, arg10, arg0, var11.field17, arg4, (byte) -62);
            }
        } else if (arg10 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class312 var38;
            class312 var40;
            if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                class221 var37 = var11.method11(var16, 2, (byte) -53, var21, var22, arg7 + 4, var19, var20, (class230) null, var27, arg5);
                var38 = var37.field3720;
                class221 var39 = var11.method11(var16, 2, (byte) -53, var21, var22, var36, var19, var20, (class230) null, var27, arg5);
                var40 = var39.field3720;
            } else {
                var38 = new class271(arg8, 2, arg7 + 4, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                var40 = new class271(arg8, 2, var36, arg9, arg4, arg0, -1, var11.field78, (class312) null);
            }
            class173.method1280(arg3, arg4, arg0, var21, var38, var40, class123.field2087[arg7], class123.field2087[var36], var25);
            if (var11.field87 == 1 && arg5) {
                if (arg7 == 0) {
                    class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 1);
                    class271.field4516[arg3][arg4][arg0 + 1] = class312.method2107(class271.field4516[arg3][arg4][arg0 + 1], 2);
                } else if (arg7 == 1) {
                    class271.field4516[arg3][arg4][arg0 + 1] = class312.method2107(class271.field4516[arg3][arg4][arg0 + 1], 2);
                    class271.field4516[arg3][arg4 + 1][arg0] = class312.method2107(class271.field4516[arg3][arg4 + 1][arg0], 1);
                } else if (arg7 == 2) {
                    class271.field4516[arg3][arg4 + 1][arg0] = class312.method2107(class271.field4516[arg3][arg4 + 1][arg0], 1);
                    class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 2);
                } else if (arg7 == 3) {
                    class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 2);
                    class271.field4516[arg3][arg4][arg0] = class312.method2107(class271.field4516[arg3][arg4][arg0], 1);
                }
            }
            if (var11.field36 != 0 && arg6 != null) {
                arg6.method2095(arg7, !var11.field35, arg10, arg0, var11.field17, arg4, (byte) -62);
            }
            if (var11.field9 != 16) {
                class213.method1515(arg3, arg4, arg0, var11.field9);
            }
        } else if (arg1 < -37) {
            if (arg10 == 3) {
                class312 var42;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var41 = var11.method11(var16, 3, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                    var42 = var41.field3720;
                } else {
                    var42 = new class271(arg8, 3, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class173.method1280(arg3, arg4, arg0, var21, var42, (class312) null, class239.field4020[arg7], 0, var25);
                if (var11.field46 && arg5) {
                    if (arg7 == 0) {
                        class4.field115[arg3][arg4][arg0 + 1] = 50;
                    } else if (arg7 == 1) {
                        class4.field115[arg3][arg4 + 1][arg0 + 1] = 50;
                    } else if (arg7 == 2) {
                        class4.field115[arg3][arg4 + 1][arg0] = 50;
                    } else if (arg7 == 3) {
                        class4.field115[arg3][arg4][arg0] = 50;
                    }
                }
                if (var11.field36 != 0 && arg6 != null) {
                    arg6.method2095(arg7, !var11.field35, arg10, arg0, var11.field17, arg4, (byte) -62);
                }
            } else if (arg10 == 9) {
                class312 var44;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var43 = var11.method11(var16, arg10, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                    var44 = var43.field3720;
                } else {
                    var44 = new class271(arg8, arg10, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class24.method154(arg3, arg4, arg0, var21, 1, 1, var44, 0, var25);
                if (var11.field36 != 0 && arg6 != null) {
                    arg6.method2102(var13, 1, var11.field17, arg0, var12, arg4, !var11.field35);
                }
                if (var11.field9 != 16) {
                    class213.method1515(arg3, arg4, arg0, var11.field9);
                }
            } else if (arg10 == 4) {
                class312 var46;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var45 = var11.method11(var16, 4, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                    var46 = var45.field3720;
                } else {
                    var46 = new class271(arg8, 4, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class30.method191(arg3, arg4, arg0, var21, var46, (class312) null, class123.field2087[arg7], 0, 0, 0, var25);
            } else if (arg10 == 5) {
                long var47 = class185.method1342(arg3, arg4, arg0);
                int var49 = 16;
                if (var47 != 0L) {
                    var49 = class110.method827(Integer.MAX_VALUE & (int) (var47 >>> 32), (byte) -45).field9;
                }
                class312 var51;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var50 = var11.method11(var16, 4, (byte) -53, var21, var22, arg7, var19, var20, (class230) null, var27, arg5);
                    var51 = var50.field3720;
                } else {
                    var51 = new class271(arg8, 4, arg7, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class30.method191(arg3, arg4, arg0, var21, var51, (class312) null, class123.field2087[arg7], 0, class216.field3655[arg7] * var49, class222.field3725[arg7] * var49, var25);
            } else if (arg10 == 6) {
                int var52 = 8;
                long var53 = class185.method1342(arg3, arg4, arg0);
                if (var53 != 0L) {
                    var52 = class110.method827((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) -117).field9 / 2;
                }
                class312 var56;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var55 = var11.method11(var16, 4, (byte) -53, var21, var22, arg7 + 4, var19, var20, (class230) null, var27, arg5);
                    var56 = var55.field3720;
                } else {
                    var56 = new class271(arg8, 4, arg7 + 4, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class30.method191(arg3, arg4, arg0, var21, var56, (class312) null, 256, arg7, class162.field2625[arg7] * var52, class100.field1596[arg7] * var52, var25);
            } else if (arg10 == 7) {
                int var57 = arg7 + 2 & 0x3;
                class312 var59;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var58 = var11.method11(var16, 4, (byte) -53, var21, var22, var57 + 4, var19, var20, (class230) null, var27, arg5);
                    var59 = var58.field3720;
                } else {
                    var59 = new class271(arg8, 4, var57 + 4, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class30.method191(arg3, arg4, arg0, var21, var59, (class312) null, 256, var57, 0, 0, var25);
            } else if (arg10 == 8) {
                long var60 = class185.method1342(arg3, arg4, arg0);
                int var62 = 8;
                if (var60 != 0L) {
                    var62 = class110.method827(Integer.MAX_VALUE & (int) (var60 >>> 32), (byte) -126).field9 / 2;
                }
                int var63 = arg7 + 2 & 0x3;
                class312 var65;
                class312 var67;
                if (var11.field56 == -1 && var11.field4 == null && var11.field34 == null && !var11.field23) {
                    class221 var64 = var11.method11(var16, 4, (byte) -53, var21, var22, arg7 + 4, var19, var20, (class230) null, var27, arg5);
                    var65 = var64.field3720;
                    class221 var66 = var11.method11(var16, 4, (byte) -53, var21, var22, var63 + 4, var19, var20, (class230) null, var27, arg5);
                    var67 = var66.field3720;
                } else {
                    var65 = new class271(arg8, 4, arg7 + 4, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                    var67 = new class271(arg8, 4, var63 + 4, arg9, arg4, arg0, -1, var11.field78, (class312) null);
                }
                class30.method191(arg3, arg4, arg0, var21, var65, var67, 256, arg7, class162.field2625[arg7] * var62, class100.field1596[arg7] * var62, var25);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method511(byte arg0, String arg1) {
        if (arg0 != -87) {
            return;
        }
        field1258++;
        if (class272.field4534 != null) {
            class13.field284++;
            class236.field3980.method640((byte) 97, 171);
            class236.field3980.method1780(class73.method517(-1, arg1), 52);
            class236.field3980.method1786(-25149, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
    public static final int method512(String arg0, byte arg1, int arg2, String arg3) {
        field1254++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class13.method71(var22, 11117);
            var9 = class13.method71(var24, arg1 ^ 0x2B49);
            char var26 = class123.method920(var22, (byte) 127, arg2);
            char var27 = class123.method920(var24, (byte) -40, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class264.method1868(var28, arg2, 114) - class264.method1868(var29, arg2, arg1 ^ 0x49);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class264.method1868(var20, arg2, arg1 ^ 0x55) - class264.method1868(var21, arg2, 107);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        int var13 = 0;
        if (arg1 != 36) {
            field1259 = null;
        }
        while (var10 > var13) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class264.method1868(var14, arg2, 102) - class264.method1868(var15, arg2, 97);
            }
            var13++;
        }
        return 0;
    }
}
