import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class300 extends class120 {

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    private int field4850 = 819;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    private int field4855 = 2048;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    private int field4863 = 1024;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    private int field4856 = 0;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    private int field4851 = 409;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    private int field4861 = 0;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    private int field4858 = 1024;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    private int field4864 = 1024;

    @OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
    private int field4869 = 1024;

    @OriginalMember(owner = "client!hh", name = "ob", descriptor = "[I")
    public static int[] field4871 = new int[2];

    @OriginalMember(owner = "client!hh", name = "nb", descriptor = "Lok;")
    public static class41 field4870 = class137.method956(")4a=", 45);

    @OriginalMember(owner = "client!hh", name = "pb", descriptor = "[J")
    public static long[] field4872 = new long[500];

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "Lcf;")
    public static class175 field4859 = new class175();

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!hh", name = "qb", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "Lmh;")
    public static class65 field4862;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Llb;II)V", line = 4)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field4868++;
        if (arg1 != -1) {
            this.field4850 = 69;
        }
        if (arg2 == 0) {
            this.field4861 = arg0.method792(2);
        } else if (arg2 == 1) {
            this.field4858 = arg0.method759((byte) -34);
        } else if (arg2 == 2) {
            this.field4855 = arg0.method759((byte) -100);
        } else if (arg2 == 3) {
            this.field4851 = arg0.method759((byte) -39);
        } else if (arg2 == 4) {
            this.field4850 = arg0.method759((byte) -127);
        } else if (arg2 == 5) {
            this.field4869 = arg0.method759((byte) -70);
        } else if (arg2 == 6) {
            this.field4856 = arg0.method792(2);
        } else if (arg2 == 7) {
            this.field4864 = arg0.method759((byte) -87);
        } else if (arg2 == 8) {
            this.field4863 = arg0.method759((byte) -39);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IJ)V", line = 100)
    public static final void method2068(int arg0, long arg1) {
        field4873++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 <= 116) {
            field4871 = (int[]) null;
        }
        if ((arg1 % 10L) == 0L) {
            class142.method991(2, arg1 - 1L);
            class142.method991(2, 1L);
        } else {
            class142.method991(2, arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[[IIIII)I", line = 126)
    public static final int method2069(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (128 - arg4) * arg1[arg3][arg0] + arg1[arg3 + 1][arg0] * arg4 >> 7;
        if (arg2 != 1496591591) {
            method2069(-21, (int[][]) ((int[][]) null), -81, 34, -99, 123);
        }
        field4860++;
        int var7 = (128 - arg4) * arg1[arg3][arg0 + 1] + arg1[arg3 + 1][arg0 + 1] * arg4 >> 7;
        return (128 - arg5) * var6 + (arg5 * var7) >> 7;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 185)
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 151)
    public final void method31(int arg0) {
        field4852++;
        if (arg0 != -31851) {
            this.field4851 = -73;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLmh;Lmh;Lmh;Lmh;)V", line = 170)
    public static final void method2070(byte arg0, class65 arg1, class65 arg2, class65 arg3, class65 arg4) {
        if (arg0 >= -116) {
            field4859 = (class175) null;
        }
        field4865++;
        class20.field314 = arg4;
        class214.field3444 = arg2;
        class225.field3604 = arg1;
        class74.field1089 = arg3;
        class273.field4446 = new class302[class20.field314.method477((byte) 69)][];
        class126.field1872 = new boolean[class20.field314.method477((byte) 83)];
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/util/Random;III[[III)V", line = 205)
    private final void method2071(Random arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        field4854++;
        int var8 = this.field4863 > 0 ? 4096 - class91.method640(45, this.field4863, arg0) : 4096;
        int var9 = this.field4864 * this.field4857 >> 12;
        int var10 = this.field4857 - (var9 > 0 ? class91.method640(92, var9, arg0) : 0);
        if (arg2 >= class307.field5160) {
            arg2 -= class307.field5160;
        }
        if (arg3 < var10) {
            if (arg6 <= 0 || arg1 <= 0) {
                return;
            }
            int var15 = arg1 / 2;
            int var16 = arg6 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg2 + var17;
            int var20 = arg1 - var17 * 2;
            for (int var21 = 0; var21 < arg6; var21++) {
                int[] var22 = arg4[arg5 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field4856 == 0) {
                        for (int var26 = 0; var26 < var17; var26++) {
                            int var27 = var8 * var26 / var17;
                            var22[class217.method1563(class51.field776, arg2 + var26)] = var22[class217.method1563(arg2 + arg1 - var26 - 1, class51.field776)] = var23 * var27 >> 12;
                        }
                    } else {
                        for (int var24 = 0; var24 < var17; var24++) {
                            int var25 = var8 * var24 / var17;
                            var22[class217.method1563(arg2 + var24, class51.field776)] = var22[class217.method1563(class51.field776, arg1 + arg2 - var24 - 1)] = var25 >= var23 ? var23 : var25;
                        }
                    }
                    if (class307.field5160 >= (var19 + var20)) {
                        class21.method143(var22, var19, var20, var23);
                    } else {
                        int var28 = class307.field5160 - var19;
                        class21.method143(var22, var19, var28, var23);
                        class21.method143(var22, 0, var20 - var28, var23);
                    }
                } else {
                    int var29 = arg6 - var21 - 1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field4856 == 0) {
                            for (int var33 = 0; var33 < var17; var33++) {
                                int var34 = var8 * var33 / var17;
                                var22[class217.method1563(arg2 + var33, class51.field776)] = var22[class217.method1563(class51.field776, arg1 + arg2 - var33 - 1)] = var30 * var34 >> 12;
                            }
                        } else {
                            for (int var31 = 0; var31 < var17; var31++) {
                                int var32 = var8 * var31 / var17;
                                var22[class217.method1563(class51.field776, arg2 + var31)] = var22[class217.method1563(class51.field776, arg1 + arg2 - var31 - 1)] = var32 < var30 ? var32 : var30;
                            }
                        }
                        if (class307.field5160 >= (var19 + var20)) {
                            class21.method143(var22, var19, var20, var30);
                        } else {
                            int var35 = class307.field5160 - var19;
                            class21.method143(var22, var19, var35, var30);
                            class21.method143(var22, 0, var20 - var35, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; var36++) {
                            var22[class217.method1563(class51.field776, arg2 + var36)] = var22[class217.method1563(arg1 + arg2 - var36 - 1, class51.field776)] = var8 * var36 / var17;
                        }
                        if (class307.field5160 < (var19 + var20)) {
                            int var37 = class307.field5160 - var19;
                            class21.method143(var22, var19, var37, var8);
                            class21.method143(var22, 0, var20 - var37, var8);
                        } else {
                            class21.method143(var22, var19, var20, var8);
                        }
                    }
                }
            }
        } else if ((arg2 + arg1) > class307.field5160) {
            int var11 = class307.field5160 - arg2;
            for (int var12 = 0; var12 < arg6; var12++) {
                int[] var13 = arg4[arg5 + var12];
                class21.method143(var13, arg2, var11, var8);
                class21.method143(var13, 0, arg1 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg6; var14++) {
                class21.method143(arg4[arg5 + var14], arg2, arg1, var8);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I", line = 404)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        field4867++;
        if (this.field1775.field1798) {
            int[][] var4 = this.field1775.method860(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class307.field5160 * this.field4858 >> 12;
            int var14 = 0;
            int var15 = class307.field5160 * this.field4855 >> 12;
            int var16 = class226.field3609 * this.field4851 >> 12;
            int var17 = class226.field3609 * this.field4850 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            int var18 = class307.field5160 / var13 + 1;
            int[][] var19 = new int[var18][3];
            this.field4857 = class307.field5160 / 8 * this.field4869 >> 12;
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4861);
            label133: while (true) {
                while (true) {
                    int var22 = var13 + class91.method640(arg1 + 14985, -var13 + var15, var21);
                    int var23 = class91.method640(43, var17 - var16, var21) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class307.field5160) {
                        var22 = class307.field5160 - var8;
                        var24 = class307.field5160;
                    }
                    int var27;
                    if (var11) {
                        var27 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        var27 = var26[2];
                        int var28 = var6 + var24;
                        if (var28 < 0) {
                            var28 += class307.field5160;
                        }
                        int var29 = 0;
                        if (class307.field5160 < var28) {
                            var28 -= class307.field5160;
                        }
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var28 >= var30[0] && var30[1] >= var28) {
                                if (var9 != var25) {
                                    int var31 = var8 + var6;
                                    if (var31 < 0) {
                                        var31 += class307.field5160;
                                    }
                                    if (class307.field5160 < var31) {
                                        var31 -= class307.field5160;
                                    }
                                    for (int var32 = 1; var32 <= var29; var32++) {
                                        int[] var33 = var20[(var9 + var32) % var12];
                                        var27 = Math.max(var27, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var29; var34++) {
                                        int[] var35 = var20[(var9 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var27 != var36) {
                                            int var37 = var35[1];
                                            int var38 = var35[0];
                                            int var39;
                                            int var40;
                                            if (var31 < var28) {
                                                var39 = Math.max(var31, var38);
                                                var40 = Math.min(var28, var37);
                                            } else if (var38 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var28, var37);
                                            } else {
                                                var39 = Math.max(var31, var38);
                                                var40 = class307.field5160;
                                            }
                                            this.method2071(var21, var40 - var39, var7 + var39, arg1 ^ 0xFFFFC591, var4, var36, var27 - var36);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            var25++;
                            if (var25 >= var12) {
                                var25 = 0;
                            }
                            var29++;
                        }
                    }
                    if ((var27 + var23) <= class226.field3609) {
                        var10 = false;
                    } else {
                        var23 = class226.field3609 - var27;
                    }
                    if (class307.field5160 == var24) {
                        this.method2071(var21, var22, var5 + var8, 0, var4, var27, var23);
                        if (var10) {
                            break label133;
                        }
                        var9 = 0;
                        var10 = true;
                        int[] var42 = var19[var14++];
                        var42[1] = var24;
                        var12 = var14;
                        var11 = false;
                        var42[0] = var8;
                        var7 = var5;
                        int[][] var43 = var20;
                        var8 = 0;
                        var42[2] = var23 + var27;
                        var14 = 0;
                        var5 = class91.method640(68, class307.field5160, var21);
                        var20 = var19;
                        var19 = var43;
                        var6 = var5 - var7;
                        int var44 = var6;
                        if (var6 < 0) {
                            var44 = class307.field5160 + var6;
                        }
                        if (var44 > class307.field5160) {
                            var44 -= class307.field5160;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var45[0] <= var44 && var45[1] >= var44) {
                                break;
                            }
                            var9++;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var19[var14++];
                        var41[2] = var23 + var27;
                        var41[0] = var8;
                        var41[1] = var24;
                        this.method2071(var21, var22, var8 + var5, arg1 ^ 0xFFFFC591, var4, var27, var23);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 != -14959) {
            this.method30((class112) null, 1, -95);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V", line = 670)
    public static void method2072(int arg0) {
        field4862 = null;
        field4870 = null;
        field4872 = null;
        field4871 = null;
        if (arg0 < -95) {
            field4859 = null;
        }
    }
}
