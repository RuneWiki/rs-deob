import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class193 extends class70 {

    @OriginalMember(owner = "client!se", name = "Mb", descriptor = "Lvd;")
    public static class222 field3551 = class212.method1357("Keine Antwort vom Anmelde)2Server)3", 10731);

    @OriginalMember(owner = "client!se", name = "Hb", descriptor = "Lvd;")
    public static class222 field3546 = class212.method1357(")3runescape)3com", 10731);

    @OriginalMember(owner = "client!se", name = "Lb", descriptor = "J")
    public static volatile long field3550 = 0L;

    @OriginalMember(owner = "client!se", name = "Ub", descriptor = "Lvd;")
    private static class222 field3559 = class212.method1357("No reply from loginserver)3", 10731);

    @OriginalMember(owner = "client!se", name = "Qb", descriptor = "I")
    public static int field3555 = 2;

    @OriginalMember(owner = "client!se", name = "Vb", descriptor = "Lvd;")
    private static class222 field3560 = class212.method1357("RuneScape has been updated(Q", 10731);

    @OriginalMember(owner = "client!se", name = "Nb", descriptor = "Lvd;")
    public static class222 field3552 = field3559;

    @OriginalMember(owner = "client!se", name = "Wb", descriptor = "J")
    public static long field3561 = 0L;

    @OriginalMember(owner = "client!se", name = "Rb", descriptor = "Lvd;")
    public static class222 field3556 = field3560;

    @OriginalMember(owner = "client!se", name = "Ib", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!se", name = "Jb", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!se", name = "Kb", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!se", name = "Ob", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!se", name = "Pb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!se", name = "Sb", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!se", name = "Tb", descriptor = "Lkf;")
    public class114 field3558;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public static final void method1201(int arg0) {
        class208.field3871 = new byte[4][104][arg0];
        class210.field3896 = new int[104];
        class62.field1151 = new int[104];
        class14.field391 = new int[4][105][105];
        class96.field1794 = new byte[4][104][104];
        class34.field731 = 99;
        class37.field810 = new byte[4][105][105];
        class113.field2120 = new byte[4][104][104];
        class130.field2522 = new int[104];
        class87.field1657 = new int[104];
        class216.field4014 = new byte[4][104][104];
        class86.field1619 = new int[104];
        ++field3547;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Z")
    public final boolean method306(int arg0) {
        ++field3548;
        if (this.field3558 == null) {
            return false;
        } else {
            int var2 = 50 / ((30 - arg0) / 51);
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field3556 = null;
        field3551 = null;
        if (arg0 == -5) {
            field3552 = null;
            field3559 = null;
            field3546 = null;
            field3560 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
    public final int method87() {
        ++field3557;
        return super.field1351;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3549;
        if (this.field3558 != null) {
            class183 var11 = ~super.field1323 != 0 && ~super.field1338 == -1 ? class93.method599((byte) -29, super.field1323) : null;
            class183 var12 = super.field1370 == -1 || ~super.field1370 == ~super.field1322 && var11 != null ? null : class93.method599((byte) -23, super.field1370);
            class49 var13 = this.field3558.method741(super.field1313, var11, var12, super.field1318, (byte) -93);
            if (var13 != null) {
                int var14 = 0;
                int var15 = 0;
                super.field1351 = var13.method87();
                int var16 = 0;
                if (~this.field3558.field2133 != -1 && ~this.field3558.field2139 != -1) {
                    int var17 = class199.field3640[arg0];
                    int var18 = class199.field3624[arg0];
                    short var19 = this.field3558.field2133;
                    short var20 = this.field3558.field2139;
                    int var21 = -var19 / 2;
                    int var22 = -var20 / 2;
                    int var23 = var17 * var22 + var18 * var21 >> 16;
                    int var24 = var18 * var22 + -(var17 * var21) >> 16;
                    int var25 = var19 / 2;
                    int var26 = class71.method482(super.field1360 + var24, super.field1353 - -var23, class217.field4036, (byte) 126);
                    int var27 = -var20 / 2;
                    int var28 = var18 * var27 + -(var17 * var25) >> 16;
                    int var29 = var17 * var27 - -(var18 * var25) >> 16;
                    int var30 = class71.method482(super.field1360 - -var28, super.field1353 + var29, class217.field4036, (byte) 121);
                    int var31 = -var19 / 2;
                    int var32 = var20 / 2;
                    int var33 = var17 * var32 + var18 * var31 >> 16;
                    int var34 = var18 * var32 + -(var17 * var31) >> 16;
                    int var35 = var19 / 2;
                    int var36 = var20 / 2;
                    int var37 = class71.method482(super.field1360 + var34, super.field1353 + var33, class217.field4036, (byte) 125);
                    int var38 = var17 * var36 + var18 * var35 >> 16;
                    int var39 = var18 * var36 + -(var17 * var35) >> 16;
                    int var40 = ~var30 < ~var26 ? var26 : var30;
                    int var41 = class71.method482(super.field1360 + var39, super.field1353 + var38, class217.field4036, (byte) 120);
                    int var42 = var26 + var41;
                    if (var30 + var37 < var42) {
                        var42 = var30 + var37;
                    }
                    int var43 = ~var41 >= ~var37 ? var41 : var37;
                    int var44 = var41 <= var30 ? var41 : var30;
                    var15 = 2047 & (int) (325.95D * Math.atan2((double) (-var43 + var40), (double) var20));
                    if (var15 != 0) {
                        var13.method355(var15);
                    }
                    int var45 = ~var37 < ~var26 ? var26 : var37;
                    var16 = (int) (Math.atan2((double) (var45 - var44), (double) var19) * 325.95D) & 2047;
                    if (~var16 != -1) {
                        var13.method360(var16);
                    }
                    var14 = (var42 >> 1) - super.field1308;
                    if (var14 != 0) {
                        var13.method349(0, var14, 0);
                    }
                }
                class49 var46 = null;
                if (~super.field1309 != 0 && super.field1362 != -1) {
                    class98 var47 = class127.method805(super.field1309, (byte) 81);
                    var46 = var47.method613(super.field1362, 1067);
                    if (var46 != null) {
                        var46.method349(0, -super.field1340, 0);
                        if (var47.field1828) {
                            if (var15 != 0) {
                                var46.method355(var15);
                            }
                            if (~var16 != -1) {
                                var46.method360(var16);
                            }
                            if (~var14 != -1) {
                                var46.method349(0, var14, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class150) var13).method962(var46);
                }
                if (this.field3558.field2151 == 1) {
                    var13.field969 = true;
                }
                var13.method89(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[B)V")
    public static final void method1203(int arg0, byte[] arg1) {
        ++field3554;
        int var2 = class229.field4314 >> 2 << 10;
        byte[][] var3 = new byte[class99.field1862][class38.field852];
        int var4 = class68.field1275 >> 1;
        int var5 = 0;
        while (true) {
            while (var5 < arg1.length) {
                int var34 = 64 * (255 & arg1[var5++]) - class167.field3184;
                int var35 = -class59.field1107 + 64 * (arg1[var5++] & 255);
                if (var34 > 0 && var35 > 0 && ~(var34 + 64) > ~class99.field1862 && var35 - -64 < class38.field852) {
                    for (int var36 = 0; ~var36 > -65; ++var36) {
                        byte[] var37 = var3[var34 + var36];
                        int var38 = -var35 + class38.field852 + -1;
                        for (int var39 = -64; ~var39 > -1; ++var39) {
                            var37[var38--] = arg1[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class99.field1862;
            int var7 = class38.field852;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            if (arg0 != 127) {
                return;
            }
            for (int var13 = -5; var6 > var13; ++var13) {
                for (int var14 = 0; var14 < var7; ++var14) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (~var28 > ~var6) {
                        int var29 = var3[var28][var14] & 255;
                        if (~var29 < -1) {
                            class82 var30 = class202.method1288(false, var29 + -1);
                            var8[var14] += var30.field1571;
                            var9[var14] += var30.field1570;
                            var10[var14] += var30.field1580;
                            var11[var14] += var30.field1574;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 + -5;
                    if (~var31 <= -1) {
                        int var32 = 255 & var3[var31][var14];
                        if (var32 > 0) {
                            class82 var33 = class202.method1288(false, var32 + -1);
                            var8[var14] -= var33.field1571;
                            var9[var14] -= var33.field1570;
                            var10[var14] -= var33.field1580;
                            var11[var14] -= var33.field1574;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class177.field3311[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; ++var21) {
                        int var22 = var21 + 5;
                        if (var22 < var7) {
                            var17 += var9[var22];
                            var18 += var10[var22];
                            var19 += var12[var22];
                            var16 += var8[var22];
                            var20 += var11[var22];
                        }
                        int var23 = var21 + -5;
                        if (var23 >= 0) {
                            var20 -= var11[var23];
                            var19 -= var12[var23];
                            var16 -= var8[var23];
                            var18 -= var10[var23];
                            var17 -= var9[var23];
                        }
                        if (var21 >= 0 && var19 > 0) {
                            int var24 = var20 == 0 ? 0 : class44.method330(var16 * 256 / var20, var17 / var19, var18 / var19, arg0 ^ -94);
                            int var25 = var21 >> 6;
                            if (~var3[var13][var21] == -1) {
                                if (var15[var25] != null) {
                                    var15[var25][class139.method876(63, var13) + class139.method876(var21 << 6, 4032)] = 0;
                                }
                            } else {
                                if (var15[var25] == null) {
                                    var15[var25] = class177.field3311[var13 >> 6][var25] = new int[4096];
                                }
                                int var26 = (var24 & 127) - -var4;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (~var26 < -128) {
                                    var26 = 127;
                                }
                                int var27 = (var24 - -var2 & 64512) + var26 - -(896 & var24);
                                var15[var25][(class139.method876(63, var21) << 6) - -class139.method876(var13, 63)] = class199.field3634[class87.method558(var27, 96, 1)];
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
