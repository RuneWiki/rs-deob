import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class99 extends class260 {

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "[I")
    public static int[] field1906 = new int[128];

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZBLrc;)V")
    public static final void method675(boolean arg0, byte arg1, class65 arg2) {
        if (arg1 == 0) {
            if (arg0) {
                int var3 = class143.field2616;
                int var4 = var3 * 956 / 503;
                class91.field1802.method926((-var4 + class138.field2558) / 2, 0, var4, var3);
                class200.field3620.method620(class138.field2558 / 2 + -(class200.field3620.field2205 / 2), 18);
            }
            ++field1901;
            arg2.method401(class36.field828, class138.field2558 / 2, class143.field2616 / 2 + -26, 16777215, -1);
            int var5 = class143.field2616 / 2 + -18;
            class133.method876(class138.field2558 / 2 + -152, var5, 304, 34, 9179409);
            class133.method876(class138.field2558 / 2 + -151, var5 + 1, 302, 32, 0);
            class133.method865(class138.field2558 / 2 - 150, var5 - -2, class2.field20 * 3, 30, 9179409);
            class133.method865(class2.field20 * 3 + (class138.field2558 / 2 - 150), var5 + 2, -(class2.field20 * 3) + 300, 30, 0);
            arg2.method401(class23.field667, class138.field2558 / 2, class143.field2616 / 2 + 4, 16777215, -1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field1903;
        int[][] var3 = super.field4509.method1667(arg0, arg1 ^ arg1);
        if (super.field4509.field4346) {
            int[] var4 = this.method1711(arg0, 2, false);
            int[][] var5 = this.method1712((byte) -66, 0, arg0);
            int[][] var6 = this.method1712((byte) -85, 1, arg0);
            int[] var7 = var3[1];
            int[] var8 = var5[1];
            int[] var9 = var5[0];
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class49.field1052; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var10[var16] = var12[var16];
                        var7[var16] = var14[var16];
                        var11[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var10[var16] = var9[var16] * var17 - -(var12[var16] * var18) >> 12;
                        var7[var16] = var8[var16] * var17 + var14[var16] * var18 >> 12;
                        var11[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var10[var16] = var9[var16];
                    var7[var16] = var8[var16];
                    var11[var16] = var13[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 1422) {
            ++field1904;
            long var6 = class148.method970(arg0, arg1, arg2);
            if (var6 != 0L) {
                int var8 = 3 & (int) var6 >> 20;
                int var9 = arg3;
                int var10 = (int) var6 >> 14 & 31;
                int var11 = arg1 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
                if (var6 > 0L) {
                    var9 = arg4;
                }
                int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
                int[] var13 = class133.field2445;
                class12 var14 = class117.method763(var12, (byte) -123);
                if (var14.field294 != -1) {
                    class88 var15 = null;
                    if (!var14.field272) {
                        var15 = class207.field3749[var14.field294];
                    } else if (~var8 == -1) {
                        var15 = class207.field3749[var14.field294];
                    } else if (~var8 == -2) {
                        var15 = class24.field689[var14.field294];
                    } else if (~var8 == -3) {
                        var15 = class181.field3293[var14.field294];
                    } else if (var8 == 3) {
                        var15 = class131.field2400[var14.field294];
                    }
                    if (var15 != null) {
                        int var16 = (var14.field308 * 4 - var15.field2213) / 2;
                        int var17 = (var14.field329 * 4 - var15.field2205) / 2;
                        var15.method620(arg1 * 4 + 48 - -var17, (-var14.field308 + 104 - arg2) * 4 + var16 + 48);
                    }
                } else {
                    if (~var10 == -1 || var10 == 2) {
                        if (var8 != 0) {
                            if (~var8 != -2) {
                                if (~var8 == -3) {
                                    var13[var11 + 3] = var9;
                                    var13[var11 + 515] = var9;
                                    var13[var11 + 1024 + 3] = var9;
                                    var13[var11 + 3 + 1536] = var9;
                                } else if (~var8 == -4) {
                                    var13[var11 + 1536] = var9;
                                    var13[var11 + 1536 + 1] = var9;
                                    var13[var11 + 1536 + 2] = var9;
                                    var13[var11 - -3 + 1536] = var9;
                                }
                            } else {
                                var13[var11] = var9;
                                var13[var11 - -1] = var9;
                                var13[var11 + 2] = var9;
                                var13[var11 + 3] = var9;
                            }
                        } else {
                            var13[var11] = var9;
                            var13[var11 + 512] = var9;
                            var13[var11 - -1024] = var9;
                            var13[var11 + 1536] = var9;
                        }
                    }
                    if (var10 == 3) {
                        if (var8 != 0) {
                            if (var8 == 1) {
                                var13[var11 + 3] = var9;
                            } else if (var8 == 2) {
                                var13[var11 - -1536 + 3] = var9;
                            } else if (var8 == 3) {
                                var13[var11 + 1536] = var9;
                            }
                        } else {
                            var13[var11] = var9;
                        }
                    }
                    if (var10 == 2) {
                        if (~var8 == -4) {
                            var13[var11] = var9;
                            var13[var11 + 512] = var9;
                            var13[var11 + 1024] = var9;
                            var13[var11 + 1536] = var9;
                        } else if (~var8 != -1) {
                            if (~var8 == -2) {
                                var13[var11 + 3] = var9;
                                var13[var11 + 515] = var9;
                                var13[var11 + 1024 + 3] = var9;
                                var13[var11 + 1539] = var9;
                            } else if (~var8 == -3) {
                                var13[var11 + 1536] = var9;
                                var13[var11 + 1536 + 1] = var9;
                                var13[var11 + 1538] = var9;
                                var13[var11 + 1539] = var9;
                            }
                        } else {
                            var13[var11] = var9;
                            var13[var11 - -1] = var9;
                            var13[var11 + 2] = var9;
                            var13[var11 + 3] = var9;
                        }
                    }
                }
            }
            long var18 = class228.method1549(arg0, arg1, arg2);
            if (var18 != 0L) {
                int var20 = (int) var18 >> 20 & 3;
                int var21 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
                int var22 = ((int) var18 & 515872) >> 14;
                class12 var23 = class117.method763(var21, (byte) 32);
                if (~var23.field294 != 0) {
                    class88 var24 = null;
                    if (var23.field272) {
                        if (~var20 != -1) {
                            if (var20 == 1) {
                                var24 = class24.field689[var23.field294];
                            } else if (~var20 == -3) {
                                var24 = class181.field3293[var23.field294];
                            } else if (var20 == 3) {
                                var24 = class131.field2400[var23.field294];
                            }
                        } else {
                            var24 = class207.field3749[var23.field294];
                        }
                    } else {
                        var24 = class207.field3749[var23.field294];
                    }
                    if (var24 != null) {
                        int var25 = (var23.field329 * 4 + -var24.field2205) / 2;
                        int var26 = (var23.field308 * 4 - var24.field2213) / 2;
                        var24.method620(arg1 * 4 + var25 + 48, (104 - (arg2 - -var23.field308)) * 4 + 48 + var26);
                    }
                } else if (~var22 == -10) {
                    int var27 = 15658734;
                    if (~var18 < -1L) {
                        var27 = 15597568;
                    }
                    int var28 = (-arg2 + 103) * 4 * 512 + (24624 - -(arg1 * 4));
                    int[] var29 = class133.field2445;
                    if (var20 != 0 && var20 != 2) {
                        var29[var28] = var27;
                        var29[var28 + 512 + 1] = var27;
                        var29[var28 - -1024 + 2] = var27;
                        var29[var28 + 1539] = var27;
                    } else {
                        var29[var28 + 1536] = var27;
                        var29[var28 + 1 + 1024] = var27;
                        var29[var28 + 2 + 512] = var27;
                        var29[var28 + 3] = var27;
                    }
                }
            }
            long var30 = class13.method103(arg0, arg1, arg2);
            if (~var30 != -1L) {
                int var32 = 3 & (int) var30 >> 20;
                int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
                class12 var34 = class117.method763(var33, (byte) -105);
                if (~var34.field294 != 0) {
                    class88 var35 = null;
                    if (var34.field272) {
                        if (var32 != 0) {
                            if (var32 == 1) {
                                var35 = class24.field689[var34.field294];
                            } else if (var32 != 2) {
                                if (var32 == 3) {
                                    var35 = class131.field2400[var34.field294];
                                }
                            } else {
                                var35 = class181.field3293[var34.field294];
                            }
                        } else {
                            var35 = class207.field3749[var34.field294];
                        }
                    } else {
                        var35 = class207.field3749[var34.field294];
                    }
                    if (var35 != null) {
                        int var36 = (var34.field308 * 4 + -var35.field2213) / 2;
                        int var37 = (var34.field329 * 4 + -var35.field2205) / 2;
                        var35.method620(arg1 * 4 - -var37 + 48, (-var34.field308 + 104 + -arg2) * 4 + 48 - -var36);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field1905;
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            field1907 = -9;
        }
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 0, false);
            int[] var5 = this.method1711(arg0, 1, false);
            int[] var6 = this.method1711(arg0, 2, false);
            for (int var7 = 0; class49.field1052 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static void method677(byte arg0) {
        if (arg0 < -23) {
            field1906 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIII)V")
    public static final void method678(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1900;
        if (class166.method1090((byte) 49, arg3)) {
            class50.method323(arg0, arg4, 127, -1, class164.field2974[arg3], arg2);
            if (arg1 != 4) {
                method676(12, 109, -13, -49, 8, 45);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 == 5701) {
            if (~arg0 == -1) {
                super.field4505 = ~arg2.method1301(-8317) == -2;
            }
            ++field1902;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class99() {
        super(3, false);
    }
}
