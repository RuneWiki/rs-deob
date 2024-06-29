import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class485 extends class113 implements class141 {

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "B")
    private byte field6874;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Z")
    private boolean field6859;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "S")
    private short field6867;

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "Z")
    private boolean field6881;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "B")
    private byte field6862;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "Z")
    private boolean field6877;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "Z")
    private boolean field6865;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lr;")
    private class181 field6852;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "Lka;")
    public class469 field6876;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "[I")
    public static int[] field6851 = new int[8];

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "Ltb;")
    private class397 field6879;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)I")
    public final int method1111(boolean arg0) {
        if (arg0) {
            return 85;
        } else {
            ++field6853;
            return this.field6862;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method1114(int arg0) {
        ++field6873;
        if (this.field6876 != null) {
            this.field6876.method326();
        }
        if (arg0 <= 63) {
            this.field6876 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)I")
    public final int method393(byte arg0) {
        if (arg0 != -83) {
            return -10;
        } else {
            ++field6861;
            return this.field6876 == null ? 0 : this.field6876.method324();
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(B)Z")
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            return true;
        } else {
            ++field6869;
            return this.field6876 != null ? this.field6876.method332() : false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lha;IZI)Z")
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field6875;
        class469 var5 = this.method2915(arg0, arg2, 131072);
        if (var5 != null) {
            class280 var6 = arg0.method530();
            var6.method157(super.field644, super.field651, super.field648);
            return class339.field4781 ? var5.method318(arg3, arg1, var6, false, 0, class220.field3129) : var5.method348(arg3, arg1, var6, false, 0);
        } else {
            if (!arg2) {
                this.method1113(-126);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lha;ZI)Lka;")
    private final class469 method2915(class58 arg0, boolean arg1, int arg2) {
        ++field6856;
        if (!arg1) {
            this.method1110((byte) -78, (class58) null);
        }
        if (this.field6876 != null && arg0.method611(this.field6876.method361(), arg2) == 0) {
            return this.field6876;
        } else {
            class244 var4 = this.method2917(false, arg0, arg2, 4524);
            return var4 == null ? null : var4.field3407;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILha;Lgs;ZII)V")
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        ++field6855;
        if (arg0 <= -5) {
            if (!(arg3 instanceof class601)) {
                if (arg3 instanceof class485) {
                    class485 var8 = (class485) arg3;
                    if (this.field6876 != null && var8.field6876 != null) {
                        this.field6876.method345(var8.field6876, arg1, arg5, arg6, arg4);
                        return;
                    }
                }
            } else {
                class601 var9 = (class601) arg3;
                if (this.field6876 == null || var9.field8723 == null) {
                    return;
                }
                this.field6876.method345(var9.field8723, arg1, arg5, arg6, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(BLha;)Lvw;")
    public final class304 method396(byte arg0, class58 arg1) {
        ++field6863;
        if (this.field6876 == null) {
            return null;
        } else {
            if (arg0 < 3) {
                this.method405((byte) 114, -40, (class58) null, (class43) null, false, -99, 13);
            }
            class280 var3 = arg1.method530();
            var3.method157(super.field644, super.field651, super.field648);
            class304 var4 = class359.method2239(1, this.field6859, (byte) 124);
            if (!class339.field4781) {
                this.field6876.method329(var3, var4.field4298[0], 0);
            } else {
                this.field6876.method343(var3, var4.field4298[0], class220.field3129, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLha;)V")
    public final void method1110(byte arg0, class58 arg1) {
        ++field6860;
        Object var3 = null;
        if (arg0 >= 9) {
            class181 var5;
            if (this.field6852 == null && this.field6865) {
                class244 var4 = this.method2917(true, arg1, 262144, 4524);
                var5 = var4 == null ? null : var4.field3404;
            } else {
                var5 = this.field6852;
                this.field6852 = null;
            }
            if (var5 != null) {
                class299.method1928(var5, super.field659, super.field644, super.field648, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(BLha;)V")
    public final void method401(byte arg0, class58 arg1) {
        ++field6871;
        if (arg0 != -39) {
            this.method2918(8);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lha;I)V")
    public final void method1108(class58 arg0, int arg1) {
        ++field6850;
        int var3 = 86 / ((arg1 - 44) / 49);
        Object var4 = null;
        class181 var6;
        if (this.field6852 == null && this.field6865) {
            class244 var5 = this.method2917(true, arg0, 262144, 4524);
            var6 = var5 != null ? var5.field3404 : null;
        } else {
            var6 = this.field6852;
            this.field6852 = null;
        }
        if (var6 != null) {
            class489.method2942(var6, super.field659, super.field644, super.field648, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(B)V")
    public static void method2916(byte arg0) {
        field6851 = null;
        int var1 = 114 / ((57 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
    public final int method1112(byte arg0) {
        ++field6868;
        int var2 = 86 % ((-75 - arg0) / 34);
        return this.field6874;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public final void method400(int arg0) {
        this.field6881 = false;
        if (arg0 <= 33) {
            this.field6876 = null;
        }
        ++field6866;
        if (this.field6876 != null) {
            this.field6876.method347(-65537 & this.field6876.method361());
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public final boolean method1113(int arg0) {
        ++field6858;
        return arg0 != -24333 ? true : this.field6865;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)Z")
    public final boolean method395(byte arg0) {
        ++field6878;
        if (this.field6876 != null) {
            return !this.field6876.method328();
        } else {
            return arg0 != 84 ? true : true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)I")
    public final int method404(int arg0) {
        ++field6872;
        if (arg0 != 65535) {
            return -104;
        } else {
            return this.field6876 != null ? this.field6876.method338() : 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I")
    public final int method1109(byte arg0) {
        ++field6864;
        int var2 = -19 % ((-45 - arg0) / 39);
        return this.field6867 & 65535;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLha;II)Lnj;")
    private final class244 method2917(boolean arg0, class58 arg1, int arg2, int arg3) {
        ++field6854;
        if (arg3 != 4524) {
            return null;
        } else {
            class414 var5 = class66.field1181.method131(2, this.field6867 & 65535);
            class278 var6;
            class278 var7;
            if (this.field6877) {
                var6 = class4.field56[super.field659];
                var7 = class173.field2511[0];
            } else {
                var6 = class173.field2511[super.field659];
                if (~super.field659 > -4) {
                    var7 = class173.field2511[super.field659 - -1];
                } else {
                    var7 = null;
                }
            }
            return var5.method2523(var7, var6, super.field651, arg0, arg3 + -4523, this.field6874 != 11 ? this.field6862 : 4 - -this.field6862, super.field644, this.field6874 != 11 ? this.field6874 : 10, arg2, arg1, super.field648);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lha;Z)Ltb;")
    public final class397 method397(class58 arg0, boolean arg1) {
        ++field6870;
        if (this.field6879 == null) {
            this.field6879 = class719.method4012(super.field644, super.field648, this.method2915(arg0, !arg1, 0), super.field651, (byte) -108);
        }
        if (arg1) {
            this.field6877 = false;
        }
        return this.field6879;
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)I")
    public final int method2918(int arg0) {
        if (arg0 != 4) {
            this.field6874 = -100;
        }
        ++field6857;
        return this.field6876 != null ? this.field6876.method335() / 4 : 15;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(B)Z")
    public final boolean method402(byte arg0) {
        if (arg0 < 28) {
            this.field6865 = true;
        }
        ++field6880;
        return this.field6881;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lha;Luw;IIIIIZIIIIIIZ)V")
    public class485(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5750 == -2, class436.method2629(-77, arg13, arg12));
        this.field6874 = (byte) arg12;
        super.field659 = (byte) arg3;
        this.field6859 = arg1.field5737 != 0 && !arg7;
        this.field6867 = (short) arg1.field5711;
        this.field6881 = arg14;
        this.field6862 = (byte) arg13;
        this.field6877 = arg7;
        this.field6865 = arg0.method550() && arg1.field5770 && !this.field6877 && class471.field6781.field6689.method56(27669) != 0;
        int var16 = 2048;
        if (this.field6881) {
            var16 |= 65536;
        }
        class244 var17 = this.method2917(this.field6865, arg0, var16, 4524);
        if (var17 != null) {
            this.field6852 = var17.field3404;
            this.field6876 = var17.field3407;
            if (this.field6881) {
                this.field6876 = this.field6876.method325((byte) 0, var16, false);
                return;
            }
        }
    }
}
