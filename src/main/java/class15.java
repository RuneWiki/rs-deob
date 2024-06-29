import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 extends class364 implements class106 {

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Z")
    private boolean field181;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "S")
    private short field179;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "B")
    private byte field176;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "B")
    private byte field188;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "B")
    private byte field177;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Z")
    private boolean field178;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
    private boolean field187;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Ltm;")
    private class242 field184;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Lf;")
    private class491 field192;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "[[B")
    public static byte[][] field183 = new byte[50][];

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lb;")
    public static class201 field182;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        if (arg1 > -95) {
            this.field179 = 82;
        }
        ++field193;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        ++field173;
        if (arg0 != 31249) {
            this.field179 = 21;
        }
        return this.field188;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lnp;Ldq;IIIIZIIIII)V")
    public class15(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class266.method1638(false, arg10, arg11));
        this.field181 = arg1.field6366 != 0 && !arg6;
        this.field179 = (short) arg1.field6343;
        this.field176 = (byte) arg2;
        super.field5244 = (short) arg3;
        this.field188 = (byte) arg11;
        this.field177 = (byte) arg10;
        this.field178 = arg6;
        super.field5243 = (short) arg5;
        this.field187 = arg0.method639() && arg1.field6380 && !this.field178 && class314.field4438.field5776 != 0;
        class284 var13 = this.method107(arg0, 1024, false, this.field187);
        if (var13 != null) {
            this.field184 = var13.field4154;
            this.field192 = var13.field4158;
        }
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)I")
    public final int method105(int arg0) {
        if (arg0 >= -86) {
            this.field178 = false;
        }
        ++field194;
        return this.field192 != null ? this.field192.method1289() : 0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        ++field196;
        return arg0 != 12181 ? 74 : this.field179 & 65535;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnp;IZZ)Lpr;")
    private final class284 method107(class313 arg0, int arg1, boolean arg2, boolean arg3) {
        ++field201;
        class453 var5 = class156.field2325.method808(this.field179 & 65535, 0);
        if (arg2) {
            this.method114((class313) null, 126);
        }
        class426 var6;
        class426 var7;
        if (this.field178) {
            var6 = class28.field388[this.field176];
            var7 = class178.field2556[0];
        } else {
            var6 = class178.field2556[this.field176];
            if (~this.field176 <= -4) {
                var7 = null;
            } else {
                var7 = class178.field2556[this.field176 - -1];
            }
        }
        return var5.method2667(super.field5243, arg1, -4, arg3, super.field5237, this.field188, arg0, super.field5244, var7, var6, this.field177);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CB)Z")
    public static final boolean method108(char arg0, byte arg1) {
        ++field200;
        if (arg1 != -49) {
            return false;
        } else {
            return ~arg0 <= -49 && arg0 <= '9';
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        ++field191;
        if (arg0 >= -126) {
            this.method109(-98, (class313) null);
        }
        Object var3 = null;
        class242 var5;
        if (this.field184 == null && this.field187) {
            class284 var4 = this.method107(arg1, 131072, false, true);
            var5 = var4 == null ? null : var4.field4154;
        } else {
            var5 = this.field184;
            this.field184 = null;
        }
        if (var5 != null) {
            class94.method531(var5, this.field176, super.field5244, super.field5243, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwf;I)V")
    public static final void method110(class79 arg0, int arg1) {
        ++field198;
        if (arg1 < -124) {
            class225.field3415.method2461((byte) 39, arg0.method454((byte) -123));
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 < 56) {
            this.field187 = false;
        }
        if (this.field192 != null) {
            this.field192.method1313();
        }
        ++field197;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLb;)I")
    public static final int method112(byte arg0, class201 arg1) {
        if (arg0 != 6) {
            field180 = -88;
        }
        ++field174;
        int var2 = 0;
        if (arg1.method1230(arg0 + 111, class405.field5699)) {
            ++var2;
        }
        if (arg1.method1230(115, class29.field389)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field199;
        if (arg1 < 16) {
            this.method120(-92, (class313) null);
        }
        class491 var5 = this.method118(arg3, (byte) 92, 65536);
        if (var5 != null) {
            class282 var6 = arg3.method601();
            var6.method1019(super.field5244, super.field5237, super.field5243);
            return var5.method1339(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        if (arg1 == -26920) {
            ++field189;
            Object var3 = null;
            class242 var5;
            if (this.field184 == null && this.field187) {
                class284 var4 = this.method107(arg0, 131072, false, true);
                var5 = var4 != null ? var4.field4154 : null;
            } else {
                var5 = this.field184;
                this.field184 = null;
            }
            if (var5 != null) {
                class333.method2103(var5, this.field176, super.field5244, super.field5243, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 <= 70) {
            field183 = null;
        }
        ++field195;
        return this.method118(arg0, (byte) 67, arg2);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 >= -40) {
            return false;
        } else {
            ++field175;
            return this.field187;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public static void method117(byte arg0) {
        if (arg0 == 65) {
            field183 = null;
            field182 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lnp;BI)Lf;")
    private final class491 method118(class313 arg0, byte arg1, int arg2) {
        ++field186;
        if (arg1 <= 37) {
            this.field179 = -75;
        }
        if (this.field192 != null && ~arg0.method653(this.field192.method1319(), arg2) == -1) {
            return this.field192;
        } else {
            class284 var4 = this.method107(arg0, arg2, false, false);
            return var4 == null ? null : var4.field4158;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        ++field190;
        if (arg0 <= 13) {
            this.method104(97);
        }
        return this.field177;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field185;
        if (this.field192 == null) {
            return null;
        } else {
            class282 var3 = arg1.method601();
            var3.method1019(super.field5244 - -super.field5240, super.field5237, super.field5243 - -super.field5235);
            class477 var4 = null;
            if (this.field181) {
                var4 = class96.method543(1, (byte) 71);
            }
            this.field192.method1323(var3, var4 != null ? var4.field6696[0] : null, arg0);
            return var4;
        }
    }
}
