import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class118 extends class175 {

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field2183 = 1024;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    private int field2192 = 819;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    private int field2180 = 0;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field2187 = 0;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    private int field2195 = 1024;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    private int field2199 = 409;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    private int field2197 = 2048;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
    private int field2201 = 1024;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    private int field2200 = 1024;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "[S")
    public static short[] field2184 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "Lmb;")
    private static class96 field2198 = class243.method1708("white:", (byte) 125);

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lmb;")
    public static class96 field2181 = field2198;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lmb;")
    public static class96 field2193 = field2198;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    private int field2182;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36.method283(-arg4 + arg1, class229.field3939[arg0], arg1 + arg4, (byte) -100, arg2);
        ++field2191;
        if (arg3 < 99) {
            field2198 = null;
        }
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (~var7 <= -1) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class229.field3939[-var6 + arg0];
                int[] var10 = class229.field3939[arg0 - -var6];
                int var11 = arg1 - -var5;
                int var12 = -var5 + arg1;
                class36.method283(var12, var10, var11, (byte) -120, arg2);
                class36.method283(var12, var9, var11, (byte) -122, arg2);
            }
            int var13 = -var6 + arg1;
            int[] var14 = class229.field3939[arg0 + var5];
            int[] var15 = class229.field3939[-var5 + arg0];
            int var16 = arg1 + var6;
            class36.method283(var13, var14, var16, (byte) -94, arg2);
            class36.method283(var13, var15, var16, (byte) -125, arg2);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field2185;
        int[] var3 = super.field3044.method904((byte) -119, arg1);
        if (super.field3044.field2150) {
            int[][] var4 = super.field3044.method910(-14451);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class1.field11 * this.field2183 >> 12;
            int var15 = class1.field11 * this.field2197 >> 12;
            int var16 = class85.field1440 * this.field2199 >> 12;
            int var17 = class85.field1440 * this.field2192 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field2182 = class1.field11 / 8 * this.field2200 >> 12;
            int var18 = class1.field11 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field2180);
            int[][] var21 = new int[var18][3];
            label120: while (true) {
                while (true) {
                    int var22 = var14 + class50.method379(-var14 + var15, var20, (byte) 26);
                    int var23 = var7 - -var22;
                    int var24 = var16 + class50.method379(-var16 + var17, var20, (byte) 26);
                    if (~class1.field11 > ~var23) {
                        var23 = class1.field11;
                        var22 = class1.field11 - var7;
                    }
                    int var28;
                    if (var10) {
                        var28 = 0;
                    } else {
                        int var25 = var8;
                        int var26 = 0;
                        int[] var27 = var21[var8];
                        var28 = var27[2];
                        int var29 = var23 - -var5;
                        if (~var29 > -1) {
                            var29 += class1.field11;
                        }
                        if (~var29 < ~class1.field11) {
                            var29 -= class1.field11;
                        }
                        while (true) {
                            int[] var30 = var21[var25];
                            if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                if (var8 != var25) {
                                    int var31 = var7 - -var5;
                                    if (var31 < 0) {
                                        var31 += class1.field11;
                                    }
                                    if (var31 > class1.field11) {
                                        var31 -= class1.field11;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var26; ++var32) {
                                        int[] var40 = var21[(var8 - -var32) % var11];
                                        var28 = Math.max(var28, var40[2]);
                                    }
                                    for (int var33 = 0; ~var26 <= ~var33; ++var33) {
                                        int[] var34 = var21[(var8 + var33) % var11];
                                        int var35 = var34[2];
                                        if (~var28 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var29 <= var31) {
                                                if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class1.field11;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method919(var35, var4, var13 + var38, var39 - var38, var28 - var35, 0, var20);
                                        }
                                    }
                                }
                                var8 = var25;
                                break;
                            }
                            ++var26;
                            ++var25;
                            if (var11 <= var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class85.field1440 <= ~(var24 + var28)) {
                        var9 = false;
                    } else {
                        var24 = class85.field1440 - var28;
                    }
                    if (class1.field11 != var23) {
                        int[] var41 = var19[var12++];
                        var41[0] = var7;
                        var41[1] = var23;
                        var41[2] = var24 + var28;
                        this.method919(var28, var4, var7 - -var6, var22, var24, 0, var20);
                        var7 = var23;
                    } else {
                        this.method919(var28, var4, var6 + var7, var22, var24, 0, var20);
                        if (var9) {
                            break label120;
                        }
                        var9 = true;
                        var13 = var6;
                        int[][] var42 = var21;
                        var21 = var19;
                        var10 = false;
                        var8 = 0;
                        int[] var43 = var19[var12++];
                        var43[0] = var7;
                        var11 = var12;
                        var19 = var42;
                        var43[1] = var23;
                        var43[2] = var24 + var28;
                        var6 = class50.method379(class1.field11, var20, (byte) 26);
                        var7 = 0;
                        var5 = -var13 + var6;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class1.field11 + var5;
                        }
                        var12 = 0;
                        if (var44 > class1.field11) {
                            var44 -= class1.field11;
                        }
                        while (true) {
                            int[] var45 = var21[var8];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                break;
                            }
                            ++var8;
                            if (~var8 <= ~var11) {
                                var8 = 0;
                            }
                        }
                    }
                }
            }
        }
        int var46 = 57 / ((arg0 - 62) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method918(int arg0) {
        field2184 = null;
        if (arg0 != 5) {
            method917(-9, 77, 122, -119, -122);
        }
        field2198 = null;
        field2181 = null;
        field2193 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field2188;
        int var4 = -22 / ((-22 - arg0) / 58);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field2201 = arg2.method1663((byte) 75);
                                        }
                                    } else {
                                        this.field2195 = arg2.method1663((byte) 82);
                                    }
                                } else {
                                    this.field2187 = arg2.method1651(4139);
                                }
                            } else {
                                this.field2200 = arg2.method1663((byte) 120);
                            }
                        } else {
                            this.field2192 = arg2.method1663((byte) -48);
                        }
                    } else {
                        this.field2199 = arg2.method1663((byte) 121);
                    }
                } else {
                    this.field2197 = arg2.method1663((byte) -92);
                }
            } else {
                this.field2183 = arg2.method1663((byte) -116);
            }
        } else {
            this.field2180 = arg2.method1651(4139);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[[IIIIILjava/util/Random;)V")
    private final void method919(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field2186;
        int var8 = this.field2201 <= 0 ? 4096 : -class50.method379(this.field2201, arg6, (byte) 26) + 4096;
        int var9 = this.field2195 * this.field2182 >> 12;
        int var10 = this.field2182 - (var9 <= arg5 ? 0 : class50.method379(var9, arg6, (byte) 26));
        if (class1.field11 <= arg2) {
            arg2 -= class1.field11;
        }
        if (~var10 >= -1) {
            if (~(arg2 + arg3) >= ~class1.field11) {
                for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                    class102.method771(arg1[arg0 + var11], arg2, arg3, var8);
                }
            } else {
                int var12 = -arg2 + class1.field11;
                for (int var13 = 0; arg4 > var13; ++var13) {
                    int[] var14 = arg1[arg0 + var13];
                    class102.method771(var14, arg2, var12, var8);
                    class102.method771(var14, 0, -var12 + arg3, var8);
                }
            }
        } else if (arg4 > 0 && arg3 > 0) {
            int var15 = arg3 / 2;
            int var16 = arg4 / 2;
            int var17 = var16 < var10 ? var16 : var10;
            int var18 = ~var10 >= ~var15 ? var10 : var15;
            int var19 = -(var18 * 2) + arg3;
            int var20 = arg2 + var18;
            for (int var21 = 0; var21 < arg4; ++var21) {
                int[] var22 = arg1[arg0 + var21];
                if (var17 > var21) {
                    int var23 = var8 * var21 / var17;
                    if (this.field2187 != 0) {
                        for (int var24 = 0; ~var18 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class130.method985(class194.field3343, arg2 + var24)] = var22[class130.method985(class194.field3343, arg2 + arg3 + -var24 + -1)] = ~var25 > ~var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var18; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class130.method985(class194.field3343, arg2 - -var26)] = var22[class130.method985(class194.field3343, arg2 - (-arg3 - -1) + -var26)] = var23 * var28 >> 12;
                        }
                    }
                    if (class1.field11 < var19 + var20) {
                        int var27 = -var20 + class1.field11;
                        class102.method771(var22, var20, var27, var23);
                        class102.method771(var22, 0, -var27 + var19, var23);
                    } else {
                        class102.method771(var22, var20, var19, var23);
                    }
                } else {
                    int var29 = -var21 + arg4 + -1;
                    if (~var17 < ~var29) {
                        int var30 = var8 * var29 / var17;
                        if (~this.field2187 != -1) {
                            for (int var31 = 0; ~var18 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class130.method985(arg2 - -var31, class194.field3343)] = var22[class130.method985(class194.field3343, arg2 - var31 - 1 + arg3)] = ~var30 < ~var32 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var18 > var33; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class130.method985(class194.field3343, arg2 + var33)] = var22[class130.method985(class194.field3343, arg2 + arg3 + -var33 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (~(var19 + var20) < ~class1.field11) {
                            int var34 = class1.field11 - var20;
                            class102.method771(var22, var20, var34, var30);
                            class102.method771(var22, 0, var19 - var34, var30);
                        } else {
                            class102.method771(var22, var20, var19, var30);
                        }
                    } else {
                        for (int var36 = 0; var18 > var36; ++var36) {
                            var22[class130.method985(class194.field3343, arg2 + var36)] = var22[class130.method985(class194.field3343, arg2 + arg3 + -1 + -var36)] = var8 * var36 / var18;
                        }
                        if (~class1.field11 > ~(var19 + var20)) {
                            int var37 = -var20 + class1.field11;
                            class102.method771(var22, var20, var37, var8);
                            class102.method771(var22, 0, -var37 + var19, var8);
                        } else {
                            class102.method771(var22, var20, var19, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field2194;
        if (arg0 != 2) {
            method918(-39);
        }
    }
}
