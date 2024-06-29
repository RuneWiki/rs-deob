import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class196 extends class1 {

    @OriginalMember(owner = "client!sh", name = "nb", descriptor = "I")
    private int field3489 = 0;

    @OriginalMember(owner = "client!sh", name = "pb", descriptor = "I")
    private int field3491 = 0;

    @OriginalMember(owner = "client!sh", name = "sb", descriptor = "I")
    private int field3494 = 0;

    @OriginalMember(owner = "client!sh", name = "ub", descriptor = "Loc;")
    private static class151 field3496 = class137.method873(2, "green:");

    @OriginalMember(owner = "client!sh", name = "lb", descriptor = "Loc;")
    public static class151 field3487 = class137.method873(2, "overlay2)3dat");

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "Z")
    public static boolean field3482 = false;

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "Loc;")
    public static class151 field3483 = field3496;

    @OriginalMember(owner = "client!sh", name = "xb", descriptor = "Z")
    public static boolean field3499 = false;

    @OriginalMember(owner = "client!sh", name = "Cb", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!sh", name = "Db", descriptor = "Loc;")
    public static class151 field3505 = field3496;

    @OriginalMember(owner = "client!sh", name = "ib", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!sh", name = "jb", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sh", name = "kb", descriptor = "I")
    private int field3486;

    @OriginalMember(owner = "client!sh", name = "mb", descriptor = "I")
    private int field3488;

    @OriginalMember(owner = "client!sh", name = "ob", descriptor = "I")
    private int field3490;

    @OriginalMember(owner = "client!sh", name = "qb", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sh", name = "rb", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sh", name = "tb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sh", name = "wb", descriptor = "I")
    private int field3498;

    @OriginalMember(owner = "client!sh", name = "yb", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!sh", name = "zb", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sh", name = "Ab", descriptor = "I")
    private int field3502;

    @OriginalMember(owner = "client!sh", name = "Bb", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!sh", name = "vb", descriptor = "Lsd;")
    public static class192 field3497;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBI)V")
    private final void method1227(int arg0, int arg1, byte arg2, int arg3) {
        ++field3495;
        int var5 = -19 % ((arg2 - 25) / 43);
        int var6 = arg1 <= arg0 ? arg0 : arg1;
        int var7 = ~arg1 <= ~arg0 ? arg0 : arg1;
        int var8 = arg3 >= var7 ? var7 : arg3;
        int var9 = arg3 <= var6 ? var6 : arg3;
        this.field3488 = (var8 + var9) / 2;
        int var10 = -var8 + var9;
        if (var10 <= 0) {
            this.field3502 = 0;
        } else {
            int var11 = (var9 - arg1 << 12) / var10;
            int var12 = (-arg3 + var9 << 12) / var10;
            int var13 = (-arg0 + var9 << 12) / var10;
            if (~arg1 != ~var9) {
                if (arg0 != var9) {
                    this.field3502 = ~arg1 != ~var8 ? -var11 + 20480 : var13 + 12288;
                } else {
                    this.field3502 = ~arg3 == ~var8 ? var11 + 4096 : -var12 + 12288;
                }
            } else {
                this.field3502 = ~arg0 != ~var8 ? 4096 - var13 : var12 + 20480;
            }
            this.field3502 /= 6;
        }
        if (~this.field3488 < -1 && ~this.field3488 > -4097) {
            this.field3486 = (var10 << 12) / (this.field3488 <= 2048 ? this.field3488 * 2 : -(this.field3488 * 2) + 8192);
        } else {
            this.field3486 = 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Loc;")
    public static final class151 method1228(int arg0, int arg1) {
        class151 var2 = new class151();
        if (arg1 > -21) {
            field3483 = null;
        }
        var2.field2690 = 0;
        var2.field2736 = new byte[arg0];
        ++field3503;
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
    private final void method1229(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg1 < -2049 ? -(arg1 * arg2 >> 12) + arg1 + arg2 : (arg2 + 4096) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field3498 = var5;
                                    this.field3490 = var7;
                                    this.field3500 = var15;
                                }
                            } else {
                                this.field3498 = var14;
                                this.field3490 = var7;
                                this.field3500 = var5;
                            }
                        } else {
                            this.field3490 = var15;
                            this.field3498 = var7;
                            this.field3500 = var5;
                        }
                    } else {
                        this.field3490 = var5;
                        this.field3498 = var7;
                        this.field3500 = var14;
                    }
                } else {
                    this.field3498 = var15;
                    this.field3500 = var7;
                    this.field3490 = var5;
                }
            } else {
                this.field3500 = var7;
                this.field3490 = var14;
                this.field3498 = var5;
            }
        } else {
            this.field3498 = this.field3490 = this.field3500 = arg1;
        }
        ++field3501;
        if (arg3 != 2048) {
            this.method1229(29, -66, 54, -75);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
    public static void method1230(boolean arg0) {
        field3505 = null;
        field3483 = null;
        field3496 = null;
        field3497 = null;
        if (!arg0) {
            field3497 = null;
        }
        field3487 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            return null;
        } else {
            int[][] var3 = super.field13.method578(arg0, arg1 + 80);
            if (super.field13.field1658) {
                int[][] var4 = this.method8(0, (byte) -108, arg0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class202.field3603 < ~var11; ++var11) {
                    this.method1227(var5[var11], var6[var11], (byte) 122, var7[var11]);
                    this.field3488 += this.field3494;
                    if (this.field3488 < 0) {
                        this.field3488 = 0;
                    }
                    for (this.field3502 += this.field3491; ~this.field3502 > -1; this.field3502 += 4096) {
                    }
                    while (this.field3502 > 4096) {
                        this.field3502 -= 4096;
                    }
                    if (~this.field3488 < -4097) {
                        this.field3488 = 4096;
                    }
                    this.field3486 += this.field3489;
                    if (this.field3486 < 0) {
                        this.field3486 = 0;
                    }
                    if (this.field3486 > 4096) {
                        this.field3486 = 4096;
                    }
                    this.method1229(this.field3502, this.field3488, this.field3486, arg1 ^ -2129);
                    var8[var11] = this.field3498;
                    var9[var11] = this.field3490;
                    var10[var11] = this.field3500;
                }
            }
            ++field3485;
            return var3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)[Lhh;")
    public static final class84[] method1231(boolean arg0) {
        ++field3492;
        class84[] var1 = new class84[field3493];
        for (int var2 = 0; var2 < field3493; ++var2) {
            class84 var3 = new class84();
            var3.field1592 = class124.field2236;
            var3.field1588 = class169.field3079;
            var3.field1587 = class128.field2302[var2];
            var3.field1589 = class148.field2650[var2];
            var3.field1586 = class159.field2862[var2];
            var3.field1591 = class181.field3271[var2];
            int var4 = var3.field1591 * var3.field1586;
            byte[] var5 = class174.field3147[var2];
            var3.field1590 = new int[var4];
            for (int var6 = 0; ~var4 < ~var6; ++var6) {
                var3.field1590[var6] = class67.field1312[class26.method206(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class99.method612(-20444);
        if (arg0) {
            return null;
        } else {
            return var1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field3484;
        if (arg0 == 0) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field3494 = (arg2.method1457(-2) << 12) / 100;
                    }
                } else {
                    this.field3489 = (arg2.method1457(-2) << 12) / 100;
                }
            } else {
                this.field3491 = arg2.method1466(12435);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class196() {
        super(1, false);
    }
}
