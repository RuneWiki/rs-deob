import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kd")
public class class98 extends class85 {

    @OriginalMember(owner = "kd", name = "R", descriptor = "I")
    private int field1966 = 1024;

    @OriginalMember(owner = "kd", name = "Q", descriptor = "I")
    private int field1965 = 1024;

    @OriginalMember(owner = "kd", name = "cb", descriptor = "I")
    private int field1976 = 0;

    @OriginalMember(owner = "kd", name = "bb", descriptor = "I")
    private int field1975 = 1024;

    @OriginalMember(owner = "kd", name = "eb", descriptor = "I")
    private int field1978 = 0;

    @OriginalMember(owner = "kd", name = "Y", descriptor = "I")
    private int field1972 = 819;

    @OriginalMember(owner = "kd", name = "ib", descriptor = "I")
    private int field1982 = 1024;

    @OriginalMember(owner = "kd", name = "X", descriptor = "I")
    private int field1971 = 2048;

    @OriginalMember(owner = "kd", name = "lb", descriptor = "I")
    private int field1985 = 409;

    @OriginalMember(owner = "kd", name = "U", descriptor = "Llf;")
    public static class109 field1968 = class35.method275("mapdots", 2);

    @OriginalMember(owner = "kd", name = "S", descriptor = "I")
    public static int field1967 = 0;

