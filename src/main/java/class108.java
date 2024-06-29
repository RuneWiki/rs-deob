import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class108 extends class205 {

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "Lvd;")
    private static class222 field1989 = class212.method1357("glow1:", 10731);

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "Lvd;")
    public static class222 field1988 = class212.method1357(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 10731);

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field1987 = 0;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "[Lag;")
    public static class8[] field1993 = new class8[4];

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Lvd;")
    public static class222 field1982 = field1989;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "Lvd;")
    public static class222 field1992 = class212.method1357("<col=ff9040>", 10731);

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "Lvd;")
    public static class222 field1997 = class212.method1357("<col=ffff00>", 10731);

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "I")
    public static int field1998 = -1;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Lvd;")
    public static class222 field1990 = field1989;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "Z")
    public static boolean field1995;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 <= 98) {
            return null;
        } else {
            ++field1984;
            int[][] var3 = super.field3815.method1003(-8357, arg0);
            if (super.field3815.field3015) {
                int[][] var4 = this.method1323(0, arg0, -5920);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var4[2];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class118.field2245; ++var11) {
                    var7[var11] = -var6[var11] + 4096;
                    var8[var11] = -var5[var11] + 4096;
                    var10[var11] = -var9[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "h", descriptor = "(I)V")
    public static void method656(int arg0) {
        if (arg0 == -1731064800) {
            field1990 = null;
            field1992 = null;
            field1982 = null;
            field1989 = null;
            field1988 = null;
            field1993 = null;
            field1997 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
    public static final void method657(int arg0, int arg1) {
        class23.field547 = arg0 / arg1;
        ++field1983;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIZIILag;IZ)V")
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class8 arg8, int arg9, boolean arg10) {
        ++field1986;
        if (arg10 && (class161.field3074[0][arg4][arg0] & 2) == 0) {
            if (~(class161.field3074[arg9][arg4][arg0] & 16) != -1) {
                return;
            }
            if (class203.method1303(arg4, (byte) -127, arg0, arg9) != class112.field2116) {
                return;
            }
        }
        if (~class34.field731 < ~arg9) {
            class34.field731 = arg9;
        }
        class65 var11 = class174.method1102(arg6, arg2 + 1);
        int var12;
        int var13;
        if (~arg3 != -2 && arg3 != 3) {
            var12 = var11.field1196;
            var13 = var11.field1209;
        } else {
            var13 = var11.field1196;
            var12 = var11.field1209;
        }
        int var14;
        int var15;
        if (arg4 - -var12 > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var14 = (var12 - -1 >> 1) + arg4;
            var15 = arg4 - -(var12 >> 1);
        }
        int var16;
        int var17;
        if (~(arg0 + var13) < -105) {
            var16 = arg0;
            var17 = arg0 + 1;
        } else {
            var16 = (var13 >> 1) + arg0;
            var17 = (var13 + 1 >> 1) + arg0;
        }
        int[][] var18 = class176.field3295[arg7];
        int var19 = var18[var15][var16] + var18[var15][var17] - -var18[var14][var17] + var18[var14][var16] >> 2;
        int var20 = (arg4 << 7) - -(var12 << 6);
        int var21 = (arg0 << 7) - -(var13 << 6);
        long var22 = (long) (1073741824 | arg1 << 14 | arg0 << 7 | arg4 | arg3 << 20);
        if (var11.field1206 == 0) {
            var22 |= Long.MIN_VALUE;
        }
        if (~var11.field1192 == -2) {
            var22 |= 4194304L;
        }
        Object var24 = null;
        if (arg5 && var11.method444((byte) -109)) {
            class112.method726(arg0, arg4, arg9, arg3, var11, -4);
        }
        long var25 = var22 | (long) arg6 << 32;
        if (arg1 == 22) {
            if (!arg10 || ~var11.field1206 != -1 || ~var11.field1225 == -2 || var11.field1228) {
                class44 var28;
                if (~var11.field1184 == 0 && var11.field1197 == null) {
                    class231 var27 = var11.method446((byte) -117, var19, var20, arg5, 22, var18, var21, arg3);
                    var28 = var27.field4335;
                } else {
                    var28 = new class126(arg6, 22, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                }
                class27.method230(arg9, arg4, arg0, var19, var28, var25, var11.field1218);
                if (~var11.field1225 == -2 && arg8 != null) {
                    arg8.method76(arg4, arg2 + -100, arg0);
                }
            }
        } else if (arg1 != 10 && arg1 != 11) {
            if (~arg1 <= -13) {
                class44 var30;
                if (~var11.field1184 == 0 && var11.field1197 == null) {
                    class231 var29 = var11.method446((byte) -117, var19, var20, arg5, arg1, var18, var21, arg3);
                    var30 = var29.field4335;
                } else {
                    var30 = new class126(arg6, arg1, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                }
                class237.method1542(arg9, arg4, arg0, var19, 1, 1, var30, 0, var25);
                if (arg5 && arg1 >= 12 && ~arg1 >= -18 && ~arg1 != -14 && ~arg9 < -1) {
                    class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 2340);
                }
                if (var11.field1225 != 0 && arg8 != null) {
                    arg8.method70(var11.field1189, arg0, var12, false, arg4, var13);
                }
            } else if (arg1 == 0) {
                class44 var32;
                if (~var11.field1184 == 0 && var11.field1197 == null) {
                    class231 var31 = var11.method446((byte) -120, var19, var20, arg5, 0, var18, var21, arg3);
                    var32 = var31.field4335;
                } else {
                    var32 = new class126(arg6, 0, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                }
                class27.method233(arg9, arg4, arg0, var19, var32, (class44) null, class226.field4241[arg3], 0, var25);
                if (arg5) {
                    if (arg3 == 0) {
                        if (var11.field1205) {
                            class37.field810[arg9][arg4][arg0] = 50;
                            class37.field810[arg9][arg4][arg0 + 1] = 50;
                        }
                        if (var11.field1194) {
                            class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 585);
                        }
                    } else if (arg3 != 1) {
                        if (~arg3 == -3) {
                            if (var11.field1205) {
                                class37.field810[arg9][arg4 + 1][arg0] = 50;
                                class37.field810[arg9][arg4 - -1][arg0 - -1] = 50;
                            }
                            if (var11.field1194) {
                                class14.field391[arg9][arg4 - -1][arg0] = class213.method1361(class14.field391[arg9][arg4 - -1][arg0], 585);
                            }
                        } else if (arg3 == 3) {
                            if (var11.field1205) {
                                class37.field810[arg9][arg4][arg0] = 50;
                                class37.field810[arg9][arg4 + 1][arg0] = 50;
                            }
                            if (var11.field1194) {
                                class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 1170);
                            }
                        }
                    } else {
                        if (var11.field1205) {
                            class37.field810[arg9][arg4][arg0 + 1] = 50;
                            class37.field810[arg9][arg4 + 1][arg0 + 1] = 50;
                        }
                        if (var11.field1194) {
                            class14.field391[arg9][arg4][arg0 + 1] = class213.method1361(class14.field391[arg9][arg4][arg0 + 1], 1170);
                        }
                    }
                }
                if (var11.field1225 != 0 && arg8 != null) {
                    arg8.method80(arg2 ^ -5, arg1, arg0, arg4, arg3, var11.field1189);
                }
                if (var11.field1191 != 16) {
                    class101.method624(arg9, arg4, arg0, var11.field1191);
                }
            } else if (~arg1 == -2) {
                class44 var34;
                if (var11.field1184 == -1 && var11.field1197 == null) {
                    class231 var33 = var11.method446((byte) -109, var19, var20, arg5, 1, var18, var21, arg3);
                    var34 = var33.field4335;
                } else {
                    var34 = new class126(arg6, 1, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                }
                class27.method233(arg9, arg4, arg0, var19, var34, (class44) null, class196.field3575[arg3], 0, var25);
                if (var11.field1205 && arg5) {
                    if (arg3 != 0) {
                        if (arg3 != 1) {
                            if (~arg3 != -3) {
                                if (arg3 == 3) {
                                    class37.field810[arg9][arg4][arg0] = 50;
                                }
                            } else {
                                class37.field810[arg9][arg4 + 1][arg0] = 50;
                            }
                        } else {
                            class37.field810[arg9][arg4 + 1][arg0 - -1] = 50;
                        }
                    } else {
                        class37.field810[arg9][arg4][arg0 + 1] = 50;
                    }
                }
                if (~var11.field1225 != -1 && arg8 != null) {
                    arg8.method80(4, arg1, arg0, arg4, arg3, var11.field1189);
                }
            } else if (~arg1 == -3) {
                int var35 = 3 & arg3 + 1;
                class44 var37;
                class44 var39;
                if (~var11.field1184 == 0 && var11.field1197 == null) {
                    class231 var36 = var11.method446((byte) -114, var19, var20, arg5, 2, var18, var21, arg3 + 4);
                    var37 = var36.field4335;
                    class231 var38 = var11.method446((byte) -113, var19, var20, arg5, 2, var18, var21, var35);
                    var39 = var38.field4335;
                } else {
                    var37 = new class126(arg6, 2, arg3 + 4, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    var39 = new class126(arg6, 2, var35, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                }
                class27.method233(arg9, arg4, arg0, var19, var37, var39, class226.field4241[arg3], class226.field4241[var35], var25);
                if (var11.field1194 && arg5) {
                    if (~arg3 == -1) {
                        class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 585);
                        class14.field391[arg9][arg4][arg0 - -1] = class213.method1361(class14.field391[arg9][arg4][arg0 - -1], 1170);
                    } else if (arg3 == 1) {
                        class14.field391[arg9][arg4][arg0 + 1] = class213.method1361(class14.field391[arg9][arg4][arg0 + 1], 1170);
                        class14.field391[arg9][arg4 + 1][arg0] = class213.method1361(class14.field391[arg9][arg4 + 1][arg0], 585);
                    } else if (arg3 == 2) {
                        class14.field391[arg9][arg4 - -1][arg0] = class213.method1361(class14.field391[arg9][arg4 - -1][arg0], 585);
                        class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 1170);
                    } else if (~arg3 == -4) {
                        class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 1170);
                        class14.field391[arg9][arg4][arg0] = class213.method1361(class14.field391[arg9][arg4][arg0], 585);
                    }
                }
                if (var11.field1225 != 0 && arg8 != null) {
                    arg8.method80(4, arg1, arg0, arg4, arg3, var11.field1189);
                }
                if (var11.field1191 != 16) {
                    class101.method624(arg9, arg4, arg0, var11.field1191);
                }
            } else {
                if (arg2 != -1) {
                    method657(-91, 50);
                }
                if (~arg1 == -4) {
                    class44 var41;
                    if (var11.field1184 == -1 && var11.field1197 == null) {
                        class231 var40 = var11.method446((byte) -116, var19, var20, arg5, 3, var18, var21, arg3);
                        var41 = var40.field4335;
                    } else {
                        var41 = new class126(arg6, 3, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class27.method233(arg9, arg4, arg0, var19, var41, (class44) null, class196.field3575[arg3], 0, var25);
                    if (var11.field1205 && arg5) {
                        if (arg3 != 0) {
                            if (~arg3 == -2) {
                                class37.field810[arg9][arg4 + 1][arg0 + 1] = 50;
                            } else if (arg3 == 2) {
                                class37.field810[arg9][arg4 + 1][arg0] = 50;
                            } else if (arg3 == 3) {
                                class37.field810[arg9][arg4][arg0] = 50;
                            }
                        } else {
                            class37.field810[arg9][arg4][arg0 + 1] = 50;
                        }
                    }
                    if (var11.field1225 != 0 && arg8 != null) {
                        arg8.method80(4, arg1, arg0, arg4, arg3, var11.field1189);
                    }
                } else if (arg1 == 9) {
                    class44 var43;
                    if (~var11.field1184 == 0 && var11.field1197 == null) {
                        class231 var42 = var11.method446((byte) -112, var19, var20, arg5, arg1, var18, var21, arg3);
                        var43 = var42.field4335;
                    } else {
                        var43 = new class126(arg6, arg1, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class237.method1542(arg9, arg4, arg0, var19, 1, 1, var43, 0, var25);
                    if (var11.field1225 != 0 && arg8 != null) {
                        arg8.method70(var11.field1189, arg0, var12, false, arg4, var13);
                    }
                    if (~var11.field1191 != -17) {
                        class101.method624(arg9, arg4, arg0, var11.field1191);
                    }
                } else if (~arg1 == -5) {
                    class44 var45;
                    if (~var11.field1184 == 0 && var11.field1197 == null) {
                        class231 var44 = var11.method446((byte) -118, var19, var20, arg5, 4, var18, var21, arg3);
                        var45 = var44.field4335;
                    } else {
                        var45 = new class126(arg6, 4, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class52.method377(arg9, arg4, arg0, var19, var45, (class44) null, class226.field4241[arg3], 0, 0, 0, var25, (class137) var24);
                } else if (arg1 == 5) {
                    int var46 = 16;
                    long var47 = class146.method921(arg9, arg4, arg0);
                    if (var47 != 0L) {
                        var46 = class174.method1102((int) (var47 >>> 32) & Integer.MAX_VALUE, ~arg2).field1191;
                    }
                    class44 var50;
                    if (var11.field1184 == -1 && var11.field1197 == null) {
                        class231 var49 = var11.method446((byte) -110, var19, var20, arg5, 4, var18, var21, arg3);
                        var50 = var49.field4335;
                    } else {
                        var50 = new class126(arg6, 4, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class52.method377(arg9, arg4, arg0, var19, var50, (class44) null, class226.field4241[arg3], 0, class11.field211[arg3] * var46, class174.field3273[arg3] * var46, var25, (class137) var24);
                } else if (arg1 == 6) {
                    int var51 = 8;
                    long var52 = class146.method921(arg9, arg4, arg0);
                    if (var52 != 0L) {
                        var51 = class174.method1102((int) (var52 >>> 32) & Integer.MAX_VALUE, ~arg2).field1191 / 2;
                    }
                    class44 var55;
                    if (var11.field1184 == -1 && var11.field1197 == null) {
                        class231 var54 = var11.method446((byte) -127, var19, var20, arg5, 4, var18, var21, arg3 - -4);
                        var55 = var54.field4335;
                    } else {
                        var55 = new class126(arg6, 4, arg3 + 4, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class52.method377(arg9, arg4, arg0, var19, var55, (class44) null, 256, arg3, class229.field4311[arg3] * var51, class40.field881[arg3] * var51, var25, (class137) var24);
                } else if (~arg1 == -8) {
                    int var56 = arg3 - -2 & 3;
                    class44 var58;
                    if (~var11.field1184 == 0 && var11.field1197 == null) {
                        class231 var57 = var11.method446((byte) -118, var19, var20, arg5, 4, var18, var21, var56 + 4);
                        var58 = var57.field4335;
                    } else {
                        var58 = new class126(arg6, 4, var56 - -4, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class52.method377(arg9, arg4, arg0, var19, var58, (class44) null, 256, var56, 0, 0, var25, (class137) var24);
                } else if (arg1 == 8) {
                    int var59 = 8;
                    long var60 = class146.method921(arg9, arg4, arg0);
                    if (var60 != 0L) {
                        var59 = class174.method1102(Integer.MAX_VALUE & (int) (var60 >>> 32), 0).field1191 / 2;
                    }
                    int var62 = 3 & arg3 - -2;
                    class44 var64;
                    class44 var66;
                    if (var11.field1184 == -1 && var11.field1197 == null) {
                        class231 var63 = var11.method446((byte) -127, var19, var20, arg5, 4, var18, var21, arg3 + 4);
                        var64 = var63.field4335;
                        class231 var65 = var11.method446((byte) -118, var19, var20, arg5, 4, var18, var21, var62 + 4);
                        var66 = var65.field4335;
                    } else {
                        var64 = new class126(arg6, 4, arg3 - -4, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                        var66 = new class126(arg6, 4, var62 + 4, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
                    }
                    class52.method377(arg9, arg4, arg0, var19, var64, var66, 256, arg3, class229.field4311[arg3] * var59, class40.field881[arg3] * var59, var25, (class137) var24);
                }
            }
        } else {
            class44 var68;
            if (var11.field1184 == -1 && var11.field1197 == null) {
                class231 var67 = var11.method446((byte) -107, var19, var20, arg5, 10, var18, var21, arg3);
                var68 = var67.field4335;
            } else {
                var68 = new class126(arg6, 10, arg3, arg7, arg4, arg0, var11.field1184, var11.field1195, (class44) null);
            }
            if (var68 != null) {
                boolean var69 = class237.method1542(arg9, arg4, arg0, var19, var12, var13, var68, ~arg1 != -12 ? 0 : 256, var25);
                if (var11.field1205 && var69 && arg5) {
                    int var70 = 15;
                    if (var68 instanceof class49) {
                        var70 = ((class49) var68).method351() / 4;
                        if (~var70 < -31) {
                            var70 = 30;
                        }
                    }
                    for (int var71 = 0; var71 <= var12; ++var71) {
                        for (int var72 = 0; ~var72 >= ~var13; ++var72) {
                            if (class37.field810[arg9][arg4 + var71][arg0 + var72] < var70) {
                                class37.field810[arg9][arg4 + var71][arg0 + var72] = (byte) var70;
                            }
                        }
                    }
                }
            }
            if (~var11.field1225 != -1 && arg8 != null) {
                arg8.method70(var11.field1189, arg0, var12, false, arg4, var13);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field1994;
        if (~arg2 == -1) {
            super.field3812 = ~arg0.method662((byte) -105) == -2;
        }
        int var4 = -59 % ((-47 - arg1) / 34);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field1991;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3810.method557(6978, arg1);
            if (super.field3810.field1635) {
                int[] var4 = this.method1322(arg1, (byte) 108, 0);
                for (int var5 = 0; ~class118.field2245 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class108() {
        super(1, false);
    }
}
