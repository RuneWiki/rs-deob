import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class112 extends class107 {

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Lak;")
    public static class135 field1955 = new class135(50);

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field1959 = 0;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lpj;")
    private static class237 field1966 = class33.method353("flash1:", 72);

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Lpj;")
    public static class237 field1961 = field1966;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lpj;")
    public static class237 field1965 = field1966;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lkk;")
    public static class224 field1964;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lfa;")
    public static class239 field1968;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "[Lcj;")
    public static class115[] field1967;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static void method824(boolean arg0) {
        field1961 = null;
        field1968 = null;
        field1967 = null;
        field1965 = null;
        if (!arg0) {
            field1960 = -18;
        }
        field1964 = null;
        field1955 = null;
        field1966 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
    public static final void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= -57) {
            field1964 = null;
        }
        ++field1953;
        long var6 = class119.method864(arg1, arg5, arg0);
        if (~var6 != -1L) {
            int var8 = 3 & (int) var6 >> 20;
            int var9 = 31 & (int) var6 >> 14;
            int var10 = arg2;
            if (var6 > 0L) {
                var10 = arg4;
            }
            int[] var11 = class192.field3330;
            int var12 = (-(arg0 * 512) + 52736) * 4 + arg5 * 4 + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class28 var14 = class94.method700(-103, var13);
            if (var14.field536 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (~var8 == -1) {
                        var11[var12] = var10;
                        var11[var12 - -512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 - -1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 1024 - -3] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (~var8 == -4) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 - -1538] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (~var9 == -4) {
                    if (~var8 == -1) {
                        var11[var12] = var10;
                    } else if (~var8 == -2) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 - -1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (~var8 == -4) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 - -1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 != 0) {
                        if (~var8 != -2) {
                            if (var8 == 2) {
                                var11[var12 - -1536] = var10;
                                var11[var12 - -1537] = var10;
                                var11[var12 + 1538] = var10;
                                var11[var12 + 1539] = var10;
                            }
                        } else {
                            var11[var12 - -3] = var10;
                            var11[var12 - -3 + 512] = var10;
                            var11[var12 + 1024 + 3] = var10;
                            var11[var12 + 1539] = var10;
                        }
                    } else {
                        var11[var12] = var10;
                        var11[var12 - -1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 - -3] = var10;
                    }
                }
            } else {
                class154 var15 = null;
                if (var14.field541) {
                    if (var8 != 0) {
                        if (~var8 == -2) {
                            var15 = class264.field4515[var14.field536];
                        } else if (var8 == 2) {
                            var15 = class152.field2696[var14.field536];
                        } else if (~var8 == -4) {
                            var15 = class221.field3805[var14.field536];
                        }
                    } else {
                        var15 = class36.field794[var14.field536];
                    }
                } else {
                    var15 = class36.field794[var14.field536];
                }
                if (var15 != null) {
                    int var16 = (var14.field507 * 4 + -var15.field2746) / 2;
                    int var17 = (var14.field571 * 4 + -var15.field2753) / 2;
                    var15.method1055(arg5 * 4 + 48 + var16, (-arg0 + 104 + -var14.field571) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class29.method270(arg1, arg5, arg0);
        if (~var18 != -1L) {
            int var20 = (3613220 & (int) var18) >> 20;
            int var21 = ((int) var18 & 516840) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class28 var23 = class94.method700(-111, var22);
            if (~var23.field536 == 0) {
                if (var21 == 9) {
                    int var24 = 15658734;
                    if (var18 > 0L) {
                        var24 = 15597568;
                    }
                    int var25 = (-arg0 + 103) * 2048 + arg5 * 4 + 24624;
                    int[] var26 = class192.field3330;
                    if (~var20 != -1 && ~var20 != -3) {
                        var26[var25] = var24;
                        var26[var25 - -1 + 512] = var24;
                        var26[var25 - -1026] = var24;
                        var26[var25 + 3 + 1536] = var24;
                    } else {
                        var26[var25 + 1536] = var24;
                        var26[var25 + 1 + 1024] = var24;
                        var26[var25 + 2 + 512] = var24;
                        var26[var25 - -3] = var24;
                    }
                }
            } else {
                class154 var27 = null;
                if (!var23.field541) {
                    var27 = class36.field794[var23.field536];
                } else if (var20 == 0) {
                    var27 = class36.field794[var23.field536];
                } else if (var20 != 1) {
                    if (~var20 != -3) {
                        if (var20 == 3) {
                            var27 = class221.field3805[var23.field536];
                        }
                    } else {
                        var27 = class152.field2696[var23.field536];
                    }
                } else {
                    var27 = class264.field4515[var23.field536];
                }
                if (var27 != null) {
                    int var28 = (var23.field507 * 4 + -var27.field2746) / 2;
                    int var29 = (var23.field571 * 4 + -var27.field2753) / 2;
                    var27.method1055(48 - (-(arg5 * 4) - var28), (-arg0 + 104 + -var23.field571) * 4 + var29 + 48);
                }
            }
        }
        long var30 = class125.method892(arg1, arg5, arg0);
        if (var30 != 0L) {
            int var32 = ((int) var30 & 3191042) >> 20;
            int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
            class28 var34 = class94.method700(-74, var33);
            if (var34.field536 != -1) {
                class154 var35 = null;
                if (!var34.field541) {
                    var35 = class36.field794[var34.field536];
                } else if (~var32 != -1) {
                    if (~var32 != -2) {
                        if (~var32 == -3) {
                            var35 = class152.field2696[var34.field536];
                        } else if (~var32 == -4) {
                            var35 = class221.field3805[var34.field536];
                        }
                    } else {
                        var35 = class264.field4515[var34.field536];
                    }
                } else {
                    var35 = class36.field794[var34.field536];
                }
                if (var35 != null) {
                    int var36 = (var34.field571 * 4 + -var35.field2753) / 2;
                    int var37 = (var34.field507 * 4 + -var35.field2746) / 2;
                    var35.method1055(arg5 * 4 + 48 + var37, 48 - -((-arg0 + 104 - var34.field571) * 4) + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[Lw;I)V")
    public static final void method826(int arg0, class141[] arg1, int arg2) {
        if (arg0 == 4345) {
            for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
                class141 var4 = arg1[var3];
                if (var4 != null && ~var4.field2535 == ~arg2 && (!var4.field2536 || !client.method1047(var4))) {
                    if (var4.field2529 == 0) {
                        if (!var4.field2536 && client.method1047(var4) && class210.field3582 != var4) {
                            continue;
                        }
                        method826(4345, arg1, var4.field2530);
                        if (var4.field2457 != null) {
                            method826(arg0, var4.field2457, var4.field2530);
                        }
                        class58 var5 = (class58) class164.field2915.method568((long) var4.field2530, arg0 ^ -4346);
                        if (var5 != null) {
                            class226.method1509(var5.field1191, -20);
                        }
                    }
                    if (var4.field2529 == 6) {
                        if (~var4.field2571 != 0 || var4.field2434 != -1) {
                            boolean var6 = class6.method69(false, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field2434;
                            } else {
                                var7 = var4.field2571;
                            }
                            if (~var7 != 0) {
                                class256 var8 = class256.method1732(var7, true);
                                if (var8 != null) {
                                    var4.field2524 += class59.field1204;
                                    while (var4.field2524 > var8.field4383[var4.field2570]) {
                                        var4.field2524 -= var8.field4383[var4.field2570];
                                        ++var4.field2570;
                                        if (~var4.field2570 <= ~var8.field4416.length) {
                                            var4.field2570 -= var8.field4393;
                                            if (~var4.field2570 > -1 || var4.field2570 >= var8.field4416.length) {
                                                var4.field2570 = 0;
                                            }
                                        }
                                        class128.method911(var4, -17149);
                                    }
                                }
                            }
                        }
                        if (~var4.field2465 != -1 && !var4.field2536) {
                            int var9 = var4.field2465 >> 16;
                            int var10 = class59.field1204 * var9;
                            var4.field2447 = 2047 & var4.field2447 + var10;
                            int var11 = var4.field2465 << 16 >> 16;
                            int var12 = class59.field1204 * var11;
                            var4.field2531 = 2047 & var4.field2531 + var12;
                            class128.method911(var4, -17149);
                        }
                    }
                }
            }
            ++field1958;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)V")
    public static final void method827(int arg0, byte arg1, int arg2) {
        class270 var3 = class202.method1368(-15, 5, arg2);
        if (arg1 < 100) {
            field1968 = null;
        }
        ++field1963;
        var3.method1793(13);
        var3.field4619 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class44 var5 = (class44) class64.field1280.method568((long) arg3, -1);
        ++field1962;
        if (var5 == null) {
            var5 = new class44();
            class64.field1280.method562(var5, (long) arg3, (byte) 56);
        }
        if (var5.field970.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var5.field970.length > var8; ++var8) {
                var7[var8] = var5.field970[var8];
                var6[var8] = var5.field958[var8];
            }
            for (int var9 = var5.field970.length; ~var9 > ~arg0; ++var9) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field958 = var6;
            var5.field970 = var7;
        }
        var5.field970[arg0] = arg1;
        int var10 = -58 / ((21 - arg2) / 55);
        var5.field958[arg0] = arg4;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(BI)Lrj;")
    public static final class8 method829(byte arg0, int arg1) {
        ++field1954;
        class8 var2 = (class8) class23.field414.method940((long) arg1, 57);
        if (arg0 != -82) {
            field1965 = null;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class243.field4259.method1645(true, class138.method955(arg1, true), class155.method1066(-1380860888, arg1));
            class8 var4 = new class8();
            var4.field134 = arg1;
            if (var3 != null) {
                var4.method99(-19864, new class32(var3));
            }
            var4.method91((byte) 112);
            if (~var4.field124 != 0) {
                var4.method94(method829((byte) -82, var4.field178), method829((byte) -82, var4.field124), (byte) 35);
            }
            if (var4.field182 != -1) {
                var4.method100(method829((byte) -82, var4.field182), (byte) -30, method829((byte) -82, var4.field112));
            }
            if (!class256.field4395 && var4.field158) {
                var4.field114 = 0;
                var4.field169 = null;
                var4.field115 = false;
                var4.field157 = null;
                var4.field131 = class121.field2136;
            }
            class23.field414.method937(-79, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            ++field1956;
            if (super.field1921.field3539) {
                int[][] var4 = this.method802(3, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class106.field1862 > var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }
}
