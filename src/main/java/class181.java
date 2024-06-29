import java.awt.datatransfer.Clipboard;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class181 extends class404 {

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    private int field2810 = 409;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    private int field2818 = 819;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    private int field2809 = 1024;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    private int field2821 = 2048;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    private int field2808 = 1024;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    private int field2823 = 1024;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    private int field2815 = 0;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    private int field2822 = 1024;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    private int field2819 = 0;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    private int field2824;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2811;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/util/Random;[[IIIBII)V")
    private final void method1125(Random arg0, int[][] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field2817;
        if (arg4 != 101) {
            field2816 = -82;
        }
        int var8 = ~this.field2823 >= -1 ? 4096 : 4096 + -class482.method2911((byte) 45, this.field2823, arg0);
        int var9 = this.field2824 * this.field2822 >> 12;
        int var10 = this.field2824 + -(var9 <= 0 ? 0 : class482.method2911((byte) 45, var9, arg0));
        if (~class431.field6348 >= ~arg2) {
            arg2 -= class431.field6348;
        }
        if (~var10 < -1) {
            if (arg5 > 0 && ~arg6 < -1) {
                int var11 = arg6 / 2;
                int var12 = arg5 / 2;
                int var13 = var10 > var11 ? var11 : var10;
                int var14 = var10 > var12 ? var12 : var10;
                int var15 = arg2 + var13;
                int var16 = -(var13 * 2) + arg6;
                for (int var17 = 0; var17 < arg5; ++var17) {
                    int[] var18 = arg1[arg3 + var17];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field2815 != 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class330.method2050(class98.field1757, arg2 + var20)] = var18[class330.method2050(class98.field1757, arg2 - -arg6 - 1 + -var20)] = ~var21 <= ~var19 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class330.method2050(class98.field1757, arg2 + var22)] = var18[class330.method2050(arg2 + arg6 + -var22 + -1, class98.field1757)] = var19 * var24 >> 12;
                            }
                        }
                        if (var15 + var16 <= class431.field6348) {
                            class356.method2179(var18, var15, var16, var19);
                        } else {
                            int var23 = class431.field6348 - var15;
                            class356.method2179(var18, var15, var23, var19);
                            class356.method2179(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg5 + -1 - var17;
                        if (~var25 > ~var14) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field2815 == -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class330.method2050(arg2 - -var27, class98.field1757)] = var18[class330.method2050(class98.field1757, -var27 + arg6 + -1 + arg2)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class330.method2050(class98.field1757, arg2 - -var29)] = var18[class330.method2050(arg2 - -arg6 + -var29 + -1, class98.field1757)] = var31 >= var26 ? var26 : var31;
                                }
                            }
                            if (var15 - -var16 <= class431.field6348) {
                                class356.method2179(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class431.field6348;
                                class356.method2179(var18, var15, var30, var26);
                                class356.method2179(var18, 0, var16 - var30, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class330.method2050(arg2 + var32, class98.field1757)] = var18[class330.method2050(class98.field1757, arg2 + arg6 + -var32 + -1)] = var8 * var32 / var13;
                            }
                            if (~class431.field6348 > ~(var15 + var16)) {
                                int var33 = class431.field6348 - var15;
                                class356.method2179(var18, var15, var33, var8);
                                class356.method2179(var18, 0, var16 - var33, var8);
                            } else {
                                class356.method2179(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class431.field6348 > ~(arg2 + arg6)) {
            int var34 = -arg2 + class431.field6348;
            for (int var35 = 0; var35 < arg5; ++var35) {
                int[] var36 = arg1[arg3 + var35];
                class356.method2179(var36, arg2, var34, var8);
                class356.method2179(var36, 0, arg6 - var34, var8);
            }
        } else {
            for (int var37 = 0; ~arg5 < ~var37; ++var37) {
                class356.method2179(arg1[arg3 - -var37], arg2, arg6, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            this.field2823 = 47;
        }
        ++field2814;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field2823 = arg1.method254((byte) -72);
                                        }
                                    } else {
                                        this.field2822 = arg1.method254((byte) -99);
                                    }
                                } else {
                                    this.field2815 = arg1.method257((byte) 45);
                                }
                            } else {
                                this.field2809 = arg1.method254((byte) -99);
                            }
                        } else {
                            this.field2818 = arg1.method254((byte) -35);
                        }
                    } else {
                        this.field2810 = arg1.method254((byte) -83);
                    }
                } else {
                    this.field2821 = arg1.method254((byte) -45);
                }
            } else {
                this.field2808 = arg1.method254((byte) -65);
            }
        } else {
            this.field2819 = arg1.method257((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2812;
        int[] var3 = super.field5870.method372(arg1, (byte) 72);
        if (super.field5870.field810) {
            int[][] var4 = super.field5870.method371(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class431.field6348 * this.field2808 >> 12;
            int var15 = class431.field6348 * this.field2821 >> 12;
            int var16 = class437.field6437 * this.field2810 >> 12;
            int var17 = class437.field6437 * this.field2818 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field2824 = class431.field6348 / 8 * this.field2809 >> 12;
                int var18 = class431.field6348 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2819);
                while (true) {
                    while (true) {
                        int var22 = class482.method2911((byte) 45, -var14 + var15, var21) + var14;
                        int var23 = var16 + class482.method2911((byte) 45, -var16 + var17, var21);
                        int var24 = var8 - -var22;
                        if (var24 > class431.field6348) {
                            var22 = -var8 + class431.field6348;
                            var24 = class431.field6348;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (var29 < 0) {
                                var29 += class431.field6348;
                            }
                            if (var29 > class431.field6348) {
                                var29 -= class431.field6348;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && ~var29 >= ~var30[1]) {
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class431.field6348;
                                        }
                                        if (~var31 < ~class431.field6348) {
                                            var31 -= class431.field6348;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
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
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class431.field6348;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1125(var21, var4, var7 + var38, var35, (byte) 101, -var35 + var25, -var38 + var39);
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
                        if (class437.field6437 < var25 - -var23) {
                            var23 = class437.field6437 - var25;
                        } else {
                            var10 = false;
                        }
                        if (class431.field6348 != var24) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[2] = var25 - -var23;
                            var41[1] = var24;
                            this.method1125(var21, var4, var6 + var8, var25, (byte) 101, var23, var22);
                            var8 = var24;
                        } else {
                            this.method1125(var21, var4, var6 + var8, var25, (byte) 101, var23, var22);
                            if (var10) {
                                return arg0 > -47 ? null : var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var25;
                            var42[1] = var24;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class482.method2911((byte) 45, class431.field6348, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class431.field6348 + var5;
                            }
                            if (class431.field6348 < var44) {
                                var44 -= class431.field6348;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && var45[1] >= var44) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg0 > -47 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
    public static void method1126(int arg0) {
        if (arg0 != 0) {
            field2816 = 21;
        }
        field2811 = null;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
    public final void method211(int arg0) {
        ++field2813;
        if (arg0 != -3) {
            this.method211(96);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
    public static final void method1127(int arg0, byte arg1) {
        ++field2820;
        class64 var2 = class230.method1387(arg0, (byte) 40, 7);
        if (arg1 >= 87) {
            var2.method446(-20033);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }
}
