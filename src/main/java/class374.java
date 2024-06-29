import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class374 extends class40 {

    @OriginalMember(owner = "client!oo", name = "T", descriptor = "I")
    private int field5327 = 0;

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
    private int field5326 = 1024;

    @OriginalMember(owner = "client!oo", name = "U", descriptor = "I")
    private int field5328 = 1024;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    private int field5321 = 409;

    @OriginalMember(owner = "client!oo", name = "Z", descriptor = "I")
    private int field5333 = 819;

    @OriginalMember(owner = "client!oo", name = "ab", descriptor = "I")
    private int field5334 = 2048;

    @OriginalMember(owner = "client!oo", name = "bb", descriptor = "I")
    private int field5335 = 0;

    @OriginalMember(owner = "client!oo", name = "cb", descriptor = "I")
    private int field5336 = 1024;

    @OriginalMember(owner = "client!oo", name = "db", descriptor = "I")
    private int field5337 = 1024;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public static int field5319 = 2;

    @OriginalMember(owner = "client!oo", name = "X", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5331 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!oo", name = "fb", descriptor = "I")
    public static int field5339 = -1;

    @OriginalMember(owner = "client!oo", name = "eb", descriptor = "Lc;")
    public static class100 field5338 = new class100();

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!oo", name = "V", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!oo", name = "Y", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!oo", name = "W", descriptor = "Lne;")
    public static class173 field5330;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "[Lvj;")
    public static class256[] field5322;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2394(boolean arg0) {
        field5330 = null;
        field5338 = null;
        if (!arg0) {
            field5322 = null;
            field5331 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILlf;)V", line = 21)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field5337 = arg2.method798(false);
                                        }
                                    } else {
                                        this.field5328 = arg2.method798(false);
                                    }
                                } else {
                                    this.field5335 = arg2.method837(true);
                                }
                            } else {
                                this.field5326 = arg2.method798(false);
                            }
                        } else {
                            this.field5333 = arg2.method798(false);
                        }
                    } else {
                        this.field5321 = arg2.method798(false);
                    }
                } else {
                    this.field5334 = arg2.method798(false);
                }
            } else {
                this.field5336 = arg2.method798(false);
            }
        } else {
            this.field5327 = arg2.method837(true);
        }
        if (arg1 >= 79) {
            ++field5325;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V", line = 118)
    private final void method2395(int arg0, int[][] arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field5320;
        int var8 = arg3 >= this.field5337 ? 4096 : 4096 + -class445.method2775(arg5, 31178, this.field5337);
        int var9 = this.field5328 * this.field5323 >> 12;
        int var10 = this.field5323 + -(var9 > 0 ? class445.method2775(arg5, arg3 + 31178, var9) : 0);
        if (~class410.field5886 >= ~arg0) {
            arg0 -= class410.field5886;
        }
        if (~var10 < -1) {
            if (~arg2 < -1 && arg4 > 0) {
                int var11 = arg4 / 2;
                int var12 = arg2 / 2;
                int var13 = var11 < var10 ? var11 : var10;
                int var14 = var10 > var12 ? var12 : var10;
                int var15 = arg0 + var13;
                int var16 = arg4 - var13 * 2;
                for (int var17 = 0; ~var17 > ~arg2; ++var17) {
                    int[] var18 = arg1[var17 - -arg6];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field5335 == -1) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class209.method1483(class84.field1067, arg0 + var20)] = var18[class209.method1483(class84.field1067, arg0 + -1 - (-arg4 + var20))] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class209.method1483(class84.field1067, arg0 + var22)] = var18[class209.method1483(class84.field1067, arg0 - (-arg4 - -1) + -var22)] = var24 < var19 ? var24 : var19;
                            }
                        }
                        if (~class410.field5886 <= ~(var15 + var16)) {
                            class271.method1855(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class410.field5886;
                            class271.method1855(var18, var15, var23, var19);
                            class271.method1855(var18, 0, var16 - var23, var19);
                        }
                    } else {
                        int var25 = -var17 + arg2 - 1;
                        if (~var25 > ~var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field5335 != 0) {
                                for (int var27 = 0; var27 < var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class209.method1483(arg0 + var27, class84.field1067)] = var18[class209.method1483(-var27 - 1 + arg0 + arg4, class84.field1067)] = ~var28 > ~var26 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class209.method1483(class84.field1067, arg0 + var29)] = var18[class209.method1483(arg4 - var29 + arg0 + -1, class84.field1067)] = var26 * var31 >> 12;
                                }
                            }
                            if (var15 - -var16 > class410.field5886) {
                                int var30 = -var15 + class410.field5886;
                                class271.method1855(var18, var15, var30, var26);
                                class271.method1855(var18, 0, -var30 + var16, var26);
                            } else {
                                class271.method1855(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class209.method1483(class84.field1067, arg0 + var32)] = var18[class209.method1483(arg0 + arg4 + -var32 + -1, class84.field1067)] = var8 * var32 / var13;
                            }
                            if (var15 + var16 <= class410.field5886) {
                                class271.method1855(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class410.field5886;
                                class271.method1855(var18, var15, var33, var8);
                                class271.method1855(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg0 + arg4) < ~class410.field5886) {
            int var34 = class410.field5886 - arg0;
            for (int var35 = 0; ~arg2 < ~var35; ++var35) {
                int[] var36 = arg1[arg6 - -var35];
                class271.method1855(var36, arg0, var34, var8);
                class271.method1855(var36, 0, arg4 - var34, var8);
            }
        } else {
            for (int var37 = 0; arg2 > var37; ++var37) {
                class271.method1855(arg1[arg6 + var37], arg0, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 630)
    public class374() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "(B)V", line = 331)
    public final void method39(byte arg0) {
        if (arg0 != -23) {
            field5331 = null;
        }
        ++field5324;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)[I", line = 349)
    public final int[] method44(byte arg0, int arg1) {
        ++field5332;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int[][] var4 = super.field551.method183(-90);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class410.field5886 * this.field5336 >> 12;
            int var15 = class410.field5886 * this.field5334 >> 12;
            int var16 = class440.field6297 * this.field5321 >> 12;
            int var17 = class440.field6297 * this.field5333 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field5323 = class410.field5886 / 8 * this.field5326 >> 12;
            int var18 = class410.field5886 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field5327);
            label128: while (true) {
                while (true) {
                    int var22 = class445.method2775(var21, 31178, -var14 + var15) + var14;
                    int var23 = class445.method2775(var21, 31178, -var16 + var17) + var16;
                    int var24 = var8 - -var22;
                    if (var24 > class410.field5886) {
                        var22 = -var8 + class410.field5886;
                        var24 = class410.field5886;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var24 - -var5;
                        if (~var28 > -1) {
                            var28 += class410.field5886;
                        }
                        if (~var28 < ~class410.field5886) {
                            var28 -= class410.field5886;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && ~var30[1] <= ~var28) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class410.field5886;
                                    }
                                    if (class410.field5886 < var31) {
                                        var31 -= class410.field5886;
                                    }
                                    for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var27 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 < var28) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            } else if (var36 == 0) {
                                                var38 = 0;
                                                var39 = Math.min(var28, var37);
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class410.field5886;
                                            }
                                            this.method2395(var7 + var38, var4, var29 - var35, 0, -var38 + var39, var21, var35);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class440.field6297 > ~(var23 + var29)) {
                        var23 = -var29 + class440.field6297;
                    } else {
                        var10 = false;
                    }
                    if (~class410.field5886 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var29;
                        var41[0] = var8;
                        var41[1] = var24;
                        this.method2395(var8 - -var6, var4, var23, 0, var22, var21, var29);
                        var8 = var24;
                    } else {
                        this.method2395(var6 + var8, var4, var23, 0, var22, var21, var29);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[0] = var8;
                        var42[2] = var23 + var29;
                        var42[1] = var24;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var7 = var6;
                        var13 = 0;
                        var6 = class445.method2775(var21, 31178, class410.field5886);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class410.field5886 + var5;
                        }
                        if (~class410.field5886 > ~var44) {
                            var44 -= class410.field5886;
                        }
                        var9 = 0;
                        var11 = false;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 > -20) {
            method2394(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ltj;I)V", line = 600)
    public static final void method2396(class108 arg0, int arg1) {
        class431.field6171 = arg0;
        ++field5329;
        if (arg1 != 0) {
            method2394(false);
        }
    }
}
