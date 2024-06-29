import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class359 extends class182 {

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    private int field5705 = 1024;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    private int field5704 = 1024;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    private int field5707 = 2048;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    private int field5711 = 409;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "I")
    private int field5716 = 1024;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "I")
    private int field5709 = 0;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    private int field5703 = 0;

    @OriginalMember(owner = "client!km", name = "X", descriptor = "I")
    private int field5718 = 819;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "I")
    private int field5719 = 1024;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "Lsf;")
    public static class124 field5714 = new class124(500);

    @OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
    public static int field5721 = 0;

    @OriginalMember(owner = "client!km", name = "bb", descriptor = "I")
    public static int field5722 = 1;

    @OriginalMember(owner = "client!km", name = "cb", descriptor = "Z")
    public static boolean field5723 = true;

    @OriginalMember(owner = "client!km", name = "db", descriptor = "Z")
    public static boolean field5724 = false;

    @OriginalMember(owner = "client!km", name = "eb", descriptor = "[I")
    public static int[] field5725 = new int[2];

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!km", name = "W", descriptor = "I")
    private int field5717;

    @OriginalMember(owner = "client!km", name = "Z", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(I)V", line = 5)
    public static void method2535(int arg0) {
        if (arg0 > 33) {
            field5725 = null;
            field5714 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Loe;IB)V", line = 21)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field5706++;
        if (arg2 != 60) {
            this.method163(-2);
        }
        if (arg1 == 0) {
            this.field5703 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field5719 = arg0.method989(96);
        } else if (arg1 == 2) {
            this.field5707 = arg0.method989(122);
        } else if (arg1 == 3) {
            this.field5711 = arg0.method989(arg2 ^ 0x6E);
        } else if (arg1 == 4) {
            this.field5718 = arg0.method989(114);
        } else if (arg1 == 5) {
            this.field5716 = arg0.method989(arg2 ^ 0x6C);
        } else if (arg1 == 6) {
            this.field5709 = arg0.method1005((byte) 122);
        } else if (arg1 == 7) {
            this.field5705 = arg0.method989(105);
        } else if (arg1 == 8) {
            this.field5704 = arg0.method989(arg2 ^ 0x76);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([[ILjava/util/Random;IIBII)V", line = 119)
    private final void method2536(int[][] arg0, Random arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5710++;
        int var8 = this.field5704 <= 0 ? 4096 : 4096 - class91.method696(arg1, this.field5704, 66);
        int var9 = -64 % ((-arg4 - 6) / 33);
        int var10 = this.field5717 * this.field5705 >> 12;
        int var11 = this.field5717 - (var10 <= 0 ? 0 : class91.method696(arg1, var10, 89));
        if (class26.field672 <= arg3) {
            arg3 -= class26.field672;
        }
        if (var11 > 0) {
            if (arg5 <= 0 || arg2 <= 0) {
                return;
            }
            int var16 = arg5 / 2;
            int var17 = arg2 / 2;
            int var18 = var11 > var17 ? var17 : var11;
            int var19 = var16 >= var11 ? var11 : var16;
            int var20 = arg2 - (var18 * 2);
            int var21 = arg3 + var18;
            for (int var22 = 0; var22 < arg5; var22++) {
                int[] var23 = arg0[arg6 + var22];
                if (var22 < var19) {
                    int var24 = var8 * var22 / var19;
                    if (this.field5709 == 0) {
                        for (int var25 = 0; var25 < var18; var25++) {
                            int var26 = var8 * var25 / var18;
                            var23[class83.method613(class53.field1056, arg3 + var25)] = var23[class83.method613(arg3 + arg2 - var25 - 1, class53.field1056)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var27 < var18; var27++) {
                            int var28 = var8 * var27 / var18;
                            var23[class83.method613(class53.field1056, arg3 + var27)] = var23[class83.method613(arg2 + arg3 - var27 - 1, class53.field1056)] = var28 >= var24 ? var24 : var28;
                        }
                    }
                    if (class26.field672 >= var20 + var21) {
                        class89.method688(var23, var21, var20, var24);
                    } else {
                        int var29 = class26.field672 - var21;
                        class89.method688(var23, var21, var29, var24);
                        class89.method688(var23, 0, var20 - var29, var24);
                    }
                } else {
                    int var30 = arg5 - var22 - 1;
                    if (var19 <= var30) {
                        for (int var31 = 0; var31 < var18; var31++) {
                            var23[class83.method613(arg3 + var31, class53.field1056)] = var23[class83.method613(class53.field1056, arg3 + arg2 - var31 - 1)] = var8 * var31 / var18;
                        }
                        if (class26.field672 >= var20 + var21) {
                            class89.method688(var23, var21, var20, var8);
                        } else {
                            int var32 = class26.field672 - var21;
                            class89.method688(var23, var21, var32, var8);
                            class89.method688(var23, 0, var20 - var32, var8);
                        }
                    } else {
                        int var33 = var8 * var30 / var19;
                        if (this.field5709 == 0) {
                            for (int var36 = 0; var36 < var18; var36++) {
                                int var37 = var8 * var36 / var18;
                                var23[class83.method613(class53.field1056, arg3 + var36)] = var23[class83.method613(arg3 + arg2 - var36 - 1, class53.field1056)] = var33 * var37 >> 12;
                            }
                        } else {
                            for (int var34 = 0; var34 < var18; var34++) {
                                int var35 = var8 * var34 / var18;
                                var23[class83.method613(class53.field1056, arg3 + var34)] = var23[class83.method613(arg3 + arg2 - var34 - 1, class53.field1056)] = var35 >= var33 ? var33 : var35;
                            }
                        }
                        if (class26.field672 < (var20 + var21)) {
                            int var38 = class26.field672 - var21;
                            class89.method688(var23, var21, var38, var33);
                            class89.method688(var23, 0, var20 - var38, var33);
                        } else {
                            class89.method688(var23, var21, var20, var33);
                        }
                    }
                }
            }
        } else if ((arg3 + arg2) <= class26.field672) {
            for (int var12 = 0; var12 < arg5; var12++) {
                class89.method688(arg0[arg6 + var12], arg3, arg2, var8);
            }
        } else {
            int var13 = class26.field672 - arg3;
            for (int var14 = 0; var14 < arg5; var14++) {
                int[] var15 = arg0[arg6 + var14];
                class89.method688(var15, arg3, var13, var8);
                class89.method688(var15, 0, arg2 - var13, var8);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V", line = 314)
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 3220) {
            method2537(61, 126, 17, -110, -56, 103);
        }
        for (int var6 = arg1; var6 <= (arg1 + arg3); var6++) {
            for (int var7 = arg0; var7 <= (arg0 + arg4); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class79.field1409[arg2][var7][var6] = 127;
                }
            }
        }
        field5715++;
        for (int var8 = arg1; var8 < (arg1 + arg3); var8++) {
            for (int var9 = arg0; var9 < (arg0 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class144.field2427[arg2][var9][var8] = arg2 > 0 ? class144.field2427[arg2 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class144.field2427[arg2][arg0][var10] = class144.field2427[arg2][arg0 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg0 + 1; var11 < (arg0 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class144.field2427[arg2][var11][arg1] = class144.field2427[arg2][var11][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 > 0 && class144.field2427[arg2][arg0 - 1][arg1] != 0) {
                class144.field2427[arg2][arg0][arg1] = class144.field2427[arg2][arg0 - 1][arg1];
            } else if (arg1 > 0 && class144.field2427[arg2][arg0][arg1 - 1] != 0) {
                class144.field2427[arg2][arg0][arg1] = class144.field2427[arg2][arg0][arg1 - 1];
            } else if (arg0 > 0 && arg1 > 0 && class144.field2427[arg2][arg0 - 1][arg1 - 1] != 0) {
                class144.field2427[arg2][arg0][arg1] = class144.field2427[arg2][arg0 - 1][arg1 - 1];
            }
        } else if (arg0 > 0 && class144.field2427[arg2 - 1][arg0 - 1][arg1] != class144.field2427[arg2][arg0 - 1][arg1]) {
            class144.field2427[arg2][arg0][arg1] = class144.field2427[arg2][arg0 - 1][arg1];
        } else if (arg1 > 0 && class144.field2427[arg2][arg0][arg1 - 1] != class144.field2427[arg2 - 1][arg0][arg1 - 1]) {
            class144.field2427[arg2][arg0][arg1] = class144.field2427[arg2][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class144.field2427[arg2 - 1][arg0 - 1][arg1 - 1] != class144.field2427[arg2][arg0 - 1][arg1 - 1]) {
            class144.field2427[arg2][arg0][arg1] = class144.field2427[arg2][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 470)
    public class359() {
        super(0, true);
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V", line = 437)
    public final void method163(int arg0) {
        field5712++;
        if (arg0 != 100) {
            this.method2536((int[][]) ((int[][]) null), (Random) null, -102, -44, (byte) -83, -33, -35);
        }
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V", line = 483)
    public static final void method2538(int arg0) {
        field5708++;
        if (arg0 < class263.field4323) {
            class345.method2433((byte) 120);
        } else {
            class311.field5067 = class127.field2224;
            class127.field2224 = null;
            class311.method2260(40, -19880);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[I", line = 509)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            field5722 = -102;
        }
        int[] var3 = this.field3166.method775(arg1, 124);
        field5713++;
        if (!this.field3166.field1903) {
            return var3;
        }
        int[][] var4 = this.field3166.method776(105);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class26.field672 * this.field5719 >> 12;
        int var15 = class334.field5323 * this.field5711 >> 12;
        int var16 = class26.field672 * this.field5707 >> 12;
        int var17 = class334.field5323 * this.field5718 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        this.field5717 = class26.field672 / 8 * this.field5716 >> 12;
        int var18 = (class26.field672 / var14) + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field5703);
        while (true) {
            while (true) {
                int var22 = class91.method696(var21, var16 - var14, 92) + var14;
                int var23 = class91.method696(var21, var17 - var15, 93) + var15;
                int var24 = var8 + var22;
                if (var24 > class26.field672) {
                    var22 = class26.field672 - var8;
                    var24 = class26.field672;
                }
                int var25;
                if (var11) {
                    var25 = 0;
                } else {
                    int[] var26 = var20[var10];
                    var25 = var26[2];
                    int var27 = var5 + var24;
                    int var28 = 0;
                    int var29 = var10;
                    if (var27 < 0) {
                        var27 += class26.field672;
                    }
                    if (class26.field672 < var27) {
                        var27 -= class26.field672;
                    }
                    while (true) {
                        int[] var30 = var20[var29];
                        if (var30[0] <= var27 && var27 <= var30[1]) {
                            if (var10 != var29) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class26.field672;
                                }
                                if (class26.field672 < var31) {
                                    var31 -= class26.field672;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var10 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var10 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var27) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var27, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var27, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class26.field672;
                                        }
                                        this.method2536(var4, var21, var40 - var39, var7 + var39, (byte) -57, var25 - var36, var36);
                                    }
                                }
                            }
                            var10 = var29;
                            break;
                        }
                        var29++;
                        if (var12 <= var29) {
                            var29 = 0;
                        }
                        var28++;
                    }
                }
                if ((var23 + var25) > class334.field5323) {
                    var23 = class334.field5323 - var25;
                } else {
                    var9 = false;
                }
                if (class26.field672 == var24) {
                    this.method2536(var4, var21, var22, var8 + var6, (byte) -42, var23, var25);
                    if (var9) {
                        return var3;
                    }
                    var7 = var6;
                    var10 = 0;
                    var11 = false;
                    var9 = true;
                    int[] var41 = var19[var13++];
                    var41[1] = var24;
                    var12 = var13;
                    var41[2] = var23 + var25;
                    var13 = 0;
                    var41[0] = var8;
                    var8 = 0;
                    var6 = class91.method696(var21, class26.field672, 55);
                    int[][] var42 = var20;
                    var5 = var6 - var7;
                    int var43 = var5;
                    var20 = var19;
                    var19 = var42;
                    if (var5 < 0) {
                        var43 = class26.field672 + var5;
                    }
                    if (class26.field672 < var43) {
                        var43 -= class26.field672;
                    }
                    while (true) {
                        int[] var44 = var20[var10];
                        if (var44[0] <= var43 && var44[1] >= var43) {
                            break;
                        }
                        var10++;
                        if (var12 <= var10) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var45 = var19[var13++];
                    var45[2] = var23 + var25;
                    var45[1] = var24;
                    var45[0] = var8;
                    this.method2536(var4, var21, var22, var6 + var8, (byte) 73, var23, var25);
                    var8 = var24;
                }
            }
        }
    }
}
