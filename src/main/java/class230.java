import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class230 extends class283 {

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    private int field3643 = 819;

    @OriginalMember(owner = "client!ol", name = "ab", descriptor = "I")
    private int field3652 = 0;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
    private int field3651 = 2048;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    private int field3645 = 1024;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    private int field3642 = 1024;

    @OriginalMember(owner = "client!ol", name = "cb", descriptor = "I")
    private int field3654 = 409;

    @OriginalMember(owner = "client!ol", name = "kb", descriptor = "I")
    private int field3662 = 1024;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    private int field3641 = 1024;

    @OriginalMember(owner = "client!ol", name = "eb", descriptor = "I")
    private int field3656 = 0;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "Lna;")
    public static class26 field3644 = class69.method505("Connexion perdue)3", (byte) -122);

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "Lna;")
    private static class26 field3649 = class69.method505(" is already on your ignore list)3", (byte) -126);

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "Lna;")
    public static class26 field3650 = class69.method505("<col=00ff80>", (byte) -125);

    @OriginalMember(owner = "client!ol", name = "db", descriptor = "Lna;")
    public static class26 field3655 = field3649;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field3647 = 0;

    @OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
    public static int field3657 = 500;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ol", name = "bb", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ol", name = "gb", descriptor = "I")
    private int field3658;

    @OriginalMember(owner = "client!ol", name = "hb", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ol", name = "ib", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ol", name = "jb", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ol", name = "lb", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "Lve;")
    public static class266 field3646;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V", line = 6)
    public final void method130(int arg0) {
        field3648++;
        if (arg0 != 16251) {
            this.method1(-7, (class82) null, true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 291)
    public class230() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[I", line = 30)
    public final int[] method8(int arg0, byte arg1) {
        field3661++;
        int var3 = 105 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (!this.field4733.field1406) {
            return var4;
        }
        int[][] var5 = this.field4733.method665((byte) 97);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean var11 = true;
        boolean var12 = true;
        int var13 = 0;
        int var14 = 0;
        int var15 = class101.field1632 * this.field3642 >> 12;
        int var16 = class101.field1632 * this.field3651 >> 12;
        int var17 = class225.field3574 * this.field3643 >> 12;
        int var18 = class225.field3574 * this.field3654 >> 12;
        if (var17 <= 1) {
            return var5[arg0];
        }
        int var19 = class101.field1632 / var15 + 1;
        this.field3658 = class101.field1632 / 8 * this.field3645 >> 12;
        int[][] var20 = new int[var19][3];
        int[][] var21 = new int[var19][3];
        Random var22 = new Random((long) this.field3656);
        while (true) {
            while (true) {
                int var23 = var15 + class24.method151((byte) -93, var16 - var15, var22);
                int var24 = class24.method151((byte) -96, var17 - var18, var22) + var18;
                int var25 = var6 + var23;
                if (class101.field1632 < var25) {
                    var25 = class101.field1632;
                    var23 = class101.field1632 - var6;
                }
                int var28;
                if (var12) {
                    var28 = 0;
                } else {
                    int var26 = var10;
                    int[] var27 = var20[var10];
                    var28 = var27[2];
                    int var29 = 0;
                    int var30 = var8 + var25;
                    if (var30 < 0) {
                        var30 += class101.field1632;
                    }
                    if (class101.field1632 < var30) {
                        var30 -= class101.field1632;
                    }
                    while (true) {
                        int[] var31 = var20[var26];
                        if (var30 >= var31[0] && var31[1] >= var30) {
                            if (var10 != var26) {
                                int var32 = var6 + var8;
                                if (var32 < 0) {
                                    var32 += class101.field1632;
                                }
                                if (var32 > class101.field1632) {
                                    var32 -= class101.field1632;
                                }
                                for (int var33 = 1; var33 <= var29; var33++) {
                                    int[] var34 = var20[(var10 + var33) % var13];
                                    var28 = Math.max(var28, var34[2]);
                                }
                                for (int var35 = 0; var35 <= var29; var35++) {
                                    int[] var36 = var20[(var10 + var35) % var13];
                                    int var37 = var36[2];
                                    if (var28 != var37) {
                                        int var38 = var36[0];
                                        int var39 = var36[1];
                                        int var40;
                                        int var41;
                                        if (var30 > var32) {
                                            var40 = Math.max(var32, var38);
                                            var41 = Math.min(var30, var39);
                                        } else if (var38 == 0) {
                                            var41 = Math.min(var30, var39);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var32, var38);
                                            var41 = class101.field1632;
                                        }
                                        this.method1550(var37, var22, var7 + var40, -var40 + var41, (byte) -69, var28 - var37, var5);
                                    }
                                }
                            }
                            var10 = var26;
                            break;
                        }
                        var29++;
                        var26++;
                        if (var26 >= var13) {
                            var26 = 0;
                        }
                    }
                }
                if (class225.field3574 >= var28 + var24) {
                    var11 = false;
                } else {
                    var24 = class225.field3574 - var28;
                }
                if (class101.field1632 == var25) {
                    this.method1550(var28, var22, var6 + var9, var23, (byte) -69, var24, var5);
                    if (var11) {
                        return var4;
                    }
                    var11 = true;
                    var7 = var9;
                    var12 = false;
                    int[] var42 = var21[var14++];
                    var42[0] = var6;
                    var10 = 0;
                    var13 = var14;
                    var14 = 0;
                    var42[2] = var24 + var28;
                    var42[1] = var25;
                    var9 = class24.method151((byte) -107, class101.field1632, var22);
                    var8 = var9 - var7;
                    int[][] var43 = var20;
                    var6 = 0;
                    var20 = var21;
                    int var44 = var8;
                    if (var8 < 0) {
                        var44 = class101.field1632 + var8;
                    }
                    var21 = var43;
                    if (class101.field1632 < var44) {
                        var44 -= class101.field1632;
                    }
                    while (true) {
                        int[] var45 = var20[var10];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            break;
                        }
                        var10++;
                        if (var13 <= var10) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var46 = var21[var14++];
                    var46[1] = var25;
                    var46[2] = var24 + var28;
                    var46[0] = var6;
                    this.method1550(var28, var22, var6 + var9, var23, (byte) -69, var24, var5);
                    var6 = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)V", line = 277)
    public static void method1549(int arg0) {
        field3650 = null;
        field3644 = null;
        if (arg0 == -9) {
            field3646 = null;
            field3649 = null;
            field3655 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/util/Random;IIBI[[I)V", line = 308)
    private final void method1550(int arg0, Random arg1, int arg2, int arg3, byte arg4, int arg5, int[][] arg6) {
        if (arg4 != -69) {
            return;
        }
        field3663++;
        int var8 = this.field3662 > 0 ? 4096 - class24.method151((byte) -128, this.field3662, arg1) : 4096;
        int var9 = this.field3658 * this.field3641 >> 12;
        int var10 = this.field3658 - (var9 > 0 ? class24.method151((byte) 39, var9, arg1) : 0);
        if (class101.field1632 <= arg2) {
            arg2 -= class101.field1632;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg3 <= 0) {
                return;
            }
            int var11 = arg3 / 2;
            int var12 = arg5 / 2;
            int var13 = var11 < var10 ? var11 : var10;
            int var14 = var12 >= var10 ? var10 : var12;
            int var15 = arg3 - (var13 * 2);
            int var16 = arg2 + var13;
            for (int var17 = 0; var17 < arg5; var17++) {
                int[] var18 = arg6[arg0 + var17];
                if (var17 < var14) {
                    int var19 = var8 * var17 / var14;
                    if (this.field3652 == 0) {
                        for (int var22 = 0; var22 < var13; var22++) {
                            int var23 = var8 * var22 / var13;
                            var18[class4.method23(class236.field3783, arg2 + var22)] = var18[class4.method23(arg2 + arg3 - var22 - 1, class236.field3783)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var13; var20++) {
                            int var21 = var8 * var20 / var13;
                            var18[class4.method23(class236.field3783, arg2 + var20)] = var18[class4.method23(class236.field3783, arg2 + arg3 - var20 - 1)] = var19 <= var21 ? var19 : var21;
                        }
                    }
                    if (class101.field1632 >= var15 + var16) {
                        class75.method538(var18, var16, var15, var19);
                    } else {
                        int var24 = class101.field1632 - var16;
                        class75.method538(var18, var16, var24, var19);
                        class75.method538(var18, 0, var15 - var24, var19);
                    }
                } else {
                    int var25 = arg5 - var17 - 1;
                    if (var25 >= var14) {
                        for (int var26 = 0; var26 < var13; var26++) {
                            var18[class4.method23(class236.field3783, arg2 + var26)] = var18[class4.method23(arg2 + arg3 - var26 - 1, class236.field3783)] = var8 * var26 / var13;
                        }
                        if ((var16 + var15) > class101.field1632) {
                            int var27 = class101.field1632 - var16;
                            class75.method538(var18, var16, var27, var8);
                            class75.method538(var18, 0, var15 - var27, var8);
                        } else {
                            class75.method538(var18, var16, var15, var8);
                        }
                    } else {
                        int var28 = var8 * var25 / var14;
                        if (this.field3652 == 0) {
                            for (int var29 = 0; var29 < var13; var29++) {
                                int var30 = var8 * var29 / var13;
                                var18[class4.method23(class236.field3783, arg2 + var29)] = var18[class4.method23(class236.field3783, arg2 - (-arg3 + var29) - 1)] = var28 * var30 >> 12;
                            }
                        } else {
                            for (int var31 = 0; var31 < var13; var31++) {
                                int var32 = var8 * var31 / var13;
                                var18[class4.method23(arg2 + var31, class236.field3783)] = var18[class4.method23(arg2 + arg3 - var31 - 1, class236.field3783)] = var28 <= var32 ? var28 : var32;
                            }
                        }
                        if (var15 + var16 > class101.field1632) {
                            int var33 = class101.field1632 - var16;
                            class75.method538(var18, var16, var33, var28);
                            class75.method538(var18, 0, var15 - var33, var28);
                        } else {
                            class75.method538(var18, var16, var15, var28);
                        }
                    }
                }
            }
        } else if (class101.field1632 >= (arg2 + arg3)) {
            for (int var34 = 0; var34 < arg5; var34++) {
                class75.method538(arg6[arg0 + var34], arg2, arg3, var8);
            }
        } else {
            int var35 = class101.field1632 - arg2;
            for (int var36 = 0; var36 < arg5; var36++) {
                int[] var37 = arg6[arg0 + var36];
                class75.method538(var37, arg2, var35, var8);
                class75.method538(var37, 0, arg3 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILwa;Z)V", line = 517)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field3653++;
        if (!arg2) {
            this.field3643 = 4;
        }
        if (arg0 == 0) {
            this.field3656 = arg1.method642((byte) -104);
        } else if (arg0 == 1) {
            this.field3642 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field3651 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field3654 = arg1.method576(1);
        } else if (arg0 == 4) {
            this.field3643 = arg1.method576(1);
        } else if (arg0 == 5) {
            this.field3645 = arg1.method576(1);
        } else if (arg0 == 6) {
            this.field3652 = arg1.method642((byte) -114);
        } else if (arg0 == 7) {
            this.field3641 = arg1.method576(1);
        } else if (arg0 == 8) {
            this.field3662 = arg1.method576(1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIILth;IJIIII)Z", line = 612)
    public static final boolean method1551(int arg0, int arg1, int arg2, int arg3, class86 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class95.method715(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZI)I", line = 637)
    public static final int method1552(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg2) {
            return 120;
        }
        field3659++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg0;
        }
    }
}
