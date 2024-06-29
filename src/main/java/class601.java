import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class601 extends class455 implements class141 {

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "Z")
    private boolean field8736;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "B")
    private byte field8745;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "B")
    private byte field8740;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "S")
    private short field8732;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "Z")
    private boolean field8730;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Z")
    private boolean field8737;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    private boolean field8724;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "Lr;")
    private class181 field8746;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Lka;")
    public class469 field8723;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "Ljw;")
    public static class551 field8731 = new class551(2, 2);

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!cf", name = "hb", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!cf", name = "ib", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!cf", name = "jb", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!cf", name = "kb", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!cf", name = "lb", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!cf", name = "mb", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!cf", name = "nb", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!cf", name = "ob", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!cf", name = "gb", descriptor = "Ltb;")
    private class397 field8747;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lha;Luw;IIIIIZIIZ)V")
    public class601(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class348.method2184(-3106, arg8, arg9));
        this.field8736 = arg1.field5737 != 0 && !arg7;
        super.field648 = arg6;
        this.field8745 = (byte) arg9;
        super.field644 = arg4;
        this.field8740 = (byte) arg8;
        this.field8732 = (short) arg1.field5711;
        this.field8730 = arg10;
        this.field8737 = arg7;
        this.field8724 = arg0.method550() && arg1.field5770 && !this.field8737 && ~class471.field6781.field6689.method56(27669) != -1;
        int var12 = 2048;
        if (this.field8730) {
            var12 |= 65536;
        }
        class244 var13 = this.method3496(-122, arg0, var12, this.field8724);
        if (var13 != null) {
            this.field8746 = var13.field3404;
            this.field8723 = var13.field3407;
            if (this.field8730) {
                this.field8723 = this.field8723.method325((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BLha;)Lvw;")
    public final class304 method396(byte arg0, class58 arg1) {
        ++field8733;
        if (arg0 <= 3) {
            field8731 = null;
        }
        if (this.field8723 == null) {
            return null;
        } else {
            class280 var3 = arg1.method530();
            var3.method157(super.field644, super.field651, super.field648);
            class304 var4 = class359.method2239(1, this.field8736, (byte) 121);
            if (!class339.field4781) {
                this.field8723.method329(var3, var4.field4298[0], 0);
            } else {
                this.field8723.method343(var3, var4.field4298[0], class220.field3129, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLha;)V")
    public final void method1110(byte arg0, class58 arg1) {
        ++field8743;
        Object var3 = null;
        if (arg0 < 9) {
            field8731 = null;
        }
        class181 var5;
        if (this.field8746 == null && this.field8724) {
            class244 var4 = this.method3496(-117, arg1, 262144, true);
            var5 = var4 != null ? var4.field3404 : null;
        } else {
            var5 = this.field8746;
            this.field8746 = null;
        }
        if (var5 != null) {
            class299.method1928(var5, super.field659, super.field644, super.field648, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)I")
    public final int method1112(byte arg0) {
        int var2 = -92 % ((-75 - arg0) / 34);
        ++field8735;
        return this.field8740;
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(B)Z")
    public final boolean method402(byte arg0) {
        ++field8751;
        return arg0 <= 28 ? true : this.field8730;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lha;Z)Ltb;")
    public final class397 method397(class58 arg0, boolean arg1) {
        ++field8739;
        if (arg1) {
            this.field8746 = null;
        }
        if (this.field8747 == null) {
            this.field8747 = class719.method4012(super.field644, super.field648, this.method3497(0, arg0, (byte) -124), super.field651, (byte) -108);
        }
        return this.field8747;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BILha;Lgs;ZII)V")
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        ++field8728;
        if (arg0 <= -5) {
            if (arg3 instanceof class601) {
                class601 var8 = (class601) arg3;
                if (this.field8723 != null && var8.field8723 != null) {
                    this.field8723.method345(var8.field8723, arg1, arg5, arg6, arg4);
                }
            } else {
                if (arg3 instanceof class485) {
                    class485 var9 = (class485) arg3;
                    if (this.field8723 != null && var9.field6876 != null) {
                        this.field8723.method345(var9.field6876, arg1, arg5, arg6, arg4);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(BLha;)V")
    public final void method401(byte arg0, class58 arg1) {
        if (arg0 != -39) {
            this.method395((byte) 95);
        }
        ++field8727;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lha;I)V")
    public final void method1108(class58 arg0, int arg1) {
        ++field8742;
        int var3 = -127 % ((44 - arg1) / 49);
        Object var4 = null;
        class181 var6;
        if (this.field8746 == null && this.field8724) {
            class244 var5 = this.method3496(-65, arg0, 262144, true);
            var6 = var5 == null ? null : var5.field3404;
        } else {
            var6 = this.field8746;
            this.field8746 = null;
        }
        if (var6 != null) {
            class489.method2942(var6, super.field659, super.field644, super.field648, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
    public final int method1109(byte arg0) {
        ++field8753;
        int var2 = 58 / ((-45 - arg0) / 39);
        return this.field8732 & 65535;
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)V")
    public static void method3493(int arg0) {
        field8731 = null;
        if (arg0 != -25010) {
            field8731 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILdm;II)V")
    public static final void method3494(int arg0, class50 arg1, int arg2, int arg3) {
        if (arg3 != -29635) {
            method3495(82, (byte) -83);
        }
        ++field8754;
        class484 var4 = arg1.method445((byte) -76, class359.field5046);
        if (var4 != null) {
            class359.field5046.method584(arg2, arg0, arg1.field783 + arg2, arg1.field830 + arg0);
            if (~class255.field3697 <= -4) {
                class359.field5046.method523(-16777216, var4, arg2, arg0);
            } else {
                class236.field3340.method4133((float) arg1.field783 / 2.0F + (float) arg2, (float) arg1.field830 / 2.0F + (float) arg0, 4096, ((int) (-class321.field4568) & 16383) << 2, var4, arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)I")
    public final int method404(int arg0) {
        if (arg0 != 65535) {
            this.field8737 = true;
        }
        ++field8726;
        return this.field8723 == null ? 0 : this.field8723.method338();
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field8748;
        if (arg0 != -83) {
            this.method401((byte) 126, (class58) null);
        }
        return this.field8723 != null ? this.field8723.method324() : 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
    public final boolean method1113(int arg0) {
        if (arg0 != -24333) {
            this.method404(-113);
        }
        ++field8725;
        return this.field8724;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
    public static final void method3495(int arg0, byte arg1) {
        ++field8750;
        class354 var2 = class501.method3012(arg0, 10, 2145997216);
        if (arg1 < 6) {
            field8731 = null;
        }
        var2.method2216(0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lha;IZI)Z")
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field8738;
        if (!arg2) {
            return false;
        } else {
            class469 var5 = this.method3497(131072, arg0, (byte) -8);
            if (var5 != null) {
                class280 var6 = arg0.method530();
                var6.method157(super.field644, super.field651, super.field648);
                return class339.field4781 ? var5.method318(arg3, arg1, var6, false, 0, class220.field3129) : var5.method348(arg3, arg1, var6, false, 0);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(B)Z")
    public final boolean method399(byte arg0) {
        ++field8734;
        if (arg0 != 38) {
            this.field8736 = false;
        }
        return this.field8723 != null ? this.field8723.method332() : false;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)Z")
    public final boolean method395(byte arg0) {
        if (arg0 != 84) {
            return false;
        } else {
            ++field8752;
            if (this.field8723 == null) {
                return true;
            } else {
                return !this.field8723.method328();
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILha;IZ)Lnj;")
    private final class244 method3496(int arg0, class58 arg1, int arg2, boolean arg3) {
        ++field8749;
        class414 var5 = class66.field1181.method131(2, 65535 & this.field8732);
        if (arg0 >= -63) {
            return null;
        } else {
            class278 var6;
            class278 var7;
            if (!this.field8737) {
                if (super.field659 < 3) {
                    var6 = class173.field2511[super.field659 + 1];
                } else {
                    var6 = null;
                }
                var7 = class173.field2511[super.field659];
            } else {
                var6 = class173.field2511[0];
                var7 = class4.field56[super.field659];
            }
            return var5.method2523(var6, var7, super.field651, arg3, 1, this.field8745, super.field644, this.field8740, arg2, arg1, super.field648);
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public final void method400(int arg0) {
        this.field8730 = false;
        ++field8744;
        if (arg0 >= 33) {
            if (this.field8723 != null) {
                this.field8723.method347(-65537 & this.field8723.method361());
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILha;B)Lka;")
    private final class469 method3497(int arg0, class58 arg1, byte arg2) {
        ++field8729;
        if (arg2 > -5) {
            this.method390((class58) null, -43, false, -47);
        }
        if (this.field8723 != null && ~arg1.method611(this.field8723.method361(), arg0) == -1) {
            return this.field8723;
        } else {
            class244 var4 = this.method3496(-125, arg1, arg0, false);
            return var4 == null ? null : var4.field3407;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method1114(int arg0) {
        ++field8741;
        if (this.field8723 != null) {
            this.field8723.method326();
        }
        if (arg0 < 63) {
            this.method1109((byte) 110);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)I")
    public final int method1111(boolean arg0) {
        if (arg0) {
            return -27;
        } else {
            ++field8755;
            return this.field8745;
        }
    }
}
