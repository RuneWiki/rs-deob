import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class315 extends class80 {

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    private int field4741 = 1024;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    private int field4743 = 2048;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    private int field4742 = 819;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    private int field4750 = 1024;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    private int field4746 = 1024;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    private int field4747 = 0;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    private int field4751 = 1024;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    private int field4749 = 409;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    private int field4753 = 0;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "Ls;")
    public static class186 field4752 = new class186(32, -1);

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "[I")
    public static int[] field4756;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    private int field4748;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "Z")
    public static boolean field4754;

    static {
        new class309("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field4755 = 328;
        field4756 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I", line = 4)
    public final int[] method25(int arg0, int arg1) {
        ++field4745;
        if (arg1 != -16828) {
            this.field4751 = 36;
        }
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[][] var4 = super.field1601.method47(-118);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class137.field2308 * this.field4746 >> 12;
            int var15 = class137.field2308 * this.field4743 >> 12;
            int var16 = class278.field4199 * this.field4749 >> 12;
            int var17 = class278.field4199 * this.field4742 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field4748 = class137.field2308 / 8 * this.field4751 >> 12;
                int var18 = 1 - -(class137.field2308 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4747);
                while (true) {
                    while (true) {
                        int var22 = class32.method222(var21, -13086, var15 - var14) + var14;
                        int var23 = class32.method222(var21, -13086, -var16 + var17) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class137.field2308) {
                            var24 = class137.field2308;
                            var22 = class137.field2308 - var8;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class137.field2308;
                            }
                            if (class137.field2308 < var28) {
                                var28 -= class137.field2308;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && ~var28 >= ~var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class137.field2308;
                                        }
                                        if (~var31 < ~class137.field2308) {
                                            var31 -= class137.field2308;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var29 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var28 <= var31) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class137.field2308;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1991(var21, var4, var7 + var38, -var35 + var29, var35, -87, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (class278.field4199 < var23 + var29) {
                            var23 = -var29 + class278.field4199;
                        } else {
                            var10 = false;
                        }
                        if (class137.field2308 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var29 - -var23;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method1991(var21, var4, var6 + var8, var23, var29, -90, var22);
                            var8 = var24;
                        } else {
                            this.method1991(var21, var4, var6 + var8, var23, var29, -93, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var29;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var7 = var6;
                            var13 = 0;
                            var6 = class32.method222(var21, -13086, class137.field2308);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class137.field2308 + var5;
                            }
                            if (var44 > class137.field2308) {
                                var44 -= class137.field2308;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && var45[1] >= var44) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
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

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILnn;)V", line = 259)
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = -51 % ((arg1 - 28) / 53);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field4741 = arg2.method1841((byte) -124);
                                        }
                                    } else {
                                        this.field4750 = arg2.method1841((byte) -4);
                                    }
                                } else {
                                    this.field4753 = arg2.method1858(-3256);
                                }
                            } else {
                                this.field4751 = arg2.method1841((byte) -125);
                            }
                        } else {
                            this.field4742 = arg2.method1841((byte) -126);
                        }
                    } else {
                        this.field4749 = arg2.method1841((byte) -120);
                    }
                } else {
                    this.field4743 = arg2.method1841((byte) -121);
                }
            } else {
                this.field4746 = arg2.method1841((byte) 20);
            }
        } else {
            this.field4747 = arg2.method1858(-3256);
        }
        ++field4739;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 607)
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/util/Random;[[IIIIII)V", line = 365)
    private final void method1991(Random arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4744;
        int var8 = this.field4741 <= 0 ? 4096 : 4096 + -class32.method222(arg0, -13086, this.field4741);
        if (arg5 >= -82) {
            this.method25(0, -24);
        }
        int var9 = this.field4750 * this.field4748 >> 12;
        int var10 = this.field4748 + -(var9 > 0 ? class32.method222(arg0, -13086, var9) : 0);
        if (~class137.field2308 >= ~arg2) {
            arg2 -= class137.field2308;
        }
        if (~var10 >= -1) {
            if (class137.field2308 >= arg2 + arg6) {
                for (int var11 = 0; ~arg3 < ~var11; ++var11) {
                    class394.method2451(arg1[arg4 + var11], arg2, arg6, var8);
                }
            } else {
                int var12 = class137.field2308 - arg2;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    int[] var14 = arg1[arg4 + var13];
                    class394.method2451(var14, arg2, var12, var8);
                    class394.method2451(var14, 0, -var12 + arg6, var8);
                }
            }
        } else if (~arg3 < -1 && arg6 > 0) {
            int var15 = arg6 / 2;
            int var16 = arg3 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var10 > var16 ? var16 : var10;
            int var19 = arg2 + var17;
            int var20 = arg6 - var17 * 2;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg1[var21 - -arg4];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field4753 == 0) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class490.method2960(arg2 + var24, class308.field4672)] = var22[class490.method2960(class308.field4672, -var24 + arg2 + -1 + arg6)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class490.method2960(arg2 + var26, class308.field4672)] = var22[class490.method2960(-var26 + arg2 + arg6 + -1, class308.field4672)] = var23 <= var28 ? var23 : var28;
                        }
                    }
                    if (~(var19 - -var20) >= ~class137.field2308) {
                        class394.method2451(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class137.field2308;
                        class394.method2451(var22, var19, var27, var23);
                        class394.method2451(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = arg3 + -1 + -var21;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field4753 == 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class490.method2960(arg2 + var31, class308.field4672)] = var22[class490.method2960(-var31 + -1 + arg2 + arg6, class308.field4672)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class490.method2960(class308.field4672, arg2 + var33)] = var22[class490.method2960(-var33 + arg6 + arg2 + -1, class308.field4672)] = ~var35 > ~var30 ? var35 : var30;
                            }
                        }
                        if (class137.field2308 < var19 + var20) {
                            int var34 = class137.field2308 - var19;
                            class394.method2451(var22, var19, var34, var30);
                            class394.method2451(var22, 0, -var34 + var20, var30);
                        } else {
                            class394.method2451(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class490.method2960(class308.field4672, arg2 - -var36)] = var22[class490.method2960(arg2 - -arg6 + -1 + -var36, class308.field4672)] = var8 * var36 / var17;
                        }
                        if (class137.field2308 >= var19 - -var20) {
                            class394.method2451(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class137.field2308;
                            class394.method2451(var22, var19, var37, var8);
                            class394.method2451(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 561)
    public static void method1992(int arg0) {
        if (arg0 <= 57) {
            field4752 = null;
        }
        field4756 = null;
        field4752 = null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V", line = 595)
    public final void method23(boolean arg0) {
        if (!arg0) {
            this.field4753 = 24;
        }
        ++field4740;
    }
}
