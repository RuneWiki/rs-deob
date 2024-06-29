import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class126 extends class195 implements class83 {

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "S")
    private short field2279;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "B")
    private byte field2291;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "Z")
    private boolean field2281;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "B")
    private byte field2290;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "Z")
    private boolean field2282;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Z")
    private boolean field2294;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lda;")
    private class55 field2289;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lha;")
    private class54 field2301;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "Lhga;")
    public static class158 field2292 = new class158();

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lbw;")
    public static class641 field2299 = new class641(7500);

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
    public static int field2309 = 0;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lbm;")
    private class98 field2285;

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "[B")
    public static byte[] field2307;

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "[Lf;")
    public static class702[] field2308;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field2287;
        int var5 = 62 % ((arg1 - -30) / 36);
        class55 var6 = this.method1083(arg0, -1, 131072);
        if (var6 != null) {
            class396 var7 = arg0.method53();
            var7.method905(super.field9806, super.field9809, super.field9815);
            return class7.field521 ? var6.method318(arg2, arg3, var7, false, class477.field6857) : var6.method358(arg2, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZILr;B)Lje;")
    private final class371 method1082(boolean arg0, int arg1, class167 arg2, byte arg3) {
        ++field2302;
        class56 var5 = class237.field3521.method3515(this.field2279 & 65535, 50);
        if (arg3 != 110) {
            return null;
        } else {
            class37 var6;
            class37 var7;
            if (!this.field2281) {
                var6 = class185.field2987[super.field9804];
                if (super.field9804 >= 3) {
                    var7 = null;
                } else {
                    var7 = class185.field2987[super.field9804 + 1];
                }
            } else {
                var7 = class185.field2987[0];
                var6 = class697.field9813[super.field9804];
            }
            return var5.method655(arg0, var7, super.field9806, arg1, this.field2290, this.field2291, super.field9809, arg2, true, var6, super.field9815);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        if (this.field2289 != null) {
            this.field2289.method314();
        }
        if (!arg0) {
            this.method840((class167) null, false);
        }
        ++field2293;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        if (arg0 <= 73) {
            return false;
        } else {
            ++field2300;
            return this.field2294;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        if (!arg0) {
            this.field2281 = true;
        }
        ++field2296;
        return this.field2289 == null ? 0 : this.field2289.method368();
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field2298;
        if (this.field2289 == null) {
            return null;
        } else {
            class396 var3 = arg1.method53();
            var3.method905(super.field3063 + super.field9806, super.field9809, super.field3061 + super.field9815);
            class531 var4 = null;
            if (this.field2282) {
                var4 = class370.method2347(1, (byte) -121);
            }
            if (arg0 != 92160000) {
                return null;
            } else {
                if (!class7.field521) {
                    this.field2289.method334(var3, var4 == null ? null : var4.field7451[0], 0);
                } else {
                    this.field2289.method317(var3, var4 != null ? var4.field7451[0] : null, class477.field6857, 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        int var2 = -33 % ((arg0 - 43) / 44);
        ++field2284;
        return this.field2291;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIIII)V")
    public class126(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field2279 = (short) arg1.field1272;
        this.field2291 = (byte) arg10;
        this.field2281 = arg7;
        super.field9815 = arg6;
        this.field2290 = (byte) arg11;
        super.field9806 = arg4;
        this.field2282 = ~arg1.field1290 != -1 && !arg7;
        this.field2294 = arg0.method171() && arg1.field1280 && !this.field2281 && class527.field7429.method1211(class90.field1654, (byte) 36) != 0;
        class371 var13 = this.method1082(this.field2294, 2048, arg0, (byte) 110);
        if (var13 != null) {
            this.field2289 = var13.field5508;
            this.field2301 = var13.field5512;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        ++field2304;
        Object var3 = null;
        class54 var5;
        if (this.field2301 == null && this.field2294) {
            class371 var4 = this.method1082(true, 262144, arg1, (byte) 110);
            var5 = var4 == null ? null : var4.field5512;
        } else {
            var5 = this.field2301;
            this.field2301 = null;
        }
        if (var5 != null) {
            class474.method2840(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
        }
        if (arg0 < 60) {
            field2308 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        ++field2297;
        int var2 = -23 % ((-36 - arg0) / 53);
        return this.field2289 == null ? false : this.field2289.method363();
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        ++field2305;
        if (arg0 >= -38) {
            this.field2279 = -63;
        }
        return this.field2289 == null ? 0 : this.field2289.method315();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        if (arg0) {
            this.method840((class167) null, false);
        }
        ++field2303;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lr;II)Lda;")
    private final class55 method1083(class167 arg0, int arg1, int arg2) {
        ++field2295;
        if (this.field2289 != null && ~arg0.method35(this.field2289.method352(), arg2) == -1) {
            return this.field2289;
        } else {
            class371 var4 = this.method1082(false, arg2, arg0, (byte) 110);
            if (arg1 != -1) {
                this.field2290 = 112;
            }
            return var4 == null ? null : var4.field5508;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(Z)V")
    public static void method1084(boolean arg0) {
        field2307 = null;
        field2308 = null;
        if (!arg0) {
            field2299 = null;
            field2292 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(B)V")
    public static final void method1085(byte arg0) {
        ++field2280;
        for (class509 var1 = (class509) class203.field3124.method1224(-2); var1 != null; var1 = (class509) class203.field3124.method1232(-2)) {
            if (var1.field7199) {
                var1.method3015(100);
            }
        }
        class509 var2 = (class509) class614.field8925.method1224(-2);
        if (arg0 == -62) {
            while (var2 != null) {
                if (var2.field7199) {
                    var2.method3015(64);
                }
                var2 = (class509) class614.field8925.method1232(arg0 ^ 60);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        if (arg0 != 52) {
            this.method450(59, (class167) null);
        }
        ++field2286;
        return 65535 & this.field2279;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        if (arg0 != -36) {
            this.field2289 = null;
        }
        ++field2288;
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        ++field2278;
        if (this.field2285 == null) {
            this.field2285 = class86.method857(super.field9815, arg0 ^ 29644, super.field9809, this.method1083(arg1, -1, 0), super.field9806);
        }
        if (arg0 != -29645) {
            this.field2291 = 9;
        }
        return this.field2285;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        ++field2306;
        return arg0 != -105 ? 2 : this.field2290;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        ++field2283;
        if (arg1) {
            this.method523(true);
        }
        Object var3 = null;
        class54 var5;
        if (this.field2301 == null && this.field2294) {
            class371 var4 = this.method1082(true, 262144, arg0, (byte) 110);
            var5 = var4 == null ? null : var4.field5512;
        } else {
            var5 = this.field2301;
            this.field2301 = null;
        }
        if (var5 != null) {
            class307.method2011(var5, super.field9804, super.field9806, super.field9815, (boolean[]) null);
        }
    }
}
