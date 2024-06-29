import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class285 extends class273 {

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field4525 = 204;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field4536 = 0;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    private int field4538 = 8;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    private int field4541 = 1024;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    private int field4533 = 409;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field4534 = 1024;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "I")
    private int field4545 = 4;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    private int field4550 = 81;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field4532 = -2;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "Z")
    public static volatile boolean field4540 = true;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "[Ljava/lang/String;")
    public static String[] field4542 = new String[5];

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Z")
    public static boolean field4537 = false;

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "Ljava/lang/String;")
    public static String field4549 = "Loading fonts - ";

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Lsb;")
    public static class124 field4543;

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "[I")
    private int[] field4547;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "[Z")
    public static boolean[] field4548;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[[I")
    private int[][] field4529;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "[[I")
    private int[][] field4535;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field4546;
        this.method1910(8);
        if (arg0 > -94) {
            this.field4550 = -8;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4521;
        int var5 = -arg2;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg3;
        int var9 = class32.method278(class32.field540, 1, class61.field1034, arg4 - -arg2);
        int var10 = class32.method278(class32.field540, arg3 ^ -2, class61.field1034, -arg2 + arg4);
        class224.method1504(arg0, var9, var10, class114.field1841[arg1], arg3 ^ -8);
        while (~var6 > ~var7) {
            var8 += 2;
            var5 += var8;
            if (var5 > 0) {
                --var7;
                var5 -= var7 << 1;
                int var11 = arg1 - var7;
                int var12 = arg1 + var7;
                if (~class108.field1650 >= ~var12 && ~class154.field2509 <= ~var11) {
                    int var13 = class32.method278(class32.field540, 1, class61.field1034, arg4 - -var6);
                    int var14 = class32.method278(class32.field540, 1, class61.field1034, -var6 + arg4);
                    if (class154.field2509 >= var12) {
                        class224.method1504(arg0, var13, var14, class114.field1841[var12], 7);
                    }
                    if (~var11 <= ~class108.field1650) {
                        class224.method1504(arg0, var13, var14, class114.field1841[var11], 7);
                    }
                }
            }
            ++var6;
            int var15 = arg1 + var6;
            int var16 = -var6 + arg1;
            if (~class108.field1650 >= ~var15 && var16 <= class154.field2509) {
                int var17 = class32.method278(class32.field540, 1, class61.field1034, arg4 + var7);
                int var18 = class32.method278(class32.field540, 1, class61.field1034, -var7 + arg4);
                if (~class154.field2509 <= ~var15) {
                    class224.method1504(arg0, var17, var18, class114.field1841[var15], arg3 ^ -8);
                }
                if (class108.field1650 <= var16) {
                    class224.method1504(arg0, var17, var18, class114.field1841[var16], 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class285() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            this.field4527 = -112;
        }
        ++field4528;
        int[] var3 = super.field4359.method387((byte) -120, arg1);
        if (super.field4359.field833) {
            int var4 = 0;
            int var5;
            for (var5 = class255.field4068[arg1] + this.field4536; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field4538 > var4 && this.field4547[var4] <= var5) {
                ++var4;
            }
            boolean var6 = ~(var4 & 1) == -1;
            int var7 = this.field4547[var4 + -1];
            int var8 = this.field4547[var4];
            int var9 = var4 + -1;
            if (~(var7 - -this.field4530) > ~var5 && ~(-this.field4530 + var8) < ~var5) {
                for (int var10 = 0; var10 < class26.field458; ++var10) {
                    int var11 = var6 ? this.field4541 : -this.field4541;
                    int var12 = class265.field4234[var10] - -(this.field4522 * var11 >> 12);
                    int var13 = 0;
                    while (~var12 > -1) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field4545 > var13 && this.field4529[var9][var13] <= var12) {
                        ++var13;
                    }
                    int var14 = this.field4529[var9][var13];
                    int var15 = var13 + -1;
                    int var16 = this.field4529[var9][var15];
                    if (var12 > this.field4530 + var16 && var12 < -this.field4530 + var14) {
                        var3[var10] = this.field4535[var9][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class68.method532(var3, 0, class26.field458, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    private final void method1910(int arg0) {
        Random var2 = new Random((long) this.field4538);
        this.field4535 = new int[this.field4538][this.field4545];
        this.field4530 = this.field4550 / 2;
        this.field4522 = 4096 / this.field4545;
        this.field4527 = 4096 / this.field4538;
        int var3 = this.field4522 / 2;
        ++field4523;
        this.field4529 = new int[this.field4538][this.field4545 + 1];
        this.field4547 = new int[this.field4538 + 1];
        int var4 = this.field4527 / 2;
        if (arg0 != 8) {
            field4548 = null;
        }
        this.field4547[0] = 0;
        for (int var5 = 0; this.field4538 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field4527;
                int var7 = (class111.method824(0, var2, 4096) + -2048) * this.field4525 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4547[var5] = this.field4547[var5 + -1] + var8;
            }
            this.field4529[var5][0] = 0;
            for (int var9 = 0; this.field4545 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field4522;
                    int var11 = (-2048 + class111.method824(0, var2, 4096)) * this.field4533 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4529[var5][var9] = this.field4529[var5][var9 - 1] + var12;
                }
                this.field4535[var5][var9] = this.field4534 <= 0 ? 4096 : 4096 - class111.method824(arg0 + -8, var2, this.field4534);
            }
            this.field4529[var5][this.field4545] = 4096;
        }
        this.field4547[this.field4538] = 4096;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public static final void method1911(int arg0, int arg1) {
        ++field4526;
        if (arg1 != 1) {
            method1911(-4, 60);
        }
        class144.field2383.method1163(arg0, false);
        class92.field1454.method1163(arg0, false);
        class36.field618.method1163(arg0, false);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)Z")
    public static final boolean method1912(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class226.field3601; ++var3) {
            class228 var4 = class179.field2971[var3];
            if (var4.field3627 == 1) {
                int var5 = var4.field3625 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3634 * var5 >> 8) + var4.field3617;
                    int var7 = (var4.field3637 * var5 >> 8) + var4.field3641;
                    int var8 = (var4.field3639 * var5 >> 8) + var4.field3619;
                    int var9 = (var4.field3640 * var5 >> 8) + var4.field3638;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3627 == 2) {
                int var10 = arg0 - var4.field3625;
                if (var10 > 0) {
                    int var11 = (var4.field3634 * var10 >> 8) + var4.field3617;
                    int var12 = (var4.field3637 * var10 >> 8) + var4.field3641;
                    int var13 = (var4.field3639 * var10 >> 8) + var4.field3619;
                    int var14 = (var4.field3640 * var10 >> 8) + var4.field3638;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3627 == 3) {
                int var15 = var4.field3617 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3624 * var15 >> 8) + var4.field3625;
                    int var17 = (var4.field3643 * var15 >> 8) + var4.field3645;
                    int var18 = (var4.field3639 * var15 >> 8) + var4.field3619;
                    int var19 = (var4.field3640 * var15 >> 8) + var4.field3638;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3627 == 4) {
                int var20 = arg2 - var4.field3617;
                if (var20 > 0) {
                    int var21 = (var4.field3624 * var20 >> 8) + var4.field3625;
                    int var22 = (var4.field3643 * var20 >> 8) + var4.field3645;
                    int var23 = (var4.field3639 * var20 >> 8) + var4.field3619;
                    int var24 = (var4.field3640 * var20 >> 8) + var4.field3638;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3627 == 5) {
                int var25 = arg1 - var4.field3619;
                if (var25 > 0) {
                    int var26 = (var4.field3624 * var25 >> 8) + var4.field3625;
                    int var27 = (var4.field3643 * var25 >> 8) + var4.field3645;
                    int var28 = (var4.field3634 * var25 >> 8) + var4.field3617;
                    int var29 = (var4.field3637 * var25 >> 8) + var4.field3641;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field4539;
        if (arg2 == 5) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (~arg1 != -7) {
                                        if (~arg1 == -8) {
                                            this.field4534 = arg0.method996(65280);
                                        }
                                    } else {
                                        this.field4550 = arg0.method996(arg2 + 65275);
                                    }
                                } else {
                                    this.field4536 = arg0.method996(65280);
                                }
                            } else {
                                this.field4541 = arg0.method996(65280);
                            }
                        } else {
                            this.field4525 = arg0.method996(arg2 ^ 65285);
                        }
                    } else {
                        this.field4533 = arg0.method996(65280);
                    }
                } else {
                    this.field4538 = arg0.method1012(4);
                }
            } else {
                this.field4545 = arg0.method1012(4);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static void method1913(byte arg0) {
        field4542 = null;
        field4549 = null;
        if (arg0 == 20) {
            field4543 = null;
            field4548 = null;
        }
    }
}
