import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class454 extends class456 {

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    private int field6452 = 819;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    private int field6447 = 0;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    private int field6448 = 1024;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    private int field6456 = 1024;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    private int field6455 = 1024;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    private int field6445 = 1024;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    private int field6444 = 2048;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    private int field6457 = 409;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    private int field6450 = 0;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "Lo;")
    public static class332 field6458 = new class332("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field6461 = -1;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    private int field6454;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "[Lae;")
    public static class27[] field6460;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field6446;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            return null;
        } else if (super.field6466.field6153) {
            int[][] var4 = super.field6466.method2531(-9443);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class156.field2169 * this.field6448 >> 12;
            int var15 = class156.field2169 * this.field6444 >> 12;
            int var16 = class487.field6842 * this.field6457 >> 12;
            int var17 = class487.field6842 * this.field6452 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field6454 = class156.field2169 / 8 * this.field6456 >> 12;
                int var18 = class156.field2169 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6450);
                while (true) {
                    while (true) {
                        int var22 = class318.method1957(-var14 + var15, (byte) -64, var21) + var14;
                        int var23 = class318.method1957(var17 - var16, (byte) -64, var21) + var16;
                        int var24 = var8 - -var22;
                        if (class156.field2169 < var24) {
                            var24 = class156.field2169;
                            var22 = -var8 + class156.field2169;
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
                                var29 += class156.field2169;
                            }
                            if (var29 > class156.field2169) {
                                var29 -= class156.field2169;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class156.field2169;
                                        }
                                        if (class156.field2169 < var31) {
                                            var31 -= class156.field2169;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class156.field2169;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method2703(var7 + var38, -var38 + var39, var35, (byte) -98, -var35 + var25, var4, var21);
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
                        if (~class487.field6842 > ~(var23 + var25)) {
                            var23 = -var25 + class487.field6842;
                        } else {
                            var10 = false;
                        }
                        if (~class156.field2169 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            this.method2703(var6 + var8, var22, var25, (byte) -67, var23, var4, var21);
                            var8 = var24;
                        } else {
                            this.method2703(var8 - -var6, var22, var25, (byte) -100, var23, var4, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[0] = var8;
                            var42[2] = var23 + var25;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class318.method1957(class156.field2169, (byte) -64, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class156.field2169 + var5;
                            }
                            var9 = 0;
                            if (~var44 < ~class156.field2169) {
                                var44 -= class156.field2169;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && ~var44 >= ~var45[1]) {
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

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class454() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIBI[[ILjava/util/Random;)V")
    private final void method2703(int arg0, int arg1, int arg2, byte arg3, int arg4, int[][] arg5, Random arg6) {
        ++field6449;
        if (arg3 >= -47) {
            this.field6444 = -36;
        }
        int var8 = ~this.field6455 < -1 ? -class318.method1957(this.field6455, (byte) -64, arg6) + 4096 : 4096;
        int var9 = this.field6454 * this.field6445 >> 12;
        int var10 = this.field6454 + -(~var9 < -1 ? class318.method1957(var9, (byte) -64, arg6) : 0);
        if (class156.field2169 <= arg0) {
            arg0 -= class156.field2169;
        }
        if (var10 <= 0) {
            if (arg0 + arg1 <= class156.field2169) {
                for (int var11 = 0; var11 < arg4; ++var11) {
                    class149.method1010(arg5[arg2 + var11], arg0, arg1, var8);
                }
            } else {
                int var12 = -arg0 + class156.field2169;
                for (int var13 = 0; arg4 > var13; ++var13) {
                    int[] var14 = arg5[arg2 + var13];
                    class149.method1010(var14, arg0, var12, var8);
                    class149.method1010(var14, 0, -var12 + arg1, var8);
                }
            }
        } else if (arg4 > 0 && arg1 > 0) {
            int var15 = arg1 / 2;
            int var16 = arg4 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; ~var21 > ~arg4; ++var21) {
                int[] var22 = arg5[arg2 + var21];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field6447 == -1) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class412.method2463(arg0 + var24, class428.field6112)] = var22[class412.method2463(class428.field6112, arg1 - 1 + -var24 + arg0)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class412.method2463(arg0 + var26, class428.field6112)] = var22[class412.method2463(arg0 + -1 + arg1 + -var26, class428.field6112)] = var23 > var28 ? var28 : var23;
                        }
                    }
                    if (class156.field2169 < var19 + var20) {
                        int var27 = -var19 + class156.field2169;
                        class149.method1010(var22, var19, var27, var23);
                        class149.method1010(var22, 0, -var27 + var20, var23);
                    } else {
                        class149.method1010(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg4 - 1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field6447 != 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class412.method2463(class428.field6112, arg0 - -var31)] = var22[class412.method2463(arg0 - var31 - 1 + arg1, class428.field6112)] = var30 > var32 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class412.method2463(class428.field6112, arg0 - -var33)] = var22[class412.method2463(class428.field6112, -var33 + arg0 + arg1 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (class156.field2169 < var19 + var20) {
                            int var34 = class156.field2169 - var19;
                            class149.method1010(var22, var19, var34, var30);
                            class149.method1010(var22, 0, -var34 + var20, var30);
                        } else {
                            class149.method1010(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class412.method2463(class428.field6112, arg0 + var36)] = var22[class412.method2463(class428.field6112, -var36 + arg1 + arg0 + -1)] = var8 * var36 / var17;
                        }
                        if (var19 + var20 > class156.field2169) {
                            int var37 = -var19 + class156.field2169;
                            class149.method1010(var22, var19, var37, var8);
                            class149.method1010(var22, 0, -var37 + var20, var8);
                        } else {
                            class149.method1010(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        if (!arg0) {
            this.field6448 = -111;
        }
        ++field6451;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V")
    public static void method2704(int arg0) {
        field6458 = null;
        if (arg0 >= -97) {
            method2704(-88);
        }
        field6460 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.field6456 = 126;
        }
        ++field6453;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field6455 = arg2.method2631(2530);
                                        }
                                    } else {
                                        this.field6445 = arg2.method2631(arg1 + 2475);
                                    }
                                } else {
                                    this.field6447 = arg2.method2628(49152);
                                }
                            } else {
                                this.field6456 = arg2.method2631(2530);
                            }
                        } else {
                            this.field6452 = arg2.method2631(2530);
                        }
                    } else {
                        this.field6457 = arg2.method2631(arg1 ^ 2517);
                    }
                } else {
                    this.field6444 = arg2.method2631(2530);
                }
            } else {
                this.field6448 = arg2.method2631(2530);
            }
        } else {
            this.field6450 = arg2.method2628(arg1 ^ 49207);
        }
    }
}
