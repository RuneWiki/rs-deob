import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class135 {

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    private int field203 = 1024;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    private int field205 = 819;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    private int field202 = 2048;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    private int field207 = 0;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    private int field218 = 0;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    private int field210 = 1024;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    private int field204 = 409;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
    private int field222 = 1024;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    private int field223 = 1024;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lbk;")
    public static class136 field215;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lnb;")
    public static class95 field213;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "[I")
    public static int[] field206;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "[I")
    public static int[] field211;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public static final void method96(int arg0) {
        ++field208;
        class229.field4077.method1167(false);
        if (arg0 == 2) {
            int var1 = class229.field4077.method1170(8, (byte) 118);
            if (class63.field863 > var1) {
                for (int var2 = var1; class63.field863 > var2; ++var2) {
                    class232.field4128[class96.field1413++] = class188.field3295[var2];
                }
            }
            if (class63.field863 < var1) {
                throw new RuntimeException("gnpov1");
            } else {
                class63.field863 = 0;
                for (int var3 = 0; var1 > var3; ++var3) {
                    int var4 = class188.field3295[var3];
                    class164 var5 = class153.field2482[var4];
                    int var6 = class229.field4077.method1170(1, (byte) -113);
                    if (var6 == 0) {
                        class188.field3295[class63.field863++] = var4;
                        var5.field2055 = class171.field2879;
                    } else {
                        int var7 = class229.field4077.method1170(2, (byte) 113);
                        if (~var7 == -1) {
                            class188.field3295[class63.field863++] = var4;
                            var5.field2055 = class171.field2879;
                            class104.field1507[class148.field2336++] = var4;
                        } else if (~var7 == -2) {
                            class188.field3295[class63.field863++] = var4;
                            var5.field2055 = class171.field2879;
                            int var8 = class229.field4077.method1170(3, (byte) 97);
                            var5.method852(var8, false, 9);
                            int var9 = class229.field4077.method1170(1, (byte) 118);
                            if (~var9 == -2) {
                                class104.field1507[class148.field2336++] = var4;
                            }
                        } else if (var7 == 2) {
                            class188.field3295[class63.field863++] = var4;
                            var5.field2055 = class171.field2879;
                            int var10 = class229.field4077.method1170(3, (byte) -61);
                            var5.method852(var10, true, 9);
                            int var11 = class229.field4077.method1170(3, (byte) -82);
                            var5.method852(var11, true, 9);
                            int var12 = class229.field4077.method1170(1, (byte) 111);
                            if (var12 == 1) {
                                class104.field1507[class148.field2336++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class232.field4128[class96.field1413++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 != -16231) {
            this.field202 = -77;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field203 = arg0.method318(true);
                                        }
                                    } else {
                                        this.field222 = arg0.method318(true);
                                    }
                                } else {
                                    this.field207 = arg0.method367(1);
                                }
                            } else {
                                this.field210 = arg0.method318(true);
                            }
                        } else {
                            this.field205 = arg0.method318(true);
                        }
                    } else {
                        this.field204 = arg0.method318(true);
                    }
                } else {
                    this.field202 = arg0.method318(true);
                }
            } else {
                this.field223 = arg0.method318(true);
            }
        } else {
            this.field218 = arg0.method367(1);
        }
        ++field214;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)I")
    public static final int method98(byte arg0, int arg1) {
        ++field224;
        if (arg0 != -8) {
            field206 = null;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field217;
        int[] var3 = super.field1954.method110(arg0, 58);
        if (arg1) {
            this.method102((byte) -128);
        }
        if (super.field1954.field244) {
            int var4 = 0;
            int var5 = 0;
            int[][] var6 = super.field1954.method111((byte) 80);
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class131.field1862 * this.field223 >> 12;
            int var15 = class131.field1862 * this.field202 >> 12;
            int var16 = class150.field2400 * this.field205 >> 12;
            int var17 = class150.field2400 * this.field204 >> 12;
            if (var16 <= 1) {
                return var6[arg0];
            } else {
                this.field209 = class131.field1862 / 8 * this.field210 >> 12;
                int var18 = class131.field1862 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field218);
                while (true) {
                    while (true) {
                        int var22 = class217.method1484(true, var21, -var14 + var15) + var14;
                        int var23 = var8 + var22;
                        int var24 = class217.method1484(!arg1, var21, var16 - var17) + var17;
                        if (class131.field1862 < var23) {
                            var22 = -var8 + class131.field1862;
                            var23 = class131.field1862;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int[] var26 = var20[var10];
                            var25 = var26[2];
                            int var27 = var10;
                            int var28 = 0;
                            int var29 = var4 + var23;
                            if (~var29 > -1) {
                                var29 += class131.field1862;
                            }
                            if (~class131.field1862 > ~var29) {
                                var29 -= class131.field1862;
                            }
                            while (true) {
                                int[] var30 = var20[var27];
                                if (var29 >= var30[0] && ~var29 >= ~var30[1]) {
                                    if (var10 != var27) {
                                        int var31 = var4 + var8;
                                        if (var31 < 0) {
                                            var31 += class131.field1862;
                                        }
                                        if (var31 > class131.field1862) {
                                            var31 -= class131.field1862;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var10 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var10 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class131.field1862;
                                                }
                                                this.method103(-var35 + var25, -var38 + var39, (byte) 121, var7 + var38, var35, var6, var21);
                                            }
                                        }
                                    }
                                    var10 = var27;
                                    break;
                                }
                                ++var28;
                                ++var27;
                                if (var12 <= var27) {
                                    var27 = 0;
                                }
                            }
                        }
                        if (var25 - -var24 <= class150.field2400) {
                            var9 = false;
                        } else {
                            var24 = -var25 + class150.field2400;
                        }
                        if (class131.field1862 != var23) {
                            int[] var41 = var19[var13++];
                            var41[1] = var23;
                            var41[0] = var8;
                            var41[2] = var25 - -var24;
                            this.method103(var24, var22, (byte) 121, var8 - -var5, var25, var6, var21);
                            var8 = var23;
                        } else {
                            this.method103(var24, var22, (byte) 121, var5 + var8, var25, var6, var21);
                            if (var9) {
                                return var3;
                            }
                            var9 = true;
                            var11 = false;
                            var10 = 0;
                            var7 = var5;
                            int[][] var42 = var20;
                            var20 = var19;
                            int[] var43 = var19[var13++];
                            var19 = var42;
                            var12 = var13;
                            var43[0] = var8;
                            var43[2] = var24 + var25;
                            var8 = 0;
                            var13 = 0;
                            var43[1] = var23;
                            var5 = class217.method1484(true, var21, class131.field1862);
                            var4 = -var7 + var5;
                            int var44 = var4;
                            if (~var4 > -1) {
                                var44 = class131.field1862 + var4;
                            }
                            if (var44 > class131.field1862) {
                                var44 -= class131.field1862;
                            }
                            while (true) {
                                int[] var45 = var20[var10];
                                if (var45[0] <= var44 && var45[1] >= var44) {
                                    break;
                                }
                                int var10000 = ~var12;
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

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static void method100(int arg0) {
        field215 = null;
        if (arg0 != 0) {
            field215 = null;
        }
        field211 = null;
        field213 = null;
        field206 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
    public static final int method101(int arg0, byte arg1) {
        if (arg1 != 5) {
            return -111;
        } else {
            ++field220;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        ++field212;
        if (arg0 != -85) {
            this.field218 = -7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBII[[ILjava/util/Random;)V")
    private final void method103(int arg0, int arg1, byte arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
        ++field221;
        int var8 = this.field203 <= 0 ? 4096 : 4096 + -class217.method1484(true, arg6, this.field203);
        if (arg2 == 121) {
            int var9 = this.field222 * this.field209 >> 12;
            int var10 = this.field209 - (~var9 < -1 ? class217.method1484(true, arg6, var9) : 0);
            if (~class131.field1862 >= ~arg3) {
                arg3 -= class131.field1862;
            }
            if (~var10 < -1) {
                if (arg0 > 0 && ~arg1 < -1) {
                    int var11 = arg1 / 2;
                    int var12 = arg0 / 2;
                    int var13 = ~var10 >= ~var12 ? var10 : var12;
                    int var14 = ~var11 <= ~var10 ? var10 : var11;
                    int var15 = arg1 - var14 * 2;
                    int var16 = arg3 + var14;
                    for (int var17 = 0; ~arg0 < ~var17; ++var17) {
                        int[] var18 = arg5[arg4 + var17];
                        if (var13 > var17) {
                            int var19 = var8 * var17 / var13;
                            if (this.field207 == 0) {
                                for (int var20 = 0; var20 < var14; ++var20) {
                                    int var21 = var8 * var20 / var14;
                                    var18[class65.method409(class61.field816, arg3 + var20)] = var18[class65.method409(arg1 - var20 + arg3 + -1, class61.field816)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; var14 > var22; ++var22) {
                                    int var24 = var8 * var22 / var14;
                                    var18[class65.method409(arg3 + var22, class61.field816)] = var18[class65.method409(class61.field816, arg1 + arg3 - (var22 + 1))] = ~var24 <= ~var19 ? var19 : var24;
                                }
                            }
                            if (class131.field1862 < var15 + var16) {
                                int var23 = -var16 + class131.field1862;
                                class37.method186(var18, var16, var23, var19);
                                class37.method186(var18, 0, var15 - var23, var19);
                            } else {
                                class37.method186(var18, var16, var15, var19);
                            }
                        } else {
                            int var25 = -var17 + arg0 - 1;
                            if (~var13 < ~var25) {
                                int var26 = var8 * var25 / var13;
                                if (~this.field207 == -1) {
                                    for (int var27 = 0; ~var27 > ~var14; ++var27) {
                                        int var28 = var8 * var27 / var14;
                                        var18[class65.method409(arg3 + var27, class61.field816)] = var18[class65.method409(class61.field816, arg3 - -arg1 + -var27 + -1)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; var14 > var29; ++var29) {
                                        int var31 = var8 * var29 / var14;
                                        var18[class65.method409(arg3 + var29, class61.field816)] = var18[class65.method409(class61.field816, arg1 - 1 + arg3 + -var29)] = var26 <= var31 ? var26 : var31;
                                    }
                                }
                                if (var16 - -var15 > class131.field1862) {
                                    int var30 = -var16 + class131.field1862;
                                    class37.method186(var18, var16, var30, var26);
                                    class37.method186(var18, 0, -var30 + var15, var26);
                                } else {
                                    class37.method186(var18, var16, var15, var26);
                                }
                            } else {
                                for (int var32 = 0; ~var14 < ~var32; ++var32) {
                                    var18[class65.method409(arg3 + var32, class61.field816)] = var18[class65.method409(class61.field816, arg3 - -arg1 + -var32 + -1)] = var8 * var32 / var14;
                                }
                                if (~(var15 + var16) >= ~class131.field1862) {
                                    class37.method186(var18, var16, var15, var8);
                                } else {
                                    int var33 = -var16 + class131.field1862;
                                    class37.method186(var18, var16, var33, var8);
                                    class37.method186(var18, 0, -var33 + var15, var8);
                                }
                            }
                        }
                    }
                }
            } else if (arg1 + arg3 <= class131.field1862) {
                for (int var34 = 0; var34 < arg0; ++var34) {
                    class37.method186(arg5[arg4 + var34], arg3, arg1, var8);
                }
            } else {
                int var35 = -arg3 + class131.field1862;
                for (int var36 = 0; var36 < arg0; ++var36) {
                    int[] var37 = arg5[arg4 + var36];
                    class37.method186(var37, arg3, var35, var8);
                    class37.method186(var37, 0, -var35 + arg1, var8);
                }
            }
        }
    }
}
