import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class533 extends class122 implements class83 {

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "Z")
    private boolean field7474 = false;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "Lui;")
    public class210 field7468;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "Z")
    private boolean field7467;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field7465 = -1;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!ul", name = "hb", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!ul", name = "ib", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ul", name = "jb", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!ul", name = "kb", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!ul", name = "lb", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "Lbm;")
    private class98 field7463;

    @OriginalMember(owner = "client!ul", name = "gb", descriptor = "Z")
    public static boolean field7479;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        int var2 = 70 % ((arg0 - 43) / 44);
        ++field7462;
        return this.field7468.field3193;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)I")
    public static final int method3092(byte arg0, int arg1) {
        ++field7466;
        if (arg0 != -45) {
            method3092((byte) 41, -93);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        ++field7483;
        if (arg0 != -29645) {
            this.method450(73, (class167) null);
        }
        return this.field7463;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        if (arg0 != 52) {
            this.field7474 = true;
        }
        ++field7461;
        return this.field7468.field3212;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field7470;
        int var5 = -31 / ((-30 - arg1) / 36);
        class55 var6 = this.field7468.method1470(131072, (byte) 105, super.field9815, arg0, false, false, super.field9806);
        if (var6 == null) {
            return false;
        } else {
            class396 var7 = arg0.method53();
            var7.method905(super.field9806, super.field9809, super.field9815);
            return class7.field521 ? var6.method318(arg2, arg3, var7, false, class477.field6857) : var6.method358(arg2, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = 25 / ((-36 - arg0) / 53);
        ++field7460;
        return this.field7474;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIIIIIII)V")
    public class533(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1261 == 1, class437.method2646(1, arg12, arg13));
        this.field7468 = new class210(arg0, arg1, arg12, arg13, super.field9814, arg3, arg4, arg6, arg7, arg14);
        this.field7467 = arg1.field1290 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        ++field7475;
        return arg0 > -38 ? 31 : this.field7468.method1467(0);
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (arg0 > -12) {
            field7465 = 29;
        }
        ++field7481;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        if (arg0 != -36) {
            return false;
        } else {
            ++field7469;
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        if (!arg0) {
            field7479 = true;
        }
        ++field7473;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field7477;
        if (arg1 == -1008) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        ++field7484;
        if (arg0 <= 73) {
            field7465 = 94;
        }
        return this.field7468.method1468((byte) 65);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        if (arg0 != -105) {
            this.field7468 = null;
        }
        ++field7478;
        return this.field7468.field3203;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        this.field7468.method1464(arg0, -1);
        if (arg1) {
            this.method840((class167) null, false);
        }
        ++field7464;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        if (arg0) {
            this.field7468 = null;
        }
        ++field7480;
        class55 var3 = this.field7468.method1470(262144, (byte) 109, super.field9815, arg1, true, true, super.field9806);
        if (var3 != null) {
            class396 var4 = arg1.method53();
            var4.method905(super.field9806, super.field9809, super.field9815);
            this.field7468.method1473(super.field2220, super.field2227, super.field2222, arg1, var4, super.field2230, var3, 0, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field7476;
        class55 var3 = this.field7468.method1470(2048, (byte) 126, super.field9815, arg1, false, true, super.field9806);
        if (var3 == null) {
            return null;
        } else {
            class396 var4 = arg1.method53();
            var4.method905(super.field9806, super.field9809, super.field9815);
            class531 var5 = null;
            if (this.field7467) {
                var5 = class370.method2347(1, (byte) -125);
            }
            this.field7468.method1473(super.field2220, super.field2227, super.field2222, arg1, var4, super.field2230, var3, arg0 ^ arg0, true);
            if (!class7.field521) {
                var3.method334(var4, var5 != null ? var5.field7451[0] : null, 0);
            } else {
                var3.method317(var4, var5 != null ? var5.field7451[0] : null, class477.field6857, 0);
            }
            if (this.field7468.field3222 != null) {
                class518 var6 = this.field7468.field3222.method582();
                if (class7.field521) {
                    arg1.method72(var6, class477.field6857);
                } else {
                    arg1.method123(var6);
                }
            }
            this.field7474 = var3.method363() || this.field7468.field3222 != null;
            if (this.field7463 != null) {
                class653.method3724(super.field9806, super.field9809, 30955, var3, this.field7463, super.field9815);
            } else {
                this.field7463 = class86.method857(super.field9815, -1, super.field9809, var3, super.field9806);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        ++field7472;
        if (!arg0) {
            this.method450(23, (class167) null);
        }
        return this.field7468.method1472(113);
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        if (arg0 >= -15) {
            this.method524(-52);
        }
        ++field7482;
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        this.field7468.method1463(false, arg1);
        if (arg0 < 60) {
            this.field7463 = null;
        }
        ++field7471;
    }
}
