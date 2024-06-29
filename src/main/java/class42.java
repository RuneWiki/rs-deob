import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class42 extends class115 {

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lfi;")
    public static class331 field512 = new class331(64);

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLbk;I)V", line = 5)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 < 83) {
            this.method149((byte) 60, (class211) null, -19);
        }
        ++field515;
        if (arg2 == 0) {
            super.field1347 = ~arg1.method1342((byte) -128) == -2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[BIIILen;IZIIZ[Ldl;)[I", line = 22)
    public static final int[] method259(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class174 arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10, class39[] arg11) {
        ++field513;
        int var12 = (7 & arg2) * 8;
        int var13 = (7 & arg0) * 8;
        if (!arg7) {
            class39 var14 = arg11[arg9];
            for (int var15 = 0; ~var15 > -9; ++var15) {
                for (int var16 = 0; var16 < 8; ++var16) {
                    int var17 = class159.method1046(var15 & 7, arg6, var16 & 7, -121) + arg8;
                    int var18 = class186.method1196(var16 & 7, 3, var15 & 7, arg6) + arg4;
                    if (~var17 < -1 && ~var17 > ~(class279.field3935 + -1) && var18 > 0 && ~var18 > ~(class164.field2287 + -1)) {
                        var14.method234(var17, -2097153, var18);
                    }
                }
            }
        }
        byte var19;
        if (!arg7) {
            var19 = 4;
        } else {
            var19 = 1;
        }
        class211 var20 = new class211(arg1);
        int var21 = -64 & arg2 << 3;
        int var22 = (arg0 & -8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg6 == 1) {
            var24 = 1;
        } else if (~arg6 != -3) {
            if (arg6 == 3) {
                var23 = 1;
            }
        } else {
            var24 = 1;
            var23 = 1;
        }
        for (int var25 = 0; var25 < var19; ++var25) {
            for (int var58 = 0; ~var58 > -65; ++var58) {
                for (int var59 = 0; var59 < 64; ++var59) {
                    if (arg3 == var25 && ~var58 <= ~var12 && ~(var12 + 8) <= ~var58 && ~var59 <= ~var13 && ~(var13 + 8) <= ~var59) {
                        if (~(var12 + 8) != ~var58 && var13 + 8 != var59) {
                            int var60 = arg8 - -class159.method1046(var58 & 7, arg6, 7 & var59, -127);
                            int var61 = arg4 + class186.method1196(var59 & 7, 3, 7 & var58, arg6);
                            class256.method1596(2200, arg7, var20, var60, var22 + var59, arg9, var61, var24, arg6, var21 + var58, var23, false);
                            if (var58 == 63 || var59 == 63) {
                                int var62 = var58 != 63 ? var58 : 64;
                                int var63 = var59 != 63 ? var59 : 64;
                                int var64;
                                int var65;
                                if (~arg6 != -1) {
                                    if (~arg6 == -2) {
                                        var64 = arg8 - -var63 + -var13;
                                        var65 = var12 - var62 + arg4 + 8;
                                    } else if (~arg6 == -3) {
                                        var65 = arg4 + 8 - (-var13 + var63);
                                        var64 = arg8 - (-8 - var12) + -var62;
                                    } else {
                                        var65 = -var12 - -var62 + arg4;
                                        var64 = arg8 + 8 + -var63 - -var13;
                                    }
                                } else {
                                    var65 = -var13 - (-var63 - arg4);
                                    var64 = var62 - var12 + arg8;
                                }
                                if (~var64 <= -1 && var64 < class279.field3935 && var65 >= 0 && var65 < class164.field2287) {
                                    class30.field278[arg9][var64][var65] = class30.field278[arg9][var23 + var60][var24 + var61];
                                }
                            }
                        } else {
                            int var66;
                            int var67;
                            if (~arg6 != -1) {
                                if (arg6 != 1) {
                                    if (~arg6 != -3) {
                                        var66 = -var12 + var58 + arg4;
                                        var67 = -var59 - (-var13 - (arg8 - -8));
                                    } else {
                                        var67 = var12 - (var58 - arg8 - 8);
                                        var66 = -var59 + var13 + arg4 + 8;
                                    }
                                } else {
                                    var66 = arg4 + 8 + var12 + -var58;
                                    var67 = -var13 + var59 + arg8;
                                }
                            } else {
                                var66 = -var13 - (-var59 - arg4);
                                var67 = arg8 - (-var58 + var12);
                            }
                            class256.method1596(2200, arg7, var20, var67, var22 - -var59, arg9, var66, 0, 0, var21 + var58, 0, true);
                        }
                    } else {
                        class256.method1596(2200, arg7, var20, -1, 0, 0, -1, 0, 0, 0, 0, false);
                    }
                }
            }
        }
        boolean var26 = false;
        while (~var20.field2888 > ~var20.field2867.length) {
            int var27 = var20.method1342((byte) -127);
            if (~var27 == -129) {
                class369.field5417[0] = var20.method1355(32136);
                class369.field5417[1] = var20.method1344((byte) -4);
                class369.field5417[2] = var20.method1344((byte) -4);
                class369.field5417[3] = var20.method1344((byte) -4);
                class369.field5417[4] = var20.method1355(32136);
                var26 = true;
            } else {
                if (~var27 != -130) {
                    --var20.field2888;
                    break;
                }
                if (class228.field3115 == null) {
                    class228.field3115 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; ++var45) {
                    byte var46 = var20.method1373((byte) 30);
                    if (var46 == 0 && class228.field3115[arg9] != null) {
                        if (~var45 >= ~arg3) {
                            int var47 = arg8;
                            int var48 = arg8 - -7;
                            int var49 = arg4;
                            if (~arg4 > -1) {
                                var49 = 0;
                            } else if (~arg4 <= ~class164.field2287) {
                                var49 = class164.field2287;
                            }
                            int var50 = arg4 - -7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (~class279.field3935 >= ~var48) {
                                var48 = class279.field3935;
                            }
                            if (~arg8 > -1) {
                                var47 = 0;
                            } else if (~class279.field3935 >= ~arg8) {
                                var47 = class279.field3935;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (~var50 <= ~class164.field2287) {
                                var50 = class164.field2287;
                            }
                            while (var48 > var47) {
                                while (var49 < var50) {
                                    class228.field3115[arg9][var47][var49] = 0;
                                    ++var49;
                                }
                                ++var47;
                            }
                        }
                    } else if (~var46 == -2) {
                        if (class228.field3115[arg9] == null) {
                            class228.field3115[arg9] = new byte[class279.field3935 + 1][class164.field2287 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method1373((byte) 30);
                                if (arg3 >= var45) {
                                    for (int var54 = var51; var54 < var51 - -4; ++var54) {
                                        for (int var55 = var52; var55 < var52 - -4; ++var55) {
                                            if (~var54 <= ~var12 && var12 + 8 > var54 && ~var13 >= ~var55 && ~(var13 + 8) < ~var13) {
                                                int var56 = arg8 - -class159.method1046(7 & var54, arg6, 7 & var55, -120);
                                                int var57 = arg4 + class186.method1196(7 & var55, 3, var54 & 7, arg6);
                                                if (var56 >= 0 && var56 < class279.field3935 && ~var57 <= -1 && var57 < class164.field2287) {
                                                    class228.field3115[arg9][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg7) {
            class249 var29 = null;
            while (true) {
                while (~var20.field2867.length < ~var20.field2888) {
                    int var30 = var20.method1342((byte) -127);
                    if (~var30 == -1) {
                        var29 = new class249(var20);
                    } else if (var30 == 1) {
                        int var31 = var20.method1342((byte) -126);
                        if (var31 > 0) {
                            for (int var32 = 0; ~var32 > ~var31; ++var32) {
                                class66 var33 = new class66(var20);
                                if (~var33.field738 == -32) {
                                    class373 var34 = class342.method2194(var20.method1355(32136), (byte) 126);
                                    var33.method393(var34.field5452, var34.field5449, var34.field5444, (byte) -122, var34.field5446);
                                }
                                int var35 = var33.field309 >> 7;
                                int var36 = var33.field311 >> 7;
                                if (~var33.field750 == ~arg3 && var35 >= var12 && var35 < var12 + 8 && ~var36 <= ~var13 && var36 < var13 + 8) {
                                    int var37 = (arg8 << 7) - -class281.method1796(arg6, 2, var33.field309 & 1023, 1023 & var33.field311);
                                    int var38 = class300.method1898(var33.field309 & 1023, arg6, (byte) 108, 1023 & var33.field311) + (arg4 << 7);
                                    var33.field309 = var37;
                                    var33.field311 = var38;
                                    int var39 = var33.field311 >> 7;
                                    int var40 = var33.field309 >> 7;
                                    if (var40 >= 0 && var39 >= 0 && var40 < class279.field3935 && ~var39 > ~class164.field2287) {
                                        var33.field304 = class30.field278[arg3][var40][var39] + -var33.field304;
                                        if (~arg5.method994() < -1) {
                                            class299.method1889(var33);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (~var30 != -3) {
                            throw new IllegalStateException();
                        }
                        if (var29 == null) {
                            var29 = new class249();
                        }
                        var29.method1566(var20, -111);
                    }
                }
                if (var29 != null) {
                    class319.method1985(arg8 >> 3, arg4 >> 3, var29, 64);
                }
                break;
            }
        }
        if (!arg10 && class228.field3115 != null && class228.field3115[arg9] != null) {
            int var41 = arg8 + 7;
            int var42 = arg4 - -7;
            for (int var43 = arg8; var43 < var41; ++var43) {
                for (int var44 = arg4; ~var42 < ~var44; ++var44) {
                    class228.field3115[arg9][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class369.field5417;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V", line = 494)
    public static final void method260(int arg0) {
        class257.field3504.method987(class191.field2604, class443.field6476, class351.field5130);
        ++field509;
        if (arg0 != 0) {
            field512 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V", line = 507)
    public static final void method261(int arg0, byte arg1) {
        ++field517;
        class351.field5125.method2054(-54, arg0);
        if (arg1 == -99) {
            class437.field6406.method2054(arg1 ^ 21, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "(I)V", line = 520)
    public static void method262(int arg0) {
        field512 = null;
        if (arg0 != 8) {
            method260(-109);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)V", line = 530)
    public static final void method263(boolean arg0, boolean arg1) {
        ++field514;
        if (arg0) {
            method259(120, (byte[]) null, 75, -102, -91, (class174) null, -91, true, -62, -94, false, (class39[]) null);
        }
        if (class281.field3962 != arg1) {
            class281.field3962 = arg1;
            class252.method1576(127);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[[I", line = 547)
    public final int[][] method144(int arg0, int arg1) {
        ++field510;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 95);
        int var4 = -118 % ((-80 - arg1) / 45);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class218.field2979; ++var12) {
                var9[var12] = 4096 - var6[var12];
                var10[var12] = 4096 - var7[var12];
                var11[var12] = -var8[var12] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "(I)V", line = 592)
    public static final void method264(int arg0) {
        class175.field2435.method2052(0);
        ++field516;
        class72.field808.method2052(arg0 + arg0);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[I", line = 605)
    public final int[] method57(int arg0, int arg1) {
        ++field508;
        int[] var3 = super.field1340.method14(111, arg0);
        if (arg1 != 0) {
            method263(false, true);
        }
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0);
            for (int var5 = 0; var5 < class218.field2979; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 637)
    public class42() {
        super(1, false);
    }
}
