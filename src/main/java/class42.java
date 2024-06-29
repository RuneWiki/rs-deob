import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class42 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field523 = " from your ignore list first.";

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[[[B")
    public static byte[][][] field525;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BC)Z")
    public static final boolean method277(byte arg0, char arg1) {
        int var2 = 103 % ((arg0 - 16) / 36);
        field520++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var3 = class249.field4073;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg1 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V")
    public static final void method278(int arg0, int arg1, byte arg2) {
        class11.field139.method2224(178, (byte) 0);
        field522++;
        if (arg2 == -54) {
            class432.field6362++;
            class11.field139.method1306(arg0, 1864805768);
            class11.field139.method1283(8, arg1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjg;)V")
    public final void method279(byte arg0, class186 arg1) {
        if (arg0 != 64) {
            this.method279((byte) -32, (class186) null);
        }
        field529++;
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                return;
            }
            this.method283(16764, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method280(boolean arg0) {
        if (arg0) {
            field528 = 46;
        }
        field525 = null;
        field523 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static final void method281(int arg0) {
        class182.field2977 = 0;
        if (arg0 >= -42) {
            field525 = null;
        }
        class318.field4987 = -1;
        class160.field2531 = 0;
        class19.field242 = false;
        class300.field4760 = 1;
        class357.field5463 = -3;
        class57.field715 = 0;
        field527++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([[BII[Z[[BILe;[[BBIILee;ILfr;)V")
    public static final void method282(byte[][] arg0, int arg1, int arg2, boolean[] arg3, byte[][] arg4, int arg5, class312 arg6, byte[][] arg7, byte arg8, int arg9, int arg10, class402 arg11, int arg12, class235 arg13) {
        field521++;
        int var14 = -108 / ((arg8 + 13) / 58);
        if (arg13 != null && arg11 != null || arg11 != null && arg12 == 12 || arg13 != null && arg12 == 0) {
            boolean[] var15 = arg13 != null && arg13.field3927 ? class139.field2164[arg12] : class112.field1555[arg12];
            if (arg1 > 0) {
                if (arg5 > 0) {
                    int var16 = arg0[arg5 - 1][arg1 - 1] & 0xFF;
                    if (var16 > 0) {
                        class235 var17 = class345.method2257(var16 - 1, true);
                        if (var17.field3935 != -1 && var17.field3927) {
                            byte var18 = arg7[arg5 - 1][arg1 - 1];
                            int var19 = arg4[arg5 - 1][arg1 - 1] * 2 + 4 & 0x7;
                            int var20 = class250.method1726(var17, arg6, true);
                            if (class108.field1513[var18][var19]) {
                                class127.field2015[0] = var17.field3935;
                                class98.field1371[0] = var20;
                                class449.field6547[0] = arg6.method711() ? var17.field3921 : var17.field3930;
                                class447.field6525[0] = var17.field3939;
                                class329.field5159[0] = var17.field3936;
                                class403.field6019[0] = 256;
                            }
                        }
                    }
                }
                if (arg5 < (arg9 - 1)) {
                    int var21 = arg0[arg5 + 1][arg1 - 1] & 0xFF;
                    if (var21 > 0) {
                        class235 var22 = class345.method2257(var21 - 1, true);
                        if (var22.field3935 != -1 && var22.field3927) {
                            byte var23 = arg7[arg5 + 1][arg1 - 1];
                            int var24 = arg4[arg5 + 1][arg1 - 1] * 2 + 6 & 0x7;
                            int var25 = class250.method1726(var22, arg6, true);
                            if (class108.field1513[var23][var24]) {
                                class127.field2015[2] = var22.field3935;
                                class98.field1371[2] = var25;
                                class449.field6547[2] = arg6.method711() ? var22.field3921 : var22.field3930;
                                class447.field6525[2] = var22.field3939;
                                class329.field5159[2] = var22.field3936;
                                class403.field6019[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg1 < (arg10 - 1)) {
                if (arg5 > 0) {
                    int var26 = arg0[arg5 - 1][arg1 + 1] & 0xFF;
                    if (var26 > 0) {
                        class235 var27 = class345.method2257(var26 - 1, true);
                        if (var27.field3935 != -1 && var27.field3927) {
                            byte var28 = arg7[arg5 - 1][arg1 + 1];
                            int var29 = arg4[arg5 - 1][arg1 + 1] * 2 + 2 & 0x7;
                            int var30 = class250.method1726(var27, arg6, true);
                            if (class108.field1513[var28][var29]) {
                                class127.field2015[6] = var27.field3935;
                                class98.field1371[6] = var30;
                                class449.field6547[6] = arg6.method711() ? var27.field3921 : var27.field3930;
                                class447.field6525[6] = var27.field3939;
                                class329.field5159[6] = var27.field3936;
                                class403.field6019[6] = 64;
                            }
                        }
                    }
                }
                if (arg5 < (arg9 - 1)) {
                    int var31 = arg0[arg5 + 1][arg1 + 1] & 0xFF;
                    if (var31 > 0) {
                        class235 var32 = class345.method2257(var31 - 1, true);
                        if (var32.field3935 != -1 && var32.field3927) {
                            byte var33 = arg7[arg5 + 1][arg1 + 1];
                            int var34 = arg4[arg5 + 1][arg1 + 1] * 2 & 0x7;
                            int var35 = class250.method1726(var32, arg6, true);
                            if (class108.field1513[var33][var34]) {
                                class127.field2015[4] = var32.field3935;
                                class98.field1371[4] = var35;
                                class449.field6547[4] = arg6.method711() ? var32.field3921 : var32.field3930;
                                class447.field6525[4] = var32.field3939;
                                class329.field5159[4] = var32.field3936;
                                class403.field6019[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg1 > 0) {
                int var36 = arg0[arg5][arg1 - 1] & 0xFF;
                if (var36 > 0) {
                    class235 var37 = class345.method2257(var36 - 1, true);
                    if (var37.field3935 != -1) {
                        byte var38 = arg7[arg5][arg1 - 1];
                        byte var39 = arg4[arg5][arg1 - 1];
                        if (var37.field3927) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class250.method1726(var37, arg6, true);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class108.field1513[var38][var41] && class329.field5159[var40] <= var37.field3936) {
                                    class127.field2015[var40] = var37.field3935;
                                    class98.field1371[var40] = var42;
                                    class449.field6547[var40] = arg6.method711() ? var37.field3921 : var37.field3930;
                                    class447.field6525[var40] = var37.field3939;
                                    if (class329.field5159[var40] == var37.field3936) {
                                        class403.field6019[var40] = class35.method227(class403.field6019[var40], 32);
                                    } else {
                                        class403.field6019[var40] = 32;
                                    }
                                    class329.field5159[var40] = var37.field3936;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg2 & 0x3]) {
                                arg3[0] = class139.field2164[var38][class37.method242(var39 + 2, 3)];
                            }
                        } else if (!var15[arg2 & 0x3]) {
                            arg3[0] = class112.field1555[var38][class37.method242(3, var39 + 2)];
                        }
                    }
                }
            }
            if ((arg10 - 1) > arg1) {
                int var44 = arg0[arg5][arg1 + 1] & 0xFF;
                if (var44 > 0) {
                    class235 var45 = class345.method2257(var44 - 1, true);
                    if (var45.field3935 != -1) {
                        byte var46 = arg7[arg5][arg1 + 1];
                        byte var47 = arg4[arg5][arg1 + 1];
                        if (var45.field3927) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class250.method1726(var45, arg6, true);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class108.field1513[var46][var49] && var45.field3936 >= class329.field5159[var48]) {
                                    class127.field2015[var48] = var45.field3935;
                                    class98.field1371[var48] = var50;
                                    class449.field6547[var48] = arg6.method711() ? var45.field3921 : var45.field3930;
                                    class447.field6525[var48] = var45.field3939;
                                    if (class329.field5159[var48] == var45.field3936) {
                                        class403.field6019[var48] = class35.method227(class403.field6019[var48], 16);
                                    } else {
                                        class403.field6019[var48] = 16;
                                    }
                                    class329.field5159[var48] = var45.field3936;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg2 + 2 & 0x3]) {
                                arg3[2] = class139.field2164[var46][class37.method242(3, var47)];
                            }
                        } else if (!var15[arg2 + 2 & 0x3]) {
                            arg3[2] = class112.field1555[var46][class37.method242(3, var47)];
                        }
                    }
                }
            }
            if (arg5 > 0) {
                int var52 = arg0[arg5 - 1][arg1] & 0xFF;
                if (var52 > 0) {
                    class235 var53 = class345.method2257(var52 - 1, true);
                    if (var53.field3935 != -1) {
                        byte var54 = arg7[arg5 - 1][arg1];
                        byte var55 = arg4[arg5 - 1][arg1];
                        if (var53.field3927) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class250.method1726(var53, arg6, true);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class108.field1513[var54][var57] && class329.field5159[var56] <= var53.field3936) {
                                    class127.field2015[var56] = var53.field3935;
                                    class98.field1371[var56] = var58;
                                    class449.field6547[var56] = arg6.method711() ? var53.field3921 : var53.field3930;
                                    class447.field6525[var56] = var53.field3939;
                                    if (class329.field5159[var56] == var53.field3936) {
                                        class403.field6019[var56] = class35.method227(class403.field6019[var56], 8);
                                    } else {
                                        class403.field6019[var56] = 8;
                                    }
                                    class329.field5159[var56] = var53.field3936;
                                }
                                var56++;
                                var57--;
                            }
                            if (!var15[arg2 + 3 & 0x3]) {
                                arg3[3] = class139.field2164[var54][class37.method242(3, var55 + 1)];
                            }
                        } else if (!var15[arg2 + 3 & 0x3]) {
                            arg3[3] = class112.field1555[var54][class37.method242(3, var55 + 1)];
                        }
                    }
                }
            }
            if (arg9 - 1 > arg5) {
                int var60 = arg0[arg5 + 1][arg1] & 0xFF;
                if (var60 > 0) {
                    class235 var61 = class345.method2257(var60 - 1, true);
                    if (var61.field3935 != -1) {
                        byte var62 = arg7[arg5 + 1][arg1];
                        byte var63 = arg4[arg5 + 1][arg1];
                        if (var61.field3927) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class250.method1726(var61, arg6, true);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class108.field1513[var62][var65] && class329.field5159[var64] <= var61.field3936) {
                                    class127.field2015[var64] = var61.field3935;
                                    class98.field1371[var64] = var66;
                                    class449.field6547[var64] = arg6.method711() ? var61.field3921 : var61.field3930;
                                    class447.field6525[var64] = var61.field3939;
                                    if (class329.field5159[var64] == var61.field3936) {
                                        class403.field6019[var64] = class35.method227(class403.field6019[var64], 4);
                                    } else {
                                        class403.field6019[var64] = 4;
                                    }
                                    class329.field5159[var64] = var61.field3936;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg2 + 1 & 0x3]) {
                                arg3[1] = class139.field2164[var62][class37.method242(var63 + 3, 3)];
                            }
                        } else if (!var15[arg2 + 1 & 0x3]) {
                            arg3[1] = class112.field1555[var62][class37.method242(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class250.method1726(arg13, arg6, true);
        if (!arg13.field3927) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg2 * 2) & 0x7;
            if (class108.field1513[arg12][var69] && arg13.field3936 >= class329.field5159[var70]) {
                class127.field2015[var70] = arg13.field3935;
                class98.field1371[var70] = var68;
                class449.field6547[var70] = arg6.method711() ? arg13.field3921 : arg13.field3930;
                class447.field6525[var70] = arg13.field3939;
                if (class329.field5159[var70] == arg13.field3936) {
                    class403.field6019[var70] = class35.method227(class403.field6019[var70], 2);
                } else {
                    class403.field6019[var70] = 2;
                }
                class329.field5159[var70] = arg13.field3936;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILjg;)V")
    private final void method283(int arg0, int arg1, class186 arg2) {
        if (arg1 == 1) {
            this.field524 = arg2.method1272((byte) -125);
            this.field526 = arg2.method1322(false);
            this.field530 = arg2.method1322(false);
        }
        if (arg0 != 16764) {
            this.field530 = 60;
        }
        field531++;
    }
}
