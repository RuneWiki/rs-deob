import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class72 {

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "Z")
    public static boolean field147 = false;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field148 = -1;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (super.field1286.method2818(true)) {
            super.field1282 = 0;
        }
        if (arg0 >= 30) {
            ++field145;
            if (super.field1282 < 0 || super.field1282 > 2) {
                super.field1282 = this.method60(-3271);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)I")
    public final int method56(int arg0) {
        ++field149;
        return arg0 != 27669 ? -50 : super.field1282;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZIILvg;)V")
    public static final void method57(int arg0, boolean arg1, int arg2, int arg3, class52 arg4) {
        ++field144;
        class500 var5 = arg4.method464((byte) 127);
        if (arg1) {
            int var6 = 16383 & arg4.field920 - arg4.field888.field7100;
            if (~arg2 != 0) {
                if (arg4.field967 == -1 || var6 < 10240 && ~var6 < -2049) {
                    if (~var6 == -1 && arg4.field978 <= 25) {
                        arg4.field886 = false;
                        if (arg2 == 2 && var5.field7116 != -1) {
                            arg4.field939 = var5.field7116;
                        } else if (arg2 == 0 && var5.field7136 != -1) {
                            arg4.field939 = var5.field7136;
                        } else {
                            arg4.field939 = var5.field7146;
                        }
                    } else {
                        if (arg2 == 2 && var5.field7116 != -1) {
                            if (arg0 < 0 && ~var5.field7137 != 0) {
                                arg4.field939 = var5.field7137;
                            } else if (arg0 > 0 && var5.field7123 != -1) {
                                arg4.field939 = var5.field7123;
                            } else {
                                arg4.field939 = var5.field7116;
                            }
                        } else if (arg2 == 0 && var5.field7136 != -1) {
                            if (~arg0 > -1 && ~var5.field7134 != 0) {
                                arg4.field939 = var5.field7134;
                            } else if (arg0 > 0 && ~var5.field7114 != 0) {
                                arg4.field939 = var5.field7114;
                            } else {
                                arg4.field939 = var5.field7136;
                            }
                        } else if (arg0 < 0 && ~var5.field7126 != 0) {
                            arg4.field939 = var5.field7126;
                        } else if (arg0 > 0 && var5.field7138 != -1) {
                            arg4.field939 = var5.field7138;
                        } else {
                            arg4.field939 = var5.field7146;
                        }
                        arg4.field886 = false;
                    }
                } else {
                    int var7 = class7.field121[arg3] - arg4.field888.field7100 & 16383;
                    if (~arg2 == -3 && ~var5.field7116 != 0) {
                        if (var7 > 2048 && var7 <= 6144 && ~var5.field7142 != 0) {
                            arg4.field939 = var5.field7142;
                        } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field7108 != -1) {
                            arg4.field939 = var5.field7108;
                        } else if (~var7 < -6145 && ~var7 > -10241 && var5.field7155 != -1) {
                            arg4.field939 = var5.field7155;
                        } else {
                            arg4.field939 = var5.field7116;
                        }
                    } else if (~arg2 == -1 && var5.field7136 != -1) {
                        if (~var7 < -2049 && ~var7 >= -6145 && var5.field7139 != -1) {
                            arg4.field939 = var5.field7139;
                        } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field7149 != 0) {
                            arg4.field939 = var5.field7149;
                        } else if (~var7 < -6145 && var7 < 10240 && ~var5.field7157 != 0) {
                            arg4.field939 = var5.field7157;
                        } else {
                            arg4.field939 = var5.field7136;
                        }
                    } else if (var7 > 2048 && ~var7 >= -6145 && var5.field7159 != -1) {
                        arg4.field939 = var5.field7159;
                    } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field7154 != 0) {
                        arg4.field939 = var5.field7154;
                    } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field7125 != 0) {
                        arg4.field939 = var5.field7125;
                    } else {
                        arg4.field939 = var5.field7146;
                    }
                    arg4.field886 = false;
                }
            } else if (~var6 == -1 && ~arg4.field978 >= -26) {
                if (!arg4.field886 || !var5.method3003(-21746, arg4.field939)) {
                    arg4.field939 = var5.method3011(5317);
                    arg4.field886 = ~arg4.field939 != 0;
                }
            } else {
                if (~arg0 > -1 && var5.field7140 != -1) {
                    arg4.field939 = var5.field7140;
                    arg4.field886 = false;
                } else if (~arg0 < -1 && ~var5.field7156 != 0) {
                    arg4.field939 = var5.field7156;
                } else {
                    arg4.field939 = var5.field7146;
                }
                arg4.field886 = false;
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field150;
        if (arg1 != 11260) {
            return -5;
        } else {
            return super.field1286.method2818(true) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lcq;)V")
    public class11(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        if (arg1 != 3) {
            field147 = false;
        }
        ++field143;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            this.method59(3, 98);
        }
        ++field152;
        return 2;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(ILcq;)V")
    public class11(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method61(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class491.field6993 = true;
        class140.field2172 = class497.field7089.method615() > 0;
        class336.field4756 = arg15;
        class155.field2331 = arg1 >> class440.field6142;
        class214.field3065 = arg3 >> class440.field6142;
        class308.field4358 = arg1;
        class200.field2875 = arg3;
        class656.field9229 = arg2;
        class78.field1471 = class155.field2331 - class235.field3337;
        if (class78.field1471 < 0) {
            class247.field3466 = -class78.field1471;
            class78.field1471 = 0;
        } else {
            class247.field3466 = 0;
        }
        class249.field3503 = class214.field3065 - class235.field3337;
        if (class249.field3503 < 0) {
            class131.field1953 = -class249.field3503;
            class249.field3503 = 0;
        } else {
            class131.field1953 = 0;
        }
        class345.field4857 = class235.field3337 + class155.field2331;
        if (class345.field4857 > class613.field8871) {
            class345.field4857 = class613.field8871;
        }
        class63.field1152 = class235.field3337 + class214.field3065;
        if (class63.field1152 > class453.field6328) {
            class63.field1152 = class453.field6328;
        }
        boolean[][] var19 = class533.field7539;
        boolean[][] var20 = class462.field6655;
        if (class336.field4756) {
            for (int var21 = 0; var21 < class235.field3337 + class235.field3337 + 2; ++var21) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class235.field3337 + class235.field3337 + 2; ++var24) {
                    if (var24 > 1) {
                        class311.field4385[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class155.field2331 - class235.field3337 + var21;
                    int var26 = class214.field3065 - class235.field3337 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < class613.field8871 && var26 < class453.field6328) {
                        int var27 = var25 << class440.field6142;
                        int var28 = var26 << class440.field6142;
                        int var29 = class173.field2511[class173.field2511.length - 1].method1825(var26, -128, var25) - (1000 << class440.field6142 - 7);
                        int var30 = class4.field56 != null ? class4.field56[0].method1825(var26, -128, var25) + class546.field7701 : class173.field2511[0].method1825(var26, -128, var25) + class546.field7701;
                        var23 = arg16 >= 0 ? class497.field7089.method585(var27, var29, var28, var27, var30, var28, arg16) : class497.field7089.method602(var27, var29, var28, var27, var30, var28);
                        class462.field6655[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class462.field6655[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class311.field4385[var24 - 1] & class311.field4385[var24] & var22 & var23;
                        class533.field7539[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class311.field4385[class235.field3337 + class235.field3337] = var22;
                class311.field4385[class235.field3337 + class235.field3337 + 1] = var23;
            }
            if (arg16 >= 0) {
                class491.field6993 = false;
            } else {
                class221.field3159 = arg5;
                class162.field2406 = arg6;
                class82.field1520 = arg7;
                class489.field6979 = arg8;
                class584.field8242 = arg9;
                class162.method1213(arg10, 32036, class497.field7089);
            }
        } else {
            if (class239.field3368 == null) {
                class239.field3368 = new boolean[class613.field8871 + class613.field8871 + 1][class613.field8871 + class453.field6328 + 1];
            }
            for (int var32 = 0; var32 < class239.field3368.length; ++var32) {
                for (int var42 = 0; var42 < class239.field3368[0].length; ++var42) {
                    class239.field3368[var32][var42] = true;
                }
            }
            class462.field6655 = class239.field3368;
            class533.field7539 = class239.field3368;
            class78.field1471 = 0;
            class249.field3503 = 0;
            class345.field4857 = class613.field8871;
            class63.field1152 = class453.field6328;
            class491.field6993 = false;
        }
        class745.method4150(0, class497.field7089);
        if (!class62.field1128.field7534) {
            class747 var33 = class62.field1128.field7527;
            for (class304 var34 = (class304) var33.method4159(0); var34 != null; var34 = (class304) var33.method4151(7)) {
                var34.method909(-109);
                class625.method3614(var34, -119);
            }
        }
        if (class140.field2172) {
            for (int var35 = 0; var35 < class153.field2298; ++var35) {
                class502.field7171[var35].method969(arg0, arg14, (byte) 105);
            }
        }
        if (class190.field2741) {
            class694.field9757 = class497.field7089.method547();
            class497.field7089.method624(class496.field7077);
            int var36 = (class496.field7077[2] - class496.field7077[0]) / class368.field5159;
            for (int var37 = 0; var37 < class368.field5159 - 1; ++var37) {
                class729.field10212[var37] = (var37 + 1) * var36 + class371.field5197[var37];
            }
            for (int var38 = 0; var38 < class253.field3660.length; ++var38) {
                class253.field3660[var38].method3926();
            }
        }
        if (class421.field5916 != null) {
            if (class190.field2741) {
                class360.method2243(0);
            }
            class71.method732(true);
            class497.field7089.method639(-1, 1583160, 40, 127);
            class685.method3858(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class190.field2741) {
                class369.method2310();
            }
            class497.field7089.method613();
            class71.method732(false);
        }
        class685.method3858(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class190.field2741) {
            for (int var39 = 0; var39 < class749.field10470; ++var39) {
                class256.field3708[var39] = class705.field9867[var39];
            }
            class360.method2243(0);
            for (int var40 = 0; var40 < class253.field3660.length; ++var40) {
                class253.field3660[var40].method3926();
            }
        }
        if (class190.field2741) {
            class369.method2310();
            for (int var41 = 0; var41 < class749.field10470; ++var41) {
                class705.field9867[var41] = class256.field3708[var41];
            }
            if (class272.field3892 == 2) {
                int var10002;
                if (class535.field7551[0] < class535.field7551[1]) {
                    if (class729.field10212[0] + class371.field5197[0] > class496.field7077[0]) {
                        var10002 = class371.field5197[0]++;
                    }
                } else if (class535.field7551[0] > class535.field7551[1] && class729.field10212[0] + class371.field5197[0] < class496.field7077[2]) {
                    var10002 = class371.field5197[0]--;
                }
            }
        }
        if (!class336.field4756) {
            class533.field7539 = var19;
            class462.field6655 = var20;
        }
        class402.method2480();
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ldm;II)Ljava/lang/String;")
    public static final String method62(class50 arg0, int arg1, int arg2) {
        ++field151;
        int var3 = -35 % ((arg1 - 10) / 36);
        if (!client.method1943(arg0).method2116((byte) 83, arg2) && arg0.field789 == null) {
            return null;
        } else if (arg0.field784 != null && ~arg2 > ~arg0.field784.length && arg0.field784[arg2] != null && ~arg0.field784[arg2].trim().length() != -1) {
            return arg0.field784[arg2];
        } else {
            return class588.field8274 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "(I)Z")
    public final boolean method63(int arg0) {
        ++field153;
        if (arg0 < 97) {
            field146 = -112;
        }
        return !super.field1286.method2818(true);
    }
}
