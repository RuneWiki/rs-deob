import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class249 extends class578 implements class141 {

    @OriginalMember(owner = "client!gca", name = "cb", descriptor = "Z")
    private boolean field3500;

    @OriginalMember(owner = "client!gca", name = "X", descriptor = "Z")
    private boolean field3495;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "S")
    private short field3480;

    @OriginalMember(owner = "client!gca", name = "U", descriptor = "B")
    private byte field3492;

    @OriginalMember(owner = "client!gca", name = "db", descriptor = "Z")
    private boolean field3501;

    @OriginalMember(owner = "client!gca", name = "S", descriptor = "Z")
    private boolean field3490;

    @OriginalMember(owner = "client!gca", name = "jb", descriptor = "Lka;")
    private class469 field3507;

    @OriginalMember(owner = "client!gca", name = "O", descriptor = "Lr;")
    private class181 field3486;

    @OriginalMember(owner = "client!gca", name = "T", descriptor = "Lqe;")
    public static class465 field3491 = new class465(50, 3);

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!gca", name = "N", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!gca", name = "Q", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!gca", name = "R", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!gca", name = "V", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!gca", name = "W", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!gca", name = "Z", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!gca", name = "ab", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!gca", name = "bb", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!gca", name = "eb", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!gca", name = "fb", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!gca", name = "gb", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!gca", name = "hb", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!gca", name = "ib", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!gca", name = "kb", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!gca", name = "lb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!gca", name = "mb", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!gca", name = "nb", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "Ltb;")
    private class397 field3487;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILha;Lfd;ILgba;IBILnd;)V")
    public static final void method1657(int arg0, class58 arg1, class524 arg2, int arg3, class664 arg4, int arg5, byte arg6, int arg7, class541 arg8) {
        ++field3506;
        int var9 = -(arg7 / 2) + -5 + arg5;
        int var10 = arg3 + 2;
        if (~arg2.field7451 != -1) {
            arg1.method542(-var10 + 1 + arg3 + arg4.method3732() * arg0, arg7 + 10, 3854, arg2.field7451, var10, var9);
        }
        if (~arg2.field7415 != -1) {
            arg1.method586(arg2.field7415, var10, 12, arg4.method3732() * arg0 + -var10 + arg3 + 1, arg7 + 10, var9);
        }
        int var11 = arg2.field7452;
        if (arg8.field7598 && arg2.field7423 != -1) {
            var11 = arg2.field7423;
        }
        int var12 = 0;
        if (arg6 > -116) {
            method1662((byte) 21);
        }
        while (~arg0 < ~var12) {
            String var13 = class692.field9741[var12];
            if (~(arg0 + -1) < ~var12) {
                var13 = var13.substring(0, -4 + var13.length());
            }
            arg4.method3731(arg1, var13, arg5, arg3, var11, true);
            arg3 += arg4.method3732();
            ++var12;
        }
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(B)Z")
    public final boolean method402(byte arg0) {
        if (arg0 < 28) {
            method1661(75);
        }
        ++field3484;
        return this.field3501;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)I")
    public final int method1109(byte arg0) {
        int var2 = 43 % ((-45 - arg0) / 39);
        ++field3479;
        return this.field3480 & 65535;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lha;Z)Ltb;")
    public final class397 method397(class58 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field3493;
            if (this.field3487 == null) {
                this.field3487 = class719.method4012(super.field644, super.field648, this.method1659(arg0, true, 0), super.field651, (byte) -108);
            }
            return this.field3487;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BILha;Lgs;ZII)V")
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 > -5) {
            this.field3495 = true;
        }
        if (arg3 instanceof class249) {
            class249 var8 = (class249) arg3;
            if (this.field3507 != null && var8.field3507 != null) {
                this.field3507.method345(var8.field3507, arg1, arg5, arg6, arg4);
            }
        }
        ++field3483;
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(B)Z")
    public final boolean method395(byte arg0) {
        if (arg0 != 84) {
            return true;
        } else {
            ++field3485;
            if (this.field3507 != null) {
                return !this.field3507.method328();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(BLha;)V")
    public final void method401(byte arg0, class58 arg1) {
        if (arg0 != -39) {
            field3491 = null;
        }
        ++field3502;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLha;ZI)Lnj;")
    private final class244 method1658(byte arg0, class58 arg1, boolean arg2, int arg3) {
        ++field3510;
        if (arg0 >= -123) {
            return null;
        } else {
            class414 var5 = class66.field1181.method131(2, 65535 & this.field3480);
            class278 var6;
            class278 var7;
            if (!this.field3495) {
                if (super.field659 >= 3) {
                    var6 = null;
                } else {
                    var6 = class173.field2511[super.field659 + 1];
                }
                var7 = class173.field2511[super.field659];
            } else {
                var7 = class4.field56[super.field659];
                var6 = class173.field2511[0];
            }
            return var5.method2523(var6, var7, super.field651, arg2, 1, this.field3492, super.field644, 22, arg3, arg1, super.field648);
        }
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(B)Z")
    public final boolean method399(byte arg0) {
        ++field3496;
        if (arg0 != 38) {
            return true;
        } else {
            return this.field3507 == null ? false : this.field3507.method332();
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(BLha;)Lvw;")
    public final class304 method396(byte arg0, class58 arg1) {
        ++field3499;
        if (this.field3507 == null) {
            return null;
        } else {
            class280 var3 = arg1.method530();
            var3.method157(super.field644, super.field651, super.field648);
            class304 var4 = class359.method2239(1, this.field3500, (byte) 120);
            if (!class339.field4781) {
                this.field3507.method329(var3, var4.field4298[0], 0);
            } else {
                this.field3507.method343(var3, var4.field4298[0], class220.field3129, 0);
            }
            if (arg0 <= 3) {
                this.method393((byte) 125);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lha;ZI)Lka;")
    private final class469 method1659(class58 arg0, boolean arg1, int arg2) {
        ++field3494;
        if (this.field3507 != null && ~arg0.method611(this.field3507.method361(), arg2) == -1) {
            return this.field3507;
        } else if (!arg1) {
            return null;
        } else {
            class244 var4 = this.method1658((byte) -127, arg0, false, arg2);
            return var4 != null ? var4.field3407 : null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)I")
    public final int method1112(byte arg0) {
        int var2 = -123 % ((arg0 - -75) / 34);
        ++field3511;
        return 22;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lha;I)V")
    public final void method1108(class58 arg0, int arg1) {
        ++field3482;
        Object var3 = null;
        class181 var5;
        if (this.field3486 == null && this.field3490) {
            class244 var4 = this.method1658((byte) -126, arg0, true, 262144);
            var5 = var4 == null ? null : var4.field3404;
        } else {
            var5 = this.field3486;
            this.field3486 = null;
        }
        if (var5 != null) {
            class489.method2942(var5, super.field659, super.field644, super.field648, (boolean[]) null);
        }
        int var6 = -72 / ((arg1 - 44) / 49);
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)V")
    public final void method400(int arg0) {
        this.field3501 = false;
        ++field3509;
        if (arg0 > 33) {
            if (this.field3507 != null) {
                this.field3507.method347(this.field3507.method361() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZBI)V")
    public static final void method1660(boolean arg0, byte arg1, int arg2) {
        ++field3488;
        if (arg1 <= 116) {
            field3491 = null;
        }
        if (arg0) {
            class135 var3 = class273.method1801(class459.field6629, class348.field4887, 2);
            var3.field2109.method223(1493807496, arg2);
            class539.method3178(var3, -18925);
        } else {
            class357.method2232(class382.field5355, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    public final void method1114(int arg0) {
        if (arg0 <= 63) {
            this.field3486 = null;
        }
        ++field3505;
        if (this.field3507 != null) {
            this.field3507.method326();
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Z")
    public final boolean method1113(int arg0) {
        ++field3478;
        return arg0 != -24333 ? true : this.field3490;
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field3498;
        if (arg0 != -83) {
            this.method390((class58) null, 7, true, 71);
        }
        return this.field3507 == null ? 0 : this.field3507.method324();
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(I)I")
    public final int method404(int arg0) {
        if (arg0 != 65535) {
            field3491 = null;
        }
        ++field3481;
        return this.field3507 == null ? 0 : this.field3507.method338();
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(I)V")
    public static void method1661(int arg0) {
        if (arg0 != 65535) {
            method1660(false, (byte) 39, 10);
        }
        field3491 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLha;)V")
    public final void method1110(byte arg0, class58 arg1) {
        if (arg0 > 9) {
            ++field3504;
            Object var3 = null;
            class181 var5;
            if (this.field3486 == null && this.field3490) {
                class244 var4 = this.method1658((byte) -127, arg1, true, 262144);
                var5 = var4 != null ? var4.field3404 : null;
            } else {
                var5 = this.field3486;
                this.field3486 = null;
            }
            if (var5 != null) {
                class299.method1928(var5, super.field659, super.field644, super.field648, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lha;Luw;IIIIIZIZ)V")
    public class249(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5726);
        super.field644 = arg4;
        this.field3500 = arg1.field5737 != 0 && !arg7;
        this.field3495 = arg7;
        this.field3480 = (short) arg1.field5711;
        this.field3492 = (byte) arg8;
        this.field3501 = arg9;
        super.field648 = arg6;
        this.field3490 = arg0.method550() && arg1.field5770 && !this.field3495 && ~class471.field6781.field6689.method56(27669) != -1;
        int var11 = 2048;
        if (this.field3501) {
            var11 |= 65536;
        }
        class244 var12 = this.method1658((byte) -127, arg0, this.field3490, var11);
        if (var12 != null) {
            this.field3507 = var12.field3407;
            this.field3486 = var12.field3404;
            if (this.field3501) {
                this.field3507 = this.field3507.method325((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(B)V")
    public static final void method1662(byte arg0) {
        if (arg0 == 122) {
            ++field3497;
            if (class737.field10375) {
                class50 var1 = class434.method2624(class31.field415, class40.field590, (byte) -102);
                if (var1 != null && var1.field866 != null) {
                    class604 var2 = new class604();
                    var2.field8782 = var1;
                    var2.field8773 = var1.field866;
                    class357.method2223(var2);
                }
                class737.field10375 = false;
                class54.field1033 = -1;
                class458.field6611 = -1;
                if (var1 != null) {
                    class262.method1776(0, var1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I")
    public final int method1111(boolean arg0) {
        ++field3489;
        return arg0 ? 116 : this.field3492;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lha;IZI)Z")
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field3508;
        if (!arg2) {
            return false;
        } else {
            class469 var5 = this.method1659(arg0, arg2, 131072);
            if (var5 != null) {
                class280 var6 = arg0.method530();
                var6.method157(super.field644, super.field651, super.field648);
                return !class339.field4781 ? var5.method348(arg3, arg1, var6, false, 0) : var5.method318(arg3, arg1, var6, false, 0, class220.field3129);
            } else {
                return false;
            }
        }
    }
}
