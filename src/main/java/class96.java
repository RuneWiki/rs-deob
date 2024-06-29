import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class96 extends class194 {

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    private int field1125 = 1024;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    private int field1120 = 0;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    private int field1123 = 819;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    private int field1132 = 2048;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    private int field1131 = 1024;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    private int field1129 = 1024;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    private int field1133 = 1024;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    private int field1134 = 409;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    private int field1122 = 0;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Z")
    public static boolean field1121 = false;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Z")
    public static boolean field1124 = false;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field1126 = -1;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "I")
    public static int field1136 = 127;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lwo;")
    public static class285 field1135;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZIZIILbg;IIBI)V")
    public static final void method594(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, class242 arg7, int arg8, int arg9, byte arg10, int arg11) {
        if (~arg0 != -2) {
            if (~arg0 != -3) {
                if (~arg0 == -4) {
                    arg11 = 1;
                }
            } else {
                arg11 = 1;
                arg6 = 1;
            }
        } else {
            arg6 = 1;
        }
        ++field1117;
        if (~arg1 <= -1 && ~class22.field232 < ~arg1 && ~arg9 <= -1 && ~arg9 > ~class196.field2329) {
            if (!arg2 && !arg4) {
                class222.field2770[arg3][arg1][arg9] = 0;
            }
            while (true) {
                int var12 = arg7.method1563(-128);
                if (var12 == 0) {
                    if (!arg2) {
                        if (~arg3 != -1) {
                            class226.field2868[arg3][arg1 + arg11][arg6 + arg9] = class226.field2868[arg3 + -1][arg1 + arg11][arg9 - -arg6] + -240;
                        } else {
                            class226.field2868[0][arg1 + arg11][arg6 + arg9] = 8 * -class316.method1982(arg8 + 556238, (byte) -114, arg5 + 932731);
                        }
                    } else {
                        class226.field2868[0][arg1 + arg11][arg6 + arg9] = class219.field2709[0].method1050(arg1 + arg11, arg6 + arg9);
                    }
                    break;
                }
                if (~var12 == -2) {
                    int var13 = arg7.method1563(-128);
                    if (!arg2) {
                        if (~var13 == -2) {
                            var13 = 0;
                        }
                        if (arg3 != 0) {
                            class226.field2868[arg3][arg1 + arg11][arg6 + arg9] = class226.field2868[arg3 + -1][arg1 + arg11][arg6 + arg9] + -(var13 * 8);
                        } else {
                            class226.field2868[0][arg1 + arg11][arg6 + arg9] = -var13 * 8;
                        }
                    } else {
                        class226.field2868[0][arg1 + arg11][arg9 - -arg6] = var13 * 8 + class219.field2709[0].method1050(arg1 + arg11, arg9 - -arg6);
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg4) {
                        arg7.method1563(-128);
                    } else {
                        class102.field1186[arg3][arg1][arg9] = arg7.method1589(false);
                        class419.field5719[arg3][arg1][arg9] = (byte) ((var12 + -2) / 4);
                        class136.field1546[arg3][arg1][arg9] = (byte) class191.method1183(var12 + -2 + arg0, 3);
                    }
                } else if (~var12 >= -82) {
                    if (!arg2 && !arg4) {
                        class222.field2770[arg3][arg1][arg9] = (byte) (var12 + -49);
                    }
                } else if (!arg4) {
                    class168.field1959[arg3][arg1][arg9] = (byte) (var12 + -81);
                }
            }
        } else {
            while (true) {
                int var14 = arg7.method1563(arg10 ^ -128);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg7.method1563(-128);
                    break;
                }
                if (~var14 >= -50) {
                    arg7.method1563(-128);
                }
            }
        }
        if (arg10 != 0) {
            method595(76, 108);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
    public static final void method595(int arg0, int arg1) {
        ++field1119;
        int var2 = -27 % ((arg1 - 94) / 32);
        class90.field1051 = arg0;
        class365 var3 = class57.field654;
        synchronized (class57.field654) {
            class57.field654.method2298(0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V")
    public static final void method596(byte arg0, int arg1, int arg2) {
        ++field1116;
        if (arg0 < 44) {
            method594(127, -65, true, 8, true, 78, -102, (class242) null, 78, -122, (byte) 114, 23);
        }
        class12 var3 = class390.method2422(341555040, arg1, 5);
        var3.method66(-74);
        var3.field144 = arg2;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1137;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = -91 % ((57 - arg1) / 46);
        if (super.field2292.field3708) {
            int[][] var5 = super.field2292.method1780((byte) 116);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = 0;
            int var14 = 0;
            int var15 = class138.field1579 * this.field1125 >> 12;
            int var16 = class138.field1579 * this.field1132 >> 12;
            int var17 = class250.field3286 * this.field1134 >> 12;
            int var18 = class250.field3286 * this.field1123 >> 12;
            if (~var18 >= -2) {
                return var5[arg0];
            } else {
                this.field1128 = class138.field1579 / 8 * this.field1129 >> 12;
                int var19 = class138.field1579 / var15 + 1;
                int[][] var20 = new int[var19][3];
                int[][] var21 = new int[var19][3];
                Random var22 = new Random((long) this.field1122);
                while (true) {
                    while (true) {
                        int var23 = var15 + class174.method1096(-20548, var22, var16 - var15);
                        int var24 = class174.method1096(-20548, var22, -var17 + var18) + var17;
                        int var25 = var9 + var23;
                        if (var25 > class138.field1579) {
                            var23 = class138.field1579 - var9;
                            var25 = class138.field1579;
                        }
                        int var26;
                        if (var12) {
                            var26 = 0;
                        } else {
                            int var27 = var10;
                            int[] var28 = var21[var10];
                            int var29 = 0;
                            int var30 = var6 + var25;
                            if (~var30 > -1) {
                                var30 += class138.field1579;
                            }
                            if (~class138.field1579 > ~var30) {
                                var30 -= class138.field1579;
                            }
                            var26 = var28[2];
                            while (true) {
                                int[] var31 = var21[var27];
                                if (~var31[0] >= ~var30 && ~var31[1] <= ~var30) {
                                    if (~var10 != ~var27) {
                                        int var32 = var6 + var9;
                                        if (var32 < 0) {
                                            var32 += class138.field1579;
                                        }
                                        if (class138.field1579 < var32) {
                                            var32 -= class138.field1579;
                                        }
                                        for (int var33 = 1; var33 <= var29; ++var33) {
                                            int[] var41 = var21[(var10 - -var33) % var13];
                                            var26 = Math.max(var26, var41[2]);
                                        }
                                        for (int var34 = 0; ~var29 <= ~var34; ++var34) {
                                            int[] var35 = var21[(var10 + var34) % var13];
                                            int var36 = var35[2];
                                            if (var26 != var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (var32 < var30) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var30, var38);
                                                } else if (var37 == 0) {
                                                    var39 = 0;
                                                    var40 = Math.min(var30, var38);
                                                } else {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class138.field1579;
                                                }
                                                this.method597(false, var36, var8 + var39, -var39 + var40, var22, -var36 + var26, var5);
                                            }
                                        }
                                    }
                                    var10 = var27;
                                    break;
                                }
                                ++var27;
                                if (var13 <= var27) {
                                    var27 = 0;
                                }
                                ++var29;
                            }
                        }
                        if (~class250.field3286 > ~(var24 + var26)) {
                            var24 = -var26 + class250.field3286;
                        } else {
                            var11 = false;
                        }
                        if (~class138.field1579 != ~var25) {
                            int[] var42 = var20[var14++];
                            var42[1] = var25;
                            var42[2] = var24 + var26;
                            var42[0] = var9;
                            this.method597(false, var26, var7 + var9, var23, var22, var24, var5);
                            var9 = var25;
                        } else {
                            this.method597(false, var26, var9 - -var7, var23, var22, var24, var5);
                            if (var11) {
                                return var3;
                            }
                            var11 = true;
                            int[] var43 = var20[var14++];
                            var43[2] = var24 + var26;
                            var43[1] = var25;
                            var43[0] = var9;
                            int[][] var44 = var21;
                            var21 = var20;
                            var20 = var44;
                            var13 = var14;
                            var8 = var7;
                            var14 = 0;
                            var7 = class174.method1096(-20548, var22, class138.field1579);
                            var9 = 0;
                            var6 = -var8 + var7;
                            int var45 = var6;
                            if (var6 < 0) {
                                var45 = class138.field1579 + var6;
                            }
                            if (class138.field1579 < var45) {
                                var45 -= class138.field1579;
                            }
                            var10 = 0;
                            var12 = false;
                            while (true) {
                                int[] var46 = var21[var10];
                                if (~var45 <= ~var46[0] && ~var46[1] <= ~var45) {
                                    break;
                                }
                                int var10000 = ~var13;
                                ++var10;
                                if (var10000 >= ~var10) {
                                    var10 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIILjava/util/Random;I[[I)V")
    private final void method597(boolean arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int[][] arg6) {
        ++field1118;
        int var8 = ~this.field1131 >= -1 ? 4096 : -class174.method1096(-20548, arg4, this.field1131) + 4096;
        int var9 = this.field1133 * this.field1128 >> 12;
        int var10 = this.field1128 - (~var9 >= -1 ? 0 : class174.method1096(-20548, arg4, var9));
        if (arg0) {
            this.method597(false, 17, 38, -32, (Random) null, -56, (int[][]) null);
        }
        if (class138.field1579 <= arg2) {
            arg2 -= class138.field1579;
        }
        if (~var10 >= -1) {
            if (arg2 + arg3 <= class138.field1579) {
                for (int var11 = 0; arg5 > var11; ++var11) {
                    class114.method665(arg6[arg1 + var11], arg2, arg3, var8);
                }
            } else {
                int var12 = -arg2 + class138.field1579;
                for (int var13 = 0; arg5 > var13; ++var13) {
                    int[] var14 = arg6[arg1 + var13];
                    class114.method665(var14, arg2, var12, var8);
                    class114.method665(var14, 0, -var12 + arg3, var8);
                }
            }
        } else if (arg5 > 0 && arg3 > 0) {
            int var15 = arg3 / 2;
            int var16 = arg5 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = ~var16 <= ~var10 ? var10 : var16;
            int var19 = arg2 + var17;
            int var20 = -(var17 * 2) + arg3;
            for (int var21 = 0; ~arg5 < ~var21; ++var21) {
                int[] var22 = arg6[var21 - -arg1];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field1120 != 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class191.method1183(arg2 + var24, class442.field6113)] = var22[class191.method1183(-var24 + -1 + arg2 + arg3, class442.field6113)] = ~var25 > ~var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class191.method1183(class442.field6113, arg2 - -var26)] = var22[class191.method1183(arg2 - 1 + -var26 + arg3, class442.field6113)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) >= ~class138.field1579) {
                        class114.method665(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class138.field1579;
                        class114.method665(var22, var19, var27, var23);
                        class114.method665(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 + -1;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field1120 == 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class191.method1183(arg2 - -var31, class442.field6113)] = var22[class191.method1183(arg2 - -arg3 + (-var31 - 1), class442.field6113)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class191.method1183(arg2 - -var33, class442.field6113)] = var22[class191.method1183(class442.field6113, -var33 + arg2 + arg3 + -1)] = ~var30 < ~var35 ? var35 : var30;
                            }
                        }
                        if (class138.field1579 >= var19 + var20) {
                            class114.method665(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class138.field1579;
                            class114.method665(var22, var19, var34, var30);
                            class114.method665(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class191.method1183(arg2 + var36, class442.field6113)] = var22[class191.method1183(-var36 + arg2 + arg3 + -1, class442.field6113)] = var8 * var36 / var17;
                        }
                        if (~class138.field1579 > ~(var19 + var20)) {
                            int var37 = -var19 + class138.field1579;
                            class114.method665(var22, var19, var37, var8);
                            class114.method665(var22, 0, -var37 + var20, var8);
                        } else {
                            class114.method665(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1135 = null;
        if (arg0 != 20655) {
            field1121 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        int var2 = 105 / ((28 - arg0) / 63);
        ++field1130;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = 82 / ((52 - arg1) / 61);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field1131 = arg2.method1587((byte) -102);
                                        }
                                    } else {
                                        this.field1133 = arg2.method1587((byte) -102);
                                    }
                                } else {
                                    this.field1120 = arg2.method1563(-128);
                                }
                            } else {
                                this.field1129 = arg2.method1587((byte) -102);
                            }
                        } else {
                            this.field1123 = arg2.method1587((byte) -102);
                        }
                    } else {
                        this.field1134 = arg2.method1587((byte) -102);
                    }
                } else {
                    this.field1132 = arg2.method1587((byte) -102);
                }
            } else {
                this.field1125 = arg2.method1587((byte) -102);
            }
        } else {
            this.field1122 = arg2.method1563(-128);
        }
        ++field1127;
    }
}
