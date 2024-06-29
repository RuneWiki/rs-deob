import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class24 extends class175 {

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Lij;")
    public static class50 field527 = class78.method578(123, "Mem:");

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "Lij;")
    public static class50 field526 = class78.method578(122, "Ausw-=hlen");

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static volatile int field534 = 0;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "Lv;")
    public static class143 field531;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "Lwi;")
    public static class21 field530;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            method235(false, (byte[]) null);
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        ++field533;
        if (super.field2941.field3565) {
            class105.method794(var3, 0, class211.field3514, this.field536);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            field531 = null;
        }
        if (~arg1 == -1) {
            this.field536 = (arg2.method1487(255) << 12) / 255;
        }
        ++field535;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class139.field2421 * 128) {
            arg0 = class139.field2421 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class54.field978 * 128) {
            arg2 = class54.field978 * 128 - 1;
        }
        class238.field4036 = class13.field313[arg3];
        class60.field1119 = class13.field311[arg3];
        class48.field863 = class13.field313[arg4];
        class229.field3839 = class13.field311[arg4];
        class97.field1815 = arg0;
        class17.field382 = arg1;
        class108.field1934 = arg2;
        class65.field1229 = arg0 / 128;
        class136.field2363 = arg2 / 128;
        class20.field424 = arg5;
        class250.field4331 = class65.field1229 - class80.field1461;
        if (class250.field4331 < 0) {
            class250.field4331 = 0;
        }
        class63.field1200 = class136.field2363 - class80.field1461;
        if (class63.field1200 < 0) {
            class63.field1200 = 0;
        }
        class42.field780 = class80.field1461 + class65.field1229;
        if (class42.field780 > class139.field2421) {
            class42.field780 = class139.field2421;
        }
        class54.field981 = class80.field1461 + class136.field2363;
        if (class54.field981 > class54.field978) {
            class54.field981 = class54.field978;
        }
        short var16 = 3500;
        for (int var17 = 0; var17 < class80.field1461 + class80.field1461 + 2; ++var17) {
            for (int var20 = 0; var20 < class80.field1461 + class80.field1461 + 2; ++var20) {
                int var21 = (var17 - class80.field1461 << 7) - (class97.field1815 & 127);
                int var22 = (var20 - class80.field1461 << 7) - (class108.field1934 & 127);
                int var23 = class65.field1229 - class80.field1461 + var17;
                int var24 = class136.field2363 - class80.field1461 + var20;
                if (var23 >= 0 && var24 >= 0 && var23 < class139.field2421 && var24 < class54.field978) {
                    int var25;
                    if (class100.field1854 != null) {
                        var25 = class100.field1854[0][var23][var24] - class17.field382 + 128;
                    } else {
                        var25 = class254.field4390[0][var23][var24] - class17.field382 + 128;
                    }
                    int var26 = class254.field4390[3][var23][var24] - class17.field382 - 1000;
                    class35.field679[var17][var20] = class101.method771(var21, var26, var25, var22, var16);
                } else {
                    class35.field679[var17][var20] = false;
                }
            }
        }
        for (int var18 = 0; var18 < class80.field1461 + class80.field1461 + 1; ++var18) {
            for (int var19 = 0; var19 < class80.field1461 + class80.field1461 + 1; ++var19) {
                class210.field3497[var18][var19] = class35.field679[var18][var19] || class35.field679[var18 + 1][var19] || class35.field679[var18][var19 + 1] || class35.field679[var18 + 1][var19 + 1];
            }
        }
        class208.field3459 = arg7;
        class94.field1754 = arg8;
        class84.field1593 = arg9;
        class240.field4127 = arg10;
        class153.field2676 = arg11;
        class100.method766();
        class235.method1588(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
    private class24(int arg0) {
        super(0, true);
        this.field536 = 4096;
        this.field536 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z[B)V")
    public static final void method235(boolean arg0, byte[] arg1) {
        int var2 = 0;
        while (true) {
            while (var2 < arg1.length) {
                int var3 = -class90.field1714 + (255 & arg1[var2++]) * 64;
                int var4 = (255 & arg1[var2++]) * 64 + -class46.field847;
                if (~var3 < -1 && var4 > 0 && var3 + 64 < class155.field2701 && class140.field2460 > var4 - -64) {
                    int var5 = var3 >> 6;
                    int var6 = class140.field2460 - var4 - 1 >> 6;
                    for (int var7 = 0; ~var7 > -65; ++var7) {
                        for (int var8 = -64; var8 < 0; ++var8) {
                            byte var9 = arg1[var2++];
                            if (~var9 != -1) {
                                if (class250.field4332[var5][var6] == null) {
                                    class250.field4332[var5][var6] = new byte[4096];
                                }
                                class250.field4332[var5][var6][(-(var8 + 1) << 6) - -var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class203.field3374[var5][var6] == null) {
                                    class203.field3374[var5][var6] = new byte[4096];
                                }
                                class203.field3374[var5][var6][(-(1 - -var8) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; ++var11) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            ++var2;
                        }
                    }
                }
            }
            if (!arg0) {
                method238();
            }
            ++field529;
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method236(boolean arg0) {
        field531 = null;
        field526 = null;
        if (arg0) {
            field530 = null;
            field527 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZIIIIZIILlj;)V")
    public static final void method237(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class44 arg10) {
        ++field528;
        if (arg2 && !class174.method1198(0) && ~(class210.field3495[0][arg8][arg5] & 2) == -1) {
            if (~(class210.field3495[arg0][arg8][arg5] & 16) != -1) {
                return;
            }
            if (~class170.method1181(arg8, (byte) 76, arg0, arg5) != ~class93.field1746) {
                return;
            }
        }
        if (class139.field2416 > arg0) {
            class139.field2416 = arg0;
        }
        class243 var11 = class53.method426((byte) -90, arg4);
        int var12;
        int var13;
        if (~arg1 != -2 && arg1 != 3) {
            var12 = var11.field4223;
            var13 = var11.field4235;
        } else {
            var12 = var11.field4235;
            var13 = var11.field4223;
        }
        int var14;
        int var15;
        if (arg8 + var12 > 104) {
            var14 = arg8;
            var15 = arg8 + 1;
        } else {
            var15 = (var12 + 1 >> 1) + arg8;
            var14 = (var12 >> 1) + arg8;
        }
        int var16;
        int var17;
        if (arg5 + var13 <= 104) {
            var16 = arg5 - -(var13 + 1 >> 1);
            var17 = (var13 >> 1) + arg5;
        } else {
            var17 = arg5;
            var16 = arg5 + 1;
        }
        int[][] var18 = class245.field4257[arg3];
        int var19 = var18[var14][var17] - (-var18[var14][var16] + -var18[var15][var16] + -var18[var15][var17]) >> 2;
        int var20 = (arg8 << 7) + (var12 << 6);
        int var21 = (arg5 << 7) - -(var13 << 6);
        long var22 = (long) (1073741824 | arg9 << 14 | arg8 | arg5 << 7 | arg1 << 20);
        if (~var11.field4190 == -1 || arg7) {
            var22 |= Long.MIN_VALUE;
        }
        int[][] var24 = null;
        if (!arg7) {
            if (~arg3 > -4) {
                var24 = class245.field4257[arg3 + 1];
            }
        } else {
            var24 = class254.field4390[0];
        }
        if (~var11.field4231 == -2) {
            var22 |= 4194304L;
        }
        if (var11.field4217) {
            var22 |= -2147483648L;
        }
        long var25 = var22 | (long) arg4 << 32;
        if (var11.method1656(10669)) {
            class121.method881((class53) null, arg1, (class187) null, true, arg5, var11, arg0, arg8);
        }
        boolean var27 = !arg7 & var11.field4178;
        if (~arg9 == -23) {
            if (class172.field2878 || ~var11.field4190 != -1 || var11.field4174 == 1 || var11.field4199) {
                class16 var29;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var28 = var11.method1652(var19, var20, var24, arg2, (byte) -74, var27, (class67) null, 22, var21, var18, arg1);
                    var29 = var28.field3543;
                } else {
                    var29 = new class256(arg4, 22, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class217.method1459(arg0, arg8, arg5, var19, var29, var25, var11.field4226);
                if (var11.field4174 == 1 && arg10 != null) {
                    arg10.method333(arg5, arg8, 1);
                }
            }
        } else if (~arg9 != -11 && arg9 != 11) {
            if (~arg9 <= -13) {
                class16 var31;
                if (~var11.field4202 == 0 && var11.field4197 == null) {
                    class214 var30 = var11.method1652(var19, var20, var24, arg2, (byte) -122, var27, (class67) null, arg9, var21, var18, arg1);
                    var31 = var30.field3543;
                } else {
                    var31 = new class256(arg4, arg9, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class173.method1196(arg0, arg8, arg5, var19, 1, 1, var31, 0, var25);
                if (arg2 && ~arg9 <= -13 && arg9 <= 17 && ~arg9 != -14 && ~arg0 < -1) {
                    class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 2340);
                }
                if (var11.field4174 != 0 && arg10 != null) {
                    arg10.method340(var13, (byte) -89, var11.field4232, var12, arg8, arg5);
                }
            } else if (arg9 == 0) {
                class16 var33;
                if (~var11.field4202 == 0 && var11.field4197 == null) {
                    class214 var32 = var11.method1652(var19, var20, var24, arg2, (byte) -61, var27, (class67) null, 0, var21, var18, arg1);
                    var33 = var32.field3543;
                } else {
                    var33 = new class256(arg4, 0, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class97.method730(arg0, arg8, arg5, var19, var33, (class16) null, class83.field1551[arg1], 0, var25);
                if (arg2) {
                    if (arg1 == 0) {
                        if (var11.field4212) {
                            class196.field3250[arg0][arg8][arg5] = 50;
                            class196.field3250[arg0][arg8][arg5 + 1] = 50;
                        }
                        if (var11.field4233) {
                            class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 585);
                        }
                    } else if (arg1 == 1) {
                        if (var11.field4212) {
                            class196.field3250[arg0][arg8][arg5 + 1] = 50;
                            class196.field3250[arg0][arg8 - -1][arg5 + 1] = 50;
                        }
                        if (var11.field4233) {
                            class179.field2984[arg0][arg8][arg5 + 1] = class29.method261(class179.field2984[arg0][arg8][arg5 + 1], 1170);
                        }
                    } else if (~arg1 != -3) {
                        if (arg1 == 3) {
                            if (var11.field4212) {
                                class196.field3250[arg0][arg8][arg5] = 50;
                                class196.field3250[arg0][arg8 + 1][arg5] = 50;
                            }
                            if (var11.field4233) {
                                class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 1170);
                            }
                        }
                    } else {
                        if (var11.field4212) {
                            class196.field3250[arg0][arg8 + 1][arg5] = 50;
                            class196.field3250[arg0][arg8 + 1][arg5 + 1] = 50;
                        }
                        if (var11.field4233) {
                            class179.field2984[arg0][arg8 - -1][arg5] = class29.method261(class179.field2984[arg0][arg8 - -1][arg5], 585);
                        }
                    }
                }
                if (var11.field4174 != 0 && arg10 != null) {
                    arg10.method330(-4011, arg5, arg1, arg8, arg9, var11.field4232);
                }
                if (~var11.field4239 != -17) {
                    class215.method1425(arg0, arg8, arg5, var11.field4239);
                }
            } else if (~arg9 == -2) {
                class16 var35;
                if (~var11.field4202 == 0 && var11.field4197 == null) {
                    class214 var34 = var11.method1652(var19, var20, var24, arg2, (byte) -115, var27, (class67) null, 1, var21, var18, arg1);
                    var35 = var34.field3543;
                } else {
                    var35 = new class256(arg4, 1, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class97.method730(arg0, arg8, arg5, var19, var35, (class16) null, client.field1536[arg1], 0, var25);
                if (var11.field4212 && arg2) {
                    if (arg1 == 0) {
                        class196.field3250[arg0][arg8][arg5 + 1] = 50;
                    } else if (~arg1 == -2) {
                        class196.field3250[arg0][arg8 + 1][arg5 - -1] = 50;
                    } else if (arg1 != 2) {
                        if (arg1 == 3) {
                            class196.field3250[arg0][arg8][arg5] = 50;
                        }
                    } else {
                        class196.field3250[arg0][arg8 + 1][arg5] = 50;
                    }
                }
                if (~var11.field4174 != -1 && arg10 != null) {
                    arg10.method330(-4011, arg5, arg1, arg8, arg9, var11.field4232);
                }
            } else if (~arg9 == -3) {
                int var36 = arg1 + 1 & 3;
                class16 var38;
                class16 var40;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var37 = var11.method1652(var19, var20, var24, arg2, (byte) -66, var27, (class67) null, 2, var21, var18, 4 - -arg1);
                    var38 = var37.field3543;
                    class214 var39 = var11.method1652(var19, var20, var24, arg2, (byte) -123, var27, (class67) null, 2, var21, var18, var36);
                    var40 = var39.field3543;
                } else {
                    var38 = new class256(arg4, 2, arg1 + 4, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                    var40 = new class256(arg4, 2, var36, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class97.method730(arg0, arg8, arg5, var19, var38, var40, class83.field1551[arg1], class83.field1551[var36], var25);
                if (var11.field4233 && arg2) {
                    if (arg1 != 0) {
                        if (arg1 != 1) {
                            if (~arg1 == -3) {
                                class179.field2984[arg0][arg8 + 1][arg5] = class29.method261(class179.field2984[arg0][arg8 + 1][arg5], 585);
                                class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 1170);
                            } else if (arg1 == 3) {
                                class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 1170);
                                class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 585);
                            }
                        } else {
                            class179.field2984[arg0][arg8][arg5 + 1] = class29.method261(class179.field2984[arg0][arg8][arg5 + 1], 1170);
                            class179.field2984[arg0][arg8 - -1][arg5] = class29.method261(class179.field2984[arg0][arg8 - -1][arg5], 585);
                        }
                    } else {
                        class179.field2984[arg0][arg8][arg5] = class29.method261(class179.field2984[arg0][arg8][arg5], 585);
                        class179.field2984[arg0][arg8][arg5 + 1] = class29.method261(class179.field2984[arg0][arg8][arg5 + 1], 1170);
                    }
                }
                if (~var11.field4174 != -1 && arg10 != null) {
                    arg10.method330(-4011, arg5, arg1, arg8, arg9, var11.field4232);
                }
                if (~var11.field4239 != -17) {
                    class215.method1425(arg0, arg8, arg5, var11.field4239);
                }
            } else if (~arg9 == -4) {
                class16 var42;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var41 = var11.method1652(var19, var20, var24, arg2, (byte) -57, var27, (class67) null, 3, var21, var18, arg1);
                    var42 = var41.field3543;
                } else {
                    var42 = new class256(arg4, 3, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class97.method730(arg0, arg8, arg5, var19, var42, (class16) null, client.field1536[arg1], 0, var25);
                if (var11.field4212 && arg2) {
                    if (arg1 != 0) {
                        if (~arg1 != -2) {
                            if (arg1 != 2) {
                                if (arg1 == 3) {
                                    class196.field3250[arg0][arg8][arg5] = 50;
                                }
                            } else {
                                class196.field3250[arg0][arg8 - -1][arg5] = 50;
                            }
                        } else {
                            class196.field3250[arg0][arg8 - -1][arg5 + 1] = 50;
                        }
                    } else {
                        class196.field3250[arg0][arg8][arg5 - -1] = 50;
                    }
                }
                if (var11.field4174 != 0 && arg10 != null) {
                    arg10.method330(-4011, arg5, arg1, arg8, arg9, var11.field4232);
                }
            } else if (arg9 == 9) {
                class16 var44;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var43 = var11.method1652(var19, var20, var24, arg2, (byte) -90, var27, (class67) null, arg9, var21, var18, arg1);
                    var44 = var43.field3543;
                } else {
                    var44 = new class256(arg4, arg9, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class173.method1196(arg0, arg8, arg5, var19, 1, 1, var44, 0, var25);
                if (var11.field4174 != 0 && arg10 != null) {
                    arg10.method340(var13, (byte) -82, var11.field4232, var12, arg8, arg5);
                }
                if (~var11.field4239 != -17) {
                    class215.method1425(arg0, arg8, arg5, var11.field4239);
                }
            } else if (~arg9 == -5) {
                class16 var46;
                if (~var11.field4202 == 0 && var11.field4197 == null) {
                    class214 var45 = var11.method1652(var19, var20, var24, arg2, (byte) -57, var27, (class67) null, 4, var21, var18, arg1);
                    var46 = var45.field3543;
                } else {
                    var46 = new class256(arg4, 4, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class217.method1451(arg0, arg8, arg5, var19, var46, (class16) null, class83.field1551[arg1], 0, 0, 0, var25);
            } else if (arg9 == 5) {
                int var47 = 16;
                long var48 = class176.method1212(arg0, arg8, arg5);
                if (var48 != 0L) {
                    var47 = class53.method426((byte) -90, Integer.MAX_VALUE & (int) (var48 >>> 32)).field4239;
                }
                class16 var51;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var50 = var11.method1652(var19, var20, var24, arg2, (byte) -55, var27, (class67) null, 4, var21, var18, arg1);
                    var51 = var50.field3543;
                } else {
                    var51 = new class256(arg4, 4, arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class217.method1451(arg0, arg8, arg5, var19, var51, (class16) null, class83.field1551[arg1], 0, class41.field753[arg1] * var47, class254.field4389[arg1] * var47, var25);
            } else if (~arg9 == -7) {
                long var52 = class176.method1212(arg0, arg8, arg5);
                int var54 = 8;
                if (~var52 != -1L) {
                    var54 = class53.method426((byte) -90, Integer.MAX_VALUE & (int) (var52 >>> 32)).field4239 / 2;
                }
                class16 var56;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var55 = var11.method1652(var19, var20, var24, arg2, (byte) -115, var27, (class67) null, 4, var21, var18, arg1 - -4);
                    var56 = var55.field3543;
                } else {
                    var56 = new class256(arg4, 4, arg1 + 4, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class217.method1451(arg0, arg8, arg5, var19, var56, (class16) null, 256, arg1, class65.field1250[arg1] * var54, class146.field2527[arg1] * var54, var25);
            } else if (arg9 == 7) {
                int var57 = arg1 + 2 & 3;
                class16 var59;
                if (~var11.field4202 == 0 && var11.field4197 == null) {
                    class214 var58 = var11.method1652(var19, var20, var24, arg2, (byte) -70, var27, (class67) null, 4, var21, var18, var57 + 4);
                    var59 = var58.field3543;
                } else {
                    var59 = new class256(arg4, 4, var57 + 4, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class217.method1451(arg0, arg8, arg5, var19, var59, (class16) null, 256, var57, 0, 0, var25);
            } else if (arg9 == 8) {
                int var60 = 8;
                long var61 = class176.method1212(arg0, arg8, arg5);
                if (~var61 != -1L) {
                    var60 = class53.method426((byte) -90, Integer.MAX_VALUE & (int) (var61 >>> 32)).field4239 / 2;
                }
                int var63 = arg1 + 2 & 3;
                class16 var65;
                class16 var67;
                if (var11.field4202 == -1 && var11.field4197 == null) {
                    class214 var64 = var11.method1652(var19, var20, var24, arg2, (byte) -74, var27, (class67) null, 4, var21, var18, arg1 + 4);
                    var65 = var64.field3543;
                    class214 var66 = var11.method1652(var19, var20, var24, arg2, (byte) -127, var27, (class67) null, 4, var21, var18, var63 + 4);
                    var67 = var66.field3543;
                } else {
                    var65 = new class256(arg4, 4, arg1 + 4, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                    var67 = new class256(arg4, 4, var63 + 4, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
                }
                class217.method1451(arg0, arg8, arg5, var19, var65, var67, 256, arg1, class65.field1250[arg1] * var60, class146.field2527[arg1] * var60, var25);
            } else {
                int var68 = -95 % ((arg6 - 66) / 38);
            }
        } else {
            class16 var70;
            if (var11.field4202 == -1 && var11.field4197 == null) {
                class214 var69 = var11.method1652(var19, var20, var24, arg2, (byte) -72, var27, (class67) null, 10, var21, var18, arg9 != 11 ? arg1 : arg1 + 4);
                var70 = var69.field3543;
            } else {
                var70 = new class256(arg4, 10, ~arg9 == -12 ? arg1 + 4 : arg1, arg3, arg8, arg5, var11.field4202, var11.field4237, (class16) null);
            }
            if (var70 != null) {
                boolean var71 = class173.method1196(arg0, arg8, arg5, var19, var12, var13, var70, 0, var25);
                if (var11.field4212 && var71 && arg2) {
                    int var72 = 15;
                    if (var70 instanceof class98) {
                        var72 = ((class98) var70).method748() / 4;
                        if (~var72 < -31) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var12 >= var73; ++var73) {
                        for (int var74 = 0; var13 >= var74; ++var74) {
                            if (var72 > class196.field3250[arg0][arg8 + var73][arg5 - -var74]) {
                                class196.field3250[arg0][arg8 + var73][arg5 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field4174 != 0 && arg10 != null) {
                arg10.method340(var13, (byte) -106, var11.field4232, var12, arg8, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class24() {
        this(4096);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
    public static final void method238() {
        for (int var0 = 0; var0 < class127.field2225; ++var0) {
            class106 var1 = class187.field3064[var0];
            class223.method1529(var1);
            class187.field3064[var0] = null;
        }
        class127.field2225 = 0;
    }
}
