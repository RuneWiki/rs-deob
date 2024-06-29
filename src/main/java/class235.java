import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class235 extends class304 {

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field3571 = 1024;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    private int field3573 = 2048;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    private int field3581 = 819;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    private int field3572 = 0;

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
    private int field3584 = 1024;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    private int field3582 = 1024;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
    private int field3589 = 0;

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
    private int field3586 = 1024;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
    private int field3588 = 409;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "Z")
    public static boolean field3578 = false;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "Lec;")
    public static class99 field3587 = new class99(4);

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "Ljd;")
    public static class95 field3580;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 4)
    public final void method100(boolean arg0) {
        if (!arg0) {
            method1641(30);
        }
        field3574++;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 17)
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)I", line = 29)
    public static final int method1640(int arg0, int arg1) {
        field3585++;
        if (arg1 < 39) {
            field3587 = (class99) null;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lwm;II)V", line = 48)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field3577++;
        if (arg1 == 0) {
            this.field3572 = arg0.method1774((byte) 121);
        } else if (arg1 == 1) {
            this.field3586 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field3573 = arg0.method1755(false);
        } else if (arg1 == 3) {
            this.field3588 = arg0.method1755(false);
        } else if (arg1 == 4) {
            this.field3581 = arg0.method1755(false);
        } else if (arg1 == 5) {
            this.field3571 = arg0.method1755(false);
        } else if (arg1 == 6) {
            this.field3589 = arg0.method1774((byte) 110);
        } else if (arg1 == 7) {
            this.field3584 = arg0.method1755(false);
        } else if (arg1 == 8) {
            this.field3582 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            field3587 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V", line = 145)
    public static void method1641(int arg0) {
        if (arg0 != 0) {
            field3578 = false;
        }
        field3580 = null;
        field3587 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I", line = 166)
    public final int[] method71(int arg0, int arg1) {
        field3579++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[][] var4 = this.field4669.method2341((byte) -114);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class218.field3333 * this.field3586 >> 12;
            int var14 = 0;
            int var15 = class218.field3333 * this.field3573 >> 12;
            int var16 = class109.field1648 * this.field3588 >> 12;
            int var17 = class109.field1648 * this.field3581 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field3576 = class218.field3333 / 8 * this.field3571 >> 12;
            int var18 = (class218.field3333 / var13) + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field3572);
            label130: while (true) {
                while (true) {
                    int var22 = var13 + class101.method764(var15 - var13, (byte) 121, var21);
                    int var23 = class101.method764(var17 - var16, (byte) 121, var21) + var16;
                    int var24 = var8 + var22;
                    if (class218.field3333 < var24) {
                        var24 = class218.field3333;
                        var22 = class218.field3333 - var8;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int var27 = 0;
                        int[] var28 = var20[var9];
                        int var29 = var24 + var5;
                        if (var29 < 0) {
                            var29 += class218.field3333;
                        }
                        if (var29 > class218.field3333) {
                            var29 -= class218.field3333;
                        }
                        var25 = var28[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && var29 <= var30[1]) {
                                if (var9 != var26) {
                                    int var31 = var8 + var5;
                                    if (var31 < 0) {
                                        var31 += class218.field3333;
                                    }
                                    if (class218.field3333 < var31) {
                                        var31 -= class218.field3333;
                                    }
                                    for (int var32 = 1; var32 <= var27; var32++) {
                                        int[] var33 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var27; var34++) {
                                        int[] var35 = var20[(var9 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var29 > var31) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var29, var38);
                                            } else if (var37 == 0) {
                                                var40 = Math.min(var29, var38);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class218.field3333;
                                            }
                                            this.method1642(0, var21, var7 + var39, var4, var36, var40 - var39, -var36 + var25);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            var27++;
                            var26++;
                            if (var26 >= var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class109.field1648 < var23 + var25) {
                        var23 = class109.field1648 - var25;
                    } else {
                        var10 = false;
                    }
                    if (class218.field3333 == var24) {
                        this.method1642(0, var21, var6 + var8, var4, var25, var22, var23);
                        if (var10) {
                            break label130;
                        }
                        var10 = true;
                        var7 = var6;
                        var11 = false;
                        int[] var42 = var19[var14++];
                        var42[0] = var8;
                        var42[2] = var23 + var25;
                        int[][] var43 = var20;
                        var20 = var19;
                        var9 = 0;
                        var12 = var14;
                        var14 = 0;
                        var8 = 0;
                        var42[1] = var24;
                        var6 = class101.method764(class218.field3333, (byte) 121, var21);
                        var5 = var6 - var7;
                        var19 = var43;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class218.field3333 + var5;
                        }
                        if (class218.field3333 < var44) {
                            var44 -= class218.field3333;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                break;
                            }
                            var9++;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var19[var14++];
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        var41[0] = var8;
                        this.method1642(arg0 ^ 0x7, var21, var8 + var6, var4, var25, var22, var23);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 != 7) {
            this.field3589 = -94;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/util/Random;I[[IIII)V", line = 415)
    private final void method1642(int arg0, Random arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        field3575++;
        int var8 = this.field3582 <= 0 ? 4096 : 4096 - class101.method764(this.field3582, (byte) 121, arg1);
        int var9 = this.field3584 * this.field3576 >> 12;
        int var10 = this.field3576 - (arg0 < var9 ? class101.method764(var9, (byte) 121, arg1) : 0);
        if (class218.field3333 <= arg2) {
            arg2 -= class218.field3333;
        }
        if (var10 > 0) {
            if (arg6 <= 0 || arg5 <= 0) {
                return;
            }
            int var11 = arg5 / 2;
            int var12 = arg6 / 2;
            int var13 = var10 <= var11 ? var10 : var11;
            int var14 = var12 >= var10 ? var10 : var12;
            int var15 = arg5 - (var13 * 2);
            int var16 = arg2 + var13;
            for (int var17 = 0; var17 < arg6; var17++) {
                int[] var18 = arg3[arg4 + var17];
                if (var14 > var17) {
                    int var19 = var8 * var17 / var14;
                    if (this.field3589 == 0) {
                        for (int var22 = 0; var22 < var13; var22++) {
                            int var23 = var8 * var22 / var13;
                            var18[class149.method1117(class54.field721, arg2 + var22)] = var18[class149.method1117(arg2 + arg5 - var22 - 1, class54.field721)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var13; var20++) {
                            int var21 = var8 * var20 / var13;
                            var18[class149.method1117(class54.field721, arg2 + var20)] = var18[class149.method1117(arg5 + arg2 - var20 - 1, class54.field721)] = var19 <= var21 ? var19 : var21;
                        }
                    }
                    if (var15 + var16 <= class218.field3333) {
                        class126.method946(var18, var16, var15, var19);
                    } else {
                        int var24 = class218.field3333 - var16;
                        class126.method946(var18, var16, var24, var19);
                        class126.method946(var18, 0, var15 - var24, var19);
                    }
                } else {
                    int var25 = arg6 - var17 - 1;
                    if (var14 > var25) {
                        int var26 = var8 * var25 / var14;
                        if (this.field3589 == 0) {
                            for (int var29 = 0; var29 < var13; var29++) {
                                int var30 = var8 * var29 / var13;
                                var18[class149.method1117(class54.field721, arg2 + var29)] = var18[class149.method1117(arg2 + arg5 - var29 - 1, class54.field721)] = var26 * var30 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var13; var27++) {
                                int var28 = var8 * var27 / var13;
                                var18[class149.method1117(arg2 + var27, class54.field721)] = var18[class149.method1117(class54.field721, arg5 + arg2 - var27 - 1)] = var26 <= var28 ? var26 : var28;
                            }
                        }
                        if (class218.field3333 >= var16 + var15) {
                            class126.method946(var18, var16, var15, var26);
                        } else {
                            int var31 = class218.field3333 - var16;
                            class126.method946(var18, var16, var31, var26);
                            class126.method946(var18, 0, var15 - var31, var26);
                        }
                    } else {
                        for (int var32 = 0; var32 < var13; var32++) {
                            var18[class149.method1117(arg2 + var32, class54.field721)] = var18[class149.method1117(arg2 + arg5 - var32 - 1, class54.field721)] = var8 * var32 / var13;
                        }
                        if ((var15 + var16) > class218.field3333) {
                            int var33 = class218.field3333 - var16;
                            class126.method946(var18, var16, var33, var8);
                            class126.method946(var18, 0, var15 - var33, var8);
                        } else {
                            class126.method946(var18, var16, var15, var8);
                        }
                    }
                }
            }
        } else if (arg2 + arg5 <= class218.field3333) {
            for (int var34 = 0; var34 < arg6; var34++) {
                class126.method946(arg3[arg4 + var34], arg2, arg5, var8);
            }
        } else {
            int var35 = class218.field3333 - arg2;
            for (int var36 = 0; var36 < arg6; var36++) {
                int[] var37 = arg3[arg4 + var36];
                class126.method946(var37, arg2, var35, var8);
                class126.method946(var37, 0, arg5 - var35, var8);
            }
        }
    }
}
