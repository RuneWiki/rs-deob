import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class267 extends class288 {

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    private int field4323 = 409;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    private int field4332 = 0;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    private int field4327 = 2048;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    private int field4333 = 1024;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    private int field4338 = 1024;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    private int field4330 = 1024;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    private int field4328 = 0;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    private int field4345 = 1024;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    private int field4346 = 819;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field4324 = 0;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "[Lni;")
    public static class21[] field4339 = new class21[14];

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "[I")
    public static int[] field4343 = new int[14];

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field4331 = 0;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Z")
    public static boolean field4341 = false;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Ljj;")
    public static class134 field4329;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V")
    public static final void method1807(boolean arg0, int arg1) {
        if (arg1 != -4) {
            method1809((class49) null, -88, (byte) 5);
        }
        class46.field559 = null;
        class96.field1453 = null;
        ++field4325;
        class219.field3506 = null;
        if (arg0 && class247.field3968 != null) {
            class71.field980 = class247.field3968.field2093;
        } else {
            class71.field980 = -1;
        }
        class25.field308 = null;
        class19.field219 = null;
        class280.field4479 = null;
        class233.field3701 = null;
        class189.field3022 = null;
        class247.field3968 = null;
        class22.field279 = null;
        class259.field4128 = null;
        class238.field3807 = 0;
        class295.field4666.method371(arg1 + 7);
        class6.field82 = null;
        class99.field1514 = null;
        class225.field3572 = null;
        class150.field2407 = -1;
        class168.field2732 = null;
        class157.field2518 = null;
        class184.field2937 = null;
        class249.field3989 = null;
        class208.field3383 = null;
        class26.field316 = null;
        class237.field3791 = -1;
        class111.field1922 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lrj;")
    public static final class16 method1808(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        return var3 != null && var3.field1491 != null ? var3.field1491 : null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lil;IB)V")
    public static final void method1809(class49 arg0, int arg1, byte arg2) {
        if (arg0.field700 > class9.field141) {
            class78.method587(arg0, arg2 ^ 18223);
        } else if (class9.field141 > arg0.field664) {
            class169.method1185(-120, arg0);
        } else {
            class28.method187(arg0, -10928);
        }
        if (~arg0.field614 > -129 || ~arg0.field613 > -129 || arg0.field614 >= 13184 || ~arg0.field613 <= -13185) {
            arg0.field672 = -1;
            arg0.field700 = 0;
            arg0.field634 = -1;
            arg0.field664 = 0;
            arg0.field614 = arg0.field610[0] * 128 - -(arg0.method385((byte) 87) * 64);
            arg0.field613 = arg0.field692[0] * 128 - -(64 * arg0.method385((byte) -90));
            arg0.method384((byte) -110);
        }
        ++field4336;
        if (class197.field3179 == arg0 && (~arg0.field614 > -1537 || arg0.field613 < 1536 || ~arg0.field614 <= -11777 || arg0.field613 >= 11776)) {
            arg0.field664 = 0;
            arg0.field672 = -1;
            arg0.field700 = 0;
            arg0.field634 = -1;
            arg0.field614 = arg0.field610[0] * 128 + 64 * arg0.method385((byte) -111);
            arg0.field613 = arg0.field692[0] * 128 - -(arg0.method385((byte) 105) * 64);
            arg0.method384((byte) 88);
        }
        if (arg2 != 123) {
            method1807(false, -6);
        }
        class147.method1003(arg0, -1);
        class108.method789((byte) -66, arg0);
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public static void method1810(int arg0) {
        field4343 = null;
        field4339 = null;
        if (arg0 != 0) {
            method1811(-86, 121, 63, -111, (byte) -13, 67, 23, -124);
        }
        field4329 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1811(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -19) {
            method1808(117, -46, -118);
        }
        ++field4344;
        if (arg1 == arg2) {
            class240.method1584(arg5, arg6, arg7, 5, arg3, arg1, arg0);
        } else if (class58.field817 <= -arg1 + arg6 && ~(arg6 - -arg1) >= ~class121.field2042 && -arg2 + arg3 >= class156.field2507 && arg2 + arg3 <= client.field3617) {
            class54.method420(arg5, arg0, (byte) -35, arg1, arg3, arg7, arg2, arg6);
        } else {
            class111.method805(arg0, (byte) -128, arg3, arg2, arg7, arg6, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field4333 = arg0.method1777(-56);
                                        }
                                    } else {
                                        this.field4330 = arg0.method1777(arg1 ^ 116);
                                    }
                                } else {
                                    this.field4328 = arg0.method1779(-49);
                                }
                            } else {
                                this.field4338 = arg0.method1777(-65);
                            }
                        } else {
                            this.field4346 = arg0.method1777(arg1 + -81);
                        }
                    } else {
                        this.field4323 = arg0.method1777(-48);
                    }
                } else {
                    this.field4327 = arg0.method1777(-73);
                }
            } else {
                this.field4345 = arg0.method1777(-124);
            }
        } else {
            this.field4332 = arg0.method1779(-96);
        }
        ++field4326;
        if (arg1 != -19) {
            this.field4338 = 81;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        ++field4342;
        if (arg0 != -125) {
            field4331 = -96;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Lni;")
    public static final class21 method1812(byte arg0, int arg1) {
        class21 var2 = (class21) class168.field2730.method1839((byte) 108, (long) arg1);
        ++field4337;
        if (var2 != null) {
            return var2;
        } else if (arg0 != 89) {
            return null;
        } else {
            byte[] var3 = class271.field4370.method940((byte) 49, class109.method793(-122, arg1), class50.method395(arg1, (byte) 94));
            class21 var4 = new class21();
            var4.field259 = arg1;
            if (var3 != null) {
                var4.method141(0, new class264(var3));
            }
            var4.method140(113);
            class168.field2730.method1830((long) arg1, arg0 ^ -117, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)Lhe;")
    public static final class82 method1813(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class82 var4 = var3.field1500;
            var3.field1500 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
    private final void method1814(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        ++field4340;
        int var8 = this.field4333 <= arg4 ? 4096 : 4096 + -class256.method1680(arg2, (byte) 96, this.field4333);
        int var9 = this.field4334 * this.field4330 >> 12;
        int var10 = this.field4334 + -(~var9 >= -1 ? 0 : class256.method1680(arg2, (byte) -41, var9));
        if (~arg5 <= ~class186.field2986) {
            arg5 -= class186.field2986;
        }
        if (var10 > 0) {
            if (arg0 > 0 && ~arg3 < -1) {
                int var11 = arg3 / 2;
                int var12 = arg0 / 2;
                int var13 = ~var12 <= ~var10 ? var10 : var12;
                int var14 = ~var10 < ~var11 ? var11 : var10;
                int var15 = arg5 + var14;
                int var16 = arg3 - var14 * 2;
                for (int var17 = 0; var17 < arg0; ++var17) {
                    int[] var18 = arg6[arg1 + var17];
                    if (var13 > var17) {
                        int var19 = var8 * var17 / var13;
                        if (this.field4328 != 0) {
                            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class204.method1369(class34.field422, arg5 + var20)] = var18[class204.method1369(-var20 + arg5 + arg3 + -1, class34.field422)] = ~var19 < ~var21 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var14; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class204.method1369(arg5 - -var22, class34.field422)] = var18[class204.method1369(class34.field422, -var22 + -1 + arg3 + arg5)] = var19 * var24 >> 12;
                            }
                        }
                        if (~class186.field2986 > ~(var15 + var16)) {
                            int var23 = -var15 + class186.field2986;
                            class56.method430(var18, var15, var23, var19);
                            class56.method430(var18, 0, var16 - var23, var19);
                        } else {
                            class56.method430(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + -1 + arg0;
                        if (var13 > var25) {
                            int var26 = var8 * var25 / var13;
                            if (this.field4328 == 0) {
                                for (int var27 = 0; ~var14 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class204.method1369(arg5 + var27, class34.field422)] = var18[class204.method1369(class34.field422, -var27 + arg3 + arg5 - 1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var14 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class204.method1369(arg5 - -var29, class34.field422)] = var18[class204.method1369(class34.field422, -var29 + -1 + arg3 + arg5)] = var31 < var26 ? var31 : var26;
                                }
                            }
                            if (~(var15 + var16) >= ~class186.field2986) {
                                class56.method430(var18, var15, var16, var26);
                            } else {
                                int var30 = class186.field2986 - var15;
                                class56.method430(var18, var15, var30, var26);
                                class56.method430(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var14 > var32; ++var32) {
                                var18[class204.method1369(arg5 + var32, class34.field422)] = var18[class204.method1369(-var32 + -1 + arg3 + arg5, class34.field422)] = var8 * var32 / var14;
                            }
                            if (class186.field2986 < var15 + var16) {
                                int var33 = -var15 + class186.field2986;
                                class56.method430(var18, var15, var33, var8);
                                class56.method430(var18, 0, -var33 + var16, var8);
                            } else {
                                class56.method430(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class186.field2986 > ~(arg5 - -arg3)) {
            int var34 = class186.field2986 - arg5;
            for (int var35 = 0; var35 < arg0; ++var35) {
                int[] var36 = arg6[arg1 + var35];
                class56.method430(var36, arg5, var34, var8);
                class56.method430(var36, 0, -var34 + arg3, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg0; ++var37) {
                class56.method430(arg6[arg1 - -var37], arg5, arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class267() {
        super(0, true);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field4322;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[][] var4 = super.field4609.method583(arg0 ^ 9115);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class186.field2986 * this.field4345 >> 12;
            int var15 = class205.field3296 * this.field4346 >> 12;
            int var16 = class205.field3296 * this.field4323 >> 12;
            int var17 = class186.field2986 * this.field4327 >> 12;
            if (var15 <= 1) {
                return var4[arg1];
            }
            this.field4334 = class186.field2986 / 8 * this.field4338 >> 12;
            int var18 = 1 - -(class186.field2986 / var14);
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4332);
            label127: while (true) {
                while (true) {
                    int var22 = var14 - -class256.method1680(var21, (byte) -90, -var14 + var17);
                    int var23 = var16 + class256.method1680(var21, (byte) 120, var15 - var16);
                    int var24 = var7 - -var22;
                    if (var24 > class186.field2986) {
                        var22 = -var7 + class186.field2986;
                        var24 = class186.field2986;
                    }
                    int var30;
                    if (var10) {
                        var30 = 0;
                    } else {
                        int var25 = var9;
                        int var26 = var24 - -var5;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        if (var26 < 0) {
                            var26 += class186.field2986;
                        }
                        if (var26 > class186.field2986) {
                            var26 -= class186.field2986;
                        }
                        while (true) {
                            int[] var29 = var20[var25];
                            if (var29[0] <= var26 && ~var26 >= ~var29[1]) {
                                var30 = var27[2];
                                if (~var9 != ~var25) {
                                    int var31 = var5 + var7;
                                    if (var31 < 0) {
                                        var31 += class186.field2986;
                                    }
                                    if (~class186.field2986 > ~var31) {
                                        var31 -= class186.field2986;
                                    }
                                    for (int var32 = 1; var28 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var30 = Math.max(var30, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var30 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var26) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var26, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class186.field2986;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var26, var37);
                                            }
                                            this.method1814(-var35 + var30, var35, var21, var39 - var38, 0, var38 - -var6, var4);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var25;
                            if (~var25 <= ~var12) {
                                var25 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (class205.field3296 >= var30 - -var23) {
                        var11 = false;
                    } else {
                        var23 = -var30 + class205.field3296;
                    }
                    if (class186.field2986 == var24) {
                        this.method1814(var23, var30, var21, var22, 0, var7 + var8, var4);
                        if (var11) {
                            break label127;
                        }
                        var6 = var8;
                        var9 = 0;
                        int[][] var41 = var20;
                        var10 = false;
                        int[] var42 = var19[var13++];
                        var12 = var13;
                        var42[2] = var23 + var30;
                        var42[0] = var7;
                        var42[1] = var24;
                        var7 = 0;
                        var13 = 0;
                        var11 = true;
                        var20 = var19;
                        var19 = var41;
                        var8 = class256.method1680(var21, (byte) 115, class186.field2986);
                        var5 = -var6 + var8;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class186.field2986 + var5;
                        }
                        if (~var43 < ~class186.field2986) {
                            var43 -= class186.field2986;
                        }
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && var43 <= var44[1]) {
                                break;
                            }
                            int var10000 = ~var12;
                            ++var9;
                            if (var10000 >= ~var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var30 - -var23;
                        var45[0] = var7;
                        this.method1814(var23, var30, var21, var22, 0, var7 - -var8, var4);
                        var7 = var24;
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field4338 = 41;
        }
        return var3;
    }
}
