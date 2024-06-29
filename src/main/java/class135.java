import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class135 extends class332 implements class83 {

    @OriginalMember(owner = "client!taa", name = "V", descriptor = "Z")
    private boolean field1970 = false;

    @OriginalMember(owner = "client!taa", name = "J", descriptor = "Lnq;")
    public class155 field1958;

    @OriginalMember(owner = "client!taa", name = "Q", descriptor = "Z")
    private boolean field1965;

    @OriginalMember(owner = "client!taa", name = "E", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!taa", name = "I", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!taa", name = "L", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!taa", name = "M", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!taa", name = "N", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!taa", name = "O", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!taa", name = "P", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!taa", name = "R", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!taa", name = "S", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!taa", name = "T", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!taa", name = "U", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!taa", name = "W", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!taa", name = "X", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!taa", name = "Z", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!taa", name = "ab", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!taa", name = "bb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!taa", name = "cb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!taa", name = "Y", descriptor = "Lifa;")
    private class62 field1973;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lr;Z)V")
    public final void method265(class98 arg0, boolean arg1) {
        this.field1958.method1109(0, arg0);
        if (arg1) {
            ++field1966;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)I")
    public final int method277(byte arg0) {
        ++field1961;
        if (arg0 != 95) {
            this.field1970 = false;
        }
        return this.field1958.field2220;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        ++field1957;
        return arg0 != -5273 ? -40 : this.field1958.field2207;
    }

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "(B)V")
    public static final void method960(byte arg0) {
        class2.field15.method2468(-1044219647, 5);
        ++field1962;
        class547.field8069.method2785(32, 5);
        class177.field2477.method3575(5, (byte) -71);
        class60.field965.method2600((byte) -43, 5);
        if (arg0 == 30) {
            class563.field8235.method1092(0, 5);
            class259.field3355.method2387(-11, 5);
            class203.field2769.method2968(100, 5);
            class134.field1945.method3081(5, (byte) -16);
            class449.field6504.method1961(-8, 5);
            class683.field9635.method1379(true, 5);
            class547.field8070.method410(114, 5);
            class189.field2572.method2758(5, arg0 + 83);
            class652.field9331.method232(5, (byte) 125);
            class141.field2041.method1505(5, arg0 + 96);
            class586.field8507.method1451(17, 5);
            class251.field3294.method376(16023, 5);
            class274.field3588.method183(5, -23980);
            class342.field5068.method2764(arg0 ^ 1, 5);
            class252.field3301.method744((byte) 78, 5);
            class503.field7119.method66(76, 5);
            class103.method737(10, 5);
            class497.method2836(arg0 + 17739, 50);
            class191.method1253(81, 50);
            class479.method2745(5, -24817);
            class151.method1075(5, true);
            class86.field1341.method3900(5, arg0 + -30);
            class218.field2908.method3900(5, arg0 + -30);
            class630.field9122.method3900(5, arg0 ^ 30);
            class693.field9788.method3900(5, 0);
            class195.field2634.method3900(5, 0);
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIII)V")
    public class135(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class492.method2816(false, arg8, arg9));
        this.field1958 = new class155(arg0, arg1, arg8, arg9, super.field7905, arg3, this, arg7, arg10);
        this.field1965 = ~arg1.field4250 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(B)V")
    public final void method315(byte arg0) {
        ++field1968;
        if (arg0 <= 101) {
            this.method309(false);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)I")
    public final int method263(byte arg0) {
        ++field1976;
        if (arg0 < 10) {
            method960((byte) -43);
        }
        return this.field1958.field2224;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLr;)V")
    public final void method273(byte arg0, class98 arg1) {
        ++field1959;
        this.field1958.method1100(false, arg1);
        int var3 = 12 / ((arg0 - 2) / 56);
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(Lr;I)Lifa;")
    public final class62 method268(class98 arg0, int arg1) {
        if (arg1 != 0) {
            this.method272((class98) null, -68);
        }
        ++field1974;
        return this.field1973;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
    public static final void method961(boolean arg0, int arg1) {
        ++field1967;
        if (class199.field2714 == null) {
            class340.method2106(false);
        }
        if (arg0) {
            class199.field2714.method3311(false);
        }
        if (arg1 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 >= 24) {
            ++field1956;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(Z)I")
    public final int method271(boolean arg0) {
        if (arg0) {
            return 120;
        } else {
            ++field1954;
            return this.field1958.method1102(-26609);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lr;I)Lhr;")
    public final class218 method272(class98 arg0, int arg1) {
        ++field1963;
        class395 var3 = this.field1958.method1110((byte) -104, true, arg0, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = arg0.method682();
            var4.method883(super.field7895, super.field7894, super.field7896);
            class218 var5 = null;
            if (arg1 != -1) {
                return null;
            } else {
                if (this.field1965) {
                    var5 = class187.method1237(1, (byte) 56);
                }
                int var6 = super.field7895 >> 9;
                int var7 = super.field7896 >> 9;
                this.field1958.method1107(var7, -29008, var6, var6, arg0, var7, var4, true, var3);
                if (class384.field5767) {
                    var3.method1030(var4, var5 != null ? var5.field2902[0] : null, class515.field7222, 0);
                } else {
                    var3.method1054(var4, var5 == null ? null : var5.field2902[0], 0);
                }
                if (this.field1958.field2202 != null) {
                    class620 var8 = this.field1958.field2202.method112();
                    if (!class384.field5767) {
                        arg0.method679(var8);
                    } else {
                        arg0.method708(var8, class515.field7222);
                    }
                }
                this.field1970 = var3.method1024() || this.field1958.field2202 != null;
                if (this.field1973 == null) {
                    this.field1973 = class249.method1513(super.field7896, super.field7894, var3, 2, super.field7895);
                } else {
                    class340.method2112(true, this.field1973, super.field7895, super.field7894, super.field7896, var3);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            this.method263((byte) 51);
        }
        ++field1955;
        return this.field1958.method1105(-1);
    }

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "(I)I")
    public final int method258(int arg0) {
        ++field1975;
        return arg0 != -1 ? -13 : this.field1958.method1101((byte) 108);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZIILjava/lang/Object;)[B")
    public static final byte[] method962(boolean arg0, int arg1, int arg2, Object arg3) {
        ++field1971;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class555.method3229(arg1, arg0, var4, arg2);
        } else if (arg3 instanceof class299) {
            class299 var5 = (class299) arg3;
            return var5.method1864(arg2, arg1, -117);
        } else {
            if (arg0) {
                method961(false, 33);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        ++field1964;
        return arg0 >= -42 ? false : false;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(Lr;I)V")
    public final void method259(class98 arg0, int arg1) {
        ++field1972;
        class395 var3 = this.field1958.method1110((byte) -104, true, arg0, true, 262144);
        if (arg1 == 11771) {
            if (var3 != null) {
                int var4 = super.field7895 >> 9;
                int var5 = super.field7896 >> 9;
                class151 var6 = arg0.method682();
                var6.method883(super.field7895, super.field7894, super.field7896);
                this.field1958.method1107(var5, -29008, var4, var4, arg0, var5, var6, false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "(I)Z")
    public final boolean method274(int arg0) {
        ++field1969;
        return arg0 != -1510217528 ? false : this.field1970;
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(Z)Z")
    public final boolean method309(boolean arg0) {
        ++field1977;
        return !arg0;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public final void method276(int arg0) {
        if (arg0 < 63) {
            this.field1973 = null;
        }
        ++field1953;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIZLr;)Z")
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field1960;
        class395 var5 = this.field1958.method1110((byte) -104, arg2, arg3, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg3.method682();
            var6.method883(super.field7895, super.field7894, super.field7896);
            return !class384.field5767 ? var5.method1026(arg0, arg1, var6, false) : var5.method1022(arg0, arg1, var6, false, class515.field7222);
        }
    }
}
