import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class191 extends class105 {

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    private int field3695 = 4;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    private int field3689 = 8;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    private int field3687 = 204;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "I")
    private int field3696 = 81;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
    private int field3705 = 1024;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    private int field3690 = 0;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    private int field3709 = 1024;

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
    private int field3697 = 409;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "Leh;")
    public static class47 field3694 = class195.method1282((byte) -4, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    public static int field3691 = 0;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "Lea;")
    public static class40 field3692 = new class40();

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "[I")
    public static int[] field3713 = new int[100];

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
    private int field3707;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "Lmf;")
    public static class114 field3711;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "Lgf;")
    public static class61 field3712;

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "Lah;")
    public static class9 field3704;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "[I")
    private int[] field3686;

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "[[I")
    private int[][] field3701;

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "[[I")
    private int[][] field3703;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)V")
    private final void method1253(boolean arg0) {
        ++field3699;
        if (!arg0) {
            field3712 = null;
        }
        Random var2 = new Random((long) this.field3689);
        this.field3703 = new int[this.field3689][this.field3695 + 1];
        this.field3707 = this.field3696 / 2;
        this.field3685 = 4096 / this.field3695;
        this.field3686 = new int[this.field3689 + 1];
        this.field3706 = 4096 / this.field3689;
        int var3 = this.field3685 / 2;
        this.field3686[0] = 0;
        int var4 = this.field3706 / 2;
        this.field3701 = new int[this.field3689][this.field3695];
        for (int var5 = 0; ~var5 > ~this.field3689; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3706;
                int var7 = (class51.method452(false, 4096, var2) + -2048) * this.field3687 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3686[var5] = this.field3686[var5 + -1] + var8;
            }
            this.field3703[var5][0] = 0;
            for (int var9 = 0; this.field3695 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3685;
                    int var11 = (class51.method452(false, 4096, var2) + -2048) * this.field3697 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3703[var5][var9] = this.field3703[var5][var9 - 1] + var12;
                }
                this.field3701[var5][var9] = this.field3709 > 0 ? -class51.method452(false, this.field3709, var2) + 4096 : 4096;
            }
            this.field3703[var5][this.field3695] = 4096;
        }
        this.field3686[this.field3689] = 4096;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(Z)V")
    public static void method1254(boolean arg0) {
        field3713 = null;
        field3692 = null;
        field3711 = null;
        field3694 = null;
        if (!arg0) {
            field3713 = null;
        }
        field3712 = null;
        field3704 = null;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
    public static final void method1255(int arg0) {
        if (arg0 != 26061) {
            method1254(true);
        }
        ++field3702;
        class181.field3468.method792((byte) -14);
        class86.field1848 = null;
        class9.field211 = 1;
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
    public static final void method1256(int arg0) {
        ++field3693;
        ++class69.field1513;
        class60.field1174.method657(28182, 91);
        if (arg0 != 0) {
            method1256(79);
        }
        for (class63 var1 = (class63) class138.field2710.method1344(false); var1 != null; var1 = (class63) class138.field2710.method1340(false)) {
            if (~var1.field1345 == -1) {
                class185.method1230(true, true, var1);
            }
        }
        if (class200.field3905 != null) {
            class20.method204(class200.field3905, (byte) -5);
            class200.field3905 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
    public static final void method1257(byte arg0) {
        class199 var1 = (class199) client.field551.method345(-112);
        ++field3714;
        while (var1 != null) {
            if (~var1.field3891 < -1) {
                --var1.field3891;
            }
            if (var1.field3891 == 0) {
                if (~var1.field3883 > -1 || class155.method1073(var1.field3874, 91, var1.field3883)) {
                    class23.method225(var1.field3878, var1.field3873, var1.field3889, var1.field3874, var1.field3885, 103, var1.field3879, var1.field3883);
                    var1.method885(3);
                }
            } else {
                if (~var1.field3887 < -1) {
                    --var1.field3887;
                }
                if (var1.field3887 == 0 && var1.field3885 >= 1 && ~var1.field3873 <= -2 && var1.field3885 <= 102 && ~var1.field3873 >= -103 && (~var1.field3875 > -1 || class155.method1073(var1.field3876, 111, var1.field3875))) {
                    class23.method225(var1.field3878, var1.field3873, var1.field3889, var1.field3876, var1.field3885, 103, var1.field3888, var1.field3875);
                    var1.field3887 = -1;
                    if (var1.field3883 == var1.field3875 && ~var1.field3883 == 0) {
                        var1.method885(3);
                    } else if (var1.field3883 == var1.field3875 && var1.field3888 == var1.field3879 && ~var1.field3876 == ~var1.field3874) {
                        var1.method885(3);
                    }
                }
            }
            var1 = (class199) client.field551.method348(13949);
        }
        if (arg0 <= 82) {
            method1254(false);
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        this.method1253(true);
        if (arg0 != -1) {
            field3691 = -76;
        }
        ++field3708;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field3710;
        if (arg1 <= 78) {
            return null;
        } else {
            int[] var3 = super.field2192.method336(-96, arg0);
            if (super.field2192.field770) {
                int var4;
                for (var4 = class26.field500[arg0] + this.field3690; ~var4 > -1; var4 += 4096) {
                }
                while (var4 > 4096) {
                    var4 -= 4096;
                }
                int var5;
                for (var5 = 0; ~this.field3689 < ~var5 && ~this.field3686[var5] >= ~var4; ++var5) {
                }
                float var6 = (float) this.field3686[var5 + -1];
                float var7 = (float) this.field3686[var5];
                if ((float) var4 > (float) this.field3707 + var6 && (float) var4 < (float) (-this.field3707) + var7) {
                    for (int var8 = 0; class149.field2928 > var8; ++var8) {
                        int var9 = 0;
                        int var10 = var5 % 2 == 0 ? this.field3705 : -this.field3705;
                        int var11;
                        for (var11 = (this.field3685 * var10 >> 12) + class167.field3237[var8]; ~var11 > -1; var11 += 4096) {
                        }
                        while (var11 > 4096) {
                            var11 -= 4096;
                        }
                        while (~this.field3695 < ~var9 && ~var11 <= ~this.field3703[var5 + -1][var9]) {
                            ++var9;
                        }
                        float var12 = (float) this.field3703[var5 + -1][var9 + -1];
                        float var13 = (float) this.field3703[var5 + -1][var9];
                        if ((float) var11 > (float) this.field3707 + var12 && (float) var11 < (float) (-this.field3707) + var13) {
                            var3[var8] = this.field3701[var5 + -1][var9 + -1];
                        } else {
                            var3[var8] = 0;
                        }
                    }
                } else {
                    class128.method959(var3, 0, class149.field2928, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            this.method17(-124, (class68) null, 42);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field3709 = arg1.method569(26496);
                                    }
                                } else {
                                    this.field3696 = arg1.method569(26496);
                                }
                            } else {
                                this.field3690 = arg1.method569(26496);
                            }
                        } else {
                            this.field3705 = arg1.method569(26496);
                        }
                    } else {
                        this.field3687 = arg1.method569(26496);
                    }
                } else {
                    this.field3697 = arg1.method569(arg2 ^ -26496);
                }
            } else {
                this.field3689 = arg1.method604((byte) -126);
            }
        } else {
            this.field3695 = arg1.method604((byte) 117);
        }
        ++field3700;
    }
}
