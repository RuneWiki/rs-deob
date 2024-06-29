import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class240 extends class224 {

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    private int field3835 = 81;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    private int field3839 = 4;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    private int field3832 = 8;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    private int field3836 = 204;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    private int field3840 = 1024;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    private int field3834 = 0;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    private int field3850 = 409;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    private int field3831 = 1024;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    public static int field3851 = 1;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    private int field3849;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    private int field3853;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "Ltj;")
    public static class273 field3833;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "[I")
    private int[] field3848;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "[[I")
    private int[][] field3842;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "[[I")
    private int[][] field3844;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public static final void method1623(int arg0) {
        if (class103.field1597 != null) {
            class130 var1 = class103.field1597;
            synchronized (class103.field1597) {
                class103.field1597 = null;
            }
        }
        ++field3846;
        if (arg0 != 0) {
            field3851 = -21;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 >= -46) {
            this.field3832 = 111;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field3840 = arg0.method190(-3);
                                    }
                                } else {
                                    this.field3835 = arg0.method190(-3);
                                }
                            } else {
                                this.field3834 = arg0.method190(-3);
                            }
                        } else {
                            this.field3831 = arg0.method190(-3);
                        }
                    } else {
                        this.field3836 = arg0.method190(-3);
                    }
                } else {
                    this.field3850 = arg0.method190(-3);
                }
            } else {
                this.field3832 = arg0.method201(255);
            }
        } else {
            this.field3839 = arg0.method201(255);
        }
        ++field3838;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
    public static void method1624(int arg0) {
        if (arg0 == 4096) {
            field3833 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1625(int arg0, String arg1, int arg2) {
        ++field3841;
        class287 var3 = class261.method1786(arg0, false, 3);
        var3.method1914((byte) 46);
        var3.field4554 = arg1;
        if (arg2 != 0) {
            method1625(-92, (String) null, 69);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3832 = 70;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        ++field3847;
        if (super.field3625.field4425) {
            int var4 = 0;
            int var5;
            for (var5 = class251.field4018[arg0] + this.field3834; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field3832 > var4 && this.field3848[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field3848[var4];
            int var9 = this.field3848[var4 - 1];
            if (~var5 < ~(this.field3849 + var9) && ~(-this.field3849 + var8) < ~var5) {
                for (int var10 = 0; ~class78.field1108 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field3831 : this.field3831;
                    int var13;
                    for (var13 = class243.field3893[var10] - -(this.field3830 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3839 > var11 && var13 >= this.field3844[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field3844[var6][var11];
                    int var16 = this.field3844[var6][var14];
                    if (var13 > var16 - -this.field3849 && -this.field3849 + var15 > var13) {
                        var3[var10] = this.field3842[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class196.method1356(var3, 0, class78.field1108, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
    private final void method1626(int arg0) {
        ++field3843;
        Random var2 = new Random((long) this.field3832);
        this.field3848 = new int[this.field3832 + 1];
        this.field3842 = new int[this.field3832][this.field3839];
        this.field3849 = this.field3835 / 2;
        this.field3830 = 4096 / this.field3839;
        this.field3853 = arg0 / this.field3832;
        this.field3848[0] = 0;
        this.field3844 = new int[this.field3832][this.field3839 - -1];
        int var3 = this.field3830 / 2;
        int var4 = this.field3853 / 2;
        for (int var5 = 0; var5 < this.field3832; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3853;
                int var7 = (-2048 + class80.method557(4096, var2, true)) * this.field3836 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3848[var5] = this.field3848[var5 + -1] + var8;
            }
            this.field3844[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3839; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3830;
                    int var11 = (class80.method557(4096, var2, true) - 2048) * this.field3850 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3844[var5][var9] = this.field3844[var5][var9 + -1] + var12;
                }
                this.field3842[var5][var9] = this.field3840 > 0 ? 4096 + -class80.method557(this.field3840, var2, true) : 4096;
            }
            this.field3844[var5][this.field3839] = 4096;
        }
        this.field3848[this.field3832] = 4096;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(Z)V")
    public static final void method1627(boolean arg0) {
        ++field3837;
        for (int var1 = -1; var1 < class73.field1040; ++var1) {
            int var5;
            if (~var1 != 0) {
                var5 = class8.field117[var1];
            } else {
                var5 = 2047;
            }
            class186 var6 = class153.field2277[var5];
            if (var6 != null && var6.field1194 > 0) {
                --var6.field1194;
                if (var6.field1194 == 0) {
                    var6.field1278 = null;
                }
            }
        }
        if (arg0) {
            method1625(-89, (String) null, 108);
        }
        for (int var2 = 0; ~class236.field3774 < ~var2; ++var2) {
            int var3 = class248.field3967[var2];
            class56 var4 = class100.field1566[var3];
            if (var4 != null && var4.field1194 > 0) {
                --var4.field1194;
                if (var4.field1194 == 0) {
                    var4.field1278 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 > -4) {
            this.field3840 = 46;
        }
        this.method1626(4096);
        ++field3845;
    }
}
