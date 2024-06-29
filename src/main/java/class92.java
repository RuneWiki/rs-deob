import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class92 extends class354 {

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    private int field1352 = 1024;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    private int field1350 = 1024;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    private int field1356 = 1024;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    private int field1361 = 1024;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    private int field1354 = 2048;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    private int field1360 = 0;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field1357 = 819;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    private int field1358 = 0;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    private int field1362 = 409;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Lof;")
    public static class446 field1351 = new class446("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "Z")
    public static boolean field1366 = false;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "Llt;")
    public static class485 field1368 = new class485();

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 8)
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI[[ILjava/util/Random;III)V", line = 20)
    private final void method620(boolean arg0, int arg1, int[][] arg2, Random arg3, int arg4, int arg5, int arg6) {
        ++field1349;
        int var8 = this.field1350 > 0 ? -class491.method2931(arg3, Integer.MIN_VALUE, this.field1350) + 4096 : 4096;
        int var9 = this.field1356 * this.field1347 >> 12;
        int var10 = this.field1347 - (~var9 >= -1 ? 0 : class491.method2931(arg3, Integer.MIN_VALUE, var9));
        if (!arg0) {
            field1366 = true;
        }
        if (~arg4 <= ~class531.field7814) {
            arg4 -= class531.field7814;
        }
        if (~var10 >= -1) {
            if (arg1 + arg4 <= class531.field7814) {
                for (int var11 = 0; ~var11 > ~arg6; ++var11) {
                    class192.method1300(arg2[arg5 + var11], arg4, arg1, var8);
                }
            } else {
                int var12 = -arg4 + class531.field7814;
                for (int var13 = 0; var13 < arg6; ++var13) {
                    int[] var14 = arg2[arg5 + var13];
                    class192.method1300(var14, arg4, var12, var8);
                    class192.method1300(var14, 0, arg1 - var12, var8);
                }
            }
        } else if (arg6 > 0 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg6 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = ~var16 > ~var10 ? var16 : var10;
            int var19 = arg4 + var17;
            int var20 = arg1 - var17 * 2;
            for (int var21 = 0; arg6 > var21; ++var21) {
                int[] var22 = arg2[var21 - -arg5];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field1360 != 0) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class519.method3092(arg4 + var24, class179.field2409)] = var22[class519.method3092(arg4 - -arg1 + -var24 + -1, class179.field2409)] = var25 < var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class519.method3092(arg4 + var26, class179.field2409)] = var22[class519.method3092(arg1 + arg4 + -1 + -var26, class179.field2409)] = var23 * var28 >> 12;
                        }
                    }
                    if (class531.field7814 < var19 - -var20) {
                        int var27 = -var19 + class531.field7814;
                        class192.method1300(var22, var19, var27, var23);
                        class192.method1300(var22, 0, -var27 + var20, var23);
                    } else {
                        class192.method1300(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg6;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field1360 == -1) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class519.method3092(class179.field2409, arg4 + var31)] = var22[class519.method3092(arg4 - (-arg1 - -1) + -var31, class179.field2409)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class519.method3092(arg4 + var33, class179.field2409)] = var22[class519.method3092(class179.field2409, arg1 - var33 + arg4 + -1)] = ~var30 < ~var35 ? var35 : var30;
                            }
                        }
                        if (~(var19 + var20) >= ~class531.field7814) {
                            class192.method1300(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class531.field7814;
                            class192.method1300(var22, var19, var34, var30);
                            class192.method1300(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class519.method3092(arg4 - -var36, class179.field2409)] = var22[class519.method3092(-var36 + -1 + arg1 + arg4, class179.field2409)] = var8 * var36 / var17;
                        }
                        if (class531.field7814 < var19 - -var20) {
                            int var37 = -var19 + class531.field7814;
                            class192.method1300(var22, var19, var37, var8);
                            class192.method1300(var22, 0, var20 - var37, var8);
                        } else {
                            class192.method1300(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lnj;II)V", line = 221)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 != 6) {
                                        if (arg1 != 7) {
                                            if (arg1 == 8) {
                                                this.field1350 = arg0.method1074(-635989152);
                                            }
                                        } else {
                                            this.field1356 = arg0.method1074(-635989152);
                                        }
                                    } else {
                                        this.field1360 = arg0.method1087(false);
                                    }
                                } else {
                                    this.field1352 = arg0.method1074(-635989152);
                                }
                            } else {
                                this.field1357 = arg0.method1074(-635989152);
                            }
                        } else {
                            this.field1362 = arg0.method1074(-635989152);
                        }
                    } else {
                        this.field1354 = arg0.method1074(-635989152);
                    }
                } else {
                    this.field1361 = arg0.method1074(-635989152);
                }
            } else {
                this.field1358 = arg0.method1087(false);
            }
            ++field1355;
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V", line = 318)
    public final void method357(int arg0) {
        ++field1364;
        if (arg0 <= 28) {
            this.field1360 = 69;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(BI)[I", line = 334)
    public final int[] method270(byte arg0, int arg1) {
        ++field1348;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[][] var4 = super.field5478.method2523(-1);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class531.field7814 * this.field1361 >> 12;
            int var15 = class531.field7814 * this.field1354 >> 12;
            int var16 = class33.field511 * this.field1362 >> 12;
            int var17 = class33.field511 * this.field1357 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field1347 = class531.field7814 / 8 * this.field1352 >> 12;
            int var18 = class531.field7814 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1358);
            label129: while (true) {
                while (true) {
                    int var22 = var14 + class491.method2931(var21, Integer.MIN_VALUE, -var14 + var15);
                    int var23 = class491.method2931(var21, Integer.MIN_VALUE, -var16 + var17) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class531.field7814) {
                        var24 = class531.field7814;
                        var22 = -var8 + class531.field7814;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (~var29 > -1) {
                            var29 += class531.field7814;
                        }
                        if (var29 > class531.field7814) {
                            var29 -= class531.field7814;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                if (~var9 != ~var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class531.field7814;
                                    }
                                    if (class531.field7814 < var31) {
                                        var31 -= class531.field7814;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 == 0) {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class531.field7814;
                                            }
                                            this.method620(true, -var38 + var39, var4, var21, var38 - -var7, var35, -var35 + var25);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            ++var26;
                            if (~var26 <= ~var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var25 - -var23 <= class33.field511) {
                        var10 = false;
                    } else {
                        var23 = -var25 + class33.field511;
                    }
                    if (~class531.field7814 == ~var24) {
                        this.method620(true, var22, var4, var21, var6 + var8, var25, var23);
                        if (var10) {
                            break label129;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        var41[0] = var8;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var7 = var6;
                        var13 = 0;
                        var6 = class491.method2931(var21, Integer.MIN_VALUE, class531.field7814);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class531.field7814 + var5;
                        }
                        if (~class531.field7814 > ~var43) {
                            var43 -= class531.field7814;
                        }
                        var9 = 0;
                        var11 = false;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && var43 <= var44[1]) {
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[0] = var8;
                        var45[2] = var25 - -var23;
                        this.method620(true, var22, var4, var21, var6 + var8, var25, var23);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 >= -74) {
            this.field1360 = 104;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z", line = 583)
    public static final boolean method621(int arg0, int arg1) {
        ++field1359;
        if (arg1 != -4) {
            method621(77, 1);
        }
        return arg0 == 2 || ~arg0 == -4 || arg0 == 4 || ~arg0 == -6;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)I", line = 602)
    public static final int method622(int arg0, int arg1, int arg2) {
        ++field1353;
        if (~arg2 != -5 && ~arg2 != -6) {
            return arg0 != -29424 ? -16 : 256;
        } else {
            return class489.field7224[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 617)
    public static void method623(byte arg0) {
        field1351 = null;
        if (arg0 == -42) {
            field1368 = null;
        }
    }
}
