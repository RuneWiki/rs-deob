import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class334 extends class326 {

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
    private boolean field5195 = true;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
    private boolean field5204 = true;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
    public static int[] field5200 = new int[32];

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field5205 = 100;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Z")
    public static boolean field5196 = false;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Lrm;")
    public static class184 field5206 = new class184(64);

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "[I")
    public static int[] field5207 = new int[50];

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I", line = 11)
    public final int[] method103(int arg0, int arg1) {
        field5202++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, this.field5195 ? class29.field427 - arg1 : arg1, -3896);
            if (this.field5204) {
                for (int var5 = 0; var5 < class166.field2731; var5++) {
                    var3[var5] = var4[class215.field3397 - var5];
                }
            } else {
                class54.method424(var4, 0, var3, 0, class166.field2731);
            }
        }
        return arg0 > -25 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I", line = 57)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = -65 / ((arg1 - 60) / 51);
        int[][] var4 = this.field5104.method2365((byte) 36, arg0);
        field5198++;
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, this.field5195 ? class29.field427 - arg0 : arg0, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field5204) {
                for (int var12 = 0; var12 < class166.field2731; var12++) {
                    var9[var12] = var8[class215.field3397 - var12];
                    var10[var12] = var6[class215.field3397 - var12];
                    var11[var12] = var7[class215.field3397 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class166.field2731; var13++) {
                    var9[var13] = var8[var13];
                    var10[var13] = var6[var13];
                    var11[var13] = var7[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 113)
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZLvl;)V", line = 119)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field5201++;
        if (arg0 == 0) {
            this.field5204 = arg2.method58(-288140008) == 1;
        } else if (arg0 == 1) {
            this.field5195 = arg2.method58(-288140008) == 1;
        } else if (arg0 == 2) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        if (arg1) {
            this.method98(-105, false, (class6) null);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 165)
    public static final void method2324(int arg0) {
        if (arg0 != -64) {
            field5197 = -114;
        }
        field5199++;
        class79.field1075.method1359(112);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V", line = 182)
    public static void method2325(byte arg0) {
        field5206 = null;
        field5200 = null;
        if (arg0 <= -76) {
            field5207 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIZIIII[Lqd;III)[I", line = 199)
    public static final int[] method2326(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class200[] arg7, int arg8, int arg9, int arg10) {
        field5203++;
        int var11 = (arg10 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * arg1;
        if (!arg2) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class60.method493(var14 & 0x7, var13 & 0x7, arg6, (byte) 20) + arg8;
                    int var16 = arg4 + class233.method1677(var13 & 0x7, arg6, var14 & 0x7, true);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg7[arg9].field3197[var15][var16] = class333.method2319(arg7[arg9].field3197[var15][var16], -2097153);
                    }
                }
            }
        }
        int var17 = arg10 & 0x1FFFFFF8 << 3;
        byte var18;
        if (arg2) {
            var18 = 1;
        } else {
            var18 = 4;
        }
        class6 var19 = new class6(arg0);
        int var20 = arg3 & 0x1FFFFFF8 << 3;
        for (int var21 = 0; var21 < var18; var21++) {
            for (int var22 = 0; var22 < 64; var22++) {
                for (int var23 = 0; var23 < 64; var23++) {
                    if (arg5 != var21 || var11 > var22 || var11 + 8 < var22 || var12 > var23 || (var12 + 8) < var23) {
                        class61.method506(var19, arg1 - 122, 0, -1, -1, arg2, false, 0, 0, 0);
                    } else if ((var11 + 8) == var22 || var12 + 8 == var23) {
                        int var30;
                        int var31;
                        if (arg6 == 0) {
                            var30 = arg8 + var22 - var11;
                            var31 = var23 + arg4 - var12;
                        } else if (arg6 == 1) {
                            var30 = arg8 + var23 - var12;
                            var31 = var11 + arg4 + 8 - var22;
                        } else if (arg6 == 2) {
                            var30 = var11 + arg8 + 8 - var22;
                            var31 = var12 - (var23 - (arg4 + 8));
                        } else {
                            var31 = arg4 - (var11 - var22);
                            var30 = var12 + arg8 + 8 - var23;
                        }
                        class61.method506(var19, -127, 0, var30, var31, arg2, true, var20 + var23, arg9, var17 + var22);
                    } else {
                        int var24 = arg8 + class60.method493(var23 & 0x7, var22 & 0x7, arg6, (byte) 20);
                        int var25 = class233.method1677(var22 & 0x7, arg6, var23 & 0x7, true) + arg4;
                        class61.method506(var19, -113, arg6, var24, var25, arg2, false, var20 + var23, arg9, var17 + var22);
                        if (var22 == 63 || var23 == 63) {
                            int var26 = var22 == 63 ? 64 : var22;
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28;
                            int var29;
                            if (arg6 == 0) {
                                var29 = var26 + arg8 - var11;
                                var28 = var27 + arg4 - var12;
                            } else if (arg6 == 1) {
                                var28 = arg4 + var11 + 8 - var26;
                                var29 = var27 + arg8 - var12;
                            } else if (arg6 == 2) {
                                var28 = var12 + arg4 + 8 - var27;
                                var29 = arg8 + var11 + 8 - var26;
                            } else {
                                var29 = arg8 + var12 + 8 - var27;
                                var28 = var26 + arg4 - var11;
                            }
                            if (var29 >= 0 && var29 < 104 && var28 >= 0 && var28 < 104) {
                                class172.field2843[var21][var29][var28] = class172.field2843[var21][var24][var25];
                            }
                        }
                    }
                }
            }
        }
        boolean var32 = false;
        boolean var33 = false;
        while (var19.field115.length > var19.field111) {
            int var34 = var19.method58(arg1 - 288140016);
            if (var34 == 128) {
                class10.field194[0] = var19.method39((byte) 52);
                class10.field194[1] = var19.method78((byte) -71);
                var33 = true;
                class10.field194[2] = var19.method78((byte) -51);
                class10.field194[3] = var19.method78((byte) -34);
                class10.field194[4] = var19.method39((byte) 104);
            } else {
                if (var34 != 129) {
                    var19.field111--;
                    break;
                }
                for (int var35 = 0; var35 < 4; var35++) {
                    byte var36 = var19.method83((byte) -96);
                    if (var36 == 0) {
                        if (var35 <= arg5) {
                            int var44 = arg8;
                            int var45 = arg8 + 7;
                            int var46 = arg4 + 7;
                            if (arg8 < 0) {
                                var44 = 0;
                            } else if (arg8 >= 104) {
                                var44 = 104;
                            }
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 >= 104) {
                                var46 = 104;
                            }
                            int var47 = arg4;
                            if (arg4 < 0) {
                                var47 = 0;
                            } else if (arg4 >= 104) {
                                var47 = 104;
                            }
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 >= 104) {
                                var45 = 104;
                            }
                            while (var45 > var44) {
                                while (var46 > var47) {
                                    class248.field3903[arg9][var44][var47] = 0;
                                    var47++;
                                }
                                var44++;
                            }
                        }
                    } else if (var36 == 1) {
                        for (int var37 = 0; var37 < 64; var37 += 4) {
                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                byte var39 = var19.method83((byte) -82);
                                if (var35 <= arg5) {
                                    for (int var40 = var37; var40 < var37 + 4; var40++) {
                                        for (int var41 = var38; var41 < (var38 + 4); var41++) {
                                            if (var40 >= var11 && var40 < (var11 + 8) && var12 <= var41 && var12 + 8 > var12) {
                                                int var42 = class60.method493(var41 & 0x7, var40 & 0x7, arg6, (byte) 20) + arg8;
                                                int var43 = arg4 + class233.method1677(var40 & 0x7, arg6, var41 & 0x7, true);
                                                if (var42 >= 0 && var42 < 104 && var43 >= 0 && var43 < 104) {
                                                    class248.field3903[arg9][var42][var43] = var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var36 != 2) {
                    }
                }
            }
        }
        if (class109.field1458 && !arg2) {
            class254 var48 = null;
            while (true) {
                while (var19.field111 < var19.field115.length) {
                    int var49 = var19.method58(-288140008);
                    if (var49 == 0) {
                        var48 = new class254(var19);
                    } else if (var49 == 1) {
                        int var50 = var19.method58(-288140008);
                        if (var50 > 0) {
                            for (int var51 = 0; var51 < var50; var51++) {
                                class79 var52 = new class79(var19);
                                if (var52.field1071 == 31) {
                                    class243 var53 = class18.method200(var19.method39((byte) 107), 31);
                                    var52.method583(var53.field3798, 4096, var53.field3794, var53.field3790, var53.field3792);
                                }
                                int var54 = var52.field1068 >> 7;
                                int var55 = var52.field1072 >> 7;
                                if (var52.field1061 == arg5 && var54 >= var11 && var54 < (var11 + 8) && var55 >= var12 && var55 < var12 + 8) {
                                    int var56 = (arg8 << 7) + class283.method2007(false, arg6, var52.field1072 & 0x3FF, var52.field1068 & 0x3FF);
                                    int var57 = (arg4 << 7) + class306.method2121(arg6, var52.field1072 & 0x3FF, var52.field1068 & 0x3FF, (byte) -31);
                                    var52.field1068 = var56;
                                    int var58 = var52.field1068 >> 7;
                                    var52.field1072 = var57;
                                    int var59 = var52.field1072 >> 7;
                                    if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                                        var52.field1064 = (class134.field1969[1][var58][var59] & 0x2) != 0;
                                        var52.field1060 = class172.field2843[var52.field1061][var58][var59] - var52.field1060;
                                        class176.method1295(var52);
                                    }
                                }
                            }
                        }
                    } else if (var49 == 2) {
                        if (var48 == null) {
                            var48 = new class254();
                        }
                        var48.method1843(8, var19);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var48 == null) {
                    var48 = new class254();
                }
                class215.field3396[arg8 >> 3][arg4 >> 3] = var48;
                break;
            }
        }
        if (!var32) {
            int var60 = arg8 + 7;
            int var61 = arg4 + 7;
            for (int var62 = arg8; var62 < var60; var62++) {
                for (int var63 = arg4; var63 < var61; var63++) {
                    class248.field3903[arg9][var62][var63] = 0;
                }
            }
        }
        return var33 ? class10.field194 : null;
    }
}
