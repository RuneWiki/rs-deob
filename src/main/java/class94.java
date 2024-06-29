import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class94 extends class8 {

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    private int field1546 = 2048;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    private int field1544 = 10;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    private int field1551 = 0;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Z")
    public static boolean field1542 = false;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Lmh;")
    public static class152 field1545 = new class152();

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field1550 = 127;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "Lqh;")
    public static class201 field1552;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Ld;")
    public static class238 field1538;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "[I")
    private int[] field1536;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field1548;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1551 = arg1.method1517((byte) -96);
                }
            } else {
                this.field1546 = arg1.method1521((byte) 113);
            }
        } else {
            this.field1544 = arg1.method1517((byte) -96);
        }
        if (arg0 <= 62) {
            this.field1546 = -107;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class48 var20 = new class48(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class288.field4563[var21][arg1][arg2] == null) {
                    class288.field4563[var21][arg1][arg2] = new class134(var21, arg1, arg2);
                }
            }
            class288.field4563[arg0][arg1][arg2].field2141 = var20;
        } else if (arg3 != 1) {
            class272 var24 = new class272(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class288.field4563[var25][arg1][arg2] == null) {
                    class288.field4563[var25][arg1][arg2] = new class134(var25, arg1, arg2);
                }
            }
            class288.field4563[arg0][arg1][arg2].field2150 = var24;
        } else {
            class48 var22 = new class48(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class288.field4563[var23][arg1][arg2] == null) {
                    class288.field4563[var23][arg1][arg2] = new class134(var23, arg1, arg2);
                }
            }
            class288.field4563[arg0][arg1][arg2].field2141 = var22;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field1541;
        if (arg2 == arg5) {
            class127.method906(arg7, arg4, (byte) -69, arg0, arg5, arg3, arg1);
        } else if (!arg6) {
            if (-arg5 + arg1 >= class255.field4055 && ~class9.field128 <= ~(arg1 - -arg5) && ~class161.field2561 >= ~(-arg2 + arg3) && class51.field896 >= arg3 - -arg2) {
                class182.method1237(arg0, arg4, arg7, arg3, arg1, arg5, arg2, (byte) -65);
            } else {
                class49.method386(arg1, arg4, arg2, -21756, arg0, arg7, arg5, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public static void method702(byte arg0) {
        int var1 = 61 % ((arg0 - -36) / 60);
        field1538 = null;
        field1552 = null;
        field1545 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(Z)V")
    private final void method703(boolean arg0) {
        this.field1537 = new int[this.field1544 + 1];
        this.field1536 = new int[this.field1544 + 1];
        ++field1539;
        int var2 = 0;
        int var3 = 4096 / this.field1544;
        int var4 = this.field1546 * var3 >> 12;
        for (int var5 = 0; ~this.field1544 < ~var5; ++var5) {
            this.field1536[var5] = var2;
            this.field1537[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1536[this.field1544] = 4096;
        if (arg0) {
            field1542 = true;
        }
        this.field1537[this.field1544] = this.field1537[0] + 4096;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1553;
        if (arg0 != 3) {
            return null;
        } else {
            int[] var3 = super.field110.method1585(0, arg1);
            if (super.field110.field3734) {
                int var4 = class182.field2864[arg1];
                if (~this.field1551 != -1) {
                    for (int var5 = 0; var5 < class231.field3798; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class176.field2776[var5];
                        int var9 = this.field1551;
                        if (var9 != 1) {
                            if (var9 != 2) {
                                if (~var9 == -4) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var8 + -4096 + var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; var10 < this.field1544; ++var10) {
                            if (~this.field1536[var10] >= ~var6 && this.field1536[var10 + 1] > var6) {
                                if (var6 < this.field1537[var10]) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field1544 > var12; ++var12) {
                        if (this.field1536[var12] <= var4 && this.field1536[var12 + 1] > var4) {
                            if (var4 < this.field1537[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class140.method970(var3, 0, class231.field3798, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        this.method703(arg0);
        ++field1535;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public static final void method704(int arg0) {
        if (arg0 <= 36) {
            field1549 = -80;
        }
        for (int var1 = 0; var1 < class183.field2883; ++var1) {
            class35 var2 = class41.method353(var1, -123);
            if (var2 != null && ~var2.field547 == -1) {
                class43.field794[var1] = 0;
                class82.field1289[var1] = 0;
            }
        }
        class148.field2357 = new class204(16);
        ++field1540;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1543;
        if (~arg1 == ~arg9 && arg0 == arg7 && ~arg4 == ~arg8 && arg5 == arg6) {
            class67.method467(arg9, arg8, -111, arg0, arg2, arg5);
        } else {
            int var10 = arg9;
            int var11 = arg0;
            int var12 = arg9 * 3;
            int var13 = arg0 * 3;
            int var14 = arg1 * 3;
            int var15 = arg7 * 3;
            int var16 = arg4 * 3;
            int var17 = -arg9 + var14 + -var16 + arg8;
            int var18 = arg6 * 3;
            int var19 = arg5 + var15 + -var18 - arg0;
            int var20 = -var14 + var12 + -var14 + var16;
            int var21 = -var15 + -var15 - -var13 + var18;
            int var22 = -var13 + var15;
            int var23 = -var12 + var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var20 * var25;
                int var27 = var24 * var25 >> 12;
                int var28 = var21 * var25;
                int var29 = var17 * var27;
                int var30 = var19 * var27;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = arg9 - -(var26 + var31 + var29 >> 12);
                int var34 = (var30 - -var28 - -var32 >> 12) + arg0;
                class67.method467(var10, var33, -122, var11, arg2, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg3 != -11430) {
            field1552 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI[BLjava/lang/String;I)I")
    public static final int method706(int arg0, byte arg1, int arg2, byte[] arg3, String arg4, int arg5) {
        int var6 = -arg5 + arg0;
        if (arg1 <= 55) {
            return -127;
        } else {
            for (int var7 = 0; var6 > var7; ++var7) {
                char var8 = arg4.charAt(arg5 + var7);
                if (var8 > 0 && ~var8 > -129 || ~var8 <= -161 && var8 <= 255) {
                    arg3[arg2 + var7] = (byte) var8;
                } else if (var8 == 8364) {
                    arg3[arg2 + var7] = -128;
                } else if (var8 == 8218) {
                    arg3[arg2 + var7] = -126;
                } else if (~var8 == -403) {
                    arg3[arg2 + var7] = -125;
                } else if (~var8 == -8223) {
                    arg3[arg2 + var7] = -124;
                } else if (var8 == 8230) {
                    arg3[arg2 + var7] = -123;
                } else if (var8 == 8224) {
                    arg3[arg2 + var7] = -122;
                } else if (~var8 != -8226) {
                    if (var8 == 710) {
                        arg3[arg2 + var7] = -120;
                    } else if (var8 == 8240) {
                        arg3[arg2 + var7] = -119;
                    } else if (var8 != 352) {
                        if (~var8 != -8250) {
                            if (~var8 != -339) {
                                if (var8 == 381) {
                                    arg3[arg2 - -var7] = -114;
                                } else if (~var8 != -8217) {
                                    if (~var8 == -8218) {
                                        arg3[arg2 + var7] = -110;
                                    } else if (var8 != 8220) {
                                        if (~var8 != -8222) {
                                            if (var8 != 8226) {
                                                if (~var8 == -8212) {
                                                    arg3[arg2 + var7] = -106;
                                                } else if (~var8 != -8213) {
                                                    if (var8 == 732) {
                                                        arg3[arg2 - -var7] = -104;
                                                    } else if (~var8 == -8483) {
                                                        arg3[arg2 + var7] = -103;
                                                    } else if (~var8 != -354) {
                                                        if (var8 != 8250) {
                                                            if (~var8 != -340) {
                                                                if (~var8 != -383) {
                                                                    if (~var8 == -377) {
                                                                        arg3[arg2 + var7] = -97;
                                                                    } else {
                                                                        arg3[arg2 + var7] = 63;
                                                                    }
                                                                } else {
                                                                    arg3[arg2 + var7] = -98;
                                                                }
                                                            } else {
                                                                arg3[arg2 + var7] = -100;
                                                            }
                                                        } else {
                                                            arg3[arg2 + var7] = -101;
                                                        }
                                                    } else {
                                                        arg3[arg2 + var7] = -102;
                                                    }
                                                } else {
                                                    arg3[arg2 - -var7] = -105;
                                                }
                                            } else {
                                                arg3[arg2 + var7] = -107;
                                            }
                                        } else {
                                            arg3[arg2 + var7] = -108;
                                        }
                                    } else {
                                        arg3[arg2 + var7] = -109;
                                    }
                                } else {
                                    arg3[arg2 + var7] = -111;
                                }
                            } else {
                                arg3[arg2 + var7] = -116;
                            }
                        } else {
                            arg3[arg2 + var7] = -117;
                        }
                    } else {
                        arg3[arg2 + var7] = -118;
                    }
                } else {
                    arg3[arg2 + var7] = -121;
                }
            }
            ++field1547;
            return var6;
        }
    }
}
