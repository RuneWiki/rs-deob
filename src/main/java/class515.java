import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class515 extends class122 {

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    private int field7265 = -1;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    private int field7266 = 0;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    private int field7281 = 0;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    private int field7280 = 0;

    @OriginalMember(owner = "client!ii", name = "kb", descriptor = "Z")
    private boolean field7289 = false;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    private int field7282 = 0;

    @OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
    private int field7293 = 0;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "Z")
    public boolean field7287 = false;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    private int field7274;

    @OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
    public int field7291;

    @OriginalMember(owner = "client!ii", name = "sb", descriptor = "Las;")
    private class138 field7297;

    @OriginalMember(owner = "client!ii", name = "lb", descriptor = "Lqfa;")
    public static class85 field7290 = new class85(53, -1);

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!ii", name = "nb", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!ii", name = "rb", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Lgp;")
    private class45 field7268;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field7298;

    @OriginalMember(owner = "client!ii", name = "qb", descriptor = "[Lf;")
    public static class702[] field7295;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method3033(int arg0) {
        if (arg0 > -108) {
            field7290 = null;
        }
        field7295 = null;
        field7290 = null;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        if (arg0 != -36) {
            this.method3036((class396) null, (class55) null, (byte) -17, (class167) null);
        }
        ++field7296;
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BILr;I)Lda;")
    private final class55 method3034(byte arg0, int arg1, class167 arg2, int arg3) {
        ++field7272;
        class526 var5 = class261.field3825.method1313((byte) -115, arg3);
        class37 var6 = class185.field2987[super.field9814];
        if (arg0 >= -22) {
            this.field7265 = 10;
        }
        class37 var7 = ~super.field9804 <= -4 ? null : class185.field2987[super.field9804 + 1];
        return !this.field7287 ? var5.method3077(this.field7266, var6, this.field7281, true, arg2, arg1, super.field9806, var7, class357.field5338, this.field7265, super.field9809, (byte) -124, super.field9815) : var5.method3077(0, var6, -1, true, arg2, arg1, super.field9806, var7, class357.field5338, -1, super.field9809, (byte) -124, super.field9815);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field7276;
        class55 var3 = this.method3034((byte) -76, 2048 | (~this.field7280 == -1 ? 0 : 5), arg1, this.field7274);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field7280 != -1) {
                var3.method349(this.field7280 * 2048);
            }
            if (arg0 != 92160000) {
                this.method450(101, (class167) null);
            }
            class396 var4 = arg1.method53();
            var4.method905(super.field9806, super.field9809, super.field9815);
            this.method3036(var4, var3, (byte) -73, arg1);
            if (class7.field521) {
                var3.method317(var4, (class684) null, class477.field6857, 0);
            } else {
                var3.method334(var4, (class684) null, 0);
            }
            if (this.field7268 != null) {
                class518 var5 = this.field7268.method582();
                if (!class7.field521) {
                    arg1.method123(var5);
                } else {
                    arg1.method72(var5, class477.field6857);
                }
            }
            this.field7289 = var3.method363();
            this.field7293 = var3.method315();
            this.field7282 = var3.method368();
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        int var5 = -57 / ((arg1 - -30) / 36);
        ++field7278;
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        ++field7288;
        return arg0 > -15;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        if (!arg0) {
            method3038(24, -41, 93, 83);
        }
        ++field7283;
        return this.field7282;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field7267;
        if (arg1 == -1008) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        ++field7277;
        if (arg0 >= -12) {
            this.method3036((class396) null, (class55) null, (byte) -11, (class167) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        ++field7284;
        if (arg0 != -29645) {
            method3038(106, -80, -22, 40);
        }
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public final void method3035(boolean arg0) {
        if (arg0) {
            if (this.field7268 != null) {
                this.field7268.method588();
            }
            ++field7275;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lq;Lda;BLr;)V")
    private final void method3036(class396 arg0, class55 arg1, byte arg2, class167 arg3) {
        arg1.method313(arg0);
        ++field7285;
        if (arg2 >= -18) {
            this.field7282 = 9;
        }
        class317[] var5 = arg1.method362();
        class146[] var6 = arg1.method348();
        if ((this.field7268 == null || this.field7268.field1104) && (var5 != null || var6 != null)) {
            this.field7268 = class45.method587(class336.field5031, true);
        }
        if (this.field7268 != null) {
            this.field7268.method589(arg3, (long) class336.field5031, var5, var6, false);
            this.field7268.method578(super.field9814, super.field2220, super.field2227, super.field2230, super.field2222);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = 64 % ((arg0 - -36) / 53);
        ++field7279;
        return this.field7289;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7274 = arg0;
        this.field7291 = arg2 - -arg1;
        this.field7280 = arg12;
        class526 var14 = class261.field3825.method1313((byte) -110, this.field7274);
        int var15 = var14.field7427;
        if (var15 != -1) {
            this.field7297 = class357.field5338.method2099(var15, true);
            this.field7287 = false;
        } else {
            this.field7287 = true;
        }
        if (~this.field7291 == ~arg2) {
            class536.method3101(this.field7281, (byte) 124, this.field7297, super.field9815, super.field9806, super.field9814, false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)V")
    public final void method3037(byte arg0, int arg1) {
        if (arg0 <= 3) {
            this.field7297 = null;
        }
        ++field7271;
        if (!this.field7287) {
            this.field7266 += arg1;
            while (~this.field7266 < ~this.field7297.field2431[this.field7281]) {
                this.field7266 -= this.field7297.field2431[this.field7281];
                ++this.field7281;
                if (this.field7297.field2440.length <= this.field7281) {
                    this.field7287 = true;
                    break;
                }
            }
            if (!this.field7287) {
                class536.method3101(this.field7281, (byte) 123, this.field7297, super.field9815, super.field9806, super.field9814, false);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7268 != null) {
            this.field7268.method588();
        }
        ++field7269;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        ++field7270;
        return arg0 >= -38 ? -7 : this.field7293;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3038(int arg0, int arg1, int arg2, int arg3) {
        ++field7294;
        boolean var4 = true;
        class83 var5 = (class83) class264.method1729(arg2, arg1, arg0);
        if (arg3 != 9200) {
            field7290 = null;
        }
        if (var5 != null) {
            var4 &= class225.method1537(var5, false);
        }
        class83 var6 = (class83) class63.method756(arg2, arg1, arg0, field7298 != null ? field7298 : (field7298 = method3040("qu")));
        if (var6 != null) {
            var4 &= class225.method1537(var6, false);
        }
        class83 var7 = (class83) class697.method3897(arg2, arg1, arg0);
        if (var7 != null) {
            var4 &= class225.method1537(var7, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        if (arg0) {
            this.field7274 = 93;
        }
        ++field7292;
        class55 var3 = this.method3034((byte) -97, 0, arg1, this.field7274);
        if (var3 != null) {
            class396 var4 = arg1.method53();
            var4.method905(super.field9806, super.field9809, super.field9815);
            this.method3036(var4, var3, (byte) -92, arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method3039(boolean arg0, byte[] arg1, int arg2) {
        ++field7286;
        if (arg2 != -1) {
            field7295 = null;
        }
        if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class328.field4817) {
                try {
                    class560 var3 = (class560) Class.forName("rt").newInstance();
                    var3.method1462(arg1, false);
                    return var3;
                } catch (Throwable var4) {
                    class328.field4817 = true;
                }
            }
            return !arg0 ? arg1 : class282.method1863(arg1, -31830);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3040(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
