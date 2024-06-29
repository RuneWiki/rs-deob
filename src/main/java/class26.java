import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class200 {

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field391 = 409;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    private int field389 = 1024;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    private int field383 = 1024;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    private int field386 = 0;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    private int field392 = 2048;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    private int field401 = 1024;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    private int field399 = 819;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    private int field402 = 1024;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lid;")
    public static class149 field388 = class60.method382("overlay2", (byte) 84);

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Z")
    public static boolean field398 = true;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method144(int arg0) {
        field388 = null;
        if (arg0 != 2) {
            method147(62, 43, 120, (class230) null);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lhk;")
    public static final class125 method145(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = var3.field4053;
            var3.field4053 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Laj;B)Laj;")
    public static final class47 method146(class47 arg0, byte arg1) {
        ++field385;
        if (arg0.field707 != -1) {
            return class251.method1741((byte) 110, arg0.field707);
        } else {
            int var2 = arg0.field834 >>> 16;
            class159 var3 = new class159(class34.field499);
            for (class3 var4 = (class3) var3.method1149(-1); var4 != null; var4 = (class3) var3.method1146(15035)) {
                if (var4.field42 == var2) {
                    return class251.method1741((byte) 110, (int) var4.field1148);
                }
            }
            int var5 = -89 / ((arg1 - 16) / 35);
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILal;)[Lsi;")
    public static final class198[] method147(int arg0, int arg1, int arg2, class230 arg3) {
        if (arg2 != -1006411924) {
            return null;
        } else {
            ++field397;
            return !class59.method371((byte) -119, arg1, arg0, arg3) ? null : class3.method17(86);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIII[[ILjava/util/Random;)V")
    private final void method148(boolean arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
        if (!arg0) {
            this.field384 = 92;
        }
        ++field390;
        int var8 = this.field383 > 0 ? -class35.method200(-12, arg6, this.field383) + 4096 : 4096;
        int var9 = this.field389 * this.field384 >> 12;
        int var10 = this.field384 + -(~var9 < -1 ? class35.method200(5, arg6, var9) : 0);
        if (~arg2 <= ~class137.field2515) {
            arg2 -= class137.field2515;
        }
        if (var10 <= 0) {
            if (~class137.field2515 <= ~(arg2 - -arg3)) {
                for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                    class209.method1427(arg5[arg1 - -var11], arg2, arg3, var8);
                }
            } else {
                int var12 = class137.field2515 - arg2;
                for (int var13 = 0; arg4 > var13; ++var13) {
                    int[] var14 = arg5[arg1 + var13];
                    class209.method1427(var14, arg2, var12, var8);
                    class209.method1427(var14, 0, -var12 + arg3, var8);
                }
            }
        } else if (~arg4 < -1 && ~arg3 < -1) {
            int var15 = arg3 / 2;
            int var16 = ~var15 <= ~var10 ? var10 : var15;
            int var17 = arg4 / 2;
            int var18 = var10 > var17 ? var17 : var10;
            int var19 = arg2 + var16;
            int var20 = -(var16 * 2) + arg3;
            for (int var21 = 0; ~var21 > ~arg4; ++var21) {
                int[] var22 = arg5[arg1 + var21];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field386 == -1) {
                        for (int var24 = 0; ~var16 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var16;
                            var22[class136.method953(class261.field4667, arg2 + var24)] = var22[class136.method953(class261.field4667, arg2 + arg3 - var24 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var16 > var26; ++var26) {
                            int var28 = var8 * var26 / var16;
                            var22[class136.method953(class261.field4667, arg2 + var26)] = var22[class136.method953(class261.field4667, -var26 - 1 + arg2 + arg3)] = var28 < var23 ? var28 : var23;
                        }
                    }
                    if (var19 + var20 <= class137.field2515) {
                        class209.method1427(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class137.field2515;
                        class209.method1427(var22, var19, var27, var23);
                        class209.method1427(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg4 + -1;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field386 != -1) {
                            for (int var31 = 0; ~var16 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var16;
                                var22[class136.method953(arg2 + var31, class261.field4667)] = var22[class136.method953(arg3 - 1 + -var31 + arg2, class261.field4667)] = var30 > var32 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var33 < var16; ++var33) {
                                int var35 = var8 * var33 / var16;
                                var22[class136.method953(class261.field4667, arg2 + var33)] = var22[class136.method953(class261.field4667, arg2 - -arg3 - 1 + -var33)] = var30 * var35 >> 12;
                            }
                        }
                        if (~(var19 - -var20) >= ~class137.field2515) {
                            class209.method1427(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class137.field2515;
                            class209.method1427(var22, var19, var34, var30);
                            class209.method1427(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var16 > var36; ++var36) {
                            var22[class136.method953(class261.field4667, arg2 + var36)] = var22[class136.method953(arg2 - (-arg3 - -1) + -var36, class261.field4667)] = var8 * var36 / var16;
                        }
                        if (class137.field2515 >= var19 + var20) {
                            class209.method1427(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class137.field2515;
                            class209.method1427(var22, var19, var37, var8);
                            class209.method1427(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static final void method149(int arg0) {
        ++field400;
        class285.method1959(false, (byte) -113);
        System.gc();
        class50.method329(arg0 + -11486, arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field387;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field383 = arg0.method485(-2386);
                                        }
                                    } else {
                                        this.field389 = arg0.method485(-2386);
                                    }
                                } else {
                                    this.field386 = arg0.method489((byte) 104);
                                }
                            } else {
                                this.field402 = arg0.method485(-2386);
                            }
                        } else {
                            this.field399 = arg0.method485(-2386);
                        }
                    } else {
                        this.field391 = arg0.method485(-2386);
                    }
                } else {
                    this.field392 = arg0.method485(-2386);
                }
            } else {
                this.field401 = arg0.method485(-2386);
            }
        } else {
            this.field394 = arg0.method489((byte) -49);
        }
        if (!arg1) {
            this.method31((class74) null, true, 22);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        int var2 = 123 % ((-60 - arg0) / 62);
        ++field393;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)I")
    public static final int method151(int arg0, byte arg1) {
        ++field396;
        if (arg1 != -80) {
            field388 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        int[] var3 = super.field3638.method1879(arg0, true);
        if (arg1 != 55) {
            this.field383 = -18;
        }
        ++field382;
        if (super.field3638.field4887) {
            int var4 = 0;
            int[][] var5 = super.field3638.method1885((byte) 70);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = class137.field2515 * this.field401 >> 12;
            int var14 = 0;
            int var15 = class276.field4934 * this.field391 >> 12;
            int var16 = class276.field4934 * this.field399 >> 12;
            int var17 = class137.field2515 * this.field392 >> 12;
            if (var16 <= 1) {
                return var5[arg0];
            } else {
                this.field384 = class137.field2515 / 8 * this.field402 >> 12;
                int var18 = class137.field2515 / var13 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field394);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = class35.method200(115, var20, var17 - var13) + var13;
                        int var23 = var7 + var22;
                        int var24 = class35.method200(120, var20, var16 - var15) + var15;
                        if (var23 > class137.field2515) {
                            var22 = -var7 + class137.field2515;
                            var23 = class137.field2515;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int var26 = var8;
                            int[] var27 = var19[var8];
                            var25 = var27[2];
                            int var28 = 0;
                            int var29 = var23 - -var4;
                            if (var29 < 0) {
                                var29 += class137.field2515;
                            }
                            if (~var29 < ~class137.field2515) {
                                var29 -= class137.field2515;
                            }
                            while (true) {
                                int[] var30 = var19[var26];
                                if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                    if (var8 != var26) {
                                        int var31 = var4 + var7;
                                        if (var31 < 0) {
                                            var31 += class137.field2515;
                                        }
                                        if (~class137.field2515 > ~var31) {
                                            var31 -= class137.field2515;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var19[(var8 + var32) % var11];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var19[(var8 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (~var37 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var36);
                                                    } else {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = class137.field2515;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var29, var36);
                                                }
                                                this.method148(true, var35, var6 + var38, var39 - var38, -var35 + var25, var5, var20);
                                            }
                                        }
                                    }
                                    var8 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var26 >= var11) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (~class276.field4934 <= ~(var24 + var25)) {
                            var9 = false;
                        } else {
                            var24 = -var25 + class276.field4934;
                        }
                        if (class137.field2515 == var23) {
                            this.method148(true, var25, var7 + var12, var22, var24, var5, var20);
                            if (var9) {
                                return var3;
                            }
                            var6 = var12;
                            var8 = 0;
                            int[] var41 = var21[var14++];
                            var11 = var14;
                            var41[1] = var23;
                            var41[0] = var7;
                            var14 = 0;
                            int[][] var42 = var19;
                            var9 = true;
                            var41[2] = var24 + var25;
                            var10 = false;
                            var19 = var21;
                            var21 = var42;
                            var12 = class35.method200(-118, var20, class137.field2515);
                            var7 = 0;
                            var4 = var12 - var6;
                            int var43 = var4;
                            if (~var4 > -1) {
                                var43 = class137.field2515 + var4;
                            }
                            if (~class137.field2515 > ~var43) {
                                var43 -= class137.field2515;
                            }
                            while (true) {
                                int[] var44 = var19[var8];
                                if (~var44[0] >= ~var43 && var43 <= var44[1]) {
                                    break;
                                }
                                ++var8;
                                if (var8 >= var11) {
                                    var8 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var21[var14++];
                            var45[2] = var24 + var25;
                            var45[0] = var7;
                            var45[1] = var23;
                            this.method148(true, var25, var7 + var12, var22, var24, var5, var20);
                            var7 = var23;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
