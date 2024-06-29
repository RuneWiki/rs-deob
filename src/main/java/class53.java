import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class53 extends class82 {

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    private int field952 = 3072;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    private int field953 = 1024;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    private int field963 = 2048;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "Ldj;")
    public static class44 field947 = class89.method650(255, "blinken3:");

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "Ldj;")
    private static class44 field949 = class89.method650(255, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "Ldj;")
    public static class44 field951 = field949;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "Ldj;")
    private static class44 field959 = class89.method650(255, "slide:");

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Ldj;")
    public static class44 field945 = field959;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "[I")
    public static int[] field966 = new int[50];

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Ldj;")
    public static class44 field944 = field959;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Lve;")
    public static class225 field950;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "[Lle;")
    public static class125[] field956;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "[Lod;")
    public static class155[] field955;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field948;
        int[] var3 = super.field1595.method603(true, arg1);
        if (arg0 != 25238) {
            this.method3(-97, -43);
        }
        if (super.field1595.field1538) {
            int[] var4 = this.method620(arg0 + -22586, arg1, 0);
            for (int var5 = 0; ~class129.field2287 < ~var5; ++var5) {
                var3[var5] = this.field953 - -(var4[var5] * this.field963 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        this.field963 = -this.field953 + this.field952;
        ++field954;
        if (arg0 < 95) {
            method382(50);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZII)Ldj;")
    public static final class44 method379(boolean arg0, int arg1, int arg2) {
        if (arg1 != -6) {
            field943 = 11;
        }
        ++field957;
        return class29.method203(22666, arg2, arg0, 10);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZILue;IIIZIIII)V")
    public static final void method380(boolean arg0, int arg1, class215 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field964;
        if (arg0 && (class47.field875[0][arg1][arg7] & 2) == 0) {
            if (~(class47.field875[arg9][arg1][arg7] & 16) != -1) {
                return;
            }
            if (class235.method1535(arg1, arg9, arg7, 8) != class88.field1671) {
                return;
            }
        }
        if (~class88.field1683 < ~arg9) {
            class88.field1683 = arg9;
        }
        class39 var11 = class40.method281(true, arg5);
        int var12;
        int var13;
        if (~arg8 != -2 && arg8 != 3) {
            var12 = var11.field725;
            var13 = var11.field698;
        } else {
            var13 = var11.field725;
            var12 = var11.field698;
        }
        int var14;
        int var15;
        if (arg1 + var12 <= 104) {
            var14 = (var12 + 1 >> 1) + arg1;
            var15 = (var12 >> 1) + arg1;
        } else {
            var15 = arg1;
            var14 = arg1 + 1;
        }
        int var16;
        int var17;
        if (arg7 + var13 > 104) {
            var16 = arg7 - -1;
            var17 = arg7;
        } else {
            var16 = arg7 - -(var13 - -1 >> 1);
            var17 = (var13 >> 1) + arg7;
        }
        int[][] var18 = class211.field3771[arg10];
        int var19 = var18[var14][var16] + var18[var15][var17] - -var18[var14][var17] + var18[var15][var16] >> 2;
        int var20 = (arg1 << 7) + (var12 << 6);
        int var21 = (arg7 << 7) + (var13 << 6);
        long var22 = (long) (1073741824 | arg8 << 20 | arg7 << 7 | arg1 | arg3 << 14);
        if (~var11.field739 == -1) {
            var22 |= Long.MIN_VALUE;
        }
        if (~var11.field722 == -2) {
            var22 |= 4194304L;
        }
        long var24 = var22 | (long) arg5 << 32;
        Object var26 = null;
        if (arg6 && var11.method264(false)) {
            class28.method200(arg9, arg7, arg8, true, arg1, var11);
        }
        if (arg3 == 22) {
            if (!arg0 || ~var11.field739 != -1 || ~var11.field706 == -2 || var11.field684) {
                class234 var28;
                if (~var11.field741 == 0 && var11.field737 == null) {
                    class88 var27 = var11.method270(var18, var21, arg6, -128, var19, arg8, var20, 22);
                    var28 = var27.field1674;
                } else {
                    var28 = new class180(arg5, 22, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class208.method1357(arg9, arg1, arg7, var19, var28, var24, var11.field716);
                if (~var11.field706 == -2 && arg2 != null) {
                    arg2.method1409(false, arg7, arg1);
                }
            }
        } else if (arg3 != 10 && ~arg3 != -12) {
            if (arg3 >= 12) {
                class234 var30;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var29 = var11.method270(var18, var21, arg6, -127, var19, arg8, var20, arg3);
                    var30 = var29.field1674;
                } else {
                    var30 = new class180(arg5, arg3, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class222.method1432(arg9, arg1, arg7, var19, 1, 1, var30, 0, var24);
                if (arg6 && arg3 >= 12 && ~arg3 >= -18 && arg3 != 13 && arg9 > 0) {
                    class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 2340);
                }
                if (var11.field706 != 0 && arg2 != null) {
                    arg2.method1401(var13, var12, var11.field724, arg7, (byte) 95, arg1);
                }
            } else if (~arg3 == -1) {
                class234 var32;
                if (~var11.field741 == 0 && var11.field737 == null) {
                    class88 var31 = var11.method270(var18, var21, arg6, -128, var19, arg8, var20, 0);
                    var32 = var31.field1674;
                } else {
                    var32 = new class180(arg5, 0, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class78.method596(arg9, arg1, arg7, var19, var32, (class234) null, class227.field4273[arg8], 0, var24);
                if (arg6) {
                    if (arg8 == 0) {
                        if (var11.field687) {
                            class156.field2706[arg9][arg1][arg7] = 50;
                            class156.field2706[arg9][arg1][arg7 + 1] = 50;
                        }
                        if (var11.field740) {
                            class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 585);
                        }
                    } else if (~arg8 == -2) {
                        if (var11.field687) {
                            class156.field2706[arg9][arg1][arg7 + 1] = 50;
                            class156.field2706[arg9][arg1 + 1][arg7 + 1] = 50;
                        }
                        if (var11.field740) {
                            class216.field3928[arg9][arg1][arg7 + 1] = class238.method1545(class216.field3928[arg9][arg1][arg7 + 1], 1170);
                        }
                    } else if (~arg8 == -3) {
                        if (var11.field687) {
                            class156.field2706[arg9][arg1 + 1][arg7] = 50;
                            class156.field2706[arg9][arg1 + 1][arg7 + 1] = 50;
                        }
                        if (var11.field740) {
                            class216.field3928[arg9][arg1 - -1][arg7] = class238.method1545(class216.field3928[arg9][arg1 - -1][arg7], 585);
                        }
                    } else if (arg8 == 3) {
                        if (var11.field687) {
                            class156.field2706[arg9][arg1][arg7] = 50;
                            class156.field2706[arg9][arg1 + 1][arg7] = 50;
                        }
                        if (var11.field740) {
                            class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 1170);
                        }
                    }
                }
                if (~var11.field706 != -1 && arg2 != null) {
                    arg2.method1398((byte) -53, arg7, var11.field724, arg3, arg8, arg1);
                }
                if (~var11.field731 != -17) {
                    class14.method125(arg9, arg1, arg7, var11.field731);
                }
            } else if (arg3 == 1) {
                class234 var34;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var33 = var11.method270(var18, var21, arg6, -128, var19, arg8, var20, 1);
                    var34 = var33.field1674;
                } else {
                    var34 = new class180(arg5, 1, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class78.method596(arg9, arg1, arg7, var19, var34, (class234) null, class137.field2454[arg8], 0, var24);
                if (var11.field687 && arg6) {
                    if (arg8 == 0) {
                        class156.field2706[arg9][arg1][arg7 + 1] = 50;
                    } else if (arg8 != 1) {
                        if (~arg8 != -3) {
                            if (arg8 == 3) {
                                class156.field2706[arg9][arg1][arg7] = 50;
                            }
                        } else {
                            class156.field2706[arg9][arg1 + 1][arg7] = 50;
                        }
                    } else {
                        class156.field2706[arg9][arg1 + 1][arg7 + 1] = 50;
                    }
                }
                if (~var11.field706 != -1 && arg2 != null) {
                    arg2.method1398((byte) -53, arg7, var11.field724, arg3, arg8, arg1);
                }
            } else if (~arg3 == -3) {
                int var35 = 3 & arg8 + 1;
                class234 var37;
                class234 var39;
                if (~var11.field741 == 0 && var11.field737 == null) {
                    class88 var36 = var11.method270(var18, var21, arg6, -127, var19, arg8 + 4, var20, 2);
                    var37 = var36.field1674;
                    class88 var38 = var11.method270(var18, var21, arg6, -126, var19, var35, var20, 2);
                    var39 = var38.field1674;
                } else {
                    var37 = new class180(arg5, 2, arg8 + 4, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                    var39 = new class180(arg5, 2, var35, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class78.method596(arg9, arg1, arg7, var19, var37, var39, class227.field4273[arg8], class227.field4273[var35], var24);
                if (var11.field740 && arg6) {
                    if (~arg8 != -1) {
                        if (arg8 != 1) {
                            if (arg8 != 2) {
                                if (arg8 == 3) {
                                    class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 1170);
                                    class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 585);
                                }
                            } else {
                                class216.field3928[arg9][arg1 + 1][arg7] = class238.method1545(class216.field3928[arg9][arg1 + 1][arg7], 585);
                                class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 1170);
                            }
                        } else {
                            class216.field3928[arg9][arg1][arg7 + 1] = class238.method1545(class216.field3928[arg9][arg1][arg7 + 1], 1170);
                            class216.field3928[arg9][arg1 - -1][arg7] = class238.method1545(class216.field3928[arg9][arg1 - -1][arg7], 585);
                        }
                    } else {
                        class216.field3928[arg9][arg1][arg7] = class238.method1545(class216.field3928[arg9][arg1][arg7], 585);
                        class216.field3928[arg9][arg1][arg7 + 1] = class238.method1545(class216.field3928[arg9][arg1][arg7 + 1], 1170);
                    }
                }
                if (~var11.field706 != -1 && arg2 != null) {
                    arg2.method1398((byte) -53, arg7, var11.field724, arg3, arg8, arg1);
                }
                if (~var11.field731 != -17) {
                    class14.method125(arg9, arg1, arg7, var11.field731);
                }
            } else if (~arg3 == -4) {
                class234 var41;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var40 = var11.method270(var18, var21, arg6, -128, var19, arg8, var20, 3);
                    var41 = var40.field1674;
                } else {
                    var41 = new class180(arg5, 3, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class78.method596(arg9, arg1, arg7, var19, var41, (class234) null, class137.field2454[arg8], 0, var24);
                if (var11.field687 && arg6) {
                    if (arg8 == 0) {
                        class156.field2706[arg9][arg1][arg7 + 1] = 50;
                    } else if (arg8 == 1) {
                        class156.field2706[arg9][arg1 - -1][arg7 + 1] = 50;
                    } else if (~arg8 == -3) {
                        class156.field2706[arg9][arg1 + 1][arg7] = 50;
                    } else if (arg8 == 3) {
                        class156.field2706[arg9][arg1][arg7] = 50;
                    }
                }
                if (var11.field706 != 0 && arg2 != null) {
                    arg2.method1398((byte) -53, arg7, var11.field724, arg3, arg8, arg1);
                }
            } else if (~arg3 == -10) {
                class234 var43;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var42 = var11.method270(var18, var21, arg6, -128, var19, arg8, var20, arg3);
                    var43 = var42.field1674;
                } else {
                    var43 = new class180(arg5, arg3, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class222.method1432(arg9, arg1, arg7, var19, 1, 1, var43, 0, var24);
                if (~var11.field706 != -1 && arg2 != null) {
                    arg2.method1401(var13, var12, var11.field724, arg7, (byte) 113, arg1);
                }
                if (~var11.field731 != -17) {
                    class14.method125(arg9, arg1, arg7, var11.field731);
                }
            } else if (~arg3 == -5) {
                class234 var45;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var44 = var11.method270(var18, var21, arg6, -128, var19, arg8, var20, 4);
                    var45 = var44.field1674;
                } else {
                    var45 = new class180(arg5, 4, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class68.method542(arg9, arg1, arg7, var19, var45, (class234) null, class227.field4273[arg8], 0, 0, 0, var24, (class154) var26);
            } else if (~arg3 == -6) {
                int var46 = 16;
                long var47 = class221.method1426(arg9, arg1, arg7);
                if (var47 != 0L) {
                    var46 = class40.method281(true, Integer.MAX_VALUE & (int) (var47 >>> 32)).field731;
                }
                class234 var50;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var49 = var11.method270(var18, var21, arg6, -127, var19, arg8, var20, 4);
                    var50 = var49.field1674;
                } else {
                    var50 = new class180(arg5, 4, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class68.method542(arg9, arg1, arg7, var19, var50, (class234) null, class227.field4273[arg8], 0, class230.field4312[arg8] * var46, class4.field57[arg8] * var46, var24, (class154) var26);
            } else if (~arg3 == -7) {
                long var51 = class221.method1426(arg9, arg1, arg7);
                int var53 = 8;
                if (~var51 != -1L) {
                    var53 = class40.method281(true, Integer.MAX_VALUE & (int) (var51 >>> 32)).field731 / 2;
                }
                class234 var55;
                if (var11.field741 == -1 && var11.field737 == null) {
                    class88 var54 = var11.method270(var18, var21, arg6, -126, var19, arg8 - -4, var20, 4);
                    var55 = var54.field1674;
                } else {
                    var55 = new class180(arg5, 4, arg8 - -4, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                }
                class68.method542(arg9, arg1, arg7, var19, var55, (class234) null, 256, arg8, class4.field50[arg8] * var53, class96.field1777[arg8] * var53, var24, (class154) var26);
            } else if (arg4 < -38) {
                if (~arg3 == -8) {
                    int var56 = arg8 - -2 & 3;
                    class234 var58;
                    if (~var11.field741 == 0 && var11.field737 == null) {
                        class88 var57 = var11.method270(var18, var21, arg6, -127, var19, var56 + 4, var20, 4);
                        var58 = var57.field1674;
                    } else {
                        var58 = new class180(arg5, 4, var56 + 4, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                    }
                    class68.method542(arg9, arg1, arg7, var19, var58, (class234) null, 256, var56, 0, 0, var24, (class154) var26);
                } else if (arg3 == 8) {
                    int var59 = 8;
                    long var60 = class221.method1426(arg9, arg1, arg7);
                    if (var60 != 0L) {
                        var59 = class40.method281(true, (int) (var60 >>> 32) & Integer.MAX_VALUE).field731 / 2;
                    }
                    int var62 = arg8 + 2 & 3;
                    class234 var64;
                    class234 var66;
                    if (~var11.field741 == 0 && var11.field737 == null) {
                        class88 var63 = var11.method270(var18, var21, arg6, -128, var19, arg8 - -4, var20, 4);
                        var64 = var63.field1674;
                        class88 var65 = var11.method270(var18, var21, arg6, -128, var19, var62 + 4, var20, 4);
                        var66 = var65.field1674;
                    } else {
                        var64 = new class180(arg5, 4, arg8 + 4, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                        var66 = new class180(arg5, 4, var62 - -4, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
                    }
                    class68.method542(arg9, arg1, arg7, var19, var64, var66, 256, arg8, class4.field50[arg8] * var59, class96.field1777[arg8] * var59, var24, (class154) var26);
                }
            }
        } else {
            class234 var68;
            if (~var11.field741 == 0 && var11.field737 == null) {
                class88 var67 = var11.method270(var18, var21, arg6, -127, var19, arg8, var20, 10);
                var68 = var67.field1674;
            } else {
                var68 = new class180(arg5, 10, arg8, arg10, arg1, arg7, var11.field741, var11.field701, (class234) null);
            }
            if (var68 != null) {
                boolean var69 = class222.method1432(arg9, arg1, arg7, var19, var12, var13, var68, arg3 == 11 ? 256 : 0, var24);
                if (var11.field687 && var69 && arg6) {
                    int var70 = 15;
                    if (var68 instanceof class127) {
                        var70 = ((class127) var68).method50() / 4;
                        if (var70 > 30) {
                            var70 = 30;
                        }
                    }
                    for (int var71 = 0; ~var12 <= ~var71; ++var71) {
                        for (int var72 = 0; ~var13 <= ~var72; ++var72) {
                            if (var70 > class156.field2706[arg9][arg1 - -var71][arg7 + var72]) {
                                class156.field2706[arg9][arg1 + var71][arg7 - -var72] = (byte) var70;
                            }
                        }
                    }
                }
            }
            if (~var11.field706 != -1 && arg2 != null) {
                arg2.method1401(var13, var12, var11.field724, arg7, (byte) 124, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)Z")
    public static final boolean method381(int arg0, byte arg1) {
        ++field962;
        if (arg1 > -75) {
            field959 = null;
        }
        return ~(arg0 >> 31 & 1) != -1;
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public static void method382(int arg0) {
        field955 = null;
        field950 = null;
        if (arg0 != -2) {
            field950 = null;
        }
        field947 = null;
        field966 = null;
        field944 = null;
        field956 = null;
        field949 = null;
        field951 = null;
        field945 = null;
        field959 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1599 = ~arg0.method506(255) == -2;
                }
            } else {
                this.field952 = arg0.method500(arg2 ^ 108);
            }
        } else {
            this.field953 = arg0.method500(arg2 ^ 56);
        }
        ++field958;
        if (arg2 != 68) {
            method383(-105, 16, -110, 69, -51, 80);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field960;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = arg2 << 1;
        int var12 = var9 << 1;
        int var13 = -((var11 + -1) * var10) + var9;
        int var14 = (-var11 + 1) * var8 + var12;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = -95 % ((-28 - arg5) / 32);
        int var19 = ((arg2 << 1) + -3) * var10;
        int var20 = (var6 - -1) * var16;
        if (~arg1 <= ~class14.field267 && ~arg1 >= ~class57.field1068) {
            int var21 = class201.method1296(class70.field1337, -126, arg3 + arg4, class70.field1321);
            int var22 = class201.method1296(class70.field1337, -126, -arg4 + arg3, class70.field1321);
            class42.method290(class108.field1979[arg1], -7, var22, var21, arg0);
        }
        int var23 = (arg2 + -1) * var15;
        while (var7 > 0) {
            --var7;
            int var24 = arg1 - var7;
            int var25 = arg1 + var7;
            if (var14 < 0) {
                while (~var14 > -1) {
                    ++var6;
                    var14 += var17;
                    var17 += var16;
                    var13 += var20;
                    var20 += var16;
                }
            }
            if (var13 < 0) {
                var13 += var20;
                var20 += var16;
                ++var6;
                var14 += var17;
                var17 += var16;
            }
            var14 += -var23;
            if (~var25 <= ~class14.field267 && class57.field1068 >= var24) {
                int var26 = class201.method1296(class70.field1337, -128, arg3 - -var6, class70.field1321);
                int var27 = class201.method1296(class70.field1337, -128, -var6 + arg3, class70.field1321);
                if (~var24 <= ~class14.field267) {
                    class42.method290(class108.field1979[var24], -7, var27, var26, arg0);
                }
                if (~class57.field1068 <= ~var25) {
                    class42.method290(class108.field1979[var25], -7, var27, var26, arg0);
                }
            }
            var23 -= var15;
            var13 += -var19;
            var19 -= var15;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        if (arg0 > -59) {
            field943 = -69;
        }
        ++field965;
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[][] var4 = this.method619(arg1, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class129.field2287; ++var11) {
                var9[var11] = (var7[var11] * this.field963 >> 12) + this.field953;
                var8[var11] = (var5[var11] * this.field963 >> 12) + this.field953;
                var10[var11] = (var6[var11] * this.field963 >> 12) + this.field953;
            }
        }
        return var3;
    }
}
