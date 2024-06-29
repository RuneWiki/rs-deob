import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class487 extends class136 {

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    private int field7147 = 1024;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
    private int field7143 = 1024;

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    private int field7146 = 2048;

    @OriginalMember(owner = "client!ev", name = "R", descriptor = "I")
    private int field7156 = 1024;

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "I")
    private int field7153 = 0;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "I")
    private int field7154 = 819;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "I")
    private int field7142 = 1024;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
    private int field7148 = 409;

    @OriginalMember(owner = "client!ev", name = "T", descriptor = "I")
    private int field7158 = 0;

    @OriginalMember(owner = "client!ev", name = "S", descriptor = "I")
    public static int field7157 = 0;

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "Z")
    public static volatile boolean field7145 = true;

    @OriginalMember(owner = "client!ev", name = "U", descriptor = "[Z")
    public static boolean[] field7159 = new boolean[8];

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "Lsl;")
    public static class318 field7150 = new class318(77, 7);

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
    private int field7141;

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!ev", name = "V", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!ev", name = "W", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!ev", name = "X", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIBII)V")
    public static final void method2924(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field7151;
        class241.field3566 = arg0;
        class446.field6590 = arg1;
        class172.field2446 = arg4;
        class45.field509 = arg3;
        if (arg2 != 118) {
            method2927(-100);
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(Z)V")
    public static final void method2925(boolean arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class173.field2456[var1] = false;
        }
        ++field7160;
        class400.field5930 = field7162;
        if (!arg0) {
            method2925(false);
        }
        class181.field2544 = class161.field2268;
        class226.field3304 = class486.field7138;
        class284.field4129 = 0;
        class509.field7505 = -1;
        class306.field4343 = class263.field3867;
        class462.field6802 = 5;
        class193.field2810 = 0;
        class408.field6072 = -1;
        class178.field2512 = class321.field4529;
        class182.field2581 = class316.field4503;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lya;Lfi;IIIII)V")
    public static final void method2926(class38 arg0, class388 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (class308.field4395 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class241.field3562) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class497.field7388 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class148 var15 = class422.field6240[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class131.field1899[var12].method430(var13, var14) + class131.field1899[var12].method430(var13 + 1, var14) + class131.field1899[var12].method430(var13, var14 + 1) + class131.field1899[var12].method430(var13 + 1, var14 + 1)) / 4 - (class131.field1899[arg2].method430(arg3, arg4) + class131.field1899[arg2].method430(arg3 + 1, arg4) + class131.field1899[arg2].method430(arg3, arg4 + 1) + class131.field1899[arg2].method430(arg3 + 1, arg4 + 1)) / 4;
                                    class235 var17 = var15.field2098;
                                    class235 var18 = var15.field2078;
                                    if (var17 != null && var17.method32((byte) 127)) {
                                        arg1.method25((var14 - arg4) * class376.field5566 + (1 - arg6) * class47.field517, (var13 - arg3) * class376.field5566 + (1 - arg5) * class47.field517, var17, (byte) -99, var7, arg0, var16);
                                    }
                                    if (var18 != null && var18.method32((byte) 119)) {
                                        arg1.method25((var14 - arg4) * class376.field5566 + (1 - arg6) * class47.field517, (var13 - arg3) * class376.field5566 + (1 - arg5) * class47.field517, var18, (byte) -99, var7, arg0, var16);
                                    }
                                    for (class480 var19 = var15.field2086; var19 != null; var19 = var19.field7058) {
                                        class431 var20 = var19.field7054;
                                        if (var20 != null && var20.method32((byte) 116) && (var20.field6332 == var13 || var8 == var13) && (var20.field6339 == var14 || var10 == var14)) {
                                            int var21 = var20.field6340 - var20.field6332 + 1;
                                            int var22 = var20.field6337 - var20.field6339 + 1;
                                            arg1.method25((var20.field6339 - arg4) * class376.field5566 + (var22 - arg6) * class47.field517, (var20.field6332 - arg3) * class376.field5566 + (var21 - arg5) * class47.field517, var20, (byte) -99, var7, arg0, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)V")
    public static void method2927(int arg0) {
        if (arg0 != -1) {
            method2924(-119, -87, (byte) -111, 65, 24);
        }
        field7150 = null;
        field7159 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (!arg0) {
            ++field7152;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field7144;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[][] var4 = super.field1957.method2885(10);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class467.field6889 * this.field7156 >> 12;
            int var15 = class467.field6889 * this.field7146 >> 12;
            int var16 = class227.field3310 * this.field7148 >> 12;
            int var17 = class227.field3310 * this.field7154 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field7141 = class467.field6889 / 8 * this.field7147 >> 12;
            int var18 = class467.field6889 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field7158);
            label128: while (true) {
                while (true) {
                    int var22 = var14 + class245.method1609((byte) 94, var21, -var14 + var15);
                    int var23 = class245.method1609((byte) 94, var21, var17 - var16) + var16;
                    int var24 = var8 + var22;
                    if (~var24 < ~class467.field6889) {
                        var24 = class467.field6889;
                        var22 = class467.field6889 - var8;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var24 - -var5;
                        if (~var29 > -1) {
                            var29 += class467.field6889;
                        }
                        if (class467.field6889 < var29) {
                            var29 -= class467.field6889;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && ~var29 >= ~var30[1]) {
                                if (~var9 != ~var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class467.field6889;
                                    }
                                    if (var31 > class467.field6889) {
                                        var31 -= class467.field6889;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var29 <= var31) {
                                                if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class467.field6889;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method2928(var35, 0, -var35 + var25, -var38 + var39, var4, var7 + var38, var21);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var26;
                            if (var12 <= var26) {
                                var26 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (var23 + var25 <= class227.field3310) {
                        var10 = false;
                    } else {
                        var23 = -var25 + class227.field3310;
                    }
                    if (class467.field6889 == var24) {
                        this.method2928(var25, 0, var23, var22, var4, var6 + var8, var21);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var8;
                        var41[2] = var23 + var25;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var7 = var6;
                        var13 = 0;
                        var6 = class245.method1609((byte) 94, var21, class467.field6889);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class467.field6889 + var5;
                        }
                        if (~var43 < ~class467.field6889) {
                            var43 -= class467.field6889;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[2] = var23 + var25;
                        var45[0] = var8;
                        var45[1] = var24;
                        this.method2928(var25, 0, var23, var22, var4, var6 + var8, var21);
                        var8 = var24;
                    }
                }
            }
        }
        int var46 = -126 % ((67 - arg0) / 50);
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
    public class487() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V")
    private final void method2928(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        ++field7155;
        int var8 = ~this.field7143 >= -1 ? 4096 : 4096 + -class245.method1609((byte) 94, arg6, this.field7143);
        int var9 = this.field7142 * this.field7141 >> 12;
        int var10 = this.field7141 - (~var9 < -1 ? class245.method1609((byte) 94, arg6, var9) : 0);
        if (class467.field6889 <= arg5) {
            arg5 -= class467.field6889;
        }
        if (var10 > arg1) {
            if (~arg2 < -1 && arg3 > 0) {
                int var11 = arg3 / 2;
                int var12 = arg2 / 2;
                int var13 = var11 < var10 ? var11 : var10;
                int var14 = var10 > var12 ? var12 : var10;
                int var15 = arg5 + var13;
                int var16 = -(var13 * 2) + arg3;
                for (int var17 = 0; var17 < arg2; ++var17) {
                    int[] var18 = arg4[var17 - -arg0];
                    if (var14 > var17) {
                        int var19 = var8 * var17 / var14;
                        if (this.field7153 != 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class345.method2089(arg5 - -var20, class166.field2356)] = var18[class345.method2089(-var20 + arg3 + -1 + arg5, class166.field2356)] = var19 > var21 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class345.method2089(arg5 + var22, class166.field2356)] = var18[class345.method2089(class166.field2356, arg3 + arg5 - var22 + -1)] = var19 * var24 >> 12;
                            }
                        }
                        if (var15 + var16 > class467.field6889) {
                            int var23 = -var15 + class467.field6889;
                            class201.method1409(var18, var15, var23, var19);
                            class201.method1409(var18, 0, var16 - var23, var19);
                        } else {
                            class201.method1409(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg2 - 1;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field7153 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class345.method2089(arg5 + var27, class166.field2356)] = var18[class345.method2089(class166.field2356, arg3 + arg5 + -var27 + -1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class345.method2089(arg5 + var29, class166.field2356)] = var18[class345.method2089(class166.field2356, arg5 - 1 + -var29 + arg3)] = var31 >= var26 ? var26 : var31;
                                }
                            }
                            if (class467.field6889 < var15 + var16) {
                                int var30 = -var15 + class467.field6889;
                                class201.method1409(var18, var15, var30, var26);
                                class201.method1409(var18, 0, var16 - var30, var26);
                            } else {
                                class201.method1409(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class345.method2089(arg5 + var32, class166.field2356)] = var18[class345.method2089(class166.field2356, -var32 - 1 + arg3 + arg5)] = var8 * var32 / var13;
                            }
                            if (var15 + var16 <= class467.field6889) {
                                class201.method1409(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class467.field6889;
                                class201.method1409(var18, var15, var33, var8);
                                class201.method1409(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg3 + arg5 <= class467.field6889) {
            for (int var34 = 0; var34 < arg2; ++var34) {
                class201.method1409(arg4[arg0 - -var34], arg5, arg3, var8);
            }
        } else {
            int var35 = -arg5 + class467.field6889;
            for (int var36 = 0; arg2 > var36; ++var36) {
                int[] var37 = arg4[arg0 + var36];
                class201.method1409(var37, arg5, var35, var8);
                class201.method1409(var37, 0, arg3 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field7143 = arg2.method623((byte) -98);
                                        }
                                    } else {
                                        this.field7142 = arg2.method623((byte) 84);
                                    }
                                } else {
                                    this.field7153 = arg2.method577(255);
                                }
                            } else {
                                this.field7147 = arg2.method623((byte) 116);
                            }
                        } else {
                            this.field7154 = arg2.method623((byte) 88);
                        }
                    } else {
                        this.field7148 = arg2.method623((byte) 101);
                    }
                } else {
                    this.field7146 = arg2.method623((byte) 110);
                }
            } else {
                this.field7156 = arg2.method623((byte) -58);
            }
        } else {
            this.field7158 = arg2.method577(255);
        }
        if (arg0 != 4) {
            field7150 = null;
        }
        ++field7149;
    }
}
