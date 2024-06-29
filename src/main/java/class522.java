import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class522 extends class597 implements class310 {

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Z")
    private boolean field6587;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Z")
    private boolean field6589;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "B")
    private byte field6608;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "S")
    private short field6603;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "B")
    private byte field6606;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Z")
    private boolean field6596;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "B")
    private byte field6579;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Z")
    private boolean field6576;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Lba;")
    public class359 field6586;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "Lw;")
    private class279 field6610;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field6581 = -1;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Luc;")
    public static class27 field6598 = new class27(6, 17);

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lqt;")
    private class595 field6577;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Ljava/lang/Object;")
    public static Object field6605;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I", line = 3)
    public final int method139(byte arg0) {
        if (arg0 < 13) {
            method2819(false);
        }
        ++field6585;
        return this.field6608;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 15)
    public final void method132(int arg0) {
        if (this.field6586 != null) {
            this.field6586.method2090();
        }
        if (arg0 != -13968) {
            this.method138(80);
        }
        ++field6592;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z", line = 28)
    public final boolean method137(int arg0) {
        ++field6599;
        if (arg0 > -30) {
            field6611 = 68;
        }
        return this.field6589;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Loa;I)Lqt;", line = 40)
    public final class595 method6(class650 arg0, int arg1) {
        if (this.field6577 == null) {
            this.field6577 = class280.method1688(this.method2824(arg0, -2055, 0), super.field8011, arg1 + 7458, super.field8013, super.field8018);
        }
        ++field6595;
        if (arg1 != -7459) {
            field6605 = null;
        }
        return this.field6577;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLoa;Lnt;IIII)V", line = 56)
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 == 12137) {
            ++field6594;
            if (arg2 instanceof class569) {
                class569 var8 = (class569) arg2;
                if (this.field6586 != null && var8.field7177 != null) {
                    this.field6586.method2057(var8.field7177, arg5, arg3, arg4, arg0);
                }
            } else {
                if (arg2 instanceof class522) {
                    class522 var9 = (class522) arg2;
                    if (this.field6586 != null && var9.field6586 != null) {
                        this.field6586.method2057(var9.field6586, arg5, arg3, arg4, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z", line = 86)
    public final boolean method133(boolean arg0) {
        ++field6584;
        if (arg0) {
            this.field6579 = -88;
        }
        return this.field6576;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)[Llh;", line = 98)
    public static final class492[] method2819(boolean arg0) {
        ++field6591;
        if (!arg0) {
            method2819(true);
        }
        return new class492[] { class255.field3277, class50.field645, class16.field152, class295.field3761, class235.field3043, class404.field5217 };
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Loa;B)V", line = 109)
    public final void method130(class650 arg0, byte arg1) {
        if (arg1 > -27) {
            method2819(true);
        }
        ++field6582;
        Object var3 = null;
        class279 var5;
        if (this.field6610 == null && this.field6576) {
            class180 var4 = this.method2821(262144, arg0, 3, true);
            var5 = var4 != null ? var4.field2118 : null;
        } else {
            var5 = this.field6610;
            this.field6610 = null;
        }
        if (var5 != null) {
            class157.method961(var5, this.field6579, super.field8018, super.field8011, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I", line = 137)
    public final int method2820(int arg0) {
        if (arg0 != 4) {
            return 127;
        } else {
            ++field6597;
            return this.field6586 != null ? this.field6586.method2071() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Loa;BI)Lba;", line = 151)
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        ++field6588;
        if (arg1 <= 80) {
            this.field6586 = null;
        }
        return this.method2824(arg0, -2055, arg2);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I", line = 164)
    public final int method131(byte arg0) {
        ++field6604;
        return arg0 != -97 ? -51 : this.field6603 & 65535;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Loa;B)V", line = 177)
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 == 98) {
            ++field6607;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 187)
    public final void method140(byte arg0) {
        this.field6589 = false;
        ++field6609;
        if (this.field6586 != null) {
            this.field6586.method2069(this.field6586.method2075() & -65537);
        }
        int var2 = -97 / ((arg0 - -16) / 40);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I", line = 217)
    public final int method138(int arg0) {
        if (arg0 != 8470) {
            field6581 = 105;
        }
        ++field6590;
        return this.field6606;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Loa;Lpg;IIIIIZIIIIIIZ)V", line = 228)
    public class522(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field9449 == 1, class650.method3624(true, arg13, arg12));
        this.field6587 = ~arg1.field9382 != -1 && !arg7;
        this.field6589 = arg14;
        this.field6608 = (byte) arg13;
        this.field6603 = (short) arg1.field9408;
        this.field6606 = (byte) arg12;
        this.field6596 = arg7;
        this.field6579 = (byte) arg3;
        this.field6576 = arg0.method465() && arg1.field9433 && !this.field6596 && ~class611.field8310.method3598(-15929, class628.field8526) != -1;
        int var16 = 2048;
        if (this.field6589) {
            var16 |= 65536;
        }
        class180 var17 = this.method2821(var16, arg0, 3, this.field6576);
        if (var17 != null) {
            this.field6586 = var17.field2119;
            this.field6610 = var17.field2118;
            if (this.field6589) {
                this.field6586 = this.field6586.method951((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILoa;IZ)Lm;", line = 262)
    private final class180 method2821(int arg0, class650 arg1, int arg2, boolean arg3) {
        ++field6578;
        class687 var5 = class232.field3017.method2358(0, this.field6603 & 65535);
        class140 var6;
        class140 var7;
        if (this.field6596) {
            var6 = class286.field3633[this.field6579];
            var7 = class252.field3250[0];
        } else {
            var6 = class252.field3250[this.field6579];
            if (this.field6579 < 3) {
                var7 = class252.field3250[this.field6579 + 1];
            } else {
                var7 = null;
            }
        }
        return arg2 != 3 ? null : var5.method3786(var7, super.field8011, this.field6606 != 11 ? this.field6608 : 4 - -this.field6608, true, super.field8018, arg0, var6, super.field8013, this.field6606 == 11 ? 10 : this.field6606, arg3, arg1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILoa;I)Z", line = 294)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field6600;
        int var5 = -92 % ((77 - arg0) / 40);
        class359 var6 = this.method2824(arg2, -2055, 131072);
        if (var6 != null) {
            class396 var7 = arg2.method470();
            var7.method591(super.field8018, super.field8013, super.field8011);
            return var6.method2074(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lrr;III)V", line = 314)
    public static final void method2822(class337 arg0, int arg1, int arg2, int arg3) {
        ++field6583;
        if (class338.field4324 == null && !class367.field4752) {
            if (arg0 != null && class67.method524(arg0, 4) != null) {
                class338.field4324 = arg0;
                class85.field1089 = class67.method524(arg0, 4);
                class250.field3230 = arg3;
                class52.field661 = 0;
                if (arg2 != 65535) {
                    method2819(false);
                }
                class373.field4821 = false;
                class410.field5265 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Loa;I)V", line = 337)
    public final void method136(class650 arg0, int arg1) {
        ++field6601;
        Object var3 = null;
        class279 var5;
        if (this.field6610 == null && this.field6576) {
            class180 var4 = this.method2821(262144, arg0, 3, true);
            var5 = var4 != null ? var4.field2118 : null;
        } else {
            var5 = this.field6610;
            this.field6610 = null;
        }
        if (var5 != null) {
            class350.method2017(var5, this.field6579, super.field8018, super.field8011, (boolean[]) null);
        }
        int var6 = 89 / ((arg1 - -78) / 37);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V", line = 364)
    public static void method2823(byte arg0) {
        int var1 = 11 / ((-38 - arg0) / 41);
        field6598 = null;
        field6605 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILoa;)Lww;", line = 377)
    public final class686 method11(int arg0, class650 arg1) {
        ++field6580;
        if (this.field6586 == null) {
            return null;
        } else {
            class396 var3 = arg1.method470();
            if (arg0 > -89) {
                this.field6577 = null;
            }
            var3.method591(super.field8018, super.field8013, super.field8011);
            class686 var4 = null;
            if (this.field6587) {
                var4 = class458.method2520(0, 1);
            }
            this.field6586.method2049(var3, var4 != null ? var4.field9361[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Loa;II)Lba;", line = 406)
    private final class359 method2824(class650 arg0, int arg1, int arg2) {
        ++field6593;
        if (this.field6586 != null && ~arg0.method493(this.field6586.method2075(), arg2) == -1) {
            return this.field6586;
        } else {
            if (arg1 != -2055) {
                field6598 = null;
            }
            class180 var4 = this.method2821(arg2, arg0, arg1 + 2058, false);
            return var4 == null ? null : var4.field2119;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)I", line = 432)
    public final int method2117(int arg0) {
        ++field6602;
        if (arg0 != 9295) {
            field6605 = null;
        }
        return this.field6586 != null ? this.field6586.method2084() : 0;
    }
}
