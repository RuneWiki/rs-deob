import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class50 extends class304 implements class106 {

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Lnt;")
    public class134 field690;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
    private boolean field681;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lus;")
    public static class1 field676 = new class1(24, 6);

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "[I")
    public static int[] field692;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Luj;")
    public static final class237 method320(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1078;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lnp;Ldq;IIIIIZIIIIIII)V")
    public class50(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field6329 == 1, class401.method2399(arg12, (byte) 123, arg13));
        this.field690 = new class134(arg0, arg1, arg12, arg13, super.field4319, arg3, arg4, arg6, arg7, arg14);
        this.field681 = ~arg1.field6366 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field685;
        class491 var3 = this.field690.method848(super.field4331, false, arg1, 10, true, super.field4317, 1024);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                method321(-104, -99, (byte) 24, -24, -23);
            }
            class282 var4 = arg1.method601();
            var4.method1019(super.field4331, super.field4322, super.field4317);
            class477 var5 = null;
            if (this.field681) {
                var5 = class96.method543(1, (byte) 71);
            }
            if (this.field690.field1774 == null) {
                var3.method1323(var4, var5 == null ? null : var5.field6696[0], 0);
            } else {
                class207 var6 = this.field690.field1774.method552();
                arg1.method646(var3, var6, var4, var5 == null ? null : var5.field6696[0], 0);
            }
            this.field690.method845(true, super.field4328, super.field4334, arg1, super.field4330, -125, var3, super.field4324);
            return var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        ++field683;
        if (arg0 < 56) {
            this.field690 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        this.field690.method847((byte) -116, arg1);
        ++field694;
        if (arg0 >= -126) {
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        if (arg0 >= -105) {
            this.method116((byte) -34);
        }
        ++field686;
        return false;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIBII)V")
    public static final void method321(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg0 >= class345.field5011 && class485.field6827 >= arg0) {
            int var5 = class156.method978(0, arg4, class94.field1209, class168.field2449);
            int var6 = class156.method978(arg2 + -28, arg3, class94.field1209, class168.field2449);
            class492.method2888(var6, arg2 + -14998, arg0, var5, arg1);
        }
        ++field678;
        if (arg2 != 28) {
            method320(-40, 111, -27);
        }
    }

    @OriginalMember(owner = "client!u", name = "k", descriptor = "(I)V")
    public static void method322(int arg0) {
        field676 = null;
        if (arg0 != 24) {
            method324(true, 125, 124, 32, 17, 36, 109, 80);
        }
        field692 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        if (arg1 >= -95) {
            this.method111(-1);
        }
        ++field677;
        class491 var3 = this.field690.method848(super.field4331, true, arg0, 10, true, super.field4317, 131072);
        if (var3 != null) {
            this.field690.method845(false, super.field4328, super.field4334, arg0, super.field4330, -125, var3, super.field4324);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        ++field689;
        if (arg1 <= 70) {
            this.field681 = true;
        }
        return this.field690.method848(0, false, arg0, 10, false, 0, arg2);
    }

    @OriginalMember(owner = "client!u", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        ++field680;
        if (arg0 != 0) {
            this.field681 = true;
        }
        return this.field690.method850((byte) 110);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        ++field675;
        if (arg0 != 12181) {
            this.method103((class313) null, (byte) -80);
        }
        return this.field690.field1770;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        this.field690.method846(arg0, -89);
        if (arg1 == -26920) {
            ++field679;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        ++field687;
        if (arg0 != -1) {
            field676 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 > -40) {
            return true;
        } else {
            ++field684;
            return this.field690.method843((byte) 95);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        ++field693;
        int var8 = 124 % ((20 - arg4) / 38);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        ++field691;
        if (arg0 < 13) {
            this.field681 = false;
        }
        return this.field690.field1763;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg1 < 16) {
            this.method104(9);
        }
        ++field682;
        class491 var5 = this.field690.method848(super.field4331, false, arg3, 10, false, super.field4317, 65536);
        if (var5 == null) {
            return false;
        } else {
            class282 var6 = arg3.method601();
            var6.method1019(super.field4331, super.field4322, super.field4317);
            return var5.method1339(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        ++field688;
        return arg0 != 31249 ? 76 : this.field690.field1755;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method324(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field674;
        int var8 = arg5 + arg7;
        int var9 = -arg7 + arg6;
        for (int var10 = arg5; var8 > var10; ++var10) {
            class103.method579((byte) 115, arg1, arg2, arg3, class128.field1676[var10]);
        }
        int var11 = -arg7 + arg2;
        for (int var12 = arg6; var9 < var12; --var12) {
            class103.method579((byte) 115, arg1, arg2, arg3, class128.field1676[var12]);
        }
        if (!arg0) {
            method324(true, -101, 103, -86, -58, 20, -68, -17);
        }
        int var13 = arg1 + arg7;
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class128.field1676[var14];
            class103.method579((byte) 115, arg1, var13, arg3, var15);
            class103.method579((byte) 115, var13, var11, arg4, var15);
            class103.method579((byte) 115, var11, arg2, arg3, var15);
        }
    }
}
