import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class157 extends class215 {

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field2532 = 0;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field2533 = 0;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2530 = "glow3:";

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    private int field2523;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    private int field2527;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
    private class157(int arg0) {
        super(0, false);
        this.method1100(-29878, arg0);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II)V")
    private final void method1100(int arg0, int arg1) {
        if (arg0 != -29878) {
            field2532 = 3;
        }
        this.field2523 = arg1 << 4 & 4080;
        this.field2527 = (arg1 & 16711680) >> 12;
        this.field2528 = 4080 & arg1 >> 4;
        ++field2524;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIII[B[Loj;II)[I")
    public static final int[] method1101(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, class144[] arg5, int arg6, int arg7) {
        ++field2534;
        if (!arg0) {
            for (int var8 = 0; ~var8 > -5; ++var8) {
                for (int var9 = 0; ~var9 > -65; ++var9) {
                    for (int var10 = 0; ~var10 > -65; ++var10) {
                        if (~(arg7 - -var9) < -1 && arg7 - -var9 < 103 && arg3 - -var10 > 0 && arg3 + var10 < 103) {
                            arg5[var8].field2272[arg7 - -var9][arg3 - -var10] = class173.method1186(arg5[var8].field2272[arg7 - -var9][arg3 - -var10], -2097153);
                        }
                    }
                }
            }
        }
        if (arg2 != -22736) {
            return null;
        } else {
            byte var11;
            if (arg0) {
                var11 = 1;
            } else {
                var11 = 4;
            }
            int var12 = arg6 + arg7;
            int var13 = arg1 + arg3;
            class96 var14 = new class96(arg4);
            for (int var15 = 0; var11 > var15; ++var15) {
                for (int var39 = 0; var39 < 64; ++var39) {
                    for (int var40 = 0; ~var40 > -65; ++var40) {
                        class192.method1329(arg3 + var40, var12 + var39, 0, var13 - -var40, var15, arg0, arg7 + var39, false, false, var14);
                    }
                }
            }
            boolean var16 = false;
            boolean var17 = false;
            while (var14.field1228 < var14.field1218.length) {
                int var18 = var14.method584(255);
                if (var18 == 128) {
                    var16 = true;
                    class180.field2867[0] = var14.method549(255);
                    class180.field2867[1] = var14.method564(arg2 + 22636);
                    class180.field2867[2] = var14.method564(-125);
                    class180.field2867[3] = var14.method564(-127);
                    class180.field2867[4] = var14.method549(255);
                } else {
                    if (var18 != 129) {
                        --var14.field1228;
                        break;
                    }
                    for (int var19 = 0; var19 < 4; ++var19) {
                        byte var20 = var14.method587(106);
                        if (var20 != 0) {
                            if (~var20 != -2) {
                                if (var20 == 2 && var19 > 0) {
                                    int var21 = arg7;
                                    if (~arg7 > -1) {
                                        var21 = 0;
                                    } else if (~arg7 <= -105) {
                                        var21 = 104;
                                    }
                                    int var22 = arg7 - -64;
                                    if (~var22 <= -1) {
                                        if (var22 >= 104) {
                                            var22 = 104;
                                        }
                                    } else {
                                        var22 = 0;
                                    }
                                    int var23 = arg3;
                                    int var24 = arg3 + 64;
                                    if (arg3 < 0) {
                                        var23 = 0;
                                    } else if (~arg3 <= -105) {
                                        var23 = 104;
                                    }
                                    if (var24 < 0) {
                                        var24 = 0;
                                    } else if (~var24 <= -105) {
                                        var24 = 104;
                                    }
                                    while (var22 > var21) {
                                        while (var24 > var23) {
                                            class204.field3214[var19][var21][var23] = class204.field3214[var19 + -1][var21][var23];
                                            ++var23;
                                        }
                                        ++var21;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < 64; var25 += 4) {
                                    for (int var26 = 0; var26 < 64; var26 += 4) {
                                        byte var27 = var14.method587(arg2 ^ -22717);
                                        for (int var28 = arg7 + var25; arg7 + var25 + 4 > var28; ++var28) {
                                            for (int var29 = var26 - -arg3; var29 < arg3 + var26 + 4; ++var29) {
                                                if (~var28 <= -1 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                                    class204.field3214[var19][var28][var29] = var27;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var30 = arg7;
                            int var31 = arg7 + 64;
                            if (~arg7 <= -1) {
                                if (~arg7 <= -105) {
                                    var30 = 104;
                                }
                            } else {
                                var30 = 0;
                            }
                            if (~var31 <= -1) {
                                if (~var31 <= -105) {
                                    var31 = 104;
                                }
                            } else {
                                var31 = 0;
                            }
                            int var32 = arg3;
                            if (arg3 < 0) {
                                var32 = 0;
                            } else if (~arg3 <= -105) {
                                var32 = 104;
                            }
                            int var33 = arg3 - -64;
                            if (var33 >= 0) {
                                if (var33 >= 104) {
                                    var33 = 104;
                                }
                            } else {
                                var33 = 0;
                            }
                            while (~var30 > ~var31) {
                                while (var32 < var33) {
                                    class204.field3214[var19][var30][var32] = 0;
                                    ++var32;
                                }
                                ++var30;
                            }
                        }
                    }
                    var17 = true;
                }
            }
            if (!var17) {
                for (int var34 = 0; ~var34 > -5; ++var34) {
                    for (int var35 = 0; ~var35 > -17; ++var35) {
                        for (int var36 = 0; ~var36 > -17; ++var36) {
                            int var37 = (arg7 >> 2) + var35;
                            int var38 = (arg3 >> 2) + var36;
                            if (~var37 <= -1 && ~var37 > -27 && ~var38 <= -1 && var38 < 26) {
                                class204.field3214[var34][var37][var38] = 0;
                            }
                        }
                    }
                }
            }
            if (var16) {
                return class180.field2867;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class157() {
        this(0);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field2529;
        if (arg0 != -1) {
            return null;
        } else {
            int[][] var3 = super.field3461.method1126(1, arg1);
            if (super.field3461.field2591) {
                int[] var4 = var3[1];
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class244.field4015 < ~var7; ++var7) {
                    var5[var7] = this.field2527;
                    var4[var7] = this.field2528;
                    var6[var7] = this.field2523;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field2525;
        if (arg0 == 1521146348) {
            if (arg1 == 0) {
                this.method1100(-29878, arg2.method598(arg0 ^ -318951385));
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
    public static void method1102(byte arg0) {
        field2530 = null;
        if (arg0 != -115) {
            method1102((byte) 57);
        }
    }
}