    @OriginalMember(owner = "kd", name = "db", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "kd", name = "ab", descriptor = "[I")
    public static int[] field1974 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "kd", name = "jb", descriptor = "I")
    public static int field1983 = 1;

    @OriginalMember(owner = "kd", name = "hb", descriptor = "Llf;")
    public static class109 field1981 = class35.method275("Geben Sie Ihren Benutzernamen", 2);

    @OriginalMember(owner = "kd", name = "V", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "kd", name = "W", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "kd", name = "Z", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "kd", name = "fb", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "kd", name = "gb", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "kd", name = "kb", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "kd", name = "nb", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "kd", name = "mb", descriptor = "Lkf;")
    public static class100 field1986;

    @OriginalMember(owner = "kd", name = "a", descriptor = "(Llf;ZLlf;I)V")
    public static final void method690(class109 arg0, boolean arg1, class109 arg2, int arg3) {
        ++field1970;
        class115.method848(arg0, (class109) null, arg3, arg2, 105);
        if (arg1) {
            method690((class109) null, true, (class109) null, -14);
        }
    }

    @OriginalMember(owner = "kd", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field1980;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int[][] var4 = super.field1736.method833((byte) -122);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = class57.field1152 * this.field1975 >> 12;
            int var13 = 0;
            int var14 = 0;
            int var15 = class57.field1152 * this.field1971 >> 12;
            int var16 = class38.field824 * this.field1985 >> 12;
            int var17 = class38.field824 * this.field1972 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field1969 = class57.field1152 / 8 * this.field1965 >> 12;
            int var18 = 1 - -(class57.field1152 / var12);
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field1976);
            int[][] var21 = new int[var18][3];
            label127: while (true) {
                while (true) {
                    int var22 = var12 - -class123.method882(var15 - var12, var20, true);
                    int var23 = var8 - -var22;
                    int var24 = var16 - -class123.method882(-var16 + var17, var20, true);
                    if (~var23 < ~class57.field1152) {
                        var23 = class57.field1152;
                        var22 = -var8 + class57.field1152;
                    }
                    int var26;
                    if (var10) {
                        var26 = 0;
                    } else {
                        int[] var25 = var21[var13];
                        var26 = var25[2];
                        int var27 = var13;
                        int var28 = 0;
                        int var29 = var23 - -var5;
                        if (var29 < 0) {
                            var29 += class57.field1152;
                        }
                        if (~class57.field1152 > ~var29) {
                            var29 -= class57.field1152;
                        }
                        while (true) {
                            int[] var30 = var21[var27];
                            if (var30[0] <= var29 && var30[1] >= var29) {
                                if (var13 != var27) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class57.field1152;
                                    }
                                    if (~var31 < ~class57.field1152) {
                                        var31 -= class57.field1152;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var21[(var13 + var32) % var11];
                                        var26 = Math.max(var26, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var28; ++var33) {
                                        int[] var34 = var21[(var13 + var33) % var11];
                                        int var35 = var34[2];
                                        if (var26 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var29) {
                                                if (var36 == 0) {
                                                    var38 = Math.min(var29, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class57.field1152;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var29, var37);
                                            }
                                            this.method693(-var39 + var38, -var35 + var26, (byte) 51, var4, var7 + var39, var20, var35);
                                        }
                                    }
                                }
                                var13 = var27;
                                break;
                            }
                            ++var27;
                            if (~var27 <= ~var11) {
                                var27 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (var24 + var26 <= class38.field824) {
                        var9 = false;
                    } else {
                        var24 = -var26 + class38.field824;
                    }
                    if (class57.field1152 == var23) {
                        this.method693(var22, var24, (byte) 51, var4, var6 + var8, var20, var26);
                        if (var9) {
                            break label127;
                        }
                        var9 = true;
                        var13 = 0;
                        var7 = var6;
                        int[] var41 = var19[var14++];
                        var10 = false;
                        var41[1] = var23;
                        var41[2] = var24 + var26;
                        var41[0] = var8;
                        var6 = class123.method882(class57.field1152, var20, true);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int[][] var42 = var21;
                        var11 = var14;
                        var21 = var19;
                        int var43 = var5;
                        var19 = var42;
                        var14 = 0;
                        if (~var5 > -1) {
                            var43 = class57.field1152 + var5;
                        }
                        if (var43 > class57.field1152) {
                            var43 -= class57.field1152;
                        }
                        while (true) {
                            int[] var44 = var21[var13];
                            if (~var44[0] >= ~var43 && ~var43 >= ~var44[1]) {
                                break;
                            }
                            ++var13;
                            if (var13 >= var11) {
                                var13 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var14++];
                        var45[0] = var8;
                        var45[1] = var23;
                        var45[2] = var26 - -var24;
                        this.method693(var22, var24, (byte) 51, var4, var8 - -var6, var20, var26);
                        var8 = var23;
                    }
                }
            }
        }
        if (arg0 > -49) {
            method692((byte) -36);
        }
        return var3;
    }

    @OriginalMember(owner = "kd", name = "a", descriptor = "(Lbg;I)V")
    public static final void method691(class18 arg0, int arg1) {
        class143.field2770 = arg0;
        ++field1987;
        class79.field1563 = class143.field2770.method167((byte) 86, arg1);
    }

    @OriginalMember(owner = "kd", name = "d", descriptor = "(B)V")
    public static void method692(byte arg0) {
        field1981 = null;
        if (arg0 != -86) {
            field1986 = null;
        }
        field1986 = null;
        field1974 = null;
        field1968 = null;
    }

    @OriginalMember(owner = "kd", name = "a", descriptor = "(IIB[[IILjava/util/Random;I)V")
    private final void method693(int arg0, int arg1, byte arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        int var8 = this.field1982 <= 0 ? 4096 : 4096 - class123.method882(this.field1982, arg5, true);
        int var9 = this.field1969 * this.field1966 >> 12;
        if (arg2 != 51) {
            field1977 = -23;
        }
        ++field1973;
        int var10 = this.field1969 + -(~var9 < -1 ? class123.method882(var9, arg5, true) : 0);
        if (class57.field1152 <= arg4) {
            arg4 -= class57.field1152;
        }
        if (~var10 >= -1) {
            if (~class57.field1152 > ~(arg0 + arg4)) {
                int var11 = -arg4 + class57.field1152;
                for (int var12 = 0; var12 < arg1; ++var12) {
                    int[] var13 = arg3[arg6 - -var12];
                    class122.method877(var13, arg4, var11, var8);
                    class122.method877(var13, 0, -var11 + arg0, var8);
                }
            } else {
                for (int var14 = 0; var14 < arg1; ++var14) {
                    class122.method877(arg3[arg6 + var14], arg4, arg0, var8);
                }
            }
        } else if (~arg1 < -1 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var15 > ~var10 ? var15 : var10;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg4 + var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; ~var21 > ~arg1; ++var21) {
                int[] var22 = arg3[var21 - -arg6];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field1978 == 0) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class170.method1140(class29.field624, arg4 - -var24)] = var22[class170.method1140(class29.field624, arg0 + arg4 - (var24 + 1))] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class170.method1140(arg4 + var26, class29.field624)] = var22[class170.method1140(-var26 + arg4 + arg0 + -1, class29.field624)] = var28 < var23 ? var28 : var23;
                        }
                    }
                    if (~class57.field1152 <= ~(var19 - -var20)) {
                        class122.method877(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class57.field1152;
                        class122.method877(var22, var19, var27, var23);
                        class122.method877(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = arg1 - (var21 + 1);
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field1978 == 0) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class170.method1140(arg4 - -var31, class29.field624)] = var22[class170.method1140(arg4 - (-arg0 - -1) + -var31, class29.field624)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class170.method1140(arg4 + var33, class29.field624)] = var22[class170.method1140(class29.field624, arg4 + -1 + arg0 + -var33)] = var30 > var35 ? var35 : var30;
                            }
                        }
                        if (var19 + var20 > class57.field1152) {
                            int var34 = -var19 + class57.field1152;
                            class122.method877(var22, var19, var34, var30);
                            class122.method877(var22, 0, -var34 + var20, var30);
                        } else {
                            class122.method877(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class170.method1140(class29.field624, arg4 - -var36)] = var22[class170.method1140(-var36 + arg0 + -1 + arg4, class29.field624)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class57.field1152) {
                            class122.method877(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class57.field1152;
                            class122.method877(var22, var19, var37, var8);
                            class122.method877(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "kd", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field1982 = arg2.method569(true);
                                        }
                                    } else {
                                        this.field1966 = arg2.method569(true);
                                    }
                                } else {
                                    this.field1978 = arg2.method598((byte) 86);
                                }
                            } else {
                                this.field1965 = arg2.method569(true);
                            }
                        } else {
                            this.field1972 = arg2.method569(true);
                        }
                    } else {
                        this.field1985 = arg2.method569(true);
                    }
                } else {
                    this.field1971 = arg2.method569(true);
                }
            } else {
                this.field1975 = arg2.method569(true);
            }
        } else {
            this.field1976 = arg2.method598((byte) 121);
        }
        if (arg0 > -120) {
            method690((class109) null, false, (class109) null, 61);
        }
        ++field1979;
    }

    @OriginalMember(owner = "kd", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "kd", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (arg0 != 25614) {
            this.field1971 = -34;
        }
        ++field1984;
    }
}
