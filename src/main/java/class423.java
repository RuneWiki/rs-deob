import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class423 extends class33 {

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    private int field6159 = 0;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    private int field6169 = 0;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    private int field6166 = 0;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    private int field6173 = -32768;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    private int field6163 = -1;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "Z")
    public boolean field6184 = false;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    private int field6179;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    private int field6174;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public int field6181;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Lqp;")
    private class467 field6164;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "[I")
    public static int[] field6171 = new int[5];

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "[I")
    public static int[] field6172 = new int[13];

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "Luf;")
    public static class310 field6182 = new class310(69, 8);

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lvc;")
    private class206 field6160;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method2524(byte arg0) {
        ++field6180;
        if (this.field6160 != null) {
            this.field6160.method1248();
        }
        int var2 = -115 / ((arg0 - 47) / 50);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field6183;
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)I")
    public final int method215(int arg0) {
        ++field6170;
        if (arg0 != 0) {
            this.method398(53);
        }
        return this.field6173;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field6178;
        if (arg0 < 74) {
            field6171 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method2525(byte arg0) {
        if (arg0 <= -9) {
            field6171 = null;
            field6172 = null;
            field6182 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6166 = arg12;
        this.field6179 = arg0;
        this.field6174 = arg4;
        this.field6181 = arg2 - -arg1;
        class119 var14 = class492.field7279.method2231(this.field6179, 64);
        int var15 = var14.field1616;
        if (var15 == -1) {
            this.field6184 = true;
        } else {
            this.field6164 = class275.field3740.method1484(0, var15);
            this.field6184 = false;
        }
        if (~this.field6181 == ~arg2) {
            class284.method1624(super.field461, false, super.field466, this.field6164, this.field6169, 123, super.field464);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public final void method2526(int arg0, int arg1) {
        ++field6168;
        if (arg0 >= 20) {
            if (!this.field6184) {
                this.field6159 += arg1;
                while (this.field6164.field6829[this.field6169] < this.field6159) {
                    this.field6159 -= this.field6164.field6829[this.field6169];
                    ++this.field6169;
                    if (~this.field6164.field6806.length >= ~this.field6169) {
                        this.field6184 = true;
                        break;
                    }
                }
                if (!this.field6184) {
                    class284.method1624(super.field461, false, super.field466, this.field6164, this.field6169, -95, super.field464);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 24130) {
            return true;
        } else {
            ++field6175;
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lqa;III)Lc;")
    private final class121 method2527(class162 arg0, int arg1, int arg2, int arg3) {
        ++field6185;
        if (arg1 < 113) {
            this.method402((class162) null, -25);
        }
        class119 var5 = class492.field7279.method2231(arg3, 64);
        class35 var6 = class19.field195[super.field464];
        class35 var7 = ~this.field6174 > -4 ? class19.field195[this.field6174 + 1] : null;
        return !this.field6184 ? var5.method751(this.field6163, arg0, var6, (byte) -100, true, var7, arg2, this.field6169, super.field461, this.field6159, class275.field3740, super.field457, super.field466) : var5.method751(-1, arg0, var6, (byte) -118, true, var7, arg2, -1, super.field461, 0, class275.field3740, super.field457, super.field466);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLc;Lqa;)V")
    private final void method2528(boolean arg0, class121 arg1, class162 arg2) {
        ++field6177;
        class304[] var4 = arg1.method770();
        class456[] var5 = arg1.method789();
        if ((this.field6160 == null || this.field6160.field2913) && (var4 != null || var5 != null)) {
            this.field6160 = new class206(class393.field5484);
        }
        if (arg0) {
            if (this.field6160 != null) {
                this.field6160.method1249(arg2, (long) class393.field5484, var4, var5, false);
                this.field6160.method1255(super.field464, super.field463, super.field456, super.field468, super.field471);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        ++field6176;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6160 != null) {
            this.field6160.method1248();
        }
        ++field6161;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field6162;
        class121 var3 = this.method2527(arg0, arg1 + -16437, (this.field6166 == 0 ? 0 : 5) | 2048, this.field6179);
        if (var3 == null) {
            return null;
        } else {
            if (this.field6166 != 0) {
                var3.method798(this.field6166 * 2048);
            }
            if (arg1 != 16562) {
                this.finalize();
            }
            class415 var4 = arg0.method539();
            var4.method340(super.field466, super.field457, super.field461);
            if (this.field6160 != null) {
                class148 var5 = this.field6160.method1260();
                arg0.method512(var3, var5, var4, (class525) null, 0);
            } else {
                var3.method781(var4, (class525) null, 0);
            }
            this.field6173 = var3.method771();
            this.method2528(true, var3, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = -81 % ((arg0 - -29) / 33);
        ++field6167;
        class121 var4 = this.method2527(arg1, 127, 0, this.field6179);
        if (var4 != null) {
            this.method2528(true, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2529(int arg0, String arg1, int arg2, String arg3) {
        class24.field384 = arg1;
        class247.field3445 = arg3;
        class140.field1995 = arg0;
        ++field6165;
        if (!class247.field3445.equals("") && !class24.field384.equals("")) {
            if (~class223.field3140 != 0) {
                class339.method1883((byte) -59);
            } else {
                class320.field4424 = arg2;
                class420.field6144 = 0;
                class190.field2644 = 1;
                class238.field3276 = 0;
                class365 var4 = new class365(128);
                var4.method2084(10, false);
                var4.method2074(false, (int) (Math.random() * 9.9999999E7D));
                var4.method2076(class162.method998((byte) 109, class247.field3445), (byte) -103);
                var4.method2074(false, (int) (Math.random() * 9.9999999E7D));
                var4.method2073(-114, class24.field384);
                var4.method2074(false, (int) (Math.random() * 9.9999999E7D));
                var4.method2110(false, class433.field6307, class54.field748);
                class244.field3395.field5069 = 0;
                class244.field3395.method2084(class255.field3548.field3043, false);
                class244.field3395.method2084(var4.field5069 + 2, false);
                class244.field3395.method2070(81954016, 586);
                class244.field3395.method2079(var4.field5069, var4.field5073, arg2 + 123, 0);
            }
        } else {
            class320.field4424 = 3;
        }
    }
}
