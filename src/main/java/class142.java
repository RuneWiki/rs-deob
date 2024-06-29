import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class142 extends class34 {

    @OriginalMember(owner = "client!ue", name = "Ob", descriptor = "I")
    private int field3454 = 0;

    @OriginalMember(owner = "client!ue", name = "Db", descriptor = "I")
    private int field3443 = 0;

    @OriginalMember(owner = "client!ue", name = "yb", descriptor = "Z")
    private boolean field3438 = false;

    @OriginalMember(owner = "client!ue", name = "Vb", descriptor = "I")
    private int field3461 = 0;

    @OriginalMember(owner = "client!ue", name = "Wb", descriptor = "B")
    private byte field3462 = 0;

    @OriginalMember(owner = "client!ue", name = "Ab", descriptor = "[I")
    private int[] field3440;

    @OriginalMember(owner = "client!ue", name = "qb", descriptor = "[I")
    private int[] field3430;

    @OriginalMember(owner = "client!ue", name = "Bb", descriptor = "[I")
    private int[] field3441;

    @OriginalMember(owner = "client!ue", name = "zb", descriptor = "[I")
    private int[] field3439;

    @OriginalMember(owner = "client!ue", name = "ub", descriptor = "[I")
    private int[] field3434;

    @OriginalMember(owner = "client!ue", name = "rb", descriptor = "[I")
    private int[] field3431;

    @OriginalMember(owner = "client!ue", name = "Ub", descriptor = "[I")
    private int[] field3460;

    @OriginalMember(owner = "client!ue", name = "Pb", descriptor = "[I")
    private int[] field3455;

    @OriginalMember(owner = "client!ue", name = "Tb", descriptor = "[I")
    private int[] field3459;

    @OriginalMember(owner = "client!ue", name = "Ib", descriptor = "[I")
    private int[] field3448;

    @OriginalMember(owner = "client!ue", name = "Mb", descriptor = "[B")
    private byte[] field3452;

    @OriginalMember(owner = "client!ue", name = "Kb", descriptor = "[B")
    private byte[] field3450;

    @OriginalMember(owner = "client!ue", name = "pb", descriptor = "[B")
    private byte[] field3429;

    @OriginalMember(owner = "client!ue", name = "Eb", descriptor = "[B")
    private byte[] field3444;

    @OriginalMember(owner = "client!ue", name = "Xb", descriptor = "[I")
    private int[] field3463;

    @OriginalMember(owner = "client!ue", name = "Hb", descriptor = "[S")
    private short[] field3447;

    @OriginalMember(owner = "client!ue", name = "Gb", descriptor = "[[I")
    private int[][] field3446;

    @OriginalMember(owner = "client!ue", name = "tb", descriptor = "[[I")
    private int[][] field3433;

    @OriginalMember(owner = "client!ue", name = "Qb", descriptor = "[Lm;")
    private class83[] field3456;

    @OriginalMember(owner = "client!ue", name = "vb", descriptor = "[Lef;")
    private class35[] field3435;

    @OriginalMember(owner = "client!ue", name = "Fb", descriptor = "[Lm;")
    private class83[] field3445;

    @OriginalMember(owner = "client!ue", name = "Cb", descriptor = "S")
    public short field3442;

    @OriginalMember(owner = "client!ue", name = "sb", descriptor = "S")
    public short field3432;

    @OriginalMember(owner = "client!ue", name = "nb", descriptor = "[I")
    private static int[] field3427 = new int[10000];

    @OriginalMember(owner = "client!ue", name = "wb", descriptor = "[I")
    private static int[] field3436 = new int[128];

    @OriginalMember(owner = "client!ue", name = "Lb", descriptor = "[I")
    private static int[] field3451 = new int[10000];

    @OriginalMember(owner = "client!ue", name = "Nb", descriptor = "I")
    private static int field3453 = 0;

    @OriginalMember(owner = "client!ue", name = "ob", descriptor = "I")
    private int field3428;

    @OriginalMember(owner = "client!ue", name = "xb", descriptor = "I")
    private int field3437;

    @OriginalMember(owner = "client!ue", name = "Jb", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!ue", name = "Rb", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!ue", name = "Sb", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public final void method1126() {
        for (int var1 = 0; var1 < this.field3461; ++var1) {
            this.field3441[var1] = -this.field3441[var1];
        }
        for (int var2 = 0; var2 < this.field3443; ++var2) {
            int var3 = this.field3439[var2];
            this.field3439[var2] = this.field3431[var2];
            this.field3431[var2] = var3;
        }
        this.method1134();
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
    private final void method1127() {
        if (!this.field3438) {
            super.field708 = 0;
            this.field3458 = 0;
            this.field3449 = 999999;
            this.field3437 = -999999;
            this.field3457 = -99999;
            this.field3428 = 99999;
            for (int var1 = 0; var1 < this.field3461; ++var1) {
                int var2 = this.field3440[var1];
                int var3 = this.field3430[var1];
                int var4 = this.field3441[var1];
                if (var2 < this.field3449) {
                    this.field3449 = var2;
                }
                if (var2 > this.field3437) {
                    this.field3437 = var2;
                }
                if (var4 < this.field3428) {
                    this.field3428 = var4;
                }
                if (var4 > this.field3457) {
                    this.field3457 = var4;
                }
                if (-var3 > super.field708) {
                    super.field708 = -var3;
                }
                if (var3 > this.field3458) {
                    this.field3458 = var3;
                }
            }
            this.field3438 = true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public final void method1128(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3461; ++var4) {
            this.field3440[var4] = this.field3440[var4] * arg0 / 128;
            this.field3430[var4] = this.field3430[var4] * arg1 / 128;
            this.field3441[var4] = this.field3441[var4] * arg2 / 128;
        }
        this.method1134();
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)Lea;")
    public final class30 method1129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1141();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class30 var8 = new class30();
        var8.field608 = new int[this.field3443];
        var8.field604 = new int[this.field3443];
        var8.field601 = new int[this.field3443];
        for (int var9 = 0; var9 < this.field3443; ++var9) {
            byte var10;
            if (this.field3452 == null) {
                var10 = 0;
            } else {
                var10 = this.field3452[var9];
            }
            if (this.field3450 != null && this.field3450[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class35 var17 = this.field3435[var9];
                        int var18 = (var17.field727 * arg4 + var17.field733 * arg3 + var17.field722 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field608[var9] = method1135(var18);
                        var8.field601[var9] = -1;
                    } else {
                        var8.field601[var9] = -2;
                    }
                } else {
                    class83 var11;
                    if (this.field3445 != null && this.field3445[this.field3439[var9]] != null) {
                        var11 = this.field3445[this.field3439[var9]];
                    } else {
                        var11 = this.field3456[this.field3439[var9]];
                    }
                    int var12 = (var11.field1907 * arg4 + var11.field1914 * arg2 + var11.field1903 * arg3) / (var11.field1902 * var7) + arg0;
                    var8.field608[var9] = method1135(var12);
                    class83 var13;
                    if (this.field3445 != null && this.field3445[this.field3434[var9]] != null) {
                        var13 = this.field3445[this.field3434[var9]];
                    } else {
                        var13 = this.field3456[this.field3434[var9]];
                    }
                    int var14 = (var13.field1907 * arg4 + var13.field1914 * arg2 + var13.field1903 * arg3) / (var13.field1902 * var7) + arg0;
                    var8.field604[var9] = method1135(var14);
                    class83 var15;
                    if (this.field3445 != null && this.field3445[this.field3431[var9]] != null) {
                        var15 = this.field3445[this.field3431[var9]];
                    } else {
                        var15 = this.field3456[this.field3431[var9]];
                    }
                    int var16 = (var15.field1907 * arg4 + var15.field1914 * arg2 + var15.field1903 * arg3) / (var15.field1902 * var7) + arg0;
                    var8.field601[var9] = method1135(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class35 var26 = this.field3435[var9];
                    int var27 = (var26.field727 * arg4 + var26.field733 * arg3 + var26.field722 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field608[var9] = method1140(this.field3447[var9] & 65535, var27);
                    var8.field601[var9] = -1;
                } else {
                    var8.field601[var9] = -2;
                }
            } else {
                int var19 = this.field3447[var9] & 65535;
                class83 var20;
                if (this.field3445 != null && this.field3445[this.field3439[var9]] != null) {
                    var20 = this.field3445[this.field3439[var9]];
                } else {
                    var20 = this.field3456[this.field3439[var9]];
                }
                int var21 = (var20.field1907 * arg4 + var20.field1914 * arg2 + var20.field1903 * arg3) / (var20.field1902 * var7) + arg0;
                var8.field608[var9] = method1140(var19, var21);
                class83 var22;
                if (this.field3445 != null && this.field3445[this.field3434[var9]] != null) {
                    var22 = this.field3445[this.field3434[var9]];
                } else {
                    var22 = this.field3456[this.field3434[var9]];
                }
                int var23 = (var22.field1907 * arg4 + var22.field1914 * arg2 + var22.field1903 * arg3) / (var22.field1902 * var7) + arg0;
                var8.field604[var9] = method1140(var19, var23);
                class83 var24;
                if (this.field3445 != null && this.field3445[this.field3431[var9]] != null) {
                    var24 = this.field3445[this.field3431[var9]];
                } else {
                    var24 = this.field3456[this.field3431[var9]];
                }
                int var25 = (var24.field1907 * arg4 + var24.field1914 * arg2 + var24.field1903 * arg3) / (var24.field1902 * var7) + arg0;
                var8.field601[var9] = method1140(var19, var25);
            }
        }
        this.method1138();
        var8.field610 = this.field3461;
        var8.field616 = this.field3440;
        var8.field605 = this.field3430;
        var8.field597 = this.field3441;
        var8.field611 = this.field3443;
        var8.field595 = this.field3439;
        var8.field591 = this.field3434;
        var8.field598 = this.field3431;
        var8.field615 = this.field3429;
        var8.field596 = this.field3444;
        var8.field599 = this.field3450;
        if (var8.field599 != null) {
            var8.field607 = this.field3447;
        } else {
            var8.field607 = null;
        }
        var8.field602 = this.field3462;
        var8.field603 = this.field3454;
        var8.field606 = this.field3460;
        var8.field614 = this.field3455;
        var8.field592 = this.field3459;
        var8.field593 = this.field3446;
        var8.field609 = this.field3433;
        return var8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lue;Lue;IIIZ)V")
    public static final void method1130(class142 arg0, class142 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1127();
        arg0.method1141();
        arg1.method1127();
        arg1.method1141();
        ++field3453;
        int var6 = 0;
        int[] var7 = arg1.field3440;
        int var8 = arg1.field3461;
        for (int var9 = 0; var9 < arg0.field3461; ++var9) {
            class83 var12 = arg0.field3456[var9];
            if (var12.field1902 != 0) {
                int var13 = arg0.field3430[var9] - arg3;
                if (var13 <= arg1.field3458) {
                    int var14 = arg0.field3440[var9] - arg2;
                    if (var14 >= arg1.field3449 && var14 <= arg1.field3437) {
                        int var15 = arg0.field3441[var9] - arg4;
                        if (var15 >= arg1.field3428 && var15 <= arg1.field3457) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class83 var17 = arg1.field3456[var16];
                                if (var7[var16] == var14 && arg1.field3441[var16] == var15 && arg1.field3430[var16] == var13 && var17.field1902 != 0) {
                                    if (arg0.field3445 == null) {
                                        arg0.field3445 = new class83[arg0.field3461];
                                    }
                                    if (arg1.field3445 == null) {
                                        arg1.field3445 = new class83[var8];
                                    }
                                    class83 var18 = arg0.field3445[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3445[var9] = new class83(var12);
                                    }
                                    class83 var19 = arg1.field3445[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3445[var16] = new class83(var17);
                                    }
                                    var18.field1914 += var17.field1914;
                                    var18.field1903 += var17.field1903;
                                    var18.field1907 += var17.field1907;
                                    var18.field1902 += var17.field1902;
                                    var19.field1914 += var12.field1914;
                                    var19.field1903 += var12.field1903;
                                    var19.field1907 += var12.field1907;
                                    var19.field1902 += var12.field1902;
                                    ++var6;
                                    field3427[var9] = field3453;
                                    field3451[var16] = field3453;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3443; ++var10) {
                if (field3427[arg0.field3439[var10]] == field3453 && field3427[arg0.field3434[var10]] == field3453 && field3427[arg0.field3431[var10]] == field3453) {
                    if (arg0.field3452 == null) {
                        arg0.field3452 = new byte[arg0.field3443];
                    }
                    arg0.field3452[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3443; ++var11) {
                if (field3451[arg1.field3439[var11]] == field3453 && field3451[arg1.field3434[var11]] == field3453 && field3451[arg1.field3431[var11]] == field3453) {
                    if (arg1.field3452 == null) {
                        arg1.field3452 = new byte[arg1.field3443];
                    }
                    arg1.field3452[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
    public final void method1131() {
        for (int var1 = 0; var1 < this.field3461; ++var1) {
            int var2 = this.field3441[var1];
            this.field3441[var1] = this.field3440[var1];
            this.field3440[var1] = -var2;
        }
        this.method1134();
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
    public final void method1132() {
        for (int var1 = 0; var1 < this.field3461; ++var1) {
            int var2 = this.field3440[var1];
            this.field3440[var1] = this.field3441[var1];
            this.field3441[var1] = -var2;
        }
        this.method1134();
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(SS)V")
    public final void method1133(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3443; ++var3) {
            if (this.field3447[var3] == arg0) {
                this.field3447[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
    private final void method1134() {
        this.field3456 = null;
        this.field3445 = null;
        this.field3435 = null;
        this.field3438 = false;
    }

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "(I)I")
    private static final int method1135(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field3436[arg0];
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "()Lue;")
    public final class142 method1136() {
        class142 var1 = new class142();
        if (this.field3452 != null) {
            var1.field3452 = new byte[this.field3443];
            for (int var2 = 0; var2 < this.field3443; ++var2) {
                var1.field3452[var2] = this.field3452[var2];
            }
        }
        var1.field3461 = this.field3461;
        var1.field3443 = this.field3443;
        var1.field3454 = this.field3454;
        var1.field3440 = this.field3440;
        var1.field3430 = this.field3430;
        var1.field3441 = this.field3441;
        var1.field3439 = this.field3439;
        var1.field3434 = this.field3434;
        var1.field3431 = this.field3431;
        var1.field3429 = this.field3429;
        var1.field3444 = this.field3444;
        var1.field3450 = this.field3450;
        var1.field3447 = this.field3447;
        var1.field3462 = this.field3462;
        var1.field3460 = this.field3460;
        var1.field3455 = this.field3455;
        var1.field3459 = this.field3459;
        var1.field3448 = this.field3448;
        var1.field3463 = this.field3463;
        var1.field3446 = this.field3446;
        var1.field3433 = this.field3433;
        var1.field3456 = this.field3456;
        var1.field3435 = this.field3435;
        var1.field3442 = this.field3442;
        var1.field3432 = this.field3432;
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
    public final void method1137(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3461; ++var4) {
            this.field3440[var4] += arg0;
            this.field3430[var4] += arg1;
            this.field3441[var4] += arg2;
        }
        this.method1134();
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "()V")
    private final void method1138() {
        int var10002;
        if (this.field3448 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3461; ++var3) {
                int var7 = this.field3448[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3446 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3446[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3461) {
                int var6 = this.field3448[var5];
                this.field3446[var6][var1[var6]++] = var5++;
            }
            this.field3448 = null;
        }
        if (this.field3463 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3443; ++var10) {
                int var14 = this.field3463[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3433 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3433[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3443) {
                int var13 = this.field3463[var12];
                this.field3433[var13][var8[var13]++] = var12++;
            }
            this.field3463 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lue;I)I")
    private final int method1139(class142 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3440[arg1];
        int var5 = arg0.field3430[arg1];
        int var6 = arg0.field3441[arg1];
        for (int var7 = 0; var7 < this.field3461; ++var7) {
            if (this.field3440[var7] == var4 && this.field3430[var7] == var5 && this.field3441[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3440[this.field3461] = var4;
            this.field3430[this.field3461] = var5;
            this.field3441[this.field3461] = var6;
            if (arg0.field3448 != null) {
                this.field3448[this.field3461] = arg0.field3448[arg1];
            }
            var3 = this.field3461++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
    private static final int method1140(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "()V")
    public final void method1141() {
        if (this.field3456 == null) {
            this.field3456 = new class83[this.field3461];
            for (int var1 = 0; var1 < this.field3461; ++var1) {
                this.field3456[var1] = new class83();
            }
            for (int var2 = 0; var2 < this.field3443; ++var2) {
                int var3 = this.field3439[var2];
                int var4 = this.field3434[var2];
                int var5 = this.field3431[var2];
                int var6 = this.field3440[var4] - this.field3440[var3];
                int var7 = this.field3430[var4] - this.field3430[var3];
                int var8 = this.field3441[var4] - this.field3441[var3];
                int var9 = this.field3440[var5] - this.field3440[var3];
                int var10 = this.field3430[var5] - this.field3430[var3];
                int var11 = this.field3441[var5] - this.field3441[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field3452 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3452[var2];
                }
                if (var19 == 0) {
                    class83 var20 = this.field3456[var3];
                    var20.field1914 += var16;
                    var20.field1903 += var17;
                    var20.field1907 += var18;
                    ++var20.field1902;
                    class83 var21 = this.field3456[var4];
                    var21.field1914 += var16;
                    var21.field1903 += var17;
                    var21.field1907 += var18;
                    ++var21.field1902;
                    class83 var22 = this.field3456[var5];
                    var22.field1914 += var16;
                    var22.field1903 += var17;
                    var22.field1907 += var18;
                    ++var22.field1902;
                } else if (var19 == 1) {
                    if (this.field3435 == null) {
                        this.field3435 = new class35[this.field3443];
                    }
                    class35 var23 = this.field3435[var2] = new class35();
                    var23.field722 = var16;
                    var23.field733 = var17;
                    var23.field727 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljb;II)Lue;")
    public static final class142 method1142(class64 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method458(false, arg2, arg1);
        return var3 == null ? null : new class142(var3);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZ)Lue;")
    public final class142 method1143(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class142 var6;
            if (arg4) {
                var6 = new class142();
                var6.field3461 = this.field3461;
                var6.field3443 = this.field3443;
                var6.field3454 = this.field3454;
                var6.field3440 = this.field3440;
                var6.field3441 = this.field3441;
                var6.field3439 = this.field3439;
                var6.field3434 = this.field3434;
                var6.field3431 = this.field3431;
                var6.field3452 = this.field3452;
                var6.field3429 = this.field3429;
                var6.field3444 = this.field3444;
                var6.field3450 = this.field3450;
                var6.field3447 = this.field3447;
                var6.field3462 = this.field3462;
                var6.field3460 = this.field3460;
                var6.field3455 = this.field3455;
                var6.field3459 = this.field3459;
                var6.field3448 = this.field3448;
                var6.field3463 = this.field3463;
                var6.field3446 = this.field3446;
                var6.field3433 = this.field3433;
                var6.field3442 = this.field3442;
                var6.field3432 = this.field3432;
                var6.field3430 = new int[var6.field3461];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field3461; ++var8) {
                int var9 = this.field3440[var8];
                int var10 = this.field3430[var8];
                int var11 = this.field3441[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field3430[var8] = var10 + var14 - var7;
            }
            var6.method1134();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "()V")
    public static void method1144() {
        field3427 = null;
        field3451 = null;
        field3436 = null;
    }

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "()V")
    public final void method1145() {
        for (int var1 = 0; var1 < this.field3461; ++var1) {
            this.field3440[var1] = -this.field3440[var1];
            this.field3441[var1] = -this.field3441[var1];
        }
        this.method1134();
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    private class142() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V")
    private class142(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class77 var4 = new class77(arg0);
        class77 var5 = new class77(arg0);
        class77 var6 = new class77(arg0);
        class77 var7 = new class77(arg0);
        class77 var8 = new class77(arg0);
        var4.field1691 = arg0.length - 18;
        int var9 = var4.method597(86);
        int var10 = var4.method597(56);
        int var11 = var4.method570((byte) 123);
        int var12 = var4.method570((byte) 123);
        int var13 = var4.method570((byte) 123);
        int var14 = var4.method570((byte) 123);
        int var15 = var4.method570((byte) 123);
        int var16 = var4.method570((byte) 123);
        int var17 = var4.method597(48);
        int var18 = var4.method597(120);
        int var19 = var4.method597(53);
        int var20 = var4.method597(124);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3461 = var9;
        this.field3443 = var10;
        this.field3454 = var11;
        this.field3440 = new int[var9];
        this.field3430 = new int[var9];
        this.field3441 = new int[var9];
        this.field3439 = new int[var10];
        this.field3434 = new int[var10];
        this.field3431 = new int[var10];
        if (var11 > 0) {
            this.field3460 = new int[var11];
            this.field3455 = new int[var11];
            this.field3459 = new int[var11];
        }
        if (var16 == 1) {
            this.field3448 = new int[var9];
        }
        if (var12 == 1) {
            this.field3452 = new byte[var10];
            this.field3450 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3429 = new byte[var10];
        } else {
            this.field3462 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3444 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3463 = new int[var10];
        }
        this.field3447 = new short[var10];
        var4.field1691 = var21;
        var5.field1691 = var36;
        var6.field1691 = var38;
        var7.field1691 = var40;
        var8.field1691 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method570((byte) 123);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method578(106);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method578(96);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method578(61);
            }
            this.field3440[var46] = var43 + var60;
            this.field3430[var46] = var44 + var61;
            this.field3441[var46] = var45 + var62;
            var43 = this.field3440[var46];
            var44 = this.field3430[var46];
            var45 = this.field3441[var46];
            if (var16 == 1) {
                this.field3448[var46] = var8.method570((byte) 123);
            }
        }
        var4.field1691 = var32;
        var5.field1691 = var28;
        var6.field1691 = var26;
        var7.field1691 = var30;
        var8.field1691 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3447[var47] = (short) var4.method597(112);
            if (var12 == 1) {
                int var58 = var5.method570((byte) 123);
                if ((var58 & 1) == 1) {
                    this.field3452[var47] = 1;
                    var3 = true;
                } else {
                    this.field3452[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field3450[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field3450[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3429[var47] = var6.method592((byte) -117);
            }
            if (var14 == 1) {
                this.field3444[var47] = var7.method592((byte) -100);
            }
            if (var15 == 1) {
                this.field3463[var47] = var8.method570((byte) 123);
            }
        }
        var4.field1691 = var25;
        var5.field1691 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method570((byte) 123);
            if (var54 == 1) {
                var48 = var4.method578(108) + var51;
                var49 = var4.method578(63) + var48;
                var50 = var4.method578(74) + var49;
                var51 = var50;
                this.field3439[var52] = var48;
                this.field3434[var52] = var49;
                this.field3431[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method578(104) + var51;
                var51 = var50;
                this.field3439[var52] = var48;
                this.field3434[var52] = var49;
                this.field3431[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method578(55) + var51;
                var51 = var50;
                this.field3439[var52] = var48;
                this.field3434[var52] = var49;
                this.field3431[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method578(76) + var51;
                var51 = var50;
                this.field3439[var52] = var48;
                this.field3434[var52] = var57;
                this.field3431[var52] = var50;
            }
        }
        var4.field1691 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3460[var53] = var4.method597(121);
            this.field3455[var53] = var4.method597(70);
            this.field3459[var53] = var4.method597(55);
        }
        if (!var2) {
            this.field3450 = null;
        }
        if (!var3) {
            this.field3452 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([Lue;I)V")
    public class142(class142[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field3461 = 0;
        this.field3443 = 0;
        this.field3454 = 0;
        this.field3462 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class142 var14 = arg0[var8];
            if (var14 != null) {
                this.field3461 += var14.field3461;
                this.field3443 += var14.field3443;
                this.field3454 += var14.field3454;
                if (var14.field3429 != null) {
                    var4 = true;
                } else {
                    if (this.field3462 == -1) {
                        this.field3462 = var14.field3462;
                    }
                    if (this.field3462 != var14.field3462) {
                        var4 = true;
                    }
                }
                var3 |= var14.field3452 != null;
                var5 |= var14.field3444 != null;
                var6 |= var14.field3463 != null;
                var7 |= var14.field3450 != null;
            }
        }
        this.field3440 = new int[this.field3461];
        this.field3430 = new int[this.field3461];
        this.field3441 = new int[this.field3461];
        this.field3448 = new int[this.field3461];
        this.field3439 = new int[this.field3443];
        this.field3434 = new int[this.field3443];
        this.field3431 = new int[this.field3443];
        if (this.field3454 > 0) {
            this.field3460 = new int[this.field3454];
            this.field3455 = new int[this.field3454];
            this.field3459 = new int[this.field3454];
        }
        if (var3) {
            this.field3452 = new byte[this.field3443];
        }
        if (var4) {
            this.field3429 = new byte[this.field3443];
        }
        if (var5) {
            this.field3444 = new byte[this.field3443];
        }
        if (var7) {
            this.field3450 = new byte[this.field3443];
        }
        if (var6) {
            this.field3463 = new int[this.field3443];
        }
        this.field3447 = new short[this.field3443];
        this.field3461 = 0;
        this.field3443 = 0;
        this.field3454 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class142 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3443; ++var12) {
                    if (var3 && var11.field3452 != null) {
                        this.field3452[this.field3443] = var11.field3452[var12];
                    }
                    if (var4) {
                        if (var11.field3429 != null) {
                            this.field3429[this.field3443] = var11.field3429[var12];
                        } else {
                            this.field3429[this.field3443] = var11.field3462;
                        }
                    }
                    if (var5 && var11.field3444 != null) {
                        this.field3444[this.field3443] = var11.field3444[var12];
                    }
                    if (var7) {
                        if (var11.field3450 != null && var11.field3450[var12] != -1) {
                            this.field3450[this.field3443] = (byte) (var11.field3450[var12] + var9);
                        } else {
                            this.field3450[this.field3443] = -1;
                        }
                    }
                    if (var6 && var11.field3463 != null) {
                        this.field3463[this.field3443] = var11.field3463[var12];
                    }
                    this.field3447[this.field3443] = var11.field3447[var12];
                    this.field3439[this.field3443] = this.method1139(var11, var11.field3439[var12]);
                    this.field3434[this.field3443] = this.method1139(var11, var11.field3434[var12]);
                    this.field3431[this.field3443] = this.method1139(var11, var11.field3431[var12]);
                    ++this.field3443;
                }
                for (int var13 = 0; var13 < var11.field3454; ++var13) {
                    this.field3460[this.field3454] = this.method1139(var11, var11.field3460[var13]);
                    this.field3455[this.field3454] = this.method1139(var11, var11.field3455[var13]);
                    this.field3459[this.field3454] = this.method1139(var11, var11.field3459[var13]);
                    ++this.field3454;
                }
                var9 += var11.field3454;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lue;ZZZ)V")
    public class142(class142 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field3461 = arg0.field3461;
        this.field3443 = arg0.field3443;
        this.field3454 = arg0.field3454;
        if (arg1) {
            this.field3440 = arg0.field3440;
            this.field3430 = arg0.field3430;
            this.field3441 = arg0.field3441;
        } else {
            this.field3440 = new int[this.field3461];
            this.field3430 = new int[this.field3461];
            this.field3441 = new int[this.field3461];
            for (int var5 = 0; var5 < this.field3461; ++var5) {
                this.field3440[var5] = arg0.field3440[var5];
                this.field3430[var5] = arg0.field3430[var5];
                this.field3441[var5] = arg0.field3441[var5];
            }
        }
        if (arg2) {
            this.field3447 = arg0.field3447;
        } else {
            this.field3447 = new short[this.field3443];
            for (int var6 = 0; var6 < this.field3443; ++var6) {
                this.field3447[var6] = arg0.field3447[var6];
            }
        }
        if (arg3) {
            this.field3444 = arg0.field3444;
        } else {
            this.field3444 = new byte[this.field3443];
            if (arg0.field3444 == null) {
                for (int var7 = 0; var7 < this.field3443; ++var7) {
                    this.field3444[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field3443; ++var8) {
                    this.field3444[var8] = arg0.field3444[var8];
                }
            }
        }
        this.field3439 = arg0.field3439;
        this.field3434 = arg0.field3434;
        this.field3431 = arg0.field3431;
        this.field3452 = arg0.field3452;
        this.field3429 = arg0.field3429;
        this.field3450 = arg0.field3450;
        this.field3462 = arg0.field3462;
        this.field3460 = arg0.field3460;
        this.field3455 = arg0.field3455;
        this.field3459 = arg0.field3459;
        this.field3448 = arg0.field3448;
        this.field3463 = arg0.field3463;
        this.field3446 = arg0.field3446;
        this.field3433 = arg0.field3433;
        this.field3456 = arg0.field3456;
        this.field3435 = arg0.field3435;
        this.field3445 = arg0.field3445;
        this.field3442 = arg0.field3442;
        this.field3432 = arg0.field3432;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field3436[var0++] = 255;
        }
        while (var0 < 16) {
            field3436[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field3436[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field3436[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field3436[var0++] = var1--;
        }
    }
}
