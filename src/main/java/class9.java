import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class1 {

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
    private int field137 = 1;

    @OriginalMember(owner = "client!ah", name = "ob", descriptor = "I")
    private int field143 = 1;

    @OriginalMember(owner = "client!ah", name = "sb", descriptor = "I")
    private int field147 = 204;

    @OriginalMember(owner = "client!ah", name = "jb", descriptor = "[I")
    public static int[] field138 = new int[200];

    @OriginalMember(owner = "client!ah", name = "mb", descriptor = "Loc;")
    public static class151 field141 = class137.method873(2, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!ah", name = "pb", descriptor = "Loc;")
    private static class151 field144 = class137.method873(2, "Discard");

    @OriginalMember(owner = "client!ah", name = "nb", descriptor = "Loc;")
    public static class151 field142 = class137.method873(2, "T");

    @OriginalMember(owner = "client!ah", name = "kb", descriptor = "Loc;")
    public static class151 field139 = field144;

    @OriginalMember(owner = "client!ah", name = "qb", descriptor = "Loc;")
    public static class151 field145 = class137.method873(2, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ah", name = "lb", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ah", name = "rb", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ah", name = "tb", descriptor = "[Lcg;")
    public static class30[] field148;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class9() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
    public static void method51(int arg0) {
        field138 = null;
        field141 = null;
        field142 = null;
        field144 = null;
        field148 = null;
        field139 = null;
        field145 = null;
        if (arg0 != 128) {
            field148 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lw;B)V")
    public static final void method52(class228 arg0, byte arg1) {
        if (class200.field3541 == arg0.field4040 || ~arg0.field3991 == 0 || arg0.field4004 != 0 || arg0.field4022 + 1 > class197.method1233(-104, arg0.field3991).field2051[arg0.field4020]) {
            int var2 = -arg0.field4015 + arg0.field4040;
            int var3 = -arg0.field4015 + class200.field3541;
            int var4 = arg0.field3994 * 128 - -(arg0.field4007 * 64);
            int var5 = arg0.field4007 * 64 + arg0.field4000 * 128;
            int var6 = arg0.field4006 * 128 - -(arg0.field4007 * 64);
            int var7 = arg0.field4007 * 64 + arg0.field3996 * 128;
            arg0.field4029 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg0.field3976 = ((-var3 + var2) * var6 + var3 * var5) / var2;
        }
        ++field135;
        if (arg1 == -43) {
            arg0.field4003 = 0;
            if (~arg0.field3997 == -1) {
                arg0.field4017 = 1024;
            }
            if (arg0.field3997 == 1) {
                arg0.field4017 = 1536;
            }
            if (arg0.field3997 == 2) {
                arg0.field4017 = 0;
            }
            if (arg0.field3997 == 3) {
                arg0.field4017 = 512;
            }
            arg0.field4024 = arg0.field4017;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(III)Z")
    public static final boolean method53(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class234.field4301; ++var3) {
            class168 var4 = class95.field1777[var3];
            if (var4.field3063 == 1) {
                int var5 = var4.field3047 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3052 * var5 >> 8) + var4.field3060;
                    int var7 = (var4.field3051 * var5 >> 8) + var4.field3057;
                    int var8 = (var4.field3065 * var5 >> 8) + var4.field3053;
                    int var9 = (var4.field3055 * var5 >> 8) + var4.field3072;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3063 == 2) {
                int var10 = arg0 - var4.field3047;
                if (var10 > 0) {
                    int var11 = (var4.field3052 * var10 >> 8) + var4.field3060;
                    int var12 = (var4.field3051 * var10 >> 8) + var4.field3057;
                    int var13 = (var4.field3065 * var10 >> 8) + var4.field3053;
                    int var14 = (var4.field3055 * var10 >> 8) + var4.field3072;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3063 == 3) {
                int var15 = var4.field3060 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3062 * var15 >> 8) + var4.field3047;
                    int var17 = (var4.field3054 * var15 >> 8) + var4.field3070;
                    int var18 = (var4.field3065 * var15 >> 8) + var4.field3053;
                    int var19 = (var4.field3055 * var15 >> 8) + var4.field3072;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3063 == 4) {
                int var20 = arg2 - var4.field3060;
                if (var20 > 0) {
                    int var21 = (var4.field3062 * var20 >> 8) + var4.field3047;
                    int var22 = (var4.field3054 * var20 >> 8) + var4.field3070;
                    int var23 = (var4.field3065 * var20 >> 8) + var4.field3053;
                    int var24 = (var4.field3055 * var20 >> 8) + var4.field3072;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3063 == 5) {
                int var25 = arg1 - var4.field3053;
                if (var25 > 0) {
                    int var26 = (var4.field3062 * var25 >> 8) + var4.field3047;
                    int var27 = (var4.field3054 * var25 >> 8) + var4.field3070;
                    int var28 = (var4.field3052 * var25 >> 8) + var4.field3060;
                    int var29 = (var4.field3051 * var25 >> 8) + var4.field3057;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field140;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field147 = arg2.method1490((byte) 73);
                }
            } else {
                this.field137 = arg2.method1475(255);
            }
        } else {
            this.field143 = arg2.method1475(255);
        }
        if (arg0 != 0) {
            field136 = 92;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field146;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            for (int var4 = 0; ~class202.field3603 < ~var4; ++var4) {
                int var5 = class23.field509[arg1];
                int var6 = class195.field3477[var4];
                int var7 = this.field143 * var6 >> 12;
                int var8 = this.field137 * var5 >> 12;
                int var9 = var5 % (4096 / this.field137) * this.field137;
                int var10 = var6 % (4096 / this.field143) * this.field143;
                if (~var9 > ~this.field147) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field147 < ~var10) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field147 > var10) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg0 != 107 ? null : var3;
    }
}
