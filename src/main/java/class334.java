import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class334 extends class134 implements class55 {

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "Z")
    private boolean field4558;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "S")
    private short field4534;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
    private boolean field4533;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "B")
    private byte field4539;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "B")
    private byte field4537;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "B")
    private byte field4557;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Z")
    private boolean field4540;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Z")
    private boolean field4536;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Lj;")
    private class378 field4538;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Lc;")
    public class121 field4550;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method360(int arg0) {
        if (arg0 < 34) {
            return false;
        } else {
            ++field4551;
            return this.field4536;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z", line = 16)
    public final boolean method399(boolean arg0) {
        ++field4548;
        if (arg0) {
            this.method398(-36);
        }
        return this.field4540;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)Ljava/lang/String;", line = 28)
    public static final String method1851(int[] arg0, int arg1) {
        ++field4555;
        StringBuffer var2 = new StringBuffer();
        int var3 = class478.field6989;
        for (int var4 = arg1; ~var4 > ~arg0.length; ++var4) {
            class41 var5 = class169.field2401.method2163(arg0[var4], (byte) 49);
            if (var5.field569 != -1) {
                class529 var6 = (class529) class140.field1992.method56((long) var5.field569, 110);
                if (var6 == null) {
                    class531 var7 = class531.method3134(class192.field2735, var5.field569, 0);
                    if (var7 != null) {
                        var6 = class418.field6109.method482(var7, true);
                        class140.field1992.method73((long) var5.field569, var6, 26425);
                    }
                }
                if (var6 != null) {
                    class272.field3713[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqa;ZII)Ltt;", line = 76)
    private final class60 method1852(class162 arg0, boolean arg1, int arg2, int arg3) {
        ++field4553;
        class132 var5 = class82.field1154.method2121(this.field4534 & 65535, true);
        if (arg3 != 26960) {
            return null;
        } else {
            class35 var6;
            class35 var7;
            if (this.field4558) {
                var6 = class19.field195[0];
                var7 = class364.field5058[this.field4537];
            } else {
                if (this.field4537 < 3) {
                    var6 = class19.field195[this.field4537 + 1];
                } else {
                    var6 = null;
                }
                var7 = class19.field195[this.field4537];
            }
            return var5.method860(super.field1937, var7, super.field1939, this.field4557, arg0, this.field4539, 7, arg1, super.field1936, var6, arg2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILqa;)V", line = 108)
    public final void method357(int arg0, class162 arg1) {
        if (arg0 > 41) {
            ++field4546;
            Object var3 = null;
            class378 var5;
            if (this.field4538 == null && this.field4536) {
                class60 var4 = this.method1852(arg1, true, 262144, 26960);
                var5 = var4 == null ? null : var4.field801;
            } else {
                var5 = this.field4538;
                this.field4538 = null;
            }
            if (var5 != null) {
                class114.method731(var5, this.field4537, super.field1937, super.field1936, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lqa;Lpk;IIIIZIIZ)V", line = 137)
    public class334(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class285.method1633((byte) 7, arg8, arg7));
        this.field4558 = arg6;
        this.field4534 = (short) arg1.field1866;
        super.field1936 = arg5;
        this.field4533 = arg1.field1850 != 0 && !arg6;
        super.field1937 = arg3;
        this.field4539 = (byte) arg8;
        this.field4537 = (byte) arg2;
        this.field4557 = (byte) arg7;
        this.field4540 = arg9;
        this.field4536 = arg0.method485() && arg1.field1891 && !this.field4558 && class437.field6374.method1765(class278.field3761, (byte) -101) != 0;
        int var11 = 2048;
        if (this.field4540) {
            var11 |= 65536;
        }
        class60 var12 = this.method1852(arg0, this.field4536, var11, 26960);
        if (var12 != null) {
            this.field4538 = var12.field801;
            this.field4550 = var12.field803;
            if (this.field4540) {
                this.field4550 = this.field4550.method761((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I", line = 172)
    public final int method355(int arg0) {
        ++field4542;
        return arg0 != 13599 ? -3 : this.field4557;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(ILqa;)V", line = 185)
    public final void method400(int arg0, class162 arg1) {
        ++field4552;
        int var3 = -122 % ((-29 - arg0) / 33);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqa;III)Z", line = 194)
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        ++field4544;
        class121 var5 = this.method1853(arg0, (byte) -97, 131072);
        if (var5 != null) {
            class415 var6 = arg0.method539();
            var6.method340(super.field1937, super.field1939, super.field1936);
            return var5.method777(arg1, arg3, var6, false);
        } else {
            if (arg2 != 24130) {
                this.field4540 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 219)
    public final void method361(int arg0) {
        int var2 = -94 / ((-36 - arg0) / 36);
        if (this.field4550 != null) {
            this.field4550.method796();
        }
        ++field4554;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILqa;)Lc;", line = 231)
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 != 4586) {
            return null;
        } else {
            ++field4547;
            return this.method1853(arg2, (byte) -97, arg1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 244)
    public final void method398(int arg0) {
        if (arg0 <= 74) {
            this.field4557 = -106;
        }
        ++field4545;
        this.field4540 = false;
        if (this.field4550 != null) {
            this.field4550.method787(-65537 & this.field4550.method775());
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqa;I)Lip;", line = 264)
    public final class498 method402(class162 arg0, int arg1) {
        ++field4556;
        if (this.field4550 == null) {
            return null;
        } else {
            class415 var3 = arg0.method539();
            if (arg1 != 16562) {
                this.field4550 = null;
            }
            var3.method340(super.field1937, super.field1939, super.field1936);
            class498 var4 = null;
            if (this.field4533) {
                var4 = class227.method1338(0, 1);
            }
            this.field4550.method781(var3, var4 == null ? null : var4.field7332[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)I", line = 291)
    public final int method359(byte arg0) {
        if (arg0 != -8) {
            this.method359((byte) 23);
        }
        ++field4559;
        return this.field4539;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILco;ILqa;ZZ)V", line = 303)
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (!arg6) {
            this.method358(61, -65, (class162) null);
        }
        ++field4535;
        if (!(arg2 instanceof class334)) {
            if (arg2 instanceof class266) {
                class266 var8 = (class266) arg2;
                if (this.field4550 != null && var8.field3649 != null) {
                    this.field4550.method800(var8.field3649, arg3, arg1, arg0, arg5);
                    return;
                }
            }
        } else {
            class334 var9 = (class334) arg2;
            if (this.field4550 == null || var9.field4550 == null) {
                return;
            }
            this.field4550.method800(var9.field4550, arg3, arg1, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqa;BI)Lc;", line = 334)
    private final class121 method1853(class162 arg0, byte arg1, int arg2) {
        ++field4543;
        if (this.field4550 != null && arg0.method472(this.field4550.method775(), arg2) == 0) {
            return this.field4550;
        } else {
            if (arg1 != -97) {
                this.field4537 = 117;
            }
            class60 var4 = this.method1852(arg0, false, arg2, 26960);
            return var4 == null ? null : var4.field803;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILqa;)V", line = 355)
    public final void method356(int arg0, class162 arg1) {
        ++field4541;
        Object var3 = null;
        class378 var5;
        if (this.field4538 == null && this.field4536) {
            class60 var4 = this.method1852(arg1, true, 262144, 26960);
            var5 = var4 != null ? var4.field801 : null;
        } else {
            var5 = this.field4538;
            this.field4538 = null;
        }
        if (arg0 < 100) {
            this.method359((byte) 73);
        }
        if (var5 != null) {
            class174.method1075(var5, this.field4537, super.field1937, super.field1936, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I", line = 387)
    public final int method354(byte arg0) {
        ++field4549;
        int var2 = 123 % ((61 - arg0) / 53);
        return 65535 & this.field4534;
    }
}
