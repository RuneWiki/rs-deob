import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class15 extends class599 implements class57 {

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "B")
    private byte field124;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "S")
    private short field144;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Z")
    private boolean field128;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "B")
    private byte field143;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Z")
    private boolean field123;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "B")
    private byte field137;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "Z")
    private boolean field139;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "Z")
    private boolean field151;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "Lw;")
    private class252 field135;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Lba;")
    public class327 field125;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lqf;")
    public static class593 field130 = null;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lew;")
    private class425 field122;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        ++field129;
        if (arg0 != 1630) {
            this.method95(-119);
        }
        return this.field123;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
    public static void method85(int arg0) {
        if (arg0 == 6001) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 != 7) {
            this.method92(-72);
        }
        if (arg3 instanceof class15) {
            class15 var8 = (class15) arg3;
            if (this.field125 != null && var8.field125 != null) {
                this.field125.method1361(var8.field125, arg1, arg6, arg2, arg5);
            }
        } else if (arg3 instanceof class344) {
            class344 var9 = (class344) arg3;
            if (this.field125 != null && var9.field4935 != null) {
                this.field125.method1361(var9.field4935, arg1, arg6, arg2, arg5);
            }
        }
        ++field138;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public final void method87(int arg0) {
        ++field126;
        if (this.field125 != null) {
            this.field125.method1372();
        }
        if (arg0 != 7511) {
            this.field128 = true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field140;
        if (this.field125 == null) {
            return null;
        } else {
            class364 var3 = arg0.method342();
            if (arg1 >= -127) {
                this.method86(-79, -47, -15, (class429) null, (class605) null, true, -48);
            }
            var3.method2014(super.field8751, super.field8755, super.field8747);
            class630 var4 = null;
            if (this.field128) {
                var4 = class471.method2882(-127, 1);
            }
            this.field125.method1380(var3, var4 == null ? null : var4.field9084[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field147;
        int var2 = 71 % ((arg0 - 11) / 51);
        return 65535 & this.field144;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        ++field133;
        if (arg1 != -5) {
            this.field143 = -64;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Loa;Lqd;IIIIZIIZ)V")
    public class15(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class602.method3491(arg8, arg7, (byte) -68));
        super.field8747 = arg5;
        this.field124 = (byte) arg7;
        this.field144 = (short) arg1.field5810;
        this.field128 = ~arg1.field5806 != -1 && !arg6;
        this.field143 = (byte) arg2;
        this.field123 = arg9;
        this.field137 = (byte) arg8;
        this.field139 = arg6;
        super.field8751 = arg3;
        this.field151 = arg0.method325() && arg1.field5855 && !this.field139 && ~class595.field8694.method2735((byte) -128, class81.field908) != -1;
        int var11 = 2048;
        if (this.field123) {
            var11 |= 65536;
        }
        class651 var12 = this.method97(arg0, var11, (byte) 19, this.field151);
        if (var12 != null) {
            this.field135 = var12.field9386;
            this.field125 = var12.field9389;
            if (this.field123) {
                this.field125 = this.field125.method1382((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field145;
        if (arg0 != -10503) {
            this.field125 = null;
        }
        class327 var5 = this.method101(131072, (byte) 89, arg2);
        if (var5 != null) {
            class364 var6 = arg2.method342();
            var6.method2014(super.field8751, super.field8755, super.field8747);
            return var5.method1381(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)I")
    public final int method92(int arg0) {
        if (arg0 != 9812) {
            this.method88((class605) null, (byte) 35);
        }
        ++field132;
        return this.field137;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        ++field127;
        if (arg0 != -23445) {
            this.field137 = -26;
        }
        return this.field151;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZLoa;)Lba;")
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        ++field148;
        if (arg1) {
            this.field122 = null;
        }
        return this.method101(arg0, (byte) 89, arg2);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)I")
    public final int method95(int arg0) {
        ++field141;
        int var2 = 91 / ((arg0 - 14) / 33);
        return this.field124;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        this.field123 = false;
        if (arg0 != -76) {
            this.method92(29);
        }
        ++field131;
        if (this.field125 != null) {
            this.field125.method1376(-65537 & this.field125.method1375());
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Loa;IBZ)Llo;")
    private final class651 method97(class605 arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != 19) {
            field130 = null;
        }
        ++field149;
        class385 var5 = class575.field8301.method1499(-7532, this.field144 & 65535);
        class132 var6;
        class132 var7;
        if (this.field139) {
            var6 = class492.field7164[this.field143];
            var7 = class544.field7780[0];
        } else {
            if (~this.field143 <= -4) {
                var7 = null;
            } else {
                var7 = class544.field7780[this.field143 + 1];
            }
            var6 = class544.field7780[this.field143];
        }
        return var5.method2459(super.field8751, arg1, this.field137, arg0, super.field8755, arg3, this.field124, var7, arg2 + -88, super.field8747, var6);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILoa;)V")
    public final void method98(int arg0, class605 arg1) {
        ++field134;
        if (arg0 == 16343) {
            Object var3 = null;
            class252 var5;
            if (this.field135 == null && this.field151) {
                class651 var4 = this.method97(arg1, 262144, (byte) 19, true);
                var5 = var4 != null ? var4.field9386 : null;
            } else {
                var5 = this.field135;
                this.field135 = null;
            }
            if (var5 != null) {
                class172.method990(var5, this.field143, super.field8751, super.field8747, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
    public static final boolean method99(int arg0, int arg1) {
        if (arg1 >= -34) {
            method85(-70);
        }
        ++field142;
        return arg0 == 0 || ~arg0 == -5;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        ++field150;
        if (arg1 != 28286) {
            this.field144 = -108;
        }
        if (this.field122 == null) {
            this.field122 = class645.method3676(super.field8747, super.field8755, (byte) -64, super.field8751, this.method101(0, (byte) 89, arg0));
        }
        return this.field122;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBLoa;)Lba;")
    private final class327 method101(int arg0, byte arg1, class605 arg2) {
        ++field136;
        if (this.field125 != null && ~arg2.method293(this.field125.method1375(), arg0) == -1) {
            return this.field125;
        } else {
            class651 var4 = this.method97(arg2, arg0, (byte) 19, false);
            if (arg1 != 89) {
                return null;
            } else {
                return var4 == null ? null : var4.field9389;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLoa;)V")
    public final void method102(byte arg0, class605 arg1) {
        ++field146;
        Object var3 = null;
        class252 var5;
        if (this.field135 == null && this.field151) {
            class651 var4 = this.method97(arg1, 262144, (byte) 19, true);
            var5 = var4 == null ? null : var4.field9386;
        } else {
            var5 = this.field135;
            this.field135 = null;
        }
        if (var5 != null) {
            class240.method1600(var5, this.field143, super.field8751, super.field8747, (boolean[]) null);
        }
        if (arg0 >= -54) {
            this.field151 = false;
        }
    }
}
