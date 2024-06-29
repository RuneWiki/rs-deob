import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class376 extends class657 {

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Z")
    private boolean field5323 = false;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Z")
    private boolean field5317;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[Lnj;")
    private class247[] field5321;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Lej;")
    public static class124 field5324 = new class124(21, 2);

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field5325 = 104;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
    public static boolean field5326 = false;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Lmu;")
    public static class303 field5329 = new class303(105, -2);

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Lmu;")
    public static class303 field5330 = new class303(96, 8);

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Lmn;")
    public static class368 field5331 = new class368();

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lwga;)V")
    public class376(class745 arg0) {
        super(arg0);
        if (arg0.field10215) {
            this.field5317 = ~arg0.field10204 > -4;
            int var2 = this.field5317 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (~var14 == -3) {
                                    var15 = var12;
                                } else if (var14 == 3) {
                                    var15 = -var12;
                                } else if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field5321 = new class247[3];
            this.field5321[0] = super.field9010.method2281(var4, false, 52, 64);
            this.field5321[1] = super.field9010.method2281(var5, false, 3, 64);
            this.field5321[2] = super.field9010.method2281(var3, false, 17, 64);
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)Z")
    public final boolean method731(int arg0) {
        ++field5320;
        if (arg0 > -57) {
            this.method735(91, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static void method2373(byte arg0) {
        field5329 = null;
        field5330 = null;
        field5331 = null;
        if (arg0 == 23) {
            field5324 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
    public final void method735(int arg0, boolean arg1) {
        if (arg0 != 15192) {
            this.method736(-85, (class357) null, -72);
        }
        if (this.field5321 != null && arg1) {
            super.field9010.method4126(1, -4382);
            super.field9010.method2260(class589.field8030, 0);
            class81 var3 = super.field9010.method4077(false);
            var3.method749(1024);
            super.field9010.method4099(-32, class556.field7682);
            if (this.field5317) {
                super.field9010.method4112(class720.field9793, 113, class72.field1302);
                super.field9010.method2248(true, false, 0, class755.field10544, false);
                super.field9010.method4117(0, true, class492.field6814);
            } else {
                super.field9010.method4112(class534.field7355, 117, class720.field9793);
                super.field9010.method4096((byte) 47, 0, class380.field5528);
                super.field9010.method4126(2, -4382);
                super.field9010.method4112(class720.field9793, 122, class72.field1302);
                super.field9010.method4096((byte) 47, 0, class380.field5528);
                super.field9010.method2248(true, false, 1, class380.field5528, false);
                super.field9010.method4117(0, true, class492.field6814);
                super.field9010.method4097((byte) -61, super.field9010.field10261);
            }
            super.field9010.method4126(0, arg0 + -19574);
            this.field5323 = true;
        } else {
            super.field9010.method4117(0, true, class492.field6814);
        }
        ++field5319;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILdu;I)V")
    public final void method736(int arg0, class357 arg1, int arg2) {
        ++field5322;
        super.field9010.method4097((byte) 91, arg1);
        super.field9010.method4144(true, arg0);
        if (arg2 != -16776) {
            this.method735(61, true);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        if (this.field5323) {
            super.field9010.method4126(1, arg0 ^ -4427);
            super.field9010.method4097((byte) -121, (class357) null);
            super.field9010.method2260(class738.field9929, 0);
            super.field9010.method4116(-8629);
            if (this.field5317) {
                super.field9010.method4112(class534.field7355, 120, class534.field7355);
                super.field9010.method4096((byte) 47, 0, class755.field10544);
                super.field9010.method4117(0, true, class755.field10544);
            } else {
                super.field9010.method4112(class534.field7355, 115, class534.field7355);
                super.field9010.method4096((byte) 47, 0, class755.field10544);
                super.field9010.method4126(2, arg0 + -4469);
                super.field9010.method4112(class534.field7355, arg0 ^ 33, class534.field7355);
                super.field9010.method4096((byte) 47, 0, class755.field10544);
                super.field9010.method4096((byte) 47, 1, class380.field5528);
                super.field9010.method4117(0, true, class755.field10544);
                super.field9010.method4097((byte) 64, (class357) null);
            }
            super.field9010.method4126(0, arg0 ^ -4427);
            this.field5323 = false;
        } else {
            super.field9010.method4117(0, true, class755.field10544);
        }
        ++field5318;
        if (arg0 != 87) {
            this.field5317 = true;
        }
        super.field9010.method4112(class534.field7355, arg0 + 13, class534.field7355);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[[[Les;IIIZ)Z")
    public static final boolean method2374(int arg0, class384[][][] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5316;
        byte var6 = arg5 ? 1 : (byte) (class448.field6342 & 255);
        if (~class591.field8070[class382.field5551][arg2][arg0] == ~var6) {
            return false;
        } else if ((class607.field8331[class382.field5551][arg2][arg0] & 4) == 0) {
            return false;
        } else {
            int var8 = 0;
            class30.field770[arg3] = arg2;
            int var7 = arg3 + 1;
            class721.field9799[arg3] = arg0;
            class591.field8070[class382.field5551][arg2][arg0] = var6;
            while (~var7 != ~var8) {
                int var9 = 65535 & class30.field770[var8];
                int var10 = (class30.field770[var8] & 16725623) >> 16;
                int var11 = 255 & class30.field770[var8] >> 24;
                int var12 = 65535 & class721.field9799[var8];
                int var13 = (16732999 & class721.field9799[var8]) >> 16;
                var8 = var8 + 1 & 4095;
                boolean var14 = false;
                if ((4 & class607.field8331[class382.field5551][var9][var12]) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg1 != null) {
                    label240: for (int var16 = class382.field5551 + 1; ~var16 >= -4; ++var16) {
                        if (arg1[var16] != null && ~(8 & class607.field8331[var16][var9][var12]) == -1) {
                            if (var14 && arg1[var16][var9][var12] != null) {
                                if (arg1[var16][var9][var12].field5577 != null) {
                                    int var17 = class753.method4204(var10, 226);
                                    if (~arg1[var16][var9][var12].field5577.field1800 == ~var17 || arg1[var16][var9][var12].field5574 != null && ~arg1[var16][var9][var12].field5574.field1800 == ~var17) {
                                        continue;
                                    }
                                    if (~var11 != -1) {
                                        int var18 = class753.method4204(var11, 226);
                                        if (~arg1[var16][var9][var12].field5577.field1800 == ~var18 || arg1[var16][var9][var12].field5574 != null && ~arg1[var16][var9][var12].field5574.field1800 == ~var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class753.method4204(var13, 226);
                                        if (arg1[var16][var9][var12].field5577.field1800 == var19 || arg1[var16][var9][var12].field5574 != null && ~arg1[var16][var9][var12].field5574.field1800 == ~var19) {
                                            continue;
                                        }
                                    }
                                }
                                class384 var20 = arg1[var16][var9][var12];
                                if (var20.field5567 != null) {
                                    for (class474 var21 = var20.field5567; var21 != null; var21 = var21.field6621) {
                                        class494 var22 = var21.field6623;
                                        if (var22 instanceof class258) {
                                            class258 var23 = (class258) var22;
                                            int var24 = var23.method594(59);
                                            int var25 = var23.method588(-32228);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var25 << 6 | var24;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label240;
                                            }
                                        }
                                    }
                                }
                            }
                            class384 var27 = arg1[var16][var9][var12];
                            if (var27 != null && var27.field5567 != null) {
                                for (class474 var28 = var27.field5567; var28 != null; var28 = var28.field6621) {
                                    class494 var29 = var28.field6623;
                                    if (var29.field6839 != var29.field6831 || ~var29.field6838 != ~var29.field6835) {
                                        for (int var30 = var29.field6831; ~var29.field6839 <= ~var30; ++var30) {
                                            for (int var31 = var29.field6838; ~var29.field6835 <= ~var31; ++var31) {
                                                class591.field8070[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class591.field8070[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class683.field9250[class382.field5551 + 1].method1851((byte) -86, var12, var9);
                    if (var32 > class531.field7324[arg4]) {
                        class531.field7324[arg4] = var32;
                    }
                    int var33 = var9 << 9;
                    if (~class444.field6316[arg4] < ~var33) {
                        class444.field6316[arg4] = var33;
                    } else if (var33 > class98.field1699[arg4]) {
                        class98.field1699[arg4] = var33;
                    }
                    int var34 = var12 << 9;
                    if (~class472.field6606[arg4] >= ~var34) {
                        if (~var34 < ~class120.field2057[arg4]) {
                            class120.field2057[arg4] = var34;
                        }
                    } else {
                        class472.field6606[arg4] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class591.field8070[class382.field5551][var9 - 1][var12] != var6) {
                        class30.field770[var7] = class418.method2577(class418.method2577(1179648, var9 + -1), -754974720);
                        class721.field9799[var7] = class418.method2577(var12, 1245184);
                        var7 = 4095 & var7 + 1;
                        class591.field8070[class382.field5551][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class175.field2711;
                    ++var12;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && ~class591.field8070[class382.field5551][var9 + -1][var12] != ~var6 && ~(class607.field8331[class382.field5551][var9][var12] & 4) == -1 && ~(4 & class607.field8331[class382.field5551][var9 + -1][var12 + -1]) == -1) {
                            class30.field770[var7] = class418.method2577(1375731712, class418.method2577(var9 + -1, 1179648));
                            class721.field9799[var7] = class418.method2577(var12, 1245184);
                            class591.field8070[class382.field5551][var9 + -1][var12] = var6;
                            var7 = 4095 & var7 + 1;
                        }
                        if (~class591.field8070[class382.field5551][var9][var12] != ~var6) {
                            class30.field770[var7] = class418.method2577(318767104, class418.method2577(var9, 5373952));
                            class721.field9799[var7] = class418.method2577(var12, 5439488);
                            class591.field8070[class382.field5551][var9][var12] = var6;
                            var7 = var7 + 1 & 4095;
                        }
                        if (~field5325 < ~(var9 + 1) && ~class591.field8070[class382.field5551][var9 + 1][var12] != ~var6 && (4 & class607.field8331[class382.field5551][var9][var12]) == 0 && (4 & class607.field8331[class382.field5551][var9 + 1][var12 + -1]) == 0) {
                            class30.field770[var7] = class418.method2577(-1845493760, class418.method2577(var9 + 1, 5373952));
                            class721.field9799[var7] = class418.method2577(5439488, var12);
                            var7 = var7 + 1 & 4095;
                            class591.field8070[class382.field5551][var9 - -1][var12] = var6;
                        }
                    }
                    --var12;
                    if (~field5325 < ~(var9 - -1) && class591.field8070[class382.field5551][var9 - -1][var12] != var6) {
                        class30.field770[var7] = class418.method2577(1392508928, class418.method2577(9568256, var9 + 1));
                        class721.field9799[var7] = class418.method2577(var12, 9633792);
                        var7 = var7 + 1 & 4095;
                        class591.field8070[class382.field5551][var9 - -1][var12] = var6;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (~(var9 + -1) <= -1 && ~class591.field8070[class382.field5551][var9 - 1][var12] != ~var6 && ~(4 & class607.field8331[class382.field5551][var9][var12]) == -1 && ~(4 & class607.field8331[class382.field5551][var9 + -1][var12 + 1]) == -1) {
                            class30.field770[var7] = class418.method2577(301989888, class418.method2577(13762560, var9 + -1));
                            class721.field9799[var7] = class418.method2577(var12, 13828096);
                            class591.field8070[class382.field5551][var9 - 1][var12] = var6;
                            var7 = var7 - -1 & 4095;
                        }
                        if (~class591.field8070[class382.field5551][var9][var12] != ~var6) {
                            class30.field770[var7] = class418.method2577(class418.method2577(13762560, var9), -1828716544);
                            class721.field9799[var7] = class418.method2577(13828096, var12);
                            class591.field8070[class382.field5551][var9][var12] = var6;
                            var7 = 4095 & var7 - -1;
                        }
                        if (~(var9 + 1) > ~field5325 && class591.field8070[class382.field5551][var9 + 1][var12] != var6 && (class607.field8331[class382.field5551][var9][var12] & 4) == 0 && ~(class607.field8331[class382.field5551][var9 + 1][var12 + 1] & 4) == -1) {
                            class30.field770[var7] = class418.method2577(-771751936, class418.method2577(var9 - -1, 9568256));
                            class721.field9799[var7] = class418.method2577(var12, 9633792);
                            class591.field8070[class382.field5551][var9 - -1][var12] = var6;
                            var7 = 4095 & var7 - -1;
                        }
                    }
                }
            }
            if (class531.field7324[arg4] != -1000000) {
                class531.field7324[arg4] += 40;
                class444.field6316[arg4] -= 512;
                class98.field1699[arg4] += 512;
                class120.field2057[arg4] += 512;
                class472.field6606[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static final void method2375(byte arg0) {
        ++field5315;
        if (arg0 == -89) {
            class124.field2129 = false;
            class299.method1955(arg0 + 6);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lcea;ILjava/lang/String;)I")
    public static final int method2376(class215 arg0, int arg1, String arg2) {
        ++field5327;
        int var3 = arg0.field3109;
        byte[] var4 = class141.method1124(arg2, (byte) -20);
        int var5 = 1 % ((-6 - arg1) / 63);
        arg0.method1529(5537, var4.length);
        arg0.field3109 += class472.field6610.method3629(var4.length, 0, arg0.field3109, var4, 103, arg0.field3066);
        return -var3 + arg0.field3109;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZB)V")
    public final void method734(boolean arg0, byte arg1) {
        super.field9010.method4112(class720.field9793, 126, class534.field7355);
        if (arg1 != -103) {
            method2374(74, (class384[][][]) null, 65, 65, -77, true);
        }
        ++field5314;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        if (arg0 != 10756) {
            this.method728((byte) -127);
        }
        if (this.field5323) {
            super.field9010.method4126(1, arg0 + -15138);
            super.field9010.method4097((byte) -67, this.field5321[arg1 + -1]);
            super.field9010.method4126(0, arg0 ^ -15130);
        }
        ++field5328;
    }
}
