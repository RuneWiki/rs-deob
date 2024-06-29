import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class553 extends class624 implements class83 {

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "Z")
    private boolean field7847;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "B")
    private byte field7836;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Z")
    private boolean field7828;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "S")
    private short field7833;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "B")
    private byte field7853;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "Z")
    private boolean field7834;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Z")
    private boolean field7837;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "Lda;")
    public class55 field7855;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "Lha;")
    private class54 field7856;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "Lbm;")
    private class98 field7845;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "[Z")
    public static boolean[] field7840;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        int var2 = 56 % ((43 - arg0) / 44);
        ++field7852;
        return this.field7836;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field7842;
        class55 var5 = this.method3167(131072, true, arg0);
        if (var5 != null) {
            class396 var6 = arg0.method53();
            var6.method905(super.field9806, super.field9809, super.field9815);
            return !class7.field521 ? var5.method358(arg2, arg3, var6, false) : var5.method318(arg2, arg3, var6, false, class477.field6857);
        } else {
            int var7 = 110 % ((arg1 - -30) / 36);
            return false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIIZ)V")
    public class553(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class309.method2019(0, arg8, arg9));
        super.field9815 = arg6;
        this.field7847 = arg10;
        this.field7836 = (byte) arg8;
        this.field7828 = ~arg1.field1290 != -1 && !arg7;
        this.field7833 = (short) arg1.field1272;
        this.field7853 = (byte) arg9;
        this.field7834 = arg7;
        super.field9806 = arg4;
        this.field7837 = arg0.method171() && arg1.field1280 && !this.field7834 && ~class527.field7429.method1211(class90.field1654, (byte) 36) != -1;
        int var12 = 2048;
        if (this.field7847) {
            var12 |= 65536;
        }
        class371 var13 = this.method3166(var12, this.field7837, arg0, (byte) -68);
        if (var13 != null) {
            this.field7855 = var13.field5508;
            this.field7856 = var13.field5512;
            if (this.field7847) {
                this.field7855 = this.field7855.method357((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field7844;
        if (arg1 != -1008) {
            this.field7845 = null;
        }
        if (arg2 instanceof class553) {
            class553 var8 = (class553) arg2;
            if (this.field7855 != null && var8.field7855 != null) {
                this.field7855.method326(var8.field7855, arg0, arg4, arg3, arg6);
            }
        } else {
            if (arg2 instanceof class620) {
                class620 var9 = (class620) arg2;
                if (this.field7855 != null && var9.field9002 != null) {
                    this.field7855.method326(var9.field9002, arg0, arg4, arg3, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        ++field7850;
        if (this.field7845 == null) {
            this.field7845 = class86.method857(super.field9815, arg0 ^ 29644, super.field9809, this.method3167(0, true, arg1), super.field9806);
        }
        if (arg0 != -29645) {
            this.field7836 = 93;
        }
        return this.field7845;
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        ++field7831;
        if (arg0 != -36) {
            this.method3167(-87, false, (class167) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "(I)V")
    public static void method3165(int arg0) {
        if (arg0 <= 12) {
            method3165(1);
        }
        field7840 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        if (!arg1) {
            ++field7846;
            Object var3 = null;
            class54 var5;
            if (this.field7856 == null && this.field7837) {
                class371 var4 = this.method3166(262144, true, arg0, (byte) -68);
                var5 = var4 != null ? var4.field5512 : null;
            } else {
                var5 = this.field7856;
                this.field7856 = null;
            }
            if (var5 != null) {
                class307.method2011(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        ++field7839;
        if (arg0) {
            if (this.field7855 != null) {
                this.field7855.method314();
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field7838;
        if (arg0) {
            field7840 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        ++field7843;
        return arg0 != -105 ? 65 : this.field7853;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZLr;B)Lje;")
    private final class371 method3166(int arg0, boolean arg1, class167 arg2, byte arg3) {
        ++field7826;
        if (arg3 != -68) {
            this.method840((class167) null, true);
        }
        class56 var5 = class237.field3521.method3515(this.field7833 & 65535, 50);
        class37 var6;
        class37 var7;
        if (this.field7834) {
            var6 = class185.field2987[0];
            var7 = class697.field9813[super.field9804];
        } else {
            var7 = class185.field2987[super.field9804];
            if (~super.field9804 > -4) {
                var6 = class185.field2987[super.field9804 - -1];
            } else {
                var6 = null;
            }
        }
        return var5.method655(arg1, var6, super.field9806, arg0, this.field7853, this.field7836, super.field9809, arg2, true, var7, super.field9815);
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        if (arg0 >= -38) {
            this.method522((byte) -106);
        }
        ++field7829;
        return this.field7855 != null ? this.field7855.method315() : 0;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field7849;
        if (this.field7855 == null) {
            return null;
        } else {
            if (arg0 != 92160000) {
                this.field7833 = -64;
            }
            class396 var3 = arg1.method53();
            var3.method905(super.field9806, super.field9809, super.field9815);
            class531 var4 = null;
            if (this.field7828) {
                var4 = class370.method2347(1, (byte) -128);
            }
            if (class7.field521) {
                this.field7855.method317(var3, var4 == null ? null : var4.field7451[0], class477.field6857, 0);
            } else {
                this.field7855.method334(var3, var4 == null ? null : var4.field7451[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        ++field7835;
        if (!arg0) {
            return -36;
        } else {
            return this.field7855 != null ? this.field7855.method368() : 0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZLr;)Lda;")
    private final class55 method3167(int arg0, boolean arg1, class167 arg2) {
        ++field7854;
        if (this.field7855 != null && ~arg2.method35(this.field7855.method352(), arg0) == -1) {
            return this.field7855;
        } else {
            class371 var4 = this.method3166(arg0, false, arg2, (byte) -68);
            if (!arg1) {
                this.field7837 = false;
            }
            return var4 == null ? null : var4.field5508;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        ++field7851;
        Object var3 = null;
        class54 var5;
        if (this.field7856 == null && this.field7837) {
            class371 var4 = this.method3166(262144, true, arg1, (byte) -68);
            var5 = var4 == null ? null : var4.field5512;
        } else {
            var5 = this.field7856;
            this.field7856 = null;
        }
        if (var5 != null) {
            class474.method2840(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
        }
        if (arg0 <= 60) {
            this.method448(-102);
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field7847 = false;
        ++field7827;
        if (this.field7855 != null) {
            this.field7855.method361(-65537 & this.field7855.method352());
        }
        if (arg0 > -12) {
            method3165(12);
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        ++field7830;
        return arg0 >= -15 ? true : this.field7847;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        if (arg0 < 73) {
            this.method840((class167) null, true);
        }
        ++field7832;
        return this.field7837;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        ++field7857;
        int var2 = 16 % ((-36 - arg0) / 53);
        return this.field7855 != null ? this.field7855.method363() : false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        ++field7848;
        if (arg0 != 52) {
            this.field7845 = null;
        }
        return this.field7833 & 65535;
    }
}
