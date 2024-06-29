import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class620 extends class122 implements class83 {

    @OriginalMember(owner = "client!aga", name = "cb", descriptor = "Z")
    private boolean field8982;

    @OriginalMember(owner = "client!aga", name = "nb", descriptor = "Z")
    private boolean field8993;

    @OriginalMember(owner = "client!aga", name = "ob", descriptor = "S")
    private short field8994;

    @OriginalMember(owner = "client!aga", name = "rb", descriptor = "Z")
    private boolean field8997;

    @OriginalMember(owner = "client!aga", name = "X", descriptor = "B")
    private byte field8977;

    @OriginalMember(owner = "client!aga", name = "vb", descriptor = "B")
    private byte field9001;

    @OriginalMember(owner = "client!aga", name = "M", descriptor = "Z")
    private boolean field8966;

    @OriginalMember(owner = "client!aga", name = "V", descriptor = "Lha;")
    private class54 field8975;

    @OriginalMember(owner = "client!aga", name = "wb", descriptor = "Lda;")
    public class55 field9002;

    @OriginalMember(owner = "client!aga", name = "ab", descriptor = "I")
    public static int field8980 = 0;

    @OriginalMember(owner = "client!aga", name = "W", descriptor = "Z")
    public static boolean field8976 = false;

    @OriginalMember(owner = "client!aga", name = "kb", descriptor = "I")
    public static int field8990 = 0;

    @OriginalMember(owner = "client!aga", name = "ub", descriptor = "Z")
    public static boolean field9000 = false;

    @OriginalMember(owner = "client!aga", name = "N", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!aga", name = "O", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!aga", name = "P", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!aga", name = "Q", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!aga", name = "R", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!aga", name = "S", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!aga", name = "T", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!aga", name = "U", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!aga", name = "Y", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!aga", name = "Z", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!aga", name = "bb", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!aga", name = "db", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!aga", name = "eb", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!aga", name = "gb", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!aga", name = "hb", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!aga", name = "ib", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!aga", name = "jb", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!aga", name = "lb", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!aga", name = "mb", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!aga", name = "pb", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!aga", name = "qb", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!aga", name = "sb", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!aga", name = "tb", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!aga", name = "fb", descriptor = "Lbm;")
    private class98 field8985;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        ++field8973;
        if (arg0 != -105) {
            this.field8982 = false;
        }
        return this.field8977;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIIIIIIZ)V")
    public class620(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1261 == -2, class145.method1162(arg12, arg13, (byte) 106));
        this.field8982 = arg14;
        super.field9804 = (byte) arg3;
        this.field8993 = arg7;
        this.field8994 = (short) arg1.field1272;
        this.field8997 = arg1.field1290 != 0 && !arg7;
        this.field8977 = (byte) arg13;
        this.field9001 = (byte) arg12;
        this.field8966 = arg0.method171() && arg1.field1280 && !this.field8993 && class527.field7429.method1211(class90.field1654, (byte) 36) != 0;
        int var16 = 2048;
        if (this.field8982) {
            var16 |= 65536;
        }
        class371 var17 = this.method3543(this.field8966, var16, 14867, arg0);
        if (var17 != null) {
            this.field8975 = var17.field5512;
            this.field9002 = var17.field5508;
            if (this.field8982) {
                this.field9002 = this.field9002.method357((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        if (arg0 >= -38) {
            this.method449(-125, (class167) null);
        }
        ++field8999;
        return this.field9002 == null ? 0 : this.field9002.method315();
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        ++field8989;
        if (arg0 != -29645) {
            return null;
        } else {
            if (this.field8985 == null) {
                this.field8985 = class86.method857(super.field9815, -1, super.field9809, this.method3542(0, (byte) -33, arg1), super.field9806);
            }
            return this.field8985;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        ++field8992;
        int var2 = 107 % ((arg0 - 43) / 44);
        return this.field9001;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        if (!arg0) {
            return 56;
        } else {
            ++field8996;
            return this.field9002 == null ? 0 : this.field9002.method368();
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        ++field8995;
        if (!arg1) {
            Object var3 = null;
            class54 var5;
            if (this.field8975 == null && this.field8966) {
                class371 var4 = this.method3543(true, 262144, 14867, arg0);
                var5 = var4 != null ? var4.field5512 : null;
            } else {
                var5 = this.field8975;
                this.field8975 = null;
            }
            if (var5 != null) {
                class307.method2011(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        ++field8967;
        if (arg0 > -15) {
            this.field8994 = 113;
        }
        return this.field8982;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBLr;)Lda;")
    private final class55 method3542(int arg0, byte arg1, class167 arg2) {
        ++field8984;
        if (this.field9002 != null && ~arg2.method35(this.field9002.method352(), arg0) == -1) {
            return this.field9002;
        } else {
            if (arg1 != -33) {
                this.method448(6);
            }
            class371 var4 = this.method3543(false, arg0, 14867, arg2);
            return var4 == null ? null : var4.field5508;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        if (arg0 != 52) {
            this.method523(true);
        }
        ++field8981;
        return this.field8994 & 65535;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        if (arg0 <= 73) {
            return true;
        } else {
            ++field8969;
            return this.field8966;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field8987;
        if (arg2 instanceof class553) {
            class553 var8 = (class553) arg2;
            if (this.field9002 != null && var8.field7855 != null) {
                this.field9002.method326(var8.field7855, arg0, arg4, arg3, arg6);
            }
        } else if (arg2 instanceof class620) {
            class620 var9 = (class620) arg2;
            if (this.field9002 != null && var9.field9002 != null) {
                this.field9002.method326(var9.field9002, arg0, arg4, arg3, arg6);
            }
        }
        if (arg1 != -1008) {
            this.method455(106, -118, (class697) null, -51, 74, (class167) null, false);
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = 124 / ((-36 - arg0) / 53);
        ++field8988;
        return this.field9002 == null ? false : this.field9002.method363();
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        if (!arg0) {
            ++field8998;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field8991;
        if (this.field9002 == null) {
            return null;
        } else {
            class396 var3 = arg1.method53();
            var3.method905(super.field9806, super.field9809, super.field9815);
            class531 var4 = null;
            if (this.field8997) {
                var4 = class370.method2347(1, (byte) -127);
            }
            if (class7.field521) {
                this.field9002.method317(var3, var4 == null ? null : var4.field7451[0], class477.field6857, 0);
            } else {
                this.field9002.method334(var3, var4 != null ? var4.field7451[0] : null, 0);
            }
            if (arg0 != 92160000) {
                this.method522((byte) 114);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        ++field8968;
        if (arg0) {
            if (this.field9002 != null) {
                this.field9002.method314();
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIILr;)Lje;")
    private final class371 method3543(boolean arg0, int arg1, int arg2, class167 arg3) {
        ++field8986;
        if (arg2 != 14867) {
            field8980 = -125;
        }
        class56 var5 = class237.field3521.method3515(65535 & this.field8994, 50);
        class37 var6;
        class37 var7;
        if (!this.field8993) {
            if (~super.field9804 <= -4) {
                var6 = null;
            } else {
                var6 = class185.field2987[super.field9804 + 1];
            }
            var7 = class185.field2987[super.field9804];
        } else {
            var7 = class697.field9813[super.field9804];
            var6 = class185.field2987[0];
        }
        return var5.method655(arg0, var6, super.field9806, arg1, this.field9001 != 11 ? this.field8977 : this.field8977 + 4, ~this.field9001 != -12 ? this.field9001 : 10, super.field9809, arg3, true, var7, super.field9815);
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        ++field8974;
        if (arg0 != -36) {
            this.method842((byte) 123, (class167) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field8972;
        class55 var5 = this.method3542(131072, (byte) -33, arg0);
        if (var5 != null) {
            class396 var6 = arg0.method53();
            var6.method905(super.field9806, super.field9809, super.field9815);
            return class7.field521 ? var5.method318(arg2, arg3, var6, false, class477.field6857) : var5.method358(arg2, arg3, var6, false);
        } else {
            int var7 = -7 / ((-30 - arg1) / 36);
            return false;
        }
    }

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "(I)I")
    public final int method3544(int arg0) {
        if (arg0 != 4) {
            return 122;
        } else {
            ++field8971;
            return this.field9002 != null ? this.field9002.method354() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        if (arg0 <= 60) {
            this.field9001 = -123;
        }
        ++field8983;
        Object var3 = null;
        class54 var5;
        if (this.field8975 == null && this.field8966) {
            class371 var4 = this.method3543(true, 262144, 14867, arg1);
            var5 = var4 == null ? null : var4.field5512;
        } else {
            var5 = this.field8975;
            this.field8975 = null;
        }
        if (var5 != null) {
            class474.method2840(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        ++field8979;
        if (arg0 >= -12) {
            this.method449(66, (class167) null);
        }
        this.field8982 = false;
        if (this.field9002 != null) {
            this.field9002.method361(-65537 & this.field9002.method352());
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILom;B)Ldaa;")
    public static final class11 method3545(int arg0, int arg1, class344 arg2, byte arg3) {
        ++field8970;
        byte[] var4 = arg2.method2216(arg1, arg0, true);
        int var5 = -52 % ((arg3 - -34) / 51);
        return var4 == null ? null : new class11(var4);
    }
}
