import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class218 extends class117 {

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    private int field3966 = 2048;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
    private int field3972 = 3072;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    private int field3971 = 1024;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!sj", name = "fb", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 == 0) {
            ++field3967;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field2208 = arg2.method622(true) == 1;
                    }
                } else {
                    this.field3972 = arg2.method658(arg0 ^ -84);
                }
            } else {
                this.field3971 = arg2.method658(84);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            this.method90(-7, true);
        }
        ++field3963;
        int[][] var3 = super.field2228.method1304(arg0, (byte) 124);
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(arg0, -116, 0);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class143.field2702 < ~var11; ++var11) {
                var6[var11] = (var8[var11] * this.field3966 >> 12) + this.field3971;
                var9[var11] = (var5[var11] * this.field3966 >> 12) + this.field3971;
                var10[var11] = this.field3971 - -(var7[var11] * this.field3966 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3964;
        if (arg0 != -21393) {
            method1550(73);
        }
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 0);
            for (int var5 = 0; class143.field2702 > var5; ++var5) {
                var3[var5] = this.field3971 - -(var4[var5] * this.field3966 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 <= -92) {
            ++field3973;
            this.field3966 = -this.field3971 + this.field3972;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([S[Lhh;I)V")
    public static final void method1547(short[] arg0, class163[] arg1, int arg2) {
        class178.method1315((byte) -56, arg0, arg1.length + arg2, arg1, 0);
        ++field3976;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JI)V")
    public static final void method1548(long arg0, int arg1) {
        ++field3969;
        if (arg0 != 0L) {
            if (arg1 == -1607) {
                for (int var3 = 0; ~class29.field465 < ~var3; ++var3) {
                    if (~class116.field2207[var3] == ~arg0) {
                        --class29.field465;
                        for (int var4 = var3; class29.field465 > var4; ++var4) {
                            class116.field2207[var4] = class116.field2207[var4 + 1];
                            class11.field171[var4] = class11.field171[var4 + 1];
                        }
                        class208.field3780 = class24.field384;
                        ++class157.field2910;
                        class191.field3499.method75(56, 52);
                        class191.field3499.method651(-645765520, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZIILcg;IIZIII)V")
    public static final void method1549(boolean arg0, boolean arg1, int arg2, int arg3, class1 arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field3975;
        if (arg7 && !class177.method1310(4643) && ~(2 & class123.field2344[0][arg6][arg5]) == -1) {
            if ((16 & class123.field2344[arg8][arg6][arg5]) != 0) {
                return;
            }
            if (class76.method561((byte) -99, arg8, arg6, arg5) != class233.field4167) {
                return;
            }
        }
        if (class76.field1429 > arg8) {
            class76.field1429 = arg8;
        }
        class35 var11 = class9.method64(false, arg3);
        int var12;
        int var13;
        if (~arg2 != -2 && arg2 != 3) {
            var12 = var11.field591;
            var13 = var11.field574;
        } else {
            var13 = var11.field591;
            var12 = var11.field574;
        }
        int var14;
        int var15;
        if (arg5 - -var12 <= 104) {
            var14 = (var12 + 1 >> 1) + arg5;
            var15 = (var12 >> 1) + arg5;
        } else {
            var14 = arg5 - -1;
            var15 = arg5;
        }
        int var16;
        int var17;
        if (arg6 + var13 <= 104) {
            var16 = (var13 + 1 >> 1) + arg6;
            var17 = arg6 - -(var13 >> 1);
        } else {
            var17 = arg6;
            var16 = arg6 + 1;
        }
        int[][] var18 = class228.field4107[arg9];
        int var19 = var18[var16][var15] + var18[var17][var14] + var18[var17][var15] + var18[var16][var14] >> 2;
        int var20 = (arg6 << 7) - -(var13 << 6);
        int var21 = (arg5 << 7) + (var12 << 6);
        if (!arg1) {
            method1548(38L, -73);
        }
        int[][] var22 = null;
        if (!arg0) {
            if (arg9 < 3) {
                var22 = class228.field4107[arg9 - -1];
            }
        } else {
            var22 = class161.field2958[0];
        }
        long var23 = (long) (arg2 << 20 | arg5 << 7 | arg6 | arg10 << 14 | 1073741824);
        if (var11.field598 == 0 || arg0) {
            var23 |= Long.MIN_VALUE;
        }
        if (~var11.field562 == -2) {
            var23 |= 4194304L;
        }
        if (var11.field594) {
            var23 |= 2147483648L;
        }
        long var25 = var23 | (long) arg3 << 32;
        if (var11.method259((byte) 79)) {
            class175.method1300(arg8, var11, arg5, false, (class2) null, arg2, (class126) null, arg6);
        }
        boolean var27 = !arg0 & var11.field539;
        if (arg10 == 22) {
            if (class119.field2247 || var11.field598 != 0 || ~var11.field570 == -2 || var11.field564) {
                class165 var29;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var28 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 89, 22, arg2);
                    var29 = var28.field3777;
                } else {
                    var29 = new class3(arg3, 22, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class231.method1605(arg8, arg6, arg5, var19, var29, var25, var11.field593);
                if (var11.field570 == 1 && arg4 != null) {
                    arg4.method2(arg6, -111, arg5);
                }
            }
        } else if (~arg10 != -11 && ~arg10 != -12) {
            if (arg10 >= 12) {
                class165 var31;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var30 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 63, arg10, arg2);
                    var31 = var30.field3777;
                } else {
                    var31 = new class3(arg3, arg10, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class39.method274(arg8, arg6, arg5, var19, 1, 1, var31, 0, var25);
                if (arg7 && ~arg10 <= -13 && arg10 <= 17 && arg10 != 13 && ~arg8 < -1) {
                    class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 4);
                }
                if (var11.field570 != 0 && arg4 != null) {
                    arg4.method18(var11.field601, arg5, var13, (byte) 23, arg6, var12);
                }
            } else if (arg10 == 0) {
                class165 var33;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var32 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 100, 0, arg2);
                    var33 = var32.field3777;
                } else {
                    var33 = new class3(arg3, 0, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class62.method429(arg8, arg6, arg5, var19, var33, (class165) null, class40.field666[arg2], 0, var25);
                if (arg7) {
                    if (arg2 != 0) {
                        if (~arg2 != -2) {
                            if (arg2 == 2) {
                                if (var11.field579) {
                                    class119.field2241[arg8][arg6 + 1][arg5] = 50;
                                    class119.field2241[arg8][arg6 - -1][arg5 + 1] = 50;
                                }
                                if (var11.field558) {
                                    class233.field4164[arg8][arg6 + 1][arg5] = class3.method27(class233.field4164[arg8][arg6 + 1][arg5], 1);
                                }
                            } else if (arg2 == 3) {
                                if (var11.field579) {
                                    class119.field2241[arg8][arg6][arg5] = 50;
                                    class119.field2241[arg8][arg6 - -1][arg5] = 50;
                                }
                                if (var11.field558) {
                                    class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 2);
                                }
                            }
                        } else {
                            if (var11.field579) {
                                class119.field2241[arg8][arg6][arg5 - -1] = 50;
                                class119.field2241[arg8][arg6 + 1][arg5 + 1] = 50;
                            }
                            if (var11.field558) {
                                class233.field4164[arg8][arg6][arg5 + 1] = class3.method27(class233.field4164[arg8][arg6][arg5 + 1], 2);
                            }
                        }
                    } else {
                        if (var11.field579) {
                            class119.field2241[arg8][arg6][arg5] = 50;
                            class119.field2241[arg8][arg6][arg5 + 1] = 50;
                        }
                        if (var11.field558) {
                            class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 1);
                        }
                    }
                }
                if (var11.field570 != 0 && arg4 != null) {
                    arg4.method11(var11.field601, arg10, arg6, arg2, (byte) 121, arg5);
                }
                if (~var11.field545 != -17) {
                    class186.method1375(arg8, arg6, arg5, var11.field545);
                }
            } else if (~arg10 == -2) {
                class165 var35;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var34 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 122, 1, arg2);
                    var35 = var34.field3777;
                } else {
                    var35 = new class3(arg3, 1, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class62.method429(arg8, arg6, arg5, var19, var35, (class165) null, class144.field2721[arg2], 0, var25);
                if (var11.field579 && arg7) {
                    if (~arg2 == -1) {
                        class119.field2241[arg8][arg6][arg5 + 1] = 50;
                    } else if (~arg2 == -2) {
                        class119.field2241[arg8][arg6 + 1][arg5 + 1] = 50;
                    } else if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            class119.field2241[arg8][arg6][arg5] = 50;
                        }
                    } else {
                        class119.field2241[arg8][arg6 + 1][arg5] = 50;
                    }
                }
                if (var11.field570 != 0 && arg4 != null) {
                    arg4.method11(var11.field601, arg10, arg6, arg2, (byte) -78, arg5);
                }
            } else if (arg10 == 2) {
                int var36 = 3 & arg2 + 1;
                class165 var38;
                class165 var40;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var37 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 70, 2, 4 - -arg2);
                    var38 = var37.field3777;
                    class208 var39 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 58, 2, var36);
                    var40 = var39.field3777;
                } else {
                    var38 = new class3(arg3, 2, 4 - -arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                    var40 = new class3(arg3, 2, var36, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class62.method429(arg8, arg6, arg5, var19, var38, var40, class40.field666[arg2], class40.field666[var36], var25);
                if (var11.field558 && arg7) {
                    if (arg2 != 0) {
                        if (arg2 == 1) {
                            class233.field4164[arg8][arg6][arg5 + 1] = class3.method27(class233.field4164[arg8][arg6][arg5 + 1], 2);
                            class233.field4164[arg8][arg6 + 1][arg5] = class3.method27(class233.field4164[arg8][arg6 + 1][arg5], 1);
                        } else if (~arg2 != -3) {
                            if (~arg2 == -4) {
                                class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 2);
                                class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 1);
                            }
                        } else {
                            class233.field4164[arg8][arg6 + 1][arg5] = class3.method27(class233.field4164[arg8][arg6 + 1][arg5], 1);
                            class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 2);
                        }
                    } else {
                        class233.field4164[arg8][arg6][arg5] = class3.method27(class233.field4164[arg8][arg6][arg5], 1);
                        class233.field4164[arg8][arg6][arg5 + 1] = class3.method27(class233.field4164[arg8][arg6][arg5 + 1], 2);
                    }
                }
                if (var11.field570 != 0 && arg4 != null) {
                    arg4.method11(var11.field601, arg10, arg6, arg2, (byte) 67, arg5);
                }
                if (~var11.field545 != -17) {
                    class186.method1375(arg8, arg6, arg5, var11.field545);
                }
            } else if (~arg10 == -4) {
                class165 var42;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var41 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 101, 3, arg2);
                    var42 = var41.field3777;
                } else {
                    var42 = new class3(arg3, 3, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class62.method429(arg8, arg6, arg5, var19, var42, (class165) null, class144.field2721[arg2], 0, var25);
                if (var11.field579 && arg7) {
                    if (~arg2 != -1) {
                        if (arg2 != 1) {
                            if (arg2 != 2) {
                                if (~arg2 == -4) {
                                    class119.field2241[arg8][arg6][arg5] = 50;
                                }
                            } else {
                                class119.field2241[arg8][arg6 + 1][arg5] = 50;
                            }
                        } else {
                            class119.field2241[arg8][arg6 + 1][arg5 + 1] = 50;
                        }
                    } else {
                        class119.field2241[arg8][arg6][arg5 + 1] = 50;
                    }
                }
                if (~var11.field570 != -1 && arg4 != null) {
                    arg4.method11(var11.field601, arg10, arg6, arg2, (byte) -72, arg5);
                }
            } else if (~arg10 == -10) {
                class165 var44;
                if (~var11.field589 == 0 && var11.field577 == null) {
                    class208 var43 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 99, arg10, arg2);
                    var44 = var43.field3777;
                } else {
                    var44 = new class3(arg3, arg10, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class39.method274(arg8, arg6, arg5, var19, 1, 1, var44, 0, var25);
                if (var11.field570 != 0 && arg4 != null) {
                    arg4.method18(var11.field601, arg5, var13, (byte) 23, arg6, var12);
                }
                if (var11.field545 != 16) {
                    class186.method1375(arg8, arg6, arg5, var11.field545);
                }
            } else if (~arg10 == -5) {
                class165 var46;
                if (~var11.field589 == 0 && var11.field577 == null) {
                    class208 var45 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 70, 4, arg2);
                    var46 = var45.field3777;
                } else {
                    var46 = new class3(arg3, 4, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class257.method1735(arg8, arg6, arg5, var19, var46, (class165) null, class40.field666[arg2], 0, 0, 0, var25);
            } else if (~arg10 == -6) {
                int var47 = 16;
                long var48 = class243.method1681(arg8, arg6, arg5);
                if (~var48 != -1L) {
                    var47 = class9.method64(false, (int) (var48 >>> 32) & Integer.MAX_VALUE).field545;
                }
                class165 var51;
                if (~var11.field589 == 0 && var11.field577 == null) {
                    class208 var50 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 87, 4, arg2);
                    var51 = var50.field3777;
                } else {
                    var51 = new class3(arg3, 4, arg2, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class257.method1735(arg8, arg6, arg5, var19, var51, (class165) null, class40.field666[arg2], 0, class231.field4148[arg2] * var47, class2.field40[arg2] * var47, var25);
            } else if (~arg10 == -7) {
                int var52 = 8;
                long var53 = class243.method1681(arg8, arg6, arg5);
                if (var53 != 0L) {
                    var52 = class9.method64(false, (int) (var53 >>> 32) & Integer.MAX_VALUE).field545 / 2;
                }
                class165 var56;
                if (~var11.field589 == 0 && var11.field577 == null) {
                    class208 var55 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 31, 4, arg2 + 4);
                    var56 = var55.field3777;
                } else {
                    var56 = new class3(arg3, 4, arg2 + 4, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class257.method1735(arg8, arg6, arg5, var19, var56, (class165) null, 256, arg2, class5.field95[arg2] * var52, class97.field1828[arg2] * var52, var25);
            } else if (~arg10 == -8) {
                int var57 = arg2 - -2 & 3;
                class165 var59;
                if (var11.field589 == -1 && var11.field577 == null) {
                    class208 var58 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 44, 4, var57 - -4);
                    var59 = var58.field3777;
                } else {
                    var59 = new class3(arg3, 4, var57 + 4, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class257.method1735(arg8, arg6, arg5, var19, var59, (class165) null, 256, var57, 0, 0, var25);
            } else if (arg10 == 8) {
                long var60 = class243.method1681(arg8, arg6, arg5);
                int var62 = 8;
                if (~var60 != -1L) {
                    var62 = class9.method64(false, (int) (var60 >>> 32) & Integer.MAX_VALUE).field545 / 2;
                }
                int var63 = arg2 - -2 & 3;
                class165 var65;
                class165 var67;
                if (~var11.field589 == 0 && var11.field577 == null) {
                    class208 var64 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 30, 4, arg2 + 4);
                    var65 = var64.field3777;
                    class208 var66 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 53, 4, var63 - -4);
                    var67 = var66.field3777;
                } else {
                    var65 = new class3(arg3, 4, arg2 + 4, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                    var67 = new class3(arg3, 4, var63 + 4, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
                }
                class257.method1735(arg8, arg6, arg5, var19, var65, var67, 256, arg2, class5.field95[arg2] * var62, class97.field1828[arg2] * var62, var25);
            }
        } else {
            class165 var69;
            if (~var11.field589 == 0 && var11.field577 == null) {
                class208 var68 = var11.method258(var21, arg7, var18, (class242) null, var20, var19, var22, var27, 114, 10, arg10 == 11 ? arg2 + 4 : arg2);
                var69 = var68.field3777;
            } else {
                var69 = new class3(arg3, 10, arg10 != 11 ? arg2 : arg2 + 4, arg9, arg6, arg5, var11.field589, var11.field595, (class165) null);
            }
            if (var69 != null) {
                boolean var70 = class39.method274(arg8, arg6, arg5, var19, var13, var12, var69, 0, var25);
                if (var11.field579 && var70 && arg7) {
                    int var71 = 15;
                    if (var69 instanceof class70) {
                        var71 = ((class70) var69).method507() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; ~var72 >= ~var13; ++var72) {
                        for (int var73 = 0; ~var73 >= ~var12; ++var73) {
                            if (class119.field2241[arg8][arg6 + var72][arg5 + var73] < var71) {
                                class119.field2241[arg8][arg6 + var72][arg5 - -var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (~var11.field570 != -1 && arg4 != null) {
                arg4.method18(var11.field601, arg5, var13, (byte) 23, arg6, var12);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
    public static final void method1550(int arg0) {
        if (arg0 != -23494) {
            field3962 = 110;
        }
        ++field3974;
        if (class187.field3426) {
            class69 var1 = class137.method1062(class65.field1097, arg0 ^ -23493, class97.field1831);
            if (var1 != null && var1.field1209 != null) {
                class225 var2 = new class225();
                var2.field4076 = var1;
                var2.field4079 = var1.field1209;
                class192.method1406(var2, (byte) -108);
            }
            class187.field3426 = false;
            class213.method1517((byte) 11, var1);
        }
    }
}
