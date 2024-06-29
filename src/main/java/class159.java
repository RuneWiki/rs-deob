import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class159 extends class300 {

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    private int field2373 = 819;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    private int field2380 = 1024;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    private int field2385 = 0;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field2376 = 1024;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    private int field2378 = 1024;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    private int field2390 = 1024;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    private int field2395 = 2048;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    private int field2393 = 0;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    private int field2389 = 409;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[I")
    public static int[] field2374 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Z")
    public static boolean field2388 = false;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "Lvl;")
    public static class73 field2381;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lwl;")
    public static class82 field2394;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public static final void method1094(int arg0) {
        class293.field4701 = null;
        class5.method32(-1, 0, class238.field3824, 0, arg0, 0, class126.field1814, class112.field1626, 0);
        if (class293.field4701 != null) {
            class237.method1661(class126.field1814, class112.field1626, class293.field4701, 0, class56.field815, 0, 1, class82.field1247.field3718, class10.field148, -1412584499);
            class293.field4701 = null;
        }
        ++field2386;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIIII)V")
    public static final void method1095(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2375;
        if (~arg2 == ~arg4) {
            class161.method1100(arg3, arg5, -2170, arg2, arg1);
        } else {
            if (arg0 != -79) {
                field2374 = null;
            }
            if (~class56.field816 >= ~(arg3 - arg2) && arg2 + arg3 <= class187.field2938 && class115.field1678 <= -arg4 + arg5 && ~class60.field882 <= ~(arg4 + arg5)) {
                class201.method1397(arg1, (byte) -118, arg4, arg3, arg5, arg2);
            } else {
                class114.method754(arg4, arg2, false, arg3, arg1, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        int[] var3 = super.field4797.method217(arg0, true);
        ++field2377;
        if (super.field4797.field470) {
            int[][] var4 = super.field4797.method214(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = class180.field2826 * this.field2376 >> 12;
            boolean var14 = true;
            int var15 = class180.field2826 * this.field2395 >> 12;
            int var16 = class4.field61 * this.field2373 >> 12;
            int var17 = class4.field61 * this.field2389 >> 12;
            if (var16 <= 1) {
                return var4[arg0];
            }
            this.field2387 = class180.field2826 / 8 * this.field2378 >> 12;
            int var18 = 1 - -(class180.field2826 / var13);
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2385);
            label124: while (true) {
                while (true) {
                    int var22 = var13 + class19.method108(var21, -var13 + var15, 26329);
                    int var23 = var8 + var22;
                    int var24 = var17 + class19.method108(var21, -var17 + var16, 26329);
                    if (var23 > class180.field2826) {
                        var23 = class180.field2826;
                        var22 = class180.field2826 - var8;
                    }
                    int var25;
                    if (var10) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        var25 = var27[2];
                        int var28 = 0;
                        int var29 = var6 + var23;
                        if (~var29 > -1) {
                            var29 += class180.field2826;
                        }
                        if (~var29 < ~class180.field2826) {
                            var29 -= class180.field2826;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                if (~var9 != ~var26) {
                                    int var31 = var6 + var8;
                                    if (var31 < 0) {
                                        var31 += class180.field2826;
                                    }
                                    if (class180.field2826 < var31) {
                                        var31 -= class180.field2826;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var11];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var20[(var9 - -var33) % var11];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 >= var29) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class180.field2826;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method1096(0, var35, -var38 + var39, -var35 + var25, var7 + var38, var4, var21);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            ++var26;
                            if (var26 >= var11) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class4.field61 < var24 + var25) {
                        var24 = -var25 + class4.field61;
                    } else {
                        var14 = false;
                    }
                    if (~class180.field2826 != ~var23) {
                        int[] var41 = var19[var12++];
                        var41[2] = var24 + var25;
                        var41[1] = var23;
                        var41[0] = var8;
                        this.method1096(arg1 + 957953300, var25, var22, var24, var8 - -var5, var4, var21);
                        var8 = var23;
                    } else {
                        this.method1096(arg1 + 957953300, var25, var22, var24, var8 - -var5, var4, var21);
                        if (var14) {
                            break label124;
                        }
                        var7 = var5;
                        var14 = true;
                        var9 = 0;
                        var10 = false;
                        int[] var42 = var19[var12++];
                        var42[0] = var8;
                        var42[1] = var23;
                        int[][] var43 = var20;
                        var42[2] = var25 - -var24;
                        var8 = 0;
                        var11 = var12;
                        var20 = var19;
                        var5 = class19.method108(var21, class180.field2826, 26329);
                        var6 = -var7 + var5;
                        var12 = 0;
                        int var44 = var6;
                        if (~var6 > -1) {
                            var44 = class180.field2826 + var6;
                        }
                        var19 = var43;
                        if (~var44 < ~class180.field2826) {
                            var44 -= class180.field2826;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var44 <= ~var45[0] && var45[1] >= var44) {
                                break;
                            }
                            ++var9;
                            if (var9 >= var11) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -957953300) {
            method1095((byte) -78, 105, -54, -11, 26, -89);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII[[ILjava/util/Random;)V")
    private final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
        ++field2382;
        int var8 = this.field2390 <= 0 ? 4096 : 4096 - class19.method108(arg6, this.field2390, 26329);
        int var9 = this.field2387 * this.field2380 >> 12;
        int var10 = this.field2387 + -(~var9 < -1 ? class19.method108(arg6, var9, arg0 ^ 26329) : 0);
        if (~arg4 <= ~class180.field2826) {
            arg4 -= class180.field2826;
        }
        if (arg0 >= var10) {
            if (~class180.field2826 <= ~(arg2 + arg4)) {
                for (int var11 = 0; ~arg3 < ~var11; ++var11) {
                    class103.method695(arg5[arg1 + var11], arg4, arg2, var8);
                }
            } else {
                int var12 = -arg4 + class180.field2826;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    int[] var14 = arg5[arg1 + var13];
                    class103.method695(var14, arg4, var12, var8);
                    class103.method695(var14, 0, -var12 + arg2, var8);
                }
            }
        } else if (arg3 > 0 && ~arg2 < -1) {
            int var15 = arg2 / 2;
            int var16 = ~var10 >= ~var15 ? var10 : var15;
            int var17 = arg3 / 2;
            int var18 = var10 <= var17 ? var10 : var17;
            int var19 = -(var16 * 2) + arg2;
            int var20 = arg4 + var16;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg5[var21 - -arg1];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field2393 == -1) {
                        for (int var24 = 0; var24 < var16; ++var24) {
                            int var25 = var8 * var24 / var16;
                            var22[class205.method1411(class277.field4503, arg4 + var24)] = var22[class205.method1411(-var24 + arg4 + arg2 + -1, class277.field4503)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var16 > var26; ++var26) {
                            int var28 = var8 * var26 / var16;
                            var22[class205.method1411(arg4 + var26, class277.field4503)] = var22[class205.method1411(-var26 + arg2 + arg4 + -1, class277.field4503)] = var23 <= var28 ? var23 : var28;
                        }
                    }
                    if (class180.field2826 < var19 + var20) {
                        int var27 = -var20 + class180.field2826;
                        class103.method695(var22, var20, var27, var23);
                        class103.method695(var22, 0, -var27 + var19, var23);
                    } else {
                        class103.method695(var22, var20, var19, var23);
                    }
                } else {
                    int var29 = arg3 + -1 - var21;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field2393 != 0) {
                            for (int var31 = 0; var16 > var31; ++var31) {
                                int var32 = var8 * var31 / var16;
                                var22[class205.method1411(arg4 + var31, class277.field4503)] = var22[class205.method1411(arg4 - -arg2 - var31 - 1, class277.field4503)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var16; ++var33) {
                                int var35 = var8 * var33 / var16;
                                var22[class205.method1411(class277.field4503, arg4 + var33)] = var22[class205.method1411(class277.field4503, arg2 + arg4 - 1 + -var33)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class180.field2826 <= ~(var19 + var20)) {
                            class103.method695(var22, var20, var19, var30);
                        } else {
                            int var34 = -var20 + class180.field2826;
                            class103.method695(var22, var20, var34, var30);
                            class103.method695(var22, 0, -var34 + var19, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var16 < ~var36; ++var36) {
                            var22[class205.method1411(class277.field4503, arg4 + var36)] = var22[class205.method1411(arg4 - -arg2 - (var36 + 1), class277.field4503)] = var8 * var36 / var16;
                        }
                        if (class180.field2826 >= var19 + var20) {
                            class103.method695(var22, var20, var19, var8);
                        } else {
                            int var37 = -var20 + class180.field2826;
                            class103.method695(var22, var20, var37, var8);
                            class103.method695(var22, 0, var19 - var37, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)Lci;")
    public static final class189 method1097(int arg0) {
        ++field2392;
        class91 var1 = new class91(class15.field215, class86.field1308, class166.field2569[0], class277.field4480[0], class64.field924[0], class284.field4603[0], class190.field2959[0], class229.field3539);
        if (arg0 != 22144) {
            field2388 = false;
        }
        class115.method762((byte) -101);
        return var1;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        if (arg0 <= -106) {
            field2394 = null;
            field2381 = null;
            field2374 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 >= -43) {
            this.field2389 = 85;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field2390 = arg0.method1186((byte) -98);
                                        }
                                    } else {
                                        this.field2380 = arg0.method1186((byte) -83);
                                    }
                                } else {
                                    this.field2393 = arg0.method1218(123);
                                }
                            } else {
                                this.field2378 = arg0.method1186((byte) -114);
                            }
                        } else {
                            this.field2373 = arg0.method1186((byte) -118);
                        }
                    } else {
                        this.field2389 = arg0.method1186((byte) -75);
                    }
                } else {
                    this.field2395 = arg0.method1186((byte) -64);
                }
            } else {
                this.field2376 = arg0.method1186((byte) -70);
            }
        } else {
            this.field2385 = arg0.method1218(73);
        }
        ++field2379;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)V")
    public static final void method1099(int arg0, int arg1) {
        class31.field379 = new int[arg1];
        class10.field152 = new int[arg1];
        class225.field3505 = new int[arg1];
        ++field2391;
        class161.field2409 = new int[arg1];
        if (arg0 != 1136813004) {
            field2394 = null;
        }
        class123.field1778 = new int[arg1];
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 < 126) {
            this.field2395 = -5;
        }
        ++field2384;
    }
}
