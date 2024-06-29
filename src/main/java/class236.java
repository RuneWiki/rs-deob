import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class236 extends class371 implements class210 {

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "B")
    private byte field3429;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "B")
    private byte field3423;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "B")
    private byte field3441;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "S")
    private short field3422;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
    private boolean field3428;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "Z")
    private boolean field3431;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "Z")
    private boolean field3419;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "Ln;")
    private class468 field3434;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "Ldh;")
    private class183 field3432;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "Lcf;")
    public static class92 field3436 = new class92();

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "F")
    public static float field3435;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)I")
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            this.field3422 = 93;
        }
        ++field3433;
        return 65535 & this.field3422;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLvc;)V")
    public final void method78(boolean arg0, class89 arg1) {
        ++field3437;
        Object var3 = null;
        class183 var5;
        if (this.field3432 == null && this.field3419) {
            class406 var4 = this.method1641(arg1, 65535, 131072, true);
            var5 = var4 != null ? var4.field5541 : null;
        } else {
            var5 = this.field3432;
            this.field3432 = null;
        }
        if (var5 != null) {
            class141.method1021(var5, this.field3423, super.field5113, super.field5112, (boolean[]) null);
        }
        if (!arg0) {
            this.method1642(-106, (class89) null, 23);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lvc;B)V")
    public final void method85(class89 arg0, byte arg1) {
        ++field3440;
        Object var3 = null;
        class183 var5;
        if (this.field3432 == null && this.field3419) {
            class406 var4 = this.method1641(arg0, arg1 + 65559, 131072, true);
            var5 = var4 != null ? var4.field5541 : null;
        } else {
            var5 = this.field3432;
            this.field3432 = null;
        }
        if (arg1 != -24) {
            this.method84(-55);
        }
        if (var5 != null) {
            class404.method2425(var5, this.field3423, super.field5113, super.field5112, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lvc;Lnm;IIIIZIIIII)V")
    public class236(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class92.method771(arg10, arg11, true));
        this.field3429 = (byte) arg11;
        this.field3423 = (byte) arg2;
        this.field3441 = (byte) arg10;
        this.field3422 = (short) arg1.field3887;
        this.field3428 = arg1.field3902 != 0 && !arg6;
        super.field5112 = (short) arg5;
        this.field3431 = arg6;
        super.field5113 = (short) arg3;
        this.field3419 = arg0.method291() && arg1.field3876 && !this.field3431 && class99.field1396 != 0;
        class406 var13 = this.method1641(arg0, 65535, 1024, this.field3419);
        if (var13 != null) {
            this.field3434 = var13.field5545;
            this.field3432 = var13.field5541;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lvc;IIZ)Lco;")
    private final class406 method1641(class89 arg0, int arg1, int arg2, boolean arg3) {
        ++field3427;
        class267 var5 = class468.field6599.method506(-125, this.field3422 & arg1);
        class241 var6;
        class241 var7;
        if (!this.field3431) {
            var6 = class190.field2858[this.field3423];
            if (this.field3423 >= 3) {
                var7 = null;
            } else {
                var7 = class190.field2858[this.field3423 + 1];
            }
        } else {
            var7 = class190.field2858[0];
            var6 = class427.field5960[this.field3423];
        }
        return var5.method1811(super.field5112, true, var7, arg3, this.field3429, arg2, arg0, super.field5113, this.field3441, super.field5110, var6);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        ++field3425;
        return arg0 < 81 ? 76 : this.field3429;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILvc;II)Z")
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field3439;
        class468 var5 = this.method1642(65536, arg1, -1);
        if (var5 != null) {
            class257 var6 = arg1.method306();
            var6.method96(super.field5113, super.field5110, super.field5112);
            return var5.method1593(arg2, arg3, var6, false);
        } else {
            if (arg0 != 0) {
                this.field3434 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILvc;I)Ln;")
    private final class468 method1642(int arg0, class89 arg1, int arg2) {
        ++field3426;
        if (this.field3434 != null && ~arg1.method362(this.field3434.method1574(), arg0) == -1) {
            return this.field3434;
        } else {
            class406 var4 = this.method1641(arg1, 65535, arg0, false);
            if (arg2 != -1) {
                return null;
            } else {
                return var4 != null ? var4.field5545 : null;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
    public final int method83(byte arg0) {
        ++field3438;
        return arg0 < 70 ? 28 : this.field3441;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)Z")
    public final boolean method82(byte arg0) {
        if (arg0 < 89) {
            this.field3429 = 4;
        }
        ++field3420;
        return this.field3419;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILvc;)Ln;")
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        if (arg0 != -106) {
            this.field3431 = false;
        }
        ++field3421;
        return this.method1642(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(ZLvc;)V")
    public final void method86(boolean arg0, class89 arg1) {
        ++field3424;
        if (arg0) {
            this.field3419 = true;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lvc;I)Lep;")
    public final class309 method69(class89 arg0, int arg1) {
        ++field3430;
        if (this.field3434 == null) {
            return null;
        } else {
            if (arg1 != 10228) {
                this.field3432 = null;
            }
            class257 var3 = arg0.method306();
            var3.method96(super.field5113 + super.field5105, super.field5110, super.field5112 - -super.field5115);
            class309 var4 = null;
            if (this.field3428) {
                var4 = class163.method1205((byte) 40, 1);
            }
            this.field3434.method1592(var3, var4 != null ? var4.field4383[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
    public final int method803(int arg0) {
        if (arg0 != -15823) {
            return -117;
        } else {
            ++field3442;
            return this.field3434 != null ? this.field3434.method1591() : 0;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
    public final void method84(int arg0) {
        ++field3418;
        if (this.field3434 != null) {
            this.field3434.method1595();
        }
        if (arg0 != 16805) {
            this.method83((byte) 3);
        }
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)V")
    public static void method1643(int arg0) {
        if (arg0 != 1942) {
            method1643(21);
        }
        field3436 = null;
    }
}
