import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class490 extends class219 implements class83 {

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "B")
    private byte field7011;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "S")
    private short field7022;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Z")
    private boolean field7018;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Z")
    private boolean field7024;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Z")
    private boolean field7026;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
    private boolean field7010;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lda;")
    private class55 field7028;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "Lha;")
    private class54 field7031;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lbm;")
    private class98 field7005;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2947(byte arg0, int arg1) {
        ++field7015;
        class316 var2 = (class316) class37.field1045.method783(arg0 ^ 17, (long) arg1);
        if (arg0 != 114) {
            method2947((byte) -121, 95);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = 255 - var6;
                int var8 = class468.method2795(var4, var7, (byte) -96);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class316(var3);
            class37.field1045.method780((long) arg1, (byte) -93, var2);
        }
        return var2.field4658;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field7009;
        if (arg0) {
            this.field7024 = false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        if (this.field7028 != null) {
            this.field7028.method314();
        }
        ++field7004;
        if (!arg0) {
            this.field7024 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        if (this.field7005 == null) {
            this.field7005 = class86.method857(super.field9815, arg0 + 29644, super.field9809, this.method2948(5372, 0, arg1), super.field9806);
        }
        if (arg0 != -29645) {
            this.field7005 = null;
        }
        ++field7027;
        return this.field7005;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILr;)Lda;")
    private final class55 method2948(int arg0, int arg1, class167 arg2) {
        ++field7006;
        if (arg0 != 5372) {
            this.method840((class167) null, true);
        }
        if (this.field7028 != null && ~arg2.method35(this.field7028.method352(), arg1) == -1) {
            return this.field7028;
        } else {
            class371 var4 = this.method2949(false, arg1, arg2, (byte) -36);
            return var4 != null ? var4.field5508 : null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        if (arg0 != -105) {
            this.method447(113);
        }
        ++field7023;
        return this.field7011;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        if (arg0 < 73) {
            this.method843(true);
        }
        ++field7008;
        return this.field7010;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIZ)V")
    public class490(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1267);
        this.field7011 = (byte) arg8;
        this.field7022 = (short) arg1.field1272;
        this.field7018 = arg7;
        super.field9815 = arg6;
        this.field7024 = arg1.field1290 != 0 && !arg7;
        super.field9806 = arg4;
        this.field7026 = arg9;
        this.field7010 = arg0.method171() && arg1.field1280 && !this.field7018 && class527.field7429.method1211(class90.field1654, (byte) 36) != 0;
        int var11 = 2048;
        if (this.field7026) {
            var11 |= 65536;
        }
        class371 var12 = this.method2949(this.field7010, var11, arg0, (byte) -122);
        if (var12 != null) {
            this.field7028 = var12.field5508;
            this.field7031 = var12.field5512;
            if (this.field7026) {
                this.field7028 = this.field7028.method357((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        if (arg0 >= -38) {
            return -73;
        } else {
            ++field7029;
            return this.field7028 != null ? this.field7028.method315() : 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        ++field7019;
        int var2 = 91 / ((arg0 - 43) / 44);
        return 22;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        ++field7020;
        Object var3 = null;
        class54 var5;
        if (this.field7031 == null && this.field7010) {
            class371 var4 = this.method2949(true, 262144, arg1, (byte) 107);
            var5 = var4 == null ? null : var4.field5512;
        } else {
            var5 = this.field7031;
            this.field7031 = null;
        }
        if (arg0 >= 60) {
            if (var5 != null) {
                class474.method2840(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        if (arg0 != -36) {
            this.method840((class167) null, false);
        }
        ++field7025;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field7017;
        int var5 = -19 / ((arg1 - -30) / 36);
        class55 var6 = this.method2948(5372, 131072, arg0);
        if (var6 != null) {
            class396 var7 = arg0.method53();
            var7.method905(super.field9806, super.field9809, super.field9815);
            return !class7.field521 ? var6.method358(arg2, arg3, var7, false) : var6.method318(arg2, arg3, var7, false, class477.field6857);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = -38 % ((arg0 - -36) / 53);
        ++field7033;
        return this.field7028 != null ? this.field7028.method363() : false;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        if (arg0 > -15) {
            this.method846((byte) -127);
        }
        ++field7013;
        return this.field7026;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        ++field7016;
        if (!arg1) {
            Object var3 = null;
            class54 var5;
            if (this.field7031 == null && this.field7010) {
                class371 var4 = this.method2949(true, 262144, arg0, (byte) -122);
                var5 = var4 == null ? null : var4.field5512;
            } else {
                var5 = this.field7031;
                this.field7031 = null;
            }
            if (var5 != null) {
                class307.method2011(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field7012;
        if (this.field7028 == null) {
            return null;
        } else {
            if (arg0 != 92160000) {
                this.method530(127);
            }
            class396 var3 = arg1.method53();
            var3.method905(super.field9806, super.field9809, super.field9815);
            class531 var4 = null;
            if (this.field7024) {
                var4 = class370.method2347(1, (byte) -124);
            }
            if (!class7.field521) {
                this.field7028.method334(var3, var4 == null ? null : var4.field7451[0], 0);
            } else {
                this.field7028.method317(var3, var4 != null ? var4.field7451[0] : null, class477.field6857, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        ++field7032;
        return arg0 != 52 ? 79 : 65535 & this.field7022;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        if (!arg0) {
            this.field7018 = false;
        }
        ++field7030;
        return this.field7028 == null ? 0 : this.field7028.method368();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILr;B)Lje;")
    private final class371 method2949(boolean arg0, int arg1, class167 arg2, byte arg3) {
        ++field7021;
        int var5 = -58 / ((-83 - arg3) / 38);
        class56 var6 = class237.field3521.method3515(this.field7022 & 65535, 50);
        class37 var7;
        class37 var8;
        if (!this.field7018) {
            var7 = class185.field2987[super.field9804];
            if (~super.field9804 > -4) {
                var8 = class185.field2987[super.field9804 + 1];
            } else {
                var8 = null;
            }
        } else {
            var7 = class697.field9813[super.field9804];
            var8 = class185.field2987[0];
        }
        return var6.method655(arg0, var8, super.field9806, arg1, this.field7011, 22, super.field9809, arg2, true, var7, super.field9815);
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field7026 = false;
        ++field7007;
        if (this.field7028 != null) {
            this.field7028.method361(this.field7028.method352() & -65537);
        }
        if (arg0 > -12) {
            this.method2948(-128, -98, (class167) null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field7014;
        if (arg2 instanceof class490) {
            class490 var8 = (class490) arg2;
            if (this.field7028 != null && var8.field7028 != null) {
                this.field7028.method326(var8.field7028, arg0, arg4, arg3, arg6);
            }
        }
        if (arg1 != -1008) {
            this.method840((class167) null, false);
        }
    }
}
