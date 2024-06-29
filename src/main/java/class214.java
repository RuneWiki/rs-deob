import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class214 extends class123 {

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "[S")
    private short[] field3709 = new short[257];

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
    private int field3711 = 0;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "Leb;")
    public static class230 field3701 = class68.method589(0, "Liste der Welten geladen");

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    public static int field3712 = -1;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "Z")
    public static volatile boolean field3703 = true;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Leb;")
    public static class230 field3713 = class68.method589(0, "Hidden)2");

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "Z")
    public static boolean field3718 = false;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sb", name = "ub", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "Lkk;")
    public static class223 field3698;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "[I")
    private int[] field3704;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "[I")
    public static int[] field3705;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "[I")
    private int[] field3710;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "[[I")
    private int[][] field3706;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = -6 % ((arg1 - -24) / 57);
        ++field3708;
        int[] var4 = super.field2160.method1323((byte) 86, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 126);
            for (int var6 = 0; class140.field2505 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field3709[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)V")
    public static final void method1478(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 102 % ((arg0 - 6) / 54);
        ++field3719;
        if (class97.field1790 != 0 && arg1 != 0 && class17.field386 < 50 && arg2 != -1) {
            class88.field1526[class17.field386] = arg2;
            class179.field3144[class17.field386] = arg1;
            class110.field1982[class17.field386] = arg3;
            class190.field3361[class17.field386] = null;
            class26.field491[class17.field386] = 0;
            ++class17.field386;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)[I")
    private final int[] method1479(int arg0, int arg1) {
        int var3 = 73 % ((-57 - arg0) / 35);
        ++field3717;
        if (arg1 < 0) {
            return this.field3710;
        } else {
            return ~this.field3706.length >= ~arg1 ? this.field3704 : this.field3706[arg1];
        }
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static void method1480(int arg0) {
        field3698 = null;
        field3701 = null;
        if (arg0 != 0) {
            field3698 = null;
        }
        field3713 = null;
        field3705 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3711 = arg1.method200(255);
            this.field3706 = new int[arg1.method200(255)][2];
            for (int var4 = 0; ~this.field3706.length < ~var4; ++var4) {
                this.field3706[var4][0] = arg1.method161(4);
                this.field3706[var4][1] = arg1.method161(4);
            }
        }
        if (arg2 == 1876195788) {
            ++field3715;
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(II)Leb;")
    public static final class230 method1481(int arg0, int arg1) {
        class230 var2 = new class230();
        var2.field3988 = new byte[arg1];
        var2.field3990 = arg0;
        ++field3714;
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
    private final void method1482(int arg0) {
        ++field3721;
        int[] var2 = this.field3706[0];
        int[] var3 = this.field3706[this.field3706.length - arg0];
        int[] var4 = this.field3706[1];
        int[] var5 = this.field3706[this.field3706.length + -1];
        this.field3704 = new int[] { var3[0] + -var5[0] + var3[0], -var5[1] - (-var3[1] - var3[1]) };
        this.field3710 = new int[] { -var4[0] - -var2[0] + var2[0], var2[1] - (var4[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    private final void method1483(byte arg0) {
        int var2 = 90 / ((-18 - arg0) / 56);
        int var3 = this.field3711;
        if (~var3 != -3) {
            if (var3 == 1) {
                for (int var4 = 0; ~var4 > -258; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; ~(this.field3706.length + -1) < ~var6 && ~var5 <= ~this.field3706[var6][0]; ++var6) {
                    }
                    int[] var7 = this.field3706[var6 + -1];
                    int[] var8 = this.field3706[var6];
                    int var9 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                    int var10 = -class72.field1320[var9 >> 5 & 255] + 4096 >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 - -(var8[1] * var10) >> 12;
                    if (~var12 >= 32767) {
                        var12 = -32767;
                    }
                    if (var12 >= 32768) {
                        var12 = 32767;
                    }
                    this.field3709[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; ~var13 > -258; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; ~(this.field3706.length - 1) < ~var15 && this.field3706[var15][0] <= var14; ++var15) {
                    }
                    int[] var16 = this.field3706[var15 + -1];
                    int[] var17 = this.field3706[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] - var16[0]);
                    int var19 = 4096 - var18;
                    int var20 = var16[1] * var19 + var17[1] * var18 >> 12;
                    if (var20 <= -32768) {
                        var20 = -32767;
                    }
                    if (~var20 <= -32769) {
                        var20 = 32767;
                    }
                    this.field3709[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; var21 < 257; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; var23 < this.field3706.length - 1 && ~var22 <= ~this.field3706[var23][0]; ++var23) {
                }
                int[] var24 = this.field3706[var23 - 1];
                int[] var25 = this.field3706[var23];
                int var26 = this.method1479(34, var23 - 2)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method1479(-95, var23 + 1)[1];
                int var30 = -var26 + var28;
                int var31 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var33 = var31 * var31 >> 12;
                int var34 = -var26 + var27 + var29 + -var28;
                int var35 = (var31 * var34 >> 12) * var33 >> 12;
                int var36 = var30 * var31 >> 12;
                int var37 = -var34 + var26 - var27;
                int var38 = var33 * var37 >> 12;
                int var39 = var35 + var36 + var38 + var27;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field3709[var21] = (short) var39;
            }
        }
        ++field3707;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        ++field3720;
        if (this.field3706 == null) {
            this.field3706 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3706.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != 0) {
                this.field3704 = null;
            }
            if (this.field3711 == 2) {
                this.method1482(arg0 ^ 2);
            }
            class210.method1466(true);
            this.method1483((byte) 78);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(II)Lfg;")
    public static final class12 method1484(int arg0, int arg1) {
        ++field3700;
        class12 var2 = (class12) class116.field2088.method1125((long) arg0, true);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class123.field2166.method1546(class57.method479(arg0, 1000), (byte) -100, class112.method899(124, arg0));
            class12 var4 = new class12();
            var4.field175 = arg0;
            if (var3 != null) {
                var4.method133(new class14(var3), true);
            }
            var4.method123(119);
            if (var4.field192 != arg1) {
                var4.method119(method1484(var4.field232, -1), method1484(var4.field192, arg1), (byte) -26);
            }
            if (var4.field206 != -1) {
                var4.method121(method1484(var4.field190, -1), 2729, method1484(var4.field206, -1));
            }
            if (!class67.field1264 && var4.field171) {
                var4.field187 = null;
                var4.field185 = 0;
                var4.field191 = class38.field710;
                var4.field170 = false;
                var4.field221 = null;
            }
            class116.field2088.method1129((long) arg0, true, var4);
            return var4;
        }
    }
}
