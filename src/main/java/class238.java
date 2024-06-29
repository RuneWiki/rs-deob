import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class238 extends class260 {

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "Z")
    public boolean field3574 = false;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Z")
    private boolean field3571 = true;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Lbu;")
    public static class21 field3575 = new class21(51, -2);

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)I", line = 4)
    public final int method129(int arg0, int arg1) {
        ++field3569;
        if (!super.field3829.method4083(75).method2819((byte) -62)) {
            return 3;
        } else if (~arg1 == -4 && !class65.method545("jagdx", arg0 ^ 21612)) {
            return 3;
        } else {
            if (arg0 != -1) {
                this.method1590(false, -69);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)I", line = 23)
    public final int method1588(int arg0) {
        if (arg0 >= -14) {
            this.method1591(17);
        }
        ++field3572;
        return super.field3828;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 36)
    public static void method1589(byte arg0) {
        field3575 = null;
        if (arg0 > -127) {
            field3575 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)V", line = 49)
    public final void method1590(boolean arg0, int arg1) {
        this.field3571 = arg0;
        ++field3568;
        if (arg1 != 0) {
            this.method1591(11);
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)Z", line = 63)
    public final boolean method1591(int arg0) {
        if (arg0 <= 89) {
            this.field3574 = false;
        }
        ++field3577;
        return this.field3571;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILgn;)V", line = 218)
    public class238(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lgn;)V", line = 225)
    public class238(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V", line = 82)
    public final void method128(int arg0, byte arg1) {
        this.field3574 = false;
        if (arg1 == 122) {
            ++field3576;
            super.field3828 = arg0;
        }
    }

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)Z", line = 96)
    public final boolean method1592(int arg0) {
        ++field3567;
        if (arg0 <= 73) {
            return true;
        } else {
            return super.field3829.method4083(60).method2819((byte) 124);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIFIIIIZ)[I", line = 111)
    public static final int[] method1593(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field3566;
        int[] var8 = new int[arg6];
        class198 var9 = new class198();
        var9.field3029 = arg0;
        var9.field3033 = arg1;
        var9.field3027 = arg5;
        var9.field3021 = arg4;
        var9.field3023 = arg7;
        var9.field3019 = (int) (arg2 * 4096.0F);
        var9.method52(arg3 + -6262);
        class686.method3867(-9851, 1, arg6);
        var9.method1369(arg3 + -2110, 0, var8);
        if (arg3 != 2166) {
            field3575 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lha;Z)V", line = 136)
    public static final void method1594(class65 arg0, boolean arg1) {
        if (arg1) {
            ++field3578;
            int var2 = 0;
            int var3 = 0;
            if (class195.field2997) {
                var2 = class493.method2933((byte) -46);
                var3 = class242.method1613(8220);
            }
            arg0.method434(var2, var3, class428.field5825 - -var2, 350 - -var3);
            arg0.method495(var2, var3, class428.field5825, 350, class184.field2827 << 24 | 3351159, 1);
            class33.method272(var2, var3, var3 - -350, false, var2 - -class428.field5825);
            int var4 = 350 / class637.field8936;
            if (~class787.field10806 < -1) {
                int var5 = -class637.field8936 + 342;
                int var6 = var4 * var5 / (class787.field10806 + var4 + -1);
                int var7 = 4;
                if (class787.field10806 > 1) {
                    var7 += (-class138.field2057 + class787.field10806 - 1) * (-var6 + var5) / (class787.field10806 + -1);
                }
                arg0.method495(var2 - -class428.field5825 - 16, var3 + var7, 12, var6, class184.field2827 << 24 | 3351159, 2);
                for (int var8 = class138.field2057; var8 < class138.field2057 + var4 && var8 < class787.field10806; ++var8) {
                    String[] var9 = class3.method22(true, '\b', class353.field4964[var8]);
                    int var10 = (class428.field5825 + -8 + -16) / var9.length;
                    for (int var11 = 0; ~var9.length < ~var11; ++var11) {
                        int var12 = var10 * var11 + 8;
                        arg0.method434(var2 - -var12, var3, var2 - -var12 - -var10 + -8, var3 + 350);
                        class449.field6148.method563(class105.method740(var9[var11], 0), (byte) -68, -1, -16777216, -class368.field5111.field56 - (-class138.field2057 + var8) * class637.field8936 + -class392.field5397 + 350 + -2 + var3, var2 + var12);
                    }
                }
            }
            class718.field9945.method567(-1, 0, class428.field5825 + var2 - 25, var3 + 330, -16777216, "Build: 650");
            arg0.method434(var2, var3, var2 - -class428.field5825, var3 + 350);
            arg0.method465(class428.field5825, 1, -class392.field5397 + 350 + var3, -1, var2);
            class269.field3907.method563("--> " + class105.method740(class46.field578, 0), (byte) 79, -1, -16777216, var3 - (-350 - (-class395.field5431.field56 + -1)), var2 - -10);
            if (class319.field4529) {
                int var13 = -1;
                if (class192.field2961 % 30 > 15) {
                    var13 = 16777215;
                }
                arg0.method547(class395.field5431.method41("--> " + class105.method740(class46.field578, 0).substring(0, class284.field4199), -97) + var2 + 10, 59, 12, var3 - -350 + -11 + -class395.field5431.field56, var13);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I", line = 228)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return 50;
        } else {
            this.field3574 = true;
            ++field3570;
            return !super.field3829.method4083(arg0 + -4311).method2819((byte) 125) ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 243)
    public final void method126(int arg0) {
        if (arg0 >= 102) {
            if (!super.field3829.method4083(119).method2819((byte) 6)) {
                super.field3828 = 0;
            }
            ++field3573;
            if (super.field3828 < 0 || ~super.field3828 < -6) {
                super.field3828 = this.method123(4377);
            }
        }
    }
}
