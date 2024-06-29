import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class50 extends class124 {

    @OriginalMember(owner = "client!sd", name = "Ec", descriptor = "I")
    public static int field601 = 0;

    @OriginalMember(owner = "client!sd", name = "Jc", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!sd", name = "Gc", descriptor = "Lgb;")
    public static class117 field603 = new class117();

    @OriginalMember(owner = "client!sd", name = "Uc", descriptor = "I")
    public static int field617 = -1;

    @OriginalMember(owner = "client!sd", name = "Xc", descriptor = "I")
    public static int field620 = -11713997;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sd", name = "zc", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!sd", name = "Ac", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!sd", name = "Bc", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!sd", name = "Cc", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!sd", name = "Dc", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!sd", name = "Fc", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!sd", name = "Hc", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!sd", name = "Ic", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sd", name = "Kc", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!sd", name = "Lc", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!sd", name = "Mc", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!sd", name = "Nc", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!sd", name = "Oc", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!sd", name = "Pc", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!sd", name = "Qc", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!sd", name = "Rc", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!sd", name = "Tc", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!sd", name = "Wc", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!sd", name = "Yc", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!sd", name = "Sc", descriptor = "Ltb;")
    public class226 field615;

    @OriginalMember(owner = "client!sd", name = "Vc", descriptor = "[I")
    public static int[] field618;

    @OriginalMember(owner = "client!sd", name = "Zc", descriptor = "[I")
    public static int[] field622;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)I", line = 3)
    public final int method309(byte arg0) {
        if (arg0 != -125) {
            field606 = 7;
        }
        ++field604;
        if (this.field615.field3771 != null) {
            class226 var2 = this.field615.method1619(-125);
            if (var2 != null && ~var2.field3764 != 0) {
                return var2.field3764;
            }
        }
        return this.field615.field3764;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lmo;ILmo;)V", line = 29)
    public static final void method310(class447 arg0, int arg1, class447 arg2) {
        class211.field3375 = arg0;
        class219.field3624 = arg2;
        if (arg1 != 17657) {
            field617 = 126;
        }
        ++field621;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILe;I)Z", line = 41)
    private final boolean method311(int arg0, class312 arg1, int arg2) {
        ++field611;
        int var4 = arg0;
        class349 var5 = this.method912(arg2 + -7);
        class417 var6 = super.field1878 != -1 && super.field1880 == 0 ? class156.method1099(super.field1878, 90) : null;
        class417 var7 = super.field1851 == -1 || super.field1831 && var6 != null ? null : class156.method1099(super.field1851, 50);
        int var8 = var5.field5395;
        int var9 = var5.field5380;
        if (var8 != 0 || var9 != 0 || ~var5.field5408 != -1 || var5.field5412 != 0) {
            arg0 |= 7;
        }
        class348 var10 = super.field1918[0] = this.field615.method1623(false, super.field1885, arg1, super.field1876, super.field1875, super.field1845, super.field1883, super.field1835, super.field1893, var7, var6, arg0);
        if (var10 == null) {
            return false;
        } else {
            super.field1896 = var10.method57();
            this.method907(var10, 0);
            int var11 = super.field1870.method1032(-114);
            super.field1850 = 0;
            super.field1836 = 0;
            super.field1838 = 0;
            if (~var8 == -1 && ~var9 == -1) {
                this.method917(this.method903(-90) << 7, var11, this.method903(-53) << 7, -124);
            } else {
                this.method917(var9, var11, var8, -13);
                if (~super.field1836 != -1) {
                    super.field1918[0].method42(super.field1836);
                }
                if (~super.field1838 != -1) {
                    super.field1918[0].method18(super.field1838);
                }
                if (super.field1850 != 0) {
                    super.field1918[0].method51(0, super.field1850, 0);
                }
            }
            super.field1918[1] = null;
            if (~super.field1873 != 0 && ~super.field1879 != 0) {
                class379 var12 = class115.method839((byte) -57, super.field1873);
                class348 var13 = var12.method2415(super.field1867, super.field1879, var4 | (!var12.field5728 ? 2 : 7), -97, arg1, super.field1866);
                if (var13 != null) {
                    var13.method51(0, -super.field1826, 0);
                    if (var12.field5728 && (var8 != 0 || ~var9 != -1)) {
                        if (~super.field1836 != -1) {
                            var13.method42(super.field1836);
                        }
                        if (super.field1838 != 0) {
                            var13.method18(super.field1838);
                        }
                        if (super.field1850 != 0) {
                            var13.method51(0, super.field1850, 0);
                        }
                    }
                    super.field1918[1] = var13;
                }
            }
            super.field1918[arg2] = null;
            if (super.field1904 != null) {
                if (~super.field1900 >= ~class183.field2987) {
                    super.field1904 = null;
                }
                if (class183.field2987 >= super.field1908 && ~super.field1900 < ~class183.field2987) {
                    class348 var14 = super.field1904.method200(arg1, 7 | var4, (byte) -52);
                    if (var14 != null) {
                        var14.method51(super.field1902 - super.field724, super.field1901 - super.field721, super.field1910 - super.field722);
                        if (var11 != 0) {
                            var14.method41(var11);
                        }
                        super.field1918[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "(I)V", line = 149)
    public static final void method312(int arg0) {
        ++class406.field6032;
        ++field596;
        class11.field139.method2224(arg0, (byte) 0);
        class11.field139.method1312(0, arg0 + -135);
    }

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "(I)Z", line = 159)
    private final boolean method313(int arg0) {
        if (arg0 != 21050) {
            return false;
        } else {
            ++field602;
            return this.field615.field3762;
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)I", line = 171)
    public final int method314(int arg0) {
        if (arg0 != 27647) {
            field617 = 66;
        }
        ++field612;
        return super.field1896;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILe;IIZLhm;I)V", line = 185)
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        if (arg3 != 0) {
            field620 = -105;
        }
        ++field605;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Z", line = 198)
    public final boolean method186(int arg0) {
        ++field607;
        if (arg0 != 0) {
            field620 = 66;
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "(I)V", line = 213)
    public static void method315(int arg0) {
        field618 = null;
        field622 = null;
        if (arg0 <= -85) {
            field603 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ltb;I)V", line = 232)
    public final void method316(class226 arg0, int arg1) {
        this.field615 = arg0;
        ++field597;
        if (arg1 != 0) {
            this.method188(87, -51, -17, (class312) null);
        }
        if (super.field1907 != null) {
            super.field1907.method491();
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 249)
    public final void method193(int arg0) {
        ++field613;
        if (arg0 != 0) {
            this.method193(30);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I", line = 260)
    public final int method317(int arg0) {
        ++field608;
        if (this.field615.field3771 != null) {
            class226 var2 = this.field615.method1619(-71);
            if (var2 != null && var2.field3788 != -1) {
                return var2.field3788;
            }
        }
        if (arg0 != 20155) {
            return -43;
        } else {
            return ~this.field615.field3788 != 0 ? this.field615.field3788 : super.method317(20155);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 285)
    public static final void method318(Component arg0, boolean arg1) {
        ++field595;
        arg0.removeMouseListener(class433.field6389);
        arg0.removeMouseMotionListener(class433.field6389);
        arg0.removeFocusListener(class433.field6389);
        if (!arg1) {
            method310((class447) null, 55, (class447) null);
        }
        class394.field5912 = 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILe;)Z", line = 299)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field599;
        if (this.field615 != null && this.method311(65536, arg3, 2)) {
            if (arg1 != 65536) {
                field622 = null;
            }
            class435 var5 = arg3.method713();
            int var6 = super.field1870.method1032(arg1 + -65655);
            var5.method1991(var6);
            var5.method1995(super.field724, super.field721, super.field722);
            for (int var7 = 0; super.field1918.length > var7; ++var7) {
                if (super.field1918[var7] != null && super.field1918[var7].method39(arg0, arg2, var5, this.field615.field3779 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIII)V", line = 331)
    public static final void method319(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field610;
        if (arg3 != 10371) {
            field617 = 34;
        }
        class232.field3870 = 0L;
        int var5 = class199.method1386((byte) 91);
        if (arg2 == 3 || ~var5 == -4) {
            arg0 = true;
        }
        if (!class284.field4547.method621()) {
            arg0 = true;
        }
        class232.method1647(arg0, 2, arg4, arg1, arg2, var5);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)Z", line = 352)
    public final boolean method320(boolean arg0) {
        ++field616;
        if (arg0) {
            method310((class447) null, -118, (class447) null);
        }
        return this.field615 != null;
    }

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "(I)Lok;", line = 369)
    public static final class137 method321(int arg0) {
        ++field600;
        try {
            return arg0 != 0 ? null : (class137) Class.forName("ga").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Le;Z)Lum;", line = 386)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field609;
        if (this.field615 != null && this.method311(1024, arg0, 2)) {
            class435 var3 = arg0.method713();
            int var4 = super.field1870.method1032(-88);
            var3.method1991(var4);
            var3.method1995(super.field724, super.field721, super.field722);
            class349 var5 = this.method912(-5);
            class226 var6 = this.field615.field3771 != null ? this.field615.method1619(-24) : this.field615;
            if (class183.field2984 && var6.field3750 && var5.field5399) {
                class417 var7 = ~super.field1878 != 0 && super.field1880 == 0 ? class156.method1099(super.field1878, 99) : null;
                class417 var8 = super.field1851 == -1 || super.field1831 && var7 != null ? null : class156.method1099(super.field1851, 85);
                class348 var9 = class144.method1047(super.field1918[0], this.field615.field3779, arg0, super.field1838, super.field1850, super.field1836, 255 & this.field615.field3811, var8 == null ? var7 : var8, this.field615.field3806 & 255, super.field1869, this.field615.field3747 & 65535, 65535 & this.field615.field3793, var8 == null ? super.field1845 : super.field1875, var4, (byte) 1);
                if (var9 != null) {
                    float var10 = arg0.method583();
                    float var11 = arg0.method629();
                    arg0.method571(false);
                    arg0.method619(var10, var11 + -150.0F);
                    var9.method26(var3, (class170) null, 0);
                    arg0.method619(var10, var11);
                    arg0.method571(true);
                }
            }
            if (!arg1) {
                this.method196((class312) null, (byte) -43);
            }
            class306 var12 = null;
            if (this.method313(21050)) {
                var12 = class203.method1443(-53, super.field1918.length);
            }
            if (super.field1907 == null) {
                arg0.method668(super.field1918, var3, var12 != null ? var12.field4856 : null, 0);
            } else {
                class198 var13 = super.field1907.method489();
                arg0.method687(super.field1918, var13, var3, var12 != null ? var12.field4856 : null, 0);
            }
            this.method905((byte) -94, super.field1918, false, arg0);
            if (super.field1918[2] != null) {
                if (~var4 != -1) {
                    super.field1918[2].method41(var4);
                }
                super.field1918[2].method51(-super.field1902 + super.field724, -super.field1901 + super.field721, -super.field1910 + super.field722);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Le;B)V", line = 462)
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 >= -66) {
            method318((Component) null, true);
        }
        ++field598;
        if (this.field615 != null) {
            if (super.field1914 || this.method311(0, arg0, 2)) {
                this.method905((byte) -94, super.field1918, super.field1914, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)I", line = 484)
    public final int method322(int arg0) {
        ++field614;
        if (this.field615.field3771 != null) {
            class226 var2 = this.field615.method1619(-120);
            if (var2 != null && var2.field3775 != -1) {
                return var2.field3775;
            }
        }
        if (arg0 != -26228) {
            this.method188(70, 28, -1, (class312) null);
        }
        return this.field615.field3775;
    }
}
